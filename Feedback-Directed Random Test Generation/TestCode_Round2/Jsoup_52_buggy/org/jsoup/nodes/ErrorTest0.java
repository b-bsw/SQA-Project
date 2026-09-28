package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes5 = xmlDeclaration3.attributes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node7 = xmlDeclaration3.wrap("hi!");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        int int11 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str18 = xmlDeclaration17.getWholeDeclaration();
        boolean boolean20 = xmlDeclaration17.hasAttr("hi!");
        java.lang.String str21 = xmlDeclaration17.nodeName();
        org.jsoup.nodes.Node node24 = xmlDeclaration17.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = node24.siblingNodes();
        boolean boolean26 = xmlDeclaration3.hasSameValue((java.lang.Object) node24);
        java.lang.String str27 = xmlDeclaration3.nodeName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node29 = xmlDeclaration3.wrap("hi!");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        int int12 = xmlDeclaration3.siblingIndex();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = xmlDeclaration3.wrap("#declaration");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node13 = xmlDeclaration3.wrap("#declaration");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str11 = xmlDeclaration3.attr("");
        java.lang.String str12 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.wrap("<?>");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration3.childNodesCopy();
        boolean boolean17 = xmlDeclaration3.hasAttr("<?>");
        org.jsoup.nodes.Node node18 = xmlDeclaration3.previousSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node20 = xmlDeclaration3.wrap("#declaration");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.lang.String str9 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean15 = xmlDeclaration13.equals((java.lang.Object) (byte) 0);
        java.lang.String str17 = xmlDeclaration13.attr("hi!");
        org.jsoup.nodes.Node node18 = xmlDeclaration13.clone();
        boolean boolean19 = xmlDeclaration3.hasSameValue((java.lang.Object) node18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node21 = node18.wrap("hi!");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<?>", true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = xmlDeclaration3.wrap("hi!");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        int int11 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str18 = xmlDeclaration17.getWholeDeclaration();
        boolean boolean20 = xmlDeclaration17.hasAttr("hi!");
        java.lang.String str21 = xmlDeclaration17.nodeName();
        org.jsoup.nodes.Node node24 = xmlDeclaration17.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = node24.siblingNodes();
        boolean boolean26 = xmlDeclaration3.hasSameValue((java.lang.Object) node24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node28 = xmlDeclaration3.wrap("hi!");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        int int4 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration8.childNodesCopy();
        boolean boolean10 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = xmlDeclaration8.wrap("hi!");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = xmlDeclaration3.wrap("#declaration");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        int int11 = xmlDeclaration3.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node14 = xmlDeclaration3.wrap("hi!");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodes();
        java.lang.String str12 = xmlDeclaration3.outerHtml();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = xmlDeclaration3.wrap("#declaration");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.attr("<!>", "hi!");
        java.lang.String str10 = xmlDeclaration3.name();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node12 = xmlDeclaration3.wrap("#declaration");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.siblingNodes();
        java.lang.String str7 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.removeAttr("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = xmlDeclaration3.wrap("#declaration");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodes();
        java.lang.String str12 = xmlDeclaration3.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodesCopy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node15 = xmlDeclaration3.wrap("hi!");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.attr("<?>");
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str13 = xmlDeclaration12.getWholeDeclaration();
        boolean boolean15 = xmlDeclaration12.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration12.childNodes();
        java.lang.String str17 = xmlDeclaration12.nodeName();
        org.jsoup.nodes.Attributes attributes18 = xmlDeclaration12.attributes();
        boolean boolean19 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration12);
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration12.childNodesCopy();
        java.lang.String str21 = xmlDeclaration12.getWholeDeclaration();
        org.jsoup.nodes.Node node24 = xmlDeclaration12.attr("#declaration", "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node26 = node24.wrap("#declaration");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.attr("<?>");
        java.lang.String str7 = xmlDeclaration3.absUrl("<!#declaration>");
        org.jsoup.nodes.Node node8 = xmlDeclaration3.clone();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node10 = xmlDeclaration3.wrap("hi!");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!#declaration>", "#declaration", false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node5 = xmlDeclaration3.wrap("#declaration");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.previousSibling();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str14 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.nextSibling();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node17 = xmlDeclaration3.wrap("hi!");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str12 = xmlDeclaration11.getWholeDeclaration();
        int int13 = xmlDeclaration11.siblingIndex();
        java.lang.String str15 = xmlDeclaration11.attr("<?>");
        boolean boolean16 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration11);
        java.lang.String str18 = xmlDeclaration3.absUrl("<?>");
        xmlDeclaration3.setBaseUri("<!<!>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str25 = xmlDeclaration24.getWholeDeclaration();
        int int26 = xmlDeclaration24.siblingIndex();
        xmlDeclaration24.setBaseUri("<!<?>>");
        org.jsoup.nodes.Node node30 = xmlDeclaration24.removeAttr("<!#declaration>");
        int int31 = node30.childNodeSize();
        boolean boolean32 = xmlDeclaration3.hasSameValue((java.lang.Object) node30);
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlDeclaration3.childNodes();
        xmlDeclaration3.setBaseUri("<!<?<!#declaration>>>");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node37 = xmlDeclaration3.wrap("hi!");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.siblingNodes();
        java.lang.String str7 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str12 = xmlDeclaration11.getWholeDeclaration();
        int int13 = xmlDeclaration11.siblingIndex();
        java.lang.String str15 = xmlDeclaration11.attr("<?>");
        java.lang.String str16 = xmlDeclaration11.outerHtml();
        boolean boolean17 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration11);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str22 = xmlDeclaration21.getWholeDeclaration();
        boolean boolean24 = xmlDeclaration21.hasAttr("hi!");
        java.lang.String str25 = xmlDeclaration21.nodeName();
        org.jsoup.nodes.Node node28 = xmlDeclaration21.attr("hi!", "hi!");
        int int29 = xmlDeclaration21.siblingIndex();
        xmlDeclaration21.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration35 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str36 = xmlDeclaration35.getWholeDeclaration();
        boolean boolean38 = xmlDeclaration35.hasAttr("hi!");
        java.lang.String str39 = xmlDeclaration35.nodeName();
        org.jsoup.nodes.Node node42 = xmlDeclaration35.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList43 = node42.siblingNodes();
        boolean boolean44 = xmlDeclaration21.hasSameValue((java.lang.Object) node42);
        java.lang.String str45 = xmlDeclaration21.nodeName();
        org.jsoup.nodes.Node node47 = xmlDeclaration21.wrap("<?>");
        java.lang.String str48 = xmlDeclaration21.toString();
        org.jsoup.nodes.Document document49 = xmlDeclaration21.ownerDocument();
        xmlDeclaration21.setBaseUri("<?>");
        boolean boolean52 = xmlDeclaration11.hasSameValue((java.lang.Object) "<?>");
        java.lang.String str53 = xmlDeclaration11.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList54 = xmlDeclaration11.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node56 = xmlDeclaration11.wrap("#declaration");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.lang.String str9 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean15 = xmlDeclaration13.equals((java.lang.Object) (byte) 0);
        java.lang.String str17 = xmlDeclaration13.attr("hi!");
        org.jsoup.nodes.Node node18 = xmlDeclaration13.clone();
        boolean boolean19 = xmlDeclaration3.hasSameValue((java.lang.Object) node18);
        java.lang.String str21 = node18.attr("<!<!#declaration>>");
        int int22 = node18.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node24 = node18.wrap("#declaration");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str4 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Attributes attributes5 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.previousSibling();
        int int7 = xmlDeclaration3.childNodeSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node9 = xmlDeclaration3.wrap("#declaration");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = xmlDeclaration3.wrap("#declaration");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.jsoup.nodes.Node node11 = xmlDeclaration3.wrap("#declaration");
    }
}

