package org.jsoup.nodes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlDeclaration3.childNodes();
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str10 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str15 = xmlDeclaration14.getWholeDeclaration();
        boolean boolean17 = xmlDeclaration14.hasAttr("hi!");
        org.jsoup.nodes.Node node18 = xmlDeclaration14.clone();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) node18);
        org.jsoup.nodes.Node node20 = node18.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = node20.absUrl("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str12 = xmlDeclaration11.getWholeDeclaration();
        int int13 = xmlDeclaration11.siblingIndex();
        java.lang.String str15 = xmlDeclaration11.attr("<?>");
        boolean boolean16 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration11);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean22 = xmlDeclaration20.equals((java.lang.Object) (byte) 0);
        java.lang.String str24 = xmlDeclaration20.attr("hi!");
        int int25 = xmlDeclaration20.childNodeSize();
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        xmlDeclaration20.outerHtmlTail(appendable26, 1, outputSettings28);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration33 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str34 = xmlDeclaration33.getWholeDeclaration();
        boolean boolean36 = xmlDeclaration33.hasAttr("hi!");
        java.lang.String str37 = xmlDeclaration33.nodeName();
        java.lang.String str38 = xmlDeclaration33.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlDeclaration33.siblingNodes();
        boolean boolean40 = xmlDeclaration20.hasSameValue((java.lang.Object) xmlDeclaration33);
        java.lang.String str41 = xmlDeclaration20.nodeName();
        org.jsoup.nodes.Node node42 = xmlDeclaration20.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node43 = xmlDeclaration11.after(node42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#declaration" + "'", str37, "#declaration");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<?>" + "'", str38, "<?>");
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#declaration" + "'", str41, "#declaration");
        org.junit.Assert.assertNull(node42);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str6 = xmlDeclaration5.getWholeDeclaration();
        boolean boolean8 = xmlDeclaration5.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration5.childNodes();
        java.lang.String str10 = xmlDeclaration5.nodeName();
        java.lang.String str11 = xmlDeclaration5.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = xmlTreeBuilder0.processStartTag("<!#declaration>", attributes12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<?>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parentNode();
        java.lang.String str5 = xmlDeclaration3.outerHtml();
        int int6 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        xmlDeclaration3.outerHtmlTail(appendable7, (int) '4', outputSettings9);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<!#declaration>", true);
        int int4 = xmlDeclaration3.siblingIndex();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.String str10 = xmlDeclaration3.absUrl("<?>");
        int int11 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node13 = node12.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node12.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = null;
        boolean boolean7 = xmlDeclaration3.equals(obj6);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str12 = xmlDeclaration11.getWholeDeclaration();
        boolean boolean14 = xmlDeclaration11.hasAttr("hi!");
        java.lang.String str15 = xmlDeclaration11.nodeName();
        org.jsoup.nodes.Node node16 = xmlDeclaration11.nextSibling();
        java.lang.String str17 = xmlDeclaration11.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration11.childNodesCopy();
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        xmlDeclaration11.outerHtmlTail(appendable19, (int) (short) 100, outputSettings21);
        org.jsoup.nodes.Node node24 = xmlDeclaration11.removeAttr("<!#declaration>");
        org.jsoup.nodes.Node node25 = xmlDeclaration11.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = xmlDeclaration3.after(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        node4.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node4.siblingNodes();
        org.jsoup.nodes.Node node8 = node4.clone();
        org.jsoup.nodes.Node node9 = node8.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            node8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        java.lang.String str11 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.clone();
        java.lang.String str13 = xmlDeclaration3.toString();
        boolean boolean15 = xmlDeclaration3.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration20.childNodesCopy();
        boolean boolean22 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration20);
        java.lang.String str23 = xmlDeclaration3.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = xmlDeclaration3.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<?>" + "'", str11, "<?>");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<?>" + "'", str13, "<?>");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str11 = xmlDeclaration3.attr("<!<?>>");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str15 = xmlDeclaration3.absUrl("<!#declaration>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = xmlDeclaration3.after("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str12 = xmlDeclaration11.getWholeDeclaration();
        boolean boolean14 = xmlDeclaration11.hasAttr("hi!");
        java.lang.String str15 = xmlDeclaration11.nodeName();
        org.jsoup.nodes.Node node16 = xmlDeclaration11.nextSibling();
        java.lang.String str17 = xmlDeclaration11.toString();
        org.jsoup.nodes.Node node18 = xmlDeclaration11.nextSibling();
        java.lang.String str19 = xmlDeclaration11.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str24 = xmlDeclaration23.getWholeDeclaration();
        boolean boolean26 = xmlDeclaration23.hasAttr("hi!");
        org.jsoup.nodes.Node node27 = xmlDeclaration23.clone();
        boolean boolean28 = xmlDeclaration11.equals((java.lang.Object) xmlDeclaration23);
        org.jsoup.nodes.Attributes attributes29 = xmlDeclaration11.attributes();
        org.jsoup.nodes.Node node30 = xmlDeclaration11.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = xmlDeclaration3.before(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<?>" + "'", str17, "<?>");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<?>" + "'", str19, "<?>");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        java.lang.String str11 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.clone();
        java.lang.String str13 = xmlDeclaration3.toString();
        boolean boolean15 = xmlDeclaration3.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<?>" + "'", str11, "<?>");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<?>" + "'", str13, "<?>");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str13 = xmlDeclaration12.getWholeDeclaration();
        boolean boolean15 = xmlDeclaration12.hasAttr("hi!");
        java.lang.String str16 = xmlDeclaration12.nodeName();
        org.jsoup.nodes.Node node19 = xmlDeclaration12.attr("hi!", "hi!");
        int int20 = xmlDeclaration12.siblingIndex();
        xmlDeclaration12.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str27 = xmlDeclaration26.getWholeDeclaration();
        boolean boolean29 = xmlDeclaration26.hasAttr("hi!");
        java.lang.String str30 = xmlDeclaration26.nodeName();
        org.jsoup.nodes.Node node33 = xmlDeclaration26.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList34 = node33.siblingNodes();
        boolean boolean35 = xmlDeclaration12.hasSameValue((java.lang.Object) node33);
        boolean boolean36 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration12);
        java.lang.String str38 = xmlDeclaration12.attr("<!<!#declaration>>");
        java.lang.String str39 = xmlDeclaration12.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node41 = xmlDeclaration12.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#declaration" + "'", str30, "#declaration");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!<!#declaration>>", "<!<!#declaration>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<?>>", "<?>", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str8 = xmlDeclaration7.getWholeDeclaration();
        java.lang.String str10 = xmlDeclaration7.absUrl("<?>");
        org.jsoup.nodes.Node node11 = xmlDeclaration7.clone();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node6 = xmlDeclaration5.clone();
        java.lang.String str7 = xmlDeclaration5.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration5.siblingNodes();
        java.lang.String str9 = xmlDeclaration5.outerHtml();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = xmlTreeBuilder0.processStartTag("", attributes10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!<?>>" + "'", str7, "<!<?>>");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!<?>>" + "'", str9, "<!<?>>");
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (-1), outputSettings11);
        org.jsoup.nodes.Document document13 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList14 = document13.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodes();
        java.lang.String str12 = xmlDeclaration3.outerHtml();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<?>" + "'", str12, "<?>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!#declaration>", "<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 1, outputSettings11);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str17 = xmlDeclaration16.getWholeDeclaration();
        boolean boolean19 = xmlDeclaration16.hasAttr("hi!");
        java.lang.String str20 = xmlDeclaration16.nodeName();
        java.lang.String str21 = xmlDeclaration16.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration16.siblingNodes();
        boolean boolean23 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration16);
        java.lang.String str24 = xmlDeclaration3.nodeName();
        java.lang.String str25 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Document document26 = xmlDeclaration3.ownerDocument();
        java.lang.Class<?> wildcardClass27 = xmlDeclaration3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<?>" + "'", str21, "<?>");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#declaration" + "'", str24, "#declaration");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean7 = xmlDeclaration5.equals((java.lang.Object) (byte) 0);
        java.lang.String str9 = xmlDeclaration5.attr("hi!");
        int int10 = xmlDeclaration5.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str15 = xmlDeclaration14.getWholeDeclaration();
        boolean boolean17 = xmlDeclaration14.hasAttr("hi!");
        java.lang.String str18 = xmlDeclaration14.nodeName();
        org.jsoup.nodes.Node node21 = xmlDeclaration14.attr("hi!", "hi!");
        int int22 = xmlDeclaration14.siblingIndex();
        xmlDeclaration14.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str29 = xmlDeclaration28.getWholeDeclaration();
        boolean boolean31 = xmlDeclaration28.hasAttr("hi!");
        java.lang.String str32 = xmlDeclaration28.nodeName();
        org.jsoup.nodes.Node node35 = xmlDeclaration28.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = node35.siblingNodes();
        boolean boolean37 = xmlDeclaration14.hasSameValue((java.lang.Object) node35);
        boolean boolean38 = xmlDeclaration5.hasSameValue((java.lang.Object) xmlDeclaration14);
        java.lang.String str40 = xmlDeclaration5.absUrl("<?>");
        java.lang.String str41 = xmlDeclaration5.outerHtml();
        org.jsoup.nodes.Attributes attributes42 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = xmlTreeBuilder0.processStartTag("", attributes42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#declaration" + "'", str18, "#declaration");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#declaration" + "'", str32, "#declaration");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<?>" + "'", str41, "<?>");
        org.junit.Assert.assertNotNull(attributes42);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.removeAttr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str14 = xmlDeclaration13.getWholeDeclaration();
        org.jsoup.nodes.Node node15 = xmlDeclaration13.nextSibling();
        org.jsoup.nodes.Node node16 = xmlDeclaration13.previousSibling();
        java.lang.String str17 = xmlDeclaration13.name();
        int int18 = xmlDeclaration13.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration22 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str23 = xmlDeclaration22.getWholeDeclaration();
        boolean boolean25 = xmlDeclaration22.hasAttr("hi!");
        org.jsoup.nodes.Node node26 = xmlDeclaration22.clone();
        java.lang.String str28 = xmlDeclaration22.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlDeclaration22.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlDeclaration22.childNodes();
        boolean boolean31 = xmlDeclaration13.hasSameValue((java.lang.Object) nodeList30);
        org.jsoup.nodes.Node node32 = xmlDeclaration13.clone();
        java.lang.String str34 = node32.absUrl("<!<!#declaration>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = node9.before(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        int int11 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration3.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str10 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str15 = xmlDeclaration14.getWholeDeclaration();
        boolean boolean17 = xmlDeclaration14.hasAttr("hi!");
        org.jsoup.nodes.Node node18 = xmlDeclaration14.clone();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) node18);
        org.jsoup.select.NodeVisitor nodeVisitor20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node18.traverse(nodeVisitor20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str6 = xmlDeclaration5.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes7 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = xmlTreeBuilder0.processStartTag("<!<!#declaration>>", attributes7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 1, outputSettings11);
        int int13 = xmlDeclaration3.siblingIndex();
        boolean boolean15 = xmlDeclaration3.equals((java.lang.Object) 1.0d);
        java.lang.String str16 = xmlDeclaration3.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration3.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.lang.String str11 = xmlDeclaration3.name();
        xmlDeclaration3.setBaseUri("<!<!#declaration>>");
        org.jsoup.nodes.Node node15 = xmlDeclaration3.removeAttr("<!<?>>");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = node15.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str22 = xmlDeclaration20.absUrl("hi!");
        xmlDeclaration20.setBaseUri("#declaration");
        java.lang.String str26 = xmlDeclaration20.absUrl("hi!");
        java.lang.String str28 = xmlDeclaration20.attr("");
        boolean boolean30 = xmlDeclaration20.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            node15.replaceWith((org.jsoup.nodes.Node) xmlDeclaration20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.removeAttr("<!<!#declaration>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.before("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<?>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str11 = xmlDeclaration3.attr("");
        java.lang.String str12 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.wrap("<?>");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.clone();
        java.lang.String str17 = xmlDeclaration3.outerHtml();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable18, (int) (byte) 1, outputSettings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!#declaration>" + "'", str17, "<!#declaration>");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = xmlDeclaration3.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.previousSibling();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!#declaration>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.siblingNodes();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean15 = xmlDeclaration3.hasAttr("<!<!#declaration>>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str6 = xmlDeclaration5.getWholeDeclaration();
        boolean boolean8 = xmlDeclaration5.hasAttr("hi!");
        java.lang.String str9 = xmlDeclaration5.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration5.nextSibling();
        java.lang.String str11 = xmlDeclaration5.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = xmlTreeBuilder0.processStartTag("<!#declaration>", attributes12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#declaration" + "'", str9, "#declaration");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        xmlDeclaration3.setBaseUri("<!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str17 = xmlDeclaration16.getWholeDeclaration();
        int int18 = xmlDeclaration16.siblingIndex();
        xmlDeclaration16.setBaseUri("<!<?>>");
        int int21 = xmlDeclaration16.childNodeSize();
        java.lang.String str22 = xmlDeclaration16.getWholeDeclaration();
        org.jsoup.nodes.Node node23 = xmlDeclaration16.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<?>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str9 = xmlDeclaration8.getWholeDeclaration();
        boolean boolean11 = xmlDeclaration8.hasAttr("hi!");
        java.lang.String str12 = xmlDeclaration8.nodeName();
        org.jsoup.nodes.Document document13 = xmlDeclaration8.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "#declaration", "<!>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        boolean boolean13 = xmlDeclaration3.hasAttr("<!<?>>");
        java.lang.String str14 = xmlDeclaration3.name();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.before("<!<!#declaration>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.String str9 = xmlDeclaration3.toString();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, (int) (short) 0, outputSettings12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = xmlDeclaration3.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str11 = xmlDeclaration3.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.after("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<?>", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        org.jsoup.nodes.Node node9 = xmlDeclaration8.parentNode();
        org.jsoup.nodes.Node node10 = xmlDeclaration8.nextSibling();
        boolean boolean11 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration8.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!#declaration>", "", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str8 = xmlDeclaration7.getWholeDeclaration();
        boolean boolean10 = xmlDeclaration7.hasAttr("hi!");
        java.lang.String str11 = xmlDeclaration7.nodeName();
        org.jsoup.nodes.Node node14 = xmlDeclaration7.attr("hi!", "hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str19 = xmlDeclaration18.getWholeDeclaration();
        boolean boolean21 = xmlDeclaration18.hasAttr("hi!");
        java.lang.String str22 = xmlDeclaration18.nodeName();
        org.jsoup.nodes.Node node25 = xmlDeclaration18.attr("hi!", "hi!");
        int int26 = xmlDeclaration18.siblingIndex();
        xmlDeclaration18.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration32 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str33 = xmlDeclaration32.getWholeDeclaration();
        boolean boolean35 = xmlDeclaration32.hasAttr("hi!");
        java.lang.String str36 = xmlDeclaration32.nodeName();
        org.jsoup.nodes.Node node39 = xmlDeclaration32.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList40 = node39.siblingNodes();
        boolean boolean41 = xmlDeclaration18.hasSameValue((java.lang.Object) node39);
        java.lang.String str42 = xmlDeclaration18.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlDeclaration18.siblingNodes();
        boolean boolean44 = xmlDeclaration7.equals((java.lang.Object) xmlDeclaration18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node45 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#declaration" + "'", str36, "#declaration");
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#declaration" + "'", str42, "#declaration");
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("<!<?>>");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.removeAttr("<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("<!>", "", true);
        org.jsoup.nodes.Attributes attributes6 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = xmlTreeBuilder0.processStartTag("<!>", attributes6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.nextSibling();
        java.lang.String str11 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str16 = xmlDeclaration15.getWholeDeclaration();
        boolean boolean18 = xmlDeclaration15.hasAttr("hi!");
        org.jsoup.nodes.Node node19 = xmlDeclaration15.clone();
        boolean boolean20 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration15);
        org.jsoup.nodes.Attributes attributes21 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node22 = xmlDeclaration3.clone();
        java.lang.String str23 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = xmlDeclaration3.before(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<?>" + "'", str11, "<?>");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<?>" + "'", str23, "<?>");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.lang.String str11 = xmlDeclaration3.name();
        xmlDeclaration3.setBaseUri("<!<!#declaration>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.after("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes5 = xmlDeclaration3.attributes();
        boolean boolean7 = xmlDeclaration3.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.after("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes5 = xmlDeclaration3.attributes();
        boolean boolean7 = xmlDeclaration3.hasAttr("hi!");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (-1), outputSettings10);
        java.lang.String str12 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node17 = xmlDeclaration16.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration16.childNodes();
        boolean boolean19 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration16);
        java.lang.String str20 = xmlDeclaration16.baseUri();
        org.jsoup.nodes.Node node22 = xmlDeclaration16.wrap("<!#declaration>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = node22.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 1, outputSettings11);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str17 = xmlDeclaration16.getWholeDeclaration();
        boolean boolean19 = xmlDeclaration16.hasAttr("hi!");
        java.lang.String str20 = xmlDeclaration16.nodeName();
        java.lang.String str21 = xmlDeclaration16.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration16.siblingNodes();
        boolean boolean23 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration16);
        java.lang.String str24 = xmlDeclaration16.toString();
        org.jsoup.nodes.Document document25 = xmlDeclaration16.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList26 = document25.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<?>" + "'", str21, "<?>");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<?>" + "'", str24, "<?>");
        org.junit.Assert.assertNull(document25);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "", "#declaration", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        int int11 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.previousSibling();
        java.lang.String str13 = xmlDeclaration3.name();
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.traverse(nodeVisitor14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        org.jsoup.nodes.Document document20 = xmlDeclaration12.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str25 = xmlDeclaration24.getWholeDeclaration();
        boolean boolean27 = xmlDeclaration24.hasAttr("hi!");
        java.lang.String str28 = xmlDeclaration24.nodeName();
        org.jsoup.nodes.Node node31 = xmlDeclaration24.attr("hi!", "hi!");
        int int32 = xmlDeclaration24.siblingIndex();
        org.jsoup.nodes.Node node33 = xmlDeclaration24.previousSibling();
        java.lang.String str34 = xmlDeclaration24.name();
        java.lang.String str35 = xmlDeclaration24.nodeName();
        boolean boolean37 = xmlDeclaration24.hasAttr("<!>");
        org.jsoup.nodes.Node node39 = xmlDeclaration24.removeAttr("<?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node40 = xmlDeclaration12.before((org.jsoup.nodes.Node) xmlDeclaration24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#declaration" + "'", str17, "#declaration");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#declaration" + "'", str28, "#declaration");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#declaration" + "'", str35, "#declaration");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node39);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        org.jsoup.nodes.Attributes attributes4 = xmlDeclaration3.attributes();
        java.lang.String str5 = xmlDeclaration3.name();
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<?>" + "'", str5, "<?>");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "#declaration", "<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.absUrl("<?>");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node8.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.String str10 = xmlDeclaration3.absUrl("<?>");
        int int11 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str16 = xmlDeclaration15.getWholeDeclaration();
        boolean boolean18 = xmlDeclaration15.hasAttr("hi!");
        java.lang.String str19 = xmlDeclaration15.nodeName();
        org.jsoup.nodes.Node node20 = xmlDeclaration15.nextSibling();
        java.lang.String str21 = xmlDeclaration15.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration15.childNodesCopy();
        int int23 = xmlDeclaration15.siblingIndex();
        org.jsoup.nodes.Node node25 = xmlDeclaration15.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = xmlDeclaration3.after(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#declaration" + "'", str19, "#declaration");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        xmlDeclaration3.setBaseUri("hi!");
        xmlDeclaration3.setBaseUri("<!#declaration>");
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable12, (int) (short) 0, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "#declaration", "<!#declaration>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!<!#declaration>>", "<!<?>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        xmlDeclaration3.outerHtmlTail(appendable11, (int) (short) 100, outputSettings13);
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node18 = xmlDeclaration3.attr("<?>", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node18.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration30 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str31 = xmlDeclaration30.getWholeDeclaration();
        boolean boolean33 = xmlDeclaration30.hasAttr("hi!");
        java.lang.String str34 = xmlDeclaration30.nodeName();
        java.lang.String str35 = xmlDeclaration30.toString();
        boolean boolean37 = xmlDeclaration30.hasAttr("<?>");
        java.lang.String str38 = xmlDeclaration30.baseUri();
        int int39 = xmlDeclaration30.siblingIndex();
        java.lang.String str40 = xmlDeclaration30.getWholeDeclaration();
        boolean boolean41 = node24.equals((java.lang.Object) str40);
        int int42 = node24.childNodeSize();
        org.jsoup.nodes.Node node43 = node24.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int44 = node43.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#declaration" + "'", str34, "#declaration");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<?>" + "'", str35, "<?>");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node43);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
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
        org.jsoup.nodes.Node node29 = xmlDeclaration3.wrap("<?>");
        java.lang.String str30 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node31 = xmlDeclaration3.parentNode();
        java.lang.String str32 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node33 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = node33.wrap("<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#declaration" + "'", str27, "#declaration");
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<?>" + "'", str30, "<?>");
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<?>" + "'", str32, "<?>");
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.attr("<?>");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node8 = node6.removeAttr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str13 = xmlDeclaration12.getWholeDeclaration();
        int int14 = xmlDeclaration12.siblingIndex();
        java.lang.String str16 = xmlDeclaration12.attr("<?>");
        org.jsoup.nodes.Document document17 = xmlDeclaration12.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str22 = xmlDeclaration21.outerHtml();
        boolean boolean23 = xmlDeclaration12.equals((java.lang.Object) xmlDeclaration21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node8.before((org.jsoup.nodes.Node) xmlDeclaration12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!#declaration>" + "'", str22, "<!#declaration>");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str10 = xmlDeclaration9.getWholeDeclaration();
        boolean boolean12 = xmlDeclaration9.hasAttr("hi!");
        java.lang.String str13 = xmlDeclaration9.nodeName();
        org.jsoup.nodes.Node node16 = xmlDeclaration9.attr("hi!", "hi!");
        int int17 = xmlDeclaration9.siblingIndex();
        xmlDeclaration9.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str24 = xmlDeclaration23.getWholeDeclaration();
        boolean boolean26 = xmlDeclaration23.hasAttr("hi!");
        java.lang.String str27 = xmlDeclaration23.nodeName();
        org.jsoup.nodes.Node node30 = xmlDeclaration23.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = node30.siblingNodes();
        boolean boolean32 = xmlDeclaration9.hasSameValue((java.lang.Object) node30);
        java.lang.String str33 = xmlDeclaration9.nodeName();
        boolean boolean34 = xmlDeclaration3.equals((java.lang.Object) str33);
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration39 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str40 = xmlDeclaration39.getWholeDeclaration();
        int int41 = xmlDeclaration39.siblingIndex();
        java.lang.String str43 = xmlDeclaration39.attr("<?>");
        java.lang.String str44 = xmlDeclaration39.outerHtml();
        java.lang.String str46 = xmlDeclaration39.attr("<!<?>>");
        org.jsoup.nodes.Node node47 = xmlDeclaration39.parent();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith(node47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#declaration" + "'", str27, "#declaration");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#declaration" + "'", str33, "#declaration");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "<?>" + "'", str44, "<?>");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNull(node47);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.attr("<?>");
        java.lang.String str8 = xmlDeclaration3.outerHtml();
        java.lang.String str10 = xmlDeclaration3.attr("<!<?>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str15 = xmlDeclaration14.getWholeDeclaration();
        boolean boolean17 = xmlDeclaration14.hasAttr("hi!");
        java.lang.String str18 = xmlDeclaration14.nodeName();
        org.jsoup.nodes.Node node21 = xmlDeclaration14.attr("hi!", "hi!");
        int int22 = xmlDeclaration14.siblingIndex();
        xmlDeclaration14.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str29 = xmlDeclaration28.getWholeDeclaration();
        boolean boolean31 = xmlDeclaration28.hasAttr("hi!");
        java.lang.String str32 = xmlDeclaration28.nodeName();
        org.jsoup.nodes.Node node35 = xmlDeclaration28.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = node35.siblingNodes();
        boolean boolean37 = xmlDeclaration14.hasSameValue((java.lang.Object) node35);
        boolean boolean38 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration14);
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlDeclaration14.childNodesCopy();
        org.jsoup.nodes.Node node41 = xmlDeclaration14.removeAttr("hi!");
        java.lang.Class<?> wildcardClass42 = xmlDeclaration14.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#declaration" + "'", str18, "#declaration");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#declaration" + "'", str32, "#declaration");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.lang.String str11 = xmlDeclaration3.name();
        java.lang.String str13 = xmlDeclaration3.attr("<?>");
        xmlDeclaration3.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str20 = xmlDeclaration19.getWholeDeclaration();
        int int21 = xmlDeclaration19.siblingIndex();
        java.lang.String str23 = xmlDeclaration19.attr("<?>");
        java.lang.String str24 = xmlDeclaration19.outerHtml();
        java.lang.String str26 = xmlDeclaration19.attr("<!<?>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration30 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str31 = xmlDeclaration30.getWholeDeclaration();
        boolean boolean33 = xmlDeclaration30.hasAttr("hi!");
        java.lang.String str34 = xmlDeclaration30.nodeName();
        org.jsoup.nodes.Node node37 = xmlDeclaration30.attr("hi!", "hi!");
        int int38 = xmlDeclaration30.siblingIndex();
        xmlDeclaration30.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration44 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str45 = xmlDeclaration44.getWholeDeclaration();
        boolean boolean47 = xmlDeclaration44.hasAttr("hi!");
        java.lang.String str48 = xmlDeclaration44.nodeName();
        org.jsoup.nodes.Node node51 = xmlDeclaration44.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList52 = node51.siblingNodes();
        boolean boolean53 = xmlDeclaration30.hasSameValue((java.lang.Object) node51);
        boolean boolean54 = xmlDeclaration19.hasSameValue((java.lang.Object) xmlDeclaration30);
        java.util.List<org.jsoup.nodes.Node> nodeList55 = xmlDeclaration30.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node56 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<?>" + "'", str24, "<?>");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#declaration" + "'", str34, "#declaration");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "#declaration" + "'", str48, "#declaration");
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(nodeList52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(nodeList55);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        int int11 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("hi!");
        org.jsoup.nodes.Node node14 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = node14.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "#declaration", "#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration3.after("<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean11 = xmlDeclaration9.equals((java.lang.Object) (byte) 0);
        java.lang.String str13 = xmlDeclaration9.attr("hi!");
        int int14 = xmlDeclaration9.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str19 = xmlDeclaration18.getWholeDeclaration();
        boolean boolean21 = xmlDeclaration18.hasAttr("hi!");
        java.lang.String str22 = xmlDeclaration18.nodeName();
        org.jsoup.nodes.Node node25 = xmlDeclaration18.attr("hi!", "hi!");
        int int26 = xmlDeclaration18.siblingIndex();
        xmlDeclaration18.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration32 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str33 = xmlDeclaration32.getWholeDeclaration();
        boolean boolean35 = xmlDeclaration32.hasAttr("hi!");
        java.lang.String str36 = xmlDeclaration32.nodeName();
        org.jsoup.nodes.Node node39 = xmlDeclaration32.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList40 = node39.siblingNodes();
        boolean boolean41 = xmlDeclaration18.hasSameValue((java.lang.Object) node39);
        boolean boolean42 = xmlDeclaration9.hasSameValue((java.lang.Object) xmlDeclaration18);
        java.lang.String str44 = xmlDeclaration18.attr("<!<!#declaration>>");
        boolean boolean45 = xmlDeclaration3.hasSameValue((java.lang.Object) str44);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<?>" + "'", str5, "<?>");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "#declaration" + "'", str36, "#declaration");
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.previousSibling();
        java.lang.String str7 = xmlDeclaration3.name();
        int int8 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str13 = xmlDeclaration12.getWholeDeclaration();
        boolean boolean15 = xmlDeclaration12.hasAttr("hi!");
        org.jsoup.nodes.Node node16 = xmlDeclaration12.clone();
        java.lang.String str18 = xmlDeclaration12.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration12.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration12.childNodes();
        boolean boolean21 = xmlDeclaration3.hasSameValue((java.lang.Object) nodeList20);
        org.jsoup.nodes.Node node22 = xmlDeclaration3.clone();
        java.lang.Class<?> wildcardClass23 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "#declaration", "<!<!#declaration>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (-1), outputSettings11);
        java.lang.String str13 = xmlDeclaration3.baseUri();
        java.lang.String str15 = xmlDeclaration3.attr("<?>");
        java.lang.Class<?> wildcardClass16 = xmlDeclaration3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        boolean boolean13 = xmlDeclaration3.hasAttr("<!<?>>");
        java.lang.String str14 = xmlDeclaration3.name();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.clone();
        node16.setBaseUri("<!#declaration>");
        int int19 = node16.childNodeSize();
        java.lang.Class<?> wildcardClass20 = node16.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        int int11 = xmlDeclaration3.siblingIndex();
        java.lang.String str12 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean19 = xmlDeclaration17.equals((java.lang.Object) (byte) 0);
        java.lang.String str21 = xmlDeclaration17.attr("hi!");
        int int22 = xmlDeclaration17.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str27 = xmlDeclaration26.getWholeDeclaration();
        boolean boolean29 = xmlDeclaration26.hasAttr("hi!");
        java.lang.String str30 = xmlDeclaration26.nodeName();
        org.jsoup.nodes.Node node33 = xmlDeclaration26.attr("hi!", "hi!");
        int int34 = xmlDeclaration26.siblingIndex();
        xmlDeclaration26.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration40 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str41 = xmlDeclaration40.getWholeDeclaration();
        boolean boolean43 = xmlDeclaration40.hasAttr("hi!");
        java.lang.String str44 = xmlDeclaration40.nodeName();
        org.jsoup.nodes.Node node47 = xmlDeclaration40.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList48 = node47.siblingNodes();
        boolean boolean49 = xmlDeclaration26.hasSameValue((java.lang.Object) node47);
        boolean boolean50 = xmlDeclaration17.hasSameValue((java.lang.Object) xmlDeclaration26);
        int int51 = xmlDeclaration26.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node52 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#declaration" + "'", str30, "#declaration");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "#declaration" + "'", str44, "#declaration");
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        java.lang.String str12 = xmlDeclaration3.attr("<!<?>>");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node6 = xmlDeclaration5.clone();
        org.jsoup.nodes.Node node9 = node6.attr("#declaration", "<?>");
        org.jsoup.nodes.Node node11 = node6.wrap("<!<?>>");
        org.jsoup.nodes.Attributes attributes12 = node6.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = xmlTreeBuilder0.processStartTag("<!<?>>", attributes12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        xmlDeclaration3.outerHtmlTail(appendable11, (int) (short) 100, outputSettings13);
        org.jsoup.nodes.Node node16 = xmlDeclaration3.removeAttr("<!#declaration>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str21 = xmlDeclaration20.getWholeDeclaration();
        boolean boolean23 = xmlDeclaration20.hasAttr("hi!");
        java.lang.String str24 = xmlDeclaration20.nodeName();
        org.jsoup.nodes.Node node25 = xmlDeclaration20.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration20.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration20.childNodes();
        java.lang.String str28 = xmlDeclaration20.name();
        org.jsoup.nodes.Node node30 = xmlDeclaration20.removeAttr("<!<!#declaration>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#declaration" + "'", str24, "#declaration");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str6 = xmlDeclaration5.getWholeDeclaration();
        boolean boolean8 = xmlDeclaration5.hasAttr("hi!");
        java.lang.String str9 = xmlDeclaration5.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration5.nextSibling();
        java.lang.String str11 = xmlDeclaration5.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration5.childNodesCopy();
        int int13 = xmlDeclaration5.siblingIndex();
        java.lang.String str14 = xmlDeclaration5.baseUri();
        org.jsoup.nodes.Node node15 = xmlDeclaration5.clone();
        int int16 = xmlDeclaration5.childNodeSize();
        org.jsoup.nodes.Node node17 = xmlDeclaration5.nextSibling();
        org.jsoup.nodes.Attributes attributes18 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = xmlTreeBuilder0.processStartTag("<?>", attributes18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#declaration" + "'", str9, "#declaration");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable4, 100, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!<!#declaration>>", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.String str9 = xmlDeclaration3.toString();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, (int) (short) 0, outputSettings12);
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable14, (int) (byte) -1, outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = xmlDeclaration3.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!>", "<!<!#declaration>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.removeAttr("hi!");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable10, 100, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("<!<?>>");
        boolean boolean9 = xmlDeclaration3.hasAttr("<!<?>>");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.parentNode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str10 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.before("<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes5 = xmlDeclaration3.attributes();
        boolean boolean7 = xmlDeclaration3.hasAttr("hi!");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (-1), outputSettings10);
        java.lang.String str12 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node17 = xmlDeclaration16.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration16.childNodes();
        boolean boolean19 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration16);
        java.lang.String str20 = xmlDeclaration16.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str25 = xmlDeclaration24.getWholeDeclaration();
        int int26 = xmlDeclaration24.siblingIndex();
        java.lang.String str28 = xmlDeclaration24.attr("<?>");
        org.jsoup.nodes.Document document29 = xmlDeclaration24.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration33 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str34 = xmlDeclaration33.outerHtml();
        boolean boolean35 = xmlDeclaration24.equals((java.lang.Object) xmlDeclaration33);
        org.jsoup.nodes.Document document36 = xmlDeclaration24.ownerDocument();
        boolean boolean37 = xmlDeclaration16.hasSameValue((java.lang.Object) xmlDeclaration24);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration41 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str42 = xmlDeclaration41.getWholeDeclaration();
        boolean boolean44 = xmlDeclaration41.hasAttr("hi!");
        org.jsoup.nodes.Node node45 = xmlDeclaration41.clone();
        java.lang.String str47 = xmlDeclaration41.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList48 = xmlDeclaration41.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList49 = xmlDeclaration41.childNodes();
        boolean boolean50 = xmlDeclaration16.equals((java.lang.Object) xmlDeclaration41);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node51 = xmlDeclaration41.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!#declaration>" + "'", str34, "<!#declaration>");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(document36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(nodeList48);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.lang.String str11 = xmlDeclaration3.baseUri();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable12, (int) 'a', outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean16 = xmlDeclaration14.equals((java.lang.Object) (byte) 0);
        java.lang.String str18 = xmlDeclaration14.attr("hi!");
        int int19 = xmlDeclaration14.childNodeSize();
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        xmlDeclaration14.outerHtmlTail(appendable20, 1, outputSettings22);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration27 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str28 = xmlDeclaration27.getWholeDeclaration();
        boolean boolean30 = xmlDeclaration27.hasAttr("hi!");
        java.lang.String str31 = xmlDeclaration27.nodeName();
        java.lang.String str32 = xmlDeclaration27.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlDeclaration27.siblingNodes();
        boolean boolean34 = xmlDeclaration14.hasSameValue((java.lang.Object) xmlDeclaration27);
        org.jsoup.nodes.Attributes attributes35 = xmlDeclaration14.attributes();
        boolean boolean36 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration14);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration40 = new org.jsoup.nodes.XmlDeclaration("<!>", "<!#declaration>", true);
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#declaration" + "'", str31, "#declaration");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<?>" + "'", str32, "<?>");
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        node4.setBaseUri("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node4.before("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("<!#declaration>", "hi!");
        org.jsoup.nodes.Attributes attributes11 = xmlDeclaration3.attributes();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean7 = xmlDeclaration5.equals((java.lang.Object) (byte) 0);
        java.lang.String str9 = xmlDeclaration5.attr("hi!");
        org.jsoup.nodes.Node node10 = xmlDeclaration5.clone();
        org.jsoup.nodes.Attributes attributes11 = node10.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = xmlTreeBuilder0.processStartTag("", attributes11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        int int4 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration8.childNodesCopy();
        boolean boolean10 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration8);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        java.lang.String str16 = xmlDeclaration14.attr("<?>");
        org.jsoup.nodes.Node node17 = xmlDeclaration14.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration8.after(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.absUrl("<?>");
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.parent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str15 = xmlDeclaration14.getWholeDeclaration();
        boolean boolean17 = xmlDeclaration14.hasAttr("hi!");
        java.lang.String str18 = xmlDeclaration14.nodeName();
        org.jsoup.nodes.Node node19 = xmlDeclaration14.nextSibling();
        java.lang.String str20 = xmlDeclaration14.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration14.childNodesCopy();
        xmlDeclaration14.setBaseUri("<!>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = node10.equals((java.lang.Object) "<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#declaration" + "'", str18, "#declaration");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.nextSibling();
        java.lang.String str11 = xmlDeclaration3.toString();
        int int12 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.attr("hi!", "<!#declaration>");
        org.jsoup.nodes.Node node16 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = node16.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<?>" + "'", str11, "<?>");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        xmlDeclaration3.outerHtmlTail(appendable11, (int) (short) 100, outputSettings13);
        org.jsoup.nodes.Node node16 = xmlDeclaration3.removeAttr("<!#declaration>");
        org.jsoup.nodes.Node node17 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = node17.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.nextSibling();
        java.lang.String str11 = xmlDeclaration3.toString();
        int int12 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.attr("hi!", "<!#declaration>");
        boolean boolean17 = xmlDeclaration3.hasAttr("<!<!#declaration>>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<?>" + "'", str11, "<?>");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.String str9 = xmlDeclaration3.name();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!#declaration>" + "'", str8, "<!#declaration>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#declaration" + "'", str9, "#declaration");
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        java.lang.String str11 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str16 = xmlDeclaration15.getWholeDeclaration();
        boolean boolean18 = xmlDeclaration15.hasAttr("hi!");
        java.lang.String str19 = xmlDeclaration15.nodeName();
        org.jsoup.nodes.Node node22 = xmlDeclaration15.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = node22.siblingNodes();
        org.jsoup.nodes.Node node24 = node22.parentNode();
        java.lang.String str25 = node22.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#declaration" + "'", str19, "#declaration");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<?>" + "'", str25, "<?>");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        int int4 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration8.childNodesCopy();
        boolean boolean10 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration8);
        org.jsoup.nodes.Node node11 = xmlDeclaration8.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = node11.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.nextSibling();
        java.lang.String str11 = xmlDeclaration3.toString();
        int int12 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.attr("hi!", "<!#declaration>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node15.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<?>" + "'", str11, "<?>");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!>", "<!#declaration>", true);
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable4, (-1), outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str10 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str15 = xmlDeclaration14.getWholeDeclaration();
        boolean boolean17 = xmlDeclaration14.hasAttr("hi!");
        org.jsoup.nodes.Node node18 = xmlDeclaration14.clone();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) node18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = xmlDeclaration3.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.previousSibling();
        java.lang.String str7 = xmlDeclaration3.name();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (int) 'a', outputSettings10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str8 = xmlDeclaration3.name();
        java.lang.String str9 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#declaration" + "'", str9, "#declaration");
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.attr("<?>");
        java.lang.String str8 = xmlDeclaration3.outerHtml();
        java.lang.String str10 = xmlDeclaration3.attr("<!<?>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str15 = xmlDeclaration14.getWholeDeclaration();
        boolean boolean17 = xmlDeclaration14.hasAttr("hi!");
        java.lang.String str18 = xmlDeclaration14.nodeName();
        org.jsoup.nodes.Node node21 = xmlDeclaration14.attr("hi!", "hi!");
        int int22 = xmlDeclaration14.siblingIndex();
        xmlDeclaration14.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str29 = xmlDeclaration28.getWholeDeclaration();
        boolean boolean31 = xmlDeclaration28.hasAttr("hi!");
        java.lang.String str32 = xmlDeclaration28.nodeName();
        org.jsoup.nodes.Node node35 = xmlDeclaration28.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = node35.siblingNodes();
        boolean boolean37 = xmlDeclaration14.hasSameValue((java.lang.Object) node35);
        boolean boolean38 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration14);
        org.jsoup.nodes.Document document39 = xmlDeclaration14.ownerDocument();
        java.lang.String str40 = xmlDeclaration14.baseUri();
        java.lang.Class<?> wildcardClass41 = xmlDeclaration14.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#declaration" + "'", str18, "#declaration");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#declaration" + "'", str32, "#declaration");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(document39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        int int11 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.previousSibling();
        java.lang.String str13 = xmlDeclaration3.name();
        java.lang.String str14 = xmlDeclaration3.nodeName();
        boolean boolean16 = xmlDeclaration3.hasAttr("<!>");
        org.jsoup.nodes.Node node17 = xmlDeclaration3.previousSibling();
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = node17.equals(obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#declaration" + "'", str14, "#declaration");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        org.jsoup.nodes.Attributes attributes4 = xmlDeclaration3.attributes();
        java.lang.String str5 = xmlDeclaration3.name();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodesCopy();
        java.lang.Class<?> wildcardClass7 = xmlDeclaration3.getClass();
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<?>" + "'", str5, "<?>");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.attr("<?>");
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str13 = xmlDeclaration12.outerHtml();
        boolean boolean14 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration12);
        org.jsoup.nodes.Document document15 = xmlDeclaration3.ownerDocument();
        java.lang.String str16 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str21 = xmlDeclaration20.getWholeDeclaration();
        int int22 = xmlDeclaration20.siblingIndex();
        xmlDeclaration20.setBaseUri("<!<?>>");
        boolean boolean26 = xmlDeclaration20.hasAttr("<!<?>>");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!#declaration>" + "'", str13, "<!#declaration>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<?>" + "'", str16, "<?>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodes();
        int int12 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = node13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        node4.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node4.siblingNodes();
        org.jsoup.nodes.Node node8 = node4.clone();
        org.jsoup.nodes.Node node9 = node4.parent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean15 = xmlDeclaration13.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj16 = null;
        boolean boolean17 = xmlDeclaration13.equals(obj16);
        java.lang.String str19 = xmlDeclaration13.attr("<!>");
        // The following exception was thrown during execution in test generation
        try {
            node4.replaceWith((org.jsoup.nodes.Node) xmlDeclaration13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node4.attr("#declaration", "<?>");
        org.jsoup.nodes.Node node8 = node7.parent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str13 = xmlDeclaration12.getWholeDeclaration();
        boolean boolean15 = xmlDeclaration12.hasAttr("hi!");
        java.lang.String str16 = xmlDeclaration12.nodeName();
        org.jsoup.nodes.Node node19 = xmlDeclaration12.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = node19.siblingNodes();
        boolean boolean21 = node7.equals((java.lang.Object) node19);
        org.jsoup.nodes.Node node23 = node7.removeAttr("<!#declaration>");
        java.lang.Class<?> wildcardClass24 = node7.getClass();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.nextSibling();
        java.lang.String str11 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.attr("<!#declaration>", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<?>" + "'", str11, "<?>");
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str6 = xmlDeclaration5.getWholeDeclaration();
        boolean boolean8 = xmlDeclaration5.hasAttr("hi!");
        java.lang.String str9 = xmlDeclaration5.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration5.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration5.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration5.childNodes();
        java.lang.String str13 = xmlDeclaration5.name();
        java.lang.String str15 = xmlDeclaration5.attr("<?>");
        xmlDeclaration5.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes18 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = xmlTreeBuilder0.processStartTag("#declaration", attributes18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#declaration" + "'", str9, "#declaration");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.String str10 = xmlDeclaration3.absUrl("<?>");
        int int11 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.clone();
        // The following exception was thrown during execution in test generation
        try {
            node12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str13 = xmlDeclaration12.getWholeDeclaration();
        boolean boolean15 = xmlDeclaration12.hasAttr("hi!");
        java.lang.String str16 = xmlDeclaration12.nodeName();
        org.jsoup.nodes.Node node19 = xmlDeclaration12.attr("hi!", "hi!");
        int int20 = xmlDeclaration12.siblingIndex();
        xmlDeclaration12.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str27 = xmlDeclaration26.getWholeDeclaration();
        boolean boolean29 = xmlDeclaration26.hasAttr("hi!");
        java.lang.String str30 = xmlDeclaration26.nodeName();
        org.jsoup.nodes.Node node33 = xmlDeclaration26.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList34 = node33.siblingNodes();
        boolean boolean35 = xmlDeclaration12.hasSameValue((java.lang.Object) node33);
        boolean boolean36 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration12);
        java.lang.String str37 = xmlDeclaration12.nodeName();
        java.lang.Appendable appendable38 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration12.outerHtmlHead(appendable38, (int) 'a', outputSettings40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#declaration" + "'", str30, "#declaration");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#declaration" + "'", str37, "#declaration");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.attr("<?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.before("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration22 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean24 = xmlDeclaration22.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj25 = null;
        boolean boolean26 = xmlDeclaration22.equals(obj25);
        java.lang.String str28 = xmlDeclaration22.attr("<!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
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
        xmlDeclaration3.setBaseUri("<!<!#declaration>>");
        org.jsoup.nodes.Node node22 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node27 = xmlDeclaration26.clone();
        java.lang.String str28 = xmlDeclaration26.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlDeclaration26.siblingNodes();
        java.lang.String str30 = xmlDeclaration26.outerHtml();
        int int31 = xmlDeclaration26.childNodeSize();
        java.lang.Appendable appendable32 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings34 = null;
        xmlDeclaration26.outerHtmlTail(appendable32, 0, outputSettings34);
        java.lang.String str36 = xmlDeclaration26.toString();
        org.jsoup.nodes.Node node37 = xmlDeclaration26.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = node22.before((org.jsoup.nodes.Node) xmlDeclaration26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<!<?>>" + "'", str28, "<!<?>>");
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!<?>>" + "'", str30, "<!<?>>");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "<!<?>>" + "'", str36, "<!<?>>");
        org.junit.Assert.assertNotNull(node37);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        java.lang.String str27 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node28 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes29 = node28.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean7 = xmlDeclaration5.equals((java.lang.Object) (byte) 0);
        java.lang.String str9 = xmlDeclaration5.attr("hi!");
        org.jsoup.nodes.Node node10 = xmlDeclaration5.clone();
        org.jsoup.nodes.Attributes attributes11 = node10.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = xmlTreeBuilder0.processStartTag("<!<?>>", attributes11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.attr("<?>");
        java.lang.String str8 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean15 = xmlDeclaration13.equals((java.lang.Object) (byte) 0);
        java.lang.String str17 = xmlDeclaration13.attr("hi!");
        int int18 = xmlDeclaration13.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration22 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str23 = xmlDeclaration22.getWholeDeclaration();
        boolean boolean25 = xmlDeclaration22.hasAttr("hi!");
        java.lang.String str26 = xmlDeclaration22.nodeName();
        org.jsoup.nodes.Node node29 = xmlDeclaration22.attr("hi!", "hi!");
        int int30 = xmlDeclaration22.siblingIndex();
        xmlDeclaration22.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration36 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str37 = xmlDeclaration36.getWholeDeclaration();
        boolean boolean39 = xmlDeclaration36.hasAttr("hi!");
        java.lang.String str40 = xmlDeclaration36.nodeName();
        org.jsoup.nodes.Node node43 = xmlDeclaration36.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList44 = node43.siblingNodes();
        boolean boolean45 = xmlDeclaration22.hasSameValue((java.lang.Object) node43);
        boolean boolean46 = xmlDeclaration13.hasSameValue((java.lang.Object) xmlDeclaration22);
        java.lang.String str48 = xmlDeclaration22.attr("<!<!#declaration>>");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#declaration" + "'", str26, "#declaration");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "#declaration" + "'", str40, "#declaration");
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        int int12 = xmlDeclaration3.siblingIndex();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.clone();
        org.jsoup.nodes.Attributes attributes15 = xmlDeclaration3.attributes();
        int int16 = xmlDeclaration3.childNodeSize();
        int int17 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        int int22 = xmlDeclaration21.siblingIndex();
        boolean boolean24 = xmlDeclaration21.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str11 = xmlDeclaration3.attr("<!<?>>");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str18 = xmlDeclaration16.absUrl("hi!");
        xmlDeclaration16.setBaseUri("#declaration");
        java.lang.String str22 = xmlDeclaration16.absUrl("hi!");
        java.lang.String str24 = xmlDeclaration16.attr("");
        java.lang.String str25 = xmlDeclaration16.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#declaration" + "'", str25, "#declaration");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.nextSibling();
        java.lang.String str11 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.attr("<!#declaration>", "");
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.traverse(nodeVisitor15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<?>" + "'", str11, "<?>");
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.attr("<?>");
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str13 = xmlDeclaration12.outerHtml();
        boolean boolean14 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration12);
        org.jsoup.nodes.Node node15 = xmlDeclaration12.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = node15.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!#declaration>" + "'", str13, "<!#declaration>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.attr("<?>");
        java.lang.String str8 = xmlDeclaration3.outerHtml();
        java.lang.String str10 = xmlDeclaration3.attr("<!<?>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str15 = xmlDeclaration14.getWholeDeclaration();
        boolean boolean17 = xmlDeclaration14.hasAttr("hi!");
        java.lang.String str18 = xmlDeclaration14.nodeName();
        org.jsoup.nodes.Node node21 = xmlDeclaration14.attr("hi!", "hi!");
        int int22 = xmlDeclaration14.siblingIndex();
        xmlDeclaration14.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str29 = xmlDeclaration28.getWholeDeclaration();
        boolean boolean31 = xmlDeclaration28.hasAttr("hi!");
        java.lang.String str32 = xmlDeclaration28.nodeName();
        org.jsoup.nodes.Node node35 = xmlDeclaration28.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = node35.siblingNodes();
        boolean boolean37 = xmlDeclaration14.hasSameValue((java.lang.Object) node35);
        boolean boolean38 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration14);
        org.jsoup.nodes.Node node40 = xmlDeclaration14.removeAttr("hi!");
        java.lang.String str41 = xmlDeclaration14.getWholeDeclaration();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#declaration" + "'", str18, "#declaration");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#declaration" + "'", str32, "#declaration");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        boolean boolean13 = xmlDeclaration3.hasAttr("<!<?>>");
        java.lang.String str14 = xmlDeclaration3.name();
        boolean boolean16 = xmlDeclaration3.hasAttr("<?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration3.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node6 = xmlDeclaration5.clone();
        java.lang.String str7 = xmlDeclaration5.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes8 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = xmlTreeBuilder0.processStartTag("<!<?>>", attributes8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<?>" + "'", str7, "<?>");
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!<!#declaration>>", "<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<!#declaration>>", "<!<!#declaration>>", false);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!>", "<!#declaration>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node4.attr("#declaration", "<?>");
        org.jsoup.nodes.Node node9 = node4.wrap("<!<?>>");
        java.lang.Class<?> wildcardClass10 = node4.getClass();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
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
        org.jsoup.nodes.Node node27 = node24.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            node27.setBaseUri("<!<!#declaration>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList13 = node12.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes5 = xmlDeclaration3.attributes();
        boolean boolean7 = xmlDeclaration3.hasAttr("hi!");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (-1), outputSettings10);
        java.lang.String str12 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node17 = xmlDeclaration16.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration16.childNodes();
        boolean boolean19 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration16);
        java.lang.String str20 = xmlDeclaration16.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str25 = xmlDeclaration24.getWholeDeclaration();
        int int26 = xmlDeclaration24.siblingIndex();
        java.lang.String str28 = xmlDeclaration24.attr("<?>");
        org.jsoup.nodes.Document document29 = xmlDeclaration24.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration33 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str34 = xmlDeclaration33.outerHtml();
        boolean boolean35 = xmlDeclaration24.equals((java.lang.Object) xmlDeclaration33);
        org.jsoup.nodes.Document document36 = xmlDeclaration24.ownerDocument();
        boolean boolean37 = xmlDeclaration16.hasSameValue((java.lang.Object) xmlDeclaration24);
        org.jsoup.nodes.Node node39 = xmlDeclaration24.removeAttr("<!#declaration>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node40 = xmlDeclaration24.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!#declaration>" + "'", str34, "<!#declaration>");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(document36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node39);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "#declaration", "<?>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.String str10 = xmlDeclaration3.absUrl("<?>");
        int int11 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.attr("<!>", "<!<!#declaration>>");
        java.lang.Class<?> wildcardClass16 = xmlDeclaration3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
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
        xmlDeclaration3.setBaseUri("<!<!#declaration>>");
        org.jsoup.nodes.Node node24 = xmlDeclaration3.attr("<!<!#declaration>>", "<!<?>>");
        org.jsoup.nodes.Node node25 = node24.parentNode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node4.attr("#declaration", "<?>");
        org.jsoup.nodes.Node node8 = node7.parent();
        node7.setBaseUri("<!>");
        java.lang.Class<?> wildcardClass11 = node7.getClass();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes5 = xmlDeclaration3.attributes();
        boolean boolean7 = xmlDeclaration3.hasAttr("hi!");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (-1), outputSettings10);
        org.jsoup.nodes.Document document12 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("<!#declaration>", "<!<?>>", true);
        java.lang.String str18 = xmlDeclaration16.absUrl("<!<!#declaration>>");
        int int19 = xmlDeclaration16.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = document12.hasSameValue((java.lang.Object) xmlDeclaration16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.parentNode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "hi!", "<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str8 = xmlDeclaration3.absUrl("<?>");
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<?>" + "'", str5, "<?>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!<?>>" + "'", str6, "<!<?>>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "#declaration", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        boolean boolean12 = xmlDeclaration3.hasAttr("<?>");
        boolean boolean14 = xmlDeclaration3.hasSameValue((java.lang.Object) (short) 0);
        xmlDeclaration3.setBaseUri("<!#declaration>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration3.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "", "<!>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean15 = xmlDeclaration13.equals((java.lang.Object) (byte) 0);
        java.lang.String str17 = xmlDeclaration13.attr("hi!");
        int int18 = xmlDeclaration13.childNodeSize();
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        xmlDeclaration13.outerHtmlTail(appendable19, 1, outputSettings21);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str27 = xmlDeclaration26.getWholeDeclaration();
        boolean boolean29 = xmlDeclaration26.hasAttr("hi!");
        java.lang.String str30 = xmlDeclaration26.nodeName();
        java.lang.String str31 = xmlDeclaration26.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlDeclaration26.siblingNodes();
        boolean boolean33 = xmlDeclaration13.hasSameValue((java.lang.Object) xmlDeclaration26);
        org.jsoup.nodes.Attributes attributes34 = xmlDeclaration13.attributes();
        org.jsoup.nodes.Node node35 = xmlDeclaration13.nextSibling();
        org.jsoup.nodes.Node node36 = xmlDeclaration13.parent();
        boolean boolean37 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration41 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        java.lang.String str42 = xmlDeclaration41.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#declaration" + "'", str30, "#declaration");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<?>" + "'", str31, "<?>");
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(attributes34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<?>" + "'", str42, "<?>");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 1, outputSettings11);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str17 = xmlDeclaration16.getWholeDeclaration();
        boolean boolean19 = xmlDeclaration16.hasAttr("hi!");
        java.lang.String str20 = xmlDeclaration16.nodeName();
        java.lang.String str21 = xmlDeclaration16.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration16.siblingNodes();
        boolean boolean23 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration16);
        org.jsoup.nodes.Node node25 = xmlDeclaration3.wrap("<!<?>>");
        xmlDeclaration3.setBaseUri("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = xmlDeclaration3.before("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<?>" + "'", str21, "<?>");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "", "<!<!#declaration>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!#declaration>", "<!<?>>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("<!<!#declaration>>");
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.String str9 = xmlDeclaration3.toString();
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.parentNode();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable12, (int) (short) 0, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!#declaration>", "<!<?>>", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable6, (int) 'a', outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!<!#declaration>>" + "'", str4, "<!<!#declaration>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!#declaration>" + "'", str5, "<!#declaration>");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node8.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.attr("hi!");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node11.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str8 = xmlDeclaration3.name();
        java.lang.String str9 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.before("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#declaration" + "'", str9, "#declaration");
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        int int11 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.parentNode();
        java.lang.String str14 = xmlDeclaration3.absUrl("<!<?>>");
        org.jsoup.nodes.Attributes attributes15 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.parent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean22 = xmlDeclaration20.equals((java.lang.Object) (byte) 0);
        java.lang.String str24 = xmlDeclaration20.attr("hi!");
        int int25 = xmlDeclaration20.childNodeSize();
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        xmlDeclaration20.outerHtmlTail(appendable26, 1, outputSettings28);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration33 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str34 = xmlDeclaration33.getWholeDeclaration();
        boolean boolean36 = xmlDeclaration33.hasAttr("hi!");
        java.lang.String str37 = xmlDeclaration33.nodeName();
        java.lang.String str38 = xmlDeclaration33.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlDeclaration33.siblingNodes();
        boolean boolean40 = xmlDeclaration20.hasSameValue((java.lang.Object) xmlDeclaration33);
        java.lang.String str41 = xmlDeclaration33.toString();
        org.jsoup.nodes.Document document42 = xmlDeclaration33.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlDeclaration33.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = node16.hasSameValue((java.lang.Object) xmlDeclaration33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#declaration" + "'", str37, "#declaration");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<?>" + "'", str38, "<?>");
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "<?>" + "'", str41, "<?>");
        org.junit.Assert.assertNull(document42);
        org.junit.Assert.assertNotNull(nodeList43);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 1, outputSettings11);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str17 = xmlDeclaration16.getWholeDeclaration();
        boolean boolean19 = xmlDeclaration16.hasAttr("hi!");
        java.lang.String str20 = xmlDeclaration16.nodeName();
        java.lang.String str21 = xmlDeclaration16.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration16.siblingNodes();
        boolean boolean23 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration16);
        java.lang.String str24 = xmlDeclaration3.nodeName();
        java.lang.String str25 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Document document26 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = document26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<?>" + "'", str21, "<?>");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#declaration" + "'", str24, "#declaration");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(document26);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str6 = xmlDeclaration5.getWholeDeclaration();
        boolean boolean8 = xmlDeclaration5.hasAttr("hi!");
        java.lang.String str9 = xmlDeclaration5.nodeName();
        java.lang.String str10 = xmlDeclaration5.toString();
        boolean boolean12 = xmlDeclaration5.hasAttr("<?>");
        int int13 = xmlDeclaration5.childNodeSize();
        org.jsoup.nodes.Node node14 = xmlDeclaration5.parentNode();
        java.lang.String str16 = xmlDeclaration5.absUrl("<!<?>>");
        org.jsoup.nodes.Attributes attributes17 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = xmlTreeBuilder0.processStartTag("hi!", attributes17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#declaration" + "'", str9, "#declaration");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<?>" + "'", str10, "<?>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        node4.setBaseUri("");
        java.lang.String str8 = node4.absUrl("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node4.attr("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
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
        org.jsoup.nodes.Node node29 = xmlDeclaration3.wrap("<?>");
        java.lang.String str30 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node31 = xmlDeclaration3.parentNode();
        java.lang.String str32 = xmlDeclaration3.nodeName();
        java.lang.String str33 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node34 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList35 = node34.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#declaration" + "'", str27, "#declaration");
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<?>" + "'", str30, "<?>");
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#declaration" + "'", str32, "#declaration");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<?>" + "'", str33, "<?>");
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!>", "<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str6 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node6.childNodes();
        org.jsoup.nodes.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node6.before(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "<?>", true);
        java.lang.String str17 = xmlDeclaration16.toString();
        xmlDeclaration16.setBaseUri("");
        java.lang.String str20 = xmlDeclaration16.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node12.before((org.jsoup.nodes.Node) xmlDeclaration16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!>" + "'", str17, "<!>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.parent();
        xmlDeclaration3.setBaseUri("<?>");
        org.jsoup.nodes.Document document9 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = document9.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
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
        org.jsoup.nodes.Node node19 = xmlDeclaration3.removeAttr("<?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = xmlDeclaration3.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!<?>>" + "'", str7, "<!<?>>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<?>" + "'", str16, "<?>");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!#declaration>", "<?>", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str8 = xmlDeclaration7.getWholeDeclaration();
        boolean boolean10 = xmlDeclaration7.hasAttr("hi!");
        java.lang.String str11 = xmlDeclaration7.nodeName();
        org.jsoup.nodes.Node node14 = xmlDeclaration7.attr("hi!", "hi!");
        int int15 = xmlDeclaration7.siblingIndex();
        xmlDeclaration7.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str22 = xmlDeclaration21.getWholeDeclaration();
        boolean boolean24 = xmlDeclaration21.hasAttr("hi!");
        java.lang.String str25 = xmlDeclaration21.nodeName();
        org.jsoup.nodes.Node node28 = xmlDeclaration21.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = node28.siblingNodes();
        boolean boolean30 = xmlDeclaration7.hasSameValue((java.lang.Object) node28);
        java.lang.String str31 = xmlDeclaration7.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = xmlDeclaration7.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#declaration" + "'", str25, "#declaration");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#declaration" + "'", str31, "#declaration");
        org.junit.Assert.assertNotNull(nodeList32);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes5 = xmlDeclaration3.attributes();
        boolean boolean7 = xmlDeclaration3.hasAttr("hi!");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (-1), outputSettings10);
        java.lang.String str12 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node17 = xmlDeclaration16.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration16.childNodes();
        boolean boolean19 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration16);
        java.lang.String str20 = xmlDeclaration16.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str25 = xmlDeclaration24.getWholeDeclaration();
        int int26 = xmlDeclaration24.siblingIndex();
        java.lang.String str28 = xmlDeclaration24.attr("<?>");
        org.jsoup.nodes.Document document29 = xmlDeclaration24.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration33 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str34 = xmlDeclaration33.outerHtml();
        boolean boolean35 = xmlDeclaration24.equals((java.lang.Object) xmlDeclaration33);
        org.jsoup.nodes.Document document36 = xmlDeclaration24.ownerDocument();
        boolean boolean37 = xmlDeclaration16.hasSameValue((java.lang.Object) xmlDeclaration24);
        org.jsoup.nodes.Node node39 = xmlDeclaration24.removeAttr("<!#declaration>");
        java.util.List<org.jsoup.nodes.Node> nodeList40 = node39.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!#declaration>" + "'", str34, "<!#declaration>");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(document36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(nodeList40);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.lang.String str12 = xmlDeclaration3.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.before("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "hi!", "", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.String str9 = xmlDeclaration3.toString();
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Document document12 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean18 = xmlDeclaration16.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj19 = null;
        boolean boolean20 = xmlDeclaration16.equals(obj19);
        java.lang.String str22 = xmlDeclaration16.attr("<!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = document12.after((org.jsoup.nodes.Node) xmlDeclaration16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!<!#declaration>>", "<!#declaration>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!<!#declaration>>", "<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        boolean boolean12 = xmlDeclaration3.hasAttr("<?>");
        boolean boolean14 = xmlDeclaration3.hasSameValue((java.lang.Object) (short) 0);
        xmlDeclaration3.setBaseUri("<!#declaration>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str21 = xmlDeclaration20.getWholeDeclaration();
        org.jsoup.nodes.Node node22 = xmlDeclaration20.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = xmlDeclaration3.before(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "hi!", "<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.lang.String str11 = xmlDeclaration3.name();
        java.lang.String str13 = xmlDeclaration3.attr("<?>");
        xmlDeclaration3.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes16 = xmlDeclaration3.attributes();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable17, (-1), outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.lang.String str11 = xmlDeclaration3.name();
        java.lang.String str13 = xmlDeclaration3.attr("<?>");
        xmlDeclaration3.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes16 = xmlDeclaration3.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration3.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.removeAttr("<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
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
        org.jsoup.nodes.Node node29 = xmlDeclaration3.wrap("<?>");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration34 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node35 = xmlDeclaration34.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlDeclaration34.childNodes();
        boolean boolean37 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration34);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = xmlDeclaration34.after("<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#declaration" + "'", str27, "#declaration");
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str6 = xmlDeclaration5.getWholeDeclaration();
        boolean boolean8 = xmlDeclaration5.hasAttr("hi!");
        java.lang.String str9 = xmlDeclaration5.nodeName();
        java.lang.String str10 = xmlDeclaration5.toString();
        boolean boolean12 = xmlDeclaration5.hasAttr("<?>");
        int int13 = xmlDeclaration5.childNodeSize();
        org.jsoup.nodes.Attributes attributes14 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = xmlTreeBuilder0.processStartTag("#declaration", attributes14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#declaration" + "'", str9, "#declaration");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<?>" + "'", str10, "<?>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 1, outputSettings11);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str17 = xmlDeclaration16.getWholeDeclaration();
        boolean boolean19 = xmlDeclaration16.hasAttr("hi!");
        java.lang.String str20 = xmlDeclaration16.nodeName();
        java.lang.String str21 = xmlDeclaration16.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration16.siblingNodes();
        boolean boolean23 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration16);
        java.lang.String str24 = xmlDeclaration3.nodeName();
        java.lang.String str25 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Document document26 = xmlDeclaration3.ownerDocument();
        org.jsoup.select.NodeVisitor nodeVisitor27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = xmlDeclaration3.traverse(nodeVisitor27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<?>" + "'", str21, "<?>");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#declaration" + "'", str24, "#declaration");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(document26);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node6 = xmlDeclaration3.attr("#declaration", "<!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node6.before("<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<!#declaration>", true);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.removeAttr("<!<!#declaration>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = xmlDeclaration3.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.previousSibling();
        java.lang.String str7 = xmlDeclaration3.name();
        int int8 = xmlDeclaration3.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.lang.String str9 = xmlDeclaration3.outerHtml();
        java.lang.String str10 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.wrap("<!<?>>");
        // The following exception was thrown during execution in test generation
        try {
            node12.setBaseUri("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<?>" + "'", str10, "<?>");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.siblingNodes();
        java.lang.String str7 = xmlDeclaration3.outerHtml();
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 0, outputSettings11);
        java.lang.String str13 = xmlDeclaration3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!<?>>" + "'", str7, "<!<?>>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!<?>>" + "'", str13, "<!<?>>");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node6 = xmlDeclaration3.attr("#declaration", "<!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str11 = xmlDeclaration10.getWholeDeclaration();
        java.lang.String str13 = xmlDeclaration10.absUrl("<?>");
        org.jsoup.nodes.Node node14 = xmlDeclaration10.parentNode();
        org.jsoup.nodes.Node node16 = xmlDeclaration10.removeAttr("<!<!#declaration>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node6.after(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str15 = xmlDeclaration14.getWholeDeclaration();
        boolean boolean17 = xmlDeclaration14.hasAttr("hi!");
        java.lang.String str18 = xmlDeclaration14.nodeName();
        org.jsoup.nodes.Node node21 = xmlDeclaration14.attr("hi!", "hi!");
        int int22 = xmlDeclaration14.siblingIndex();
        xmlDeclaration14.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str29 = xmlDeclaration28.getWholeDeclaration();
        boolean boolean31 = xmlDeclaration28.hasAttr("hi!");
        java.lang.String str32 = xmlDeclaration28.nodeName();
        org.jsoup.nodes.Node node35 = xmlDeclaration28.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = node35.siblingNodes();
        boolean boolean37 = xmlDeclaration14.hasSameValue((java.lang.Object) node35);
        java.lang.String str38 = xmlDeclaration14.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlDeclaration14.siblingNodes();
        boolean boolean40 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration14);
        org.jsoup.nodes.Node node43 = xmlDeclaration14.attr("<?>", "<!<!#declaration>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node45 = node43.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#declaration" + "'", str18, "#declaration");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#declaration" + "'", str32, "#declaration");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#declaration" + "'", str38, "#declaration");
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node43);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        int int11 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.previousSibling();
        java.lang.String str13 = xmlDeclaration3.name();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        xmlDeclaration3.outerHtmlTail(appendable14, (int) (byte) 0, outputSettings16);
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration3.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = xmlDeclaration3.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("<!<?>>");
        org.jsoup.nodes.Node node9 = xmlDeclaration3.removeAttr("<!#declaration>");
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!#declaration>", "<!#declaration>", true);
        java.lang.Appendable appendable4 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings6 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable4, 0, outputSettings6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        int int11 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.previousSibling();
        java.lang.String str13 = xmlDeclaration3.name();
        java.lang.String str14 = xmlDeclaration3.nodeName();
        java.lang.String str15 = xmlDeclaration3.getWholeDeclaration();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#declaration" + "'", str14, "#declaration");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<?>", "<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "hi!", false);
        int int4 = xmlDeclaration3.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = xmlDeclaration3.after("<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        int int12 = xmlDeclaration3.siblingIndex();
        boolean boolean14 = xmlDeclaration3.hasAttr("");
        java.lang.String str15 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str20 = xmlDeclaration19.getWholeDeclaration();
        boolean boolean22 = xmlDeclaration19.hasAttr("hi!");
        java.lang.String str23 = xmlDeclaration19.nodeName();
        org.jsoup.nodes.Node node26 = xmlDeclaration19.attr("hi!", "hi!");
        int int27 = xmlDeclaration19.siblingIndex();
        org.jsoup.nodes.Node node28 = xmlDeclaration19.previousSibling();
        java.lang.String str29 = xmlDeclaration19.name();
        java.lang.Appendable appendable30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        xmlDeclaration19.outerHtmlTail(appendable30, (int) (byte) 0, outputSettings32);
        boolean boolean35 = xmlDeclaration19.hasAttr("hi!");
        xmlDeclaration19.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node38 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#declaration" + "'", str23, "#declaration");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        int int6 = xmlDeclaration3.siblingIndex();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<?>" + "'", str5, "<?>");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<?>", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        xmlDeclaration3.setBaseUri("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!>" + "'", str4, "<!>");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        xmlDeclaration3.outerHtmlTail(appendable6, (int) '4', outputSettings8);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str14 = xmlDeclaration13.getWholeDeclaration();
        boolean boolean16 = xmlDeclaration13.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration13.childNodes();
        java.lang.String str18 = xmlDeclaration13.nodeName();
        org.jsoup.nodes.Node node19 = xmlDeclaration13.nextSibling();
        boolean boolean20 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        java.lang.String str21 = xmlDeclaration13.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#declaration" + "'", str18, "#declaration");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<?>" + "'", str21, "<?>");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        int int12 = xmlDeclaration3.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!>", "", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node8 = xmlDeclaration7.clone();
        java.lang.String str9 = xmlDeclaration7.toString();
        org.jsoup.nodes.Document document10 = xmlDeclaration7.ownerDocument();
        java.lang.String str11 = xmlDeclaration7.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!<?>>" + "'", str9, "<!<?>>");
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!<?>>" + "'", str11, "<!<?>>");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.siblingNodes();
        java.lang.String str7 = xmlDeclaration3.outerHtml();
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 0, outputSettings11);
        java.lang.String str13 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node19 = xmlDeclaration18.clone();
        org.jsoup.nodes.Node node22 = node19.attr("#declaration", "<?>");
        org.jsoup.nodes.Node node24 = node19.wrap("<!<?>>");
        org.jsoup.nodes.Attributes attributes25 = node19.attributes();
        // The following exception was thrown during execution in test generation
        try {
            node14.replaceWith(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!<?>>" + "'", str7, "<!<?>>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!<?>>" + "'", str13, "<!<?>>");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(attributes25);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str6 = xmlDeclaration5.getWholeDeclaration();
        boolean boolean8 = xmlDeclaration5.hasAttr("hi!");
        java.lang.String str9 = xmlDeclaration5.nodeName();
        java.lang.String str10 = xmlDeclaration5.toString();
        boolean boolean12 = xmlDeclaration5.hasAttr("<?>");
        int int13 = xmlDeclaration5.childNodeSize();
        org.jsoup.nodes.Node node14 = xmlDeclaration5.parentNode();
        java.lang.String str16 = xmlDeclaration5.absUrl("<!<?>>");
        org.jsoup.nodes.Attributes attributes17 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = xmlTreeBuilder0.processStartTag("<!#declaration>", attributes17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#declaration" + "'", str9, "#declaration");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<?>" + "'", str10, "<?>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        int int12 = xmlDeclaration3.siblingIndex();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.clone();
        java.lang.String str15 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str20 = xmlDeclaration19.getWholeDeclaration();
        boolean boolean22 = xmlDeclaration19.hasAttr("hi!");
        java.lang.String str23 = xmlDeclaration19.nodeName();
        org.jsoup.nodes.Node node24 = xmlDeclaration19.nextSibling();
        java.lang.String str25 = xmlDeclaration19.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration19.childNodesCopy();
        int int27 = xmlDeclaration19.siblingIndex();
        java.lang.String str28 = xmlDeclaration19.baseUri();
        org.jsoup.nodes.Node node29 = xmlDeclaration19.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = xmlDeclaration3.before(node29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#declaration" + "'", str23, "#declaration");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "hi!", "<!<?>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        java.util.List<org.jsoup.nodes.Node> nodeList4 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.parent();
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        java.lang.String str11 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.clone();
        java.lang.String str13 = xmlDeclaration3.toString();
        boolean boolean15 = xmlDeclaration3.hasAttr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node20 = xmlDeclaration19.clone();
        java.lang.String str21 = xmlDeclaration19.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration19.siblingNodes();
        java.lang.String str23 = xmlDeclaration19.outerHtml();
        int int24 = xmlDeclaration19.childNodeSize();
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        xmlDeclaration19.outerHtmlTail(appendable25, 0, outputSettings27);
        java.lang.String str29 = xmlDeclaration19.toString();
        org.jsoup.nodes.Node node30 = xmlDeclaration19.clone();
        boolean boolean31 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration19);
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration19.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<?>" + "'", str11, "<?>");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<?>" + "'", str13, "<?>");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!<?>>" + "'", str21, "<!<?>>");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!<?>>" + "'", str23, "<!<?>>");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!<?>>" + "'", str29, "<!<?>>");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (-1), outputSettings11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.wrap("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str11 = xmlDeclaration3.attr("<?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.before("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        xmlDeclaration3.setBaseUri("");
        java.lang.String str14 = xmlDeclaration3.attr("<!#declaration>");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        xmlDeclaration3.outerHtmlTail(appendable15, 1, outputSettings17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = xmlDeclaration3.after("<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
        org.jsoup.nodes.Attributes attributes23 = xmlDeclaration21.attributes();
        boolean boolean25 = xmlDeclaration21.hasAttr("hi!");
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        xmlDeclaration21.outerHtmlTail(appendable26, (-1), outputSettings28);
        java.lang.String str30 = xmlDeclaration21.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration34 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node35 = xmlDeclaration34.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlDeclaration34.childNodes();
        boolean boolean37 = xmlDeclaration21.hasSameValue((java.lang.Object) xmlDeclaration34);
        org.jsoup.nodes.Node node39 = xmlDeclaration34.removeAttr("<!<?>>");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith(node39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!<?>>" + "'", str7, "<!<?>>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<?>" + "'", str16, "<?>");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#declaration" + "'", str30, "#declaration");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node39);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str8 = xmlDeclaration3.absUrl("<?>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean14 = xmlDeclaration12.equals((java.lang.Object) (byte) 0);
        java.lang.String str16 = xmlDeclaration12.attr("hi!");
        int int17 = xmlDeclaration12.childNodeSize();
        java.lang.String str19 = xmlDeclaration12.absUrl("<?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<?>" + "'", str5, "<?>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!<?>>" + "'", str6, "<!<?>>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "", "<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
        org.jsoup.nodes.Node node29 = xmlDeclaration3.wrap("<?>");
        java.lang.String str30 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node31 = xmlDeclaration3.parentNode();
        java.lang.String str32 = xmlDeclaration3.nodeName();
        java.lang.String str33 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration37 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str38 = xmlDeclaration37.getWholeDeclaration();
        boolean boolean40 = xmlDeclaration37.hasAttr("hi!");
        java.lang.String str41 = xmlDeclaration37.nodeName();
        org.jsoup.nodes.Node node42 = xmlDeclaration37.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#declaration" + "'", str27, "#declaration");
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<?>" + "'", str30, "<?>");
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#declaration" + "'", str32, "#declaration");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<?>" + "'", str33, "<?>");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#declaration" + "'", str41, "#declaration");
        org.junit.Assert.assertNull(node42);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodesCopy();
        java.lang.String str13 = xmlDeclaration3.absUrl("<!#declaration>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration30 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str31 = xmlDeclaration30.getWholeDeclaration();
        boolean boolean33 = xmlDeclaration30.hasAttr("hi!");
        java.lang.String str34 = xmlDeclaration30.nodeName();
        java.lang.String str35 = xmlDeclaration30.toString();
        boolean boolean37 = xmlDeclaration30.hasAttr("<?>");
        java.lang.String str38 = xmlDeclaration30.baseUri();
        int int39 = xmlDeclaration30.siblingIndex();
        java.lang.String str40 = xmlDeclaration30.getWholeDeclaration();
        boolean boolean41 = node24.equals((java.lang.Object) str40);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node43 = node24.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#declaration" + "'", str34, "#declaration");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<?>" + "'", str35, "<?>");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        boolean boolean12 = xmlDeclaration3.hasAttr("<?>");
        boolean boolean14 = xmlDeclaration3.hasSameValue((java.lang.Object) (short) 0);
        java.lang.String str15 = xmlDeclaration3.baseUri();
        java.lang.Class<?> wildcardClass16 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        int int12 = xmlDeclaration3.siblingIndex();
        boolean boolean14 = xmlDeclaration3.hasAttr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str19 = xmlDeclaration18.getWholeDeclaration();
        boolean boolean21 = xmlDeclaration18.hasAttr("hi!");
        org.jsoup.nodes.Node node22 = xmlDeclaration18.clone();
        java.lang.String str24 = xmlDeclaration18.absUrl("hi!");
        java.lang.String str25 = xmlDeclaration18.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#declaration" + "'", str25, "#declaration");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.attr("<?>");
        java.lang.String str8 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.attr("<!<?>>", "<?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.before("<!<!#declaration>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!#declaration>", "<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!>", "#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "#declaration", "<!<!#declaration>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<?>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = node4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        org.jsoup.select.NodeVisitor nodeVisitor20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = xmlDeclaration12.traverse(nodeVisitor20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#declaration" + "'", str17, "#declaration");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Attributes attributes2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = xmlTreeBuilder0.processStartTag("<!#declaration>", attributes2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str11 = xmlDeclaration3.absUrl("<!#declaration>");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.removeAttr("<!#declaration>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str19 = xmlDeclaration18.getWholeDeclaration();
        int int20 = xmlDeclaration18.siblingIndex();
        xmlDeclaration18.setBaseUri("<!<?>>");
        int int23 = xmlDeclaration18.childNodeSize();
        java.lang.String str24 = xmlDeclaration18.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlDeclaration18.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!<!#declaration>>", "<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "", "<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!<?>>", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.previousSibling();
        java.lang.String str7 = xmlDeclaration3.name();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (int) 'a', outputSettings10);
        org.jsoup.nodes.Node node12 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.attr("<?>");
        java.lang.String str8 = xmlDeclaration3.outerHtml();
        java.lang.String str10 = xmlDeclaration3.attr("<!<?>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str15 = xmlDeclaration14.getWholeDeclaration();
        boolean boolean17 = xmlDeclaration14.hasAttr("hi!");
        java.lang.String str18 = xmlDeclaration14.nodeName();
        org.jsoup.nodes.Node node21 = xmlDeclaration14.attr("hi!", "hi!");
        int int22 = xmlDeclaration14.siblingIndex();
        xmlDeclaration14.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str29 = xmlDeclaration28.getWholeDeclaration();
        boolean boolean31 = xmlDeclaration28.hasAttr("hi!");
        java.lang.String str32 = xmlDeclaration28.nodeName();
        org.jsoup.nodes.Node node35 = xmlDeclaration28.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = node35.siblingNodes();
        boolean boolean37 = xmlDeclaration14.hasSameValue((java.lang.Object) node35);
        boolean boolean38 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = xmlDeclaration14.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#declaration" + "'", str18, "#declaration");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#declaration" + "'", str32, "#declaration");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.lang.String str9 = xmlDeclaration3.outerHtml();
        java.lang.String str10 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.wrap("<!<?>>");
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.removeAttr("hi!");
        java.lang.Class<?> wildcardClass16 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<?>" + "'", str10, "<?>");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str6 = xmlDeclaration5.getWholeDeclaration();
        boolean boolean8 = xmlDeclaration5.hasAttr("hi!");
        java.lang.String str9 = xmlDeclaration5.nodeName();
        java.lang.String str10 = xmlDeclaration5.toString();
        boolean boolean12 = xmlDeclaration5.hasAttr("<?>");
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = xmlTreeBuilder0.processStartTag("hi!", attributes13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#declaration" + "'", str9, "#declaration");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<?>" + "'", str10, "<?>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = node10.hasAttr("<!<!#declaration>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str10 = xmlDeclaration9.getWholeDeclaration();
        boolean boolean12 = xmlDeclaration9.hasAttr("hi!");
        java.lang.String str13 = xmlDeclaration9.nodeName();
        org.jsoup.nodes.Node node16 = xmlDeclaration9.attr("hi!", "hi!");
        int int17 = xmlDeclaration9.siblingIndex();
        xmlDeclaration9.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str24 = xmlDeclaration23.getWholeDeclaration();
        boolean boolean26 = xmlDeclaration23.hasAttr("hi!");
        java.lang.String str27 = xmlDeclaration23.nodeName();
        org.jsoup.nodes.Node node30 = xmlDeclaration23.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = node30.siblingNodes();
        boolean boolean32 = xmlDeclaration9.hasSameValue((java.lang.Object) node30);
        java.lang.String str33 = xmlDeclaration9.nodeName();
        boolean boolean34 = xmlDeclaration3.equals((java.lang.Object) str33);
        java.lang.String str35 = xmlDeclaration3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#declaration" + "'", str27, "#declaration");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#declaration" + "'", str33, "#declaration");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<?>" + "'", str35, "<?>");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration30 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str31 = xmlDeclaration30.getWholeDeclaration();
        boolean boolean33 = xmlDeclaration30.hasAttr("hi!");
        java.lang.String str34 = xmlDeclaration30.nodeName();
        java.lang.String str35 = xmlDeclaration30.toString();
        boolean boolean37 = xmlDeclaration30.hasAttr("<?>");
        java.lang.String str38 = xmlDeclaration30.baseUri();
        int int39 = xmlDeclaration30.siblingIndex();
        java.lang.String str40 = xmlDeclaration30.getWholeDeclaration();
        boolean boolean41 = node24.equals((java.lang.Object) str40);
        org.jsoup.nodes.Node node42 = node24.nextSibling();
        org.jsoup.nodes.Node node43 = null;
        // The following exception was thrown during execution in test generation
        try {
            node42.replaceWith(node43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#declaration" + "'", str34, "#declaration");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<?>" + "'", str35, "<?>");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!>", "<!#declaration>", true);
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        java.lang.String str12 = xmlDeclaration3.attr("<!<?>>");
        int int13 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str18 = xmlDeclaration17.getWholeDeclaration();
        boolean boolean20 = xmlDeclaration17.hasAttr("hi!");
        org.jsoup.nodes.Node node21 = xmlDeclaration17.clone();
        java.lang.String str23 = xmlDeclaration17.absUrl("hi!");
        java.lang.String str25 = xmlDeclaration17.attr("<?>");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.absUrl("<?>");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration3.before("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<?>", "", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        java.lang.String str11 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("<?>", "<!#declaration>", true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        java.lang.String str11 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!#declaration>" + "'", str11, "<!#declaration>");
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.absUrl("<?>");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.previousSibling();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        int int11 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.previousSibling();
        java.lang.String str13 = xmlDeclaration3.name();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        xmlDeclaration3.outerHtmlTail(appendable14, (int) (byte) 0, outputSettings16);
        boolean boolean19 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node20 = xmlDeclaration3.parent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str25 = xmlDeclaration24.getWholeDeclaration();
        org.jsoup.nodes.Node node26 = xmlDeclaration24.nextSibling();
        org.jsoup.nodes.Node node27 = xmlDeclaration24.previousSibling();
        java.lang.String str28 = xmlDeclaration24.name();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = node20.hasSameValue((java.lang.Object) str28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
        org.jsoup.nodes.Node node29 = xmlDeclaration3.wrap("<?>");
        java.lang.String str30 = xmlDeclaration3.getWholeDeclaration();
        java.lang.Appendable appendable31 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings33 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable31, (int) (short) 1, outputSettings33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#declaration" + "'", str27, "#declaration");
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.nextSibling();
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.parent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("<!<?>>", "<!#declaration>", false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = node12.hasSameValue((java.lang.Object) "<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.previousSibling();
        java.lang.String str7 = xmlDeclaration3.name();
        int int8 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Document document9 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = document9.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        int int12 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str18 = xmlDeclaration17.getWholeDeclaration();
        boolean boolean20 = xmlDeclaration17.hasAttr("hi!");
        java.lang.String str21 = xmlDeclaration17.nodeName();
        org.jsoup.nodes.Node node24 = xmlDeclaration17.attr("hi!", "hi!");
        int int25 = xmlDeclaration17.siblingIndex();
        xmlDeclaration17.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration31 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str32 = xmlDeclaration31.getWholeDeclaration();
        boolean boolean34 = xmlDeclaration31.hasAttr("hi!");
        java.lang.String str35 = xmlDeclaration31.nodeName();
        org.jsoup.nodes.Node node38 = xmlDeclaration31.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList39 = node38.siblingNodes();
        boolean boolean40 = xmlDeclaration17.hasSameValue((java.lang.Object) node38);
        java.lang.String str41 = xmlDeclaration17.nodeName();
        org.jsoup.nodes.Node node43 = xmlDeclaration17.wrap("<?>");
        java.lang.String str44 = xmlDeclaration17.getWholeDeclaration();
        java.lang.String str45 = xmlDeclaration17.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = node13.hasSameValue((java.lang.Object) str45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#declaration" + "'", str35, "#declaration");
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#declaration" + "'", str41, "#declaration");
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<?>" + "'", str45, "<?>");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 1, outputSettings11);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str17 = xmlDeclaration16.getWholeDeclaration();
        boolean boolean19 = xmlDeclaration16.hasAttr("hi!");
        java.lang.String str20 = xmlDeclaration16.nodeName();
        java.lang.String str21 = xmlDeclaration16.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration16.siblingNodes();
        boolean boolean23 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration16);
        java.lang.String str24 = xmlDeclaration16.toString();
        org.jsoup.nodes.Document document25 = xmlDeclaration16.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration29 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean31 = xmlDeclaration29.equals((java.lang.Object) (byte) 0);
        java.lang.String str33 = xmlDeclaration29.attr("hi!");
        int int34 = xmlDeclaration29.childNodeSize();
        java.lang.Appendable appendable35 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = null;
        xmlDeclaration29.outerHtmlTail(appendable35, 1, outputSettings37);
        int int39 = xmlDeclaration29.siblingIndex();
        java.lang.String str40 = xmlDeclaration29.getWholeDeclaration();
        xmlDeclaration29.setBaseUri("<!#declaration>");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration16.replaceWith((org.jsoup.nodes.Node) xmlDeclaration29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<?>" + "'", str21, "<?>");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<?>" + "'", str24, "<?>");
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.attr("<?>");
        java.lang.String str8 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.attr("<!<?>>", "<?>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = xmlDeclaration3.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.nextSibling();
        java.lang.String str10 = xmlDeclaration3.name();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str6 = xmlDeclaration5.getWholeDeclaration();
        boolean boolean8 = xmlDeclaration5.hasAttr("hi!");
        java.lang.String str9 = xmlDeclaration5.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration5.nextSibling();
        java.lang.String str11 = xmlDeclaration5.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration5.childNodesCopy();
        int int13 = xmlDeclaration5.siblingIndex();
        java.lang.String str14 = xmlDeclaration5.baseUri();
        org.jsoup.nodes.Node node15 = xmlDeclaration5.clone();
        int int16 = xmlDeclaration5.childNodeSize();
        org.jsoup.nodes.Node node17 = xmlDeclaration5.nextSibling();
        org.jsoup.nodes.Attributes attributes18 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = xmlTreeBuilder0.processStartTag("hi!", attributes18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#declaration" + "'", str9, "#declaration");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodes();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.siblingNodes();
        java.lang.String str7 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str13 = xmlDeclaration11.absUrl("hi!");
        xmlDeclaration11.setBaseUri("#declaration");
        java.lang.String str17 = xmlDeclaration11.absUrl("hi!");
        java.lang.String str19 = xmlDeclaration11.attr("<!<?>>");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration11.childNodes();
        java.lang.String str21 = xmlDeclaration11.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!<?>>" + "'", str7, "<!<?>>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!#declaration>", "<!<?>>", true);
        java.lang.String str5 = xmlDeclaration3.attr("<?>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str10 = xmlDeclaration9.getWholeDeclaration();
        int int11 = xmlDeclaration9.siblingIndex();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        xmlDeclaration9.outerHtmlTail(appendable12, (int) '4', outputSettings14);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str20 = xmlDeclaration19.getWholeDeclaration();
        boolean boolean22 = xmlDeclaration19.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration19.childNodes();
        java.lang.String str24 = xmlDeclaration19.nodeName();
        org.jsoup.nodes.Node node25 = xmlDeclaration19.nextSibling();
        boolean boolean26 = xmlDeclaration9.equals((java.lang.Object) xmlDeclaration19);
        boolean boolean27 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration9);
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#declaration" + "'", str24, "#declaration");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.lang.String str9 = xmlDeclaration3.outerHtml();
        java.lang.String str10 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.wrap("<!<?>>");
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.removeAttr("hi!");
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node15.traverse(nodeVisitor16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<?>" + "'", str10, "<?>");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.parentNode();
        java.lang.String str13 = xmlDeclaration3.name();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration3.before("<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!#declaration>", "#declaration", true);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        org.jsoup.nodes.Attributes attributes6 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = xmlTreeBuilder0.processStartTag("hi!", attributes6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = xmlDeclaration3.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        node4.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node4.siblingNodes();
        org.jsoup.nodes.Node node8 = node4.clone();
        org.jsoup.nodes.Node node9 = node4.parent();
        org.jsoup.nodes.Node node10 = node4.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean16 = xmlDeclaration14.equals((java.lang.Object) (byte) 0);
        java.lang.String str18 = xmlDeclaration14.attr("hi!");
        int int19 = xmlDeclaration14.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str24 = xmlDeclaration23.getWholeDeclaration();
        boolean boolean26 = xmlDeclaration23.hasAttr("hi!");
        java.lang.String str27 = xmlDeclaration23.nodeName();
        org.jsoup.nodes.Node node30 = xmlDeclaration23.attr("hi!", "hi!");
        int int31 = xmlDeclaration23.siblingIndex();
        xmlDeclaration23.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration37 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str38 = xmlDeclaration37.getWholeDeclaration();
        boolean boolean40 = xmlDeclaration37.hasAttr("hi!");
        java.lang.String str41 = xmlDeclaration37.nodeName();
        org.jsoup.nodes.Node node44 = xmlDeclaration37.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList45 = node44.siblingNodes();
        boolean boolean46 = xmlDeclaration23.hasSameValue((java.lang.Object) node44);
        boolean boolean47 = xmlDeclaration14.hasSameValue((java.lang.Object) xmlDeclaration23);
        java.lang.String str48 = xmlDeclaration23.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            node10.replaceWith((org.jsoup.nodes.Node) xmlDeclaration23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#declaration" + "'", str27, "#declaration");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#declaration" + "'", str41, "#declaration");
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(nodeList45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "#declaration" + "'", str48, "#declaration");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration32 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str33 = xmlDeclaration32.getWholeDeclaration();
        boolean boolean35 = xmlDeclaration32.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = xmlDeclaration32.childNodes();
        java.lang.String str37 = xmlDeclaration32.nodeName();
        java.lang.String str38 = xmlDeclaration32.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration42 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean44 = xmlDeclaration42.equals((java.lang.Object) (byte) 0);
        java.lang.String str46 = xmlDeclaration42.attr("hi!");
        org.jsoup.nodes.Node node47 = xmlDeclaration42.clone();
        boolean boolean48 = xmlDeclaration32.hasSameValue((java.lang.Object) node47);
        xmlDeclaration32.setBaseUri("<!<!#declaration>>");
        org.jsoup.nodes.Node node53 = xmlDeclaration32.attr("<!<!#declaration>>", "<!<?>>");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith(node53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#declaration" + "'", str27, "#declaration");
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "#declaration" + "'", str37, "#declaration");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<?>" + "'", str38, "<?>");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(node53);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = null;
        boolean boolean7 = xmlDeclaration3.equals(obj6);
        boolean boolean9 = xmlDeclaration3.hasSameValue((java.lang.Object) false);
        xmlDeclaration3.setBaseUri("<?>");
        java.lang.String str12 = xmlDeclaration3.name();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str18 = xmlDeclaration16.absUrl("hi!");
        java.lang.String str19 = xmlDeclaration16.baseUri();
        org.jsoup.nodes.Node node20 = xmlDeclaration16.previousSibling();
        java.lang.String str21 = xmlDeclaration16.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<?>" + "'", str19, "<?>");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
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
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlDeclaration3.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#declaration" + "'", str27, "#declaration");
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(nodeList29);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.previousSibling();
        java.lang.String str7 = xmlDeclaration3.name();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (int) 'a', outputSettings10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.after("<!<!#declaration>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str6 = xmlDeclaration5.getWholeDeclaration();
        boolean boolean8 = xmlDeclaration5.hasAttr("hi!");
        java.lang.String str9 = xmlDeclaration5.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration5.nextSibling();
        java.lang.String str11 = xmlDeclaration5.toString();
        org.jsoup.nodes.Node node12 = xmlDeclaration5.nextSibling();
        java.lang.String str13 = xmlDeclaration5.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str18 = xmlDeclaration17.getWholeDeclaration();
        boolean boolean20 = xmlDeclaration17.hasAttr("hi!");
        org.jsoup.nodes.Node node21 = xmlDeclaration17.clone();
        boolean boolean22 = xmlDeclaration5.equals((java.lang.Object) xmlDeclaration17);
        org.jsoup.nodes.Attributes attributes23 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = xmlTreeBuilder0.processStartTag("<?>", attributes23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#declaration" + "'", str9, "#declaration");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<?>" + "'", str11, "<?>");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<?>" + "'", str13, "<?>");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(attributes23);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.nodes.Document document6 = xmlDeclaration3.ownerDocument();
        java.lang.String str7 = xmlDeclaration3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.after("<!<!#declaration>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!<?>>" + "'", str7, "<!<?>>");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
        xmlDeclaration3.setBaseUri("<!<!#declaration>>");
        org.jsoup.nodes.Node node24 = xmlDeclaration3.attr("<!<!#declaration>>", "<!<?>>");
        int int25 = node24.siblingIndex();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        java.lang.String str11 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node17 = xmlDeclaration16.clone();
        java.lang.String str18 = xmlDeclaration16.toString();
        org.jsoup.nodes.Node node19 = xmlDeclaration16.parent();
        xmlDeclaration16.setBaseUri("<?>");
        org.jsoup.nodes.Document document22 = xmlDeclaration16.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration16.childNodes();
        java.lang.String str24 = xmlDeclaration16.name();
        // The following exception was thrown during execution in test generation
        try {
            node12.replaceWith((org.jsoup.nodes.Node) xmlDeclaration16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!<?>>" + "'", str18, "<!<?>>");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<?>" + "'", str24, "<?>");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!<?>>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 1, outputSettings11);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str17 = xmlDeclaration16.getWholeDeclaration();
        boolean boolean19 = xmlDeclaration16.hasAttr("hi!");
        java.lang.String str20 = xmlDeclaration16.nodeName();
        java.lang.String str21 = xmlDeclaration16.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration16.siblingNodes();
        boolean boolean23 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration16);
        java.lang.String str24 = xmlDeclaration16.toString();
        org.jsoup.nodes.Document document25 = xmlDeclaration16.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration16.childNodes();
        int int27 = xmlDeclaration16.childNodeSize();
        java.lang.Class<?> wildcardClass28 = xmlDeclaration16.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<?>" + "'", str21, "<?>");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<?>" + "'", str24, "<?>");
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        boolean boolean12 = xmlDeclaration3.hasAttr("<?>");
        boolean boolean14 = xmlDeclaration3.hasSameValue((java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = xmlDeclaration3.before("<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = null;
        boolean boolean7 = xmlDeclaration3.equals(obj6);
        java.lang.String str9 = xmlDeclaration3.attr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        boolean boolean12 = xmlDeclaration3.hasAttr("<!<!#declaration>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<?>>", "<?>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.removeAttr("<!<!#declaration>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = new org.jsoup.nodes.XmlDeclaration("<!<?>>", "<?>", true);
        org.jsoup.nodes.Node node12 = xmlDeclaration10.removeAttr("<!#declaration>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node6.before((org.jsoup.nodes.Node) xmlDeclaration10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.String str10 = xmlDeclaration3.absUrl("<?>");
        int int11 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.clone();
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration3.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str19 = xmlDeclaration18.getWholeDeclaration();
        org.jsoup.nodes.Node node20 = xmlDeclaration18.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration18.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration3.attributes();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        int int12 = xmlDeclaration3.siblingIndex();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.clone();
        java.lang.String str15 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Node node18 = xmlDeclaration3.attr("hi!", "");
        xmlDeclaration3.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = xmlDeclaration3.attr("", "<!<!#declaration>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node9 = node6.attr("hi!", "<!#declaration>");
        org.jsoup.nodes.Node node10 = node9.parent();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = node10.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 1, outputSettings11);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str17 = xmlDeclaration16.getWholeDeclaration();
        boolean boolean19 = xmlDeclaration16.hasAttr("hi!");
        java.lang.String str20 = xmlDeclaration16.nodeName();
        java.lang.String str21 = xmlDeclaration16.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration16.siblingNodes();
        boolean boolean23 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration16);
        org.jsoup.nodes.Node node25 = xmlDeclaration3.wrap("<!<?>>");
        xmlDeclaration3.setBaseUri("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = xmlDeclaration3.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<?>" + "'", str21, "<?>");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.nextSibling();
        java.lang.String str11 = xmlDeclaration3.getWholeDeclaration();
        java.lang.Class<?> wildcardClass12 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
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
        xmlDeclaration3.setBaseUri("<!<!#declaration>>");
        java.lang.String str22 = xmlDeclaration3.outerHtml();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<?>" + "'", str22, "<?>");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<?>", "<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "", "<!#declaration>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<?>", "<!<?>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.lang.String str11 = xmlDeclaration3.name();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        xmlDeclaration3.outerHtmlTail(appendable12, (int) 'a', outputSettings14);
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration3.childNodes();
        java.lang.Class<?> wildcardClass17 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.previousSibling();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!#declaration>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.siblingNodes();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        xmlDeclaration3.outerHtmlTail(appendable13, 0, outputSettings15);
        java.lang.String str18 = xmlDeclaration3.attr("<?>");
        int int19 = xmlDeclaration3.siblingIndex();
        java.lang.String str20 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!#declaration>", "<!<?>>", true);
        java.lang.String str5 = xmlDeclaration3.attr("<?>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str10 = xmlDeclaration9.getWholeDeclaration();
        int int11 = xmlDeclaration9.siblingIndex();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        xmlDeclaration9.outerHtmlTail(appendable12, (int) '4', outputSettings14);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str20 = xmlDeclaration19.getWholeDeclaration();
        boolean boolean22 = xmlDeclaration19.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration19.childNodes();
        java.lang.String str24 = xmlDeclaration19.nodeName();
        org.jsoup.nodes.Node node25 = xmlDeclaration19.nextSibling();
        boolean boolean26 = xmlDeclaration9.equals((java.lang.Object) xmlDeclaration19);
        boolean boolean27 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration9);
        java.lang.String str29 = xmlDeclaration3.attr("");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration33 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str34 = xmlDeclaration33.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes35 = xmlDeclaration33.attributes();
        boolean boolean37 = xmlDeclaration33.hasAttr("hi!");
        java.lang.Appendable appendable38 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = null;
        xmlDeclaration33.outerHtmlTail(appendable38, (-1), outputSettings40);
        org.jsoup.nodes.Document document42 = xmlDeclaration33.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration46 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str47 = xmlDeclaration46.getWholeDeclaration();
        boolean boolean49 = xmlDeclaration46.hasAttr("hi!");
        java.lang.String str50 = xmlDeclaration46.nodeName();
        org.jsoup.nodes.Node node51 = xmlDeclaration46.nextSibling();
        java.lang.String str52 = xmlDeclaration46.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList53 = xmlDeclaration46.childNodesCopy();
        java.lang.Appendable appendable54 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings56 = null;
        xmlDeclaration46.outerHtmlTail(appendable54, (int) (short) 100, outputSettings56);
        org.jsoup.nodes.Node node59 = xmlDeclaration46.removeAttr("<!#declaration>");
        boolean boolean60 = xmlDeclaration33.equals((java.lang.Object) xmlDeclaration46);
        org.jsoup.nodes.Node node61 = xmlDeclaration46.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith(node61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#declaration" + "'", str24, "#declaration");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(attributes35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(document42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "#declaration" + "'", str50, "#declaration");
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(node61);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", false);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("<!<!#declaration>>");
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node5.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        java.lang.Class<?> wildcardClass12 = nodeList11.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.attr("hi!");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node11 = node10.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = node11.attr("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        boolean boolean13 = xmlDeclaration3.hasAttr("<!<?>>");
        java.lang.String str14 = xmlDeclaration3.name();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.clone();
        node16.setBaseUri("<!#declaration>");
        // The following exception was thrown during execution in test generation
        try {
            node16.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.attr("<?>");
        java.lang.String str8 = xmlDeclaration3.outerHtml();
        java.lang.String str10 = xmlDeclaration3.attr("<!<?>>");
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<?>>", "<!#declaration>", true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = xmlDeclaration3.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str6 = xmlDeclaration5.getWholeDeclaration();
        boolean boolean8 = xmlDeclaration5.hasAttr("hi!");
        java.lang.String str9 = xmlDeclaration5.nodeName();
        org.jsoup.nodes.Node node12 = xmlDeclaration5.attr("hi!", "hi!");
        int int13 = xmlDeclaration5.siblingIndex();
        org.jsoup.nodes.Node node14 = xmlDeclaration5.previousSibling();
        org.jsoup.nodes.Attributes attributes15 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = xmlTreeBuilder0.processStartTag("<!>", attributes15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#declaration" + "'", str9, "#declaration");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.siblingNodes();
        org.jsoup.nodes.Node node12 = node10.parentNode();
        java.lang.String str13 = node10.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str19 = xmlDeclaration17.absUrl("hi!");
        xmlDeclaration17.setBaseUri("#declaration");
        java.lang.String str23 = xmlDeclaration17.absUrl("hi!");
        java.lang.String str25 = xmlDeclaration17.attr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node10.before((org.jsoup.nodes.Node) xmlDeclaration17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<?>" + "'", str13, "<?>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
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
        org.jsoup.nodes.Node node29 = xmlDeclaration3.wrap("<?>");
        java.lang.String str30 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node31 = xmlDeclaration3.nextSibling();
        xmlDeclaration3.setBaseUri("hi!");
        java.lang.String str34 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = xmlDeclaration3.after("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#declaration" + "'", str27, "#declaration");
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        int int11 = xmlDeclaration3.siblingIndex();
        java.lang.String str12 = xmlDeclaration3.toString();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable13, (int) (short) 0, outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<?>" + "'", str12, "<?>");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        xmlDeclaration3.outerHtmlTail(appendable11, (int) (byte) 0, outputSettings13);
        org.jsoup.nodes.Node node15 = xmlDeclaration3.parent();
        java.lang.String str16 = xmlDeclaration3.nodeName();
        java.lang.String str17 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#declaration" + "'", str17, "#declaration");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        org.jsoup.nodes.Attributes attributes6 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = xmlTreeBuilder0.processStartTag("<!<?>>", attributes6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!#declaration>", "#declaration", false);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes5 = xmlDeclaration3.attributes();
        boolean boolean7 = xmlDeclaration3.hasAttr("hi!");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (-1), outputSettings10);
        org.jsoup.nodes.Document document12 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str17 = xmlDeclaration16.getWholeDeclaration();
        boolean boolean19 = xmlDeclaration16.hasAttr("hi!");
        java.lang.String str20 = xmlDeclaration16.nodeName();
        org.jsoup.nodes.Node node21 = xmlDeclaration16.nextSibling();
        java.lang.String str22 = xmlDeclaration16.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration16.childNodesCopy();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        xmlDeclaration16.outerHtmlTail(appendable24, (int) (short) 100, outputSettings26);
        org.jsoup.nodes.Node node29 = xmlDeclaration16.removeAttr("<!#declaration>");
        boolean boolean30 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = xmlDeclaration16.after("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.siblingNodes();
        java.lang.String str7 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.removeAttr("hi!");
        node9.setBaseUri("<!#declaration>");
        java.lang.Class<?> wildcardClass12 = node9.getClass();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!<?>>" + "'", str7, "<!<?>>");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = node11.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        java.lang.String str11 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str13 = xmlDeclaration3.absUrl("<!>");
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable14, (int) '4', outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = document8.wrap("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.absUrl("<?>");
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.parent();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node11.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("<!<?>>");
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.attr("<?>");
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str13 = xmlDeclaration12.outerHtml();
        boolean boolean14 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration12);
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = xmlDeclaration3.traverse(nodeVisitor15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!#declaration>" + "'", str13, "<!#declaration>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!#declaration>", "<!<!>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        node4.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node4.siblingNodes();
        org.jsoup.nodes.Node node8 = node4.clone();
        org.jsoup.nodes.Node node9 = node4.parent();
        org.jsoup.nodes.Node node10 = node4.clone();
        // The following exception was thrown during execution in test generation
        try {
            node4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!#declaration>", "<!<?>>", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.previousSibling();
        java.lang.String str8 = xmlDeclaration3.baseUri();
        java.lang.Class<?> wildcardClass9 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!<!#declaration>>" + "'", str4, "<!<!#declaration>>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!#declaration>" + "'", str5, "<!#declaration>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#declaration" + "'", str6, "#declaration");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<!<?>>" + "'", str8, "<!<?>>");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = null;
        boolean boolean7 = xmlDeclaration3.equals(obj6);
        boolean boolean9 = xmlDeclaration3.hasSameValue((java.lang.Object) false);
        xmlDeclaration3.setBaseUri("<?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.after("<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes5 = xmlDeclaration3.attributes();
        boolean boolean7 = xmlDeclaration3.hasAttr("hi!");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (-1), outputSettings10);
        java.lang.String str12 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str18 = xmlDeclaration17.getWholeDeclaration();
        boolean boolean20 = xmlDeclaration17.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration17.childNodes();
        java.lang.String str22 = xmlDeclaration17.nodeName();
        java.lang.String str23 = xmlDeclaration17.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration17.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlDeclaration17.siblingNodes();
        boolean boolean26 = xmlDeclaration3.equals((java.lang.Object) nodeList25);
        java.lang.Class<?> wildcardClass27 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        xmlDeclaration3.setBaseUri("<!>");
        org.jsoup.nodes.Node node15 = xmlDeclaration3.attr("<!<!#declaration>>", "#declaration");
        org.jsoup.nodes.Node node16 = node15.parentNode();
        org.jsoup.select.NodeVisitor nodeVisitor17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.traverse(nodeVisitor17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.nextSibling();
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.parent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node17 = xmlDeclaration16.clone();
        java.lang.String str18 = xmlDeclaration16.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration16.siblingNodes();
        java.lang.String str20 = xmlDeclaration16.outerHtml();
        int int21 = xmlDeclaration16.childNodeSize();
        java.lang.Appendable appendable22 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings24 = null;
        xmlDeclaration16.outerHtmlTail(appendable22, 0, outputSettings24);
        java.lang.String str26 = xmlDeclaration16.toString();
        org.jsoup.nodes.Node node29 = xmlDeclaration16.attr("hi!", "<!#declaration>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<!<?>>" + "'", str18, "<!<?>>");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!<?>>" + "'", str20, "<!<?>>");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<!<?>>" + "'", str26, "<!<?>>");
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", false);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("<!<!#declaration>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str10 = xmlDeclaration9.getWholeDeclaration();
        int int11 = xmlDeclaration9.siblingIndex();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        xmlDeclaration9.outerHtmlTail(appendable12, (int) '4', outputSettings14);
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration9.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node5.after((org.jsoup.nodes.Node) xmlDeclaration9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node6 = xmlDeclaration5.clone();
        org.jsoup.nodes.Node node9 = node6.attr("#declaration", "<?>");
        org.jsoup.nodes.Node node11 = node6.wrap("<!<?>>");
        org.jsoup.nodes.Attributes attributes12 = node6.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = xmlTreeBuilder0.processStartTag("<!<!#declaration>>", attributes12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", false);
        org.jsoup.nodes.Node node5 = xmlDeclaration3.removeAttr("<!<!#declaration>>");
        java.lang.String str7 = xmlDeclaration3.attr("");
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.attr("<?>");
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str13 = xmlDeclaration12.outerHtml();
        boolean boolean14 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration12);
        org.jsoup.nodes.Node node15 = xmlDeclaration12.parent();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = node15.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!#declaration>" + "'", str13, "<!#declaration>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.attr("<?>");
        java.lang.String str8 = xmlDeclaration3.outerHtml();
        java.lang.String str10 = xmlDeclaration3.attr("<!<?>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str15 = xmlDeclaration14.getWholeDeclaration();
        boolean boolean17 = xmlDeclaration14.hasAttr("hi!");
        java.lang.String str18 = xmlDeclaration14.nodeName();
        org.jsoup.nodes.Node node21 = xmlDeclaration14.attr("hi!", "hi!");
        int int22 = xmlDeclaration14.siblingIndex();
        xmlDeclaration14.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str29 = xmlDeclaration28.getWholeDeclaration();
        boolean boolean31 = xmlDeclaration28.hasAttr("hi!");
        java.lang.String str32 = xmlDeclaration28.nodeName();
        org.jsoup.nodes.Node node35 = xmlDeclaration28.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = node35.siblingNodes();
        boolean boolean37 = xmlDeclaration14.hasSameValue((java.lang.Object) node35);
        boolean boolean38 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration14);
        org.jsoup.nodes.Document document39 = xmlDeclaration14.ownerDocument();
        java.lang.String str40 = xmlDeclaration14.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration44 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str45 = xmlDeclaration44.getWholeDeclaration();
        org.jsoup.nodes.Node node46 = xmlDeclaration44.nextSibling();
        org.jsoup.nodes.Node node47 = xmlDeclaration44.previousSibling();
        java.lang.String str48 = xmlDeclaration44.name();
        int int49 = xmlDeclaration44.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node50 = xmlDeclaration14.after((org.jsoup.nodes.Node) xmlDeclaration44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#declaration" + "'", str18, "#declaration");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#declaration" + "'", str32, "#declaration");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(document39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.lang.String str12 = xmlDeclaration3.name();
        java.lang.Class<?> wildcardClass13 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.lang.String str11 = xmlDeclaration3.baseUri();
        java.lang.String str12 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        int int11 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.parentNode();
        java.lang.String str14 = xmlDeclaration3.absUrl("<!<?>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean20 = xmlDeclaration18.equals((java.lang.Object) (byte) 0);
        java.lang.String str22 = xmlDeclaration18.attr("hi!");
        org.jsoup.nodes.Node node23 = xmlDeclaration18.clone();
        org.jsoup.nodes.Document document24 = xmlDeclaration18.ownerDocument();
        java.lang.String str25 = xmlDeclaration18.getWholeDeclaration();
        java.lang.String str26 = xmlDeclaration18.name();
        java.lang.String str27 = xmlDeclaration18.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean7 = xmlDeclaration5.equals((java.lang.Object) (byte) 0);
        java.lang.String str9 = xmlDeclaration5.attr("hi!");
        int int10 = xmlDeclaration5.childNodeSize();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        xmlDeclaration5.outerHtmlTail(appendable11, 1, outputSettings13);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str19 = xmlDeclaration18.getWholeDeclaration();
        boolean boolean21 = xmlDeclaration18.hasAttr("hi!");
        java.lang.String str22 = xmlDeclaration18.nodeName();
        java.lang.String str23 = xmlDeclaration18.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration18.siblingNodes();
        boolean boolean25 = xmlDeclaration5.hasSameValue((java.lang.Object) xmlDeclaration18);
        java.lang.String str26 = xmlDeclaration5.nodeName();
        java.lang.String str27 = xmlDeclaration5.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration5.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlDeclaration5.siblingNodes();
        org.jsoup.nodes.Attributes attributes30 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = xmlTreeBuilder0.processStartTag("<!>", attributes30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<?>" + "'", str23, "<?>");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#declaration" + "'", str26, "#declaration");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(attributes30);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.lang.String str9 = xmlDeclaration3.outerHtml();
        java.lang.String str10 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.wrap("<!<?>>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = node12.hasAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<?>" + "'", str10, "<?>");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "", "<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
        xmlDeclaration3.setBaseUri("<!<!#declaration>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = xmlDeclaration3.after("<!<!#declaration>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<?>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = node5.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        org.jsoup.nodes.Node node8 = xmlDeclaration3.clone();
        org.jsoup.nodes.Document document9 = xmlDeclaration3.ownerDocument();
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str11 = xmlDeclaration3.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.after("<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str11 = xmlDeclaration3.attr("");
        java.lang.String str12 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.wrap("<?>");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.clone();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable17, (int) (byte) 1, outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!#declaration>", "<!<?>>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("<!<!#declaration>>");
        org.jsoup.nodes.Node node8 = xmlDeclaration3.attr("<?>", "<!#declaration>");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.attr("<!#declaration>", "#declaration");
        org.jsoup.nodes.Document document12 = xmlDeclaration3.ownerDocument();
        java.lang.String str13 = xmlDeclaration3.nodeName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        java.lang.String str4 = xmlDeclaration3.toString();
        int int5 = xmlDeclaration3.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!<?>>" + "'", str4, "<!<?>>");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        int int11 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.parentNode();
        java.lang.String str14 = xmlDeclaration3.absUrl("<!<?>>");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable15, (int) (short) -1, outputSettings17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        boolean boolean12 = xmlDeclaration3.hasAttr("<?>");
        boolean boolean14 = xmlDeclaration3.hasSameValue((java.lang.Object) (short) 0);
        java.lang.String str15 = xmlDeclaration3.baseUri();
        boolean boolean17 = xmlDeclaration3.hasAttr("<!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, (int) (short) 10, outputSettings12);
        org.jsoup.nodes.Attributes attributes14 = xmlDeclaration3.attributes();
        java.lang.Class<?> wildcardClass15 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        java.lang.String str11 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.clone();
        java.lang.String str13 = xmlDeclaration3.toString();
        boolean boolean15 = xmlDeclaration3.hasAttr("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration3.attr("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<?>" + "'", str11, "<?>");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<?>" + "'", str13, "<?>");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.parent();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.removeAttr("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", false);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.previousSibling();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!#declaration>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        java.lang.String str12 = xmlDeclaration3.name();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("<!#declaration>", "<!<?>>", true);
        java.lang.String str18 = xmlDeclaration16.absUrl("<!<!#declaration>>");
        org.jsoup.nodes.Node node21 = xmlDeclaration16.attr("<?>", "<!#declaration>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = xmlDeclaration3.before(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.absUrl("<?>");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = node5.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        int int12 = xmlDeclaration3.siblingIndex();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.clone();
        java.lang.String str15 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.Node node18 = xmlDeclaration3.attr("hi!", "");
        org.jsoup.select.NodeVisitor nodeVisitor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = xmlDeclaration3.traverse(nodeVisitor19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.nextSibling();
        java.lang.String str11 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str16 = xmlDeclaration15.getWholeDeclaration();
        boolean boolean18 = xmlDeclaration15.hasAttr("hi!");
        org.jsoup.nodes.Node node19 = xmlDeclaration15.clone();
        boolean boolean20 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration15);
        java.lang.String str21 = xmlDeclaration15.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = xmlDeclaration15.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<?>" + "'", str11, "<?>");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str11 = xmlDeclaration3.attr("<?>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str16 = xmlDeclaration15.getWholeDeclaration();
        java.lang.String str17 = xmlDeclaration15.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration15.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str13 = xmlDeclaration12.getWholeDeclaration();
        boolean boolean15 = xmlDeclaration12.hasAttr("hi!");
        java.lang.String str16 = xmlDeclaration12.nodeName();
        org.jsoup.nodes.Node node19 = xmlDeclaration12.attr("hi!", "hi!");
        int int20 = xmlDeclaration12.siblingIndex();
        xmlDeclaration12.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str27 = xmlDeclaration26.getWholeDeclaration();
        boolean boolean29 = xmlDeclaration26.hasAttr("hi!");
        java.lang.String str30 = xmlDeclaration26.nodeName();
        org.jsoup.nodes.Node node33 = xmlDeclaration26.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList34 = node33.siblingNodes();
        boolean boolean35 = xmlDeclaration12.hasSameValue((java.lang.Object) node33);
        boolean boolean36 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration12);
        java.lang.String str38 = xmlDeclaration3.absUrl("<?>");
        java.lang.String str39 = xmlDeclaration3.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#declaration" + "'", str30, "#declaration");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<?>" + "'", str39, "<?>");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.lang.String str11 = xmlDeclaration3.baseUri();
        java.lang.String str12 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.after("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.nextSibling();
        java.lang.String str11 = xmlDeclaration3.toString();
        int int12 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = node13.absUrl("<!<!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<?>" + "'", str11, "<?>");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        int int11 = xmlDeclaration3.siblingIndex();
        java.lang.String str12 = xmlDeclaration3.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        org.jsoup.nodes.Node node11 = node10.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str17 = xmlDeclaration15.absUrl("hi!");
        xmlDeclaration15.setBaseUri("#declaration");
        java.lang.String str21 = xmlDeclaration15.attr("hi!");
        org.jsoup.nodes.Node node22 = xmlDeclaration15.clone();
        java.lang.String str23 = node22.outerHtml();
        boolean boolean24 = node10.equals((java.lang.Object) node22);
        org.jsoup.nodes.Document document25 = node22.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = document25.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<!#declaration>" + "'", str23, "<!#declaration>");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(document25);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.attr("<?>");
        java.lang.String str8 = xmlDeclaration3.outerHtml();
        java.lang.String str10 = xmlDeclaration3.attr("<!<?>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str15 = xmlDeclaration14.getWholeDeclaration();
        boolean boolean17 = xmlDeclaration14.hasAttr("hi!");
        java.lang.String str18 = xmlDeclaration14.nodeName();
        org.jsoup.nodes.Node node21 = xmlDeclaration14.attr("hi!", "hi!");
        int int22 = xmlDeclaration14.siblingIndex();
        xmlDeclaration14.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str29 = xmlDeclaration28.getWholeDeclaration();
        boolean boolean31 = xmlDeclaration28.hasAttr("hi!");
        java.lang.String str32 = xmlDeclaration28.nodeName();
        org.jsoup.nodes.Node node35 = xmlDeclaration28.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = node35.siblingNodes();
        boolean boolean37 = xmlDeclaration14.hasSameValue((java.lang.Object) node35);
        boolean boolean38 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration14);
        org.jsoup.nodes.Document document39 = xmlDeclaration14.ownerDocument();
        org.jsoup.nodes.Node node40 = xmlDeclaration14.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration44 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str45 = xmlDeclaration44.getWholeDeclaration();
        boolean boolean47 = xmlDeclaration44.hasAttr("hi!");
        java.lang.String str48 = xmlDeclaration44.nodeName();
        org.jsoup.nodes.Node node51 = xmlDeclaration44.attr("hi!", "hi!");
        int int52 = xmlDeclaration44.siblingIndex();
        xmlDeclaration44.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration58 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str59 = xmlDeclaration58.getWholeDeclaration();
        boolean boolean61 = xmlDeclaration58.hasAttr("hi!");
        java.lang.String str62 = xmlDeclaration58.nodeName();
        org.jsoup.nodes.Node node65 = xmlDeclaration58.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList66 = node65.siblingNodes();
        boolean boolean67 = xmlDeclaration44.hasSameValue((java.lang.Object) node65);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration71 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str72 = xmlDeclaration71.getWholeDeclaration();
        boolean boolean74 = xmlDeclaration71.hasAttr("hi!");
        java.lang.String str75 = xmlDeclaration71.nodeName();
        java.lang.String str76 = xmlDeclaration71.toString();
        boolean boolean78 = xmlDeclaration71.hasAttr("<?>");
        java.lang.String str79 = xmlDeclaration71.baseUri();
        int int80 = xmlDeclaration71.siblingIndex();
        java.lang.String str81 = xmlDeclaration71.getWholeDeclaration();
        boolean boolean82 = node65.equals((java.lang.Object) str81);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node83 = node40.before(node65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#declaration" + "'", str18, "#declaration");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#declaration" + "'", str32, "#declaration");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(document39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "#declaration" + "'", str48, "#declaration");
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "#declaration" + "'", str62, "#declaration");
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(nodeList66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "#declaration" + "'", str75, "#declaration");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "<?>" + "'", str76, "<?>");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.String str9 = xmlDeclaration3.toString();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, (int) (short) 0, outputSettings12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        org.jsoup.nodes.Node node29 = xmlDeclaration3.wrap("<?>");
        java.lang.String str30 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node32 = xmlDeclaration3.removeAttr("<!<!#declaration>>");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = xmlDeclaration3.childNodesCopy();
        java.lang.String str34 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node36 = xmlDeclaration3.removeAttr("<?>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration40 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str41 = xmlDeclaration40.getWholeDeclaration();
        boolean boolean43 = xmlDeclaration40.hasAttr("hi!");
        java.lang.String str44 = xmlDeclaration40.nodeName();
        org.jsoup.nodes.Node node46 = xmlDeclaration40.removeAttr("hi!");
        java.lang.String str47 = xmlDeclaration40.toString();
        boolean boolean48 = xmlDeclaration3.hasSameValue((java.lang.Object) str47);
        org.jsoup.nodes.Node node49 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable50 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings52 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable50, 100, outputSettings52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#declaration" + "'", str27, "#declaration");
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<?>" + "'", str30, "<?>");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#declaration" + "'", str34, "#declaration");
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "#declaration" + "'", str44, "#declaration");
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<?>" + "'", str47, "<?>");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(node49);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str10 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str15 = xmlDeclaration14.getWholeDeclaration();
        boolean boolean17 = xmlDeclaration14.hasAttr("hi!");
        org.jsoup.nodes.Node node18 = xmlDeclaration14.clone();
        boolean boolean19 = xmlDeclaration3.equals((java.lang.Object) node18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = xmlDeclaration3.attr("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        int int12 = xmlDeclaration3.siblingIndex();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node15 = node14.parent();
        org.jsoup.nodes.Document document16 = node14.ownerDocument();
        org.jsoup.nodes.Node node18 = node14.removeAttr("<!#declaration>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node14.after("<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.attr("<?>");
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str13 = xmlDeclaration12.outerHtml();
        boolean boolean14 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration12);
        java.lang.String str15 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str20 = xmlDeclaration19.getWholeDeclaration();
        boolean boolean22 = xmlDeclaration19.hasAttr("hi!");
        java.lang.String str23 = xmlDeclaration19.nodeName();
        org.jsoup.nodes.Node node26 = xmlDeclaration19.attr("hi!", "hi!");
        int int27 = xmlDeclaration19.siblingIndex();
        xmlDeclaration19.setBaseUri("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!#declaration>" + "'", str13, "<!#declaration>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#declaration" + "'", str23, "#declaration");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        int int11 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("hi!");
        int int14 = xmlDeclaration3.siblingIndex();
        java.lang.String str16 = xmlDeclaration3.attr("<!<!#declaration>>");
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable17, (int) (byte) -1, outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        xmlDeclaration3.outerHtmlTail(appendable6, (int) '4', outputSettings8);
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str15 = xmlDeclaration14.getWholeDeclaration();
        boolean boolean17 = xmlDeclaration14.hasAttr("hi!");
        java.lang.String str18 = xmlDeclaration14.nodeName();
        org.jsoup.nodes.Node node19 = xmlDeclaration14.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration14.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration14.childNodes();
        boolean boolean23 = xmlDeclaration14.hasAttr("<?>");
        boolean boolean25 = xmlDeclaration14.hasSameValue((java.lang.Object) (short) 0);
        int int26 = xmlDeclaration14.siblingIndex();
        boolean boolean27 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration14);
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration3.childNodes();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#declaration" + "'", str18, "#declaration");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(nodeList28);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("<!<?>>");
        org.jsoup.nodes.Node node8 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = node8.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        int int11 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.previousSibling();
        java.lang.String str13 = xmlDeclaration3.name();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        xmlDeclaration3.outerHtmlTail(appendable14, (int) (byte) 0, outputSettings16);
        boolean boolean19 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str24 = xmlDeclaration23.getWholeDeclaration();
        boolean boolean26 = xmlDeclaration23.hasAttr("hi!");
        java.lang.String str27 = xmlDeclaration23.nodeName();
        org.jsoup.nodes.Node node28 = xmlDeclaration23.nextSibling();
        java.lang.String str29 = xmlDeclaration23.getWholeDeclaration();
        java.lang.Appendable appendable30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        xmlDeclaration23.outerHtmlTail(appendable30, (int) (byte) 10, outputSettings32);
        org.jsoup.nodes.Node node34 = xmlDeclaration23.previousSibling();
        boolean boolean35 = xmlDeclaration3.equals((java.lang.Object) node34);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = node34.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#declaration" + "'", str27, "#declaration");
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 1, outputSettings11);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str17 = xmlDeclaration16.getWholeDeclaration();
        boolean boolean19 = xmlDeclaration16.hasAttr("hi!");
        java.lang.String str20 = xmlDeclaration16.nodeName();
        java.lang.String str21 = xmlDeclaration16.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration16.siblingNodes();
        boolean boolean23 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration16);
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlDeclaration3.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = xmlDeclaration3.after("<!<!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<?>" + "'", str21, "<?>");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str11 = xmlDeclaration3.attr("<?>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str16 = xmlDeclaration15.getWholeDeclaration();
        boolean boolean18 = xmlDeclaration15.hasAttr("hi!");
        java.lang.String str19 = xmlDeclaration15.nodeName();
        org.jsoup.nodes.Node node20 = xmlDeclaration15.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration15.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration15.childNodes();
        boolean boolean23 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration15);
        java.lang.String str24 = xmlDeclaration15.nodeName();
        java.lang.Appendable appendable25 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings27 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration15.outerHtmlHead(appendable25, (int) '4', outputSettings27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#declaration" + "'", str19, "#declaration");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#declaration" + "'", str24, "#declaration");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, (int) (byte) 10, outputSettings12);
        org.jsoup.nodes.Node node14 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str19 = xmlDeclaration18.getWholeDeclaration();
        boolean boolean21 = xmlDeclaration18.hasAttr("hi!");
        java.lang.String str22 = xmlDeclaration18.nodeName();
        org.jsoup.nodes.Document document23 = xmlDeclaration18.ownerDocument();
        java.lang.String str24 = xmlDeclaration18.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = node14.equals((java.lang.Object) str24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertNull(document23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node4.attr("#declaration", "<?>");
        org.jsoup.nodes.Node node8 = node7.parent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str13 = xmlDeclaration12.getWholeDeclaration();
        boolean boolean15 = xmlDeclaration12.hasAttr("hi!");
        java.lang.String str16 = xmlDeclaration12.nodeName();
        org.jsoup.nodes.Node node19 = xmlDeclaration12.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = node19.siblingNodes();
        boolean boolean21 = node7.equals((java.lang.Object) node19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node7.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str8 = xmlDeclaration7.getWholeDeclaration();
        boolean boolean10 = xmlDeclaration7.hasAttr("hi!");
        java.lang.String str11 = xmlDeclaration7.nodeName();
        org.jsoup.nodes.Node node12 = xmlDeclaration7.nextSibling();
        java.lang.String str13 = xmlDeclaration7.toString();
        org.jsoup.nodes.Node node14 = xmlDeclaration7.nextSibling();
        java.lang.String str15 = xmlDeclaration7.toString();
        org.jsoup.nodes.Node node18 = xmlDeclaration7.attr("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<?>" + "'", str13, "<?>");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<?>" + "'", str15, "<?>");
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.previousSibling();
        java.lang.String str7 = xmlDeclaration3.name();
        int int8 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Document document9 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = document9.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes5 = xmlDeclaration3.attributes();
        boolean boolean7 = xmlDeclaration3.hasAttr("hi!");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (-1), outputSettings10);
        java.lang.String str12 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node17 = xmlDeclaration16.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration16.childNodes();
        boolean boolean19 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration16);
        xmlDeclaration3.setBaseUri("<!<?>>");
        org.jsoup.select.NodeVisitor nodeVisitor22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = xmlDeclaration3.traverse(nodeVisitor22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
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
        org.jsoup.nodes.Node node19 = xmlDeclaration11.removeAttr("<!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node19.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!<?>>" + "'", str7, "<!<?>>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<?>" + "'", str16, "<?>");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        int int12 = xmlDeclaration3.siblingIndex();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node15 = node14.parent();
        org.jsoup.nodes.Document document16 = node14.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            document16.setBaseUri("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.absUrl("<?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!>", true);
        org.jsoup.select.NodeVisitor nodeVisitor4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = xmlDeclaration3.traverse(nodeVisitor4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        java.lang.Class<?> wildcardClass11 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        xmlDeclaration3.setBaseUri("");
        java.lang.String str14 = xmlDeclaration3.attr("<!#declaration>");
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        xmlDeclaration3.outerHtmlTail(appendable15, 1, outputSettings17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = xmlDeclaration3.before("<!<!#declaration>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.previousSibling();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        xmlDeclaration3.outerHtmlTail(appendable12, (int) (byte) -1, outputSettings14);
        org.jsoup.nodes.Node node16 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.before("<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<?hi!>", "<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!#declaration>", "<!<?>>", true);
        java.lang.String str5 = xmlDeclaration3.attr("<?>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str10 = xmlDeclaration9.getWholeDeclaration();
        int int11 = xmlDeclaration9.siblingIndex();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        xmlDeclaration9.outerHtmlTail(appendable12, (int) '4', outputSettings14);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str20 = xmlDeclaration19.getWholeDeclaration();
        boolean boolean22 = xmlDeclaration19.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration19.childNodes();
        java.lang.String str24 = xmlDeclaration19.nodeName();
        org.jsoup.nodes.Node node25 = xmlDeclaration19.nextSibling();
        boolean boolean26 = xmlDeclaration9.equals((java.lang.Object) xmlDeclaration19);
        boolean boolean27 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration9);
        java.lang.String str29 = xmlDeclaration3.attr("");
        java.lang.Appendable appendable30 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings32 = null;
        xmlDeclaration3.outerHtmlTail(appendable30, (int) (short) 1, outputSettings32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#declaration" + "'", str24, "#declaration");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        boolean boolean13 = xmlDeclaration3.hasAttr("<!<?>>");
        java.lang.String str14 = xmlDeclaration3.name();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Document document18 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList19 = document18.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(document18);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "", "<!<!#declaration>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = xmlDeclaration3.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<?>" + "'", str5, "<?>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!<?>>" + "'", str6, "<!<?>>");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "hi!", "<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        org.jsoup.nodes.Node node29 = xmlDeclaration3.wrap("<?>");
        java.lang.String str30 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node31 = xmlDeclaration3.parentNode();
        java.lang.String str32 = xmlDeclaration3.nodeName();
        java.lang.String str33 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node34 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = node34.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#declaration" + "'", str27, "#declaration");
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<?>" + "'", str30, "<?>");
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#declaration" + "'", str32, "#declaration");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<?>" + "'", str33, "<?>");
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        boolean boolean13 = xmlDeclaration3.hasAttr("<!<?>>");
        java.lang.String str14 = xmlDeclaration3.name();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str22 = xmlDeclaration21.getWholeDeclaration();
        boolean boolean24 = xmlDeclaration21.hasAttr("hi!");
        java.lang.String str25 = xmlDeclaration21.nodeName();
        org.jsoup.nodes.Node node26 = xmlDeclaration21.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration21.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration21.childNodes();
        java.lang.Appendable appendable29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        xmlDeclaration21.outerHtmlTail(appendable29, (int) (byte) 0, outputSettings31);
        boolean boolean33 = xmlDeclaration3.equals((java.lang.Object) outputSettings31);
        java.lang.Appendable appendable34 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings36 = null;
        xmlDeclaration3.outerHtmlTail(appendable34, (int) (byte) 100, outputSettings36);
        java.lang.String str38 = xmlDeclaration3.outerHtml();
        java.lang.String str39 = xmlDeclaration3.name();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#declaration" + "'", str25, "#declaration");
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<?>" + "'", str38, "<?>");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.nextSibling();
        java.lang.String str12 = xmlDeclaration3.toString();
        int int13 = xmlDeclaration3.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!#declaration>" + "'", str12, "<!#declaration>");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 1, outputSettings11);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str17 = xmlDeclaration16.getWholeDeclaration();
        boolean boolean19 = xmlDeclaration16.hasAttr("hi!");
        java.lang.String str20 = xmlDeclaration16.nodeName();
        java.lang.String str21 = xmlDeclaration16.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration16.siblingNodes();
        boolean boolean23 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration16);
        xmlDeclaration3.setBaseUri("<!>");
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        xmlDeclaration3.outerHtmlTail(appendable26, 10, outputSettings28);
        org.jsoup.nodes.Node node30 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = node30.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<?>" + "'", str21, "<?>");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (-1), outputSettings11);
        org.jsoup.nodes.Document document13 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = node14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 1, outputSettings11);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str17 = xmlDeclaration16.getWholeDeclaration();
        boolean boolean19 = xmlDeclaration16.hasAttr("hi!");
        java.lang.String str20 = xmlDeclaration16.nodeName();
        java.lang.String str21 = xmlDeclaration16.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration16.siblingNodes();
        boolean boolean23 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration16);
        java.lang.String str24 = xmlDeclaration3.nodeName();
        java.lang.String str25 = xmlDeclaration3.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration3.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Attributes attributes28 = xmlDeclaration3.attributes();
        int int29 = xmlDeclaration3.siblingIndex();
        java.lang.String str30 = xmlDeclaration3.outerHtml();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<?>" + "'", str21, "<?>");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#declaration" + "'", str24, "#declaration");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<?>" + "'", str30, "<?>");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.attr("<?>");
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str13 = xmlDeclaration12.outerHtml();
        boolean boolean14 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration12);
        org.jsoup.nodes.Document document15 = xmlDeclaration3.ownerDocument();
        java.lang.String str17 = xmlDeclaration3.attr("#declaration");
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable18, 100, outputSettings20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!#declaration>" + "'", str13, "<!#declaration>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        int int4 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration8.childNodesCopy();
        boolean boolean10 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration8);
        java.lang.String str11 = xmlDeclaration8.toString();
        org.jsoup.nodes.Node node12 = xmlDeclaration8.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!#declaration>" + "'", str11, "<!#declaration>");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.lang.String str12 = xmlDeclaration3.name();
        java.lang.String str13 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        int int18 = xmlDeclaration17.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration22 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration22.childNodesCopy();
        boolean boolean24 = xmlDeclaration17.equals((java.lang.Object) xmlDeclaration22);
        java.lang.String str25 = xmlDeclaration22.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration22.siblingNodes();
        boolean boolean27 = xmlDeclaration3.equals((java.lang.Object) nodeList26);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<!#declaration>" + "'", str25, "<!#declaration>");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!>", "", true);
        org.jsoup.nodes.Attributes attributes4 = xmlDeclaration3.attributes();
        int int5 = xmlDeclaration3.siblingIndex();
        boolean boolean7 = xmlDeclaration3.hasAttr("<?>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node12 = xmlDeclaration11.clone();
        java.lang.String str13 = xmlDeclaration11.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlDeclaration11.siblingNodes();
        java.lang.String str15 = xmlDeclaration11.outerHtml();
        org.jsoup.nodes.Node node17 = xmlDeclaration11.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!<?>>" + "'", str13, "<!<?>>");
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<!<?>>" + "'", str15, "<!<?>>");
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = node12.attr("<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.String str9 = xmlDeclaration3.toString();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, (int) (short) 0, outputSettings12);
        java.lang.String str14 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = xmlDeclaration3.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.siblingNodes();
        java.lang.String str7 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Attributes attributes8 = xmlDeclaration3.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!<?>>" + "'", str7, "<!<?>>");
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        int int11 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.previousSibling();
        java.lang.String str13 = xmlDeclaration3.name();
        java.lang.String str14 = xmlDeclaration3.nodeName();
        boolean boolean16 = xmlDeclaration3.hasAttr("<!>");
        org.jsoup.nodes.Node node18 = xmlDeclaration3.removeAttr("<?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = xmlDeclaration3.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#declaration" + "'", str14, "#declaration");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!>", "hi!", false);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes5 = xmlDeclaration3.attributes();
        boolean boolean7 = xmlDeclaration3.hasAttr("hi!");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (-1), outputSettings10);
        java.lang.String str12 = xmlDeclaration3.nodeName();
        int int13 = xmlDeclaration3.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<!#declaration>>", "<!#declaration>", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = xmlDeclaration3.attr("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration3.attributes();
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.attr("", "<!<!#declaration>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        int int11 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("hi!");
        org.jsoup.nodes.Node node14 = xmlDeclaration3.nextSibling();
        java.lang.String str15 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = node16.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<?>" + "'", str15, "<?>");
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
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
        org.jsoup.nodes.Node node29 = xmlDeclaration3.wrap("<?>");
        java.lang.String str30 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node31 = xmlDeclaration3.parentNode();
        java.lang.String str32 = xmlDeclaration3.nodeName();
        java.lang.String str33 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration37 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str38 = xmlDeclaration37.getWholeDeclaration();
        boolean boolean40 = xmlDeclaration37.hasAttr("hi!");
        java.lang.String str41 = xmlDeclaration37.nodeName();
        org.jsoup.nodes.Node node42 = xmlDeclaration37.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = xmlDeclaration37.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList44 = xmlDeclaration37.childNodes();
        java.lang.String str45 = xmlDeclaration37.name();
        xmlDeclaration37.setBaseUri("<!<!#declaration>>");
        org.jsoup.nodes.Node node49 = xmlDeclaration37.removeAttr("<!<?>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node50 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#declaration" + "'", str27, "#declaration");
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<?>" + "'", str30, "<?>");
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#declaration" + "'", str32, "#declaration");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<?>" + "'", str33, "<?>");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "#declaration" + "'", str41, "#declaration");
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(nodeList44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(node49);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str6 = xmlDeclaration5.getWholeDeclaration();
        int int7 = xmlDeclaration5.siblingIndex();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration5.outerHtmlTail(appendable8, (int) '4', outputSettings10);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str16 = xmlDeclaration15.getWholeDeclaration();
        boolean boolean18 = xmlDeclaration15.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration15.childNodes();
        java.lang.String str20 = xmlDeclaration15.nodeName();
        org.jsoup.nodes.Node node21 = xmlDeclaration15.nextSibling();
        boolean boolean22 = xmlDeclaration5.equals((java.lang.Object) xmlDeclaration15);
        org.jsoup.nodes.Node node25 = xmlDeclaration15.attr("<!<?>>", "<!#declaration>");
        org.jsoup.nodes.Attributes attributes26 = xmlDeclaration15.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = xmlTreeBuilder0.processStartTag("#declaration", attributes26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(attributes26);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 1, outputSettings11);
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = node14.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.siblingNodes();
        org.jsoup.nodes.Node node12 = node10.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node10.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<?>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parentNode();
        java.lang.String str5 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.wrap("<!<?>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.before("<?hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 1, outputSettings11);
        int int13 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean19 = xmlDeclaration17.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj20 = null;
        boolean boolean21 = xmlDeclaration17.equals(obj20);
        java.lang.String str23 = xmlDeclaration17.attr("<!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<!<?>>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = node4.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node6 = xmlDeclaration5.clone();
        java.lang.String str7 = xmlDeclaration5.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes8 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = xmlTreeBuilder0.processStartTag("", attributes8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<?>" + "'", str7, "<?>");
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str16 = xmlDeclaration14.absUrl("hi!");
        xmlDeclaration14.setBaseUri("#declaration");
        java.lang.String str20 = xmlDeclaration14.absUrl("hi!");
        java.lang.String str22 = xmlDeclaration14.attr("");
        java.lang.String str23 = xmlDeclaration14.getWholeDeclaration();
        org.jsoup.nodes.Node node25 = xmlDeclaration14.wrap("<?>");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration14.childNodesCopy();
        org.jsoup.nodes.Node node27 = xmlDeclaration14.clone();
        boolean boolean28 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = xmlDeclaration14.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#declaration" + "'", str23, "#declaration");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.previousSibling();
        java.lang.String str7 = xmlDeclaration3.name();
        xmlDeclaration3.setBaseUri("<!>");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("<!<!#declaration>>");
        org.jsoup.nodes.Node node12 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.before("<!<!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<?hi!>", "hi!", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (-1), outputSettings11);
        org.jsoup.nodes.Document document13 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = document13.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.nodes.Document document6 = xmlDeclaration3.ownerDocument();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = node8.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!<?>>" + "'", str7, "<!<?>>");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!<?>>", "<?hi!>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        boolean boolean12 = xmlDeclaration3.hasAttr("<?>");
        boolean boolean14 = xmlDeclaration3.hasSameValue((java.lang.Object) (short) 0);
        java.lang.String str15 = xmlDeclaration3.baseUri();
        boolean boolean17 = xmlDeclaration3.hasAttr("<!>");
        org.jsoup.nodes.Node node18 = xmlDeclaration3.parentNode();
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable19, (int) (short) 1, outputSettings21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<?>>", "", true);
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
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
        org.jsoup.nodes.Node node29 = xmlDeclaration3.wrap("<?>");
        java.lang.String str30 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node31 = xmlDeclaration3.parentNode();
        java.lang.String str32 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node33 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#declaration" + "'", str27, "#declaration");
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<?>" + "'", str30, "<?>");
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<?>" + "'", str32, "<?>");
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = xmlDeclaration3.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#declaration" + "'", str27, "#declaration");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        int int4 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration8.childNodesCopy();
        boolean boolean10 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration8);
        java.lang.String str11 = xmlDeclaration8.toString();
        org.jsoup.nodes.Node node12 = xmlDeclaration8.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = node12.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!#declaration>" + "'", str11, "<!#declaration>");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        java.lang.String str4 = xmlDeclaration3.baseUri();
        java.lang.String str5 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.parentNode();
        java.lang.String str7 = xmlDeclaration3.outerHtml();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<?>" + "'", str4, "<?>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!<?>>" + "'", str7, "<!<?>>");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        int int11 = xmlDeclaration3.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes5 = xmlDeclaration3.attributes();
        boolean boolean7 = xmlDeclaration3.hasAttr("hi!");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (-1), outputSettings10);
        java.lang.String str12 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node17 = xmlDeclaration16.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration16.childNodes();
        boolean boolean19 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration16);
        java.lang.String str20 = xmlDeclaration16.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = xmlDeclaration16.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        boolean boolean13 = xmlDeclaration3.hasAttr("<!<?>>");
        java.lang.String str14 = xmlDeclaration3.name();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str21 = xmlDeclaration20.getWholeDeclaration();
        boolean boolean23 = xmlDeclaration20.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration20.childNodes();
        java.lang.String str25 = xmlDeclaration20.nodeName();
        java.lang.String str26 = xmlDeclaration20.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration30 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean32 = xmlDeclaration30.equals((java.lang.Object) (byte) 0);
        java.lang.String str34 = xmlDeclaration30.attr("hi!");
        org.jsoup.nodes.Node node35 = xmlDeclaration30.clone();
        boolean boolean36 = xmlDeclaration20.hasSameValue((java.lang.Object) node35);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node37 = xmlDeclaration3.before(node35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#declaration" + "'", str25, "#declaration");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "<?>" + "'", str26, "<?>");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.previousSibling();
        int int12 = xmlDeclaration3.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.before("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList9 = node8.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str8 = xmlDeclaration3.name();
        java.lang.String str9 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodes();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#declaration" + "'", str9, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str13 = xmlDeclaration12.getWholeDeclaration();
        boolean boolean15 = xmlDeclaration12.hasAttr("hi!");
        java.lang.String str16 = xmlDeclaration12.nodeName();
        org.jsoup.nodes.Node node19 = xmlDeclaration12.attr("hi!", "hi!");
        int int20 = xmlDeclaration12.siblingIndex();
        xmlDeclaration12.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str27 = xmlDeclaration26.getWholeDeclaration();
        boolean boolean29 = xmlDeclaration26.hasAttr("hi!");
        java.lang.String str30 = xmlDeclaration26.nodeName();
        org.jsoup.nodes.Node node33 = xmlDeclaration26.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList34 = node33.siblingNodes();
        boolean boolean35 = xmlDeclaration12.hasSameValue((java.lang.Object) node33);
        boolean boolean36 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration12);
        java.lang.String str38 = xmlDeclaration12.attr("<!<!#declaration>>");
        java.lang.String str39 = xmlDeclaration12.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlDeclaration12.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration44 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str45 = xmlDeclaration44.getWholeDeclaration();
        boolean boolean47 = xmlDeclaration44.hasAttr("hi!");
        java.lang.String str48 = xmlDeclaration44.nodeName();
        java.lang.String str49 = xmlDeclaration44.toString();
        boolean boolean51 = xmlDeclaration44.hasAttr("<?>");
        java.lang.String str52 = xmlDeclaration44.baseUri();
        int int53 = xmlDeclaration44.siblingIndex();
        java.lang.String str54 = xmlDeclaration44.getWholeDeclaration();
        org.jsoup.nodes.Node node55 = xmlDeclaration44.clone();
        java.lang.String str56 = xmlDeclaration44.baseUri();
        org.jsoup.nodes.Node node59 = xmlDeclaration44.attr("hi!", "");
        boolean boolean60 = xmlDeclaration12.equals((java.lang.Object) "");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration64 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node65 = xmlDeclaration64.clone();
        java.lang.String str66 = xmlDeclaration64.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList67 = xmlDeclaration64.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList68 = xmlDeclaration64.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration12.replaceWith((org.jsoup.nodes.Node) xmlDeclaration64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#declaration" + "'", str30, "#declaration");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "#declaration" + "'", str48, "#declaration");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "<?>" + "'", str49, "<?>");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "<!<?>>" + "'", str66, "<!<?>>");
        org.junit.Assert.assertNotNull(nodeList67);
        org.junit.Assert.assertNotNull(nodeList68);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.lang.Class<?> wildcardClass11 = nodeList10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.siblingNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node16 = xmlDeclaration15.clone();
        java.lang.String str17 = xmlDeclaration15.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration15.siblingNodes();
        java.lang.String str19 = xmlDeclaration15.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str24 = xmlDeclaration23.getWholeDeclaration();
        int int25 = xmlDeclaration23.siblingIndex();
        java.lang.String str27 = xmlDeclaration23.attr("<?>");
        java.lang.String str28 = xmlDeclaration23.outerHtml();
        boolean boolean29 = xmlDeclaration15.hasSameValue((java.lang.Object) xmlDeclaration23);
        org.jsoup.nodes.Node node31 = xmlDeclaration15.removeAttr("<?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = node10.after(node31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!<?>>" + "'", str17, "<!<?>>");
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!<?>>" + "'", str19, "<!<?>>");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "<?>" + "'", str28, "<?>");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node6 = xmlDeclaration5.clone();
        java.lang.String str7 = xmlDeclaration5.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration5.siblingNodes();
        java.lang.String str9 = xmlDeclaration5.outerHtml();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = xmlTreeBuilder0.processStartTag("<!<!#declaration>>", attributes10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!<?>>" + "'", str7, "<!<?>>");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!<?>>" + "'", str9, "<!<?>>");
        org.junit.Assert.assertNotNull(attributes10);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str10 = xmlDeclaration9.getWholeDeclaration();
        boolean boolean12 = xmlDeclaration9.hasAttr("hi!");
        java.lang.String str13 = xmlDeclaration9.nodeName();
        org.jsoup.nodes.Node node16 = xmlDeclaration9.attr("hi!", "hi!");
        int int17 = xmlDeclaration9.siblingIndex();
        xmlDeclaration9.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str24 = xmlDeclaration23.getWholeDeclaration();
        boolean boolean26 = xmlDeclaration23.hasAttr("hi!");
        java.lang.String str27 = xmlDeclaration23.nodeName();
        org.jsoup.nodes.Node node30 = xmlDeclaration23.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = node30.siblingNodes();
        boolean boolean32 = xmlDeclaration9.hasSameValue((java.lang.Object) node30);
        java.lang.String str33 = xmlDeclaration9.nodeName();
        boolean boolean34 = xmlDeclaration3.equals((java.lang.Object) str33);
        java.util.List<org.jsoup.nodes.Node> nodeList35 = xmlDeclaration3.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#declaration" + "'", str27, "#declaration");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#declaration" + "'", str33, "#declaration");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(nodeList35);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<?hi!>", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        java.lang.String str11 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.clone();
        int int13 = node12.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node12.before("<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<?>" + "'", str11, "<?>");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!<!>>", "<!<!#declaration>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!<!#declaration>>", "<!<!#declaration>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        int int11 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Attributes attributes12 = xmlDeclaration3.attributes();
        java.lang.String str14 = xmlDeclaration3.absUrl("<!#declaration>");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.attr("<?>");
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = document8.before("<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 1, outputSettings11);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str17 = xmlDeclaration16.getWholeDeclaration();
        boolean boolean19 = xmlDeclaration16.hasAttr("hi!");
        java.lang.String str20 = xmlDeclaration16.nodeName();
        java.lang.String str21 = xmlDeclaration16.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration16.siblingNodes();
        boolean boolean23 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration16);
        org.jsoup.select.NodeVisitor nodeVisitor24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = xmlDeclaration16.traverse(nodeVisitor24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<?>" + "'", str21, "<?>");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.attr("<?>");
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean14 = xmlDeclaration12.equals((java.lang.Object) (byte) 0);
        java.lang.String str16 = xmlDeclaration12.attr("hi!");
        int int17 = xmlDeclaration12.childNodeSize();
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        xmlDeclaration12.outerHtmlTail(appendable18, 1, outputSettings20);
        boolean boolean22 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration12);
        org.jsoup.nodes.Node node23 = xmlDeclaration12.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration27 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str28 = xmlDeclaration27.getWholeDeclaration();
        boolean boolean30 = xmlDeclaration27.hasAttr("hi!");
        java.lang.String str31 = xmlDeclaration27.nodeName();
        org.jsoup.nodes.Node node34 = xmlDeclaration27.attr("hi!", "hi!");
        int int35 = xmlDeclaration27.siblingIndex();
        xmlDeclaration27.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration41 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str42 = xmlDeclaration41.getWholeDeclaration();
        boolean boolean44 = xmlDeclaration41.hasAttr("hi!");
        java.lang.String str45 = xmlDeclaration41.nodeName();
        org.jsoup.nodes.Node node48 = xmlDeclaration41.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList49 = node48.siblingNodes();
        boolean boolean50 = xmlDeclaration27.hasSameValue((java.lang.Object) node48);
        java.lang.String str51 = xmlDeclaration27.nodeName();
        org.jsoup.nodes.Node node53 = xmlDeclaration27.wrap("<?>");
        java.lang.String str54 = xmlDeclaration27.toString();
        org.jsoup.nodes.Node node56 = xmlDeclaration27.removeAttr("<!<!#declaration>>");
        java.util.List<org.jsoup.nodes.Node> nodeList57 = xmlDeclaration27.childNodesCopy();
        boolean boolean58 = node23.hasSameValue((java.lang.Object) xmlDeclaration27);
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration27.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#declaration" + "'", str31, "#declaration");
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "#declaration" + "'", str45, "#declaration");
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "#declaration" + "'", str51, "#declaration");
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "<?>" + "'", str54, "<?>");
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(nodeList57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean7 = xmlDeclaration5.equals((java.lang.Object) (byte) 0);
        java.lang.String str9 = xmlDeclaration5.attr("hi!");
        int int10 = xmlDeclaration5.childNodeSize();
        java.lang.Appendable appendable11 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings13 = null;
        xmlDeclaration5.outerHtmlTail(appendable11, 1, outputSettings13);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str19 = xmlDeclaration18.getWholeDeclaration();
        boolean boolean21 = xmlDeclaration18.hasAttr("hi!");
        java.lang.String str22 = xmlDeclaration18.nodeName();
        java.lang.String str23 = xmlDeclaration18.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration18.siblingNodes();
        boolean boolean25 = xmlDeclaration5.hasSameValue((java.lang.Object) xmlDeclaration18);
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration5.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration5.siblingNodes();
        org.jsoup.nodes.Attributes attributes28 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = xmlTreeBuilder0.processStartTag("<!<?>>", attributes28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<?>" + "'", str23, "<?>");
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(attributes28);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!#declaration>", "<!<?>>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("<!<!#declaration>>");
        int int6 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Document document7 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList8 = document7.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.absUrl("<?>");
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.parent();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
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
        org.jsoup.nodes.Node node21 = xmlDeclaration12.wrap("<?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node21.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#declaration" + "'", str17, "#declaration");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = node8.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.nextSibling();
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration3.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        java.lang.String str11 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.nodeName();
        int int12 = xmlDeclaration3.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.String str10 = xmlDeclaration3.absUrl("<?>");
        int int11 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.attr("<!>", "<!<!#declaration>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str20 = xmlDeclaration19.getWholeDeclaration();
        boolean boolean22 = xmlDeclaration19.hasAttr("hi!");
        java.lang.String str23 = xmlDeclaration19.nodeName();
        org.jsoup.nodes.Node node26 = xmlDeclaration19.attr("hi!", "hi!");
        int int27 = xmlDeclaration19.siblingIndex();
        xmlDeclaration19.setBaseUri("hi!");
        org.jsoup.nodes.Node node30 = xmlDeclaration19.nextSibling();
        java.lang.String str31 = xmlDeclaration19.toString();
        // The following exception was thrown during execution in test generation
        try {
            node15.replaceWith((org.jsoup.nodes.Node) xmlDeclaration19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#declaration" + "'", str23, "#declaration");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "<?>" + "'", str31, "<?>");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.String str9 = xmlDeclaration3.toString();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, (int) (short) 0, outputSettings12);
        java.lang.String str14 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            node15.setBaseUri("<!<!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        int int11 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("hi!");
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        xmlDeclaration3.outerHtmlTail(appendable14, 100, outputSettings16);
        java.lang.String str18 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = xmlDeclaration3.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodes();
        int int12 = xmlDeclaration3.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str13 = xmlDeclaration12.getWholeDeclaration();
        boolean boolean15 = xmlDeclaration12.hasAttr("hi!");
        java.lang.String str16 = xmlDeclaration12.nodeName();
        org.jsoup.nodes.Node node19 = xmlDeclaration12.attr("hi!", "hi!");
        int int20 = xmlDeclaration12.siblingIndex();
        xmlDeclaration12.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration26 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str27 = xmlDeclaration26.getWholeDeclaration();
        boolean boolean29 = xmlDeclaration26.hasAttr("hi!");
        java.lang.String str30 = xmlDeclaration26.nodeName();
        org.jsoup.nodes.Node node33 = xmlDeclaration26.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList34 = node33.siblingNodes();
        boolean boolean35 = xmlDeclaration12.hasSameValue((java.lang.Object) node33);
        boolean boolean36 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration12);
        java.lang.String str38 = xmlDeclaration3.absUrl("<?>");
        java.lang.String str39 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Attributes attributes40 = xmlDeclaration3.attributes();
        java.lang.Appendable appendable41 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable41, (int) (byte) 100, outputSettings43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "#declaration" + "'", str30, "#declaration");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<?>" + "'", str39, "<?>");
        org.junit.Assert.assertNotNull(attributes40);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!#declaration>", "<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        int int8 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean15 = xmlDeclaration13.equals((java.lang.Object) (byte) 0);
        java.lang.String str16 = xmlDeclaration13.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = node9.after((org.jsoup.nodes.Node) xmlDeclaration13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes6 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str13 = xmlDeclaration12.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes14 = xmlDeclaration12.attributes();
        boolean boolean16 = xmlDeclaration12.hasAttr("hi!");
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration12.outerHtmlTail(appendable17, (-1), outputSettings19);
        java.lang.String str21 = xmlDeclaration12.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node26 = xmlDeclaration25.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration25.childNodes();
        boolean boolean28 = xmlDeclaration12.hasSameValue((java.lang.Object) xmlDeclaration25);
        org.jsoup.nodes.Node node30 = xmlDeclaration25.removeAttr("<!<?>>");
        int int31 = node30.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = document8.equals((java.lang.Object) int31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<?>" + "'", str5, "<?>");
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        java.lang.String str11 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.clone();
        java.lang.String str13 = xmlDeclaration3.toString();
        boolean boolean15 = xmlDeclaration3.hasAttr("");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node17 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = node17.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<?>" + "'", str11, "<?>");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<?>" + "'", str13, "<?>");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        xmlDeclaration3.outerHtmlTail(appendable6, (int) '4', outputSettings8);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str14 = xmlDeclaration13.getWholeDeclaration();
        boolean boolean16 = xmlDeclaration13.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration13.childNodes();
        java.lang.String str18 = xmlDeclaration13.nodeName();
        org.jsoup.nodes.Node node19 = xmlDeclaration13.nextSibling();
        boolean boolean20 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration13);
        org.jsoup.nodes.Node node23 = xmlDeclaration13.attr("<!<?>>", "<!#declaration>");
        org.jsoup.nodes.Node node24 = node23.parentNode();
        org.jsoup.nodes.Node node25 = node23.clone();
        org.jsoup.nodes.Node node27 = node25.removeAttr("<?>");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = node27.childNodes();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#declaration" + "'", str18, "#declaration");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(nodeList28);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!#declaration>", "<!<?>>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("<!<!#declaration>>");
        org.jsoup.nodes.Node node8 = xmlDeclaration3.attr("<?>", "<!#declaration>");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.attr("<!#declaration>", "#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node11.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
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
        org.jsoup.nodes.Node node21 = xmlDeclaration12.clone();
        java.lang.String str23 = node21.absUrl("<!<!#declaration>>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#declaration" + "'", str17, "#declaration");
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 1, outputSettings11);
        int int13 = xmlDeclaration3.siblingIndex();
        java.lang.String str14 = xmlDeclaration3.getWholeDeclaration();
        xmlDeclaration3.setBaseUri("<!#declaration>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration3.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<?>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parentNode();
        java.lang.String str5 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.wrap("<!<?>>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = node7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!>" + "'", str5, "<!>");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str11 = xmlDeclaration3.attr("<!<?>>");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str15 = xmlDeclaration3.absUrl("<!#declaration>");
        org.jsoup.nodes.Node node16 = xmlDeclaration3.previousSibling();
        java.lang.String str17 = xmlDeclaration3.name();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#declaration" + "'", str17, "#declaration");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 1, outputSettings11);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str17 = xmlDeclaration16.getWholeDeclaration();
        boolean boolean19 = xmlDeclaration16.hasAttr("hi!");
        java.lang.String str20 = xmlDeclaration16.nodeName();
        java.lang.String str21 = xmlDeclaration16.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration16.siblingNodes();
        boolean boolean23 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration16);
        java.lang.String str24 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node25 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = node25.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<?>" + "'", str21, "<?>");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#declaration" + "'", str24, "#declaration");
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        org.jsoup.nodes.Attributes attributes6 = xmlDeclaration5.attributes();
        org.jsoup.nodes.Node node7 = xmlDeclaration5.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str12 = xmlDeclaration11.getWholeDeclaration();
        boolean boolean14 = xmlDeclaration11.hasAttr("hi!");
        java.lang.String str15 = xmlDeclaration11.nodeName();
        java.lang.String str16 = xmlDeclaration11.toString();
        boolean boolean18 = xmlDeclaration11.hasAttr("<?>");
        int int19 = xmlDeclaration11.childNodeSize();
        org.jsoup.nodes.Node node20 = xmlDeclaration11.parentNode();
        java.lang.String str22 = xmlDeclaration11.absUrl("<!<?>>");
        org.jsoup.nodes.Attributes attributes23 = xmlDeclaration11.attributes();
        boolean boolean24 = node7.equals((java.lang.Object) attributes23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = xmlTreeBuilder0.processStartTag("", attributes23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<?>" + "'", str16, "<?>");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        java.lang.String str4 = xmlDeclaration3.baseUri();
        java.lang.Appendable appendable5 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings7 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable5, (int) '4', outputSettings7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<?>" + "'", str4, "<?>");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration3.before("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        java.lang.String str12 = xmlDeclaration3.attr("<!<?>>");
        int int13 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str19 = xmlDeclaration17.absUrl("hi!");
        xmlDeclaration17.setBaseUri("#declaration");
        java.lang.String str23 = xmlDeclaration17.absUrl("hi!");
        java.lang.String str25 = xmlDeclaration17.attr("");
        java.lang.String str26 = xmlDeclaration17.getWholeDeclaration();
        org.jsoup.nodes.Node node28 = xmlDeclaration17.wrap("<?>");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = xmlDeclaration17.childNodesCopy();
        java.lang.String str31 = xmlDeclaration17.attr("<?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#declaration" + "'", str26, "#declaration");
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes5 = xmlDeclaration3.attributes();
        boolean boolean7 = xmlDeclaration3.hasAttr("hi!");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (-1), outputSettings10);
        org.jsoup.nodes.Document document12 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str17 = xmlDeclaration16.getWholeDeclaration();
        boolean boolean19 = xmlDeclaration16.hasAttr("hi!");
        java.lang.String str20 = xmlDeclaration16.nodeName();
        org.jsoup.nodes.Node node21 = xmlDeclaration16.nextSibling();
        java.lang.String str22 = xmlDeclaration16.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration16.childNodesCopy();
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        xmlDeclaration16.outerHtmlTail(appendable24, (int) (short) 100, outputSettings26);
        org.jsoup.nodes.Node node29 = xmlDeclaration16.removeAttr("<!#declaration>");
        boolean boolean30 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = xmlDeclaration16.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.absUrl("<?>");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable8, (int) (short) -1, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 1, outputSettings11);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str17 = xmlDeclaration16.getWholeDeclaration();
        boolean boolean19 = xmlDeclaration16.hasAttr("hi!");
        java.lang.String str20 = xmlDeclaration16.nodeName();
        java.lang.String str21 = xmlDeclaration16.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration16.siblingNodes();
        boolean boolean23 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration16);
        java.lang.String str24 = xmlDeclaration16.toString();
        org.jsoup.nodes.Node node25 = xmlDeclaration16.clone();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration16.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<?>" + "'", str21, "<?>");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<?>" + "'", str24, "<?>");
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.attr("<?>");
        java.lang.String str8 = xmlDeclaration3.outerHtml();
        java.lang.String str10 = xmlDeclaration3.attr("<!<?>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str15 = xmlDeclaration14.getWholeDeclaration();
        boolean boolean17 = xmlDeclaration14.hasAttr("hi!");
        java.lang.String str18 = xmlDeclaration14.nodeName();
        org.jsoup.nodes.Node node21 = xmlDeclaration14.attr("hi!", "hi!");
        int int22 = xmlDeclaration14.siblingIndex();
        xmlDeclaration14.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str29 = xmlDeclaration28.getWholeDeclaration();
        boolean boolean31 = xmlDeclaration28.hasAttr("hi!");
        java.lang.String str32 = xmlDeclaration28.nodeName();
        org.jsoup.nodes.Node node35 = xmlDeclaration28.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList36 = node35.siblingNodes();
        boolean boolean37 = xmlDeclaration14.hasSameValue((java.lang.Object) node35);
        boolean boolean38 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration14);
        java.lang.String str39 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node41 = xmlDeclaration3.before("<!<!#declaration>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#declaration" + "'", str18, "#declaration");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#declaration" + "'", str32, "#declaration");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(nodeList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "#declaration" + "'", str39, "#declaration");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        java.lang.String str11 = xmlDeclaration3.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!#declaration>" + "'", str11, "<!#declaration>");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        java.lang.String str12 = xmlDeclaration3.attr("<!<?>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!<?>>", "<!>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration3.siblingNodes();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable9, (int) '4', outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        int int12 = xmlDeclaration3.siblingIndex();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.clone();
        java.lang.String str15 = xmlDeclaration3.baseUri();
        xmlDeclaration3.setBaseUri("<!<!#declaration>>");
        java.lang.Appendable appendable18 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings20 = null;
        xmlDeclaration3.outerHtmlTail(appendable18, (int) (short) 0, outputSettings20);
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration3.siblingNodes();
        java.lang.Class<?> wildcardClass23 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.absUrl("<?>");
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean13 = xmlDeclaration11.equals((java.lang.Object) (byte) 0);
        java.lang.String str15 = xmlDeclaration11.attr("hi!");
        int int16 = xmlDeclaration11.childNodeSize();
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        xmlDeclaration11.outerHtmlTail(appendable17, 1, outputSettings19);
        org.jsoup.nodes.Node node21 = xmlDeclaration11.parent();
        boolean boolean22 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration11);
        boolean boolean24 = xmlDeclaration11.hasAttr("");
        org.jsoup.nodes.Attributes attributes25 = xmlDeclaration11.attributes();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(attributes25);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        int int11 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.parentNode();
        java.lang.String str14 = xmlDeclaration3.absUrl("<!<?>>");
        org.jsoup.nodes.Attributes attributes15 = xmlDeclaration3.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str20 = xmlDeclaration19.getWholeDeclaration();
        boolean boolean22 = xmlDeclaration19.hasAttr("hi!");
        java.lang.String str23 = xmlDeclaration19.nodeName();
        org.jsoup.nodes.Node node24 = xmlDeclaration19.nextSibling();
        java.lang.String str25 = xmlDeclaration19.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = xmlDeclaration19.childNodesCopy();
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        xmlDeclaration19.outerHtmlTail(appendable27, (int) (short) 100, outputSettings29);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlDeclaration19.childNodes();
        org.jsoup.nodes.Node node32 = xmlDeclaration19.parent();
        java.lang.String str33 = xmlDeclaration19.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlDeclaration19.childNodesCopy();
        org.jsoup.nodes.Attributes attributes35 = xmlDeclaration19.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#declaration" + "'", str23, "#declaration");
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "#declaration" + "'", str33, "#declaration");
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertNotNull(attributes35);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 1, outputSettings11);
        int int13 = xmlDeclaration3.siblingIndex();
        boolean boolean15 = xmlDeclaration3.equals((java.lang.Object) 1.0d);
        java.lang.String str16 = xmlDeclaration3.name();
        org.jsoup.nodes.Attributes attributes17 = xmlDeclaration3.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str22 = xmlDeclaration21.getWholeDeclaration();
        boolean boolean24 = xmlDeclaration21.hasAttr("hi!");
        java.lang.String str25 = xmlDeclaration21.nodeName();
        org.jsoup.nodes.Node node26 = xmlDeclaration21.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration21.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = xmlDeclaration21.childNodes();
        java.lang.String str29 = xmlDeclaration21.name();
        org.jsoup.nodes.Node node30 = xmlDeclaration21.parentNode();
        boolean boolean31 = xmlDeclaration3.hasSameValue((java.lang.Object) node30);
        org.jsoup.nodes.Node node32 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#declaration" + "'", str25, "#declaration");
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        boolean boolean13 = xmlDeclaration3.hasAttr("<!<?>>");
        java.lang.String str14 = xmlDeclaration3.name();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.clone();
        node16.setBaseUri("<!#declaration>");
        int int19 = node16.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            node16.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodes();
        java.lang.String str13 = xmlDeclaration3.attr("<?>");
        org.jsoup.nodes.Node node14 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.after("<?hi!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        xmlDeclaration3.setBaseUri("");
        java.lang.String str13 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.previousSibling();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<?>" + "'", str13, "<?>");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "", "<!<!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.previousSibling();
        java.lang.String str7 = xmlDeclaration3.name();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (int) 'a', outputSettings10);
        org.jsoup.nodes.Node node12 = xmlDeclaration3.parent();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        xmlDeclaration3.outerHtmlTail(appendable13, (int) (byte) 1, outputSettings15);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str21 = xmlDeclaration20.getWholeDeclaration();
        int int22 = xmlDeclaration20.siblingIndex();
        java.lang.Appendable appendable23 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings25 = null;
        xmlDeclaration20.outerHtmlTail(appendable23, (int) '4', outputSettings25);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration30 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str31 = xmlDeclaration30.getWholeDeclaration();
        boolean boolean33 = xmlDeclaration30.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlDeclaration30.childNodes();
        java.lang.String str35 = xmlDeclaration30.nodeName();
        org.jsoup.nodes.Node node36 = xmlDeclaration30.nextSibling();
        boolean boolean37 = xmlDeclaration20.equals((java.lang.Object) xmlDeclaration30);
        org.jsoup.nodes.Node node40 = xmlDeclaration30.attr("<!<?>>", "<!#declaration>");
        org.jsoup.nodes.Attributes attributes41 = xmlDeclaration30.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#declaration" + "'", str35, "#declaration");
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(attributes41);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.previousSibling();
        java.lang.String str7 = xmlDeclaration3.name();
        xmlDeclaration3.setBaseUri("<!>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str14 = xmlDeclaration13.getWholeDeclaration();
        boolean boolean16 = xmlDeclaration13.hasAttr("hi!");
        java.lang.String str17 = xmlDeclaration13.nodeName();
        org.jsoup.nodes.Node node20 = xmlDeclaration13.attr("hi!", "hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str25 = xmlDeclaration24.getWholeDeclaration();
        boolean boolean27 = xmlDeclaration24.hasAttr("hi!");
        java.lang.String str28 = xmlDeclaration24.nodeName();
        org.jsoup.nodes.Node node31 = xmlDeclaration24.attr("hi!", "hi!");
        int int32 = xmlDeclaration24.siblingIndex();
        xmlDeclaration24.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration38 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str39 = xmlDeclaration38.getWholeDeclaration();
        boolean boolean41 = xmlDeclaration38.hasAttr("hi!");
        java.lang.String str42 = xmlDeclaration38.nodeName();
        org.jsoup.nodes.Node node45 = xmlDeclaration38.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList46 = node45.siblingNodes();
        boolean boolean47 = xmlDeclaration24.hasSameValue((java.lang.Object) node45);
        java.lang.String str48 = xmlDeclaration24.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList49 = xmlDeclaration24.siblingNodes();
        boolean boolean50 = xmlDeclaration13.equals((java.lang.Object) xmlDeclaration24);
        org.jsoup.nodes.Node node53 = xmlDeclaration24.attr("<?>", "<!<!#declaration>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration57 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str58 = xmlDeclaration57.getWholeDeclaration();
        org.jsoup.nodes.Node node59 = xmlDeclaration57.nextSibling();
        org.jsoup.nodes.Node node60 = xmlDeclaration57.previousSibling();
        java.lang.String str61 = xmlDeclaration57.name();
        xmlDeclaration57.setBaseUri("<!>");
        org.jsoup.nodes.Node node65 = xmlDeclaration57.removeAttr("<!<!#declaration>>");
        boolean boolean66 = node53.equals((java.lang.Object) xmlDeclaration57);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node67 = xmlDeclaration3.after(node53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#declaration" + "'", str17, "#declaration");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "#declaration" + "'", str28, "#declaration");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#declaration" + "'", str42, "#declaration");
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "#declaration" + "'", str48, "#declaration");
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.String str10 = xmlDeclaration3.absUrl("<?>");
        int int11 = xmlDeclaration3.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.childNode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!#declaration>", "<!<!>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.siblingNodes();
        java.lang.String str7 = xmlDeclaration3.outerHtml();
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 0, outputSettings11);
        java.lang.String str13 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.clone();
        org.jsoup.nodes.Document document15 = node14.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node20 = xmlDeclaration19.clone();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = document15.hasSameValue((java.lang.Object) xmlDeclaration19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!<?>>" + "'", str7, "<!<?>>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!<?>>" + "'", str13, "<!<?>>");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertNotNull(node20);
    }
}

