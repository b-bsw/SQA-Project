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
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Node node1 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertInFosterParent(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = htmlTreeBuilder0.isSpecial(element2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Attributes attributes3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = htmlTreeBuilder0.processStartTag("hi!", attributes3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = htmlTreeBuilder0.inButtonScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList7 = htmlTreeBuilder0.parseFragment("", element3, "hi!", parseErrorList5, parseSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(elementList1);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = htmlTreeBuilder0.onStack(element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.Token.Character character2 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(character2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = htmlTreeBuilder0.aboveOnStack(element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = htmlTreeBuilder0.isSpecial(element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.Class<?> wildcardClass2 = htmlTreeBuilder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        org.jsoup.nodes.Element element11 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements(element11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.isSpecial(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.Token.StartTag startTag3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = htmlTreeBuilder0.insertEmpty(startTag3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(document2);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.io.Reader reader2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder5.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder5.state();
        org.jsoup.parser.ParseSettings parseSettings8 = htmlTreeBuilder5.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader2, "", parseErrorList4, parseSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNotNull(parseSettings8);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertMarkerToFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.Token.StartTag startTag4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = htmlTreeBuilder0.insert(startTag4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.Token token2 = null;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = htmlTreeBuilder0.process(token2, htmlTreeBuilderState3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.Token.Comment comment3 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(document2);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList1 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Element element2 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(element2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(elementList1);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList3);
        java.io.Reader reader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder9.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = htmlTreeBuilder9.state();
        org.jsoup.parser.ParseSettings parseSettings12 = htmlTreeBuilder9.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader6, "", parseErrorList8, parseSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState11);
        org.junit.Assert.assertNotNull(parseSettings12);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = htmlTreeBuilder0.inScope("", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" });
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.inTableScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder0.setFormElement(formElement11);
        org.jsoup.nodes.Element element13 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements(element13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = htmlTreeBuilder0.aboveOnStack(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.maybeSetBaseUri(element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Element element2 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.maybeSetBaseUri(element2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = htmlTreeBuilder0.isSpecial(element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList2 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.Attributes attributes4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = htmlTreeBuilder0.processStartTag("", attributes4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formElement1);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.Token.Comment comment6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceOnStack(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        char char0 = org.jsoup.parser.Tokeniser.replacementChar;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\ufffd' + "'", char0 == '\ufffd');
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder0.setFormElement(formElement11);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList3);
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        htmlTreeBuilder0.markInsertionMode();
        java.io.Reader reader12 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder15 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder15.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState17 = htmlTreeBuilder15.state();
        org.jsoup.parser.ParseSettings parseSettings18 = htmlTreeBuilder15.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader12, "hi!", parseErrorList14, parseSettings18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState17);
        org.junit.Assert.assertNotNull(parseSettings18);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.inTableScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertInFosterParent(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element2 = null;
        htmlTreeBuilder0.setHeadElement(element2);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = htmlTreeBuilder0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.Token.StartTag startTag12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = htmlTreeBuilder0.insertEmpty(startTag12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        java.io.Reader reader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder10.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder10.state();
        org.jsoup.parser.ParseSettings parseSettings13 = htmlTreeBuilder10.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader7, "", parseErrorList9, parseSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
        org.junit.Assert.assertNotNull(parseSettings13);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.Token token3 = null;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = htmlTreeBuilder0.process(token3, htmlTreeBuilderState4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(document2);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Attributes attributes5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilder0.processStartTag("hi!", attributes5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        java.io.Reader reader4 = null;
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder7.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder7.state();
        org.jsoup.parser.ParseSettings parseSettings10 = htmlTreeBuilder7.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader4, "", parseErrorList6, parseSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNull(htmlTreeBuilderState9);
        org.junit.Assert.assertNotNull(parseSettings10);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.Token.StartTag startTag3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = htmlTreeBuilder0.insertEmpty(startTag3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element2 = null;
        htmlTreeBuilder0.setHeadElement(element2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = htmlTreeBuilder0.lastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element2 = htmlTreeBuilder0.aboveOnStack(element1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = htmlTreeBuilder0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String[] strArray8 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.inScope("", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.maybeSetBaseUri(element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Attributes attributes5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilder0.processStartTag("", attributes5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element2 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements(element2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList2 = htmlTreeBuilder0.getPendingTableCharacters();
        java.io.Reader reader3 = null;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader3, "", parseErrorList5, parseSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formElement1);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.Token.StartTag startTag9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement11 = htmlTreeBuilder0.insertForm(startTag9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.isInActiveFormattingElements(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder0.setFormElement(formElement6);
        org.jsoup.parser.Token.StartTag startTag8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element9 = htmlTreeBuilder0.insertEmpty(startTag8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.Token.Comment comment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        htmlTreeBuilder7.setPendingTableCharacters((java.util.List<java.lang.String>) strList10);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList10);
        org.jsoup.nodes.Element element14 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements(element14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        boolean boolean11 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element14 = null;
        org.jsoup.nodes.Element element15 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceOnStack(element14, element15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.Token.StartTag startTag5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = htmlTreeBuilder0.insertEmpty(startTag5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(elementList4);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = htmlTreeBuilder0.aboveOnStack(element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.generateImpliedEndTags("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        java.io.Reader reader3 = null;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder6.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder6.state();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder6.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader3, "", parseErrorList5, parseSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNotNull(parseSettings9);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.Class<?> wildcardClass7 = htmlTreeBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = htmlTreeBuilder0.insertStartTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Attributes attributes4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = htmlTreeBuilder0.processStartTag("", attributes4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = htmlTreeBuilder0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(elementList4);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = htmlTreeBuilder0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.Token.StartTag startTag9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement11 = htmlTreeBuilder0.insertForm(startTag9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements(element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Attributes attributes8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.processStartTag("", attributes8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element2 = null;
        htmlTreeBuilder0.setHeadElement(element2);
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.inScope("hi!", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        org.jsoup.parser.TokeniserState tokeniserState7 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        java.io.Reader reader5 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder8.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder8.state();
        org.jsoup.parser.ParseSettings parseSettings11 = htmlTreeBuilder8.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader5, "hi!", parseErrorList7, parseSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNotNull(parseSettings11);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Attributes attributes7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.processStartTag("hi!", attributes7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        org.jsoup.parser.Token token4 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emit(token4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder0.setFormElement(formElement6);
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements(element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        boolean boolean11 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilder0.inButtonScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder0.setFormElement(formElement11);
        htmlTreeBuilder0.framesetOk(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = htmlTreeBuilder0.lastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder5.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        htmlTreeBuilder5.setPendingTableCharacters((java.util.List<java.lang.String>) strList14);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList14);
        org.jsoup.parser.Token.Character character18 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(character18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder0.setFormElement(formElement11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = htmlTreeBuilder0.inListItemScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = tokeniser2.consumeCharacterReference((java.lang.Character) '4', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.resetInsertionMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.Token.StartTag startTag4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element5 = htmlTreeBuilder0.insert(startTag4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilder0.inScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(elementList4);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Attributes attributes6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.processStartTag("", attributes6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = tokeniser2.consumeCharacterReference((java.lang.Character) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        java.lang.Class<?> wildcardClass4 = tokeniser2.getClass();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        org.jsoup.parser.Token.StartTag startTag3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = htmlTreeBuilder0.insertEmpty(startTag3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.TokeniserState tokeniserState5 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag6 = tokeniser2.createTagPending(false);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = tokeniser2.consumeCharacterReference((java.lang.Character) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        java.lang.Class<?> wildcardClass6 = htmlTreeBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        htmlTreeBuilder0.setFosterInserts(true);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableBodyContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getFromStack("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = htmlTreeBuilder0.isInActiveFormattingElements(element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.Element element13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = htmlTreeBuilder0.isInActiveFormattingElements(element13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.CharacterReader characterReader2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.Tokeniser tokeniser4 = new org.jsoup.parser.Tokeniser(characterReader2, parseErrorList3);
        org.jsoup.parser.Token.Tag tag6 = tokeniser4.createTagPending(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.process((org.jsoup.parser.Token) tag6, htmlTreeBuilderState7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formElement1);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.Token.StartTag startTag9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = htmlTreeBuilder0.insertEmpty(startTag9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertInFosterParent(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        java.lang.Class<?> wildcardClass7 = tokeniser2.getClass();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token3 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder0.setFormElement(formElement11);
        htmlTreeBuilder0.framesetOk(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = htmlTreeBuilder0.removeLastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        java.lang.StringBuilder stringBuilder10 = tokeniser9.dataBuffer;
        tokeniser9.createDoctypePending();
        tokeniser9.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList14);
        java.lang.StringBuilder stringBuilder16 = tokeniser15.dataBuffer;
        tokeniser9.dataBuffer = stringBuilder16;
        org.jsoup.parser.Token.Doctype doctype18 = tokeniser9.doctypePending;
        tokeniser2.doctypePending = doctype18;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token20 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertNotNull(doctype18);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = htmlTreeBuilder0.onStack(element1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        htmlTreeBuilder7.setPendingTableCharacters((java.util.List<java.lang.String>) strList10);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList10);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableBodyContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder0.setFormElement(formElement11);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.setFosterInserts(false);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList9 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Element element10 = null;
        org.jsoup.nodes.Element element11 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter(element10, element11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertNull(elementList9);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createDoctypePending();
        tokeniser2.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder9;
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser2.doctypePending;
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader12, parseErrorList13);
        java.lang.StringBuilder stringBuilder15 = tokeniser14.dataBuffer;
        tokeniser14.createTempBuffer();
        org.jsoup.parser.Token.Tag tag17 = null;
        tokeniser14.tagPending = tag17;
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList20);
        java.lang.StringBuilder stringBuilder22 = tokeniser21.dataBuffer;
        tokeniser21.createTempBuffer();
        org.jsoup.parser.Token.Tag tag25 = tokeniser21.createTagPending(false);
        tokeniser14.emit((org.jsoup.parser.Token) tag25);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emit((org.jsoup.parser.Token) tag25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(doctype11);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertNotNull(tag25);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        int[] intArray4 = new int[] { (byte) 1 };
        tokeniser2.emit(intArray4);
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        boolean boolean9 = tokeniser8.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser8.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tokeniserState10);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Attributes attributes9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilder0.processStartTag("", attributes9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.maybeSetBaseUri(element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag9 = tokeniser2.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        boolean boolean13 = tokeniser12.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser12.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tokeniserState14);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getFromStack("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        tokeniser2.createTempBuffer();
        java.lang.Class<?> wildcardClass8 = tokeniser2.getClass();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Token.Comment comment6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag9 = tokeniser2.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        int[] intArray14 = new int[] { (byte) 1 };
        tokeniser12.emit(intArray14);
        tokeniser2.emit(intArray14);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = tokeniser2.consumeCharacterReference((java.lang.Character) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1 });
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.Token.StartTag startTag5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = htmlTreeBuilder0.insert(startTag5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        java.io.Reader reader3 = null;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder6.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder6.state();
        htmlTreeBuilder6.generateImpliedEndTags();
        htmlTreeBuilder6.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings11 = htmlTreeBuilder6.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader3, "", parseErrorList5, parseSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNotNull(parseSettings11);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.generateImpliedEndTags();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableBodyContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.maybeSetBaseUri(element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState8);
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = htmlTreeBuilder0.isSpecial(element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(document2);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createDoctypePending();
        tokeniser2.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder9;
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser2.doctypePending;
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader12, parseErrorList13);
        java.lang.StringBuilder stringBuilder15 = tokeniser14.dataBuffer;
        tokeniser14.createDoctypePending();
        tokeniser14.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader18, parseErrorList19);
        java.lang.StringBuilder stringBuilder21 = tokeniser20.dataBuffer;
        tokeniser14.dataBuffer = stringBuilder21;
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader23, parseErrorList24);
        boolean boolean26 = tokeniser25.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState27 = tokeniser25.getState();
        tokeniser14.transition(tokeniserState27);
        org.jsoup.parser.TokeniserState tokeniserState29 = tokeniser14.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(doctype11);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertNotNull(tokeniserState29);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createDoctypePending();
        tokeniser2.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder9;
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser2.doctypePending;
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader12, parseErrorList13);
        boolean boolean15 = tokeniser14.isAppropriateEndTagToken();
        org.jsoup.parser.Token.Doctype doctype16 = tokeniser14.doctypePending;
        org.jsoup.parser.Token.Comment comment17 = tokeniser14.commentPending;
        tokeniser2.commentPending = comment17;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(doctype11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doctype16);
        org.junit.Assert.assertNotNull(comment17);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Element element8 = null;
        htmlTreeBuilder0.setHeadElement(element8);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNull(elementList7);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag6 = tokeniser2.createTagPending(false);
        java.lang.String str7 = tokeniser2.appropriateEndTagName();
        tokeniser2.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader9, parseErrorList10);
        java.lang.StringBuilder stringBuilder12 = tokeniser11.dataBuffer;
        tokeniser11.createDoctypePending();
        tokeniser11.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader15, parseErrorList16);
        java.lang.StringBuilder stringBuilder18 = tokeniser17.dataBuffer;
        tokeniser11.dataBuffer = stringBuilder18;
        org.jsoup.parser.Token.Doctype doctype20 = tokeniser11.doctypePending;
        java.lang.String str21 = tokeniser11.appropriateEndTagName();
        org.jsoup.parser.TokeniserState tokeniserState22 = tokeniser11.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(doctype20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(tokeniserState22);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.generateImpliedEndTags();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.inScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader4, parseErrorList5);
        boolean boolean7 = tokeniser6.isAppropriateEndTagToken();
        org.jsoup.parser.Token.Doctype doctype8 = tokeniser6.doctypePending;
        org.jsoup.parser.Token.Comment comment9 = tokeniser6.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doctype8);
        org.junit.Assert.assertNotNull(comment9);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element2 = null;
        htmlTreeBuilder0.setHeadElement(element2);
        org.jsoup.nodes.Attributes attributes5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilder0.processStartTag("", attributes5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean7 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceOnStack(element8, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilder0.removeFromStack(element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createDoctypePending();
        tokeniser2.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder9;
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser2.doctypePending;
        java.lang.String str12 = tokeniser2.appropriateEndTagName();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList14);
        java.lang.StringBuilder stringBuilder16 = tokeniser15.dataBuffer;
        tokeniser15.createDoctypePending();
        tokeniser15.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList20);
        java.lang.StringBuilder stringBuilder22 = tokeniser21.dataBuffer;
        tokeniser15.dataBuffer = stringBuilder22;
        org.jsoup.parser.Token.Doctype doctype24 = tokeniser15.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState25 = tokeniser15.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(doctype11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertNotNull(doctype24);
        org.junit.Assert.assertNotNull(tokeniserState25);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.inScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.generateImpliedEndTags();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertMarkerToFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader5, parseErrorList6);
        boolean boolean8 = tokeniser7.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser7.getState();
        org.jsoup.parser.Token.Tag tag11 = tokeniser7.createTagPending(false);
        char[] charArray17 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser7.emit(charArray17);
        org.jsoup.parser.Token.StartTag startTag19 = tokeniser7.startPending;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element20 = htmlTreeBuilder0.insertEmpty(startTag19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(startTag19);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        htmlTreeBuilder0.setFosterInserts(false);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.generateImpliedEndTags("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.inButtonScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = htmlTreeBuilderState4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.setFosterInserts(true);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag9 = tokeniser2.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        int[] intArray14 = new int[] { (byte) 1 };
        tokeniser12.emit(intArray14);
        tokeniser2.emit(intArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token17 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1 });
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState8);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableBodyContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        org.jsoup.parser.ParseSettings parseSettings5 = htmlTreeBuilder0.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.generateImpliedEndTags("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNotNull(parseSettings5);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createDoctypePending();
        tokeniser2.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder9;
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser2.doctypePending;
        java.lang.String str12 = tokeniser2.appropriateEndTagName();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList14);
        boolean boolean16 = tokeniser15.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState17 = tokeniser15.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(doctype11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tokeniserState17);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean7 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder12 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder12.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = htmlTreeBuilder12.state();
        org.jsoup.parser.ParseSettings parseSettings15 = htmlTreeBuilder12.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = htmlTreeBuilder0.parseFragment("hi!", element9, "", parseErrorList11, parseSettings15);
        org.jsoup.nodes.Element element17 = null;
        org.jsoup.nodes.Element element18 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceOnStack(element17, element18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be true");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder0.setFormElement(formElement11);
        htmlTreeBuilder0.framesetOk(false);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.resetInsertionMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        htmlTreeBuilder7.setPendingTableCharacters((java.util.List<java.lang.String>) strList10);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = htmlTreeBuilder0.removeLastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList2 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(elementList2);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createDoctypePending();
        tokeniser2.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder9;
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser2.doctypePending;
        java.lang.String str12 = tokeniser2.appropriateEndTagName();
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser2.getState();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = tokeniser2.consumeCharacterReference((java.lang.Character) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(doctype11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(tokeniserState13);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableBodyContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        boolean boolean11 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilder0.inTableScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        org.jsoup.parser.TokeniserState tokeniserState7 = null;
        tokeniser2.transition(tokeniserState7);
        tokeniser2.createCommentPending();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = tokeniser2.unescapeEntities(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        boolean boolean11 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = htmlTreeBuilder0.getActiveFormattingElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList2 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.FormElement formElement3 = null;
        htmlTreeBuilder0.setFormElement(formElement3);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getActiveFormattingElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formElement1);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element2 = null;
        htmlTreeBuilder0.setHeadElement(element2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = htmlTreeBuilder0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        htmlTreeBuilder7.setPendingTableCharacters((java.util.List<java.lang.String>) strList10);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList10);
        org.jsoup.nodes.Element element14 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.push(element14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Element element8 = null;
        htmlTreeBuilder0.setHeadElement(element8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNull(elementList7);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.isInActiveFormattingElements(element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        htmlTreeBuilder7.setPendingTableCharacters((java.util.List<java.lang.String>) strList10);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList10);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Element element15 = null;
        org.jsoup.nodes.Element element16 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter(element15, element16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Element element2 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements(element2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        tokeniser8.createDoctypePending();
        tokeniser8.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader12, parseErrorList13);
        java.lang.StringBuilder stringBuilder15 = tokeniser14.dataBuffer;
        tokeniser8.dataBuffer = stringBuilder15;
        org.jsoup.parser.Token.Doctype doctype17 = tokeniser8.doctypePending;
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader18, parseErrorList19);
        boolean boolean21 = tokeniser20.isAppropriateEndTagToken();
        org.jsoup.parser.Token.Doctype doctype22 = tokeniser20.doctypePending;
        org.jsoup.parser.Token.Comment comment23 = tokeniser20.commentPending;
        tokeniser8.commentPending = comment23;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertNotNull(doctype17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doctype22);
        org.junit.Assert.assertNotNull(comment23);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader5, parseErrorList6);
        boolean boolean8 = tokeniser7.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser7.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tokeniserState9);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.FormElement formElement9 = htmlTreeBuilder0.getFormElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableBodyContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(formElement9);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        htmlTreeBuilder7.setPendingTableCharacters((java.util.List<java.lang.String>) strList10);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList10);
        org.jsoup.nodes.Element element14 = null;
        org.jsoup.nodes.Element element15 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter(element14, element15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createDoctypePending();
        tokeniser2.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder9;
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser2.doctypePending;
        java.lang.String str12 = tokeniser2.appropriateEndTagName();
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser2.getState();
        org.jsoup.parser.Token token14 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emit(token14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(doctype11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(tokeniserState13);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        boolean boolean3 = tokeniser2.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser2.getState();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader5, parseErrorList6);
        java.lang.StringBuilder stringBuilder8 = tokeniser7.dataBuffer;
        tokeniser7.createDoctypePending();
        tokeniser7.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader11, parseErrorList12);
        java.lang.StringBuilder stringBuilder14 = tokeniser13.dataBuffer;
        tokeniser7.dataBuffer = stringBuilder14;
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader16, parseErrorList17);
        boolean boolean19 = tokeniser18.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser18.getState();
        tokeniser7.transition(tokeniserState20);
        org.jsoup.parser.TokeniserState tokeniserState22 = tokeniser7.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tokeniserState20);
        org.junit.Assert.assertNotNull(tokeniserState22);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceOnStack(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNull(elementList4);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        boolean boolean3 = tokeniser2.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser2.getState();
        org.jsoup.parser.Token.Tag tag6 = tokeniser2.createTagPending(false);
        char[] charArray12 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser2.emit(charArray12);
        org.jsoup.parser.Token.StartTag startTag14 = tokeniser2.startPending;
        boolean boolean15 = tokeniser2.isAppropriateEndTagToken();
        org.jsoup.parser.Token.Tag tag17 = tokeniser2.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader18, parseErrorList19);
        java.lang.StringBuilder stringBuilder21 = tokeniser20.dataBuffer;
        tokeniser20.createTempBuffer();
        org.jsoup.parser.Token.Tag tag23 = null;
        tokeniser20.tagPending = tag23;
        tokeniser20.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag27 = tokeniser20.createTagPending(false);
        tokeniser20.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader30, parseErrorList31);
        java.lang.StringBuilder stringBuilder33 = tokeniser32.dataBuffer;
        tokeniser32.createDoctypePending();
        tokeniser32.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.Tokeniser tokeniser38 = new org.jsoup.parser.Tokeniser(characterReader36, parseErrorList37);
        java.lang.StringBuilder stringBuilder39 = tokeniser38.dataBuffer;
        tokeniser32.dataBuffer = stringBuilder39;
        org.jsoup.parser.CharacterReader characterReader41 = null;
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.Tokeniser tokeniser43 = new org.jsoup.parser.Tokeniser(characterReader41, parseErrorList42);
        boolean boolean44 = tokeniser43.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState45 = tokeniser43.getState();
        tokeniser32.transition(tokeniserState45);
        tokeniser20.transition(tokeniserState45);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder39);
        org.junit.Assert.assertEquals(stringBuilder39.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(tokeniserState45);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        htmlTreeBuilder0.framesetOk(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.List<java.lang.String> strList1 = null;
        htmlTreeBuilder0.setPendingTableCharacters(strList1);
        org.jsoup.nodes.FormElement formElement3 = null;
        htmlTreeBuilder0.setFormElement(formElement3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = htmlTreeBuilder0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = htmlTreeBuilder0.onStack(element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element2 = null;
        htmlTreeBuilder0.setHeadElement(element2);
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.ParseSettings parseSettings5 = htmlTreeBuilder0.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertMarkerToFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNotNull(parseSettings5);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag6 = tokeniser2.createTagPending(false);
        java.lang.String str7 = tokeniser2.appropriateEndTagName();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        java.lang.StringBuilder stringBuilder11 = tokeniser10.dataBuffer;
        tokeniser10.createDoctypePending();
        tokeniser10.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        java.lang.StringBuilder stringBuilder17 = tokeniser16.dataBuffer;
        tokeniser10.dataBuffer = stringBuilder17;
        org.jsoup.parser.Token.Doctype doctype19 = tokeniser10.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState20 = tokeniser10.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(doctype19);
        org.junit.Assert.assertNotNull(tokeniserState20);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = tokeniser2.consumeCharacterReference((java.lang.Character) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceOnStack(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.push(element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Attributes attributes8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.processStartTag("hi!", attributes8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader4, parseErrorList5);
        boolean boolean7 = tokeniser6.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState8 = tokeniser6.getState();
        org.jsoup.parser.Token.Tag tag10 = tokeniser6.createTagPending(false);
        char[] charArray16 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser6.emit(charArray16);
        org.jsoup.parser.Token.StartTag startTag18 = tokeniser6.startPending;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = htmlTreeBuilder0.process((org.jsoup.parser.Token) startTag18, htmlTreeBuilderState19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(startTag18);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder0.setFormElement(formElement6);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder0.state();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilder0.inTableScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState8);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList10 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(elementList10);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder0.setFormElement(formElement6);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder0.state();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList3);
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        tokeniser2.emitCommentPending();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        boolean boolean11 = tokeniser10.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser10.getState();
        org.jsoup.parser.Token.Tag tag14 = tokeniser10.createTagPending(false);
        char[] charArray20 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser10.emit(charArray20);
        tokeniser2.emit(charArray20);
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader23, parseErrorList24);
        java.lang.StringBuilder stringBuilder26 = tokeniser25.dataBuffer;
        tokeniser25.createTempBuffer();
        org.jsoup.parser.Token.Tag tag28 = null;
        tokeniser25.tagPending = tag28;
        org.jsoup.parser.TokeniserState tokeniserState30 = null;
        tokeniser25.transition(tokeniserState30);
        tokeniser25.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader33, parseErrorList34);
        java.lang.StringBuilder stringBuilder36 = tokeniser35.dataBuffer;
        tokeniser35.createDoctypePending();
        tokeniser35.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader39 = null;
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader39, parseErrorList40);
        java.lang.StringBuilder stringBuilder42 = tokeniser41.dataBuffer;
        tokeniser35.dataBuffer = stringBuilder42;
        org.jsoup.parser.Token.Doctype doctype44 = tokeniser35.doctypePending;
        java.lang.String str45 = tokeniser35.appropriateEndTagName();
        org.jsoup.parser.TokeniserState tokeniserState46 = tokeniser35.getState();
        tokeniser25.transition(tokeniserState46);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder36);
        org.junit.Assert.assertEquals(stringBuilder36.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder42);
        org.junit.Assert.assertEquals(stringBuilder42.toString(), "");
        org.junit.Assert.assertNotNull(doctype44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(tokeniserState46);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        htmlTreeBuilder0.setFosterInserts(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.inButtonScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.setFosterInserts(false);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList9 = htmlTreeBuilder0.getStack();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertNull(elementList9);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        tokeniser2.emitCommentPending();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        boolean boolean11 = tokeniser10.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser10.getState();
        org.jsoup.parser.Token.Tag tag14 = tokeniser10.createTagPending(false);
        char[] charArray20 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser10.emit(charArray20);
        tokeniser2.emit(charArray20);
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader23, parseErrorList24);
        int[] intArray27 = new int[] { (byte) 1 };
        tokeniser25.emit(intArray27);
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader29, parseErrorList30);
        java.lang.StringBuilder stringBuilder32 = tokeniser31.dataBuffer;
        tokeniser31.createDoctypePending();
        tokeniser31.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader35, parseErrorList36);
        java.lang.StringBuilder stringBuilder38 = tokeniser37.dataBuffer;
        tokeniser31.dataBuffer = stringBuilder38;
        tokeniser25.dataBuffer = stringBuilder38;
        org.jsoup.parser.TokeniserState tokeniserState41 = tokeniser25.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 1 });
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder38);
        org.junit.Assert.assertEquals(stringBuilder38.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState41);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        int[] intArray4 = new int[] { (byte) 1 };
        tokeniser2.emit(intArray4);
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        tokeniser8.createDoctypePending();
        tokeniser8.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader12, parseErrorList13);
        java.lang.StringBuilder stringBuilder15 = tokeniser14.dataBuffer;
        tokeniser8.dataBuffer = stringBuilder15;
        tokeniser2.dataBuffer = stringBuilder15;
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser2.getState();
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList20);
        java.lang.StringBuilder stringBuilder22 = tokeniser21.dataBuffer;
        tokeniser21.createTempBuffer();
        org.jsoup.parser.Token.Tag tag24 = null;
        tokeniser21.tagPending = tag24;
        org.jsoup.parser.TokeniserState tokeniserState26 = null;
        tokeniser21.transition(tokeniserState26);
        tokeniser21.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader29, parseErrorList30);
        java.lang.StringBuilder stringBuilder32 = tokeniser31.dataBuffer;
        tokeniser31.createDoctypePending();
        tokeniser31.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader35, parseErrorList36);
        java.lang.StringBuilder stringBuilder38 = tokeniser37.dataBuffer;
        tokeniser31.dataBuffer = stringBuilder38;
        org.jsoup.parser.Token.Doctype doctype40 = tokeniser31.doctypePending;
        java.lang.String str41 = tokeniser31.appropriateEndTagName();
        org.jsoup.parser.TokeniserState tokeniserState42 = tokeniser31.getState();
        tokeniser21.transition(tokeniserState42);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 1 });
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder38);
        org.junit.Assert.assertEquals(stringBuilder38.toString(), "");
        org.junit.Assert.assertNotNull(doctype40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(tokeniserState42);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.maybeSetBaseUri(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.originalState();
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.inButtonScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        org.jsoup.parser.TokeniserState tokeniserState7 = null;
        tokeniser2.transition(tokeniserState7);
        tokeniser2.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        java.lang.StringBuilder stringBuilder13 = tokeniser12.dataBuffer;
        tokeniser12.createDoctypePending();
        tokeniser12.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader16, parseErrorList17);
        java.lang.StringBuilder stringBuilder19 = tokeniser18.dataBuffer;
        tokeniser12.dataBuffer = stringBuilder19;
        org.jsoup.parser.Token.Doctype doctype21 = tokeniser12.doctypePending;
        java.lang.String str22 = tokeniser12.appropriateEndTagName();
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser12.getState();
        tokeniser2.transition(tokeniserState23);
        java.lang.Class<?> wildcardClass25 = tokeniser2.getClass();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNotNull(doctype21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(elementList4);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!", "hi!", "", "" });
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Element element2 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.push(element2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements(element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(elementList4);
        org.junit.Assert.assertNull(formElement7);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Attributes attributes7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.processStartTag("", attributes7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(elementList4);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.nodes.Attributes attributes8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.processStartTag("", attributes8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceOnStack(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(elementList4);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        boolean boolean11 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilder0.inListItemScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        boolean boolean3 = tokeniser2.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser2.getState();
        org.jsoup.parser.Token.Tag tag6 = tokeniser2.createTagPending(false);
        tokeniser2.emitCommentPending();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(tag6);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        htmlTreeBuilder7.setPendingTableCharacters((java.util.List<java.lang.String>) strList10);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList10);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader15, parseErrorList16);
        boolean boolean18 = tokeniser17.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState19 = tokeniser17.getState();
        org.jsoup.parser.Token.Tag tag21 = tokeniser17.createTagPending(false);
        char[] charArray27 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser17.emit(charArray27);
        org.jsoup.parser.Token.StartTag startTag29 = tokeniser17.startPending;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element30 = htmlTreeBuilder0.insertEmpty(startTag29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(startTag29);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        boolean boolean10 = tokeniser9.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser9.getState();
        org.jsoup.parser.Token.Tag tag13 = tokeniser9.createTagPending(false);
        char[] charArray19 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser9.emit(charArray19);
        org.jsoup.parser.Token.StartTag startTag21 = tokeniser9.startPending;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = htmlTreeBuilder0.process((org.jsoup.parser.Token) startTag21, htmlTreeBuilderState22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tokeniserState11);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(startTag21);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.isSpecial(element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNull(elementList4);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.List<java.lang.String> strList1 = null;
        htmlTreeBuilder0.setPendingTableCharacters(strList1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = htmlTreeBuilder0.inButtonScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        boolean boolean3 = tokeniser2.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser2.getState();
        java.lang.String str5 = tokeniser2.appropriateEndTagName();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        tokeniser8.createDoctypePending();
        tokeniser8.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader12, parseErrorList13);
        java.lang.StringBuilder stringBuilder15 = tokeniser14.dataBuffer;
        tokeniser8.dataBuffer = stringBuilder15;
        org.jsoup.parser.Token.Doctype doctype17 = tokeniser8.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser8.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertNotNull(doctype17);
        org.junit.Assert.assertNotNull(tokeniserState18);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        org.jsoup.parser.TokeniserState tokeniserState7 = null;
        tokeniser2.transition(tokeniserState7);
        tokeniser2.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        java.lang.StringBuilder stringBuilder13 = tokeniser12.dataBuffer;
        tokeniser12.createDoctypePending();
        tokeniser12.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader16, parseErrorList17);
        java.lang.StringBuilder stringBuilder19 = tokeniser18.dataBuffer;
        tokeniser12.dataBuffer = stringBuilder19;
        org.jsoup.parser.Token.Doctype doctype21 = tokeniser12.doctypePending;
        java.lang.String str22 = tokeniser12.appropriateEndTagName();
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser12.getState();
        tokeniser2.transition(tokeniserState23);
        java.lang.StringBuilder stringBuilder25 = tokeniser2.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader26, parseErrorList27);
        boolean boolean29 = tokeniser28.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState30 = tokeniser28.getState();
        org.jsoup.parser.Token.Tag tag32 = tokeniser28.createTagPending(false);
        char[] charArray38 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser28.emit(charArray38);
        java.lang.StringBuilder stringBuilder40 = null;
        tokeniser28.dataBuffer = stringBuilder40;
        org.jsoup.parser.CharacterReader characterReader42 = null;
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.Tokeniser tokeniser44 = new org.jsoup.parser.Tokeniser(characterReader42, parseErrorList43);
        java.lang.StringBuilder stringBuilder45 = tokeniser44.dataBuffer;
        tokeniser44.createTempBuffer();
        org.jsoup.parser.Token.Tag tag47 = null;
        tokeniser44.tagPending = tag47;
        org.jsoup.parser.TokeniserState tokeniserState49 = null;
        tokeniser44.transition(tokeniserState49);
        tokeniser44.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader52 = null;
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        org.jsoup.parser.Tokeniser tokeniser54 = new org.jsoup.parser.Tokeniser(characterReader52, parseErrorList53);
        java.lang.StringBuilder stringBuilder55 = tokeniser54.dataBuffer;
        tokeniser54.createDoctypePending();
        tokeniser54.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader58 = null;
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.parser.Tokeniser tokeniser60 = new org.jsoup.parser.Tokeniser(characterReader58, parseErrorList59);
        java.lang.StringBuilder stringBuilder61 = tokeniser60.dataBuffer;
        tokeniser54.dataBuffer = stringBuilder61;
        org.jsoup.parser.Token.Doctype doctype63 = tokeniser54.doctypePending;
        java.lang.String str64 = tokeniser54.appropriateEndTagName();
        org.jsoup.parser.TokeniserState tokeniserState65 = tokeniser54.getState();
        tokeniser44.transition(tokeniserState65);
        tokeniser28.transition(tokeniserState65);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNotNull(doctype21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(tokeniserState30);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(stringBuilder45);
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder55);
        org.junit.Assert.assertEquals(stringBuilder55.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder61);
        org.junit.Assert.assertEquals(stringBuilder61.toString(), "");
        org.junit.Assert.assertNotNull(doctype63);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(tokeniserState65);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        java.lang.String str11 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableBodyContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList3);
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.Token.Character character7 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(character7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.setFosterInserts(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilder0.inListItemScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder0.setFormElement(formElement11);
        htmlTreeBuilder0.framesetOk(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = htmlTreeBuilder0.inListItemScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        boolean boolean3 = tokeniser2.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser2.getState();
        java.lang.String str5 = tokeniser2.appropriateEndTagName();
        tokeniser2.emitCommentPending();
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        boolean boolean10 = tokeniser9.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState11 = tokeniser9.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(tokeniserState11);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        boolean boolean3 = tokeniser2.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser2.getState();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token5 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tokeniserState4);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder0.setFormElement(formElement6);
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.isSpecial(element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element2 = null;
        htmlTreeBuilder0.setHeadElement(element2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.FormElement formElement4 = null;
        htmlTreeBuilder0.setFormElement(formElement4);
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        java.lang.StringBuilder stringBuilder10 = tokeniser8.dataBuffer;
        org.jsoup.parser.Token.StartTag startTag11 = tokeniser8.startPending;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element12 = htmlTreeBuilder0.insertEmpty(startTag11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(startTag11);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.setFosterInserts(false);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableRowContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState8);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList10 = htmlTreeBuilder0.getStack();
        boolean boolean11 = htmlTreeBuilder0.framesetOk();
        java.io.Reader reader12 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder15 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder15.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState17 = htmlTreeBuilder15.state();
        org.jsoup.parser.ParseSettings parseSettings18 = htmlTreeBuilder15.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader12, "", parseErrorList14, parseSettings18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(elementList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState17);
        org.junit.Assert.assertNotNull(parseSettings18);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader4, parseErrorList5);
        boolean boolean7 = tokeniser6.isAppropriateEndTagToken();
        org.jsoup.parser.Token.Doctype doctype8 = tokeniser6.doctypePending;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilder0.process((org.jsoup.parser.Token) doctype8, htmlTreeBuilderState9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doctype8);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        java.io.Reader reader2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean6 = htmlTreeBuilder5.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = null;
        htmlTreeBuilder5.transition(htmlTreeBuilderState7);
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder5.setHeadElement(element9);
        htmlTreeBuilder5.generateImpliedEndTags();
        boolean boolean12 = htmlTreeBuilder5.isFragmentParsing();
        org.jsoup.nodes.Element element14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder17 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder17.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder17.state();
        org.jsoup.parser.ParseSettings parseSettings20 = htmlTreeBuilder17.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = htmlTreeBuilder5.parseFragment("hi!", element14, "", parseErrorList16, parseSettings20);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader2, "", parseErrorList4, parseSettings20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = htmlTreeBuilder0.inButtonScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        boolean boolean13 = tokeniser12.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser12.getState();
        org.jsoup.parser.Token.Tag tag16 = tokeniser12.createTagPending(false);
        char[] charArray22 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser12.emit(charArray22);
        org.jsoup.parser.Token.StartTag startTag24 = tokeniser12.startPending;
        tokeniser8.emit((org.jsoup.parser.Token) startTag24);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element26 = htmlTreeBuilder0.insert(startTag24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(startTag24);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createDoctypePending();
        tokeniser2.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder9;
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser2.doctypePending;
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader12, parseErrorList13);
        boolean boolean15 = tokeniser14.isAppropriateEndTagToken();
        org.jsoup.parser.Token.Doctype doctype16 = tokeniser14.doctypePending;
        org.jsoup.parser.Token.Comment comment17 = tokeniser14.commentPending;
        tokeniser2.commentPending = comment17;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(doctype11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doctype16);
        org.junit.Assert.assertNotNull(comment17);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = htmlTreeBuilder0.inScope(strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNull(elementList4);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "", "hi!", "", "", "" });
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.FormElement formElement3 = null;
        htmlTreeBuilder0.setFormElement(formElement3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilder0.inScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.List<java.lang.String> strList1 = null;
        htmlTreeBuilder0.setPendingTableCharacters(strList1);
        org.jsoup.nodes.FormElement formElement3 = null;
        htmlTreeBuilder0.setFormElement(formElement3);
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = htmlTreeBuilder0.aboveOnStack(element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.CharacterReader characterReader2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.Tokeniser tokeniser4 = new org.jsoup.parser.Tokeniser(characterReader2, parseErrorList3);
        boolean boolean5 = tokeniser4.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState6 = tokeniser4.getState();
        org.jsoup.parser.Token.Tag tag8 = tokeniser4.createTagPending(false);
        char[] charArray14 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser4.emit(charArray14);
        org.jsoup.parser.Token.StartTag startTag16 = tokeniser4.startPending;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = htmlTreeBuilder0.process((org.jsoup.parser.Token) startTag16, htmlTreeBuilderState17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formElement1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tokeniserState6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(startTag16);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.Token.Character character2 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(character2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList3);
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder0.setHeadElement(element7);
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.Token token10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = htmlTreeBuilder0.process(token10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList2 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean5 = htmlTreeBuilder4.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = null;
        htmlTreeBuilder4.transition(htmlTreeBuilderState6);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder4.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList9 = htmlTreeBuilder4.getStack();
        htmlTreeBuilder4.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        htmlTreeBuilder11.setPendingTableCharacters((java.util.List<java.lang.String>) strList14);
        htmlTreeBuilder4.setPendingTableCharacters((java.util.List<java.lang.String>) strList14);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList14);
        org.jsoup.nodes.Element element19 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements(element19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formElement1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNull(elementList9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList2 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = htmlTreeBuilder0.isInActiveFormattingElements(element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formElement1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        java.lang.StringBuilder stringBuilder10 = tokeniser9.dataBuffer;
        tokeniser9.createDoctypePending();
        tokeniser9.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList14);
        java.lang.StringBuilder stringBuilder16 = tokeniser15.dataBuffer;
        tokeniser9.dataBuffer = stringBuilder16;
        org.jsoup.parser.Token.Doctype doctype18 = tokeniser9.doctypePending;
        tokeniser2.doctypePending = doctype18;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = tokeniser2.unescapeEntities(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertNotNull(doctype18);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = htmlTreeBuilder0.inScope(strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(elementList4);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!", "", "hi!", "", "" });
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        boolean boolean5 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.isInActiveFormattingElements(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(elementList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = htmlTreeBuilder0.onStack(element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.Token.Character character6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(character6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element2 = null;
        htmlTreeBuilder0.setHeadElement(element2);
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(true);
        boolean boolean7 = htmlTreeBuilder0.isFosterInserts();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList3);
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder0.setHeadElement(element7);
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.maybeSetBaseUri(element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        tokeniser2.emit("");
        org.jsoup.parser.Token.Tag tag6 = tokeniser2.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        java.lang.StringBuilder stringBuilder10 = tokeniser9.dataBuffer;
        tokeniser9.createDoctypePending();
        tokeniser9.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList14);
        java.lang.StringBuilder stringBuilder16 = tokeniser15.dataBuffer;
        tokeniser9.dataBuffer = stringBuilder16;
        org.jsoup.parser.Token.Doctype doctype18 = tokeniser9.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState19 = tokeniser9.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertNotNull(doctype18);
        org.junit.Assert.assertNotNull(tokeniserState19);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createDoctypePending();
        tokeniser2.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder9;
        tokeniser2.emit("hi!");
        org.jsoup.parser.TokeniserState tokeniserState13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder5.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        htmlTreeBuilder5.setPendingTableCharacters((java.util.List<java.lang.String>) strList14);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element19 = htmlTreeBuilder0.insertStartTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.nodes.FormElement formElement3 = null;
        htmlTreeBuilder0.setFormElement(formElement3);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Element element2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList6 = htmlTreeBuilder0.parseFragment("hi!", element2, "", parseErrorList4, parseSettings5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = htmlTreeBuilder0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState8);
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = htmlTreeBuilder0.onStack(element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element2 = null;
        htmlTreeBuilder0.setHeadElement(element2);
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(true);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strList4);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        boolean boolean3 = tokeniser2.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser2.getState();
        java.lang.String str5 = tokeniser2.appropriateEndTagName();
        int[] intArray7 = new int[] { (short) 0 };
        tokeniser2.emit(intArray7);
        tokeniser2.emitCommentPending();
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        java.lang.StringBuilder stringBuilder13 = tokeniser12.dataBuffer;
        tokeniser12.createTempBuffer();
        org.jsoup.parser.Token.Tag tag15 = null;
        tokeniser12.tagPending = tag15;
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader17, parseErrorList18);
        java.lang.StringBuilder stringBuilder20 = tokeniser19.dataBuffer;
        tokeniser19.createTempBuffer();
        org.jsoup.parser.Token.Tag tag23 = tokeniser19.createTagPending(false);
        tokeniser12.emit((org.jsoup.parser.Token) tag23);
        org.jsoup.parser.Token.Doctype doctype25 = tokeniser12.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emit((org.jsoup.parser.Token) doctype25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0 });
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(doctype25);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag6 = tokeniser2.createTagPending(false);
        java.lang.String str7 = tokeniser2.appropriateEndTagName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = tokeniser2.unescapeEntities(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        org.jsoup.parser.ParseSettings parseSettings5 = htmlTreeBuilder0.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getActiveFormattingElement("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNotNull(parseSettings5);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements(element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.List<java.lang.String> strList1 = null;
        htmlTreeBuilder0.setPendingTableCharacters(strList1);
        org.jsoup.nodes.FormElement formElement3 = null;
        htmlTreeBuilder0.setFormElement(formElement3);
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.push(element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element3 = htmlTreeBuilder0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        org.jsoup.parser.TokeniserState tokeniserState7 = null;
        tokeniser2.transition(tokeniserState7);
        tokeniser2.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        java.lang.StringBuilder stringBuilder13 = tokeniser12.dataBuffer;
        tokeniser12.createTempBuffer();
        org.jsoup.parser.Token.Tag tag15 = null;
        tokeniser12.tagPending = tag15;
        tokeniser12.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag19 = tokeniser12.createTagPending(false);
        tokeniser12.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader22, parseErrorList23);
        java.lang.StringBuilder stringBuilder25 = tokeniser24.dataBuffer;
        tokeniser24.createDoctypePending();
        tokeniser24.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader28, parseErrorList29);
        java.lang.StringBuilder stringBuilder31 = tokeniser30.dataBuffer;
        tokeniser24.dataBuffer = stringBuilder31;
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader33, parseErrorList34);
        boolean boolean36 = tokeniser35.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState37 = tokeniser35.getState();
        tokeniser24.transition(tokeniserState37);
        tokeniser12.transition(tokeniserState37);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(tokeniserState37);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        boolean boolean3 = tokeniser2.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser2.getState();
        java.lang.String str5 = tokeniser2.appropriateEndTagName();
        int[] intArray7 = new int[] { (short) 0 };
        tokeniser2.emit(intArray7);
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader9, parseErrorList10);
        java.lang.StringBuilder stringBuilder12 = tokeniser11.dataBuffer;
        tokeniser11.createDoctypePending();
        tokeniser11.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader15, parseErrorList16);
        java.lang.StringBuilder stringBuilder18 = tokeniser17.dataBuffer;
        tokeniser11.dataBuffer = stringBuilder18;
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader20, parseErrorList21);
        boolean boolean23 = tokeniser22.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState24 = tokeniser22.getState();
        tokeniser11.transition(tokeniserState24);
        org.jsoup.parser.TokeniserState tokeniserState26 = tokeniser11.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0 });
        org.junit.Assert.assertNotNull(stringBuilder12);
        org.junit.Assert.assertEquals(stringBuilder12.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertNotNull(tokeniserState26);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createDoctypePending();
        tokeniser2.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder9;
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser2.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser2.getState();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList14);
        java.lang.StringBuilder stringBuilder16 = tokeniser15.dataBuffer;
        tokeniser15.createTempBuffer();
        org.jsoup.parser.Token.Tag tag18 = null;
        tokeniser15.tagPending = tag18;
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader20, parseErrorList21);
        java.lang.StringBuilder stringBuilder23 = tokeniser22.dataBuffer;
        tokeniser22.createTempBuffer();
        org.jsoup.parser.Token.Tag tag26 = tokeniser22.createTagPending(false);
        tokeniser15.emit((org.jsoup.parser.Token) tag26);
        org.jsoup.parser.Token.StartTag startTag28 = null;
        tokeniser15.startPending = startTag28;
        org.jsoup.parser.TokeniserState tokeniserState30 = tokeniser15.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(doctype11);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(tokeniserState30);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Element element8 = null;
        htmlTreeBuilder0.setHeadElement(element8);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.generateImpliedEndTags("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNull(elementList7);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader4, parseErrorList5);
        java.lang.StringBuilder stringBuilder7 = tokeniser6.dataBuffer;
        tokeniser6.createTempBuffer();
        org.jsoup.parser.Token.Tag tag9 = null;
        tokeniser6.tagPending = tag9;
        tokeniser6.createTempBuffer();
        org.jsoup.parser.Token.Comment comment12 = tokeniser6.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(comment12);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.List<java.lang.String> strList1 = null;
        htmlTreeBuilder0.setPendingTableCharacters(strList1);
        org.jsoup.nodes.FormElement formElement3 = null;
        htmlTreeBuilder0.setFormElement(formElement3);
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader5, parseErrorList6);
        java.lang.StringBuilder stringBuilder8 = tokeniser7.dataBuffer;
        java.lang.StringBuilder stringBuilder9 = tokeniser7.dataBuffer;
        org.jsoup.parser.Token.StartTag startTag10 = tokeniser7.startPending;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = htmlTreeBuilder0.insert(startTag10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(startTag10);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        org.jsoup.nodes.Element element8 = null;
        htmlTreeBuilder0.setHeadElement(element8);
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.push(element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(elementList4);
        org.junit.Assert.assertNull(formElement7);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        htmlTreeBuilder7.setPendingTableCharacters((java.util.List<java.lang.String>) strList10);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList10);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = htmlTreeBuilder0.originalState();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = htmlTreeBuilder0.lastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState15);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(true);
        java.lang.Class<?> wildcardClass9 = htmlTreeBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceOnStack(element9, element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.io.Reader reader5 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean9 = htmlTreeBuilder8.isFosterInserts();
        org.jsoup.nodes.Element element10 = null;
        htmlTreeBuilder8.setHeadElement(element10);
        java.util.List<java.lang.String> strList12 = htmlTreeBuilder8.getPendingTableCharacters();
        org.jsoup.parser.ParseSettings parseSettings13 = htmlTreeBuilder8.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader5, "hi!", parseErrorList7, parseSettings13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strList12);
        org.junit.Assert.assertNotNull(parseSettings13);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilder0.isSpecial(element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        org.jsoup.nodes.FormElement formElement3 = null;
        htmlTreeBuilder0.setFormElement(formElement3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilder0.inScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        boolean boolean3 = tokeniser2.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser2.getState();
        org.jsoup.parser.Token.Tag tag6 = tokeniser2.createTagPending(false);
        char[] charArray12 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser2.emit(charArray12);
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        java.lang.StringBuilder stringBuilder17 = tokeniser16.dataBuffer;
        tokeniser16.createTempBuffer();
        org.jsoup.parser.Token.Tag tag19 = null;
        tokeniser16.tagPending = tag19;
        tokeniser16.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag23 = tokeniser16.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader24, parseErrorList25);
        int[] intArray28 = new int[] { (byte) 1 };
        tokeniser26.emit(intArray28);
        tokeniser16.emit(intArray28);
        tokeniser2.emit(intArray28);
        tokeniser2.emitTagPending();
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader33, parseErrorList34);
        java.lang.StringBuilder stringBuilder36 = tokeniser35.dataBuffer;
        tokeniser35.createDoctypePending();
        tokeniser35.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader39 = null;
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader39, parseErrorList40);
        java.lang.StringBuilder stringBuilder42 = tokeniser41.dataBuffer;
        tokeniser35.dataBuffer = stringBuilder42;
        org.jsoup.parser.Token.Doctype doctype44 = tokeniser35.doctypePending;
        java.lang.String str45 = tokeniser35.appropriateEndTagName();
        org.jsoup.parser.TokeniserState tokeniserState46 = tokeniser35.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 1 });
        org.junit.Assert.assertNotNull(stringBuilder36);
        org.junit.Assert.assertEquals(stringBuilder36.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder42);
        org.junit.Assert.assertEquals(stringBuilder42.toString(), "");
        org.junit.Assert.assertNotNull(doctype44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(tokeniserState46);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.List<java.lang.String> strList1 = null;
        htmlTreeBuilder0.setPendingTableCharacters(strList1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = htmlTreeBuilder0.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        htmlTreeBuilder7.setPendingTableCharacters((java.util.List<java.lang.String>) strList10);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList10);
        boolean boolean14 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element15 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements(element15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        htmlTreeBuilder7.setPendingTableCharacters((java.util.List<java.lang.String>) strList10);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList10);
        htmlTreeBuilder0.generateImpliedEndTags();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = htmlTreeBuilder0.getFromStack("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element2 = null;
        htmlTreeBuilder0.setHeadElement(element2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = htmlTreeBuilder0.inTableScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(false);
        htmlTreeBuilder0.generateImpliedEndTags();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element11 = htmlTreeBuilder0.insertStartTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean7 = htmlTreeBuilder0.isFosterInserts();
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = tokeniser2.unescapeEntities(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.Element element13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = htmlTreeBuilder0.onStack(element13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder0.setFormElement(formElement11);
        htmlTreeBuilder0.framesetOk(false);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        boolean boolean3 = tokeniser2.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser2.getState();
        java.lang.String str5 = tokeniser2.appropriateEndTagName();
        java.lang.StringBuilder stringBuilder6 = null;
        tokeniser2.dataBuffer = stringBuilder6;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = tokeniser2.consumeCharacterReference((java.lang.Character) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = element4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Comment comment8 = tokeniser2.commentPending;
        org.jsoup.parser.Token.Tag tag9 = tokeniser2.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(comment8);
        org.junit.Assert.assertNull(tag9);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        boolean boolean5 = htmlTreeBuilder0.isFosterInserts();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertMarkerToFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(elementList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element2 = null;
        htmlTreeBuilder0.setHeadElement(element2);
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(true);
        boolean boolean7 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements(element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.inListItemScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.inTableScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(false);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = htmlTreeBuilder0.inScope("hi!", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList9);
        boolean boolean12 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Document document13 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        java.lang.StringBuilder stringBuilder17 = tokeniser16.dataBuffer;
        java.lang.StringBuilder stringBuilder18 = tokeniser16.dataBuffer;
        org.jsoup.parser.Token.StartTag startTag19 = null;
        tokeniser16.startPending = startTag19;
        org.jsoup.parser.Token.Character character21 = tokeniser16.charPending;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(character21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(character21);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.generateImpliedEndTags("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element2 = null;
        htmlTreeBuilder0.setHeadElement(element2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = htmlTreeBuilder0.aboveOnStack(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableBodyContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.isInActiveFormattingElements(element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.originalState();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.inTableScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList3);
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element8 = null;
        htmlTreeBuilder0.setHeadElement(element8);
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.maybeSetBaseUri(element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.FormElement formElement4 = null;
        htmlTreeBuilder0.setFormElement(formElement4);
        org.jsoup.nodes.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertInFosterParent(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList3);
        htmlTreeBuilder0.newPendingTableCharacters();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        java.io.Reader reader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder11.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState13 = htmlTreeBuilder11.state();
        org.jsoup.parser.ParseSettings parseSettings14 = htmlTreeBuilder11.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader8, "hi!", parseErrorList10, parseSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNull(htmlTreeBuilderState13);
        org.junit.Assert.assertNotNull(parseSettings14);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        boolean boolean11 = htmlTreeBuilder0.isFragmentParsing();
        java.lang.String[] strArray12 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        java.lang.StringBuilder stringBuilder4 = tokeniser2.dataBuffer;
        org.jsoup.parser.Token.StartTag startTag5 = null;
        tokeniser2.startPending = startTag5;
        org.jsoup.parser.TokeniserState tokeniserState7 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder0.setFormElement(formElement6);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder0.originalState();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearFormattingElementsToLastMarker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.generateImpliedEndTags();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.inTableScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        boolean boolean3 = tokeniser2.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser2.getState();
        org.jsoup.parser.Token.Tag tag6 = tokeniser2.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        java.lang.StringBuilder stringBuilder10 = tokeniser9.dataBuffer;
        tokeniser9.createTempBuffer();
        org.jsoup.parser.Token.Tag tag12 = null;
        tokeniser9.tagPending = tag12;
        tokeniser9.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag16 = tokeniser9.createTagPending(false);
        tokeniser9.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList20);
        java.lang.StringBuilder stringBuilder22 = tokeniser21.dataBuffer;
        tokeniser21.createDoctypePending();
        tokeniser21.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader25, parseErrorList26);
        java.lang.StringBuilder stringBuilder28 = tokeniser27.dataBuffer;
        tokeniser21.dataBuffer = stringBuilder28;
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader30, parseErrorList31);
        boolean boolean33 = tokeniser32.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState34 = tokeniser32.getState();
        tokeniser21.transition(tokeniserState34);
        tokeniser9.transition(tokeniserState34);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(tokeniserState34);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        org.jsoup.parser.TokeniserState tokeniserState7 = null;
        tokeniser2.transition(tokeniserState7);
        org.jsoup.parser.Token.StartTag startTag9 = tokeniser2.startPending;
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser2.commentPending = comment10;
        org.jsoup.parser.Token.StartTag startTag12 = null;
        tokeniser2.startPending = startTag12;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        java.lang.StringBuilder stringBuilder17 = tokeniser16.dataBuffer;
        tokeniser16.createDoctypePending();
        tokeniser16.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader20, parseErrorList21);
        java.lang.StringBuilder stringBuilder23 = tokeniser22.dataBuffer;
        tokeniser16.dataBuffer = stringBuilder23;
        org.jsoup.parser.Token.Doctype doctype25 = tokeniser16.doctypePending;
        java.lang.String str26 = tokeniser16.appropriateEndTagName();
        org.jsoup.parser.TokeniserState tokeniserState27 = tokeniser16.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertNotNull(doctype25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(tokeniserState27);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder0.setFormElement(formElement6);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder0.originalState();
        boolean boolean9 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList9);
        boolean boolean12 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Document document13 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element15 = htmlTreeBuilder0.aboveOnStack(element14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.generateImpliedEndTags();
        java.io.Reader reader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder10.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder10.state();
        htmlTreeBuilder10.generateImpliedEndTags();
        htmlTreeBuilder10.framesetOk(true);
        org.jsoup.nodes.Element element17 = null;
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder20 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder20.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState22 = htmlTreeBuilder20.state();
        org.jsoup.parser.ParseSettings parseSettings23 = htmlTreeBuilder20.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = htmlTreeBuilder10.parseFragment("", element17, "", parseErrorList19, parseSettings23);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader7, "hi!", parseErrorList9, parseSettings23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
        org.junit.Assert.assertNull(htmlTreeBuilderState22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createDoctypePending();
        tokeniser2.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder9;
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser2.doctypePending;
        java.lang.String str12 = tokeniser2.appropriateEndTagName();
        tokeniser2.acknowledgeSelfClosingFlag();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(doctype11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Element element8 = null;
        htmlTreeBuilder0.setHeadElement(element8);
        boolean boolean10 = htmlTreeBuilder0.isFragmentParsing();
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = htmlTreeBuilder0.inScope(strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNull(elementList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "", "", "", "", "hi!" });
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag9 = tokeniser2.createTagPending(false);
        tokeniser2.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader12, parseErrorList13);
        java.lang.StringBuilder stringBuilder15 = tokeniser14.dataBuffer;
        tokeniser14.createTempBuffer();
        org.jsoup.parser.Token.Tag tag17 = null;
        tokeniser14.tagPending = tag17;
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList20);
        java.lang.StringBuilder stringBuilder22 = tokeniser21.dataBuffer;
        tokeniser21.createDoctypePending();
        tokeniser21.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader25, parseErrorList26);
        java.lang.StringBuilder stringBuilder28 = tokeniser27.dataBuffer;
        tokeniser21.dataBuffer = stringBuilder28;
        org.jsoup.parser.Token.Doctype doctype30 = tokeniser21.doctypePending;
        tokeniser14.doctypePending = doctype30;
        tokeniser2.doctypePending = doctype30;
        org.jsoup.parser.CharacterReader characterReader33 = null;
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader33, parseErrorList34);
        java.lang.StringBuilder stringBuilder36 = tokeniser35.dataBuffer;
        tokeniser35.createTempBuffer();
        org.jsoup.parser.Token.Tag tag38 = null;
        tokeniser35.tagPending = tag38;
        org.jsoup.parser.CharacterReader characterReader40 = null;
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.Tokeniser tokeniser42 = new org.jsoup.parser.Tokeniser(characterReader40, parseErrorList41);
        java.lang.StringBuilder stringBuilder43 = tokeniser42.dataBuffer;
        tokeniser42.createTempBuffer();
        org.jsoup.parser.Token.Tag tag46 = tokeniser42.createTagPending(false);
        tokeniser35.emit((org.jsoup.parser.Token) tag46);
        org.jsoup.parser.Token.StartTag startTag48 = null;
        tokeniser35.startPending = startTag48;
        org.jsoup.parser.TokeniserState tokeniserState50 = tokeniser35.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertNotNull(doctype30);
        org.junit.Assert.assertNotNull(stringBuilder36);
        org.junit.Assert.assertEquals(stringBuilder36.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder43);
        org.junit.Assert.assertEquals(stringBuilder43.toString(), "");
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertNotNull(tokeniserState50);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.FormElement formElement10 = null;
        htmlTreeBuilder0.setFormElement(formElement10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilder0.inTableScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        boolean boolean3 = tokeniser2.isAppropriateEndTagToken();
        org.jsoup.parser.Token.Doctype doctype4 = tokeniser2.doctypePending;
        java.lang.Class<?> wildcardClass5 = tokeniser2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doctype4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element8 = htmlTreeBuilder0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableBodyContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        htmlTreeBuilder7.setPendingTableCharacters((java.util.List<java.lang.String>) strList10);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList10);
        boolean boolean14 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader15, parseErrorList16);
        boolean boolean18 = tokeniser17.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState19 = tokeniser17.getState();
        org.jsoup.parser.Token.Tag tag21 = tokeniser17.createTagPending(false);
        char[] charArray27 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser17.emit(charArray27);
        org.jsoup.parser.Token.StartTag startTag29 = tokeniser17.startPending;
        org.jsoup.parser.Token.EndTag endTag30 = tokeniser17.endPending;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState31 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = htmlTreeBuilder0.process((org.jsoup.parser.Token) endTag30, htmlTreeBuilderState31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tokeniserState19);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(startTag29);
        org.junit.Assert.assertNotNull(endTag30);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList3);
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element8 = null;
        htmlTreeBuilder0.setHeadElement(element8);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.generateImpliedEndTags("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getActiveFormattingElement("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        boolean boolean3 = tokeniser2.isAppropriateEndTagToken();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token4 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = htmlTreeBuilder0.aboveOnStack(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        java.lang.StringBuilder stringBuilder4 = tokeniser2.dataBuffer;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token5 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.FormElement formElement9 = htmlTreeBuilder0.getFormElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(formElement9);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        java.lang.String str11 = htmlTreeBuilder0.getBaseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = htmlTreeBuilder0.getFromStack("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createDoctypePending();
        tokeniser2.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder9;
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader11, parseErrorList12);
        boolean boolean14 = tokeniser13.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState15 = tokeniser13.getState();
        tokeniser2.transition(tokeniserState15);
        org.jsoup.parser.Token token17 = tokeniser2.read();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = tokeniser2.consumeCharacterReference((java.lang.Character) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(token17);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        java.lang.StringBuilder stringBuilder4 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        tokeniser2.acknowledgeSelfClosingFlag();
        tokeniser2.emitDoctypePending();
        boolean boolean8 = tokeniser2.isAppropriateEndTagToken();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element12 = null;
        org.jsoup.nodes.Element element13 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter(element12, element13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag6 = tokeniser2.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        java.lang.StringBuilder stringBuilder10 = tokeniser9.dataBuffer;
        tokeniser9.createDoctypePending();
        tokeniser9.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList14);
        java.lang.StringBuilder stringBuilder16 = tokeniser15.dataBuffer;
        tokeniser9.dataBuffer = stringBuilder16;
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader18, parseErrorList19);
        boolean boolean21 = tokeniser20.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState22 = tokeniser20.getState();
        tokeniser9.transition(tokeniserState22);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(tokeniserState22);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        boolean boolean3 = tokeniser2.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser2.getState();
        org.jsoup.parser.Token.Tag tag6 = tokeniser2.createTagPending(false);
        char[] charArray12 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser2.emit(charArray12);
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        java.lang.StringBuilder stringBuilder17 = tokeniser16.dataBuffer;
        tokeniser16.createDoctypePending();
        tokeniser16.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader20, parseErrorList21);
        java.lang.StringBuilder stringBuilder23 = tokeniser22.dataBuffer;
        tokeniser16.dataBuffer = stringBuilder23;
        org.jsoup.parser.Token.Doctype doctype25 = tokeniser16.doctypePending;
        tokeniser2.doctypePending = doctype25;
        boolean boolean27 = tokeniser2.currentNodeInHtmlNS();
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader28, parseErrorList29);
        java.lang.StringBuilder stringBuilder31 = tokeniser30.dataBuffer;
        tokeniser30.createTempBuffer();
        org.jsoup.parser.Token.Tag tag33 = null;
        tokeniser30.tagPending = tag33;
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader35, parseErrorList36);
        java.lang.StringBuilder stringBuilder38 = tokeniser37.dataBuffer;
        tokeniser37.createTempBuffer();
        org.jsoup.parser.Token.Tag tag41 = tokeniser37.createTagPending(false);
        tokeniser30.emit((org.jsoup.parser.Token) tag41);
        org.jsoup.parser.Token.StartTag startTag43 = null;
        tokeniser30.startPending = startTag43;
        org.jsoup.parser.TokeniserState tokeniserState45 = tokeniser30.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertNotNull(doctype25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder38);
        org.junit.Assert.assertEquals(stringBuilder38.toString(), "");
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(tokeniserState45);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Document document5 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean7 = htmlTreeBuilder6.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = null;
        htmlTreeBuilder6.transition(htmlTreeBuilderState8);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder6.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList11 = htmlTreeBuilder6.getStack();
        htmlTreeBuilder6.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        htmlTreeBuilder13.setPendingTableCharacters((java.util.List<java.lang.String>) strList16);
        htmlTreeBuilder6.setPendingTableCharacters((java.util.List<java.lang.String>) strList16);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = htmlTreeBuilder0.inSelectScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNull(elementList11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader5, parseErrorList6);
        java.lang.StringBuilder stringBuilder8 = tokeniser7.dataBuffer;
        java.lang.StringBuilder stringBuilder9 = tokeniser7.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        java.lang.StringBuilder stringBuilder13 = tokeniser12.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        boolean boolean17 = tokeniser16.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser16.getState();
        org.jsoup.parser.Token.Tag tag20 = tokeniser16.createTagPending(false);
        char[] charArray26 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser16.emit(charArray26);
        org.jsoup.parser.Token.StartTag startTag28 = tokeniser16.startPending;
        tokeniser12.emit((org.jsoup.parser.Token) startTag28);
        tokeniser7.startPending = startTag28;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element31 = htmlTreeBuilder0.insertEmpty(startTag28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(startTag28);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        boolean boolean3 = tokeniser2.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser2.getState();
        org.jsoup.parser.Token.Tag tag6 = tokeniser2.createTagPending(false);
        char[] charArray12 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser2.emit(charArray12);
        org.jsoup.parser.Token.StartTag startTag14 = tokeniser2.startPending;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token15 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(startTag14);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList9);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList12 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Element element13 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.push(element13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(elementList12);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter(element9, element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter(element7, element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        htmlTreeBuilder7.setPendingTableCharacters((java.util.List<java.lang.String>) strList10);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList10);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = htmlTreeBuilder0.originalState();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableRowContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState15);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element2 = null;
        htmlTreeBuilder0.setHeadElement(element2);
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        java.io.Reader reader5 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder8.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder8.state();
        htmlTreeBuilder8.generateImpliedEndTags();
        htmlTreeBuilder8.framesetOk(true);
        org.jsoup.nodes.Element element15 = null;
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder18.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState20 = htmlTreeBuilder18.state();
        org.jsoup.parser.ParseSettings parseSettings21 = htmlTreeBuilder18.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = htmlTreeBuilder8.parseFragment("", element15, "", parseErrorList17, parseSettings21);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader5, "hi!", parseErrorList7, parseSettings21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNull(htmlTreeBuilderState20);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element4 = null;
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter(element4, element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNotNull(parseSettings3);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.FormElement formElement10 = null;
        htmlTreeBuilder0.setFormElement(formElement10);
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader12, parseErrorList13);
        boolean boolean15 = tokeniser14.isAppropriateEndTagToken();
        org.jsoup.parser.Token.Doctype doctype16 = tokeniser14.doctypePending;
        org.jsoup.parser.Token.Comment comment17 = tokeniser14.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doctype16);
        org.junit.Assert.assertNotNull(comment17);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createDoctypePending();
        tokeniser2.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder9;
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser2.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser2.getState();
        org.jsoup.parser.Token.Doctype doctype13 = tokeniser2.doctypePending;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        boolean boolean17 = tokeniser16.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser16.getState();
        org.jsoup.parser.Token.Tag tag20 = tokeniser16.createTagPending(false);
        char[] charArray26 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser16.emit(charArray26);
        tokeniser2.emit(charArray26);
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader29, parseErrorList30);
        java.lang.StringBuilder stringBuilder32 = tokeniser31.dataBuffer;
        tokeniser31.createDoctypePending();
        tokeniser31.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader35 = null;
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.Tokeniser tokeniser37 = new org.jsoup.parser.Tokeniser(characterReader35, parseErrorList36);
        java.lang.StringBuilder stringBuilder38 = tokeniser37.dataBuffer;
        tokeniser31.dataBuffer = stringBuilder38;
        org.jsoup.parser.Token.Doctype doctype40 = tokeniser31.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState41 = tokeniser31.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(doctype11);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(doctype13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder38);
        org.junit.Assert.assertEquals(stringBuilder38.toString(), "");
        org.junit.Assert.assertNotNull(doctype40);
        org.junit.Assert.assertNotNull(tokeniserState41);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element10 = htmlTreeBuilder0.lastFormattingElement();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        org.jsoup.parser.ParseSettings parseSettings5 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        tokeniser8.createTempBuffer();
        org.jsoup.parser.Token.Tag tag11 = null;
        tokeniser8.tagPending = tag11;
        tokeniser8.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag15 = tokeniser8.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader16, parseErrorList17);
        int[] intArray20 = new int[] { (byte) 1 };
        tokeniser18.emit(intArray20);
        tokeniser8.emit(intArray20);
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader23, parseErrorList24);
        java.lang.StringBuilder stringBuilder26 = tokeniser25.dataBuffer;
        java.lang.StringBuilder stringBuilder27 = tokeniser25.dataBuffer;
        tokeniser25.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.Tokeniser tokeniser31 = new org.jsoup.parser.Tokeniser(characterReader29, parseErrorList30);
        java.lang.StringBuilder stringBuilder32 = tokeniser31.dataBuffer;
        tokeniser31.createTempBuffer();
        org.jsoup.parser.Token.Tag tag34 = null;
        tokeniser31.tagPending = tag34;
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.Tokeniser tokeniser38 = new org.jsoup.parser.Tokeniser(characterReader36, parseErrorList37);
        java.lang.StringBuilder stringBuilder39 = tokeniser38.dataBuffer;
        tokeniser38.createDoctypePending();
        tokeniser38.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader42 = null;
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.Tokeniser tokeniser44 = new org.jsoup.parser.Tokeniser(characterReader42, parseErrorList43);
        java.lang.StringBuilder stringBuilder45 = tokeniser44.dataBuffer;
        tokeniser38.dataBuffer = stringBuilder45;
        org.jsoup.parser.Token.Doctype doctype47 = tokeniser38.doctypePending;
        tokeniser31.doctypePending = doctype47;
        tokeniser25.doctypePending = doctype47;
        tokeniser8.emit((org.jsoup.parser.Token) doctype47);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState51 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = htmlTreeBuilder0.process((org.jsoup.parser.Token) doctype47, htmlTreeBuilderState51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 1 });
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder32);
        org.junit.Assert.assertEquals(stringBuilder32.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder39);
        org.junit.Assert.assertEquals(stringBuilder39.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder45);
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "");
        org.junit.Assert.assertNotNull(doctype47);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.List<java.lang.String> strList1 = null;
        htmlTreeBuilder0.setPendingTableCharacters(strList1);
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.push(element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        tokeniser2.createTempBuffer();
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader9, parseErrorList10);
        int[] intArray13 = new int[] { (byte) 1 };
        tokeniser11.emit(intArray13);
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader15, parseErrorList16);
        java.lang.StringBuilder stringBuilder18 = tokeniser17.dataBuffer;
        tokeniser17.createDoctypePending();
        tokeniser17.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader21, parseErrorList22);
        java.lang.StringBuilder stringBuilder24 = tokeniser23.dataBuffer;
        tokeniser17.dataBuffer = stringBuilder24;
        tokeniser11.dataBuffer = stringBuilder24;
        org.jsoup.parser.TokeniserState tokeniserState27 = tokeniser11.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 1 });
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState27);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.Token.Comment comment2 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        java.lang.StringBuilder stringBuilder10 = tokeniser9.dataBuffer;
        tokeniser9.createTempBuffer();
        org.jsoup.parser.Token.Tag tag12 = null;
        tokeniser9.tagPending = tag12;
        tokeniser9.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag16 = tokeniser9.createTagPending(false);
        tokeniser9.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader18, parseErrorList19);
        java.lang.StringBuilder stringBuilder21 = tokeniser20.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader22, parseErrorList23);
        boolean boolean25 = tokeniser24.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState26 = tokeniser24.getState();
        org.jsoup.parser.Token.Tag tag28 = tokeniser24.createTagPending(false);
        char[] charArray34 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser24.emit(charArray34);
        org.jsoup.parser.Token.StartTag startTag36 = tokeniser24.startPending;
        tokeniser20.emit((org.jsoup.parser.Token) startTag36);
        tokeniser9.startPending = startTag36;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = htmlTreeBuilder0.process((org.jsoup.parser.Token) startTag36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(startTag36);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.FormElement formElement4 = null;
        htmlTreeBuilder0.setFormElement(formElement4);
        org.jsoup.nodes.FormElement formElement6 = htmlTreeBuilder0.getFormElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertNull(formElement6);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        boolean boolean3 = tokeniser2.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser2.getState();
        org.jsoup.parser.Token.Tag tag6 = tokeniser2.createTagPending(false);
        char[] charArray12 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser2.emit(charArray12);
        org.jsoup.parser.Token.StartTag startTag14 = tokeniser2.startPending;
        boolean boolean15 = tokeniser2.isAppropriateEndTagToken();
        org.jsoup.parser.Token.Tag tag17 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Tag tag18 = tokeniser2.tagPending;
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList20);
        java.lang.StringBuilder stringBuilder22 = tokeniser21.dataBuffer;
        tokeniser21.createTempBuffer();
        org.jsoup.parser.Token.Tag tag24 = null;
        tokeniser21.tagPending = tag24;
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader26, parseErrorList27);
        java.lang.StringBuilder stringBuilder29 = tokeniser28.dataBuffer;
        tokeniser28.createTempBuffer();
        org.jsoup.parser.Token.Tag tag32 = tokeniser28.createTagPending(false);
        tokeniser21.emit((org.jsoup.parser.Token) tag32);
        org.jsoup.parser.Token.StartTag startTag34 = null;
        tokeniser21.startPending = startTag34;
        org.jsoup.parser.TokeniserState tokeniserState36 = tokeniser21.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(tokeniserState36);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element2 = null;
        htmlTreeBuilder0.setHeadElement(element2);
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(true);
        boolean boolean7 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        java.lang.StringBuilder stringBuilder11 = tokeniser10.dataBuffer;
        tokeniser10.createDoctypePending();
        tokeniser10.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        java.lang.StringBuilder stringBuilder17 = tokeniser16.dataBuffer;
        tokeniser10.dataBuffer = stringBuilder17;
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList20);
        boolean boolean22 = tokeniser21.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser21.getState();
        tokeniser10.transition(tokeniserState23);
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader25, parseErrorList26);
        java.lang.StringBuilder stringBuilder28 = tokeniser27.dataBuffer;
        tokeniser27.createDoctypePending();
        tokeniser27.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader31, parseErrorList32);
        java.lang.StringBuilder stringBuilder34 = tokeniser33.dataBuffer;
        tokeniser27.dataBuffer = stringBuilder34;
        org.jsoup.parser.Token.Doctype doctype36 = tokeniser27.doctypePending;
        org.jsoup.parser.CharacterReader characterReader37 = null;
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader37, parseErrorList38);
        boolean boolean40 = tokeniser39.isAppropriateEndTagToken();
        org.jsoup.parser.Token.Doctype doctype41 = tokeniser39.doctypePending;
        org.jsoup.parser.Token.Comment comment42 = tokeniser39.commentPending;
        tokeniser27.commentPending = comment42;
        tokeniser10.commentPending = comment42;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState45 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = htmlTreeBuilder0.process((org.jsoup.parser.Token) comment42, htmlTreeBuilderState45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertNotNull(doctype36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(doctype41);
        org.junit.Assert.assertNotNull(comment42);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader4, parseErrorList5);
        java.lang.StringBuilder stringBuilder7 = tokeniser6.dataBuffer;
        java.lang.StringBuilder stringBuilder8 = tokeniser6.dataBuffer;
        org.jsoup.parser.Token.StartTag startTag9 = tokeniser6.startPending;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement11 = htmlTreeBuilder0.insertForm(startTag9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(startTag9);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        boolean boolean3 = tokeniser2.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser2.getState();
        java.lang.String str5 = tokeniser2.appropriateEndTagName();
        tokeniser2.emitCommentPending();
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        java.lang.StringBuilder stringBuilder10 = tokeniser9.dataBuffer;
        java.lang.StringBuilder stringBuilder11 = tokeniser9.dataBuffer;
        org.jsoup.parser.Token.StartTag startTag12 = tokeniser9.startPending;
        tokeniser2.startPending = startTag12;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertNotNull(startTag12);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilder0.onStack(element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.onStack(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList3);
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.push(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        java.lang.StringBuilder stringBuilder11 = tokeniser10.dataBuffer;
        tokeniser10.createDoctypePending();
        tokeniser10.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        java.lang.StringBuilder stringBuilder17 = tokeniser16.dataBuffer;
        tokeniser10.dataBuffer = stringBuilder17;
        org.jsoup.parser.Token.Doctype doctype19 = tokeniser10.doctypePending;
        java.lang.String str20 = tokeniser10.appropriateEndTagName();
        org.jsoup.parser.Token.Character character21 = null;
        tokeniser10.charPending = character21;
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser10.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(doctype19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(tokeniserState23);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder7.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder7.state();
        htmlTreeBuilder7.newPendingTableCharacters();
        java.lang.String str11 = htmlTreeBuilder7.getBaseUri();
        java.util.List<java.lang.String> strList12 = htmlTreeBuilder7.getPendingTableCharacters();
        htmlTreeBuilder0.setPendingTableCharacters(strList12);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertMarkerToFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNull(elementList4);
        org.junit.Assert.assertNull(htmlTreeBuilderState9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState8);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList10 = htmlTreeBuilder0.getStack();
        boolean boolean11 = htmlTreeBuilder0.framesetOk();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableBodyContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(elementList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilder0.isInActiveFormattingElements(element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(false);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        boolean boolean13 = tokeniser12.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser12.getState();
        org.jsoup.parser.Token.Tag tag16 = tokeniser12.createTagPending(false);
        char[] charArray22 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser12.emit(charArray22);
        org.jsoup.parser.Token.StartTag startTag24 = tokeniser12.startPending;
        org.jsoup.parser.Token.EndTag endTag25 = tokeniser12.endPending;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = htmlTreeBuilder0.process((org.jsoup.parser.Token) endTag25, htmlTreeBuilderState26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(startTag24);
        org.junit.Assert.assertNotNull(endTag25);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        boolean boolean3 = tokeniser2.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser2.getState();
        org.jsoup.parser.Token.Tag tag6 = tokeniser2.createTagPending(false);
        char[] charArray12 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser2.emit(charArray12);
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        java.lang.StringBuilder stringBuilder17 = tokeniser16.dataBuffer;
        tokeniser16.createTempBuffer();
        org.jsoup.parser.Token.Tag tag19 = null;
        tokeniser16.tagPending = tag19;
        tokeniser16.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag23 = tokeniser16.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader24, parseErrorList25);
        int[] intArray28 = new int[] { (byte) 1 };
        tokeniser26.emit(intArray28);
        tokeniser16.emit(intArray28);
        tokeniser2.emit(intArray28);
        boolean boolean32 = tokeniser2.currentNodeInHtmlNS();
        tokeniser2.emit('\ufffd');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token35 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        boolean boolean5 = htmlTreeBuilder0.isFosterInserts();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = htmlTreeBuilder0.inTableScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(elementList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder0.setFormElement(formElement11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = htmlTreeBuilder0.inSelectScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList2 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean5 = htmlTreeBuilder4.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = null;
        htmlTreeBuilder4.transition(htmlTreeBuilderState6);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder4.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList9 = htmlTreeBuilder4.getStack();
        htmlTreeBuilder4.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        htmlTreeBuilder11.setPendingTableCharacters((java.util.List<java.lang.String>) strList14);
        htmlTreeBuilder4.setPendingTableCharacters((java.util.List<java.lang.String>) strList14);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList14);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formElement1);
        org.junit.Assert.assertNull(strList2);
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNull(elementList9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        boolean boolean9 = tokeniser8.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser8.getState();
        java.lang.String str11 = tokeniser8.appropriateEndTagName();
        tokeniser8.emitCommentPending();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList14);
        java.lang.StringBuilder stringBuilder16 = tokeniser15.dataBuffer;
        java.lang.StringBuilder stringBuilder17 = tokeniser15.dataBuffer;
        org.jsoup.parser.Token.StartTag startTag18 = tokeniser15.startPending;
        tokeniser8.startPending = startTag18;
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader20, parseErrorList21);
        tokeniser22.emit("");
        org.jsoup.parser.Token.Tag tag26 = tokeniser22.createTagPending(true);
        org.jsoup.parser.Token.Comment comment27 = tokeniser22.commentPending;
        tokeniser8.commentPending = comment27;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(startTag18);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertNotNull(comment27);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        java.lang.StringBuilder stringBuilder11 = tokeniser10.dataBuffer;
        tokeniser10.createTempBuffer();
        org.jsoup.parser.Token.Tag tag13 = null;
        tokeniser10.tagPending = tag13;
        org.jsoup.parser.TokeniserState tokeniserState15 = null;
        tokeniser10.transition(tokeniserState15);
        org.jsoup.parser.Token.StartTag startTag17 = tokeniser10.startPending;
        org.jsoup.parser.Token.Comment comment18 = null;
        tokeniser10.commentPending = comment18;
        org.jsoup.parser.Token.Tag tag21 = tokeniser10.createTagPending(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = htmlTreeBuilder0.process((org.jsoup.parser.Token) tag21, htmlTreeBuilderState22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertNotNull(tag21);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        java.lang.StringBuilder stringBuilder11 = tokeniser10.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader12 = null;
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.Tokeniser tokeniser14 = new org.jsoup.parser.Tokeniser(characterReader12, parseErrorList13);
        boolean boolean15 = tokeniser14.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState16 = tokeniser14.getState();
        org.jsoup.parser.Token.Tag tag18 = tokeniser14.createTagPending(false);
        char[] charArray24 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser14.emit(charArray24);
        org.jsoup.parser.Token.StartTag startTag26 = tokeniser14.startPending;
        tokeniser10.emit((org.jsoup.parser.Token) startTag26);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = htmlTreeBuilder0.process((org.jsoup.parser.Token) startTag26, htmlTreeBuilderState28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(startTag26);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList3);
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element7 = null;
        htmlTreeBuilder0.setHeadElement(element7);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearFormattingElementsToLastMarker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createDoctypePending();
        tokeniser2.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder9;
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser2.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser2.getState();
        org.jsoup.parser.Token.Doctype doctype13 = tokeniser2.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitCommentPending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(doctype11);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(doctype13);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        org.jsoup.parser.TokeniserState tokeniserState7 = null;
        tokeniser2.transition(tokeniserState7);
        tokeniser2.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        java.lang.StringBuilder stringBuilder13 = tokeniser12.dataBuffer;
        tokeniser12.createDoctypePending();
        tokeniser12.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader16, parseErrorList17);
        java.lang.StringBuilder stringBuilder19 = tokeniser18.dataBuffer;
        tokeniser12.dataBuffer = stringBuilder19;
        org.jsoup.parser.Token.Doctype doctype21 = tokeniser12.doctypePending;
        java.lang.String str22 = tokeniser12.appropriateEndTagName();
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser12.getState();
        tokeniser2.transition(tokeniserState23);
        org.jsoup.parser.Token.Tag tag25 = tokeniser2.tagPending;
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader26, parseErrorList27);
        boolean boolean29 = tokeniser28.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState30 = tokeniser28.getState();
        org.jsoup.parser.Token.Tag tag32 = tokeniser28.createTagPending(false);
        char[] charArray38 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser28.emit(charArray38);
        org.jsoup.parser.Token.StartTag startTag40 = tokeniser28.startPending;
        boolean boolean41 = tokeniser28.isAppropriateEndTagToken();
        org.jsoup.parser.Token.StartTag startTag42 = tokeniser28.startPending;
        tokeniser2.startPending = startTag42;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNotNull(doctype21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(tokeniserState30);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(startTag40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(startTag42);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element4 = htmlTreeBuilder0.insertStartTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader4, parseErrorList5);
        java.lang.StringBuilder stringBuilder7 = tokeniser6.dataBuffer;
        tokeniser6.createTempBuffer();
        org.jsoup.parser.Token.Tag tag9 = null;
        tokeniser6.tagPending = tag9;
        tokeniser6.createTempBuffer();
        org.jsoup.parser.Token.Comment comment12 = tokeniser6.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(comment12);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader5, parseErrorList6);
        java.lang.StringBuilder stringBuilder8 = tokeniser7.dataBuffer;
        tokeniser7.createTempBuffer();
        org.jsoup.parser.Token.Tag tag10 = null;
        tokeniser7.tagPending = tag10;
        tokeniser7.emitCommentPending();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList14);
        java.lang.StringBuilder stringBuilder16 = tokeniser15.dataBuffer;
        tokeniser15.createTempBuffer();
        org.jsoup.parser.Token.Tag tag18 = null;
        tokeniser15.tagPending = tag18;
        tokeniser15.createTempBuffer();
        org.jsoup.parser.Token.Comment comment21 = tokeniser15.commentPending;
        tokeniser7.commentPending = comment21;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertNull(element4);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertNotNull(comment21);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        boolean boolean3 = tokeniser2.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser2.getState();
        org.jsoup.parser.Token.Tag tag6 = tokeniser2.createTagPending(false);
        char[] charArray12 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser2.emit(charArray12);
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        java.lang.StringBuilder stringBuilder17 = tokeniser16.dataBuffer;
        tokeniser16.createTempBuffer();
        org.jsoup.parser.Token.Tag tag19 = null;
        tokeniser16.tagPending = tag19;
        tokeniser16.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag23 = tokeniser16.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader24, parseErrorList25);
        int[] intArray28 = new int[] { (byte) 1 };
        tokeniser26.emit(intArray28);
        tokeniser16.emit(intArray28);
        tokeniser2.emit(intArray28);
        boolean boolean32 = tokeniser2.currentNodeInHtmlNS();
        tokeniser2.createTempBuffer();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceOnStack(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.generateImpliedEndTags();
        boolean boolean7 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element8 = null;
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter(element8, element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(element7);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.Element element13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = htmlTreeBuilder0.isSpecial(element13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder12 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        htmlTreeBuilder12.setPendingTableCharacters((java.util.List<java.lang.String>) strList15);
        htmlTreeBuilder12.newPendingTableCharacters();
        java.util.List<java.lang.String> strList19 = htmlTreeBuilder12.getPendingTableCharacters();
        htmlTreeBuilder0.setPendingTableCharacters(strList19);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element2 = null;
        htmlTreeBuilder0.setHeadElement(element2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList3);
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList9 = new java.util.ArrayList<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList9, strArray8);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList9);
        org.jsoup.nodes.FormElement formElement12 = null;
        htmlTreeBuilder0.setFormElement(formElement12);
        org.jsoup.nodes.Element element14 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.maybeSetBaseUri(element14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        htmlTreeBuilder7.setPendingTableCharacters((java.util.List<java.lang.String>) strList10);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList10);
        boolean boolean14 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement15 = null;
        htmlTreeBuilder0.setFormElement(formElement15);
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader17, parseErrorList18);
        java.lang.StringBuilder stringBuilder20 = tokeniser19.dataBuffer;
        tokeniser19.createTempBuffer();
        org.jsoup.parser.Token.Tag tag22 = null;
        tokeniser19.tagPending = tag22;
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader24, parseErrorList25);
        java.lang.StringBuilder stringBuilder27 = tokeniser26.dataBuffer;
        tokeniser26.createDoctypePending();
        tokeniser26.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader30, parseErrorList31);
        java.lang.StringBuilder stringBuilder33 = tokeniser32.dataBuffer;
        tokeniser26.dataBuffer = stringBuilder33;
        org.jsoup.parser.Token.Doctype doctype35 = tokeniser26.doctypePending;
        tokeniser19.doctypePending = doctype35;
        boolean boolean37 = tokeniser19.isAppropriateEndTagToken();
        tokeniser19.createCommentPending();
        tokeniser19.createCommentPending();
        org.jsoup.parser.Token.Tag tag41 = tokeniser19.createTagPending(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState42 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = htmlTreeBuilder0.process((org.jsoup.parser.Token) tag41, htmlTreeBuilderState42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertNotNull(doctype35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(tag41);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.maybeSetBaseUri(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        org.jsoup.parser.TokeniserState tokeniserState7 = null;
        tokeniser2.transition(tokeniserState7);
        tokeniser2.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        java.lang.StringBuilder stringBuilder13 = tokeniser12.dataBuffer;
        tokeniser12.createDoctypePending();
        tokeniser12.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader16, parseErrorList17);
        java.lang.StringBuilder stringBuilder19 = tokeniser18.dataBuffer;
        tokeniser12.dataBuffer = stringBuilder19;
        org.jsoup.parser.Token.Doctype doctype21 = tokeniser12.doctypePending;
        java.lang.String str22 = tokeniser12.appropriateEndTagName();
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser12.getState();
        tokeniser2.transition(tokeniserState23);
        org.jsoup.parser.Token.Tag tag25 = tokeniser2.tagPending;
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader26, parseErrorList27);
        boolean boolean29 = tokeniser28.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState30 = tokeniser28.getState();
        org.jsoup.parser.Token.Tag tag32 = tokeniser28.createTagPending(false);
        char[] charArray38 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser28.emit(charArray38);
        org.jsoup.parser.Token.StartTag startTag40 = tokeniser28.startPending;
        boolean boolean41 = tokeniser28.isAppropriateEndTagToken();
        org.jsoup.parser.Token.StartTag startTag42 = tokeniser28.startPending;
        tokeniser2.startPending = startTag42;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray46 = tokeniser2.consumeCharacterReference((java.lang.Character) '\ufffd', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNotNull(doctype21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(tokeniserState30);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(startTag40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(startTag42);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.ParseSettings parseSettings3 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(document2);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element13 = htmlTreeBuilder0.insertStartTag("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(false);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.Token.Character character5 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(character5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.List<java.lang.String> strList1 = null;
        htmlTreeBuilder0.setPendingTableCharacters(strList1);
        org.jsoup.nodes.FormElement formElement3 = null;
        htmlTreeBuilder0.setFormElement(formElement3);
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.isInActiveFormattingElements(element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createDoctypePending();
        tokeniser2.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder9;
        tokeniser2.createCommentPending();
        java.lang.Class<?> wildcardClass12 = tokeniser2.getClass();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element2 = null;
        htmlTreeBuilder0.setHeadElement(element2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        boolean boolean13 = tokeniser12.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState14 = tokeniser12.getState();
        org.jsoup.parser.Token.Tag tag16 = tokeniser12.createTagPending(false);
        char[] charArray22 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser12.emit(charArray22);
        org.jsoup.parser.Token.StartTag startTag24 = tokeniser12.startPending;
        tokeniser8.emit((org.jsoup.parser.Token) startTag24);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element26 = htmlTreeBuilder0.insert(startTag24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tokeniserState14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(startTag24);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList2 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.FormElement formElement3 = null;
        htmlTreeBuilder0.setFormElement(formElement3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = htmlTreeBuilder0.inSelectScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formElement1);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createDoctypePending();
        tokeniser2.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder9;
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser2.doctypePending;
        java.lang.String str12 = tokeniser2.appropriateEndTagName();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList14);
        java.lang.StringBuilder stringBuilder16 = tokeniser15.dataBuffer;
        tokeniser15.createDoctypePending();
        tokeniser15.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList20);
        java.lang.StringBuilder stringBuilder22 = tokeniser21.dataBuffer;
        tokeniser15.dataBuffer = stringBuilder22;
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader24, parseErrorList25);
        boolean boolean27 = tokeniser26.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState28 = tokeniser26.getState();
        tokeniser15.transition(tokeniserState28);
        org.jsoup.parser.TokeniserState tokeniserState30 = tokeniser15.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(doctype11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertNotNull(tokeniserState30);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        org.jsoup.parser.TokeniserState tokeniserState7 = null;
        tokeniser2.transition(tokeniserState7);
        tokeniser2.createCommentPending();
        org.jsoup.parser.Token.EndTag endTag10 = tokeniser2.endPending;
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader11, parseErrorList12);
        java.lang.StringBuilder stringBuilder14 = tokeniser13.dataBuffer;
        tokeniser13.createDoctypePending();
        tokeniser13.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader17, parseErrorList18);
        java.lang.StringBuilder stringBuilder20 = tokeniser19.dataBuffer;
        tokeniser13.dataBuffer = stringBuilder20;
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader22, parseErrorList23);
        boolean boolean25 = tokeniser24.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState26 = tokeniser24.getState();
        tokeniser13.transition(tokeniserState26);
        org.jsoup.parser.TokeniserState tokeniserState28 = tokeniser13.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(endTag10);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder20);
        org.junit.Assert.assertEquals(stringBuilder20.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(tokeniserState26);
        org.junit.Assert.assertNotNull(tokeniserState28);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder0.setFormElement(formElement6);
        htmlTreeBuilder0.framesetOk(false);
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = htmlTreeBuilder0.inScope("", strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "hi!", "hi!", "", "", "" });
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.List<java.lang.String> strList1 = null;
        htmlTreeBuilder0.setPendingTableCharacters(strList1);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearFormattingElementsToLastMarker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element7 = htmlTreeBuilder0.insertStartTag("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.FormElement formElement13 = null;
        htmlTreeBuilder0.setFormElement(formElement13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = htmlTreeBuilder0.inSelectScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        boolean boolean5 = htmlTreeBuilder0.isFosterInserts();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.generateImpliedEndTags("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(elementList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag9 = tokeniser2.createTagPending(false);
        tokeniser2.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader11, parseErrorList12);
        java.lang.StringBuilder stringBuilder14 = tokeniser13.dataBuffer;
        tokeniser13.createTempBuffer();
        org.jsoup.parser.Token.Tag tag16 = null;
        tokeniser13.tagPending = tag16;
        tokeniser13.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList20);
        java.lang.StringBuilder stringBuilder22 = tokeniser21.dataBuffer;
        tokeniser21.createTempBuffer();
        org.jsoup.parser.Token.Tag tag24 = null;
        tokeniser21.tagPending = tag24;
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader26, parseErrorList27);
        java.lang.StringBuilder stringBuilder29 = tokeniser28.dataBuffer;
        tokeniser28.createTempBuffer();
        org.jsoup.parser.Token.Tag tag32 = tokeniser28.createTagPending(false);
        tokeniser21.emit((org.jsoup.parser.Token) tag32);
        org.jsoup.parser.Token.StartTag startTag34 = null;
        tokeniser21.startPending = startTag34;
        org.jsoup.parser.TokeniserState tokeniserState36 = tokeniser21.getState();
        tokeniser13.transition(tokeniserState36);
        org.jsoup.parser.TokeniserState tokeniserState38 = tokeniser13.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder29);
        org.junit.Assert.assertEquals(stringBuilder29.toString(), "");
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(tokeniserState36);
        org.junit.Assert.assertNotNull(tokeniserState38);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.maybeSetBaseUri(element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNotNull(parseSettings6);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        boolean boolean3 = tokeniser2.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser2.getState();
        org.jsoup.parser.Token.Tag tag6 = tokeniser2.createTagPending(false);
        char[] charArray12 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser2.emit(charArray12);
        org.jsoup.parser.Token.StartTag startTag14 = tokeniser2.startPending;
        boolean boolean15 = tokeniser2.isAppropriateEndTagToken();
        org.jsoup.parser.Token.Tag tag17 = tokeniser2.createTagPending(false);
        org.jsoup.parser.Token.Tag tag18 = tokeniser2.tagPending;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = tokeniser2.consumeCharacterReference((java.lang.Character) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(tag18);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        boolean boolean3 = tokeniser2.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser2.getState();
        java.lang.String str5 = tokeniser2.appropriateEndTagName();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder9;
        tokeniser2.emit('#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.removeFromStack(element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createDoctypePending();
        tokeniser2.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder9;
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser2.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser2.getState();
        org.jsoup.parser.Token.Doctype doctype13 = tokeniser2.doctypePending;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        boolean boolean17 = tokeniser16.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser16.getState();
        org.jsoup.parser.Token.Tag tag20 = tokeniser16.createTagPending(false);
        char[] charArray26 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser16.emit(charArray26);
        tokeniser2.emit(charArray26);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(doctype11);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(doctype13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        org.jsoup.nodes.Element element8 = null;
        htmlTreeBuilder0.setHeadElement(element8);
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader11, parseErrorList12);
        java.lang.StringBuilder stringBuilder14 = tokeniser13.dataBuffer;
        tokeniser13.createTempBuffer();
        org.jsoup.parser.Token.Tag tag17 = tokeniser13.createTagPending(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = htmlTreeBuilder0.process((org.jsoup.parser.Token) tag17, htmlTreeBuilderState18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(elementList4);
        org.junit.Assert.assertNull(formElement7);
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertNotNull(tag17);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        tokeniser2.emitCommentPending();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        java.lang.StringBuilder stringBuilder11 = tokeniser10.dataBuffer;
        tokeniser10.createTempBuffer();
        org.jsoup.parser.Token.Tag tag13 = null;
        tokeniser10.tagPending = tag13;
        org.jsoup.parser.TokeniserState tokeniserState15 = null;
        tokeniser10.transition(tokeniserState15);
        tokeniser10.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader18, parseErrorList19);
        java.lang.StringBuilder stringBuilder21 = tokeniser20.dataBuffer;
        tokeniser20.createDoctypePending();
        tokeniser20.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader24, parseErrorList25);
        java.lang.StringBuilder stringBuilder27 = tokeniser26.dataBuffer;
        tokeniser20.dataBuffer = stringBuilder27;
        org.jsoup.parser.Token.Doctype doctype29 = tokeniser20.doctypePending;
        java.lang.String str30 = tokeniser20.appropriateEndTagName();
        org.jsoup.parser.TokeniserState tokeniserState31 = tokeniser20.getState();
        tokeniser10.transition(tokeniserState31);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertNotNull(doctype29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(tokeniserState31);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder7.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder7.state();
        htmlTreeBuilder7.newPendingTableCharacters();
        java.lang.String str11 = htmlTreeBuilder7.getBaseUri();
        java.util.List<java.lang.String> strList12 = htmlTreeBuilder7.getPendingTableCharacters();
        htmlTreeBuilder0.setPendingTableCharacters(strList12);
        htmlTreeBuilder0.framesetOk(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = htmlTreeBuilder0.inScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNull(elementList4);
        org.junit.Assert.assertNull(htmlTreeBuilderState9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        org.jsoup.nodes.FormElement formElement6 = null;
        htmlTreeBuilder0.setFormElement(formElement6);
        htmlTreeBuilder0.framesetOk(false);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertMarkerToFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag9 = tokeniser2.createTagPending(false);
        tokeniser2.emit("hi!");
        tokeniser2.emit("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token14 = tokeniser2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(tag9);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createDoctypePending();
        tokeniser2.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder9;
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader11, parseErrorList12);
        boolean boolean14 = tokeniser13.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState15 = tokeniser13.getState();
        tokeniser2.transition(tokeniserState15);
        org.jsoup.parser.Token token17 = tokeniser2.read();
        int[] intArray18 = new int[] {};
        tokeniser2.emit(intArray18);
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader20, parseErrorList21);
        boolean boolean23 = tokeniser22.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState24 = tokeniser22.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(tokeniserState15);
        org.junit.Assert.assertNotNull(token17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(tokeniserState24);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder0.state();
        java.io.Reader reader9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder12 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder12.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = htmlTreeBuilder12.state();
        org.jsoup.parser.ParseSettings parseSettings15 = htmlTreeBuilder12.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader9, "hi!", parseErrorList11, parseSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNull(htmlTreeBuilderState14);
        org.junit.Assert.assertNotNull(parseSettings15);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        htmlTreeBuilder7.setPendingTableCharacters((java.util.List<java.lang.String>) strList10);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList10);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Element element16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = htmlTreeBuilder0.isInActiveFormattingElements(element16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState15);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.generateImpliedEndTags();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState1 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = htmlTreeBuilder0.inListItemScope("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createDoctypePending();
        tokeniser2.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder9;
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser2.doctypePending;
        java.lang.String str12 = tokeniser2.appropriateEndTagName();
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser2.getState();
        org.jsoup.parser.Token.Doctype doctype14 = tokeniser2.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(doctype11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(doctype14);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.FormElement formElement13 = null;
        htmlTreeBuilder0.setFormElement(formElement13);
        boolean boolean15 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element16 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(element16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        tokeniser8.createTempBuffer();
        org.jsoup.parser.Token.Tag tag11 = null;
        tokeniser8.tagPending = tag11;
        org.jsoup.parser.TokeniserState tokeniserState13 = null;
        tokeniser8.transition(tokeniserState13);
        org.jsoup.parser.Token.StartTag startTag15 = tokeniser8.startPending;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element16 = htmlTreeBuilder0.insertEmpty(startTag15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(startTag15);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        boolean boolean3 = tokeniser2.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser2.getState();
        org.jsoup.parser.Token.Tag tag6 = tokeniser2.createTagPending(false);
        char[] charArray12 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser2.emit(charArray12);
        org.jsoup.parser.Token.StartTag startTag14 = tokeniser2.startPending;
        boolean boolean15 = tokeniser2.isAppropriateEndTagToken();
        org.jsoup.parser.Token.Tag tag17 = tokeniser2.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader18, parseErrorList19);
        boolean boolean21 = tokeniser20.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState22 = tokeniser20.getState();
        org.jsoup.parser.Token.Tag tag24 = tokeniser20.createTagPending(false);
        char[] charArray30 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser20.emit(charArray30);
        java.lang.StringBuilder stringBuilder32 = null;
        tokeniser20.dataBuffer = stringBuilder32;
        org.jsoup.parser.CharacterReader characterReader34 = null;
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.Tokeniser tokeniser36 = new org.jsoup.parser.Tokeniser(characterReader34, parseErrorList35);
        java.lang.StringBuilder stringBuilder37 = tokeniser36.dataBuffer;
        tokeniser36.createTempBuffer();
        org.jsoup.parser.Token.Tag tag39 = null;
        tokeniser36.tagPending = tag39;
        org.jsoup.parser.TokeniserState tokeniserState41 = null;
        tokeniser36.transition(tokeniserState41);
        tokeniser36.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader44 = null;
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        org.jsoup.parser.Tokeniser tokeniser46 = new org.jsoup.parser.Tokeniser(characterReader44, parseErrorList45);
        java.lang.StringBuilder stringBuilder47 = tokeniser46.dataBuffer;
        tokeniser46.createDoctypePending();
        tokeniser46.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader50 = null;
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader50, parseErrorList51);
        java.lang.StringBuilder stringBuilder53 = tokeniser52.dataBuffer;
        tokeniser46.dataBuffer = stringBuilder53;
        org.jsoup.parser.Token.Doctype doctype55 = tokeniser46.doctypePending;
        java.lang.String str56 = tokeniser46.appropriateEndTagName();
        org.jsoup.parser.TokeniserState tokeniserState57 = tokeniser46.getState();
        tokeniser36.transition(tokeniserState57);
        tokeniser20.transition(tokeniserState57);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(startTag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(tokeniserState22);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder53);
        org.junit.Assert.assertEquals(stringBuilder53.toString(), "");
        org.junit.Assert.assertNotNull(doctype55);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(tokeniserState57);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        java.lang.String str11 = htmlTreeBuilder0.getBaseUri();
        boolean boolean12 = htmlTreeBuilder0.isFragmentParsing();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements(element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.FormElement formElement9 = htmlTreeBuilder0.getFormElement();
        java.lang.String[] strArray10 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = htmlTreeBuilder0.inScope(strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(formElement9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createDoctypePending();
        tokeniser2.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder9;
        org.jsoup.parser.Token.Doctype doctype11 = tokeniser2.doctypePending;
        java.lang.String str12 = tokeniser2.appropriateEndTagName();
        org.jsoup.parser.TokeniserState tokeniserState13 = tokeniser2.getState();
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        java.lang.StringBuilder stringBuilder17 = tokeniser16.dataBuffer;
        tokeniser16.createTempBuffer();
        org.jsoup.parser.Token.Tag tag19 = null;
        tokeniser16.tagPending = tag19;
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader21, parseErrorList22);
        java.lang.StringBuilder stringBuilder24 = tokeniser23.dataBuffer;
        tokeniser23.createTempBuffer();
        org.jsoup.parser.Token.Tag tag27 = tokeniser23.createTagPending(false);
        tokeniser16.emit((org.jsoup.parser.Token) tag27);
        tokeniser2.tagPending = tag27;
        java.lang.Class<?> wildcardClass30 = tag27.getClass();
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(doctype11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(tokeniserState13);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag9 = tokeniser2.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        int[] intArray14 = new int[] { (byte) 1 };
        tokeniser12.emit(intArray14);
        tokeniser2.emit(intArray14);
        boolean boolean17 = tokeniser2.isAppropriateEndTagToken();
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader18, parseErrorList19);
        java.lang.StringBuilder stringBuilder21 = tokeniser20.dataBuffer;
        tokeniser20.createDoctypePending();
        tokeniser20.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader24, parseErrorList25);
        java.lang.StringBuilder stringBuilder27 = tokeniser26.dataBuffer;
        tokeniser20.dataBuffer = stringBuilder27;
        org.jsoup.parser.Token.Doctype doctype29 = tokeniser20.doctypePending;
        java.lang.String str30 = tokeniser20.appropriateEndTagName();
        org.jsoup.parser.TokeniserState tokeniserState31 = tokeniser20.getState();
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader32, parseErrorList33);
        java.lang.StringBuilder stringBuilder35 = tokeniser34.dataBuffer;
        tokeniser34.createTempBuffer();
        org.jsoup.parser.Token.Tag tag37 = null;
        tokeniser34.tagPending = tag37;
        org.jsoup.parser.CharacterReader characterReader39 = null;
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader39, parseErrorList40);
        java.lang.StringBuilder stringBuilder42 = tokeniser41.dataBuffer;
        tokeniser41.createTempBuffer();
        org.jsoup.parser.Token.Tag tag45 = tokeniser41.createTagPending(false);
        tokeniser34.emit((org.jsoup.parser.Token) tag45);
        tokeniser20.tagPending = tag45;
        tokeniser2.tagPending = tag45;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder27);
        org.junit.Assert.assertEquals(stringBuilder27.toString(), "");
        org.junit.Assert.assertNotNull(doctype29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(tokeniserState31);
        org.junit.Assert.assertNotNull(stringBuilder35);
        org.junit.Assert.assertEquals(stringBuilder35.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder42);
        org.junit.Assert.assertEquals(stringBuilder42.toString(), "");
        org.junit.Assert.assertNotNull(tag45);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.nodes.Element element7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder10.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder10.state();
        org.jsoup.parser.ParseSettings parseSettings13 = htmlTreeBuilder10.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = htmlTreeBuilder0.parseFragment("", element7, "", parseErrorList9, parseSettings13);
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader15, parseErrorList16);
        java.lang.StringBuilder stringBuilder18 = tokeniser17.dataBuffer;
        java.lang.StringBuilder stringBuilder19 = tokeniser17.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader20, parseErrorList21);
        java.lang.StringBuilder stringBuilder23 = tokeniser22.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader24, parseErrorList25);
        boolean boolean27 = tokeniser26.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState28 = tokeniser26.getState();
        org.jsoup.parser.Token.Tag tag30 = tokeniser26.createTagPending(false);
        char[] charArray36 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser26.emit(charArray36);
        org.jsoup.parser.Token.StartTag startTag38 = tokeniser26.startPending;
        tokeniser22.emit((org.jsoup.parser.Token) startTag38);
        tokeniser17.startPending = startTag38;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement42 = htmlTreeBuilder0.insertForm(startTag38, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(startTag38);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList3 = new java.util.ArrayList<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList3, strArray2);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList3);
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements(element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState3);
        htmlTreeBuilder0.setFosterInserts(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.inScope("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        org.jsoup.nodes.FormElement formElement11 = null;
        htmlTreeBuilder0.setFormElement(formElement11);
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        org.jsoup.parser.TokeniserState tokeniserState7 = null;
        tokeniser2.transition(tokeniserState7);
        tokeniser2.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        java.lang.StringBuilder stringBuilder13 = tokeniser12.dataBuffer;
        tokeniser12.createDoctypePending();
        tokeniser12.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.Tokeniser tokeniser18 = new org.jsoup.parser.Tokeniser(characterReader16, parseErrorList17);
        java.lang.StringBuilder stringBuilder19 = tokeniser18.dataBuffer;
        tokeniser12.dataBuffer = stringBuilder19;
        org.jsoup.parser.Token.Doctype doctype21 = tokeniser12.doctypePending;
        java.lang.String str22 = tokeniser12.appropriateEndTagName();
        org.jsoup.parser.TokeniserState tokeniserState23 = tokeniser12.getState();
        tokeniser2.transition(tokeniserState23);
        org.jsoup.parser.Token.Tag tag25 = tokeniser2.tagPending;
        org.jsoup.parser.CharacterReader characterReader26 = null;
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader26, parseErrorList27);
        boolean boolean29 = tokeniser28.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState30 = tokeniser28.getState();
        org.jsoup.parser.Token.Tag tag32 = tokeniser28.createTagPending(false);
        char[] charArray38 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser28.emit(charArray38);
        org.jsoup.parser.Token.StartTag startTag40 = tokeniser28.startPending;
        boolean boolean41 = tokeniser28.isAppropriateEndTagToken();
        org.jsoup.parser.Token.StartTag startTag42 = tokeniser28.startPending;
        tokeniser2.startPending = startTag42;
        tokeniser2.emitCommentPending();
        org.jsoup.parser.CharacterReader characterReader45 = null;
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.Tokeniser tokeniser47 = new org.jsoup.parser.Tokeniser(characterReader45, parseErrorList46);
        boolean boolean48 = tokeniser47.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState49 = tokeniser47.getState();
        org.jsoup.parser.Token.Tag tag51 = tokeniser47.createTagPending(false);
        char[] charArray57 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser47.emit(charArray57);
        org.jsoup.parser.Token.StartTag startTag59 = tokeniser47.startPending;
        org.jsoup.parser.Token.EndTag endTag60 = tokeniser47.endPending;
        tokeniser2.endPending = endTag60;
        org.jsoup.parser.CharacterReader characterReader62 = null;
        org.jsoup.parser.ParseErrorList parseErrorList63 = null;
        org.jsoup.parser.Tokeniser tokeniser64 = new org.jsoup.parser.Tokeniser(characterReader62, parseErrorList63);
        java.lang.StringBuilder stringBuilder65 = tokeniser64.dataBuffer;
        tokeniser64.createDoctypePending();
        tokeniser64.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader68 = null;
        org.jsoup.parser.ParseErrorList parseErrorList69 = null;
        org.jsoup.parser.Tokeniser tokeniser70 = new org.jsoup.parser.Tokeniser(characterReader68, parseErrorList69);
        java.lang.StringBuilder stringBuilder71 = tokeniser70.dataBuffer;
        tokeniser64.dataBuffer = stringBuilder71;
        org.jsoup.parser.Token.Doctype doctype73 = tokeniser64.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState74 = tokeniser64.getState();
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder19);
        org.junit.Assert.assertEquals(stringBuilder19.toString(), "");
        org.junit.Assert.assertNotNull(doctype21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(tokeniserState23);
        org.junit.Assert.assertNull(tag25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(tokeniserState30);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(startTag40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(startTag42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(tokeniserState49);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertArrayEquals(charArray57, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(startTag59);
        org.junit.Assert.assertNotNull(endTag60);
        org.junit.Assert.assertNotNull(stringBuilder65);
        org.junit.Assert.assertEquals(stringBuilder65.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder71);
        org.junit.Assert.assertEquals(stringBuilder71.toString(), "");
        org.junit.Assert.assertNotNull(doctype73);
        org.junit.Assert.assertNotNull(tokeniserState74);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.FormElement formElement3 = null;
        htmlTreeBuilder0.setFormElement(formElement3);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        java.lang.StringBuilder stringBuilder9 = tokeniser8.dataBuffer;
        tokeniser8.createTempBuffer();
        org.jsoup.parser.Token.Tag tag11 = null;
        tokeniser8.tagPending = tag11;
        tokeniser8.createTempBuffer();
        org.jsoup.parser.Token.Comment comment14 = tokeniser8.commentPending;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(comment14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNotNull(stringBuilder9);
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
        org.junit.Assert.assertNotNull(comment14);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.nodes.FormElement formElement13 = null;
        htmlTreeBuilder0.setFormElement(formElement13);
        boolean boolean15 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        boolean boolean5 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertOnStackAfter(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(elementList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState8);
        htmlTreeBuilder0.setFosterInserts(false);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.FormElement formElement9 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList10 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.Element element11 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements(element11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(formElement9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray10 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = htmlTreeBuilder0.inScope("hi!", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState8);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "hi!", "", "" };
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!", "hi!", "", "" });
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        boolean boolean11 = tokeniser10.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState12 = tokeniser10.getState();
        org.jsoup.parser.Token.Tag tag14 = tokeniser10.createTagPending(false);
        char[] charArray20 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser10.emit(charArray20);
        org.jsoup.parser.Token.StartTag startTag22 = tokeniser10.startPending;
        boolean boolean23 = tokeniser10.isAppropriateEndTagToken();
        org.jsoup.parser.Token.StartTag startTag24 = tokeniser10.startPending;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement26 = htmlTreeBuilder0.insertForm(startTag24, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tokeniserState12);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(startTag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(startTag24);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        java.util.List<java.lang.String> strList6 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(true);
        java.util.List<java.lang.String> strList9 = htmlTreeBuilder0.getPendingTableCharacters();
        java.util.List<java.lang.String> strList10 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.Element element11 = null;
        org.jsoup.nodes.Element element12 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceOnStack(element11, element12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strList6);
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertNull(strList10);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState7);
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList10 = null;
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader9, parseErrorList10);
        boolean boolean12 = tokeniser11.isAppropriateEndTagToken();
        tokeniser11.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        boolean boolean17 = tokeniser16.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser16.getState();
        org.jsoup.parser.Token.Tag tag20 = tokeniser16.createTagPending(false);
        char[] charArray26 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser16.emit(charArray26);
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.Tokeniser tokeniser30 = new org.jsoup.parser.Tokeniser(characterReader28, parseErrorList29);
        java.lang.StringBuilder stringBuilder31 = tokeniser30.dataBuffer;
        tokeniser30.createTempBuffer();
        org.jsoup.parser.Token.Tag tag33 = null;
        tokeniser30.tagPending = tag33;
        tokeniser30.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag37 = tokeniser30.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.Tokeniser tokeniser40 = new org.jsoup.parser.Tokeniser(characterReader38, parseErrorList39);
        int[] intArray42 = new int[] { (byte) 1 };
        tokeniser40.emit(intArray42);
        tokeniser30.emit(intArray42);
        tokeniser16.emit(intArray42);
        tokeniser16.createDoctypePending();
        org.jsoup.parser.Token.Character character47 = tokeniser16.charPending;
        tokeniser11.charPending = character47;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState49 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = htmlTreeBuilder0.process((org.jsoup.parser.Token) character47, htmlTreeBuilderState49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(stringBuilder31);
        org.junit.Assert.assertEquals(stringBuilder31.toString(), "");
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 1 });
        org.junit.Assert.assertNotNull(character47);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = htmlTreeBuilder0.isSpecial(element9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader4, parseErrorList5);
        boolean boolean7 = tokeniser6.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState8 = tokeniser6.getState();
        org.jsoup.parser.Token.Tag tag10 = tokeniser6.createTagPending(false);
        char[] charArray16 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser6.emit(charArray16);
        org.jsoup.parser.Token.StartTag startTag18 = tokeniser6.startPending;
        tokeniser2.emit((org.jsoup.parser.Token) startTag18);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tokeniserState8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(startTag18);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(false);
        htmlTreeBuilder0.generateImpliedEndTags();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertMarkerToFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList7 = htmlTreeBuilder0.getStack();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableRowContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNull(elementList7);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList8);
        java.lang.String str11 = htmlTreeBuilder0.getBaseUri();
        boolean boolean12 = htmlTreeBuilder0.isFragmentParsing();
        java.lang.String str13 = htmlTreeBuilder0.getBaseUri();
        java.lang.Class<?> wildcardClass14 = htmlTreeBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        java.lang.StringBuilder stringBuilder4 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        tokeniser2.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        java.lang.StringBuilder stringBuilder10 = tokeniser9.dataBuffer;
        java.lang.StringBuilder stringBuilder11 = tokeniser9.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder11;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState8);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState10);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = htmlTreeBuilder0.inScope(strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document4 = htmlTreeBuilder0.getDocument();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder7.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder7.state();
        htmlTreeBuilder7.generateImpliedEndTags();
        htmlTreeBuilder7.markInsertionMode();
        htmlTreeBuilder7.generateImpliedEndTags();
        java.util.List<java.lang.String> strList13 = htmlTreeBuilder7.getPendingTableCharacters();
        htmlTreeBuilder0.setPendingTableCharacters(strList13);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(htmlTreeBuilderState9);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        java.util.List<java.lang.String> strList1 = null;
        htmlTreeBuilder0.setPendingTableCharacters(strList1);
        org.jsoup.nodes.FormElement formElement3 = null;
        htmlTreeBuilder0.setFormElement(formElement3);
        org.jsoup.nodes.Element element5 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements(element5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList2 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.FormElement formElement3 = null;
        htmlTreeBuilder0.setFormElement(formElement3);
        org.jsoup.nodes.Element element5 = null;
        org.jsoup.nodes.Element element6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement(element5, element6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formElement1);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader5, parseErrorList6);
        java.lang.StringBuilder stringBuilder8 = tokeniser7.dataBuffer;
        tokeniser7.createTempBuffer();
        org.jsoup.parser.Token.Tag tag10 = null;
        tokeniser7.tagPending = tag10;
        org.jsoup.parser.TokeniserState tokeniserState12 = null;
        tokeniser7.transition(tokeniserState12);
        tokeniser7.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader15, parseErrorList16);
        java.lang.StringBuilder stringBuilder18 = tokeniser17.dataBuffer;
        tokeniser17.createDoctypePending();
        tokeniser17.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader21, parseErrorList22);
        java.lang.StringBuilder stringBuilder24 = tokeniser23.dataBuffer;
        tokeniser17.dataBuffer = stringBuilder24;
        org.jsoup.parser.Token.Doctype doctype26 = tokeniser17.doctypePending;
        java.lang.String str27 = tokeniser17.appropriateEndTagName();
        org.jsoup.parser.TokeniserState tokeniserState28 = tokeniser17.getState();
        tokeniser7.transition(tokeniserState28);
        org.jsoup.parser.Token.Tag tag30 = tokeniser7.tagPending;
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader31, parseErrorList32);
        boolean boolean34 = tokeniser33.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState35 = tokeniser33.getState();
        org.jsoup.parser.Token.Tag tag37 = tokeniser33.createTagPending(false);
        char[] charArray43 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser33.emit(charArray43);
        org.jsoup.parser.Token.StartTag startTag45 = tokeniser33.startPending;
        boolean boolean46 = tokeniser33.isAppropriateEndTagToken();
        org.jsoup.parser.Token.StartTag startTag47 = tokeniser33.startPending;
        tokeniser7.startPending = startTag47;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = htmlTreeBuilder0.process((org.jsoup.parser.Token) startTag47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(stringBuilder8);
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertNotNull(doctype26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(tokeniserState28);
        org.junit.Assert.assertNull(tag30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(startTag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(startTag47);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        java.lang.StringBuilder stringBuilder10 = tokeniser9.dataBuffer;
        tokeniser9.createTempBuffer();
        org.jsoup.parser.Token.Tag tag13 = tokeniser9.createTagPending(false);
        tokeniser2.emit((org.jsoup.parser.Token) tag13);
        org.jsoup.parser.Token.StartTag startTag15 = null;
        tokeniser2.startPending = startTag15;
        java.lang.StringBuilder stringBuilder17 = tokeniser2.dataBuffer;
        org.jsoup.parser.CharacterReader characterReader18 = null;
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.Tokeniser tokeniser20 = new org.jsoup.parser.Tokeniser(characterReader18, parseErrorList19);
        java.lang.StringBuilder stringBuilder21 = tokeniser20.dataBuffer;
        tokeniser20.createTempBuffer();
        org.jsoup.parser.Token.Tag tag23 = null;
        tokeniser20.tagPending = tag23;
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader25, parseErrorList26);
        java.lang.StringBuilder stringBuilder28 = tokeniser27.dataBuffer;
        tokeniser27.createTempBuffer();
        org.jsoup.parser.Token.Tag tag30 = null;
        tokeniser27.tagPending = tag30;
        tokeniser27.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag34 = tokeniser27.createTagPending(false);
        tokeniser27.emit("hi!");
        org.jsoup.parser.CharacterReader characterReader37 = null;
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.Tokeniser tokeniser39 = new org.jsoup.parser.Tokeniser(characterReader37, parseErrorList38);
        java.lang.StringBuilder stringBuilder40 = tokeniser39.dataBuffer;
        tokeniser39.createTempBuffer();
        org.jsoup.parser.Token.Tag tag42 = null;
        tokeniser39.tagPending = tag42;
        org.jsoup.parser.CharacterReader characterReader44 = null;
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        org.jsoup.parser.Tokeniser tokeniser46 = new org.jsoup.parser.Tokeniser(characterReader44, parseErrorList45);
        java.lang.StringBuilder stringBuilder47 = tokeniser46.dataBuffer;
        tokeniser46.createDoctypePending();
        tokeniser46.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader50 = null;
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader50, parseErrorList51);
        java.lang.StringBuilder stringBuilder53 = tokeniser52.dataBuffer;
        tokeniser46.dataBuffer = stringBuilder53;
        org.jsoup.parser.Token.Doctype doctype55 = tokeniser46.doctypePending;
        tokeniser39.doctypePending = doctype55;
        tokeniser27.doctypePending = doctype55;
        tokeniser20.doctypePending = doctype55;
        tokeniser2.doctypePending = doctype55;
        org.jsoup.parser.CharacterReader characterReader60 = null;
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.Tokeniser tokeniser62 = new org.jsoup.parser.Tokeniser(characterReader60, parseErrorList61);
        java.lang.StringBuilder stringBuilder63 = tokeniser62.dataBuffer;
        tokeniser2.dataBuffer = stringBuilder63;
        org.jsoup.parser.CharacterReader characterReader65 = null;
        org.jsoup.parser.ParseErrorList parseErrorList66 = null;
        org.jsoup.parser.Tokeniser tokeniser67 = new org.jsoup.parser.Tokeniser(characterReader65, parseErrorList66);
        boolean boolean68 = tokeniser67.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState69 = tokeniser67.getState();
        org.jsoup.parser.Token.Tag tag71 = tokeniser67.createTagPending(false);
        char[] charArray77 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser67.emit(charArray77);
        org.jsoup.parser.Token.StartTag startTag79 = tokeniser67.startPending;
        org.jsoup.parser.CharacterReader characterReader80 = null;
        org.jsoup.parser.ParseErrorList parseErrorList81 = null;
        org.jsoup.parser.Tokeniser tokeniser82 = new org.jsoup.parser.Tokeniser(characterReader80, parseErrorList81);
        java.lang.StringBuilder stringBuilder83 = tokeniser82.dataBuffer;
        java.lang.StringBuilder stringBuilder84 = tokeniser82.dataBuffer;
        org.jsoup.parser.Token.StartTag startTag85 = null;
        tokeniser82.startPending = startTag85;
        org.jsoup.parser.Token.Character character87 = tokeniser82.charPending;
        tokeniser67.charPending = character87;
        tokeniser2.charPending = character87;
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder21);
        org.junit.Assert.assertEquals(stringBuilder21.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertNotNull(stringBuilder40);
        org.junit.Assert.assertEquals(stringBuilder40.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder47);
        org.junit.Assert.assertEquals(stringBuilder47.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder53);
        org.junit.Assert.assertEquals(stringBuilder53.toString(), "");
        org.junit.Assert.assertNotNull(doctype55);
        org.junit.Assert.assertNotNull(stringBuilder63);
        org.junit.Assert.assertEquals(stringBuilder63.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(tokeniserState69);
        org.junit.Assert.assertNotNull(tag71);
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertArrayEquals(charArray77, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(startTag79);
        org.junit.Assert.assertNotNull(stringBuilder83);
        org.junit.Assert.assertEquals(stringBuilder83.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder84);
        org.junit.Assert.assertEquals(stringBuilder84.toString(), "");
        org.junit.Assert.assertNotNull(character87);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        boolean boolean3 = tokeniser2.isAppropriateEndTagToken();
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader4, parseErrorList5);
        java.lang.StringBuilder stringBuilder7 = tokeniser6.dataBuffer;
        tokeniser6.createDoctypePending();
        tokeniser6.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader10 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader10, parseErrorList11);
        java.lang.StringBuilder stringBuilder13 = tokeniser12.dataBuffer;
        tokeniser6.dataBuffer = stringBuilder13;
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader15, parseErrorList16);
        boolean boolean18 = tokeniser17.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState19 = tokeniser17.getState();
        tokeniser6.transition(tokeniserState19);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tokeniserState19);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        boolean boolean3 = tokeniser2.isAppropriateEndTagToken();
        tokeniser2.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.ParseErrorList parseErrorList6 = null;
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader5, parseErrorList6);
        boolean boolean8 = tokeniser7.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState9 = tokeniser7.getState();
        org.jsoup.parser.Token.Tag tag11 = tokeniser7.createTagPending(false);
        char[] charArray17 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser7.emit(charArray17);
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.Tokeniser tokeniser21 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList20);
        java.lang.StringBuilder stringBuilder22 = tokeniser21.dataBuffer;
        tokeniser21.createDoctypePending();
        tokeniser21.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader25 = null;
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.Tokeniser tokeniser27 = new org.jsoup.parser.Tokeniser(characterReader25, parseErrorList26);
        java.lang.StringBuilder stringBuilder28 = tokeniser27.dataBuffer;
        tokeniser21.dataBuffer = stringBuilder28;
        org.jsoup.parser.Token.Doctype doctype30 = tokeniser21.doctypePending;
        tokeniser7.doctypePending = doctype30;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emit((org.jsoup.parser.Token) doctype30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(stringBuilder22);
        org.junit.Assert.assertEquals(stringBuilder22.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder28);
        org.junit.Assert.assertEquals(stringBuilder28.toString(), "");
        org.junit.Assert.assertNotNull(doctype30);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Element element9 = null;
        org.jsoup.nodes.Element element10 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement(element9, element10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.Tokeniser tokeniser9 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList8);
        java.lang.StringBuilder stringBuilder10 = tokeniser9.dataBuffer;
        tokeniser9.createDoctypePending();
        tokeniser9.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList14);
        java.lang.StringBuilder stringBuilder16 = tokeniser15.dataBuffer;
        tokeniser9.dataBuffer = stringBuilder16;
        org.jsoup.parser.Token.Doctype doctype18 = tokeniser9.doctypePending;
        tokeniser2.doctypePending = doctype18;
        boolean boolean20 = tokeniser2.isAppropriateEndTagToken();
        tokeniser2.createCommentPending();
        tokeniser2.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader23, parseErrorList24);
        java.lang.StringBuilder stringBuilder26 = tokeniser25.dataBuffer;
        tokeniser25.createTempBuffer();
        org.jsoup.parser.Token.Tag tag28 = null;
        tokeniser25.tagPending = tag28;
        tokeniser25.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader31, parseErrorList32);
        java.lang.StringBuilder stringBuilder34 = tokeniser33.dataBuffer;
        tokeniser33.createTempBuffer();
        org.jsoup.parser.Token.Tag tag36 = null;
        tokeniser33.tagPending = tag36;
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.Tokeniser tokeniser40 = new org.jsoup.parser.Tokeniser(characterReader38, parseErrorList39);
        java.lang.StringBuilder stringBuilder41 = tokeniser40.dataBuffer;
        tokeniser40.createTempBuffer();
        org.jsoup.parser.Token.Tag tag44 = tokeniser40.createTagPending(false);
        tokeniser33.emit((org.jsoup.parser.Token) tag44);
        org.jsoup.parser.Token.StartTag startTag46 = null;
        tokeniser33.startPending = startTag46;
        org.jsoup.parser.TokeniserState tokeniserState48 = tokeniser33.getState();
        tokeniser25.transition(tokeniserState48);
        org.jsoup.parser.CharacterReader characterReader50 = null;
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.Tokeniser tokeniser52 = new org.jsoup.parser.Tokeniser(characterReader50, parseErrorList51);
        boolean boolean53 = tokeniser52.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState54 = tokeniser52.getState();
        org.jsoup.parser.Token.Tag tag56 = tokeniser52.createTagPending(false);
        char[] charArray62 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser52.emit(charArray62);
        org.jsoup.parser.Token.StartTag startTag64 = tokeniser52.startPending;
        org.jsoup.parser.TokeniserState tokeniserState65 = tokeniser52.getState();
        tokeniser25.transition(tokeniserState65);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.eofError(tokeniserState65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder16);
        org.junit.Assert.assertEquals(stringBuilder16.toString(), "");
        org.junit.Assert.assertNotNull(doctype18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder41);
        org.junit.Assert.assertEquals(stringBuilder41.toString(), "");
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertNotNull(tokeniserState48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(tokeniserState54);
        org.junit.Assert.assertNotNull(tag56);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(startTag64);
        org.junit.Assert.assertNotNull(tokeniserState65);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements(element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.CharacterReader characterReader4 = null;
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader4, parseErrorList5);
        java.lang.StringBuilder stringBuilder7 = tokeniser6.dataBuffer;
        tokeniser6.createTempBuffer();
        org.jsoup.parser.Token.Tag tag9 = null;
        tokeniser6.tagPending = tag9;
        org.jsoup.parser.TokeniserState tokeniserState11 = null;
        tokeniser6.transition(tokeniserState11);
        tokeniser6.createCommentPending();
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        java.lang.StringBuilder stringBuilder17 = tokeniser16.dataBuffer;
        tokeniser16.createDoctypePending();
        tokeniser16.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader20, parseErrorList21);
        java.lang.StringBuilder stringBuilder23 = tokeniser22.dataBuffer;
        tokeniser16.dataBuffer = stringBuilder23;
        org.jsoup.parser.Token.Doctype doctype25 = tokeniser16.doctypePending;
        java.lang.String str26 = tokeniser16.appropriateEndTagName();
        org.jsoup.parser.TokeniserState tokeniserState27 = tokeniser16.getState();
        tokeniser6.transition(tokeniserState27);
        org.jsoup.parser.Token.Tag tag29 = tokeniser6.tagPending;
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader30, parseErrorList31);
        boolean boolean33 = tokeniser32.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState34 = tokeniser32.getState();
        org.jsoup.parser.Token.Tag tag36 = tokeniser32.createTagPending(false);
        char[] charArray42 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser32.emit(charArray42);
        org.jsoup.parser.Token.StartTag startTag44 = tokeniser32.startPending;
        boolean boolean45 = tokeniser32.isAppropriateEndTagToken();
        org.jsoup.parser.Token.StartTag startTag46 = tokeniser32.startPending;
        tokeniser6.startPending = startTag46;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.FormElement formElement49 = htmlTreeBuilder0.insertForm(startTag46, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder7);
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertNotNull(doctype25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(tokeniserState34);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertArrayEquals(charArray42, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(startTag44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(startTag46);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        boolean boolean5 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = null;
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList7);
        boolean boolean9 = tokeniser8.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState10 = tokeniser8.getState();
        org.jsoup.parser.Token.Tag tag12 = tokeniser8.createTagPending(false);
        char[] charArray18 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser8.emit(charArray18);
        org.jsoup.parser.Token.StartTag startTag20 = tokeniser8.startPending;
        org.jsoup.parser.CharacterReader characterReader21 = null;
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader21, parseErrorList22);
        java.lang.StringBuilder stringBuilder24 = tokeniser23.dataBuffer;
        java.lang.StringBuilder stringBuilder25 = tokeniser23.dataBuffer;
        org.jsoup.parser.Token.StartTag startTag26 = null;
        tokeniser23.startPending = startTag26;
        org.jsoup.parser.Token.Character character28 = tokeniser23.charPending;
        tokeniser8.charPending = character28;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(character28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(elementList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tokeniserState10);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(startTag20);
        org.junit.Assert.assertNotNull(stringBuilder24);
        org.junit.Assert.assertEquals(stringBuilder24.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder25);
        org.junit.Assert.assertEquals(stringBuilder25.toString(), "");
        org.junit.Assert.assertNotNull(character28);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.removeFromStack(element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder7.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder7.state();
        htmlTreeBuilder7.generateImpliedEndTags();
        htmlTreeBuilder7.markInsertionMode();
        htmlTreeBuilder7.generateImpliedEndTags();
        org.jsoup.parser.ParseSettings parseSettings13 = htmlTreeBuilder7.defaultSettings();
        java.util.List<java.lang.String> strList14 = htmlTreeBuilder7.getPendingTableCharacters();
        htmlTreeBuilder0.setPendingTableCharacters(strList14);
        org.jsoup.nodes.Element element16 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insert(element16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNull(htmlTreeBuilderState9);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        org.jsoup.parser.TokeniserState tokeniserState7 = null;
        tokeniser2.transition(tokeniserState7);
        org.jsoup.parser.Token.StartTag startTag9 = tokeniser2.startPending;
        org.jsoup.parser.Token.Comment comment10 = null;
        tokeniser2.commentPending = comment10;
        org.jsoup.parser.Token.StartTag startTag12 = null;
        tokeniser2.startPending = startTag12;
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        boolean boolean17 = tokeniser16.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState18 = tokeniser16.getState();
        org.jsoup.parser.Token.Tag tag20 = tokeniser16.createTagPending(false);
        char[] charArray26 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser16.emit(charArray26);
        org.jsoup.parser.Token.StartTag startTag28 = tokeniser16.startPending;
        org.jsoup.parser.TokeniserState tokeniserState29 = tokeniser16.getState();
        org.jsoup.parser.CharacterReader characterReader30 = null;
        org.jsoup.parser.ParseErrorList parseErrorList31 = null;
        org.jsoup.parser.Tokeniser tokeniser32 = new org.jsoup.parser.Tokeniser(characterReader30, parseErrorList31);
        java.lang.StringBuilder stringBuilder33 = tokeniser32.dataBuffer;
        tokeniser32.createTempBuffer();
        org.jsoup.parser.Token.Tag tag35 = null;
        tokeniser32.tagPending = tag35;
        org.jsoup.parser.TokeniserState tokeniserState37 = null;
        tokeniser32.transition(tokeniserState37);
        tokeniser32.createCommentPending();
        org.jsoup.parser.Token.EndTag endTag40 = tokeniser32.endPending;
        tokeniser16.tagPending = endTag40;
        tokeniser2.tagPending = endTag40;
        org.jsoup.parser.CharacterReader characterReader43 = null;
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.Tokeniser tokeniser45 = new org.jsoup.parser.Tokeniser(characterReader43, parseErrorList44);
        java.lang.StringBuilder stringBuilder46 = tokeniser45.dataBuffer;
        tokeniser45.createDoctypePending();
        tokeniser45.emitDoctypePending();
        org.jsoup.parser.CharacterReader characterReader49 = null;
        org.jsoup.parser.ParseErrorList parseErrorList50 = null;
        org.jsoup.parser.Tokeniser tokeniser51 = new org.jsoup.parser.Tokeniser(characterReader49, parseErrorList50);
        java.lang.StringBuilder stringBuilder52 = tokeniser51.dataBuffer;
        tokeniser45.dataBuffer = stringBuilder52;
        org.jsoup.parser.CharacterReader characterReader54 = null;
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.Tokeniser tokeniser56 = new org.jsoup.parser.Tokeniser(characterReader54, parseErrorList55);
        boolean boolean57 = tokeniser56.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState58 = tokeniser56.getState();
        tokeniser45.transition(tokeniserState58);
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.advanceTransition(tokeniserState58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(startTag9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tokeniserState18);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(startTag28);
        org.junit.Assert.assertNotNull(tokeniserState29);
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertNotNull(endTag40);
        org.junit.Assert.assertNotNull(stringBuilder46);
        org.junit.Assert.assertEquals(stringBuilder46.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder52);
        org.junit.Assert.assertEquals(stringBuilder52.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(tokeniserState58);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.resetInsertionMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element2 = null;
        htmlTreeBuilder0.setHeadElement(element2);
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        htmlTreeBuilder0.framesetOk(true);
        boolean boolean7 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = htmlTreeBuilder0.removeFromStack(element8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element2 = null;
        htmlTreeBuilder0.setHeadElement(element2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        org.jsoup.nodes.Attributes attributes7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = htmlTreeBuilder0.processStartTag("hi!", attributes7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.nodes.Element element4 = null;
        htmlTreeBuilder0.setHeadElement(element4);
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.FormElement formElement9 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList10 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.Element element11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = htmlTreeBuilder0.isSpecial(element11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(formElement9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.originalState();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element6 = htmlTreeBuilder0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(elementList4);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder0.originalState();
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState10);
        org.jsoup.parser.ParseSettings parseSettings12 = htmlTreeBuilder0.defaultSettings();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose(strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = htmlTreeBuilder0.removeFromStack(element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = htmlTreeBuilder0.getFormElement();
        java.util.List<java.lang.String> strList2 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.Element element3 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements(element3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(formElement1);
        org.junit.Assert.assertNull(strList2);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.newPendingTableCharacters();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        java.io.Reader reader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean11 = htmlTreeBuilder10.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = null;
        htmlTreeBuilder10.transition(htmlTreeBuilderState12);
        org.jsoup.nodes.Element element14 = null;
        htmlTreeBuilder10.setHeadElement(element14);
        htmlTreeBuilder10.generateImpliedEndTags();
        boolean boolean17 = htmlTreeBuilder10.isFragmentParsing();
        org.jsoup.nodes.Element element19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder22 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder22.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState24 = htmlTreeBuilder22.state();
        org.jsoup.parser.ParseSettings parseSettings25 = htmlTreeBuilder22.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = htmlTreeBuilder10.parseFragment("hi!", element19, "", parseErrorList21, parseSettings25);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader7, "", parseErrorList9, parseSettings25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNull(elementList4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState24);
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNotNull(nodeList26);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(elementList4);
        org.junit.Assert.assertNull(formElement7);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        java.lang.StringBuilder stringBuilder3 = tokeniser2.dataBuffer;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.Token.Tag tag5 = null;
        tokeniser2.tagPending = tag5;
        tokeniser2.createTempBuffer();
        org.jsoup.parser.CharacterReader characterReader8 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader8, parseErrorList9);
        java.lang.StringBuilder stringBuilder11 = tokeniser10.dataBuffer;
        tokeniser10.createTempBuffer();
        org.jsoup.parser.Token.Tag tag13 = null;
        tokeniser10.tagPending = tag13;
        org.jsoup.parser.CharacterReader characterReader15 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader15, parseErrorList16);
        java.lang.StringBuilder stringBuilder18 = tokeniser17.dataBuffer;
        tokeniser17.createTempBuffer();
        org.jsoup.parser.Token.Tag tag21 = tokeniser17.createTagPending(false);
        tokeniser10.emit((org.jsoup.parser.Token) tag21);
        org.jsoup.parser.Token.StartTag startTag23 = null;
        tokeniser10.startPending = startTag23;
        org.jsoup.parser.TokeniserState tokeniserState25 = tokeniser10.getState();
        tokeniser2.transition(tokeniserState25);
        org.jsoup.parser.Token.Doctype doctype27 = tokeniser2.doctypePending;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.emitTagPending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder11);
        org.junit.Assert.assertEquals(stringBuilder11.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder18);
        org.junit.Assert.assertEquals(stringBuilder18.toString(), "");
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(tokeniserState25);
        org.junit.Assert.assertNotNull(doctype27);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element3 = null;
        org.jsoup.nodes.Element element4 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement(element3, element4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.FormElement formElement4 = null;
        htmlTreeBuilder0.setFormElement(formElement4);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings5 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element6 = null;
        org.jsoup.nodes.Element element7 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.replaceActiveFormattingElement(element6, element7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNotNull(parseSettings5);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        org.jsoup.nodes.Element element4 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element5 = null;
        htmlTreeBuilder0.setHeadElement(element5);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableBodyContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertNull(element4);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList1 = null;
        org.jsoup.parser.Tokeniser tokeniser2 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList1);
        boolean boolean3 = tokeniser2.isAppropriateEndTagToken();
        org.jsoup.parser.TokeniserState tokeniserState4 = tokeniser2.getState();
        org.jsoup.parser.Token.Tag tag6 = tokeniser2.createTagPending(false);
        char[] charArray12 = new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' };
        tokeniser2.emit(charArray12);
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.Tokeniser tokeniser16 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList15);
        java.lang.StringBuilder stringBuilder17 = tokeniser16.dataBuffer;
        tokeniser16.createTempBuffer();
        org.jsoup.parser.Token.Tag tag19 = null;
        tokeniser16.tagPending = tag19;
        tokeniser16.acknowledgeSelfClosingFlag();
        org.jsoup.parser.Token.Tag tag23 = tokeniser16.createTagPending(false);
        org.jsoup.parser.CharacterReader characterReader24 = null;
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader24, parseErrorList25);
        int[] intArray28 = new int[] { (byte) 1 };
        tokeniser26.emit(intArray28);
        tokeniser16.emit(intArray28);
        tokeniser2.emit(intArray28);
        boolean boolean32 = tokeniser2.currentNodeInHtmlNS();
        tokeniser2.emit('\ufffd');
        org.jsoup.parser.TokeniserState tokeniserState35 = null;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser2.error(tokeniserState35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(tokeniserState4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '\ufffd', '\ufffd', '#', ' ', '\ufffd' });
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 1 });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        boolean boolean1 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        htmlTreeBuilder7.setPendingTableCharacters((java.util.List<java.lang.String>) strList10);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<java.lang.String>) strList10);
        boolean boolean14 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.FormElement formElement15 = null;
        htmlTreeBuilder0.setFormElement(formElement15);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.resetInsertionMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }
}

