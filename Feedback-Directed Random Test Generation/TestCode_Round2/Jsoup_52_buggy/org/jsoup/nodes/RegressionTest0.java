package org.jsoup.nodes;

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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = xmlDeclaration3.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = xmlDeclaration3.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = xmlDeclaration3.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = xmlDeclaration3.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = xmlDeclaration3.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.attr("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = xmlDeclaration3.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = xmlDeclaration3.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = xmlDeclaration3.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes5 = xmlDeclaration3.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes5 = xmlDeclaration3.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "#declaration", "", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "#declaration", "<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        org.jsoup.nodes.Document document9 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str14 = xmlDeclaration13.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.before("");
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
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = document8.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.Class<?> wildcardClass8 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = document8.absUrl("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "", "<?>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean14 = xmlDeclaration12.equals((java.lang.Object) (byte) 0);
        java.lang.String str16 = xmlDeclaration12.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str8 = xmlDeclaration7.getWholeDeclaration();
        boolean boolean10 = xmlDeclaration7.hasAttr("hi!");
        java.lang.String str11 = xmlDeclaration7.nodeName();
        org.jsoup.nodes.Node node12 = xmlDeclaration7.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.after(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable10, (int) (short) 1, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str13 = xmlDeclaration12.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes14 = xmlDeclaration12.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(attributes14);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes5 = xmlDeclaration3.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str10 = xmlDeclaration9.getWholeDeclaration();
        boolean boolean12 = xmlDeclaration9.hasAttr("hi!");
        java.lang.String str13 = xmlDeclaration9.nodeName();
        org.jsoup.nodes.Document document14 = xmlDeclaration9.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#declaration" + "'", str13, "#declaration");
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        org.jsoup.nodes.Document document9 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str14 = xmlDeclaration13.getWholeDeclaration();
        boolean boolean16 = xmlDeclaration13.hasAttr("hi!");
        java.lang.String str17 = xmlDeclaration13.nodeName();
        java.lang.String str18 = xmlDeclaration13.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration13.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = document9.equals((java.lang.Object) xmlDeclaration13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#declaration" + "'", str17, "#declaration");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<?>" + "'", str18, "<?>");
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        org.jsoup.nodes.Document document9 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = document9.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
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
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str10 = xmlDeclaration9.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            document8.setBaseUri("<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str13 = xmlDeclaration12.getWholeDeclaration();
        boolean boolean15 = xmlDeclaration12.hasAttr("hi!");
        java.lang.String str16 = xmlDeclaration12.nodeName();
        org.jsoup.nodes.Node node17 = xmlDeclaration12.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration12.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = null;
        boolean boolean7 = xmlDeclaration3.equals(obj6);
        boolean boolean9 = xmlDeclaration3.hasSameValue((java.lang.Object) false);
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration3.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<?>", "<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str11 = xmlDeclaration10.getWholeDeclaration();
        boolean boolean13 = xmlDeclaration10.hasAttr("hi!");
        java.lang.String str14 = xmlDeclaration10.nodeName();
        org.jsoup.nodes.Document document15 = xmlDeclaration10.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = xmlDeclaration3.after((org.jsoup.nodes.Node) document15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#declaration" + "'", str14, "#declaration");
        org.junit.Assert.assertNull(document15);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str6 = xmlDeclaration5.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes7 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = xmlTreeBuilder0.processStartTag("#declaration", attributes7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str6 = xmlDeclaration5.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes7 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = xmlTreeBuilder0.processStartTag("hi!", attributes7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "hi!", "#declaration", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
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
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node8.attr("#declaration", "<?>");
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
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        org.jsoup.nodes.Document document9 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str14 = xmlDeclaration13.getWholeDeclaration();
        boolean boolean16 = xmlDeclaration13.hasAttr("hi!");
        java.lang.String str17 = xmlDeclaration13.nodeName();
        java.lang.String str18 = xmlDeclaration13.toString();
        java.lang.String str19 = xmlDeclaration13.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#declaration" + "'", str17, "#declaration");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<?>" + "'", str18, "<?>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, (int) (short) 10, outputSettings12);
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
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        java.lang.Class<?> wildcardClass10 = nodeList9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<?>", "#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "#declaration", "hi!", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = null;
        boolean boolean7 = xmlDeclaration3.equals(obj6);
        boolean boolean9 = xmlDeclaration3.hasSameValue((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str10 = xmlDeclaration9.getWholeDeclaration();
        int int11 = xmlDeclaration9.siblingIndex();
        java.lang.String str13 = xmlDeclaration9.attr("<?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = null;
        boolean boolean7 = xmlDeclaration3.equals(obj6);
        boolean boolean9 = xmlDeclaration3.hasSameValue((java.lang.Object) false);
        xmlDeclaration3.setBaseUri("<?>");
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable12, 100, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str6 = xmlDeclaration5.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes7 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = xmlTreeBuilder0.processStartTag("<?>", attributes7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = node4.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.nextSibling();
        java.lang.Class<?> wildcardClass11 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = null;
        boolean boolean7 = xmlDeclaration3.equals(obj6);
        boolean boolean9 = xmlDeclaration3.hasSameValue((java.lang.Object) false);
        xmlDeclaration3.setBaseUri("<?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "hi!", "<?>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = xmlDeclaration3.after("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        int int12 = xmlDeclaration3.siblingIndex();
        java.lang.Class<?> wildcardClass13 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration3.after("<!<?>>");
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
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.attr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str14 = xmlDeclaration13.getWholeDeclaration();
        boolean boolean16 = xmlDeclaration13.hasAttr("hi!");
        java.lang.String str17 = xmlDeclaration13.nodeName();
        org.jsoup.nodes.Node node18 = xmlDeclaration13.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration13.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration13.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#declaration" + "'", str17, "#declaration");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = node10.getClass();
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
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!<?>>", "", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration3.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str14 = xmlDeclaration13.getWholeDeclaration();
        boolean boolean16 = xmlDeclaration13.hasAttr("hi!");
        java.lang.String str17 = xmlDeclaration13.nodeName();
        org.jsoup.nodes.Node node20 = xmlDeclaration13.attr("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = xmlDeclaration3.before(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#declaration" + "'", str17, "#declaration");
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str8 = xmlDeclaration7.getWholeDeclaration();
        boolean boolean10 = xmlDeclaration7.hasAttr("hi!");
        java.lang.String str11 = xmlDeclaration7.nodeName();
        java.lang.String str12 = xmlDeclaration7.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration7.siblingNodes();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        xmlDeclaration7.outerHtmlTail(appendable14, (int) (short) 10, outputSettings16);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<?>" + "'", str12, "<?>");
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str11 = xmlDeclaration3.attr("<?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str14 = xmlDeclaration13.getWholeDeclaration();
        int int15 = xmlDeclaration13.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean20 = xmlDeclaration18.equals((java.lang.Object) (byte) 0);
        java.lang.String str22 = xmlDeclaration18.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            node14.replaceWith((org.jsoup.nodes.Node) xmlDeclaration18);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node8.nextSibling();
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
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.attr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = xmlDeclaration3.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        int int11 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = node12.getClass();
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
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "", "<!<?>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.attr("<?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.before("<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes9 = node8.attributes();
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
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.String str9 = xmlDeclaration3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
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
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node14.after("hi!");
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
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        xmlDeclaration3.setBaseUri("");
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
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean16 = xmlDeclaration14.equals((java.lang.Object) (byte) 0);
        java.lang.String str18 = xmlDeclaration14.attr("hi!");
        int int19 = xmlDeclaration14.childNodeSize();
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        xmlDeclaration14.outerHtmlTail(appendable20, 1, outputSettings22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = node10.hasSameValue((java.lang.Object) outputSettings22);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
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
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = xmlDeclaration3.traverse(nodeVisitor16);
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
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = node5.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node14.unwrap();
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
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable6, (int) (byte) 100, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.unwrap();
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
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = node5.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        int int11 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.unwrap();
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
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!<?>>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str9 = xmlDeclaration8.getWholeDeclaration();
        boolean boolean11 = xmlDeclaration8.hasAttr("hi!");
        java.lang.String str12 = xmlDeclaration8.nodeName();
        java.lang.String str13 = xmlDeclaration8.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlDeclaration8.siblingNodes();
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        xmlDeclaration8.outerHtmlTail(appendable15, (int) (short) 10, outputSettings17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = node4.equals((java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<?>" + "'", str13, "<?>");
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        int int12 = xmlDeclaration3.siblingIndex();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.after("#declaration");
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
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "#declaration", "<!<?>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = node29.removeAttr("#declaration");
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
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = xmlDeclaration3.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        int int12 = xmlDeclaration3.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.wrap("");
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
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<?>" + "'", str5, "<?>");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.siblingNodes();
        org.jsoup.nodes.Node node12 = node10.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<?>", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration3.unwrap();
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
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = node5.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("<!<?>>");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "<?>");
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
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 1, outputSettings11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.before("<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str17 = xmlDeclaration15.absUrl("hi!");
        xmlDeclaration15.setBaseUri("#declaration");
        java.lang.String str21 = xmlDeclaration15.absUrl("hi!");
        java.lang.String str23 = xmlDeclaration15.attr("");
        java.lang.String str24 = xmlDeclaration15.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration15);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#declaration" + "'", str24, "#declaration");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (-1), outputSettings11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!<?>>", "<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str6 = xmlDeclaration5.getWholeDeclaration();
        boolean boolean8 = xmlDeclaration5.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration5.childNodes();
        java.lang.String str10 = xmlDeclaration5.nodeName();
        org.jsoup.nodes.Attributes attributes11 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = xmlTreeBuilder0.processStartTag("<?>", attributes11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<?>", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str8 = xmlDeclaration7.getWholeDeclaration();
        boolean boolean10 = xmlDeclaration7.hasAttr("hi!");
        org.jsoup.nodes.Node node11 = xmlDeclaration7.clone();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.attr("<?>");
        java.lang.String str8 = xmlDeclaration3.outerHtml();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable9, 100, outputSettings11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!<?>>", "#declaration", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str6 = xmlDeclaration5.getWholeDeclaration();
        boolean boolean8 = xmlDeclaration5.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration5.childNodes();
        java.lang.String str10 = xmlDeclaration5.nodeName();
        org.jsoup.nodes.Attributes attributes11 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = xmlTreeBuilder0.processStartTag("hi!", attributes11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        node4.setBaseUri("");
        java.lang.String str8 = node4.attr("<!<?>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node4.attr("", "<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.attr("<?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.before("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node16 = xmlDeclaration15.clone();
        java.lang.String str17 = xmlDeclaration15.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes18 = xmlDeclaration15.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration15);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<?>" + "'", str17, "<?>");
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
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
        // The following exception was thrown during execution in test generation
        try {
            int int30 = node29.childNodeSize();
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
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str19 = xmlDeclaration18.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes20 = xmlDeclaration18.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration18);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str15 = xmlDeclaration14.getWholeDeclaration();
        boolean boolean17 = xmlDeclaration14.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration14.childNodes();
        org.jsoup.nodes.Node node19 = xmlDeclaration14.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = node10.equals((java.lang.Object) xmlDeclaration14);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        org.jsoup.nodes.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.after(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes5 = xmlDeclaration3.attributes();
        boolean boolean7 = xmlDeclaration3.hasAttr("hi!");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (-1), outputSettings10);
        java.lang.String str12 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (-1), outputSettings11);
        org.jsoup.nodes.Document document13 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str18 = xmlDeclaration17.getWholeDeclaration();
        boolean boolean20 = xmlDeclaration17.hasAttr("hi!");
        java.lang.String str21 = xmlDeclaration17.nodeName();
        java.lang.String str22 = xmlDeclaration17.toString();
        boolean boolean24 = xmlDeclaration17.hasAttr("<?>");
        java.lang.String str25 = xmlDeclaration17.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<?>" + "'", str22, "<?>");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str6 = xmlDeclaration5.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes7 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = xmlTreeBuilder0.processStartTag("", attributes7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<?>", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "#declaration", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str20 = xmlDeclaration19.getWholeDeclaration();
        int int21 = xmlDeclaration19.siblingIndex();
        java.lang.String str23 = xmlDeclaration19.attr("<?>");
        java.lang.String str24 = xmlDeclaration19.outerHtml();
        java.lang.String str26 = xmlDeclaration19.attr("<!<?>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration19);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<?>" + "'", str24, "<?>");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.attr("<?>");
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str13 = xmlDeclaration12.getWholeDeclaration();
        boolean boolean15 = xmlDeclaration12.hasAttr("hi!");
        java.lang.String str16 = xmlDeclaration12.nodeName();
        org.jsoup.nodes.Node node19 = xmlDeclaration12.attr("hi!", "hi!");
        int int20 = xmlDeclaration12.siblingIndex();
        org.jsoup.nodes.Node node21 = xmlDeclaration12.previousSibling();
        java.lang.String str22 = xmlDeclaration12.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration12);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        org.jsoup.nodes.Attributes attributes4 = xmlDeclaration3.attributes();
        java.lang.String str5 = xmlDeclaration3.name();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable6, 100, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<?>" + "'", str5, "<?>");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str4 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str9 = xmlDeclaration8.getWholeDeclaration();
        boolean boolean11 = xmlDeclaration8.hasAttr("hi!");
        java.lang.String str12 = xmlDeclaration8.nodeName();
        org.jsoup.nodes.Node node15 = xmlDeclaration8.attr("hi!", "hi!");
        int int16 = xmlDeclaration8.siblingIndex();
        org.jsoup.nodes.Node node17 = xmlDeclaration8.previousSibling();
        java.lang.String str18 = xmlDeclaration8.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<!#declaration>" + "'", str4, "<!#declaration>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration45 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str47 = xmlDeclaration45.absUrl("hi!");
        xmlDeclaration45.setBaseUri("#declaration");
        java.lang.String str51 = xmlDeclaration45.absUrl("hi!");
        java.lang.String str53 = xmlDeclaration45.attr("<!<?>>");
        // The following exception was thrown during execution in test generation
        try {
            node24.replaceWith((org.jsoup.nodes.Node) xmlDeclaration45);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#declaration" + "'", str34, "#declaration");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<?>" + "'", str35, "<?>");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Attributes attributes2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = xmlTreeBuilder0.processStartTag("#declaration", attributes2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (-1), outputSettings11);
        org.jsoup.nodes.Document document13 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str18 = xmlDeclaration17.getWholeDeclaration();
        boolean boolean20 = xmlDeclaration17.hasAttr("hi!");
        java.lang.String str21 = xmlDeclaration17.nodeName();
        java.lang.String str22 = xmlDeclaration17.toString();
        boolean boolean24 = xmlDeclaration17.hasAttr("<?>");
        java.lang.String str25 = xmlDeclaration17.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            document13.replaceWith((org.jsoup.nodes.Node) xmlDeclaration17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<?>" + "'", str22, "<?>");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            node4.setBaseUri("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.attr("hi!");
        java.lang.Class<?> wildcardClass10 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.before("<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<?>" + "'", str5, "<?>");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.after("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node6 = xmlDeclaration5.clone();
        java.lang.String str7 = xmlDeclaration5.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes8 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = xmlTreeBuilder0.processStartTag("<?>", attributes8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<?>" + "'", str7, "<?>");
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.nextSibling();
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str16 = xmlDeclaration15.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes17 = xmlDeclaration15.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str22 = xmlDeclaration21.getWholeDeclaration();
        boolean boolean24 = xmlDeclaration21.hasAttr("hi!");
        java.lang.String str25 = xmlDeclaration21.nodeName();
        boolean boolean26 = xmlDeclaration15.hasSameValue((java.lang.Object) str25);
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#declaration" + "'", str25, "#declaration");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (-1), outputSettings11);
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.traverse(nodeVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.siblingNodes();
        org.jsoup.nodes.Node node12 = node10.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = node12.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "", "<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.wrap("<!<?>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str12 = xmlDeclaration11.getWholeDeclaration();
        boolean boolean14 = xmlDeclaration11.hasAttr("hi!");
        java.lang.String str15 = xmlDeclaration11.nodeName();
        java.lang.String str16 = xmlDeclaration11.toString();
        boolean boolean18 = xmlDeclaration11.hasAttr("<?>");
        java.lang.String str19 = xmlDeclaration11.baseUri();
        int int20 = xmlDeclaration11.siblingIndex();
        java.lang.String str21 = xmlDeclaration11.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = node7.after((org.jsoup.nodes.Node) xmlDeclaration11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<?>" + "'", str16, "<?>");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = xmlDeclaration3.before("<!#declaration>");
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
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str6 = xmlDeclaration5.getWholeDeclaration();
        boolean boolean8 = xmlDeclaration5.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration5.childNodes();
        java.lang.String str10 = xmlDeclaration5.nodeName();
        org.jsoup.nodes.Attributes attributes11 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = xmlTreeBuilder0.processStartTag("<!>", attributes11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.previousSibling();
        java.lang.String str7 = xmlDeclaration3.name();
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable8, (int) (byte) 0, outputSettings10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.nodes.Document document6 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = document6.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        int int13 = xmlDeclaration12.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration17.childNodesCopy();
        boolean boolean19 = xmlDeclaration12.equals((java.lang.Object) xmlDeclaration17);
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes6 = xmlDeclaration3.attributes();
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = xmlDeclaration3.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<?>" + "'", str5, "<?>");
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        org.jsoup.nodes.Document document9 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            document9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes5 = xmlDeclaration3.attributes();
        boolean boolean7 = xmlDeclaration3.hasAttr("hi!");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (-1), outputSettings10);
        java.lang.String str12 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration3.attributes();
        java.lang.Class<?> wildcardClass10 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        org.jsoup.nodes.Attributes attributes6 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = xmlTreeBuilder0.processStartTag("<!#declaration>", attributes6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("<!<?>>");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "<?>");
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration27 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str28 = xmlDeclaration27.getWholeDeclaration();
        boolean boolean30 = xmlDeclaration27.hasAttr("hi!");
        java.lang.String str31 = xmlDeclaration27.nodeName();
        org.jsoup.nodes.Node node34 = xmlDeclaration27.attr("hi!", "hi!");
        org.jsoup.nodes.Node node35 = node34.clone();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration16.replaceWith(node34);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#declaration" + "'", str31, "#declaration");
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
            org.jsoup.nodes.Node node15 = document13.wrap("<!#declaration>");
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
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = null;
        boolean boolean7 = xmlDeclaration3.equals(obj6);
        boolean boolean9 = xmlDeclaration3.hasSameValue((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration3.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str11 = xmlDeclaration3.attr("<!<?>>");
        xmlDeclaration3.setBaseUri("#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.before("<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "", "<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        org.jsoup.nodes.Document document9 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration3.before("<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<?>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration45 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str46 = xmlDeclaration45.getWholeDeclaration();
        boolean boolean48 = xmlDeclaration45.hasAttr("hi!");
        java.lang.String str49 = xmlDeclaration45.nodeName();
        org.jsoup.nodes.Node node50 = xmlDeclaration45.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList51 = xmlDeclaration45.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList52 = xmlDeclaration45.childNodes();
        java.lang.Appendable appendable53 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings55 = null;
        xmlDeclaration45.outerHtmlTail(appendable53, (int) (byte) 0, outputSettings55);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node57 = node24.before((org.jsoup.nodes.Node) xmlDeclaration45);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "#declaration" + "'", str34, "#declaration");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<?>" + "'", str35, "<?>");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "#declaration" + "'", str49, "#declaration");
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(nodeList51);
        org.junit.Assert.assertNotNull(nodeList52);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.siblingNodes();
        java.lang.String str7 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.removeAttr("hi!");
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node9.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!<?>>" + "'", str7, "<!<?>>");
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        boolean boolean44 = node24.hasAttr("<!<?>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node46 = node24.after("");
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration24 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str26 = xmlDeclaration24.absUrl("hi!");
        xmlDeclaration24.setBaseUri("#declaration");
        java.lang.String str30 = xmlDeclaration24.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList31 = xmlDeclaration24.siblingNodes();
        org.jsoup.nodes.Node node32 = xmlDeclaration24.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = xmlDeclaration15.after((org.jsoup.nodes.Node) xmlDeclaration24);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.nodes.Document document6 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str11 = xmlDeclaration10.getWholeDeclaration();
        boolean boolean13 = xmlDeclaration10.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlDeclaration10.childNodes();
        java.lang.String str15 = xmlDeclaration10.nodeName();
        org.jsoup.nodes.Attributes attributes16 = xmlDeclaration10.attributes();
        org.jsoup.nodes.Node node17 = xmlDeclaration10.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean23 = xmlDeclaration21.equals((java.lang.Object) (byte) 0);
        java.lang.String str25 = xmlDeclaration21.attr("hi!");
        int int26 = xmlDeclaration21.childNodeSize();
        java.lang.Appendable appendable27 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings29 = null;
        xmlDeclaration21.outerHtmlTail(appendable27, 1, outputSettings29);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration34 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str35 = xmlDeclaration34.getWholeDeclaration();
        boolean boolean37 = xmlDeclaration34.hasAttr("hi!");
        java.lang.String str38 = xmlDeclaration34.nodeName();
        java.lang.String str39 = xmlDeclaration34.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlDeclaration34.siblingNodes();
        boolean boolean41 = xmlDeclaration21.hasSameValue((java.lang.Object) xmlDeclaration34);
        org.jsoup.nodes.Attributes attributes42 = xmlDeclaration21.attributes();
        boolean boolean43 = xmlDeclaration10.equals((java.lang.Object) xmlDeclaration21);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "#declaration" + "'", str38, "#declaration");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<?>" + "'", str39, "<?>");
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.parent();
        xmlDeclaration3.setBaseUri("<?>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str14 = xmlDeclaration12.absUrl("hi!");
        xmlDeclaration12.setBaseUri("#declaration");
        java.lang.String str18 = xmlDeclaration12.absUrl("hi!");
        java.lang.String str20 = xmlDeclaration12.attr("");
        java.lang.String str21 = xmlDeclaration12.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "#declaration", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.previousSibling();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!#declaration>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node6 = xmlDeclaration5.clone();
        java.lang.String str7 = xmlDeclaration5.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes8 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = xmlTreeBuilder0.processStartTag("hi!", attributes8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<?>" + "'", str7, "<?>");
        org.junit.Assert.assertNotNull(attributes8);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!#declaration>", "", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("<!<?>>");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
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
            org.jsoup.nodes.Node node15 = xmlDeclaration3.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = node4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        java.lang.String str11 = xmlDeclaration3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.wrap("");
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
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!#declaration>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        boolean boolean44 = node24.hasAttr("<!<?>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration48 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str49 = xmlDeclaration48.getWholeDeclaration();
        boolean boolean51 = xmlDeclaration48.hasAttr("hi!");
        org.jsoup.nodes.Node node52 = xmlDeclaration48.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node53 = node24.after(node52);
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(node52);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = document8.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(document8);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.after("<?>");
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
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.Appendable appendable7 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings9 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable7, (int) (short) -1, outputSettings9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
        java.lang.Appendable appendable15 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings17 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable15, 1, outputSettings17);
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
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "#declaration", "<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
            boolean boolean16 = xmlTreeBuilder0.processStartTag("<?>", attributes15);
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
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = node24.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
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
            xmlDeclaration3.remove();
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
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = xmlDeclaration3.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
            boolean boolean19 = xmlTreeBuilder0.processStartTag("<!<?>>", attributes18);
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
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration42 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str43 = xmlDeclaration42.getWholeDeclaration();
        boolean boolean45 = xmlDeclaration42.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList46 = xmlDeclaration42.childNodes();
        java.lang.String str47 = xmlDeclaration42.nodeName();
        org.jsoup.nodes.Attributes attributes48 = xmlDeclaration42.attributes();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration42);
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "#declaration" + "'", str47, "#declaration");
        org.junit.Assert.assertNotNull(attributes48);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
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
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
        org.jsoup.nodes.Attributes attributes26 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = xmlTreeBuilder0.processStartTag("", attributes26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
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
        org.junit.Assert.assertNotNull(attributes26);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = xmlDeclaration3.traverse(nodeVisitor16);
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
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node14 = xmlDeclaration13.clone();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        int int4 = xmlDeclaration3.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = xmlDeclaration3.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "hi!", "#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node4.attr("#declaration", "<?>");
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node4.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = node42.baseUri();
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
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
            java.lang.String str18 = xmlDeclaration3.absUrl("");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.lang.String str11 = xmlDeclaration3.name();
        java.lang.String str13 = xmlDeclaration3.attr("<?>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node18 = xmlDeclaration17.clone();
        java.lang.String str19 = xmlDeclaration17.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = xmlDeclaration17.siblingNodes();
        java.lang.String str21 = xmlDeclaration17.outerHtml();
        org.jsoup.nodes.Node node23 = xmlDeclaration17.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration17);
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
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<!<?>>" + "'", str19, "<!<?>>");
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!<?>>" + "'", str21, "<!<?>>");
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!#declaration>", "<!<?>>", true);
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.after("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        boolean boolean13 = xmlDeclaration3.hasAttr("<!<?>>");
        java.lang.String str14 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = xmlDeclaration3.after("hi!");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#declaration" + "'", str14, "#declaration");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str16 = xmlDeclaration14.absUrl("hi!");
        xmlDeclaration14.setBaseUri("#declaration");
        java.lang.String str20 = xmlDeclaration14.absUrl("hi!");
        java.lang.String str22 = xmlDeclaration14.attr("");
        java.lang.String str23 = xmlDeclaration14.baseUri();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node10.before((org.jsoup.nodes.Node) xmlDeclaration14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#declaration" + "'", str23, "#declaration");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        int int4 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration8.childNodesCopy();
        boolean boolean10 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration8);
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodes();
        int int12 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!#declaration>", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node31 = xmlDeclaration3.unwrap();
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
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = node5.hasAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str6 = xmlDeclaration5.getWholeDeclaration();
        boolean boolean8 = xmlDeclaration5.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration5.childNodes();
        java.lang.String str10 = xmlDeclaration5.nodeName();
        java.lang.String str11 = xmlDeclaration5.outerHtml();
        java.lang.String str12 = xmlDeclaration5.outerHtml();
        org.jsoup.nodes.Node node14 = xmlDeclaration5.wrap("<!<?>>");
        org.jsoup.nodes.Attributes attributes15 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = xmlTreeBuilder0.processStartTag("<!<?>>", attributes15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<?>" + "'", str11, "<?>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<?>" + "'", str12, "<?>");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(attributes15);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.attr("<?>");
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = document8.attr("#declaration", "<?>");
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
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str16 = xmlDeclaration14.absUrl("hi!");
        xmlDeclaration14.setBaseUri("#declaration");
        java.lang.String str20 = xmlDeclaration14.absUrl("hi!");
        java.lang.String str22 = xmlDeclaration14.attr("");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration14);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.attr("hi!");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.parent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str17 = xmlDeclaration15.absUrl("hi!");
        xmlDeclaration15.setBaseUri("#declaration");
        java.lang.String str20 = xmlDeclaration15.name();
        java.lang.String str21 = xmlDeclaration15.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.attr("hi!");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "#declaration", "#declaration", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        java.lang.String str4 = xmlDeclaration3.baseUri();
        java.lang.String str5 = xmlDeclaration3.outerHtml();
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable6, (int) (short) -1, outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<?>" + "'", str4, "<?>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.nextSibling();
        java.lang.String str11 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str16 = xmlDeclaration15.getWholeDeclaration();
        boolean boolean18 = xmlDeclaration15.hasAttr("hi!");
        java.lang.String str19 = xmlDeclaration15.nodeName();
        org.jsoup.nodes.Node node20 = xmlDeclaration15.nextSibling();
        java.lang.String str21 = xmlDeclaration15.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration15.childNodesCopy();
        java.lang.String str23 = xmlDeclaration15.toString();
        java.lang.String str24 = xmlDeclaration15.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration15);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#declaration" + "'", str19, "#declaration");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<?>" + "'", str23, "<?>");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "#declaration" + "'", str24, "#declaration");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration42 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str43 = xmlDeclaration42.getWholeDeclaration();
        boolean boolean45 = xmlDeclaration42.hasAttr("hi!");
        java.lang.String str46 = xmlDeclaration42.nodeName();
        java.lang.String str47 = xmlDeclaration42.toString();
        boolean boolean49 = xmlDeclaration42.hasAttr("<?>");
        java.lang.String str50 = xmlDeclaration42.nodeName();
        org.jsoup.nodes.Document document51 = xmlDeclaration42.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node52 = xmlDeclaration14.after((org.jsoup.nodes.Node) document51);
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "#declaration" + "'", str46, "#declaration");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "<?>" + "'", str47, "<?>");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "#declaration" + "'", str50, "#declaration");
        org.junit.Assert.assertNull(document51);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        java.lang.Appendable appendable38 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings40 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration24.outerHtmlHead(appendable38, (int) '4', outputSettings40);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!#declaration>" + "'", str34, "<!#declaration>");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(document36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        org.jsoup.nodes.Node node8 = xmlDeclaration3.clone();
        org.jsoup.nodes.Attributes attributes9 = node8.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = node8.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration15.remove();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#declaration" + "'", str19, "#declaration");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!>", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (int) (short) -1, outputSettings11);
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable13, (int) ' ', outputSettings15);
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
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration16.outerHtmlHead(appendable26, (int) '4', outputSettings28);
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
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = xmlDeclaration3.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node15 = xmlDeclaration14.clone();
        java.lang.String str16 = xmlDeclaration14.getWholeDeclaration();
        java.lang.String str17 = xmlDeclaration14.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration14);
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
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<?>" + "'", str16, "<?>");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!<?>>" + "'", str17, "<!<?>>");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        org.jsoup.nodes.Node node11 = node10.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str16 = xmlDeclaration15.getWholeDeclaration();
        int int17 = xmlDeclaration15.siblingIndex();
        java.lang.String str19 = xmlDeclaration15.attr("<?>");
        org.jsoup.nodes.Document document20 = xmlDeclaration15.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node10.after((org.jsoup.nodes.Node) document20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(document20);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = xmlDeclaration3.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        org.jsoup.nodes.Attributes attributes24 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node25 = xmlDeclaration3.nextSibling();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#declaration" + "'", str20, "#declaration");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<?>" + "'", str21, "<?>");
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        int int11 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = node12.absUrl("<?>");
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
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("<!<?>>");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "<?>");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.siblingNodes();
        java.lang.String str7 = xmlDeclaration3.outerHtml();
        int int8 = xmlDeclaration3.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!<?>>" + "'", str7, "<!<?>>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.lang.String str9 = xmlDeclaration3.outerHtml();
        java.lang.String str10 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.wrap("<!<?>>");
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration3.attributes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.unwrap();
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
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean25 = xmlDeclaration23.equals((java.lang.Object) (byte) 0);
        java.lang.String str27 = xmlDeclaration23.attr("hi!");
        int int28 = xmlDeclaration23.childNodeSize();
        java.lang.Appendable appendable29 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings31 = null;
        xmlDeclaration23.outerHtmlTail(appendable29, 1, outputSettings31);
        int int33 = xmlDeclaration23.siblingIndex();
        boolean boolean35 = xmlDeclaration23.equals((java.lang.Object) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node36 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration23);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.siblingNodes();
        org.jsoup.nodes.Node node12 = node10.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str11 = xmlDeclaration3.attr("");
        java.lang.String str12 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.wrap("<?>");
        // The following exception was thrown during execution in test generation
        try {
            node14.setBaseUri("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<?>", "<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "hi!", "<!<!#declaration>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "hi!", "<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node32 = xmlDeclaration3.after("<!#declaration>");
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
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str6 = xmlDeclaration5.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration5.absUrl("<?>");
        java.lang.String str9 = xmlDeclaration5.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration5.childNodes();
        org.jsoup.nodes.Attributes attributes11 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = xmlTreeBuilder0.processStartTag("<!<!#declaration>>", attributes11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!#declaration>", "<!>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        org.jsoup.nodes.Node node16 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList17 = node16.childNodes();
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
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "#declaration", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes5 = xmlDeclaration3.attributes();
        boolean boolean7 = xmlDeclaration3.hasAttr("hi!");
        java.lang.Class<?> wildcardClass8 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.siblingNodes();
        java.lang.String str7 = xmlDeclaration3.outerHtml();
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 0, outputSettings11);
        org.jsoup.nodes.Node node13 = xmlDeclaration3.nextSibling();
        java.lang.Class<?> wildcardClass14 = xmlDeclaration3.getClass();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!<?>>" + "'", str7, "<!<?>>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node30 = xmlDeclaration3.childNode(0);
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
        org.junit.Assert.assertNotNull(nodeList28);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.siblingNodes();
        org.jsoup.nodes.Node node12 = node10.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = node12.hasAttr("<!<!#declaration>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!<!#declaration>>", "<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.nextSibling();
        java.lang.String str11 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.attr("hi!", "hi!");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<?>" + "'", str11, "<?>");
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.traverse(nodeVisitor12);
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
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str12 = xmlDeclaration11.getWholeDeclaration();
        boolean boolean14 = xmlDeclaration11.hasAttr("hi!");
        java.lang.String str15 = xmlDeclaration11.nodeName();
        org.jsoup.nodes.Node node18 = xmlDeclaration11.attr("hi!", "hi!");
        int int19 = xmlDeclaration11.siblingIndex();
        xmlDeclaration11.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str26 = xmlDeclaration25.getWholeDeclaration();
        boolean boolean28 = xmlDeclaration25.hasAttr("hi!");
        java.lang.String str29 = xmlDeclaration25.nodeName();
        org.jsoup.nodes.Node node32 = xmlDeclaration25.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = node32.siblingNodes();
        boolean boolean34 = xmlDeclaration11.hasSameValue((java.lang.Object) node32);
        java.lang.String str35 = xmlDeclaration11.nodeName();
        org.jsoup.nodes.Node node37 = xmlDeclaration11.wrap("<?>");
        java.lang.String str38 = xmlDeclaration11.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = node7.after((org.jsoup.nodes.Node) xmlDeclaration11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#declaration" + "'", str29, "#declaration");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "#declaration" + "'", str35, "#declaration");
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "<?>" + "'", str38, "<?>");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.previousSibling();
        java.lang.String str7 = xmlDeclaration3.name();
        int int8 = xmlDeclaration3.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.after("#declaration");
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
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!>", "<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        java.lang.Class<?> wildcardClass21 = xmlDeclaration15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (-1), outputSettings11);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration16 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node17 = xmlDeclaration16.clone();
        java.lang.String str18 = xmlDeclaration16.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<?>" + "'", str18, "<?>");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        org.jsoup.nodes.Node node21 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = node21.hasAttr("<!<!#declaration>>");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration27 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str28 = xmlDeclaration27.getWholeDeclaration();
        boolean boolean30 = xmlDeclaration27.hasAttr("hi!");
        java.lang.String str31 = xmlDeclaration27.nodeName();
        org.jsoup.nodes.Node node32 = xmlDeclaration27.nextSibling();
        java.lang.String str33 = xmlDeclaration27.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlDeclaration27.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = xmlDeclaration16.after((org.jsoup.nodes.Node) xmlDeclaration27);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#declaration" + "'", str31, "#declaration");
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<?>" + "'", str33, "<?>");
        org.junit.Assert.assertNotNull(nodeList34);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!>", "<!<?>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        org.jsoup.nodes.Attributes attributes4 = xmlDeclaration3.attributes();
        java.lang.String str5 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.removeAttr("#declaration");
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<?>" + "'", str5, "<?>");
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.attr("hi!");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        // The following exception was thrown during execution in test generation
        try {
            node10.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!<!#declaration>>", "<!<!#declaration>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("hi!", "<?>", false);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = xmlDeclaration3.after("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = node4.nextSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        xmlDeclaration3.setBaseUri("");
        java.lang.String str14 = xmlDeclaration3.attr("<!#declaration>");
        org.jsoup.nodes.Node node15 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = xmlDeclaration3.unwrap();
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
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
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
        org.jsoup.select.NodeVisitor nodeVisitor14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = node13.traverse(nodeVisitor14);
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
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = xmlDeclaration3.wrap("#declaration");
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
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        org.jsoup.nodes.Document document9 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = document9.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!>", "<!>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        java.lang.String str4 = xmlDeclaration3.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = xmlDeclaration3.childNodesCopy();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<?>" + "'", str4, "<?>");
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.siblingNodes();
        java.lang.String str7 = xmlDeclaration3.outerHtml();
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 0, outputSettings11);
        org.jsoup.nodes.Node node13 = xmlDeclaration3.nextSibling();
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable14, (int) '4', outputSettings16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!<?>>" + "'", str7, "<!<?>>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str11 = xmlDeclaration3.absUrl("<!#declaration>");
        org.jsoup.select.NodeVisitor nodeVisitor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.traverse(nodeVisitor12);
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
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str6 = xmlDeclaration5.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration5.absUrl("<?>");
        java.lang.String str9 = xmlDeclaration5.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration5.childNodes();
        org.jsoup.nodes.Attributes attributes11 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = xmlTreeBuilder0.processStartTag("<!>", attributes11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!>", "<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.String str9 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str14 = xmlDeclaration13.getWholeDeclaration();
        boolean boolean16 = xmlDeclaration13.hasAttr("hi!");
        java.lang.String str17 = xmlDeclaration13.nodeName();
        org.jsoup.nodes.Node node20 = xmlDeclaration13.attr("hi!", "hi!");
        org.jsoup.nodes.Node node21 = node20.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration25 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str27 = xmlDeclaration25.absUrl("hi!");
        xmlDeclaration25.setBaseUri("#declaration");
        java.lang.String str31 = xmlDeclaration25.attr("hi!");
        org.jsoup.nodes.Node node32 = xmlDeclaration25.clone();
        java.lang.String str33 = node32.outerHtml();
        boolean boolean34 = node20.equals((java.lang.Object) node32);
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#declaration" + "'", str17, "#declaration");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "<!#declaration>" + "'", str33, "<!#declaration>");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration24.remove();
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
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        int int11 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("hi!");
        org.jsoup.nodes.Node node14 = xmlDeclaration3.nextSibling();
        java.lang.String str15 = xmlDeclaration3.toString();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<?>" + "'", str15, "<?>");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.absUrl("<?>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node11 = xmlDeclaration10.clone();
        java.lang.String str12 = xmlDeclaration10.getWholeDeclaration();
        java.lang.String str13 = xmlDeclaration10.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<?>" + "'", str12, "<?>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!<?>>" + "'", str13, "<!<?>>");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.siblingNodes();
        java.lang.String str7 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.Node node9 = xmlDeclaration3.removeAttr("hi!");
        org.jsoup.nodes.Node node10 = node9.parent();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node10.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!<?>>" + "'", str7, "<!<?>>");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
            org.jsoup.nodes.Node node22 = xmlDeclaration16.after("#declaration");
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
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<?>", true);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str8 = xmlDeclaration7.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration7.attributes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str14 = xmlDeclaration13.getWholeDeclaration();
        boolean boolean16 = xmlDeclaration13.hasAttr("hi!");
        java.lang.String str17 = xmlDeclaration13.nodeName();
        boolean boolean18 = xmlDeclaration7.hasSameValue((java.lang.Object) str17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#declaration" + "'", str17, "#declaration");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.before("<!>");
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
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "<?>", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = node4.parentNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        xmlDeclaration3.setBaseUri("hi!");
        java.lang.String str10 = xmlDeclaration3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<?>" + "'", str10, "<?>");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        org.jsoup.nodes.Attributes attributes19 = xmlDeclaration18.attributes();
        java.lang.String str20 = xmlDeclaration18.name();
        org.jsoup.nodes.Node node22 = xmlDeclaration18.removeAttr("#declaration");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<?>" + "'", str20, "<?>");
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.nextSibling();
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.parent();
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable13, (int) (byte) 0, outputSettings15);
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
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        java.lang.String str7 = xmlDeclaration3.attr("<?>");
        org.jsoup.nodes.Document document8 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str13 = xmlDeclaration12.outerHtml();
        boolean boolean14 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration12);
        org.jsoup.nodes.Document document15 = xmlDeclaration3.ownerDocument();
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = xmlDeclaration3.traverse(nodeVisitor16);
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
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
            org.jsoup.nodes.Node node16 = xmlDeclaration3.after("<?>");
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
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = xmlDeclaration3.unwrap();
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
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = xmlDeclaration15.after("<!<!#declaration>>");
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
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str6 = xmlDeclaration5.getWholeDeclaration();
        boolean boolean8 = xmlDeclaration5.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration5.childNodes();
        java.lang.String str10 = xmlDeclaration5.nodeName();
        org.jsoup.nodes.Attributes attributes11 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = xmlTreeBuilder0.processStartTag("", attributes11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        int int11 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("hi!");
        org.jsoup.nodes.Node node14 = xmlDeclaration3.nextSibling();
        java.lang.String str15 = xmlDeclaration3.toString();
        org.jsoup.select.NodeVisitor nodeVisitor16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = xmlDeclaration3.traverse(nodeVisitor16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<?>" + "'", str15, "<?>");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!<!#declaration>>", "#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node6 = xmlDeclaration3.attr("#declaration", "<!>");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
            org.jsoup.nodes.Document document26 = document25.ownerDocument();
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
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        xmlDeclaration3.setBaseUri("hi!");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable10, 1, outputSettings12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<?>>", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.attr("<!<!#declaration>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        java.lang.String str11 = xmlDeclaration3.baseUri();
        java.lang.Class<?> wildcardClass12 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node10.before("");
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
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str15 = xmlDeclaration14.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes16 = xmlDeclaration14.attributes();
        boolean boolean18 = xmlDeclaration14.hasAttr("hi!");
        java.lang.Appendable appendable19 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings21 = null;
        xmlDeclaration14.outerHtmlTail(appendable19, (-1), outputSettings21);
        org.jsoup.nodes.Node node24 = xmlDeclaration14.removeAttr("<!<?>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node25 = xmlDeclaration3.after(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodesCopy();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable12, 0, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!>", "#declaration", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!#declaration>", "<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        java.lang.String str9 = xmlDeclaration3.outerHtml();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        boolean boolean13 = xmlDeclaration3.hasAttr("<!<?>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str18 = xmlDeclaration17.getWholeDeclaration();
        boolean boolean20 = xmlDeclaration17.hasAttr("hi!");
        java.lang.String str21 = xmlDeclaration17.nodeName();
        org.jsoup.nodes.Node node22 = xmlDeclaration17.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = xmlDeclaration17.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = xmlDeclaration17.childNodes();
        java.lang.String str25 = xmlDeclaration17.name();
        org.jsoup.nodes.Node node27 = xmlDeclaration17.removeAttr("<!<!#declaration>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration17);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#declaration" + "'", str21, "#declaration");
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = xmlDeclaration3.before("<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = node8.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.lang.String str11 = xmlDeclaration3.baseUri();
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
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.nextSibling();
        java.lang.String str11 = xmlDeclaration3.toString();
        int int12 = xmlDeclaration3.childNodeSize();
        java.lang.String str13 = xmlDeclaration3.getWholeDeclaration();
        java.lang.Class<?> wildcardClass14 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<?>" + "'", str11, "<?>");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.after("hi!");
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
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<?>", "#declaration", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = document10.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodes();
        java.lang.String str12 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.previousSibling();
        java.lang.String str7 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str12 = xmlDeclaration11.getWholeDeclaration();
        boolean boolean14 = xmlDeclaration11.hasAttr("hi!");
        java.lang.String str15 = xmlDeclaration11.nodeName();
        org.jsoup.nodes.Node node16 = xmlDeclaration11.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration11.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration11.childNodes();
        boolean boolean20 = xmlDeclaration11.hasAttr("<?>");
        boolean boolean22 = xmlDeclaration11.hasSameValue((java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<?>" + "'", str7, "<?>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "hi!", "hi!", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = node5.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str11 = xmlDeclaration3.attr("");
        java.lang.String str12 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.wrap("<?>");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration3.childNodesCopy();
        java.lang.Appendable appendable16 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings18 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable16, 10, outputSettings18);
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
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration42 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str43 = xmlDeclaration42.getWholeDeclaration();
        boolean boolean45 = xmlDeclaration42.hasAttr("hi!");
        java.lang.String str46 = xmlDeclaration42.nodeName();
        org.jsoup.nodes.Node node49 = xmlDeclaration42.attr("hi!", "hi!");
        int int50 = xmlDeclaration42.siblingIndex();
        xmlDeclaration42.setBaseUri("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration56 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str57 = xmlDeclaration56.getWholeDeclaration();
        boolean boolean59 = xmlDeclaration56.hasAttr("hi!");
        java.lang.String str60 = xmlDeclaration56.nodeName();
        org.jsoup.nodes.Node node63 = xmlDeclaration56.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList64 = node63.siblingNodes();
        boolean boolean65 = xmlDeclaration42.hasSameValue((java.lang.Object) node63);
        java.lang.String str66 = xmlDeclaration42.nodeName();
        org.jsoup.nodes.Node node68 = xmlDeclaration42.wrap("<?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node69 = xmlDeclaration3.after(node68);
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "#declaration" + "'", str46, "#declaration");
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "#declaration" + "'", str60, "#declaration");
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(nodeList64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "#declaration" + "'", str66, "#declaration");
        org.junit.Assert.assertNull(node68);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.absUrl("<?>");
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.before("<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        int int11 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.removeAttr("hi!");
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable14, (int) (byte) 1, outputSettings16);
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
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        int int4 = xmlDeclaration3.siblingIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node6 = xmlDeclaration3.after("<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        node4.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node4.siblingNodes();
        org.jsoup.nodes.Node node8 = node4.clone();
        org.jsoup.nodes.Node node9 = node8.parentNode();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node14 = xmlDeclaration13.clone();
        node14.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node14.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            node9.replaceWith(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
        int int14 = xmlDeclaration3.childNodeSize();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.attr("<?>");
        java.lang.Appendable appendable6 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings8 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable6, (int) 'a', outputSettings8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        // The following exception was thrown during execution in test generation
        try {
            int int21 = document20.childNodeSize();
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
        org.junit.Assert.assertNull(document20);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!<?>>", "#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.lang.String str11 = xmlDeclaration3.baseUri();
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
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str16 = xmlDeclaration14.absUrl("hi!");
        xmlDeclaration14.setBaseUri("#declaration");
        java.lang.String str20 = xmlDeclaration14.absUrl("hi!");
        java.lang.String str22 = xmlDeclaration14.attr("<!<?>>");
        xmlDeclaration14.setBaseUri("#declaration");
        java.lang.String str26 = xmlDeclaration14.absUrl("<!#declaration>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str6 = xmlDeclaration5.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration5.absUrl("<?>");
        java.lang.String str9 = xmlDeclaration5.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration5.childNodes();
        org.jsoup.nodes.Attributes attributes11 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = xmlTreeBuilder0.processStartTag("", attributes11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            node8.setBaseUri("<?>");
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
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
        java.lang.String str41 = node40.baseUri();
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = node5.baseUri();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        int int11 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str16 = xmlDeclaration15.getWholeDeclaration();
        boolean boolean18 = xmlDeclaration15.hasAttr("hi!");
        java.lang.String str19 = xmlDeclaration15.nodeName();
        java.lang.String str20 = xmlDeclaration15.toString();
        boolean boolean22 = xmlDeclaration15.hasAttr("<?>");
        java.lang.String str23 = xmlDeclaration15.baseUri();
        boolean boolean25 = xmlDeclaration15.hasAttr("<!<?>>");
        java.lang.String str26 = xmlDeclaration15.name();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = xmlDeclaration15.siblingNodes();
        org.jsoup.nodes.Node node28 = xmlDeclaration15.clone();
        node28.setBaseUri("<!#declaration>");
        java.lang.String str32 = node28.absUrl("<!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node33 = xmlDeclaration3.before(node28);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#declaration" + "'", str19, "#declaration");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<?>" + "'", str20, "<?>");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.absUrl("<?>");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.parentNode();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = node8.childNodeSize();
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
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.attr("<?>");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str11 = xmlDeclaration10.getWholeDeclaration();
        boolean boolean13 = xmlDeclaration10.hasAttr("hi!");
        org.jsoup.nodes.Node node14 = xmlDeclaration10.previousSibling();
        java.lang.String str15 = xmlDeclaration10.getWholeDeclaration();
        org.jsoup.nodes.Node node17 = xmlDeclaration10.removeAttr("<!#declaration>");
        java.lang.String str18 = xmlDeclaration10.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = xmlDeclaration10.siblingNodes();
        java.lang.String str20 = xmlDeclaration10.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node21 = node6.after((org.jsoup.nodes.Node) xmlDeclaration10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str12 = xmlDeclaration11.getWholeDeclaration();
        int int13 = xmlDeclaration11.siblingIndex();
        java.lang.String str15 = xmlDeclaration11.attr("<?>");
        boolean boolean16 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = xmlDeclaration11.unwrap();
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
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, (-1), outputSettings11);
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable13, (int) (short) -1, outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlDeclaration3.siblingNodes();
        org.jsoup.select.NodeVisitor nodeVisitor41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = xmlDeclaration3.traverse(nodeVisitor41);
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
        org.junit.Assert.assertNotNull(nodeList40);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.removeAttr("<!<!#declaration>>");
        java.lang.String str14 = xmlDeclaration3.outerHtml();
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
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<?>" + "'", str14, "<?>");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.absUrl("<?>");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
        int int14 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.Node node15 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node15.previousSibling();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<?>", "<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        java.lang.String str4 = xmlDeclaration3.baseUri();
        java.lang.String str5 = xmlDeclaration3.outerHtml();
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<?>" + "'", str4, "<?>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
        java.lang.String str21 = xmlDeclaration16.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<!<?>>" + "'", str21, "<!<?>>");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str11 = xmlDeclaration3.attr("");
        java.lang.String str12 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.wrap("<?>");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration3.childNodesCopy();
        org.jsoup.nodes.Node node16 = xmlDeclaration3.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = node16.before("<!>");
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
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node34 = xmlDeclaration3.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
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
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.parent();
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.attr("hi!");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        java.lang.String str11 = node10.outerHtml();
        java.lang.String str12 = node10.outerHtml();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!#declaration>" + "'", str11, "<!#declaration>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!#declaration>" + "'", str12, "<!#declaration>");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        java.lang.Class<?> wildcardClass22 = xmlDeclaration3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 1, outputSettings11);
        int int13 = xmlDeclaration3.siblingIndex();
        java.lang.String str14 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("<!<?>>", "<?>", true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node4.attr("#declaration", "<?>");
        org.jsoup.nodes.Node node8 = node7.parent();
        org.jsoup.nodes.Node node9 = node7.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node9.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!>", "<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node4.attr("#declaration", "<?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node4.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        java.lang.Appendable appendable41 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings43 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration14.outerHtmlHead(appendable41, (int) 'a', outputSettings43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str6 = xmlDeclaration5.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes7 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = xmlTreeBuilder0.processStartTag("<!<?>>", attributes7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(attributes7);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node17 = xmlDeclaration3.after("#declaration");
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
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        org.jsoup.nodes.Node node17 = node16.nextSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration21 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean23 = xmlDeclaration21.equals((java.lang.Object) (byte) 0);
        java.lang.String str25 = xmlDeclaration21.attr("hi!");
        int int26 = xmlDeclaration21.childNodeSize();
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
        boolean boolean54 = xmlDeclaration21.hasSameValue((java.lang.Object) xmlDeclaration30);
        java.lang.String str56 = xmlDeclaration21.absUrl("<?>");
        java.lang.String str57 = xmlDeclaration21.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlDeclaration21.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node59 = node17.after((org.jsoup.nodes.Node) xmlDeclaration21);
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
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
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
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "<?>" + "'", str57, "<?>");
        org.junit.Assert.assertNotNull(nodeList58);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str11 = xmlDeclaration10.getWholeDeclaration();
        boolean boolean13 = xmlDeclaration10.hasAttr("hi!");
        java.lang.String str14 = xmlDeclaration10.nodeName();
        org.jsoup.nodes.Node node15 = xmlDeclaration10.nextSibling();
        java.lang.String str16 = xmlDeclaration10.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = xmlDeclaration10.childNodesCopy();
        java.lang.String str18 = xmlDeclaration10.toString();
        java.lang.String str19 = xmlDeclaration10.nodeName();
        org.jsoup.nodes.Node node21 = xmlDeclaration10.wrap("<!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#declaration" + "'", str14, "#declaration");
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<?>" + "'", str18, "<?>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#declaration" + "'", str19, "#declaration");
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.childNodesCopy();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node11.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration42 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str44 = xmlDeclaration42.absUrl("hi!");
        xmlDeclaration42.setBaseUri("#declaration");
        java.lang.String str47 = xmlDeclaration42.name();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node48 = xmlDeclaration14.after((org.jsoup.nodes.Node) xmlDeclaration42);
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "#declaration" + "'", str47, "#declaration");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.String str9 = xmlDeclaration3.toString();
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, (int) (short) 0, outputSettings12);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration17 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node18 = xmlDeclaration17.clone();
        node18.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = node18.siblingNodes();
        org.jsoup.nodes.Node node22 = node18.clone();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
            boolean boolean24 = xmlTreeBuilder0.processStartTag("<!<?>>", attributes23);
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
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
            java.lang.String str26 = document25.baseUri();
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
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.attr("hi!");
        java.lang.Appendable appendable10 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings12 = null;
        xmlDeclaration3.outerHtmlTail(appendable10, (int) (short) -1, outputSettings12);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        org.jsoup.select.NodeVisitor nodeVisitor19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = xmlDeclaration3.traverse(nodeVisitor19);
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
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        int int11 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Attributes attributes13 = xmlDeclaration3.attributes();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        xmlDeclaration3.setBaseUri("<!>");
        org.jsoup.nodes.Node node15 = xmlDeclaration3.attr("<!<!#declaration>>", "#declaration");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = node15.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str12 = xmlDeclaration11.getWholeDeclaration();
        int int13 = xmlDeclaration11.siblingIndex();
        java.lang.String str15 = xmlDeclaration11.attr("<?>");
        boolean boolean16 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration11);
        java.lang.Appendable appendable17 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings19 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable17, (int) (byte) 0, outputSettings19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        org.jsoup.nodes.Attributes attributes4 = xmlDeclaration3.attributes();
        java.lang.String str5 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.removeAttr("#declaration");
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<?>" + "'", str5, "<?>");
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes5 = xmlDeclaration3.attributes();
        boolean boolean7 = xmlDeclaration3.hasAttr("hi!");
        java.lang.Appendable appendable8 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings10 = null;
        xmlDeclaration3.outerHtmlTail(appendable8, (-1), outputSettings10);
        java.lang.String str12 = xmlDeclaration3.nodeName();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        org.jsoup.nodes.Document document9 = xmlDeclaration3.ownerDocument();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration13 = new org.jsoup.nodes.XmlDeclaration("", "<?>", true);
        java.lang.String str14 = xmlDeclaration13.toString();
        // The following exception was thrown during execution in test generation
        try {
            document9.replaceWith((org.jsoup.nodes.Node) xmlDeclaration13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!>" + "'", str14, "<!>");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str12 = xmlDeclaration11.getWholeDeclaration();
        int int13 = xmlDeclaration11.siblingIndex();
        java.lang.String str15 = xmlDeclaration11.attr("<?>");
        boolean boolean16 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration11);
        org.jsoup.nodes.Node node17 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = node17.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        node4.setBaseUri("");
        java.lang.String str8 = node4.attr("<!<?>>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str13 = xmlDeclaration12.getWholeDeclaration();
        java.lang.String str15 = xmlDeclaration12.absUrl("<?>");
        org.jsoup.nodes.Node node16 = xmlDeclaration12.parentNode();
        org.jsoup.nodes.Node node17 = xmlDeclaration12.parentNode();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = xmlDeclaration12.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = node4.after((org.jsoup.nodes.Node) xmlDeclaration12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = node5.attr("<!<!#declaration>>", "<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Attributes attributes2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = xmlTreeBuilder0.processStartTag("<!>", attributes2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean7 = xmlDeclaration5.equals((java.lang.Object) (byte) 0);
        java.lang.String str9 = xmlDeclaration5.attr("hi!");
        org.jsoup.nodes.Node node10 = xmlDeclaration5.clone();
        org.jsoup.nodes.Attributes attributes11 = node10.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = xmlTreeBuilder0.processStartTag("hi!", attributes11);
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
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration7 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str8 = xmlDeclaration7.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration7.attributes();
        boolean boolean11 = xmlDeclaration7.hasAttr("hi!");
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        xmlDeclaration7.outerHtmlTail(appendable12, (-1), outputSettings14);
        java.lang.String str16 = xmlDeclaration7.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node21 = xmlDeclaration20.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = xmlDeclaration20.childNodes();
        boolean boolean23 = xmlDeclaration7.hasSameValue((java.lang.Object) xmlDeclaration20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
        org.jsoup.select.NodeVisitor nodeVisitor51 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node52 = xmlDeclaration41.traverse(nodeVisitor51);
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
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
        // The following exception was thrown during execution in test generation
        try {
            node24.remove();
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
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
            org.jsoup.nodes.Node node28 = node27.parent();
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
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node39 = xmlDeclaration16.wrap("hi!");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "<!#declaration>" + "'", str34, "<!#declaration>");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(document36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
            org.jsoup.nodes.Node node40 = xmlDeclaration3.after("<!<!#declaration>>");
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
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.before("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<?>" + "'", str5, "<?>");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.nodeName();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable12, (int) (byte) 0, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#declaration" + "'", str11, "#declaration");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
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
        java.lang.Appendable appendable33 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings35 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable33, (int) (short) 10, outputSettings35);
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
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.parent();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.removeAttr("hi!");
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
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        node4.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = node4.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node4.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
            boolean boolean43 = xmlTreeBuilder0.processStartTag("<!#declaration>", attributes42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
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
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!<?>>", "<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.absUrl("<?>");
        java.lang.String str7 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = xmlDeclaration3.childNodes();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node13 = xmlDeclaration12.clone();
        java.lang.String str14 = xmlDeclaration12.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = xmlDeclaration12.siblingNodes();
        java.lang.String str16 = xmlDeclaration12.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str21 = xmlDeclaration20.getWholeDeclaration();
        int int22 = xmlDeclaration20.siblingIndex();
        java.lang.String str24 = xmlDeclaration20.attr("<?>");
        java.lang.String str25 = xmlDeclaration20.outerHtml();
        boolean boolean26 = xmlDeclaration12.hasSameValue((java.lang.Object) xmlDeclaration20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!<?>>" + "'", str14, "<!<?>>");
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!<?>>" + "'", str16, "<!<?>>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "<?>" + "'", str25, "<?>");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!<!#declaration>>", "<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.outerHtml();
        java.lang.String str8 = xmlDeclaration3.absUrl("<?>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str13 = xmlDeclaration12.getWholeDeclaration();
        boolean boolean15 = xmlDeclaration12.hasAttr("hi!");
        java.lang.String str16 = xmlDeclaration12.nodeName();
        org.jsoup.nodes.Node node17 = xmlDeclaration12.nextSibling();
        java.lang.String str18 = xmlDeclaration12.toString();
        org.jsoup.nodes.Node node19 = xmlDeclaration12.nextSibling();
        java.lang.String str20 = xmlDeclaration12.name();
        org.jsoup.nodes.Node node21 = xmlDeclaration12.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node22 = xmlDeclaration3.before(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<?>" + "'", str5, "<?>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<!<?>>" + "'", str6, "<!<?>>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<?>" + "'", str18, "<?>");
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = node10.siblingNodes();
        org.jsoup.nodes.Node node12 = node10.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = node12.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node4.attr("#declaration", "<?>");
        org.jsoup.nodes.Node node8 = node7.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
            boolean boolean24 = xmlTreeBuilder0.processStartTag("<!>", attributes23);
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
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = xmlDeclaration3.parentNode();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str12 = xmlDeclaration11.getWholeDeclaration();
        int int13 = xmlDeclaration11.siblingIndex();
        java.lang.String str15 = xmlDeclaration11.attr("<?>");
        boolean boolean16 = xmlDeclaration3.hasSameValue((java.lang.Object) xmlDeclaration11);
        java.lang.String str17 = xmlDeclaration11.name();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration11.remove();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.previousSibling();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!#declaration>");
        org.jsoup.nodes.Node node11 = node10.parentNode();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration15 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str16 = xmlDeclaration15.getWholeDeclaration();
        int int17 = xmlDeclaration15.siblingIndex();
        xmlDeclaration15.setBaseUri("<!<?>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node20 = node10.after((org.jsoup.nodes.Node) xmlDeclaration15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!#declaration>", "<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes7 = node6.attributes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        org.jsoup.nodes.Node node8 = xmlDeclaration3.parent();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str13 = xmlDeclaration12.getWholeDeclaration();
        boolean boolean15 = xmlDeclaration12.hasAttr("hi!");
        java.lang.String str16 = xmlDeclaration12.nodeName();
        java.lang.String str17 = xmlDeclaration12.toString();
        boolean boolean19 = xmlDeclaration12.hasAttr("<?>");
        java.lang.String str20 = xmlDeclaration12.baseUri();
        int int21 = xmlDeclaration12.siblingIndex();
        org.jsoup.nodes.Node node22 = xmlDeclaration12.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node23 = node8.after((org.jsoup.nodes.Node) xmlDeclaration12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#declaration" + "'", str16, "#declaration");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<?>" + "'", str17, "<?>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str9 = xmlDeclaration8.getWholeDeclaration();
        boolean boolean11 = xmlDeclaration8.hasAttr("hi!");
        java.lang.String str12 = xmlDeclaration8.nodeName();
        org.jsoup.nodes.Node node15 = xmlDeclaration8.attr("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = xmlDeclaration8.childNodes();
        int int17 = xmlDeclaration8.childNodeSize();
        org.jsoup.nodes.Node node18 = xmlDeclaration8.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node19 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<?>", "<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.removeAttr("<!<!#declaration>>");
        java.lang.Appendable appendable14 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings16 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable14, (int) (byte) 1, outputSettings16);
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
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes10 = xmlDeclaration3.attributes();
        java.lang.Class<?> wildcardClass11 = attributes10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
        java.lang.Class<?> wildcardClass16 = node14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!#declaration>", "<!<?>>", true);
        java.lang.String str5 = xmlDeclaration3.attr("<?>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node7 = xmlDeclaration3.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        int int5 = xmlDeclaration3.siblingIndex();
        xmlDeclaration3.setBaseUri("<!<?>>");
        int int8 = xmlDeclaration3.childNodeSize();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str6 = xmlDeclaration5.getWholeDeclaration();
        java.lang.String str8 = xmlDeclaration5.absUrl("<?>");
        java.lang.String str9 = xmlDeclaration5.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration5.childNodes();
        org.jsoup.nodes.Attributes attributes11 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = xmlTreeBuilder0.processStartTag("hi!", attributes11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration23 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str24 = xmlDeclaration23.getWholeDeclaration();
        org.jsoup.nodes.Node node25 = xmlDeclaration23.nextSibling();
        org.jsoup.nodes.Node node26 = xmlDeclaration23.previousSibling();
        java.lang.String str27 = xmlDeclaration23.name();
        int int28 = xmlDeclaration23.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration32 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str33 = xmlDeclaration32.getWholeDeclaration();
        boolean boolean35 = xmlDeclaration32.hasAttr("hi!");
        org.jsoup.nodes.Node node36 = xmlDeclaration32.clone();
        java.lang.String str38 = xmlDeclaration32.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList39 = xmlDeclaration32.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList40 = xmlDeclaration32.childNodes();
        boolean boolean41 = xmlDeclaration23.hasSameValue((java.lang.Object) nodeList40);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node42 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration23);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        int int4 = xmlDeclaration3.siblingIndex();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "", "<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
            org.jsoup.nodes.Node node40 = xmlDeclaration14.after("");
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
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str11 = xmlDeclaration3.absUrl("<!#declaration>");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = xmlDeclaration3.childNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<?>", "#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.attr("hi!");
        org.jsoup.nodes.Node node10 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = node11.previousSibling();
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
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        boolean boolean10 = xmlDeclaration3.hasAttr("<?>");
        java.lang.String str11 = xmlDeclaration3.baseUri();
        boolean boolean13 = xmlDeclaration3.hasAttr("<!<?>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node15 = xmlDeclaration3.wrap("");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = null;
        boolean boolean7 = xmlDeclaration3.equals(obj6);
        java.lang.String str9 = xmlDeclaration3.attr("<!>");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.siblingNodes();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!<?>>", "<!<?>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<?>", "<!<!#declaration>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "#declaration", "<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        org.jsoup.nodes.Node node16 = xmlDeclaration3.parent();
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
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = node10.attr("");
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
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = xmlDeclaration3.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<?>" + "'", str8, "<?>");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        java.lang.Class<?> wildcardClass19 = node18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
            int int14 = node13.childNodeSize();
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
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes5 = xmlDeclaration3.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node8 = xmlDeclaration3.before("#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.removeAttr("<!<!#declaration>>");
        java.lang.String str14 = xmlDeclaration3.toString();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration18 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str19 = xmlDeclaration18.getWholeDeclaration();
        boolean boolean21 = xmlDeclaration18.hasAttr("hi!");
        java.lang.String str22 = xmlDeclaration18.nodeName();
        org.jsoup.nodes.Node node23 = xmlDeclaration18.nextSibling();
        java.lang.String str24 = xmlDeclaration18.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = xmlDeclaration18.childNodesCopy();
        java.lang.Appendable appendable26 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings28 = null;
        xmlDeclaration18.outerHtmlTail(appendable26, (int) (short) 100, outputSettings28);
        org.jsoup.nodes.Node node31 = xmlDeclaration18.removeAttr("<!#declaration>");
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
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<?>" + "'", str14, "<?>");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#declaration" + "'", str22, "#declaration");
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = node42.after("#declaration");
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
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.previousSibling();
        java.lang.String str8 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.removeAttr("<!#declaration>");
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node12 = xmlDeclaration3.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<?>>", "<!<?>>", true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = xmlDeclaration3.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration10 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str11 = xmlDeclaration10.getWholeDeclaration();
        boolean boolean13 = xmlDeclaration10.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = xmlDeclaration10.childNodes();
        java.lang.String str15 = xmlDeclaration10.nodeName();
        java.lang.String str16 = xmlDeclaration10.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration20 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean22 = xmlDeclaration20.equals((java.lang.Object) (byte) 0);
        java.lang.String str24 = xmlDeclaration20.attr("hi!");
        org.jsoup.nodes.Node node25 = xmlDeclaration20.clone();
        boolean boolean26 = xmlDeclaration10.hasSameValue((java.lang.Object) node25);
        xmlDeclaration10.setBaseUri("<!<!#declaration>>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node29 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<?>" + "'", str16, "<?>");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<?>>", "<!<!#declaration>>", true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node5 = xmlDeclaration3.after("<!#declaration>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "<!#declaration>", "<!<!#declaration>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.siblingNodes();
        java.lang.String str7 = xmlDeclaration3.outerHtml();
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!<?>>" + "'", str7, "<!<?>>");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.nextSibling();
        java.lang.String str11 = xmlDeclaration3.toString();
        int int12 = xmlDeclaration3.childNodeSize();
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.traverse(nodeVisitor13);
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
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.lang.String str11 = xmlDeclaration3.name();
        java.lang.String str13 = xmlDeclaration3.attr("<?>");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.removeAttr("<!<!#declaration>>");
        java.lang.String str14 = xmlDeclaration3.outerHtml();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node16 = xmlDeclaration3.after("hi!");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<?>" + "'", str14, "<?>");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
            org.jsoup.nodes.Node node18 = xmlDeclaration3.before("<?>");
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
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.previousSibling();
        java.lang.String str7 = xmlDeclaration3.name();
        xmlDeclaration3.setBaseUri("<!>");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node11 = xmlDeclaration3.before("<?>");
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
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.attr("hi!", "hi!");
        int int11 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.previousSibling();
        xmlDeclaration3.setBaseUri("hi!");
        java.lang.String str15 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration19 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str20 = xmlDeclaration19.getWholeDeclaration();
        org.jsoup.nodes.Attributes attributes21 = xmlDeclaration19.attributes();
        boolean boolean23 = xmlDeclaration19.hasAttr("hi!");
        java.lang.Appendable appendable24 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings26 = null;
        xmlDeclaration19.outerHtmlTail(appendable24, (-1), outputSettings26);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node28 = xmlDeclaration3.after((org.jsoup.nodes.Node) xmlDeclaration19);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<?>" + "'", str15, "<?>");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "", "<!<!#declaration>>", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.io.InputStream inputStream0 = null;
        org.jsoup.parser.Parser parser3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = org.jsoup.helper.DataUtil.load(inputStream0, "", "", parser3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node40 = xmlDeclaration12.after("");
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
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str8 = xmlDeclaration3.name();
        java.lang.String str9 = xmlDeclaration3.nodeName();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration14 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str15 = xmlDeclaration14.getWholeDeclaration();
        boolean boolean17 = xmlDeclaration14.hasAttr("hi!");
        java.lang.String str18 = xmlDeclaration14.nodeName();
        java.lang.String str19 = xmlDeclaration14.toString();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#declaration" + "'", str8, "#declaration");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#declaration" + "'", str9, "#declaration");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#declaration" + "'", str18, "#declaration");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<?>" + "'", str19, "<?>");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = xmlDeclaration3.siblingNodes();
        java.lang.String str7 = xmlDeclaration3.outerHtml();
        int int8 = xmlDeclaration3.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node13 = xmlDeclaration12.clone();
        java.lang.String str14 = xmlDeclaration12.toString();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!<?>>" + "'", str7, "<!<?>>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!<?>>" + "'", str14, "<!<?>>");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(file0, "<!>", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = null;
        boolean boolean7 = xmlDeclaration3.equals(obj6);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = xmlDeclaration3.before("<?>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        java.lang.String str5 = xmlDeclaration3.toString();
        org.jsoup.nodes.Document document6 = xmlDeclaration3.ownerDocument();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList7 = document6.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<!<?>>" + "'", str5, "<!<?>>");
        org.junit.Assert.assertNull(document6);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str11 = xmlDeclaration3.attr("");
        java.lang.String str12 = xmlDeclaration3.baseUri();
        java.lang.Class<?> wildcardClass13 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        java.lang.Appendable appendable20 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings22 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable20, (int) (byte) 1, outputSettings22);
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
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        java.lang.String str6 = xmlDeclaration3.baseUri();
        java.lang.String str7 = xmlDeclaration3.outerHtml();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration11 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str12 = xmlDeclaration11.getWholeDeclaration();
        boolean boolean14 = xmlDeclaration11.hasAttr("hi!");
        java.lang.String str15 = xmlDeclaration11.nodeName();
        java.lang.String str16 = xmlDeclaration11.toString();
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.replaceWith((org.jsoup.nodes.Node) xmlDeclaration11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<?>" + "'", str6, "<?>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<!#declaration>" + "'", str7, "<!#declaration>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#declaration" + "'", str15, "#declaration");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<?>" + "'", str16, "<?>");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.lang.String str11 = xmlDeclaration3.name();
        java.lang.String str13 = xmlDeclaration3.attr("<?>");
        java.lang.Class<?> wildcardClass14 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        xmlDeclaration3.setBaseUri("#declaration");
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        org.jsoup.nodes.Document document10 = xmlDeclaration3.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = xmlDeclaration3.siblingNodes();
        org.jsoup.nodes.Document document12 = xmlDeclaration3.ownerDocument();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", true);
        java.lang.Class<?> wildcardClass4 = xmlDeclaration3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        java.lang.String str8 = xmlDeclaration3.toString();
        java.lang.String str9 = xmlDeclaration3.toString();
        java.lang.String str10 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Attributes attributes12 = node11.attributes();
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
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("hi!");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.parent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = node6.hasAttr("<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        org.jsoup.nodes.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node18 = xmlDeclaration3.before(node17);
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
        org.junit.Assert.assertNotNull(attributes16);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        java.lang.String str11 = xmlDeclaration3.toString();
        java.lang.String str12 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node14 = xmlDeclaration3.wrap("<!>");
        java.lang.Class<?> wildcardClass15 = xmlDeclaration3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#declaration" + "'", str7, "#declaration");
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<?>" + "'", str11, "<?>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#declaration" + "'", str12, "#declaration");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!<?>>", "<!<?>>", true);
        java.lang.Class<?> wildcardClass4 = xmlDeclaration3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        int int4 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration8 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration8.childNodesCopy();
        boolean boolean10 = xmlDeclaration3.equals((java.lang.Object) xmlDeclaration8);
        java.lang.String str11 = xmlDeclaration8.toString();
        java.lang.Appendable appendable12 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings14 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration8.outerHtmlHead(appendable12, (int) (short) 1, outputSettings14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<!#declaration>" + "'", str11, "<!#declaration>");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "hi!", "<!>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 1, outputSettings11);
        java.lang.Appendable appendable13 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings15 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable13, (-1), outputSettings15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "hi!", true);
        org.jsoup.nodes.Node node4 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node7 = node4.attr("#declaration", "<?>");
        org.jsoup.nodes.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node9 = node7.after(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration5 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str6 = xmlDeclaration5.getWholeDeclaration();
        boolean boolean8 = xmlDeclaration5.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration5.childNodes();
        java.lang.String str10 = xmlDeclaration5.nodeName();
        org.jsoup.nodes.Attributes attributes11 = xmlDeclaration5.attributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = xmlTreeBuilder0.processStartTag("<!<?>>", attributes11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList16 = node15.childNodes();
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
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node44 = node24.before("<!<?>>");
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
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        java.lang.Appendable appendable35 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings37 = null;
        // The following exception was thrown during execution in test generation
        try {
            xmlDeclaration3.outerHtmlHead(appendable35, 1, outputSettings37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        java.lang.Appendable appendable36 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings38 = null;
        xmlDeclaration3.outerHtmlTail(appendable36, 1, outputSettings38);
        org.jsoup.nodes.XmlDeclaration xmlDeclaration43 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str45 = xmlDeclaration43.absUrl("hi!");
        xmlDeclaration43.setBaseUri("#declaration");
        java.lang.String str49 = xmlDeclaration43.absUrl("hi!");
        org.jsoup.nodes.Document document50 = xmlDeclaration43.ownerDocument();
        xmlDeclaration43.setBaseUri("<!>");
        org.jsoup.nodes.Node node55 = xmlDeclaration43.attr("<!<!#declaration>>", "#declaration");
        org.jsoup.nodes.Node node56 = node55.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node57 = xmlDeclaration3.after(node56);
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
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(document50);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNull(node56);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.clone();
        java.lang.String str9 = xmlDeclaration3.absUrl("hi!");
        org.jsoup.nodes.Node node11 = xmlDeclaration3.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node13 = xmlDeclaration3.childNode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = xmlDeclaration3.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodes();
        java.lang.String str11 = xmlDeclaration3.name();
        org.jsoup.nodes.Node node12 = xmlDeclaration3.nextSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = node12.before("<!<?>>");
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
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        org.jsoup.select.NodeVisitor nodeVisitor23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node24 = node22.traverse(nodeVisitor23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.nextSibling();
        java.lang.String str11 = xmlDeclaration3.getWholeDeclaration();
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
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = org.jsoup.helper.DataUtil.load(inputStream0, "<!#declaration>", "#declaration");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str5 = xmlDeclaration3.baseUri();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration9 = new org.jsoup.nodes.XmlDeclaration("#declaration", "<?>", true);
        java.lang.String str11 = xmlDeclaration9.absUrl("hi!");
        xmlDeclaration9.setBaseUri("#declaration");
        java.lang.String str15 = xmlDeclaration9.absUrl("hi!");
        java.lang.String str17 = xmlDeclaration9.attr("");
        java.lang.String str18 = xmlDeclaration9.getWholeDeclaration();
        org.jsoup.nodes.Node node20 = xmlDeclaration9.wrap("<?>");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = xmlDeclaration9.childNodesCopy();
        boolean boolean23 = xmlDeclaration9.hasAttr("<?>");
        org.jsoup.nodes.Node node24 = xmlDeclaration9.previousSibling();
        java.lang.String str25 = xmlDeclaration9.getWholeDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node26 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#declaration" + "'", str18, "#declaration");
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "#declaration" + "'", str25, "#declaration");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        java.lang.String str6 = xmlDeclaration3.absUrl("<?>");
        org.jsoup.nodes.Node node7 = xmlDeclaration3.parentNode();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList8 = node7.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<!#declaration>", "<!<?>>", true);
        java.lang.String str5 = xmlDeclaration3.absUrl("<!<!#declaration>>");
        org.jsoup.nodes.Node node8 = xmlDeclaration3.attr("<?>", "<!#declaration>");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration12 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        java.util.List<org.jsoup.nodes.Node> nodeList13 = xmlDeclaration12.siblingNodes();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node14 = xmlDeclaration3.before((org.jsoup.nodes.Node) xmlDeclaration12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        org.jsoup.nodes.Node node46 = xmlDeclaration44.nextSibling();
        org.jsoup.nodes.Node node47 = xmlDeclaration44.previousSibling();
        java.lang.String str48 = xmlDeclaration44.name();
        int int49 = xmlDeclaration44.childNodeSize();
        org.jsoup.nodes.XmlDeclaration xmlDeclaration53 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str54 = xmlDeclaration53.getWholeDeclaration();
        boolean boolean56 = xmlDeclaration53.hasAttr("hi!");
        org.jsoup.nodes.Node node57 = xmlDeclaration53.clone();
        java.lang.String str59 = xmlDeclaration53.absUrl("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList60 = xmlDeclaration53.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList61 = xmlDeclaration53.childNodes();
        boolean boolean62 = xmlDeclaration44.hasSameValue((java.lang.Object) nodeList61);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node63 = node40.after((org.jsoup.nodes.Node) xmlDeclaration44);
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
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(nodeList60);
        org.junit.Assert.assertNotNull(nodeList61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("<?>", "<?>", true);
        java.lang.String str5 = xmlDeclaration3.attr("<?>");
        org.jsoup.nodes.Node node6 = xmlDeclaration3.clone();
        org.jsoup.nodes.Node node8 = node6.removeAttr("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node10 = node6.before("<!<!#declaration>>");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = xmlDeclaration3.childNodes();
        java.lang.String str8 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Attributes attributes9 = xmlDeclaration3.attributes();
        org.jsoup.nodes.Node node10 = xmlDeclaration3.previousSibling();
        org.jsoup.nodes.Node node11 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = node11.baseUri();
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
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        boolean boolean5 = xmlDeclaration3.equals((java.lang.Object) (byte) 0);
        java.lang.String str7 = xmlDeclaration3.attr("hi!");
        int int8 = xmlDeclaration3.childNodeSize();
        java.lang.Appendable appendable9 = null;
        org.jsoup.nodes.Document.OutputSettings outputSettings11 = null;
        xmlDeclaration3.outerHtmlTail(appendable9, 1, outputSettings11);
        int int13 = xmlDeclaration3.siblingIndex();
        boolean boolean15 = xmlDeclaration3.equals((java.lang.Object) 1.0d);
        java.lang.String str17 = xmlDeclaration3.absUrl("<!>");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.getWholeDeclaration();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = xmlDeclaration3.childNodesCopy();
        int int11 = xmlDeclaration3.siblingIndex();
        org.jsoup.nodes.Node node13 = xmlDeclaration3.removeAttr("hi!");
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
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        java.lang.Class<?> wildcardClass37 = node36.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        org.jsoup.nodes.XmlDeclaration xmlDeclaration28 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str29 = xmlDeclaration28.getWholeDeclaration();
        boolean boolean31 = xmlDeclaration28.hasAttr("hi!");
        java.lang.String str32 = xmlDeclaration28.nodeName();
        org.jsoup.nodes.Node node33 = xmlDeclaration28.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = xmlDeclaration28.childNodesCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node35 = xmlDeclaration16.before((org.jsoup.nodes.Node) xmlDeclaration28);
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#declaration" + "'", str32, "#declaration");
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(nodeList34);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        org.jsoup.nodes.Node node25 = xmlDeclaration3.previousSibling();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Node node27 = xmlDeclaration3.after("<!<?>>");
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
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        org.jsoup.nodes.Node node5 = xmlDeclaration3.nextSibling();
        org.jsoup.nodes.Node node6 = xmlDeclaration3.previousSibling();
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
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jsoup.nodes.XmlDeclaration xmlDeclaration3 = new org.jsoup.nodes.XmlDeclaration("", "", false);
        java.lang.String str4 = xmlDeclaration3.getWholeDeclaration();
        boolean boolean6 = xmlDeclaration3.hasAttr("hi!");
        java.lang.String str7 = xmlDeclaration3.nodeName();
        org.jsoup.nodes.Node node8 = xmlDeclaration3.nextSibling();
        java.lang.String str9 = xmlDeclaration3.toString();
        java.lang.String str10 = xmlDeclaration3.nodeName();
        java.lang.String str12 = xmlDeclaration3.attr("<!<?>>");
        int int13 = xmlDeclaration3.childNodeSize();
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
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<?>" + "'", str9, "<?>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#declaration" + "'", str10, "#declaration");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
            java.util.List<org.jsoup.nodes.Node> nodeList21 = node20.childNodes();
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
}

