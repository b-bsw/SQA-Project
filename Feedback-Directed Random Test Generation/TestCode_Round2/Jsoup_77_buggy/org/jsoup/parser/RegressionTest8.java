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
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList4, parseSettings6);
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document14 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings19);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList4, parseSettings6);
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes10 = null;
        boolean boolean11 = xmlTreeBuilder0.processStartTag("hi!", attributes10);
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder19.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder15.parseFragment("hi!", "", parseErrorList18, parseSettings20);
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder15.defaultSettings();
        org.jsoup.nodes.Attributes attributes24 = null;
        boolean boolean25 = xmlTreeBuilder15.processStartTag("hi!", attributes24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings30 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings35 = xmlTreeBuilder34.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder29.parseFragment("", "hi!", parseErrorList33, parseSettings35);
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlTreeBuilder15.parseFragment("hi!", "hi!", parseErrorList28, parseSettings35);
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder41.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder46 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder46.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList48 = xmlTreeBuilder41.parseFragment("hi!", "", parseErrorList45, parseSettings47);
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder41.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder15.parseFragment("", "hi!", parseErrorList40, parseSettings49);
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlTreeBuilder0.parseFragment("", "", parseErrorList14, parseSettings49);
        org.jsoup.nodes.Document document54 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Attributes attributes56 = null;
        boolean boolean57 = xmlTreeBuilder0.processStartTag("hi!", attributes56);
        org.jsoup.nodes.Document document60 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Document document63 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings64 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document67 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Document document70 = xmlTreeBuilder0.parse("", "");
        java.io.Reader reader71 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document73 = xmlTreeBuilder0.parse(reader71, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertNotNull(document63);
        org.junit.Assert.assertNotNull(parseSettings64);
        org.junit.Assert.assertNotNull(document67);
        org.junit.Assert.assertNotNull(document70);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList4, parseSettings6);
        org.jsoup.nodes.Attributes attributes9 = null;
        boolean boolean10 = xmlTreeBuilder0.processStartTag("hi!", attributes9);
        org.jsoup.nodes.Attributes attributes12 = null;
        boolean boolean13 = xmlTreeBuilder0.processStartTag("hi!", attributes12);
        org.jsoup.nodes.Document document16 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Attributes attributes18 = null;
        boolean boolean19 = xmlTreeBuilder0.processStartTag("hi!", attributes18);
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder0.defaultSettings();
        java.lang.Class<?> wildcardClass21 = xmlTreeBuilder0.getClass();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlTreeBuilder4.parseFragment("hi!", "", parseErrorList8, parseSettings10);
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList3, parseSettings10);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder16.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder21.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlTreeBuilder16.parseFragment("", "", parseErrorList20, parseSettings22);
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList15, parseSettings22);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder28.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder28.parseFragment("hi!", "", parseErrorList32, parseSettings34);
        org.jsoup.parser.ParseSettings parseSettings36 = xmlTreeBuilder28.defaultSettings();
        org.jsoup.nodes.Attributes attributes38 = null;
        boolean boolean39 = xmlTreeBuilder28.processStartTag("hi!", attributes38);
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder43 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder47 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings48 = xmlTreeBuilder47.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList49 = xmlTreeBuilder43.parseFragment("hi!", "", parseErrorList46, parseSettings48);
        org.jsoup.parser.ParseSettings parseSettings50 = xmlTreeBuilder43.defaultSettings();
        org.jsoup.nodes.Attributes attributes52 = null;
        boolean boolean53 = xmlTreeBuilder43.processStartTag("hi!", attributes52);
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder57 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings58 = xmlTreeBuilder57.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder62 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings63 = xmlTreeBuilder62.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList64 = xmlTreeBuilder57.parseFragment("", "hi!", parseErrorList61, parseSettings63);
        java.util.List<org.jsoup.nodes.Node> nodeList65 = xmlTreeBuilder43.parseFragment("hi!", "hi!", parseErrorList56, parseSettings63);
        org.jsoup.parser.ParseErrorList parseErrorList68 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder69 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings70 = xmlTreeBuilder69.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList73 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder74 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings75 = xmlTreeBuilder74.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList76 = xmlTreeBuilder69.parseFragment("hi!", "", parseErrorList73, parseSettings75);
        org.jsoup.parser.ParseSettings parseSettings77 = xmlTreeBuilder69.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList78 = xmlTreeBuilder43.parseFragment("", "hi!", parseErrorList68, parseSettings77);
        java.util.List<org.jsoup.nodes.Node> nodeList79 = xmlTreeBuilder28.parseFragment("", "", parseErrorList42, parseSettings77);
        java.util.List<org.jsoup.nodes.Node> nodeList80 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList27, parseSettings77);
        org.jsoup.nodes.Document document83 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings84 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document87 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.Token.Doctype doctype88 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(parseSettings50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNotNull(parseSettings63);
        org.junit.Assert.assertNotNull(nodeList64);
        org.junit.Assert.assertNotNull(nodeList65);
        org.junit.Assert.assertNotNull(parseSettings70);
        org.junit.Assert.assertNotNull(parseSettings75);
        org.junit.Assert.assertNotNull(nodeList76);
        org.junit.Assert.assertNotNull(parseSettings77);
        org.junit.Assert.assertNotNull(nodeList78);
        org.junit.Assert.assertNotNull(nodeList79);
        org.junit.Assert.assertNotNull(nodeList80);
        org.junit.Assert.assertNotNull(document83);
        org.junit.Assert.assertNotNull(parseSettings84);
        org.junit.Assert.assertNotNull(document87);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes9 = null;
        boolean boolean10 = xmlTreeBuilder0.processStartTag("hi!", attributes9);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder19.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder14.parseFragment("hi!", "", parseErrorList18, parseSettings20);
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder14.parse("hi!", "hi!");
        org.jsoup.nodes.Document document28 = xmlTreeBuilder14.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings30 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings35 = xmlTreeBuilder34.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder39.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList41 = xmlTreeBuilder34.parseFragment("", "hi!", parseErrorList38, parseSettings40);
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder34.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlTreeBuilder14.parseFragment("hi!", "", parseErrorList33, parseSettings42);
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder14.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList13, parseSettings44);
        java.io.Reader reader46 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document48 = xmlTreeBuilder0.parse(reader46, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(nodeList41);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(nodeList45);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder19.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder14.parseFragment("hi!", "", parseErrorList18, parseSettings20);
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings27 = xmlTreeBuilder26.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlTreeBuilder26.parseFragment("", "hi!", parseErrorList30, parseSettings32);
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlTreeBuilder14.parseFragment("", "", parseErrorList25, parseSettings32);
        org.jsoup.parser.ParseSettings parseSettings35 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder39.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder44 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings45 = xmlTreeBuilder44.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlTreeBuilder39.parseFragment("", "hi!", parseErrorList43, parseSettings45);
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder39.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList48 = xmlTreeBuilder14.parseFragment("", "", parseErrorList38, parseSettings47);
        org.jsoup.nodes.Document document51 = xmlTreeBuilder14.parse("", "");
        org.jsoup.parser.ParseSettings parseSettings52 = xmlTreeBuilder14.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList53 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList13, parseSettings52);
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Doctype doctype55 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(parseSettings54);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList4, parseSettings6);
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder12.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder17.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder12.parseFragment("", "hi!", parseErrorList16, parseSettings18);
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlTreeBuilder0.parseFragment("", "", parseErrorList11, parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings21 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document24 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings25 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder29.parseFragment("hi!", "", parseErrorList32, parseSettings34);
        org.jsoup.parser.ParseSettings parseSettings36 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.nodes.Attributes attributes38 = null;
        boolean boolean39 = xmlTreeBuilder29.processStartTag("hi!", attributes38);
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder43 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder43.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder48 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder48.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder43.parseFragment("", "hi!", parseErrorList47, parseSettings49);
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlTreeBuilder29.parseFragment("hi!", "hi!", parseErrorList42, parseSettings49);
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder55.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder60 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings61 = xmlTreeBuilder60.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList62 = xmlTreeBuilder55.parseFragment("hi!", "", parseErrorList59, parseSettings61);
        org.jsoup.parser.ParseSettings parseSettings63 = xmlTreeBuilder55.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList64 = xmlTreeBuilder29.parseFragment("", "hi!", parseErrorList54, parseSettings63);
        org.jsoup.nodes.Document document67 = xmlTreeBuilder29.parse("hi!", "hi!");
        org.jsoup.nodes.Document document70 = xmlTreeBuilder29.parse("", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList73 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder74 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings75 = xmlTreeBuilder74.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList78 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder79 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings80 = xmlTreeBuilder79.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList81 = xmlTreeBuilder74.parseFragment("hi!", "", parseErrorList78, parseSettings80);
        org.jsoup.parser.ParseSettings parseSettings82 = xmlTreeBuilder74.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList83 = xmlTreeBuilder29.parseFragment("hi!", "hi!", parseErrorList73, parseSettings82);
        java.util.List<org.jsoup.nodes.Node> nodeList84 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList28, parseSettings82);
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertNotNull(parseSettings63);
        org.junit.Assert.assertNotNull(nodeList64);
        org.junit.Assert.assertNotNull(document67);
        org.junit.Assert.assertNotNull(document70);
        org.junit.Assert.assertNotNull(parseSettings75);
        org.junit.Assert.assertNotNull(parseSettings80);
        org.junit.Assert.assertNotNull(nodeList81);
        org.junit.Assert.assertNotNull(parseSettings82);
        org.junit.Assert.assertNotNull(nodeList83);
        org.junit.Assert.assertNotNull(nodeList84);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList4, parseSettings6);
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder12.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder17.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder12.parseFragment("", "hi!", parseErrorList16, parseSettings18);
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlTreeBuilder0.parseFragment("", "", parseErrorList11, parseSettings18);
        org.jsoup.nodes.Document document23 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document26 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document29 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList36 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings38 = xmlTreeBuilder37.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder42 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings43 = xmlTreeBuilder42.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlTreeBuilder37.parseFragment("hi!", "", parseErrorList41, parseSettings43);
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder33.parseFragment("hi!", "", parseErrorList36, parseSettings43);
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder49 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings50 = xmlTreeBuilder49.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder54 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder54.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList56 = xmlTreeBuilder49.parseFragment("", "hi!", parseErrorList53, parseSettings55);
        org.jsoup.nodes.Attributes attributes58 = null;
        boolean boolean59 = xmlTreeBuilder49.processStartTag("hi!", attributes58);
        org.jsoup.parser.ParseSettings parseSettings60 = xmlTreeBuilder49.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings61 = xmlTreeBuilder49.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList62 = xmlTreeBuilder33.parseFragment("", "", parseErrorList48, parseSettings61);
        java.util.List<org.jsoup.nodes.Node> nodeList63 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList32, parseSettings61);
        org.jsoup.parser.ParseErrorList parseErrorList66 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder67 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings68 = xmlTreeBuilder67.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings69 = xmlTreeBuilder67.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList72 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder73 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings74 = xmlTreeBuilder73.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings75 = xmlTreeBuilder73.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList76 = xmlTreeBuilder67.parseFragment("hi!", "", parseErrorList72, parseSettings75);
        org.jsoup.parser.ParseSettings parseSettings77 = xmlTreeBuilder67.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList78 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList66, parseSettings77);
        org.jsoup.parser.ParseSettings parseSettings79 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.StartTag startTag80 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element81 = xmlTreeBuilder0.insert(startTag80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(parseSettings43);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(parseSettings50);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(parseSettings60);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertNotNull(parseSettings68);
        org.junit.Assert.assertNotNull(parseSettings69);
        org.junit.Assert.assertNotNull(parseSettings74);
        org.junit.Assert.assertNotNull(parseSettings75);
        org.junit.Assert.assertNotNull(nodeList76);
        org.junit.Assert.assertNotNull(parseSettings77);
        org.junit.Assert.assertNotNull(nodeList78);
        org.junit.Assert.assertNotNull(parseSettings79);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlTreeBuilder10.parseFragment("hi!", "", parseErrorList13, parseSettings15);
        org.jsoup.nodes.Document document19 = xmlTreeBuilder10.parse("", "");
        org.jsoup.nodes.Document document22 = xmlTreeBuilder10.parse("", "hi!");
        org.jsoup.nodes.Document document25 = xmlTreeBuilder10.parse("", "");
        org.jsoup.nodes.Document document28 = xmlTreeBuilder10.parse("", "");
        org.jsoup.nodes.Document document31 = xmlTreeBuilder10.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder10.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList9, parseSettings32);
        org.jsoup.nodes.Document document36 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes38 = null;
        boolean boolean39 = xmlTreeBuilder0.processStartTag("hi!", attributes38);
        org.jsoup.nodes.Document document42 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes44 = null;
        boolean boolean45 = xmlTreeBuilder0.processStartTag("hi!", attributes44);
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document5 = xmlTreeBuilder0.parse("hi!", "");
        java.io.Reader reader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder13 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings14 = xmlTreeBuilder13.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlTreeBuilder9.parseFragment("hi!", "", parseErrorList12, parseSettings14);
        org.jsoup.nodes.Document document18 = xmlTreeBuilder9.parse("", "");
        org.jsoup.nodes.Document document21 = xmlTreeBuilder9.parse("", "hi!");
        org.jsoup.nodes.Document document24 = xmlTreeBuilder9.parse("", "");
        org.jsoup.nodes.Document document27 = xmlTreeBuilder9.parse("", "");
        org.jsoup.nodes.Document document30 = xmlTreeBuilder9.parse("hi!", "hi!");
        org.jsoup.nodes.Document document33 = xmlTreeBuilder9.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder9.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder38 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder42 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings43 = xmlTreeBuilder42.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlTreeBuilder38.parseFragment("hi!", "", parseErrorList41, parseSettings43);
        org.jsoup.parser.ParseSettings parseSettings45 = xmlTreeBuilder38.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlTreeBuilder9.parseFragment("", "", parseErrorList37, parseSettings45);
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader6, "hi!", parseErrorList8, parseSettings45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(parseSettings43);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(nodeList46);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList4, parseSettings6);
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder12.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder17.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder12.parseFragment("", "hi!", parseErrorList16, parseSettings18);
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlTreeBuilder0.parseFragment("", "", parseErrorList11, parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings21 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document24 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Document document27 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document30 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.ParseSettings parseSettings31 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document34 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document37 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(document37);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder6.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList5, parseSettings8);
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parseSettings11);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList4, parseSettings6);
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document14 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder19.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList23 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder24 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings25 = xmlTreeBuilder24.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlTreeBuilder19.parseFragment("hi!", "", parseErrorList23, parseSettings25);
        org.jsoup.parser.ParseSettings parseSettings27 = xmlTreeBuilder19.defaultSettings();
        org.jsoup.nodes.Document document30 = xmlTreeBuilder19.parse("hi!", "hi!");
        org.jsoup.nodes.Document document33 = xmlTreeBuilder19.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder19.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings35 = xmlTreeBuilder19.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList38 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder39.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder44 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings45 = xmlTreeBuilder44.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlTreeBuilder39.parseFragment("", "", parseErrorList43, parseSettings45);
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlTreeBuilder19.parseFragment("hi!", "", parseErrorList38, parseSettings45);
        java.util.List<org.jsoup.nodes.Node> nodeList48 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList18, parseSettings45);
        org.jsoup.nodes.Attributes attributes50 = null;
        boolean boolean51 = xmlTreeBuilder0.processStartTag("hi!", attributes50);
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder55.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList59 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder60 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings61 = xmlTreeBuilder60.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList62 = xmlTreeBuilder55.parseFragment("hi!", "", parseErrorList59, parseSettings61);
        org.jsoup.parser.ParseSettings parseSettings63 = xmlTreeBuilder55.defaultSettings();
        org.jsoup.nodes.Document document66 = xmlTreeBuilder55.parse("hi!", "hi!");
        org.jsoup.nodes.Document document69 = xmlTreeBuilder55.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings70 = xmlTreeBuilder55.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings71 = xmlTreeBuilder55.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings72 = xmlTreeBuilder55.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList75 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder76 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings77 = xmlTreeBuilder76.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList78 = xmlTreeBuilder55.parseFragment("hi!", "", parseErrorList75, parseSettings77);
        java.util.List<org.jsoup.nodes.Node> nodeList79 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList54, parseSettings77);
        org.jsoup.nodes.Attributes attributes81 = null;
        boolean boolean82 = xmlTreeBuilder0.processStartTag("hi!", attributes81);
        org.jsoup.nodes.Attributes attributes84 = null;
        boolean boolean85 = xmlTreeBuilder0.processStartTag("hi!", attributes84);
        org.jsoup.nodes.Document document88 = xmlTreeBuilder0.parse("hi!", "");
        java.io.Reader reader89 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document91 = xmlTreeBuilder0.parse(reader89, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertNotNull(parseSettings63);
        org.junit.Assert.assertNotNull(document66);
        org.junit.Assert.assertNotNull(document69);
        org.junit.Assert.assertNotNull(parseSettings70);
        org.junit.Assert.assertNotNull(parseSettings71);
        org.junit.Assert.assertNotNull(parseSettings72);
        org.junit.Assert.assertNotNull(parseSettings77);
        org.junit.Assert.assertNotNull(nodeList78);
        org.junit.Assert.assertNotNull(nodeList79);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(document88);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlTreeBuilder4.parseFragment("hi!", "", parseErrorList8, parseSettings10);
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList3, parseSettings10);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder16.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder21.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlTreeBuilder16.parseFragment("", "", parseErrorList20, parseSettings22);
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList15, parseSettings22);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder28.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder28.parseFragment("hi!", "", parseErrorList32, parseSettings34);
        org.jsoup.parser.ParseSettings parseSettings36 = xmlTreeBuilder28.defaultSettings();
        org.jsoup.nodes.Attributes attributes38 = null;
        boolean boolean39 = xmlTreeBuilder28.processStartTag("hi!", attributes38);
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder43 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder47 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings48 = xmlTreeBuilder47.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList49 = xmlTreeBuilder43.parseFragment("hi!", "", parseErrorList46, parseSettings48);
        org.jsoup.parser.ParseSettings parseSettings50 = xmlTreeBuilder43.defaultSettings();
        org.jsoup.nodes.Attributes attributes52 = null;
        boolean boolean53 = xmlTreeBuilder43.processStartTag("hi!", attributes52);
        org.jsoup.parser.ParseErrorList parseErrorList56 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder57 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings58 = xmlTreeBuilder57.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder62 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings63 = xmlTreeBuilder62.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList64 = xmlTreeBuilder57.parseFragment("", "hi!", parseErrorList61, parseSettings63);
        java.util.List<org.jsoup.nodes.Node> nodeList65 = xmlTreeBuilder43.parseFragment("hi!", "hi!", parseErrorList56, parseSettings63);
        org.jsoup.parser.ParseErrorList parseErrorList68 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder69 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings70 = xmlTreeBuilder69.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList73 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder74 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings75 = xmlTreeBuilder74.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList76 = xmlTreeBuilder69.parseFragment("hi!", "", parseErrorList73, parseSettings75);
        org.jsoup.parser.ParseSettings parseSettings77 = xmlTreeBuilder69.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList78 = xmlTreeBuilder43.parseFragment("", "hi!", parseErrorList68, parseSettings77);
        java.util.List<org.jsoup.nodes.Node> nodeList79 = xmlTreeBuilder28.parseFragment("", "", parseErrorList42, parseSettings77);
        java.util.List<org.jsoup.nodes.Node> nodeList80 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList27, parseSettings77);
        org.jsoup.nodes.Document document83 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Document document86 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document89 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Document document92 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.Token.Character character93 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(parseSettings50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNotNull(parseSettings63);
        org.junit.Assert.assertNotNull(nodeList64);
        org.junit.Assert.assertNotNull(nodeList65);
        org.junit.Assert.assertNotNull(parseSettings70);
        org.junit.Assert.assertNotNull(parseSettings75);
        org.junit.Assert.assertNotNull(nodeList76);
        org.junit.Assert.assertNotNull(parseSettings77);
        org.junit.Assert.assertNotNull(nodeList78);
        org.junit.Assert.assertNotNull(nodeList79);
        org.junit.Assert.assertNotNull(nodeList80);
        org.junit.Assert.assertNotNull(document83);
        org.junit.Assert.assertNotNull(document86);
        org.junit.Assert.assertNotNull(document89);
        org.junit.Assert.assertNotNull(document92);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList3, parseSettings5);
        org.jsoup.nodes.Attributes attributes8 = null;
        boolean boolean9 = xmlTreeBuilder0.processStartTag("hi!", attributes8);
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes15 = null;
        boolean boolean16 = xmlTreeBuilder0.processStartTag("hi!", attributes15);
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes19 = null;
        boolean boolean20 = xmlTreeBuilder0.processStartTag("hi!", attributes19);
        org.jsoup.parser.Token token21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = xmlTreeBuilder0.process(token21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList4, parseSettings6);
        org.jsoup.nodes.Attributes attributes9 = null;
        boolean boolean10 = xmlTreeBuilder0.processStartTag("hi!", attributes9);
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder16.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder21.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlTreeBuilder16.parseFragment("hi!", "", parseErrorList20, parseSettings22);
        org.jsoup.parser.ParseSettings parseSettings24 = xmlTreeBuilder16.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder28.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder28.parseFragment("", "hi!", parseErrorList32, parseSettings34);
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder16.parseFragment("", "", parseErrorList27, parseSettings34);
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder16.defaultSettings();
        org.jsoup.nodes.Document document40 = xmlTreeBuilder16.parse("", "");
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder44 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings45 = xmlTreeBuilder44.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder49 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings50 = xmlTreeBuilder49.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlTreeBuilder44.parseFragment("hi!", "", parseErrorList48, parseSettings50);
        org.jsoup.parser.ParseSettings parseSettings52 = xmlTreeBuilder44.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder56 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder56.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder61 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings62 = xmlTreeBuilder61.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList63 = xmlTreeBuilder56.parseFragment("", "hi!", parseErrorList60, parseSettings62);
        java.util.List<org.jsoup.nodes.Node> nodeList64 = xmlTreeBuilder44.parseFragment("", "", parseErrorList55, parseSettings62);
        org.jsoup.parser.ParseSettings parseSettings65 = xmlTreeBuilder44.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList68 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder69 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings70 = xmlTreeBuilder69.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList73 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder74 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings75 = xmlTreeBuilder74.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList76 = xmlTreeBuilder69.parseFragment("", "hi!", parseErrorList73, parseSettings75);
        org.jsoup.parser.ParseSettings parseSettings77 = xmlTreeBuilder69.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList78 = xmlTreeBuilder44.parseFragment("", "", parseErrorList68, parseSettings77);
        org.jsoup.nodes.Document document81 = xmlTreeBuilder44.parse("", "");
        org.jsoup.parser.ParseSettings parseSettings82 = xmlTreeBuilder44.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList83 = xmlTreeBuilder16.parseFragment("hi!", "", parseErrorList43, parseSettings82);
        java.util.List<org.jsoup.nodes.Node> nodeList84 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList15, parseSettings82);
        org.jsoup.parser.ParseSettings parseSettings85 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document88 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Attributes attributes90 = null;
        boolean boolean91 = xmlTreeBuilder0.processStartTag("hi!", attributes90);
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(parseSettings50);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(parseSettings62);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertNotNull(nodeList64);
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertNotNull(parseSettings70);
        org.junit.Assert.assertNotNull(parseSettings75);
        org.junit.Assert.assertNotNull(nodeList76);
        org.junit.Assert.assertNotNull(parseSettings77);
        org.junit.Assert.assertNotNull(nodeList78);
        org.junit.Assert.assertNotNull(document81);
        org.junit.Assert.assertNotNull(parseSettings82);
        org.junit.Assert.assertNotNull(nodeList83);
        org.junit.Assert.assertNotNull(nodeList84);
        org.junit.Assert.assertNotNull(parseSettings85);
        org.junit.Assert.assertNotNull(document88);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList3, parseSettings5);
        org.jsoup.nodes.Document document9 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Document document12 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings21 = xmlTreeBuilder20.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlTreeBuilder16.parseFragment("hi!", "", parseErrorList19, parseSettings21);
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder16.defaultSettings();
        org.jsoup.nodes.Attributes attributes25 = null;
        boolean boolean26 = xmlTreeBuilder16.processStartTag("hi!", attributes25);
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings31 = xmlTreeBuilder30.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings36 = xmlTreeBuilder35.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlTreeBuilder30.parseFragment("", "hi!", parseErrorList34, parseSettings36);
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder16.parseFragment("hi!", "hi!", parseErrorList29, parseSettings36);
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList15, parseSettings36);
        org.jsoup.nodes.Attributes attributes41 = null;
        boolean boolean42 = xmlTreeBuilder0.processStartTag("hi!", attributes41);
        org.jsoup.parser.Token.Doctype doctype43 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList4, parseSettings6);
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document14 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document19 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList22 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder23 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings24 = xmlTreeBuilder23.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings25 = xmlTreeBuilder23.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList22, parseSettings25);
        org.jsoup.nodes.Attributes attributes28 = null;
        boolean boolean29 = xmlTreeBuilder0.processStartTag("hi!", attributes28);
        org.jsoup.parser.ParseSettings parseSettings30 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Character character31 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(character31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(parseSettings30);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document10 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder19.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder14.parseFragment("", "", parseErrorList18, parseSettings20);
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder14.parse("hi!", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder29.parseFragment("hi!", "", parseErrorList32, parseSettings34);
        org.jsoup.parser.ParseSettings parseSettings36 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.nodes.Attributes attributes38 = null;
        boolean boolean39 = xmlTreeBuilder29.processStartTag("hi!", attributes38);
        org.jsoup.parser.ParseErrorList parseErrorList42 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder43 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder43.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings45 = xmlTreeBuilder43.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlTreeBuilder29.parseFragment("", "", parseErrorList42, parseSettings45);
        org.jsoup.nodes.Document document49 = xmlTreeBuilder29.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings50 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder29.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList52 = xmlTreeBuilder14.parseFragment("", "hi!", parseErrorList28, parseSettings51);
        java.util.List<org.jsoup.nodes.Node> nodeList53 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList13, parseSettings51);
        org.jsoup.nodes.Document document56 = xmlTreeBuilder0.parse("", "");
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertNotNull(parseSettings50);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(document56);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes9 = null;
        boolean boolean10 = xmlTreeBuilder0.processStartTag("hi!", attributes9);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder19.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder14.parseFragment("", "hi!", parseErrorList18, parseSettings20);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList13, parseSettings20);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings27 = xmlTreeBuilder26.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlTreeBuilder26.parseFragment("hi!", "", parseErrorList30, parseSettings32);
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder26.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList25, parseSettings34);
        org.jsoup.nodes.Document document38 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes40 = null;
        boolean boolean41 = xmlTreeBuilder0.processStartTag("hi!", attributes40);
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings43 = xmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(parseSettings43);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlTreeBuilder4.parseFragment("hi!", "", parseErrorList8, parseSettings10);
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList3, parseSettings10);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings21 = xmlTreeBuilder20.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlTreeBuilder16.parseFragment("hi!", "", parseErrorList19, parseSettings21);
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder16.defaultSettings();
        org.jsoup.nodes.Attributes attributes25 = null;
        boolean boolean26 = xmlTreeBuilder16.processStartTag("hi!", attributes25);
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings31 = xmlTreeBuilder30.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings36 = xmlTreeBuilder35.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlTreeBuilder30.parseFragment("", "hi!", parseErrorList34, parseSettings36);
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder16.parseFragment("hi!", "hi!", parseErrorList29, parseSettings36);
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder42 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings43 = xmlTreeBuilder42.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder47 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings48 = xmlTreeBuilder47.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList49 = xmlTreeBuilder42.parseFragment("hi!", "", parseErrorList46, parseSettings48);
        org.jsoup.parser.ParseSettings parseSettings50 = xmlTreeBuilder42.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlTreeBuilder16.parseFragment("", "hi!", parseErrorList41, parseSettings50);
        java.util.List<org.jsoup.nodes.Node> nodeList52 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList15, parseSettings50);
        org.jsoup.parser.ParseSettings parseSettings53 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document56 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings58 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document61 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.nodes.Document document64 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(parseSettings43);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(parseSettings50);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertNotNull(parseSettings53);
        org.junit.Assert.assertNotNull(document56);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNotNull(document64);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseErrorList parseErrorList9 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder10 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder10.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder15.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlTreeBuilder10.parseFragment("hi!", "", parseErrorList14, parseSettings16);
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder10.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder22.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList26 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings28 = xmlTreeBuilder27.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlTreeBuilder22.parseFragment("", "hi!", parseErrorList26, parseSettings28);
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlTreeBuilder10.parseFragment("", "", parseErrorList21, parseSettings28);
        org.jsoup.parser.ParseSettings parseSettings31 = xmlTreeBuilder10.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings36 = xmlTreeBuilder35.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings41 = xmlTreeBuilder40.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList42 = xmlTreeBuilder35.parseFragment("", "hi!", parseErrorList39, parseSettings41);
        org.jsoup.parser.ParseSettings parseSettings43 = xmlTreeBuilder35.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlTreeBuilder10.parseFragment("", "", parseErrorList34, parseSettings43);
        java.util.List<org.jsoup.nodes.Node> nodeList45 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList9, parseSettings43);
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder49 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings50 = xmlTreeBuilder49.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder54 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder54.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList56 = xmlTreeBuilder49.parseFragment("", "hi!", parseErrorList53, parseSettings55);
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder49.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList48, parseSettings57);
        org.jsoup.nodes.Attributes attributes60 = null;
        boolean boolean61 = xmlTreeBuilder0.processStartTag("hi!", attributes60);
        org.jsoup.parser.ParseSettings parseSettings62 = xmlTreeBuilder0.defaultSettings();
        java.lang.Class<?> wildcardClass63 = xmlTreeBuilder0.getClass();
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(parseSettings43);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(parseSettings50);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(parseSettings62);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList4, parseSettings6);
        org.jsoup.nodes.Document document10 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Document document13 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.ParseSettings parseSettings14 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList17 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder18 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList21 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder22 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder22.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlTreeBuilder18.parseFragment("hi!", "", parseErrorList21, parseSettings23);
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder28.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder28.parseFragment("hi!", "", parseErrorList32, parseSettings34);
        org.jsoup.parser.ParseSettings parseSettings36 = xmlTreeBuilder28.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings41 = xmlTreeBuilder40.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings46 = xmlTreeBuilder45.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlTreeBuilder40.parseFragment("", "hi!", parseErrorList44, parseSettings46);
        java.util.List<org.jsoup.nodes.Node> nodeList48 = xmlTreeBuilder28.parseFragment("", "", parseErrorList39, parseSettings46);
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder28.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder53 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder53.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList57 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder58 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings59 = xmlTreeBuilder58.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList60 = xmlTreeBuilder53.parseFragment("", "hi!", parseErrorList57, parseSettings59);
        org.jsoup.parser.ParseSettings parseSettings61 = xmlTreeBuilder53.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList62 = xmlTreeBuilder28.parseFragment("", "", parseErrorList52, parseSettings61);
        java.util.List<org.jsoup.nodes.Node> nodeList63 = xmlTreeBuilder18.parseFragment("hi!", "hi!", parseErrorList27, parseSettings61);
        org.jsoup.parser.ParseErrorList parseErrorList66 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder67 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings68 = xmlTreeBuilder67.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList71 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder72 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings73 = xmlTreeBuilder72.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList74 = xmlTreeBuilder67.parseFragment("", "hi!", parseErrorList71, parseSettings73);
        org.jsoup.parser.ParseSettings parseSettings75 = xmlTreeBuilder67.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList76 = xmlTreeBuilder18.parseFragment("", "hi!", parseErrorList66, parseSettings75);
        java.util.List<org.jsoup.nodes.Node> nodeList77 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList17, parseSettings75);
        org.jsoup.parser.ParseSettings parseSettings78 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings79 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Comment comment80 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertNotNull(parseSettings68);
        org.junit.Assert.assertNotNull(parseSettings73);
        org.junit.Assert.assertNotNull(nodeList74);
        org.junit.Assert.assertNotNull(parseSettings75);
        org.junit.Assert.assertNotNull(nodeList76);
        org.junit.Assert.assertNotNull(nodeList77);
        org.junit.Assert.assertNotNull(parseSettings78);
        org.junit.Assert.assertNotNull(parseSettings79);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList3, parseSettings5);
        org.jsoup.nodes.Attributes attributes8 = null;
        boolean boolean9 = xmlTreeBuilder0.processStartTag("hi!", attributes8);
        org.jsoup.nodes.Attributes attributes11 = null;
        boolean boolean12 = xmlTreeBuilder0.processStartTag("hi!", attributes11);
        org.jsoup.nodes.Attributes attributes14 = null;
        boolean boolean15 = xmlTreeBuilder0.processStartTag("hi!", attributes14);
        org.jsoup.parser.ParseSettings parseSettings16 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes19 = null;
        boolean boolean20 = xmlTreeBuilder0.processStartTag("hi!", attributes19);
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList4, parseSettings6);
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder12.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder17.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder12.parseFragment("", "hi!", parseErrorList16, parseSettings18);
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlTreeBuilder0.parseFragment("", "", parseErrorList11, parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings21 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document24 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.ParseErrorList parseErrorList27 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder28 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder28.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder28.parseFragment("hi!", "", parseErrorList32, parseSettings34);
        org.jsoup.parser.ParseSettings parseSettings36 = xmlTreeBuilder28.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings41 = xmlTreeBuilder40.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList44 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings46 = xmlTreeBuilder45.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList47 = xmlTreeBuilder40.parseFragment("", "hi!", parseErrorList44, parseSettings46);
        java.util.List<org.jsoup.nodes.Node> nodeList48 = xmlTreeBuilder28.parseFragment("", "", parseErrorList39, parseSettings46);
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder28.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList52 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder53 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder53.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList57 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder58 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings59 = xmlTreeBuilder58.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList60 = xmlTreeBuilder53.parseFragment("", "hi!", parseErrorList57, parseSettings59);
        org.jsoup.parser.ParseSettings parseSettings61 = xmlTreeBuilder53.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList62 = xmlTreeBuilder28.parseFragment("", "", parseErrorList52, parseSettings61);
        org.jsoup.nodes.Document document65 = xmlTreeBuilder28.parse("", "");
        org.jsoup.parser.ParseSettings parseSettings66 = xmlTreeBuilder28.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList67 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList27, parseSettings66);
        org.jsoup.parser.ParseSettings parseSettings68 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes70 = null;
        boolean boolean71 = xmlTreeBuilder0.processStartTag("hi!", attributes70);
        org.jsoup.parser.Token token72 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean73 = xmlTreeBuilder0.process(token72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertNotNull(document65);
        org.junit.Assert.assertNotNull(parseSettings66);
        org.junit.Assert.assertNotNull(nodeList67);
        org.junit.Assert.assertNotNull(parseSettings68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList4, parseSettings6);
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList11 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder12 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder12.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList16 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder17 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings18 = xmlTreeBuilder17.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlTreeBuilder12.parseFragment("", "hi!", parseErrorList16, parseSettings18);
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlTreeBuilder0.parseFragment("", "", parseErrorList11, parseSettings18);
        org.jsoup.nodes.Document document23 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document26 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Attributes attributes28 = null;
        boolean boolean29 = xmlTreeBuilder0.processStartTag("hi!", attributes28);
        java.lang.Class<?> wildcardClass30 = xmlTreeBuilder0.getClass();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList4, parseSettings6);
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes10 = null;
        boolean boolean11 = xmlTreeBuilder0.processStartTag("hi!", attributes10);
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder19.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder15.parseFragment("hi!", "", parseErrorList18, parseSettings20);
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder15.defaultSettings();
        org.jsoup.nodes.Attributes attributes24 = null;
        boolean boolean25 = xmlTreeBuilder15.processStartTag("hi!", attributes24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings30 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings35 = xmlTreeBuilder34.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder29.parseFragment("", "hi!", parseErrorList33, parseSettings35);
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlTreeBuilder15.parseFragment("hi!", "hi!", parseErrorList28, parseSettings35);
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder41.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder46 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder46.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList48 = xmlTreeBuilder41.parseFragment("hi!", "", parseErrorList45, parseSettings47);
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder41.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder15.parseFragment("", "hi!", parseErrorList40, parseSettings49);
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlTreeBuilder0.parseFragment("", "", parseErrorList14, parseSettings49);
        org.jsoup.nodes.Document document54 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Attributes attributes56 = null;
        boolean boolean57 = xmlTreeBuilder0.processStartTag("hi!", attributes56);
        org.jsoup.nodes.Document document60 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Document document63 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings64 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document67 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Attributes attributes69 = null;
        boolean boolean70 = xmlTreeBuilder0.processStartTag("hi!", attributes69);
        java.io.Reader reader71 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document73 = xmlTreeBuilder0.parse(reader71, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertNotNull(document63);
        org.junit.Assert.assertNotNull(parseSettings64);
        org.junit.Assert.assertNotNull(document67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList4, parseSettings6);
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes10 = null;
        boolean boolean11 = xmlTreeBuilder0.processStartTag("hi!", attributes10);
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder19.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder15.parseFragment("hi!", "", parseErrorList18, parseSettings20);
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder15.defaultSettings();
        org.jsoup.nodes.Attributes attributes24 = null;
        boolean boolean25 = xmlTreeBuilder15.processStartTag("hi!", attributes24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings30 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings35 = xmlTreeBuilder34.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder29.parseFragment("", "hi!", parseErrorList33, parseSettings35);
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlTreeBuilder15.parseFragment("hi!", "hi!", parseErrorList28, parseSettings35);
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder41.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder46 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder46.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList48 = xmlTreeBuilder41.parseFragment("hi!", "", parseErrorList45, parseSettings47);
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder41.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder15.parseFragment("", "hi!", parseErrorList40, parseSettings49);
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlTreeBuilder0.parseFragment("", "", parseErrorList14, parseSettings49);
        org.jsoup.nodes.Document document54 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Attributes attributes56 = null;
        boolean boolean57 = xmlTreeBuilder0.processStartTag("hi!", attributes56);
        org.jsoup.nodes.Document document60 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Attributes attributes62 = null;
        boolean boolean63 = xmlTreeBuilder0.processStartTag("hi!", attributes62);
        org.jsoup.nodes.Attributes attributes65 = null;
        boolean boolean66 = xmlTreeBuilder0.processStartTag("hi!", attributes65);
        org.jsoup.parser.Token.Comment comment67 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(comment67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList4, parseSettings6);
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes10 = null;
        boolean boolean11 = xmlTreeBuilder0.processStartTag("hi!", attributes10);
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document16 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document20 = xmlTreeBuilder0.parse("hi!", "");
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(document20);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes9 = null;
        boolean boolean10 = xmlTreeBuilder0.processStartTag("hi!", attributes9);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder19.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder14.parseFragment("", "hi!", parseErrorList18, parseSettings20);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList13, parseSettings20);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings27 = xmlTreeBuilder26.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlTreeBuilder26.parseFragment("hi!", "", parseErrorList30, parseSettings32);
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder26.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList25, parseSettings34);
        org.jsoup.nodes.Document document38 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings39 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document42 = xmlTreeBuilder0.parse("hi!", "");
        java.io.Reader reader43 = null;
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder46 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder46.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList50 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder51 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings52 = xmlTreeBuilder51.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList53 = xmlTreeBuilder46.parseFragment("", "hi!", parseErrorList50, parseSettings52);
        org.jsoup.parser.ParseSettings parseSettings54 = xmlTreeBuilder46.defaultSettings();
        org.jsoup.nodes.Attributes attributes56 = null;
        boolean boolean57 = xmlTreeBuilder46.processStartTag("hi!", attributes56);
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder61 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings62 = xmlTreeBuilder61.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList65 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder66 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings67 = xmlTreeBuilder66.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList68 = xmlTreeBuilder61.parseFragment("hi!", "", parseErrorList65, parseSettings67);
        org.jsoup.parser.ParseSettings parseSettings69 = xmlTreeBuilder61.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList72 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder73 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings74 = xmlTreeBuilder73.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList77 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder78 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings79 = xmlTreeBuilder78.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList80 = xmlTreeBuilder73.parseFragment("", "hi!", parseErrorList77, parseSettings79);
        java.util.List<org.jsoup.nodes.Node> nodeList81 = xmlTreeBuilder61.parseFragment("", "", parseErrorList72, parseSettings79);
        org.jsoup.parser.ParseSettings parseSettings82 = xmlTreeBuilder61.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList83 = xmlTreeBuilder46.parseFragment("hi!", "hi!", parseErrorList60, parseSettings82);
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader43, "", parseErrorList45, parseSettings82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(parseSettings39);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(parseSettings62);
        org.junit.Assert.assertNotNull(parseSettings67);
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertNotNull(parseSettings69);
        org.junit.Assert.assertNotNull(parseSettings74);
        org.junit.Assert.assertNotNull(parseSettings79);
        org.junit.Assert.assertNotNull(nodeList80);
        org.junit.Assert.assertNotNull(nodeList81);
        org.junit.Assert.assertNotNull(parseSettings82);
        org.junit.Assert.assertNotNull(nodeList83);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlTreeBuilder4.parseFragment("hi!", "", parseErrorList8, parseSettings10);
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList3, parseSettings10);
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings21 = xmlTreeBuilder20.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlTreeBuilder16.parseFragment("hi!", "", parseErrorList19, parseSettings21);
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder16.defaultSettings();
        org.jsoup.nodes.Attributes attributes25 = null;
        boolean boolean26 = xmlTreeBuilder16.processStartTag("hi!", attributes25);
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings31 = xmlTreeBuilder30.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings36 = xmlTreeBuilder35.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlTreeBuilder30.parseFragment("", "hi!", parseErrorList34, parseSettings36);
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder16.parseFragment("hi!", "hi!", parseErrorList29, parseSettings36);
        org.jsoup.parser.ParseErrorList parseErrorList41 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder42 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings43 = xmlTreeBuilder42.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList46 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder47 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings48 = xmlTreeBuilder47.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList49 = xmlTreeBuilder42.parseFragment("hi!", "", parseErrorList46, parseSettings48);
        org.jsoup.parser.ParseSettings parseSettings50 = xmlTreeBuilder42.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlTreeBuilder16.parseFragment("", "hi!", parseErrorList41, parseSettings50);
        java.util.List<org.jsoup.nodes.Node> nodeList52 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList15, parseSettings50);
        org.jsoup.nodes.Attributes attributes54 = null;
        boolean boolean55 = xmlTreeBuilder0.processStartTag("hi!", attributes54);
        org.jsoup.parser.ParseErrorList parseErrorList58 = null;
        org.jsoup.parser.ParseSettings parseSettings59 = null;
        java.util.List<org.jsoup.nodes.Node> nodeList60 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList58, parseSettings59);
        org.jsoup.nodes.Document document63 = xmlTreeBuilder0.parse("hi!", "");
        java.io.Reader reader64 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document66 = xmlTreeBuilder0.parse(reader64, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(parseSettings43);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(parseSettings50);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertNotNull(document63);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList4, parseSettings6);
        org.jsoup.nodes.Document document10 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder19.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder14.parseFragment("hi!", "", parseErrorList18, parseSettings20);
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings31 = xmlTreeBuilder30.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlTreeBuilder26.parseFragment("hi!", "", parseErrorList29, parseSettings31);
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder36 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings41 = xmlTreeBuilder40.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList42 = xmlTreeBuilder36.parseFragment("hi!", "", parseErrorList39, parseSettings41);
        org.jsoup.nodes.Document document45 = xmlTreeBuilder36.parse("", "");
        org.jsoup.nodes.Document document48 = xmlTreeBuilder36.parse("", "hi!");
        org.jsoup.nodes.Document document51 = xmlTreeBuilder36.parse("", "");
        org.jsoup.nodes.Document document54 = xmlTreeBuilder36.parse("", "");
        org.jsoup.nodes.Document document57 = xmlTreeBuilder36.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings58 = xmlTreeBuilder36.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList59 = xmlTreeBuilder26.parseFragment("hi!", "hi!", parseErrorList35, parseSettings58);
        java.util.List<org.jsoup.nodes.Node> nodeList60 = xmlTreeBuilder14.parseFragment("hi!", "", parseErrorList25, parseSettings58);
        org.jsoup.parser.ParseSettings parseSettings61 = xmlTreeBuilder14.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList62 = xmlTreeBuilder0.parseFragment("", "", parseErrorList13, parseSettings61);
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNotNull(document57);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNotNull(nodeList59);
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(nodeList62);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList3, parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes9 = null;
        boolean boolean10 = xmlTreeBuilder0.processStartTag("hi!", attributes9);
        org.jsoup.parser.ParseErrorList parseErrorList13 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder14 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder14.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder19.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder14.parseFragment("", "hi!", parseErrorList18, parseSettings20);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlTreeBuilder0.parseFragment("hi!", "hi!", parseErrorList13, parseSettings20);
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings27 = xmlTreeBuilder26.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList30 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings32 = xmlTreeBuilder31.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlTreeBuilder26.parseFragment("hi!", "", parseErrorList30, parseSettings32);
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder26.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList25, parseSettings34);
        org.jsoup.nodes.Document document38 = xmlTreeBuilder0.parse("hi!", "hi!");
        java.lang.Class<?> wildcardClass39 = xmlTreeBuilder0.getClass();
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList4, parseSettings6);
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document14 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes17 = null;
        boolean boolean18 = xmlTreeBuilder0.processStartTag("hi!", attributes17);
        org.jsoup.nodes.Document document21 = xmlTreeBuilder0.parse("", "hi!");
        java.io.Reader reader22 = null;
        org.jsoup.parser.ParseErrorList parseErrorList24 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings30 = xmlTreeBuilder29.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlTreeBuilder25.parseFragment("hi!", "", parseErrorList28, parseSettings30);
        org.jsoup.nodes.Document document34 = xmlTreeBuilder25.parse("", "");
        org.jsoup.nodes.Document document37 = xmlTreeBuilder25.parse("hi!", "hi!");
        org.jsoup.nodes.Document document40 = xmlTreeBuilder25.parse("", "");
        org.jsoup.parser.ParseErrorList parseErrorList43 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder44 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings45 = xmlTreeBuilder44.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder49 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings50 = xmlTreeBuilder49.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlTreeBuilder44.parseFragment("hi!", "", parseErrorList48, parseSettings50);
        org.jsoup.parser.ParseSettings parseSettings52 = xmlTreeBuilder44.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList55 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder56 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings57 = xmlTreeBuilder56.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder61 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings62 = xmlTreeBuilder61.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList63 = xmlTreeBuilder56.parseFragment("", "hi!", parseErrorList60, parseSettings62);
        java.util.List<org.jsoup.nodes.Node> nodeList64 = xmlTreeBuilder44.parseFragment("", "", parseErrorList55, parseSettings62);
        org.jsoup.parser.ParseSettings parseSettings65 = xmlTreeBuilder44.defaultSettings();
        org.jsoup.nodes.Attributes attributes67 = null;
        boolean boolean68 = xmlTreeBuilder44.processStartTag("hi!", attributes67);
        org.jsoup.parser.ParseSettings parseSettings69 = xmlTreeBuilder44.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList70 = xmlTreeBuilder25.parseFragment("hi!", "hi!", parseErrorList43, parseSettings69);
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.initialiseParse(reader22, "hi!", parseErrorList24, parseSettings69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(parseSettings50);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(parseSettings62);
        org.junit.Assert.assertNotNull(nodeList63);
        org.junit.Assert.assertNotNull(nodeList64);
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(parseSettings69);
        org.junit.Assert.assertNotNull(nodeList70);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlTreeBuilder0.parseFragment("", "", parseErrorList4, parseSettings6);
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document11 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.ParseSettings parseSettings12 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings13 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings14 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes16 = null;
        boolean boolean17 = xmlTreeBuilder0.processStartTag("hi!", attributes16);
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder21.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList25 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings27 = xmlTreeBuilder26.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlTreeBuilder21.parseFragment("hi!", "", parseErrorList25, parseSettings27);
        org.jsoup.parser.ParseSettings parseSettings29 = xmlTreeBuilder21.defaultSettings();
        org.jsoup.nodes.Attributes attributes31 = null;
        boolean boolean32 = xmlTreeBuilder21.processStartTag("hi!", attributes31);
        org.jsoup.parser.ParseErrorList parseErrorList35 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder36 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList39 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings41 = xmlTreeBuilder40.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList42 = xmlTreeBuilder36.parseFragment("hi!", "", parseErrorList39, parseSettings41);
        org.jsoup.parser.ParseSettings parseSettings43 = xmlTreeBuilder36.defaultSettings();
        org.jsoup.nodes.Attributes attributes45 = null;
        boolean boolean46 = xmlTreeBuilder36.processStartTag("hi!", attributes45);
        org.jsoup.parser.ParseErrorList parseErrorList49 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder50 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings51 = xmlTreeBuilder50.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList54 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings56 = xmlTreeBuilder55.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder50.parseFragment("", "hi!", parseErrorList54, parseSettings56);
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder36.parseFragment("hi!", "hi!", parseErrorList49, parseSettings56);
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder62 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings63 = xmlTreeBuilder62.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList66 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder67 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings68 = xmlTreeBuilder67.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList69 = xmlTreeBuilder62.parseFragment("hi!", "", parseErrorList66, parseSettings68);
        org.jsoup.parser.ParseSettings parseSettings70 = xmlTreeBuilder62.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList71 = xmlTreeBuilder36.parseFragment("", "hi!", parseErrorList61, parseSettings70);
        java.util.List<org.jsoup.nodes.Node> nodeList72 = xmlTreeBuilder21.parseFragment("", "", parseErrorList35, parseSettings70);
        org.jsoup.parser.ParseSettings parseSettings73 = xmlTreeBuilder21.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList74 = xmlTreeBuilder0.parseFragment("", "", parseErrorList20, parseSettings73);
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(nodeList42);
        org.junit.Assert.assertNotNull(parseSettings43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(parseSettings63);
        org.junit.Assert.assertNotNull(parseSettings68);
        org.junit.Assert.assertNotNull(nodeList69);
        org.junit.Assert.assertNotNull(parseSettings70);
        org.junit.Assert.assertNotNull(nodeList71);
        org.junit.Assert.assertNotNull(nodeList72);
        org.junit.Assert.assertNotNull(parseSettings73);
        org.junit.Assert.assertNotNull(nodeList74);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList4, parseSettings6);
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes10 = null;
        boolean boolean11 = xmlTreeBuilder0.processStartTag("hi!", attributes10);
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder19.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder15.parseFragment("hi!", "", parseErrorList18, parseSettings20);
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder15.defaultSettings();
        org.jsoup.nodes.Attributes attributes24 = null;
        boolean boolean25 = xmlTreeBuilder15.processStartTag("hi!", attributes24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings30 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings35 = xmlTreeBuilder34.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder29.parseFragment("", "hi!", parseErrorList33, parseSettings35);
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlTreeBuilder15.parseFragment("hi!", "hi!", parseErrorList28, parseSettings35);
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder41.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder46 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder46.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList48 = xmlTreeBuilder41.parseFragment("hi!", "", parseErrorList45, parseSettings47);
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder41.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder15.parseFragment("", "hi!", parseErrorList40, parseSettings49);
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlTreeBuilder0.parseFragment("", "", parseErrorList14, parseSettings49);
        org.jsoup.parser.ParseSettings parseSettings52 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document55 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.nodes.Document document58 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.Token.Doctype doctype59 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(document55);
        org.junit.Assert.assertNotNull(document58);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList4, parseSettings6);
        org.jsoup.nodes.Attributes attributes9 = null;
        boolean boolean10 = xmlTreeBuilder0.processStartTag("hi!", attributes9);
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Attributes attributes16 = null;
        boolean boolean17 = xmlTreeBuilder0.processStartTag("hi!", attributes16);
        org.jsoup.nodes.Document document20 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(document20);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList3, parseSettings5);
        org.jsoup.nodes.Document document9 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Document document12 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList19 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder20 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings21 = xmlTreeBuilder20.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlTreeBuilder16.parseFragment("hi!", "", parseErrorList19, parseSettings21);
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder16.defaultSettings();
        org.jsoup.nodes.Attributes attributes25 = null;
        boolean boolean26 = xmlTreeBuilder16.processStartTag("hi!", attributes25);
        org.jsoup.parser.ParseErrorList parseErrorList29 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder30 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings31 = xmlTreeBuilder30.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList34 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings36 = xmlTreeBuilder35.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlTreeBuilder30.parseFragment("", "hi!", parseErrorList34, parseSettings36);
        java.util.List<org.jsoup.nodes.Node> nodeList38 = xmlTreeBuilder16.parseFragment("hi!", "hi!", parseErrorList29, parseSettings36);
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList15, parseSettings36);
        org.jsoup.parser.ParseSettings parseSettings40 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings41 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document45 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings46 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Token.Doctype doctype47 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlTreeBuilder0.insert(doctype47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(parseSettings46);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList3, parseSettings5);
        org.jsoup.nodes.Document document9 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Document document12 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList15 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder16 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings17 = xmlTreeBuilder16.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList20 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder21 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder21.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlTreeBuilder16.parseFragment("", "hi!", parseErrorList20, parseSettings22);
        org.jsoup.nodes.Attributes attributes25 = null;
        boolean boolean26 = xmlTreeBuilder16.processStartTag("hi!", attributes25);
        org.jsoup.nodes.Document document29 = xmlTreeBuilder16.parse("hi!", "");
        org.jsoup.parser.ParseErrorList parseErrorList32 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder33 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings34 = xmlTreeBuilder33.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList37 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder38 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings39 = xmlTreeBuilder38.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlTreeBuilder33.parseFragment("hi!", "", parseErrorList37, parseSettings39);
        org.jsoup.parser.ParseSettings parseSettings41 = xmlTreeBuilder33.defaultSettings();
        org.jsoup.nodes.Attributes attributes43 = null;
        boolean boolean44 = xmlTreeBuilder33.processStartTag("hi!", attributes43);
        org.jsoup.parser.ParseErrorList parseErrorList47 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder48 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList51 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder52 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings53 = xmlTreeBuilder52.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList54 = xmlTreeBuilder48.parseFragment("hi!", "", parseErrorList51, parseSettings53);
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder48.defaultSettings();
        org.jsoup.nodes.Attributes attributes57 = null;
        boolean boolean58 = xmlTreeBuilder48.processStartTag("hi!", attributes57);
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder62 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings63 = xmlTreeBuilder62.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList66 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder67 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings68 = xmlTreeBuilder67.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList69 = xmlTreeBuilder62.parseFragment("", "hi!", parseErrorList66, parseSettings68);
        java.util.List<org.jsoup.nodes.Node> nodeList70 = xmlTreeBuilder48.parseFragment("hi!", "hi!", parseErrorList61, parseSettings68);
        org.jsoup.parser.ParseErrorList parseErrorList73 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder74 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings75 = xmlTreeBuilder74.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList78 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder79 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings80 = xmlTreeBuilder79.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList81 = xmlTreeBuilder74.parseFragment("hi!", "", parseErrorList78, parseSettings80);
        org.jsoup.parser.ParseSettings parseSettings82 = xmlTreeBuilder74.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList83 = xmlTreeBuilder48.parseFragment("", "hi!", parseErrorList73, parseSettings82);
        java.util.List<org.jsoup.nodes.Node> nodeList84 = xmlTreeBuilder33.parseFragment("", "", parseErrorList47, parseSettings82);
        org.jsoup.nodes.Document document87 = xmlTreeBuilder33.parse("", "");
        org.jsoup.parser.ParseSettings parseSettings88 = xmlTreeBuilder33.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList89 = xmlTreeBuilder16.parseFragment("", "hi!", parseErrorList32, parseSettings88);
        java.util.List<org.jsoup.nodes.Node> nodeList90 = xmlTreeBuilder0.parseFragment("", "", parseErrorList15, parseSettings88);
        org.jsoup.parser.Token.StartTag startTag91 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element92 = xmlTreeBuilder0.insert(startTag91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(parseSettings39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(parseSettings53);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(parseSettings63);
        org.junit.Assert.assertNotNull(parseSettings68);
        org.junit.Assert.assertNotNull(nodeList69);
        org.junit.Assert.assertNotNull(nodeList70);
        org.junit.Assert.assertNotNull(parseSettings75);
        org.junit.Assert.assertNotNull(parseSettings80);
        org.junit.Assert.assertNotNull(nodeList81);
        org.junit.Assert.assertNotNull(parseSettings82);
        org.junit.Assert.assertNotNull(nodeList83);
        org.junit.Assert.assertNotNull(nodeList84);
        org.junit.Assert.assertNotNull(document87);
        org.junit.Assert.assertNotNull(parseSettings88);
        org.junit.Assert.assertNotNull(nodeList89);
        org.junit.Assert.assertNotNull(nodeList90);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList3 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings5 = xmlTreeBuilder4.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList8 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder9 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings10 = xmlTreeBuilder9.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlTreeBuilder4.parseFragment("hi!", "", parseErrorList8, parseSettings10);
        org.jsoup.nodes.Document document14 = xmlTreeBuilder4.parse("", "");
        org.jsoup.nodes.Document document17 = xmlTreeBuilder4.parse("", "");
        org.jsoup.nodes.Document document20 = xmlTreeBuilder4.parse("hi!", "");
        org.jsoup.nodes.Document document23 = xmlTreeBuilder4.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings24 = xmlTreeBuilder4.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList3, parseSettings24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings30 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings35 = xmlTreeBuilder34.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder29.parseFragment("hi!", "", parseErrorList33, parseSettings35);
        org.jsoup.parser.ParseSettings parseSettings37 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.nodes.Document document40 = xmlTreeBuilder29.parse("hi!", "hi!");
        org.jsoup.nodes.Document document43 = xmlTreeBuilder29.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings44 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings45 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList48 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder49 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings50 = xmlTreeBuilder49.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList53 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder54 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings55 = xmlTreeBuilder54.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList56 = xmlTreeBuilder49.parseFragment("", "", parseErrorList53, parseSettings55);
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlTreeBuilder29.parseFragment("hi!", "", parseErrorList48, parseSettings55);
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList28, parseSettings55);
        org.jsoup.parser.ParseErrorList parseErrorList61 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder62 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings63 = xmlTreeBuilder62.defaultSettings();
        org.jsoup.nodes.Document document66 = xmlTreeBuilder62.parse("hi!", "hi!");
        org.jsoup.parser.ParseErrorList parseErrorList69 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder70 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings71 = xmlTreeBuilder70.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList72 = xmlTreeBuilder62.parseFragment("", "hi!", parseErrorList69, parseSettings71);
        java.util.List<org.jsoup.nodes.Node> nodeList73 = xmlTreeBuilder0.parseFragment("", "", parseErrorList61, parseSettings71);
        org.jsoup.nodes.Attributes attributes75 = null;
        boolean boolean76 = xmlTreeBuilder0.processStartTag("hi!", attributes75);
        org.jsoup.parser.Token token77 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean78 = xmlTreeBuilder0.process(token77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(parseSettings50);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(nodeList56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertNotNull(parseSettings63);
        org.junit.Assert.assertNotNull(document66);
        org.junit.Assert.assertNotNull(parseSettings71);
        org.junit.Assert.assertNotNull(nodeList72);
        org.junit.Assert.assertNotNull(nodeList73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList4, parseSettings6);
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes10 = null;
        boolean boolean11 = xmlTreeBuilder0.processStartTag("hi!", attributes10);
        org.jsoup.parser.ParseErrorList parseErrorList14 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder15 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList18 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings20 = xmlTreeBuilder19.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlTreeBuilder15.parseFragment("hi!", "", parseErrorList18, parseSettings20);
        org.jsoup.parser.ParseSettings parseSettings22 = xmlTreeBuilder15.defaultSettings();
        org.jsoup.nodes.Attributes attributes24 = null;
        boolean boolean25 = xmlTreeBuilder15.processStartTag("hi!", attributes24);
        org.jsoup.parser.ParseErrorList parseErrorList28 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder29 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings30 = xmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList33 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings35 = xmlTreeBuilder34.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlTreeBuilder29.parseFragment("", "hi!", parseErrorList33, parseSettings35);
        java.util.List<org.jsoup.nodes.Node> nodeList37 = xmlTreeBuilder15.parseFragment("hi!", "hi!", parseErrorList28, parseSettings35);
        org.jsoup.parser.ParseErrorList parseErrorList40 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder41 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings42 = xmlTreeBuilder41.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList45 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder46 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings47 = xmlTreeBuilder46.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList48 = xmlTreeBuilder41.parseFragment("hi!", "", parseErrorList45, parseSettings47);
        org.jsoup.parser.ParseSettings parseSettings49 = xmlTreeBuilder41.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList50 = xmlTreeBuilder15.parseFragment("", "hi!", parseErrorList40, parseSettings49);
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlTreeBuilder0.parseFragment("", "", parseErrorList14, parseSettings49);
        org.jsoup.nodes.Document document54 = xmlTreeBuilder0.parse("", "");
        org.jsoup.nodes.Attributes attributes56 = null;
        boolean boolean57 = xmlTreeBuilder0.processStartTag("hi!", attributes56);
        org.jsoup.parser.ParseErrorList parseErrorList60 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder61 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings62 = xmlTreeBuilder61.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList65 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder66 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings67 = xmlTreeBuilder66.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList68 = xmlTreeBuilder61.parseFragment("hi!", "", parseErrorList65, parseSettings67);
        org.jsoup.parser.ParseSettings parseSettings69 = xmlTreeBuilder61.defaultSettings();
        org.jsoup.nodes.Document document72 = xmlTreeBuilder61.parse("hi!", "hi!");
        org.jsoup.nodes.Document document75 = xmlTreeBuilder61.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings76 = xmlTreeBuilder61.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings77 = xmlTreeBuilder61.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList80 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder81 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings82 = xmlTreeBuilder81.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList85 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder86 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings87 = xmlTreeBuilder86.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList88 = xmlTreeBuilder81.parseFragment("", "hi!", parseErrorList85, parseSettings87);
        org.jsoup.parser.ParseSettings parseSettings89 = xmlTreeBuilder81.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList90 = xmlTreeBuilder61.parseFragment("hi!", "", parseErrorList80, parseSettings89);
        org.jsoup.parser.ParseSettings parseSettings91 = xmlTreeBuilder61.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList92 = xmlTreeBuilder0.parseFragment("", "hi!", parseErrorList60, parseSettings91);
        org.jsoup.parser.Token token93 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean94 = xmlTreeBuilder0.process(token93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertNotNull(nodeList37);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(nodeList50);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(parseSettings62);
        org.junit.Assert.assertNotNull(parseSettings67);
        org.junit.Assert.assertNotNull(nodeList68);
        org.junit.Assert.assertNotNull(parseSettings69);
        org.junit.Assert.assertNotNull(document72);
        org.junit.Assert.assertNotNull(document75);
        org.junit.Assert.assertNotNull(parseSettings76);
        org.junit.Assert.assertNotNull(parseSettings77);
        org.junit.Assert.assertNotNull(parseSettings82);
        org.junit.Assert.assertNotNull(parseSettings87);
        org.junit.Assert.assertNotNull(nodeList88);
        org.junit.Assert.assertNotNull(parseSettings89);
        org.junit.Assert.assertNotNull(nodeList90);
        org.junit.Assert.assertNotNull(parseSettings91);
        org.junit.Assert.assertNotNull(nodeList92);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings2 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList5 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings7 = xmlTreeBuilder6.defaultSettings();
        org.jsoup.parser.ParseSettings parseSettings8 = xmlTreeBuilder6.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList5, parseSettings8);
        org.jsoup.nodes.Document document12 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.nodes.Attributes attributes14 = null;
        boolean boolean15 = xmlTreeBuilder0.processStartTag("hi!", attributes14);
        org.jsoup.nodes.Document document18 = xmlTreeBuilder0.parse("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document22 = xmlTreeBuilder0.parse("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings23 = xmlTreeBuilder0.defaultSettings();
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parseSettings23);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings1 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.ParseErrorList parseErrorList4 = null;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseSettings parseSettings6 = xmlTreeBuilder5.defaultSettings();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlTreeBuilder0.parseFragment("hi!", "", parseErrorList4, parseSettings6);
        org.jsoup.nodes.Document document10 = xmlTreeBuilder0.parse("", "");
        org.jsoup.parser.ParseSettings parseSettings11 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Document document14 = xmlTreeBuilder0.parse("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings15 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes17 = null;
        boolean boolean18 = xmlTreeBuilder0.processStartTag("hi!", attributes17);
        org.jsoup.parser.ParseSettings parseSettings19 = xmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Attributes attributes21 = null;
        boolean boolean22 = xmlTreeBuilder0.processStartTag("hi!", attributes21);
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }
}

