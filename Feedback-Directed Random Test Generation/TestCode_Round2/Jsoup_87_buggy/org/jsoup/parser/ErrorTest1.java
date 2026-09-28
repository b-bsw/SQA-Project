package org.jsoup.parser;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("<hi! class=\"\">\n <hi!></hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
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
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.Element element18 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element19 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.util.List<java.lang.String> strList3 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.Tag tag7 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean8 = tag7.isBlock();
        boolean boolean9 = tag7.isEmpty();
        boolean boolean10 = tag7.isFormListed();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag7, "");
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean16 = tag15.isBlock();
        boolean boolean17 = tag15.isEmpty();
        boolean boolean18 = tag15.isFormListed();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag15, "");
        org.jsoup.parser.Tag tag22 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean23 = tag22.isBlock();
        boolean boolean24 = tag22.isEmpty();
        boolean boolean25 = tag22.isFormListed();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag22, "");
        org.jsoup.nodes.Node[] nodeArray28 = new org.jsoup.nodes.Node[] { element20, element27 };
        org.jsoup.nodes.Element element29 = element12.insertChildren((int) (byte) 0, nodeArray28);
        org.jsoup.nodes.Element element31 = element29.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap32 = element31.dataset();
        org.jsoup.parser.Tag tag35 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean36 = tag35.isBlock();
        boolean boolean37 = tag35.isEmpty();
        boolean boolean38 = tag35.isFormListed();
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element(tag35, "");
        org.jsoup.parser.Tag tag43 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean44 = tag43.isBlock();
        boolean boolean45 = tag43.isEmpty();
        boolean boolean46 = tag43.isFormListed();
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element(tag43, "");
        org.jsoup.parser.Tag tag50 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean51 = tag50.isBlock();
        boolean boolean52 = tag50.isEmpty();
        boolean boolean53 = tag50.isFormListed();
        org.jsoup.nodes.Element element55 = new org.jsoup.nodes.Element(tag50, "");
        org.jsoup.nodes.Node[] nodeArray56 = new org.jsoup.nodes.Node[] { element48, element55 };
        org.jsoup.nodes.Element element57 = element40.insertChildren((int) (byte) 0, nodeArray56);
        org.jsoup.select.Elements elements58 = element57.previousElementSiblings();
        org.jsoup.nodes.Element element59 = element31.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements58);
        java.lang.String str60 = element31.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean61 = htmlTreeBuilder0.isInActiveFormattingElements(element31);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(true);
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
        org.jsoup.nodes.Element element33 = element30.append("");
        org.jsoup.nodes.Element element35 = element33.val("<<hi! class=\"\">\n hi!\n</hi!>></<hi! class=\"\">\n hi!\n</hi!>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.push(element35);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
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
        org.jsoup.nodes.Element element32 = element30.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap33 = element32.dataset();
        org.jsoup.parser.Tag tag36 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean37 = tag36.isBlock();
        boolean boolean38 = tag36.isEmpty();
        boolean boolean39 = tag36.isFormListed();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag36, "");
        org.jsoup.parser.Tag tag44 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean45 = tag44.isBlock();
        boolean boolean46 = tag44.isEmpty();
        boolean boolean47 = tag44.isFormListed();
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element(tag44, "");
        org.jsoup.parser.Tag tag51 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean52 = tag51.isBlock();
        boolean boolean53 = tag51.isEmpty();
        boolean boolean54 = tag51.isFormListed();
        org.jsoup.nodes.Element element56 = new org.jsoup.nodes.Element(tag51, "");
        org.jsoup.nodes.Node[] nodeArray57 = new org.jsoup.nodes.Node[] { element49, element56 };
        org.jsoup.nodes.Element element58 = element41.insertChildren((int) (byte) 0, nodeArray57);
        org.jsoup.select.Elements elements59 = element58.previousElementSiblings();
        org.jsoup.nodes.Element element60 = element32.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements59);
        element60.setBaseUri("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap63 = element60.dataset();
        int int64 = element60.elementSiblingIndex();
        org.jsoup.select.Elements elements66 = element60.getElementsByTag("<hi!>\n <hi!></hi!>\n</hi!>");
        htmlTreeBuilder0.maybeSetBaseUri(element60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.ParseSettings parseSettings4 = htmlTreeBuilder0.defaultSettings();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = org.jsoup.parser.HtmlTreeBuilderState.InSelect;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.error(htmlTreeBuilderState6);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
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
        org.jsoup.select.Elements elements31 = element30.previousElementSiblings();
        java.lang.String str32 = element30.id();
        org.jsoup.select.Elements elements33 = element30.parents();
        int int34 = element30.childNodeSize();
        org.jsoup.nodes.Element element36 = element30.removeClass("hi!");
        org.jsoup.nodes.Element element37 = element30.clone();
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
        org.jsoup.nodes.Element element63 = element61.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap64 = element63.dataset();
        org.jsoup.nodes.Element element65 = element63.empty();
        java.util.List<org.jsoup.nodes.Node> nodeList66 = element65.childNodesCopy();
        org.jsoup.nodes.Element element68 = element65.append("");
        java.lang.String str69 = element65.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertOnStackAfter(element30, element65);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
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
        java.util.List<java.lang.String> strList32 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.nodes.Element element33 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element34 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
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
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState32 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState33 = org.jsoup.parser.HtmlTreeBuilderState.InHeadNoscript;
        htmlTreeBuilder0.transition(htmlTreeBuilderState33);
        org.jsoup.parser.Tag tag36 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean37 = tag36.isFormListed();
        org.jsoup.nodes.Element element39 = new org.jsoup.nodes.Element(tag36, "hi!");
        org.jsoup.nodes.Element element41 = element39.appendText("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.nodes.Element element42 = element41.shallowClone();
        org.jsoup.select.Elements elements44 = element41.getElementsByTag("<hi!>\n <hi!></hi!>\n</hi!>");
        htmlTreeBuilder0.setHeadElement(element41);
        java.lang.String[] strArray47 = org.jsoup.parser.HtmlTreeBuilder.TagSearchButton;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean48 = htmlTreeBuilder0.inScope("<hi!>\n <hi!></hi!>\n</hi!>", strArray47);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
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
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState32 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState33 = org.jsoup.parser.HtmlTreeBuilderState.InHeadNoscript;
        htmlTreeBuilder0.transition(htmlTreeBuilderState33);
        java.lang.String[] strArray35 = org.jsoup.parser.HtmlTreeBuilder.TagSearchEndTags;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean36 = htmlTreeBuilder0.inScope(strArray35);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isFormListed();
        org.jsoup.nodes.Element element4 = new org.jsoup.nodes.Element(tag1, "hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsMatchingText("hi!");
        org.jsoup.select.Elements elements7 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element9 = element4.tagName("hi!");
        org.jsoup.parser.Tag tag11 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean12 = tag11.isBlock();
        boolean boolean13 = tag11.isEmpty();
        boolean boolean14 = tag11.isFormListed();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag11, "");
        org.jsoup.parser.Tag tag19 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean20 = tag19.isBlock();
        boolean boolean21 = tag19.isEmpty();
        boolean boolean22 = tag19.isFormListed();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element(tag19, "");
        org.jsoup.parser.Tag tag26 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean27 = tag26.isBlock();
        boolean boolean28 = tag26.isEmpty();
        boolean boolean29 = tag26.isFormListed();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag26, "");
        org.jsoup.nodes.Node[] nodeArray32 = new org.jsoup.nodes.Node[] { element24, element31 };
        org.jsoup.nodes.Element element33 = element16.insertChildren((int) (byte) 0, nodeArray32);
        org.jsoup.nodes.Element element35 = element16.toggleClass("");
        org.jsoup.nodes.Element element37 = element16.addClass("<hi!></hi!>\n<hi!></hi!>");
        java.util.Map<java.lang.String, java.lang.String> strMap38 = element37.dataset();
        org.jsoup.nodes.Element element40 = element37.append("");
        org.jsoup.nodes.Element element41 = element40.clone();
        org.jsoup.nodes.Element element43 = element40.appendElement("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.nodes.Element element44 = element4.appendChild((org.jsoup.nodes.Node) element40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element45 = element44.lastElementSibling();
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        htmlTreeBuilder0.framesetOk(true);
        boolean boolean10 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = org.jsoup.parser.HtmlTreeBuilderState.InFrameset;
        htmlTreeBuilder0.transition(htmlTreeBuilderState12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element15 = htmlTreeBuilder0.insertStartTag("<hi! class=\"\"></hi!>");
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = org.jsoup.parser.HtmlTreeBuilderState.InTable;
        htmlTreeBuilder0.transition(htmlTreeBuilderState5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = org.jsoup.parser.HtmlTreeBuilderState.InBody;
        htmlTreeBuilder0.transition(htmlTreeBuilderState7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isFormListed();
        org.jsoup.nodes.Element element4 = new org.jsoup.nodes.Element(tag1, "hi!");
        org.jsoup.nodes.Element element6 = element4.appendText("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.select.Elements elements7 = element4.previousElementSiblings();
        java.lang.String str8 = element4.tagName();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder9.setFosterInserts(false);
        java.lang.String str12 = htmlTreeBuilder9.getBaseUri();
        org.jsoup.nodes.Document document13 = htmlTreeBuilder9.getDocument();
        boolean boolean14 = element4.hasSameValue((java.lang.Object) htmlTreeBuilder9);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder15 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document16 = htmlTreeBuilder15.getDocument();
        boolean boolean17 = htmlTreeBuilder15.framesetOk();
        boolean boolean18 = htmlTreeBuilder15.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder15.state();
        htmlTreeBuilder15.markInsertionMode();
        java.lang.String str21 = htmlTreeBuilder15.getBaseUri();
        htmlTreeBuilder15.setFosterInserts(true);
        org.jsoup.parser.Tag tag25 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean26 = tag25.isBlock();
        boolean boolean27 = tag25.isEmpty();
        boolean boolean28 = tag25.isFormListed();
        org.jsoup.nodes.Element element30 = new org.jsoup.nodes.Element(tag25, "");
        htmlTreeBuilder15.setHeadElement(element30);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList32 = element30.textNodes();
        java.lang.String str34 = element30.attr("");
        java.lang.String str35 = element30.cssSelector();
        int int36 = element30.siblingIndex();
        org.jsoup.select.Elements elements38 = element30.getElementsMatchingText("");
        org.jsoup.nodes.Element element40 = element30.toggleClass("<<hi! class=\"\">\n hi!\n</hi!>></<hi! class=\"\">\n hi!\n</hi!>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean41 = htmlTreeBuilder9.isInActiveFormattingElements(element30);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.state();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder3 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document4 = htmlTreeBuilder3.getDocument();
        boolean boolean5 = htmlTreeBuilder3.framesetOk();
        boolean boolean6 = htmlTreeBuilder3.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = htmlTreeBuilder3.state();
        htmlTreeBuilder3.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings9 = htmlTreeBuilder3.defaultSettings();
        org.jsoup.parser.Tag tag11 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean12 = tag11.isBlock();
        boolean boolean13 = tag11.isEmpty();
        boolean boolean14 = tag11.isFormListed();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag11, "");
        org.jsoup.parser.Tag tag19 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean20 = tag19.isBlock();
        boolean boolean21 = tag19.isEmpty();
        boolean boolean22 = tag19.isFormListed();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element(tag19, "");
        org.jsoup.parser.Tag tag26 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean27 = tag26.isBlock();
        boolean boolean28 = tag26.isEmpty();
        boolean boolean29 = tag26.isFormListed();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag26, "");
        org.jsoup.nodes.Node[] nodeArray32 = new org.jsoup.nodes.Node[] { element24, element31 };
        org.jsoup.nodes.Element element33 = element16.insertChildren((int) (byte) 0, nodeArray32);
        boolean boolean34 = htmlTreeBuilder3.isSpecial(element16);
        org.jsoup.nodes.Element element36 = element16.text("hi!");
        org.jsoup.nodes.Element element37 = element36.shallowClone();
        java.util.Map<java.lang.String, java.lang.String> strMap38 = element37.dataset();
        int int39 = element37.elementSiblingIndex();
        org.jsoup.nodes.Node node40 = element37.previousSibling();
        java.lang.String str41 = element37.id();
        org.jsoup.select.Elements elements43 = element37.getElementsContainingOwnText("<hi!>\n <hi!></hi!>\n</hi!>");
        boolean boolean44 = htmlTreeBuilder0.isSpecial(element37);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList45 = htmlTreeBuilder0.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder46 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document47 = htmlTreeBuilder46.getDocument();
        boolean boolean48 = htmlTreeBuilder46.framesetOk();
        boolean boolean49 = htmlTreeBuilder46.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState50 = htmlTreeBuilder46.state();
        htmlTreeBuilder46.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings52 = htmlTreeBuilder46.defaultSettings();
        org.jsoup.parser.Tag tag54 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean55 = tag54.isBlock();
        boolean boolean56 = tag54.isEmpty();
        boolean boolean57 = tag54.isFormListed();
        org.jsoup.nodes.Element element59 = new org.jsoup.nodes.Element(tag54, "");
        org.jsoup.parser.Tag tag62 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean63 = tag62.isBlock();
        boolean boolean64 = tag62.isEmpty();
        boolean boolean65 = tag62.isFormListed();
        org.jsoup.nodes.Element element67 = new org.jsoup.nodes.Element(tag62, "");
        org.jsoup.parser.Tag tag69 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean70 = tag69.isBlock();
        boolean boolean71 = tag69.isEmpty();
        boolean boolean72 = tag69.isFormListed();
        org.jsoup.nodes.Element element74 = new org.jsoup.nodes.Element(tag69, "");
        org.jsoup.nodes.Node[] nodeArray75 = new org.jsoup.nodes.Node[] { element67, element74 };
        org.jsoup.nodes.Element element76 = element59.insertChildren((int) (byte) 0, nodeArray75);
        boolean boolean77 = htmlTreeBuilder46.isSpecial(element59);
        org.jsoup.nodes.Element element79 = element59.text("hi!");
        org.jsoup.nodes.Element element80 = element79.shallowClone();
        org.jsoup.nodes.Element element81 = element79.previousElementSibling();
        org.jsoup.select.Elements elements83 = element79.getElementsByIndexGreaterThan((int) (byte) 1);
        java.lang.String str84 = element79.className();
        org.jsoup.select.Elements elements86 = element79.getElementsMatchingText("<hi! class=\"\">\n <hi!></hi!>\n <hi!></hi!>\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insert(element79);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = org.jsoup.parser.HtmlTreeBuilderState.InColumnGroup;
        htmlTreeBuilder0.transition(htmlTreeBuilderState4);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inTableScope("<hi!>\n <hi!></hi!>\n <hi!></hi!>\n <hi!></hi!>&lt;hi!&gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.pushActiveFormattingElements(element39);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.parser.Tag tag2 = tag1.setSelfClosing();
        boolean boolean3 = tag1.isKnownTag();
        boolean boolean4 = tag1.isKnownTag();
        org.jsoup.nodes.Element element6 = new org.jsoup.nodes.Element(tag1, "<hi! class=\"\"></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = element6.wrap("hi!");
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.util.List<java.lang.String> strList3 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.Tag tag7 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean8 = tag7.isBlock();
        boolean boolean9 = tag7.isEmpty();
        boolean boolean10 = tag7.isFormListed();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag7, "");
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean16 = tag15.isBlock();
        boolean boolean17 = tag15.isEmpty();
        boolean boolean18 = tag15.isFormListed();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag15, "");
        org.jsoup.parser.Tag tag22 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean23 = tag22.isBlock();
        boolean boolean24 = tag22.isEmpty();
        boolean boolean25 = tag22.isFormListed();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag22, "");
        org.jsoup.nodes.Node[] nodeArray28 = new org.jsoup.nodes.Node[] { element20, element27 };
        org.jsoup.nodes.Element element29 = element12.insertChildren((int) (byte) 0, nodeArray28);
        org.jsoup.nodes.Element element31 = element29.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap32 = element31.dataset();
        org.jsoup.parser.Tag tag35 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean36 = tag35.isBlock();
        boolean boolean37 = tag35.isEmpty();
        boolean boolean38 = tag35.isFormListed();
        org.jsoup.nodes.Element element40 = new org.jsoup.nodes.Element(tag35, "");
        org.jsoup.parser.Tag tag43 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean44 = tag43.isBlock();
        boolean boolean45 = tag43.isEmpty();
        boolean boolean46 = tag43.isFormListed();
        org.jsoup.nodes.Element element48 = new org.jsoup.nodes.Element(tag43, "");
        org.jsoup.parser.Tag tag50 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean51 = tag50.isBlock();
        boolean boolean52 = tag50.isEmpty();
        boolean boolean53 = tag50.isFormListed();
        org.jsoup.nodes.Element element55 = new org.jsoup.nodes.Element(tag50, "");
        org.jsoup.nodes.Node[] nodeArray56 = new org.jsoup.nodes.Node[] { element48, element55 };
        org.jsoup.nodes.Element element57 = element40.insertChildren((int) (byte) 0, nodeArray56);
        org.jsoup.select.Elements elements58 = element57.previousElementSiblings();
        org.jsoup.nodes.Element element59 = element31.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements58);
        element59.setBaseUri("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap62 = element59.dataset();
        org.jsoup.parser.Tag tag64 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean65 = tag64.isBlock();
        boolean boolean66 = tag64.isEmpty();
        boolean boolean67 = tag64.isFormListed();
        org.jsoup.nodes.Element element69 = new org.jsoup.nodes.Element(tag64, "");
        org.jsoup.parser.Tag tag72 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean73 = tag72.isBlock();
        boolean boolean74 = tag72.isEmpty();
        boolean boolean75 = tag72.isFormListed();
        org.jsoup.nodes.Element element77 = new org.jsoup.nodes.Element(tag72, "");
        org.jsoup.parser.Tag tag79 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean80 = tag79.isBlock();
        boolean boolean81 = tag79.isEmpty();
        boolean boolean82 = tag79.isFormListed();
        org.jsoup.nodes.Element element84 = new org.jsoup.nodes.Element(tag79, "");
        org.jsoup.nodes.Node[] nodeArray85 = new org.jsoup.nodes.Node[] { element77, element84 };
        org.jsoup.nodes.Element element86 = element69.insertChildren((int) (byte) 0, nodeArray85);
        org.jsoup.select.Elements elements87 = element86.previousElementSiblings();
        java.lang.String str88 = element86.id();
        org.jsoup.nodes.Element element89 = element59.appendTo(element86);
        org.jsoup.nodes.Element element91 = element89.removeClass("<hi!>\n <hi!></hi!>\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList92 = element91.siblingNodes();
        org.jsoup.nodes.Element element94 = element91.prepend("<hi! class=\"\"></hi!>");
        int int95 = element91.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) element91);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document9 = htmlTreeBuilder8.getDocument();
        boolean boolean10 = htmlTreeBuilder8.framesetOk();
        boolean boolean11 = htmlTreeBuilder8.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder8.state();
        htmlTreeBuilder8.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings14 = htmlTreeBuilder8.defaultSettings();
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag24 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean25 = tag24.isBlock();
        boolean boolean26 = tag24.isEmpty();
        boolean boolean27 = tag24.isFormListed();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag24, "");
        org.jsoup.parser.Tag tag31 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean32 = tag31.isBlock();
        boolean boolean33 = tag31.isEmpty();
        boolean boolean34 = tag31.isFormListed();
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element(tag31, "");
        org.jsoup.nodes.Node[] nodeArray37 = new org.jsoup.nodes.Node[] { element29, element36 };
        org.jsoup.nodes.Element element38 = element21.insertChildren((int) (byte) 0, nodeArray37);
        boolean boolean39 = htmlTreeBuilder8.isSpecial(element21);
        org.jsoup.nodes.Element element41 = element21.text("hi!");
        org.jsoup.nodes.Element element42 = element41.shallowClone();
        org.jsoup.nodes.Element element43 = element41.previousElementSibling();
        org.jsoup.nodes.Element element45 = element41.getElementById("hi!");
        org.jsoup.nodes.Element element47 = element41.prependElement("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element49 = element47.prependText("");
        org.jsoup.parser.Tag tag50 = element49.tag();
        java.lang.String str51 = tag50.getName();
        boolean boolean52 = tag50.isInline();
        org.jsoup.parser.Tag tag55 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean56 = tag55.isFormListed();
        org.jsoup.nodes.Element element58 = new org.jsoup.nodes.Element(tag55, "hi!");
        org.jsoup.select.Elements elements60 = element58.getElementsMatchingText("hi!");
        org.jsoup.nodes.Element element62 = element58.addClass("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Attributes attributes63 = element58.attributes();
        org.jsoup.nodes.Element element64 = new org.jsoup.nodes.Element(tag50, "&lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;", attributes63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean65 = htmlTreeBuilder0.processStartTag("<hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \">\n <hi!></hi!>\n <hi!></hi!>hi!\n</hi!>", attributes63);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder0.state();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList10 = htmlTreeBuilder0.getStack();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element11 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isFormListed();
        org.jsoup.nodes.Element element4 = new org.jsoup.nodes.Element(tag1, "hi!");
        org.jsoup.nodes.Element element6 = element4.appendText("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.select.Elements elements7 = element4.previousElementSiblings();
        java.lang.String str8 = element4.tagName();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder9.setFosterInserts(false);
        java.lang.String str12 = htmlTreeBuilder9.getBaseUri();
        org.jsoup.nodes.Document document13 = htmlTreeBuilder9.getDocument();
        boolean boolean14 = element4.hasSameValue((java.lang.Object) htmlTreeBuilder9);
        org.jsoup.parser.ParseSettings parseSettings15 = htmlTreeBuilder9.defaultSettings();
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder9.removeFromActiveFormattingElements(element31);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        org.jsoup.parser.Tag tag7 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean8 = tag7.isBlock();
        boolean boolean9 = tag7.isEmpty();
        boolean boolean10 = tag7.isFormListed();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag7, "");
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean16 = tag15.isBlock();
        boolean boolean17 = tag15.isEmpty();
        boolean boolean18 = tag15.isFormListed();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag15, "");
        org.jsoup.parser.Tag tag22 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean23 = tag22.isBlock();
        boolean boolean24 = tag22.isEmpty();
        boolean boolean25 = tag22.isFormListed();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag22, "");
        org.jsoup.nodes.Node[] nodeArray28 = new org.jsoup.nodes.Node[] { element20, element27 };
        org.jsoup.nodes.Element element29 = element12.insertChildren((int) (byte) 0, nodeArray28);
        org.jsoup.nodes.Element element31 = element12.toggleClass("");
        org.jsoup.select.Elements elements33 = element12.getElementsMatchingOwnText("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.nodes.Element element34 = element12.previousElementSibling();
        org.jsoup.select.Elements elements35 = element12.getAllElements();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder36 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document37 = htmlTreeBuilder36.getDocument();
        boolean boolean38 = htmlTreeBuilder36.framesetOk();
        boolean boolean39 = htmlTreeBuilder36.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState40 = htmlTreeBuilder36.state();
        htmlTreeBuilder36.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings42 = htmlTreeBuilder36.defaultSettings();
        org.jsoup.parser.Tag tag44 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean45 = tag44.isBlock();
        boolean boolean46 = tag44.isEmpty();
        boolean boolean47 = tag44.isFormListed();
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element(tag44, "");
        org.jsoup.parser.Tag tag52 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean53 = tag52.isBlock();
        boolean boolean54 = tag52.isEmpty();
        boolean boolean55 = tag52.isFormListed();
        org.jsoup.nodes.Element element57 = new org.jsoup.nodes.Element(tag52, "");
        org.jsoup.parser.Tag tag59 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean60 = tag59.isBlock();
        boolean boolean61 = tag59.isEmpty();
        boolean boolean62 = tag59.isFormListed();
        org.jsoup.nodes.Element element64 = new org.jsoup.nodes.Element(tag59, "");
        org.jsoup.nodes.Node[] nodeArray65 = new org.jsoup.nodes.Node[] { element57, element64 };
        org.jsoup.nodes.Element element66 = element49.insertChildren((int) (byte) 0, nodeArray65);
        boolean boolean67 = htmlTreeBuilder36.isSpecial(element49);
        org.jsoup.nodes.Element element68 = element49.clone();
        org.jsoup.nodes.Element element70 = element68.text("");
        boolean boolean71 = element70.isBlock();
        org.jsoup.parser.Tag tag72 = element70.tag();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.replaceOnStack(element12, element70);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.nodes.FormElement formElement9 = htmlTreeBuilder0.getFormElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableBodyContext();
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        org.jsoup.parser.ParseSettings parseSettings8 = htmlTreeBuilder0.defaultSettings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose("<hi!></hi!>");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.FormElement formElement4 = htmlTreeBuilder0.getFormElement();
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
        java.util.Map<java.lang.String, java.lang.String> strMap31 = element30.dataset();
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
        org.jsoup.select.Elements elements57 = element56.previousElementSiblings();
        org.jsoup.nodes.Element element58 = element30.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements57);
        org.jsoup.nodes.Node node59 = element58.clearAttributes();
        boolean boolean61 = element58.hasAttr("");
        org.jsoup.nodes.Element element63 = element58.prepend("<hi!></hi!>");
        org.jsoup.select.Elements elements65 = element58.getElementsByIndexEquals((int) (byte) 10);
        org.jsoup.nodes.Element element66 = element58.parent();
        boolean boolean67 = element58.hasText();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.pushActiveFormattingElements(element58);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        org.jsoup.parser.Tag tag7 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean8 = tag7.isBlock();
        boolean boolean9 = tag7.isBlock();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder10 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document11 = htmlTreeBuilder10.getDocument();
        boolean boolean12 = htmlTreeBuilder10.framesetOk();
        boolean boolean13 = htmlTreeBuilder10.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = htmlTreeBuilder10.state();
        htmlTreeBuilder10.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings16 = htmlTreeBuilder10.defaultSettings();
        org.jsoup.parser.Tag tag18 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean19 = tag18.isBlock();
        boolean boolean20 = tag18.isEmpty();
        boolean boolean21 = tag18.isFormListed();
        org.jsoup.nodes.Element element23 = new org.jsoup.nodes.Element(tag18, "");
        org.jsoup.parser.Tag tag26 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean27 = tag26.isBlock();
        boolean boolean28 = tag26.isEmpty();
        boolean boolean29 = tag26.isFormListed();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag26, "");
        org.jsoup.parser.Tag tag33 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean34 = tag33.isBlock();
        boolean boolean35 = tag33.isEmpty();
        boolean boolean36 = tag33.isFormListed();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag33, "");
        org.jsoup.nodes.Node[] nodeArray39 = new org.jsoup.nodes.Node[] { element31, element38 };
        org.jsoup.nodes.Element element40 = element23.insertChildren((int) (byte) 0, nodeArray39);
        boolean boolean41 = htmlTreeBuilder10.isSpecial(element23);
        org.jsoup.nodes.Element element43 = element23.text("hi!");
        org.jsoup.nodes.Element element44 = element43.shallowClone();
        org.jsoup.nodes.Element element47 = element44.attr("", "<hi!>\n <hi!></hi!>\n</hi!>");
        boolean boolean49 = element44.hasSameValue((java.lang.Object) (short) -1);
        org.jsoup.select.Elements elements51 = element44.getElementsMatchingText("<hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \">\n <hi!></hi!>\n <hi!></hi!>hi!\n</hi!>");
        boolean boolean52 = tag7.equals((java.lang.Object) element44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.removeFromActiveFormattingElements(element44);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("<hi!>\n <hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \"> \n  <hi!></hi!> \n  <hi!></hi!>hi! \n </hi!>\n</hi!>");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
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
        boolean boolean33 = element31.hasAttr("");
        org.jsoup.select.Elements elements35 = element31.getElementsContainingText("<hi!>\n <hi!></hi!>\n</hi!>");
        java.lang.String str36 = element31.id();
        htmlTreeBuilder0.setHeadElement(element31);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder38 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document39 = htmlTreeBuilder38.getDocument();
        boolean boolean40 = htmlTreeBuilder38.framesetOk();
        htmlTreeBuilder38.newPendingTableCharacters();
        htmlTreeBuilder38.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState43 = org.jsoup.parser.HtmlTreeBuilderState.InTable;
        htmlTreeBuilder38.transition(htmlTreeBuilderState43);
        htmlTreeBuilder0.transition(htmlTreeBuilderState43);
        java.lang.String[] strArray46 = org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean47 = htmlTreeBuilder0.inScope(strArray46);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document9 = htmlTreeBuilder8.getDocument();
        boolean boolean10 = htmlTreeBuilder8.framesetOk();
        boolean boolean11 = htmlTreeBuilder8.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder8.state();
        htmlTreeBuilder8.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings14 = htmlTreeBuilder8.defaultSettings();
        org.jsoup.parser.Tag tag16 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean17 = tag16.isBlock();
        boolean boolean18 = tag16.isEmpty();
        boolean boolean19 = tag16.isFormListed();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag16, "");
        org.jsoup.parser.Tag tag24 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean25 = tag24.isBlock();
        boolean boolean26 = tag24.isEmpty();
        boolean boolean27 = tag24.isFormListed();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag24, "");
        org.jsoup.parser.Tag tag31 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean32 = tag31.isBlock();
        boolean boolean33 = tag31.isEmpty();
        boolean boolean34 = tag31.isFormListed();
        org.jsoup.nodes.Element element36 = new org.jsoup.nodes.Element(tag31, "");
        org.jsoup.nodes.Node[] nodeArray37 = new org.jsoup.nodes.Node[] { element29, element36 };
        org.jsoup.nodes.Element element38 = element21.insertChildren((int) (byte) 0, nodeArray37);
        boolean boolean39 = htmlTreeBuilder8.isSpecial(element21);
        org.jsoup.nodes.Element element41 = element21.text("hi!");
        org.jsoup.nodes.Element element42 = element41.shallowClone();
        org.jsoup.nodes.Element element43 = element41.previousElementSibling();
        org.jsoup.nodes.Element element45 = element41.getElementById("hi!");
        org.jsoup.nodes.Element element47 = element41.prependElement("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Element element49 = element47.prependText("");
        org.jsoup.select.Elements elements51 = element49.getElementsByIndexLessThan((int) (byte) 100);
        org.jsoup.nodes.Attributes attributes52 = element49.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean53 = htmlTreeBuilder0.processStartTag("<hi!>\n &lt;hi!&gt; &lt;hi!&gt;&lt;/hi!&gt; &lt;/hi!&gt;\n</hi!>", attributes52);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = htmlTreeBuilder0.inListItemScope("<hi!>\n &lt;hi!&gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &lt;/hi!&gt;\n</hi!>");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.insertStartTag("<hi!>\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.reconstructFormattingElements();
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.generateImpliedEndTags();
        java.lang.String str7 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document8 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element9 = htmlTreeBuilder0.removeLastFormattingElement();
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState2 = htmlTreeBuilder0.originalState();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Tag tag6 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean7 = tag6.isFormListed();
        org.jsoup.nodes.Element element9 = new org.jsoup.nodes.Element(tag6, "hi!");
        org.jsoup.nodes.Element element11 = element9.appendText("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.nodes.Element element12 = element11.shallowClone();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document14 = htmlTreeBuilder13.getDocument();
        boolean boolean15 = htmlTreeBuilder13.framesetOk();
        boolean boolean16 = htmlTreeBuilder13.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState17 = htmlTreeBuilder13.state();
        htmlTreeBuilder13.markInsertionMode();
        java.lang.String str19 = htmlTreeBuilder13.getBaseUri();
        htmlTreeBuilder13.setFosterInserts(true);
        org.jsoup.parser.Tag tag23 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean24 = tag23.isBlock();
        boolean boolean25 = tag23.isEmpty();
        boolean boolean26 = tag23.isFormListed();
        org.jsoup.nodes.Element element28 = new org.jsoup.nodes.Element(tag23, "");
        htmlTreeBuilder13.setHeadElement(element28);
        java.util.List<org.jsoup.nodes.TextNode> textNodeList30 = element28.textNodes();
        org.jsoup.nodes.Element element32 = element28.tagName("hi!");
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "<hi!>\n <hi!></hi!>\n</hi!>", "" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        org.jsoup.nodes.Element element39 = element28.classNames((java.util.Set<java.lang.String>) strSet37);
        org.jsoup.select.Elements elements42 = element28.getElementsByAttributeValue("<hi!></hi!>", "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element43 = element28.previousElementSibling();
        org.jsoup.nodes.Element element44 = element28.shallowClone();
        boolean boolean45 = element11.hasSameValue((java.lang.Object) element28);
        org.jsoup.nodes.Element element46 = element28.clone();
        htmlTreeBuilder0.setHeadElement(element46);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState48 = org.jsoup.parser.HtmlTreeBuilderState.AfterFrameset;
        htmlTreeBuilder0.transition(htmlTreeBuilderState48);
        java.util.List<java.lang.String> strList50 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean52 = htmlTreeBuilder0.inListItemScope("<hi! class=\"<<hi! class=&quot;&quot;>\n hi!\n</hi!>></<hi! class=&quot;&quot;>\n hi!\n</hi!>>\">\n <hi!></hi!>\n</hi!>");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = org.jsoup.parser.HtmlTreeBuilderState.InTable;
        htmlTreeBuilder0.transition(htmlTreeBuilderState5);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = org.jsoup.parser.HtmlTreeBuilderState.InBody;
        htmlTreeBuilder0.transition(htmlTreeBuilderState7);
        htmlTreeBuilder0.framesetOk(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.Tag tag2 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean3 = tag2.isBlock();
        boolean boolean4 = tag2.isEmpty();
        boolean boolean5 = tag2.isFormListed();
        org.jsoup.nodes.Element element7 = new org.jsoup.nodes.Element(tag2, "");
        org.jsoup.parser.Tag tag10 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean11 = tag10.isBlock();
        boolean boolean12 = tag10.isEmpty();
        boolean boolean13 = tag10.isFormListed();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag10, "");
        org.jsoup.parser.Tag tag17 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean18 = tag17.isBlock();
        boolean boolean19 = tag17.isEmpty();
        boolean boolean20 = tag17.isFormListed();
        org.jsoup.nodes.Element element22 = new org.jsoup.nodes.Element(tag17, "");
        org.jsoup.nodes.Node[] nodeArray23 = new org.jsoup.nodes.Node[] { element15, element22 };
        org.jsoup.nodes.Element element24 = element7.insertChildren((int) (byte) 0, nodeArray23);
        org.jsoup.nodes.Element element26 = element7.toggleClass("");
        org.jsoup.nodes.Element element28 = element7.addClass("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.select.Elements elements30 = element7.getElementsContainingText("");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder31 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder31.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState34 = htmlTreeBuilder31.state();
        boolean boolean35 = htmlTreeBuilder31.framesetOk();
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
        boolean boolean62 = htmlTreeBuilder31.isSpecial(element59);
        org.jsoup.select.Elements elements63 = element59.parents();
        org.jsoup.nodes.Element element65 = element59.prependElement("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.nodes.Element element66 = element7.appendTo(element65);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean67 = htmlTreeBuilder0.removeFromStack(element7);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
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
        org.jsoup.select.Elements elements34 = element31.getElementsByAttributeValueEnding("<hi!>\n hi!\n</hi!>", "<hi!>\n <hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \"> \n  <hi!></hi!> \n  <hi!></hi!>hi! \n </hi!>\n</hi!>");
        org.jsoup.nodes.Node node35 = element31.root();
        java.lang.String str36 = element31.className();
        org.jsoup.select.Elements elements37 = element31.siblingElements();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element38 = element31.firstElementSibling();
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        java.lang.String[] strArray6 = org.jsoup.parser.HtmlTreeBuilder.TagsSearchInScope;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToClose(strArray6);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.util.List<java.lang.String> strList3 = htmlTreeBuilder0.getPendingTableCharacters();
        boolean boolean4 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.ParseSettings parseSettings5 = htmlTreeBuilder0.defaultSettings();
        boolean boolean6 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.popStackToBefore("&lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;");
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
        boolean boolean6 = htmlTreeBuilder0.framesetOk();
        java.util.List<java.lang.String> strList7 = htmlTreeBuilder0.getPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
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
        org.jsoup.nodes.Element element32 = element28.previousElementSibling();
        java.util.List<org.jsoup.nodes.DataNode> dataNodeList33 = element28.dataNodes();
        boolean boolean34 = element28.isBlock();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element35 = element28.firstElementSibling();
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        java.lang.String str4 = htmlTreeBuilder0.getBaseUri();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList5 = htmlTreeBuilder0.getStack();
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
        java.lang.String str43 = element39.tagName();
        org.jsoup.select.Elements elements45 = element39.getElementsMatchingOwnText("<hi!></hi!>\n<hi!></hi!>");
        java.lang.String str46 = element39.cssSelector();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean47 = htmlTreeBuilder0.isInActiveFormattingElements(element39);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.Tag tag9 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean10 = tag9.isBlock();
        boolean boolean11 = tag9.isEmpty();
        boolean boolean12 = tag9.preserveWhitespace();
        boolean boolean13 = tag9.isBlock();
        org.jsoup.nodes.Element element15 = new org.jsoup.nodes.Element(tag9, "hi!.hi!.<hi!>.<hi!></hi!>.</hi!>");
        org.jsoup.parser.Tag tag17 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean18 = tag17.isBlock();
        boolean boolean19 = tag17.isEmpty();
        org.jsoup.nodes.Element element21 = new org.jsoup.nodes.Element(tag17, "<hi!></hi!>");
        org.jsoup.nodes.Element element22 = element15.appendTo(element21);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder24 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document25 = htmlTreeBuilder24.getDocument();
        boolean boolean26 = htmlTreeBuilder24.framesetOk();
        boolean boolean27 = htmlTreeBuilder24.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState28 = htmlTreeBuilder24.state();
        htmlTreeBuilder24.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings30 = htmlTreeBuilder24.defaultSettings();
        org.jsoup.parser.Tag tag32 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean33 = tag32.isBlock();
        boolean boolean34 = tag32.isEmpty();
        boolean boolean35 = tag32.isFormListed();
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element(tag32, "");
        org.jsoup.parser.Tag tag40 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean41 = tag40.isBlock();
        boolean boolean42 = tag40.isEmpty();
        boolean boolean43 = tag40.isFormListed();
        org.jsoup.nodes.Element element45 = new org.jsoup.nodes.Element(tag40, "");
        org.jsoup.parser.Tag tag47 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean48 = tag47.isBlock();
        boolean boolean49 = tag47.isEmpty();
        boolean boolean50 = tag47.isFormListed();
        org.jsoup.nodes.Element element52 = new org.jsoup.nodes.Element(tag47, "");
        org.jsoup.nodes.Node[] nodeArray53 = new org.jsoup.nodes.Node[] { element45, element52 };
        org.jsoup.nodes.Element element54 = element37.insertChildren((int) (byte) 0, nodeArray53);
        boolean boolean55 = htmlTreeBuilder24.isSpecial(element37);
        org.jsoup.nodes.Element element57 = element37.text("hi!");
        org.jsoup.nodes.Element element58 = element57.shallowClone();
        java.util.List<org.jsoup.nodes.TextNode> textNodeList59 = element57.textNodes();
        org.jsoup.nodes.Element element61 = element57.toggleClass("");
        org.jsoup.select.Elements elements64 = element57.getElementsByAttributeValueNot("<hi! class=\"\">\n <hi!></hi!>\n <hi!></hi!>\n</hi!>", "<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element65 = element15.insertChildren(0, (java.util.Collection<org.jsoup.nodes.Element>) elements64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) element65);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.FormElement formElement7 = htmlTreeBuilder0.getFormElement();
        java.lang.String str8 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder9 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document10 = htmlTreeBuilder9.getDocument();
        boolean boolean11 = htmlTreeBuilder9.framesetOk();
        boolean boolean12 = htmlTreeBuilder9.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState13 = htmlTreeBuilder9.state();
        htmlTreeBuilder9.markInsertionMode();
        java.lang.String str15 = htmlTreeBuilder9.getBaseUri();
        htmlTreeBuilder9.setFosterInserts(true);
        org.jsoup.parser.Tag tag19 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean20 = tag19.isBlock();
        boolean boolean21 = tag19.isEmpty();
        boolean boolean22 = tag19.isFormListed();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element(tag19, "");
        htmlTreeBuilder9.setHeadElement(element24);
        boolean boolean26 = element24.isBlock();
        org.jsoup.select.Elements elements29 = element24.getElementsByAttributeValueEnding("hi!", "hi!");
        org.jsoup.select.Elements elements31 = element24.getElementsByIndexEquals((int) (byte) 100);
        org.jsoup.nodes.Element element33 = element24.text("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.nodes.Node node34 = element24.nextSibling();
        org.jsoup.nodes.Element element36 = element24.appendText("<hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \">\n <hi!></hi!>\n <hi!></hi!>hi!\n</hi!>");
        org.jsoup.select.Elements elements38 = element24.getElementsMatchingText("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.removeFromActiveFormattingElements(element24);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.ParseSettings parseSettings6 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.markInsertionMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = htmlTreeBuilder0.inScope("<hi!>\n hi!\n</hi!>");
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getFromStack("&lt;hi!&gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &lt;/hi!&gt;");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder5.getDocument();
        boolean boolean7 = htmlTreeBuilder5.framesetOk();
        boolean boolean8 = htmlTreeBuilder5.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState9 = htmlTreeBuilder5.state();
        htmlTreeBuilder5.markInsertionMode();
        org.jsoup.parser.ParseSettings parseSettings11 = htmlTreeBuilder5.defaultSettings();
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
        boolean boolean36 = htmlTreeBuilder5.isSpecial(element18);
        org.jsoup.nodes.Element element38 = element18.text("hi!");
        org.jsoup.nodes.Element element39 = element38.shallowClone();
        org.jsoup.nodes.Element element40 = element38.previousElementSibling();
        org.jsoup.nodes.Element element42 = element38.getElementById("hi!");
        org.jsoup.nodes.Element element44 = element38.prependElement("<hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.nodes.Node node45 = element44.root();
        org.jsoup.nodes.Element element47 = element44.text("hi!");
        org.jsoup.select.Elements elements49 = element47.getElementsByIndexLessThan(10);
        org.jsoup.nodes.Attributes attributes50 = element47.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean51 = htmlTreeBuilder0.processStartTag("<hi!>\n <hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \"> \n  <hi!></hi!> \n  <hi!></hi!>hi! \n </hi!>\n</hi!>", attributes50);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Element element3 = htmlTreeBuilder0.getHeadElement();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        java.lang.String str6 = htmlTreeBuilder0.getBaseUri();
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
        org.jsoup.nodes.Element element32 = element30.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap33 = element32.dataset();
        org.jsoup.parser.Tag tag36 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean37 = tag36.isBlock();
        boolean boolean38 = tag36.isEmpty();
        boolean boolean39 = tag36.isFormListed();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag36, "");
        org.jsoup.parser.Tag tag44 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean45 = tag44.isBlock();
        boolean boolean46 = tag44.isEmpty();
        boolean boolean47 = tag44.isFormListed();
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element(tag44, "");
        org.jsoup.parser.Tag tag51 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean52 = tag51.isBlock();
        boolean boolean53 = tag51.isEmpty();
        boolean boolean54 = tag51.isFormListed();
        org.jsoup.nodes.Element element56 = new org.jsoup.nodes.Element(tag51, "");
        org.jsoup.nodes.Node[] nodeArray57 = new org.jsoup.nodes.Node[] { element49, element56 };
        org.jsoup.nodes.Element element58 = element41.insertChildren((int) (byte) 0, nodeArray57);
        org.jsoup.select.Elements elements59 = element58.previousElementSiblings();
        org.jsoup.nodes.Element element60 = element32.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements59);
        element60.setBaseUri("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap63 = element60.dataset();
        int int64 = element60.elementSiblingIndex();
        org.jsoup.select.Elements elements66 = element60.getElementsByTag("<hi!>\n <hi!></hi!>\n</hi!>");
        htmlTreeBuilder0.maybeSetBaseUri(element60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.originalState();
        java.util.ArrayList<org.jsoup.nodes.Element> elementList4 = htmlTreeBuilder0.getStack();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.newPendingTableCharacters();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.clearStackToTableContext();
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element13 = htmlTreeBuilder0.lastFormattingElement();
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
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
        org.jsoup.nodes.Element element23 = element15.appendText("<hi!>\n <hi!></hi!>\n</hi!>");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = element23.childNodes();
        org.jsoup.select.Elements elements26 = element23.getElementsByAttributeStarting("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element29 = element23.attr("", "<hi!>\n <hi!></hi!>\n <hi!></hi!>\n</hi!>");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder30 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document31 = htmlTreeBuilder30.getDocument();
        boolean boolean32 = htmlTreeBuilder30.framesetOk();
        boolean boolean33 = htmlTreeBuilder30.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState34 = htmlTreeBuilder30.state();
        htmlTreeBuilder30.markInsertionMode();
        java.lang.String str36 = htmlTreeBuilder30.getBaseUri();
        htmlTreeBuilder30.setFosterInserts(true);
        org.jsoup.parser.Tag tag40 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean41 = tag40.isBlock();
        boolean boolean42 = tag40.isEmpty();
        boolean boolean43 = tag40.isFormListed();
        org.jsoup.nodes.Element element45 = new org.jsoup.nodes.Element(tag40, "");
        htmlTreeBuilder30.setHeadElement(element45);
        org.jsoup.parser.ParseSettings parseSettings47 = htmlTreeBuilder30.defaultSettings();
        boolean boolean48 = element29.hasSameValue((java.lang.Object) htmlTreeBuilder30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder30.popStackToClose("<hi! value=\"hi!.hi!.<hi!>.<hi!></hi!>.</hi!>\"></hi!>");
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
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
        org.jsoup.nodes.Element element29 = element27.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = element29.dataset();
        org.jsoup.parser.Tag tag33 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean34 = tag33.isBlock();
        boolean boolean35 = tag33.isEmpty();
        boolean boolean36 = tag33.isFormListed();
        org.jsoup.nodes.Element element38 = new org.jsoup.nodes.Element(tag33, "");
        org.jsoup.parser.Tag tag41 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean42 = tag41.isBlock();
        boolean boolean43 = tag41.isEmpty();
        boolean boolean44 = tag41.isFormListed();
        org.jsoup.nodes.Element element46 = new org.jsoup.nodes.Element(tag41, "");
        org.jsoup.parser.Tag tag48 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean49 = tag48.isBlock();
        boolean boolean50 = tag48.isEmpty();
        boolean boolean51 = tag48.isFormListed();
        org.jsoup.nodes.Element element53 = new org.jsoup.nodes.Element(tag48, "");
        org.jsoup.nodes.Node[] nodeArray54 = new org.jsoup.nodes.Node[] { element46, element53 };
        org.jsoup.nodes.Element element55 = element38.insertChildren((int) (byte) 0, nodeArray54);
        org.jsoup.select.Elements elements56 = element55.previousElementSiblings();
        org.jsoup.nodes.Element element57 = element29.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements56);
        boolean boolean58 = htmlTreeBuilder0.isSpecial(element57);
        java.util.ArrayList<org.jsoup.nodes.Element> elementList59 = htmlTreeBuilder0.getStack();
        java.lang.String str60 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document61 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean63 = htmlTreeBuilder0.inButtonScope("<<hi!>\n <hi!></hi!>\n</hi!>></<hi!>\n <hi!></hi!>\n</hi!>>");
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isFormListed();
        org.jsoup.nodes.Element element4 = new org.jsoup.nodes.Element(tag1, "hi!");
        org.jsoup.select.Elements elements6 = element4.getElementsMatchingText("hi!");
        org.jsoup.select.Elements elements7 = element4.nextElementSiblings();
        org.jsoup.nodes.Element element9 = element4.tagName("hi!");
        org.jsoup.parser.Tag tag11 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean12 = tag11.isBlock();
        boolean boolean13 = tag11.isEmpty();
        boolean boolean14 = tag11.isFormListed();
        org.jsoup.nodes.Element element16 = new org.jsoup.nodes.Element(tag11, "");
        org.jsoup.parser.Tag tag19 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean20 = tag19.isBlock();
        boolean boolean21 = tag19.isEmpty();
        boolean boolean22 = tag19.isFormListed();
        org.jsoup.nodes.Element element24 = new org.jsoup.nodes.Element(tag19, "");
        org.jsoup.parser.Tag tag26 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean27 = tag26.isBlock();
        boolean boolean28 = tag26.isEmpty();
        boolean boolean29 = tag26.isFormListed();
        org.jsoup.nodes.Element element31 = new org.jsoup.nodes.Element(tag26, "");
        org.jsoup.nodes.Node[] nodeArray32 = new org.jsoup.nodes.Node[] { element24, element31 };
        org.jsoup.nodes.Element element33 = element16.insertChildren((int) (byte) 0, nodeArray32);
        org.jsoup.nodes.Element element35 = element16.toggleClass("");
        org.jsoup.nodes.Element element37 = element16.addClass("<hi!></hi!>\n<hi!></hi!>");
        java.util.Map<java.lang.String, java.lang.String> strMap38 = element37.dataset();
        org.jsoup.nodes.Element element40 = element37.append("");
        org.jsoup.nodes.Element element41 = element40.clone();
        org.jsoup.nodes.Element element43 = element40.appendElement("<hi!></hi!>\n<hi!></hi!>");
        org.jsoup.nodes.Element element44 = element4.appendChild((org.jsoup.nodes.Node) element40);
        org.jsoup.select.Elements elements47 = element4.getElementsByAttributeValue("<hi!>\n <hi! class=\"hi! <hi!>\n <hi!></hi!>\n</hi!> \"> \n  <hi!></hi!> \n  <hi!></hi!>hi! \n </hi!>\n</hi!>", "<hi!></hi!>\n<hi!></hi!>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element48 = element4.lastElementSibling();
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.framesetOk(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Element element8 = htmlTreeBuilder0.pop();
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        java.lang.String str3 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document4 = htmlTreeBuilder0.getDocument();
        java.util.List<java.lang.String> strList5 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.Tag tag7 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean8 = tag7.isBlock();
        boolean boolean9 = tag7.isEmpty();
        boolean boolean10 = tag7.isFormListed();
        org.jsoup.nodes.Element element12 = new org.jsoup.nodes.Element(tag7, "");
        org.jsoup.parser.Tag tag15 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean16 = tag15.isBlock();
        boolean boolean17 = tag15.isEmpty();
        boolean boolean18 = tag15.isFormListed();
        org.jsoup.nodes.Element element20 = new org.jsoup.nodes.Element(tag15, "");
        org.jsoup.parser.Tag tag22 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean23 = tag22.isBlock();
        boolean boolean24 = tag22.isEmpty();
        boolean boolean25 = tag22.isFormListed();
        org.jsoup.nodes.Element element27 = new org.jsoup.nodes.Element(tag22, "");
        org.jsoup.nodes.Node[] nodeArray28 = new org.jsoup.nodes.Node[] { element20, element27 };
        org.jsoup.nodes.Element element29 = element12.insertChildren((int) (byte) 0, nodeArray28);
        org.jsoup.nodes.Element element31 = element29.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap32 = element31.dataset();
        org.jsoup.select.Elements elements34 = element31.getElementsMatchingText("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.select.Elements elements36 = element31.getElementsMatchingOwnText("<hi!>\n hi!\n</hi!>");
        boolean boolean37 = htmlTreeBuilder0.isSpecial(element31);
        boolean boolean38 = htmlTreeBuilder0.framesetOk();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean40 = htmlTreeBuilder0.inSelectScope("<hi!>\n hi!\n</hi!>");
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.nodes.Document document1 = htmlTreeBuilder0.getDocument();
        boolean boolean2 = htmlTreeBuilder0.framesetOk();
        boolean boolean3 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = htmlTreeBuilder0.state();
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.state();
        org.jsoup.nodes.Element element7 = htmlTreeBuilder0.getHeadElement();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("&lt;hi!&gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &lt;/hi!&gt;");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.framesetOk(false);
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
        org.jsoup.nodes.Element element32 = element30.html("");
        java.util.Map<java.lang.String, java.lang.String> strMap33 = element32.dataset();
        org.jsoup.parser.Tag tag36 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean37 = tag36.isBlock();
        boolean boolean38 = tag36.isEmpty();
        boolean boolean39 = tag36.isFormListed();
        org.jsoup.nodes.Element element41 = new org.jsoup.nodes.Element(tag36, "");
        org.jsoup.parser.Tag tag44 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean45 = tag44.isBlock();
        boolean boolean46 = tag44.isEmpty();
        boolean boolean47 = tag44.isFormListed();
        org.jsoup.nodes.Element element49 = new org.jsoup.nodes.Element(tag44, "");
        org.jsoup.parser.Tag tag51 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean52 = tag51.isBlock();
        boolean boolean53 = tag51.isEmpty();
        boolean boolean54 = tag51.isFormListed();
        org.jsoup.nodes.Element element56 = new org.jsoup.nodes.Element(tag51, "");
        org.jsoup.nodes.Node[] nodeArray57 = new org.jsoup.nodes.Node[] { element49, element56 };
        org.jsoup.nodes.Element element58 = element41.insertChildren((int) (byte) 0, nodeArray57);
        org.jsoup.select.Elements elements59 = element58.previousElementSiblings();
        org.jsoup.nodes.Element element60 = element32.insertChildren((-1), (java.util.Collection<org.jsoup.nodes.Element>) elements59);
        element60.setBaseUri("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap63 = element60.dataset();
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
        java.lang.String str89 = element87.id();
        org.jsoup.nodes.Element element90 = element60.appendTo(element87);
        java.lang.String str91 = element87.text();
        org.jsoup.nodes.Element element93 = element87.appendText("<hi!>\n &lt;hi!&gt;&lt;/hi!&gt; &lt;hi!&gt;&lt;/hi!&gt;\n</hi!>");
        org.jsoup.nodes.Element element94 = element87.previousElementSibling();
        int int95 = element87.siblingIndex();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.push(element87);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
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
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.ParseSettings parseSettings20 = htmlTreeBuilder0.defaultSettings();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState21 = org.jsoup.parser.HtmlTreeBuilderState.InHead;
        htmlTreeBuilder0.transition(htmlTreeBuilderState21);
        org.jsoup.parser.Tag tag24 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean25 = tag24.isBlock();
        boolean boolean26 = tag24.isEmpty();
        boolean boolean27 = tag24.isFormListed();
        org.jsoup.nodes.Element element29 = new org.jsoup.nodes.Element(tag24, "");
        org.jsoup.parser.Tag tag32 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean33 = tag32.isBlock();
        boolean boolean34 = tag32.isEmpty();
        boolean boolean35 = tag32.isFormListed();
        org.jsoup.nodes.Element element37 = new org.jsoup.nodes.Element(tag32, "");
        org.jsoup.parser.Tag tag39 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean40 = tag39.isBlock();
        boolean boolean41 = tag39.isEmpty();
        boolean boolean42 = tag39.isFormListed();
        org.jsoup.nodes.Element element44 = new org.jsoup.nodes.Element(tag39, "");
        org.jsoup.nodes.Node[] nodeArray45 = new org.jsoup.nodes.Node[] { element37, element44 };
        org.jsoup.nodes.Element element46 = element29.insertChildren((int) (byte) 0, nodeArray45);
        org.jsoup.select.Elements elements47 = element46.previousElementSiblings();
        java.lang.String str48 = element46.id();
        org.jsoup.select.Elements elements49 = element46.parents();
        org.jsoup.parser.Tag tag51 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean52 = tag51.isBlock();
        boolean boolean53 = tag51.isEmpty();
        boolean boolean54 = tag51.isFormListed();
        org.jsoup.nodes.Element element56 = new org.jsoup.nodes.Element(tag51, "");
        org.jsoup.parser.Tag tag59 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean60 = tag59.isBlock();
        boolean boolean61 = tag59.isEmpty();
        boolean boolean62 = tag59.isFormListed();
        org.jsoup.nodes.Element element64 = new org.jsoup.nodes.Element(tag59, "");
        org.jsoup.parser.Tag tag66 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean67 = tag66.isBlock();
        boolean boolean68 = tag66.isEmpty();
        boolean boolean69 = tag66.isFormListed();
        org.jsoup.nodes.Element element71 = new org.jsoup.nodes.Element(tag66, "");
        org.jsoup.nodes.Node[] nodeArray72 = new org.jsoup.nodes.Node[] { element64, element71 };
        org.jsoup.nodes.Element element73 = element56.insertChildren((int) (byte) 0, nodeArray72);
        org.jsoup.nodes.Element element75 = element73.html("");
        org.jsoup.select.Elements elements78 = element73.getElementsByAttributeValueMatching("<hi!></hi!>\n<hi!></hi!>", "hi!");
        org.jsoup.nodes.Element element81 = element73.attr("<hi!>\n <hi!></hi!>\n</hi!>", true);
        boolean boolean82 = element46.equals((java.lang.Object) "<hi!>\n <hi!></hi!>\n</hi!>");
        boolean boolean83 = htmlTreeBuilder0.isSpecial(element46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("<hi!>\n <hi!></hi!>\n <hi!></hi!>\n <<hi!></hi!> \n<hi!></hi!>></<hi!></hi!> \n<hi!></hi!>>\n</hi!>");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        htmlTreeBuilder0.generateImpliedEndTags();
        htmlTreeBuilder0.framesetOk(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = htmlTreeBuilder0.toString();
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
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
        htmlTreeBuilder0.framesetOk(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.insertMarkerToFormattingElements();
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = htmlTreeBuilder0.state();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState5 = htmlTreeBuilder0.state();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        htmlTreeBuilder0.generateImpliedEndTags("<hi! value=\"hi!\">\n hi!\n</hi!>");
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.nodes.Document document3 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = htmlTreeBuilder0.inListItemScope("<hi!> <hi!></hi!> </hi!>");
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean3 = htmlTreeBuilder0.framesetOk();
        boolean boolean4 = htmlTreeBuilder0.framesetOk();
        boolean boolean5 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.getDocument();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = htmlTreeBuilder0.inButtonScope("<hi!>\n &lt;hi!&gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &amp;lt;hi!&amp;gt;&amp;lt;/hi!&amp;gt; &lt;/hi!&gt;\n</hi!>");
    }
}

