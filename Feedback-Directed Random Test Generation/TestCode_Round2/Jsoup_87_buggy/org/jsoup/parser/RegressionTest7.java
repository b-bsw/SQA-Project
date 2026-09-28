package org.jsoup.parser;

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
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element6 = htmlTreeBuilder0.getHeadElement();
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.Token token8 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement10 = null;
        htmlTreeBuilder9.setFormElement(formElement10);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = org.jsoup.parser.HtmlTreeBuilderState.AfterAfterBody;
        htmlTreeBuilder9.transition(htmlTreeBuilderState12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = htmlTreeBuilder0.process(token8, htmlTreeBuilderState12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(element6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState12);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.nodes.Element element25 = element23.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = element25.dataset();
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean30 = tag29.isBlock();
        boolean boolean31 = tag29.isEmpty();
        boolean boolean32 = tag29.isFormListed();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag29, "");
        org.jsoup.parser.Tag tag37 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean38 = tag37.isBlock();
        boolean boolean39 = tag37.isEmpty();
        boolean boolean40 = tag37.isFormListed();
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element(tag37, "");
        org.jsoup.parser.Tag tag44 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean45 = tag44.isBlock();
        boolean boolean46 = tag44.isEmpty();
        boolean boolean47 = tag44.isFormListed();
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element(tag44, "");
        org.jsoup.nodes.Node[] nodeArray50 = new org.jsoup.nodes.Node[] { element42, element49 };
        org.jsoup.nodes.Element element51 = element34.insertChildren((int) (byte) 0, nodeArray50);
        org.jsoup.select.Elements elements52 = element51.previousElementSiblings();
        org.jsoup.nodes.Element element53 = element25.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements52);
        element53.setBaseUri("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap56 = element53.dataset();
        org.jsoup.parser.Tag tag58 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean59 = tag58.isBlock();
        boolean boolean60 = tag58.isEmpty();
        boolean boolean61 = tag58.isFormListed();
        org.jsoup.nodes.Element element63 = new org.jsoup.nodes.Element(tag58, "");
        org.jsoup.parser.Tag tag66 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean67 = tag66.isBlock();
        boolean boolean68 = tag66.isEmpty();
        boolean boolean69 = tag66.isFormListed();
        org.jsoup.nodes.Element element71 = new org.jsoup.nodes.Element(tag66, "");
        org.jsoup.parser.Tag tag73 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean74 = tag73.isBlock();
        boolean boolean75 = tag73.isEmpty();
        boolean boolean76 = tag73.isFormListed();
        org.jsoup.nodes.Element element78 = new org.jsoup.nodes.Element(tag73, "");
        org.jsoup.nodes.Node[] nodeArray79 = new org.jsoup.nodes.Node[] { element71, element78 };
        org.jsoup.nodes.Element element80 = element63.insertChildren((int) (byte) 0, nodeArray79);
        org.jsoup.select.Elements elements81 = element80.previousElementSiblings();
        java.lang.String str82 = element80.id();
        org.jsoup.nodes.Element element83 = element53.appendTo(element80);
        org.jsoup.nodes.Element element85 = element83.wrap("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.select.Elements elements88 = element85.getElementsByAttributeValueStarting("<hi!></hi!>\n<hi!></hi!>", "<hi!>\n <hi!></hi!>\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList89 = element85.childNodes();
        org.jsoup.nodes.Element element90 = element85.lastElementSibling();
        org.jsoup.nodes.Element element91 = element85.shallowClone();
        org.jsoup.nodes.Element element93 = element85.before("<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(nodeArray50);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(tag66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(tag73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(nodeArray79);
        org.junit.Assert.assertNotNull(element80);
        org.junit.Assert.assertNotNull(elements81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(element83);
        org.junit.Assert.assertNotNull(element85);
        org.junit.Assert.assertNotNull(elements88);
        org.junit.Assert.assertNotNull(nodeList89);
        org.junit.Assert.assertNull(element90);
        org.junit.Assert.assertNotNull(element91);
        org.junit.Assert.assertNotNull(element93);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.select.Elements elements24 = element23.previousElementSiblings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document26 = htmlTreeBuilder25.getDocument();
        boolean boolean27 = htmlTreeBuilder25.framesetOk();
        boolean boolean28 = htmlTreeBuilder25.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState29 = htmlTreeBuilder25.state();
        htmlTreeBuilder25.markInsertionMode();
        java.lang.String str31 = htmlTreeBuilder25.getBaseUri();
        htmlTreeBuilder25.setFosterInserts(true);
        org.jsoup.parser.Tag tag35 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean36 = tag35.isBlock();
        boolean boolean37 = tag35.isEmpty();
        boolean boolean38 = tag35.isFormListed();
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element(tag35, "");
        htmlTreeBuilder25.setHeadElement(element40);
        boolean boolean42 = element40.hasText();
        java.lang.String str43 = element40.tagName();
        java.lang.String str45 = element40.attr("");
        java.lang.String str46 = element40.html();
        org.jsoup.nodes.Node node47 = element40.previousSibling();
        org.jsoup.nodes.Element element48 = element23.appendTo(element40);
        java.util.List<org.jsoup.nodes.Node> nodeList49 = element23.childNodesCopy();
        org.jsoup.nodes.Element element50 = element23.nextElementSibling();
        org.jsoup.select.NodeVisitor nodeVisitor51 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node52 = element23.traverse(nodeVisitor51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertNull(element50);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.nodes.Element element33 = element13.text("hi!");
        org.jsoup.nodes.Node node35 = element33.removeAttr("hi!");
        org.jsoup.nodes.Element element37 = element33.val("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = element33.siblingNodes();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(nodeList38);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean7 = tag6.isBlock();
        boolean boolean8 = tag6.isEmpty();
        boolean boolean9 = tag6.isFormListed();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element(tag6, "");
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean15 = tag14.isBlock();
        boolean boolean16 = tag14.isEmpty();
        boolean boolean17 = tag14.isFormListed();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag14, "");
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean22 = tag21.isBlock();
        boolean boolean23 = tag21.isEmpty();
        boolean boolean24 = tag21.isFormListed();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag21, "");
        org.jsoup.nodes.Node[] nodeArray27 = new org.jsoup.nodes.Node[] { element19, element26 };
        org.jsoup.nodes.Element element28 = element11.insertChildren((int) (byte) 0, nodeArray27);
        org.jsoup.nodes.Element element30 = element28.html("");
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element28);
        java.lang.String str32 = element28.baseUri();
        java.lang.String str33 = element28.text();
        java.lang.String str34 = element28.outerHtml();
        java.lang.String str35 = element28.html();
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<hi!></hi!>" + "'", str34, "<hi!></hi!>");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = element15.hasText();
        java.lang.String str18 = element15.tagName();
        java.lang.String str20 = element15.attr("");
        java.lang.String str21 = element15.html();
        java.lang.String str22 = element15.wholeText();
        org.jsoup.nodes.Element element24 = element15.toggleClass("");
        boolean boolean25 = element15.hasText();
        org.jsoup.nodes.Element element27 = element15.tagName("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.select.Elements elements28 = element27.getAllElements();
        org.jsoup.nodes.Element element31 = element27.attr("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>", true);
        org.jsoup.select.Elements elements32 = element31.siblingElements();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(elements32);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        org.jsoup.nodes.Document document17 = element15.ownerDocument();
        boolean boolean18 = element15.hasText();
        org.jsoup.nodes.Node[] nodeArray20 = new org.jsoup.nodes.Node[] {};
        org.jsoup.nodes.Element element21 = element15.insertChildren(0, nodeArray20);
        java.lang.String str22 = element21.val();
        org.jsoup.nodes.Element element24 = element21.text("<hi!>\n <hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \"> \n  <hi!></hi!> \n  <hi!></hi!>hi! \n </hi!>\n</hi!>");
        java.lang.String str25 = element21.text();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeArray20);
        org.junit.Assert.assertArrayEquals(nodeArray20, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertNotNull(element21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<hi!> <hi! class=\"hi! <hi!> <hi!></hi!> </hi!> \"> <hi!></hi!> <hi!></hi!>hi! </hi!> </hi!>" + "'", str25, "<hi!> <hi! class=\"hi! <hi!> <hi!></hi!> </hi!> \"> <hi!></hi!> <hi!></hi!>hi! </hi!> </hi!>");
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        int int32 = element13.siblingIndex();
        org.jsoup.nodes.Node node33 = element13.nextSibling();
        org.jsoup.select.Elements elements35 = element13.getElementsByAttribute("<hi! class=\"\">\n hi!\n</hi!>");
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(elements35);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.nodes.Element element33 = element13.text("hi!");
        org.jsoup.nodes.Element element34 = element33.shallowClone();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList35 = element33.textNodes();
        org.jsoup.nodes.Element element36 = element33.empty();
        org.jsoup.nodes.Element element38 = element33.tagName("&lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;");
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(textNodeList35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList17 = element15.textNodes();
        org.jsoup.nodes.Element element19 = element15.tagName("hi!");
        java.lang.String str20 = element15.wholeText();
        org.jsoup.nodes.Element element23 = element15.attr("<hi!>\n <hi!></hi!>\n</hi!>", "<hi!></hi!>");
        org.jsoup.nodes.Element element25 = element23.appendText("<hi!></hi!>\n<hi!></hi!>\n<<hi!></hi!>\n<hi!></hi!>></<hi!></hi!>\n<hi!></hi!>>");
        java.lang.String str26 = element25.nodeName();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(textNodeList17);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.nodes.Element element25 = element6.toggleClass("");
        org.jsoup.nodes.Element element27 = element6.addClass("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.select.Elements elements29 = element6.getElementsContainingText("");
        org.jsoup.nodes.Element element30 = element6.clone();
        org.jsoup.nodes.Node node32 = element30.removeAttr("<hi!></hi!> \n<hi!></hi!>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.nodes.Element element32 = element13.clone();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList33 = element32.dataNodes();
        org.jsoup.nodes.Element element35 = element32.prepend("<<hi!>\n <hi!></hi!>\n</hi!> class=\"<hi!></hi!>\">\n &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n</<hi!>\n <hi!></hi!>\n</hi!>>");
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element32);
        org.junit.Assert.assertNotNull(dataNodeList33);
        org.junit.Assert.assertNotNull(element35);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean7 = tag6.isBlock();
        boolean boolean8 = tag6.isEmpty();
        boolean boolean9 = tag6.isFormListed();
        org.jsoup.nodes.Element element11 = new org.jsoup.nodes.Element(tag6, "");
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean15 = tag14.isBlock();
        boolean boolean16 = tag14.isEmpty();
        boolean boolean17 = tag14.isFormListed();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag14, "");
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean22 = tag21.isBlock();
        boolean boolean23 = tag21.isEmpty();
        boolean boolean24 = tag21.isFormListed();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag21, "");
        org.jsoup.nodes.Node[] nodeArray27 = new org.jsoup.nodes.Node[] { element19, element26 };
        org.jsoup.nodes.Element element28 = element11.insertChildren((int) (byte) 0, nodeArray27);
        org.jsoup.nodes.Element element30 = element28.html("");
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element28);
        java.lang.String str32 = element28.baseUri();
        java.lang.String str33 = element28.text();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder34 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document35 = htmlTreeBuilder34.getDocument();
        boolean boolean36 = htmlTreeBuilder34.framesetOk();
        boolean boolean37 = htmlTreeBuilder34.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState38 = htmlTreeBuilder34.state();
        htmlTreeBuilder34.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings40 = htmlTreeBuilder34.defaultSettings();
        org.jsoup.parser.Tag tag42 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean43 = tag42.isBlock();
        boolean boolean44 = tag42.isEmpty();
        boolean boolean45 = tag42.isFormListed();
        org.jsoup.nodes.Element element47 = new org.jsoup.nodes.Element(tag42, "");
        org.jsoup.parser.Tag tag50 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean51 = tag50.isBlock();
        boolean boolean52 = tag50.isEmpty();
        boolean boolean53 = tag50.isFormListed();
        org.jsoup.nodes.Element element55 = new org.jsoup.nodes.Element(tag50, "");
        org.jsoup.parser.Tag tag57 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean58 = tag57.isBlock();
        boolean boolean59 = tag57.isEmpty();
        boolean boolean60 = tag57.isFormListed();
        org.jsoup.nodes.Element element62 = new org.jsoup.nodes.Element(tag57, "");
        org.jsoup.nodes.Node[] nodeArray63 = new org.jsoup.nodes.Node[] { element55, element62 };
        org.jsoup.nodes.Element element64 = element47.insertChildren((int) (byte) 0, nodeArray63);
        boolean boolean65 = htmlTreeBuilder34.isSpecial(element47);
        org.jsoup.nodes.Element element67 = element47.text("hi!");
        org.jsoup.nodes.Element element68 = element67.shallowClone();
        org.jsoup.nodes.Element element71 = element68.attr("", "<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements73 = element71.getElementsContainingText("<hi!></hi!>\n<hi!></hi!>");
        boolean boolean74 = element28.equals((java.lang.Object) elements73);
        org.jsoup.nodes.Element element75 = element28.previousElementSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements78 = element28.getElementsByAttributeValue("<hi!>\n <hi!></hi!>\n <hi!></hi!>\n <<hi!></hi!> \n<hi!></hi!>></<hi!></hi!> \n<hi!></hi!>>\n</hi!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(document35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState38);
        org.junit.Assert.assertNotNull(parseSettings40);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(nodeArray63);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(element71);
        org.junit.Assert.assertNotNull(elements73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(element75);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.nodes.Element element25 = element23.tagName("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.select.Elements elements26 = element23.getAllElements();
        org.jsoup.select.Elements elements28 = element23.getElementsByTag("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.select.Elements elements29 = element23.nextElementSiblings();
        org.jsoup.nodes.Element element30 = element23.previousElementSibling();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNull(element30);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.jsoup.nodes.Element element1 = new org.jsoup.nodes.Element("hi!");
        org.jsoup.select.Elements elements2 = element1.siblingElements();
        org.jsoup.nodes.Element element3 = element1.shallowClone();
        org.jsoup.select.Elements elements4 = element3.nextElementSiblings();
        org.junit.Assert.assertNotNull(elements2);
        org.junit.Assert.assertNotNull(element3);
        org.junit.Assert.assertNotNull(elements4);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        java.util.regex.Pattern pattern18 = null;
        org.jsoup.select.Elements elements19 = element15.getElementsByAttributeValueMatching("<hi!></hi!>\n<hi!></hi!>", pattern18);
        java.lang.String str20 = element15.tagName();
        java.lang.Object obj21 = null;
        boolean boolean22 = element15.hasSameValue(obj21);
        org.jsoup.nodes.Node node23 = element15.parentNode();
        org.jsoup.select.Elements elements24 = element15.parents();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(elements24);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.nodes.Element element25 = element23.tagName("<hi!></hi!>\n<hi!></hi!>");
        java.lang.String str26 = element23.text();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.nodes.Element element25 = element6.toggleClass("");
        java.lang.String str26 = element6.html();
        boolean boolean28 = element6.hasClass("<hi!></hi!>");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder29 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document30 = htmlTreeBuilder29.getDocument();
        boolean boolean31 = htmlTreeBuilder29.framesetOk();
        boolean boolean32 = htmlTreeBuilder29.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState33 = htmlTreeBuilder29.state();
        htmlTreeBuilder29.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings35 = htmlTreeBuilder29.defaultSettings();
        org.jsoup.parser.Tag tag37 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean38 = tag37.isBlock();
        boolean boolean39 = tag37.isEmpty();
        boolean boolean40 = tag37.isFormListed();
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element(tag37, "");
        org.jsoup.parser.Tag tag45 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean46 = tag45.isBlock();
        boolean boolean47 = tag45.isEmpty();
        boolean boolean48 = tag45.isFormListed();
        org.jsoup.nodes.Element element50 = new org.jsoup.nodes.Element(tag45, "");
        org.jsoup.parser.Tag tag52 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean53 = tag52.isBlock();
        boolean boolean54 = tag52.isEmpty();
        boolean boolean55 = tag52.isFormListed();
        org.jsoup.nodes.Element element57 = new org.jsoup.nodes.Element(tag52, "");
        org.jsoup.nodes.Node[] nodeArray58 = new org.jsoup.nodes.Node[] { element50, element57 };
        org.jsoup.nodes.Element element59 = element42.insertChildren((int) (byte) 0, nodeArray58);
        boolean boolean60 = htmlTreeBuilder29.isSpecial(element42);
        org.jsoup.nodes.Element element62 = element42.text("hi!");
        org.jsoup.nodes.Element element63 = element62.shallowClone();
        org.jsoup.nodes.Element element64 = element62.previousElementSibling();
        org.jsoup.nodes.Element element66 = element62.getElementById("hi!");
        int int67 = element62.childNodeSize();
        org.jsoup.nodes.Element element69 = element62.val("hi!");
        java.lang.String str71 = element69.attr("hi!");
        boolean boolean72 = element6.hasSameValue((java.lang.Object) element69);
        java.lang.String str73 = element69.html();
        org.jsoup.nodes.Element element75 = element69.removeClass("<hi!></hi!>\n<hi!></hi!>\n<<hi!></hi!>\n<hi!></hi!>></<hi!></hi!>\n<hi!></hi!>>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<hi!></hi!>\n<hi!></hi!>" + "'", str26, "<hi!></hi!>\n<hi!></hi!>");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(document30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState33);
        org.junit.Assert.assertNotNull(parseSettings35);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(nodeArray58);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNull(element64);
        org.junit.Assert.assertNull(element66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(element69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertNotNull(element75);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.ForeignContent;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder2.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder2.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder2.state();
        boolean boolean7 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder2.state();
        htmlTreeBuilder2.setFosterInserts(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder11 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document12 = htmlTreeBuilder11.getDocument();
        boolean boolean13 = htmlTreeBuilder11.framesetOk();
        boolean boolean14 = htmlTreeBuilder11.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState15 = htmlTreeBuilder11.state();
        htmlTreeBuilder11.markInsertionMode();
        java.lang.String str17 = htmlTreeBuilder11.getBaseUri();
        htmlTreeBuilder11.setFosterInserts(true);
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean22 = tag21.isBlock();
        boolean boolean23 = tag21.isEmpty();
        boolean boolean24 = tag21.isFormListed();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag21, "");
        htmlTreeBuilder11.setHeadElement(element26);
        boolean boolean28 = element26.isBlock();
        org.jsoup.select.Elements elements31 = element26.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.select.Elements elements33 = element26.getElementsByIndexEquals((int) (byte) 100);
        org.jsoup.nodes.Element element35 = element26.text("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.nodes.Element element37 = element26.val("<hi!></hi!>\n<hi!></hi!>");
        boolean boolean38 = htmlTreeBuilder2.isSpecial(element26);
        htmlTreeBuilder2.framesetOk(true);
        boolean boolean41 = htmlTreeBuilder2.framesetOk();
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(elements31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.nodes.FormElement formElement3 = null;
        htmlTreeBuilder0.setFormElement(formElement3);
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder6.setFosterInserts(false);
        org.jsoup.nodes.Element element9 = null;
        htmlTreeBuilder6.setHeadElement(element9);
        org.jsoup.nodes.Element element11 = htmlTreeBuilder6.getHeadElement();
        org.jsoup.nodes.Element element12 = null;
        htmlTreeBuilder6.setHeadElement(element12);
        java.lang.String str14 = htmlTreeBuilder6.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder15 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document16 = htmlTreeBuilder15.getDocument();
        boolean boolean17 = htmlTreeBuilder15.framesetOk();
        boolean boolean18 = htmlTreeBuilder15.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder15.state();
        htmlTreeBuilder15.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState21 = org.jsoup.parser.HtmlTreeBuilderState.InColumnGroup;
        htmlTreeBuilder15.transition(htmlTreeBuilderState21);
        htmlTreeBuilder6.transition(htmlTreeBuilderState21);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.error(htmlTreeBuilderState21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertNull(element11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState19);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState21);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.nodes.Element element25 = element23.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = element25.dataset();
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean30 = tag29.isBlock();
        boolean boolean31 = tag29.isEmpty();
        boolean boolean32 = tag29.isFormListed();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag29, "");
        org.jsoup.parser.Tag tag37 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean38 = tag37.isBlock();
        boolean boolean39 = tag37.isEmpty();
        boolean boolean40 = tag37.isFormListed();
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element(tag37, "");
        org.jsoup.parser.Tag tag44 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean45 = tag44.isBlock();
        boolean boolean46 = tag44.isEmpty();
        boolean boolean47 = tag44.isFormListed();
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element(tag44, "");
        org.jsoup.nodes.Node[] nodeArray50 = new org.jsoup.nodes.Node[] { element42, element49 };
        org.jsoup.nodes.Element element51 = element34.insertChildren((int) (byte) 0, nodeArray50);
        org.jsoup.select.Elements elements52 = element51.previousElementSiblings();
        org.jsoup.nodes.Element element53 = element25.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements52);
        org.jsoup.nodes.Node node54 = element53.clearAttributes();
        boolean boolean56 = element53.hasAttr("");
        org.jsoup.nodes.Element element58 = element53.addClass("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.nodes.Node node60 = element53.removeAttr("<hi!>\n <hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \"> \n  <hi!></hi!> \n  <hi!></hi!>hi! \n </hi!>\n</hi!>");
        java.lang.String str61 = element53.val();
        int int62 = element53.elementSiblingIndex();
        org.jsoup.nodes.Node node63 = element53.nextSibling();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(nodeArray50);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(node63);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.nodes.Element element25 = element6.toggleClass("");
        java.lang.String str26 = element25.tagName();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList27 = element25.textNodes();
        org.jsoup.nodes.Element element29 = element25.appendElement("hi!");
        java.lang.String str30 = element29.toString();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder31 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document32 = htmlTreeBuilder31.getDocument();
        boolean boolean33 = htmlTreeBuilder31.framesetOk();
        boolean boolean34 = htmlTreeBuilder31.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState35 = htmlTreeBuilder31.state();
        htmlTreeBuilder31.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings37 = htmlTreeBuilder31.defaultSettings();
        org.jsoup.parser.Tag tag39 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean40 = tag39.isBlock();
        boolean boolean41 = tag39.isEmpty();
        boolean boolean42 = tag39.isFormListed();
        org.jsoup.nodes.Element element44 = new org.jsoup.nodes.Element(tag39, "");
        org.jsoup.parser.Tag tag47 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean48 = tag47.isBlock();
        boolean boolean49 = tag47.isEmpty();
        boolean boolean50 = tag47.isFormListed();
        org.jsoup.nodes.Element element52 = new org.jsoup.nodes.Element(tag47, "");
        org.jsoup.parser.Tag tag54 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean55 = tag54.isBlock();
        boolean boolean56 = tag54.isEmpty();
        boolean boolean57 = tag54.isFormListed();
        org.jsoup.nodes.Element element59 = new org.jsoup.nodes.Element(tag54, "");
        org.jsoup.nodes.Node[] nodeArray60 = new org.jsoup.nodes.Node[] { element52, element59 };
        org.jsoup.nodes.Element element61 = element44.insertChildren((int) (byte) 0, nodeArray60);
        boolean boolean62 = htmlTreeBuilder31.isSpecial(element44);
        org.jsoup.nodes.Element element63 = element29.after((org.jsoup.nodes.Node) element44);
        org.jsoup.nodes.Element element64 = element29.parent();
        int int65 = element29.childNodeSize();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(textNodeList27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<hi!></hi!>" + "'", str30, "<hi!></hi!>");
        org.junit.Assert.assertNull(document32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState35);
        org.junit.Assert.assertNotNull(parseSettings37);
        org.junit.Assert.assertNotNull(tag39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(tag54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(nodeArray60);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(element63);
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.nodes.Element element33 = element13.text("hi!");
        org.jsoup.nodes.Element element34 = element33.shallowClone();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = element34.dataset();
        org.jsoup.parser.Tag tag37 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean38 = tag37.isBlock();
        boolean boolean39 = tag37.isEmpty();
        boolean boolean40 = tag37.isFormListed();
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element(tag37, "");
        org.jsoup.parser.Tag tag45 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean46 = tag45.isBlock();
        boolean boolean47 = tag45.isEmpty();
        boolean boolean48 = tag45.isFormListed();
        org.jsoup.nodes.Element element50 = new org.jsoup.nodes.Element(tag45, "");
        org.jsoup.parser.Tag tag52 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean53 = tag52.isBlock();
        boolean boolean54 = tag52.isEmpty();
        boolean boolean55 = tag52.isFormListed();
        org.jsoup.nodes.Element element57 = new org.jsoup.nodes.Element(tag52, "");
        org.jsoup.nodes.Node[] nodeArray58 = new org.jsoup.nodes.Node[] { element50, element57 };
        org.jsoup.nodes.Element element59 = element42.insertChildren((int) (byte) 0, nodeArray58);
        org.jsoup.nodes.Element element61 = element59.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap62 = element61.dataset();
        org.jsoup.parser.Tag tag65 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean66 = tag65.isBlock();
        boolean boolean67 = tag65.isEmpty();
        boolean boolean68 = tag65.isFormListed();
        org.jsoup.nodes.Element element70 = new org.jsoup.nodes.Element(tag65, "");
        org.jsoup.parser.Tag tag73 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean74 = tag73.isBlock();
        boolean boolean75 = tag73.isEmpty();
        boolean boolean76 = tag73.isFormListed();
        org.jsoup.nodes.Element element78 = new org.jsoup.nodes.Element(tag73, "");
        org.jsoup.parser.Tag tag80 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean81 = tag80.isBlock();
        boolean boolean82 = tag80.isEmpty();
        boolean boolean83 = tag80.isFormListed();
        org.jsoup.nodes.Element element85 = new org.jsoup.nodes.Element(tag80, "");
        org.jsoup.nodes.Node[] nodeArray86 = new org.jsoup.nodes.Node[] { element78, element85 };
        org.jsoup.nodes.Element element87 = element70.insertChildren((int) (byte) 0, nodeArray86);
        org.jsoup.select.Elements elements88 = element87.previousElementSiblings();
        org.jsoup.nodes.Element element89 = element61.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements88);
        element89.setBaseUri("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap92 = element89.dataset();
        org.jsoup.nodes.Element element93 = element34.appendChild((org.jsoup.nodes.Node) element89);
        org.jsoup.nodes.Node node94 = element89.clearAttributes();
        org.jsoup.parser.Tag tag95 = element89.tag();
        boolean boolean96 = tag95.isBlock();
        boolean boolean97 = tag95.canContainBlock();
        java.lang.String str98 = tag95.toString();
        boolean boolean99 = tag95.isInline();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(nodeArray58);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertNotNull(tag65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(tag73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(tag80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(nodeArray86);
        org.junit.Assert.assertNotNull(element87);
        org.junit.Assert.assertNotNull(elements88);
        org.junit.Assert.assertNotNull(element89);
        org.junit.Assert.assertNotNull(strMap92);
        org.junit.Assert.assertNotNull(element93);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertNotNull(tag95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "hi!" + "'", str98, "hi!");
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = element15.hasText();
        java.lang.String str18 = element15.tagName();
        java.lang.String str20 = element15.attr("");
        java.lang.String str21 = element15.html();
        java.lang.String str22 = element15.wholeText();
        org.jsoup.nodes.Element element24 = element15.toggleClass("");
        boolean boolean25 = element15.hasText();
        org.jsoup.nodes.Element element27 = element15.tagName("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.select.Elements elements29 = element27.getElementsByIndexEquals((int) (short) 1);
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(elements29);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.Tag tag7 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean8 = tag7.isBlock();
        boolean boolean9 = tag7.isEmpty();
        boolean boolean10 = tag7.isFormListed();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag7, "");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document14 = htmlTreeBuilder13.getDocument();
        boolean boolean15 = htmlTreeBuilder13.framesetOk();
        boolean boolean16 = htmlTreeBuilder13.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState17 = htmlTreeBuilder13.state();
        htmlTreeBuilder13.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings19 = htmlTreeBuilder13.defaultSettings();
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean22 = tag21.isBlock();
        boolean boolean23 = tag21.isEmpty();
        boolean boolean24 = tag21.isFormListed();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag21, "");
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean30 = tag29.isBlock();
        boolean boolean31 = tag29.isEmpty();
        boolean boolean32 = tag29.isFormListed();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag29, "");
        org.jsoup.parser.Tag tag36 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean37 = tag36.isBlock();
        boolean boolean38 = tag36.isEmpty();
        boolean boolean39 = tag36.isFormListed();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag36, "");
        org.jsoup.nodes.Node[] nodeArray42 = new org.jsoup.nodes.Node[] { element34, element41 };
        org.jsoup.nodes.Element element43 = element26.insertChildren((int) (byte) 0, nodeArray42);
        boolean boolean44 = htmlTreeBuilder13.isSpecial(element26);
        org.jsoup.nodes.Element element46 = element26.text("hi!");
        org.jsoup.nodes.Element element47 = element46.shallowClone();
        java.util.Map<java.lang.String, java.lang.String> strMap48 = element47.dataset();
        boolean boolean49 = element12.hasSameValue((java.lang.Object) strMap48);
        org.jsoup.select.Elements elements51 = element12.getElementsByIndexGreaterThan((int) (short) 1);
        java.util.regex.Pattern pattern53 = null;
        org.jsoup.select.Elements elements54 = element12.getElementsByAttributeValueMatching("<hi!>\n <hi!></hi!>\n</hi!>", pattern53);
        org.jsoup.nodes.Element element56 = element12.addClass("<hi!>\n &lt;hi!&gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &lt;/hi!&gt;\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.removeFromActiveFormattingElements(element12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(element3);
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertNotNull(tag7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState17);
        org.junit.Assert.assertNotNull(parseSettings19);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(nodeArray42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element47);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(elements51);
        org.junit.Assert.assertNotNull(elements54);
        org.junit.Assert.assertNotNull(element56);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.Element element18 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.select.Elements elements19 = element18.children();
        java.util.regex.Pattern pattern21 = null;
        org.jsoup.select.Elements elements22 = element18.getElementsByAttributeValueMatching("<hi!> <hi! class=\"hi! <hi!> <hi!></hi!> </hi!> \"> <hi!></hi!> <hi!></hi!>hi! </hi!> </hi!>", pattern21);
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(element18);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(elements22);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.preserveWhitespace();
        org.jsoup.nodes.Attributes attributes6 = null;
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag1, "", attributes6);
        org.jsoup.nodes.Element element9 = element7.prependText("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements12 = element7.getElementsByAttributeValue("<hi!></hi!>", "<hi!></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element14 = element7.selectFirst("<hi! value=\"hi!.hi!.<hi!>.<hi!></hi!>.</hi!>\"></hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! value=\"hi!.hi!.<hi!>.<hi!></hi!>.</hi!>\"></hi!>': unexpected token at '<hi! value=\"hi!.hi!.<hi!>.<hi!></hi!>.</hi!>\"></hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(element9);
        org.junit.Assert.assertNotNull(elements12);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("<hi! class=\"<<hi! class=&quot;&quot;>\n hi!\n</hi!>></<hi! class=&quot;&quot;>\n hi!\n</hi!>>\">\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(tag1);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.parser.Tag tag32 = element13.tag();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder33 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document34 = htmlTreeBuilder33.getDocument();
        boolean boolean35 = htmlTreeBuilder33.framesetOk();
        boolean boolean36 = htmlTreeBuilder33.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState37 = htmlTreeBuilder33.state();
        htmlTreeBuilder33.markInsertionMode();
        java.lang.String str39 = htmlTreeBuilder33.getBaseUri();
        htmlTreeBuilder33.setFosterInserts(true);
        org.jsoup.parser.Tag tag43 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean44 = tag43.isBlock();
        boolean boolean45 = tag43.isEmpty();
        boolean boolean46 = tag43.isFormListed();
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element(tag43, "");
        htmlTreeBuilder33.setHeadElement(element48);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList50 = element48.textNodes();
        org.jsoup.nodes.Element element52 = element48.tagName("hi!");
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "<hi!>\n <hi!></hi!>\n</hi!>", "" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        org.jsoup.nodes.Element element59 = element48.classNames((java.util.Set<java.lang.String>) strSet57);
        org.jsoup.nodes.Element element60 = element13.classNames((java.util.Set<java.lang.String>) strSet57);
        java.lang.String str61 = element13.nodeName();
        org.jsoup.nodes.Element element64 = element13.attr("hi!", true);
        org.jsoup.nodes.Element element65 = element64.empty();
        java.lang.String str66 = element64.ownText();
        org.jsoup.select.Elements elements68 = element64.getElementsByIndexLessThan((int) (short) 0);
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNull(document34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(textNodeList50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "hi!", "<hi!>\n <hi!></hi!>\n</hi!>", "" });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(element64);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(elements68);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.nodes.Element element25 = element23.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = element25.dataset();
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean30 = tag29.isBlock();
        boolean boolean31 = tag29.isEmpty();
        boolean boolean32 = tag29.isFormListed();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag29, "");
        org.jsoup.parser.Tag tag37 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean38 = tag37.isBlock();
        boolean boolean39 = tag37.isEmpty();
        boolean boolean40 = tag37.isFormListed();
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element(tag37, "");
        org.jsoup.parser.Tag tag44 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean45 = tag44.isBlock();
        boolean boolean46 = tag44.isEmpty();
        boolean boolean47 = tag44.isFormListed();
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element(tag44, "");
        org.jsoup.nodes.Node[] nodeArray50 = new org.jsoup.nodes.Node[] { element42, element49 };
        org.jsoup.nodes.Element element51 = element34.insertChildren((int) (byte) 0, nodeArray50);
        org.jsoup.select.Elements elements52 = element51.previousElementSiblings();
        org.jsoup.nodes.Element element53 = element25.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements52);
        org.jsoup.nodes.Node node54 = element53.clearAttributes();
        boolean boolean56 = element53.hasAttr("");
        org.jsoup.nodes.Element element58 = element53.addClass("<hi!></hi!>\n<hi!></hi!>");
        boolean boolean60 = element58.hasAttr("");
        java.lang.String str61 = element58.className();
        org.jsoup.select.Elements elements64 = element58.getElementsByAttributeValueStarting("<hi! class=\"\">\n <hi!></hi!>\n <hi!></hi!>\n</hi!>", "<hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \">\n <hi!></hi!>\n <hi!></hi!>hi!\n</hi!>");
        int int65 = element58.elementSiblingIndex();
        org.jsoup.select.Elements elements66 = element58.children();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(nodeArray50);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "<hi!></hi!>\n<hi!></hi!>" + "'", str61, "<hi!></hi!>\n<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(elements66);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = element15.isBlock();
        org.jsoup.select.Elements elements20 = element15.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.select.Elements elements22 = element15.getElementsByIndexEquals((int) (byte) 100);
        org.jsoup.nodes.Element element24 = element15.text("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.nodes.Element element26 = element15.val("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.nodes.Element element29 = element26.attr("<hi!></hi!>\n<hi!></hi!>", true);
        java.lang.String str30 = element29.cssSelector();
        org.jsoup.nodes.Element element32 = element29.appendText("<hi!></hi!>\n<hi!></hi!>\n<<hi!></hi!>\n<hi!></hi!>></<hi!></hi!>\n<hi!></hi!>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements34 = element32.select("<hi! class=\"<<hi! class=&quot;&quot;>\n hi!\n</hi!>></<hi! class=&quot;&quot;>\n hi!\n</hi!>>\">\n <hi!></hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type org.jsoup.select.Selector.SelectorParseException; message: Could not parse query '<hi! class=\"<<hi! class=&quot;&quot;>? hi!?</hi!>></<hi! class=&quot;&quot;>? hi!?</hi!>>\">? <hi!></hi!>?</hi!>': unexpected token at '<hi! class=\"<<hi! class=&quot;&quot;>? hi!?</hi!>></<hi! class=&quot;&quot;>? hi!?</hi!>>\">? <hi!></hi!>?</hi!>'");
        } catch (org.jsoup.select.Selector.SelectorParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(elements20);
        org.junit.Assert.assertNotNull(elements22);
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(element32);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.select.Elements elements24 = element23.previousElementSiblings();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document26 = htmlTreeBuilder25.getDocument();
        boolean boolean27 = htmlTreeBuilder25.framesetOk();
        boolean boolean28 = htmlTreeBuilder25.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState29 = htmlTreeBuilder25.state();
        htmlTreeBuilder25.markInsertionMode();
        java.lang.String str31 = htmlTreeBuilder25.getBaseUri();
        htmlTreeBuilder25.setFosterInserts(true);
        org.jsoup.parser.Tag tag35 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean36 = tag35.isBlock();
        boolean boolean37 = tag35.isEmpty();
        boolean boolean38 = tag35.isFormListed();
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element(tag35, "");
        htmlTreeBuilder25.setHeadElement(element40);
        boolean boolean42 = element40.hasText();
        java.lang.String str43 = element40.tagName();
        java.lang.String str45 = element40.attr("");
        java.lang.String str46 = element40.html();
        org.jsoup.nodes.Node node47 = element40.previousSibling();
        org.jsoup.nodes.Element element48 = element23.appendTo(element40);
        org.jsoup.nodes.Element element49 = element23.previousElementSibling();
        org.jsoup.nodes.Element element51 = element23.removeClass("");
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList52 = element23.dataNodes();
        org.jsoup.parser.Tag tag55 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean56 = tag55.isBlock();
        boolean boolean57 = tag55.isEmpty();
        boolean boolean58 = tag55.isFormListed();
        org.jsoup.nodes.Element element60 = new org.jsoup.nodes.Element(tag55, "");
        org.jsoup.select.Elements elements61 = element60.nextElementSiblings();
        org.jsoup.nodes.Element element62 = element23.insertChildren((int) (byte) 1, (java.util.Collection<org.jsoup.nodes.Element>) elements61);
        org.jsoup.select.Elements elements64 = element23.getElementsByIndexEquals((int) (short) 100);
        org.jsoup.nodes.Element element65 = element23.shallowClone();
        org.jsoup.nodes.Element element66 = element65.empty();
        java.lang.String str67 = element65.nodeName();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(tag35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNull(element49);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(dataNodeList52);
        org.junit.Assert.assertNotNull(tag55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(elements64);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.io.Reader reader4 = null;
        org.jsoup.parser.Parser parser6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader4, "<<hi!></hi!>\n<hi!></hi!>></<hi!></hi!>\n<hi!></hi!>>", parser6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = org.jsoup.parser.HtmlTreeBuilderState.AfterAfterFrameset;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder6.getDocument();
        boolean boolean8 = htmlTreeBuilder6.framesetOk();
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder6.state();
        htmlTreeBuilder6.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings12 = htmlTreeBuilder6.defaultSettings();
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean15 = tag14.isBlock();
        boolean boolean16 = tag14.isEmpty();
        boolean boolean17 = tag14.isFormListed();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag14, "");
        org.jsoup.parser.Tag tag22 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean23 = tag22.isBlock();
        boolean boolean24 = tag22.isEmpty();
        boolean boolean25 = tag22.isFormListed();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag22, "");
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean30 = tag29.isBlock();
        boolean boolean31 = tag29.isEmpty();
        boolean boolean32 = tag29.isFormListed();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag29, "");
        org.jsoup.nodes.Node[] nodeArray35 = new org.jsoup.nodes.Node[] { element27, element34 };
        org.jsoup.nodes.Element element36 = element19.insertChildren((int) (byte) 0, nodeArray35);
        boolean boolean37 = htmlTreeBuilder6.isSpecial(element19);
        org.jsoup.nodes.Element element39 = element19.text("hi!");
        org.jsoup.nodes.Element element40 = element39.shallowClone();
        org.jsoup.select.Elements elements42 = element39.getElementsContainingOwnText("hi!");
        boolean boolean43 = htmlTreeBuilder0.isSpecial(element39);
        org.jsoup.nodes.FormElement formElement44 = null;
        htmlTreeBuilder0.setFormElement(formElement44);
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNotNull(parseSettings12);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(nodeArray35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(elements42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean7 = tag6.isBlock();
        boolean boolean8 = tag6.isEmpty();
        boolean boolean9 = tag6.preserveWhitespace();
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag6, "", attributes11);
        org.jsoup.nodes.Element element14 = element12.prependText("<hi!>\n <hi!></hi!>\n</hi!>");
        boolean boolean15 = htmlTreeBuilder0.isSpecial(element14);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder16 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document17 = htmlTreeBuilder16.getDocument();
        boolean boolean18 = htmlTreeBuilder16.framesetOk();
        boolean boolean19 = htmlTreeBuilder16.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState20 = htmlTreeBuilder16.state();
        htmlTreeBuilder16.markInsertionMode();
        java.lang.String str22 = htmlTreeBuilder16.getBaseUri();
        htmlTreeBuilder16.setFosterInserts(true);
        org.jsoup.parser.Tag tag26 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean27 = tag26.isBlock();
        boolean boolean28 = tag26.isEmpty();
        boolean boolean29 = tag26.isFormListed();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag26, "");
        htmlTreeBuilder16.setHeadElement(element31);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList33 = element31.textNodes();
        org.jsoup.nodes.Element element35 = element31.tagName("hi!");
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "<hi!>\n <hi!></hi!>\n</hi!>", "" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.jsoup.nodes.Element element42 = element31.classNames((java.util.Set<java.lang.String>) strSet40);
        org.jsoup.nodes.Element element43 = element14.classNames((java.util.Set<java.lang.String>) strSet40);
        int int44 = element43.elementSiblingIndex();
        org.jsoup.select.Elements elements45 = element43.parents();
        boolean boolean47 = element43.hasClass("<hi! class=\"\">\n <hi!></hi!>\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(textNodeList33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!", "<hi!>\n <hi!></hi!>\n</hi!>", "" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.nodes.Element element33 = element13.text("hi!");
        org.jsoup.nodes.Element element34 = element33.shallowClone();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = element34.dataset();
        java.util.regex.Pattern pattern37 = null;
        org.jsoup.select.Elements elements38 = element34.getElementsByAttributeValueMatching("", pattern37);
        org.jsoup.nodes.Element element40 = element34.tagName("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Node node41 = element34.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element43 = element34.child((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNull(node41);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = element15.hasText();
        java.lang.String str18 = element15.tagName();
        java.lang.String str20 = element15.attr("");
        java.lang.String str21 = element15.html();
        java.util.Set<java.lang.String> strSet22 = element15.classNames();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder23 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document24 = htmlTreeBuilder23.getDocument();
        boolean boolean25 = htmlTreeBuilder23.framesetOk();
        boolean boolean26 = htmlTreeBuilder23.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState27 = htmlTreeBuilder23.state();
        htmlTreeBuilder23.markInsertionMode();
        java.lang.String str29 = htmlTreeBuilder23.getBaseUri();
        org.jsoup.nodes.FormElement formElement30 = htmlTreeBuilder23.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings31 = htmlTreeBuilder23.defaultSettings();
        boolean boolean32 = element15.equals((java.lang.Object) htmlTreeBuilder23);
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(formElement30);
        org.junit.Assert.assertNotNull(parseSettings31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        boolean boolean12 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Tag tag14 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean15 = tag14.isBlock();
        boolean boolean16 = tag14.isEmpty();
        boolean boolean17 = tag14.isFormListed();
        org.jsoup.nodes.Element element19 = new org.jsoup.nodes.Element(tag14, "");
        org.jsoup.parser.Tag tag22 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean23 = tag22.isBlock();
        boolean boolean24 = tag22.isEmpty();
        boolean boolean25 = tag22.isFormListed();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag22, "");
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean30 = tag29.isBlock();
        boolean boolean31 = tag29.isEmpty();
        boolean boolean32 = tag29.isFormListed();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag29, "");
        org.jsoup.nodes.Node[] nodeArray35 = new org.jsoup.nodes.Node[] { element27, element34 };
        org.jsoup.nodes.Element element36 = element19.insertChildren((int) (byte) 0, nodeArray35);
        org.jsoup.nodes.Element element38 = element19.toggleClass("");
        java.lang.String str39 = element38.tagName();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList40 = element38.textNodes();
        org.jsoup.nodes.Element element42 = element38.appendElement("hi!");
        org.jsoup.nodes.Element element44 = element38.appendText("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList45 = element38.childNodes();
        htmlTreeBuilder0.setHeadElement(element38);
        org.jsoup.nodes.Element element47 = htmlTreeBuilder0.getHeadElement();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(nodeArray35);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(textNodeList40);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertNotNull(element47);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.nodes.Element element25 = element23.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = element25.dataset();
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean30 = tag29.isBlock();
        boolean boolean31 = tag29.isEmpty();
        boolean boolean32 = tag29.isFormListed();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag29, "");
        org.jsoup.parser.Tag tag37 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean38 = tag37.isBlock();
        boolean boolean39 = tag37.isEmpty();
        boolean boolean40 = tag37.isFormListed();
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element(tag37, "");
        org.jsoup.parser.Tag tag44 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean45 = tag44.isBlock();
        boolean boolean46 = tag44.isEmpty();
        boolean boolean47 = tag44.isFormListed();
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element(tag44, "");
        org.jsoup.nodes.Node[] nodeArray50 = new org.jsoup.nodes.Node[] { element42, element49 };
        org.jsoup.nodes.Element element51 = element34.insertChildren((int) (byte) 0, nodeArray50);
        org.jsoup.select.Elements elements52 = element51.previousElementSiblings();
        org.jsoup.nodes.Element element53 = element25.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements52);
        element53.setBaseUri("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap56 = element53.dataset();
        org.jsoup.nodes.Element element57 = element53.nextElementSibling();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(nodeArray50);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNull(element57);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.ForeignContent;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder2.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder2.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder2.state();
        boolean boolean7 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder2.state();
        htmlTreeBuilder2.setFosterInserts(true);
        java.util.List<java.lang.String> strList11 = htmlTreeBuilder2.getPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = htmlTreeBuilder2.inTableScope("<hi!>\n <<hi!>\n <hi!></hi!>\n</hi!>>\n  hi!\n </<hi!>\n <hi!></hi!>\n</hi!>>\n <hi!></hi!>\n <hi!></hi!>\n <<hi!></hi!>\n<hi!></hi!>></<hi!></hi!>\n<hi!></hi!>>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNull(strList11);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.nodes.Element element25 = element23.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = element25.dataset();
        org.jsoup.parser.Tag tag29 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean30 = tag29.isBlock();
        boolean boolean31 = tag29.isEmpty();
        boolean boolean32 = tag29.isFormListed();
        org.jsoup.nodes.Element element34 = new org.jsoup.nodes.Element(tag29, "");
        org.jsoup.parser.Tag tag37 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean38 = tag37.isBlock();
        boolean boolean39 = tag37.isEmpty();
        boolean boolean40 = tag37.isFormListed();
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element(tag37, "");
        org.jsoup.parser.Tag tag44 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean45 = tag44.isBlock();
        boolean boolean46 = tag44.isEmpty();
        boolean boolean47 = tag44.isFormListed();
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element(tag44, "");
        org.jsoup.nodes.Node[] nodeArray50 = new org.jsoup.nodes.Node[] { element42, element49 };
        org.jsoup.nodes.Element element51 = element34.insertChildren((int) (byte) 0, nodeArray50);
        org.jsoup.select.Elements elements52 = element51.previousElementSiblings();
        org.jsoup.nodes.Element element53 = element25.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements52);
        element53.setBaseUri("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap56 = element53.dataset();
        org.jsoup.parser.Tag tag58 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean59 = tag58.isBlock();
        boolean boolean60 = tag58.isEmpty();
        boolean boolean61 = tag58.isFormListed();
        org.jsoup.nodes.Element element63 = new org.jsoup.nodes.Element(tag58, "");
        org.jsoup.parser.Tag tag66 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean67 = tag66.isBlock();
        boolean boolean68 = tag66.isEmpty();
        boolean boolean69 = tag66.isFormListed();
        org.jsoup.nodes.Element element71 = new org.jsoup.nodes.Element(tag66, "");
        org.jsoup.parser.Tag tag73 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean74 = tag73.isBlock();
        boolean boolean75 = tag73.isEmpty();
        boolean boolean76 = tag73.isFormListed();
        org.jsoup.nodes.Element element78 = new org.jsoup.nodes.Element(tag73, "");
        org.jsoup.nodes.Node[] nodeArray79 = new org.jsoup.nodes.Node[] { element71, element78 };
        org.jsoup.nodes.Element element80 = element63.insertChildren((int) (byte) 0, nodeArray79);
        org.jsoup.select.Elements elements81 = element80.previousElementSiblings();
        java.lang.String str82 = element80.id();
        org.jsoup.nodes.Element element83 = element53.appendTo(element80);
        boolean boolean84 = element80.hasText();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(tag29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tag44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(nodeArray50);
        org.junit.Assert.assertNotNull(element51);
        org.junit.Assert.assertNotNull(elements52);
        org.junit.Assert.assertNotNull(element53);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(tag58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(tag66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(tag73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(nodeArray79);
        org.junit.Assert.assertNotNull(element80);
        org.junit.Assert.assertNotNull(elements81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(element83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = element15.hasText();
        java.lang.String str18 = element15.tagName();
        java.lang.String str20 = element15.attr("");
        java.lang.String str21 = element15.html();
        java.lang.String str22 = element15.wholeText();
        java.lang.String str23 = element15.toString();
        org.jsoup.select.Elements elements24 = element15.siblingElements();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList25 = element15.dataNodes();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<hi!></hi!>" + "'", str23, "<hi!></hi!>");
        org.junit.Assert.assertNotNull(elements24);
        org.junit.Assert.assertNotNull(dataNodeList25);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.Tag tag5 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean6 = tag5.isBlock();
        boolean boolean7 = tag5.isEmpty();
        boolean boolean8 = tag5.isFormListed();
        org.jsoup.nodes.Element element10 = new org.jsoup.nodes.Element(tag5, "");
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean14 = tag13.isBlock();
        boolean boolean15 = tag13.isEmpty();
        boolean boolean16 = tag13.isFormListed();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag13, "");
        org.jsoup.parser.Tag tag20 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean21 = tag20.isBlock();
        boolean boolean22 = tag20.isEmpty();
        boolean boolean23 = tag20.isFormListed();
        org.jsoup.nodes.Element element25 = new org.jsoup.nodes.Element(tag20, "");
        org.jsoup.nodes.Node[] nodeArray26 = new org.jsoup.nodes.Node[] { element18, element25 };
        org.jsoup.nodes.Element element27 = element10.insertChildren((int) (byte) 0, nodeArray26);
        org.jsoup.nodes.Element element29 = element10.toggleClass("");
        java.lang.String str31 = element29.absUrl("<hi!>\n <hi!></hi!>\n</hi!>");
        htmlTreeBuilder0.setHeadElement(element29);
        org.jsoup.parser.Tag tag34 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean35 = tag34.isBlock();
        boolean boolean36 = tag34.isEmpty();
        boolean boolean37 = tag34.isFormListed();
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element(tag34, "");
        org.jsoup.parser.Tag tag42 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean43 = tag42.isBlock();
        boolean boolean44 = tag42.isEmpty();
        boolean boolean45 = tag42.isFormListed();
        org.jsoup.nodes.Element element47 = new org.jsoup.nodes.Element(tag42, "");
        org.jsoup.parser.Tag tag49 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean50 = tag49.isBlock();
        boolean boolean51 = tag49.isEmpty();
        boolean boolean52 = tag49.isFormListed();
        org.jsoup.nodes.Element element54 = new org.jsoup.nodes.Element(tag49, "");
        org.jsoup.nodes.Node[] nodeArray55 = new org.jsoup.nodes.Node[] { element47, element54 };
        org.jsoup.nodes.Element element56 = element39.insertChildren((int) (byte) 0, nodeArray55);
        org.jsoup.nodes.Element element58 = element39.toggleClass("");
        org.jsoup.select.Elements elements60 = element39.getElementsMatchingOwnText("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.nodes.Element element61 = element39.previousElementSibling();
        org.jsoup.select.Elements elements63 = element39.getElementsMatchingText("<hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \">\n <hi!></hi!>\n <hi!></hi!>hi!\n</hi!>");
        boolean boolean64 = htmlTreeBuilder0.isSpecial(element39);
        java.io.Reader reader65 = null;
        org.jsoup.parser.Parser parser67 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.initialiseParse(reader65, "<hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \">\n <hi!></hi!>\n <hi!></hi!>hi!\n</hi!>", parser67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String input must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tag20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodeArray26);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(element29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(tag34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(tag49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(nodeArray55);
        org.junit.Assert.assertNotNull(element56);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertNotNull(elements60);
        org.junit.Assert.assertNull(element61);
        org.junit.Assert.assertNotNull(elements63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.FormElement formElement2 = null;
        htmlTreeBuilder0.setFormElement(formElement2);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.generateImpliedEndTags("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(elementList4);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = element15.hasText();
        java.lang.String str18 = element15.tagName();
        java.lang.String str20 = element15.attr("");
        org.jsoup.nodes.Element element22 = element15.prependElement("hi!");
        int int23 = element15.elementSiblingIndex();
        org.jsoup.nodes.Element element25 = element15.prepend("<hi!>\n <hi!></hi!>\n</hi!>");
        boolean boolean26 = element15.hasParent();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder28 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document29 = htmlTreeBuilder28.getDocument();
        boolean boolean30 = htmlTreeBuilder28.framesetOk();
        boolean boolean31 = htmlTreeBuilder28.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState32 = htmlTreeBuilder28.state();
        htmlTreeBuilder28.markInsertionMode();
        java.lang.String str34 = htmlTreeBuilder28.getBaseUri();
        htmlTreeBuilder28.setFosterInserts(true);
        org.jsoup.parser.Tag tag38 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean39 = tag38.isBlock();
        boolean boolean40 = tag38.isEmpty();
        boolean boolean41 = tag38.isFormListed();
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element(tag38, "");
        htmlTreeBuilder28.setHeadElement(element43);
        org.jsoup.nodes.Document document45 = element43.ownerDocument();
        boolean boolean46 = element43.hasText();
        org.jsoup.nodes.Node[] nodeArray48 = new org.jsoup.nodes.Node[] {};
        org.jsoup.nodes.Element element49 = element43.insertChildren(0, nodeArray48);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element50 = element15.insertChildren((int) (byte) 10, nodeArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Insert position out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(document45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(nodeArray48);
        org.junit.Assert.assertArrayEquals(nodeArray48, new org.jsoup.nodes.Node[] {});
        org.junit.Assert.assertNotNull(element49);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isFormListed();
        org.jsoup.nodes.Element element4 = new org.jsoup.nodes.Element(tag1, "hi!");
        org.jsoup.nodes.Element element6 = element4.appendText("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.nodes.Element element7 = element6.shallowClone();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document9 = htmlTreeBuilder8.getDocument();
        boolean boolean10 = htmlTreeBuilder8.framesetOk();
        boolean boolean11 = htmlTreeBuilder8.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder8.state();
        htmlTreeBuilder8.markInsertionMode();
        java.lang.String str14 = htmlTreeBuilder8.getBaseUri();
        htmlTreeBuilder8.setFosterInserts(true);
        org.jsoup.parser.Tag tag18 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean19 = tag18.isBlock();
        boolean boolean20 = tag18.isEmpty();
        boolean boolean21 = tag18.isFormListed();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag18, "");
        htmlTreeBuilder8.setHeadElement(element23);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList25 = element23.textNodes();
        org.jsoup.nodes.Element element27 = element23.tagName("hi!");
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "<hi!>\n <hi!></hi!>\n</hi!>", "" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.jsoup.nodes.Element element34 = element23.classNames((java.util.Set<java.lang.String>) strSet32);
        org.jsoup.select.Elements elements37 = element23.getElementsByAttributeValue("<hi!></hi!>", "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element38 = element23.previousElementSibling();
        org.jsoup.nodes.Element element39 = element23.shallowClone();
        boolean boolean40 = element6.hasSameValue((java.lang.Object) element23);
        org.jsoup.select.Elements elements41 = element6.children();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(element6);
        org.junit.Assert.assertNotNull(element7);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(textNodeList25);
        org.junit.Assert.assertNotNull(element27);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!", "<hi!>\n <hi!></hi!>\n</hi!>", "" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements37);
        org.junit.Assert.assertNull(element38);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(elements41);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.FormElement formElement8 = htmlTreeBuilder0.getFormElement();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNull(formElement8);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.ForeignContent;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder2.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder2.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder2.state();
        boolean boolean7 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder2.state();
        java.util.List<java.lang.String> strList9 = htmlTreeBuilder2.getPendingTableCharacters();
        org.jsoup.nodes.Element element10 = htmlTreeBuilder2.getHeadElement();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder2.clearFormattingElementsToLastMarker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNull(strList9);
        org.junit.Assert.assertNull(element10);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.FormElement formElement1 = null;
        htmlTreeBuilder0.setFormElement(formElement1);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        java.util.List<java.lang.String> strList4 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder5.getDocument();
        boolean boolean7 = htmlTreeBuilder5.framesetOk();
        boolean boolean8 = htmlTreeBuilder5.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder5.state();
        htmlTreeBuilder5.markInsertionMode();
        java.lang.String str11 = htmlTreeBuilder5.getBaseUri();
        htmlTreeBuilder5.setFosterInserts(true);
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean16 = tag15.isBlock();
        boolean boolean17 = tag15.isEmpty();
        boolean boolean18 = tag15.isFormListed();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag15, "");
        htmlTreeBuilder5.setHeadElement(element20);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList22 = element20.textNodes();
        boolean boolean23 = htmlTreeBuilder0.isSpecial(element20);
        java.lang.String str24 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.FormElement formElement25 = htmlTreeBuilder0.getFormElement();
        boolean boolean26 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.ParseSettings parseSettings27 = htmlTreeBuilder0.defaultSettings();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToClose("<hi!></hi!> \n<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertNull(strList4);
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(textNodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(formElement25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(parseSettings27);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.ForeignContent;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder2.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder2.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder2.state();
        boolean boolean7 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag17 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean18 = tag17.isBlock();
        boolean boolean19 = tag17.isEmpty();
        boolean boolean20 = tag17.isFormListed();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag17, "");
        org.jsoup.parser.Tag tag24 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean25 = tag24.isBlock();
        boolean boolean26 = tag24.isEmpty();
        boolean boolean27 = tag24.isFormListed();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag24, "");
        org.jsoup.nodes.Node[] nodeArray30 = new org.jsoup.nodes.Node[] { element22, element29 };
        org.jsoup.nodes.Element element31 = element14.insertChildren((int) (byte) 0, nodeArray30);
        org.jsoup.select.Elements elements32 = element31.previousElementSiblings();
        htmlTreeBuilder2.maybeSetBaseUri(element31);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState34 = htmlTreeBuilder2.state();
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(tag24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(nodeArray30);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(elements32);
        org.junit.Assert.assertNull(htmlTreeBuilderState34);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.nodes.Element element33 = element13.text("hi!");
        org.jsoup.nodes.Element element34 = element33.shallowClone();
        org.jsoup.nodes.Element element36 = element34.append("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.nodes.Element element38 = element36.append("<hi!></hi!>");
        org.jsoup.nodes.Element element40 = element36.tagName("<hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \">\n <hi!></hi!>\n <hi!></hi!>hi!\n</hi!>");
        org.jsoup.nodes.Attributes attributes41 = element36.attributes();
        org.jsoup.select.Elements elements42 = element36.nextElementSiblings();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(element36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(attributes41);
        org.junit.Assert.assertNotNull(elements42);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.preserveWhitespace();
        boolean boolean5 = tag1.isBlock();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder6.getDocument();
        boolean boolean8 = htmlTreeBuilder6.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder6.originalState();
        boolean boolean10 = tag1.equals((java.lang.Object) htmlTreeBuilderState9);
        boolean boolean11 = tag1.isInline();
        java.lang.String str12 = tag1.getName();
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean16 = tag15.isBlock();
        boolean boolean17 = tag15.isEmpty();
        boolean boolean18 = tag15.isFormListed();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag15, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.parser.Tag tag30 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean31 = tag30.isBlock();
        boolean boolean32 = tag30.isEmpty();
        boolean boolean33 = tag30.isFormListed();
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element(tag30, "");
        org.jsoup.nodes.Node[] nodeArray36 = new org.jsoup.nodes.Node[] { element28, element35 };
        org.jsoup.nodes.Element element37 = element20.insertChildren((int) (byte) 0, nodeArray36);
        org.jsoup.nodes.Element element39 = element37.tagName("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes40 = element37.attributes();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag1, "<hi!>\n <hi!></hi!>\n</hi!>", attributes40);
        org.jsoup.parser.Tag tag42 = element41.tag();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(nodeArray36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertNotNull(tag42);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.nodes.Element element33 = element13.text("hi!");
        org.jsoup.nodes.Element element34 = element33.shallowClone();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = element34.dataset();
        org.jsoup.parser.Tag tag37 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean38 = tag37.isBlock();
        boolean boolean39 = tag37.isEmpty();
        boolean boolean40 = tag37.isFormListed();
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element(tag37, "");
        org.jsoup.parser.Tag tag45 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean46 = tag45.isBlock();
        boolean boolean47 = tag45.isEmpty();
        boolean boolean48 = tag45.isFormListed();
        org.jsoup.nodes.Element element50 = new org.jsoup.nodes.Element(tag45, "");
        org.jsoup.parser.Tag tag52 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean53 = tag52.isBlock();
        boolean boolean54 = tag52.isEmpty();
        boolean boolean55 = tag52.isFormListed();
        org.jsoup.nodes.Element element57 = new org.jsoup.nodes.Element(tag52, "");
        org.jsoup.nodes.Node[] nodeArray58 = new org.jsoup.nodes.Node[] { element50, element57 };
        org.jsoup.nodes.Element element59 = element42.insertChildren((int) (byte) 0, nodeArray58);
        org.jsoup.nodes.Element element61 = element59.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap62 = element61.dataset();
        org.jsoup.parser.Tag tag65 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean66 = tag65.isBlock();
        boolean boolean67 = tag65.isEmpty();
        boolean boolean68 = tag65.isFormListed();
        org.jsoup.nodes.Element element70 = new org.jsoup.nodes.Element(tag65, "");
        org.jsoup.parser.Tag tag73 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean74 = tag73.isBlock();
        boolean boolean75 = tag73.isEmpty();
        boolean boolean76 = tag73.isFormListed();
        org.jsoup.nodes.Element element78 = new org.jsoup.nodes.Element(tag73, "");
        org.jsoup.parser.Tag tag80 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean81 = tag80.isBlock();
        boolean boolean82 = tag80.isEmpty();
        boolean boolean83 = tag80.isFormListed();
        org.jsoup.nodes.Element element85 = new org.jsoup.nodes.Element(tag80, "");
        org.jsoup.nodes.Node[] nodeArray86 = new org.jsoup.nodes.Node[] { element78, element85 };
        org.jsoup.nodes.Element element87 = element70.insertChildren((int) (byte) 0, nodeArray86);
        org.jsoup.select.Elements elements88 = element87.previousElementSiblings();
        org.jsoup.nodes.Element element89 = element61.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements88);
        element89.setBaseUri("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap92 = element89.dataset();
        org.jsoup.nodes.Element element93 = element34.appendChild((org.jsoup.nodes.Node) element89);
        boolean boolean94 = element89.isBlock();
        java.lang.String str95 = element89.data();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(nodeArray58);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertNotNull(tag65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(tag73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(tag80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(nodeArray86);
        org.junit.Assert.assertNotNull(element87);
        org.junit.Assert.assertNotNull(elements88);
        org.junit.Assert.assertNotNull(element89);
        org.junit.Assert.assertNotNull(strMap92);
        org.junit.Assert.assertNotNull(element93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.parser.Tag tag32 = element13.tag();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder33 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document34 = htmlTreeBuilder33.getDocument();
        boolean boolean35 = htmlTreeBuilder33.framesetOk();
        boolean boolean36 = htmlTreeBuilder33.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState37 = htmlTreeBuilder33.state();
        htmlTreeBuilder33.markInsertionMode();
        java.lang.String str39 = htmlTreeBuilder33.getBaseUri();
        htmlTreeBuilder33.setFosterInserts(true);
        org.jsoup.parser.Tag tag43 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean44 = tag43.isBlock();
        boolean boolean45 = tag43.isEmpty();
        boolean boolean46 = tag43.isFormListed();
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element(tag43, "");
        htmlTreeBuilder33.setHeadElement(element48);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList50 = element48.textNodes();
        org.jsoup.nodes.Element element52 = element48.tagName("hi!");
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "<hi!>\n <hi!></hi!>\n</hi!>", "" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        org.jsoup.nodes.Element element59 = element48.classNames((java.util.Set<java.lang.String>) strSet57);
        org.jsoup.nodes.Element element60 = element13.classNames((java.util.Set<java.lang.String>) strSet57);
        org.jsoup.nodes.Element element62 = element60.appendText("hi!");
        org.jsoup.select.Elements elements63 = element60.children();
        org.jsoup.nodes.Node node64 = element60.root();
        java.util.List<org.jsoup.nodes.Node> nodeList65 = element60.siblingNodes();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState66 = org.jsoup.parser.HtmlTreeBuilderState.ForeignContent;
        org.jsoup.parser.Token token67 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder68 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder68.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState71 = htmlTreeBuilder68.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState72 = htmlTreeBuilder68.state();
        boolean boolean73 = htmlTreeBuilderState66.process(token67, htmlTreeBuilder68);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState74 = htmlTreeBuilder68.state();
        java.lang.String str75 = htmlTreeBuilder68.getBaseUri();
        boolean boolean76 = htmlTreeBuilder68.isFragmentParsing();
        org.jsoup.nodes.FormElement formElement77 = null;
        htmlTreeBuilder68.setFormElement(formElement77);
        org.jsoup.parser.Token token79 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder80 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder80.setFosterInserts(false);
        org.jsoup.nodes.Element element83 = null;
        htmlTreeBuilder80.setHeadElement(element83);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState85 = org.jsoup.parser.HtmlTreeBuilderState.ForeignContent;
        htmlTreeBuilder80.transition(htmlTreeBuilderState85);
        boolean boolean87 = htmlTreeBuilder68.process(token79, htmlTreeBuilderState85);
        boolean boolean88 = element60.equals((java.lang.Object) token79);
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNull(document34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(textNodeList50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "hi!", "<hi!>\n <hi!></hi!>\n</hi!>", "" });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(elements63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(nodeList65);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState66);
        org.junit.Assert.assertNull(htmlTreeBuilderState71);
        org.junit.Assert.assertNull(htmlTreeBuilderState72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState74);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        java.util.regex.Pattern pattern33 = null;
        org.jsoup.select.Elements elements34 = element13.getElementsByAttributeValueMatching("", pattern33);
        org.jsoup.select.Elements elements36 = element13.getElementsByIndexGreaterThan((int) (byte) 0);
        org.jsoup.nodes.Element element38 = element13.text("");
        org.jsoup.nodes.Node node39 = element38.parentNode();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(elements34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertNull(node39);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        java.util.regex.Pattern pattern18 = null;
        org.jsoup.select.Elements elements19 = element15.getElementsByAttributeValueMatching("<hi!></hi!>\n<hi!></hi!>", pattern18);
        java.lang.String str20 = element15.nodeName();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder21 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document22 = htmlTreeBuilder21.getDocument();
        boolean boolean23 = htmlTreeBuilder21.framesetOk();
        boolean boolean24 = htmlTreeBuilder21.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState25 = htmlTreeBuilder21.state();
        org.jsoup.parser.ParseSettings parseSettings26 = htmlTreeBuilder21.defaultSettings();
        boolean boolean27 = element15.hasSameValue((java.lang.Object) htmlTreeBuilder21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = element15.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState25);
        org.junit.Assert.assertNotNull(parseSettings26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.preserveWhitespace();
        boolean boolean5 = tag1.isBlock();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder6.getDocument();
        boolean boolean8 = htmlTreeBuilder6.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder6.originalState();
        boolean boolean10 = tag1.equals((java.lang.Object) htmlTreeBuilderState9);
        boolean boolean11 = tag1.isInline();
        java.lang.String str12 = tag1.getName();
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean16 = tag15.isBlock();
        boolean boolean17 = tag15.isEmpty();
        boolean boolean18 = tag15.isFormListed();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag15, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.parser.Tag tag30 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean31 = tag30.isBlock();
        boolean boolean32 = tag30.isEmpty();
        boolean boolean33 = tag30.isFormListed();
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element(tag30, "");
        org.jsoup.nodes.Node[] nodeArray36 = new org.jsoup.nodes.Node[] { element28, element35 };
        org.jsoup.nodes.Element element37 = element20.insertChildren((int) (byte) 0, nodeArray36);
        org.jsoup.nodes.Element element39 = element37.tagName("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.nodes.Attributes attributes40 = element37.attributes();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag1, "<hi!>\n <hi!></hi!>\n</hi!>", attributes40);
        boolean boolean42 = tag1.isData();
        boolean boolean43 = tag1.isSelfClosing();
        boolean boolean44 = tag1.isData();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(nodeArray36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(attributes40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Element element3 = null;
        htmlTreeBuilder0.setHeadElement(element3);
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element6 = null;
        htmlTreeBuilder0.setHeadElement(element6);
        htmlTreeBuilder0.setFosterInserts(false);
        htmlTreeBuilder0.newPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.insertMarkerToFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element5);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.nodes.Node node24 = element6.nextSibling();
        org.jsoup.select.Elements elements27 = element6.getElementsByAttributeValueMatching("", "hi!");
        org.jsoup.select.Elements elements29 = element6.getElementsByIndexGreaterThan(1);
        org.jsoup.nodes.Element element31 = element6.appendText("");
        org.jsoup.select.Elements elements33 = element31.getElementsByClass("<hi!>\n <hi!></hi!>\n</hi!>");
        boolean boolean35 = element31.hasAttr("hi!");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(elements27);
        org.junit.Assert.assertNotNull(elements29);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = element15.hasText();
        java.lang.String str18 = element15.tagName();
        java.lang.String str20 = element15.attr("");
        java.lang.String str21 = element15.html();
        java.lang.String str22 = element15.wholeText();
        org.jsoup.nodes.Element element24 = element15.toggleClass("");
        org.jsoup.select.Elements elements26 = element15.getElementsContainingText("");
        org.jsoup.nodes.Element element28 = element15.appendText("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.select.Elements elements30 = element15.getElementsByAttribute("<hi! class=\"\"></hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.select.Elements elements33 = element15.getElementsByAttributeValueContaining("", "<hi!>\n &lt;hi! class=\"&lt;&lt;hi! class=&amp;quot;&amp;quot;&gt; hi! &lt;/hi!&gt;&gt;&lt;/&lt;hi! class=&amp;quot;&amp;quot;&gt; hi! &lt;/hi!&gt;&gt;\"&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements30);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.nodes.Element element33 = element13.text("hi!");
        org.jsoup.nodes.Element element34 = element33.shallowClone();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = element34.dataset();
        org.jsoup.parser.Tag tag37 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean38 = tag37.isBlock();
        boolean boolean39 = tag37.isEmpty();
        boolean boolean40 = tag37.isFormListed();
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element(tag37, "");
        org.jsoup.parser.Tag tag45 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean46 = tag45.isBlock();
        boolean boolean47 = tag45.isEmpty();
        boolean boolean48 = tag45.isFormListed();
        org.jsoup.nodes.Element element50 = new org.jsoup.nodes.Element(tag45, "");
        org.jsoup.parser.Tag tag52 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean53 = tag52.isBlock();
        boolean boolean54 = tag52.isEmpty();
        boolean boolean55 = tag52.isFormListed();
        org.jsoup.nodes.Element element57 = new org.jsoup.nodes.Element(tag52, "");
        org.jsoup.nodes.Node[] nodeArray58 = new org.jsoup.nodes.Node[] { element50, element57 };
        org.jsoup.nodes.Element element59 = element42.insertChildren((int) (byte) 0, nodeArray58);
        org.jsoup.nodes.Element element61 = element59.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap62 = element61.dataset();
        org.jsoup.parser.Tag tag65 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean66 = tag65.isBlock();
        boolean boolean67 = tag65.isEmpty();
        boolean boolean68 = tag65.isFormListed();
        org.jsoup.nodes.Element element70 = new org.jsoup.nodes.Element(tag65, "");
        org.jsoup.parser.Tag tag73 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean74 = tag73.isBlock();
        boolean boolean75 = tag73.isEmpty();
        boolean boolean76 = tag73.isFormListed();
        org.jsoup.nodes.Element element78 = new org.jsoup.nodes.Element(tag73, "");
        org.jsoup.parser.Tag tag80 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean81 = tag80.isBlock();
        boolean boolean82 = tag80.isEmpty();
        boolean boolean83 = tag80.isFormListed();
        org.jsoup.nodes.Element element85 = new org.jsoup.nodes.Element(tag80, "");
        org.jsoup.nodes.Node[] nodeArray86 = new org.jsoup.nodes.Node[] { element78, element85 };
        org.jsoup.nodes.Element element87 = element70.insertChildren((int) (byte) 0, nodeArray86);
        org.jsoup.select.Elements elements88 = element87.previousElementSiblings();
        org.jsoup.nodes.Element element89 = element61.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements88);
        element89.setBaseUri("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap92 = element89.dataset();
        org.jsoup.nodes.Element element93 = element34.appendChild((org.jsoup.nodes.Node) element89);
        java.lang.String str94 = element93.toString();
        org.jsoup.select.Elements elements95 = element93.nextElementSiblings();
        org.jsoup.nodes.Node node97 = element93.removeAttr("hi!");
        int int98 = element93.childNodeSize();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(nodeArray58);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertNotNull(tag65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(tag73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(tag80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(nodeArray86);
        org.junit.Assert.assertNotNull(element87);
        org.junit.Assert.assertNotNull(elements88);
        org.junit.Assert.assertNotNull(element89);
        org.junit.Assert.assertNotNull(strMap92);
        org.junit.Assert.assertNotNull(element93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "<hi!>\n <hi!></hi!>\n</hi!>" + "'", str94, "<hi!>\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(elements95);
        org.junit.Assert.assertNotNull(node97);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 1 + "'", int98 == 1);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isSelfClosing();
        org.jsoup.parser.Tag tag5 = tag1.setSelfClosing();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag5, "<hi!>\n <hi! class=\"\"> \n  <hi!></hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        boolean boolean8 = tag5.isEmpty();
        boolean boolean9 = tag5.isBlock();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean7 = tag6.isBlock();
        boolean boolean8 = tag6.isEmpty();
        boolean boolean9 = tag6.preserveWhitespace();
        org.jsoup.nodes.Attributes attributes11 = null;
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag6, "", attributes11);
        org.jsoup.nodes.Element element14 = element12.prependText("<hi!>\n <hi!></hi!>\n</hi!>");
        boolean boolean15 = htmlTreeBuilder0.isSpecial(element14);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder16 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document17 = htmlTreeBuilder16.getDocument();
        boolean boolean18 = htmlTreeBuilder16.framesetOk();
        boolean boolean19 = htmlTreeBuilder16.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState20 = htmlTreeBuilder16.state();
        htmlTreeBuilder16.markInsertionMode();
        java.lang.String str22 = htmlTreeBuilder16.getBaseUri();
        htmlTreeBuilder16.setFosterInserts(true);
        org.jsoup.parser.Tag tag26 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean27 = tag26.isBlock();
        boolean boolean28 = tag26.isEmpty();
        boolean boolean29 = tag26.isFormListed();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag26, "");
        htmlTreeBuilder16.setHeadElement(element31);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList33 = element31.textNodes();
        org.jsoup.nodes.Element element35 = element31.tagName("hi!");
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "<hi!>\n <hi!></hi!>\n</hi!>", "" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.jsoup.nodes.Element element42 = element31.classNames((java.util.Set<java.lang.String>) strSet40);
        org.jsoup.nodes.Element element43 = element14.classNames((java.util.Set<java.lang.String>) strSet40);
        int int44 = element43.elementSiblingIndex();
        org.jsoup.nodes.Element element46 = element43.appendText("<hi! class=\"\">\n hi!\n</hi!>");
        org.jsoup.nodes.Element element48 = element43.prepend("<hi!>\n hi!\n</hi!>");
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(tag26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(textNodeList33);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!", "<hi!>\n <hi!></hi!>\n</hi!>", "" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(element42);
        org.junit.Assert.assertNotNull(element43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(element46);
        org.junit.Assert.assertNotNull(element48);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        boolean boolean17 = element15.hasText();
        java.lang.String str18 = element15.tagName();
        java.lang.String str20 = element15.attr("");
        java.lang.String str21 = element15.html();
        java.lang.String str22 = element15.wholeText();
        org.jsoup.nodes.Element element24 = element15.toggleClass("");
        org.jsoup.select.Elements elements26 = element15.getElementsContainingText("");
        org.jsoup.nodes.Element element28 = element15.appendText("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.select.Elements elements30 = element15.getElementsByAttribute("<hi! class=\"\"></hi!>");
        org.jsoup.select.Elements elements31 = element15.children();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(element24);
        org.junit.Assert.assertNotNull(elements26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements31);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.parser.Tag tag32 = element13.tag();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder33 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document34 = htmlTreeBuilder33.getDocument();
        boolean boolean35 = htmlTreeBuilder33.framesetOk();
        boolean boolean36 = htmlTreeBuilder33.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState37 = htmlTreeBuilder33.state();
        htmlTreeBuilder33.markInsertionMode();
        java.lang.String str39 = htmlTreeBuilder33.getBaseUri();
        htmlTreeBuilder33.setFosterInserts(true);
        org.jsoup.parser.Tag tag43 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean44 = tag43.isBlock();
        boolean boolean45 = tag43.isEmpty();
        boolean boolean46 = tag43.isFormListed();
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element(tag43, "");
        htmlTreeBuilder33.setHeadElement(element48);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList50 = element48.textNodes();
        org.jsoup.nodes.Element element52 = element48.tagName("hi!");
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "<hi!>\n <hi!></hi!>\n</hi!>", "" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        org.jsoup.nodes.Element element59 = element48.classNames((java.util.Set<java.lang.String>) strSet57);
        org.jsoup.nodes.Element element60 = element13.classNames((java.util.Set<java.lang.String>) strSet57);
        org.jsoup.nodes.Element element62 = element60.appendText("hi!");
        org.jsoup.select.Elements elements64 = element62.getElementsByAttribute("<hi!></hi!>\n<hi!></hi!>\n<<hi!></hi!>\n<hi!></hi!>></<hi!></hi!>\n<hi!></hi!>>");
        org.jsoup.nodes.Element element67 = element62.attr("<hi!> <hi!></hi!> </hi!>", false);
        // The following exception was thrown during execution in test generation
        try {
            element67.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNull(document34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(textNodeList50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "hi!", "<hi!>\n <hi!></hi!>\n</hi!>", "" });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(elements64);
        org.junit.Assert.assertNotNull(element67);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.nodes.Element element25 = element23.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = element25.dataset();
        java.lang.String str28 = element25.attr("hi!");
        java.lang.String str29 = element25.wholeText();
        org.jsoup.select.Elements elements30 = element25.getAllElements();
        org.jsoup.select.Elements elements33 = element25.getElementsByAttributeValueMatching("hi!", "");
        java.util.List<org.jsoup.nodes.Node> nodeList34 = element25.childNodesCopy();
        org.jsoup.select.Elements elements35 = element25.parents();
        java.lang.String str36 = element25.cssSelector();
        org.jsoup.parser.Tag tag37 = element25.tag();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(elements30);
        org.junit.Assert.assertNotNull(elements33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(elements35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(tag37);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.nodes.Element element33 = element13.text("hi!");
        boolean boolean35 = element13.hasClass("hi!");
        org.jsoup.parser.Tag tag38 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean39 = tag38.isBlock();
        boolean boolean40 = tag38.isEmpty();
        boolean boolean41 = tag38.isFormListed();
        org.jsoup.nodes.Element element43 = new org.jsoup.nodes.Element(tag38, "");
        org.jsoup.parser.Tag tag46 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean47 = tag46.isBlock();
        boolean boolean48 = tag46.isEmpty();
        boolean boolean49 = tag46.isFormListed();
        org.jsoup.nodes.Element element51 = new org.jsoup.nodes.Element(tag46, "");
        org.jsoup.parser.Tag tag53 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean54 = tag53.isBlock();
        boolean boolean55 = tag53.isEmpty();
        boolean boolean56 = tag53.isFormListed();
        org.jsoup.nodes.Element element58 = new org.jsoup.nodes.Element(tag53, "");
        org.jsoup.nodes.Node[] nodeArray59 = new org.jsoup.nodes.Node[] { element51, element58 };
        org.jsoup.nodes.Element element60 = element43.insertChildren((int) (byte) 0, nodeArray59);
        org.jsoup.select.Elements elements61 = element60.previousElementSiblings();
        org.jsoup.nodes.Element element62 = element13.insertChildren(1, (java.util.Collection<org.jsoup.nodes.Element>) elements61);
        java.lang.String str63 = element62.wholeText();
        org.jsoup.parser.Tag tag64 = element62.tag();
        org.jsoup.nodes.Element element65 = element62.empty();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList66 = element62.dataNodes();
        org.jsoup.nodes.Element element68 = element62.text("<hi! class=\"<<hi! class=&quot;&quot;>\n hi!\n</hi!>></<hi! class=&quot;&quot;>\n hi!\n</hi!>>\">\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element70 = element68.html("<hi! class=\"\">\n <hi!></hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element72 = element70.appendText("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element74 = element70.prependText("<hi!></hi!>");
        java.lang.String str75 = element74.val();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(tag38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(tag46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(nodeArray59);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(elements61);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(tag64);
        org.junit.Assert.assertNotNull(element65);
        org.junit.Assert.assertNotNull(dataNodeList66);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertNotNull(element72);
        org.junit.Assert.assertNotNull(element74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.Tag tag4 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean5 = tag4.isBlock();
        boolean boolean6 = tag4.isEmpty();
        boolean boolean7 = tag4.isFormListed();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag4, "");
        org.jsoup.parser.Tag tag12 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean13 = tag12.isBlock();
        boolean boolean14 = tag12.isEmpty();
        boolean boolean15 = tag12.isFormListed();
        org.jsoup.nodes.Element element17 = new org.jsoup.nodes.Element(tag12, "");
        org.jsoup.parser.Tag tag19 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean20 = tag19.isBlock();
        boolean boolean21 = tag19.isEmpty();
        boolean boolean22 = tag19.isFormListed();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element(tag19, "");
        org.jsoup.nodes.Node[] nodeArray25 = new org.jsoup.nodes.Node[] { element17, element24 };
        org.jsoup.nodes.Element element26 = element9.insertChildren((int) (byte) 0, nodeArray25);
        org.jsoup.nodes.Element element28 = element26.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap29 = element28.dataset();
        org.jsoup.nodes.Element element30 = element28.empty();
        java.util.List<org.jsoup.nodes.Node> nodeList31 = element30.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = element30.childNodes();
        htmlTreeBuilder0.maybeSetBaseUri(element30);
        java.lang.String str34 = element30.className();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeArray25);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertNotNull(element28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder7.getDocument();
        boolean boolean9 = htmlTreeBuilder7.framesetOk();
        boolean boolean10 = htmlTreeBuilder7.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = htmlTreeBuilder7.state();
        htmlTreeBuilder7.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings13 = htmlTreeBuilder7.defaultSettings();
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean16 = tag15.isBlock();
        boolean boolean17 = tag15.isEmpty();
        boolean boolean18 = tag15.isFormListed();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag15, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.parser.Tag tag30 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean31 = tag30.isBlock();
        boolean boolean32 = tag30.isEmpty();
        boolean boolean33 = tag30.isFormListed();
        org.jsoup.nodes.Element element35 = new org.jsoup.nodes.Element(tag30, "");
        org.jsoup.nodes.Node[] nodeArray36 = new org.jsoup.nodes.Node[] { element28, element35 };
        org.jsoup.nodes.Element element37 = element20.insertChildren((int) (byte) 0, nodeArray36);
        boolean boolean38 = htmlTreeBuilder7.isSpecial(element20);
        org.jsoup.nodes.Element element40 = element20.text("hi!");
        org.jsoup.nodes.Element element41 = element40.shallowClone();
        java.util.Map<java.lang.String, java.lang.String> strMap42 = element41.dataset();
        boolean boolean43 = element6.hasSameValue((java.lang.Object) strMap42);
        boolean boolean44 = element6.hasText();
        org.jsoup.select.Elements elements45 = element6.previousElementSiblings();
        org.jsoup.nodes.Element element48 = element6.attr("", "");
        org.jsoup.select.Elements elements51 = element48.getElementsByAttributeValueMatching("<hi!>&lt;hi! class=\"hi! &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt; \"&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;hi! &lt;/hi!&gt;\n</hi!>", "<hi!>\n <<hi!>\n <hi!></hi!>\n</hi!>>\n  hi!\n </<hi!>\n <hi!></hi!>\n</hi!>>\n <hi!></hi!>\n <hi!></hi!>\n <<hi!></hi!>\n<hi!></hi!>></<hi!></hi!>\n<hi!></hi!>>\n</hi!>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState11);
        org.junit.Assert.assertNotNull(parseSettings13);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(nodeArray36);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNotNull(element41);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(elements45);
        org.junit.Assert.assertNotNull(element48);
        org.junit.Assert.assertNotNull(elements51);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Element element3 = null;
        htmlTreeBuilder0.setHeadElement(element3);
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.nodes.Element element6 = null;
        htmlTreeBuilder0.setHeadElement(element6);
        htmlTreeBuilder0.setFosterInserts(false);
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean12 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.nodes.FormElement formElement13 = null;
        htmlTreeBuilder0.setFormElement(formElement13);
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState16 = htmlTreeBuilder0.state();
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState16);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.nodes.Element element33 = element13.text("hi!");
        org.jsoup.nodes.Element element34 = element33.shallowClone();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = element34.dataset();
        java.util.regex.Pattern pattern37 = null;
        org.jsoup.select.Elements elements38 = element34.getElementsByAttributeValueMatching("", pattern37);
        org.jsoup.nodes.Element element40 = element34.tagName("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Node node41 = element34.previousSibling();
        org.jsoup.parser.Tag tag42 = element34.tag();
        org.jsoup.nodes.Attributes attributes43 = element34.attributes();
        org.jsoup.nodes.Element element45 = element34.html("<hi! class=\"<<hi! class=&quot;&quot;>\n hi!\n</hi!>></<hi! class=&quot;&quot;>\n hi!\n</hi!>>\">\n <hi!></hi!>\n</hi!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element47 = element45.wrap("<hi!></hi!>\n<hi!></hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertNotNull(element40);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertNotNull(attributes43);
        org.junit.Assert.assertNotNull(element45);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Element element3 = null;
        htmlTreeBuilder0.setHeadElement(element3);
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder6.getDocument();
        boolean boolean8 = htmlTreeBuilder6.framesetOk();
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder6.state();
        htmlTreeBuilder6.markInsertionMode();
        java.lang.String str12 = htmlTreeBuilder6.getBaseUri();
        htmlTreeBuilder6.setFosterInserts(true);
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        htmlTreeBuilder6.setHeadElement(element21);
        boolean boolean23 = element21.hasText();
        java.lang.String str24 = element21.tagName();
        htmlTreeBuilder0.maybeSetBaseUri(element21);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList26 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList28 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.setFosterInserts(true);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.reconstructFormattingElements();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(elementList26);
        org.junit.Assert.assertNull(elementList28);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.nodes.Element element25 = element23.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = element25.dataset();
        org.jsoup.nodes.Element element27 = element25.previousElementSibling();
        org.jsoup.select.Elements elements28 = element25.siblingElements();
        org.jsoup.nodes.Element element30 = element25.prependElement("hi!");
        org.jsoup.nodes.Node node31 = element30.root();
        org.jsoup.parser.Tag tag33 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean34 = tag33.isInline();
        boolean boolean35 = tag33.isFormListed();
        boolean boolean36 = element30.hasSameValue((java.lang.Object) tag33);
        java.util.regex.Pattern pattern38 = null;
        org.jsoup.select.Elements elements39 = element30.getElementsByAttributeValueMatching("<hi! class=\"<<hi! class=&quot;&quot;>\n hi!\n</hi!>></<hi! class=&quot;&quot;>\n hi!\n</hi!>>\">\n <hi!></hi!>\n</hi!>", pattern38);
        org.jsoup.nodes.Element element41 = element30.appendElement("<hi!>\n <hi! class=\"\"> \n  <hi!></hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNull(element27);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(elements39);
        org.junit.Assert.assertNotNull(element41);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        htmlTreeBuilder0.setHeadElement(element15);
        java.util.regex.Pattern pattern18 = null;
        org.jsoup.select.Elements elements19 = element15.getElementsByAttributeValueMatching("<hi!></hi!>\n<hi!></hi!>", pattern18);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState20 = org.jsoup.parser.HtmlTreeBuilderState.ForeignContent;
        org.jsoup.parser.Token token21 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder22 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder22.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState25 = htmlTreeBuilder22.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState26 = htmlTreeBuilder22.state();
        boolean boolean27 = htmlTreeBuilderState20.process(token21, htmlTreeBuilder22);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState28 = htmlTreeBuilder22.state();
        java.util.List<java.lang.String> strList29 = htmlTreeBuilder22.getPendingTableCharacters();
        org.jsoup.nodes.Document document30 = htmlTreeBuilder22.getDocument();
        boolean boolean31 = element15.hasSameValue((java.lang.Object) htmlTreeBuilder22);
        org.jsoup.parser.Token.Comment comment32 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder22.insert(comment32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(elements19);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState20);
        org.junit.Assert.assertNull(htmlTreeBuilderState25);
        org.junit.Assert.assertNull(htmlTreeBuilderState26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState28);
        org.junit.Assert.assertNull(strList29);
        org.junit.Assert.assertNull(document30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.preserveWhitespace();
        boolean boolean5 = tag1.isBlock();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag1, "hi!.hi!.<hi!>.<hi!></hi!>.</hi!>");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag9, "<hi!></hi!>");
        org.jsoup.nodes.Element element14 = element7.appendTo(element13);
        org.jsoup.select.Elements elements16 = element14.getElementsByTag("<hi! class=\"<hi!></hi!>\n<hi!></hi!>\" <hi!>\n <hi! class=\"\"> \n  <hi!></hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>=\"<hi!>\n <hi! class=&quot;&quot;> \n  <hi!></hi!> \n  <hi!></hi!> \n </hi!>\n</hi!>\">\n <hi!></hi!>\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(element14);
        org.junit.Assert.assertNotNull(elements16);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.FormElement formElement5 = null;
        htmlTreeBuilder0.setFormElement(formElement5);
        htmlTreeBuilder0.setFosterInserts(false);
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.clearStackToTableRowContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(element3);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        int int32 = element13.siblingIndex();
        org.jsoup.nodes.Element element34 = element13.appendElement("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.select.Elements elements36 = element13.getElementsByIndexEquals((int) (short) 1);
        org.jsoup.nodes.Element element39 = element13.attr("<hi!></hi!>\n<hi!></hi!>", false);
        org.jsoup.nodes.Node node40 = element13.clearAttributes();
        org.jsoup.nodes.Attributes attributes41 = element13.attributes();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertNotNull(element39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(attributes41);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.originalState();
        htmlTreeBuilder0.setFosterInserts(true);
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNull(htmlTreeBuilderState2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder1 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document2 = htmlTreeBuilder1.getDocument();
        boolean boolean3 = htmlTreeBuilder1.framesetOk();
        boolean boolean4 = htmlTreeBuilder1.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder1.state();
        htmlTreeBuilder1.markInsertionMode();
        java.lang.String str7 = htmlTreeBuilder1.getBaseUri();
        htmlTreeBuilder1.setFosterInserts(true);
        org.jsoup.parser.ParseSettings parseSettings10 = htmlTreeBuilder1.defaultSettings();
        org.jsoup.parser.Tag tag11 = org.jsoup.parser.Tag.valueOf("<hi! class=\"\">\n hi!\n</hi!>", parseSettings10);
        boolean boolean12 = tag11.isSelfClosing();
        boolean boolean13 = tag11.isEmpty();
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(parseSettings10);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.parser.Tag tag32 = element13.tag();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder33 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document34 = htmlTreeBuilder33.getDocument();
        boolean boolean35 = htmlTreeBuilder33.framesetOk();
        boolean boolean36 = htmlTreeBuilder33.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState37 = htmlTreeBuilder33.state();
        htmlTreeBuilder33.markInsertionMode();
        java.lang.String str39 = htmlTreeBuilder33.getBaseUri();
        htmlTreeBuilder33.setFosterInserts(true);
        org.jsoup.parser.Tag tag43 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean44 = tag43.isBlock();
        boolean boolean45 = tag43.isEmpty();
        boolean boolean46 = tag43.isFormListed();
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element(tag43, "");
        htmlTreeBuilder33.setHeadElement(element48);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList50 = element48.textNodes();
        org.jsoup.nodes.Element element52 = element48.tagName("hi!");
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "<hi!>\n <hi!></hi!>\n</hi!>", "" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        org.jsoup.nodes.Element element59 = element48.classNames((java.util.Set<java.lang.String>) strSet57);
        org.jsoup.nodes.Element element60 = element13.classNames((java.util.Set<java.lang.String>) strSet57);
        org.jsoup.nodes.Element element62 = element60.appendText("hi!");
        org.jsoup.select.Elements elements63 = element60.children();
        org.jsoup.nodes.Node node64 = element60.root();
        org.jsoup.nodes.Element element66 = element60.tagName("<hi!>\n <hi!></hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.select.Elements elements67 = element66.previousElementSiblings();
        org.jsoup.nodes.Element element69 = element66.toggleClass("<hi! class=\"<hi!></hi!>\n<hi!></hi!>\">\n <hi!></hi!>\n <hi!></hi!>\n</hi!>");
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNull(document34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(textNodeList50);
        org.junit.Assert.assertNotNull(element52);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "hi!", "<hi!>\n <hi!></hi!>\n</hi!>", "" });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element60);
        org.junit.Assert.assertNotNull(element62);
        org.junit.Assert.assertNotNull(elements63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(element66);
        org.junit.Assert.assertNotNull(elements67);
        org.junit.Assert.assertNotNull(element69);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        boolean boolean8 = htmlTreeBuilder0.isFosterInserts();
        boolean boolean9 = htmlTreeBuilder0.isFragmentParsing();
        org.junit.Assert.assertNull(htmlTreeBuilderState3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(elementList5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.nodes.Element element33 = element13.text("hi!");
        org.jsoup.nodes.Element element34 = element33.shallowClone();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = element34.dataset();
        org.jsoup.parser.Tag tag37 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean38 = tag37.isBlock();
        boolean boolean39 = tag37.isEmpty();
        boolean boolean40 = tag37.isFormListed();
        org.jsoup.nodes.Element element42 = new org.jsoup.nodes.Element(tag37, "");
        org.jsoup.parser.Tag tag45 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean46 = tag45.isBlock();
        boolean boolean47 = tag45.isEmpty();
        boolean boolean48 = tag45.isFormListed();
        org.jsoup.nodes.Element element50 = new org.jsoup.nodes.Element(tag45, "");
        org.jsoup.parser.Tag tag52 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean53 = tag52.isBlock();
        boolean boolean54 = tag52.isEmpty();
        boolean boolean55 = tag52.isFormListed();
        org.jsoup.nodes.Element element57 = new org.jsoup.nodes.Element(tag52, "");
        org.jsoup.nodes.Node[] nodeArray58 = new org.jsoup.nodes.Node[] { element50, element57 };
        org.jsoup.nodes.Element element59 = element42.insertChildren((int) (byte) 0, nodeArray58);
        org.jsoup.nodes.Element element61 = element59.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap62 = element61.dataset();
        org.jsoup.parser.Tag tag65 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean66 = tag65.isBlock();
        boolean boolean67 = tag65.isEmpty();
        boolean boolean68 = tag65.isFormListed();
        org.jsoup.nodes.Element element70 = new org.jsoup.nodes.Element(tag65, "");
        org.jsoup.parser.Tag tag73 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean74 = tag73.isBlock();
        boolean boolean75 = tag73.isEmpty();
        boolean boolean76 = tag73.isFormListed();
        org.jsoup.nodes.Element element78 = new org.jsoup.nodes.Element(tag73, "");
        org.jsoup.parser.Tag tag80 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean81 = tag80.isBlock();
        boolean boolean82 = tag80.isEmpty();
        boolean boolean83 = tag80.isFormListed();
        org.jsoup.nodes.Element element85 = new org.jsoup.nodes.Element(tag80, "");
        org.jsoup.nodes.Node[] nodeArray86 = new org.jsoup.nodes.Node[] { element78, element85 };
        org.jsoup.nodes.Element element87 = element70.insertChildren((int) (byte) 0, nodeArray86);
        org.jsoup.select.Elements elements88 = element87.previousElementSiblings();
        org.jsoup.nodes.Element element89 = element61.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements88);
        element89.setBaseUri("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap92 = element89.dataset();
        org.jsoup.nodes.Element element93 = element34.appendChild((org.jsoup.nodes.Node) element89);
        java.lang.String str94 = element89.id();
        org.jsoup.nodes.Node node95 = element89.clearAttributes();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(tag52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(nodeArray58);
        org.junit.Assert.assertNotNull(element59);
        org.junit.Assert.assertNotNull(element61);
        org.junit.Assert.assertNotNull(strMap62);
        org.junit.Assert.assertNotNull(tag65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(tag73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(tag80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(nodeArray86);
        org.junit.Assert.assertNotNull(element87);
        org.junit.Assert.assertNotNull(elements88);
        org.junit.Assert.assertNotNull(element89);
        org.junit.Assert.assertNotNull(strMap92);
        org.junit.Assert.assertNotNull(element93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertNotNull(node95);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.nodes.Element element3 = null;
        htmlTreeBuilder0.setHeadElement(element3);
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document7 = htmlTreeBuilder6.getDocument();
        boolean boolean8 = htmlTreeBuilder6.framesetOk();
        boolean boolean9 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = htmlTreeBuilder6.state();
        htmlTreeBuilder6.markInsertionMode();
        java.lang.String str12 = htmlTreeBuilder6.getBaseUri();
        htmlTreeBuilder6.setFosterInserts(true);
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        htmlTreeBuilder6.setHeadElement(element21);
        boolean boolean23 = element21.hasText();
        java.lang.String str24 = element21.tagName();
        htmlTreeBuilder0.maybeSetBaseUri(element21);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList26 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList28 = htmlTreeBuilder0.getStack();
        org.jsoup.nodes.Element element29 = htmlTreeBuilder0.getHeadElement();
        java.util.List<java.lang.String> strList30 = htmlTreeBuilder0.getPendingTableCharacters();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.popStackToBefore("<hi!>\n <hi!></hi!>\n</hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(elementList26);
        org.junit.Assert.assertNull(elementList28);
        org.junit.Assert.assertNull(element29);
        org.junit.Assert.assertNull(strList30);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.ForeignContent;
        org.jsoup.parser.Token token1 = null;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder2 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder2.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder2.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder2.state();
        boolean boolean7 = htmlTreeBuilderState0.process(token1, htmlTreeBuilder2);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = htmlTreeBuilder2.state();
        java.lang.String str9 = htmlTreeBuilder2.getBaseUri();
        java.lang.String str10 = htmlTreeBuilder2.getBaseUri();
        java.util.List<java.lang.String> strList11 = htmlTreeBuilder2.getPendingTableCharacters();
        htmlTreeBuilder2.setFosterInserts(true);
        java.lang.String[] strArray14 = org.jsoup.parser.HtmlTreeBuilder.TagSearchSpecial;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = htmlTreeBuilder2.inScope(strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNull(htmlTreeBuilderState5);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strList11);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.setFosterInserts(false);
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder12 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document13 = htmlTreeBuilder12.getDocument();
        boolean boolean14 = htmlTreeBuilder12.framesetOk();
        htmlTreeBuilder12.newPendingTableCharacters();
        htmlTreeBuilder12.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState17 = org.jsoup.parser.HtmlTreeBuilderState.InTable;
        htmlTreeBuilder12.transition(htmlTreeBuilderState17);
        htmlTreeBuilder0.transition(htmlTreeBuilderState17);
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState17);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.setFosterInserts(true);
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.FormElement formElement10 = null;
        htmlTreeBuilder0.setFormElement(formElement10);
        org.jsoup.parser.Tag tag13 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean14 = tag13.isBlock();
        boolean boolean15 = tag13.isEmpty();
        boolean boolean16 = tag13.isFormListed();
        org.jsoup.nodes.Element element18 = new org.jsoup.nodes.Element(tag13, "");
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean22 = tag21.isBlock();
        boolean boolean23 = tag21.isEmpty();
        boolean boolean24 = tag21.isFormListed();
        org.jsoup.nodes.Element element26 = new org.jsoup.nodes.Element(tag21, "");
        org.jsoup.parser.Tag tag28 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean29 = tag28.isBlock();
        boolean boolean30 = tag28.isEmpty();
        boolean boolean31 = tag28.isFormListed();
        org.jsoup.nodes.Element element33 = new org.jsoup.nodes.Element(tag28, "");
        org.jsoup.nodes.Node[] nodeArray34 = new org.jsoup.nodes.Node[] { element26, element33 };
        org.jsoup.nodes.Element element35 = element18.insertChildren((int) (byte) 0, nodeArray34);
        org.jsoup.select.Elements elements36 = element35.previousElementSiblings();
        java.lang.String str37 = element35.id();
        org.jsoup.select.Elements elements38 = element35.parents();
        int int39 = element35.childNodeSize();
        java.lang.String str40 = element35.nodeName();
        org.jsoup.nodes.Node node41 = element35.root();
        boolean boolean42 = element35.hasText();
        // The following exception was thrown during execution in test generation
        try {
            htmlTreeBuilder0.pushActiveFormattingElements(element35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(tag13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(nodeArray34);
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertNotNull(elements36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(elements38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isBlock();
        boolean boolean3 = tag1.isEmpty();
        boolean boolean4 = tag1.isFormListed();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "");
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.isFormListed();
        org.jsoup.nodes.Element element14 = new org.jsoup.nodes.Element(tag9, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.nodes.Node[] nodeArray22 = new org.jsoup.nodes.Node[] { element14, element21 };
        org.jsoup.nodes.Element element23 = element6.insertChildren((int) (byte) 0, nodeArray22);
        org.jsoup.nodes.Element element25 = element23.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = element25.dataset();
        org.jsoup.nodes.Element element27 = element25.previousElementSibling();
        org.jsoup.select.Elements elements28 = element25.siblingElements();
        org.jsoup.nodes.Element element30 = element25.prependElement("hi!");
        org.jsoup.nodes.Node node31 = element30.root();
        org.jsoup.parser.Tag tag33 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean34 = tag33.isInline();
        boolean boolean35 = tag33.isFormListed();
        boolean boolean36 = element30.hasSameValue((java.lang.Object) tag33);
        java.lang.String str37 = tag33.getName();
        boolean boolean38 = tag33.isFormListed();
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element(tag33, "<hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>&lt;hi!&gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &lt;/hi!&gt;\n</hi!>");
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(element25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNull(element27);
        org.junit.Assert.assertNotNull(elements28);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(tag33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.Tag tag8 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean9 = tag8.isBlock();
        boolean boolean10 = tag8.isEmpty();
        boolean boolean11 = tag8.isFormListed();
        org.jsoup.nodes.Element element13 = new org.jsoup.nodes.Element(tag8, "");
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        org.jsoup.nodes.Node[] nodeArray29 = new org.jsoup.nodes.Node[] { element21, element28 };
        org.jsoup.nodes.Element element30 = element13.insertChildren((int) (byte) 0, nodeArray29);
        boolean boolean31 = htmlTreeBuilder0.isSpecial(element13);
        org.jsoup.nodes.Element element33 = element13.text("hi!");
        org.jsoup.nodes.Element element34 = element33.shallowClone();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = element34.dataset();
        int int36 = element34.elementSiblingIndex();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder37 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document38 = htmlTreeBuilder37.getDocument();
        boolean boolean39 = htmlTreeBuilder37.framesetOk();
        boolean boolean40 = htmlTreeBuilder37.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState41 = htmlTreeBuilder37.state();
        htmlTreeBuilder37.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings43 = htmlTreeBuilder37.defaultSettings();
        org.jsoup.parser.Tag tag45 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean46 = tag45.isBlock();
        boolean boolean47 = tag45.isEmpty();
        boolean boolean48 = tag45.isFormListed();
        org.jsoup.nodes.Element element50 = new org.jsoup.nodes.Element(tag45, "");
        org.jsoup.parser.Tag tag53 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean54 = tag53.isBlock();
        boolean boolean55 = tag53.isEmpty();
        boolean boolean56 = tag53.isFormListed();
        org.jsoup.nodes.Element element58 = new org.jsoup.nodes.Element(tag53, "");
        org.jsoup.parser.Tag tag60 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean61 = tag60.isBlock();
        boolean boolean62 = tag60.isEmpty();
        boolean boolean63 = tag60.isFormListed();
        org.jsoup.nodes.Element element65 = new org.jsoup.nodes.Element(tag60, "");
        org.jsoup.nodes.Node[] nodeArray66 = new org.jsoup.nodes.Node[] { element58, element65 };
        org.jsoup.nodes.Element element67 = element50.insertChildren((int) (byte) 0, nodeArray66);
        boolean boolean68 = htmlTreeBuilder37.isSpecial(element50);
        org.jsoup.nodes.Element element70 = element50.text("hi!");
        org.jsoup.nodes.Element element71 = element70.shallowClone();
        org.jsoup.nodes.Element element72 = element70.previousElementSibling();
        org.jsoup.nodes.Element element74 = element70.getElementById("hi!");
        org.jsoup.nodes.Element element76 = element70.prependElement("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Node node77 = element76.root();
        org.jsoup.nodes.Element element79 = element76.text("hi!");
        org.jsoup.select.Elements elements81 = element79.getElementsByIndexLessThan(10);
        org.jsoup.select.Elements elements83 = element79.getElementsByIndexGreaterThan((int) (byte) -1);
        org.jsoup.nodes.Element element84 = element34.prependChild((org.jsoup.nodes.Node) element79);
        org.jsoup.select.Elements elements86 = element84.getElementsByClass("<hi! class=\"\"></hi!>");
        java.lang.String str87 = element84.outerHtml();
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(parseSettings6);
        org.junit.Assert.assertNotNull(tag8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertNotNull(element30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(element34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(document38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState41);
        org.junit.Assert.assertNotNull(parseSettings43);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(tag53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(tag60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(nodeArray66);
        org.junit.Assert.assertNotNull(element67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(element70);
        org.junit.Assert.assertNotNull(element71);
        org.junit.Assert.assertNull(element72);
        org.junit.Assert.assertNull(element74);
        org.junit.Assert.assertNotNull(element76);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(element79);
        org.junit.Assert.assertNotNull(elements81);
        org.junit.Assert.assertNotNull(elements83);
        org.junit.Assert.assertNotNull(element84);
        org.junit.Assert.assertNotNull(elements86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "<hi!>\n <<hi!>\n <hi!></hi!>\n</hi!>>\n  hi!\n </<hi!>\n <hi!></hi!>\n</hi!>>\n</hi!>" + "'", str87, "<hi!>\n <<hi!>\n <hi!></hi!>\n</hi!>>\n  hi!\n </<hi!>\n <hi!></hi!>\n</hi!>>\n</hi!>");
    }
}

