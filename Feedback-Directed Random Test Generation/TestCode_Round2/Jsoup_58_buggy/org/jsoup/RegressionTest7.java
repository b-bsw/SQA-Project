package org.jsoup;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        org.jsoup.parser.Parser parser5 = parser3.settings(parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser3.settings(parseSettings6);
        org.jsoup.parser.Parser parser10 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("hi!", "hi!", parser10);
        org.jsoup.parser.ParseSettings parseSettings12 = parser10.settings();
        org.jsoup.parser.Parser parser13 = parser3.settings(parseSettings12);
        org.jsoup.parser.Parser parser14 = parser2.settings(parseSettings12);
        org.jsoup.parser.Parser parser15 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings16 = null;
        org.jsoup.parser.Parser parser17 = parser15.settings(parseSettings16);
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        org.jsoup.parser.Parser parser19 = parser15.settings(parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = parser15.settings();
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        org.jsoup.parser.Parser parser22 = parser15.settings(parseSettings21);
        org.jsoup.nodes.Document document25 = parser15.parseInput("", "hi!");
        org.jsoup.nodes.Document document28 = parser15.parseInput("", "hi!");
        org.jsoup.parser.Parser parser29 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings30 = null;
        org.jsoup.parser.Parser parser31 = parser29.settings(parseSettings30);
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        org.jsoup.parser.Parser parser33 = parser29.settings(parseSettings32);
        org.jsoup.parser.Parser parser34 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings35 = null;
        org.jsoup.parser.Parser parser36 = parser34.settings(parseSettings35);
        org.jsoup.nodes.Document document39 = parser36.parseInput("", "hi!");
        org.jsoup.parser.Parser parser42 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document43 = org.jsoup.Jsoup.parse("hi!", "hi!", parser42);
        org.jsoup.parser.ParseSettings parseSettings44 = parser42.settings();
        org.jsoup.parser.Parser parser45 = parser36.settings(parseSettings44);
        org.jsoup.parser.Parser parser46 = parser33.settings(parseSettings44);
        org.jsoup.parser.ParseSettings parseSettings47 = parser33.settings();
        org.jsoup.parser.Parser parser48 = parser15.settings(parseSettings47);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList49 = parser48.getErrors();
        org.jsoup.parser.Parser parser50 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings51 = null;
        org.jsoup.parser.Parser parser52 = parser50.settings(parseSettings51);
        org.jsoup.nodes.Document document55 = parser52.parseInput("", "hi!");
        org.jsoup.parser.Parser parser58 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document59 = org.jsoup.Jsoup.parse("hi!", "hi!", parser58);
        org.jsoup.parser.ParseSettings parseSettings60 = parser58.settings();
        org.jsoup.parser.Parser parser61 = parser52.settings(parseSettings60);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList62 = parser61.getErrors();
        org.jsoup.parser.Parser parser63 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings64 = parser63.settings();
        org.jsoup.parser.Parser parser65 = parser61.settings(parseSettings64);
        org.jsoup.parser.Parser parser66 = parser48.settings(parseSettings64);
        org.jsoup.parser.ParseSettings parseSettings67 = parser66.settings();
        org.jsoup.parser.Parser parser68 = parser2.settings(parseSettings67);
        org.jsoup.parser.Parser parser70 = parser2.setTrackErrors(0);
        org.jsoup.nodes.Document document73 = parser2.parseInput("", "hi!");
        org.jsoup.parser.Parser parser76 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document77 = org.jsoup.Jsoup.parse("", "hi!", parser76);
        org.jsoup.parser.Parser parser79 = parser76.setTrackErrors(10);
        org.jsoup.parser.Parser parser81 = parser76.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser83 = parser76.setTrackErrors((int) (short) 1);
        org.jsoup.parser.Parser parser85 = parser76.setTrackErrors(100);
        org.jsoup.parser.Parser parser87 = parser76.setTrackErrors(100);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList88 = parser76.getErrors();
        boolean boolean89 = parser76.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings90 = parser76.settings();
        org.jsoup.parser.Parser parser91 = parser2.settings(parseSettings90);
        boolean boolean92 = parser91.isTrackErrors();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNull(parseSettings20);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(parser48);
        org.junit.Assert.assertNotNull(parseErrorList49);
        org.junit.Assert.assertNotNull(parser50);
        org.junit.Assert.assertNotNull(parser52);
        org.junit.Assert.assertNotNull(document55);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertNotNull(document59);
        org.junit.Assert.assertNotNull(parseSettings60);
        org.junit.Assert.assertNotNull(parser61);
        org.junit.Assert.assertNotNull(parseErrorList62);
        org.junit.Assert.assertNotNull(parser63);
        org.junit.Assert.assertNotNull(parseSettings64);
        org.junit.Assert.assertNotNull(parser65);
        org.junit.Assert.assertNotNull(parser66);
        org.junit.Assert.assertNotNull(parseSettings67);
        org.junit.Assert.assertNotNull(parser68);
        org.junit.Assert.assertNotNull(parser70);
        org.junit.Assert.assertNotNull(document73);
        org.junit.Assert.assertNotNull(parser76);
        org.junit.Assert.assertNotNull(document77);
        org.junit.Assert.assertNotNull(parser79);
        org.junit.Assert.assertNotNull(parser81);
        org.junit.Assert.assertNotNull(parser83);
        org.junit.Assert.assertNotNull(parser85);
        org.junit.Assert.assertNotNull(parser87);
        org.junit.Assert.assertNotNull(parseErrorList88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(parseSettings90);
        org.junit.Assert.assertNotNull(parser91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser2.settings(parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = parser2.settings();
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser2.settings(parseSettings8);
        org.jsoup.nodes.Document document12 = parser2.parseInput("", "hi!");
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "", parser2);
        org.jsoup.parser.ParseSettings parseSettings14 = parser2.settings();
        org.jsoup.parser.Parser parser15 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList16 = parser15.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList17 = parser15.getErrors();
        org.jsoup.parser.ParseSettings parseSettings18 = parser15.settings();
        org.jsoup.parser.ParseSettings parseSettings19 = parser15.settings();
        org.jsoup.parser.Parser parser20 = parser2.settings(parseSettings19);
        org.jsoup.parser.ParseSettings parseSettings21 = parser2.settings();
        org.jsoup.parser.Parser parser24 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings25 = null;
        org.jsoup.parser.Parser parser26 = parser24.settings(parseSettings25);
        org.jsoup.parser.Parser parser27 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings28 = null;
        org.jsoup.parser.Parser parser29 = parser27.settings(parseSettings28);
        org.jsoup.parser.ParseSettings parseSettings30 = null;
        org.jsoup.parser.Parser parser31 = parser27.settings(parseSettings30);
        org.jsoup.parser.Parser parser34 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document35 = org.jsoup.Jsoup.parse("hi!", "hi!", parser34);
        org.jsoup.parser.ParseSettings parseSettings36 = parser34.settings();
        org.jsoup.parser.Parser parser37 = parser27.settings(parseSettings36);
        org.jsoup.parser.Parser parser38 = parser26.settings(parseSettings36);
        org.jsoup.nodes.Document document39 = org.jsoup.Jsoup.parse("", "", parser38);
        org.jsoup.parser.ParseSettings parseSettings40 = parser38.settings();
        org.jsoup.parser.Parser parser41 = parser2.settings(parseSettings40);
        org.jsoup.parser.Parser parser43 = parser2.setTrackErrors((int) (byte) 100);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList44 = parser43.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList45 = parser43.getErrors();
        org.jsoup.parser.ParseSettings parseSettings46 = parser43.settings();
        org.jsoup.parser.Parser parser51 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document52 = org.jsoup.Jsoup.parse("hi!", "hi!", parser51);
        org.jsoup.nodes.Document document53 = org.jsoup.Jsoup.parse("hi!", "", parser51);
        org.jsoup.nodes.Document document56 = parser51.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings57 = parser51.settings();
        org.jsoup.parser.Parser parser59 = parser51.setTrackErrors((int) (short) 100);
        org.jsoup.parser.Parser parser61 = parser51.setTrackErrors((int) (byte) 100);
        org.jsoup.parser.Parser parser64 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document65 = org.jsoup.Jsoup.parse("hi!", "hi!", parser64);
        org.jsoup.parser.Parser parser66 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings67 = null;
        org.jsoup.parser.Parser parser68 = parser66.settings(parseSettings67);
        org.jsoup.nodes.Document document71 = parser68.parseInput("", "hi!");
        org.jsoup.parser.Parser parser74 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document75 = org.jsoup.Jsoup.parse("hi!", "hi!", parser74);
        org.jsoup.parser.ParseSettings parseSettings76 = parser74.settings();
        org.jsoup.parser.Parser parser77 = parser68.settings(parseSettings76);
        org.jsoup.parser.Parser parser78 = parser64.settings(parseSettings76);
        org.jsoup.nodes.Document document81 = parser78.parseInput("", "");
        org.jsoup.parser.ParseSettings parseSettings82 = parser78.settings();
        org.jsoup.parser.Parser parser83 = parser61.settings(parseSettings82);
        org.jsoup.parser.Parser parser84 = parser43.settings(parseSettings82);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNull(parseSettings7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNull(parseErrorList16);
        org.junit.Assert.assertNull(parseErrorList17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(parser41);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(parseErrorList44);
        org.junit.Assert.assertNotNull(parseErrorList45);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNotNull(document56);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(parser59);
        org.junit.Assert.assertNotNull(parser61);
        org.junit.Assert.assertNotNull(parser64);
        org.junit.Assert.assertNotNull(document65);
        org.junit.Assert.assertNotNull(parser66);
        org.junit.Assert.assertNotNull(parser68);
        org.junit.Assert.assertNotNull(document71);
        org.junit.Assert.assertNotNull(parser74);
        org.junit.Assert.assertNotNull(document75);
        org.junit.Assert.assertNotNull(parseSettings76);
        org.junit.Assert.assertNotNull(parser77);
        org.junit.Assert.assertNotNull(parser78);
        org.junit.Assert.assertNotNull(document81);
        org.junit.Assert.assertNotNull(parseSettings82);
        org.junit.Assert.assertNotNull(parser83);
        org.junit.Assert.assertNotNull(parser84);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        org.jsoup.parser.Parser parser5 = parser3.settings(parseSettings4);
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse("hi!", "", parser5);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList7 = parser5.getErrors();
        boolean boolean8 = parser5.isTrackErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList9 = parser5.getErrors();
        org.jsoup.nodes.Document document12 = parser5.parseInput("", "");
        org.jsoup.parser.Parser parser15 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parse("hi!", "hi!", parser15);
        org.jsoup.parser.Parser parser17 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        org.jsoup.parser.Parser parser19 = parser17.settings(parseSettings18);
        org.jsoup.nodes.Document document22 = parser19.parseInput("", "hi!");
        org.jsoup.parser.Parser parser25 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parse("hi!", "hi!", parser25);
        org.jsoup.parser.ParseSettings parseSettings27 = parser25.settings();
        org.jsoup.parser.Parser parser28 = parser19.settings(parseSettings27);
        org.jsoup.parser.Parser parser29 = parser15.settings(parseSettings27);
        org.jsoup.parser.Parser parser31 = parser15.setTrackErrors((int) ' ');
        org.jsoup.nodes.Document document34 = parser15.parseInput("", "hi!");
        org.jsoup.nodes.Document document37 = parser15.parseInput("hi!", "hi!");
        boolean boolean38 = parser15.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings39 = parser15.settings();
        org.jsoup.parser.Parser parser40 = parser5.settings(parseSettings39);
        org.jsoup.nodes.Document document43 = parser40.parseInput("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList45 = org.jsoup.parser.Parser.parseFragment("", (org.jsoup.nodes.Element) document43, "");
        java.lang.Class<?> wildcardClass46 = nodeList45.getClass();
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(parseErrorList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parseErrorList9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(parseSettings39);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse("", "hi!", parser5);
        org.jsoup.parser.ParseSettings parseSettings7 = parser5.settings();
        org.jsoup.parser.ParseSettings parseSettings8 = parser5.settings();
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parse("hi!", "", parser5);
        org.jsoup.nodes.Document document12 = parser5.parseInput("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = org.jsoup.parser.Parser.parseFragment("", (org.jsoup.nodes.Element) document12, "");
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.jsoup.parser.Parser parser1 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings2 = null;
        org.jsoup.parser.Parser parser3 = parser1.settings(parseSettings2);
        org.jsoup.nodes.Document document6 = parser3.parseInput("", "hi!");
        org.jsoup.parser.Parser parser9 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse("hi!", "hi!", parser9);
        org.jsoup.parser.ParseSettings parseSettings11 = parser9.settings();
        org.jsoup.parser.Parser parser12 = parser3.settings(parseSettings11);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList13 = parser12.getErrors();
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings15 = parser14.settings();
        org.jsoup.parser.Parser parser16 = parser12.settings(parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = parser12.settings();
        org.jsoup.parser.Parser parser19 = parser12.setTrackErrors((int) (byte) 100);
        org.jsoup.parser.Parser parser21 = parser12.setTrackErrors((int) (byte) 0);
        org.jsoup.nodes.Document document24 = parser12.parseInput("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = org.jsoup.parser.Parser.parseFragment("", (org.jsoup.nodes.Element) document24, "");
        org.junit.Assert.assertNotNull(parser1);
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parseErrorList13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(nodeList26);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = parser0.parseInput("", "");
        org.jsoup.parser.Parser parser5 = parser0.setTrackErrors((int) ' ');
        boolean boolean6 = parser5.isTrackErrors();
        boolean boolean7 = parser5.isTrackErrors();
        org.jsoup.parser.Parser parser9 = parser5.setTrackErrors((int) 'a');
        boolean boolean10 = parser5.isTrackErrors();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        org.jsoup.parser.Parser parser5 = parser3.settings(parseSettings4);
        org.jsoup.nodes.Document document8 = parser5.parseInput("", "hi!");
        org.jsoup.parser.Parser parser11 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parse("hi!", "hi!", parser11);
        org.jsoup.parser.ParseSettings parseSettings13 = parser11.settings();
        org.jsoup.parser.Parser parser14 = parser5.settings(parseSettings13);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList15 = parser14.getErrors();
        org.jsoup.parser.Parser parser16 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings17 = parser16.settings();
        org.jsoup.parser.Parser parser18 = parser14.settings(parseSettings17);
        org.jsoup.parser.ParseSettings parseSettings19 = parser14.settings();
        org.jsoup.parser.Parser parser21 = parser14.setTrackErrors((int) (byte) 100);
        org.jsoup.parser.Parser parser23 = parser14.setTrackErrors((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parse(inputStream0, "hi!", "", parser23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parseErrorList15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(parser23);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList6 = parser5.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList7 = parser5.getErrors();
        org.jsoup.parser.ParseSettings parseSettings8 = parser5.settings();
        org.jsoup.parser.ParseSettings parseSettings9 = parser5.settings();
        org.jsoup.parser.ParseSettings parseSettings10 = parser5.settings();
        org.jsoup.parser.Parser parser12 = parser5.setTrackErrors((int) (byte) -1);
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("", "hi!", parser12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parse(inputStream0, "", "hi!", parser12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNull(parseErrorList6);
        org.junit.Assert.assertNull(parseErrorList7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        org.jsoup.parser.Parser parser5 = parser3.settings(parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser3.settings(parseSettings6);
        org.jsoup.parser.Parser parser10 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("hi!", "hi!", parser10);
        org.jsoup.parser.ParseSettings parseSettings12 = parser10.settings();
        org.jsoup.parser.Parser parser13 = parser3.settings(parseSettings12);
        org.jsoup.parser.Parser parser14 = parser2.settings(parseSettings12);
        org.jsoup.parser.Parser parser15 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings16 = null;
        org.jsoup.parser.Parser parser17 = parser15.settings(parseSettings16);
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        org.jsoup.parser.Parser parser19 = parser15.settings(parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = parser15.settings();
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        org.jsoup.parser.Parser parser22 = parser15.settings(parseSettings21);
        org.jsoup.nodes.Document document25 = parser15.parseInput("", "hi!");
        org.jsoup.nodes.Document document28 = parser15.parseInput("", "hi!");
        org.jsoup.parser.Parser parser29 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings30 = null;
        org.jsoup.parser.Parser parser31 = parser29.settings(parseSettings30);
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        org.jsoup.parser.Parser parser33 = parser29.settings(parseSettings32);
        org.jsoup.parser.Parser parser34 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings35 = null;
        org.jsoup.parser.Parser parser36 = parser34.settings(parseSettings35);
        org.jsoup.nodes.Document document39 = parser36.parseInput("", "hi!");
        org.jsoup.parser.Parser parser42 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document43 = org.jsoup.Jsoup.parse("hi!", "hi!", parser42);
        org.jsoup.parser.ParseSettings parseSettings44 = parser42.settings();
        org.jsoup.parser.Parser parser45 = parser36.settings(parseSettings44);
        org.jsoup.parser.Parser parser46 = parser33.settings(parseSettings44);
        org.jsoup.parser.ParseSettings parseSettings47 = parser33.settings();
        org.jsoup.parser.Parser parser48 = parser15.settings(parseSettings47);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList49 = parser48.getErrors();
        org.jsoup.parser.Parser parser50 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings51 = null;
        org.jsoup.parser.Parser parser52 = parser50.settings(parseSettings51);
        org.jsoup.nodes.Document document55 = parser52.parseInput("", "hi!");
        org.jsoup.parser.Parser parser58 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document59 = org.jsoup.Jsoup.parse("hi!", "hi!", parser58);
        org.jsoup.parser.ParseSettings parseSettings60 = parser58.settings();
        org.jsoup.parser.Parser parser61 = parser52.settings(parseSettings60);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList62 = parser61.getErrors();
        org.jsoup.parser.Parser parser63 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings64 = parser63.settings();
        org.jsoup.parser.Parser parser65 = parser61.settings(parseSettings64);
        org.jsoup.parser.Parser parser66 = parser48.settings(parseSettings64);
        org.jsoup.parser.ParseSettings parseSettings67 = parser66.settings();
        org.jsoup.parser.Parser parser68 = parser2.settings(parseSettings67);
        org.jsoup.parser.Parser parser70 = parser68.setTrackErrors((-1));
        org.jsoup.parser.Parser parser72 = parser70.setTrackErrors(100);
        org.jsoup.parser.ParseSettings parseSettings73 = parser72.settings();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList74 = parser72.getErrors();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNull(parseSettings20);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(parser48);
        org.junit.Assert.assertNotNull(parseErrorList49);
        org.junit.Assert.assertNotNull(parser50);
        org.junit.Assert.assertNotNull(parser52);
        org.junit.Assert.assertNotNull(document55);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertNotNull(document59);
        org.junit.Assert.assertNotNull(parseSettings60);
        org.junit.Assert.assertNotNull(parser61);
        org.junit.Assert.assertNotNull(parseErrorList62);
        org.junit.Assert.assertNotNull(parser63);
        org.junit.Assert.assertNotNull(parseSettings64);
        org.junit.Assert.assertNotNull(parser65);
        org.junit.Assert.assertNotNull(parser66);
        org.junit.Assert.assertNotNull(parseSettings67);
        org.junit.Assert.assertNotNull(parser68);
        org.junit.Assert.assertNotNull(parser70);
        org.junit.Assert.assertNotNull(parser72);
        org.junit.Assert.assertNotNull(parseSettings73);
        org.junit.Assert.assertNull(parseErrorList74);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser0.settings(parseSettings3);
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser5.settings(parseSettings6);
        org.jsoup.nodes.Document document10 = parser7.parseInput("", "hi!");
        org.jsoup.parser.Parser parser13 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parse("hi!", "hi!", parser13);
        org.jsoup.parser.ParseSettings parseSettings15 = parser13.settings();
        org.jsoup.parser.Parser parser16 = parser7.settings(parseSettings15);
        org.jsoup.parser.Parser parser17 = parser4.settings(parseSettings15);
        boolean boolean18 = parser17.isTrackErrors();
        boolean boolean19 = parser17.isTrackErrors();
        org.jsoup.nodes.Document document22 = parser17.parseInput("hi!", "");
        java.util.List<org.jsoup.parser.ParseError> parseErrorList23 = parser17.getErrors();
        org.jsoup.parser.Parser parser24 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings25 = null;
        org.jsoup.parser.Parser parser26 = parser24.settings(parseSettings25);
        org.jsoup.nodes.Document document29 = parser26.parseInput("", "hi!");
        boolean boolean30 = parser26.isTrackErrors();
        org.jsoup.parser.Parser parser32 = parser26.setTrackErrors((int) '#');
        boolean boolean33 = parser32.isTrackErrors();
        org.jsoup.parser.Parser parser34 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings35 = null;
        org.jsoup.parser.Parser parser36 = parser34.settings(parseSettings35);
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        org.jsoup.parser.Parser parser38 = parser34.settings(parseSettings37);
        org.jsoup.parser.Parser parser41 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document42 = org.jsoup.Jsoup.parse("hi!", "hi!", parser41);
        org.jsoup.parser.ParseSettings parseSettings43 = parser41.settings();
        org.jsoup.parser.Parser parser44 = parser34.settings(parseSettings43);
        boolean boolean45 = parser34.isTrackErrors();
        org.jsoup.parser.Parser parser48 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings49 = null;
        org.jsoup.parser.Parser parser50 = parser48.settings(parseSettings49);
        org.jsoup.parser.Parser parser51 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings52 = null;
        org.jsoup.parser.Parser parser53 = parser51.settings(parseSettings52);
        org.jsoup.parser.ParseSettings parseSettings54 = null;
        org.jsoup.parser.Parser parser55 = parser51.settings(parseSettings54);
        org.jsoup.parser.Parser parser58 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document59 = org.jsoup.Jsoup.parse("hi!", "hi!", parser58);
        org.jsoup.parser.ParseSettings parseSettings60 = parser58.settings();
        org.jsoup.parser.Parser parser61 = parser51.settings(parseSettings60);
        org.jsoup.parser.Parser parser62 = parser50.settings(parseSettings60);
        org.jsoup.nodes.Document document63 = org.jsoup.Jsoup.parse("", "", parser62);
        org.jsoup.parser.ParseSettings parseSettings64 = parser62.settings();
        org.jsoup.parser.Parser parser65 = parser34.settings(parseSettings64);
        org.jsoup.parser.Parser parser66 = parser32.settings(parseSettings64);
        org.jsoup.parser.Parser parser69 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document70 = org.jsoup.Jsoup.parse("hi!", "hi!", parser69);
        org.jsoup.parser.ParseSettings parseSettings71 = parser69.settings();
        org.jsoup.parser.Parser parser76 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document77 = org.jsoup.Jsoup.parse("", "hi!", parser76);
        org.jsoup.parser.Parser parser79 = parser76.setTrackErrors(10);
        org.jsoup.parser.Parser parser81 = parser79.setTrackErrors(10);
        boolean boolean82 = parser81.isTrackErrors();
        org.jsoup.nodes.Document document83 = org.jsoup.Jsoup.parse("", "hi!", parser81);
        org.jsoup.parser.ParseSettings parseSettings84 = parser81.settings();
        org.jsoup.parser.Parser parser85 = parser69.settings(parseSettings84);
        org.jsoup.parser.ParseSettings parseSettings86 = parser85.settings();
        org.jsoup.parser.Parser parser87 = parser32.settings(parseSettings86);
        org.jsoup.parser.Parser parser88 = parser17.settings(parseSettings86);
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parseErrorList23);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(parser41);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(parseSettings43);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(parser48);
        org.junit.Assert.assertNotNull(parser50);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertNotNull(parser53);
        org.junit.Assert.assertNotNull(parser55);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertNotNull(document59);
        org.junit.Assert.assertNotNull(parseSettings60);
        org.junit.Assert.assertNotNull(parser61);
        org.junit.Assert.assertNotNull(parser62);
        org.junit.Assert.assertNotNull(document63);
        org.junit.Assert.assertNotNull(parseSettings64);
        org.junit.Assert.assertNotNull(parser65);
        org.junit.Assert.assertNotNull(parser66);
        org.junit.Assert.assertNotNull(parser69);
        org.junit.Assert.assertNotNull(document70);
        org.junit.Assert.assertNotNull(parseSettings71);
        org.junit.Assert.assertNotNull(parser76);
        org.junit.Assert.assertNotNull(document77);
        org.junit.Assert.assertNotNull(parser79);
        org.junit.Assert.assertNotNull(parser81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(document83);
        org.junit.Assert.assertNotNull(parseSettings84);
        org.junit.Assert.assertNotNull(parser85);
        org.junit.Assert.assertNotNull(parseSettings86);
        org.junit.Assert.assertNotNull(parser87);
        org.junit.Assert.assertNotNull(parser88);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.nodes.Document document5 = parser2.parseInput("", "hi!");
        boolean boolean6 = parser2.isTrackErrors();
        org.jsoup.parser.Parser parser8 = parser2.setTrackErrors((int) (short) 1);
        org.jsoup.parser.Parser parser10 = parser8.setTrackErrors((int) (byte) 100);
        org.jsoup.parser.Parser parser12 = parser10.setTrackErrors((int) ' ');
        java.util.List<org.jsoup.parser.ParseError> parseErrorList13 = parser10.getErrors();
        org.jsoup.parser.Parser parser18 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        org.jsoup.parser.Parser parser20 = parser18.settings(parseSettings19);
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("hi!", "", parser20);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList22 = parser20.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList23 = parser20.getErrors();
        org.jsoup.nodes.Document document26 = parser20.parseInput("hi!", "");
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parse("hi!", "", parser20);
        org.jsoup.parser.Parser parser29 = parser20.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser32 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        org.jsoup.parser.Parser parser34 = parser32.settings(parseSettings33);
        org.jsoup.nodes.Document document37 = parser34.parseInput("", "hi!");
        org.jsoup.parser.Parser parser40 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document41 = org.jsoup.Jsoup.parse("hi!", "hi!", parser40);
        org.jsoup.parser.ParseSettings parseSettings42 = parser40.settings();
        org.jsoup.parser.Parser parser43 = parser34.settings(parseSettings42);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList44 = parser43.getErrors();
        org.jsoup.nodes.Document document47 = parser43.parseInput("hi!", "hi!");
        org.jsoup.parser.Parser parser49 = parser43.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document50 = org.jsoup.Jsoup.parse("", "", parser43);
        org.jsoup.parser.Parser parser53 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document54 = org.jsoup.Jsoup.parse("", "hi!", parser53);
        org.jsoup.parser.Parser parser56 = parser53.setTrackErrors(10);
        org.jsoup.parser.Parser parser58 = parser56.setTrackErrors(10);
        boolean boolean59 = parser56.isTrackErrors();
        org.jsoup.parser.Parser parser60 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings61 = null;
        org.jsoup.parser.Parser parser62 = parser60.settings(parseSettings61);
        org.jsoup.parser.ParseSettings parseSettings63 = null;
        org.jsoup.parser.Parser parser64 = parser60.settings(parseSettings63);
        org.jsoup.parser.Parser parser67 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document68 = org.jsoup.Jsoup.parse("hi!", "hi!", parser67);
        org.jsoup.parser.ParseSettings parseSettings69 = parser67.settings();
        org.jsoup.parser.Parser parser70 = parser60.settings(parseSettings69);
        boolean boolean71 = parser60.isTrackErrors();
        org.jsoup.parser.Parser parser74 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings75 = null;
        org.jsoup.parser.Parser parser76 = parser74.settings(parseSettings75);
        org.jsoup.parser.Parser parser77 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings78 = null;
        org.jsoup.parser.Parser parser79 = parser77.settings(parseSettings78);
        org.jsoup.parser.ParseSettings parseSettings80 = null;
        org.jsoup.parser.Parser parser81 = parser77.settings(parseSettings80);
        org.jsoup.parser.Parser parser84 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document85 = org.jsoup.Jsoup.parse("hi!", "hi!", parser84);
        org.jsoup.parser.ParseSettings parseSettings86 = parser84.settings();
        org.jsoup.parser.Parser parser87 = parser77.settings(parseSettings86);
        org.jsoup.parser.Parser parser88 = parser76.settings(parseSettings86);
        org.jsoup.nodes.Document document89 = org.jsoup.Jsoup.parse("", "", parser88);
        org.jsoup.parser.ParseSettings parseSettings90 = parser88.settings();
        org.jsoup.parser.Parser parser91 = parser60.settings(parseSettings90);
        org.jsoup.parser.Parser parser92 = parser56.settings(parseSettings90);
        org.jsoup.parser.Parser parser93 = parser43.settings(parseSettings90);
        org.jsoup.parser.Parser parser94 = parser29.settings(parseSettings90);
        org.jsoup.parser.Parser parser95 = parser10.settings(parseSettings90);
        org.jsoup.parser.Parser parser97 = parser95.setTrackErrors((int) (byte) 1);
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parseErrorList13);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(parseErrorList22);
        org.junit.Assert.assertNotNull(parseErrorList23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(parseErrorList44);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(parser53);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNotNull(parser56);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(parser60);
        org.junit.Assert.assertNotNull(parser62);
        org.junit.Assert.assertNotNull(parser64);
        org.junit.Assert.assertNotNull(parser67);
        org.junit.Assert.assertNotNull(document68);
        org.junit.Assert.assertNotNull(parseSettings69);
        org.junit.Assert.assertNotNull(parser70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(parser74);
        org.junit.Assert.assertNotNull(parser76);
        org.junit.Assert.assertNotNull(parser77);
        org.junit.Assert.assertNotNull(parser79);
        org.junit.Assert.assertNotNull(parser81);
        org.junit.Assert.assertNotNull(parser84);
        org.junit.Assert.assertNotNull(document85);
        org.junit.Assert.assertNotNull(parseSettings86);
        org.junit.Assert.assertNotNull(parser87);
        org.junit.Assert.assertNotNull(parser88);
        org.junit.Assert.assertNotNull(document89);
        org.junit.Assert.assertNotNull(parseSettings90);
        org.junit.Assert.assertNotNull(parser91);
        org.junit.Assert.assertNotNull(parser92);
        org.junit.Assert.assertNotNull(parser93);
        org.junit.Assert.assertNotNull(parser94);
        org.junit.Assert.assertNotNull(parser95);
        org.junit.Assert.assertNotNull(parser97);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser7 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parse("", "hi!", parser7);
        org.jsoup.parser.Parser parser10 = parser7.setTrackErrors(10);
        org.jsoup.parser.Parser parser12 = parser7.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser14 = parser7.setTrackErrors((int) (short) 1);
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("hi!", "", parser14);
        org.jsoup.parser.Parser parser17 = parser14.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser19 = parser14.setTrackErrors(1);
        org.jsoup.parser.Parser parser21 = parser14.setTrackErrors((int) (short) -1);
        org.jsoup.nodes.Document document24 = parser21.parseInput("", "");
        org.jsoup.parser.Parser parser25 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        org.jsoup.parser.Parser parser27 = parser25.settings(parseSettings26);
        org.jsoup.parser.ParseSettings parseSettings28 = null;
        org.jsoup.parser.Parser parser29 = parser25.settings(parseSettings28);
        org.jsoup.parser.ParseSettings parseSettings30 = parser25.settings();
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        org.jsoup.parser.Parser parser32 = parser25.settings(parseSettings31);
        org.jsoup.nodes.Document document35 = parser25.parseInput("", "hi!");
        org.jsoup.parser.Parser parser42 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document43 = org.jsoup.Jsoup.parse("hi!", "hi!", parser42);
        org.jsoup.nodes.Document document44 = org.jsoup.Jsoup.parse("hi!", "", parser42);
        org.jsoup.nodes.Document document47 = parser42.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings48 = parser42.settings();
        org.jsoup.parser.Parser parser50 = parser42.setTrackErrors((int) (short) 100);
        org.jsoup.nodes.Document document51 = org.jsoup.Jsoup.parse("hi!", "hi!", parser42);
        org.jsoup.parser.ParseSettings parseSettings52 = parser42.settings();
        org.jsoup.parser.Parser parser53 = parser25.settings(parseSettings52);
        org.jsoup.parser.Parser parser54 = parser21.settings(parseSettings52);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document55 = org.jsoup.Jsoup.parse(inputStream0, "", "hi!", parser54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNull(parseSettings30);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(parser50);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(parser53);
        org.junit.Assert.assertNotNull(parser54);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("hi!", "", parser4);
        org.jsoup.nodes.Document document10 = parser4.parseInput("hi!", "hi!");
        java.util.List<org.jsoup.parser.ParseError> parseErrorList11 = parser4.getErrors();
        boolean boolean12 = parser4.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings13 = parser4.settings();
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parse("", "hi!", parser4);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parseErrorList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(parseSettings13);
        org.junit.Assert.assertNotNull(document14);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("hi!", "hi!", parser6);
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parse("hi!", "", parser6);
        org.jsoup.nodes.Document document11 = parser6.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings12 = parser6.settings();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("", "", parser6);
        org.jsoup.parser.Parser parser18 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parse("", "hi!", parser18);
        org.jsoup.parser.Parser parser21 = parser18.setTrackErrors(10);
        org.jsoup.parser.Parser parser23 = parser21.setTrackErrors(10);
        boolean boolean24 = parser23.isTrackErrors();
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parse("", "hi!", parser23);
        org.jsoup.parser.ParseSettings parseSettings26 = parser23.settings();
        org.jsoup.parser.Parser parser27 = parser6.settings(parseSettings26);
        org.jsoup.parser.Parser parser32 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parse("hi!", "hi!", parser32);
        org.jsoup.nodes.Document document34 = org.jsoup.Jsoup.parse("hi!", "", parser32);
        org.jsoup.nodes.Document document37 = parser32.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings38 = parser32.settings();
        org.jsoup.parser.Parser parser40 = parser32.setTrackErrors((int) (short) 100);
        org.jsoup.parser.ParseSettings parseSettings41 = parser32.settings();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList42 = parser32.getErrors();
        org.jsoup.parser.Parser parser45 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document46 = org.jsoup.Jsoup.parse("hi!", "hi!", parser45);
        org.jsoup.parser.Parser parser47 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings48 = null;
        org.jsoup.parser.Parser parser49 = parser47.settings(parseSettings48);
        org.jsoup.nodes.Document document52 = parser49.parseInput("", "hi!");
        org.jsoup.parser.Parser parser55 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document56 = org.jsoup.Jsoup.parse("hi!", "hi!", parser55);
        org.jsoup.parser.ParseSettings parseSettings57 = parser55.settings();
        org.jsoup.parser.Parser parser58 = parser49.settings(parseSettings57);
        org.jsoup.parser.Parser parser59 = parser45.settings(parseSettings57);
        org.jsoup.parser.Parser parser61 = parser45.setTrackErrors((int) ' ');
        java.util.List<org.jsoup.parser.ParseError> parseErrorList62 = parser61.getErrors();
        org.jsoup.parser.ParseSettings parseSettings63 = parser61.settings();
        org.jsoup.parser.Parser parser64 = parser32.settings(parseSettings63);
        org.jsoup.parser.Parser parser65 = parser6.settings(parseSettings63);
        org.jsoup.parser.Parser parser67 = parser6.setTrackErrors((int) (short) 1);
        java.lang.Class<?> wildcardClass68 = parser6.getClass();
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(parseErrorList42);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNotNull(parser47);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNotNull(parser55);
        org.junit.Assert.assertNotNull(document56);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertNotNull(parser59);
        org.junit.Assert.assertNotNull(parser61);
        org.junit.Assert.assertNotNull(parseErrorList62);
        org.junit.Assert.assertNotNull(parseSettings63);
        org.junit.Assert.assertNotNull(parser64);
        org.junit.Assert.assertNotNull(parser65);
        org.junit.Assert.assertNotNull(parser67);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("", "hi!", parser2);
        org.jsoup.parser.Parser parser5 = parser2.setTrackErrors(10);
        org.jsoup.parser.Parser parser7 = parser2.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser9 = parser2.setTrackErrors((int) (short) 1);
        org.jsoup.parser.Parser parser11 = parser2.setTrackErrors(100);
        org.jsoup.parser.Parser parser13 = parser2.setTrackErrors(100);
        org.jsoup.parser.ParseSettings parseSettings14 = parser13.settings();
        org.jsoup.parser.Parser parser16 = parser13.setTrackErrors((int) '4');
        org.jsoup.nodes.Document document19 = parser13.parseInput("", "");
        org.jsoup.parser.ParseSettings parseSettings20 = parser13.settings();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList21 = parser13.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList22 = parser13.getErrors();
        org.jsoup.parser.Parser parser25 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList26 = parser25.getErrors();
        org.jsoup.parser.Parser parser28 = parser25.setTrackErrors((int) (short) 100);
        org.jsoup.nodes.Document document29 = org.jsoup.Jsoup.parse("hi!", "hi!", parser28);
        org.jsoup.parser.Parser parser30 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        org.jsoup.parser.Parser parser32 = parser30.settings(parseSettings31);
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        org.jsoup.parser.Parser parser34 = parser30.settings(parseSettings33);
        org.jsoup.parser.ParseSettings parseSettings35 = parser30.settings();
        org.jsoup.parser.ParseSettings parseSettings36 = null;
        org.jsoup.parser.Parser parser37 = parser30.settings(parseSettings36);
        org.jsoup.nodes.Document document40 = parser30.parseInput("", "hi!");
        org.jsoup.nodes.Document document43 = parser30.parseInput("", "hi!");
        org.jsoup.parser.Parser parser44 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings45 = null;
        org.jsoup.parser.Parser parser46 = parser44.settings(parseSettings45);
        org.jsoup.parser.ParseSettings parseSettings47 = null;
        org.jsoup.parser.Parser parser48 = parser44.settings(parseSettings47);
        org.jsoup.parser.Parser parser51 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document52 = org.jsoup.Jsoup.parse("hi!", "hi!", parser51);
        org.jsoup.parser.ParseSettings parseSettings53 = parser51.settings();
        org.jsoup.parser.Parser parser54 = parser44.settings(parseSettings53);
        org.jsoup.parser.Parser parser55 = parser30.settings(parseSettings53);
        org.jsoup.nodes.Document document58 = parser30.parseInput("", "hi!");
        java.util.List<org.jsoup.parser.ParseError> parseErrorList59 = parser30.getErrors();
        org.jsoup.parser.ParseSettings parseSettings60 = parser30.settings();
        org.jsoup.parser.ParseSettings parseSettings61 = parser30.settings();
        org.jsoup.parser.Parser parser62 = parser28.settings(parseSettings61);
        org.jsoup.parser.Parser parser63 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings64 = parser63.settings();
        org.jsoup.parser.Parser parser65 = parser28.settings(parseSettings64);
        org.jsoup.parser.ParseSettings parseSettings66 = null;
        org.jsoup.parser.Parser parser67 = parser65.settings(parseSettings66);
        org.jsoup.parser.Parser parser68 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings69 = null;
        org.jsoup.parser.Parser parser70 = parser68.settings(parseSettings69);
        org.jsoup.parser.ParseSettings parseSettings71 = null;
        org.jsoup.parser.Parser parser72 = parser68.settings(parseSettings71);
        org.jsoup.parser.ParseSettings parseSettings73 = parser68.settings();
        org.jsoup.parser.ParseSettings parseSettings74 = null;
        org.jsoup.parser.Parser parser75 = parser68.settings(parseSettings74);
        org.jsoup.parser.Parser parser76 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.ParseSettings parseSettings77 = parser76.settings();
        org.jsoup.parser.Parser parser78 = parser68.settings(parseSettings77);
        boolean boolean79 = parser78.isTrackErrors();
        boolean boolean80 = parser78.isTrackErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList81 = parser78.getErrors();
        org.jsoup.parser.ParseSettings parseSettings82 = parser78.settings();
        org.jsoup.parser.Parser parser83 = parser67.settings(parseSettings82);
        org.jsoup.parser.Parser parser84 = parser13.settings(parseSettings82);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(parseErrorList21);
        org.junit.Assert.assertNotNull(parseErrorList22);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNull(parseErrorList26);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNull(parseSettings35);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(parser48);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNotNull(parseSettings53);
        org.junit.Assert.assertNotNull(parser54);
        org.junit.Assert.assertNotNull(parser55);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertNotNull(parseErrorList59);
        org.junit.Assert.assertNotNull(parseSettings60);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(parser62);
        org.junit.Assert.assertNotNull(parser63);
        org.junit.Assert.assertNotNull(parseSettings64);
        org.junit.Assert.assertNotNull(parser65);
        org.junit.Assert.assertNotNull(parser67);
        org.junit.Assert.assertNotNull(parser68);
        org.junit.Assert.assertNotNull(parser70);
        org.junit.Assert.assertNotNull(parser72);
        org.junit.Assert.assertNull(parseSettings73);
        org.junit.Assert.assertNotNull(parser75);
        org.junit.Assert.assertNotNull(parser76);
        org.junit.Assert.assertNotNull(parseSettings77);
        org.junit.Assert.assertNotNull(parser78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(parseErrorList81);
        org.junit.Assert.assertNotNull(parseSettings82);
        org.junit.Assert.assertNotNull(parser83);
        org.junit.Assert.assertNotNull(parser84);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.Parser parser4 = parser2.setTrackErrors((int) (short) 100);
        org.jsoup.parser.Parser parser6 = parser4.setTrackErrors((int) ' ');
        java.util.List<org.jsoup.parser.ParseError> parseErrorList7 = parser4.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList8 = parser4.getErrors();
        org.jsoup.nodes.Document document11 = parser4.parseInput("hi!", "hi!");
        org.jsoup.parser.Parser parser13 = parser4.setTrackErrors((int) (short) 1);
        org.jsoup.parser.Parser parser15 = parser13.setTrackErrors((int) '4');
        org.jsoup.nodes.Document document18 = parser13.parseInput("", "");
        org.jsoup.parser.Parser parser19 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings20 = null;
        org.jsoup.parser.Parser parser21 = parser19.settings(parseSettings20);
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        org.jsoup.parser.Parser parser23 = parser19.settings(parseSettings22);
        org.jsoup.parser.ParseSettings parseSettings24 = parser19.settings();
        org.jsoup.parser.ParseSettings parseSettings25 = null;
        org.jsoup.parser.Parser parser26 = parser19.settings(parseSettings25);
        org.jsoup.parser.Parser parser27 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings28 = null;
        org.jsoup.parser.Parser parser29 = parser27.settings(parseSettings28);
        org.jsoup.parser.Parser parser30 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        org.jsoup.parser.Parser parser32 = parser30.settings(parseSettings31);
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        org.jsoup.parser.Parser parser34 = parser30.settings(parseSettings33);
        org.jsoup.parser.Parser parser37 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parse("hi!", "hi!", parser37);
        org.jsoup.parser.ParseSettings parseSettings39 = parser37.settings();
        org.jsoup.parser.Parser parser40 = parser30.settings(parseSettings39);
        org.jsoup.parser.Parser parser41 = parser29.settings(parseSettings39);
        org.jsoup.parser.Parser parser42 = parser19.settings(parseSettings39);
        boolean boolean43 = parser42.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings44 = parser42.settings();
        org.jsoup.parser.Parser parser45 = parser13.settings(parseSettings44);
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNull(parseErrorList7);
        org.junit.Assert.assertNull(parseErrorList8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNull(parseSettings24);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(parseSettings39);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(parser41);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(parser45);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("hi!", "hi!", parser4);
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings7 = null;
        org.jsoup.parser.Parser parser8 = parser6.settings(parseSettings7);
        org.jsoup.nodes.Document document11 = parser8.parseInput("", "hi!");
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("hi!", "hi!", parser14);
        org.jsoup.parser.ParseSettings parseSettings16 = parser14.settings();
        org.jsoup.parser.Parser parser17 = parser8.settings(parseSettings16);
        org.jsoup.parser.Parser parser18 = parser4.settings(parseSettings16);
        boolean boolean19 = parser18.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings20 = parser18.settings();
        org.jsoup.parser.Parser parser25 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        org.jsoup.parser.Parser parser27 = parser25.settings(parseSettings26);
        org.jsoup.nodes.Document document28 = org.jsoup.Jsoup.parse("hi!", "", parser27);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList29 = parser27.getErrors();
        boolean boolean30 = parser27.isTrackErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList31 = parser27.getErrors();
        org.jsoup.parser.ParseSettings parseSettings32 = parser27.settings();
        org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parse("hi!", "hi!", parser27);
        org.jsoup.parser.Parser parser36 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document37 = org.jsoup.Jsoup.parse("", "hi!", parser36);
        org.jsoup.parser.Parser parser39 = parser36.setTrackErrors(10);
        org.jsoup.parser.Parser parser41 = parser39.setTrackErrors(10);
        org.jsoup.parser.ParseSettings parseSettings42 = parser39.settings();
        org.jsoup.parser.Parser parser43 = parser27.settings(parseSettings42);
        org.jsoup.parser.Parser parser44 = parser18.settings(parseSettings42);
        org.jsoup.parser.Parser parser49 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document50 = org.jsoup.Jsoup.parse("", "hi!", parser49);
        org.jsoup.parser.Parser parser52 = parser49.setTrackErrors((int) '#');
        org.jsoup.nodes.Document document53 = org.jsoup.Jsoup.parse("", "", parser52);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList54 = parser52.getErrors();
        org.jsoup.parser.ParseSettings parseSettings55 = parser52.settings();
        org.jsoup.parser.Parser parser56 = parser44.settings(parseSettings55);
        org.jsoup.nodes.Document document57 = org.jsoup.Jsoup.parse("", "hi!", parser44);
        boolean boolean58 = parser44.isTrackErrors();
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseErrorList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(parseErrorList31);
        org.junit.Assert.assertNull(parseSettings32);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNotNull(parser41);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(parser52);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNotNull(parseErrorList54);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(parser56);
        org.junit.Assert.assertNotNull(document57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.nodes.Document document7 = parser4.parseInput("", "hi!");
        org.jsoup.parser.Parser parser10 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("hi!", "hi!", parser10);
        org.jsoup.parser.ParseSettings parseSettings12 = parser10.settings();
        org.jsoup.parser.Parser parser13 = parser4.settings(parseSettings12);
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings15 = null;
        org.jsoup.parser.Parser parser16 = parser14.settings(parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        org.jsoup.parser.Parser parser18 = parser14.settings(parseSettings17);
        org.jsoup.parser.ParseSettings parseSettings19 = parser14.settings();
        org.jsoup.parser.ParseSettings parseSettings20 = null;
        org.jsoup.parser.Parser parser21 = parser14.settings(parseSettings20);
        org.jsoup.nodes.Document document24 = parser14.parseInput("", "hi!");
        org.jsoup.nodes.Document document27 = parser14.parseInput("", "hi!");
        org.jsoup.parser.Parser parser28 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        org.jsoup.parser.Parser parser30 = parser28.settings(parseSettings29);
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        org.jsoup.parser.Parser parser32 = parser28.settings(parseSettings31);
        org.jsoup.parser.Parser parser35 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document36 = org.jsoup.Jsoup.parse("hi!", "hi!", parser35);
        org.jsoup.parser.ParseSettings parseSettings37 = parser35.settings();
        org.jsoup.parser.Parser parser38 = parser28.settings(parseSettings37);
        org.jsoup.parser.Parser parser39 = parser14.settings(parseSettings37);
        boolean boolean40 = parser14.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings41 = parser14.settings();
        org.jsoup.parser.Parser parser42 = parser13.settings(parseSettings41);
        org.jsoup.nodes.Document document43 = org.jsoup.Jsoup.parse("", "", parser13);
        org.jsoup.parser.ParseSettings parseSettings44 = parser13.settings();
        org.jsoup.parser.ParseSettings parseSettings45 = parser13.settings();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNull(parseSettings19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(parseSettings45);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse("", "hi!", parser5);
        org.jsoup.parser.Parser parser8 = parser5.setTrackErrors(10);
        org.jsoup.parser.Parser parser10 = parser5.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser12 = parser5.setTrackErrors((int) (short) 1);
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "", parser12);
        org.jsoup.nodes.Document document16 = parser12.parseInput("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = org.jsoup.parser.Parser.parseFragment("", (org.jsoup.nodes.Element) document16, "hi!");
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("hi!", "hi!", parser4);
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse("hi!", "", parser4);
        org.jsoup.nodes.Document document9 = parser4.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings10 = parser4.settings();
        org.jsoup.parser.Parser parser12 = parser4.setTrackErrors((int) (short) 100);
        org.jsoup.parser.Parser parser14 = parser4.setTrackErrors((int) (byte) 100);
        boolean boolean15 = parser4.isTrackErrors();
        org.jsoup.nodes.Document document18 = parser4.parseInput("", "");
        org.jsoup.parser.Parser parser20 = parser4.setTrackErrors((int) '4');
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(parser20);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.nodes.Document document7 = parser4.parseInput("", "hi!");
        org.jsoup.parser.Parser parser9 = parser4.setTrackErrors((-1));
        org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        org.jsoup.parser.Parser parser14 = parser12.settings(parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = null;
        org.jsoup.parser.Parser parser16 = parser12.settings(parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = parser12.settings();
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        org.jsoup.parser.Parser parser19 = parser12.settings(parseSettings18);
        org.jsoup.nodes.Document document22 = parser12.parseInput("", "hi!");
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parse("hi!", "", parser12);
        org.jsoup.parser.ParseSettings parseSettings24 = parser12.settings();
        org.jsoup.parser.Parser parser25 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList26 = parser25.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList27 = parser25.getErrors();
        org.jsoup.parser.ParseSettings parseSettings28 = parser25.settings();
        org.jsoup.parser.ParseSettings parseSettings29 = parser25.settings();
        org.jsoup.parser.Parser parser30 = parser12.settings(parseSettings29);
        org.jsoup.parser.ParseSettings parseSettings31 = parser12.settings();
        org.jsoup.parser.Parser parser32 = parser4.settings(parseSettings31);
        org.jsoup.parser.ParseSettings parseSettings33 = parser4.settings();
        boolean boolean34 = parser4.isTrackErrors();
        org.jsoup.nodes.Document document37 = parser4.parseInput("hi!", "hi!");
        java.util.List<org.jsoup.parser.ParseError> parseErrorList38 = parser4.getErrors();
        org.jsoup.nodes.Document document39 = org.jsoup.Jsoup.parse("", "", parser4);
        boolean boolean40 = parser4.isTrackErrors();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNull(parseSettings17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNull(parseSettings24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNull(parseErrorList26);
        org.junit.Assert.assertNull(parseErrorList27);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(parseErrorList38);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        org.jsoup.parser.Parser parser5 = parser3.settings(parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser3.settings(parseSettings6);
        org.jsoup.parser.ParseSettings parseSettings8 = parser3.settings();
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        org.jsoup.parser.Parser parser10 = parser3.settings(parseSettings9);
        org.jsoup.nodes.Document document13 = parser3.parseInput("", "hi!");
        org.jsoup.nodes.Document document16 = parser3.parseInput("", "hi!");
        org.jsoup.parser.Parser parser17 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        org.jsoup.parser.Parser parser19 = parser17.settings(parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = null;
        org.jsoup.parser.Parser parser21 = parser17.settings(parseSettings20);
        org.jsoup.parser.Parser parser22 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings23 = null;
        org.jsoup.parser.Parser parser24 = parser22.settings(parseSettings23);
        org.jsoup.nodes.Document document27 = parser24.parseInput("", "hi!");
        org.jsoup.parser.Parser parser30 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document31 = org.jsoup.Jsoup.parse("hi!", "hi!", parser30);
        org.jsoup.parser.ParseSettings parseSettings32 = parser30.settings();
        org.jsoup.parser.Parser parser33 = parser24.settings(parseSettings32);
        org.jsoup.parser.Parser parser34 = parser21.settings(parseSettings32);
        org.jsoup.parser.ParseSettings parseSettings35 = parser21.settings();
        org.jsoup.parser.Parser parser36 = parser3.settings(parseSettings35);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList37 = parser3.getErrors();
        org.jsoup.parser.Parser parser40 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document41 = org.jsoup.Jsoup.parse("hi!", "hi!", parser40);
        org.jsoup.parser.Parser parser42 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings43 = null;
        org.jsoup.parser.Parser parser44 = parser42.settings(parseSettings43);
        org.jsoup.nodes.Document document47 = parser44.parseInput("", "hi!");
        org.jsoup.parser.Parser parser50 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document51 = org.jsoup.Jsoup.parse("hi!", "hi!", parser50);
        org.jsoup.parser.ParseSettings parseSettings52 = parser50.settings();
        org.jsoup.parser.Parser parser53 = parser44.settings(parseSettings52);
        org.jsoup.parser.Parser parser54 = parser40.settings(parseSettings52);
        org.jsoup.parser.Parser parser56 = parser40.setTrackErrors((int) ' ');
        java.util.List<org.jsoup.parser.ParseError> parseErrorList57 = parser56.getErrors();
        org.jsoup.parser.ParseSettings parseSettings58 = parser56.settings();
        org.jsoup.parser.Parser parser59 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings60 = null;
        org.jsoup.parser.Parser parser61 = parser59.settings(parseSettings60);
        org.jsoup.nodes.Document document64 = parser61.parseInput("", "hi!");
        org.jsoup.parser.Parser parser67 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document68 = org.jsoup.Jsoup.parse("hi!", "hi!", parser67);
        org.jsoup.parser.ParseSettings parseSettings69 = parser67.settings();
        org.jsoup.parser.Parser parser70 = parser61.settings(parseSettings69);
        org.jsoup.parser.Parser parser71 = parser56.settings(parseSettings69);
        org.jsoup.parser.ParseSettings parseSettings72 = parser56.settings();
        org.jsoup.parser.Parser parser73 = parser3.settings(parseSettings72);
        org.jsoup.nodes.Document document74 = org.jsoup.Jsoup.parse("hi!", "", parser73);
        java.util.List<org.jsoup.nodes.Node> nodeList76 = org.jsoup.parser.Parser.parseFragment("hi!", (org.jsoup.nodes.Element) document74, "");
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNull(parseSettings8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(parseErrorList37);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(parser50);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(parser53);
        org.junit.Assert.assertNotNull(parser54);
        org.junit.Assert.assertNotNull(parser56);
        org.junit.Assert.assertNotNull(parseErrorList57);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNotNull(parser59);
        org.junit.Assert.assertNotNull(parser61);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertNotNull(parser67);
        org.junit.Assert.assertNotNull(document68);
        org.junit.Assert.assertNotNull(parseSettings69);
        org.junit.Assert.assertNotNull(parser70);
        org.junit.Assert.assertNotNull(parser71);
        org.junit.Assert.assertNotNull(parseSettings72);
        org.junit.Assert.assertNotNull(parser73);
        org.junit.Assert.assertNotNull(document74);
        org.junit.Assert.assertNotNull(nodeList76);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser2.settings(parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = parser2.settings();
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser2.settings(parseSettings8);
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse("hi!", "", parser2);
        org.jsoup.parser.Parser parser12 = parser2.setTrackErrors((int) (short) 100);
        org.jsoup.nodes.Document document15 = parser12.parseInput("", "");
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNull(parseSettings7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document15);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("hi!", "hi!", parser6);
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parse("hi!", "", parser6);
        org.jsoup.nodes.Document document11 = parser6.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings12 = parser6.settings();
        org.jsoup.parser.Parser parser14 = parser6.setTrackErrors((int) (short) 100);
        org.jsoup.parser.Parser parser16 = parser6.setTrackErrors((int) (byte) 100);
        org.jsoup.parser.Parser parser17 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        org.jsoup.parser.Parser parser19 = parser17.settings(parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = null;
        org.jsoup.parser.Parser parser21 = parser17.settings(parseSettings20);
        org.jsoup.parser.Parser parser22 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings23 = null;
        org.jsoup.parser.Parser parser24 = parser22.settings(parseSettings23);
        org.jsoup.nodes.Document document27 = parser24.parseInput("", "hi!");
        org.jsoup.parser.Parser parser30 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document31 = org.jsoup.Jsoup.parse("hi!", "hi!", parser30);
        org.jsoup.parser.ParseSettings parseSettings32 = parser30.settings();
        org.jsoup.parser.Parser parser33 = parser24.settings(parseSettings32);
        org.jsoup.parser.Parser parser34 = parser21.settings(parseSettings32);
        org.jsoup.parser.ParseSettings parseSettings35 = parser21.settings();
        org.jsoup.parser.Parser parser36 = parser6.settings(parseSettings35);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList37 = parser36.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList38 = parser36.getErrors();
        org.jsoup.nodes.Document document39 = org.jsoup.Jsoup.parse("", "hi!", parser36);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(parseErrorList37);
        org.junit.Assert.assertNotNull(parseErrorList38);
        org.junit.Assert.assertNotNull(document39);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.nodes.Document document5 = parser2.parseInput("", "hi!");
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parse("hi!", "hi!", parser8);
        org.jsoup.parser.ParseSettings parseSettings10 = parser8.settings();
        org.jsoup.parser.Parser parser11 = parser2.settings(parseSettings10);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList12 = parser11.getErrors();
        org.jsoup.parser.Parser parser14 = parser11.setTrackErrors((int) (byte) 0);
        boolean boolean15 = parser14.isTrackErrors();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parseErrorList12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser2.settings(parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = parser2.settings();
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser2.settings(parseSettings8);
        org.jsoup.parser.Parser parser10 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings11 = null;
        org.jsoup.parser.Parser parser12 = parser10.settings(parseSettings11);
        org.jsoup.parser.Parser parser13 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings14 = null;
        org.jsoup.parser.Parser parser15 = parser13.settings(parseSettings14);
        org.jsoup.parser.ParseSettings parseSettings16 = null;
        org.jsoup.parser.Parser parser17 = parser13.settings(parseSettings16);
        org.jsoup.parser.Parser parser20 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("hi!", "hi!", parser20);
        org.jsoup.parser.ParseSettings parseSettings22 = parser20.settings();
        org.jsoup.parser.Parser parser23 = parser13.settings(parseSettings22);
        org.jsoup.parser.Parser parser24 = parser12.settings(parseSettings22);
        org.jsoup.parser.Parser parser25 = parser2.settings(parseSettings22);
        org.jsoup.parser.Parser parser27 = parser2.setTrackErrors((int) (byte) 10);
        org.jsoup.nodes.Document document28 = org.jsoup.Jsoup.parse("hi!", "", parser2);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList29 = parser2.getErrors();
        org.jsoup.parser.Parser parser31 = parser2.setTrackErrors((int) (byte) 1);
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        org.jsoup.parser.Parser parser33 = parser31.settings(parseSettings32);
        org.jsoup.parser.Parser parser34 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings35 = null;
        org.jsoup.parser.Parser parser36 = parser34.settings(parseSettings35);
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        org.jsoup.parser.Parser parser38 = parser34.settings(parseSettings37);
        org.jsoup.parser.ParseSettings parseSettings39 = parser34.settings();
        org.jsoup.parser.ParseSettings parseSettings40 = null;
        org.jsoup.parser.Parser parser41 = parser34.settings(parseSettings40);
        org.jsoup.nodes.Document document44 = parser34.parseInput("", "hi!");
        org.jsoup.nodes.Document document47 = parser34.parseInput("", "hi!");
        org.jsoup.parser.Parser parser48 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings49 = null;
        org.jsoup.parser.Parser parser50 = parser48.settings(parseSettings49);
        org.jsoup.parser.ParseSettings parseSettings51 = null;
        org.jsoup.parser.Parser parser52 = parser48.settings(parseSettings51);
        org.jsoup.parser.Parser parser55 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document56 = org.jsoup.Jsoup.parse("hi!", "hi!", parser55);
        org.jsoup.parser.ParseSettings parseSettings57 = parser55.settings();
        org.jsoup.parser.Parser parser58 = parser48.settings(parseSettings57);
        org.jsoup.parser.Parser parser59 = parser34.settings(parseSettings57);
        boolean boolean60 = parser59.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings61 = parser59.settings();
        org.jsoup.parser.Parser parser63 = parser59.setTrackErrors((int) (short) 0);
        org.jsoup.parser.ParseSettings parseSettings64 = parser59.settings();
        org.jsoup.parser.Parser parser65 = parser33.settings(parseSettings64);
        org.jsoup.nodes.Document document68 = parser65.parseInput("hi!", "hi!");
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNull(parseSettings7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseErrorList29);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNull(parseSettings39);
        org.junit.Assert.assertNotNull(parser41);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(parser48);
        org.junit.Assert.assertNotNull(parser50);
        org.junit.Assert.assertNotNull(parser52);
        org.junit.Assert.assertNotNull(parser55);
        org.junit.Assert.assertNotNull(document56);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertNotNull(parser59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(parser63);
        org.junit.Assert.assertNotNull(parseSettings64);
        org.junit.Assert.assertNotNull(parser65);
        org.junit.Assert.assertNotNull(document68);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("", "hi!", parser2);
        org.jsoup.parser.Parser parser5 = parser2.setTrackErrors(10);
        org.jsoup.parser.Parser parser7 = parser2.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser9 = parser2.setTrackErrors((int) (short) 1);
        org.jsoup.parser.Parser parser11 = parser2.setTrackErrors(100);
        org.jsoup.parser.Parser parser13 = parser2.setTrackErrors(100);
        org.jsoup.parser.ParseSettings parseSettings14 = parser13.settings();
        org.jsoup.parser.Parser parser16 = parser13.setTrackErrors((int) '4');
        org.jsoup.nodes.Document document19 = parser13.parseInput("", "");
        org.jsoup.parser.ParseSettings parseSettings20 = parser13.settings();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList21 = parser13.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList22 = parser13.getErrors();
        org.jsoup.parser.Parser parser24 = parser13.setTrackErrors(1);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(parseErrorList21);
        org.junit.Assert.assertNotNull(parseErrorList22);
        org.junit.Assert.assertNotNull(parser24);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = parser0.settings();
        boolean boolean2 = parser0.isTrackErrors();
        org.jsoup.parser.Parser parser4 = parser0.setTrackErrors((int) (byte) 1);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList5 = parser4.getErrors();
        org.jsoup.parser.ParseSettings parseSettings6 = parser4.settings();
        boolean boolean7 = parser4.isTrackErrors();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNull(parseErrorList5);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("", "hi!", parser2);
        org.jsoup.parser.Parser parser5 = parser2.setTrackErrors(10);
        org.jsoup.parser.Parser parser7 = parser2.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser9 = parser2.setTrackErrors((int) (short) 1);
        org.jsoup.parser.Parser parser11 = parser2.setTrackErrors(100);
        org.jsoup.parser.Parser parser13 = parser2.setTrackErrors(100);
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings15 = null;
        org.jsoup.parser.Parser parser16 = parser14.settings(parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        org.jsoup.parser.Parser parser18 = parser14.settings(parseSettings17);
        org.jsoup.parser.ParseSettings parseSettings19 = parser14.settings();
        org.jsoup.parser.ParseSettings parseSettings20 = null;
        org.jsoup.parser.Parser parser21 = parser14.settings(parseSettings20);
        org.jsoup.nodes.Document document24 = parser14.parseInput("", "hi!");
        org.jsoup.nodes.Document document27 = parser14.parseInput("", "hi!");
        org.jsoup.parser.Parser parser28 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        org.jsoup.parser.Parser parser30 = parser28.settings(parseSettings29);
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        org.jsoup.parser.Parser parser32 = parser28.settings(parseSettings31);
        org.jsoup.parser.Parser parser35 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document36 = org.jsoup.Jsoup.parse("hi!", "hi!", parser35);
        org.jsoup.parser.ParseSettings parseSettings37 = parser35.settings();
        org.jsoup.parser.Parser parser38 = parser28.settings(parseSettings37);
        org.jsoup.parser.Parser parser39 = parser14.settings(parseSettings37);
        org.jsoup.nodes.Document document42 = parser14.parseInput("", "hi!");
        java.util.List<org.jsoup.parser.ParseError> parseErrorList43 = parser14.getErrors();
        org.jsoup.parser.ParseSettings parseSettings44 = parser14.settings();
        org.jsoup.parser.Parser parser45 = parser13.settings(parseSettings44);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList46 = parser13.getErrors();
        org.jsoup.parser.Parser parser48 = parser13.setTrackErrors((int) (short) 0);
        java.lang.Class<?> wildcardClass49 = parser13.getClass();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNull(parseSettings19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(parseErrorList43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(parseErrorList46);
        org.junit.Assert.assertNotNull(parser48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.parser.Parser parser7 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser7.settings(parseSettings8);
        org.jsoup.parser.ParseSettings parseSettings10 = null;
        org.jsoup.parser.Parser parser11 = parser7.settings(parseSettings10);
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("hi!", "hi!", parser14);
        org.jsoup.parser.ParseSettings parseSettings16 = parser14.settings();
        org.jsoup.parser.Parser parser17 = parser7.settings(parseSettings16);
        org.jsoup.parser.Parser parser18 = parser6.settings(parseSettings16);
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parse("", "", parser18);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList20 = parser18.getErrors();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("", "hi!", parser18);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(parseErrorList20);
        org.junit.Assert.assertNotNull(document21);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.htmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList4 = parser3.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList5 = parser3.getErrors();
        boolean boolean6 = parser3.isTrackErrors();
        org.jsoup.parser.Parser parser8 = parser3.setTrackErrors((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parse(inputStream0, "", "hi!", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNull(parseErrorList4);
        org.junit.Assert.assertNull(parseErrorList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(parser8);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("", "hi!", parser2);
        org.jsoup.parser.Parser parser5 = parser2.setTrackErrors(10);
        org.jsoup.parser.Parser parser7 = parser2.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser9 = parser2.setTrackErrors((int) (short) 1);
        org.jsoup.parser.Parser parser11 = parser2.setTrackErrors(100);
        org.jsoup.parser.Parser parser13 = parser2.setTrackErrors(100);
        org.jsoup.parser.ParseSettings parseSettings14 = parser13.settings();
        org.jsoup.parser.Parser parser16 = parser13.setTrackErrors((int) '4');
        org.jsoup.nodes.Document document19 = parser13.parseInput("", "");
        org.jsoup.parser.ParseSettings parseSettings20 = parser13.settings();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList21 = parser13.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList22 = parser13.getErrors();
        org.jsoup.parser.Parser parser27 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document28 = org.jsoup.Jsoup.parse("hi!", "hi!", parser27);
        org.jsoup.nodes.Document document29 = org.jsoup.Jsoup.parse("hi!", "", parser27);
        org.jsoup.nodes.Document document32 = parser27.parseInput("", "hi!");
        java.util.List<org.jsoup.parser.ParseError> parseErrorList33 = parser27.getErrors();
        org.jsoup.parser.Parser parser35 = parser27.setTrackErrors((int) (short) 0);
        org.jsoup.parser.ParseSettings parseSettings36 = parser27.settings();
        org.jsoup.parser.Parser parser37 = parser13.settings(parseSettings36);
        org.jsoup.parser.Parser parser38 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList39 = parser38.getErrors();
        org.jsoup.parser.Parser parser41 = parser38.setTrackErrors((int) (short) 100);
        boolean boolean42 = parser38.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings43 = parser38.settings();
        org.jsoup.parser.Parser parser44 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings45 = null;
        org.jsoup.parser.Parser parser46 = parser44.settings(parseSettings45);
        org.jsoup.nodes.Document document49 = parser46.parseInput("", "hi!");
        org.jsoup.parser.Parser parser52 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document53 = org.jsoup.Jsoup.parse("hi!", "hi!", parser52);
        org.jsoup.parser.ParseSettings parseSettings54 = parser52.settings();
        org.jsoup.parser.Parser parser55 = parser46.settings(parseSettings54);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList56 = parser55.getErrors();
        org.jsoup.parser.Parser parser57 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings58 = parser57.settings();
        org.jsoup.parser.Parser parser59 = parser55.settings(parseSettings58);
        org.jsoup.parser.Parser parser60 = parser38.settings(parseSettings58);
        org.jsoup.parser.Parser parser61 = parser13.settings(parseSettings58);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(parseErrorList21);
        org.junit.Assert.assertNotNull(parseErrorList22);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(parseErrorList33);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNull(parseErrorList39);
        org.junit.Assert.assertNotNull(parser41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(parseSettings43);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertNotNull(parser52);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(parser55);
        org.junit.Assert.assertNotNull(parseErrorList56);
        org.junit.Assert.assertNotNull(parser57);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNotNull(parser59);
        org.junit.Assert.assertNotNull(parser60);
        org.junit.Assert.assertNotNull(parser61);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.nodes.Document document5 = parser2.parseInput("", "hi!");
        org.jsoup.parser.Parser parser7 = parser2.setTrackErrors((-1));
        org.jsoup.parser.ParseSettings parseSettings8 = parser7.settings();
        boolean boolean9 = parser7.isTrackErrors();
        org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("", "hi!", parser12);
        org.jsoup.parser.Parser parser15 = parser12.setTrackErrors(10);
        org.jsoup.parser.Parser parser17 = parser12.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser19 = parser12.setTrackErrors((int) (short) 1);
        org.jsoup.parser.Parser parser21 = parser12.setTrackErrors(100);
        org.jsoup.parser.Parser parser23 = parser12.setTrackErrors(100);
        org.jsoup.parser.Parser parser25 = parser12.setTrackErrors((int) (byte) 100);
        org.jsoup.parser.ParseSettings parseSettings26 = parser25.settings();
        org.jsoup.parser.Parser parser27 = parser7.settings(parseSettings26);
        org.jsoup.parser.Parser parser30 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document31 = org.jsoup.Jsoup.parse("", "hi!", parser30);
        org.jsoup.parser.Parser parser33 = parser30.setTrackErrors((int) '#');
        org.jsoup.parser.ParseSettings parseSettings34 = parser33.settings();
        boolean boolean35 = parser33.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings36 = parser33.settings();
        org.jsoup.parser.Parser parser37 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        org.jsoup.parser.Parser parser39 = parser37.settings(parseSettings38);
        org.jsoup.parser.ParseSettings parseSettings40 = null;
        org.jsoup.parser.Parser parser41 = parser37.settings(parseSettings40);
        org.jsoup.parser.ParseSettings parseSettings42 = parser37.settings();
        org.jsoup.parser.ParseSettings parseSettings43 = null;
        org.jsoup.parser.Parser parser44 = parser37.settings(parseSettings43);
        org.jsoup.nodes.Document document47 = parser37.parseInput("", "hi!");
        org.jsoup.nodes.Document document50 = parser37.parseInput("", "hi!");
        org.jsoup.parser.Parser parser51 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings52 = null;
        org.jsoup.parser.Parser parser53 = parser51.settings(parseSettings52);
        org.jsoup.parser.ParseSettings parseSettings54 = null;
        org.jsoup.parser.Parser parser55 = parser51.settings(parseSettings54);
        org.jsoup.parser.Parser parser58 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document59 = org.jsoup.Jsoup.parse("hi!", "hi!", parser58);
        org.jsoup.parser.ParseSettings parseSettings60 = parser58.settings();
        org.jsoup.parser.Parser parser61 = parser51.settings(parseSettings60);
        org.jsoup.parser.Parser parser62 = parser37.settings(parseSettings60);
        boolean boolean63 = parser37.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings64 = parser37.settings();
        org.jsoup.parser.Parser parser65 = parser33.settings(parseSettings64);
        org.jsoup.parser.Parser parser66 = parser27.settings(parseSettings64);
        org.jsoup.parser.ParseSettings parseSettings67 = parser66.settings();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNull(parseSettings8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNotNull(parser41);
        org.junit.Assert.assertNull(parseSettings42);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertNotNull(parser53);
        org.junit.Assert.assertNotNull(parser55);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertNotNull(document59);
        org.junit.Assert.assertNotNull(parseSettings60);
        org.junit.Assert.assertNotNull(parser61);
        org.junit.Assert.assertNotNull(parser62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(parseSettings64);
        org.junit.Assert.assertNotNull(parser65);
        org.junit.Assert.assertNotNull(parser66);
        org.junit.Assert.assertNotNull(parseSettings67);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("", "hi!", parser4);
        org.jsoup.parser.Parser parser7 = parser4.setTrackErrors(10);
        org.jsoup.parser.Parser parser9 = parser4.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser11 = parser4.setTrackErrors((int) (short) 1);
        org.jsoup.parser.Parser parser13 = parser4.setTrackErrors(100);
        org.jsoup.parser.Parser parser15 = parser4.setTrackErrors((int) (short) -1);
        org.jsoup.nodes.Document document18 = parser4.parseInput("", "hi!");
        org.jsoup.parser.Parser parser20 = parser4.setTrackErrors((int) '4');
        org.jsoup.parser.Parser parser23 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parse("hi!", "hi!", parser23);
        org.jsoup.parser.Parser parser25 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        org.jsoup.parser.Parser parser27 = parser25.settings(parseSettings26);
        org.jsoup.nodes.Document document30 = parser27.parseInput("", "hi!");
        org.jsoup.parser.Parser parser33 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document34 = org.jsoup.Jsoup.parse("hi!", "hi!", parser33);
        org.jsoup.parser.ParseSettings parseSettings35 = parser33.settings();
        org.jsoup.parser.Parser parser36 = parser27.settings(parseSettings35);
        org.jsoup.parser.Parser parser37 = parser23.settings(parseSettings35);
        org.jsoup.parser.Parser parser38 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings39 = null;
        org.jsoup.parser.Parser parser40 = parser38.settings(parseSettings39);
        org.jsoup.parser.ParseSettings parseSettings41 = null;
        org.jsoup.parser.Parser parser42 = parser38.settings(parseSettings41);
        org.jsoup.parser.ParseSettings parseSettings43 = parser38.settings();
        org.jsoup.parser.Parser parser44 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings45 = null;
        org.jsoup.parser.Parser parser46 = parser44.settings(parseSettings45);
        org.jsoup.parser.ParseSettings parseSettings47 = null;
        org.jsoup.parser.Parser parser48 = parser44.settings(parseSettings47);
        org.jsoup.parser.Parser parser49 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings50 = null;
        org.jsoup.parser.Parser parser51 = parser49.settings(parseSettings50);
        org.jsoup.nodes.Document document54 = parser51.parseInput("", "hi!");
        org.jsoup.parser.Parser parser57 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document58 = org.jsoup.Jsoup.parse("hi!", "hi!", parser57);
        org.jsoup.parser.ParseSettings parseSettings59 = parser57.settings();
        org.jsoup.parser.Parser parser60 = parser51.settings(parseSettings59);
        org.jsoup.parser.Parser parser61 = parser48.settings(parseSettings59);
        org.jsoup.parser.ParseSettings parseSettings62 = parser48.settings();
        org.jsoup.parser.Parser parser63 = parser38.settings(parseSettings62);
        org.jsoup.parser.Parser parser64 = parser37.settings(parseSettings62);
        org.jsoup.parser.Parser parser67 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings68 = null;
        org.jsoup.parser.Parser parser69 = parser67.settings(parseSettings68);
        org.jsoup.parser.ParseSettings parseSettings70 = null;
        org.jsoup.parser.Parser parser71 = parser67.settings(parseSettings70);
        org.jsoup.parser.ParseSettings parseSettings72 = parser67.settings();
        org.jsoup.parser.ParseSettings parseSettings73 = null;
        org.jsoup.parser.Parser parser74 = parser67.settings(parseSettings73);
        org.jsoup.nodes.Document document77 = parser67.parseInput("", "hi!");
        org.jsoup.nodes.Document document78 = org.jsoup.Jsoup.parse("hi!", "", parser67);
        org.jsoup.parser.ParseSettings parseSettings79 = parser67.settings();
        org.jsoup.parser.Parser parser80 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList81 = parser80.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList82 = parser80.getErrors();
        org.jsoup.parser.ParseSettings parseSettings83 = parser80.settings();
        org.jsoup.parser.ParseSettings parseSettings84 = parser80.settings();
        org.jsoup.parser.Parser parser85 = parser67.settings(parseSettings84);
        org.jsoup.parser.ParseSettings parseSettings86 = parser67.settings();
        org.jsoup.parser.Parser parser87 = parser37.settings(parseSettings86);
        org.jsoup.parser.Parser parser88 = parser4.settings(parseSettings86);
        org.jsoup.nodes.Document document89 = org.jsoup.Jsoup.parse("hi!", "", parser88);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList90 = parser88.getErrors();
        org.jsoup.parser.Parser parser92 = parser88.setTrackErrors((int) (byte) 1);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNull(parseSettings43);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(parser48);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNotNull(parser57);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(parser60);
        org.junit.Assert.assertNotNull(parser61);
        org.junit.Assert.assertNotNull(parseSettings62);
        org.junit.Assert.assertNotNull(parser63);
        org.junit.Assert.assertNotNull(parser64);
        org.junit.Assert.assertNotNull(parser67);
        org.junit.Assert.assertNotNull(parser69);
        org.junit.Assert.assertNotNull(parser71);
        org.junit.Assert.assertNull(parseSettings72);
        org.junit.Assert.assertNotNull(parser74);
        org.junit.Assert.assertNotNull(document77);
        org.junit.Assert.assertNotNull(document78);
        org.junit.Assert.assertNull(parseSettings79);
        org.junit.Assert.assertNotNull(parser80);
        org.junit.Assert.assertNull(parseErrorList81);
        org.junit.Assert.assertNull(parseErrorList82);
        org.junit.Assert.assertNotNull(parseSettings83);
        org.junit.Assert.assertNotNull(parseSettings84);
        org.junit.Assert.assertNotNull(parser85);
        org.junit.Assert.assertNotNull(parseSettings86);
        org.junit.Assert.assertNotNull(parser87);
        org.junit.Assert.assertNotNull(parser88);
        org.junit.Assert.assertNotNull(document89);
        org.junit.Assert.assertNotNull(parseErrorList90);
        org.junit.Assert.assertNotNull(parser92);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser2.settings(parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = parser2.settings();
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser2.settings(parseSettings8);
        org.jsoup.nodes.Document document12 = parser2.parseInput("", "hi!");
        org.jsoup.nodes.Document document15 = parser2.parseInput("", "hi!");
        org.jsoup.parser.Parser parser16 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        org.jsoup.parser.Parser parser18 = parser16.settings(parseSettings17);
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        org.jsoup.parser.Parser parser20 = parser16.settings(parseSettings19);
        org.jsoup.parser.Parser parser21 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        org.jsoup.parser.Parser parser23 = parser21.settings(parseSettings22);
        org.jsoup.nodes.Document document26 = parser23.parseInput("", "hi!");
        org.jsoup.parser.Parser parser29 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document30 = org.jsoup.Jsoup.parse("hi!", "hi!", parser29);
        org.jsoup.parser.ParseSettings parseSettings31 = parser29.settings();
        org.jsoup.parser.Parser parser32 = parser23.settings(parseSettings31);
        org.jsoup.parser.Parser parser33 = parser20.settings(parseSettings31);
        org.jsoup.parser.ParseSettings parseSettings34 = parser20.settings();
        org.jsoup.parser.Parser parser35 = parser2.settings(parseSettings34);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList36 = parser35.getErrors();
        org.jsoup.parser.Parser parser39 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document40 = org.jsoup.Jsoup.parse("", "hi!", parser39);
        org.jsoup.parser.Parser parser42 = parser39.setTrackErrors(10);
        org.jsoup.parser.Parser parser44 = parser39.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser46 = parser39.setTrackErrors((int) (short) 1);
        org.jsoup.parser.Parser parser48 = parser39.setTrackErrors(100);
        org.jsoup.parser.Parser parser50 = parser39.setTrackErrors(100);
        org.jsoup.parser.ParseSettings parseSettings51 = parser50.settings();
        org.jsoup.parser.Parser parser52 = parser35.settings(parseSettings51);
        org.jsoup.parser.ParseSettings parseSettings53 = parser35.settings();
        org.jsoup.nodes.Document document54 = org.jsoup.Jsoup.parse("hi!", "", parser35);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNull(parseSettings7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(parseErrorList36);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(parser48);
        org.junit.Assert.assertNotNull(parser50);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(parser52);
        org.junit.Assert.assertNotNull(parseSettings53);
        org.junit.Assert.assertNotNull(document54);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("hi!", "", parser4);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList6 = parser4.getErrors();
        org.jsoup.nodes.Document document9 = parser4.parseInput("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings10 = parser4.settings();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNull(parseSettings10);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.jsoup.parser.Parser parser1 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings2 = null;
        org.jsoup.parser.Parser parser3 = parser1.settings(parseSettings2);
        org.jsoup.nodes.Document document6 = parser3.parseInput("", "hi!");
        org.jsoup.parser.Parser parser9 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse("hi!", "hi!", parser9);
        org.jsoup.parser.ParseSettings parseSettings11 = parser9.settings();
        org.jsoup.parser.Parser parser12 = parser3.settings(parseSettings11);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList13 = parser12.getErrors();
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings15 = parser14.settings();
        org.jsoup.parser.Parser parser16 = parser12.settings(parseSettings15);
        org.jsoup.nodes.Document document19 = parser16.parseInput("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = org.jsoup.parser.Parser.parseFragment("hi!", (org.jsoup.nodes.Element) document19, "");
        org.junit.Assert.assertNotNull(parser1);
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parseErrorList13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.jsoup.parser.Parser parser7 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parse("hi!", "hi!", parser7);
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parse("hi!", "", parser7);
        org.jsoup.nodes.Document document12 = parser7.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings13 = parser7.settings();
        org.jsoup.parser.Parser parser15 = parser7.setTrackErrors((int) (byte) 10);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList16 = parser15.getErrors();
        boolean boolean17 = parser15.isTrackErrors();
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parse("", "", parser15);
        java.util.List<org.jsoup.nodes.Node> nodeList20 = org.jsoup.parser.Parser.parseFragment("hi!", (org.jsoup.nodes.Element) document18, "hi!");
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parseErrorList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser0.settings(parseSettings3);
        boolean boolean5 = parser0.isTrackErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList6 = parser0.getErrors();
        org.jsoup.parser.Parser parser8 = parser0.setTrackErrors((int) (byte) 100);
        org.jsoup.parser.Parser parser10 = parser8.setTrackErrors((int) '#');
        org.jsoup.parser.ParseSettings parseSettings11 = parser10.settings();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(parseErrorList6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNull(parseSettings11);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList3 = parser2.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList4 = parser2.getErrors();
        org.jsoup.parser.ParseSettings parseSettings5 = parser2.settings();
        org.jsoup.parser.ParseSettings parseSettings6 = parser2.settings();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("", "hi!", parser2);
        boolean boolean8 = parser2.isTrackErrors();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNull(parseErrorList3);
        org.junit.Assert.assertNull(parseErrorList4);
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("", "hi!", parser2);
        org.jsoup.parser.Parser parser5 = parser2.setTrackErrors((int) '#');
        org.jsoup.parser.ParseSettings parseSettings6 = parser5.settings();
        boolean boolean7 = parser5.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings8 = parser5.settings();
        org.jsoup.parser.Parser parser9 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings10 = null;
        org.jsoup.parser.Parser parser11 = parser9.settings(parseSettings10);
        org.jsoup.parser.ParseSettings parseSettings12 = null;
        org.jsoup.parser.Parser parser13 = parser9.settings(parseSettings12);
        org.jsoup.parser.ParseSettings parseSettings14 = parser9.settings();
        org.jsoup.parser.ParseSettings parseSettings15 = null;
        org.jsoup.parser.Parser parser16 = parser9.settings(parseSettings15);
        org.jsoup.nodes.Document document19 = parser9.parseInput("", "hi!");
        org.jsoup.nodes.Document document22 = parser9.parseInput("", "hi!");
        org.jsoup.parser.Parser parser23 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        org.jsoup.parser.Parser parser25 = parser23.settings(parseSettings24);
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        org.jsoup.parser.Parser parser27 = parser23.settings(parseSettings26);
        org.jsoup.parser.Parser parser30 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document31 = org.jsoup.Jsoup.parse("hi!", "hi!", parser30);
        org.jsoup.parser.ParseSettings parseSettings32 = parser30.settings();
        org.jsoup.parser.Parser parser33 = parser23.settings(parseSettings32);
        org.jsoup.parser.Parser parser34 = parser9.settings(parseSettings32);
        boolean boolean35 = parser9.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings36 = parser9.settings();
        org.jsoup.parser.Parser parser37 = parser5.settings(parseSettings36);
        boolean boolean38 = parser37.isTrackErrors();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.nodes.Document document7 = parser4.parseInput("", "hi!");
        org.jsoup.parser.Parser parser10 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("hi!", "hi!", parser10);
        org.jsoup.parser.ParseSettings parseSettings12 = parser10.settings();
        org.jsoup.parser.Parser parser13 = parser4.settings(parseSettings12);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList14 = parser13.getErrors();
        org.jsoup.nodes.Document document17 = parser13.parseInput("hi!", "hi!");
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parse("", "", parser13);
        boolean boolean19 = parser13.isTrackErrors();
        org.jsoup.parser.Parser parser21 = parser13.setTrackErrors(10);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parseErrorList14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(parser21);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser0.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = parser0.settings();
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser0.settings(parseSettings6);
        org.jsoup.nodes.Document document10 = parser0.parseInput("", "hi!");
        org.jsoup.nodes.Document document13 = parser0.parseInput("", "hi!");
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings15 = null;
        org.jsoup.parser.Parser parser16 = parser14.settings(parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        org.jsoup.parser.Parser parser18 = parser14.settings(parseSettings17);
        org.jsoup.parser.Parser parser21 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document22 = org.jsoup.Jsoup.parse("hi!", "hi!", parser21);
        org.jsoup.parser.ParseSettings parseSettings23 = parser21.settings();
        org.jsoup.parser.Parser parser24 = parser14.settings(parseSettings23);
        org.jsoup.parser.Parser parser25 = parser0.settings(parseSettings23);
        boolean boolean26 = parser0.isTrackErrors();
        org.jsoup.parser.Parser parser29 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings30 = null;
        org.jsoup.parser.Parser parser31 = parser29.settings(parseSettings30);
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        org.jsoup.parser.Parser parser33 = parser29.settings(parseSettings32);
        org.jsoup.parser.ParseSettings parseSettings34 = parser29.settings();
        org.jsoup.parser.ParseSettings parseSettings35 = null;
        org.jsoup.parser.Parser parser36 = parser29.settings(parseSettings35);
        org.jsoup.nodes.Document document39 = parser29.parseInput("", "hi!");
        org.jsoup.nodes.Document document40 = org.jsoup.Jsoup.parse("hi!", "", parser29);
        org.jsoup.parser.ParseSettings parseSettings41 = parser29.settings();
        org.jsoup.parser.Parser parser42 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList43 = parser42.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList44 = parser42.getErrors();
        org.jsoup.parser.ParseSettings parseSettings45 = parser42.settings();
        org.jsoup.parser.ParseSettings parseSettings46 = parser42.settings();
        org.jsoup.parser.Parser parser47 = parser29.settings(parseSettings46);
        org.jsoup.parser.ParseSettings parseSettings48 = parser29.settings();
        org.jsoup.parser.Parser parser49 = parser0.settings(parseSettings48);
        org.jsoup.nodes.Document document52 = parser49.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings53 = parser49.settings();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList54 = parser49.getErrors();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNull(parseSettings5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNull(parseSettings34);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNull(parseSettings41);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNull(parseErrorList43);
        org.junit.Assert.assertNull(parseErrorList44);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(parser47);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNotNull(parseSettings53);
        org.junit.Assert.assertNotNull(parseErrorList54);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("hi!", "hi!", parser2);
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.nodes.Document document9 = parser6.parseInput("", "hi!");
        org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "hi!", parser12);
        org.jsoup.parser.ParseSettings parseSettings14 = parser12.settings();
        org.jsoup.parser.Parser parser15 = parser6.settings(parseSettings14);
        org.jsoup.parser.Parser parser16 = parser2.settings(parseSettings14);
        org.jsoup.parser.Parser parser18 = parser2.setTrackErrors((int) ' ');
        org.jsoup.nodes.Document document21 = parser2.parseInput("", "hi!");
        org.jsoup.parser.Parser parser23 = parser2.setTrackErrors((int) '4');
        java.util.List<org.jsoup.parser.ParseError> parseErrorList24 = parser2.getErrors();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parseErrorList24);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("", "hi!", parser6);
        org.jsoup.parser.ParseSettings parseSettings8 = parser6.settings();
        org.jsoup.parser.ParseSettings parseSettings9 = parser6.settings();
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse("hi!", "", parser6);
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("", "hi!", parser6);
        org.jsoup.parser.Parser parser13 = parser6.setTrackErrors((int) (short) 1);
        org.jsoup.parser.ParseSettings parseSettings14 = parser6.settings();
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parseSettings14);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser2.settings(parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = parser2.settings();
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser2.settings(parseSettings8);
        org.jsoup.parser.Parser parser10 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings11 = null;
        org.jsoup.parser.Parser parser12 = parser10.settings(parseSettings11);
        org.jsoup.parser.Parser parser13 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings14 = null;
        org.jsoup.parser.Parser parser15 = parser13.settings(parseSettings14);
        org.jsoup.parser.ParseSettings parseSettings16 = null;
        org.jsoup.parser.Parser parser17 = parser13.settings(parseSettings16);
        org.jsoup.parser.Parser parser20 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("hi!", "hi!", parser20);
        org.jsoup.parser.ParseSettings parseSettings22 = parser20.settings();
        org.jsoup.parser.Parser parser23 = parser13.settings(parseSettings22);
        org.jsoup.parser.Parser parser24 = parser12.settings(parseSettings22);
        org.jsoup.parser.Parser parser25 = parser2.settings(parseSettings22);
        org.jsoup.nodes.Document document28 = parser25.parseInput("hi!", "");
        org.jsoup.parser.Parser parser30 = parser25.setTrackErrors(100);
        org.jsoup.parser.Parser parser31 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        org.jsoup.parser.Parser parser33 = parser31.settings(parseSettings32);
        org.jsoup.parser.ParseSettings parseSettings34 = null;
        org.jsoup.parser.Parser parser35 = parser31.settings(parseSettings34);
        org.jsoup.parser.ParseSettings parseSettings36 = parser31.settings();
        org.jsoup.parser.Parser parser37 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        org.jsoup.parser.Parser parser39 = parser37.settings(parseSettings38);
        org.jsoup.parser.ParseSettings parseSettings40 = null;
        org.jsoup.parser.Parser parser41 = parser37.settings(parseSettings40);
        org.jsoup.parser.Parser parser42 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings43 = null;
        org.jsoup.parser.Parser parser44 = parser42.settings(parseSettings43);
        org.jsoup.nodes.Document document47 = parser44.parseInput("", "hi!");
        org.jsoup.parser.Parser parser50 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document51 = org.jsoup.Jsoup.parse("hi!", "hi!", parser50);
        org.jsoup.parser.ParseSettings parseSettings52 = parser50.settings();
        org.jsoup.parser.Parser parser53 = parser44.settings(parseSettings52);
        org.jsoup.parser.Parser parser54 = parser41.settings(parseSettings52);
        org.jsoup.parser.ParseSettings parseSettings55 = parser41.settings();
        org.jsoup.parser.Parser parser56 = parser31.settings(parseSettings55);
        org.jsoup.parser.Parser parser58 = parser56.setTrackErrors((int) ' ');
        java.util.List<org.jsoup.parser.ParseError> parseErrorList59 = parser58.getErrors();
        org.jsoup.parser.ParseSettings parseSettings60 = parser58.settings();
        org.jsoup.parser.Parser parser61 = parser25.settings(parseSettings60);
        org.jsoup.nodes.Document document62 = org.jsoup.Jsoup.parse("", "hi!", parser25);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNull(parseSettings7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNull(parseSettings36);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNotNull(parser41);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(parser50);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(parser53);
        org.junit.Assert.assertNotNull(parser54);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(parser56);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertNull(parseErrorList59);
        org.junit.Assert.assertNotNull(parseSettings60);
        org.junit.Assert.assertNotNull(parser61);
        org.junit.Assert.assertNotNull(document62);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.jsoup.parser.Parser parser1 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings2 = parser1.settings();
        org.jsoup.nodes.Document document5 = parser1.parseInput("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = org.jsoup.parser.Parser.parseFragment("", (org.jsoup.nodes.Element) document5, "hi!");
        java.lang.Class<?> wildcardClass8 = nodeList7.getClass();
        org.junit.Assert.assertNotNull(parser1);
        org.junit.Assert.assertNotNull(parseSettings2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("hi!", "hi!", parser2);
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.nodes.Document document9 = parser6.parseInput("", "hi!");
        org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "hi!", parser12);
        org.jsoup.parser.ParseSettings parseSettings14 = parser12.settings();
        org.jsoup.parser.Parser parser15 = parser6.settings(parseSettings14);
        org.jsoup.parser.Parser parser16 = parser2.settings(parseSettings14);
        boolean boolean17 = parser2.isTrackErrors();
        org.jsoup.parser.Parser parser19 = parser2.setTrackErrors((int) (short) 1);
        boolean boolean20 = parser2.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings21 = parser2.settings();
        org.jsoup.parser.Parser parser23 = parser2.setTrackErrors((int) (short) -1);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList24 = parser23.getErrors();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parseErrorList24);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("hi!", "hi!", parser4);
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings7 = null;
        org.jsoup.parser.Parser parser8 = parser6.settings(parseSettings7);
        org.jsoup.nodes.Document document11 = parser8.parseInput("", "hi!");
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("hi!", "hi!", parser14);
        org.jsoup.parser.ParseSettings parseSettings16 = parser14.settings();
        org.jsoup.parser.Parser parser17 = parser8.settings(parseSettings16);
        org.jsoup.parser.Parser parser18 = parser4.settings(parseSettings16);
        org.jsoup.nodes.Document document21 = parser18.parseInput("", "");
        org.jsoup.nodes.Document document22 = org.jsoup.Jsoup.parse("", "hi!", parser18);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList23 = parser18.getErrors();
        org.jsoup.parser.Parser parser25 = parser18.setTrackErrors((int) (short) 0);
        boolean boolean26 = parser18.isTrackErrors();
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parseErrorList23);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("hi!", "hi!", parser2);
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.nodes.Document document9 = parser6.parseInput("", "hi!");
        org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "hi!", parser12);
        org.jsoup.parser.ParseSettings parseSettings14 = parser12.settings();
        org.jsoup.parser.Parser parser15 = parser6.settings(parseSettings14);
        org.jsoup.parser.Parser parser16 = parser2.settings(parseSettings14);
        org.jsoup.nodes.Document document19 = parser16.parseInput("hi!", "");
        java.util.List<org.jsoup.parser.ParseError> parseErrorList20 = parser16.getErrors();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(parseErrorList20);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("", "hi!", parser6);
        org.jsoup.parser.ParseSettings parseSettings8 = parser6.settings();
        org.jsoup.parser.Parser parser10 = parser6.setTrackErrors((int) (byte) 1);
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("hi!", "", parser6);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = org.jsoup.parser.Parser.parseFragment("hi!", (org.jsoup.nodes.Element) document11, "");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = org.jsoup.parser.Parser.parseFragment("", (org.jsoup.nodes.Element) document11, "hi!");
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parse("hi!", "hi!", parser8);
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse("hi!", "", parser8);
        org.jsoup.nodes.Document document13 = parser8.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings14 = parser8.settings();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("", "", parser8);
        org.jsoup.parser.Parser parser20 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("", "hi!", parser20);
        org.jsoup.parser.Parser parser23 = parser20.setTrackErrors(10);
        org.jsoup.parser.Parser parser25 = parser23.setTrackErrors(10);
        boolean boolean26 = parser25.isTrackErrors();
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parse("", "hi!", parser25);
        org.jsoup.parser.ParseSettings parseSettings28 = parser25.settings();
        org.jsoup.parser.Parser parser29 = parser8.settings(parseSettings28);
        org.jsoup.parser.Parser parser34 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document35 = org.jsoup.Jsoup.parse("hi!", "hi!", parser34);
        org.jsoup.nodes.Document document36 = org.jsoup.Jsoup.parse("hi!", "", parser34);
        org.jsoup.nodes.Document document39 = parser34.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings40 = parser34.settings();
        org.jsoup.parser.Parser parser42 = parser34.setTrackErrors((int) (short) 100);
        org.jsoup.parser.ParseSettings parseSettings43 = parser34.settings();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList44 = parser34.getErrors();
        org.jsoup.parser.Parser parser47 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document48 = org.jsoup.Jsoup.parse("hi!", "hi!", parser47);
        org.jsoup.parser.Parser parser49 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings50 = null;
        org.jsoup.parser.Parser parser51 = parser49.settings(parseSettings50);
        org.jsoup.nodes.Document document54 = parser51.parseInput("", "hi!");
        org.jsoup.parser.Parser parser57 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document58 = org.jsoup.Jsoup.parse("hi!", "hi!", parser57);
        org.jsoup.parser.ParseSettings parseSettings59 = parser57.settings();
        org.jsoup.parser.Parser parser60 = parser51.settings(parseSettings59);
        org.jsoup.parser.Parser parser61 = parser47.settings(parseSettings59);
        org.jsoup.parser.Parser parser63 = parser47.setTrackErrors((int) ' ');
        java.util.List<org.jsoup.parser.ParseError> parseErrorList64 = parser63.getErrors();
        org.jsoup.parser.ParseSettings parseSettings65 = parser63.settings();
        org.jsoup.parser.Parser parser66 = parser34.settings(parseSettings65);
        org.jsoup.parser.Parser parser67 = parser8.settings(parseSettings65);
        boolean boolean68 = parser8.isTrackErrors();
        org.jsoup.nodes.Document document69 = org.jsoup.Jsoup.parse("", "", parser8);
        org.jsoup.nodes.Document document72 = parser8.parseInput("", "");
        java.util.List<org.jsoup.parser.ParseError> parseErrorList73 = parser8.getErrors();
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(parseSettings43);
        org.junit.Assert.assertNotNull(parseErrorList44);
        org.junit.Assert.assertNotNull(parser47);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNotNull(parser57);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(parser60);
        org.junit.Assert.assertNotNull(parser61);
        org.junit.Assert.assertNotNull(parser63);
        org.junit.Assert.assertNotNull(parseErrorList64);
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertNotNull(parser66);
        org.junit.Assert.assertNotNull(parser67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(document69);
        org.junit.Assert.assertNotNull(document72);
        org.junit.Assert.assertNotNull(parseErrorList73);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.Parser parser7 = parser5.setTrackErrors((int) (short) -1);
        org.jsoup.parser.Parser parser9 = parser7.setTrackErrors((int) (byte) 0);
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse("", "", parser9);
        org.jsoup.parser.ParseSettings parseSettings11 = parser9.settings();
        org.jsoup.parser.Parser parser13 = parser9.setTrackErrors((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parse(inputStream0, "", "hi!", parser9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parser13);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("hi!", "hi!", parser6);
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parse("hi!", "", parser6);
        org.jsoup.nodes.Document document11 = parser6.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings12 = parser6.settings();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("", "", parser6);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList14 = parser6.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList15 = parser6.getErrors();
        org.jsoup.parser.ParseSettings parseSettings16 = parser6.settings();
        boolean boolean17 = parser6.isTrackErrors();
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseErrorList14);
        org.junit.Assert.assertNotNull(parseErrorList15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.nodes.Document document7 = parser4.parseInput("", "hi!");
        boolean boolean8 = parser4.isTrackErrors();
        org.jsoup.parser.Parser parser10 = parser4.setTrackErrors((int) (short) 1);
        boolean boolean11 = parser10.isTrackErrors();
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("", "hi!", parser14);
        org.jsoup.parser.Parser parser17 = parser14.setTrackErrors(10);
        org.jsoup.parser.Parser parser19 = parser14.setTrackErrors((int) (byte) -1);
        boolean boolean20 = parser14.isTrackErrors();
        org.jsoup.parser.Parser parser21 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        org.jsoup.parser.Parser parser23 = parser21.settings(parseSettings22);
        org.jsoup.nodes.Document document26 = parser23.parseInput("", "hi!");
        org.jsoup.parser.Parser parser28 = parser23.setTrackErrors((int) (byte) 1);
        org.jsoup.parser.ParseSettings parseSettings29 = parser28.settings();
        org.jsoup.parser.Parser parser30 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        org.jsoup.parser.Parser parser32 = parser30.settings(parseSettings31);
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        org.jsoup.parser.Parser parser34 = parser30.settings(parseSettings33);
        org.jsoup.parser.ParseSettings parseSettings35 = parser30.settings();
        org.jsoup.parser.ParseSettings parseSettings36 = null;
        org.jsoup.parser.Parser parser37 = parser30.settings(parseSettings36);
        org.jsoup.nodes.Document document40 = parser30.parseInput("", "hi!");
        org.jsoup.nodes.Document document43 = parser30.parseInput("", "hi!");
        org.jsoup.parser.Parser parser44 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings45 = null;
        org.jsoup.parser.Parser parser46 = parser44.settings(parseSettings45);
        org.jsoup.parser.ParseSettings parseSettings47 = null;
        org.jsoup.parser.Parser parser48 = parser44.settings(parseSettings47);
        org.jsoup.parser.Parser parser49 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings50 = null;
        org.jsoup.parser.Parser parser51 = parser49.settings(parseSettings50);
        org.jsoup.nodes.Document document54 = parser51.parseInput("", "hi!");
        org.jsoup.parser.Parser parser57 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document58 = org.jsoup.Jsoup.parse("hi!", "hi!", parser57);
        org.jsoup.parser.ParseSettings parseSettings59 = parser57.settings();
        org.jsoup.parser.Parser parser60 = parser51.settings(parseSettings59);
        org.jsoup.parser.Parser parser61 = parser48.settings(parseSettings59);
        org.jsoup.parser.ParseSettings parseSettings62 = parser48.settings();
        org.jsoup.parser.Parser parser63 = parser30.settings(parseSettings62);
        org.jsoup.parser.Parser parser64 = parser28.settings(parseSettings62);
        org.jsoup.parser.ParseSettings parseSettings65 = parser64.settings();
        org.jsoup.parser.Parser parser66 = parser14.settings(parseSettings65);
        org.jsoup.parser.Parser parser67 = parser10.settings(parseSettings65);
        org.jsoup.parser.ParseSettings parseSettings68 = parser67.settings();
        org.jsoup.nodes.Document document69 = org.jsoup.Jsoup.parse("hi!", "", parser67);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNull(parseSettings29);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNull(parseSettings35);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(parser48);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNotNull(parser57);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(parser60);
        org.junit.Assert.assertNotNull(parser61);
        org.junit.Assert.assertNotNull(parseSettings62);
        org.junit.Assert.assertNotNull(parser63);
        org.junit.Assert.assertNotNull(parser64);
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertNotNull(parser66);
        org.junit.Assert.assertNotNull(parser67);
        org.junit.Assert.assertNotNull(parseSettings68);
        org.junit.Assert.assertNotNull(document69);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser0.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = parser0.settings();
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser0.settings(parseSettings6);
        boolean boolean8 = parser0.isTrackErrors();
        org.jsoup.nodes.Document document11 = parser0.parseInput("", "");
        org.jsoup.nodes.Document document14 = parser0.parseInput("", "hi!");
        org.jsoup.nodes.Document document17 = parser0.parseInput("hi!", "hi!");
        java.util.List<org.jsoup.parser.ParseError> parseErrorList18 = parser0.getErrors();
        boolean boolean19 = parser0.isTrackErrors();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNull(parseSettings5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(parseErrorList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser5.settings(parseSettings6);
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser5.settings(parseSettings8);
        org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "hi!", parser12);
        org.jsoup.parser.ParseSettings parseSettings14 = parser12.settings();
        org.jsoup.parser.Parser parser15 = parser5.settings(parseSettings14);
        org.jsoup.parser.Parser parser16 = parser4.settings(parseSettings14);
        org.jsoup.parser.Parser parser17 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        org.jsoup.parser.Parser parser19 = parser17.settings(parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = null;
        org.jsoup.parser.Parser parser21 = parser17.settings(parseSettings20);
        org.jsoup.parser.ParseSettings parseSettings22 = parser17.settings();
        org.jsoup.parser.ParseSettings parseSettings23 = null;
        org.jsoup.parser.Parser parser24 = parser17.settings(parseSettings23);
        org.jsoup.nodes.Document document27 = parser17.parseInput("", "hi!");
        org.jsoup.nodes.Document document30 = parser17.parseInput("", "hi!");
        org.jsoup.parser.Parser parser31 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        org.jsoup.parser.Parser parser33 = parser31.settings(parseSettings32);
        org.jsoup.parser.ParseSettings parseSettings34 = null;
        org.jsoup.parser.Parser parser35 = parser31.settings(parseSettings34);
        org.jsoup.parser.Parser parser36 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        org.jsoup.parser.Parser parser38 = parser36.settings(parseSettings37);
        org.jsoup.nodes.Document document41 = parser38.parseInput("", "hi!");
        org.jsoup.parser.Parser parser44 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document45 = org.jsoup.Jsoup.parse("hi!", "hi!", parser44);
        org.jsoup.parser.ParseSettings parseSettings46 = parser44.settings();
        org.jsoup.parser.Parser parser47 = parser38.settings(parseSettings46);
        org.jsoup.parser.Parser parser48 = parser35.settings(parseSettings46);
        org.jsoup.parser.ParseSettings parseSettings49 = parser35.settings();
        org.jsoup.parser.Parser parser50 = parser17.settings(parseSettings49);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList51 = parser50.getErrors();
        org.jsoup.parser.Parser parser52 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings53 = null;
        org.jsoup.parser.Parser parser54 = parser52.settings(parseSettings53);
        org.jsoup.nodes.Document document57 = parser54.parseInput("", "hi!");
        org.jsoup.parser.Parser parser60 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document61 = org.jsoup.Jsoup.parse("hi!", "hi!", parser60);
        org.jsoup.parser.ParseSettings parseSettings62 = parser60.settings();
        org.jsoup.parser.Parser parser63 = parser54.settings(parseSettings62);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList64 = parser63.getErrors();
        org.jsoup.parser.Parser parser65 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings66 = parser65.settings();
        org.jsoup.parser.Parser parser67 = parser63.settings(parseSettings66);
        org.jsoup.parser.Parser parser68 = parser50.settings(parseSettings66);
        org.jsoup.parser.ParseSettings parseSettings69 = parser68.settings();
        org.jsoup.parser.Parser parser70 = parser4.settings(parseSettings69);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList71 = parser70.getErrors();
        org.jsoup.nodes.Document document72 = org.jsoup.Jsoup.parse("hi!", "", parser70);
        org.jsoup.parser.Parser parser74 = parser70.setTrackErrors(0);
        org.jsoup.parser.ParseSettings parseSettings75 = parser70.settings();
        org.jsoup.parser.Parser parser77 = parser70.setTrackErrors((int) (byte) -1);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNull(parseSettings22);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(parser47);
        org.junit.Assert.assertNotNull(parser48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(parser50);
        org.junit.Assert.assertNotNull(parseErrorList51);
        org.junit.Assert.assertNotNull(parser52);
        org.junit.Assert.assertNotNull(parser54);
        org.junit.Assert.assertNotNull(document57);
        org.junit.Assert.assertNotNull(parser60);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNotNull(parseSettings62);
        org.junit.Assert.assertNotNull(parser63);
        org.junit.Assert.assertNotNull(parseErrorList64);
        org.junit.Assert.assertNotNull(parser65);
        org.junit.Assert.assertNotNull(parseSettings66);
        org.junit.Assert.assertNotNull(parser67);
        org.junit.Assert.assertNotNull(parser68);
        org.junit.Assert.assertNotNull(parseSettings69);
        org.junit.Assert.assertNotNull(parser70);
        org.junit.Assert.assertNull(parseErrorList71);
        org.junit.Assert.assertNotNull(document72);
        org.junit.Assert.assertNotNull(parser74);
        org.junit.Assert.assertNotNull(parseSettings75);
        org.junit.Assert.assertNotNull(parser77);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.nodes.Document document5 = parser2.parseInput("", "hi!");
        boolean boolean6 = parser2.isTrackErrors();
        org.jsoup.parser.Parser parser8 = parser2.setTrackErrors((int) '#');
        org.jsoup.parser.ParseSettings parseSettings9 = parser8.settings();
        org.jsoup.parser.Parser parser11 = parser8.setTrackErrors((int) 'a');
        org.jsoup.parser.Parser parser13 = parser8.setTrackErrors((int) (short) 100);
        org.jsoup.parser.Parser parser15 = parser8.setTrackErrors(10);
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNull(parseSettings9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser15);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser5.settings(parseSettings6);
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        org.jsoup.parser.Parser parser10 = parser8.settings(parseSettings9);
        org.jsoup.parser.ParseSettings parseSettings11 = null;
        org.jsoup.parser.Parser parser12 = parser8.settings(parseSettings11);
        org.jsoup.parser.Parser parser15 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parse("hi!", "hi!", parser15);
        org.jsoup.parser.ParseSettings parseSettings17 = parser15.settings();
        org.jsoup.parser.Parser parser18 = parser8.settings(parseSettings17);
        org.jsoup.parser.Parser parser19 = parser7.settings(parseSettings17);
        org.jsoup.parser.Parser parser20 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        org.jsoup.parser.Parser parser22 = parser20.settings(parseSettings21);
        org.jsoup.parser.ParseSettings parseSettings23 = null;
        org.jsoup.parser.Parser parser24 = parser20.settings(parseSettings23);
        org.jsoup.parser.ParseSettings parseSettings25 = parser20.settings();
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        org.jsoup.parser.Parser parser27 = parser20.settings(parseSettings26);
        org.jsoup.nodes.Document document30 = parser20.parseInput("", "hi!");
        org.jsoup.nodes.Document document33 = parser20.parseInput("", "hi!");
        org.jsoup.parser.Parser parser34 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings35 = null;
        org.jsoup.parser.Parser parser36 = parser34.settings(parseSettings35);
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        org.jsoup.parser.Parser parser38 = parser34.settings(parseSettings37);
        org.jsoup.parser.Parser parser39 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings40 = null;
        org.jsoup.parser.Parser parser41 = parser39.settings(parseSettings40);
        org.jsoup.nodes.Document document44 = parser41.parseInput("", "hi!");
        org.jsoup.parser.Parser parser47 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document48 = org.jsoup.Jsoup.parse("hi!", "hi!", parser47);
        org.jsoup.parser.ParseSettings parseSettings49 = parser47.settings();
        org.jsoup.parser.Parser parser50 = parser41.settings(parseSettings49);
        org.jsoup.parser.Parser parser51 = parser38.settings(parseSettings49);
        org.jsoup.parser.ParseSettings parseSettings52 = parser38.settings();
        org.jsoup.parser.Parser parser53 = parser20.settings(parseSettings52);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList54 = parser53.getErrors();
        org.jsoup.parser.Parser parser55 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings56 = null;
        org.jsoup.parser.Parser parser57 = parser55.settings(parseSettings56);
        org.jsoup.nodes.Document document60 = parser57.parseInput("", "hi!");
        org.jsoup.parser.Parser parser63 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document64 = org.jsoup.Jsoup.parse("hi!", "hi!", parser63);
        org.jsoup.parser.ParseSettings parseSettings65 = parser63.settings();
        org.jsoup.parser.Parser parser66 = parser57.settings(parseSettings65);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList67 = parser66.getErrors();
        org.jsoup.parser.Parser parser68 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings69 = parser68.settings();
        org.jsoup.parser.Parser parser70 = parser66.settings(parseSettings69);
        org.jsoup.parser.Parser parser71 = parser53.settings(parseSettings69);
        org.jsoup.parser.ParseSettings parseSettings72 = parser71.settings();
        org.jsoup.parser.Parser parser73 = parser7.settings(parseSettings72);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList74 = parser73.getErrors();
        org.jsoup.nodes.Document document75 = org.jsoup.Jsoup.parse("hi!", "", parser73);
        org.jsoup.parser.Parser parser77 = parser73.setTrackErrors(0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document78 = org.jsoup.Jsoup.parse(inputStream0, "", "hi!", parser77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNull(parseSettings25);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNotNull(parser41);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(parser47);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(parser50);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(parser53);
        org.junit.Assert.assertNotNull(parseErrorList54);
        org.junit.Assert.assertNotNull(parser55);
        org.junit.Assert.assertNotNull(parser57);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertNotNull(parser63);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertNotNull(parser66);
        org.junit.Assert.assertNotNull(parseErrorList67);
        org.junit.Assert.assertNotNull(parser68);
        org.junit.Assert.assertNotNull(parseSettings69);
        org.junit.Assert.assertNotNull(parser70);
        org.junit.Assert.assertNotNull(parser71);
        org.junit.Assert.assertNotNull(parseSettings72);
        org.junit.Assert.assertNotNull(parser73);
        org.junit.Assert.assertNull(parseErrorList74);
        org.junit.Assert.assertNotNull(document75);
        org.junit.Assert.assertNotNull(parser77);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.jsoup.parser.Parser parser1 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings2 = null;
        org.jsoup.parser.Parser parser3 = parser1.settings(parseSettings2);
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        org.jsoup.parser.Parser parser5 = parser1.settings(parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = parser1.settings();
        org.jsoup.parser.ParseSettings parseSettings7 = null;
        org.jsoup.parser.Parser parser8 = parser1.settings(parseSettings7);
        org.jsoup.nodes.Document document11 = parser1.parseInput("", "hi!");
        org.jsoup.nodes.Document document14 = parser1.parseInput("", "hi!");
        org.jsoup.parser.Parser parser15 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings16 = null;
        org.jsoup.parser.Parser parser17 = parser15.settings(parseSettings16);
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        org.jsoup.parser.Parser parser19 = parser15.settings(parseSettings18);
        org.jsoup.parser.Parser parser22 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parse("hi!", "hi!", parser22);
        org.jsoup.parser.ParseSettings parseSettings24 = parser22.settings();
        org.jsoup.parser.Parser parser25 = parser15.settings(parseSettings24);
        org.jsoup.parser.Parser parser26 = parser1.settings(parseSettings24);
        boolean boolean27 = parser1.isTrackErrors();
        org.jsoup.parser.Parser parser28 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        org.jsoup.parser.Parser parser30 = parser28.settings(parseSettings29);
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        org.jsoup.parser.Parser parser32 = parser28.settings(parseSettings31);
        org.jsoup.parser.ParseSettings parseSettings33 = parser28.settings();
        org.jsoup.parser.ParseSettings parseSettings34 = null;
        org.jsoup.parser.Parser parser35 = parser28.settings(parseSettings34);
        org.jsoup.parser.Parser parser36 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.ParseSettings parseSettings37 = parser36.settings();
        org.jsoup.parser.Parser parser38 = parser28.settings(parseSettings37);
        org.jsoup.parser.Parser parser39 = parser1.settings(parseSettings37);
        boolean boolean40 = parser39.isTrackErrors();
        org.jsoup.nodes.Document document43 = parser39.parseInput("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList45 = org.jsoup.parser.Parser.parseFragment("hi!", (org.jsoup.nodes.Element) document43, "hi!");
        org.junit.Assert.assertNotNull(parser1);
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNull(parseSettings6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNull(parseSettings33);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(nodeList45);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        org.jsoup.parser.Parser parser5 = parser3.settings(parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser3.settings(parseSettings6);
        org.jsoup.parser.Parser parser10 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("hi!", "hi!", parser10);
        org.jsoup.parser.ParseSettings parseSettings12 = parser10.settings();
        org.jsoup.parser.Parser parser13 = parser3.settings(parseSettings12);
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parse("hi!", "hi!", parser13);
        org.jsoup.nodes.Document document17 = parser13.parseInput("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = org.jsoup.parser.Parser.parseFragment("hi!", (org.jsoup.nodes.Element) document17, "");
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        org.jsoup.parser.Parser parser5 = parser3.settings(parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser3.settings(parseSettings6);
        org.jsoup.parser.ParseSettings parseSettings8 = parser3.settings();
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        org.jsoup.parser.Parser parser10 = parser3.settings(parseSettings9);
        org.jsoup.nodes.Document document13 = parser3.parseInput("", "hi!");
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parse("hi!", "", parser3);
        org.jsoup.parser.ParseSettings parseSettings15 = parser3.settings();
        org.jsoup.parser.Parser parser16 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList17 = parser16.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList18 = parser16.getErrors();
        org.jsoup.parser.ParseSettings parseSettings19 = parser16.settings();
        org.jsoup.parser.ParseSettings parseSettings20 = parser16.settings();
        org.jsoup.parser.Parser parser21 = parser3.settings(parseSettings20);
        org.jsoup.parser.Parser parser26 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parse("", "hi!", parser26);
        org.jsoup.parser.Parser parser29 = parser26.setTrackErrors(10);
        org.jsoup.parser.Parser parser31 = parser26.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser33 = parser26.setTrackErrors((int) (short) 1);
        org.jsoup.parser.Parser parser35 = parser26.setTrackErrors(100);
        org.jsoup.nodes.Document document36 = org.jsoup.Jsoup.parse("", "", parser35);
        org.jsoup.parser.ParseSettings parseSettings37 = parser35.settings();
        org.jsoup.parser.Parser parser38 = parser3.settings(parseSettings37);
        org.jsoup.nodes.Document document41 = parser3.parseInput("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList43 = org.jsoup.parser.Parser.parseFragment("", (org.jsoup.nodes.Element) document41, "");
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNull(parseSettings8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNull(parseSettings15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNull(parseErrorList17);
        org.junit.Assert.assertNull(parseErrorList18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(nodeList43);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = null;
        org.jsoup.parser.Parser parser8 = parser4.settings(parseSettings7);
        org.jsoup.parser.ParseSettings parseSettings9 = parser4.settings();
        org.jsoup.parser.ParseSettings parseSettings10 = null;
        org.jsoup.parser.Parser parser11 = parser4.settings(parseSettings10);
        org.jsoup.nodes.Document document14 = parser4.parseInput("", "hi!");
        org.jsoup.nodes.Document document17 = parser4.parseInput("", "hi!");
        org.jsoup.parser.Parser parser18 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        org.jsoup.parser.Parser parser20 = parser18.settings(parseSettings19);
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        org.jsoup.parser.Parser parser22 = parser18.settings(parseSettings21);
        org.jsoup.parser.Parser parser25 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parse("hi!", "hi!", parser25);
        org.jsoup.parser.ParseSettings parseSettings27 = parser25.settings();
        org.jsoup.parser.Parser parser28 = parser18.settings(parseSettings27);
        org.jsoup.parser.Parser parser29 = parser4.settings(parseSettings27);
        boolean boolean30 = parser4.isTrackErrors();
        org.jsoup.parser.Parser parser31 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        org.jsoup.parser.Parser parser33 = parser31.settings(parseSettings32);
        org.jsoup.parser.ParseSettings parseSettings34 = null;
        org.jsoup.parser.Parser parser35 = parser31.settings(parseSettings34);
        org.jsoup.parser.ParseSettings parseSettings36 = parser31.settings();
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        org.jsoup.parser.Parser parser38 = parser31.settings(parseSettings37);
        org.jsoup.parser.Parser parser39 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.ParseSettings parseSettings40 = parser39.settings();
        org.jsoup.parser.Parser parser41 = parser31.settings(parseSettings40);
        org.jsoup.parser.Parser parser42 = parser4.settings(parseSettings40);
        org.jsoup.parser.Parser parser44 = parser42.setTrackErrors(0);
        org.jsoup.parser.Parser parser46 = parser42.setTrackErrors((int) (short) 10);
        org.jsoup.parser.Parser parser48 = parser42.setTrackErrors((-1));
        org.jsoup.parser.Parser parser51 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document52 = org.jsoup.Jsoup.parse("hi!", "hi!", parser51);
        org.jsoup.parser.Parser parser53 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings54 = null;
        org.jsoup.parser.Parser parser55 = parser53.settings(parseSettings54);
        org.jsoup.nodes.Document document58 = parser55.parseInput("", "hi!");
        org.jsoup.parser.Parser parser61 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document62 = org.jsoup.Jsoup.parse("hi!", "hi!", parser61);
        org.jsoup.parser.ParseSettings parseSettings63 = parser61.settings();
        org.jsoup.parser.Parser parser64 = parser55.settings(parseSettings63);
        org.jsoup.parser.Parser parser65 = parser51.settings(parseSettings63);
        org.jsoup.parser.Parser parser67 = parser51.setTrackErrors((int) ' ');
        java.util.List<org.jsoup.parser.ParseError> parseErrorList68 = parser67.getErrors();
        org.jsoup.parser.ParseSettings parseSettings69 = parser67.settings();
        org.jsoup.parser.Parser parser70 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings71 = null;
        org.jsoup.parser.Parser parser72 = parser70.settings(parseSettings71);
        org.jsoup.nodes.Document document75 = parser72.parseInput("", "hi!");
        org.jsoup.parser.Parser parser78 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document79 = org.jsoup.Jsoup.parse("hi!", "hi!", parser78);
        org.jsoup.parser.ParseSettings parseSettings80 = parser78.settings();
        org.jsoup.parser.Parser parser81 = parser72.settings(parseSettings80);
        org.jsoup.parser.Parser parser82 = parser67.settings(parseSettings80);
        org.jsoup.parser.Parser parser84 = parser82.setTrackErrors(0);
        org.jsoup.parser.ParseSettings parseSettings85 = parser82.settings();
        boolean boolean86 = parser82.isTrackErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList87 = parser82.getErrors();
        org.jsoup.nodes.Document document90 = parser82.parseInput("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings91 = parser82.settings();
        org.jsoup.parser.Parser parser92 = parser48.settings(parseSettings91);
        org.jsoup.nodes.Document document93 = org.jsoup.Jsoup.parse("", "", parser48);
        boolean boolean94 = parser48.isTrackErrors();
        org.jsoup.nodes.Document document95 = org.jsoup.Jsoup.parse("hi!", "hi!", parser48);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNull(parseSettings9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNull(parseSettings36);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(parser41);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(parser48);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNotNull(parser53);
        org.junit.Assert.assertNotNull(parser55);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertNotNull(parser61);
        org.junit.Assert.assertNotNull(document62);
        org.junit.Assert.assertNotNull(parseSettings63);
        org.junit.Assert.assertNotNull(parser64);
        org.junit.Assert.assertNotNull(parser65);
        org.junit.Assert.assertNotNull(parser67);
        org.junit.Assert.assertNotNull(parseErrorList68);
        org.junit.Assert.assertNotNull(parseSettings69);
        org.junit.Assert.assertNotNull(parser70);
        org.junit.Assert.assertNotNull(parser72);
        org.junit.Assert.assertNotNull(document75);
        org.junit.Assert.assertNotNull(parser78);
        org.junit.Assert.assertNotNull(document79);
        org.junit.Assert.assertNotNull(parseSettings80);
        org.junit.Assert.assertNotNull(parser81);
        org.junit.Assert.assertNotNull(parser82);
        org.junit.Assert.assertNotNull(parser84);
        org.junit.Assert.assertNotNull(parseSettings85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(parseErrorList87);
        org.junit.Assert.assertNotNull(document90);
        org.junit.Assert.assertNotNull(parseSettings91);
        org.junit.Assert.assertNotNull(parser92);
        org.junit.Assert.assertNotNull(document93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(document95);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        org.jsoup.parser.Parser parser5 = parser3.settings(parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser3.settings(parseSettings6);
        org.jsoup.parser.ParseSettings parseSettings8 = parser3.settings();
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        org.jsoup.parser.Parser parser10 = parser3.settings(parseSettings9);
        org.jsoup.nodes.Document document13 = parser3.parseInput("", "hi!");
        org.jsoup.nodes.Document document16 = parser3.parseInput("", "hi!");
        org.jsoup.parser.Parser parser17 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        org.jsoup.parser.Parser parser19 = parser17.settings(parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = null;
        org.jsoup.parser.Parser parser21 = parser17.settings(parseSettings20);
        org.jsoup.parser.Parser parser24 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parse("hi!", "hi!", parser24);
        org.jsoup.parser.ParseSettings parseSettings26 = parser24.settings();
        org.jsoup.parser.Parser parser27 = parser17.settings(parseSettings26);
        org.jsoup.parser.Parser parser28 = parser3.settings(parseSettings26);
        boolean boolean29 = parser3.isTrackErrors();
        org.jsoup.parser.Parser parser30 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        org.jsoup.parser.Parser parser32 = parser30.settings(parseSettings31);
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        org.jsoup.parser.Parser parser34 = parser30.settings(parseSettings33);
        org.jsoup.parser.ParseSettings parseSettings35 = parser30.settings();
        org.jsoup.parser.ParseSettings parseSettings36 = null;
        org.jsoup.parser.Parser parser37 = parser30.settings(parseSettings36);
        org.jsoup.parser.Parser parser38 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.ParseSettings parseSettings39 = parser38.settings();
        org.jsoup.parser.Parser parser40 = parser30.settings(parseSettings39);
        org.jsoup.parser.Parser parser41 = parser3.settings(parseSettings39);
        org.jsoup.nodes.Document document44 = parser41.parseInput("", "hi!");
        org.jsoup.nodes.Document document47 = parser41.parseInput("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document48 = org.jsoup.Jsoup.parse(inputStream0, "hi!", "hi!", parser41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNull(parseSettings8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNull(parseSettings35);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(parseSettings39);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(parser41);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(document47);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.nodes.Document document5 = parser2.parseInput("", "hi!");
        org.jsoup.parser.Parser parser7 = parser2.setTrackErrors((-1));
        org.jsoup.parser.Parser parser10 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings11 = null;
        org.jsoup.parser.Parser parser12 = parser10.settings(parseSettings11);
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        org.jsoup.parser.Parser parser14 = parser10.settings(parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = parser10.settings();
        org.jsoup.parser.ParseSettings parseSettings16 = null;
        org.jsoup.parser.Parser parser17 = parser10.settings(parseSettings16);
        org.jsoup.nodes.Document document20 = parser10.parseInput("", "hi!");
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("hi!", "", parser10);
        org.jsoup.parser.ParseSettings parseSettings22 = parser10.settings();
        org.jsoup.parser.Parser parser23 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList24 = parser23.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList25 = parser23.getErrors();
        org.jsoup.parser.ParseSettings parseSettings26 = parser23.settings();
        org.jsoup.parser.ParseSettings parseSettings27 = parser23.settings();
        org.jsoup.parser.Parser parser28 = parser10.settings(parseSettings27);
        org.jsoup.parser.ParseSettings parseSettings29 = parser10.settings();
        org.jsoup.parser.Parser parser30 = parser2.settings(parseSettings29);
        org.jsoup.parser.ParseSettings parseSettings31 = parser2.settings();
        org.jsoup.parser.Parser parser33 = parser2.setTrackErrors((int) '4');
        org.jsoup.parser.Parser parser35 = parser2.setTrackErrors((int) (byte) 10);
        boolean boolean36 = parser2.isTrackErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList37 = parser2.getErrors();
        java.lang.Class<?> wildcardClass38 = parser2.getClass();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNull(parseSettings15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNull(parseSettings22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNull(parseErrorList24);
        org.junit.Assert.assertNull(parseErrorList25);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(parseErrorList37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = null;
        org.jsoup.parser.Parser parser8 = parser4.settings(parseSettings7);
        org.jsoup.parser.ParseSettings parseSettings9 = parser4.settings();
        org.jsoup.parser.ParseSettings parseSettings10 = null;
        org.jsoup.parser.Parser parser11 = parser4.settings(parseSettings10);
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parse("hi!", "", parser4);
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("", "", parser4);
        org.jsoup.parser.Parser parser15 = parser4.setTrackErrors(100);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNull(parseSettings9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parser15);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("", "hi!", parser2);
        org.jsoup.parser.Parser parser5 = parser2.setTrackErrors(10);
        org.jsoup.parser.Parser parser7 = parser2.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser9 = parser2.setTrackErrors((int) (short) 1);
        org.jsoup.parser.Parser parser11 = parser2.setTrackErrors(100);
        org.jsoup.parser.Parser parser13 = parser2.setTrackErrors(100);
        org.jsoup.parser.ParseSettings parseSettings14 = parser13.settings();
        org.jsoup.parser.Parser parser16 = parser13.setTrackErrors((int) '4');
        org.jsoup.nodes.Document document19 = parser13.parseInput("", "");
        org.jsoup.nodes.Document document22 = parser13.parseInput("", "");
        org.jsoup.parser.Parser parser27 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document28 = org.jsoup.Jsoup.parse("", "hi!", parser27);
        org.jsoup.parser.Parser parser30 = parser27.setTrackErrors(10);
        org.jsoup.parser.Parser parser32 = parser30.setTrackErrors(10);
        boolean boolean33 = parser32.isTrackErrors();
        org.jsoup.nodes.Document document34 = org.jsoup.Jsoup.parse("", "hi!", parser32);
        org.jsoup.parser.ParseSettings parseSettings35 = parser32.settings();
        org.jsoup.parser.ParseSettings parseSettings36 = parser32.settings();
        org.jsoup.parser.Parser parser37 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings38 = parser37.settings();
        org.jsoup.parser.Parser parser39 = parser32.settings(parseSettings38);
        boolean boolean40 = parser39.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings41 = parser39.settings();
        org.jsoup.parser.Parser parser42 = parser13.settings(parseSettings41);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(parser42);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        org.jsoup.parser.Parser parser5 = parser3.settings(parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = parser5.settings();
        org.jsoup.parser.Parser parser8 = parser5.setTrackErrors((int) '4');
        boolean boolean9 = parser5.isTrackErrors();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse(inputStream0, "hi!", "hi!", parser5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNull(parseSettings6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser11 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parse("hi!", "hi!", parser11);
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "", parser11);
        org.jsoup.nodes.Document document16 = parser11.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings17 = parser11.settings();
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parse("", "", parser11);
        org.jsoup.parser.Parser parser19 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings20 = null;
        org.jsoup.parser.Parser parser21 = parser19.settings(parseSettings20);
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        org.jsoup.parser.Parser parser23 = parser19.settings(parseSettings22);
        org.jsoup.nodes.Document document26 = parser19.parseInput("hi!", "");
        org.jsoup.parser.Parser parser27 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings28 = null;
        org.jsoup.parser.Parser parser29 = parser27.settings(parseSettings28);
        org.jsoup.parser.ParseSettings parseSettings30 = null;
        org.jsoup.parser.Parser parser31 = parser27.settings(parseSettings30);
        org.jsoup.parser.ParseSettings parseSettings32 = parser27.settings();
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        org.jsoup.parser.Parser parser34 = parser27.settings(parseSettings33);
        org.jsoup.nodes.Document document37 = parser27.parseInput("", "hi!");
        org.jsoup.nodes.Document document40 = parser27.parseInput("", "hi!");
        org.jsoup.parser.Parser parser41 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings42 = null;
        org.jsoup.parser.Parser parser43 = parser41.settings(parseSettings42);
        org.jsoup.parser.ParseSettings parseSettings44 = null;
        org.jsoup.parser.Parser parser45 = parser41.settings(parseSettings44);
        org.jsoup.parser.Parser parser48 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document49 = org.jsoup.Jsoup.parse("hi!", "hi!", parser48);
        org.jsoup.parser.ParseSettings parseSettings50 = parser48.settings();
        org.jsoup.parser.Parser parser51 = parser41.settings(parseSettings50);
        org.jsoup.parser.Parser parser52 = parser27.settings(parseSettings50);
        org.jsoup.parser.Parser parser53 = parser19.settings(parseSettings50);
        org.jsoup.parser.Parser parser54 = parser11.settings(parseSettings50);
        boolean boolean55 = parser11.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings56 = parser11.settings();
        org.jsoup.parser.Parser parser58 = parser11.setTrackErrors(1);
        org.jsoup.nodes.Document document59 = org.jsoup.Jsoup.parse("", "hi!", parser11);
        org.jsoup.parser.Parser parser61 = parser11.setTrackErrors(100);
        org.jsoup.parser.Parser parser64 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings65 = null;
        org.jsoup.parser.Parser parser66 = parser64.settings(parseSettings65);
        org.jsoup.parser.ParseSettings parseSettings67 = null;
        org.jsoup.parser.Parser parser68 = parser64.settings(parseSettings67);
        org.jsoup.parser.ParseSettings parseSettings69 = parser64.settings();
        org.jsoup.parser.ParseSettings parseSettings70 = null;
        org.jsoup.parser.Parser parser71 = parser64.settings(parseSettings70);
        org.jsoup.nodes.Document document74 = parser64.parseInput("", "hi!");
        org.jsoup.nodes.Document document75 = org.jsoup.Jsoup.parse("hi!", "", parser64);
        org.jsoup.parser.ParseSettings parseSettings76 = parser64.settings();
        org.jsoup.parser.Parser parser77 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList78 = parser77.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList79 = parser77.getErrors();
        org.jsoup.parser.ParseSettings parseSettings80 = parser77.settings();
        org.jsoup.parser.ParseSettings parseSettings81 = parser77.settings();
        org.jsoup.parser.Parser parser82 = parser64.settings(parseSettings81);
        org.jsoup.parser.ParseSettings parseSettings83 = parser64.settings();
        org.jsoup.parser.Parser parser84 = parser11.settings(parseSettings83);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document85 = org.jsoup.Jsoup.parse(inputStream0, "", "hi!", parser84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNull(parseSettings32);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(parser41);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(parser48);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertNotNull(parseSettings50);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertNotNull(parser52);
        org.junit.Assert.assertNotNull(parser53);
        org.junit.Assert.assertNotNull(parser54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertNotNull(document59);
        org.junit.Assert.assertNotNull(parser61);
        org.junit.Assert.assertNotNull(parser64);
        org.junit.Assert.assertNotNull(parser66);
        org.junit.Assert.assertNotNull(parser68);
        org.junit.Assert.assertNull(parseSettings69);
        org.junit.Assert.assertNotNull(parser71);
        org.junit.Assert.assertNotNull(document74);
        org.junit.Assert.assertNotNull(document75);
        org.junit.Assert.assertNull(parseSettings76);
        org.junit.Assert.assertNotNull(parser77);
        org.junit.Assert.assertNull(parseErrorList78);
        org.junit.Assert.assertNull(parseErrorList79);
        org.junit.Assert.assertNotNull(parseSettings80);
        org.junit.Assert.assertNotNull(parseSettings81);
        org.junit.Assert.assertNotNull(parser82);
        org.junit.Assert.assertNotNull(parseSettings83);
        org.junit.Assert.assertNotNull(parser84);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.Parser parser2 = parser0.setTrackErrors((int) (short) -1);
        org.jsoup.parser.Parser parser4 = parser2.setTrackErrors((int) (byte) 1);
        boolean boolean5 = parser4.isTrackErrors();
        org.jsoup.nodes.Document document8 = parser4.parseInput("hi!", "");
        boolean boolean9 = parser4.isTrackErrors();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("hi!", "hi!", parser2);
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.nodes.Document document9 = parser6.parseInput("", "hi!");
        org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "hi!", parser12);
        org.jsoup.parser.ParseSettings parseSettings14 = parser12.settings();
        org.jsoup.parser.Parser parser15 = parser6.settings(parseSettings14);
        org.jsoup.parser.Parser parser16 = parser2.settings(parseSettings14);
        org.jsoup.parser.Parser parser18 = parser2.setTrackErrors((int) ' ');
        org.jsoup.nodes.Document document21 = parser2.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings22 = parser2.settings();
        java.lang.Class<?> wildcardClass23 = parser2.getClass();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("hi!", "", parser6);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList8 = parser6.getErrors();
        boolean boolean9 = parser6.isTrackErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList10 = parser6.getErrors();
        org.jsoup.parser.ParseSettings parseSettings11 = parser6.settings();
        org.jsoup.parser.ParseSettings parseSettings12 = parser6.settings();
        org.jsoup.parser.ParseSettings parseSettings13 = parser6.settings();
        boolean boolean14 = parser6.isTrackErrors();
        org.jsoup.parser.Parser parser16 = parser6.setTrackErrors(100);
        org.jsoup.parser.Parser parser17 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        org.jsoup.parser.Parser parser19 = parser17.settings(parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = null;
        org.jsoup.parser.Parser parser21 = parser17.settings(parseSettings20);
        org.jsoup.parser.ParseSettings parseSettings22 = parser17.settings();
        org.jsoup.parser.ParseSettings parseSettings23 = null;
        org.jsoup.parser.Parser parser24 = parser17.settings(parseSettings23);
        org.jsoup.nodes.Document document27 = parser17.parseInput("", "hi!");
        org.jsoup.nodes.Document document30 = parser17.parseInput("", "hi!");
        org.jsoup.parser.Parser parser31 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        org.jsoup.parser.Parser parser33 = parser31.settings(parseSettings32);
        org.jsoup.parser.ParseSettings parseSettings34 = null;
        org.jsoup.parser.Parser parser35 = parser31.settings(parseSettings34);
        org.jsoup.parser.Parser parser38 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document39 = org.jsoup.Jsoup.parse("hi!", "hi!", parser38);
        org.jsoup.parser.ParseSettings parseSettings40 = parser38.settings();
        org.jsoup.parser.Parser parser41 = parser31.settings(parseSettings40);
        org.jsoup.parser.Parser parser42 = parser17.settings(parseSettings40);
        org.jsoup.nodes.Document document45 = parser17.parseInput("", "hi!");
        java.util.List<org.jsoup.parser.ParseError> parseErrorList46 = parser17.getErrors();
        org.jsoup.parser.ParseSettings parseSettings47 = parser17.settings();
        org.jsoup.parser.Parser parser52 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document53 = org.jsoup.Jsoup.parse("", "hi!", parser52);
        org.jsoup.parser.Parser parser55 = parser52.setTrackErrors(10);
        org.jsoup.parser.Parser parser57 = parser52.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser59 = parser52.setTrackErrors((int) (short) 1);
        org.jsoup.nodes.Document document60 = org.jsoup.Jsoup.parse("hi!", "", parser59);
        org.jsoup.parser.Parser parser62 = parser59.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser64 = parser59.setTrackErrors(1);
        org.jsoup.parser.Parser parser66 = parser59.setTrackErrors((int) (short) -1);
        org.jsoup.parser.Parser parser67 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings68 = null;
        org.jsoup.parser.Parser parser69 = parser67.settings(parseSettings68);
        org.jsoup.parser.ParseSettings parseSettings70 = null;
        org.jsoup.parser.Parser parser71 = parser67.settings(parseSettings70);
        org.jsoup.parser.ParseSettings parseSettings72 = parser67.settings();
        org.jsoup.parser.ParseSettings parseSettings73 = null;
        org.jsoup.parser.Parser parser74 = parser67.settings(parseSettings73);
        org.jsoup.parser.Parser parser75 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.ParseSettings parseSettings76 = parser75.settings();
        org.jsoup.parser.Parser parser77 = parser67.settings(parseSettings76);
        org.jsoup.parser.Parser parser78 = parser59.settings(parseSettings76);
        org.jsoup.parser.Parser parser79 = parser17.settings(parseSettings76);
        org.jsoup.parser.Parser parser80 = parser16.settings(parseSettings76);
        org.jsoup.nodes.Document document81 = org.jsoup.Jsoup.parse("", "hi!", parser80);
        java.lang.Class<?> wildcardClass82 = parser80.getClass();
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(parseErrorList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(parseErrorList10);
        org.junit.Assert.assertNull(parseSettings11);
        org.junit.Assert.assertNull(parseSettings12);
        org.junit.Assert.assertNull(parseSettings13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNull(parseSettings22);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(parser41);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(parseErrorList46);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(parser52);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNotNull(parser55);
        org.junit.Assert.assertNotNull(parser57);
        org.junit.Assert.assertNotNull(parser59);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertNotNull(parser62);
        org.junit.Assert.assertNotNull(parser64);
        org.junit.Assert.assertNotNull(parser66);
        org.junit.Assert.assertNotNull(parser67);
        org.junit.Assert.assertNotNull(parser69);
        org.junit.Assert.assertNotNull(parser71);
        org.junit.Assert.assertNull(parseSettings72);
        org.junit.Assert.assertNotNull(parser74);
        org.junit.Assert.assertNotNull(parser75);
        org.junit.Assert.assertNotNull(parseSettings76);
        org.junit.Assert.assertNotNull(parser77);
        org.junit.Assert.assertNotNull(parser78);
        org.junit.Assert.assertNotNull(parser79);
        org.junit.Assert.assertNotNull(parser80);
        org.junit.Assert.assertNotNull(document81);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("hi!", "hi!", parser2);
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.nodes.Document document9 = parser6.parseInput("", "hi!");
        org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "hi!", parser12);
        org.jsoup.parser.ParseSettings parseSettings14 = parser12.settings();
        org.jsoup.parser.Parser parser15 = parser6.settings(parseSettings14);
        org.jsoup.parser.Parser parser16 = parser2.settings(parseSettings14);
        org.jsoup.parser.Parser parser18 = parser2.setTrackErrors((int) ' ');
        org.jsoup.nodes.Document document21 = parser2.parseInput("", "hi!");
        org.jsoup.nodes.Document document24 = parser2.parseInput("hi!", "hi!");
        org.jsoup.nodes.Document document27 = parser2.parseInput("hi!", "hi!");
        org.jsoup.parser.Parser parser29 = parser2.setTrackErrors((int) (byte) 100);
        boolean boolean30 = parser29.isTrackErrors();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("", "hi!", parser4);
        org.jsoup.parser.Parser parser7 = parser4.setTrackErrors(10);
        org.jsoup.parser.Parser parser9 = parser7.setTrackErrors(10);
        boolean boolean10 = parser9.isTrackErrors();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("", "hi!", parser9);
        org.jsoup.parser.ParseSettings parseSettings12 = parser9.settings();
        org.jsoup.parser.Parser parser15 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parse("hi!", "hi!", parser15);
        org.jsoup.parser.Parser parser17 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        org.jsoup.parser.Parser parser19 = parser17.settings(parseSettings18);
        org.jsoup.nodes.Document document22 = parser19.parseInput("", "hi!");
        org.jsoup.parser.Parser parser25 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parse("hi!", "hi!", parser25);
        org.jsoup.parser.ParseSettings parseSettings27 = parser25.settings();
        org.jsoup.parser.Parser parser28 = parser19.settings(parseSettings27);
        org.jsoup.parser.Parser parser29 = parser15.settings(parseSettings27);
        boolean boolean30 = parser15.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings31 = parser15.settings();
        org.jsoup.parser.Parser parser32 = parser9.settings(parseSettings31);
        org.jsoup.parser.Parser parser34 = parser9.setTrackErrors((-1));
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parser34);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("hi!", "hi!", parser4);
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings7 = null;
        org.jsoup.parser.Parser parser8 = parser6.settings(parseSettings7);
        org.jsoup.nodes.Document document11 = parser8.parseInput("", "hi!");
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("hi!", "hi!", parser14);
        org.jsoup.parser.ParseSettings parseSettings16 = parser14.settings();
        org.jsoup.parser.Parser parser17 = parser8.settings(parseSettings16);
        org.jsoup.parser.Parser parser18 = parser4.settings(parseSettings16);
        org.jsoup.nodes.Document document21 = parser18.parseInput("", "");
        org.jsoup.nodes.Document document22 = org.jsoup.Jsoup.parse("", "hi!", parser18);
        org.jsoup.parser.Parser parser23 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        org.jsoup.parser.Parser parser25 = parser23.settings(parseSettings24);
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        org.jsoup.parser.Parser parser27 = parser23.settings(parseSettings26);
        org.jsoup.parser.Parser parser28 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        org.jsoup.parser.Parser parser30 = parser28.settings(parseSettings29);
        org.jsoup.nodes.Document document33 = parser30.parseInput("", "hi!");
        org.jsoup.parser.Parser parser36 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document37 = org.jsoup.Jsoup.parse("hi!", "hi!", parser36);
        org.jsoup.parser.ParseSettings parseSettings38 = parser36.settings();
        org.jsoup.parser.Parser parser39 = parser30.settings(parseSettings38);
        org.jsoup.parser.Parser parser40 = parser27.settings(parseSettings38);
        org.jsoup.parser.Parser parser43 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document44 = org.jsoup.Jsoup.parse("", "hi!", parser43);
        org.jsoup.parser.Parser parser46 = parser43.setTrackErrors((int) '#');
        org.jsoup.parser.ParseSettings parseSettings47 = parser46.settings();
        boolean boolean48 = parser46.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings49 = parser46.settings();
        org.jsoup.parser.Parser parser50 = parser27.settings(parseSettings49);
        org.jsoup.parser.Parser parser51 = parser18.settings(parseSettings49);
        org.jsoup.parser.Parser parser53 = parser51.setTrackErrors((int) '#');
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(parser50);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertNotNull(parser53);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = parser0.settings();
        boolean boolean2 = parser0.isTrackErrors();
        org.jsoup.nodes.Document document5 = parser0.parseInput("hi!", "hi!");
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parseSettings1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(document5);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        boolean boolean3 = parser0.isTrackErrors();
        boolean boolean4 = parser0.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings5 = parser0.settings();
        org.jsoup.nodes.Document document8 = parser0.parseInput("hi!", "");
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(parseSettings5);
        org.junit.Assert.assertNotNull(document8);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser9 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse("hi!", "hi!", parser9);
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("hi!", "", parser9);
        org.jsoup.nodes.Document document14 = parser9.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings15 = parser9.settings();
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parse("", "", parser9);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList17 = parser9.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList18 = parser9.getErrors();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parse(inputStream0, "hi!", "hi!", parser9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parseErrorList17);
        org.junit.Assert.assertNotNull(parseErrorList18);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("hi!", "hi!", parser4);
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse("hi!", "", parser4);
        org.jsoup.nodes.Document document9 = parser4.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings10 = parser4.settings();
        org.jsoup.parser.Parser parser12 = parser4.setTrackErrors((int) (short) 100);
        org.jsoup.parser.ParseSettings parseSettings13 = parser4.settings();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList14 = parser4.getErrors();
        org.jsoup.parser.Parser parser17 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parse("hi!", "hi!", parser17);
        org.jsoup.parser.Parser parser19 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings20 = null;
        org.jsoup.parser.Parser parser21 = parser19.settings(parseSettings20);
        org.jsoup.nodes.Document document24 = parser21.parseInput("", "hi!");
        org.jsoup.parser.Parser parser27 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document28 = org.jsoup.Jsoup.parse("hi!", "hi!", parser27);
        org.jsoup.parser.ParseSettings parseSettings29 = parser27.settings();
        org.jsoup.parser.Parser parser30 = parser21.settings(parseSettings29);
        org.jsoup.parser.Parser parser31 = parser17.settings(parseSettings29);
        org.jsoup.parser.Parser parser33 = parser17.setTrackErrors((int) ' ');
        java.util.List<org.jsoup.parser.ParseError> parseErrorList34 = parser33.getErrors();
        org.jsoup.parser.ParseSettings parseSettings35 = parser33.settings();
        org.jsoup.parser.Parser parser36 = parser4.settings(parseSettings35);
        org.jsoup.parser.Parser parser39 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document40 = org.jsoup.Jsoup.parse("hi!", "hi!", parser39);
        org.jsoup.parser.Parser parser41 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings42 = null;
        org.jsoup.parser.Parser parser43 = parser41.settings(parseSettings42);
        org.jsoup.nodes.Document document46 = parser43.parseInput("", "hi!");
        org.jsoup.parser.Parser parser49 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document50 = org.jsoup.Jsoup.parse("hi!", "hi!", parser49);
        org.jsoup.parser.ParseSettings parseSettings51 = parser49.settings();
        org.jsoup.parser.Parser parser52 = parser43.settings(parseSettings51);
        org.jsoup.parser.Parser parser53 = parser39.settings(parseSettings51);
        org.jsoup.parser.Parser parser55 = parser39.setTrackErrors((int) ' ');
        java.util.List<org.jsoup.parser.ParseError> parseErrorList56 = parser55.getErrors();
        org.jsoup.parser.ParseSettings parseSettings57 = parser55.settings();
        org.jsoup.parser.Parser parser58 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings59 = null;
        org.jsoup.parser.Parser parser60 = parser58.settings(parseSettings59);
        org.jsoup.nodes.Document document63 = parser60.parseInput("", "hi!");
        org.jsoup.parser.Parser parser66 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document67 = org.jsoup.Jsoup.parse("hi!", "hi!", parser66);
        org.jsoup.parser.ParseSettings parseSettings68 = parser66.settings();
        org.jsoup.parser.Parser parser69 = parser60.settings(parseSettings68);
        org.jsoup.parser.Parser parser70 = parser55.settings(parseSettings68);
        org.jsoup.parser.ParseSettings parseSettings71 = parser55.settings();
        org.jsoup.parser.Parser parser72 = parser4.settings(parseSettings71);
        org.jsoup.parser.Parser parser75 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document76 = org.jsoup.Jsoup.parse("", "hi!", parser75);
        org.jsoup.parser.Parser parser78 = parser75.setTrackErrors(10);
        org.jsoup.parser.Parser parser80 = parser75.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser82 = parser75.setTrackErrors((int) (short) 1);
        org.jsoup.parser.Parser parser84 = parser75.setTrackErrors(100);
        org.jsoup.parser.Parser parser86 = parser75.setTrackErrors(100);
        org.jsoup.parser.ParseSettings parseSettings87 = parser86.settings();
        org.jsoup.parser.Parser parser89 = parser86.setTrackErrors((int) '4');
        java.util.List<org.jsoup.parser.ParseError> parseErrorList90 = parser86.getErrors();
        org.jsoup.parser.ParseSettings parseSettings91 = parser86.settings();
        org.jsoup.parser.Parser parser92 = parser72.settings(parseSettings91);
        org.jsoup.parser.Parser parser94 = parser92.setTrackErrors((int) (short) 0);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(parseErrorList14);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parseErrorList34);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(parser41);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(parser52);
        org.junit.Assert.assertNotNull(parser53);
        org.junit.Assert.assertNotNull(parser55);
        org.junit.Assert.assertNotNull(parseErrorList56);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertNotNull(parser60);
        org.junit.Assert.assertNotNull(document63);
        org.junit.Assert.assertNotNull(parser66);
        org.junit.Assert.assertNotNull(document67);
        org.junit.Assert.assertNotNull(parseSettings68);
        org.junit.Assert.assertNotNull(parser69);
        org.junit.Assert.assertNotNull(parser70);
        org.junit.Assert.assertNotNull(parseSettings71);
        org.junit.Assert.assertNotNull(parser72);
        org.junit.Assert.assertNotNull(parser75);
        org.junit.Assert.assertNotNull(document76);
        org.junit.Assert.assertNotNull(parser78);
        org.junit.Assert.assertNotNull(parser80);
        org.junit.Assert.assertNotNull(parser82);
        org.junit.Assert.assertNotNull(parser84);
        org.junit.Assert.assertNotNull(parser86);
        org.junit.Assert.assertNotNull(parseSettings87);
        org.junit.Assert.assertNotNull(parser89);
        org.junit.Assert.assertNotNull(parseErrorList90);
        org.junit.Assert.assertNotNull(parseSettings91);
        org.junit.Assert.assertNotNull(parser92);
        org.junit.Assert.assertNotNull(parser94);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser2.settings(parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = parser2.settings();
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser2.settings(parseSettings8);
        org.jsoup.nodes.Document document12 = parser2.parseInput("", "hi!");
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "", parser2);
        org.jsoup.parser.ParseSettings parseSettings14 = parser2.settings();
        org.jsoup.parser.Parser parser15 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList16 = parser15.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList17 = parser15.getErrors();
        org.jsoup.parser.ParseSettings parseSettings18 = parser15.settings();
        org.jsoup.parser.ParseSettings parseSettings19 = parser15.settings();
        org.jsoup.parser.Parser parser20 = parser2.settings(parseSettings19);
        org.jsoup.parser.Parser parser22 = parser2.setTrackErrors((int) (short) 10);
        boolean boolean23 = parser2.isTrackErrors();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNull(parseSettings7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNull(parseErrorList16);
        org.junit.Assert.assertNull(parseErrorList17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("hi!", "hi!", parser2);
        org.jsoup.parser.ParseSettings parseSettings4 = parser2.settings();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList5 = parser2.getErrors();
        org.jsoup.parser.Parser parser7 = parser2.setTrackErrors((int) (short) 100);
        org.jsoup.parser.Parser parser9 = parser7.setTrackErrors(0);
        org.jsoup.parser.ParseSettings parseSettings10 = parser7.settings();
        org.jsoup.parser.Parser parser12 = parser7.setTrackErrors((-1));
        org.jsoup.nodes.Document document15 = parser12.parseInput("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings16 = parser12.settings();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertNotNull(parseErrorList5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(parseSettings16);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("hi!", "", parser4);
        org.jsoup.parser.ParseSettings parseSettings6 = parser4.settings();
        org.jsoup.parser.Parser parser8 = parser4.setTrackErrors((int) (byte) 1);
        org.jsoup.parser.Parser parser10 = parser8.setTrackErrors((int) 'a');
        boolean boolean11 = parser10.isTrackErrors();
        org.jsoup.parser.Parser parser13 = parser10.setTrackErrors((int) (short) 100);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNull(parseSettings6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(parser13);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList3 = parser2.getErrors();
        org.jsoup.parser.Parser parser5 = parser2.setTrackErrors((int) (short) 100);
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse("hi!", "hi!", parser5);
        org.jsoup.parser.Parser parser7 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser7.settings(parseSettings8);
        org.jsoup.parser.ParseSettings parseSettings10 = null;
        org.jsoup.parser.Parser parser11 = parser7.settings(parseSettings10);
        org.jsoup.parser.ParseSettings parseSettings12 = parser7.settings();
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        org.jsoup.parser.Parser parser14 = parser7.settings(parseSettings13);
        org.jsoup.nodes.Document document17 = parser7.parseInput("", "hi!");
        org.jsoup.nodes.Document document20 = parser7.parseInput("", "hi!");
        org.jsoup.parser.Parser parser21 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        org.jsoup.parser.Parser parser23 = parser21.settings(parseSettings22);
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        org.jsoup.parser.Parser parser25 = parser21.settings(parseSettings24);
        org.jsoup.parser.Parser parser28 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document29 = org.jsoup.Jsoup.parse("hi!", "hi!", parser28);
        org.jsoup.parser.ParseSettings parseSettings30 = parser28.settings();
        org.jsoup.parser.Parser parser31 = parser21.settings(parseSettings30);
        org.jsoup.parser.Parser parser32 = parser7.settings(parseSettings30);
        org.jsoup.nodes.Document document35 = parser7.parseInput("", "hi!");
        java.util.List<org.jsoup.parser.ParseError> parseErrorList36 = parser7.getErrors();
        org.jsoup.parser.ParseSettings parseSettings37 = parser7.settings();
        org.jsoup.parser.ParseSettings parseSettings38 = parser7.settings();
        org.jsoup.parser.Parser parser39 = parser5.settings(parseSettings38);
        org.jsoup.parser.Parser parser40 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings41 = parser40.settings();
        org.jsoup.parser.Parser parser42 = parser5.settings(parseSettings41);
        org.jsoup.parser.Parser parser44 = parser42.setTrackErrors((-1));
        org.jsoup.parser.ParseSettings parseSettings45 = parser44.settings();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList46 = parser44.getErrors();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNull(parseErrorList3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNull(parseSettings12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(parseErrorList36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(parseErrorList46);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("hi!", "hi!", parser6);
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        org.jsoup.parser.Parser parser10 = parser8.settings(parseSettings9);
        org.jsoup.nodes.Document document13 = parser10.parseInput("", "hi!");
        org.jsoup.parser.Parser parser16 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parse("hi!", "hi!", parser16);
        org.jsoup.parser.ParseSettings parseSettings18 = parser16.settings();
        org.jsoup.parser.Parser parser19 = parser10.settings(parseSettings18);
        org.jsoup.parser.Parser parser20 = parser6.settings(parseSettings18);
        org.jsoup.parser.Parser parser22 = parser6.setTrackErrors((int) ' ');
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parse("hi!", "", parser22);
        org.jsoup.nodes.Document document26 = parser22.parseInput("hi!", "hi!");
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parse("", "hi!", parser22);
        org.jsoup.parser.Parser parser29 = parser22.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser30 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        org.jsoup.parser.Parser parser32 = parser30.settings(parseSettings31);
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        org.jsoup.parser.Parser parser34 = parser30.settings(parseSettings33);
        org.jsoup.parser.ParseSettings parseSettings35 = parser30.settings();
        org.jsoup.parser.ParseSettings parseSettings36 = null;
        org.jsoup.parser.Parser parser37 = parser30.settings(parseSettings36);
        org.jsoup.nodes.Document document40 = parser30.parseInput("", "hi!");
        org.jsoup.nodes.Document document43 = parser30.parseInput("", "hi!");
        org.jsoup.parser.Parser parser44 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings45 = null;
        org.jsoup.parser.Parser parser46 = parser44.settings(parseSettings45);
        org.jsoup.parser.ParseSettings parseSettings47 = null;
        org.jsoup.parser.Parser parser48 = parser44.settings(parseSettings47);
        org.jsoup.parser.Parser parser49 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings50 = null;
        org.jsoup.parser.Parser parser51 = parser49.settings(parseSettings50);
        org.jsoup.nodes.Document document54 = parser51.parseInput("", "hi!");
        org.jsoup.parser.Parser parser57 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document58 = org.jsoup.Jsoup.parse("hi!", "hi!", parser57);
        org.jsoup.parser.ParseSettings parseSettings59 = parser57.settings();
        org.jsoup.parser.Parser parser60 = parser51.settings(parseSettings59);
        org.jsoup.parser.Parser parser61 = parser48.settings(parseSettings59);
        org.jsoup.parser.ParseSettings parseSettings62 = parser48.settings();
        org.jsoup.parser.Parser parser63 = parser30.settings(parseSettings62);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList64 = parser63.getErrors();
        org.jsoup.parser.Parser parser67 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document68 = org.jsoup.Jsoup.parse("", "hi!", parser67);
        org.jsoup.parser.Parser parser70 = parser67.setTrackErrors(10);
        org.jsoup.parser.Parser parser72 = parser67.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser74 = parser67.setTrackErrors((int) (short) 1);
        org.jsoup.parser.Parser parser76 = parser67.setTrackErrors(100);
        org.jsoup.parser.Parser parser78 = parser67.setTrackErrors(100);
        org.jsoup.parser.ParseSettings parseSettings79 = parser78.settings();
        org.jsoup.parser.Parser parser80 = parser63.settings(parseSettings79);
        org.jsoup.parser.Parser parser81 = parser22.settings(parseSettings79);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNull(parseSettings35);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(parser48);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNotNull(parser57);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(parser60);
        org.junit.Assert.assertNotNull(parser61);
        org.junit.Assert.assertNotNull(parseSettings62);
        org.junit.Assert.assertNotNull(parser63);
        org.junit.Assert.assertNotNull(parseErrorList64);
        org.junit.Assert.assertNotNull(parser67);
        org.junit.Assert.assertNotNull(document68);
        org.junit.Assert.assertNotNull(parser70);
        org.junit.Assert.assertNotNull(parser72);
        org.junit.Assert.assertNotNull(parser74);
        org.junit.Assert.assertNotNull(parser76);
        org.junit.Assert.assertNotNull(parser78);
        org.junit.Assert.assertNotNull(parseSettings79);
        org.junit.Assert.assertNotNull(parser80);
        org.junit.Assert.assertNotNull(parser81);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser2.settings(parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = parser2.settings();
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser2.settings(parseSettings8);
        org.jsoup.nodes.Document document12 = parser2.parseInput("", "hi!");
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "", parser2);
        org.jsoup.parser.ParseSettings parseSettings14 = parser2.settings();
        org.jsoup.parser.ParseSettings parseSettings15 = parser2.settings();
        org.jsoup.parser.Parser parser16 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList17 = parser16.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList18 = parser16.getErrors();
        org.jsoup.parser.ParseSettings parseSettings19 = parser16.settings();
        org.jsoup.parser.ParseSettings parseSettings20 = parser16.settings();
        org.jsoup.parser.Parser parser21 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList22 = parser21.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList23 = parser21.getErrors();
        org.jsoup.parser.ParseSettings parseSettings24 = parser21.settings();
        org.jsoup.parser.Parser parser25 = parser16.settings(parseSettings24);
        org.jsoup.parser.Parser parser26 = parser2.settings(parseSettings24);
        boolean boolean27 = parser26.isTrackErrors();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNull(parseSettings7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNull(parseSettings14);
        org.junit.Assert.assertNull(parseSettings15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNull(parseErrorList17);
        org.junit.Assert.assertNull(parseErrorList18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNull(parseErrorList22);
        org.junit.Assert.assertNull(parseErrorList23);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.jsoup.parser.Parser parser10 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("", "hi!", parser10);
        org.jsoup.parser.Parser parser13 = parser10.setTrackErrors(10);
        org.jsoup.parser.Parser parser15 = parser10.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser17 = parser10.setTrackErrors((int) (short) 1);
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parse("hi!", "", parser17);
        org.jsoup.parser.Parser parser20 = parser17.setTrackErrors((int) (byte) -1);
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("hi!", "hi!", parser17);
        org.jsoup.parser.Parser parser23 = parser17.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser24 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings25 = null;
        org.jsoup.parser.Parser parser26 = parser24.settings(parseSettings25);
        org.jsoup.parser.ParseSettings parseSettings27 = null;
        org.jsoup.parser.Parser parser28 = parser24.settings(parseSettings27);
        org.jsoup.parser.ParseSettings parseSettings29 = parser24.settings();
        org.jsoup.parser.ParseSettings parseSettings30 = null;
        org.jsoup.parser.Parser parser31 = parser24.settings(parseSettings30);
        org.jsoup.nodes.Document document34 = parser24.parseInput("", "hi!");
        org.jsoup.nodes.Document document37 = parser24.parseInput("", "hi!");
        org.jsoup.parser.Parser parser38 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings39 = null;
        org.jsoup.parser.Parser parser40 = parser38.settings(parseSettings39);
        org.jsoup.parser.ParseSettings parseSettings41 = null;
        org.jsoup.parser.Parser parser42 = parser38.settings(parseSettings41);
        org.jsoup.parser.Parser parser43 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings44 = null;
        org.jsoup.parser.Parser parser45 = parser43.settings(parseSettings44);
        org.jsoup.nodes.Document document48 = parser45.parseInput("", "hi!");
        org.jsoup.parser.Parser parser51 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document52 = org.jsoup.Jsoup.parse("hi!", "hi!", parser51);
        org.jsoup.parser.ParseSettings parseSettings53 = parser51.settings();
        org.jsoup.parser.Parser parser54 = parser45.settings(parseSettings53);
        org.jsoup.parser.Parser parser55 = parser42.settings(parseSettings53);
        org.jsoup.parser.ParseSettings parseSettings56 = parser42.settings();
        org.jsoup.parser.Parser parser57 = parser24.settings(parseSettings56);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList58 = parser57.getErrors();
        org.jsoup.parser.Parser parser59 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings60 = null;
        org.jsoup.parser.Parser parser61 = parser59.settings(parseSettings60);
        org.jsoup.nodes.Document document64 = parser61.parseInput("", "hi!");
        org.jsoup.parser.Parser parser67 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document68 = org.jsoup.Jsoup.parse("hi!", "hi!", parser67);
        org.jsoup.parser.ParseSettings parseSettings69 = parser67.settings();
        org.jsoup.parser.Parser parser70 = parser61.settings(parseSettings69);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList71 = parser70.getErrors();
        org.jsoup.parser.Parser parser72 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings73 = parser72.settings();
        org.jsoup.parser.Parser parser74 = parser70.settings(parseSettings73);
        org.jsoup.parser.Parser parser75 = parser57.settings(parseSettings73);
        org.jsoup.parser.ParseSettings parseSettings76 = parser75.settings();
        org.jsoup.parser.Parser parser77 = parser17.settings(parseSettings76);
        org.jsoup.nodes.Document document78 = org.jsoup.Jsoup.parse("", "", parser17);
        org.jsoup.nodes.Document document79 = org.jsoup.Jsoup.parse("", "", parser17);
        org.jsoup.parser.Parser parser81 = parser17.setTrackErrors((int) '4');
        org.jsoup.parser.Parser parser83 = parser81.setTrackErrors((int) '4');
        boolean boolean84 = parser83.isTrackErrors();
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNull(parseSettings29);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNotNull(parseSettings53);
        org.junit.Assert.assertNotNull(parser54);
        org.junit.Assert.assertNotNull(parser55);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(parser57);
        org.junit.Assert.assertNotNull(parseErrorList58);
        org.junit.Assert.assertNotNull(parser59);
        org.junit.Assert.assertNotNull(parser61);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertNotNull(parser67);
        org.junit.Assert.assertNotNull(document68);
        org.junit.Assert.assertNotNull(parseSettings69);
        org.junit.Assert.assertNotNull(parser70);
        org.junit.Assert.assertNotNull(parseErrorList71);
        org.junit.Assert.assertNotNull(parser72);
        org.junit.Assert.assertNotNull(parseSettings73);
        org.junit.Assert.assertNotNull(parser74);
        org.junit.Assert.assertNotNull(parser75);
        org.junit.Assert.assertNotNull(parseSettings76);
        org.junit.Assert.assertNotNull(parser77);
        org.junit.Assert.assertNotNull(document78);
        org.junit.Assert.assertNotNull(document79);
        org.junit.Assert.assertNotNull(parser81);
        org.junit.Assert.assertNotNull(parser83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("hi!", "hi!", parser2);
        org.jsoup.parser.Parser parser5 = parser2.setTrackErrors((int) (short) 1);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList6 = parser2.getErrors();
        org.jsoup.parser.Parser parser8 = parser2.setTrackErrors((int) 'a');
        org.jsoup.nodes.Document document11 = parser2.parseInput("hi!", "");
        org.jsoup.nodes.Document document14 = parser2.parseInput("hi!", "hi!");
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(document14);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        org.jsoup.parser.Parser parser5 = parser3.settings(parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser3.settings(parseSettings6);
        org.jsoup.parser.ParseSettings parseSettings8 = parser3.settings();
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        org.jsoup.parser.Parser parser10 = parser3.settings(parseSettings9);
        org.jsoup.nodes.Document document13 = parser3.parseInput("", "hi!");
        org.jsoup.nodes.Document document16 = parser3.parseInput("", "hi!");
        org.jsoup.parser.Parser parser17 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        org.jsoup.parser.Parser parser19 = parser17.settings(parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = null;
        org.jsoup.parser.Parser parser21 = parser17.settings(parseSettings20);
        org.jsoup.parser.Parser parser24 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parse("hi!", "hi!", parser24);
        org.jsoup.parser.ParseSettings parseSettings26 = parser24.settings();
        org.jsoup.parser.Parser parser27 = parser17.settings(parseSettings26);
        org.jsoup.parser.Parser parser28 = parser3.settings(parseSettings26);
        org.jsoup.nodes.Document document31 = parser3.parseInput("", "hi!");
        java.util.List<org.jsoup.parser.ParseError> parseErrorList32 = parser3.getErrors();
        org.jsoup.parser.Parser parser34 = parser3.setTrackErrors((int) (byte) 0);
        org.jsoup.parser.Parser parser36 = parser34.setTrackErrors((int) (short) 100);
        boolean boolean37 = parser34.isTrackErrors();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parse(inputStream0, "", "", parser34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNull(parseSettings8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(parseErrorList32);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser0.settings(parseSettings3);
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser5.settings(parseSettings6);
        org.jsoup.nodes.Document document10 = parser7.parseInput("", "hi!");
        org.jsoup.parser.Parser parser13 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parse("hi!", "hi!", parser13);
        org.jsoup.parser.ParseSettings parseSettings15 = parser13.settings();
        org.jsoup.parser.Parser parser16 = parser7.settings(parseSettings15);
        org.jsoup.parser.Parser parser17 = parser4.settings(parseSettings15);
        org.jsoup.parser.Parser parser20 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("", "hi!", parser20);
        org.jsoup.parser.Parser parser23 = parser20.setTrackErrors((int) '#');
        org.jsoup.parser.ParseSettings parseSettings24 = parser23.settings();
        boolean boolean25 = parser23.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings26 = parser23.settings();
        org.jsoup.parser.Parser parser27 = parser4.settings(parseSettings26);
        org.jsoup.parser.Parser parser29 = parser27.setTrackErrors((int) (byte) 0);
        org.jsoup.nodes.Document document32 = parser29.parseInput("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings33 = parser29.settings();
        org.jsoup.parser.Parser parser35 = parser29.setTrackErrors((int) (short) 0);
        org.jsoup.nodes.Document document38 = parser29.parseInput("", "hi!");
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(document38);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = null;
        org.jsoup.parser.Parser parser8 = parser4.settings(parseSettings7);
        org.jsoup.parser.ParseSettings parseSettings9 = parser4.settings();
        org.jsoup.parser.ParseSettings parseSettings10 = null;
        org.jsoup.parser.Parser parser11 = parser4.settings(parseSettings10);
        org.jsoup.nodes.Document document14 = parser4.parseInput("", "hi!");
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("hi!", "", parser4);
        org.jsoup.parser.ParseSettings parseSettings16 = parser4.settings();
        org.jsoup.parser.Parser parser17 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList18 = parser17.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList19 = parser17.getErrors();
        org.jsoup.parser.ParseSettings parseSettings20 = parser17.settings();
        org.jsoup.parser.ParseSettings parseSettings21 = parser17.settings();
        org.jsoup.parser.Parser parser22 = parser4.settings(parseSettings21);
        org.jsoup.parser.Parser parser27 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document28 = org.jsoup.Jsoup.parse("", "hi!", parser27);
        org.jsoup.parser.Parser parser30 = parser27.setTrackErrors(10);
        org.jsoup.parser.Parser parser32 = parser27.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser34 = parser27.setTrackErrors((int) (short) 1);
        org.jsoup.parser.Parser parser36 = parser27.setTrackErrors(100);
        org.jsoup.nodes.Document document37 = org.jsoup.Jsoup.parse("", "", parser36);
        org.jsoup.parser.ParseSettings parseSettings38 = parser36.settings();
        org.jsoup.parser.Parser parser39 = parser4.settings(parseSettings38);
        org.jsoup.nodes.Document document42 = parser4.parseInput("", "");
        org.jsoup.parser.Parser parser43 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings44 = null;
        org.jsoup.parser.Parser parser45 = parser43.settings(parseSettings44);
        org.jsoup.nodes.Document document48 = parser45.parseInput("", "hi!");
        org.jsoup.parser.Parser parser51 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document52 = org.jsoup.Jsoup.parse("hi!", "hi!", parser51);
        org.jsoup.parser.ParseSettings parseSettings53 = parser51.settings();
        org.jsoup.parser.Parser parser54 = parser45.settings(parseSettings53);
        org.jsoup.parser.Parser parser55 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings56 = null;
        org.jsoup.parser.Parser parser57 = parser55.settings(parseSettings56);
        org.jsoup.parser.ParseSettings parseSettings58 = null;
        org.jsoup.parser.Parser parser59 = parser55.settings(parseSettings58);
        org.jsoup.parser.ParseSettings parseSettings60 = parser55.settings();
        org.jsoup.parser.ParseSettings parseSettings61 = null;
        org.jsoup.parser.Parser parser62 = parser55.settings(parseSettings61);
        org.jsoup.nodes.Document document65 = parser55.parseInput("", "hi!");
        org.jsoup.nodes.Document document68 = parser55.parseInput("", "hi!");
        org.jsoup.parser.Parser parser69 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings70 = null;
        org.jsoup.parser.Parser parser71 = parser69.settings(parseSettings70);
        org.jsoup.parser.ParseSettings parseSettings72 = null;
        org.jsoup.parser.Parser parser73 = parser69.settings(parseSettings72);
        org.jsoup.parser.Parser parser76 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document77 = org.jsoup.Jsoup.parse("hi!", "hi!", parser76);
        org.jsoup.parser.ParseSettings parseSettings78 = parser76.settings();
        org.jsoup.parser.Parser parser79 = parser69.settings(parseSettings78);
        org.jsoup.parser.Parser parser80 = parser55.settings(parseSettings78);
        boolean boolean81 = parser55.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings82 = parser55.settings();
        org.jsoup.parser.Parser parser83 = parser54.settings(parseSettings82);
        org.jsoup.parser.Parser parser84 = parser4.settings(parseSettings82);
        org.jsoup.nodes.Document document87 = parser84.parseInput("", "hi!");
        org.jsoup.nodes.Document document88 = org.jsoup.Jsoup.parse("", "hi!", parser84);
        java.lang.Class<?> wildcardClass89 = document88.getClass();
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNull(parseSettings9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNull(parseSettings16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNull(parseErrorList18);
        org.junit.Assert.assertNull(parseErrorList19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNotNull(parseSettings53);
        org.junit.Assert.assertNotNull(parser54);
        org.junit.Assert.assertNotNull(parser55);
        org.junit.Assert.assertNotNull(parser57);
        org.junit.Assert.assertNotNull(parser59);
        org.junit.Assert.assertNull(parseSettings60);
        org.junit.Assert.assertNotNull(parser62);
        org.junit.Assert.assertNotNull(document65);
        org.junit.Assert.assertNotNull(document68);
        org.junit.Assert.assertNotNull(parser69);
        org.junit.Assert.assertNotNull(parser71);
        org.junit.Assert.assertNotNull(parser73);
        org.junit.Assert.assertNotNull(parser76);
        org.junit.Assert.assertNotNull(document77);
        org.junit.Assert.assertNotNull(parseSettings78);
        org.junit.Assert.assertNotNull(parser79);
        org.junit.Assert.assertNotNull(parser80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(parseSettings82);
        org.junit.Assert.assertNotNull(parser83);
        org.junit.Assert.assertNotNull(parser84);
        org.junit.Assert.assertNotNull(document87);
        org.junit.Assert.assertNotNull(document88);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList4 = parser3.getErrors();
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("", "hi!", parser3);
        java.util.List<org.jsoup.nodes.Node> nodeList7 = org.jsoup.parser.Parser.parseFragment("hi!", (org.jsoup.nodes.Element) document5, "hi!");
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNull(parseErrorList4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parse("", "hi!", parser3);
        org.jsoup.parser.Parser parser6 = parser3.setTrackErrors(10);
        org.jsoup.parser.Parser parser8 = parser3.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser10 = parser3.setTrackErrors((int) (short) 1);
        org.jsoup.parser.Parser parser12 = parser3.setTrackErrors(100);
        org.jsoup.parser.Parser parser14 = parser3.setTrackErrors((int) (short) -1);
        org.jsoup.nodes.Document document17 = parser3.parseInput("", "hi!");
        boolean boolean18 = parser3.isTrackErrors();
        org.jsoup.nodes.Document document21 = parser3.parseInput("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = org.jsoup.parser.Parser.parseFragment("hi!", (org.jsoup.nodes.Element) document21, "hi!");
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(nodeList23);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.nodes.Document document5 = parser2.parseInput("", "hi!");
        boolean boolean6 = parser2.isTrackErrors();
        org.jsoup.parser.Parser parser8 = parser2.setTrackErrors((int) (byte) 0);
        org.jsoup.parser.Parser parser11 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.Parser parser13 = parser11.setTrackErrors((int) (short) -1);
        org.jsoup.parser.Parser parser15 = parser13.setTrackErrors((int) (byte) 0);
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parse("", "", parser15);
        org.jsoup.parser.ParseSettings parseSettings17 = parser15.settings();
        org.jsoup.parser.Parser parser18 = parser2.settings(parseSettings17);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList19 = parser18.getErrors();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parseErrorList19);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser0.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = parser0.settings();
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser0.settings(parseSettings6);
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.ParseSettings parseSettings9 = parser8.settings();
        org.jsoup.parser.Parser parser10 = parser0.settings(parseSettings9);
        org.jsoup.nodes.Document document13 = parser0.parseInput("hi!", "hi!");
        java.util.List<org.jsoup.parser.ParseError> parseErrorList14 = parser0.getErrors();
        org.jsoup.parser.Parser parser16 = parser0.setTrackErrors((int) (short) 10);
        org.jsoup.nodes.Document document19 = parser16.parseInput("hi!", "hi!");
        org.jsoup.nodes.Document document22 = parser16.parseInput("", "hi!");
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNull(parseSettings5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseErrorList14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document22);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parse("", "hi!", parser8);
        org.jsoup.parser.Parser parser11 = parser8.setTrackErrors(10);
        org.jsoup.parser.Parser parser13 = parser8.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser15 = parser8.setTrackErrors((int) (short) 1);
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parse("hi!", "", parser15);
        org.jsoup.parser.Parser parser18 = parser15.setTrackErrors((int) (byte) -1);
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parse("hi!", "hi!", parser15);
        org.jsoup.parser.Parser parser21 = parser15.setTrackErrors((int) (byte) -1);
        org.jsoup.nodes.Document document24 = parser21.parseInput("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = org.jsoup.parser.Parser.parseFragment("", (org.jsoup.nodes.Element) document24, "");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = org.jsoup.parser.Parser.parseFragment("", (org.jsoup.nodes.Element) document24, "");
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(nodeList28);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList4 = parser3.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList5 = parser3.getErrors();
        org.jsoup.parser.ParseSettings parseSettings6 = parser3.settings();
        org.jsoup.parser.ParseSettings parseSettings7 = parser3.settings();
        org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "hi!", parser12);
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parse("hi!", "", parser12);
        org.jsoup.nodes.Document document17 = parser12.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings18 = parser12.settings();
        org.jsoup.parser.Parser parser19 = parser3.settings(parseSettings18);
        org.jsoup.parser.Parser parser21 = parser19.setTrackErrors(0);
        org.jsoup.parser.ParseSettings parseSettings22 = parser21.settings();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parse(inputStream0, "hi!", "hi!", parser21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNull(parseErrorList4);
        org.junit.Assert.assertNull(parseErrorList5);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(parseSettings22);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser9 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse("hi!", "hi!", parser9);
        org.jsoup.parser.Parser parser11 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings12 = null;
        org.jsoup.parser.Parser parser13 = parser11.settings(parseSettings12);
        org.jsoup.nodes.Document document16 = parser13.parseInput("", "hi!");
        org.jsoup.parser.Parser parser19 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document20 = org.jsoup.Jsoup.parse("hi!", "hi!", parser19);
        org.jsoup.parser.ParseSettings parseSettings21 = parser19.settings();
        org.jsoup.parser.Parser parser22 = parser13.settings(parseSettings21);
        org.jsoup.parser.Parser parser23 = parser9.settings(parseSettings21);
        org.jsoup.parser.Parser parser25 = parser9.setTrackErrors((int) ' ');
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parse("hi!", "", parser25);
        org.jsoup.nodes.Document document29 = parser25.parseInput("hi!", "hi!");
        org.jsoup.nodes.Document document30 = org.jsoup.Jsoup.parse("", "hi!", parser25);
        org.jsoup.parser.Parser parser31 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.Parser parser33 = parser31.setTrackErrors((int) (byte) 10);
        org.jsoup.parser.ParseSettings parseSettings34 = parser33.settings();
        org.jsoup.parser.Parser parser35 = parser25.settings(parseSettings34);
        org.jsoup.parser.Parser parser40 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document41 = org.jsoup.Jsoup.parse("hi!", "hi!", parser40);
        org.jsoup.nodes.Document document42 = org.jsoup.Jsoup.parse("hi!", "", parser40);
        org.jsoup.parser.ParseSettings parseSettings43 = parser40.settings();
        org.jsoup.parser.Parser parser44 = parser25.settings(parseSettings43);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList45 = parser44.getErrors();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document46 = org.jsoup.Jsoup.parse(inputStream0, "", "", parser44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(parseSettings43);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertNotNull(parseErrorList45);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse("hi!", "hi!", parser5);
        org.jsoup.parser.Parser parser7 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser7.settings(parseSettings8);
        org.jsoup.nodes.Document document12 = parser9.parseInput("", "hi!");
        org.jsoup.parser.Parser parser15 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parse("hi!", "hi!", parser15);
        org.jsoup.parser.ParseSettings parseSettings17 = parser15.settings();
        org.jsoup.parser.Parser parser18 = parser9.settings(parseSettings17);
        org.jsoup.parser.Parser parser19 = parser5.settings(parseSettings17);
        org.jsoup.parser.Parser parser21 = parser5.setTrackErrors((int) ' ');
        org.jsoup.nodes.Document document24 = parser5.parseInput("hi!", "");
        java.util.List<org.jsoup.parser.ParseError> parseErrorList25 = parser5.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList26 = parser5.getErrors();
        org.jsoup.nodes.Document document29 = parser5.parseInput("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document30 = org.jsoup.Jsoup.parse(inputStream0, "hi!", "", parser5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(parseErrorList25);
        org.junit.Assert.assertNotNull(parseErrorList26);
        org.junit.Assert.assertNotNull(document29);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("hi!", "hi!", parser6);
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        org.jsoup.parser.Parser parser10 = parser8.settings(parseSettings9);
        org.jsoup.nodes.Document document13 = parser10.parseInput("", "hi!");
        org.jsoup.parser.Parser parser16 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parse("hi!", "hi!", parser16);
        org.jsoup.parser.ParseSettings parseSettings18 = parser16.settings();
        org.jsoup.parser.Parser parser19 = parser10.settings(parseSettings18);
        org.jsoup.parser.Parser parser20 = parser6.settings(parseSettings18);
        org.jsoup.parser.Parser parser22 = parser6.setTrackErrors((int) ' ');
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parse("hi!", "", parser6);
        boolean boolean24 = parser6.isTrackErrors();
        org.jsoup.parser.Parser parser26 = parser6.setTrackErrors((int) (byte) 0);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList27 = parser26.getErrors();
        boolean boolean28 = parser26.isTrackErrors();
        boolean boolean29 = parser26.isTrackErrors();
        org.jsoup.nodes.Document document30 = org.jsoup.Jsoup.parse("", "", parser26);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(parseErrorList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(document30);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse("hi!", "hi!", parser5);
        org.jsoup.parser.Parser parser7 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser7.settings(parseSettings8);
        org.jsoup.nodes.Document document12 = parser9.parseInput("", "hi!");
        org.jsoup.parser.Parser parser15 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parse("hi!", "hi!", parser15);
        org.jsoup.parser.ParseSettings parseSettings17 = parser15.settings();
        org.jsoup.parser.Parser parser18 = parser9.settings(parseSettings17);
        org.jsoup.parser.Parser parser19 = parser5.settings(parseSettings17);
        org.jsoup.parser.Parser parser20 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        org.jsoup.parser.Parser parser22 = parser20.settings(parseSettings21);
        org.jsoup.parser.ParseSettings parseSettings23 = null;
        org.jsoup.parser.Parser parser24 = parser20.settings(parseSettings23);
        org.jsoup.parser.ParseSettings parseSettings25 = parser20.settings();
        org.jsoup.parser.Parser parser26 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings27 = null;
        org.jsoup.parser.Parser parser28 = parser26.settings(parseSettings27);
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        org.jsoup.parser.Parser parser30 = parser26.settings(parseSettings29);
        org.jsoup.parser.Parser parser31 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        org.jsoup.parser.Parser parser33 = parser31.settings(parseSettings32);
        org.jsoup.nodes.Document document36 = parser33.parseInput("", "hi!");
        org.jsoup.parser.Parser parser39 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document40 = org.jsoup.Jsoup.parse("hi!", "hi!", parser39);
        org.jsoup.parser.ParseSettings parseSettings41 = parser39.settings();
        org.jsoup.parser.Parser parser42 = parser33.settings(parseSettings41);
        org.jsoup.parser.Parser parser43 = parser30.settings(parseSettings41);
        org.jsoup.parser.ParseSettings parseSettings44 = parser30.settings();
        org.jsoup.parser.Parser parser45 = parser20.settings(parseSettings44);
        org.jsoup.parser.Parser parser46 = parser19.settings(parseSettings44);
        org.jsoup.nodes.Document document47 = org.jsoup.Jsoup.parse("hi!", "hi!", parser19);
        java.util.List<org.jsoup.nodes.Node> nodeList49 = org.jsoup.parser.Parser.parseFragment("", (org.jsoup.nodes.Element) document47, "");
        java.lang.Class<?> wildcardClass50 = nodeList49.getClass();
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNull(parseSettings25);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser2.settings(parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = parser2.settings();
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser2.settings(parseSettings8);
        org.jsoup.nodes.Document document12 = parser2.parseInput("", "hi!");
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "", parser2);
        org.jsoup.parser.ParseSettings parseSettings14 = parser2.settings();
        org.jsoup.parser.Parser parser15 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList16 = parser15.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList17 = parser15.getErrors();
        org.jsoup.parser.ParseSettings parseSettings18 = parser15.settings();
        org.jsoup.parser.ParseSettings parseSettings19 = parser15.settings();
        org.jsoup.parser.Parser parser20 = parser2.settings(parseSettings19);
        org.jsoup.parser.Parser parser25 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parse("", "hi!", parser25);
        org.jsoup.parser.Parser parser28 = parser25.setTrackErrors(10);
        org.jsoup.parser.Parser parser30 = parser25.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser32 = parser25.setTrackErrors((int) (short) 1);
        org.jsoup.parser.Parser parser34 = parser25.setTrackErrors(100);
        org.jsoup.nodes.Document document35 = org.jsoup.Jsoup.parse("", "", parser34);
        org.jsoup.parser.ParseSettings parseSettings36 = parser34.settings();
        org.jsoup.parser.Parser parser37 = parser2.settings(parseSettings36);
        org.jsoup.parser.Parser parser38 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings39 = null;
        org.jsoup.parser.Parser parser40 = parser38.settings(parseSettings39);
        org.jsoup.parser.ParseSettings parseSettings41 = null;
        org.jsoup.parser.Parser parser42 = parser38.settings(parseSettings41);
        org.jsoup.parser.ParseSettings parseSettings43 = parser38.settings();
        org.jsoup.parser.ParseSettings parseSettings44 = null;
        org.jsoup.parser.Parser parser45 = parser38.settings(parseSettings44);
        org.jsoup.nodes.Document document48 = parser38.parseInput("", "hi!");
        org.jsoup.nodes.Document document51 = parser38.parseInput("", "hi!");
        org.jsoup.parser.Parser parser52 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings53 = null;
        org.jsoup.parser.Parser parser54 = parser52.settings(parseSettings53);
        org.jsoup.parser.ParseSettings parseSettings55 = null;
        org.jsoup.parser.Parser parser56 = parser52.settings(parseSettings55);
        org.jsoup.parser.Parser parser59 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document60 = org.jsoup.Jsoup.parse("hi!", "hi!", parser59);
        org.jsoup.parser.ParseSettings parseSettings61 = parser59.settings();
        org.jsoup.parser.Parser parser62 = parser52.settings(parseSettings61);
        org.jsoup.parser.Parser parser63 = parser38.settings(parseSettings61);
        org.jsoup.parser.Parser parser64 = parser37.settings(parseSettings61);
        org.jsoup.nodes.Document document67 = parser64.parseInput("", "");
        java.util.List<org.jsoup.parser.ParseError> parseErrorList68 = parser64.getErrors();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNull(parseSettings7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNull(parseErrorList16);
        org.junit.Assert.assertNull(parseErrorList17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNull(parseSettings43);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNotNull(parser52);
        org.junit.Assert.assertNotNull(parser54);
        org.junit.Assert.assertNotNull(parser56);
        org.junit.Assert.assertNotNull(parser59);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(parser62);
        org.junit.Assert.assertNotNull(parser63);
        org.junit.Assert.assertNotNull(parser64);
        org.junit.Assert.assertNotNull(document67);
        org.junit.Assert.assertNotNull(parseErrorList68);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("hi!", "hi!", parser4);
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse("hi!", "", parser4);
        org.jsoup.parser.ParseSettings parseSettings7 = parser4.settings();
        org.jsoup.parser.ParseSettings parseSettings8 = parser4.settings();
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseSettings8);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parse("", "hi!", parser8);
        org.jsoup.parser.Parser parser11 = parser8.setTrackErrors(10);
        org.jsoup.parser.Parser parser13 = parser11.setTrackErrors(10);
        boolean boolean14 = parser13.isTrackErrors();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("", "hi!", parser13);
        org.jsoup.parser.ParseSettings parseSettings16 = parser13.settings();
        org.jsoup.parser.ParseSettings parseSettings17 = parser13.settings();
        org.jsoup.parser.Parser parser18 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings19 = parser18.settings();
        org.jsoup.parser.Parser parser20 = parser13.settings(parseSettings19);
        boolean boolean21 = parser20.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings22 = parser20.settings();
        org.jsoup.parser.Parser parser24 = parser20.setTrackErrors((int) '#');
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parse("hi!", "", parser24);
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parse("hi!", "", parser24);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList27 = parser24.getErrors();
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(parseErrorList27);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("hi!", "hi!", parser6);
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parse("hi!", "", parser6);
        org.jsoup.nodes.Document document11 = parser6.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings12 = parser6.settings();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("", "", parser6);
        org.jsoup.nodes.Document document16 = parser6.parseInput("hi!", "hi!");
        org.jsoup.nodes.Document document19 = parser6.parseInput("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings20 = parser6.settings();
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(parseSettings20);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.nodes.Document document7 = parser4.parseInput("", "hi!");
        org.jsoup.parser.Parser parser10 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("hi!", "hi!", parser10);
        org.jsoup.parser.ParseSettings parseSettings12 = parser10.settings();
        org.jsoup.parser.Parser parser13 = parser4.settings(parseSettings12);
        boolean boolean14 = parser4.isTrackErrors();
        org.jsoup.parser.Parser parser15 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings16 = null;
        org.jsoup.parser.Parser parser17 = parser15.settings(parseSettings16);
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        org.jsoup.parser.Parser parser19 = parser15.settings(parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = parser15.settings();
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        org.jsoup.parser.Parser parser22 = parser15.settings(parseSettings21);
        org.jsoup.parser.Parser parser23 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.ParseSettings parseSettings24 = parser23.settings();
        org.jsoup.parser.Parser parser25 = parser15.settings(parseSettings24);
        org.jsoup.parser.Parser parser26 = parser4.settings(parseSettings24);
        org.jsoup.nodes.Document document29 = parser26.parseInput("", "");
        org.jsoup.parser.Parser parser32 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        org.jsoup.parser.Parser parser34 = parser32.settings(parseSettings33);
        org.jsoup.parser.Parser parser35 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings36 = null;
        org.jsoup.parser.Parser parser37 = parser35.settings(parseSettings36);
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        org.jsoup.parser.Parser parser39 = parser35.settings(parseSettings38);
        org.jsoup.parser.Parser parser42 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document43 = org.jsoup.Jsoup.parse("hi!", "hi!", parser42);
        org.jsoup.parser.ParseSettings parseSettings44 = parser42.settings();
        org.jsoup.parser.Parser parser45 = parser35.settings(parseSettings44);
        org.jsoup.parser.Parser parser46 = parser34.settings(parseSettings44);
        org.jsoup.nodes.Document document47 = org.jsoup.Jsoup.parse("", "", parser46);
        org.jsoup.parser.ParseSettings parseSettings48 = parser46.settings();
        org.jsoup.parser.ParseSettings parseSettings49 = parser46.settings();
        org.jsoup.parser.ParseSettings parseSettings50 = parser46.settings();
        org.jsoup.parser.Parser parser51 = parser26.settings(parseSettings50);
        boolean boolean52 = parser26.isTrackErrors();
        org.jsoup.nodes.Document document55 = parser26.parseInput("", "");
        org.jsoup.nodes.Document document56 = org.jsoup.Jsoup.parse("", "hi!", parser26);
        java.lang.Class<?> wildcardClass57 = parser26.getClass();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNull(parseSettings20);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(parseSettings50);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(document55);
        org.junit.Assert.assertNotNull(document56);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("hi!", "hi!", parser6);
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parse("hi!", "", parser6);
        org.jsoup.nodes.Document document11 = parser6.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings12 = parser6.settings();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("", "", parser6);
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings15 = null;
        org.jsoup.parser.Parser parser16 = parser14.settings(parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        org.jsoup.parser.Parser parser18 = parser14.settings(parseSettings17);
        org.jsoup.nodes.Document document21 = parser14.parseInput("hi!", "");
        org.jsoup.parser.Parser parser22 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings23 = null;
        org.jsoup.parser.Parser parser24 = parser22.settings(parseSettings23);
        org.jsoup.parser.ParseSettings parseSettings25 = null;
        org.jsoup.parser.Parser parser26 = parser22.settings(parseSettings25);
        org.jsoup.parser.ParseSettings parseSettings27 = parser22.settings();
        org.jsoup.parser.ParseSettings parseSettings28 = null;
        org.jsoup.parser.Parser parser29 = parser22.settings(parseSettings28);
        org.jsoup.nodes.Document document32 = parser22.parseInput("", "hi!");
        org.jsoup.nodes.Document document35 = parser22.parseInput("", "hi!");
        org.jsoup.parser.Parser parser36 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        org.jsoup.parser.Parser parser38 = parser36.settings(parseSettings37);
        org.jsoup.parser.ParseSettings parseSettings39 = null;
        org.jsoup.parser.Parser parser40 = parser36.settings(parseSettings39);
        org.jsoup.parser.Parser parser43 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document44 = org.jsoup.Jsoup.parse("hi!", "hi!", parser43);
        org.jsoup.parser.ParseSettings parseSettings45 = parser43.settings();
        org.jsoup.parser.Parser parser46 = parser36.settings(parseSettings45);
        org.jsoup.parser.Parser parser47 = parser22.settings(parseSettings45);
        org.jsoup.parser.Parser parser48 = parser14.settings(parseSettings45);
        org.jsoup.parser.Parser parser49 = parser6.settings(parseSettings45);
        boolean boolean50 = parser6.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings51 = parser6.settings();
        org.jsoup.nodes.Document document54 = parser6.parseInput("hi!", "hi!");
        boolean boolean55 = parser6.isTrackErrors();
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNull(parseSettings27);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(parser47);
        org.junit.Assert.assertNotNull(parser48);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser2.settings(parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = parser2.settings();
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser2.settings(parseSettings8);
        org.jsoup.parser.Parser parser10 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.ParseSettings parseSettings11 = parser10.settings();
        org.jsoup.parser.Parser parser12 = parser2.settings(parseSettings11);
        org.jsoup.nodes.Document document15 = parser2.parseInput("hi!", "hi!");
        boolean boolean16 = parser2.isTrackErrors();
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parse("", "hi!", parser2);
        org.jsoup.parser.ParseSettings parseSettings18 = parser2.settings();
        org.jsoup.nodes.Document document21 = parser2.parseInput("hi!", "");
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNull(parseSettings7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(document21);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("hi!", "hi!", parser4);
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings7 = null;
        org.jsoup.parser.Parser parser8 = parser6.settings(parseSettings7);
        org.jsoup.nodes.Document document11 = parser8.parseInput("", "hi!");
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("hi!", "hi!", parser14);
        org.jsoup.parser.ParseSettings parseSettings16 = parser14.settings();
        org.jsoup.parser.Parser parser17 = parser8.settings(parseSettings16);
        org.jsoup.parser.Parser parser18 = parser4.settings(parseSettings16);
        org.jsoup.nodes.Document document21 = parser18.parseInput("", "");
        org.jsoup.nodes.Document document22 = org.jsoup.Jsoup.parse("", "hi!", parser18);
        org.jsoup.parser.ParseSettings parseSettings23 = parser18.settings();
        org.jsoup.parser.Parser parser25 = parser18.setTrackErrors(1);
        org.jsoup.nodes.Document document28 = parser25.parseInput("hi!", "hi!");
        org.jsoup.nodes.Document document31 = parser25.parseInput("hi!", "hi!");
        boolean boolean32 = parser25.isTrackErrors();
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("hi!", "hi!", parser2);
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.nodes.Document document9 = parser6.parseInput("", "hi!");
        org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "hi!", parser12);
        org.jsoup.parser.ParseSettings parseSettings14 = parser12.settings();
        org.jsoup.parser.Parser parser15 = parser6.settings(parseSettings14);
        org.jsoup.parser.Parser parser16 = parser2.settings(parseSettings14);
        org.jsoup.parser.Parser parser18 = parser2.setTrackErrors((int) ' ');
        java.util.List<org.jsoup.parser.ParseError> parseErrorList19 = parser18.getErrors();
        org.jsoup.parser.ParseSettings parseSettings20 = parser18.settings();
        org.jsoup.parser.Parser parser21 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        org.jsoup.parser.Parser parser23 = parser21.settings(parseSettings22);
        org.jsoup.nodes.Document document26 = parser23.parseInput("", "hi!");
        org.jsoup.parser.Parser parser29 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document30 = org.jsoup.Jsoup.parse("hi!", "hi!", parser29);
        org.jsoup.parser.ParseSettings parseSettings31 = parser29.settings();
        org.jsoup.parser.Parser parser32 = parser23.settings(parseSettings31);
        org.jsoup.parser.Parser parser33 = parser18.settings(parseSettings31);
        org.jsoup.parser.Parser parser35 = parser33.setTrackErrors(0);
        org.jsoup.parser.Parser parser36 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        org.jsoup.parser.Parser parser38 = parser36.settings(parseSettings37);
        org.jsoup.parser.ParseSettings parseSettings39 = null;
        org.jsoup.parser.Parser parser40 = parser36.settings(parseSettings39);
        org.jsoup.parser.Parser parser41 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings42 = null;
        org.jsoup.parser.Parser parser43 = parser41.settings(parseSettings42);
        org.jsoup.nodes.Document document46 = parser43.parseInput("", "hi!");
        org.jsoup.parser.Parser parser49 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document50 = org.jsoup.Jsoup.parse("hi!", "hi!", parser49);
        org.jsoup.parser.ParseSettings parseSettings51 = parser49.settings();
        org.jsoup.parser.Parser parser52 = parser43.settings(parseSettings51);
        org.jsoup.parser.Parser parser53 = parser40.settings(parseSettings51);
        org.jsoup.parser.ParseSettings parseSettings54 = parser40.settings();
        org.jsoup.parser.Parser parser55 = parser33.settings(parseSettings54);
        org.jsoup.parser.ParseSettings parseSettings56 = parser55.settings();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList57 = parser55.getErrors();
        org.jsoup.parser.ParseSettings parseSettings58 = parser55.settings();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parseErrorList19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(parser41);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(parser52);
        org.junit.Assert.assertNotNull(parser53);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(parser55);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(parseErrorList57);
        org.junit.Assert.assertNotNull(parseSettings58);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.parser.Parser parser7 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser7.settings(parseSettings8);
        org.jsoup.parser.ParseSettings parseSettings10 = null;
        org.jsoup.parser.Parser parser11 = parser7.settings(parseSettings10);
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("hi!", "hi!", parser14);
        org.jsoup.parser.ParseSettings parseSettings16 = parser14.settings();
        org.jsoup.parser.Parser parser17 = parser7.settings(parseSettings16);
        org.jsoup.parser.Parser parser18 = parser6.settings(parseSettings16);
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parse("", "", parser18);
        org.jsoup.parser.Parser parser20 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        org.jsoup.parser.Parser parser22 = parser20.settings(parseSettings21);
        org.jsoup.parser.ParseSettings parseSettings23 = null;
        org.jsoup.parser.Parser parser24 = parser20.settings(parseSettings23);
        org.jsoup.parser.ParseSettings parseSettings25 = parser20.settings();
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        org.jsoup.parser.Parser parser27 = parser20.settings(parseSettings26);
        org.jsoup.nodes.Document document30 = parser20.parseInput("", "hi!");
        org.jsoup.nodes.Document document33 = parser20.parseInput("", "hi!");
        org.jsoup.parser.Parser parser34 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings35 = null;
        org.jsoup.parser.Parser parser36 = parser34.settings(parseSettings35);
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        org.jsoup.parser.Parser parser38 = parser34.settings(parseSettings37);
        org.jsoup.parser.Parser parser41 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document42 = org.jsoup.Jsoup.parse("hi!", "hi!", parser41);
        org.jsoup.parser.ParseSettings parseSettings43 = parser41.settings();
        org.jsoup.parser.Parser parser44 = parser34.settings(parseSettings43);
        org.jsoup.parser.Parser parser45 = parser20.settings(parseSettings43);
        boolean boolean46 = parser20.isTrackErrors();
        org.jsoup.parser.Parser parser47 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings48 = null;
        org.jsoup.parser.Parser parser49 = parser47.settings(parseSettings48);
        org.jsoup.parser.ParseSettings parseSettings50 = null;
        org.jsoup.parser.Parser parser51 = parser47.settings(parseSettings50);
        org.jsoup.parser.ParseSettings parseSettings52 = parser47.settings();
        org.jsoup.parser.ParseSettings parseSettings53 = null;
        org.jsoup.parser.Parser parser54 = parser47.settings(parseSettings53);
        org.jsoup.parser.Parser parser55 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.ParseSettings parseSettings56 = parser55.settings();
        org.jsoup.parser.Parser parser57 = parser47.settings(parseSettings56);
        org.jsoup.parser.Parser parser58 = parser20.settings(parseSettings56);
        org.jsoup.parser.Parser parser59 = parser18.settings(parseSettings56);
        org.jsoup.nodes.Document document60 = org.jsoup.Jsoup.parse("", "", parser18);
        org.jsoup.nodes.Document document63 = parser18.parseInput("", "");
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNull(parseSettings25);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(parser41);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(parseSettings43);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(parser47);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertNull(parseSettings52);
        org.junit.Assert.assertNotNull(parser54);
        org.junit.Assert.assertNotNull(parser55);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(parser57);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertNotNull(parser59);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertNotNull(document63);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("hi!", "hi!", parser6);
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parse("hi!", "", parser6);
        org.jsoup.nodes.Document document11 = parser6.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings12 = parser6.settings();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("", "", parser6);
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings15 = null;
        org.jsoup.parser.Parser parser16 = parser14.settings(parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        org.jsoup.parser.Parser parser18 = parser14.settings(parseSettings17);
        org.jsoup.nodes.Document document21 = parser14.parseInput("hi!", "");
        org.jsoup.parser.Parser parser22 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings23 = null;
        org.jsoup.parser.Parser parser24 = parser22.settings(parseSettings23);
        org.jsoup.parser.ParseSettings parseSettings25 = null;
        org.jsoup.parser.Parser parser26 = parser22.settings(parseSettings25);
        org.jsoup.parser.ParseSettings parseSettings27 = parser22.settings();
        org.jsoup.parser.ParseSettings parseSettings28 = null;
        org.jsoup.parser.Parser parser29 = parser22.settings(parseSettings28);
        org.jsoup.nodes.Document document32 = parser22.parseInput("", "hi!");
        org.jsoup.nodes.Document document35 = parser22.parseInput("", "hi!");
        org.jsoup.parser.Parser parser36 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        org.jsoup.parser.Parser parser38 = parser36.settings(parseSettings37);
        org.jsoup.parser.ParseSettings parseSettings39 = null;
        org.jsoup.parser.Parser parser40 = parser36.settings(parseSettings39);
        org.jsoup.parser.Parser parser43 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document44 = org.jsoup.Jsoup.parse("hi!", "hi!", parser43);
        org.jsoup.parser.ParseSettings parseSettings45 = parser43.settings();
        org.jsoup.parser.Parser parser46 = parser36.settings(parseSettings45);
        org.jsoup.parser.Parser parser47 = parser22.settings(parseSettings45);
        org.jsoup.parser.Parser parser48 = parser14.settings(parseSettings45);
        org.jsoup.parser.Parser parser49 = parser6.settings(parseSettings45);
        boolean boolean50 = parser6.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings51 = parser6.settings();
        org.jsoup.parser.ParseSettings parseSettings52 = parser6.settings();
        org.jsoup.nodes.Document document55 = parser6.parseInput("", "");
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNull(parseSettings27);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(parser47);
        org.junit.Assert.assertNotNull(parser48);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(document55);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser5.settings(parseSettings6);
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser5.settings(parseSettings8);
        org.jsoup.parser.ParseSettings parseSettings10 = parser5.settings();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList11 = parser5.getErrors();
        org.jsoup.parser.Parser parser16 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        org.jsoup.parser.Parser parser18 = parser16.settings(parseSettings17);
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parse("hi!", "", parser18);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList20 = parser18.getErrors();
        boolean boolean21 = parser18.isTrackErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList22 = parser18.getErrors();
        org.jsoup.parser.ParseSettings parseSettings23 = parser18.settings();
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parse("hi!", "hi!", parser18);
        org.jsoup.parser.Parser parser27 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document28 = org.jsoup.Jsoup.parse("", "hi!", parser27);
        org.jsoup.parser.Parser parser30 = parser27.setTrackErrors(10);
        org.jsoup.parser.Parser parser32 = parser30.setTrackErrors(10);
        org.jsoup.parser.ParseSettings parseSettings33 = parser30.settings();
        org.jsoup.parser.Parser parser34 = parser18.settings(parseSettings33);
        org.jsoup.parser.Parser parser35 = parser5.settings(parseSettings33);
        org.jsoup.parser.ParseSettings parseSettings36 = parser5.settings();
        org.jsoup.nodes.Document document37 = org.jsoup.Jsoup.parse("hi!", "hi!", parser5);
        org.jsoup.parser.Parser parser38 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings39 = null;
        org.jsoup.parser.Parser parser40 = parser38.settings(parseSettings39);
        org.jsoup.parser.ParseSettings parseSettings41 = null;
        org.jsoup.parser.Parser parser42 = parser38.settings(parseSettings41);
        org.jsoup.parser.ParseSettings parseSettings43 = parser38.settings();
        org.jsoup.parser.Parser parser44 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings45 = null;
        org.jsoup.parser.Parser parser46 = parser44.settings(parseSettings45);
        org.jsoup.parser.ParseSettings parseSettings47 = null;
        org.jsoup.parser.Parser parser48 = parser44.settings(parseSettings47);
        org.jsoup.parser.Parser parser49 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings50 = null;
        org.jsoup.parser.Parser parser51 = parser49.settings(parseSettings50);
        org.jsoup.nodes.Document document54 = parser51.parseInput("", "hi!");
        org.jsoup.parser.Parser parser57 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document58 = org.jsoup.Jsoup.parse("hi!", "hi!", parser57);
        org.jsoup.parser.ParseSettings parseSettings59 = parser57.settings();
        org.jsoup.parser.Parser parser60 = parser51.settings(parseSettings59);
        org.jsoup.parser.Parser parser61 = parser48.settings(parseSettings59);
        org.jsoup.parser.ParseSettings parseSettings62 = parser48.settings();
        org.jsoup.parser.Parser parser63 = parser38.settings(parseSettings62);
        org.jsoup.parser.Parser parser65 = parser63.setTrackErrors((int) ' ');
        java.util.List<org.jsoup.parser.ParseError> parseErrorList66 = parser63.getErrors();
        org.jsoup.parser.ParseSettings parseSettings67 = parser63.settings();
        org.jsoup.parser.Parser parser68 = parser5.settings(parseSettings67);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document69 = org.jsoup.Jsoup.parse(inputStream0, "", "", parser68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNull(parseSettings10);
        org.junit.Assert.assertNull(parseErrorList11);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(parseErrorList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(parseErrorList22);
        org.junit.Assert.assertNull(parseSettings23);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNull(parseSettings43);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(parser48);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNotNull(parser57);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(parser60);
        org.junit.Assert.assertNotNull(parser61);
        org.junit.Assert.assertNotNull(parseSettings62);
        org.junit.Assert.assertNotNull(parser63);
        org.junit.Assert.assertNotNull(parser65);
        org.junit.Assert.assertNull(parseErrorList66);
        org.junit.Assert.assertNotNull(parseSettings67);
        org.junit.Assert.assertNotNull(parser68);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("hi!", "hi!", parser6);
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        org.jsoup.parser.Parser parser10 = parser8.settings(parseSettings9);
        org.jsoup.nodes.Document document13 = parser10.parseInput("", "hi!");
        org.jsoup.parser.Parser parser16 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parse("hi!", "hi!", parser16);
        org.jsoup.parser.ParseSettings parseSettings18 = parser16.settings();
        org.jsoup.parser.Parser parser19 = parser10.settings(parseSettings18);
        org.jsoup.parser.Parser parser20 = parser6.settings(parseSettings18);
        org.jsoup.parser.Parser parser22 = parser6.setTrackErrors((int) ' ');
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parse("hi!", "", parser22);
        org.jsoup.nodes.Document document26 = parser22.parseInput("hi!", "hi!");
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parse("", "hi!", parser22);
        org.jsoup.parser.Parser parser28 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.Parser parser30 = parser28.setTrackErrors((int) (byte) 10);
        org.jsoup.parser.ParseSettings parseSettings31 = parser30.settings();
        org.jsoup.parser.Parser parser32 = parser22.settings(parseSettings31);
        org.jsoup.parser.Parser parser34 = parser32.setTrackErrors(10);
        org.jsoup.parser.Parser parser36 = parser32.setTrackErrors(1);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser36);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("hi!", "hi!", parser6);
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parse("hi!", "", parser6);
        org.jsoup.nodes.Document document11 = parser6.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings12 = parser6.settings();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("", "", parser6);
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings15 = null;
        org.jsoup.parser.Parser parser16 = parser14.settings(parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        org.jsoup.parser.Parser parser18 = parser14.settings(parseSettings17);
        org.jsoup.nodes.Document document21 = parser14.parseInput("hi!", "");
        org.jsoup.parser.Parser parser22 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings23 = null;
        org.jsoup.parser.Parser parser24 = parser22.settings(parseSettings23);
        org.jsoup.parser.ParseSettings parseSettings25 = null;
        org.jsoup.parser.Parser parser26 = parser22.settings(parseSettings25);
        org.jsoup.parser.ParseSettings parseSettings27 = parser22.settings();
        org.jsoup.parser.ParseSettings parseSettings28 = null;
        org.jsoup.parser.Parser parser29 = parser22.settings(parseSettings28);
        org.jsoup.nodes.Document document32 = parser22.parseInput("", "hi!");
        org.jsoup.nodes.Document document35 = parser22.parseInput("", "hi!");
        org.jsoup.parser.Parser parser36 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        org.jsoup.parser.Parser parser38 = parser36.settings(parseSettings37);
        org.jsoup.parser.ParseSettings parseSettings39 = null;
        org.jsoup.parser.Parser parser40 = parser36.settings(parseSettings39);
        org.jsoup.parser.Parser parser43 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document44 = org.jsoup.Jsoup.parse("hi!", "hi!", parser43);
        org.jsoup.parser.ParseSettings parseSettings45 = parser43.settings();
        org.jsoup.parser.Parser parser46 = parser36.settings(parseSettings45);
        org.jsoup.parser.Parser parser47 = parser22.settings(parseSettings45);
        org.jsoup.parser.Parser parser48 = parser14.settings(parseSettings45);
        org.jsoup.parser.Parser parser49 = parser6.settings(parseSettings45);
        boolean boolean50 = parser6.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings51 = parser6.settings();
        org.jsoup.parser.ParseSettings parseSettings52 = parser6.settings();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList53 = parser6.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList54 = parser6.getErrors();
        org.jsoup.parser.ParseSettings parseSettings55 = null;
        org.jsoup.parser.Parser parser56 = parser6.settings(parseSettings55);
        java.lang.Class<?> wildcardClass57 = parser56.getClass();
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNull(parseSettings27);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(parser47);
        org.junit.Assert.assertNotNull(parser48);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(parseErrorList53);
        org.junit.Assert.assertNotNull(parseErrorList54);
        org.junit.Assert.assertNotNull(parser56);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("hi!", "hi!", parser2);
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.nodes.Document document9 = parser6.parseInput("", "hi!");
        org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "hi!", parser12);
        org.jsoup.parser.ParseSettings parseSettings14 = parser12.settings();
        org.jsoup.parser.Parser parser15 = parser6.settings(parseSettings14);
        org.jsoup.parser.Parser parser16 = parser2.settings(parseSettings14);
        org.jsoup.parser.Parser parser18 = parser2.setTrackErrors((int) ' ');
        org.jsoup.nodes.Document document21 = parser2.parseInput("hi!", "");
        java.util.List<org.jsoup.parser.ParseError> parseErrorList22 = parser2.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList23 = parser2.getErrors();
        org.jsoup.nodes.Document document26 = parser2.parseInput("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings27 = parser2.settings();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(parseErrorList22);
        org.junit.Assert.assertNotNull(parseErrorList23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(parseSettings27);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("hi!", "hi!", parser2);
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.nodes.Document document9 = parser6.parseInput("", "hi!");
        org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "hi!", parser12);
        org.jsoup.parser.ParseSettings parseSettings14 = parser12.settings();
        org.jsoup.parser.Parser parser15 = parser6.settings(parseSettings14);
        org.jsoup.parser.Parser parser16 = parser2.settings(parseSettings14);
        org.jsoup.parser.Parser parser17 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        org.jsoup.parser.Parser parser19 = parser17.settings(parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = null;
        org.jsoup.parser.Parser parser21 = parser17.settings(parseSettings20);
        org.jsoup.parser.ParseSettings parseSettings22 = parser17.settings();
        org.jsoup.parser.Parser parser23 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        org.jsoup.parser.Parser parser25 = parser23.settings(parseSettings24);
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        org.jsoup.parser.Parser parser27 = parser23.settings(parseSettings26);
        org.jsoup.parser.Parser parser28 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        org.jsoup.parser.Parser parser30 = parser28.settings(parseSettings29);
        org.jsoup.nodes.Document document33 = parser30.parseInput("", "hi!");
        org.jsoup.parser.Parser parser36 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document37 = org.jsoup.Jsoup.parse("hi!", "hi!", parser36);
        org.jsoup.parser.ParseSettings parseSettings38 = parser36.settings();
        org.jsoup.parser.Parser parser39 = parser30.settings(parseSettings38);
        org.jsoup.parser.Parser parser40 = parser27.settings(parseSettings38);
        org.jsoup.parser.ParseSettings parseSettings41 = parser27.settings();
        org.jsoup.parser.Parser parser42 = parser17.settings(parseSettings41);
        org.jsoup.parser.Parser parser43 = parser16.settings(parseSettings41);
        boolean boolean44 = parser16.isTrackErrors();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNull(parseSettings22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser0.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = parser0.settings();
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser0.settings(parseSettings6);
        org.jsoup.nodes.Document document10 = parser0.parseInput("", "hi!");
        org.jsoup.nodes.Document document13 = parser0.parseInput("", "hi!");
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings15 = null;
        org.jsoup.parser.Parser parser16 = parser14.settings(parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        org.jsoup.parser.Parser parser18 = parser14.settings(parseSettings17);
        org.jsoup.parser.Parser parser21 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document22 = org.jsoup.Jsoup.parse("hi!", "hi!", parser21);
        org.jsoup.parser.ParseSettings parseSettings23 = parser21.settings();
        org.jsoup.parser.Parser parser24 = parser14.settings(parseSettings23);
        org.jsoup.parser.Parser parser25 = parser0.settings(parseSettings23);
        org.jsoup.nodes.Document document28 = parser0.parseInput("", "hi!");
        boolean boolean29 = parser0.isTrackErrors();
        org.jsoup.nodes.Document document32 = parser0.parseInput("hi!", "hi!");
        org.jsoup.parser.Parser parser33 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings34 = null;
        org.jsoup.parser.Parser parser35 = parser33.settings(parseSettings34);
        org.jsoup.parser.ParseSettings parseSettings36 = null;
        org.jsoup.parser.Parser parser37 = parser33.settings(parseSettings36);
        org.jsoup.parser.Parser parser38 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings39 = null;
        org.jsoup.parser.Parser parser40 = parser38.settings(parseSettings39);
        org.jsoup.nodes.Document document43 = parser40.parseInput("", "hi!");
        org.jsoup.parser.Parser parser46 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document47 = org.jsoup.Jsoup.parse("hi!", "hi!", parser46);
        org.jsoup.parser.ParseSettings parseSettings48 = parser46.settings();
        org.jsoup.parser.Parser parser49 = parser40.settings(parseSettings48);
        org.jsoup.parser.Parser parser50 = parser37.settings(parseSettings48);
        org.jsoup.parser.Parser parser53 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document54 = org.jsoup.Jsoup.parse("", "hi!", parser53);
        org.jsoup.parser.Parser parser56 = parser53.setTrackErrors((int) '#');
        org.jsoup.parser.ParseSettings parseSettings57 = parser56.settings();
        boolean boolean58 = parser56.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings59 = parser56.settings();
        org.jsoup.parser.Parser parser60 = parser37.settings(parseSettings59);
        org.jsoup.parser.Parser parser61 = parser0.settings(parseSettings59);
        org.jsoup.nodes.Document document64 = parser0.parseInput("", "");
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNull(parseSettings5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertNotNull(parser50);
        org.junit.Assert.assertNotNull(parser53);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNotNull(parser56);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(parser60);
        org.junit.Assert.assertNotNull(parser61);
        org.junit.Assert.assertNotNull(document64);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("", "hi!", parser2);
        org.jsoup.parser.Parser parser5 = parser2.setTrackErrors(10);
        org.jsoup.parser.Parser parser7 = parser2.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser9 = parser2.setTrackErrors((int) (short) 1);
        org.jsoup.parser.Parser parser11 = parser2.setTrackErrors(100);
        org.jsoup.parser.Parser parser13 = parser2.setTrackErrors(100);
        org.jsoup.parser.Parser parser15 = parser2.setTrackErrors((int) (byte) 100);
        org.jsoup.parser.ParseSettings parseSettings16 = parser2.settings();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parseSettings16);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser5.settings(parseSettings6);
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser5.settings(parseSettings8);
        org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "hi!", parser12);
        org.jsoup.parser.ParseSettings parseSettings14 = parser12.settings();
        org.jsoup.parser.Parser parser15 = parser5.settings(parseSettings14);
        org.jsoup.parser.Parser parser16 = parser4.settings(parseSettings14);
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parse("", "", parser16);
        org.jsoup.parser.ParseSettings parseSettings18 = parser16.settings();
        org.jsoup.parser.ParseSettings parseSettings19 = parser16.settings();
        boolean boolean20 = parser16.isTrackErrors();
        java.lang.Class<?> wildcardClass21 = parser16.getClass();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = null;
        org.jsoup.parser.Parser parser8 = parser4.settings(parseSettings7);
        org.jsoup.parser.ParseSettings parseSettings9 = parser4.settings();
        org.jsoup.parser.ParseSettings parseSettings10 = null;
        org.jsoup.parser.Parser parser11 = parser4.settings(parseSettings10);
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parse("hi!", "", parser4);
        org.jsoup.parser.ParseSettings parseSettings13 = parser4.settings();
        boolean boolean14 = parser4.isTrackErrors();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("", "", parser4);
        boolean boolean16 = parser4.isTrackErrors();
        boolean boolean17 = parser4.isTrackErrors();
        org.jsoup.nodes.Document document20 = parser4.parseInput("", "hi!");
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNull(parseSettings9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNull(parseSettings13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(document20);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = null;
        org.jsoup.parser.Parser parser8 = parser4.settings(parseSettings7);
        org.jsoup.parser.Parser parser9 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings10 = null;
        org.jsoup.parser.Parser parser11 = parser9.settings(parseSettings10);
        org.jsoup.nodes.Document document14 = parser11.parseInput("", "hi!");
        org.jsoup.parser.Parser parser17 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parse("hi!", "hi!", parser17);
        org.jsoup.parser.ParseSettings parseSettings19 = parser17.settings();
        org.jsoup.parser.Parser parser20 = parser11.settings(parseSettings19);
        org.jsoup.parser.Parser parser21 = parser8.settings(parseSettings19);
        org.jsoup.parser.Parser parser23 = parser21.setTrackErrors((-1));
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parse("hi!", "", parser23);
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parse("", "hi!", parser23);
        org.jsoup.parser.Parser parser32 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document33 = org.jsoup.Jsoup.parse("", "hi!", parser32);
        org.jsoup.parser.Parser parser35 = parser32.setTrackErrors(10);
        org.jsoup.parser.Parser parser37 = parser32.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser39 = parser32.setTrackErrors((int) (short) 1);
        org.jsoup.nodes.Document document40 = org.jsoup.Jsoup.parse("hi!", "", parser39);
        org.jsoup.parser.Parser parser42 = parser39.setTrackErrors((int) (byte) -1);
        org.jsoup.nodes.Document document43 = org.jsoup.Jsoup.parse("hi!", "hi!", parser39);
        org.jsoup.parser.ParseSettings parseSettings44 = parser39.settings();
        org.jsoup.parser.Parser parser45 = parser23.settings(parseSettings44);
        org.jsoup.parser.ParseSettings parseSettings46 = parser45.settings();
        boolean boolean47 = parser45.isTrackErrors();
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser2.settings(parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = parser2.settings();
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser2.settings(parseSettings8);
        org.jsoup.parser.Parser parser10 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings11 = null;
        org.jsoup.parser.Parser parser12 = parser10.settings(parseSettings11);
        org.jsoup.parser.Parser parser13 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings14 = null;
        org.jsoup.parser.Parser parser15 = parser13.settings(parseSettings14);
        org.jsoup.parser.ParseSettings parseSettings16 = null;
        org.jsoup.parser.Parser parser17 = parser13.settings(parseSettings16);
        org.jsoup.parser.Parser parser20 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("hi!", "hi!", parser20);
        org.jsoup.parser.ParseSettings parseSettings22 = parser20.settings();
        org.jsoup.parser.Parser parser23 = parser13.settings(parseSettings22);
        org.jsoup.parser.Parser parser24 = parser12.settings(parseSettings22);
        org.jsoup.parser.Parser parser25 = parser2.settings(parseSettings22);
        org.jsoup.nodes.Document document28 = parser25.parseInput("hi!", "");
        org.jsoup.parser.Parser parser30 = parser25.setTrackErrors(100);
        org.jsoup.nodes.Document document31 = org.jsoup.Jsoup.parse("hi!", "", parser30);
        org.jsoup.nodes.Document document34 = parser30.parseInput("hi!", "hi!");
        org.jsoup.parser.Parser parser36 = parser30.setTrackErrors((int) (byte) 100);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNull(parseSettings7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(parser36);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("hi!", "hi!", parser4);
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings7 = null;
        org.jsoup.parser.Parser parser8 = parser6.settings(parseSettings7);
        org.jsoup.nodes.Document document11 = parser8.parseInput("", "hi!");
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("hi!", "hi!", parser14);
        org.jsoup.parser.ParseSettings parseSettings16 = parser14.settings();
        org.jsoup.parser.Parser parser17 = parser8.settings(parseSettings16);
        org.jsoup.parser.Parser parser18 = parser4.settings(parseSettings16);
        org.jsoup.parser.Parser parser20 = parser4.setTrackErrors((int) ' ');
        java.util.List<org.jsoup.parser.ParseError> parseErrorList21 = parser20.getErrors();
        org.jsoup.parser.ParseSettings parseSettings22 = parser20.settings();
        org.jsoup.parser.Parser parser23 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        org.jsoup.parser.Parser parser25 = parser23.settings(parseSettings24);
        org.jsoup.nodes.Document document28 = parser25.parseInput("", "hi!");
        org.jsoup.parser.Parser parser31 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document32 = org.jsoup.Jsoup.parse("hi!", "hi!", parser31);
        org.jsoup.parser.ParseSettings parseSettings33 = parser31.settings();
        org.jsoup.parser.Parser parser34 = parser25.settings(parseSettings33);
        org.jsoup.parser.Parser parser35 = parser20.settings(parseSettings33);
        org.jsoup.parser.Parser parser37 = parser35.setTrackErrors((-1));
        org.jsoup.parser.ParseSettings parseSettings38 = parser35.settings();
        org.jsoup.nodes.Document document39 = org.jsoup.Jsoup.parse("", "", parser35);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList40 = parser35.getErrors();
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parseErrorList21);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(parseErrorList40);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser5.settings(parseSettings6);
        org.jsoup.parser.Parser parser9 = parser7.setTrackErrors((int) (short) 100);
        org.jsoup.parser.Parser parser11 = parser9.setTrackErrors((int) ' ');
        org.jsoup.parser.ParseSettings parseSettings12 = parser9.settings();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("", "", parser9);
        org.jsoup.parser.Parser parser15 = parser9.setTrackErrors((int) ' ');
        org.jsoup.parser.Parser parser18 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        org.jsoup.parser.Parser parser20 = parser18.settings(parseSettings19);
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        org.jsoup.parser.Parser parser22 = parser18.settings(parseSettings21);
        org.jsoup.parser.Parser parser25 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parse("hi!", "hi!", parser25);
        org.jsoup.parser.ParseSettings parseSettings27 = parser25.settings();
        org.jsoup.parser.Parser parser28 = parser18.settings(parseSettings27);
        org.jsoup.nodes.Document document29 = org.jsoup.Jsoup.parse("hi!", "hi!", parser28);
        org.jsoup.nodes.Document document32 = parser28.parseInput("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings33 = parser28.settings();
        org.jsoup.parser.Parser parser34 = parser9.settings(parseSettings33);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document35 = org.jsoup.Jsoup.parse(inputStream0, "", "", parser34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNull(parseSettings12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parser34);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser0.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = parser0.settings();
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser0.settings(parseSettings6);
        org.jsoup.nodes.Document document10 = parser0.parseInput("", "hi!");
        org.jsoup.nodes.Document document13 = parser0.parseInput("", "hi!");
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings15 = null;
        org.jsoup.parser.Parser parser16 = parser14.settings(parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        org.jsoup.parser.Parser parser18 = parser14.settings(parseSettings17);
        org.jsoup.parser.Parser parser21 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document22 = org.jsoup.Jsoup.parse("hi!", "hi!", parser21);
        org.jsoup.parser.ParseSettings parseSettings23 = parser21.settings();
        org.jsoup.parser.Parser parser24 = parser14.settings(parseSettings23);
        org.jsoup.parser.Parser parser25 = parser0.settings(parseSettings23);
        boolean boolean26 = parser0.isTrackErrors();
        org.jsoup.parser.Parser parser27 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings28 = null;
        org.jsoup.parser.Parser parser29 = parser27.settings(parseSettings28);
        org.jsoup.parser.ParseSettings parseSettings30 = null;
        org.jsoup.parser.Parser parser31 = parser27.settings(parseSettings30);
        org.jsoup.parser.ParseSettings parseSettings32 = parser27.settings();
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        org.jsoup.parser.Parser parser34 = parser27.settings(parseSettings33);
        org.jsoup.parser.Parser parser35 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.ParseSettings parseSettings36 = parser35.settings();
        org.jsoup.parser.Parser parser37 = parser27.settings(parseSettings36);
        org.jsoup.parser.Parser parser38 = parser0.settings(parseSettings36);
        org.jsoup.parser.Parser parser40 = parser38.setTrackErrors(0);
        org.jsoup.parser.Parser parser42 = parser38.setTrackErrors((int) (short) 10);
        org.jsoup.parser.Parser parser45 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document46 = org.jsoup.Jsoup.parse("hi!", "hi!", parser45);
        org.jsoup.parser.Parser parser47 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings48 = null;
        org.jsoup.parser.Parser parser49 = parser47.settings(parseSettings48);
        org.jsoup.nodes.Document document52 = parser49.parseInput("", "hi!");
        org.jsoup.parser.Parser parser55 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document56 = org.jsoup.Jsoup.parse("hi!", "hi!", parser55);
        org.jsoup.parser.ParseSettings parseSettings57 = parser55.settings();
        org.jsoup.parser.Parser parser58 = parser49.settings(parseSettings57);
        org.jsoup.parser.Parser parser59 = parser45.settings(parseSettings57);
        org.jsoup.parser.Parser parser60 = parser42.settings(parseSettings57);
        org.jsoup.nodes.Document document63 = parser42.parseInput("", "");
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNull(parseSettings5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNull(parseSettings32);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNotNull(parser47);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNotNull(parser55);
        org.junit.Assert.assertNotNull(document56);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertNotNull(parser59);
        org.junit.Assert.assertNotNull(parser60);
        org.junit.Assert.assertNotNull(document63);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser0.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = parser0.settings();
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings7 = null;
        org.jsoup.parser.Parser parser8 = parser6.settings(parseSettings7);
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        org.jsoup.parser.Parser parser10 = parser6.settings(parseSettings9);
        org.jsoup.parser.Parser parser11 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings12 = null;
        org.jsoup.parser.Parser parser13 = parser11.settings(parseSettings12);
        org.jsoup.nodes.Document document16 = parser13.parseInput("", "hi!");
        org.jsoup.parser.Parser parser19 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document20 = org.jsoup.Jsoup.parse("hi!", "hi!", parser19);
        org.jsoup.parser.ParseSettings parseSettings21 = parser19.settings();
        org.jsoup.parser.Parser parser22 = parser13.settings(parseSettings21);
        org.jsoup.parser.Parser parser23 = parser10.settings(parseSettings21);
        org.jsoup.parser.ParseSettings parseSettings24 = parser10.settings();
        org.jsoup.parser.Parser parser25 = parser0.settings(parseSettings24);
        org.jsoup.parser.Parser parser27 = parser25.setTrackErrors((int) ' ');
        java.util.List<org.jsoup.parser.ParseError> parseErrorList28 = parser25.getErrors();
        org.jsoup.parser.Parser parser31 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document32 = org.jsoup.Jsoup.parse("hi!", "hi!", parser31);
        org.jsoup.parser.Parser parser33 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings34 = null;
        org.jsoup.parser.Parser parser35 = parser33.settings(parseSettings34);
        org.jsoup.parser.ParseSettings parseSettings36 = null;
        org.jsoup.parser.Parser parser37 = parser33.settings(parseSettings36);
        org.jsoup.parser.Parser parser40 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document41 = org.jsoup.Jsoup.parse("hi!", "hi!", parser40);
        org.jsoup.parser.ParseSettings parseSettings42 = parser40.settings();
        org.jsoup.parser.Parser parser43 = parser33.settings(parseSettings42);
        org.jsoup.parser.ParseSettings parseSettings44 = parser33.settings();
        org.jsoup.parser.Parser parser45 = parser31.settings(parseSettings44);
        org.jsoup.parser.Parser parser46 = parser25.settings(parseSettings44);
        org.jsoup.parser.Parser parser48 = parser46.setTrackErrors((int) '4');
        java.util.List<org.jsoup.parser.ParseError> parseErrorList49 = parser48.getErrors();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNull(parseSettings5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNull(parseErrorList28);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(parser48);
        org.junit.Assert.assertNull(parseErrorList49);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.nodes.Document document9 = parser6.parseInput("", "hi!");
        org.jsoup.parser.Parser parser11 = parser6.setTrackErrors((int) (byte) 1);
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("hi!", "hi!", parser14);
        org.jsoup.parser.ParseSettings parseSettings16 = parser14.settings();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList17 = parser14.getErrors();
        org.jsoup.parser.Parser parser19 = parser14.setTrackErrors((int) (short) 100);
        org.jsoup.parser.ParseSettings parseSettings20 = parser14.settings();
        org.jsoup.parser.Parser parser21 = parser6.settings(parseSettings20);
        org.jsoup.nodes.Document document22 = org.jsoup.Jsoup.parse("", "", parser21);
        org.jsoup.parser.ParseSettings parseSettings23 = null;
        org.jsoup.parser.Parser parser24 = parser21.settings(parseSettings23);
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parse("hi!", "", parser24);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(parseErrorList17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(document25);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("", "hi!", parser4);
        org.jsoup.parser.Parser parser7 = parser4.setTrackErrors((int) '#');
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parse("", "", parser7);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList9 = parser7.getErrors();
        boolean boolean10 = parser7.isTrackErrors();
        boolean boolean11 = parser7.isTrackErrors();
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(parseErrorList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("hi!", "hi!", parser6);
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parse("hi!", "", parser6);
        org.jsoup.nodes.Document document11 = parser6.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings12 = parser6.settings();
        org.jsoup.parser.Parser parser14 = parser6.setTrackErrors((int) (byte) 10);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList15 = parser14.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList16 = parser14.getErrors();
        org.jsoup.parser.Parser parser18 = parser14.setTrackErrors((int) (byte) 10);
        org.jsoup.parser.ParseSettings parseSettings19 = parser14.settings();
        org.jsoup.nodes.Document document20 = org.jsoup.Jsoup.parse("", "", parser14);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parseErrorList15);
        org.junit.Assert.assertNotNull(parseErrorList16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(document20);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("hi!", "hi!", parser4);
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse("hi!", "", parser4);
        org.jsoup.nodes.Document document9 = parser4.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings10 = parser4.settings();
        org.jsoup.parser.Parser parser12 = parser4.setTrackErrors((int) (short) 100);
        org.jsoup.parser.Parser parser14 = parser12.setTrackErrors((int) (byte) 10);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList15 = parser12.getErrors();
        org.jsoup.parser.ParseSettings parseSettings16 = null;
        org.jsoup.parser.Parser parser17 = parser12.settings(parseSettings16);
        org.jsoup.nodes.Document document20 = parser12.parseInput("hi!", "");
        org.jsoup.nodes.Document document23 = parser12.parseInput("hi!", "");
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parseErrorList15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(document23);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser2.settings(parseSettings5);
        boolean boolean7 = parser2.isTrackErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList8 = parser2.getErrors();
        org.jsoup.parser.Parser parser10 = parser2.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("", "", parser10);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList12 = parser10.getErrors();
        org.jsoup.nodes.Document document15 = parser10.parseInput("hi!", "");
        boolean boolean16 = parser10.isTrackErrors();
        org.jsoup.nodes.Document document19 = parser10.parseInput("", "hi!");
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(parseErrorList8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseErrorList12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(document19);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("", "hi!", parser2);
        org.jsoup.parser.Parser parser5 = parser2.setTrackErrors(10);
        org.jsoup.parser.Parser parser7 = parser5.setTrackErrors(10);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList8 = parser7.getErrors();
        boolean boolean9 = parser7.isTrackErrors();
        org.jsoup.parser.Parser parser11 = parser7.setTrackErrors((int) (short) 0);
        org.jsoup.nodes.Document document14 = parser7.parseInput("", "");
        org.jsoup.parser.ParseSettings parseSettings15 = parser7.settings();
        org.jsoup.parser.Parser parser16 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList17 = parser16.getErrors();
        org.jsoup.parser.Parser parser19 = parser16.setTrackErrors((int) (short) 100);
        boolean boolean20 = parser16.isTrackErrors();
        org.jsoup.nodes.Document document23 = parser16.parseInput("hi!", "hi!");
        org.jsoup.parser.Parser parser26 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parse("", "hi!", parser26);
        org.jsoup.parser.Parser parser29 = parser26.setTrackErrors((int) '#');
        org.jsoup.parser.ParseSettings parseSettings30 = parser29.settings();
        org.jsoup.parser.ParseSettings parseSettings31 = parser29.settings();
        org.jsoup.parser.Parser parser32 = parser16.settings(parseSettings31);
        org.jsoup.parser.Parser parser33 = parser7.settings(parseSettings31);
        java.lang.Class<?> wildcardClass34 = parser7.getClass();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parseErrorList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNull(parseErrorList17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("hi!", "", parser4);
        org.jsoup.parser.ParseSettings parseSettings6 = parser4.settings();
        org.jsoup.parser.ParseSettings parseSettings7 = parser4.settings();
        org.jsoup.parser.Parser parser9 = parser4.setTrackErrors(0);
        org.jsoup.parser.Parser parser11 = parser4.setTrackErrors((int) '#');
        org.jsoup.parser.Parser parser13 = parser11.setTrackErrors((int) (byte) 1);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNull(parseSettings6);
        org.junit.Assert.assertNull(parseSettings7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("hi!", "hi!", parser4);
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings7 = null;
        org.jsoup.parser.Parser parser8 = parser6.settings(parseSettings7);
        org.jsoup.nodes.Document document11 = parser8.parseInput("", "hi!");
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("hi!", "hi!", parser14);
        org.jsoup.parser.ParseSettings parseSettings16 = parser14.settings();
        org.jsoup.parser.Parser parser17 = parser8.settings(parseSettings16);
        org.jsoup.parser.Parser parser18 = parser4.settings(parseSettings16);
        org.jsoup.parser.Parser parser20 = parser4.setTrackErrors((int) ' ');
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("hi!", "", parser4);
        boolean boolean22 = parser4.isTrackErrors();
        boolean boolean23 = parser4.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings24 = parser4.settings();
        org.jsoup.parser.Parser parser25 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        org.jsoup.parser.Parser parser27 = parser25.settings(parseSettings26);
        org.jsoup.parser.Parser parser28 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        org.jsoup.parser.Parser parser30 = parser28.settings(parseSettings29);
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        org.jsoup.parser.Parser parser32 = parser28.settings(parseSettings31);
        org.jsoup.parser.Parser parser35 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document36 = org.jsoup.Jsoup.parse("hi!", "hi!", parser35);
        org.jsoup.parser.ParseSettings parseSettings37 = parser35.settings();
        org.jsoup.parser.Parser parser38 = parser28.settings(parseSettings37);
        org.jsoup.parser.Parser parser39 = parser27.settings(parseSettings37);
        org.jsoup.nodes.Document document42 = parser27.parseInput("hi!", "hi!");
        org.jsoup.parser.Parser parser44 = parser27.setTrackErrors((int) (short) 10);
        boolean boolean45 = parser27.isTrackErrors();
        org.jsoup.parser.Parser parser46 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings47 = null;
        org.jsoup.parser.Parser parser48 = parser46.settings(parseSettings47);
        org.jsoup.parser.ParseSettings parseSettings49 = null;
        org.jsoup.parser.Parser parser50 = parser46.settings(parseSettings49);
        org.jsoup.parser.ParseSettings parseSettings51 = parser46.settings();
        org.jsoup.parser.ParseSettings parseSettings52 = null;
        org.jsoup.parser.Parser parser53 = parser46.settings(parseSettings52);
        org.jsoup.nodes.Document document56 = parser46.parseInput("", "hi!");
        org.jsoup.nodes.Document document59 = parser46.parseInput("", "hi!");
        org.jsoup.parser.Parser parser60 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings61 = null;
        org.jsoup.parser.Parser parser62 = parser60.settings(parseSettings61);
        org.jsoup.parser.ParseSettings parseSettings63 = null;
        org.jsoup.parser.Parser parser64 = parser60.settings(parseSettings63);
        org.jsoup.parser.Parser parser67 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document68 = org.jsoup.Jsoup.parse("hi!", "hi!", parser67);
        org.jsoup.parser.ParseSettings parseSettings69 = parser67.settings();
        org.jsoup.parser.Parser parser70 = parser60.settings(parseSettings69);
        org.jsoup.parser.Parser parser71 = parser46.settings(parseSettings69);
        boolean boolean72 = parser46.isTrackErrors();
        org.jsoup.parser.Parser parser73 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings74 = null;
        org.jsoup.parser.Parser parser75 = parser73.settings(parseSettings74);
        org.jsoup.parser.ParseSettings parseSettings76 = null;
        org.jsoup.parser.Parser parser77 = parser73.settings(parseSettings76);
        org.jsoup.parser.ParseSettings parseSettings78 = parser73.settings();
        org.jsoup.parser.ParseSettings parseSettings79 = null;
        org.jsoup.parser.Parser parser80 = parser73.settings(parseSettings79);
        org.jsoup.parser.Parser parser81 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.ParseSettings parseSettings82 = parser81.settings();
        org.jsoup.parser.Parser parser83 = parser73.settings(parseSettings82);
        org.jsoup.parser.Parser parser84 = parser46.settings(parseSettings82);
        org.jsoup.parser.ParseSettings parseSettings85 = parser84.settings();
        org.jsoup.parser.Parser parser86 = parser27.settings(parseSettings85);
        org.jsoup.parser.Parser parser87 = parser4.settings(parseSettings85);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(parser48);
        org.junit.Assert.assertNotNull(parser50);
        org.junit.Assert.assertNull(parseSettings51);
        org.junit.Assert.assertNotNull(parser53);
        org.junit.Assert.assertNotNull(document56);
        org.junit.Assert.assertNotNull(document59);
        org.junit.Assert.assertNotNull(parser60);
        org.junit.Assert.assertNotNull(parser62);
        org.junit.Assert.assertNotNull(parser64);
        org.junit.Assert.assertNotNull(parser67);
        org.junit.Assert.assertNotNull(document68);
        org.junit.Assert.assertNotNull(parseSettings69);
        org.junit.Assert.assertNotNull(parser70);
        org.junit.Assert.assertNotNull(parser71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(parser73);
        org.junit.Assert.assertNotNull(parser75);
        org.junit.Assert.assertNotNull(parser77);
        org.junit.Assert.assertNull(parseSettings78);
        org.junit.Assert.assertNotNull(parser80);
        org.junit.Assert.assertNotNull(parser81);
        org.junit.Assert.assertNotNull(parseSettings82);
        org.junit.Assert.assertNotNull(parser83);
        org.junit.Assert.assertNotNull(parser84);
        org.junit.Assert.assertNotNull(parseSettings85);
        org.junit.Assert.assertNotNull(parser86);
        org.junit.Assert.assertNotNull(parser87);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("", "hi!", parser4);
        org.jsoup.parser.Parser parser7 = parser4.setTrackErrors(10);
        org.jsoup.parser.Parser parser9 = parser7.setTrackErrors(10);
        boolean boolean10 = parser9.isTrackErrors();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("", "hi!", parser9);
        org.jsoup.parser.ParseSettings parseSettings12 = parser9.settings();
        org.jsoup.parser.ParseSettings parseSettings13 = parser9.settings();
        org.jsoup.nodes.Document document16 = parser9.parseInput("hi!", "");
        org.jsoup.nodes.Document document19 = parser9.parseInput("", "");
        boolean boolean20 = parser9.isTrackErrors();
        org.jsoup.parser.Parser parser22 = parser9.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser24 = parser9.setTrackErrors((int) (byte) 10);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser24);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse("", "hi!", parser5);
        org.jsoup.parser.Parser parser8 = parser5.setTrackErrors(10);
        org.jsoup.parser.Parser parser10 = parser5.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser12 = parser5.setTrackErrors((int) (short) 1);
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "", parser12);
        org.jsoup.parser.Parser parser15 = parser12.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser17 = parser12.setTrackErrors(1);
        org.jsoup.parser.Parser parser19 = parser12.setTrackErrors((int) (short) -1);
        org.jsoup.parser.Parser parser20 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        org.jsoup.parser.Parser parser22 = parser20.settings(parseSettings21);
        org.jsoup.parser.ParseSettings parseSettings23 = null;
        org.jsoup.parser.Parser parser24 = parser20.settings(parseSettings23);
        org.jsoup.parser.ParseSettings parseSettings25 = parser20.settings();
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        org.jsoup.parser.Parser parser27 = parser20.settings(parseSettings26);
        org.jsoup.parser.Parser parser28 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.ParseSettings parseSettings29 = parser28.settings();
        org.jsoup.parser.Parser parser30 = parser20.settings(parseSettings29);
        org.jsoup.parser.Parser parser31 = parser12.settings(parseSettings29);
        org.jsoup.parser.Parser parser33 = parser12.setTrackErrors((int) (short) 0);
        org.jsoup.nodes.Document document36 = parser33.parseInput("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = org.jsoup.parser.Parser.parseFragment("", (org.jsoup.nodes.Element) document36, "");
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNull(parseSettings25);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(nodeList38);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = org.jsoup.parser.Parser.parseFragment("hi!", (org.jsoup.nodes.Element) document4, "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = org.jsoup.parser.Parser.parseFragment("", (org.jsoup.nodes.Element) document4, "");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.Parser parser2 = parser0.setTrackErrors((int) (byte) 10);
        org.jsoup.parser.Parser parser4 = parser0.setTrackErrors((int) 'a');
        org.jsoup.parser.Parser parser9 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse("hi!", "hi!", parser9);
        org.jsoup.parser.ParseSettings parseSettings11 = parser9.settings();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parse("hi!", "hi!", parser9);
        org.jsoup.nodes.Document document15 = parser9.parseInput("", "");
        boolean boolean16 = parser9.isTrackErrors();
        org.jsoup.parser.Parser parser18 = parser9.setTrackErrors((int) (byte) 0);
        org.jsoup.parser.Parser parser21 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document22 = org.jsoup.Jsoup.parse("hi!", "hi!", parser21);
        org.jsoup.parser.Parser parser23 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        org.jsoup.parser.Parser parser25 = parser23.settings(parseSettings24);
        org.jsoup.nodes.Document document28 = parser25.parseInput("", "hi!");
        org.jsoup.parser.Parser parser31 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document32 = org.jsoup.Jsoup.parse("hi!", "hi!", parser31);
        org.jsoup.parser.ParseSettings parseSettings33 = parser31.settings();
        org.jsoup.parser.Parser parser34 = parser25.settings(parseSettings33);
        org.jsoup.parser.Parser parser35 = parser21.settings(parseSettings33);
        org.jsoup.nodes.Document document38 = parser35.parseInput("", "");
        org.jsoup.parser.ParseSettings parseSettings39 = parser35.settings();
        boolean boolean40 = parser35.isTrackErrors();
        org.jsoup.parser.Parser parser45 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document46 = org.jsoup.Jsoup.parse("hi!", "hi!", parser45);
        org.jsoup.parser.Parser parser47 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings48 = null;
        org.jsoup.parser.Parser parser49 = parser47.settings(parseSettings48);
        org.jsoup.nodes.Document document52 = parser49.parseInput("", "hi!");
        org.jsoup.parser.Parser parser55 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document56 = org.jsoup.Jsoup.parse("hi!", "hi!", parser55);
        org.jsoup.parser.ParseSettings parseSettings57 = parser55.settings();
        org.jsoup.parser.Parser parser58 = parser49.settings(parseSettings57);
        org.jsoup.parser.Parser parser59 = parser45.settings(parseSettings57);
        org.jsoup.nodes.Document document62 = parser59.parseInput("", "");
        org.jsoup.nodes.Document document63 = org.jsoup.Jsoup.parse("", "hi!", parser59);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList64 = parser59.getErrors();
        org.jsoup.parser.ParseSettings parseSettings65 = parser59.settings();
        org.jsoup.parser.Parser parser66 = parser35.settings(parseSettings65);
        org.jsoup.parser.Parser parser67 = parser9.settings(parseSettings65);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList68 = parser67.getErrors();
        org.jsoup.parser.ParseSettings parseSettings69 = null;
        org.jsoup.parser.Parser parser70 = parser67.settings(parseSettings69);
        org.jsoup.nodes.Document document73 = parser67.parseInput("hi!", "hi!");
        org.jsoup.parser.Parser parser76 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document77 = org.jsoup.Jsoup.parse("", "hi!", parser76);
        org.jsoup.parser.ParseSettings parseSettings78 = parser76.settings();
        org.jsoup.parser.Parser parser80 = parser76.setTrackErrors((int) (byte) 1);
        org.jsoup.parser.ParseSettings parseSettings81 = parser76.settings();
        org.jsoup.parser.ParseSettings parseSettings82 = parser76.settings();
        org.jsoup.parser.Parser parser83 = parser67.settings(parseSettings82);
        org.jsoup.parser.Parser parser84 = parser0.settings(parseSettings82);
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(parseSettings39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNotNull(parser47);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNotNull(parser55);
        org.junit.Assert.assertNotNull(document56);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertNotNull(parser59);
        org.junit.Assert.assertNotNull(document62);
        org.junit.Assert.assertNotNull(document63);
        org.junit.Assert.assertNotNull(parseErrorList64);
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertNotNull(parser66);
        org.junit.Assert.assertNotNull(parser67);
        org.junit.Assert.assertNotNull(parseErrorList68);
        org.junit.Assert.assertNotNull(parser70);
        org.junit.Assert.assertNotNull(document73);
        org.junit.Assert.assertNotNull(parser76);
        org.junit.Assert.assertNotNull(document77);
        org.junit.Assert.assertNotNull(parseSettings78);
        org.junit.Assert.assertNotNull(parser80);
        org.junit.Assert.assertNotNull(parseSettings81);
        org.junit.Assert.assertNotNull(parseSettings82);
        org.junit.Assert.assertNotNull(parser83);
        org.junit.Assert.assertNotNull(parser84);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("hi!", "hi!", parser2);
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.nodes.Document document9 = parser6.parseInput("", "hi!");
        org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "hi!", parser12);
        org.jsoup.parser.ParseSettings parseSettings14 = parser12.settings();
        org.jsoup.parser.Parser parser15 = parser6.settings(parseSettings14);
        org.jsoup.parser.Parser parser16 = parser2.settings(parseSettings14);
        org.jsoup.parser.Parser parser18 = parser2.setTrackErrors((int) ' ');
        java.util.List<org.jsoup.parser.ParseError> parseErrorList19 = parser18.getErrors();
        org.jsoup.parser.ParseSettings parseSettings20 = parser18.settings();
        org.jsoup.parser.Parser parser21 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        org.jsoup.parser.Parser parser23 = parser21.settings(parseSettings22);
        org.jsoup.nodes.Document document26 = parser23.parseInput("", "hi!");
        org.jsoup.parser.Parser parser29 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document30 = org.jsoup.Jsoup.parse("hi!", "hi!", parser29);
        org.jsoup.parser.ParseSettings parseSettings31 = parser29.settings();
        org.jsoup.parser.Parser parser32 = parser23.settings(parseSettings31);
        org.jsoup.parser.Parser parser33 = parser18.settings(parseSettings31);
        org.jsoup.parser.Parser parser35 = parser33.setTrackErrors(0);
        org.jsoup.parser.Parser parser36 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        org.jsoup.parser.Parser parser38 = parser36.settings(parseSettings37);
        org.jsoup.parser.ParseSettings parseSettings39 = null;
        org.jsoup.parser.Parser parser40 = parser36.settings(parseSettings39);
        org.jsoup.parser.Parser parser41 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings42 = null;
        org.jsoup.parser.Parser parser43 = parser41.settings(parseSettings42);
        org.jsoup.nodes.Document document46 = parser43.parseInput("", "hi!");
        org.jsoup.parser.Parser parser49 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document50 = org.jsoup.Jsoup.parse("hi!", "hi!", parser49);
        org.jsoup.parser.ParseSettings parseSettings51 = parser49.settings();
        org.jsoup.parser.Parser parser52 = parser43.settings(parseSettings51);
        org.jsoup.parser.Parser parser53 = parser40.settings(parseSettings51);
        org.jsoup.parser.ParseSettings parseSettings54 = parser40.settings();
        org.jsoup.parser.Parser parser55 = parser33.settings(parseSettings54);
        org.jsoup.parser.Parser parser60 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document61 = org.jsoup.Jsoup.parse("hi!", "hi!", parser60);
        org.jsoup.parser.Parser parser62 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings63 = null;
        org.jsoup.parser.Parser parser64 = parser62.settings(parseSettings63);
        org.jsoup.nodes.Document document67 = parser64.parseInput("", "hi!");
        org.jsoup.parser.Parser parser70 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document71 = org.jsoup.Jsoup.parse("hi!", "hi!", parser70);
        org.jsoup.parser.ParseSettings parseSettings72 = parser70.settings();
        org.jsoup.parser.Parser parser73 = parser64.settings(parseSettings72);
        org.jsoup.parser.Parser parser74 = parser60.settings(parseSettings72);
        org.jsoup.nodes.Document document77 = parser74.parseInput("", "");
        org.jsoup.nodes.Document document78 = org.jsoup.Jsoup.parse("", "hi!", parser74);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList79 = parser74.getErrors();
        org.jsoup.parser.ParseSettings parseSettings80 = parser74.settings();
        org.jsoup.parser.ParseSettings parseSettings81 = parser74.settings();
        org.jsoup.parser.ParseSettings parseSettings82 = parser74.settings();
        org.jsoup.parser.ParseSettings parseSettings83 = parser74.settings();
        org.jsoup.parser.Parser parser84 = parser55.settings(parseSettings83);
        org.jsoup.nodes.Document document87 = parser84.parseInput("", "hi!");
        org.jsoup.parser.Parser parser89 = parser84.setTrackErrors((int) (byte) 10);
        org.jsoup.parser.ParseSettings parseSettings90 = parser89.settings();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parseErrorList19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(parser41);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(parser52);
        org.junit.Assert.assertNotNull(parser53);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(parser55);
        org.junit.Assert.assertNotNull(parser60);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNotNull(parser62);
        org.junit.Assert.assertNotNull(parser64);
        org.junit.Assert.assertNotNull(document67);
        org.junit.Assert.assertNotNull(parser70);
        org.junit.Assert.assertNotNull(document71);
        org.junit.Assert.assertNotNull(parseSettings72);
        org.junit.Assert.assertNotNull(parser73);
        org.junit.Assert.assertNotNull(parser74);
        org.junit.Assert.assertNotNull(document77);
        org.junit.Assert.assertNotNull(document78);
        org.junit.Assert.assertNotNull(parseErrorList79);
        org.junit.Assert.assertNotNull(parseSettings80);
        org.junit.Assert.assertNotNull(parseSettings81);
        org.junit.Assert.assertNotNull(parseSettings82);
        org.junit.Assert.assertNotNull(parseSettings83);
        org.junit.Assert.assertNotNull(parser84);
        org.junit.Assert.assertNotNull(document87);
        org.junit.Assert.assertNotNull(parser89);
        org.junit.Assert.assertNotNull(parseSettings90);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.nodes.Document document5 = parser2.parseInput("", "hi!");
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parse("hi!", "hi!", parser8);
        org.jsoup.parser.ParseSettings parseSettings10 = parser8.settings();
        org.jsoup.parser.Parser parser11 = parser2.settings(parseSettings10);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList12 = parser11.getErrors();
        org.jsoup.parser.Parser parser13 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings14 = parser13.settings();
        org.jsoup.parser.Parser parser15 = parser11.settings(parseSettings14);
        org.jsoup.parser.ParseSettings parseSettings16 = parser11.settings();
        org.jsoup.parser.Parser parser18 = parser11.setTrackErrors((int) (byte) 100);
        org.jsoup.parser.Parser parser20 = parser11.setTrackErrors((int) (byte) 0);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList21 = parser11.getErrors();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parseErrorList12);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parseErrorList21);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.Parser parser4 = parser2.setTrackErrors((int) (short) 100);
        org.jsoup.parser.Parser parser6 = parser4.setTrackErrors((int) ' ');
        org.jsoup.parser.Parser parser8 = parser4.setTrackErrors((-1));
        boolean boolean9 = parser4.isTrackErrors();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("", "hi!", parser4);
        org.jsoup.parser.Parser parser7 = parser4.setTrackErrors(10);
        org.jsoup.parser.Parser parser9 = parser7.setTrackErrors(10);
        org.jsoup.nodes.Document document12 = parser9.parseInput("", "hi!");
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("", "", parser9);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document13);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser2.settings(parseSettings5);
        org.jsoup.parser.Parser parser7 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser7.settings(parseSettings8);
        org.jsoup.nodes.Document document12 = parser9.parseInput("", "hi!");
        org.jsoup.parser.Parser parser15 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parse("hi!", "hi!", parser15);
        org.jsoup.parser.ParseSettings parseSettings17 = parser15.settings();
        org.jsoup.parser.Parser parser18 = parser9.settings(parseSettings17);
        org.jsoup.parser.Parser parser19 = parser6.settings(parseSettings17);
        org.jsoup.nodes.Document document22 = parser19.parseInput("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings23 = parser19.settings();
        boolean boolean24 = parser19.isTrackErrors();
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parse("hi!", "hi!", parser19);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList26 = parser19.getErrors();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(parseErrorList26);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser2.settings(parseSettings5);
        org.jsoup.nodes.Document document9 = parser2.parseInput("hi!", "");
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse("", "hi!", parser2);
        org.jsoup.parser.Parser parser12 = parser2.setTrackErrors((int) ' ');
        org.jsoup.parser.Parser parser14 = parser12.setTrackErrors((int) '#');
        org.jsoup.parser.Parser parser16 = parser14.setTrackErrors((int) (short) 0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser16);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("hi!", "hi!", parser2);
        org.jsoup.parser.ParseSettings parseSettings4 = parser2.settings();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList5 = parser2.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList6 = parser2.getErrors();
        org.jsoup.nodes.Document document9 = parser2.parseInput("hi!", "hi!");
        java.util.List<org.jsoup.parser.ParseError> parseErrorList10 = parser2.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList11 = parser2.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList12 = parser2.getErrors();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertNotNull(parseErrorList5);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parseErrorList10);
        org.junit.Assert.assertNotNull(parseErrorList11);
        org.junit.Assert.assertNotNull(parseErrorList12);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.Parser parser7 = parser5.setTrackErrors((int) (short) -1);
        org.jsoup.parser.Parser parser9 = parser7.setTrackErrors((int) (byte) 0);
        org.jsoup.nodes.Document document12 = parser7.parseInput("hi!", "");
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        org.jsoup.parser.Parser parser14 = parser7.settings(parseSettings13);
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("", "hi!", parser7);
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parse("hi!", "hi!", parser7);
        java.util.List<org.jsoup.nodes.Node> nodeList18 = org.jsoup.parser.Parser.parseFragment("", (org.jsoup.nodes.Element) document16, "hi!");
        java.lang.Class<?> wildcardClass19 = document16.getClass();
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser2.settings(parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = parser2.settings();
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser2.settings(parseSettings8);
        org.jsoup.nodes.Document document12 = parser2.parseInput("", "hi!");
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "", parser2);
        org.jsoup.parser.ParseSettings parseSettings14 = parser2.settings();
        org.jsoup.parser.Parser parser15 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList16 = parser15.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList17 = parser15.getErrors();
        org.jsoup.parser.ParseSettings parseSettings18 = parser15.settings();
        org.jsoup.parser.ParseSettings parseSettings19 = parser15.settings();
        org.jsoup.parser.Parser parser20 = parser2.settings(parseSettings19);
        org.jsoup.parser.Parser parser25 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parse("", "hi!", parser25);
        org.jsoup.parser.Parser parser28 = parser25.setTrackErrors(10);
        org.jsoup.parser.Parser parser30 = parser25.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser32 = parser25.setTrackErrors((int) (short) 1);
        org.jsoup.parser.Parser parser34 = parser25.setTrackErrors(100);
        org.jsoup.nodes.Document document35 = org.jsoup.Jsoup.parse("", "", parser34);
        org.jsoup.parser.ParseSettings parseSettings36 = parser34.settings();
        org.jsoup.parser.Parser parser37 = parser2.settings(parseSettings36);
        org.jsoup.nodes.Document document40 = parser2.parseInput("", "");
        org.jsoup.parser.Parser parser41 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings42 = null;
        org.jsoup.parser.Parser parser43 = parser41.settings(parseSettings42);
        org.jsoup.nodes.Document document46 = parser43.parseInput("", "hi!");
        org.jsoup.parser.Parser parser49 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document50 = org.jsoup.Jsoup.parse("hi!", "hi!", parser49);
        org.jsoup.parser.ParseSettings parseSettings51 = parser49.settings();
        org.jsoup.parser.Parser parser52 = parser43.settings(parseSettings51);
        org.jsoup.parser.Parser parser53 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings54 = null;
        org.jsoup.parser.Parser parser55 = parser53.settings(parseSettings54);
        org.jsoup.parser.ParseSettings parseSettings56 = null;
        org.jsoup.parser.Parser parser57 = parser53.settings(parseSettings56);
        org.jsoup.parser.ParseSettings parseSettings58 = parser53.settings();
        org.jsoup.parser.ParseSettings parseSettings59 = null;
        org.jsoup.parser.Parser parser60 = parser53.settings(parseSettings59);
        org.jsoup.nodes.Document document63 = parser53.parseInput("", "hi!");
        org.jsoup.nodes.Document document66 = parser53.parseInput("", "hi!");
        org.jsoup.parser.Parser parser67 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings68 = null;
        org.jsoup.parser.Parser parser69 = parser67.settings(parseSettings68);
        org.jsoup.parser.ParseSettings parseSettings70 = null;
        org.jsoup.parser.Parser parser71 = parser67.settings(parseSettings70);
        org.jsoup.parser.Parser parser74 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document75 = org.jsoup.Jsoup.parse("hi!", "hi!", parser74);
        org.jsoup.parser.ParseSettings parseSettings76 = parser74.settings();
        org.jsoup.parser.Parser parser77 = parser67.settings(parseSettings76);
        org.jsoup.parser.Parser parser78 = parser53.settings(parseSettings76);
        boolean boolean79 = parser53.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings80 = parser53.settings();
        org.jsoup.parser.Parser parser81 = parser52.settings(parseSettings80);
        org.jsoup.parser.Parser parser82 = parser2.settings(parseSettings80);
        org.jsoup.parser.Parser parser84 = parser2.setTrackErrors((int) 'a');
        org.jsoup.parser.ParseSettings parseSettings85 = parser84.settings();
        org.jsoup.parser.ParseSettings parseSettings86 = parser84.settings();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNull(parseSettings7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNull(parseErrorList16);
        org.junit.Assert.assertNull(parseErrorList17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(parser41);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(parser52);
        org.junit.Assert.assertNotNull(parser53);
        org.junit.Assert.assertNotNull(parser55);
        org.junit.Assert.assertNotNull(parser57);
        org.junit.Assert.assertNull(parseSettings58);
        org.junit.Assert.assertNotNull(parser60);
        org.junit.Assert.assertNotNull(document63);
        org.junit.Assert.assertNotNull(document66);
        org.junit.Assert.assertNotNull(parser67);
        org.junit.Assert.assertNotNull(parser69);
        org.junit.Assert.assertNotNull(parser71);
        org.junit.Assert.assertNotNull(parser74);
        org.junit.Assert.assertNotNull(document75);
        org.junit.Assert.assertNotNull(parseSettings76);
        org.junit.Assert.assertNotNull(parser77);
        org.junit.Assert.assertNotNull(parser78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(parseSettings80);
        org.junit.Assert.assertNotNull(parser81);
        org.junit.Assert.assertNotNull(parser82);
        org.junit.Assert.assertNotNull(parser84);
        org.junit.Assert.assertNotNull(parseSettings85);
        org.junit.Assert.assertNotNull(parseSettings86);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.nodes.Document document9 = parser6.parseInput("hi!", "hi!");
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse("", "hi!", parser6);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList11 = parser6.getErrors();
        org.jsoup.parser.Parser parser13 = parser6.setTrackErrors((int) (short) -1);
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parse("", "", parser13);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parseErrorList11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(document14);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse("", "hi!", parser5);
        org.jsoup.parser.Parser parser8 = parser5.setTrackErrors(10);
        org.jsoup.parser.Parser parser10 = parser8.setTrackErrors(10);
        boolean boolean11 = parser10.isTrackErrors();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parse("", "hi!", parser10);
        org.jsoup.parser.ParseSettings parseSettings13 = parser10.settings();
        org.jsoup.parser.ParseSettings parseSettings14 = parser10.settings();
        org.jsoup.nodes.Document document17 = parser10.parseInput("hi!", "");
        org.jsoup.nodes.Document document20 = parser10.parseInput("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = org.jsoup.parser.Parser.parseFragment("hi!", (org.jsoup.nodes.Element) document20, "hi!");
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("", "hi!", parser4);
        org.jsoup.parser.Parser parser7 = parser4.setTrackErrors(10);
        org.jsoup.parser.Parser parser9 = parser4.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser11 = parser4.setTrackErrors((int) (short) 1);
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parse("hi!", "", parser11);
        org.jsoup.parser.Parser parser14 = parser11.setTrackErrors((int) (byte) -1);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList15 = parser14.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList16 = parser14.getErrors();
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        org.jsoup.parser.Parser parser18 = parser14.settings(parseSettings17);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList19 = parser14.getErrors();
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parseErrorList15);
        org.junit.Assert.assertNotNull(parseErrorList16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parseErrorList19);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        org.jsoup.parser.Parser parser5 = parser3.settings(parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser3.settings(parseSettings6);
        org.jsoup.parser.Parser parser9 = parser7.setTrackErrors((int) (byte) 1);
        org.jsoup.nodes.Document document12 = parser9.parseInput("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse(inputStream0, "", "hi!", parser9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document12);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser0.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = parser0.settings();
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser0.settings(parseSettings6);
        org.jsoup.nodes.Document document10 = parser0.parseInput("", "hi!");
        org.jsoup.nodes.Document document13 = parser0.parseInput("", "hi!");
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings15 = null;
        org.jsoup.parser.Parser parser16 = parser14.settings(parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        org.jsoup.parser.Parser parser18 = parser14.settings(parseSettings17);
        org.jsoup.parser.Parser parser19 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings20 = null;
        org.jsoup.parser.Parser parser21 = parser19.settings(parseSettings20);
        org.jsoup.nodes.Document document24 = parser21.parseInput("", "hi!");
        org.jsoup.parser.Parser parser27 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document28 = org.jsoup.Jsoup.parse("hi!", "hi!", parser27);
        org.jsoup.parser.ParseSettings parseSettings29 = parser27.settings();
        org.jsoup.parser.Parser parser30 = parser21.settings(parseSettings29);
        org.jsoup.parser.Parser parser31 = parser18.settings(parseSettings29);
        org.jsoup.parser.ParseSettings parseSettings32 = parser18.settings();
        org.jsoup.parser.Parser parser33 = parser0.settings(parseSettings32);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList34 = parser0.getErrors();
        org.jsoup.parser.Parser parser37 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parse("hi!", "hi!", parser37);
        org.jsoup.parser.Parser parser39 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings40 = null;
        org.jsoup.parser.Parser parser41 = parser39.settings(parseSettings40);
        org.jsoup.nodes.Document document44 = parser41.parseInput("", "hi!");
        org.jsoup.parser.Parser parser47 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document48 = org.jsoup.Jsoup.parse("hi!", "hi!", parser47);
        org.jsoup.parser.ParseSettings parseSettings49 = parser47.settings();
        org.jsoup.parser.Parser parser50 = parser41.settings(parseSettings49);
        org.jsoup.parser.Parser parser51 = parser37.settings(parseSettings49);
        org.jsoup.parser.Parser parser53 = parser37.setTrackErrors((int) ' ');
        java.util.List<org.jsoup.parser.ParseError> parseErrorList54 = parser53.getErrors();
        org.jsoup.parser.ParseSettings parseSettings55 = parser53.settings();
        org.jsoup.parser.Parser parser56 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings57 = null;
        org.jsoup.parser.Parser parser58 = parser56.settings(parseSettings57);
        org.jsoup.nodes.Document document61 = parser58.parseInput("", "hi!");
        org.jsoup.parser.Parser parser64 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document65 = org.jsoup.Jsoup.parse("hi!", "hi!", parser64);
        org.jsoup.parser.ParseSettings parseSettings66 = parser64.settings();
        org.jsoup.parser.Parser parser67 = parser58.settings(parseSettings66);
        org.jsoup.parser.Parser parser68 = parser53.settings(parseSettings66);
        org.jsoup.parser.ParseSettings parseSettings69 = parser53.settings();
        org.jsoup.parser.Parser parser70 = parser0.settings(parseSettings69);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList71 = parser0.getErrors();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNull(parseSettings5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parseErrorList34);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNotNull(parser41);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(parser47);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(parser50);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertNotNull(parser53);
        org.junit.Assert.assertNotNull(parseErrorList54);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(parser56);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNotNull(parser64);
        org.junit.Assert.assertNotNull(document65);
        org.junit.Assert.assertNotNull(parseSettings66);
        org.junit.Assert.assertNotNull(parser67);
        org.junit.Assert.assertNotNull(parser68);
        org.junit.Assert.assertNotNull(parseSettings69);
        org.junit.Assert.assertNotNull(parser70);
        org.junit.Assert.assertNotNull(parseErrorList71);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("hi!", "hi!", parser6);
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parse("hi!", "", parser6);
        org.jsoup.nodes.Document document11 = parser6.parseInput("", "hi!");
        java.util.List<org.jsoup.parser.ParseError> parseErrorList12 = parser6.getErrors();
        org.jsoup.parser.Parser parser14 = parser6.setTrackErrors((int) (short) 0);
        org.jsoup.parser.ParseSettings parseSettings15 = parser6.settings();
        org.jsoup.parser.ParseSettings parseSettings16 = parser6.settings();
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parse("", "", parser6);
        boolean boolean18 = parser6.isTrackErrors();
        org.jsoup.parser.Parser parser20 = parser6.setTrackErrors((int) '#');
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseErrorList12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(parser20);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.Parser parser4 = parser2.setTrackErrors((int) (byte) 10);
        org.jsoup.parser.Parser parser6 = parser2.setTrackErrors((int) 'a');
        org.jsoup.parser.Parser parser8 = parser6.setTrackErrors((-1));
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        org.jsoup.parser.Parser parser10 = parser8.settings(parseSettings9);
        org.jsoup.nodes.Document document13 = parser8.parseInput("", "hi!");
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parse("hi!", "hi!", parser8);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document14);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser0.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = parser0.settings();
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser0.settings(parseSettings6);
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        org.jsoup.parser.Parser parser10 = parser8.settings(parseSettings9);
        org.jsoup.parser.Parser parser11 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings12 = null;
        org.jsoup.parser.Parser parser13 = parser11.settings(parseSettings12);
        org.jsoup.parser.ParseSettings parseSettings14 = null;
        org.jsoup.parser.Parser parser15 = parser11.settings(parseSettings14);
        org.jsoup.parser.Parser parser18 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parse("hi!", "hi!", parser18);
        org.jsoup.parser.ParseSettings parseSettings20 = parser18.settings();
        org.jsoup.parser.Parser parser21 = parser11.settings(parseSettings20);
        org.jsoup.parser.Parser parser22 = parser10.settings(parseSettings20);
        org.jsoup.parser.Parser parser23 = parser0.settings(parseSettings20);
        org.jsoup.parser.Parser parser25 = parser0.setTrackErrors((int) (byte) 10);
        org.jsoup.parser.Parser parser27 = parser25.setTrackErrors((int) 'a');
        org.jsoup.parser.Parser parser30 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document31 = org.jsoup.Jsoup.parse("", "hi!", parser30);
        org.jsoup.parser.Parser parser33 = parser30.setTrackErrors(10);
        org.jsoup.parser.Parser parser35 = parser30.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser37 = parser30.setTrackErrors((int) (short) 1);
        org.jsoup.parser.Parser parser39 = parser30.setTrackErrors(100);
        boolean boolean40 = parser39.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings41 = parser39.settings();
        org.jsoup.parser.Parser parser42 = parser27.settings(parseSettings41);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList43 = parser27.getErrors();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNull(parseSettings5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNull(parseErrorList43);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("", "hi!", parser2);
        org.jsoup.parser.Parser parser5 = parser2.setTrackErrors((int) '#');
        org.jsoup.parser.ParseSettings parseSettings6 = parser5.settings();
        boolean boolean7 = parser5.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings8 = parser5.settings();
        org.jsoup.parser.Parser parser9 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings10 = null;
        org.jsoup.parser.Parser parser11 = parser9.settings(parseSettings10);
        org.jsoup.parser.ParseSettings parseSettings12 = null;
        org.jsoup.parser.Parser parser13 = parser9.settings(parseSettings12);
        org.jsoup.parser.ParseSettings parseSettings14 = parser9.settings();
        org.jsoup.parser.ParseSettings parseSettings15 = null;
        org.jsoup.parser.Parser parser16 = parser9.settings(parseSettings15);
        org.jsoup.nodes.Document document19 = parser9.parseInput("", "hi!");
        org.jsoup.nodes.Document document22 = parser9.parseInput("", "hi!");
        org.jsoup.parser.Parser parser23 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        org.jsoup.parser.Parser parser25 = parser23.settings(parseSettings24);
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        org.jsoup.parser.Parser parser27 = parser23.settings(parseSettings26);
        org.jsoup.parser.Parser parser30 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document31 = org.jsoup.Jsoup.parse("hi!", "hi!", parser30);
        org.jsoup.parser.ParseSettings parseSettings32 = parser30.settings();
        org.jsoup.parser.Parser parser33 = parser23.settings(parseSettings32);
        org.jsoup.parser.Parser parser34 = parser9.settings(parseSettings32);
        boolean boolean35 = parser9.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings36 = parser9.settings();
        org.jsoup.parser.Parser parser37 = parser5.settings(parseSettings36);
        java.lang.Class<?> wildcardClass38 = parseSettings36.getClass();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser5 = parser3.setTrackErrors((int) (byte) 0);
        org.jsoup.parser.ParseSettings parseSettings6 = parser5.settings();
        org.jsoup.parser.Parser parser7 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser7.settings(parseSettings8);
        org.jsoup.parser.ParseSettings parseSettings10 = null;
        org.jsoup.parser.Parser parser11 = parser7.settings(parseSettings10);
        boolean boolean12 = parser7.isTrackErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList13 = parser7.getErrors();
        org.jsoup.parser.Parser parser16 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parse("hi!", "hi!", parser16);
        org.jsoup.parser.Parser parser18 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        org.jsoup.parser.Parser parser20 = parser18.settings(parseSettings19);
        org.jsoup.nodes.Document document23 = parser20.parseInput("", "hi!");
        org.jsoup.parser.Parser parser26 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parse("hi!", "hi!", parser26);
        org.jsoup.parser.ParseSettings parseSettings28 = parser26.settings();
        org.jsoup.parser.Parser parser29 = parser20.settings(parseSettings28);
        org.jsoup.parser.Parser parser30 = parser16.settings(parseSettings28);
        org.jsoup.parser.Parser parser32 = parser16.setTrackErrors((int) ' ');
        org.jsoup.parser.ParseSettings parseSettings33 = parser16.settings();
        org.jsoup.parser.Parser parser34 = parser7.settings(parseSettings33);
        org.jsoup.parser.Parser parser35 = parser5.settings(parseSettings33);
        org.jsoup.parser.Parser parser37 = parser5.setTrackErrors((int) (byte) 100);
        org.jsoup.parser.Parser parser39 = parser37.setTrackErrors((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document40 = org.jsoup.Jsoup.parse(inputStream0, "", "hi!", parser37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(parseErrorList13);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(parser39);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.htmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList3 = parser2.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList4 = parser2.getErrors();
        boolean boolean5 = parser2.isTrackErrors();
        org.jsoup.parser.Parser parser7 = parser2.setTrackErrors((int) (byte) 0);
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parse("", "hi!", parser2);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNull(parseErrorList3);
        org.junit.Assert.assertNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(document8);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser5.settings(parseSettings6);
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser5.settings(parseSettings8);
        org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "hi!", parser12);
        org.jsoup.parser.ParseSettings parseSettings14 = parser12.settings();
        org.jsoup.parser.Parser parser15 = parser5.settings(parseSettings14);
        org.jsoup.parser.Parser parser16 = parser4.settings(parseSettings14);
        org.jsoup.parser.Parser parser17 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        org.jsoup.parser.Parser parser19 = parser17.settings(parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = null;
        org.jsoup.parser.Parser parser21 = parser17.settings(parseSettings20);
        org.jsoup.parser.ParseSettings parseSettings22 = parser17.settings();
        org.jsoup.parser.ParseSettings parseSettings23 = null;
        org.jsoup.parser.Parser parser24 = parser17.settings(parseSettings23);
        org.jsoup.nodes.Document document27 = parser17.parseInput("", "hi!");
        org.jsoup.nodes.Document document30 = parser17.parseInput("", "hi!");
        org.jsoup.parser.Parser parser31 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        org.jsoup.parser.Parser parser33 = parser31.settings(parseSettings32);
        org.jsoup.parser.ParseSettings parseSettings34 = null;
        org.jsoup.parser.Parser parser35 = parser31.settings(parseSettings34);
        org.jsoup.parser.Parser parser36 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings37 = null;
        org.jsoup.parser.Parser parser38 = parser36.settings(parseSettings37);
        org.jsoup.nodes.Document document41 = parser38.parseInput("", "hi!");
        org.jsoup.parser.Parser parser44 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document45 = org.jsoup.Jsoup.parse("hi!", "hi!", parser44);
        org.jsoup.parser.ParseSettings parseSettings46 = parser44.settings();
        org.jsoup.parser.Parser parser47 = parser38.settings(parseSettings46);
        org.jsoup.parser.Parser parser48 = parser35.settings(parseSettings46);
        org.jsoup.parser.ParseSettings parseSettings49 = parser35.settings();
        org.jsoup.parser.Parser parser50 = parser17.settings(parseSettings49);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList51 = parser50.getErrors();
        org.jsoup.parser.Parser parser52 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings53 = null;
        org.jsoup.parser.Parser parser54 = parser52.settings(parseSettings53);
        org.jsoup.nodes.Document document57 = parser54.parseInput("", "hi!");
        org.jsoup.parser.Parser parser60 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document61 = org.jsoup.Jsoup.parse("hi!", "hi!", parser60);
        org.jsoup.parser.ParseSettings parseSettings62 = parser60.settings();
        org.jsoup.parser.Parser parser63 = parser54.settings(parseSettings62);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList64 = parser63.getErrors();
        org.jsoup.parser.Parser parser65 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings66 = parser65.settings();
        org.jsoup.parser.Parser parser67 = parser63.settings(parseSettings66);
        org.jsoup.parser.Parser parser68 = parser50.settings(parseSettings66);
        org.jsoup.parser.ParseSettings parseSettings69 = parser68.settings();
        org.jsoup.parser.Parser parser70 = parser4.settings(parseSettings69);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList71 = parser70.getErrors();
        org.jsoup.nodes.Document document72 = org.jsoup.Jsoup.parse("hi!", "", parser70);
        org.jsoup.parser.Parser parser74 = parser70.setTrackErrors(0);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList75 = parser70.getErrors();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNull(parseSettings22);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(parseSettings46);
        org.junit.Assert.assertNotNull(parser47);
        org.junit.Assert.assertNotNull(parser48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(parser50);
        org.junit.Assert.assertNotNull(parseErrorList51);
        org.junit.Assert.assertNotNull(parser52);
        org.junit.Assert.assertNotNull(parser54);
        org.junit.Assert.assertNotNull(document57);
        org.junit.Assert.assertNotNull(parser60);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNotNull(parseSettings62);
        org.junit.Assert.assertNotNull(parser63);
        org.junit.Assert.assertNotNull(parseErrorList64);
        org.junit.Assert.assertNotNull(parser65);
        org.junit.Assert.assertNotNull(parseSettings66);
        org.junit.Assert.assertNotNull(parser67);
        org.junit.Assert.assertNotNull(parser68);
        org.junit.Assert.assertNotNull(parseSettings69);
        org.junit.Assert.assertNotNull(parser70);
        org.junit.Assert.assertNull(parseErrorList71);
        org.junit.Assert.assertNotNull(document72);
        org.junit.Assert.assertNotNull(parser74);
        org.junit.Assert.assertNotNull(parseErrorList75);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        org.jsoup.parser.Parser parser5 = parser3.settings(parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser3.settings(parseSettings6);
        boolean boolean8 = parser3.isTrackErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList9 = parser3.getErrors();
        org.jsoup.parser.Parser parser11 = parser3.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parse("", "hi!", parser3);
        org.jsoup.nodes.Document document15 = parser3.parseInput("hi!", "hi!");
        org.jsoup.nodes.Document document18 = parser3.parseInput("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = org.jsoup.parser.Parser.parseFragment("hi!", (org.jsoup.nodes.Element) document18, "");
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(parseErrorList9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parse("hi!", "hi!", parser3);
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser5.settings(parseSettings6);
        org.jsoup.nodes.Document document10 = parser7.parseInput("", "hi!");
        org.jsoup.parser.Parser parser13 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parse("hi!", "hi!", parser13);
        org.jsoup.parser.ParseSettings parseSettings15 = parser13.settings();
        org.jsoup.parser.Parser parser16 = parser7.settings(parseSettings15);
        org.jsoup.parser.Parser parser17 = parser3.settings(parseSettings15);
        org.jsoup.nodes.Document document20 = parser3.parseInput("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = org.jsoup.parser.Parser.parseFragment("hi!", (org.jsoup.nodes.Element) document20, "");
        java.lang.Class<?> wildcardClass23 = nodeList22.getClass();
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser0.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = parser0.settings();
        org.jsoup.parser.Parser parser7 = parser0.setTrackErrors((int) (short) 0);
        org.jsoup.parser.ParseSettings parseSettings8 = parser7.settings();
        org.jsoup.parser.Parser parser10 = parser7.setTrackErrors((int) (byte) 100);
        org.jsoup.parser.Parser parser12 = parser7.setTrackErrors((int) (short) 100);
        boolean boolean13 = parser12.isTrackErrors();
        boolean boolean14 = parser12.isTrackErrors();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNull(parseSettings5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNull(parseSettings8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser0.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = parser0.settings();
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser0.settings(parseSettings6);
        org.jsoup.nodes.Document document10 = parser0.parseInput("", "hi!");
        org.jsoup.parser.Parser parser13 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings14 = null;
        org.jsoup.parser.Parser parser15 = parser13.settings(parseSettings14);
        org.jsoup.parser.Parser parser16 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        org.jsoup.parser.Parser parser18 = parser16.settings(parseSettings17);
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        org.jsoup.parser.Parser parser20 = parser16.settings(parseSettings19);
        org.jsoup.parser.Parser parser23 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parse("hi!", "hi!", parser23);
        org.jsoup.parser.ParseSettings parseSettings25 = parser23.settings();
        org.jsoup.parser.Parser parser26 = parser16.settings(parseSettings25);
        org.jsoup.parser.Parser parser27 = parser15.settings(parseSettings25);
        org.jsoup.nodes.Document document28 = org.jsoup.Jsoup.parse("", "", parser27);
        org.jsoup.parser.Parser parser29 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings30 = null;
        org.jsoup.parser.Parser parser31 = parser29.settings(parseSettings30);
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        org.jsoup.parser.Parser parser33 = parser29.settings(parseSettings32);
        org.jsoup.parser.ParseSettings parseSettings34 = parser29.settings();
        org.jsoup.parser.ParseSettings parseSettings35 = null;
        org.jsoup.parser.Parser parser36 = parser29.settings(parseSettings35);
        org.jsoup.nodes.Document document39 = parser29.parseInput("", "hi!");
        org.jsoup.nodes.Document document42 = parser29.parseInput("", "hi!");
        org.jsoup.parser.Parser parser43 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings44 = null;
        org.jsoup.parser.Parser parser45 = parser43.settings(parseSettings44);
        org.jsoup.parser.ParseSettings parseSettings46 = null;
        org.jsoup.parser.Parser parser47 = parser43.settings(parseSettings46);
        org.jsoup.parser.Parser parser50 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document51 = org.jsoup.Jsoup.parse("hi!", "hi!", parser50);
        org.jsoup.parser.ParseSettings parseSettings52 = parser50.settings();
        org.jsoup.parser.Parser parser53 = parser43.settings(parseSettings52);
        org.jsoup.parser.Parser parser54 = parser29.settings(parseSettings52);
        boolean boolean55 = parser29.isTrackErrors();
        org.jsoup.parser.Parser parser56 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings57 = null;
        org.jsoup.parser.Parser parser58 = parser56.settings(parseSettings57);
        org.jsoup.parser.ParseSettings parseSettings59 = null;
        org.jsoup.parser.Parser parser60 = parser56.settings(parseSettings59);
        org.jsoup.parser.ParseSettings parseSettings61 = parser56.settings();
        org.jsoup.parser.ParseSettings parseSettings62 = null;
        org.jsoup.parser.Parser parser63 = parser56.settings(parseSettings62);
        org.jsoup.parser.Parser parser64 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.ParseSettings parseSettings65 = parser64.settings();
        org.jsoup.parser.Parser parser66 = parser56.settings(parseSettings65);
        org.jsoup.parser.Parser parser67 = parser29.settings(parseSettings65);
        org.jsoup.parser.Parser parser68 = parser27.settings(parseSettings65);
        org.jsoup.parser.Parser parser69 = parser0.settings(parseSettings65);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList70 = parser0.getErrors();
        org.jsoup.parser.Parser parser72 = parser0.setTrackErrors((int) '4');
        org.jsoup.parser.Parser parser74 = parser0.setTrackErrors((int) (short) 0);
        org.jsoup.parser.ParseSettings parseSettings75 = parser74.settings();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNull(parseSettings5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNull(parseSettings34);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(parser47);
        org.junit.Assert.assertNotNull(parser50);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(parser53);
        org.junit.Assert.assertNotNull(parser54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(parser56);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertNotNull(parser60);
        org.junit.Assert.assertNull(parseSettings61);
        org.junit.Assert.assertNotNull(parser63);
        org.junit.Assert.assertNotNull(parser64);
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertNotNull(parser66);
        org.junit.Assert.assertNotNull(parser67);
        org.junit.Assert.assertNotNull(parser68);
        org.junit.Assert.assertNotNull(parser69);
        org.junit.Assert.assertNotNull(parseErrorList70);
        org.junit.Assert.assertNotNull(parser72);
        org.junit.Assert.assertNotNull(parser74);
        org.junit.Assert.assertNotNull(parseSettings75);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser2.settings(parseSettings5);
        org.jsoup.parser.Parser parser9 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse("hi!", "hi!", parser9);
        org.jsoup.parser.ParseSettings parseSettings11 = parser9.settings();
        org.jsoup.parser.Parser parser12 = parser2.settings(parseSettings11);
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "hi!", parser12);
        boolean boolean14 = parser12.isTrackErrors();
        boolean boolean15 = parser12.isTrackErrors();
        org.jsoup.nodes.Document document18 = parser12.parseInput("hi!", "");
        java.util.List<org.jsoup.parser.ParseError> parseErrorList19 = parser12.getErrors();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(parseErrorList19);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList1 = parser0.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList2 = parser0.getErrors();
        org.jsoup.parser.ParseSettings parseSettings3 = parser0.settings();
        org.jsoup.parser.ParseSettings parseSettings4 = parser0.settings();
        org.jsoup.parser.Parser parser9 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse("hi!", "hi!", parser9);
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("hi!", "", parser9);
        org.jsoup.nodes.Document document14 = parser9.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings15 = parser9.settings();
        org.jsoup.parser.Parser parser16 = parser0.settings(parseSettings15);
        boolean boolean17 = parser0.isTrackErrors();
        org.jsoup.parser.Parser parser20 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("", "hi!", parser20);
        org.jsoup.parser.Parser parser23 = parser20.setTrackErrors(10);
        org.jsoup.parser.Parser parser25 = parser20.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser27 = parser20.setTrackErrors((int) (short) 1);
        org.jsoup.parser.Parser parser29 = parser20.setTrackErrors(100);
        org.jsoup.parser.Parser parser31 = parser20.setTrackErrors(100);
        org.jsoup.parser.ParseSettings parseSettings32 = parser31.settings();
        org.jsoup.parser.Parser parser34 = parser31.setTrackErrors((int) '4');
        org.jsoup.nodes.Document document37 = parser31.parseInput("", "");
        org.jsoup.parser.ParseSettings parseSettings38 = parser31.settings();
        org.jsoup.parser.Parser parser39 = parser0.settings(parseSettings38);
        org.jsoup.parser.Parser parser41 = parser0.setTrackErrors((int) ' ');
        org.jsoup.parser.ParseSettings parseSettings42 = parser0.settings();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNull(parseErrorList1);
        org.junit.Assert.assertNull(parseErrorList2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNotNull(parser41);
        org.junit.Assert.assertNotNull(parseSettings42);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList1 = parser0.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList2 = parser0.getErrors();
        org.jsoup.parser.ParseSettings parseSettings3 = parser0.settings();
        org.jsoup.parser.ParseSettings parseSettings4 = parser0.settings();
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList6 = parser5.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList7 = parser5.getErrors();
        org.jsoup.parser.ParseSettings parseSettings8 = parser5.settings();
        org.jsoup.parser.Parser parser9 = parser0.settings(parseSettings8);
        org.jsoup.parser.Parser parser18 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parse("hi!", "hi!", parser18);
        org.jsoup.nodes.Document document20 = org.jsoup.Jsoup.parse("hi!", "", parser18);
        org.jsoup.nodes.Document document23 = parser18.parseInput("", "hi!");
        java.util.List<org.jsoup.parser.ParseError> parseErrorList24 = parser18.getErrors();
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parse("hi!", "", parser18);
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parse("", "hi!", parser18);
        boolean boolean27 = parser18.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings28 = parser18.settings();
        org.jsoup.parser.Parser parser29 = parser9.settings(parseSettings28);
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNull(parseErrorList1);
        org.junit.Assert.assertNull(parseErrorList2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNull(parseErrorList6);
        org.junit.Assert.assertNull(parseErrorList7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(parseErrorList24);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNotNull(parser29);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = null;
        org.jsoup.parser.Parser parser8 = parser4.settings(parseSettings7);
        org.jsoup.parser.ParseSettings parseSettings9 = parser4.settings();
        org.jsoup.parser.ParseSettings parseSettings10 = null;
        org.jsoup.parser.Parser parser11 = parser4.settings(parseSettings10);
        org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.ParseSettings parseSettings13 = parser12.settings();
        org.jsoup.parser.Parser parser14 = parser4.settings(parseSettings13);
        boolean boolean15 = parser14.isTrackErrors();
        boolean boolean16 = parser14.isTrackErrors();
        org.jsoup.nodes.Document document19 = parser14.parseInput("hi!", "hi!");
        org.jsoup.nodes.Document document20 = org.jsoup.Jsoup.parse("", "hi!", parser14);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = org.jsoup.parser.Parser.parseFragment("hi!", (org.jsoup.nodes.Element) document20, "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = org.jsoup.parser.Parser.parseFragment("hi!", (org.jsoup.nodes.Element) document20, "hi!");
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNull(parseSettings9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.nodes.Document document7 = parser4.parseInput("", "hi!");
        org.jsoup.parser.Parser parser10 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("hi!", "hi!", parser10);
        org.jsoup.parser.ParseSettings parseSettings12 = parser10.settings();
        org.jsoup.parser.Parser parser13 = parser4.settings(parseSettings12);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList14 = parser13.getErrors();
        org.jsoup.parser.Parser parser15 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings16 = parser15.settings();
        org.jsoup.parser.Parser parser17 = parser13.settings(parseSettings16);
        org.jsoup.parser.ParseSettings parseSettings18 = parser13.settings();
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parse("", "hi!", parser13);
        org.jsoup.parser.Parser parser20 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        org.jsoup.parser.Parser parser22 = parser20.settings(parseSettings21);
        org.jsoup.parser.ParseSettings parseSettings23 = null;
        org.jsoup.parser.Parser parser24 = parser20.settings(parseSettings23);
        org.jsoup.parser.Parser parser25 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        org.jsoup.parser.Parser parser27 = parser25.settings(parseSettings26);
        org.jsoup.nodes.Document document30 = parser27.parseInput("", "hi!");
        org.jsoup.parser.Parser parser33 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document34 = org.jsoup.Jsoup.parse("hi!", "hi!", parser33);
        org.jsoup.parser.ParseSettings parseSettings35 = parser33.settings();
        org.jsoup.parser.Parser parser36 = parser27.settings(parseSettings35);
        org.jsoup.parser.Parser parser37 = parser24.settings(parseSettings35);
        boolean boolean38 = parser24.isTrackErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList39 = parser24.getErrors();
        org.jsoup.parser.Parser parser42 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document43 = org.jsoup.Jsoup.parse("hi!", "hi!", parser42);
        org.jsoup.parser.Parser parser44 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings45 = null;
        org.jsoup.parser.Parser parser46 = parser44.settings(parseSettings45);
        org.jsoup.nodes.Document document49 = parser46.parseInput("", "hi!");
        org.jsoup.parser.Parser parser52 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document53 = org.jsoup.Jsoup.parse("hi!", "hi!", parser52);
        org.jsoup.parser.ParseSettings parseSettings54 = parser52.settings();
        org.jsoup.parser.Parser parser55 = parser46.settings(parseSettings54);
        org.jsoup.parser.Parser parser56 = parser42.settings(parseSettings54);
        boolean boolean57 = parser42.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings58 = parser42.settings();
        org.jsoup.parser.Parser parser59 = parser24.settings(parseSettings58);
        org.jsoup.parser.Parser parser60 = parser13.settings(parseSettings58);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parseErrorList14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(parseErrorList39);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertNotNull(parser52);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(parser55);
        org.junit.Assert.assertNotNull(parser56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNotNull(parser59);
        org.junit.Assert.assertNotNull(parser60);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.jsoup.parser.Parser parser1 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings2 = null;
        org.jsoup.parser.Parser parser3 = parser1.settings(parseSettings2);
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        org.jsoup.parser.Parser parser5 = parser1.settings(parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = parser1.settings();
        org.jsoup.parser.ParseSettings parseSettings7 = null;
        org.jsoup.parser.Parser parser8 = parser1.settings(parseSettings7);
        org.jsoup.parser.Parser parser9 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.ParseSettings parseSettings10 = parser9.settings();
        org.jsoup.parser.Parser parser11 = parser1.settings(parseSettings10);
        org.jsoup.nodes.Document document14 = parser1.parseInput("hi!", "hi!");
        java.util.List<org.jsoup.parser.ParseError> parseErrorList15 = parser1.getErrors();
        org.jsoup.nodes.Document document18 = parser1.parseInput("hi!", "hi!");
        org.jsoup.nodes.Document document21 = parser1.parseInput("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = org.jsoup.parser.Parser.parseFragment("hi!", (org.jsoup.nodes.Element) document21, "");
        org.junit.Assert.assertNotNull(parser1);
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNull(parseSettings6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(parseErrorList15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(nodeList23);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("hi!", "", parser4);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList6 = parser4.getErrors();
        boolean boolean7 = parser4.isTrackErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList8 = parser4.getErrors();
        org.jsoup.nodes.Document document11 = parser4.parseInput("", "");
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("hi!", "hi!", parser14);
        org.jsoup.parser.Parser parser16 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        org.jsoup.parser.Parser parser18 = parser16.settings(parseSettings17);
        org.jsoup.nodes.Document document21 = parser18.parseInput("", "hi!");
        org.jsoup.parser.Parser parser24 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document25 = org.jsoup.Jsoup.parse("hi!", "hi!", parser24);
        org.jsoup.parser.ParseSettings parseSettings26 = parser24.settings();
        org.jsoup.parser.Parser parser27 = parser18.settings(parseSettings26);
        org.jsoup.parser.Parser parser28 = parser14.settings(parseSettings26);
        org.jsoup.parser.Parser parser30 = parser14.setTrackErrors((int) ' ');
        org.jsoup.nodes.Document document33 = parser14.parseInput("", "hi!");
        org.jsoup.nodes.Document document36 = parser14.parseInput("hi!", "hi!");
        boolean boolean37 = parser14.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings38 = parser14.settings();
        org.jsoup.parser.Parser parser39 = parser4.settings(parseSettings38);
        org.jsoup.nodes.Document document42 = parser39.parseInput("hi!", "");
        org.jsoup.parser.Parser parser44 = parser39.setTrackErrors((int) (short) 0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(parseErrorList8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(parser44);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser7 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser7.settings(parseSettings8);
        org.jsoup.parser.ParseSettings parseSettings10 = null;
        org.jsoup.parser.Parser parser11 = parser7.settings(parseSettings10);
        org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        org.jsoup.parser.Parser parser14 = parser12.settings(parseSettings13);
        org.jsoup.nodes.Document document17 = parser14.parseInput("", "hi!");
        org.jsoup.parser.Parser parser20 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("hi!", "hi!", parser20);
        org.jsoup.parser.ParseSettings parseSettings22 = parser20.settings();
        org.jsoup.parser.Parser parser23 = parser14.settings(parseSettings22);
        org.jsoup.parser.Parser parser24 = parser11.settings(parseSettings22);
        org.jsoup.parser.Parser parser26 = parser24.setTrackErrors((-1));
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parse("hi!", "", parser26);
        org.jsoup.nodes.Document document28 = org.jsoup.Jsoup.parse("", "hi!", parser26);
        org.jsoup.parser.Parser parser29 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings30 = null;
        org.jsoup.parser.Parser parser31 = parser29.settings(parseSettings30);
        org.jsoup.nodes.Document document34 = parser31.parseInput("", "hi!");
        org.jsoup.parser.Parser parser36 = parser31.setTrackErrors((int) (byte) 1);
        org.jsoup.parser.ParseSettings parseSettings37 = parser36.settings();
        org.jsoup.parser.Parser parser38 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings39 = null;
        org.jsoup.parser.Parser parser40 = parser38.settings(parseSettings39);
        org.jsoup.parser.ParseSettings parseSettings41 = null;
        org.jsoup.parser.Parser parser42 = parser38.settings(parseSettings41);
        org.jsoup.parser.ParseSettings parseSettings43 = parser38.settings();
        org.jsoup.parser.ParseSettings parseSettings44 = null;
        org.jsoup.parser.Parser parser45 = parser38.settings(parseSettings44);
        org.jsoup.nodes.Document document48 = parser38.parseInput("", "hi!");
        org.jsoup.nodes.Document document51 = parser38.parseInput("", "hi!");
        org.jsoup.parser.Parser parser52 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings53 = null;
        org.jsoup.parser.Parser parser54 = parser52.settings(parseSettings53);
        org.jsoup.parser.ParseSettings parseSettings55 = null;
        org.jsoup.parser.Parser parser56 = parser52.settings(parseSettings55);
        org.jsoup.parser.Parser parser57 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings58 = null;
        org.jsoup.parser.Parser parser59 = parser57.settings(parseSettings58);
        org.jsoup.nodes.Document document62 = parser59.parseInput("", "hi!");
        org.jsoup.parser.Parser parser65 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document66 = org.jsoup.Jsoup.parse("hi!", "hi!", parser65);
        org.jsoup.parser.ParseSettings parseSettings67 = parser65.settings();
        org.jsoup.parser.Parser parser68 = parser59.settings(parseSettings67);
        org.jsoup.parser.Parser parser69 = parser56.settings(parseSettings67);
        org.jsoup.parser.ParseSettings parseSettings70 = parser56.settings();
        org.jsoup.parser.Parser parser71 = parser38.settings(parseSettings70);
        org.jsoup.parser.Parser parser72 = parser36.settings(parseSettings70);
        org.jsoup.parser.ParseSettings parseSettings73 = parser72.settings();
        org.jsoup.parser.Parser parser74 = parser26.settings(parseSettings73);
        org.jsoup.nodes.Document document77 = parser74.parseInput("", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document78 = org.jsoup.Jsoup.parse(inputStream0, "", "hi!", parser74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNull(parseSettings37);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNull(parseSettings43);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNotNull(parser52);
        org.junit.Assert.assertNotNull(parser54);
        org.junit.Assert.assertNotNull(parser56);
        org.junit.Assert.assertNotNull(parser57);
        org.junit.Assert.assertNotNull(parser59);
        org.junit.Assert.assertNotNull(document62);
        org.junit.Assert.assertNotNull(parser65);
        org.junit.Assert.assertNotNull(document66);
        org.junit.Assert.assertNotNull(parseSettings67);
        org.junit.Assert.assertNotNull(parser68);
        org.junit.Assert.assertNotNull(parser69);
        org.junit.Assert.assertNotNull(parseSettings70);
        org.junit.Assert.assertNotNull(parser71);
        org.junit.Assert.assertNotNull(parser72);
        org.junit.Assert.assertNotNull(parseSettings73);
        org.junit.Assert.assertNotNull(parser74);
        org.junit.Assert.assertNotNull(document77);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        org.jsoup.parser.Parser parser5 = parser3.settings(parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser3.settings(parseSettings6);
        org.jsoup.parser.Parser parser10 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("hi!", "hi!", parser10);
        org.jsoup.parser.ParseSettings parseSettings12 = parser10.settings();
        org.jsoup.parser.Parser parser13 = parser3.settings(parseSettings12);
        org.jsoup.parser.Parser parser14 = parser2.settings(parseSettings12);
        org.jsoup.parser.Parser parser15 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings16 = null;
        org.jsoup.parser.Parser parser17 = parser15.settings(parseSettings16);
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        org.jsoup.parser.Parser parser19 = parser15.settings(parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = parser15.settings();
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        org.jsoup.parser.Parser parser22 = parser15.settings(parseSettings21);
        org.jsoup.nodes.Document document25 = parser15.parseInput("", "hi!");
        org.jsoup.nodes.Document document28 = parser15.parseInput("", "hi!");
        org.jsoup.parser.Parser parser29 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings30 = null;
        org.jsoup.parser.Parser parser31 = parser29.settings(parseSettings30);
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        org.jsoup.parser.Parser parser33 = parser29.settings(parseSettings32);
        org.jsoup.parser.Parser parser34 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings35 = null;
        org.jsoup.parser.Parser parser36 = parser34.settings(parseSettings35);
        org.jsoup.nodes.Document document39 = parser36.parseInput("", "hi!");
        org.jsoup.parser.Parser parser42 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document43 = org.jsoup.Jsoup.parse("hi!", "hi!", parser42);
        org.jsoup.parser.ParseSettings parseSettings44 = parser42.settings();
        org.jsoup.parser.Parser parser45 = parser36.settings(parseSettings44);
        org.jsoup.parser.Parser parser46 = parser33.settings(parseSettings44);
        org.jsoup.parser.ParseSettings parseSettings47 = parser33.settings();
        org.jsoup.parser.Parser parser48 = parser15.settings(parseSettings47);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList49 = parser48.getErrors();
        org.jsoup.parser.Parser parser50 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings51 = null;
        org.jsoup.parser.Parser parser52 = parser50.settings(parseSettings51);
        org.jsoup.nodes.Document document55 = parser52.parseInput("", "hi!");
        org.jsoup.parser.Parser parser58 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document59 = org.jsoup.Jsoup.parse("hi!", "hi!", parser58);
        org.jsoup.parser.ParseSettings parseSettings60 = parser58.settings();
        org.jsoup.parser.Parser parser61 = parser52.settings(parseSettings60);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList62 = parser61.getErrors();
        org.jsoup.parser.Parser parser63 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings64 = parser63.settings();
        org.jsoup.parser.Parser parser65 = parser61.settings(parseSettings64);
        org.jsoup.parser.Parser parser66 = parser48.settings(parseSettings64);
        org.jsoup.parser.ParseSettings parseSettings67 = parser66.settings();
        org.jsoup.parser.Parser parser68 = parser2.settings(parseSettings67);
        org.jsoup.parser.Parser parser70 = parser2.setTrackErrors(0);
        org.jsoup.nodes.Document document73 = parser2.parseInput("", "hi!");
        org.jsoup.nodes.Document document76 = parser2.parseInput("hi!", "");
        org.jsoup.parser.Parser parser78 = parser2.setTrackErrors((int) (short) 1);
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNull(parseSettings20);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(parser48);
        org.junit.Assert.assertNotNull(parseErrorList49);
        org.junit.Assert.assertNotNull(parser50);
        org.junit.Assert.assertNotNull(parser52);
        org.junit.Assert.assertNotNull(document55);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertNotNull(document59);
        org.junit.Assert.assertNotNull(parseSettings60);
        org.junit.Assert.assertNotNull(parser61);
        org.junit.Assert.assertNotNull(parseErrorList62);
        org.junit.Assert.assertNotNull(parser63);
        org.junit.Assert.assertNotNull(parseSettings64);
        org.junit.Assert.assertNotNull(parser65);
        org.junit.Assert.assertNotNull(parser66);
        org.junit.Assert.assertNotNull(parseSettings67);
        org.junit.Assert.assertNotNull(parser68);
        org.junit.Assert.assertNotNull(parser70);
        org.junit.Assert.assertNotNull(document73);
        org.junit.Assert.assertNotNull(document76);
        org.junit.Assert.assertNotNull(parser78);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        org.jsoup.parser.Parser parser5 = parser3.settings(parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser3.settings(parseSettings6);
        org.jsoup.parser.ParseSettings parseSettings8 = parser3.settings();
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        org.jsoup.parser.Parser parser10 = parser3.settings(parseSettings9);
        boolean boolean11 = parser3.isTrackErrors();
        org.jsoup.nodes.Document document14 = parser3.parseInput("", "");
        org.jsoup.nodes.Document document17 = parser3.parseInput("", "hi!");
        org.jsoup.nodes.Document document20 = parser3.parseInput("", "");
        boolean boolean21 = parser3.isTrackErrors();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document22 = org.jsoup.Jsoup.parse(inputStream0, "", "hi!", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNull(parseSettings8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser0.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = parser0.settings();
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings7 = null;
        org.jsoup.parser.Parser parser8 = parser6.settings(parseSettings7);
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        org.jsoup.parser.Parser parser10 = parser6.settings(parseSettings9);
        org.jsoup.parser.Parser parser11 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings12 = null;
        org.jsoup.parser.Parser parser13 = parser11.settings(parseSettings12);
        org.jsoup.nodes.Document document16 = parser13.parseInput("", "hi!");
        org.jsoup.parser.Parser parser19 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document20 = org.jsoup.Jsoup.parse("hi!", "hi!", parser19);
        org.jsoup.parser.ParseSettings parseSettings21 = parser19.settings();
        org.jsoup.parser.Parser parser22 = parser13.settings(parseSettings21);
        org.jsoup.parser.Parser parser23 = parser10.settings(parseSettings21);
        org.jsoup.parser.ParseSettings parseSettings24 = parser10.settings();
        org.jsoup.parser.Parser parser25 = parser0.settings(parseSettings24);
        org.jsoup.parser.Parser parser27 = parser25.setTrackErrors((int) ' ');
        java.util.List<org.jsoup.parser.ParseError> parseErrorList28 = parser25.getErrors();
        org.jsoup.parser.Parser parser31 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document32 = org.jsoup.Jsoup.parse("hi!", "hi!", parser31);
        org.jsoup.parser.Parser parser33 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings34 = null;
        org.jsoup.parser.Parser parser35 = parser33.settings(parseSettings34);
        org.jsoup.parser.ParseSettings parseSettings36 = null;
        org.jsoup.parser.Parser parser37 = parser33.settings(parseSettings36);
        org.jsoup.parser.Parser parser40 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document41 = org.jsoup.Jsoup.parse("hi!", "hi!", parser40);
        org.jsoup.parser.ParseSettings parseSettings42 = parser40.settings();
        org.jsoup.parser.Parser parser43 = parser33.settings(parseSettings42);
        org.jsoup.parser.ParseSettings parseSettings44 = parser33.settings();
        org.jsoup.parser.Parser parser45 = parser31.settings(parseSettings44);
        org.jsoup.parser.Parser parser46 = parser25.settings(parseSettings44);
        org.jsoup.parser.ParseSettings parseSettings47 = parser46.settings();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNull(parseSettings5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNull(parseErrorList28);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(parseSettings47);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("hi!", "hi!", parser2);
        org.jsoup.parser.ParseSettings parseSettings4 = parser2.settings();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList5 = parser2.getErrors();
        org.jsoup.parser.Parser parser7 = parser2.setTrackErrors((int) (byte) 100);
        org.jsoup.parser.Parser parser10 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("hi!", "hi!", parser10);
        org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        org.jsoup.parser.Parser parser14 = parser12.settings(parseSettings13);
        org.jsoup.nodes.Document document17 = parser14.parseInput("", "hi!");
        org.jsoup.parser.Parser parser20 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("hi!", "hi!", parser20);
        org.jsoup.parser.ParseSettings parseSettings22 = parser20.settings();
        org.jsoup.parser.Parser parser23 = parser14.settings(parseSettings22);
        org.jsoup.parser.Parser parser24 = parser10.settings(parseSettings22);
        org.jsoup.parser.Parser parser26 = parser10.setTrackErrors((int) ' ');
        org.jsoup.parser.Parser parser29 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document30 = org.jsoup.Jsoup.parse("hi!", "hi!", parser29);
        org.jsoup.parser.ParseSettings parseSettings31 = parser29.settings();
        org.jsoup.parser.Parser parser32 = parser26.settings(parseSettings31);
        org.jsoup.parser.Parser parser33 = parser2.settings(parseSettings31);
        boolean boolean34 = parser2.isTrackErrors();
        org.jsoup.nodes.Document document37 = parser2.parseInput("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings38 = parser2.settings();
        org.jsoup.parser.Parser parser40 = parser2.setTrackErrors(10);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertNotNull(parseErrorList5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(parser40);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.nodes.Document document5 = parser2.parseInput("", "hi!");
        boolean boolean6 = parser2.isTrackErrors();
        org.jsoup.parser.Parser parser8 = parser2.setTrackErrors((int) (short) 1);
        org.jsoup.parser.Parser parser10 = parser8.setTrackErrors((int) (byte) 100);
        org.jsoup.parser.Parser parser12 = parser10.setTrackErrors((int) ' ');
        java.util.List<org.jsoup.parser.ParseError> parseErrorList13 = parser10.getErrors();
        org.jsoup.parser.Parser parser18 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        org.jsoup.parser.Parser parser20 = parser18.settings(parseSettings19);
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("hi!", "", parser20);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList22 = parser20.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList23 = parser20.getErrors();
        org.jsoup.nodes.Document document26 = parser20.parseInput("hi!", "");
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parse("hi!", "", parser20);
        org.jsoup.parser.Parser parser29 = parser20.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser32 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        org.jsoup.parser.Parser parser34 = parser32.settings(parseSettings33);
        org.jsoup.nodes.Document document37 = parser34.parseInput("", "hi!");
        org.jsoup.parser.Parser parser40 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document41 = org.jsoup.Jsoup.parse("hi!", "hi!", parser40);
        org.jsoup.parser.ParseSettings parseSettings42 = parser40.settings();
        org.jsoup.parser.Parser parser43 = parser34.settings(parseSettings42);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList44 = parser43.getErrors();
        org.jsoup.nodes.Document document47 = parser43.parseInput("hi!", "hi!");
        org.jsoup.parser.Parser parser49 = parser43.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document50 = org.jsoup.Jsoup.parse("", "", parser43);
        org.jsoup.parser.Parser parser53 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document54 = org.jsoup.Jsoup.parse("", "hi!", parser53);
        org.jsoup.parser.Parser parser56 = parser53.setTrackErrors(10);
        org.jsoup.parser.Parser parser58 = parser56.setTrackErrors(10);
        boolean boolean59 = parser56.isTrackErrors();
        org.jsoup.parser.Parser parser60 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings61 = null;
        org.jsoup.parser.Parser parser62 = parser60.settings(parseSettings61);
        org.jsoup.parser.ParseSettings parseSettings63 = null;
        org.jsoup.parser.Parser parser64 = parser60.settings(parseSettings63);
        org.jsoup.parser.Parser parser67 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document68 = org.jsoup.Jsoup.parse("hi!", "hi!", parser67);
        org.jsoup.parser.ParseSettings parseSettings69 = parser67.settings();
        org.jsoup.parser.Parser parser70 = parser60.settings(parseSettings69);
        boolean boolean71 = parser60.isTrackErrors();
        org.jsoup.parser.Parser parser74 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings75 = null;
        org.jsoup.parser.Parser parser76 = parser74.settings(parseSettings75);
        org.jsoup.parser.Parser parser77 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings78 = null;
        org.jsoup.parser.Parser parser79 = parser77.settings(parseSettings78);
        org.jsoup.parser.ParseSettings parseSettings80 = null;
        org.jsoup.parser.Parser parser81 = parser77.settings(parseSettings80);
        org.jsoup.parser.Parser parser84 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document85 = org.jsoup.Jsoup.parse("hi!", "hi!", parser84);
        org.jsoup.parser.ParseSettings parseSettings86 = parser84.settings();
        org.jsoup.parser.Parser parser87 = parser77.settings(parseSettings86);
        org.jsoup.parser.Parser parser88 = parser76.settings(parseSettings86);
        org.jsoup.nodes.Document document89 = org.jsoup.Jsoup.parse("", "", parser88);
        org.jsoup.parser.ParseSettings parseSettings90 = parser88.settings();
        org.jsoup.parser.Parser parser91 = parser60.settings(parseSettings90);
        org.jsoup.parser.Parser parser92 = parser56.settings(parseSettings90);
        org.jsoup.parser.Parser parser93 = parser43.settings(parseSettings90);
        org.jsoup.parser.Parser parser94 = parser29.settings(parseSettings90);
        org.jsoup.parser.Parser parser95 = parser10.settings(parseSettings90);
        org.jsoup.nodes.Document document98 = parser95.parseInput("hi!", "hi!");
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parseErrorList13);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(parseErrorList22);
        org.junit.Assert.assertNotNull(parseErrorList23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(parseErrorList44);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(parser53);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNotNull(parser56);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(parser60);
        org.junit.Assert.assertNotNull(parser62);
        org.junit.Assert.assertNotNull(parser64);
        org.junit.Assert.assertNotNull(parser67);
        org.junit.Assert.assertNotNull(document68);
        org.junit.Assert.assertNotNull(parseSettings69);
        org.junit.Assert.assertNotNull(parser70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(parser74);
        org.junit.Assert.assertNotNull(parser76);
        org.junit.Assert.assertNotNull(parser77);
        org.junit.Assert.assertNotNull(parser79);
        org.junit.Assert.assertNotNull(parser81);
        org.junit.Assert.assertNotNull(parser84);
        org.junit.Assert.assertNotNull(document85);
        org.junit.Assert.assertNotNull(parseSettings86);
        org.junit.Assert.assertNotNull(parser87);
        org.junit.Assert.assertNotNull(parser88);
        org.junit.Assert.assertNotNull(document89);
        org.junit.Assert.assertNotNull(parseSettings90);
        org.junit.Assert.assertNotNull(parser91);
        org.junit.Assert.assertNotNull(parser92);
        org.junit.Assert.assertNotNull(parser93);
        org.junit.Assert.assertNotNull(parser94);
        org.junit.Assert.assertNotNull(parser95);
        org.junit.Assert.assertNotNull(document98);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser0.settings(parseSettings3);
        org.jsoup.nodes.Document document7 = parser4.parseInput("", "");
        org.jsoup.parser.ParseSettings parseSettings8 = parser4.settings();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNull(parseSettings8);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.parser.Parser parser7 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parse("hi!", "hi!", parser7);
        org.jsoup.parser.Parser parser9 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings10 = null;
        org.jsoup.parser.Parser parser11 = parser9.settings(parseSettings10);
        org.jsoup.nodes.Document document14 = parser11.parseInput("", "hi!");
        org.jsoup.parser.Parser parser17 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parse("hi!", "hi!", parser17);
        org.jsoup.parser.ParseSettings parseSettings19 = parser17.settings();
        org.jsoup.parser.Parser parser20 = parser11.settings(parseSettings19);
        org.jsoup.parser.Parser parser21 = parser7.settings(parseSettings19);
        org.jsoup.parser.Parser parser22 = parser2.settings(parseSettings19);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList23 = parser2.getErrors();
        org.jsoup.parser.Parser parser25 = parser2.setTrackErrors((int) '#');
        boolean boolean26 = parser25.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings27 = parser25.settings();
        org.jsoup.nodes.Document document28 = org.jsoup.Jsoup.parse("", "", parser25);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNull(parseErrorList23);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertNotNull(document28);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("hi!", "hi!", parser4);
        org.jsoup.parser.ParseSettings parseSettings6 = parser4.settings();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("hi!", "hi!", parser4);
        org.jsoup.nodes.Document document10 = parser4.parseInput("", "");
        boolean boolean11 = parser4.isTrackErrors();
        org.jsoup.parser.Parser parser13 = parser4.setTrackErrors((int) (byte) 0);
        org.jsoup.parser.Parser parser16 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parse("hi!", "hi!", parser16);
        org.jsoup.parser.Parser parser18 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        org.jsoup.parser.Parser parser20 = parser18.settings(parseSettings19);
        org.jsoup.nodes.Document document23 = parser20.parseInput("", "hi!");
        org.jsoup.parser.Parser parser26 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parse("hi!", "hi!", parser26);
        org.jsoup.parser.ParseSettings parseSettings28 = parser26.settings();
        org.jsoup.parser.Parser parser29 = parser20.settings(parseSettings28);
        org.jsoup.parser.Parser parser30 = parser16.settings(parseSettings28);
        org.jsoup.nodes.Document document33 = parser30.parseInput("", "");
        org.jsoup.parser.ParseSettings parseSettings34 = parser30.settings();
        boolean boolean35 = parser30.isTrackErrors();
        org.jsoup.parser.Parser parser40 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document41 = org.jsoup.Jsoup.parse("hi!", "hi!", parser40);
        org.jsoup.parser.Parser parser42 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings43 = null;
        org.jsoup.parser.Parser parser44 = parser42.settings(parseSettings43);
        org.jsoup.nodes.Document document47 = parser44.parseInput("", "hi!");
        org.jsoup.parser.Parser parser50 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document51 = org.jsoup.Jsoup.parse("hi!", "hi!", parser50);
        org.jsoup.parser.ParseSettings parseSettings52 = parser50.settings();
        org.jsoup.parser.Parser parser53 = parser44.settings(parseSettings52);
        org.jsoup.parser.Parser parser54 = parser40.settings(parseSettings52);
        org.jsoup.nodes.Document document57 = parser54.parseInput("", "");
        org.jsoup.nodes.Document document58 = org.jsoup.Jsoup.parse("", "hi!", parser54);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList59 = parser54.getErrors();
        org.jsoup.parser.ParseSettings parseSettings60 = parser54.settings();
        org.jsoup.parser.Parser parser61 = parser30.settings(parseSettings60);
        org.jsoup.parser.Parser parser62 = parser4.settings(parseSettings60);
        boolean boolean63 = parser4.isTrackErrors();
        boolean boolean64 = parser4.isTrackErrors();
        org.jsoup.parser.Parser parser66 = parser4.setTrackErrors((int) (short) 10);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList67 = parser66.getErrors();
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(parseSettings34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(parser50);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(parser53);
        org.junit.Assert.assertNotNull(parser54);
        org.junit.Assert.assertNotNull(document57);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertNotNull(parseErrorList59);
        org.junit.Assert.assertNotNull(parseSettings60);
        org.junit.Assert.assertNotNull(parser61);
        org.junit.Assert.assertNotNull(parser62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(parser66);
        org.junit.Assert.assertNotNull(parseErrorList67);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("hi!", "hi!", parser2);
        org.jsoup.parser.ParseSettings parseSettings4 = parser2.settings();
        org.jsoup.parser.Parser parser6 = parser2.setTrackErrors(10);
        java.lang.Class<?> wildcardClass7 = parser6.getClass();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser7 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parse("hi!", "hi!", parser7);
        org.jsoup.parser.Parser parser9 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings10 = null;
        org.jsoup.parser.Parser parser11 = parser9.settings(parseSettings10);
        org.jsoup.nodes.Document document14 = parser11.parseInput("", "hi!");
        org.jsoup.parser.Parser parser17 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parse("hi!", "hi!", parser17);
        org.jsoup.parser.ParseSettings parseSettings19 = parser17.settings();
        org.jsoup.parser.Parser parser20 = parser11.settings(parseSettings19);
        org.jsoup.parser.Parser parser21 = parser7.settings(parseSettings19);
        org.jsoup.parser.Parser parser23 = parser7.setTrackErrors((int) ' ');
        boolean boolean24 = parser23.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings25 = parser23.settings();
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parse("", "", parser23);
        org.jsoup.nodes.Document document29 = parser23.parseInput("hi!", "hi!");
        org.jsoup.parser.Parser parser31 = parser23.setTrackErrors((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document32 = org.jsoup.Jsoup.parse(inputStream0, "", "", parser23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(parser31);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        org.jsoup.nodes.Document document4 = org.jsoup.parser.Parser.parse("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList6 = org.jsoup.parser.Parser.parseFragment("", (org.jsoup.nodes.Element) document4, "");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = org.jsoup.parser.Parser.parseFragment("", (org.jsoup.nodes.Element) document4, "hi!");
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser5.settings(parseSettings6);
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parse("hi!", "", parser7);
        org.jsoup.parser.Parser parser10 = parser7.setTrackErrors((int) 'a');
        org.jsoup.parser.Parser parser13 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings14 = null;
        org.jsoup.parser.Parser parser15 = parser13.settings(parseSettings14);
        org.jsoup.parser.ParseSettings parseSettings16 = null;
        org.jsoup.parser.Parser parser17 = parser13.settings(parseSettings16);
        org.jsoup.parser.ParseSettings parseSettings18 = parser13.settings();
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        org.jsoup.parser.Parser parser20 = parser13.settings(parseSettings19);
        org.jsoup.nodes.Document document23 = parser13.parseInput("", "hi!");
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parse("hi!", "", parser13);
        org.jsoup.parser.ParseSettings parseSettings25 = parser13.settings();
        org.jsoup.parser.Parser parser26 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList27 = parser26.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList28 = parser26.getErrors();
        org.jsoup.parser.ParseSettings parseSettings29 = parser26.settings();
        org.jsoup.parser.ParseSettings parseSettings30 = parser26.settings();
        org.jsoup.parser.Parser parser31 = parser13.settings(parseSettings30);
        org.jsoup.parser.ParseSettings parseSettings32 = parser13.settings();
        org.jsoup.parser.Parser parser33 = parser10.settings(parseSettings32);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document34 = org.jsoup.Jsoup.parse(inputStream0, "hi!", "", parser33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNull(parseSettings18);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNull(parseSettings25);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNull(parseErrorList27);
        org.junit.Assert.assertNull(parseErrorList28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parser33);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser7 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parse("hi!", "hi!", parser7);
        org.jsoup.parser.ParseSettings parseSettings9 = parser7.settings();
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse("hi!", "hi!", parser7);
        org.jsoup.nodes.Document document13 = parser7.parseInput("", "");
        boolean boolean14 = parser7.isTrackErrors();
        org.jsoup.parser.Parser parser16 = parser7.setTrackErrors((int) (byte) 0);
        org.jsoup.parser.Parser parser19 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document20 = org.jsoup.Jsoup.parse("hi!", "hi!", parser19);
        org.jsoup.parser.Parser parser21 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        org.jsoup.parser.Parser parser23 = parser21.settings(parseSettings22);
        org.jsoup.nodes.Document document26 = parser23.parseInput("", "hi!");
        org.jsoup.parser.Parser parser29 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document30 = org.jsoup.Jsoup.parse("hi!", "hi!", parser29);
        org.jsoup.parser.ParseSettings parseSettings31 = parser29.settings();
        org.jsoup.parser.Parser parser32 = parser23.settings(parseSettings31);
        org.jsoup.parser.Parser parser33 = parser19.settings(parseSettings31);
        org.jsoup.nodes.Document document36 = parser33.parseInput("", "");
        org.jsoup.parser.ParseSettings parseSettings37 = parser33.settings();
        boolean boolean38 = parser33.isTrackErrors();
        org.jsoup.parser.Parser parser43 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document44 = org.jsoup.Jsoup.parse("hi!", "hi!", parser43);
        org.jsoup.parser.Parser parser45 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings46 = null;
        org.jsoup.parser.Parser parser47 = parser45.settings(parseSettings46);
        org.jsoup.nodes.Document document50 = parser47.parseInput("", "hi!");
        org.jsoup.parser.Parser parser53 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document54 = org.jsoup.Jsoup.parse("hi!", "hi!", parser53);
        org.jsoup.parser.ParseSettings parseSettings55 = parser53.settings();
        org.jsoup.parser.Parser parser56 = parser47.settings(parseSettings55);
        org.jsoup.parser.Parser parser57 = parser43.settings(parseSettings55);
        org.jsoup.nodes.Document document60 = parser57.parseInput("", "");
        org.jsoup.nodes.Document document61 = org.jsoup.Jsoup.parse("", "hi!", parser57);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList62 = parser57.getErrors();
        org.jsoup.parser.ParseSettings parseSettings63 = parser57.settings();
        org.jsoup.parser.Parser parser64 = parser33.settings(parseSettings63);
        org.jsoup.parser.Parser parser65 = parser7.settings(parseSettings63);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList66 = parser65.getErrors();
        org.jsoup.parser.ParseSettings parseSettings67 = null;
        org.jsoup.parser.Parser parser68 = parser65.settings(parseSettings67);
        org.jsoup.nodes.Document document71 = parser65.parseInput("hi!", "hi!");
        org.jsoup.parser.Parser parser74 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document75 = org.jsoup.Jsoup.parse("", "hi!", parser74);
        org.jsoup.parser.ParseSettings parseSettings76 = parser74.settings();
        org.jsoup.parser.Parser parser78 = parser74.setTrackErrors((int) (byte) 1);
        org.jsoup.parser.ParseSettings parseSettings79 = parser74.settings();
        org.jsoup.parser.ParseSettings parseSettings80 = parser74.settings();
        org.jsoup.parser.Parser parser81 = parser65.settings(parseSettings80);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document82 = org.jsoup.Jsoup.parse(inputStream0, "", "", parser65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(parseSettings9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(parser47);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(parser53);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNotNull(parseSettings55);
        org.junit.Assert.assertNotNull(parser56);
        org.junit.Assert.assertNotNull(parser57);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNotNull(parseErrorList62);
        org.junit.Assert.assertNotNull(parseSettings63);
        org.junit.Assert.assertNotNull(parser64);
        org.junit.Assert.assertNotNull(parser65);
        org.junit.Assert.assertNotNull(parseErrorList66);
        org.junit.Assert.assertNotNull(parser68);
        org.junit.Assert.assertNotNull(document71);
        org.junit.Assert.assertNotNull(parser74);
        org.junit.Assert.assertNotNull(document75);
        org.junit.Assert.assertNotNull(parseSettings76);
        org.junit.Assert.assertNotNull(parser78);
        org.junit.Assert.assertNotNull(parseSettings79);
        org.junit.Assert.assertNotNull(parseSettings80);
        org.junit.Assert.assertNotNull(parser81);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser4 = parser2.setTrackErrors((int) (byte) 0);
        org.jsoup.parser.Parser parser6 = parser4.setTrackErrors(10);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList7 = parser4.getErrors();
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parse("", "", parser4);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNull(parseErrorList7);
        org.junit.Assert.assertNotNull(document8);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("hi!", "hi!", parser4);
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse("hi!", "", parser4);
        org.jsoup.nodes.Document document9 = parser4.parseInput("", "hi!");
        java.util.List<org.jsoup.parser.ParseError> parseErrorList10 = parser4.getErrors();
        org.jsoup.parser.Parser parser12 = parser4.setTrackErrors((int) (short) 0);
        org.jsoup.parser.ParseSettings parseSettings13 = parser4.settings();
        org.jsoup.parser.Parser parser15 = parser4.setTrackErrors((int) ' ');
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parseErrorList10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(parser15);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parse("hi!", "hi!", parser8);
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse("hi!", "", parser8);
        org.jsoup.nodes.Document document13 = parser8.parseInput("", "hi!");
        boolean boolean14 = parser8.isTrackErrors();
        org.jsoup.parser.Parser parser16 = parser8.setTrackErrors((int) ' ');
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parse("hi!", "", parser8);
        org.jsoup.parser.Parser parser19 = parser8.setTrackErrors((-1));
        java.util.List<org.jsoup.parser.ParseError> parseErrorList20 = parser8.getErrors();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("", "", parser8);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parseErrorList20);
        org.junit.Assert.assertNotNull(document21);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser0.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = parser0.settings();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList6 = parser0.getErrors();
        org.jsoup.parser.Parser parser7 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser7.settings(parseSettings8);
        org.jsoup.nodes.Document document12 = parser9.parseInput("", "hi!");
        org.jsoup.parser.Parser parser15 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parse("hi!", "hi!", parser15);
        org.jsoup.parser.ParseSettings parseSettings17 = parser15.settings();
        org.jsoup.parser.Parser parser18 = parser9.settings(parseSettings17);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList19 = parser18.getErrors();
        org.jsoup.parser.Parser parser20 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings21 = parser20.settings();
        org.jsoup.parser.Parser parser22 = parser18.settings(parseSettings21);
        org.jsoup.parser.Parser parser23 = parser0.settings(parseSettings21);
        org.jsoup.parser.Parser parser25 = parser23.setTrackErrors((int) (short) 0);
        org.jsoup.parser.Parser parser27 = parser25.setTrackErrors(10);
        org.jsoup.parser.Parser parser28 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        org.jsoup.parser.Parser parser30 = parser28.settings(parseSettings29);
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        org.jsoup.parser.Parser parser32 = parser28.settings(parseSettings31);
        org.jsoup.parser.ParseSettings parseSettings33 = parser28.settings();
        org.jsoup.parser.ParseSettings parseSettings34 = null;
        org.jsoup.parser.Parser parser35 = parser28.settings(parseSettings34);
        boolean boolean36 = parser28.isTrackErrors();
        org.jsoup.nodes.Document document39 = parser28.parseInput("", "");
        org.jsoup.parser.ParseSettings parseSettings40 = parser28.settings();
        org.jsoup.parser.Parser parser43 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings44 = null;
        org.jsoup.parser.Parser parser45 = parser43.settings(parseSettings44);
        org.jsoup.nodes.Document document46 = org.jsoup.Jsoup.parse("hi!", "", parser45);
        org.jsoup.parser.ParseSettings parseSettings47 = parser45.settings();
        org.jsoup.nodes.Document document50 = parser45.parseInput("hi!", "hi!");
        org.jsoup.parser.Parser parser53 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings54 = null;
        org.jsoup.parser.Parser parser55 = parser53.settings(parseSettings54);
        org.jsoup.parser.ParseSettings parseSettings56 = null;
        org.jsoup.parser.Parser parser57 = parser53.settings(parseSettings56);
        org.jsoup.parser.ParseSettings parseSettings58 = parser53.settings();
        org.jsoup.parser.ParseSettings parseSettings59 = null;
        org.jsoup.parser.Parser parser60 = parser53.settings(parseSettings59);
        org.jsoup.nodes.Document document63 = parser53.parseInput("", "hi!");
        org.jsoup.nodes.Document document64 = org.jsoup.Jsoup.parse("hi!", "", parser53);
        org.jsoup.parser.ParseSettings parseSettings65 = parser53.settings();
        org.jsoup.parser.Parser parser66 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList67 = parser66.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList68 = parser66.getErrors();
        org.jsoup.parser.ParseSettings parseSettings69 = parser66.settings();
        org.jsoup.parser.ParseSettings parseSettings70 = parser66.settings();
        org.jsoup.parser.Parser parser71 = parser53.settings(parseSettings70);
        org.jsoup.parser.ParseSettings parseSettings72 = parser53.settings();
        org.jsoup.parser.Parser parser75 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings76 = null;
        org.jsoup.parser.Parser parser77 = parser75.settings(parseSettings76);
        org.jsoup.parser.Parser parser78 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings79 = null;
        org.jsoup.parser.Parser parser80 = parser78.settings(parseSettings79);
        org.jsoup.parser.ParseSettings parseSettings81 = null;
        org.jsoup.parser.Parser parser82 = parser78.settings(parseSettings81);
        org.jsoup.parser.Parser parser85 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document86 = org.jsoup.Jsoup.parse("hi!", "hi!", parser85);
        org.jsoup.parser.ParseSettings parseSettings87 = parser85.settings();
        org.jsoup.parser.Parser parser88 = parser78.settings(parseSettings87);
        org.jsoup.parser.Parser parser89 = parser77.settings(parseSettings87);
        org.jsoup.nodes.Document document90 = org.jsoup.Jsoup.parse("", "", parser89);
        org.jsoup.parser.ParseSettings parseSettings91 = parser89.settings();
        org.jsoup.parser.Parser parser92 = parser53.settings(parseSettings91);
        org.jsoup.parser.Parser parser93 = parser45.settings(parseSettings91);
        org.jsoup.parser.Parser parser94 = parser28.settings(parseSettings91);
        org.jsoup.parser.Parser parser95 = parser27.settings(parseSettings91);
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNull(parseSettings5);
        org.junit.Assert.assertNull(parseErrorList6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parseErrorList19);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNull(parseSettings33);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNull(parseSettings40);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNull(parseSettings47);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(parser53);
        org.junit.Assert.assertNotNull(parser55);
        org.junit.Assert.assertNotNull(parser57);
        org.junit.Assert.assertNull(parseSettings58);
        org.junit.Assert.assertNotNull(parser60);
        org.junit.Assert.assertNotNull(document63);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertNull(parseSettings65);
        org.junit.Assert.assertNotNull(parser66);
        org.junit.Assert.assertNull(parseErrorList67);
        org.junit.Assert.assertNull(parseErrorList68);
        org.junit.Assert.assertNotNull(parseSettings69);
        org.junit.Assert.assertNotNull(parseSettings70);
        org.junit.Assert.assertNotNull(parser71);
        org.junit.Assert.assertNotNull(parseSettings72);
        org.junit.Assert.assertNotNull(parser75);
        org.junit.Assert.assertNotNull(parser77);
        org.junit.Assert.assertNotNull(parser78);
        org.junit.Assert.assertNotNull(parser80);
        org.junit.Assert.assertNotNull(parser82);
        org.junit.Assert.assertNotNull(parser85);
        org.junit.Assert.assertNotNull(document86);
        org.junit.Assert.assertNotNull(parseSettings87);
        org.junit.Assert.assertNotNull(parser88);
        org.junit.Assert.assertNotNull(parser89);
        org.junit.Assert.assertNotNull(document90);
        org.junit.Assert.assertNotNull(parseSettings91);
        org.junit.Assert.assertNotNull(parser92);
        org.junit.Assert.assertNotNull(parser93);
        org.junit.Assert.assertNotNull(parser94);
        org.junit.Assert.assertNotNull(parser95);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = null;
        org.jsoup.parser.Parser parser8 = parser4.settings(parseSettings7);
        org.jsoup.nodes.Document document11 = parser4.parseInput("hi!", "");
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parse("", "hi!", parser4);
        org.jsoup.nodes.Document document15 = parser4.parseInput("", "");
        boolean boolean16 = parser4.isTrackErrors();
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parse("", "hi!", parser4);
        boolean boolean18 = parser4.isTrackErrors();
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList3 = parser2.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList4 = parser2.getErrors();
        org.jsoup.parser.ParseSettings parseSettings5 = parser2.settings();
        org.jsoup.parser.ParseSettings parseSettings6 = parser2.settings();
        org.jsoup.nodes.Document document9 = parser2.parseInput("hi!", "");
        boolean boolean10 = parser2.isTrackErrors();
        org.jsoup.nodes.Document document13 = parser2.parseInput("", "");
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings15 = null;
        org.jsoup.parser.Parser parser16 = parser14.settings(parseSettings15);
        org.jsoup.parser.Parser parser18 = parser16.setTrackErrors((int) (short) 100);
        org.jsoup.nodes.Document document21 = parser16.parseInput("", "");
        org.jsoup.parser.Parser parser22 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings23 = null;
        org.jsoup.parser.Parser parser24 = parser22.settings(parseSettings23);
        org.jsoup.nodes.Document document27 = parser24.parseInput("", "hi!");
        org.jsoup.parser.Parser parser30 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document31 = org.jsoup.Jsoup.parse("hi!", "hi!", parser30);
        org.jsoup.parser.ParseSettings parseSettings32 = parser30.settings();
        org.jsoup.parser.Parser parser33 = parser24.settings(parseSettings32);
        boolean boolean34 = parser24.isTrackErrors();
        org.jsoup.parser.Parser parser35 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings36 = null;
        org.jsoup.parser.Parser parser37 = parser35.settings(parseSettings36);
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        org.jsoup.parser.Parser parser39 = parser35.settings(parseSettings38);
        org.jsoup.parser.ParseSettings parseSettings40 = parser35.settings();
        org.jsoup.parser.ParseSettings parseSettings41 = null;
        org.jsoup.parser.Parser parser42 = parser35.settings(parseSettings41);
        org.jsoup.parser.Parser parser43 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.ParseSettings parseSettings44 = parser43.settings();
        org.jsoup.parser.Parser parser45 = parser35.settings(parseSettings44);
        org.jsoup.parser.Parser parser46 = parser24.settings(parseSettings44);
        org.jsoup.parser.Parser parser47 = parser16.settings(parseSettings44);
        org.jsoup.parser.Parser parser48 = parser2.settings(parseSettings44);
        org.jsoup.nodes.Document document49 = org.jsoup.Jsoup.parse("", "hi!", parser48);
        java.lang.Class<?> wildcardClass50 = parser48.getClass();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNull(parseErrorList3);
        org.junit.Assert.assertNull(parseErrorList4);
        org.junit.Assert.assertNotNull(parseSettings5);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNull(parseSettings40);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(parser47);
        org.junit.Assert.assertNotNull(parser48);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList1 = parser0.getErrors();
        org.jsoup.parser.Parser parser3 = parser0.setTrackErrors((int) (byte) 1);
        boolean boolean4 = parser0.isTrackErrors();
        boolean boolean5 = parser0.isTrackErrors();
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        org.jsoup.parser.Parser parser10 = parser8.settings(parseSettings9);
        org.jsoup.parser.Parser parser11 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings12 = null;
        org.jsoup.parser.Parser parser13 = parser11.settings(parseSettings12);
        org.jsoup.parser.ParseSettings parseSettings14 = null;
        org.jsoup.parser.Parser parser15 = parser11.settings(parseSettings14);
        org.jsoup.parser.Parser parser18 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parse("hi!", "hi!", parser18);
        org.jsoup.parser.ParseSettings parseSettings20 = parser18.settings();
        org.jsoup.parser.Parser parser21 = parser11.settings(parseSettings20);
        org.jsoup.parser.Parser parser22 = parser10.settings(parseSettings20);
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parse("", "", parser22);
        org.jsoup.parser.ParseSettings parseSettings24 = parser22.settings();
        org.jsoup.parser.Parser parser27 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document28 = org.jsoup.Jsoup.parse("hi!", "hi!", parser27);
        org.jsoup.parser.ParseSettings parseSettings29 = parser27.settings();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList30 = parser27.getErrors();
        org.jsoup.parser.Parser parser32 = parser27.setTrackErrors((int) (byte) 100);
        org.jsoup.parser.Parser parser35 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document36 = org.jsoup.Jsoup.parse("hi!", "hi!", parser35);
        org.jsoup.parser.Parser parser37 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        org.jsoup.parser.Parser parser39 = parser37.settings(parseSettings38);
        org.jsoup.nodes.Document document42 = parser39.parseInput("", "hi!");
        org.jsoup.parser.Parser parser45 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document46 = org.jsoup.Jsoup.parse("hi!", "hi!", parser45);
        org.jsoup.parser.ParseSettings parseSettings47 = parser45.settings();
        org.jsoup.parser.Parser parser48 = parser39.settings(parseSettings47);
        org.jsoup.parser.Parser parser49 = parser35.settings(parseSettings47);
        org.jsoup.parser.Parser parser51 = parser35.setTrackErrors((int) ' ');
        org.jsoup.parser.Parser parser54 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document55 = org.jsoup.Jsoup.parse("hi!", "hi!", parser54);
        org.jsoup.parser.ParseSettings parseSettings56 = parser54.settings();
        org.jsoup.parser.Parser parser57 = parser51.settings(parseSettings56);
        org.jsoup.parser.Parser parser58 = parser27.settings(parseSettings56);
        org.jsoup.parser.Parser parser59 = parser22.settings(parseSettings56);
        org.jsoup.parser.Parser parser60 = parser0.settings(parseSettings56);
        boolean boolean61 = parser60.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings62 = parser60.settings();
        org.jsoup.parser.ParseSettings parseSettings63 = parser60.settings();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNull(parseErrorList1);
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(parseSettings20);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(parseErrorList30);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(parser48);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertNotNull(parser54);
        org.junit.Assert.assertNotNull(document55);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(parser57);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertNotNull(parser59);
        org.junit.Assert.assertNotNull(parser60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(parseSettings62);
        org.junit.Assert.assertNotNull(parseSettings63);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("hi!", "hi!", parser4);
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings7 = null;
        org.jsoup.parser.Parser parser8 = parser6.settings(parseSettings7);
        org.jsoup.nodes.Document document11 = parser8.parseInput("", "hi!");
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("hi!", "hi!", parser14);
        org.jsoup.parser.ParseSettings parseSettings16 = parser14.settings();
        org.jsoup.parser.Parser parser17 = parser8.settings(parseSettings16);
        org.jsoup.parser.Parser parser18 = parser4.settings(parseSettings16);
        org.jsoup.parser.Parser parser20 = parser4.setTrackErrors((int) ' ');
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("hi!", "", parser4);
        boolean boolean22 = parser4.isTrackErrors();
        boolean boolean23 = parser4.isTrackErrors();
        org.jsoup.parser.Parser parser24 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList25 = parser24.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList26 = parser24.getErrors();
        org.jsoup.parser.Parser parser27 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList28 = parser27.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList29 = parser27.getErrors();
        org.jsoup.parser.ParseSettings parseSettings30 = parser27.settings();
        org.jsoup.parser.ParseSettings parseSettings31 = parser27.settings();
        org.jsoup.parser.Parser parser36 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document37 = org.jsoup.Jsoup.parse("hi!", "hi!", parser36);
        org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parse("hi!", "", parser36);
        org.jsoup.nodes.Document document41 = parser36.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings42 = parser36.settings();
        org.jsoup.parser.Parser parser43 = parser27.settings(parseSettings42);
        org.jsoup.parser.Parser parser44 = parser24.settings(parseSettings42);
        org.jsoup.parser.Parser parser45 = parser4.settings(parseSettings42);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList46 = parser4.getErrors();
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNull(parseErrorList25);
        org.junit.Assert.assertNull(parseErrorList26);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNull(parseErrorList28);
        org.junit.Assert.assertNull(parseErrorList29);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(parseErrorList46);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser0.settings(parseSettings3);
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser5.settings(parseSettings6);
        org.jsoup.nodes.Document document10 = parser7.parseInput("", "hi!");
        org.jsoup.parser.Parser parser13 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parse("hi!", "hi!", parser13);
        org.jsoup.parser.ParseSettings parseSettings15 = parser13.settings();
        org.jsoup.parser.Parser parser16 = parser7.settings(parseSettings15);
        org.jsoup.parser.Parser parser17 = parser4.settings(parseSettings15);
        boolean boolean18 = parser17.isTrackErrors();
        org.jsoup.parser.Parser parser20 = parser17.setTrackErrors(10);
        boolean boolean21 = parser20.isTrackErrors();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.nodes.Document document5 = parser2.parseInput("", "hi!");
        org.jsoup.parser.Parser parser7 = parser2.setTrackErrors(10);
        org.jsoup.parser.Parser parser9 = parser2.setTrackErrors((int) (short) 10);
        org.jsoup.parser.Parser parser10 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings11 = null;
        org.jsoup.parser.Parser parser12 = parser10.settings(parseSettings11);
        org.jsoup.parser.Parser parser13 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings14 = null;
        org.jsoup.parser.Parser parser15 = parser13.settings(parseSettings14);
        org.jsoup.parser.ParseSettings parseSettings16 = null;
        org.jsoup.parser.Parser parser17 = parser13.settings(parseSettings16);
        org.jsoup.parser.Parser parser20 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("hi!", "hi!", parser20);
        org.jsoup.parser.ParseSettings parseSettings22 = parser20.settings();
        org.jsoup.parser.Parser parser23 = parser13.settings(parseSettings22);
        org.jsoup.parser.Parser parser24 = parser12.settings(parseSettings22);
        org.jsoup.parser.Parser parser25 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        org.jsoup.parser.Parser parser27 = parser25.settings(parseSettings26);
        org.jsoup.parser.ParseSettings parseSettings28 = null;
        org.jsoup.parser.Parser parser29 = parser25.settings(parseSettings28);
        org.jsoup.parser.ParseSettings parseSettings30 = parser25.settings();
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        org.jsoup.parser.Parser parser32 = parser25.settings(parseSettings31);
        org.jsoup.nodes.Document document35 = parser25.parseInput("", "hi!");
        org.jsoup.nodes.Document document38 = parser25.parseInput("", "hi!");
        org.jsoup.parser.Parser parser39 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings40 = null;
        org.jsoup.parser.Parser parser41 = parser39.settings(parseSettings40);
        org.jsoup.parser.ParseSettings parseSettings42 = null;
        org.jsoup.parser.Parser parser43 = parser39.settings(parseSettings42);
        org.jsoup.parser.Parser parser44 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings45 = null;
        org.jsoup.parser.Parser parser46 = parser44.settings(parseSettings45);
        org.jsoup.nodes.Document document49 = parser46.parseInput("", "hi!");
        org.jsoup.parser.Parser parser52 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document53 = org.jsoup.Jsoup.parse("hi!", "hi!", parser52);
        org.jsoup.parser.ParseSettings parseSettings54 = parser52.settings();
        org.jsoup.parser.Parser parser55 = parser46.settings(parseSettings54);
        org.jsoup.parser.Parser parser56 = parser43.settings(parseSettings54);
        org.jsoup.parser.ParseSettings parseSettings57 = parser43.settings();
        org.jsoup.parser.Parser parser58 = parser25.settings(parseSettings57);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList59 = parser58.getErrors();
        org.jsoup.parser.Parser parser60 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings61 = null;
        org.jsoup.parser.Parser parser62 = parser60.settings(parseSettings61);
        org.jsoup.nodes.Document document65 = parser62.parseInput("", "hi!");
        org.jsoup.parser.Parser parser68 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document69 = org.jsoup.Jsoup.parse("hi!", "hi!", parser68);
        org.jsoup.parser.ParseSettings parseSettings70 = parser68.settings();
        org.jsoup.parser.Parser parser71 = parser62.settings(parseSettings70);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList72 = parser71.getErrors();
        org.jsoup.parser.Parser parser73 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings74 = parser73.settings();
        org.jsoup.parser.Parser parser75 = parser71.settings(parseSettings74);
        org.jsoup.parser.Parser parser76 = parser58.settings(parseSettings74);
        org.jsoup.parser.ParseSettings parseSettings77 = parser76.settings();
        org.jsoup.parser.Parser parser78 = parser12.settings(parseSettings77);
        org.jsoup.parser.ParseSettings parseSettings79 = parser12.settings();
        org.jsoup.parser.Parser parser80 = parser2.settings(parseSettings79);
        java.lang.Class<?> wildcardClass81 = parseSettings79.getClass();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNull(parseSettings30);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNotNull(parser41);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertNotNull(parser52);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(parser55);
        org.junit.Assert.assertNotNull(parser56);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertNotNull(parseErrorList59);
        org.junit.Assert.assertNotNull(parser60);
        org.junit.Assert.assertNotNull(parser62);
        org.junit.Assert.assertNotNull(document65);
        org.junit.Assert.assertNotNull(parser68);
        org.junit.Assert.assertNotNull(document69);
        org.junit.Assert.assertNotNull(parseSettings70);
        org.junit.Assert.assertNotNull(parser71);
        org.junit.Assert.assertNotNull(parseErrorList72);
        org.junit.Assert.assertNotNull(parser73);
        org.junit.Assert.assertNotNull(parseSettings74);
        org.junit.Assert.assertNotNull(parser75);
        org.junit.Assert.assertNotNull(parser76);
        org.junit.Assert.assertNotNull(parseSettings77);
        org.junit.Assert.assertNotNull(parser78);
        org.junit.Assert.assertNotNull(parseSettings79);
        org.junit.Assert.assertNotNull(parser80);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("hi!", "hi!", parser2);
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.nodes.Document document9 = parser6.parseInput("", "hi!");
        org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "hi!", parser12);
        org.jsoup.parser.ParseSettings parseSettings14 = parser12.settings();
        org.jsoup.parser.Parser parser15 = parser6.settings(parseSettings14);
        org.jsoup.parser.Parser parser16 = parser2.settings(parseSettings14);
        org.jsoup.nodes.Document document19 = parser2.parseInput("", "");
        org.jsoup.parser.Parser parser21 = parser2.setTrackErrors((-1));
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(parser21);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("", "hi!", parser2);
        org.jsoup.parser.Parser parser5 = parser2.setTrackErrors(10);
        org.jsoup.parser.Parser parser7 = parser5.setTrackErrors(10);
        boolean boolean8 = parser5.isTrackErrors();
        org.jsoup.parser.Parser parser9 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings10 = null;
        org.jsoup.parser.Parser parser11 = parser9.settings(parseSettings10);
        org.jsoup.parser.ParseSettings parseSettings12 = null;
        org.jsoup.parser.Parser parser13 = parser9.settings(parseSettings12);
        org.jsoup.parser.Parser parser16 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parse("hi!", "hi!", parser16);
        org.jsoup.parser.ParseSettings parseSettings18 = parser16.settings();
        org.jsoup.parser.Parser parser19 = parser9.settings(parseSettings18);
        boolean boolean20 = parser9.isTrackErrors();
        org.jsoup.parser.Parser parser23 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        org.jsoup.parser.Parser parser25 = parser23.settings(parseSettings24);
        org.jsoup.parser.Parser parser26 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings27 = null;
        org.jsoup.parser.Parser parser28 = parser26.settings(parseSettings27);
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        org.jsoup.parser.Parser parser30 = parser26.settings(parseSettings29);
        org.jsoup.parser.Parser parser33 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document34 = org.jsoup.Jsoup.parse("hi!", "hi!", parser33);
        org.jsoup.parser.ParseSettings parseSettings35 = parser33.settings();
        org.jsoup.parser.Parser parser36 = parser26.settings(parseSettings35);
        org.jsoup.parser.Parser parser37 = parser25.settings(parseSettings35);
        org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parse("", "", parser37);
        org.jsoup.parser.ParseSettings parseSettings39 = parser37.settings();
        org.jsoup.parser.Parser parser40 = parser9.settings(parseSettings39);
        org.jsoup.parser.Parser parser41 = parser5.settings(parseSettings39);
        org.jsoup.nodes.Document document44 = parser41.parseInput("hi!", "hi!");
        org.jsoup.parser.Parser parser46 = parser41.setTrackErrors((int) '4');
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(parseSettings39);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(parser41);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(parser46);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("hi!", "hi!", parser2);
        org.jsoup.parser.ParseSettings parseSettings4 = parser2.settings();
        org.jsoup.parser.Parser parser9 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse("", "hi!", parser9);
        org.jsoup.parser.Parser parser12 = parser9.setTrackErrors(10);
        org.jsoup.parser.Parser parser14 = parser12.setTrackErrors(10);
        boolean boolean15 = parser14.isTrackErrors();
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parse("", "hi!", parser14);
        org.jsoup.parser.ParseSettings parseSettings17 = parser14.settings();
        org.jsoup.parser.Parser parser18 = parser2.settings(parseSettings17);
        org.jsoup.parser.Parser parser20 = parser18.setTrackErrors((int) (byte) 100);
        boolean boolean21 = parser20.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings22 = parser20.settings();
        org.jsoup.nodes.Document document25 = parser20.parseInput("", "");
        boolean boolean26 = parser20.isTrackErrors();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(parseSettings22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.jsoup.nodes.Document document1 = org.jsoup.Jsoup.parseBodyFragment("hi!");
        java.lang.Class<?> wildcardClass2 = document1.getClass();
        org.junit.Assert.assertNotNull(document1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.nodes.Document document5 = parser2.parseInput("", "hi!");
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parse("hi!", "hi!", parser8);
        org.jsoup.parser.ParseSettings parseSettings10 = parser8.settings();
        org.jsoup.parser.Parser parser11 = parser2.settings(parseSettings10);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList12 = parser11.getErrors();
        org.jsoup.parser.Parser parser13 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings14 = parser13.settings();
        org.jsoup.parser.Parser parser15 = parser11.settings(parseSettings14);
        org.jsoup.parser.ParseSettings parseSettings16 = parser11.settings();
        org.jsoup.parser.Parser parser18 = parser11.setTrackErrors((int) (byte) 100);
        boolean boolean19 = parser11.isTrackErrors();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parseErrorList12);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser0.settings(parseSettings3);
        org.jsoup.parser.Parser parser6 = parser4.setTrackErrors((int) (byte) 1);
        org.jsoup.parser.Parser parser8 = parser6.setTrackErrors(10);
        org.jsoup.parser.Parser parser10 = parser6.setTrackErrors((int) '#');
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser2.settings(parseSettings5);
        org.jsoup.parser.Parser parser7 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser7.settings(parseSettings8);
        org.jsoup.nodes.Document document12 = parser9.parseInput("", "hi!");
        org.jsoup.parser.Parser parser15 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parse("hi!", "hi!", parser15);
        org.jsoup.parser.ParseSettings parseSettings17 = parser15.settings();
        org.jsoup.parser.Parser parser18 = parser9.settings(parseSettings17);
        org.jsoup.parser.Parser parser19 = parser6.settings(parseSettings17);
        org.jsoup.parser.Parser parser20 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        org.jsoup.parser.Parser parser22 = parser20.settings(parseSettings21);
        org.jsoup.parser.ParseSettings parseSettings23 = null;
        org.jsoup.parser.Parser parser24 = parser20.settings(parseSettings23);
        org.jsoup.parser.ParseSettings parseSettings25 = parser20.settings();
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        org.jsoup.parser.Parser parser27 = parser20.settings(parseSettings26);
        org.jsoup.parser.Parser parser28 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        org.jsoup.parser.Parser parser30 = parser28.settings(parseSettings29);
        org.jsoup.parser.Parser parser31 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        org.jsoup.parser.Parser parser33 = parser31.settings(parseSettings32);
        org.jsoup.parser.ParseSettings parseSettings34 = null;
        org.jsoup.parser.Parser parser35 = parser31.settings(parseSettings34);
        org.jsoup.parser.Parser parser38 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document39 = org.jsoup.Jsoup.parse("hi!", "hi!", parser38);
        org.jsoup.parser.ParseSettings parseSettings40 = parser38.settings();
        org.jsoup.parser.Parser parser41 = parser31.settings(parseSettings40);
        org.jsoup.parser.Parser parser42 = parser30.settings(parseSettings40);
        org.jsoup.parser.Parser parser43 = parser20.settings(parseSettings40);
        org.jsoup.parser.Parser parser45 = parser20.setTrackErrors((int) (byte) 10);
        org.jsoup.parser.Parser parser47 = parser20.setTrackErrors((int) (byte) 1);
        org.jsoup.parser.ParseSettings parseSettings48 = parser20.settings();
        org.jsoup.parser.Parser parser49 = parser19.settings(parseSettings48);
        org.jsoup.nodes.Document document50 = org.jsoup.Jsoup.parse("", "hi!", parser49);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNull(parseSettings25);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(parser41);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(parser47);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertNotNull(document50);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.Parser parser4 = parser2.setTrackErrors((int) (short) 100);
        org.jsoup.parser.Parser parser6 = parser2.setTrackErrors(1);
        org.jsoup.parser.Parser parser8 = parser2.setTrackErrors(1);
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser8);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser2.settings(parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = parser2.settings();
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser2.settings(parseSettings8);
        org.jsoup.nodes.Document document12 = parser2.parseInput("", "hi!");
        org.jsoup.nodes.Document document15 = parser2.parseInput("", "hi!");
        org.jsoup.parser.Parser parser16 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        org.jsoup.parser.Parser parser18 = parser16.settings(parseSettings17);
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        org.jsoup.parser.Parser parser20 = parser16.settings(parseSettings19);
        org.jsoup.parser.Parser parser23 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parse("hi!", "hi!", parser23);
        org.jsoup.parser.ParseSettings parseSettings25 = parser23.settings();
        org.jsoup.parser.Parser parser26 = parser16.settings(parseSettings25);
        org.jsoup.parser.Parser parser27 = parser2.settings(parseSettings25);
        org.jsoup.nodes.Document document30 = parser2.parseInput("", "hi!");
        java.util.List<org.jsoup.parser.ParseError> parseErrorList31 = parser2.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList32 = parser2.getErrors();
        org.jsoup.parser.Parser parser37 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parse("", "hi!", parser37);
        org.jsoup.parser.Parser parser40 = parser37.setTrackErrors(10);
        org.jsoup.parser.Parser parser42 = parser40.setTrackErrors(10);
        boolean boolean43 = parser42.isTrackErrors();
        org.jsoup.nodes.Document document44 = org.jsoup.Jsoup.parse("", "hi!", parser42);
        org.jsoup.parser.ParseSettings parseSettings45 = parser42.settings();
        org.jsoup.parser.Parser parser46 = parser2.settings(parseSettings45);
        org.jsoup.parser.Parser parser48 = parser2.setTrackErrors((int) (short) 10);
        org.jsoup.nodes.Document document49 = org.jsoup.Jsoup.parse("hi!", "", parser48);
        org.jsoup.parser.Parser parser52 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document53 = org.jsoup.Jsoup.parse("hi!", "hi!", parser52);
        org.jsoup.parser.Parser parser54 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings55 = null;
        org.jsoup.parser.Parser parser56 = parser54.settings(parseSettings55);
        org.jsoup.nodes.Document document59 = parser56.parseInput("", "hi!");
        org.jsoup.parser.Parser parser62 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document63 = org.jsoup.Jsoup.parse("hi!", "hi!", parser62);
        org.jsoup.parser.ParseSettings parseSettings64 = parser62.settings();
        org.jsoup.parser.Parser parser65 = parser56.settings(parseSettings64);
        org.jsoup.parser.Parser parser66 = parser52.settings(parseSettings64);
        org.jsoup.parser.Parser parser68 = parser52.setTrackErrors((int) ' ');
        org.jsoup.nodes.Document document71 = parser52.parseInput("", "hi!");
        org.jsoup.nodes.Document document74 = parser52.parseInput("hi!", "hi!");
        org.jsoup.parser.ParseSettings parseSettings75 = parser52.settings();
        org.jsoup.parser.Parser parser76 = parser48.settings(parseSettings75);
        org.jsoup.nodes.Document document79 = parser48.parseInput("", "hi!");
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNull(parseSettings7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(parseErrorList31);
        org.junit.Assert.assertNotNull(parseErrorList32);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(parser48);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertNotNull(parser52);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNotNull(parser54);
        org.junit.Assert.assertNotNull(parser56);
        org.junit.Assert.assertNotNull(document59);
        org.junit.Assert.assertNotNull(parser62);
        org.junit.Assert.assertNotNull(document63);
        org.junit.Assert.assertNotNull(parseSettings64);
        org.junit.Assert.assertNotNull(parser65);
        org.junit.Assert.assertNotNull(parser66);
        org.junit.Assert.assertNotNull(parser68);
        org.junit.Assert.assertNotNull(document71);
        org.junit.Assert.assertNotNull(document74);
        org.junit.Assert.assertNotNull(parseSettings75);
        org.junit.Assert.assertNotNull(parser76);
        org.junit.Assert.assertNotNull(document79);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("hi!", "hi!", parser2);
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.nodes.Document document9 = parser6.parseInput("", "hi!");
        org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "hi!", parser12);
        org.jsoup.parser.ParseSettings parseSettings14 = parser12.settings();
        org.jsoup.parser.Parser parser15 = parser6.settings(parseSettings14);
        org.jsoup.parser.Parser parser16 = parser2.settings(parseSettings14);
        org.jsoup.parser.Parser parser18 = parser2.setTrackErrors((int) ' ');
        boolean boolean19 = parser18.isTrackErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList20 = parser18.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList21 = parser18.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList22 = parser18.getErrors();
        org.jsoup.parser.ParseSettings parseSettings23 = null;
        org.jsoup.parser.Parser parser24 = parser18.settings(parseSettings23);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(parseErrorList20);
        org.junit.Assert.assertNotNull(parseErrorList21);
        org.junit.Assert.assertNotNull(parseErrorList22);
        org.junit.Assert.assertNotNull(parser24);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("hi!", "hi!", parser6);
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        org.jsoup.parser.Parser parser10 = parser8.settings(parseSettings9);
        org.jsoup.nodes.Document document13 = parser10.parseInput("", "hi!");
        org.jsoup.parser.Parser parser16 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parse("hi!", "hi!", parser16);
        org.jsoup.parser.ParseSettings parseSettings18 = parser16.settings();
        org.jsoup.parser.Parser parser19 = parser10.settings(parseSettings18);
        org.jsoup.parser.Parser parser20 = parser6.settings(parseSettings18);
        org.jsoup.parser.Parser parser22 = parser6.setTrackErrors((int) ' ');
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parse("hi!", "", parser6);
        org.jsoup.nodes.Document document26 = parser6.parseInput("hi!", "hi!");
        org.jsoup.parser.Parser parser31 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document32 = org.jsoup.Jsoup.parse("", "hi!", parser31);
        org.jsoup.parser.Parser parser34 = parser31.setTrackErrors(10);
        org.jsoup.parser.Parser parser36 = parser34.setTrackErrors(10);
        boolean boolean37 = parser36.isTrackErrors();
        org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parse("", "hi!", parser36);
        boolean boolean39 = parser36.isTrackErrors();
        org.jsoup.parser.Parser parser40 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings41 = null;
        org.jsoup.parser.Parser parser42 = parser40.settings(parseSettings41);
        org.jsoup.nodes.Document document45 = parser42.parseInput("", "hi!");
        org.jsoup.parser.Parser parser48 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document49 = org.jsoup.Jsoup.parse("hi!", "hi!", parser48);
        org.jsoup.parser.ParseSettings parseSettings50 = parser48.settings();
        org.jsoup.parser.Parser parser51 = parser42.settings(parseSettings50);
        boolean boolean52 = parser42.isTrackErrors();
        org.jsoup.parser.Parser parser53 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings54 = null;
        org.jsoup.parser.Parser parser55 = parser53.settings(parseSettings54);
        org.jsoup.parser.ParseSettings parseSettings56 = null;
        org.jsoup.parser.Parser parser57 = parser53.settings(parseSettings56);
        org.jsoup.parser.ParseSettings parseSettings58 = parser53.settings();
        org.jsoup.parser.ParseSettings parseSettings59 = null;
        org.jsoup.parser.Parser parser60 = parser53.settings(parseSettings59);
        org.jsoup.parser.Parser parser61 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.ParseSettings parseSettings62 = parser61.settings();
        org.jsoup.parser.Parser parser63 = parser53.settings(parseSettings62);
        org.jsoup.parser.Parser parser64 = parser42.settings(parseSettings62);
        org.jsoup.parser.Parser parser65 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList66 = parser65.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList67 = parser65.getErrors();
        org.jsoup.parser.ParseSettings parseSettings68 = parser65.settings();
        org.jsoup.parser.Parser parser69 = parser64.settings(parseSettings68);
        org.jsoup.parser.ParseSettings parseSettings70 = parser69.settings();
        org.jsoup.parser.Parser parser71 = parser36.settings(parseSettings70);
        org.jsoup.parser.ParseSettings parseSettings72 = parser36.settings();
        org.jsoup.parser.Parser parser73 = parser6.settings(parseSettings72);
        org.jsoup.nodes.Document document74 = org.jsoup.Jsoup.parse("", "", parser6);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(parser48);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertNotNull(parseSettings50);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(parser53);
        org.junit.Assert.assertNotNull(parser55);
        org.junit.Assert.assertNotNull(parser57);
        org.junit.Assert.assertNull(parseSettings58);
        org.junit.Assert.assertNotNull(parser60);
        org.junit.Assert.assertNotNull(parser61);
        org.junit.Assert.assertNotNull(parseSettings62);
        org.junit.Assert.assertNotNull(parser63);
        org.junit.Assert.assertNotNull(parser64);
        org.junit.Assert.assertNotNull(parser65);
        org.junit.Assert.assertNull(parseErrorList66);
        org.junit.Assert.assertNull(parseErrorList67);
        org.junit.Assert.assertNotNull(parseSettings68);
        org.junit.Assert.assertNotNull(parser69);
        org.junit.Assert.assertNotNull(parseSettings70);
        org.junit.Assert.assertNotNull(parser71);
        org.junit.Assert.assertNotNull(parseSettings72);
        org.junit.Assert.assertNotNull(parser73);
        org.junit.Assert.assertNotNull(document74);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.nodes.Document document5 = parser2.parseInput("", "hi!");
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parse("hi!", "hi!", parser8);
        org.jsoup.parser.ParseSettings parseSettings10 = parser8.settings();
        org.jsoup.parser.Parser parser11 = parser2.settings(parseSettings10);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList12 = parser11.getErrors();
        org.jsoup.parser.Parser parser13 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings14 = parser13.settings();
        org.jsoup.parser.Parser parser15 = parser11.settings(parseSettings14);
        org.jsoup.parser.Parser parser17 = parser15.setTrackErrors((int) (short) 10);
        org.jsoup.parser.ParseSettings parseSettings18 = parser15.settings();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parseErrorList12);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parseSettings18);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        org.jsoup.parser.Parser parser5 = parser3.settings(parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser3.settings(parseSettings6);
        org.jsoup.parser.ParseSettings parseSettings8 = parser3.settings();
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        org.jsoup.parser.Parser parser10 = parser3.settings(parseSettings9);
        org.jsoup.parser.Parser parser11 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings12 = null;
        org.jsoup.parser.Parser parser13 = parser11.settings(parseSettings12);
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings15 = null;
        org.jsoup.parser.Parser parser16 = parser14.settings(parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        org.jsoup.parser.Parser parser18 = parser14.settings(parseSettings17);
        org.jsoup.parser.Parser parser21 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document22 = org.jsoup.Jsoup.parse("hi!", "hi!", parser21);
        org.jsoup.parser.ParseSettings parseSettings23 = parser21.settings();
        org.jsoup.parser.Parser parser24 = parser14.settings(parseSettings23);
        org.jsoup.parser.Parser parser25 = parser13.settings(parseSettings23);
        org.jsoup.parser.Parser parser26 = parser3.settings(parseSettings23);
        org.jsoup.nodes.Document document29 = parser26.parseInput("hi!", "");
        org.jsoup.parser.Parser parser31 = parser26.setTrackErrors(100);
        org.jsoup.nodes.Document document32 = org.jsoup.Jsoup.parse("hi!", "", parser31);
        java.util.List<org.jsoup.nodes.Node> nodeList34 = org.jsoup.parser.Parser.parseFragment("hi!", (org.jsoup.nodes.Element) document32, "hi!");
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNull(parseSettings8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parseSettings23);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(nodeList34);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = null;
        org.jsoup.parser.Parser parser8 = parser4.settings(parseSettings7);
        org.jsoup.parser.ParseSettings parseSettings9 = parser4.settings();
        org.jsoup.parser.ParseSettings parseSettings10 = null;
        org.jsoup.parser.Parser parser11 = parser4.settings(parseSettings10);
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parse("hi!", "", parser4);
        org.jsoup.parser.ParseSettings parseSettings13 = parser4.settings();
        boolean boolean14 = parser4.isTrackErrors();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("", "", parser4);
        org.jsoup.parser.Parser parser18 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parse("", "hi!", parser18);
        org.jsoup.parser.Parser parser21 = parser18.setTrackErrors(10);
        org.jsoup.parser.Parser parser23 = parser18.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser25 = parser18.setTrackErrors((int) (short) 1);
        org.jsoup.parser.Parser parser27 = parser18.setTrackErrors(100);
        org.jsoup.parser.Parser parser29 = parser18.setTrackErrors(100);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList30 = parser18.getErrors();
        boolean boolean31 = parser18.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings32 = parser18.settings();
        org.jsoup.parser.Parser parser33 = parser4.settings(parseSettings32);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList34 = parser4.getErrors();
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNull(parseSettings9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNull(parseSettings13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parseErrorList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parseErrorList34);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        org.jsoup.parser.Parser parser5 = parser3.settings(parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser3.settings(parseSettings6);
        org.jsoup.parser.ParseSettings parseSettings8 = parser3.settings();
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        org.jsoup.parser.Parser parser10 = parser3.settings(parseSettings9);
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("hi!", "", parser3);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList12 = parser3.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList13 = parser3.getErrors();
        org.jsoup.parser.Parser parser15 = parser3.setTrackErrors(10);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList16 = parser3.getErrors();
        org.jsoup.nodes.Document document19 = parser3.parseInput("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = org.jsoup.parser.Parser.parseFragment("hi!", (org.jsoup.nodes.Element) document19, "hi!");
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNull(parseSettings8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseErrorList12);
        org.junit.Assert.assertNotNull(parseErrorList13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parseErrorList16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = null;
        org.jsoup.parser.Parser parser8 = parser4.settings(parseSettings7);
        org.jsoup.parser.Parser parser11 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parse("hi!", "hi!", parser11);
        org.jsoup.parser.ParseSettings parseSettings13 = parser11.settings();
        org.jsoup.parser.Parser parser14 = parser4.settings(parseSettings13);
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("hi!", "hi!", parser14);
        boolean boolean16 = parser14.isTrackErrors();
        boolean boolean17 = parser14.isTrackErrors();
        org.jsoup.nodes.Document document20 = parser14.parseInput("hi!", "");
        org.jsoup.parser.Parser parser21 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        org.jsoup.parser.Parser parser23 = parser21.settings(parseSettings22);
        org.jsoup.nodes.Document document26 = parser23.parseInput("", "hi!");
        org.jsoup.parser.Parser parser29 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document30 = org.jsoup.Jsoup.parse("hi!", "hi!", parser29);
        org.jsoup.parser.ParseSettings parseSettings31 = parser29.settings();
        org.jsoup.parser.Parser parser32 = parser23.settings(parseSettings31);
        org.jsoup.parser.Parser parser33 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings34 = null;
        org.jsoup.parser.Parser parser35 = parser33.settings(parseSettings34);
        org.jsoup.parser.ParseSettings parseSettings36 = null;
        org.jsoup.parser.Parser parser37 = parser33.settings(parseSettings36);
        org.jsoup.parser.ParseSettings parseSettings38 = parser33.settings();
        org.jsoup.parser.ParseSettings parseSettings39 = null;
        org.jsoup.parser.Parser parser40 = parser33.settings(parseSettings39);
        org.jsoup.nodes.Document document43 = parser33.parseInput("", "hi!");
        org.jsoup.nodes.Document document46 = parser33.parseInput("", "hi!");
        org.jsoup.parser.Parser parser47 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings48 = null;
        org.jsoup.parser.Parser parser49 = parser47.settings(parseSettings48);
        org.jsoup.parser.ParseSettings parseSettings50 = null;
        org.jsoup.parser.Parser parser51 = parser47.settings(parseSettings50);
        org.jsoup.parser.Parser parser54 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document55 = org.jsoup.Jsoup.parse("hi!", "hi!", parser54);
        org.jsoup.parser.ParseSettings parseSettings56 = parser54.settings();
        org.jsoup.parser.Parser parser57 = parser47.settings(parseSettings56);
        org.jsoup.parser.Parser parser58 = parser33.settings(parseSettings56);
        boolean boolean59 = parser33.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings60 = parser33.settings();
        org.jsoup.parser.Parser parser61 = parser32.settings(parseSettings60);
        org.jsoup.parser.Parser parser62 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings63 = null;
        org.jsoup.parser.Parser parser64 = parser62.settings(parseSettings63);
        org.jsoup.parser.Parser parser67 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document68 = org.jsoup.Jsoup.parse("hi!", "hi!", parser67);
        org.jsoup.parser.Parser parser69 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings70 = null;
        org.jsoup.parser.Parser parser71 = parser69.settings(parseSettings70);
        org.jsoup.nodes.Document document74 = parser71.parseInput("", "hi!");
        org.jsoup.parser.Parser parser77 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document78 = org.jsoup.Jsoup.parse("hi!", "hi!", parser77);
        org.jsoup.parser.ParseSettings parseSettings79 = parser77.settings();
        org.jsoup.parser.Parser parser80 = parser71.settings(parseSettings79);
        org.jsoup.parser.Parser parser81 = parser67.settings(parseSettings79);
        org.jsoup.parser.Parser parser82 = parser62.settings(parseSettings79);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList83 = parser62.getErrors();
        org.jsoup.parser.Parser parser85 = parser62.setTrackErrors((int) '#');
        boolean boolean86 = parser85.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings87 = parser85.settings();
        org.jsoup.parser.Parser parser88 = parser61.settings(parseSettings87);
        org.jsoup.parser.Parser parser89 = parser14.settings(parseSettings87);
        org.jsoup.nodes.Document document90 = org.jsoup.Jsoup.parse("", "hi!", parser89);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNull(parseSettings38);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNotNull(parser47);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertNotNull(parser54);
        org.junit.Assert.assertNotNull(document55);
        org.junit.Assert.assertNotNull(parseSettings56);
        org.junit.Assert.assertNotNull(parser57);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(parseSettings60);
        org.junit.Assert.assertNotNull(parser61);
        org.junit.Assert.assertNotNull(parser62);
        org.junit.Assert.assertNotNull(parser64);
        org.junit.Assert.assertNotNull(parser67);
        org.junit.Assert.assertNotNull(document68);
        org.junit.Assert.assertNotNull(parser69);
        org.junit.Assert.assertNotNull(parser71);
        org.junit.Assert.assertNotNull(document74);
        org.junit.Assert.assertNotNull(parser77);
        org.junit.Assert.assertNotNull(document78);
        org.junit.Assert.assertNotNull(parseSettings79);
        org.junit.Assert.assertNotNull(parser80);
        org.junit.Assert.assertNotNull(parser81);
        org.junit.Assert.assertNotNull(parser82);
        org.junit.Assert.assertNull(parseErrorList83);
        org.junit.Assert.assertNotNull(parser85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(parseSettings87);
        org.junit.Assert.assertNotNull(parser88);
        org.junit.Assert.assertNotNull(parser89);
        org.junit.Assert.assertNotNull(document90);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("hi!", "hi!", parser2);
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.nodes.Document document9 = parser6.parseInput("", "hi!");
        org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "hi!", parser12);
        org.jsoup.parser.ParseSettings parseSettings14 = parser12.settings();
        org.jsoup.parser.Parser parser15 = parser6.settings(parseSettings14);
        org.jsoup.parser.Parser parser16 = parser2.settings(parseSettings14);
        org.jsoup.parser.Parser parser17 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        org.jsoup.parser.Parser parser19 = parser17.settings(parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = null;
        org.jsoup.parser.Parser parser21 = parser17.settings(parseSettings20);
        org.jsoup.parser.ParseSettings parseSettings22 = parser17.settings();
        org.jsoup.parser.Parser parser23 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        org.jsoup.parser.Parser parser25 = parser23.settings(parseSettings24);
        org.jsoup.parser.ParseSettings parseSettings26 = null;
        org.jsoup.parser.Parser parser27 = parser23.settings(parseSettings26);
        org.jsoup.parser.Parser parser28 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        org.jsoup.parser.Parser parser30 = parser28.settings(parseSettings29);
        org.jsoup.nodes.Document document33 = parser30.parseInput("", "hi!");
        org.jsoup.parser.Parser parser36 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document37 = org.jsoup.Jsoup.parse("hi!", "hi!", parser36);
        org.jsoup.parser.ParseSettings parseSettings38 = parser36.settings();
        org.jsoup.parser.Parser parser39 = parser30.settings(parseSettings38);
        org.jsoup.parser.Parser parser40 = parser27.settings(parseSettings38);
        org.jsoup.parser.ParseSettings parseSettings41 = parser27.settings();
        org.jsoup.parser.Parser parser42 = parser17.settings(parseSettings41);
        org.jsoup.parser.Parser parser43 = parser16.settings(parseSettings41);
        org.jsoup.parser.Parser parser46 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings47 = null;
        org.jsoup.parser.Parser parser48 = parser46.settings(parseSettings47);
        org.jsoup.parser.ParseSettings parseSettings49 = null;
        org.jsoup.parser.Parser parser50 = parser46.settings(parseSettings49);
        org.jsoup.parser.ParseSettings parseSettings51 = parser46.settings();
        org.jsoup.parser.ParseSettings parseSettings52 = null;
        org.jsoup.parser.Parser parser53 = parser46.settings(parseSettings52);
        org.jsoup.nodes.Document document56 = parser46.parseInput("", "hi!");
        org.jsoup.nodes.Document document57 = org.jsoup.Jsoup.parse("hi!", "", parser46);
        org.jsoup.parser.ParseSettings parseSettings58 = parser46.settings();
        org.jsoup.parser.Parser parser59 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList60 = parser59.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList61 = parser59.getErrors();
        org.jsoup.parser.ParseSettings parseSettings62 = parser59.settings();
        org.jsoup.parser.ParseSettings parseSettings63 = parser59.settings();
        org.jsoup.parser.Parser parser64 = parser46.settings(parseSettings63);
        org.jsoup.parser.ParseSettings parseSettings65 = parser46.settings();
        org.jsoup.parser.Parser parser66 = parser16.settings(parseSettings65);
        org.jsoup.parser.Parser parser68 = parser66.setTrackErrors((int) (byte) 1);
        boolean boolean69 = parser66.isTrackErrors();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNull(parseSettings22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(parseSettings38);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(parser48);
        org.junit.Assert.assertNotNull(parser50);
        org.junit.Assert.assertNull(parseSettings51);
        org.junit.Assert.assertNotNull(parser53);
        org.junit.Assert.assertNotNull(document56);
        org.junit.Assert.assertNotNull(document57);
        org.junit.Assert.assertNull(parseSettings58);
        org.junit.Assert.assertNotNull(parser59);
        org.junit.Assert.assertNull(parseErrorList60);
        org.junit.Assert.assertNull(parseErrorList61);
        org.junit.Assert.assertNotNull(parseSettings62);
        org.junit.Assert.assertNotNull(parseSettings63);
        org.junit.Assert.assertNotNull(parser64);
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertNotNull(parser66);
        org.junit.Assert.assertNotNull(parser68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser5.settings(parseSettings6);
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser5.settings(parseSettings8);
        org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "hi!", parser12);
        org.jsoup.parser.ParseSettings parseSettings14 = parser12.settings();
        org.jsoup.parser.Parser parser15 = parser5.settings(parseSettings14);
        org.jsoup.parser.Parser parser16 = parser4.settings(parseSettings14);
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parse("hi!", "hi!", parser16);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList18 = parser16.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList19 = parser16.getErrors();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(parseErrorList18);
        org.junit.Assert.assertNotNull(parseErrorList19);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("hi!", "hi!", parser6);
        org.jsoup.parser.ParseSettings parseSettings8 = parser6.settings();
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parse("hi!", "hi!", parser6);
        boolean boolean10 = parser6.isTrackErrors();
        boolean boolean11 = parser6.isTrackErrors();
        org.jsoup.parser.Parser parser13 = parser6.setTrackErrors((int) (byte) 1);
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parse("hi!", "hi!", parser13);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(document14);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("hi!", "hi!", parser6);
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parse("hi!", "", parser6);
        org.jsoup.nodes.Document document11 = parser6.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings12 = parser6.settings();
        org.jsoup.parser.Parser parser14 = parser6.setTrackErrors((int) (short) 100);
        org.jsoup.parser.Parser parser16 = parser6.setTrackErrors((int) (byte) 100);
        org.jsoup.parser.ParseSettings parseSettings17 = parser6.settings();
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parse("hi!", "", parser6);
        java.lang.Class<?> wildcardClass19 = parser6.getClass();
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser2.settings(parseSettings5);
        boolean boolean7 = parser2.isTrackErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList8 = parser2.getErrors();
        org.jsoup.parser.Parser parser10 = parser2.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("", "", parser10);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList12 = parser10.getErrors();
        org.jsoup.nodes.Document document15 = parser10.parseInput("hi!", "");
        org.jsoup.nodes.Document document18 = parser10.parseInput("", "");
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(parseErrorList8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseErrorList12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(document18);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        org.jsoup.parser.Parser parser10 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("hi!", "hi!", parser10);
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parse("hi!", "", parser10);
        org.jsoup.nodes.Document document15 = parser10.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings16 = parser10.settings();
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parse("", "", parser10);
        org.jsoup.parser.Parser parser18 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        org.jsoup.parser.Parser parser20 = parser18.settings(parseSettings19);
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        org.jsoup.parser.Parser parser22 = parser18.settings(parseSettings21);
        org.jsoup.nodes.Document document25 = parser18.parseInput("hi!", "");
        org.jsoup.parser.Parser parser26 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings27 = null;
        org.jsoup.parser.Parser parser28 = parser26.settings(parseSettings27);
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        org.jsoup.parser.Parser parser30 = parser26.settings(parseSettings29);
        org.jsoup.parser.ParseSettings parseSettings31 = parser26.settings();
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        org.jsoup.parser.Parser parser33 = parser26.settings(parseSettings32);
        org.jsoup.nodes.Document document36 = parser26.parseInput("", "hi!");
        org.jsoup.nodes.Document document39 = parser26.parseInput("", "hi!");
        org.jsoup.parser.Parser parser40 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings41 = null;
        org.jsoup.parser.Parser parser42 = parser40.settings(parseSettings41);
        org.jsoup.parser.ParseSettings parseSettings43 = null;
        org.jsoup.parser.Parser parser44 = parser40.settings(parseSettings43);
        org.jsoup.parser.Parser parser47 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document48 = org.jsoup.Jsoup.parse("hi!", "hi!", parser47);
        org.jsoup.parser.ParseSettings parseSettings49 = parser47.settings();
        org.jsoup.parser.Parser parser50 = parser40.settings(parseSettings49);
        org.jsoup.parser.Parser parser51 = parser26.settings(parseSettings49);
        org.jsoup.parser.Parser parser52 = parser18.settings(parseSettings49);
        org.jsoup.parser.Parser parser53 = parser10.settings(parseSettings49);
        org.jsoup.nodes.Document document54 = org.jsoup.Jsoup.parse("", "hi!", parser53);
        org.jsoup.nodes.Document document55 = org.jsoup.Jsoup.parse("", "hi!", parser53);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(parseSettings16);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNull(parseSettings31);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertNotNull(parser47);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(parser50);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertNotNull(parser52);
        org.junit.Assert.assertNotNull(parser53);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNotNull(document55);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser0.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = parser0.settings();
        org.jsoup.parser.Parser parser7 = parser0.setTrackErrors((int) (short) 0);
        org.jsoup.parser.Parser parser9 = parser0.setTrackErrors((int) (byte) 0);
        org.jsoup.parser.Parser parser11 = parser0.setTrackErrors((int) 'a');
        boolean boolean12 = parser11.isTrackErrors();
        org.jsoup.nodes.Document document15 = parser11.parseInput("", "hi!");
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNull(parseSettings5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(document15);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("hi!", "hi!", parser4);
        org.jsoup.parser.ParseSettings parseSettings6 = parser4.settings();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList7 = parser4.getErrors();
        org.jsoup.parser.Parser parser9 = parser4.setTrackErrors((int) (byte) 100);
        org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "hi!", parser12);
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings15 = null;
        org.jsoup.parser.Parser parser16 = parser14.settings(parseSettings15);
        org.jsoup.nodes.Document document19 = parser16.parseInput("", "hi!");
        org.jsoup.parser.Parser parser22 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document23 = org.jsoup.Jsoup.parse("hi!", "hi!", parser22);
        org.jsoup.parser.ParseSettings parseSettings24 = parser22.settings();
        org.jsoup.parser.Parser parser25 = parser16.settings(parseSettings24);
        org.jsoup.parser.Parser parser26 = parser12.settings(parseSettings24);
        org.jsoup.parser.Parser parser28 = parser12.setTrackErrors((int) ' ');
        org.jsoup.parser.Parser parser31 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document32 = org.jsoup.Jsoup.parse("hi!", "hi!", parser31);
        org.jsoup.parser.ParseSettings parseSettings33 = parser31.settings();
        org.jsoup.parser.Parser parser34 = parser28.settings(parseSettings33);
        org.jsoup.parser.Parser parser35 = parser4.settings(parseSettings33);
        org.jsoup.nodes.Document document36 = org.jsoup.Jsoup.parse("", "hi!", parser4);
        org.jsoup.parser.Parser parser37 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        org.jsoup.parser.Parser parser39 = parser37.settings(parseSettings38);
        org.jsoup.nodes.Document document42 = parser39.parseInput("", "hi!");
        boolean boolean43 = parser39.isTrackErrors();
        org.jsoup.parser.Parser parser45 = parser39.setTrackErrors((int) (short) 1);
        org.jsoup.parser.Parser parser47 = parser45.setTrackErrors((int) (byte) 100);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList48 = parser47.getErrors();
        org.jsoup.parser.Parser parser50 = parser47.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser52 = parser50.setTrackErrors((int) (short) 100);
        org.jsoup.parser.Parser parser57 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document58 = org.jsoup.Jsoup.parse("", "hi!", parser57);
        org.jsoup.parser.Parser parser60 = parser57.setTrackErrors(10);
        org.jsoup.parser.Parser parser62 = parser60.setTrackErrors(10);
        boolean boolean63 = parser62.isTrackErrors();
        org.jsoup.nodes.Document document64 = org.jsoup.Jsoup.parse("", "hi!", parser62);
        org.jsoup.parser.ParseSettings parseSettings65 = parser62.settings();
        org.jsoup.parser.ParseSettings parseSettings66 = parser62.settings();
        org.jsoup.nodes.Document document69 = parser62.parseInput("hi!", "");
        org.jsoup.nodes.Document document72 = parser62.parseInput("", "");
        boolean boolean73 = parser62.isTrackErrors();
        org.jsoup.nodes.Document document76 = parser62.parseInput("", "");
        org.jsoup.parser.ParseSettings parseSettings77 = parser62.settings();
        org.jsoup.parser.Parser parser78 = parser50.settings(parseSettings77);
        org.jsoup.parser.ParseSettings parseSettings79 = parser50.settings();
        org.jsoup.parser.Parser parser80 = parser4.settings(parseSettings79);
        java.lang.Class<?> wildcardClass81 = parser80.getClass();
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(parseErrorList7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(parser47);
        org.junit.Assert.assertNotNull(parseErrorList48);
        org.junit.Assert.assertNotNull(parser50);
        org.junit.Assert.assertNotNull(parser52);
        org.junit.Assert.assertNotNull(parser57);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertNotNull(parser60);
        org.junit.Assert.assertNotNull(parser62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertNotNull(parseSettings66);
        org.junit.Assert.assertNotNull(document69);
        org.junit.Assert.assertNotNull(document72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(document76);
        org.junit.Assert.assertNotNull(parseSettings77);
        org.junit.Assert.assertNotNull(parser78);
        org.junit.Assert.assertNotNull(parseSettings79);
        org.junit.Assert.assertNotNull(parser80);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.nodes.Document document5 = parser2.parseInput("", "hi!");
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parse("hi!", "hi!", parser8);
        org.jsoup.parser.ParseSettings parseSettings10 = parser8.settings();
        org.jsoup.parser.Parser parser11 = parser2.settings(parseSettings10);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList12 = parser11.getErrors();
        org.jsoup.parser.Parser parser13 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings14 = parser13.settings();
        org.jsoup.parser.Parser parser15 = parser11.settings(parseSettings14);
        org.jsoup.parser.Parser parser17 = parser15.setTrackErrors((int) (short) 10);
        org.jsoup.parser.Parser parser18 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        org.jsoup.parser.Parser parser20 = parser18.settings(parseSettings19);
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        org.jsoup.parser.Parser parser22 = parser18.settings(parseSettings21);
        org.jsoup.parser.ParseSettings parseSettings23 = parser18.settings();
        org.jsoup.parser.Parser parser24 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings25 = null;
        org.jsoup.parser.Parser parser26 = parser24.settings(parseSettings25);
        org.jsoup.parser.ParseSettings parseSettings27 = null;
        org.jsoup.parser.Parser parser28 = parser24.settings(parseSettings27);
        org.jsoup.parser.Parser parser29 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings30 = null;
        org.jsoup.parser.Parser parser31 = parser29.settings(parseSettings30);
        org.jsoup.nodes.Document document34 = parser31.parseInput("", "hi!");
        org.jsoup.parser.Parser parser37 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document38 = org.jsoup.Jsoup.parse("hi!", "hi!", parser37);
        org.jsoup.parser.ParseSettings parseSettings39 = parser37.settings();
        org.jsoup.parser.Parser parser40 = parser31.settings(parseSettings39);
        org.jsoup.parser.Parser parser41 = parser28.settings(parseSettings39);
        org.jsoup.parser.ParseSettings parseSettings42 = parser28.settings();
        org.jsoup.parser.Parser parser43 = parser18.settings(parseSettings42);
        org.jsoup.parser.Parser parser44 = parser15.settings(parseSettings42);
        boolean boolean45 = parser44.isTrackErrors();
        org.jsoup.nodes.Document document48 = parser44.parseInput("hi!", "");
        java.lang.Class<?> wildcardClass49 = parser44.getClass();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parseErrorList12);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNull(parseSettings23);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(parseSettings39);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(parser41);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("", "hi!", parser4);
        org.jsoup.parser.Parser parser7 = parser4.setTrackErrors(10);
        org.jsoup.parser.Parser parser9 = parser4.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser11 = parser4.setTrackErrors((int) (short) 1);
        org.jsoup.parser.Parser parser13 = parser4.setTrackErrors(100);
        org.jsoup.parser.Parser parser15 = parser4.setTrackErrors(100);
        org.jsoup.parser.Parser parser17 = parser4.setTrackErrors((int) (byte) 100);
        org.jsoup.parser.Parser parser19 = parser4.setTrackErrors((int) (short) 0);
        org.jsoup.nodes.Document document20 = org.jsoup.Jsoup.parse("hi!", "", parser4);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList21 = parser4.getErrors();
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(parseErrorList21);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("hi!", "hi!", parser6);
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parse("hi!", "", parser6);
        org.jsoup.nodes.Document document11 = parser6.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings12 = parser6.settings();
        org.jsoup.parser.Parser parser14 = parser6.setTrackErrors((int) (short) 100);
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("hi!", "hi!", parser6);
        org.jsoup.parser.Parser parser20 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("hi!", "hi!", parser20);
        org.jsoup.nodes.Document document22 = org.jsoup.Jsoup.parse("hi!", "", parser20);
        org.jsoup.nodes.Document document25 = parser20.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings26 = parser20.settings();
        org.jsoup.parser.Parser parser28 = parser20.setTrackErrors((int) (short) 100);
        org.jsoup.parser.Parser parser30 = parser20.setTrackErrors((int) (byte) 100);
        org.jsoup.parser.Parser parser32 = parser20.setTrackErrors((int) '#');
        org.jsoup.parser.ParseSettings parseSettings33 = parser20.settings();
        org.jsoup.parser.Parser parser34 = parser6.settings(parseSettings33);
        org.jsoup.parser.ParseSettings parseSettings35 = parser34.settings();
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parseSettings35);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList3 = parser2.getErrors();
        org.jsoup.parser.Parser parser5 = parser2.setTrackErrors((int) (byte) 1);
        boolean boolean6 = parser2.isTrackErrors();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("hi!", "", parser2);
        org.jsoup.parser.Parser parser9 = parser2.setTrackErrors((int) '4');
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNull(parseErrorList3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(parser9);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("hi!", "hi!", parser4);
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse("hi!", "", parser4);
        org.jsoup.nodes.Document document9 = parser4.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings10 = parser4.settings();
        org.jsoup.parser.Parser parser12 = parser4.setTrackErrors((int) (short) 100);
        org.jsoup.parser.ParseSettings parseSettings13 = parser4.settings();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList14 = parser4.getErrors();
        org.jsoup.parser.Parser parser17 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parse("", "hi!", parser17);
        org.jsoup.parser.Parser parser20 = parser17.setTrackErrors(10);
        org.jsoup.parser.Parser parser22 = parser17.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser24 = parser17.setTrackErrors((int) (short) 1);
        org.jsoup.parser.Parser parser26 = parser17.setTrackErrors(100);
        org.jsoup.parser.Parser parser28 = parser17.setTrackErrors(100);
        org.jsoup.parser.ParseSettings parseSettings29 = parser28.settings();
        org.jsoup.parser.Parser parser30 = parser4.settings(parseSettings29);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(parseErrorList14);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(parser30);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.nodes.Document document5 = parser2.parseInput("", "hi!");
        org.jsoup.parser.Parser parser7 = parser2.setTrackErrors((-1));
        org.jsoup.parser.ParseSettings parseSettings8 = parser7.settings();
        boolean boolean9 = parser7.isTrackErrors();
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("", "hi!", parser14);
        org.jsoup.parser.Parser parser17 = parser14.setTrackErrors(10);
        org.jsoup.parser.Parser parser19 = parser14.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser21 = parser14.setTrackErrors((int) (short) 1);
        org.jsoup.nodes.Document document22 = org.jsoup.Jsoup.parse("", "", parser21);
        org.jsoup.parser.Parser parser23 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings24 = null;
        org.jsoup.parser.Parser parser25 = parser23.settings(parseSettings24);
        org.jsoup.nodes.Document document28 = parser25.parseInput("", "hi!");
        org.jsoup.parser.Parser parser31 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document32 = org.jsoup.Jsoup.parse("hi!", "hi!", parser31);
        org.jsoup.parser.ParseSettings parseSettings33 = parser31.settings();
        org.jsoup.parser.Parser parser34 = parser25.settings(parseSettings33);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList35 = parser34.getErrors();
        org.jsoup.parser.Parser parser36 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings37 = parser36.settings();
        org.jsoup.parser.Parser parser38 = parser34.settings(parseSettings37);
        org.jsoup.parser.Parser parser39 = parser21.settings(parseSettings37);
        org.jsoup.parser.Parser parser40 = parser7.settings(parseSettings37);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList41 = parser40.getErrors();
        org.jsoup.parser.Parser parser50 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document51 = org.jsoup.Jsoup.parse("hi!", "hi!", parser50);
        org.jsoup.parser.Parser parser52 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings53 = null;
        org.jsoup.parser.Parser parser54 = parser52.settings(parseSettings53);
        org.jsoup.nodes.Document document57 = parser54.parseInput("", "hi!");
        org.jsoup.parser.Parser parser60 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document61 = org.jsoup.Jsoup.parse("hi!", "hi!", parser60);
        org.jsoup.parser.ParseSettings parseSettings62 = parser60.settings();
        org.jsoup.parser.Parser parser63 = parser54.settings(parseSettings62);
        org.jsoup.parser.Parser parser64 = parser50.settings(parseSettings62);
        org.jsoup.nodes.Document document67 = parser64.parseInput("", "");
        org.jsoup.nodes.Document document68 = org.jsoup.Jsoup.parse("", "hi!", parser64);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList69 = parser64.getErrors();
        org.jsoup.parser.ParseSettings parseSettings70 = parser64.settings();
        org.jsoup.parser.ParseSettings parseSettings71 = parser64.settings();
        org.jsoup.parser.ParseSettings parseSettings72 = parser64.settings();
        org.jsoup.nodes.Document document73 = org.jsoup.Jsoup.parse("", "", parser64);
        org.jsoup.nodes.Document document74 = org.jsoup.Jsoup.parse("hi!", "hi!", parser64);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList75 = parser64.getErrors();
        org.jsoup.parser.ParseSettings parseSettings76 = parser64.settings();
        org.jsoup.parser.Parser parser77 = parser40.settings(parseSettings76);
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNull(parseSettings8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parseErrorList35);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(parseErrorList41);
        org.junit.Assert.assertNotNull(parser50);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNotNull(parser52);
        org.junit.Assert.assertNotNull(parser54);
        org.junit.Assert.assertNotNull(document57);
        org.junit.Assert.assertNotNull(parser60);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNotNull(parseSettings62);
        org.junit.Assert.assertNotNull(parser63);
        org.junit.Assert.assertNotNull(parser64);
        org.junit.Assert.assertNotNull(document67);
        org.junit.Assert.assertNotNull(document68);
        org.junit.Assert.assertNotNull(parseErrorList69);
        org.junit.Assert.assertNotNull(parseSettings70);
        org.junit.Assert.assertNotNull(parseSettings71);
        org.junit.Assert.assertNotNull(parseSettings72);
        org.junit.Assert.assertNotNull(document73);
        org.junit.Assert.assertNotNull(document74);
        org.junit.Assert.assertNotNull(parseErrorList75);
        org.junit.Assert.assertNotNull(parseSettings76);
        org.junit.Assert.assertNotNull(parser77);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("hi!", "hi!", parser2);
        org.jsoup.parser.ParseSettings parseSettings4 = parser2.settings();
        org.jsoup.parser.Parser parser6 = parser2.setTrackErrors(10);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList7 = parser2.getErrors();
        org.jsoup.nodes.Document document10 = parser2.parseInput("hi!", "");
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parseErrorList7);
        org.junit.Assert.assertNotNull(document10);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document4 = org.jsoup.Jsoup.parse("", "hi!", parser3);
        org.jsoup.parser.Parser parser6 = parser3.setTrackErrors(10);
        org.jsoup.parser.Parser parser8 = parser3.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser10 = parser3.setTrackErrors((int) (short) 1);
        org.jsoup.parser.Parser parser12 = parser3.setTrackErrors(100);
        org.jsoup.parser.Parser parser14 = parser3.setTrackErrors(100);
        org.jsoup.parser.Parser parser16 = parser3.setTrackErrors((int) (byte) 100);
        org.jsoup.parser.ParseSettings parseSettings17 = parser16.settings();
        org.jsoup.nodes.Document document20 = parser16.parseInput("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = org.jsoup.parser.Parser.parseFragment("", (org.jsoup.nodes.Element) document20, "");
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(document4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser0.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = parser0.settings();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList6 = parser0.getErrors();
        org.jsoup.parser.Parser parser7 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser7.settings(parseSettings8);
        org.jsoup.nodes.Document document12 = parser9.parseInput("", "hi!");
        org.jsoup.parser.Parser parser15 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parse("hi!", "hi!", parser15);
        org.jsoup.parser.ParseSettings parseSettings17 = parser15.settings();
        org.jsoup.parser.Parser parser18 = parser9.settings(parseSettings17);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList19 = parser18.getErrors();
        org.jsoup.parser.Parser parser20 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings21 = parser20.settings();
        org.jsoup.parser.Parser parser22 = parser18.settings(parseSettings21);
        org.jsoup.parser.Parser parser23 = parser0.settings(parseSettings21);
        org.jsoup.parser.Parser parser25 = parser23.setTrackErrors((int) (short) 0);
        org.jsoup.parser.Parser parser27 = parser23.setTrackErrors((int) (byte) 0);
        org.jsoup.parser.Parser parser29 = parser23.setTrackErrors((int) ' ');
        org.jsoup.parser.ParseSettings parseSettings30 = parser23.settings();
        org.jsoup.parser.ParseSettings parseSettings31 = parser23.settings();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNull(parseSettings5);
        org.junit.Assert.assertNull(parseErrorList6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parseErrorList19);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(parseSettings31);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("", "hi!", parser4);
        org.jsoup.parser.Parser parser7 = parser4.setTrackErrors(10);
        org.jsoup.parser.Parser parser9 = parser7.setTrackErrors(10);
        boolean boolean10 = parser9.isTrackErrors();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("", "hi!", parser9);
        org.jsoup.parser.ParseSettings parseSettings12 = parser9.settings();
        org.jsoup.parser.Parser parser15 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parse("hi!", "hi!", parser15);
        org.jsoup.parser.Parser parser17 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        org.jsoup.parser.Parser parser19 = parser17.settings(parseSettings18);
        org.jsoup.nodes.Document document22 = parser19.parseInput("", "hi!");
        org.jsoup.parser.Parser parser25 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parse("hi!", "hi!", parser25);
        org.jsoup.parser.ParseSettings parseSettings27 = parser25.settings();
        org.jsoup.parser.Parser parser28 = parser19.settings(parseSettings27);
        org.jsoup.parser.Parser parser29 = parser15.settings(parseSettings27);
        boolean boolean30 = parser15.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings31 = parser15.settings();
        org.jsoup.parser.Parser parser32 = parser9.settings(parseSettings31);
        boolean boolean33 = parser9.isTrackErrors();
        org.jsoup.nodes.Document document36 = parser9.parseInput("", "");
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(document36);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("hi!", "", parser4);
        org.jsoup.nodes.Document document10 = parser4.parseInput("hi!", "hi!");
        java.util.List<org.jsoup.parser.ParseError> parseErrorList11 = parser4.getErrors();
        org.jsoup.parser.ParseSettings parseSettings12 = null;
        org.jsoup.parser.Parser parser13 = parser4.settings(parseSettings12);
        org.jsoup.parser.ParseSettings parseSettings14 = parser13.settings();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("", "", parser13);
        boolean boolean16 = parser13.isTrackErrors();
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parseErrorList11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNull(parseSettings14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings9 = null;
        org.jsoup.parser.Parser parser10 = parser8.settings(parseSettings9);
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("hi!", "", parser10);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList12 = parser10.getErrors();
        boolean boolean13 = parser10.isTrackErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList14 = parser10.getErrors();
        boolean boolean15 = parser10.isTrackErrors();
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parse("hi!", "", parser10);
        org.jsoup.nodes.Document document17 = org.jsoup.Jsoup.parse("", "", parser10);
        java.util.List<org.jsoup.nodes.Node> nodeList19 = org.jsoup.parser.Parser.parseFragment("hi!", (org.jsoup.nodes.Element) document17, "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = org.jsoup.parser.Parser.parseFragment("", (org.jsoup.nodes.Element) document17, "");
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseErrorList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(parseErrorList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("", "hi!", parser2);
        org.jsoup.parser.Parser parser5 = parser2.setTrackErrors(10);
        org.jsoup.parser.Parser parser7 = parser2.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser9 = parser2.setTrackErrors((int) (short) 1);
        org.jsoup.parser.Parser parser11 = parser2.setTrackErrors(100);
        boolean boolean12 = parser11.isTrackErrors();
        boolean boolean13 = parser11.isTrackErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList14 = parser11.getErrors();
        org.jsoup.parser.Parser parser16 = parser11.setTrackErrors((int) (byte) -1);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(parseErrorList14);
        org.junit.Assert.assertNotNull(parser16);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser0.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = parser0.settings();
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser0.settings(parseSettings6);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList8 = parser0.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList9 = parser0.getErrors();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNull(parseSettings5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNull(parseErrorList8);
        org.junit.Assert.assertNull(parseErrorList9);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("hi!", "hi!", parser2);
        org.jsoup.parser.Parser parser5 = parser2.setTrackErrors((int) (short) 1);
        org.jsoup.parser.ParseSettings parseSettings6 = parser5.settings();
        org.jsoup.parser.Parser parser8 = parser5.setTrackErrors((int) '#');
        org.jsoup.nodes.Document document11 = parser5.parseInput("hi!", "");
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(document11);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document7 = parser4.parseInput("", "");
        org.jsoup.parser.Parser parser9 = parser4.setTrackErrors((int) ' ');
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse("", "hi!", parser4);
        org.jsoup.parser.ParseSettings parseSettings11 = parser4.settings();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList12 = parser4.getErrors();
        org.jsoup.parser.Parser parser15 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings16 = null;
        org.jsoup.parser.Parser parser17 = parser15.settings(parseSettings16);
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parse("hi!", "", parser15);
        org.jsoup.nodes.Document document21 = parser15.parseInput("hi!", "hi!");
        boolean boolean22 = parser15.isTrackErrors();
        org.jsoup.parser.Parser parser24 = parser15.setTrackErrors((int) '4');
        org.jsoup.parser.Parser parser26 = parser15.setTrackErrors((int) (short) 100);
        org.jsoup.parser.Parser parser28 = parser15.setTrackErrors((int) (short) 1);
        org.jsoup.parser.Parser parser33 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document34 = org.jsoup.Jsoup.parse("", "hi!", parser33);
        org.jsoup.parser.Parser parser36 = parser33.setTrackErrors(10);
        org.jsoup.parser.Parser parser38 = parser36.setTrackErrors(10);
        boolean boolean39 = parser38.isTrackErrors();
        org.jsoup.nodes.Document document40 = org.jsoup.Jsoup.parse("", "hi!", parser38);
        org.jsoup.parser.ParseSettings parseSettings41 = parser38.settings();
        org.jsoup.parser.ParseSettings parseSettings42 = parser38.settings();
        org.jsoup.parser.Parser parser43 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings44 = parser43.settings();
        org.jsoup.parser.Parser parser45 = parser38.settings(parseSettings44);
        org.jsoup.parser.Parser parser47 = parser38.setTrackErrors((int) (short) 0);
        org.jsoup.parser.ParseSettings parseSettings48 = parser38.settings();
        org.jsoup.parser.ParseSettings parseSettings49 = parser38.settings();
        org.jsoup.parser.Parser parser50 = parser28.settings(parseSettings49);
        org.jsoup.parser.Parser parser51 = parser4.settings(parseSettings49);
        org.jsoup.nodes.Document document52 = org.jsoup.Jsoup.parse("", "", parser51);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parseSettings11);
        org.junit.Assert.assertNotNull(parseErrorList12);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(parseSettings42);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(parser47);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(parseSettings49);
        org.junit.Assert.assertNotNull(parser50);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertNotNull(document52);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("hi!", "hi!", parser2);
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.nodes.Document document9 = parser6.parseInput("", "hi!");
        org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "hi!", parser12);
        org.jsoup.parser.ParseSettings parseSettings14 = parser12.settings();
        org.jsoup.parser.Parser parser15 = parser6.settings(parseSettings14);
        org.jsoup.parser.Parser parser16 = parser2.settings(parseSettings14);
        boolean boolean17 = parser2.isTrackErrors();
        boolean boolean18 = parser2.isTrackErrors();
        boolean boolean19 = parser2.isTrackErrors();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("", "hi!", parser2);
        org.jsoup.parser.Parser parser5 = parser2.setTrackErrors(10);
        org.jsoup.parser.Parser parser7 = parser2.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser9 = parser7.setTrackErrors((int) (short) 10);
        org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "hi!", parser12);
        org.jsoup.parser.ParseSettings parseSettings14 = parser12.settings();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList15 = parser12.getErrors();
        org.jsoup.parser.Parser parser17 = parser12.setTrackErrors((int) (byte) 100);
        org.jsoup.parser.ParseSettings parseSettings18 = parser17.settings();
        org.jsoup.parser.ParseSettings parseSettings19 = parser17.settings();
        org.jsoup.parser.Parser parser20 = parser7.settings(parseSettings19);
        org.jsoup.nodes.Document document23 = parser20.parseInput("hi!", "");
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parseErrorList15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(document23);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse("", "hi!", parser5);
        org.jsoup.parser.Parser parser8 = parser5.setTrackErrors(10);
        org.jsoup.parser.Parser parser10 = parser5.setTrackErrors((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse(inputStream0, "hi!", "", parser10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document9 = org.jsoup.Jsoup.parse("hi!", "hi!", parser8);
        org.jsoup.nodes.Document document10 = org.jsoup.Jsoup.parse("hi!", "", parser8);
        org.jsoup.nodes.Document document13 = parser8.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings14 = parser8.settings();
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("", "", parser8);
        org.jsoup.parser.Parser parser20 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("", "hi!", parser20);
        org.jsoup.parser.Parser parser23 = parser20.setTrackErrors(10);
        org.jsoup.parser.Parser parser25 = parser23.setTrackErrors(10);
        boolean boolean26 = parser25.isTrackErrors();
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parse("", "hi!", parser25);
        org.jsoup.parser.ParseSettings parseSettings28 = parser25.settings();
        org.jsoup.parser.Parser parser29 = parser8.settings(parseSettings28);
        org.jsoup.parser.Parser parser34 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document35 = org.jsoup.Jsoup.parse("hi!", "hi!", parser34);
        org.jsoup.nodes.Document document36 = org.jsoup.Jsoup.parse("hi!", "", parser34);
        org.jsoup.nodes.Document document39 = parser34.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings40 = parser34.settings();
        org.jsoup.parser.Parser parser42 = parser34.setTrackErrors((int) (short) 100);
        org.jsoup.parser.ParseSettings parseSettings43 = parser34.settings();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList44 = parser34.getErrors();
        org.jsoup.parser.Parser parser47 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document48 = org.jsoup.Jsoup.parse("hi!", "hi!", parser47);
        org.jsoup.parser.Parser parser49 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings50 = null;
        org.jsoup.parser.Parser parser51 = parser49.settings(parseSettings50);
        org.jsoup.nodes.Document document54 = parser51.parseInput("", "hi!");
        org.jsoup.parser.Parser parser57 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document58 = org.jsoup.Jsoup.parse("hi!", "hi!", parser57);
        org.jsoup.parser.ParseSettings parseSettings59 = parser57.settings();
        org.jsoup.parser.Parser parser60 = parser51.settings(parseSettings59);
        org.jsoup.parser.Parser parser61 = parser47.settings(parseSettings59);
        org.jsoup.parser.Parser parser63 = parser47.setTrackErrors((int) ' ');
        java.util.List<org.jsoup.parser.ParseError> parseErrorList64 = parser63.getErrors();
        org.jsoup.parser.ParseSettings parseSettings65 = parser63.settings();
        org.jsoup.parser.Parser parser66 = parser34.settings(parseSettings65);
        org.jsoup.parser.Parser parser67 = parser8.settings(parseSettings65);
        org.jsoup.parser.Parser parser69 = parser8.setTrackErrors((int) (short) 1);
        org.jsoup.parser.Parser parser70 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings71 = null;
        org.jsoup.parser.Parser parser72 = parser70.settings(parseSettings71);
        org.jsoup.nodes.Document document75 = parser72.parseInput("", "hi!");
        org.jsoup.parser.Parser parser77 = parser72.setTrackErrors((int) (byte) 1);
        org.jsoup.parser.Parser parser80 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document81 = org.jsoup.Jsoup.parse("hi!", "hi!", parser80);
        org.jsoup.parser.ParseSettings parseSettings82 = parser80.settings();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList83 = parser80.getErrors();
        org.jsoup.parser.Parser parser85 = parser80.setTrackErrors((int) (short) 100);
        org.jsoup.parser.ParseSettings parseSettings86 = parser80.settings();
        org.jsoup.parser.Parser parser87 = parser72.settings(parseSettings86);
        org.jsoup.parser.Parser parser88 = parser69.settings(parseSettings86);
        org.jsoup.nodes.Document document89 = org.jsoup.Jsoup.parse("", "hi!", parser69);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(parseSettings43);
        org.junit.Assert.assertNotNull(parseErrorList44);
        org.junit.Assert.assertNotNull(parser47);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNotNull(parser57);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertNotNull(parseSettings59);
        org.junit.Assert.assertNotNull(parser60);
        org.junit.Assert.assertNotNull(parser61);
        org.junit.Assert.assertNotNull(parser63);
        org.junit.Assert.assertNotNull(parseErrorList64);
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertNotNull(parser66);
        org.junit.Assert.assertNotNull(parser67);
        org.junit.Assert.assertNotNull(parser69);
        org.junit.Assert.assertNotNull(parser70);
        org.junit.Assert.assertNotNull(parser72);
        org.junit.Assert.assertNotNull(document75);
        org.junit.Assert.assertNotNull(parser77);
        org.junit.Assert.assertNotNull(parser80);
        org.junit.Assert.assertNotNull(document81);
        org.junit.Assert.assertNotNull(parseSettings82);
        org.junit.Assert.assertNotNull(parseErrorList83);
        org.junit.Assert.assertNotNull(parser85);
        org.junit.Assert.assertNotNull(parseSettings86);
        org.junit.Assert.assertNotNull(parser87);
        org.junit.Assert.assertNotNull(parser88);
        org.junit.Assert.assertNotNull(document89);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "hi!", parser12);
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parse("hi!", "", parser12);
        org.jsoup.nodes.Document document17 = parser12.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings18 = parser12.settings();
        org.jsoup.nodes.Document document19 = org.jsoup.Jsoup.parse("", "", parser12);
        org.jsoup.parser.Parser parser20 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        org.jsoup.parser.Parser parser22 = parser20.settings(parseSettings21);
        org.jsoup.parser.ParseSettings parseSettings23 = null;
        org.jsoup.parser.Parser parser24 = parser20.settings(parseSettings23);
        org.jsoup.nodes.Document document27 = parser20.parseInput("hi!", "");
        org.jsoup.parser.Parser parser28 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings29 = null;
        org.jsoup.parser.Parser parser30 = parser28.settings(parseSettings29);
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        org.jsoup.parser.Parser parser32 = parser28.settings(parseSettings31);
        org.jsoup.parser.ParseSettings parseSettings33 = parser28.settings();
        org.jsoup.parser.ParseSettings parseSettings34 = null;
        org.jsoup.parser.Parser parser35 = parser28.settings(parseSettings34);
        org.jsoup.nodes.Document document38 = parser28.parseInput("", "hi!");
        org.jsoup.nodes.Document document41 = parser28.parseInput("", "hi!");
        org.jsoup.parser.Parser parser42 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings43 = null;
        org.jsoup.parser.Parser parser44 = parser42.settings(parseSettings43);
        org.jsoup.parser.ParseSettings parseSettings45 = null;
        org.jsoup.parser.Parser parser46 = parser42.settings(parseSettings45);
        org.jsoup.parser.Parser parser49 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document50 = org.jsoup.Jsoup.parse("hi!", "hi!", parser49);
        org.jsoup.parser.ParseSettings parseSettings51 = parser49.settings();
        org.jsoup.parser.Parser parser52 = parser42.settings(parseSettings51);
        org.jsoup.parser.Parser parser53 = parser28.settings(parseSettings51);
        org.jsoup.parser.Parser parser54 = parser20.settings(parseSettings51);
        org.jsoup.parser.Parser parser55 = parser12.settings(parseSettings51);
        boolean boolean56 = parser12.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings57 = parser12.settings();
        org.jsoup.parser.ParseSettings parseSettings58 = parser12.settings();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList59 = parser12.getErrors();
        org.jsoup.parser.Parser parser61 = parser12.setTrackErrors((-1));
        org.jsoup.nodes.Document document62 = org.jsoup.Jsoup.parse("", "", parser61);
        org.jsoup.nodes.Document document63 = org.jsoup.Jsoup.parse("", "", parser61);
        org.jsoup.nodes.Document document64 = org.jsoup.Jsoup.parse("", "hi!", parser61);
        org.jsoup.parser.Parser parser66 = parser61.setTrackErrors((int) (byte) 1);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(document17);
        org.junit.Assert.assertNotNull(parseSettings18);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNull(parseSettings33);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(parseSettings51);
        org.junit.Assert.assertNotNull(parser52);
        org.junit.Assert.assertNotNull(parser53);
        org.junit.Assert.assertNotNull(parser54);
        org.junit.Assert.assertNotNull(parser55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(parseSettings57);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNotNull(parseErrorList59);
        org.junit.Assert.assertNotNull(parser61);
        org.junit.Assert.assertNotNull(document62);
        org.junit.Assert.assertNotNull(document63);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertNotNull(parser66);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser2.settings(parseSettings5);
        org.jsoup.parser.ParseSettings parseSettings7 = parser2.settings();
        org.jsoup.parser.Parser parser9 = parser2.setTrackErrors((int) (short) 0);
        org.jsoup.parser.Parser parser11 = parser2.setTrackErrors((int) (byte) 0);
        org.jsoup.parser.Parser parser13 = parser2.setTrackErrors((int) 'a');
        boolean boolean14 = parser13.isTrackErrors();
        org.jsoup.parser.Parser parser19 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document20 = org.jsoup.Jsoup.parse("hi!", "hi!", parser19);
        org.jsoup.nodes.Document document21 = org.jsoup.Jsoup.parse("hi!", "", parser19);
        org.jsoup.nodes.Document document24 = parser19.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings25 = parser19.settings();
        org.jsoup.parser.Parser parser27 = parser19.setTrackErrors((int) (short) 100);
        org.jsoup.parser.Parser parser29 = parser19.setTrackErrors((int) (byte) 100);
        org.jsoup.parser.Parser parser30 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings31 = null;
        org.jsoup.parser.Parser parser32 = parser30.settings(parseSettings31);
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        org.jsoup.parser.Parser parser34 = parser30.settings(parseSettings33);
        org.jsoup.parser.Parser parser35 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings36 = null;
        org.jsoup.parser.Parser parser37 = parser35.settings(parseSettings36);
        org.jsoup.nodes.Document document40 = parser37.parseInput("", "hi!");
        org.jsoup.parser.Parser parser43 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document44 = org.jsoup.Jsoup.parse("hi!", "hi!", parser43);
        org.jsoup.parser.ParseSettings parseSettings45 = parser43.settings();
        org.jsoup.parser.Parser parser46 = parser37.settings(parseSettings45);
        org.jsoup.parser.Parser parser47 = parser34.settings(parseSettings45);
        org.jsoup.parser.ParseSettings parseSettings48 = parser34.settings();
        org.jsoup.parser.Parser parser49 = parser19.settings(parseSettings48);
        org.jsoup.parser.Parser parser51 = parser19.setTrackErrors(0);
        org.jsoup.nodes.Document document54 = parser19.parseInput("", "hi!");
        org.jsoup.parser.Parser parser55 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings56 = null;
        org.jsoup.parser.Parser parser57 = parser55.settings(parseSettings56);
        org.jsoup.parser.ParseSettings parseSettings58 = null;
        org.jsoup.parser.Parser parser59 = parser55.settings(parseSettings58);
        org.jsoup.parser.Parser parser62 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document63 = org.jsoup.Jsoup.parse("hi!", "hi!", parser62);
        org.jsoup.parser.ParseSettings parseSettings64 = parser62.settings();
        org.jsoup.parser.Parser parser65 = parser55.settings(parseSettings64);
        org.jsoup.parser.ParseSettings parseSettings66 = parser55.settings();
        org.jsoup.parser.Parser parser67 = parser19.settings(parseSettings66);
        org.jsoup.parser.Parser parser68 = parser13.settings(parseSettings66);
        org.jsoup.parser.ParseSettings parseSettings69 = null;
        org.jsoup.parser.Parser parser70 = parser68.settings(parseSettings69);
        org.jsoup.nodes.Document document71 = org.jsoup.Jsoup.parse("hi!", "", parser70);
        org.jsoup.parser.Parser parser73 = parser70.setTrackErrors((int) '4');
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNull(parseSettings7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(parseSettings45);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(parser47);
        org.junit.Assert.assertNotNull(parseSettings48);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNotNull(parser55);
        org.junit.Assert.assertNotNull(parser57);
        org.junit.Assert.assertNotNull(parser59);
        org.junit.Assert.assertNotNull(parser62);
        org.junit.Assert.assertNotNull(document63);
        org.junit.Assert.assertNotNull(parseSettings64);
        org.junit.Assert.assertNotNull(parser65);
        org.junit.Assert.assertNotNull(parseSettings66);
        org.junit.Assert.assertNotNull(parser67);
        org.junit.Assert.assertNotNull(parser68);
        org.junit.Assert.assertNotNull(parser70);
        org.junit.Assert.assertNotNull(document71);
        org.junit.Assert.assertNotNull(parser73);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList1 = parser0.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList2 = parser0.getErrors();
        org.jsoup.parser.ParseSettings parseSettings3 = parser0.settings();
        org.jsoup.parser.ParseSettings parseSettings4 = parser0.settings();
        org.jsoup.nodes.Document document7 = parser0.parseInput("hi!", "");
        boolean boolean8 = parser0.isTrackErrors();
        org.jsoup.parser.Parser parser10 = parser0.setTrackErrors(10);
        boolean boolean11 = parser0.isTrackErrors();
        org.jsoup.parser.Parser parser13 = parser0.setTrackErrors((int) (byte) 10);
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNull(parseErrorList1);
        org.junit.Assert.assertNull(parseErrorList2);
        org.junit.Assert.assertNotNull(parseSettings3);
        org.junit.Assert.assertNotNull(parseSettings4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(parser13);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser0.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = parser0.settings();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList6 = parser0.getErrors();
        org.jsoup.parser.Parser parser7 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser7.settings(parseSettings8);
        org.jsoup.nodes.Document document12 = parser9.parseInput("", "hi!");
        org.jsoup.parser.Parser parser15 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parse("hi!", "hi!", parser15);
        org.jsoup.parser.ParseSettings parseSettings17 = parser15.settings();
        org.jsoup.parser.Parser parser18 = parser9.settings(parseSettings17);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList19 = parser18.getErrors();
        org.jsoup.parser.Parser parser20 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings21 = parser20.settings();
        org.jsoup.parser.Parser parser22 = parser18.settings(parseSettings21);
        org.jsoup.parser.Parser parser23 = parser0.settings(parseSettings21);
        org.jsoup.parser.Parser parser25 = parser23.setTrackErrors((int) (short) 0);
        boolean boolean26 = parser25.isTrackErrors();
        org.jsoup.nodes.Document document29 = parser25.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings30 = parser25.settings();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNull(parseSettings5);
        org.junit.Assert.assertNull(parseErrorList6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parseErrorList19);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(parseSettings30);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.Parser parser4 = parser2.setTrackErrors((int) (short) 100);
        boolean boolean5 = parser4.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings6 = parser4.settings();
        org.jsoup.parser.Parser parser7 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList8 = parser7.getErrors();
        org.jsoup.parser.Parser parser10 = parser7.setTrackErrors((int) (byte) 1);
        boolean boolean11 = parser7.isTrackErrors();
        boolean boolean12 = parser7.isTrackErrors();
        org.jsoup.parser.Parser parser15 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings16 = null;
        org.jsoup.parser.Parser parser17 = parser15.settings(parseSettings16);
        org.jsoup.parser.Parser parser18 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        org.jsoup.parser.Parser parser20 = parser18.settings(parseSettings19);
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        org.jsoup.parser.Parser parser22 = parser18.settings(parseSettings21);
        org.jsoup.parser.Parser parser25 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parse("hi!", "hi!", parser25);
        org.jsoup.parser.ParseSettings parseSettings27 = parser25.settings();
        org.jsoup.parser.Parser parser28 = parser18.settings(parseSettings27);
        org.jsoup.parser.Parser parser29 = parser17.settings(parseSettings27);
        org.jsoup.nodes.Document document30 = org.jsoup.Jsoup.parse("", "", parser29);
        org.jsoup.parser.ParseSettings parseSettings31 = parser29.settings();
        org.jsoup.parser.Parser parser34 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document35 = org.jsoup.Jsoup.parse("hi!", "hi!", parser34);
        org.jsoup.parser.ParseSettings parseSettings36 = parser34.settings();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList37 = parser34.getErrors();
        org.jsoup.parser.Parser parser39 = parser34.setTrackErrors((int) (byte) 100);
        org.jsoup.parser.Parser parser42 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document43 = org.jsoup.Jsoup.parse("hi!", "hi!", parser42);
        org.jsoup.parser.Parser parser44 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings45 = null;
        org.jsoup.parser.Parser parser46 = parser44.settings(parseSettings45);
        org.jsoup.nodes.Document document49 = parser46.parseInput("", "hi!");
        org.jsoup.parser.Parser parser52 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document53 = org.jsoup.Jsoup.parse("hi!", "hi!", parser52);
        org.jsoup.parser.ParseSettings parseSettings54 = parser52.settings();
        org.jsoup.parser.Parser parser55 = parser46.settings(parseSettings54);
        org.jsoup.parser.Parser parser56 = parser42.settings(parseSettings54);
        org.jsoup.parser.Parser parser58 = parser42.setTrackErrors((int) ' ');
        org.jsoup.parser.Parser parser61 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document62 = org.jsoup.Jsoup.parse("hi!", "hi!", parser61);
        org.jsoup.parser.ParseSettings parseSettings63 = parser61.settings();
        org.jsoup.parser.Parser parser64 = parser58.settings(parseSettings63);
        org.jsoup.parser.Parser parser65 = parser34.settings(parseSettings63);
        org.jsoup.parser.Parser parser66 = parser29.settings(parseSettings63);
        org.jsoup.parser.Parser parser67 = parser7.settings(parseSettings63);
        org.jsoup.parser.Parser parser68 = parser4.settings(parseSettings63);
        org.jsoup.parser.ParseSettings parseSettings69 = parser68.settings();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(parseSettings6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNull(parseErrorList8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(parseSettings36);
        org.junit.Assert.assertNotNull(parseErrorList37);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(parser44);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertNotNull(parser52);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNotNull(parseSettings54);
        org.junit.Assert.assertNotNull(parser55);
        org.junit.Assert.assertNotNull(parser56);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertNotNull(parser61);
        org.junit.Assert.assertNotNull(document62);
        org.junit.Assert.assertNotNull(parseSettings63);
        org.junit.Assert.assertNotNull(parser64);
        org.junit.Assert.assertNotNull(parser65);
        org.junit.Assert.assertNotNull(parser66);
        org.junit.Assert.assertNotNull(parser67);
        org.junit.Assert.assertNotNull(parser68);
        org.junit.Assert.assertNotNull(parseSettings69);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.nodes.Document document7 = parser4.parseInput("", "hi!");
        boolean boolean8 = parser4.isTrackErrors();
        org.jsoup.parser.Parser parser10 = parser4.setTrackErrors((int) '#');
        org.jsoup.parser.ParseSettings parseSettings11 = parser10.settings();
        org.jsoup.parser.Parser parser13 = parser10.setTrackErrors((int) 'a');
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parse("", "", parser13);
        org.jsoup.parser.ParseSettings parseSettings15 = parser13.settings();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNull(parseSettings11);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNull(parseSettings15);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.parser.Parser parser7 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parse("hi!", "hi!", parser7);
        org.jsoup.parser.Parser parser9 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings10 = null;
        org.jsoup.parser.Parser parser11 = parser9.settings(parseSettings10);
        org.jsoup.nodes.Document document14 = parser11.parseInput("", "hi!");
        org.jsoup.parser.Parser parser17 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document18 = org.jsoup.Jsoup.parse("hi!", "hi!", parser17);
        org.jsoup.parser.ParseSettings parseSettings19 = parser17.settings();
        org.jsoup.parser.Parser parser20 = parser11.settings(parseSettings19);
        org.jsoup.parser.Parser parser21 = parser7.settings(parseSettings19);
        org.jsoup.parser.Parser parser22 = parser2.settings(parseSettings19);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList23 = parser2.getErrors();
        org.jsoup.parser.Parser parser25 = parser2.setTrackErrors((int) '#');
        org.jsoup.nodes.Document document26 = org.jsoup.Jsoup.parse("hi!", "hi!", parser2);
        org.jsoup.parser.Parser parser28 = parser2.setTrackErrors((int) (short) 10);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList29 = parser28.getErrors();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(parser11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNull(parseErrorList23);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parseErrorList29);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.Parser parser4 = parser2.setTrackErrors((int) (short) -1);
        org.jsoup.parser.Parser parser6 = parser4.setTrackErrors((int) (byte) 1);
        boolean boolean7 = parser6.isTrackErrors();
        org.jsoup.nodes.Document document10 = parser6.parseInput("hi!", "");
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("", "hi!", parser6);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document11);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        org.jsoup.parser.Parser parser7 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parse("", "hi!", parser7);
        org.jsoup.parser.Parser parser10 = parser7.setTrackErrors(10);
        org.jsoup.parser.Parser parser12 = parser7.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser14 = parser7.setTrackErrors((int) (short) 1);
        org.jsoup.nodes.Document document15 = org.jsoup.Jsoup.parse("hi!", "", parser14);
        org.jsoup.parser.Parser parser17 = parser14.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser19 = parser14.setTrackErrors(1);
        org.jsoup.parser.Parser parser21 = parser14.setTrackErrors((int) (short) -1);
        org.jsoup.nodes.Document document24 = parser21.parseInput("", "");
        org.jsoup.parser.Parser parser26 = parser21.setTrackErrors((int) (short) -1);
        org.jsoup.parser.ParseSettings parseSettings27 = parser21.settings();
        org.jsoup.parser.ParseSettings parseSettings28 = parser21.settings();
        org.jsoup.nodes.Document document29 = org.jsoup.Jsoup.parse("", "hi!", parser21);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = org.jsoup.parser.Parser.parseFragment("hi!", (org.jsoup.nodes.Element) document29, "");
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(parseSettings27);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(nodeList31);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document5 = org.jsoup.Jsoup.parse("", "hi!", parser4);
        org.jsoup.nodes.Document document8 = parser4.parseInput("", "hi!");
        org.jsoup.parser.Parser parser13 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parse("hi!", "hi!", parser13);
        org.jsoup.parser.Parser parser15 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings16 = null;
        org.jsoup.parser.Parser parser17 = parser15.settings(parseSettings16);
        org.jsoup.nodes.Document document20 = parser17.parseInput("", "hi!");
        org.jsoup.parser.Parser parser23 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parse("hi!", "hi!", parser23);
        org.jsoup.parser.ParseSettings parseSettings25 = parser23.settings();
        org.jsoup.parser.Parser parser26 = parser17.settings(parseSettings25);
        org.jsoup.parser.Parser parser27 = parser13.settings(parseSettings25);
        org.jsoup.nodes.Document document30 = parser27.parseInput("", "");
        org.jsoup.nodes.Document document31 = org.jsoup.Jsoup.parse("", "hi!", parser27);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList32 = parser27.getErrors();
        org.jsoup.parser.Parser parser34 = parser27.setTrackErrors((int) (short) 0);
        org.jsoup.nodes.Document document37 = parser34.parseInput("hi!", "");
        boolean boolean38 = parser34.isTrackErrors();
        org.jsoup.parser.ParseSettings parseSettings39 = parser34.settings();
        org.jsoup.parser.Parser parser40 = parser4.settings(parseSettings39);
        org.jsoup.nodes.Document document43 = parser4.parseInput("", "");
        org.jsoup.nodes.Document document44 = org.jsoup.Jsoup.parse("hi!", "", parser4);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(parseErrorList32);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(parseSettings39);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(document44);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser0.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = parser0.settings();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList6 = parser0.getErrors();
        org.jsoup.parser.Parser parser7 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser7.settings(parseSettings8);
        org.jsoup.nodes.Document document12 = parser9.parseInput("", "hi!");
        org.jsoup.parser.Parser parser15 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document16 = org.jsoup.Jsoup.parse("hi!", "hi!", parser15);
        org.jsoup.parser.ParseSettings parseSettings17 = parser15.settings();
        org.jsoup.parser.Parser parser18 = parser9.settings(parseSettings17);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList19 = parser18.getErrors();
        org.jsoup.parser.Parser parser20 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings21 = parser20.settings();
        org.jsoup.parser.Parser parser22 = parser18.settings(parseSettings21);
        org.jsoup.parser.Parser parser23 = parser0.settings(parseSettings21);
        org.jsoup.parser.Parser parser25 = parser23.setTrackErrors((int) (short) 0);
        org.jsoup.parser.Parser parser27 = parser23.setTrackErrors((int) (byte) 0);
        org.jsoup.parser.Parser parser29 = parser23.setTrackErrors((int) ' ');
        org.jsoup.nodes.Document document32 = parser23.parseInput("hi!", "");
        org.jsoup.parser.Parser parser34 = parser23.setTrackErrors((int) (short) 10);
        org.jsoup.parser.ParseSettings parseSettings35 = parser23.settings();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNull(parseSettings5);
        org.junit.Assert.assertNull(parseErrorList6);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parseSettings17);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parseErrorList19);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parseSettings21);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parseSettings35);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser0.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = parser0.settings();
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser0.settings(parseSettings6);
        org.jsoup.nodes.Document document10 = parser0.parseInput("", "hi!");
        org.jsoup.nodes.Document document13 = parser0.parseInput("", "hi!");
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings15 = null;
        org.jsoup.parser.Parser parser16 = parser14.settings(parseSettings15);
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        org.jsoup.parser.Parser parser18 = parser14.settings(parseSettings17);
        org.jsoup.parser.Parser parser19 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings20 = null;
        org.jsoup.parser.Parser parser21 = parser19.settings(parseSettings20);
        org.jsoup.nodes.Document document24 = parser21.parseInput("", "hi!");
        org.jsoup.parser.Parser parser27 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document28 = org.jsoup.Jsoup.parse("hi!", "hi!", parser27);
        org.jsoup.parser.ParseSettings parseSettings29 = parser27.settings();
        org.jsoup.parser.Parser parser30 = parser21.settings(parseSettings29);
        org.jsoup.parser.Parser parser31 = parser18.settings(parseSettings29);
        org.jsoup.parser.ParseSettings parseSettings32 = parser18.settings();
        org.jsoup.parser.Parser parser33 = parser0.settings(parseSettings32);
        org.jsoup.parser.Parser parser35 = parser0.setTrackErrors(10);
        boolean boolean36 = parser35.isTrackErrors();
        org.jsoup.parser.Parser parser38 = parser35.setTrackErrors((int) (short) 0);
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNull(parseSettings5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseSettings29);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(parser38);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse("", "hi!", parser5);
        org.jsoup.parser.Parser parser8 = parser5.setTrackErrors(10);
        org.jsoup.parser.Parser parser10 = parser5.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.Parser parser12 = parser10.setTrackErrors((int) (short) 10);
        org.jsoup.parser.Parser parser15 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings16 = null;
        org.jsoup.parser.Parser parser17 = parser15.settings(parseSettings16);
        org.jsoup.nodes.Document document20 = parser17.parseInput("", "hi!");
        org.jsoup.parser.Parser parser23 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parse("hi!", "hi!", parser23);
        org.jsoup.parser.ParseSettings parseSettings25 = parser23.settings();
        org.jsoup.parser.Parser parser26 = parser17.settings(parseSettings25);
        boolean boolean27 = parser17.isTrackErrors();
        org.jsoup.nodes.Document document28 = org.jsoup.Jsoup.parse("hi!", "hi!", parser17);
        org.jsoup.parser.Parser parser29 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings30 = null;
        org.jsoup.parser.Parser parser31 = parser29.settings(parseSettings30);
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        org.jsoup.parser.Parser parser33 = parser29.settings(parseSettings32);
        org.jsoup.parser.ParseSettings parseSettings34 = parser29.settings();
        org.jsoup.parser.ParseSettings parseSettings35 = null;
        org.jsoup.parser.Parser parser36 = parser29.settings(parseSettings35);
        org.jsoup.nodes.Document document39 = parser29.parseInput("", "hi!");
        org.jsoup.nodes.Document document42 = parser29.parseInput("", "hi!");
        org.jsoup.parser.Parser parser43 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings44 = null;
        org.jsoup.parser.Parser parser45 = parser43.settings(parseSettings44);
        org.jsoup.parser.ParseSettings parseSettings46 = null;
        org.jsoup.parser.Parser parser47 = parser43.settings(parseSettings46);
        org.jsoup.parser.Parser parser48 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings49 = null;
        org.jsoup.parser.Parser parser50 = parser48.settings(parseSettings49);
        org.jsoup.nodes.Document document53 = parser50.parseInput("", "hi!");
        org.jsoup.parser.Parser parser56 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document57 = org.jsoup.Jsoup.parse("hi!", "hi!", parser56);
        org.jsoup.parser.ParseSettings parseSettings58 = parser56.settings();
        org.jsoup.parser.Parser parser59 = parser50.settings(parseSettings58);
        org.jsoup.parser.Parser parser60 = parser47.settings(parseSettings58);
        org.jsoup.parser.ParseSettings parseSettings61 = parser47.settings();
        org.jsoup.parser.Parser parser62 = parser29.settings(parseSettings61);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList63 = parser62.getErrors();
        org.jsoup.parser.Parser parser64 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings65 = null;
        org.jsoup.parser.Parser parser66 = parser64.settings(parseSettings65);
        org.jsoup.nodes.Document document69 = parser66.parseInput("", "hi!");
        org.jsoup.parser.Parser parser72 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document73 = org.jsoup.Jsoup.parse("hi!", "hi!", parser72);
        org.jsoup.parser.ParseSettings parseSettings74 = parser72.settings();
        org.jsoup.parser.Parser parser75 = parser66.settings(parseSettings74);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList76 = parser75.getErrors();
        org.jsoup.parser.Parser parser77 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings78 = parser77.settings();
        org.jsoup.parser.Parser parser79 = parser75.settings(parseSettings78);
        org.jsoup.parser.Parser parser80 = parser62.settings(parseSettings78);
        org.jsoup.parser.ParseSettings parseSettings81 = parser80.settings();
        org.jsoup.parser.Parser parser82 = parser17.settings(parseSettings81);
        org.jsoup.parser.Parser parser83 = parser10.settings(parseSettings81);
        org.jsoup.nodes.Document document84 = org.jsoup.Jsoup.parse("hi!", "hi!", parser10);
        java.util.List<org.jsoup.nodes.Node> nodeList86 = org.jsoup.parser.Parser.parseFragment("hi!", (org.jsoup.nodes.Element) document84, "");
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNull(parseSettings34);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(parser47);
        org.junit.Assert.assertNotNull(parser48);
        org.junit.Assert.assertNotNull(parser50);
        org.junit.Assert.assertNotNull(document53);
        org.junit.Assert.assertNotNull(parser56);
        org.junit.Assert.assertNotNull(document57);
        org.junit.Assert.assertNotNull(parseSettings58);
        org.junit.Assert.assertNotNull(parser59);
        org.junit.Assert.assertNotNull(parser60);
        org.junit.Assert.assertNotNull(parseSettings61);
        org.junit.Assert.assertNotNull(parser62);
        org.junit.Assert.assertNotNull(parseErrorList63);
        org.junit.Assert.assertNotNull(parser64);
        org.junit.Assert.assertNotNull(parser66);
        org.junit.Assert.assertNotNull(document69);
        org.junit.Assert.assertNotNull(parser72);
        org.junit.Assert.assertNotNull(document73);
        org.junit.Assert.assertNotNull(parseSettings74);
        org.junit.Assert.assertNotNull(parser75);
        org.junit.Assert.assertNotNull(parseErrorList76);
        org.junit.Assert.assertNotNull(parser77);
        org.junit.Assert.assertNotNull(parseSettings78);
        org.junit.Assert.assertNotNull(parser79);
        org.junit.Assert.assertNotNull(parser80);
        org.junit.Assert.assertNotNull(parseSettings81);
        org.junit.Assert.assertNotNull(parser82);
        org.junit.Assert.assertNotNull(parser83);
        org.junit.Assert.assertNotNull(document84);
        org.junit.Assert.assertNotNull(nodeList86);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        org.jsoup.parser.Parser parser5 = parser3.settings(parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser3.settings(parseSettings6);
        org.jsoup.parser.Parser parser10 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("hi!", "hi!", parser10);
        org.jsoup.parser.ParseSettings parseSettings12 = parser10.settings();
        org.jsoup.parser.Parser parser13 = parser3.settings(parseSettings12);
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.ParseSettings parseSettings15 = parser14.settings();
        org.jsoup.parser.Parser parser16 = parser13.settings(parseSettings15);
        org.jsoup.parser.Parser parser18 = parser13.setTrackErrors(1);
        boolean boolean19 = parser13.isTrackErrors();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document20 = org.jsoup.Jsoup.parse(inputStream0, "", "hi!", parser13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parseSettings15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("", "hi!", parser2);
        org.jsoup.parser.Parser parser5 = parser2.setTrackErrors((int) '#');
        org.jsoup.parser.Parser parser7 = parser5.setTrackErrors((int) (byte) 1);
        org.jsoup.parser.ParseSettings parseSettings8 = parser5.settings();
        org.jsoup.parser.Parser parser10 = parser5.setTrackErrors((int) (short) 100);
        boolean boolean11 = parser10.isTrackErrors();
        org.jsoup.parser.Parser parser13 = parser10.setTrackErrors((-1));
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parseSettings8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(parser13);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        org.jsoup.parser.Parser parser1 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings2 = null;
        org.jsoup.parser.Parser parser3 = parser1.settings(parseSettings2);
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        org.jsoup.parser.Parser parser5 = parser1.settings(parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = parser1.settings();
        org.jsoup.parser.ParseSettings parseSettings7 = null;
        org.jsoup.parser.Parser parser8 = parser1.settings(parseSettings7);
        org.jsoup.nodes.Document document11 = parser1.parseInput("", "hi!");
        org.jsoup.nodes.Document document14 = parser1.parseInput("", "hi!");
        org.jsoup.parser.Parser parser15 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings16 = null;
        org.jsoup.parser.Parser parser17 = parser15.settings(parseSettings16);
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        org.jsoup.parser.Parser parser19 = parser15.settings(parseSettings18);
        org.jsoup.parser.Parser parser20 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        org.jsoup.parser.Parser parser22 = parser20.settings(parseSettings21);
        org.jsoup.nodes.Document document25 = parser22.parseInput("", "hi!");
        org.jsoup.parser.Parser parser28 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document29 = org.jsoup.Jsoup.parse("hi!", "hi!", parser28);
        org.jsoup.parser.ParseSettings parseSettings30 = parser28.settings();
        org.jsoup.parser.Parser parser31 = parser22.settings(parseSettings30);
        org.jsoup.parser.Parser parser32 = parser19.settings(parseSettings30);
        org.jsoup.parser.ParseSettings parseSettings33 = parser19.settings();
        org.jsoup.parser.Parser parser34 = parser1.settings(parseSettings33);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList35 = parser34.getErrors();
        org.jsoup.parser.Parser parser37 = parser34.setTrackErrors((int) (byte) 1);
        org.jsoup.nodes.Document document40 = parser37.parseInput("hi!", "hi!");
        org.jsoup.nodes.Document document43 = parser37.parseInput("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList45 = org.jsoup.parser.Parser.parseFragment("", (org.jsoup.nodes.Element) document43, "");
        org.junit.Assert.assertNotNull(parser1);
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNull(parseSettings6);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(document29);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parseErrorList35);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(nodeList45);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser5.settings(parseSettings6);
        org.jsoup.parser.ParseSettings parseSettings8 = null;
        org.jsoup.parser.Parser parser9 = parser5.settings(parseSettings8);
        org.jsoup.parser.ParseSettings parseSettings10 = parser5.settings();
        org.jsoup.parser.ParseSettings parseSettings11 = null;
        org.jsoup.parser.Parser parser12 = parser5.settings(parseSettings11);
        org.jsoup.nodes.Document document15 = parser5.parseInput("", "hi!");
        org.jsoup.nodes.Document document18 = parser5.parseInput("", "hi!");
        org.jsoup.parser.Parser parser19 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings20 = null;
        org.jsoup.parser.Parser parser21 = parser19.settings(parseSettings20);
        org.jsoup.parser.ParseSettings parseSettings22 = null;
        org.jsoup.parser.Parser parser23 = parser19.settings(parseSettings22);
        org.jsoup.parser.Parser parser26 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document27 = org.jsoup.Jsoup.parse("hi!", "hi!", parser26);
        org.jsoup.parser.ParseSettings parseSettings28 = parser26.settings();
        org.jsoup.parser.Parser parser29 = parser19.settings(parseSettings28);
        org.jsoup.parser.Parser parser30 = parser5.settings(parseSettings28);
        boolean boolean31 = parser5.isTrackErrors();
        org.jsoup.parser.Parser parser32 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings33 = null;
        org.jsoup.parser.Parser parser34 = parser32.settings(parseSettings33);
        org.jsoup.parser.ParseSettings parseSettings35 = null;
        org.jsoup.parser.Parser parser36 = parser32.settings(parseSettings35);
        org.jsoup.parser.ParseSettings parseSettings37 = parser32.settings();
        org.jsoup.parser.ParseSettings parseSettings38 = null;
        org.jsoup.parser.Parser parser39 = parser32.settings(parseSettings38);
        org.jsoup.parser.Parser parser40 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.ParseSettings parseSettings41 = parser40.settings();
        org.jsoup.parser.Parser parser42 = parser32.settings(parseSettings41);
        org.jsoup.parser.Parser parser43 = parser5.settings(parseSettings41);
        org.jsoup.parser.ParseSettings parseSettings44 = parser43.settings();
        boolean boolean45 = parser43.isTrackErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList46 = parser43.getErrors();
        org.jsoup.nodes.Document document47 = org.jsoup.Jsoup.parse("", "", parser43);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document48 = org.jsoup.Jsoup.parse(inputStream0, "", "hi!", parser43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser9);
        org.junit.Assert.assertNull(parseSettings10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parser21);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(parseSettings28);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parser30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNull(parseSettings37);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNotNull(parser40);
        org.junit.Assert.assertNotNull(parseSettings41);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(parseErrorList46);
        org.junit.Assert.assertNotNull(document47);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document3 = org.jsoup.Jsoup.parse("hi!", "hi!", parser2);
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.nodes.Document document9 = parser6.parseInput("", "hi!");
        org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("hi!", "hi!", parser12);
        org.jsoup.parser.ParseSettings parseSettings14 = parser12.settings();
        org.jsoup.parser.Parser parser15 = parser6.settings(parseSettings14);
        org.jsoup.parser.Parser parser16 = parser2.settings(parseSettings14);
        org.jsoup.parser.Parser parser18 = parser2.setTrackErrors((int) ' ');
        boolean boolean19 = parser18.isTrackErrors();
        org.jsoup.nodes.Document document22 = parser18.parseInput("", "hi!");
        org.jsoup.parser.Parser parser24 = parser18.setTrackErrors((int) ' ');
        org.jsoup.parser.Parser parser26 = parser18.setTrackErrors((int) (short) -1);
        boolean boolean27 = parser18.isTrackErrors();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document3);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseSettings14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        org.jsoup.parser.Parser parser6 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("hi!", "hi!", parser6);
        org.jsoup.nodes.Document document8 = org.jsoup.Jsoup.parse("hi!", "", parser6);
        org.jsoup.nodes.Document document11 = parser6.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings12 = parser6.settings();
        org.jsoup.nodes.Document document13 = org.jsoup.Jsoup.parse("", "", parser6);
        org.jsoup.nodes.Document document16 = parser6.parseInput("hi!", "hi!");
        boolean boolean17 = parser6.isTrackErrors();
        boolean boolean18 = parser6.isTrackErrors();
        boolean boolean19 = parser6.isTrackErrors();
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        org.jsoup.parser.Parser parser4 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser4.settings(parseSettings5);
        org.jsoup.nodes.Document document7 = org.jsoup.Jsoup.parse("hi!", "", parser6);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList8 = parser6.getErrors();
        boolean boolean9 = parser6.isTrackErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList10 = parser6.getErrors();
        org.jsoup.parser.ParseSettings parseSettings11 = parser6.settings();
        org.jsoup.nodes.Document document12 = org.jsoup.Jsoup.parse("hi!", "hi!", parser6);
        org.jsoup.nodes.Document document15 = parser6.parseInput("hi!", "hi!");
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(parseErrorList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(parseErrorList10);
        org.junit.Assert.assertNull(parseSettings11);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(document15);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser5 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document6 = org.jsoup.Jsoup.parse("hi!", "hi!", parser5);
        org.jsoup.parser.ParseSettings parseSettings7 = parser5.settings();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList8 = parser5.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList9 = parser5.getErrors();
        org.jsoup.nodes.Document document12 = parser5.parseInput("hi!", "hi!");
        java.util.List<org.jsoup.parser.ParseError> parseErrorList13 = parser5.getErrors();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = org.jsoup.Jsoup.parse(inputStream0, "hi!", "", parser5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(parseSettings7);
        org.junit.Assert.assertNotNull(parseErrorList8);
        org.junit.Assert.assertNotNull(parseErrorList9);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(parseErrorList13);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.nodes.Document document7 = parser4.parseInput("", "hi!");
        org.jsoup.parser.Parser parser10 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("hi!", "hi!", parser10);
        org.jsoup.parser.ParseSettings parseSettings12 = parser10.settings();
        org.jsoup.parser.Parser parser13 = parser4.settings(parseSettings12);
        boolean boolean14 = parser4.isTrackErrors();
        org.jsoup.parser.Parser parser15 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings16 = null;
        org.jsoup.parser.Parser parser17 = parser15.settings(parseSettings16);
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        org.jsoup.parser.Parser parser19 = parser15.settings(parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = parser15.settings();
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        org.jsoup.parser.Parser parser22 = parser15.settings(parseSettings21);
        org.jsoup.parser.Parser parser23 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.ParseSettings parseSettings24 = parser23.settings();
        org.jsoup.parser.Parser parser25 = parser15.settings(parseSettings24);
        org.jsoup.parser.Parser parser26 = parser4.settings(parseSettings24);
        org.jsoup.parser.Parser parser27 = org.jsoup.parser.Parser.xmlParser();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList28 = parser27.getErrors();
        java.util.List<org.jsoup.parser.ParseError> parseErrorList29 = parser27.getErrors();
        org.jsoup.parser.ParseSettings parseSettings30 = parser27.settings();
        org.jsoup.parser.Parser parser31 = parser26.settings(parseSettings30);
        org.jsoup.parser.ParseSettings parseSettings32 = parser31.settings();
        boolean boolean33 = parser31.isTrackErrors();
        org.jsoup.nodes.Document document34 = org.jsoup.Jsoup.parse("hi!", "", parser31);
        boolean boolean35 = parser31.isTrackErrors();
        boolean boolean36 = parser31.isTrackErrors();
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(document7);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNull(parseSettings20);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parseSettings24);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNull(parseErrorList28);
        org.junit.Assert.assertNull(parseErrorList29);
        org.junit.Assert.assertNotNull(parseSettings30);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(parseSettings32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        org.jsoup.parser.Parser parser2 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser2.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = null;
        org.jsoup.parser.Parser parser6 = parser2.settings(parseSettings5);
        org.jsoup.nodes.Document document9 = parser2.parseInput("hi!", "");
        org.jsoup.parser.Parser parser10 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings11 = null;
        org.jsoup.parser.Parser parser12 = parser10.settings(parseSettings11);
        org.jsoup.parser.ParseSettings parseSettings13 = null;
        org.jsoup.parser.Parser parser14 = parser10.settings(parseSettings13);
        org.jsoup.parser.ParseSettings parseSettings15 = parser10.settings();
        org.jsoup.parser.ParseSettings parseSettings16 = null;
        org.jsoup.parser.Parser parser17 = parser10.settings(parseSettings16);
        org.jsoup.nodes.Document document20 = parser10.parseInput("", "hi!");
        org.jsoup.nodes.Document document23 = parser10.parseInput("", "hi!");
        org.jsoup.parser.Parser parser24 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings25 = null;
        org.jsoup.parser.Parser parser26 = parser24.settings(parseSettings25);
        org.jsoup.parser.ParseSettings parseSettings27 = null;
        org.jsoup.parser.Parser parser28 = parser24.settings(parseSettings27);
        org.jsoup.parser.Parser parser31 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document32 = org.jsoup.Jsoup.parse("hi!", "hi!", parser31);
        org.jsoup.parser.ParseSettings parseSettings33 = parser31.settings();
        org.jsoup.parser.Parser parser34 = parser24.settings(parseSettings33);
        org.jsoup.parser.Parser parser35 = parser10.settings(parseSettings33);
        org.jsoup.parser.Parser parser36 = parser2.settings(parseSettings33);
        org.jsoup.parser.Parser parser38 = parser36.setTrackErrors(10);
        org.jsoup.parser.ParseSettings parseSettings39 = parser36.settings();
        org.jsoup.nodes.Document document40 = org.jsoup.Jsoup.parse("hi!", "", parser36);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNotNull(parser6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNull(parseSettings15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(parser28);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(parseSettings33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser35);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(parser38);
        org.junit.Assert.assertNotNull(parseSettings39);
        org.junit.Assert.assertNotNull(document40);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.ParseSettings parseSettings3 = null;
        org.jsoup.parser.Parser parser4 = parser0.settings(parseSettings3);
        org.jsoup.parser.ParseSettings parseSettings5 = parser0.settings();
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser0.settings(parseSettings6);
        org.jsoup.nodes.Document document10 = parser0.parseInput("", "hi!");
        org.jsoup.parser.Parser parser13 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings14 = null;
        org.jsoup.parser.Parser parser15 = parser13.settings(parseSettings14);
        org.jsoup.parser.Parser parser16 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings17 = null;
        org.jsoup.parser.Parser parser18 = parser16.settings(parseSettings17);
        org.jsoup.parser.ParseSettings parseSettings19 = null;
        org.jsoup.parser.Parser parser20 = parser16.settings(parseSettings19);
        org.jsoup.parser.Parser parser23 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document24 = org.jsoup.Jsoup.parse("hi!", "hi!", parser23);
        org.jsoup.parser.ParseSettings parseSettings25 = parser23.settings();
        org.jsoup.parser.Parser parser26 = parser16.settings(parseSettings25);
        org.jsoup.parser.Parser parser27 = parser15.settings(parseSettings25);
        org.jsoup.nodes.Document document28 = org.jsoup.Jsoup.parse("", "", parser27);
        org.jsoup.parser.Parser parser29 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings30 = null;
        org.jsoup.parser.Parser parser31 = parser29.settings(parseSettings30);
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        org.jsoup.parser.Parser parser33 = parser29.settings(parseSettings32);
        org.jsoup.parser.ParseSettings parseSettings34 = parser29.settings();
        org.jsoup.parser.ParseSettings parseSettings35 = null;
        org.jsoup.parser.Parser parser36 = parser29.settings(parseSettings35);
        org.jsoup.nodes.Document document39 = parser29.parseInput("", "hi!");
        org.jsoup.nodes.Document document42 = parser29.parseInput("", "hi!");
        org.jsoup.parser.Parser parser43 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings44 = null;
        org.jsoup.parser.Parser parser45 = parser43.settings(parseSettings44);
        org.jsoup.parser.ParseSettings parseSettings46 = null;
        org.jsoup.parser.Parser parser47 = parser43.settings(parseSettings46);
        org.jsoup.parser.Parser parser50 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document51 = org.jsoup.Jsoup.parse("hi!", "hi!", parser50);
        org.jsoup.parser.ParseSettings parseSettings52 = parser50.settings();
        org.jsoup.parser.Parser parser53 = parser43.settings(parseSettings52);
        org.jsoup.parser.Parser parser54 = parser29.settings(parseSettings52);
        boolean boolean55 = parser29.isTrackErrors();
        org.jsoup.parser.Parser parser56 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings57 = null;
        org.jsoup.parser.Parser parser58 = parser56.settings(parseSettings57);
        org.jsoup.parser.ParseSettings parseSettings59 = null;
        org.jsoup.parser.Parser parser60 = parser56.settings(parseSettings59);
        org.jsoup.parser.ParseSettings parseSettings61 = parser56.settings();
        org.jsoup.parser.ParseSettings parseSettings62 = null;
        org.jsoup.parser.Parser parser63 = parser56.settings(parseSettings62);
        org.jsoup.parser.Parser parser64 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.ParseSettings parseSettings65 = parser64.settings();
        org.jsoup.parser.Parser parser66 = parser56.settings(parseSettings65);
        org.jsoup.parser.Parser parser67 = parser29.settings(parseSettings65);
        org.jsoup.parser.Parser parser68 = parser27.settings(parseSettings65);
        org.jsoup.parser.Parser parser69 = parser0.settings(parseSettings65);
        org.jsoup.nodes.Document document72 = parser0.parseInput("", "hi!");
        org.jsoup.parser.ParseSettings parseSettings73 = parser0.settings();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser4);
        org.junit.Assert.assertNull(parseSettings5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(parser18);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(parseSettings25);
        org.junit.Assert.assertNotNull(parser26);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNull(parseSettings34);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(parser43);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(parser47);
        org.junit.Assert.assertNotNull(parser50);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertNotNull(parseSettings52);
        org.junit.Assert.assertNotNull(parser53);
        org.junit.Assert.assertNotNull(parser54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(parser56);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertNotNull(parser60);
        org.junit.Assert.assertNull(parseSettings61);
        org.junit.Assert.assertNotNull(parser63);
        org.junit.Assert.assertNotNull(parser64);
        org.junit.Assert.assertNotNull(parseSettings65);
        org.junit.Assert.assertNotNull(parser66);
        org.junit.Assert.assertNotNull(parser67);
        org.junit.Assert.assertNotNull(parser68);
        org.junit.Assert.assertNotNull(parser69);
        org.junit.Assert.assertNotNull(document72);
        org.junit.Assert.assertNotNull(parseSettings73);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings1 = null;
        org.jsoup.parser.Parser parser2 = parser0.settings(parseSettings1);
        org.jsoup.parser.Parser parser3 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings4 = null;
        org.jsoup.parser.Parser parser5 = parser3.settings(parseSettings4);
        org.jsoup.parser.ParseSettings parseSettings6 = null;
        org.jsoup.parser.Parser parser7 = parser3.settings(parseSettings6);
        org.jsoup.parser.Parser parser10 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document11 = org.jsoup.Jsoup.parse("hi!", "hi!", parser10);
        org.jsoup.parser.ParseSettings parseSettings12 = parser10.settings();
        org.jsoup.parser.Parser parser13 = parser3.settings(parseSettings12);
        org.jsoup.parser.Parser parser14 = parser2.settings(parseSettings12);
        org.jsoup.parser.Parser parser15 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings16 = null;
        org.jsoup.parser.Parser parser17 = parser15.settings(parseSettings16);
        org.jsoup.parser.ParseSettings parseSettings18 = null;
        org.jsoup.parser.Parser parser19 = parser15.settings(parseSettings18);
        org.jsoup.parser.ParseSettings parseSettings20 = parser15.settings();
        org.jsoup.parser.ParseSettings parseSettings21 = null;
        org.jsoup.parser.Parser parser22 = parser15.settings(parseSettings21);
        org.jsoup.nodes.Document document25 = parser15.parseInput("", "hi!");
        org.jsoup.nodes.Document document28 = parser15.parseInput("", "hi!");
        org.jsoup.parser.Parser parser29 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings30 = null;
        org.jsoup.parser.Parser parser31 = parser29.settings(parseSettings30);
        org.jsoup.parser.ParseSettings parseSettings32 = null;
        org.jsoup.parser.Parser parser33 = parser29.settings(parseSettings32);
        org.jsoup.parser.Parser parser34 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings35 = null;
        org.jsoup.parser.Parser parser36 = parser34.settings(parseSettings35);
        org.jsoup.nodes.Document document39 = parser36.parseInput("", "hi!");
        org.jsoup.parser.Parser parser42 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document43 = org.jsoup.Jsoup.parse("hi!", "hi!", parser42);
        org.jsoup.parser.ParseSettings parseSettings44 = parser42.settings();
        org.jsoup.parser.Parser parser45 = parser36.settings(parseSettings44);
        org.jsoup.parser.Parser parser46 = parser33.settings(parseSettings44);
        org.jsoup.parser.ParseSettings parseSettings47 = parser33.settings();
        org.jsoup.parser.Parser parser48 = parser15.settings(parseSettings47);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList49 = parser48.getErrors();
        org.jsoup.parser.Parser parser50 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings51 = null;
        org.jsoup.parser.Parser parser52 = parser50.settings(parseSettings51);
        org.jsoup.nodes.Document document55 = parser52.parseInput("", "hi!");
        org.jsoup.parser.Parser parser58 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document59 = org.jsoup.Jsoup.parse("hi!", "hi!", parser58);
        org.jsoup.parser.ParseSettings parseSettings60 = parser58.settings();
        org.jsoup.parser.Parser parser61 = parser52.settings(parseSettings60);
        java.util.List<org.jsoup.parser.ParseError> parseErrorList62 = parser61.getErrors();
        org.jsoup.parser.Parser parser63 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.ParseSettings parseSettings64 = parser63.settings();
        org.jsoup.parser.Parser parser65 = parser61.settings(parseSettings64);
        org.jsoup.parser.Parser parser66 = parser48.settings(parseSettings64);
        org.jsoup.parser.ParseSettings parseSettings67 = parser66.settings();
        org.jsoup.parser.Parser parser68 = parser2.settings(parseSettings67);
        org.jsoup.parser.Parser parser70 = parser68.setTrackErrors((-1));
        java.util.List<org.jsoup.parser.ParseError> parseErrorList71 = parser68.getErrors();
        org.jsoup.parser.Parser parser73 = parser68.setTrackErrors((int) (short) 10);
        org.jsoup.nodes.Document document76 = parser73.parseInput("", "");
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNotNull(parser7);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(parser13);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser15);
        org.junit.Assert.assertNotNull(parser17);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNull(parseSettings20);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(parser31);
        org.junit.Assert.assertNotNull(parser33);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(parser42);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertNotNull(parseSettings44);
        org.junit.Assert.assertNotNull(parser45);
        org.junit.Assert.assertNotNull(parser46);
        org.junit.Assert.assertNotNull(parseSettings47);
        org.junit.Assert.assertNotNull(parser48);
        org.junit.Assert.assertNotNull(parseErrorList49);
        org.junit.Assert.assertNotNull(parser50);
        org.junit.Assert.assertNotNull(parser52);
        org.junit.Assert.assertNotNull(document55);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertNotNull(document59);
        org.junit.Assert.assertNotNull(parseSettings60);
        org.junit.Assert.assertNotNull(parser61);
        org.junit.Assert.assertNotNull(parseErrorList62);
        org.junit.Assert.assertNotNull(parser63);
        org.junit.Assert.assertNotNull(parseSettings64);
        org.junit.Assert.assertNotNull(parser65);
        org.junit.Assert.assertNotNull(parser66);
        org.junit.Assert.assertNotNull(parseSettings67);
        org.junit.Assert.assertNotNull(parser68);
        org.junit.Assert.assertNotNull(parser70);
        org.junit.Assert.assertNull(parseErrorList71);
        org.junit.Assert.assertNotNull(parser73);
        org.junit.Assert.assertNotNull(document76);
    }
}

