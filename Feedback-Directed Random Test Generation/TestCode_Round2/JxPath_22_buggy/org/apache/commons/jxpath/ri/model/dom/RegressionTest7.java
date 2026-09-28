package org.apache.commons.jxpath.ri.model.dom;

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
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.getValuePointer();
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = nodePointer6.createPath(jXPathContext7);
        org.apache.commons.jxpath.JXPathContext jXPathContext9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer8.createPath(jXPathContext9);
        org.w3c.dom.Node node11 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer12 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer10, node11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName13, (java.lang.Object) 100.0d, locale15);
        java.lang.Object obj17 = nodePointer16.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = nodePointer16.getValuePointer();
        nodePointer18.setIndex((int) (short) -1);
        nodePointer18.setIndex((int) (short) 1);
        boolean boolean23 = nodePointer18.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = nodePointer18.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = nodePointer18.getImmediateValuePointer();
        boolean boolean26 = nodePointer25.isRoot();
        nodePointer25.setIndex((int) (byte) 1);
        org.apache.commons.jxpath.ri.QName qName29 = null;
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName29, (java.lang.Object) 100.0d, locale31);
        java.lang.Object obj33 = nodePointer32.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = nodePointer32.getValuePointer();
        nodePointer34.setIndex((int) (short) -1);
        java.lang.Object obj37 = nodePointer34.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = nodePointer34.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName39 = null;
        org.apache.commons.jxpath.ri.QName qName40 = null;
        java.util.Locale locale42 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer43 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName40, (java.lang.Object) 100.0d, locale42);
        java.lang.Object obj44 = nodePointer43.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer45 = nodePointer43.getValuePointer();
        boolean boolean46 = nodePointer45.isNode();
        nodePointer45.printPointerChain();
        boolean boolean48 = nodePointer45.isRoot();
        nodePointer45.printPointerChain();
        org.apache.commons.jxpath.JXPathContext jXPathContext50 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer51 = nodePointer45.createPath(jXPathContext50);
        org.apache.commons.jxpath.ri.QName qName52 = null;
        org.apache.commons.jxpath.ri.QName qName53 = null;
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer56 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName53, (java.lang.Object) 100.0d, locale55);
        java.lang.Object obj57 = nodePointer56.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer58 = nodePointer56.getValuePointer();
        nodePointer58.setIndex((int) (short) -1);
        java.lang.Object obj61 = nodePointer58.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer62 = nodePointer58.getValuePointer();
        boolean boolean63 = nodePointer58.isContainer();
        java.lang.Object obj64 = nodePointer58.getNodeValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer65 = nodePointer58.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer66 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer45, qName52, (java.lang.Object) nodePointer65);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer67 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer38, qName39, (java.lang.Object) nodePointer66);
        java.lang.Object obj68 = nodePointer38.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer69 = nodePointer38.getParent();
        // The following exception was thrown during execution in test generation
        try {
            int int70 = dOMNodePointer12.compareChildNodePointers(nodePointer25, nodePointer38);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class org.w3c.dom.Node (java.lang.Double is in module java.base of loader 'bootstrap'; org.w3c.dom.Node is in module java.xml of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "100");
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertNotNull(nodePointer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(nodePointer32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "100");
        org.junit.Assert.assertNotNull(nodePointer34);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0d + "'", obj37, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer38);
        org.junit.Assert.assertNotNull(nodePointer43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "100");
        org.junit.Assert.assertNotNull(nodePointer45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(nodePointer51);
        org.junit.Assert.assertNotNull(nodePointer56);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertEquals(obj57.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj57), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj57), "100");
        org.junit.Assert.assertNotNull(nodePointer58);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + 100.0d + "'", obj61, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 100.0d + "'", obj64, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer65);
        org.junit.Assert.assertNotNull(nodePointer66);
        org.junit.Assert.assertNotNull(nodePointer67);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertEquals(obj68.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj68), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj68), "100");
        org.junit.Assert.assertNull(nodePointer69);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) '#', locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName4, (java.lang.Object) 100.0d, locale6);
        nodePointer7.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver10 = null;
        nodePointer7.setNamespaceResolver(namespaceResolver10);
        int int12 = nodePointer3.compareTo((java.lang.Object) nodePointer7);
        java.lang.Object obj13 = nodePointer3.getNodeValue();
        java.lang.String str14 = nodePointer3.toString();
        int int15 = nodePointer3.getIndex();
        org.w3c.dom.Node node16 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer17 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer3, node16);
        org.apache.commons.jxpath.JXPathContext jXPathContext18 = null;
        org.apache.commons.jxpath.ri.QName qName19 = null;
        org.apache.commons.jxpath.ri.QName qName21 = null;
        org.apache.commons.jxpath.ri.QName qName22 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName22, (java.lang.Object) 100.0d, locale24);
        nodePointer25.setAttribute(false);
        java.lang.Object obj28 = nodePointer25.getRootNode();
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName21, obj28, locale29);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = nodePointer30.getImmediateValuePointer();
        java.lang.Throwable throwable32 = null;
        nodePointer31.handle(throwable32);
        java.lang.Throwable throwable34 = null;
        org.apache.commons.jxpath.ri.QName qName35 = null;
        java.util.Locale locale37 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName35, (java.lang.Object) 100.0d, locale37);
        java.lang.Object obj39 = nodePointer38.clone();
        java.lang.Object obj40 = nodePointer38.clone();
        java.lang.Object obj41 = nodePointer38.getNodeValue();
        nodePointer38.setAttribute(true);
        nodePointer38.setIndex((int) '4');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer46 = nodePointer38.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer47 = nodePointer46.getParent();
        nodePointer31.handle(throwable34, nodePointer46);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer49 = dOMNodePointer17.createChild(jXPathContext18, qName19, (int) '4', (java.lang.Object) nodePointer31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '#' + "'", obj13, '#');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/" + "'", str14, "/");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2147483648) + "'", int15 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer25);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0d + "'", obj28, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer30);
        org.junit.Assert.assertNotNull(nodePointer31);
        org.junit.Assert.assertNotNull(nodePointer38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "100");
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj40), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "100");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0d + "'", obj41, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer46);
        org.junit.Assert.assertNull(nodePointer47);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "100");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = dOMNodePointer3.isLanguage("/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        java.lang.Object obj5 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.getParent();
        java.lang.Object obj7 = nodePointer3.getNode();
        org.apache.commons.jxpath.JXPathContext jXPathContext8 = null;
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName10, (java.lang.Object) 100.0d, locale12);
        java.lang.Object obj14 = nodePointer13.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = nodePointer13.getValuePointer();
        int int16 = nodePointer13.getIndex();
        java.lang.Object obj17 = nodePointer13.clone();
        java.lang.String str18 = nodePointer13.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet20 = nodePointer3.getNodeSetByKey(jXPathContext8, "<<unknown namespace>>", (java.lang.Object) nodePointer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "100");
        org.junit.Assert.assertNull(nodePointer6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "100");
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2147483648) + "'", int16 == (-2147483648));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "100");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100" + "'", str18, "100");
        org.junit.Assert.assertNotNull(nodePointer19);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        boolean boolean6 = nodePointer5.isNode();
        nodePointer5.printPointerChain();
        boolean boolean8 = nodePointer5.isRoot();
        nodePointer5.printPointerChain();
        org.apache.commons.jxpath.JXPathContext jXPathContext10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer5.createPath(jXPathContext10);
        org.apache.commons.jxpath.ri.QName qName12 = null;
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName13, (java.lang.Object) 100.0d, locale15);
        java.lang.Object obj17 = nodePointer16.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = nodePointer16.getValuePointer();
        nodePointer18.setIndex((int) (short) -1);
        java.lang.Object obj21 = nodePointer18.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = nodePointer18.getValuePointer();
        boolean boolean23 = nodePointer18.isContainer();
        java.lang.Object obj24 = nodePointer18.getNodeValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = nodePointer18.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer26 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer5, qName12, (java.lang.Object) nodePointer25);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = nodePointer5.getImmediateValuePointer();
        java.lang.Throwable throwable28 = null;
        org.apache.commons.jxpath.ri.QName qName29 = null;
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName29, (java.lang.Object) 100.0d, locale31);
        java.lang.Object obj33 = nodePointer32.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = nodePointer32.getValuePointer();
        int int35 = nodePointer32.getIndex();
        java.lang.Object obj36 = nodePointer32.clone();
        java.lang.Object obj37 = nodePointer32.getNodeValue();
        java.lang.Object obj38 = nodePointer32.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer39 = nodePointer32.getValuePointer();
        nodePointer39.setIndex((int) '#');
        nodePointer5.handle(throwable28, nodePointer39);
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler43 = null;
        nodePointer5.setExceptionHandler(exceptionHandler43);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "100");
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0d + "'", obj24, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer25);
        org.junit.Assert.assertNotNull(nodePointer26);
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertNotNull(nodePointer32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "100");
        org.junit.Assert.assertNotNull(nodePointer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-2147483648) + "'", int35 == (-2147483648));
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "100");
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0d + "'", obj37, 100.0d);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "100");
        org.junit.Assert.assertNotNull(nodePointer39);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler5 = null;
        nodePointer3.setExceptionHandler(exceptionHandler5);
        java.lang.Throwable throwable7 = null;
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName8, (java.lang.Object) 100.0d, locale10);
        java.lang.Object obj12 = nodePointer11.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer11.getValuePointer();
        boolean boolean14 = nodePointer13.isNode();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver15 = null;
        nodePointer13.setNamespaceResolver(namespaceResolver15);
        java.lang.Object obj17 = nodePointer13.clone();
        nodePointer3.handle(throwable7, nodePointer13);
        java.lang.Object obj19 = nodePointer3.getNodeValue();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver20 = null;
        nodePointer3.setNamespaceResolver(namespaceResolver20);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "100");
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "100");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 100.0d, locale3);
        nodePointer4.setAttribute(false);
        java.lang.Object obj7 = nodePointer4.getRootNode();
        int int8 = nodePointer4.getIndex();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = nodePointer4.getValuePointer();
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) nodePointer9, locale10);
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler12 = null;
        nodePointer9.setExceptionHandler(exceptionHandler12);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer9);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = nodePointer9.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer15);
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2147483648) + "'", int8 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertNotNull(nodePointer16);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 100.0d, locale8);
        java.lang.Object obj10 = nodePointer9.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer9.getValuePointer();
        int int12 = nodePointer9.getIndex();
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        boolean boolean14 = nodePointer9.isContainer();
        nodePointer9.printPointerChain();
        org.apache.commons.jxpath.ri.QName qName16 = null;
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName17, (java.lang.Object) 100.0d, locale19);
        java.lang.Object obj21 = nodePointer20.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = nodePointer20.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName23 = null;
        org.apache.commons.jxpath.ri.QName qName24 = null;
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName24, (java.lang.Object) 100.0d, locale26);
        nodePointer27.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer20, qName23, (java.lang.Object) nodePointer27);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer30);
        java.util.Locale locale32 = nodePointer31.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = nodePointer31.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName34 = null;
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName34, (java.lang.Object) 100.0d, locale36);
        boolean boolean38 = nodePointer37.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer39 = nodePointer37.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer40 = nodePointer37.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer41 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer40);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = nodePointer41.getImmediateParentPointer();
        int int43 = nodePointer33.compareTo((java.lang.Object) nodePointer41);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer44 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer9, qName16, (java.lang.Object) nodePointer41);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "100");
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2147483648) + "'", int12 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "100");
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertNotNull(nodePointer30);
        org.junit.Assert.assertNotNull(nodePointer31);
        org.junit.Assert.assertNull(locale32);
        org.junit.Assert.assertNotNull(nodePointer33);
        org.junit.Assert.assertNotNull(nodePointer37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(nodePointer39);
        org.junit.Assert.assertNotNull(nodePointer40);
        org.junit.Assert.assertNotNull(nodePointer41);
        org.junit.Assert.assertNull(nodePointer42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(nodePointer44);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        int int6 = nodePointer3.getIndex();
        java.lang.Object obj7 = nodePointer3.clone();
        java.lang.Object obj8 = nodePointer3.getNode();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver9 = null;
        nodePointer3.setNamespaceResolver(namespaceResolver9);
        java.lang.Object obj11 = nodePointer3.getNode();
        java.lang.Object obj12 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer3.getImmediateValuePointer();
        boolean boolean14 = nodePointer13.isNode();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2147483648) + "'", int6 == (-2147483648));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "100");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "100");
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        nodePointer5.setAttribute(true);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = nodePointer5.getImmediateValuePointer();
        boolean boolean9 = nodePointer8.isContainer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer8.getValuePointer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver11 = null;
        nodePointer10.setNamespaceResolver(namespaceResolver11);
        java.lang.Object obj13 = nodePointer10.clone();
        int int14 = nodePointer10.getIndex();
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler15 = null;
        nodePointer10.setExceptionHandler(exceptionHandler15);
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler17 = null;
        nodePointer10.setExceptionHandler(exceptionHandler17);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "100");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2147483648) + "'", int14 == (-2147483648));
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        nodePointer3.setAttribute(false);
        java.lang.Object obj6 = nodePointer3.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer7);
        nodePointer7.printPointerChain();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer7.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer7.getValuePointer();
        boolean boolean12 = nodePointer7.isRoot();
        boolean boolean13 = nodePointer7.isAttribute();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = nodePointer7.getValuePointer();
        java.lang.Object obj15 = nodePointer7.clone();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "100");
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        boolean boolean6 = nodePointer5.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer5.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer7);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = nodePointer7.getValuePointer();
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler10 = null;
        nodePointer9.setExceptionHandler(exceptionHandler10);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertNotNull(nodePointer9);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        boolean boolean6 = nodePointer5.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer5.getValuePointer();
        java.lang.Throwable throwable8 = null;
        nodePointer5.handle(throwable8);
        java.lang.Throwable throwable10 = null;
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName11, (java.lang.Object) 100.0d, locale13);
        nodePointer14.setAttribute(false);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = nodePointer14.getParent();
        java.lang.Object obj18 = nodePointer14.getNodeValue();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver19 = null;
        nodePointer14.setNamespaceResolver(namespaceResolver19);
        boolean boolean21 = nodePointer14.isAttribute();
        java.lang.String str22 = nodePointer14.toString();
        boolean boolean23 = nodePointer14.isNode();
        nodePointer5.handle(throwable10, nodePointer14);
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler25 = null;
        nodePointer5.setExceptionHandler(exceptionHandler25);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = nodePointer5.getValuePointer();
        org.w3c.dom.Node node28 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer29 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer5, node28);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.QName qName30 = dOMNodePointer29.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertNull(nodePointer17);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "100" + "'", str22, "100");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(nodePointer27);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        boolean boolean6 = nodePointer5.isNode();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver7 = null;
        nodePointer5.setNamespaceResolver(namespaceResolver7);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver9 = null;
        nodePointer5.setNamespaceResolver(namespaceResolver9);
        java.lang.Throwable throwable11 = null;
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName12, (java.lang.Object) 100.0d, locale14);
        java.lang.Object obj16 = nodePointer15.clone();
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler17 = null;
        nodePointer15.setExceptionHandler(exceptionHandler17);
        nodePointer5.handle(throwable11, nodePointer15);
        java.lang.Object obj20 = nodePointer15.getNodeValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = nodePointer15.getImmediateParentPointer();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "100");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
        org.junit.Assert.assertNull(nodePointer21);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        nodePointer3.setAttribute(false);
        java.lang.Object obj6 = nodePointer3.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer7);
        org.w3c.dom.Node node9 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer7, node9);
        org.apache.commons.jxpath.JXPathContext jXPathContext11 = null;
        org.apache.commons.jxpath.ri.QName qName12 = null;
        org.apache.commons.jxpath.ri.QName qName14 = null;
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName15, (java.lang.Object) 100.0d, locale17);
        java.lang.Object obj19 = nodePointer18.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = nodePointer18.getValuePointer();
        nodePointer20.setAttribute(true);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = nodePointer20.getImmediateValuePointer();
        boolean boolean24 = nodePointer23.isContainer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = nodePointer23.getValuePointer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver26 = null;
        nodePointer25.setNamespaceResolver(namespaceResolver26);
        java.lang.Object obj28 = nodePointer25.clone();
        int int29 = nodePointer25.getIndex();
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler30 = null;
        nodePointer25.setExceptionHandler(exceptionHandler30);
        java.lang.String str32 = nodePointer25.toString();
        org.apache.commons.jxpath.ri.QName qName33 = null;
        org.apache.commons.jxpath.ri.QName qName34 = null;
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName34, (java.lang.Object) 100.0d, locale36);
        java.lang.Object obj38 = nodePointer37.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer39 = nodePointer37.getValuePointer();
        boolean boolean40 = nodePointer39.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer41 = nodePointer39.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = nodePointer41.getImmediateParentPointer();
        nodePointer41.setIndex((int) (short) 10);
        boolean boolean45 = nodePointer41.isNode();
        java.util.Locale locale46 = nodePointer41.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer47 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer25, qName33, (java.lang.Object) nodePointer41);
        java.util.Locale locale48 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer49 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName14, (java.lang.Object) nodePointer47, locale48);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer50 = dOMNodePointer10.createChild(jXPathContext11, qName12, (int) (short) 0, (java.lang.Object) qName14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "100");
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodePointer25);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "100");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-2147483648) + "'", int29 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "100" + "'", str32, "100");
        org.junit.Assert.assertNotNull(nodePointer37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "100");
        org.junit.Assert.assertNotNull(nodePointer39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(nodePointer41);
        org.junit.Assert.assertNull(nodePointer42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(locale46);
        org.junit.Assert.assertNotNull(nodePointer47);
        org.junit.Assert.assertNotNull(nodePointer49);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 100.0d, locale3);
        java.lang.Object obj5 = nodePointer4.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer4.getValuePointer();
        int int7 = nodePointer4.getIndex();
        java.lang.Object obj8 = nodePointer4.clone();
        java.lang.Object obj9 = nodePointer4.getNodeValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer4);
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) nodePointer4, locale11);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer12);
        org.apache.commons.jxpath.JXPathContext jXPathContext14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = nodePointer12.createPath(jXPathContext14);
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "100");
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2147483648) + "'", int7 == (-2147483648));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "100");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0d + "'", obj9, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertNotNull(nodePointer15);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        boolean boolean6 = nodePointer5.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer5.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = nodePointer7.getImmediateParentPointer();
        int int9 = nodePointer7.getIndex();
        org.apache.commons.jxpath.JXPathContext jXPathContext10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer7.createPath(jXPathContext10);
        org.apache.commons.jxpath.JXPathContext jXPathContext12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer11.createPath(jXPathContext12);
        java.lang.Object obj14 = nodePointer11.getNode();
        nodePointer11.setAttribute(true);
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = null;
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName18, (java.lang.Object) 100.0d, locale20);
        java.lang.Object obj22 = nodePointer21.clone();
        java.lang.Throwable throwable23 = null;
        nodePointer21.handle(throwable23);
        boolean boolean25 = nodePointer21.isRoot();
        boolean boolean26 = nodePointer21.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = nodePointer21.getImmediateParentPointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = nodePointer11.createPath(jXPathContext17, (java.lang.Object) nodePointer27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot replace the root object");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2147483648) + "'", int9 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0d + "'", obj14, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "100");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(nodePointer27);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        java.lang.Object obj5 = nodePointer3.clone();
        java.lang.Object obj6 = nodePointer3.getNodeValue();
        nodePointer3.setIndex((int) (byte) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = nodePointer3.getImmediateValuePointer();
        nodePointer3.setAttribute(true);
        java.lang.Object obj12 = nodePointer3.getNode();
        boolean boolean13 = nodePointer3.isAttribute();
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer3, node14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = dOMNodePointer15.isLanguage("/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "100");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 100.0d, locale3);
        java.lang.Object obj5 = nodePointer4.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer4.getValuePointer();
        java.lang.String str7 = nodePointer6.toString();
        java.lang.Object obj8 = nodePointer6.getRootNode();
        java.lang.String str9 = nodePointer6.toString();
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) str9, locale10);
        java.lang.Object obj12 = nodePointer11.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer11.getParent();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "100");
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100" + "'", str7, "100");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100" + "'", str9, "100");
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "'100'");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "'100'");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "'100'");
        org.junit.Assert.assertNull(nodePointer13);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        boolean boolean6 = nodePointer5.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer5.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = nodePointer7.getImmediateParentPointer();
        nodePointer7.setIndex((int) (short) 10);
        java.lang.Object obj11 = nodePointer7.clone();
        java.util.Locale locale12 = nodePointer7.getLocale();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver13 = null;
        nodePointer7.setNamespaceResolver(namespaceResolver13);
        org.apache.commons.jxpath.JXPathContext jXPathContext15 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = nodePointer7.createPath(jXPathContext15);
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = null;
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName19, (java.lang.Object) 100.0d, locale21);
        java.lang.Object obj23 = nodePointer22.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = nodePointer22.getValuePointer();
        nodePointer24.setIndex(0);
        boolean boolean27 = nodePointer24.isRoot();
        org.apache.commons.jxpath.ri.QName qName28 = null;
        org.apache.commons.jxpath.ri.QName qName29 = null;
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName29, (java.lang.Object) 100.0d, locale31);
        java.lang.Object obj33 = nodePointer32.clone();
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler34 = null;
        nodePointer32.setExceptionHandler(exceptionHandler34);
        java.lang.Object obj36 = nodePointer32.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer24, qName28, (java.lang.Object) nodePointer32);
        boolean boolean38 = nodePointer24.isRoot();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet39 = nodePointer7.getNodeSetByKey(jXPathContext17, "<<unknown namespace>>", (java.lang.Object) nodePointer24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "100");
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "100");
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(nodePointer32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "100");
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "100");
        org.junit.Assert.assertNotNull(nodePointer37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        java.lang.Object obj5 = nodePointer3.clone();
        java.lang.Object obj6 = nodePointer3.getNodeValue();
        nodePointer3.setAttribute(true);
        boolean boolean9 = nodePointer3.isAttribute();
        java.lang.String str10 = nodePointer3.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer3.getImmediateValuePointer();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "100");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100" + "'", str10, "100");
        org.junit.Assert.assertNotNull(nodePointer11);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        nodePointer3.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver6 = null;
        nodePointer3.setNamespaceResolver(namespaceResolver6);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = nodePointer3.getImmediateValuePointer();
        org.apache.commons.jxpath.JXPathContext jXPathContext9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer8.createPath(jXPathContext9);
        java.lang.String str11 = nodePointer10.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer10.getImmediateValuePointer();
        boolean boolean13 = nodePointer12.isNode();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100" + "'", str11, "100");
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 100.0d, locale3);
        java.lang.Object obj5 = nodePointer4.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer4.getValuePointer();
        nodePointer6.setIndex((int) (short) -1);
        nodePointer6.setIndex((int) (short) 1);
        boolean boolean11 = nodePointer6.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer6.getImmediateValuePointer();
        nodePointer12.printPointerChain();
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler14 = null;
        nodePointer12.setExceptionHandler(exceptionHandler14);
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) nodePointer12, locale16);
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "100");
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertNotNull(nodePointer17);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 1L, locale2);
        java.lang.Object obj4 = nodePointer3.getRootNode();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1L + "'", obj4, 1L);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        boolean boolean6 = nodePointer5.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer5.getValuePointer();
        java.lang.String str8 = nodePointer5.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = nodePointer5.getImmediateValuePointer();
        java.lang.Throwable throwable10 = null;
        nodePointer9.handle(throwable10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer9.getImmediateValuePointer();
        org.apache.commons.jxpath.JXPathContext jXPathContext13 = null;
        org.apache.commons.jxpath.ri.QName qName15 = null;
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName16, (java.lang.Object) 100.0d, locale18);
        java.lang.Object obj20 = nodePointer19.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = nodePointer19.getValuePointer();
        int int22 = nodePointer19.getIndex();
        java.lang.Object obj23 = nodePointer19.clone();
        java.lang.Object obj24 = nodePointer19.getNodeValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer19);
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName15, (java.lang.Object) nodePointer25, locale26);
        org.apache.commons.jxpath.ri.QName qName28 = null;
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName28, (java.lang.Object) 100.0d, locale30);
        java.lang.Object obj32 = nodePointer31.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = nodePointer31.getValuePointer();
        boolean boolean34 = nodePointer33.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = nodePointer33.getValuePointer();
        java.lang.Object obj36 = nodePointer35.getNodeValue();
        org.apache.commons.jxpath.ri.QName qName37 = null;
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer40 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName37, (java.lang.Object) 100.0d, locale39);
        java.lang.Object obj41 = nodePointer40.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = nodePointer40.getValuePointer();
        int int43 = nodePointer35.compareTo((java.lang.Object) nodePointer42);
        java.lang.String str44 = nodePointer42.toString();
        int int45 = nodePointer27.compareTo((java.lang.Object) nodePointer42);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet46 = nodePointer12.getNodeSetByKey(jXPathContext13, "http://www.w3.org/2000/xmlns/", (java.lang.Object) nodePointer27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100" + "'", str8, "100");
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "100");
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2147483648) + "'", int22 == (-2147483648));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "100");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0d + "'", obj24, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer25);
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertNotNull(nodePointer31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "100");
        org.junit.Assert.assertNotNull(nodePointer33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0d + "'", obj36, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals(obj41.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj41), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj41), "100");
        org.junit.Assert.assertNotNull(nodePointer42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "100" + "'", str44, "100");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) '#', locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        nodePointer3.setAttribute(false);
        java.lang.Object obj7 = nodePointer3.getNodeValue();
        org.apache.commons.jxpath.JXPathContext jXPathContext8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = nodePointer3.createPath(jXPathContext8);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer9);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName12, (java.lang.Object) 100.0d, locale14);
        nodePointer15.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver18 = null;
        nodePointer15.setNamespaceResolver(namespaceResolver18);
        java.lang.Object obj20 = nodePointer15.getNodeValue();
        boolean boolean21 = nodePointer15.isContainer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer10, qName11, (java.lang.Object) boolean21);
        org.apache.commons.jxpath.JXPathContext jXPathContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer26 = nodePointer22.getPointerByKey(jXPathContext23, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "/");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "/");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "/");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + '#' + "'", obj7, '#');
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodePointer22);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        int int6 = nodePointer3.getIndex();
        java.lang.Object obj7 = nodePointer3.clone();
        nodePointer3.setIndex((int) (short) 100);
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler10 = null;
        nodePointer3.setExceptionHandler(exceptionHandler10);
        java.lang.String str12 = nodePointer3.toString();
        int int13 = nodePointer3.getIndex();
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer3, node14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dOMNodePointer15.asPath();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2147483648) + "'", int6 == (-2147483648));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100" + "'", str12, "100");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        int int6 = nodePointer3.getIndex();
        java.lang.Object obj7 = nodePointer3.clone();
        nodePointer3.setIndex((int) (short) 100);
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler10 = null;
        nodePointer3.setExceptionHandler(exceptionHandler10);
        java.lang.String str12 = nodePointer3.toString();
        int int13 = nodePointer3.getIndex();
        boolean boolean14 = nodePointer3.isContainer();
        org.apache.commons.jxpath.ri.QName qName15 = null;
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName16, (java.lang.Object) '#', locale18);
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName20, (java.lang.Object) 100.0d, locale22);
        nodePointer23.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver26 = null;
        nodePointer23.setNamespaceResolver(namespaceResolver26);
        int int28 = nodePointer19.compareTo((java.lang.Object) nodePointer23);
        java.lang.Object obj29 = nodePointer23.getNodeValue();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver30 = null;
        nodePointer23.setNamespaceResolver(namespaceResolver30);
        java.lang.Object obj32 = nodePointer23.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer3, qName15, obj32);
        int int34 = nodePointer33.getIndex();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2147483648) + "'", int6 == (-2147483648));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100" + "'", str12, "100");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "100");
        org.junit.Assert.assertNotNull(nodePointer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-2147483648) + "'", int34 == (-2147483648));
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        nodePointer3.setIndex((int) 'a');
        java.lang.String str6 = nodePointer3.toString();
        org.w3c.dom.Node node7 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer8 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer3, node7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = dOMNodePointer8.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100" + "'", str6, "100");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        int int6 = nodePointer3.getIndex();
        boolean boolean7 = nodePointer3.isContainer();
        org.apache.commons.jxpath.JXPathContext jXPathContext8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = nodePointer3.createPath(jXPathContext8);
        java.lang.Throwable throwable10 = null;
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName11, (java.lang.Object) 100.0d, locale13);
        java.lang.Object obj15 = nodePointer14.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = nodePointer14.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName17 = null;
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName18, (java.lang.Object) 100.0d, locale20);
        nodePointer21.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer14, qName17, (java.lang.Object) nodePointer21);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer24);
        java.util.Locale locale26 = nodePointer25.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = nodePointer25.getValuePointer();
        nodePointer3.handle(throwable10, nodePointer25);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = nodePointer25.getValuePointer();
        org.w3c.dom.Node node30 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer31 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer29, node30);
        org.apache.commons.jxpath.JXPathContext jXPathContext32 = null;
        org.apache.commons.jxpath.ri.QName qName33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = dOMNodePointer31.createAttribute(jXPathContext32, qName33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2147483648) + "'", int6 == (-2147483648));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "100");
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertNotNull(nodePointer25);
        org.junit.Assert.assertNull(locale26);
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertNotNull(nodePointer29);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler5 = null;
        nodePointer3.setExceptionHandler(exceptionHandler5);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName8, (java.lang.Object) 100.0d, locale10);
        java.lang.Object obj12 = nodePointer11.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer11.getValuePointer();
        nodePointer13.setIndex((int) (short) -1);
        java.lang.Object obj16 = nodePointer13.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = nodePointer13.getValuePointer();
        boolean boolean18 = nodePointer13.isContainer();
        java.lang.Object obj19 = nodePointer13.getNodeValue();
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName7, (java.lang.Object) nodePointer13, locale20);
        int int22 = nodePointer3.compareTo((java.lang.Object) nodePointer13);
        java.lang.Object obj23 = nodePointer3.getNode();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "100");
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        nodePointer5.setAttribute(true);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = nodePointer5.getImmediateValuePointer();
        boolean boolean9 = nodePointer8.isContainer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer8.getValuePointer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver11 = null;
        nodePointer10.setNamespaceResolver(namespaceResolver11);
        java.lang.Object obj13 = nodePointer10.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = nodePointer10.getValuePointer();
        org.w3c.dom.Node node15 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer16 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer14, node15);
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = null;
        org.apache.commons.jxpath.ri.QName qName18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = dOMNodePointer16.createChild(jXPathContext17, qName18, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "100");
        org.junit.Assert.assertNotNull(nodePointer14);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 100.0d, locale3);
        java.lang.Object obj5 = nodePointer4.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer4.getValuePointer();
        int int7 = nodePointer4.getIndex();
        java.lang.Object obj8 = nodePointer4.clone();
        java.lang.Object obj9 = nodePointer4.getNodeValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer4);
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) nodePointer10, locale11);
        java.lang.Throwable throwable13 = null;
        nodePointer10.handle(throwable13);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer10);
        java.lang.Throwable throwable16 = null;
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName17, (java.lang.Object) 100.0d, locale19);
        nodePointer20.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver23 = null;
        nodePointer20.setNamespaceResolver(namespaceResolver23);
        java.lang.Object obj25 = nodePointer20.getNodeValue();
        nodePointer15.handle(throwable16, nodePointer20);
        boolean boolean27 = nodePointer20.isRoot();
        java.lang.Throwable throwable28 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = null;
        nodePointer20.handle(throwable28, nodePointer29);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = nodePointer20.getParent();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "100");
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2147483648) + "'", int7 == (-2147483648));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "100");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0d + "'", obj9, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0d + "'", obj25, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(nodePointer31);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        java.lang.Object obj5 = nodePointer3.clone();
        java.lang.Object obj6 = nodePointer3.getNodeValue();
        nodePointer3.setAttribute(true);
        nodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer3.getValuePointer();
        boolean boolean12 = nodePointer11.isNode();
        java.lang.Object obj13 = nodePointer11.clone();
        java.lang.Class<?> wildcardClass14 = nodePointer11.getClass();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "100");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "100");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        nodePointer3.setAttribute(false);
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler6 = null;
        nodePointer3.setExceptionHandler(exceptionHandler6);
        nodePointer3.setIndex((-1));
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler10 = null;
        nodePointer3.setExceptionHandler(exceptionHandler10);
        boolean boolean12 = nodePointer3.isNode();
        org.w3c.dom.Node node13 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer3, node13);
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer14.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        java.lang.Throwable throwable5 = null;
        nodePointer3.handle(throwable5);
        boolean boolean7 = nodePointer3.isRoot();
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = nodePointer3.getImmediateParentPointer();
        java.util.Locale locale10 = nodePointer3.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer3.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.QName qName12 = null;
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName13, (java.lang.Object) 100.0d, locale15);
        java.lang.Object obj17 = nodePointer16.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = nodePointer16.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName19, (java.lang.Object) 100.0d, locale21);
        java.lang.Object obj23 = nodePointer22.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = nodePointer22.getValuePointer();
        int int25 = nodePointer22.getIndex();
        int int26 = nodePointer16.compareTo((java.lang.Object) nodePointer22);
        org.apache.commons.jxpath.JXPathContext jXPathContext27 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = nodePointer22.createPath(jXPathContext27);
        int int29 = nodePointer28.getIndex();
        org.apache.commons.jxpath.ri.QName qName30 = null;
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName30, (java.lang.Object) '#', locale32);
        org.apache.commons.jxpath.ri.QName qName34 = null;
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName34, (java.lang.Object) 100.0d, locale36);
        nodePointer37.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver40 = null;
        nodePointer37.setNamespaceResolver(namespaceResolver40);
        int int42 = nodePointer33.compareTo((java.lang.Object) nodePointer37);
        int int43 = nodePointer28.compareTo((java.lang.Object) nodePointer33);
        org.apache.commons.jxpath.ri.QName qName44 = null;
        org.apache.commons.jxpath.ri.QName qName45 = null;
        java.util.Locale locale47 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer48 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName45, (java.lang.Object) 100.0d, locale47);
        java.lang.Object obj49 = nodePointer48.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer50 = nodePointer48.getValuePointer();
        int int51 = nodePointer48.getIndex();
        boolean boolean52 = nodePointer48.isContainer();
        org.apache.commons.jxpath.JXPathContext jXPathContext53 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer54 = nodePointer48.createPath(jXPathContext53);
        java.lang.Throwable throwable55 = null;
        org.apache.commons.jxpath.ri.QName qName56 = null;
        java.util.Locale locale58 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer59 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName56, (java.lang.Object) 100.0d, locale58);
        java.lang.Object obj60 = nodePointer59.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer61 = nodePointer59.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName62 = null;
        org.apache.commons.jxpath.ri.QName qName63 = null;
        java.util.Locale locale65 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer66 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName63, (java.lang.Object) 100.0d, locale65);
        nodePointer66.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer69 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer59, qName62, (java.lang.Object) nodePointer66);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer70 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer69);
        java.util.Locale locale71 = nodePointer70.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer72 = nodePointer70.getValuePointer();
        nodePointer48.handle(throwable55, nodePointer70);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer74 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer28, qName44, (java.lang.Object) nodePointer48);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer75 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer11, qName12, (java.lang.Object) nodePointer74);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(nodePointer9);
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "100");
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "100");
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2147483648) + "'", int25 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(nodePointer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-2147483648) + "'", int29 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer33);
        org.junit.Assert.assertNotNull(nodePointer37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(nodePointer48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "100");
        org.junit.Assert.assertNotNull(nodePointer50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-2147483648) + "'", int51 == (-2147483648));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(nodePointer54);
        org.junit.Assert.assertNotNull(nodePointer59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertEquals(obj60.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj60), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj60), "100");
        org.junit.Assert.assertNotNull(nodePointer61);
        org.junit.Assert.assertNotNull(nodePointer66);
        org.junit.Assert.assertNotNull(nodePointer69);
        org.junit.Assert.assertNotNull(nodePointer70);
        org.junit.Assert.assertNull(locale71);
        org.junit.Assert.assertNotNull(nodePointer72);
        org.junit.Assert.assertNotNull(nodePointer74);
        org.junit.Assert.assertNotNull(nodePointer75);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        nodePointer3.setAttribute(false);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.getParent();
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName7, (java.lang.Object) 100.0d, locale9);
        java.lang.Object obj11 = nodePointer10.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer10.getValuePointer();
        nodePointer12.setIndex((int) (short) -1);
        java.lang.Object obj15 = nodePointer12.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = nodePointer12.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = nodePointer16.getImmediateParentPointer();
        int int18 = nodePointer3.compareTo((java.lang.Object) nodePointer16);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = nodePointer16.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName20, (java.lang.Object) 100.0d, locale22);
        java.lang.Object obj24 = nodePointer23.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = nodePointer23.getValuePointer();
        nodePointer25.setIndex((int) (short) -1);
        java.lang.String str28 = nodePointer25.toString();
        boolean boolean29 = nodePointer25.isAttribute();
        int int30 = nodePointer19.compareTo((java.lang.Object) nodePointer25);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer19, node31);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest33 = null;
        org.apache.commons.jxpath.ri.QName qName35 = null;
        org.apache.commons.jxpath.ri.QName qName36 = null;
        java.util.Locale locale38 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer39 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName36, (java.lang.Object) 100.0d, locale38);
        java.lang.Object obj40 = nodePointer39.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer41 = nodePointer39.getValuePointer();
        int int42 = nodePointer39.getIndex();
        java.lang.Object obj43 = nodePointer39.clone();
        java.lang.Object obj44 = nodePointer39.getNode();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver45 = null;
        nodePointer39.setNamespaceResolver(namespaceResolver45);
        java.lang.Object obj47 = nodePointer39.getRootNode();
        org.apache.commons.jxpath.ri.QName qName48 = null;
        org.apache.commons.jxpath.ri.QName qName49 = null;
        java.util.Locale locale51 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer52 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName49, (java.lang.Object) 100.0d, locale51);
        nodePointer52.setAttribute(false);
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler55 = null;
        nodePointer52.setExceptionHandler(exceptionHandler55);
        int int57 = nodePointer52.getIndex();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer58 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer39, qName48, (java.lang.Object) int57);
        java.util.Locale locale59 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer60 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName35, (java.lang.Object) nodePointer58, locale59);
        java.lang.String str61 = nodePointer58.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator62 = dOMNodePointer32.childIterator(nodeTest33, true, nodePointer58);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class org.w3c.dom.Node (java.lang.Integer is in module java.base of loader 'bootstrap'; org.w3c.dom.Node is in module java.xml of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(nodePointer6);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "100");
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertNull(nodePointer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "100");
        org.junit.Assert.assertNotNull(nodePointer25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "100" + "'", str28, "100");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodePointer39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj40), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "100");
        org.junit.Assert.assertNotNull(nodePointer41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-2147483648) + "'", int42 == (-2147483648));
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "100");
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 100.0d + "'", obj44, 100.0d);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 100.0d + "'", obj47, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer52);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-2147483648) + "'", int57 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer58);
        org.junit.Assert.assertNotNull(nodePointer60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "100/null" + "'", str61, "100/null");
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 100.0d, locale3);
        java.lang.Object obj5 = nodePointer4.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer4.getValuePointer();
        java.lang.String str7 = nodePointer6.toString();
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler8 = null;
        nodePointer6.setExceptionHandler(exceptionHandler8);
        org.apache.commons.jxpath.JXPathContext jXPathContext10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer6.createPath(jXPathContext10);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) jXPathContext10, locale12);
        boolean boolean14 = nodePointer13.isAttribute();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "100");
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100" + "'", str7, "100");
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 100.0d, locale8);
        java.lang.Object obj10 = nodePointer9.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer9.getValuePointer();
        int int12 = nodePointer9.getIndex();
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.apache.commons.jxpath.JXPathContext jXPathContext14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = nodePointer9.createPath(jXPathContext14);
        boolean boolean16 = nodePointer9.isContainer();
        org.w3c.dom.Node node17 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer18 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer9, node17);
        org.apache.commons.jxpath.JXPathContext jXPathContext19 = null;
        org.apache.commons.jxpath.ri.QName qName20 = null;
        org.apache.commons.jxpath.ri.QName qName22 = null;
        org.apache.commons.jxpath.ri.QName qName23 = null;
        org.apache.commons.jxpath.ri.QName qName24 = null;
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName24, (java.lang.Object) 100.0d, locale26);
        nodePointer27.setAttribute(false);
        java.lang.Object obj30 = nodePointer27.getRootNode();
        int int31 = nodePointer27.getIndex();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = nodePointer27.getValuePointer();
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName23, (java.lang.Object) nodePointer32, locale33);
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer36 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName22, (java.lang.Object) locale33, locale35);
        java.util.Locale locale37 = nodePointer36.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = dOMNodePointer18.createChild(jXPathContext19, qName20, (int) '#', (java.lang.Object) locale37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "100");
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2147483648) + "'", int12 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0d + "'", obj30, 100.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-2147483648) + "'", int31 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer32);
        org.junit.Assert.assertNotNull(nodePointer34);
        org.junit.Assert.assertNotNull(nodePointer36);
        org.junit.Assert.assertNull(locale37);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.getRootNode();
        boolean boolean5 = nodePointer3.isContainer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.getParent();
        org.apache.commons.jxpath.ri.QName qName7 = null;
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName8, (java.lang.Object) 100.0d, locale10);
        java.lang.Object obj12 = nodePointer11.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer11.getValuePointer();
        nodePointer13.setAttribute(true);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = nodePointer13.getImmediateValuePointer();
        boolean boolean17 = nodePointer16.isContainer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = nodePointer16.getValuePointer();
        java.lang.Object obj19 = nodePointer16.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer6, qName7, (java.lang.Object) nodePointer16);
        org.w3c.dom.Node node21 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer22 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer16, node21);
        org.apache.commons.jxpath.JXPathContext jXPathContext23 = null;
        org.apache.commons.jxpath.ri.QName qName24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer26 = dOMNodePointer22.createChild(jXPathContext23, qName24, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0d + "'", obj4, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(nodePointer6);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "100");
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "100");
        org.junit.Assert.assertNotNull(nodePointer20);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        nodePointer3.setAttribute(false);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.getParent();
        java.lang.Object obj7 = nodePointer3.getNodeValue();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver8 = null;
        nodePointer3.setNamespaceResolver(namespaceResolver8);
        boolean boolean10 = nodePointer3.isAttribute();
        java.lang.String str11 = nodePointer3.toString();
        boolean boolean12 = nodePointer3.isRoot();
        org.apache.commons.jxpath.ri.QName qName13 = null;
        org.apache.commons.jxpath.ri.QName qName14 = null;
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName15, (java.lang.Object) 100.0d, locale17);
        nodePointer18.setAttribute(false);
        java.lang.Object obj21 = nodePointer18.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = nodePointer18.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer22);
        boolean boolean24 = nodePointer22.isAttribute();
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer26 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName14, (java.lang.Object) boolean24, locale25);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer3, qName13, (java.lang.Object) nodePointer26);
        java.lang.Object obj28 = nodePointer26.getRootNode();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(nodePointer6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100" + "'", str11, "100");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodePointer26);
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + false + "'", obj28, false);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        boolean boolean4 = nodePointer3.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.getImmediateValuePointer();
        nodePointer6.printPointerChain();
        org.w3c.dom.Node node8 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer6, node8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dOMNodePointer9.getNamespaceURI();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodePointer6);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        nodePointer5.setIndex((int) (short) -1);
        java.lang.Object obj8 = nodePointer5.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = nodePointer5.getValuePointer();
        boolean boolean10 = nodePointer5.isContainer();
        java.lang.Object obj11 = nodePointer5.getNodeValue();
        org.apache.commons.jxpath.ri.QName qName12 = null;
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName13, (java.lang.Object) 100.0d, locale15);
        java.lang.Object obj17 = nodePointer16.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = nodePointer16.getValuePointer();
        boolean boolean19 = nodePointer18.isNode();
        nodePointer18.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer5, qName12, (java.lang.Object) (byte) 0);
        nodePointer5.printPointerChain();
        boolean boolean24 = nodePointer5.isAttribute();
        boolean boolean25 = nodePointer5.isNode();
        boolean boolean26 = nodePointer5.isNode();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "100");
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        nodePointer5.setIndex((int) (short) -1);
        java.lang.String str8 = nodePointer5.toString();
        org.apache.commons.jxpath.JXPathContext jXPathContext9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer5.createPath(jXPathContext9);
        java.lang.Object obj11 = nodePointer5.clone();
        org.w3c.dom.Node node12 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer13 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer5, node12);
        org.apache.commons.jxpath.JXPathContext jXPathContext14 = null;
        org.apache.commons.jxpath.ri.QName qName15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = dOMNodePointer13.createChild(jXPathContext14, qName15, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100" + "'", str8, "100");
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "100");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName7, (java.lang.Object) 100.0d, locale9);
        nodePointer10.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer3, qName6, (java.lang.Object) nodePointer10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer13);
        org.w3c.dom.Node node15 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer16 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer14, node15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = dOMNodePointer16.isLeaf();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertNotNull(nodePointer14);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) '#', locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName4, (java.lang.Object) 100.0d, locale6);
        nodePointer7.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver10 = null;
        nodePointer7.setNamespaceResolver(namespaceResolver10);
        int int12 = nodePointer3.compareTo((java.lang.Object) nodePointer7);
        java.lang.Object obj13 = nodePointer3.getNodeValue();
        org.apache.commons.jxpath.JXPathContext jXPathContext14 = null;
        org.apache.commons.jxpath.ri.QName qName15 = null;
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName16, (java.lang.Object) 100.0d, locale18);
        nodePointer19.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = nodePointer19.getValuePointer();
        org.apache.commons.jxpath.JXPathContext jXPathContext23 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = nodePointer19.createPath(jXPathContext23);
        boolean boolean25 = nodePointer24.isNode();
        nodePointer24.printPointerChain();
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName15, (java.lang.Object) nodePointer24, locale27);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = nodePointer3.createPath(jXPathContext14, (java.lang.Object) qName15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot replace the root object");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + '#' + "'", obj13, '#');
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(nodePointer28);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        nodePointer5.setIndex((int) (short) -1);
        nodePointer5.setIndex((int) (short) 1);
        boolean boolean10 = nodePointer5.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer5.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer5.getImmediateValuePointer();
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler13 = null;
        nodePointer12.setExceptionHandler(exceptionHandler13);
        boolean boolean15 = nodePointer12.isNode();
        java.lang.Class<?> wildcardClass16 = nodePointer12.getClass();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        java.lang.String str6 = nodePointer5.toString();
        java.lang.Object obj7 = nodePointer5.getRootNode();
        org.w3c.dom.Node node8 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer5, node8);
        org.apache.commons.jxpath.JXPathContext jXPathContext10 = null;
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = dOMNodePointer9.createChild(jXPathContext10, qName11, 100, obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100" + "'", str6, "100");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        boolean boolean6 = nodePointer5.isContainer();
        java.util.Locale locale7 = nodePointer5.getLocale();
        org.apache.commons.jxpath.JXPathContext jXPathContext8 = null;
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName10, (java.lang.Object) 100.0d, locale12);
        nodePointer13.setAttribute(false);
        java.lang.Object obj16 = nodePointer13.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = nodePointer13.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer17);
        nodePointer17.printPointerChain();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = nodePointer17.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer17);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = nodePointer21.getValuePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet23 = nodePointer5.getNodeSetByKey(jXPathContext8, "http://www.w3.org/XML/1998/namespace", (java.lang.Object) nodePointer22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertNotNull(nodePointer22);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        java.lang.Object obj5 = nodePointer3.clone();
        java.lang.Object obj6 = nodePointer3.getNodeValue();
        nodePointer3.setAttribute(true);
        nodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer3.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer11.getParent();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer11.getImmediateParentPointer();
        // The following exception was thrown during execution in test generation
        try {
            nodePointer13.printPointerChain();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "100");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNull(nodePointer12);
        org.junit.Assert.assertNull(nodePointer13);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 100.0d, locale3);
        java.lang.Object obj5 = nodePointer4.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer4.getValuePointer();
        boolean boolean7 = nodePointer6.isNode();
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) boolean7, locale8);
        nodePointer9.setIndex((int) (short) 0);
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler12 = null;
        nodePointer9.setExceptionHandler(exceptionHandler12);
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "100");
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodePointer9);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        nodePointer3.setAttribute(false);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.getParent();
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName7, (java.lang.Object) 100.0d, locale9);
        java.lang.Object obj11 = nodePointer10.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer10.getValuePointer();
        nodePointer12.setIndex((int) (short) -1);
        java.lang.Object obj15 = nodePointer12.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = nodePointer12.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = nodePointer16.getImmediateParentPointer();
        int int18 = nodePointer3.compareTo((java.lang.Object) nodePointer16);
        boolean boolean19 = nodePointer16.isNode();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver20 = null;
        nodePointer16.setNamespaceResolver(namespaceResolver20);
        java.lang.Throwable throwable22 = null;
        org.apache.commons.jxpath.ri.QName qName23 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer26 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName23, (java.lang.Object) 100.0d, locale25);
        java.lang.Object obj27 = nodePointer26.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = nodePointer26.getValuePointer();
        int int29 = nodePointer26.getIndex();
        java.lang.Object obj30 = nodePointer26.clone();
        java.lang.Object obj31 = nodePointer26.getNode();
        java.lang.Object obj32 = nodePointer26.getNode();
        java.lang.Object obj33 = nodePointer26.clone();
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler34 = null;
        nodePointer26.setExceptionHandler(exceptionHandler34);
        nodePointer16.handle(throwable22, nodePointer26);
        nodePointer26.printPointerChain();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(nodePointer6);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "100");
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertNull(nodePointer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(nodePointer26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "100");
        org.junit.Assert.assertNotNull(nodePointer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-2147483648) + "'", int29 == (-2147483648));
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "100");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100.0d + "'", obj31, 100.0d);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0d + "'", obj32, 100.0d);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "100");
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        boolean boolean6 = nodePointer5.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer5.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName8 = null;
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName9, (java.lang.Object) 100.0d, locale11);
        java.lang.Object obj13 = nodePointer12.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = nodePointer12.getValuePointer();
        nodePointer14.setIndex((int) (short) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer7, qName8, (java.lang.Object) nodePointer14);
        java.lang.Throwable throwable18 = null;
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName19, (java.lang.Object) 100.0d, locale21);
        java.lang.Object obj23 = nodePointer22.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = nodePointer22.getValuePointer();
        int int25 = nodePointer22.getIndex();
        java.lang.Object obj26 = nodePointer22.clone();
        nodePointer22.setIndex((int) (short) 100);
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler29 = null;
        nodePointer22.setExceptionHandler(exceptionHandler29);
        int int31 = nodePointer22.getIndex();
        nodePointer7.handle(throwable18, nodePointer22);
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler33 = null;
        nodePointer22.setExceptionHandler(exceptionHandler33);
        org.apache.commons.jxpath.JXPathContext jXPathContext35 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer36 = nodePointer22.createPath(jXPathContext35);
        org.w3c.dom.Node node37 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer38 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer22, node37);
        org.apache.commons.jxpath.JXPathContext jXPathContext39 = null;
        org.apache.commons.jxpath.ri.QName qName40 = null;
        org.apache.commons.jxpath.ri.QName qName42 = null;
        java.util.Locale locale44 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer45 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName42, (java.lang.Object) 100.0d, locale44);
        java.lang.Object obj46 = nodePointer45.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer47 = nodePointer45.getValuePointer();
        int int48 = nodePointer45.getIndex();
        java.lang.Object obj49 = nodePointer45.clone();
        java.lang.Object obj50 = nodePointer45.getNodeValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer51 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer45);
        java.lang.Throwable throwable52 = null;
        org.apache.commons.jxpath.ri.QName qName53 = null;
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer56 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName53, (java.lang.Object) 100.0d, locale55);
        nodePointer56.setAttribute(false);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer59 = nodePointer56.getParent();
        java.lang.Object obj60 = nodePointer56.getNodeValue();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver61 = null;
        nodePointer56.setNamespaceResolver(namespaceResolver61);
        boolean boolean63 = nodePointer56.isAttribute();
        java.lang.String str64 = nodePointer56.toString();
        nodePointer45.handle(throwable52, nodePointer56);
        boolean boolean66 = nodePointer56.isRoot();
        org.apache.commons.jxpath.JXPathContext jXPathContext67 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer68 = nodePointer56.createPath(jXPathContext67);
        int int69 = nodePointer56.getIndex();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer70 = dOMNodePointer38.createChild(jXPathContext39, qName40, (int) (byte) 0, (java.lang.Object) int69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "100");
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "100");
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2147483648) + "'", int25 == (-2147483648));
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "100");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(nodePointer36);
        org.junit.Assert.assertNotNull(nodePointer45);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "100");
        org.junit.Assert.assertNotNull(nodePointer47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-2147483648) + "'", int48 == (-2147483648));
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "100");
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 100.0d + "'", obj50, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer51);
        org.junit.Assert.assertNotNull(nodePointer56);
        org.junit.Assert.assertNull(nodePointer59);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 100.0d + "'", obj60, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "100" + "'", str64, "100");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(nodePointer68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-2147483648) + "'", int69 == (-2147483648));
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 100.0d, locale3);
        java.lang.Object obj5 = nodePointer4.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer4.getValuePointer();
        int int7 = nodePointer4.getIndex();
        java.lang.Object obj8 = nodePointer4.clone();
        java.lang.Object obj9 = nodePointer4.getNodeValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer4);
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) nodePointer10, locale11);
        java.lang.Throwable throwable13 = null;
        nodePointer10.handle(throwable13);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer10);
        java.lang.Object obj16 = nodePointer10.getNode();
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName17, (java.lang.Object) 100.0d, locale19);
        java.lang.Object obj21 = nodePointer20.clone();
        java.lang.Throwable throwable22 = null;
        nodePointer20.handle(throwable22);
        boolean boolean24 = nodePointer20.isRoot();
        nodePointer20.printPointerChain();
        nodePointer20.setIndex((int) (byte) -1);
        java.lang.Object obj28 = nodePointer20.clone();
        java.lang.Object obj29 = nodePointer20.clone();
        int int30 = nodePointer10.compareTo(obj29);
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "100");
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2147483648) + "'", int7 == (-2147483648));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "100");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0d + "'", obj9, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "100");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "100");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "100");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        nodePointer3.setAttribute(false);
        java.lang.Object obj6 = nodePointer3.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer7);
        org.apache.commons.jxpath.ri.QName qName9 = null;
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName10, (java.lang.Object) 100.0d, locale12);
        java.lang.Object obj14 = nodePointer13.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = nodePointer13.getValuePointer();
        int int16 = nodePointer13.getIndex();
        java.lang.Object obj17 = nodePointer13.clone();
        boolean boolean18 = nodePointer13.isNode();
        boolean boolean19 = nodePointer13.isRoot();
        nodePointer13.printPointerChain();
        java.lang.String str21 = nodePointer13.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer7, qName9, (java.lang.Object) str21);
        boolean boolean23 = nodePointer22.isNode();
        java.lang.Throwable throwable24 = null;
        nodePointer22.handle(throwable24);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "100");
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2147483648) + "'", int16 == (-2147483648));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "100");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "100" + "'", str21, "100");
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName7, (java.lang.Object) 100.0d, locale9);
        nodePointer10.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer3, qName6, (java.lang.Object) nodePointer10);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver14 = null;
        nodePointer10.setNamespaceResolver(namespaceResolver14);
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler16 = null;
        nodePointer10.setExceptionHandler(exceptionHandler16);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = nodePointer10.getValuePointer();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertNotNull(nodePointer19);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        nodePointer3.setIndex((int) (byte) 0);
        java.lang.Object obj6 = nodePointer3.getRootNode();
        org.apache.commons.jxpath.ri.QName qName7 = null;
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName8, (java.lang.Object) 100.0d, locale10);
        java.lang.Object obj12 = nodePointer11.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer11.getValuePointer();
        nodePointer13.setIndex((int) (short) -1);
        nodePointer13.setIndex((int) (short) 1);
        boolean boolean18 = nodePointer13.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = nodePointer13.getImmediateValuePointer();
        nodePointer19.printPointerChain();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer3, qName7, (java.lang.Object) nodePointer19);
        int int22 = nodePointer19.getIndex();
        nodePointer19.setIndex((int) (byte) 100);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "100");
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        java.lang.Throwable throwable5 = null;
        nodePointer3.handle(throwable5);
        boolean boolean7 = nodePointer3.isRoot();
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer3);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer9.getImmediateParentPointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer9.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer9.getImmediateValuePointer();
        nodePointer9.setAttribute(false);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNull(nodePointer10);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(nodePointer12);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler5 = null;
        nodePointer3.setExceptionHandler(exceptionHandler5);
        org.w3c.dom.Node node7 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer8 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer3, node7);
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName9, (java.lang.Object) 100.0d, locale11);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer12);
        org.apache.commons.jxpath.JXPathContext jXPathContext14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = nodePointer13.createPath(jXPathContext14);
        java.util.Locale locale16 = nodePointer15.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer8.setValue((java.lang.Object) nodePointer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertNull(locale16);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        int int6 = nodePointer3.getIndex();
        java.lang.Object obj7 = nodePointer3.clone();
        java.lang.Object obj8 = nodePointer3.getNodeValue();
        java.lang.Object obj9 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer3.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.lang.Object obj12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer3, qName11, obj12);
        org.apache.commons.jxpath.JXPathContext jXPathContext14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet17 = nodePointer3.getNodeSetByKey(jXPathContext14, "/", (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2147483648) + "'", int6 == (-2147483648));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "100");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "100");
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(nodePointer13);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        nodePointer3.setIndex((int) 'a');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer6.getImmediateParentPointer();
        java.lang.Throwable throwable8 = null;
        nodePointer6.handle(throwable8);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer6.getImmediateValuePointer();
        java.lang.Object obj11 = nodePointer10.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer10.getValuePointer();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer12);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 100.0d, locale3);
        java.lang.Object obj5 = nodePointer4.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer4.getValuePointer();
        nodePointer6.setIndex((int) (short) -1);
        nodePointer6.setIndex((int) (short) 1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer6.getImmediateParentPointer();
        nodePointer6.setAttribute(true);
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) nodePointer6, locale14);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer15);
        nodePointer15.setAttribute(false);
        java.lang.Object obj19 = nodePointer15.clone();
        org.apache.commons.jxpath.JXPathContext jXPathContext20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer23 = nodePointer15.getPointerByKey(jXPathContext20, "true()", "<<unknown namespace>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "100");
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertNull(nodePointer11);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "/");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "/");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "/");
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        nodePointer5.setIndex((int) (short) -1);
        java.lang.Object obj8 = nodePointer5.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = nodePointer5.getValuePointer();
        java.lang.Throwable throwable10 = null;
        nodePointer9.handle(throwable10);
        java.util.Locale locale12 = nodePointer9.getLocale();
        java.lang.Object obj13 = nodePointer9.clone();
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer9, node14);
        org.apache.commons.jxpath.JXPathContext jXPathContext16 = null;
        org.apache.commons.jxpath.ri.QName qName17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = dOMNodePointer15.createChild(jXPathContext16, qName17, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "100");
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        java.lang.Object obj5 = nodePointer3.clone();
        java.lang.Object obj6 = nodePointer3.getNodeValue();
        nodePointer3.setAttribute(true);
        nodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.lang.Object obj12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer3, qName11, obj12);
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer3, node14);
        org.apache.commons.jxpath.JXPathContext jXPathContext16 = null;
        org.apache.commons.jxpath.ri.QName qName17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = dOMNodePointer15.createAttribute(jXPathContext16, qName17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "100");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer13);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        nodePointer3.setAttribute(false);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer3);
        java.lang.Object obj7 = nodePointer3.getRootNode();
        java.lang.String str8 = nodePointer3.toString();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100" + "'", str8, "100");
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 100.0d, locale3);
        nodePointer4.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer4.getValuePointer();
        org.apache.commons.jxpath.JXPathContext jXPathContext8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = nodePointer4.createPath(jXPathContext8);
        boolean boolean10 = nodePointer9.isNode();
        nodePointer9.printPointerChain();
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) nodePointer9, locale12);
        java.lang.Object obj14 = nodePointer9.getRootNode();
        org.w3c.dom.Node node15 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer16 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer9, node15);
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0d + "'", obj14, 100.0d);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 100.0d, locale3);
        java.lang.Object obj5 = nodePointer4.clone();
        java.lang.Throwable throwable6 = null;
        nodePointer4.handle(throwable6);
        boolean boolean8 = nodePointer4.isRoot();
        nodePointer4.printPointerChain();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer4);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer10.getImmediateParentPointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer10.getValuePointer();
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) nodePointer10, locale13);
        boolean boolean15 = nodePointer14.isNode();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "100");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNull(nodePointer11);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        nodePointer3.setAttribute(false);
        java.lang.Object obj6 = nodePointer3.getRootNode();
        int int7 = nodePointer3.getIndex();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer3);
        java.lang.Object obj9 = nodePointer3.getRootNode();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2147483648) + "'", int7 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0d + "'", obj9, 100.0d);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        nodePointer5.setAttribute(true);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = nodePointer5.getImmediateValuePointer();
        nodePointer5.setAttribute(false);
        java.lang.String str11 = nodePointer5.toString();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100" + "'", str11, "100");
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        int int6 = nodePointer3.getIndex();
        java.lang.Object obj7 = nodePointer3.clone();
        nodePointer3.setIndex((int) (short) 100);
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler10 = null;
        nodePointer3.setExceptionHandler(exceptionHandler10);
        java.lang.String str12 = nodePointer3.toString();
        int int13 = nodePointer3.getIndex();
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler14 = null;
        nodePointer3.setExceptionHandler(exceptionHandler14);
        nodePointer3.printPointerChain();
        nodePointer3.setAttribute(true);
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName19, (java.lang.Object) 100.0d, locale21);
        java.lang.Object obj23 = nodePointer22.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = nodePointer22.getValuePointer();
        nodePointer24.setIndex((int) (short) -1);
        java.lang.String str27 = nodePointer24.toString();
        org.apache.commons.jxpath.JXPathContext jXPathContext28 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = nodePointer24.createPath(jXPathContext28);
        java.lang.Object obj30 = nodePointer24.clone();
        java.lang.Object obj31 = nodePointer24.getNode();
        int int32 = nodePointer3.compareTo((java.lang.Object) nodePointer24);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = nodePointer24.getValuePointer();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2147483648) + "'", int6 == (-2147483648));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100" + "'", str12, "100");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "100");
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "100" + "'", str27, "100");
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "100");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100.0d + "'", obj31, 100.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(nodePointer33);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 100.0d, locale3);
        java.lang.Object obj5 = nodePointer4.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer4.getValuePointer();
        int int7 = nodePointer4.getIndex();
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName8, (java.lang.Object) 100.0d, locale10);
        java.lang.Object obj12 = nodePointer11.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer11.getValuePointer();
        int int14 = nodePointer11.getIndex();
        java.lang.Object obj15 = nodePointer11.clone();
        java.lang.Object obj16 = nodePointer11.getNodeValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer11);
        int int18 = nodePointer4.compareTo((java.lang.Object) nodePointer17);
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) nodePointer4, locale19);
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "100");
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2147483648) + "'", int7 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "100");
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2147483648) + "'", int14 == (-2147483648));
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "100");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodePointer20);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = dOMNodePointer2.namespaceIterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        boolean boolean6 = nodePointer5.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer5.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = nodePointer7.getImmediateParentPointer();
        nodePointer7.setIndex((int) (short) 10);
        java.lang.Object obj11 = nodePointer7.clone();
        java.util.Locale locale12 = nodePointer7.getLocale();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver13 = null;
        nodePointer7.setNamespaceResolver(namespaceResolver13);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = nodePointer7.getImmediateValuePointer();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "100");
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(nodePointer15);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        java.lang.Throwable throwable5 = null;
        nodePointer3.handle(throwable5);
        boolean boolean7 = nodePointer3.isRoot();
        java.lang.Object obj8 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.QName qName9 = null;
        org.apache.commons.jxpath.ri.QName qName10 = null;
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName11, (java.lang.Object) 100.0d, locale13);
        nodePointer14.setAttribute(false);
        java.lang.Object obj17 = nodePointer14.getRootNode();
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName10, obj17, locale18);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = nodePointer19.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.QName qName21 = null;
        org.apache.commons.jxpath.ri.QName qName22 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName22, (java.lang.Object) 100.0d, locale24);
        java.lang.Object obj26 = nodePointer25.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = nodePointer25.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName28 = null;
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName28, (java.lang.Object) 100.0d, locale30);
        java.lang.Object obj32 = nodePointer31.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = nodePointer31.getValuePointer();
        int int34 = nodePointer31.getIndex();
        int int35 = nodePointer25.compareTo((java.lang.Object) nodePointer31);
        nodePointer31.printPointerChain();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer19, qName21, (java.lang.Object) nodePointer31);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer3, qName9, (java.lang.Object) nodePointer37);
        boolean boolean39 = nodePointer38.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer40 = nodePointer38.getImmediateParentPointer();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "100");
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0d + "'", obj17, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertNotNull(nodePointer25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "100");
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertNotNull(nodePointer31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "100");
        org.junit.Assert.assertNotNull(nodePointer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-2147483648) + "'", int34 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(nodePointer37);
        org.junit.Assert.assertNotNull(nodePointer38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(nodePointer40);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        java.lang.Object obj5 = nodePointer3.clone();
        java.lang.Object obj6 = nodePointer3.getNodeValue();
        nodePointer3.setAttribute(true);
        java.lang.Object obj9 = nodePointer3.getNode();
        org.w3c.dom.Node node10 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer11 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer3, node10);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName14, (java.lang.Object) 100.0d, locale16);
        java.lang.Object obj18 = nodePointer17.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = nodePointer17.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName20, (java.lang.Object) 100.0d, locale22);
        java.lang.Object obj24 = nodePointer23.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = nodePointer23.getValuePointer();
        int int26 = nodePointer23.getIndex();
        int int27 = nodePointer17.compareTo((java.lang.Object) nodePointer23);
        org.apache.commons.jxpath.JXPathContext jXPathContext28 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = nodePointer23.createPath(jXPathContext28);
        org.apache.commons.jxpath.JXPathContext jXPathContext30 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = nodePointer23.createPath(jXPathContext30);
        boolean boolean32 = nodePointer23.isNode();
        boolean boolean33 = nodePointer23.isContainer();
        org.apache.commons.jxpath.ri.QName qName34 = null;
        org.apache.commons.jxpath.ri.QName qName35 = null;
        java.util.Locale locale37 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName35, (java.lang.Object) 100.0d, locale37);
        java.lang.Object obj39 = nodePointer38.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer40 = nodePointer38.getValuePointer();
        int int41 = nodePointer38.getIndex();
        java.lang.Object obj42 = nodePointer38.clone();
        nodePointer38.setIndex((int) (short) 100);
        boolean boolean45 = nodePointer38.isContainer();
        nodePointer38.setAttribute(true);
        java.util.Locale locale48 = nodePointer38.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer49 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer23, qName34, (java.lang.Object) locale48);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator50 = dOMNodePointer11.childIterator(nodeTest12, false, nodePointer23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class org.w3c.dom.Node (java.lang.Double is in module java.base of loader 'bootstrap'; org.w3c.dom.Node is in module java.xml of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "100");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0d + "'", obj9, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "100");
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "100");
        org.junit.Assert.assertNotNull(nodePointer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-2147483648) + "'", int26 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertNotNull(nodePointer31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(nodePointer38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "100");
        org.junit.Assert.assertNotNull(nodePointer40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-2147483648) + "'", int41 == (-2147483648));
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals(obj42.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj42), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "100");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(locale48);
        org.junit.Assert.assertNotNull(nodePointer49);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        java.lang.String str6 = nodePointer5.toString();
        boolean boolean7 = nodePointer5.isContainer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver8 = null;
        nodePointer5.setNamespaceResolver(namespaceResolver8);
        org.apache.commons.jxpath.JXPathContext jXPathContext10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer5.createPath(jXPathContext10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer5);
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler13 = null;
        nodePointer5.setExceptionHandler(exceptionHandler13);
        int int15 = nodePointer5.getIndex();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100" + "'", str6, "100");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2147483648) + "'", int15 == (-2147483648));
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        boolean boolean6 = nodePointer5.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer5.getValuePointer();
        java.lang.Object obj8 = nodePointer7.getNodeValue();
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName9, (java.lang.Object) 100.0d, locale11);
        java.lang.Object obj13 = nodePointer12.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = nodePointer12.getValuePointer();
        int int15 = nodePointer7.compareTo((java.lang.Object) nodePointer14);
        nodePointer7.setIndex(10);
        java.lang.Object obj18 = nodePointer7.clone();
        org.w3c.dom.Node node19 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer20 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer7, node19);
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer20.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "100");
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "100");
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) '#', locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        boolean boolean5 = nodePointer3.isRoot();
        java.lang.Object obj6 = nodePointer3.getNode();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "/");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "/");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "/");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + '#' + "'", obj6, '#');
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        nodePointer5.setIndex((int) (short) -1);
        nodePointer5.setIndex((int) (short) 1);
        boolean boolean10 = nodePointer5.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer5.getImmediateValuePointer();
        nodePointer11.printPointerChain();
        org.w3c.dom.Node node13 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer11, node13);
        org.apache.commons.jxpath.JXPathContext jXPathContext15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer18 = dOMNodePointer14.getPointerByKey(jXPathContext15, "hi!", "100");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(nodePointer11);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler5 = null;
        nodePointer3.setExceptionHandler(exceptionHandler5);
        org.w3c.dom.Node node7 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer8 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer3, node7);
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 100.0d, locale8);
        java.lang.Object obj10 = nodePointer9.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer9.getValuePointer();
        int int12 = nodePointer9.getIndex();
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.apache.commons.jxpath.JXPathContext jXPathContext14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = nodePointer9.createPath(jXPathContext14);
        java.lang.Object obj16 = nodePointer15.getNodeValue();
        java.lang.Throwable throwable17 = null;
        nodePointer15.handle(throwable17);
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler19 = null;
        nodePointer15.setExceptionHandler(exceptionHandler19);
        boolean boolean21 = nodePointer15.isAttribute();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = nodePointer15.getImmediateParentPointer();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = nodePointer22.getIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "100");
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2147483648) + "'", int12 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(nodePointer22);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        nodePointer3.setIndex((int) 'a');
        java.lang.String str6 = nodePointer3.toString();
        org.w3c.dom.Node node7 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer8 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer3, node7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator9 = dOMNodePointer8.namespaceIterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100" + "'", str6, "100");
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        nodePointer3.setAttribute(false);
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler6 = null;
        nodePointer3.setExceptionHandler(exceptionHandler6);
        nodePointer3.setIndex((-1));
        java.lang.Object obj10 = nodePointer3.getNodeValue();
        java.lang.Object obj11 = nodePointer3.getNode();
        org.apache.commons.jxpath.ri.QName qName12 = null;
        org.apache.commons.jxpath.ri.QName qName13 = null;
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName14, (java.lang.Object) 100.0d, locale16);
        boolean boolean18 = nodePointer17.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = nodePointer17.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = nodePointer17.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer20);
        java.lang.Object obj22 = nodePointer21.getRootNode();
        org.apache.commons.jxpath.JXPathContext jXPathContext23 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = nodePointer21.createPath(jXPathContext23);
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer26 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName13, (java.lang.Object) nodePointer24, locale25);
        boolean boolean27 = nodePointer24.isRoot();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer3, qName12, (java.lang.Object) boolean27);
        java.lang.String str29 = nodePointer28.toString();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0d + "'", obj10, 100.0d);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0d + "'", obj22, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertNotNull(nodePointer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(nodePointer28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "100/null" + "'", str29, "100/null");
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        java.lang.Throwable throwable6 = null;
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName7, (java.lang.Object) 100.0d, locale9);
        java.lang.Object obj11 = nodePointer10.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer10.getValuePointer();
        nodePointer3.handle(throwable6, nodePointer10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = nodePointer3.getParent();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = nodePointer3.getImmediateValuePointer();
        java.lang.Throwable throwable16 = null;
        nodePointer15.handle(throwable16);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer15);
        org.apache.commons.jxpath.ri.QName qName19 = null;
        org.apache.commons.jxpath.ri.QName qName20 = null;
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName21, (java.lang.Object) 100.0d, locale23);
        nodePointer24.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = nodePointer24.getValuePointer();
        org.apache.commons.jxpath.JXPathContext jXPathContext28 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = nodePointer24.createPath(jXPathContext28);
        boolean boolean30 = nodePointer29.isNode();
        nodePointer29.printPointerChain();
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName20, (java.lang.Object) nodePointer29, locale32);
        java.lang.Object obj34 = nodePointer29.getRootNode();
        nodePointer29.setAttribute(false);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer15, qName19, (java.lang.Object) false);
        org.apache.commons.jxpath.JXPathContext jXPathContext38 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer41 = nodePointer37.getPointerByKey(jXPathContext38, "100", "<<unknown namespace>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "100");
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(nodePointer33);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0d + "'", obj34, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer37);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 100.0d, locale3);
        nodePointer4.setAttribute(false);
        java.lang.Object obj7 = nodePointer4.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = nodePointer4.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer8);
        nodePointer8.printPointerChain();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer8.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer8.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName13, (java.lang.Object) 100.0d, locale15);
        java.lang.Object obj17 = nodePointer16.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = nodePointer16.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName19, (java.lang.Object) 100.0d, locale21);
        java.lang.Object obj23 = nodePointer22.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = nodePointer22.getValuePointer();
        int int25 = nodePointer22.getIndex();
        int int26 = nodePointer16.compareTo((java.lang.Object) nodePointer22);
        boolean boolean27 = nodePointer22.isContainer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = nodePointer22.getValuePointer();
        java.lang.Object obj29 = nodePointer28.clone();
        int int30 = nodePointer8.compareTo(obj29);
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) int30, locale31);
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "100");
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "100");
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2147483648) + "'", int25 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(nodePointer28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "100");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodePointer32);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        nodePointer5.setIndex((int) (short) -1);
        java.lang.Object obj8 = nodePointer5.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = nodePointer5.getValuePointer();
        boolean boolean10 = nodePointer5.isContainer();
        java.lang.Object obj11 = nodePointer5.getNodeValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer5.getValuePointer();
        org.apache.commons.jxpath.JXPathContext jXPathContext13 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = nodePointer5.createPath(jXPathContext13);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = nodePointer5.getImmediateValuePointer();
        java.lang.Object obj16 = nodePointer5.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = nodePointer5.getImmediateValuePointer();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "100");
        org.junit.Assert.assertNotNull(nodePointer17);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        boolean boolean4 = nodePointer3.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        boolean boolean6 = nodePointer3.isNode();
        org.apache.commons.jxpath.ri.QName qName7 = null;
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName8, (java.lang.Object) 100.0d, locale10);
        java.lang.Object obj12 = nodePointer11.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer11.getValuePointer();
        boolean boolean14 = nodePointer13.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = nodePointer13.getValuePointer();
        java.lang.String str16 = nodePointer13.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = nodePointer13.getImmediateValuePointer();
        java.lang.Throwable throwable18 = null;
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName19, (java.lang.Object) 100.0d, locale21);
        java.lang.Object obj23 = nodePointer22.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = nodePointer22.getValuePointer();
        nodePointer24.setIndex((int) (short) -1);
        java.lang.Object obj27 = nodePointer24.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = nodePointer24.getValuePointer();
        java.lang.Object obj29 = nodePointer28.getNodeValue();
        nodePointer13.handle(throwable18, nodePointer28);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer3, qName7, (java.lang.Object) nodePointer13);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer13);
        org.w3c.dom.Node node33 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer34 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer32, node33);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "100");
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100" + "'", str16, "100");
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "100");
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0d + "'", obj27, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer28);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer31);
        org.junit.Assert.assertNotNull(nodePointer32);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 100.0d, locale3);
        nodePointer4.setAttribute(false);
        java.lang.Object obj7 = nodePointer4.getRootNode();
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, obj7, locale8);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer9.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.QName qName11 = null;
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName12, (java.lang.Object) 100.0d, locale14);
        java.lang.Object obj16 = nodePointer15.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = nodePointer15.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName18, (java.lang.Object) 100.0d, locale20);
        java.lang.Object obj22 = nodePointer21.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = nodePointer21.getValuePointer();
        int int24 = nodePointer21.getIndex();
        int int25 = nodePointer15.compareTo((java.lang.Object) nodePointer21);
        nodePointer21.printPointerChain();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer9, qName11, (java.lang.Object) nodePointer21);
        java.util.Locale locale28 = nodePointer21.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer21);
        org.w3c.dom.Node node30 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer31 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer21, node30);
        org.apache.commons.jxpath.JXPathContext jXPathContext32 = null;
        org.apache.commons.jxpath.ri.QName qName33 = null;
        org.apache.commons.jxpath.ri.QName qName35 = null;
        java.util.Locale locale37 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName35, (java.lang.Object) 100.0d, locale37);
        nodePointer38.setAttribute(false);
        java.lang.Object obj41 = nodePointer38.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = nodePointer38.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer43 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer42);
        org.apache.commons.jxpath.ri.QName qName44 = null;
        org.apache.commons.jxpath.ri.QName qName45 = null;
        java.util.Locale locale47 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer48 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName45, (java.lang.Object) 100.0d, locale47);
        java.lang.Object obj49 = nodePointer48.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer50 = nodePointer48.getValuePointer();
        int int51 = nodePointer48.getIndex();
        java.lang.Object obj52 = nodePointer48.clone();
        boolean boolean53 = nodePointer48.isNode();
        boolean boolean54 = nodePointer48.isRoot();
        nodePointer48.printPointerChain();
        java.lang.String str56 = nodePointer48.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer57 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer42, qName44, (java.lang.Object) str56);
        boolean boolean58 = nodePointer57.isNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer59 = dOMNodePointer31.createChild(jXPathContext32, qName33, (int) (byte) 0, (java.lang.Object) nodePointer57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "100");
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "100");
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2147483648) + "'", int24 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertNull(locale28);
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertNotNull(nodePointer38);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0d + "'", obj41, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer42);
        org.junit.Assert.assertNotNull(nodePointer43);
        org.junit.Assert.assertNotNull(nodePointer48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "100");
        org.junit.Assert.assertNotNull(nodePointer50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-2147483648) + "'", int51 == (-2147483648));
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertEquals(obj52.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj52), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj52), "100");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "100" + "'", str56, "100");
        org.junit.Assert.assertNotNull(nodePointer57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        int int6 = nodePointer3.getIndex();
        java.lang.Object obj7 = nodePointer3.clone();
        java.lang.Object obj8 = nodePointer3.getNodeValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer3);
        java.lang.String str10 = nodePointer9.toString();
        java.lang.Object obj11 = nodePointer9.getRootNode();
        java.lang.Object obj12 = nodePointer9.clone();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2147483648) + "'", int6 == (-2147483648));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "100");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100" + "'", str10, "100");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "100");
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 100.0d, locale3);
        java.lang.Object obj5 = nodePointer4.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer4.getValuePointer();
        nodePointer6.setAttribute(true);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = nodePointer6.getImmediateValuePointer();
        boolean boolean10 = nodePointer9.isContainer();
        boolean boolean11 = nodePointer9.isAttribute();
        java.lang.Throwable throwable12 = null;
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName13, (java.lang.Object) 100.0d, locale15);
        java.lang.Object obj17 = nodePointer16.clone();
        java.lang.Throwable throwable18 = null;
        nodePointer16.handle(throwable18);
        boolean boolean20 = nodePointer16.isRoot();
        nodePointer16.printPointerChain();
        nodePointer16.setIndex((int) (byte) -1);
        java.lang.Object obj24 = nodePointer16.getRootNode();
        nodePointer9.handle(throwable12, nodePointer16);
        org.apache.commons.jxpath.JXPathContext jXPathContext26 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = nodePointer9.createPath(jXPathContext26);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) nodePointer27, locale28);
        boolean boolean30 = nodePointer27.isNode();
        org.apache.commons.jxpath.ri.QName qName31 = null;
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName31, (java.lang.Object) 100.0d, locale33);
        java.lang.Object obj35 = nodePointer34.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer36 = nodePointer34.getValuePointer();
        int int37 = nodePointer34.getIndex();
        java.lang.Object obj38 = nodePointer34.clone();
        java.lang.Object obj39 = nodePointer34.getNode();
        java.lang.Object obj40 = nodePointer34.getNode();
        java.lang.Object obj41 = nodePointer34.clone();
        java.lang.Throwable throwable42 = null;
        nodePointer34.handle(throwable42);
        nodePointer34.printPointerChain();
        int int45 = nodePointer27.compareTo((java.lang.Object) nodePointer34);
        org.apache.commons.jxpath.JXPathContext jXPathContext46 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer47 = nodePointer27.createPath(jXPathContext46);
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "100");
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "100");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0d + "'", obj24, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(nodePointer34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "100");
        org.junit.Assert.assertNotNull(nodePointer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2147483648) + "'", int37 == (-2147483648));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "100");
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 100.0d + "'", obj39, 100.0d);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0d + "'", obj40, 100.0d);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals(obj41.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj41), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj41), "100");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(nodePointer47);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        boolean boolean6 = nodePointer5.isNode();
        nodePointer5.printPointerChain();
        boolean boolean8 = nodePointer5.isRoot();
        nodePointer5.printPointerChain();
        org.apache.commons.jxpath.JXPathContext jXPathContext10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer5.createPath(jXPathContext10);
        java.util.Locale locale12 = nodePointer5.getLocale();
        org.w3c.dom.Node node13 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer5, node13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName15, (java.lang.Object) 100.0d, locale17);
        java.lang.Object obj19 = nodePointer18.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = nodePointer18.getValuePointer();
        nodePointer20.setIndex((int) (short) -1);
        nodePointer20.setIndex((int) (short) 1);
        boolean boolean25 = nodePointer20.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer26 = nodePointer20.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = nodePointer20.getImmediateValuePointer();
        boolean boolean28 = nodePointer27.isNode();
        java.lang.Object obj29 = nodePointer27.getNode();
        org.apache.commons.jxpath.ri.QName qName30 = null;
        org.apache.commons.jxpath.ri.QName qName31 = null;
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName31, (java.lang.Object) 100.0d, locale33);
        nodePointer34.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = nodePointer34.getImmediateParentPointer();
        nodePointer34.setAttribute(false);
        org.apache.commons.jxpath.ri.QName qName40 = null;
        org.apache.commons.jxpath.ri.QName qName41 = null;
        java.util.Locale locale43 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer44 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName41, (java.lang.Object) '#', locale43);
        java.lang.Object obj45 = nodePointer44.clone();
        nodePointer44.setAttribute(false);
        java.lang.Object obj48 = nodePointer44.getNodeValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer49 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer34, qName40, (java.lang.Object) nodePointer44);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer50 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer27, qName30, (java.lang.Object) nodePointer44);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer51 = nodePointer27.getImmediateValuePointer();
        java.lang.Object obj52 = nodePointer27.getNode();
        java.lang.Object obj53 = nodePointer27.getNode();
        org.apache.commons.jxpath.ri.QName qName54 = null;
        org.apache.commons.jxpath.ri.QName qName55 = null;
        java.util.Locale locale57 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer58 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName55, (java.lang.Object) 100.0d, locale57);
        java.lang.Object obj59 = nodePointer58.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer60 = nodePointer58.getValuePointer();
        nodePointer60.setIndex((int) (short) -1);
        nodePointer60.setIndex((int) (short) 1);
        boolean boolean65 = nodePointer60.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer66 = nodePointer60.getImmediateValuePointer();
        int int67 = nodePointer60.getIndex();
        java.lang.String str68 = nodePointer60.toString();
        java.util.Locale locale69 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer70 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName54, (java.lang.Object) nodePointer60, locale69);
        // The following exception was thrown during execution in test generation
        try {
            int int71 = dOMNodePointer14.compareChildNodePointers(nodePointer27, nodePointer60);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class org.w3c.dom.Node (java.lang.Double is in module java.base of loader 'bootstrap'; org.w3c.dom.Node is in module java.xml of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "100");
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(nodePointer26);
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer34);
        org.junit.Assert.assertNull(nodePointer37);
        org.junit.Assert.assertNotNull(nodePointer44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "/");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "/");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "/");
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + '#' + "'", obj48, '#');
        org.junit.Assert.assertNotNull(nodePointer49);
        org.junit.Assert.assertNotNull(nodePointer50);
        org.junit.Assert.assertNotNull(nodePointer51);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 100.0d + "'", obj52, 100.0d);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 100.0d + "'", obj53, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer58);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertEquals(obj59.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj59), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj59), "100");
        org.junit.Assert.assertNotNull(nodePointer60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(nodePointer66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "100" + "'", str68, "100");
        org.junit.Assert.assertNotNull(nodePointer70);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        nodePointer5.setIndex((int) (short) -1);
        nodePointer5.setIndex((int) (short) 1);
        boolean boolean10 = nodePointer5.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer5.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer5.getImmediateValuePointer();
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler13 = null;
        nodePointer12.setExceptionHandler(exceptionHandler13);
        org.apache.commons.jxpath.JXPathContext jXPathContext15 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = nodePointer12.createPath(jXPathContext15);
        java.lang.Throwable throwable17 = null;
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName18, (java.lang.Object) 100.0d, locale20);
        java.lang.Object obj22 = nodePointer21.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = nodePointer21.getValuePointer();
        int int24 = nodePointer21.getIndex();
        java.lang.Object obj25 = nodePointer21.clone();
        java.lang.Object obj26 = nodePointer21.getNode();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver27 = null;
        nodePointer21.setNamespaceResolver(namespaceResolver27);
        nodePointer12.handle(throwable17, nodePointer21);
        org.w3c.dom.Node node30 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer31 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer12, node30);
        org.apache.commons.jxpath.JXPathContext jXPathContext32 = null;
        org.apache.commons.jxpath.ri.QName qName33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = dOMNodePointer31.createChild(jXPathContext32, qName33, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "100");
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2147483648) + "'", int24 == (-2147483648));
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "100");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0d + "'", obj26, 100.0d);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        nodePointer5.setIndex((int) (short) -1);
        java.lang.String str8 = nodePointer5.toString();
        org.apache.commons.jxpath.JXPathContext jXPathContext9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer5.createPath(jXPathContext9);
        boolean boolean11 = nodePointer10.isAttribute();
        org.apache.commons.jxpath.JXPathContext jXPathContext12 = null;
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName13, (java.lang.Object) 100.0d, locale15);
        java.lang.Object obj17 = nodePointer16.clone();
        java.lang.Throwable throwable18 = null;
        nodePointer16.handle(throwable18);
        boolean boolean20 = nodePointer16.isRoot();
        nodePointer16.printPointerChain();
        nodePointer16.setIndex((int) (byte) -1);
        java.lang.Object obj24 = nodePointer16.clone();
        java.lang.Object obj25 = nodePointer16.clone();
        org.apache.commons.jxpath.JXPathContext jXPathContext26 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = nodePointer16.createPath(jXPathContext26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = nodePointer10.createPath(jXPathContext12, (java.lang.Object) nodePointer27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot replace the root object");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100" + "'", str8, "100");
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "100");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "100");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "100");
        org.junit.Assert.assertNotNull(nodePointer27);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        java.lang.Throwable throwable5 = null;
        nodePointer3.handle(throwable5);
        boolean boolean7 = nodePointer3.isRoot();
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = nodePointer3.getImmediateParentPointer();
        java.util.Locale locale10 = nodePointer3.getLocale();
        nodePointer3.printPointerChain();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(nodePointer9);
        org.junit.Assert.assertNull(locale10);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 100.0d, locale3);
        java.lang.Object obj5 = nodePointer4.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer4.getValuePointer();
        boolean boolean7 = nodePointer6.isNode();
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) boolean7, locale8);
        java.lang.Object obj10 = nodePointer9.clone();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver11 = null;
        nodePointer9.setNamespaceResolver(namespaceResolver11);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer9.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = nodePointer9.getImmediateValuePointer();
        java.util.Locale locale15 = nodePointer9.getLocale();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "100");
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "true()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "true()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "true()");
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertNull(locale15);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        nodePointer3.setIndex((int) (byte) 0);
        java.lang.Object obj6 = nodePointer3.getRootNode();
        org.apache.commons.jxpath.ri.QName qName7 = null;
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName8, (java.lang.Object) 100.0d, locale10);
        java.lang.Object obj12 = nodePointer11.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer11.getValuePointer();
        nodePointer13.setIndex((int) (short) -1);
        nodePointer13.setIndex((int) (short) 1);
        boolean boolean18 = nodePointer13.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = nodePointer13.getImmediateValuePointer();
        nodePointer19.printPointerChain();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer3, qName7, (java.lang.Object) nodePointer19);
        org.apache.commons.jxpath.ri.QName qName22 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName22, (java.lang.Object) 100.0d, locale24);
        java.lang.Object obj26 = nodePointer25.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = nodePointer25.getValuePointer();
        nodePointer27.setAttribute(true);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = nodePointer27.getImmediateValuePointer();
        boolean boolean31 = nodePointer30.isContainer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = nodePointer30.getValuePointer();
        java.lang.Object obj33 = nodePointer30.clone();
        int int34 = nodePointer3.compareTo(obj33);
        java.lang.Throwable throwable35 = null;
        nodePointer3.handle(throwable35);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = nodePointer3.getImmediateValuePointer();
        nodePointer37.setIndex((int) (short) -1);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "100");
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertNotNull(nodePointer25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "100");
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertNotNull(nodePointer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(nodePointer32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "100");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(nodePointer37);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        int int6 = nodePointer3.getIndex();
        java.lang.Object obj7 = nodePointer3.clone();
        boolean boolean8 = nodePointer3.isNode();
        java.lang.Throwable throwable9 = null;
        nodePointer3.handle(throwable9);
        org.apache.commons.jxpath.JXPathContext jXPathContext11 = null;
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName12, (java.lang.Object) 100.0d, locale14);
        nodePointer15.setAttribute(false);
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler18 = null;
        nodePointer15.setExceptionHandler(exceptionHandler18);
        nodePointer15.setIndex((-1));
        org.apache.commons.jxpath.JXPathContext jXPathContext22 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = nodePointer15.createPath(jXPathContext22);
        int int24 = nodePointer15.getIndex();
        java.lang.String str25 = nodePointer15.toString();
        org.apache.commons.jxpath.ri.QName qName26 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName26, (java.lang.Object) 100.0d, locale28);
        java.lang.Object obj30 = nodePointer29.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = nodePointer29.getValuePointer();
        nodePointer31.setIndex((int) (short) -1);
        nodePointer31.setIndex((int) (short) 1);
        boolean boolean36 = nodePointer31.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = nodePointer31.getImmediateValuePointer();
        int int38 = nodePointer15.compareTo((java.lang.Object) nodePointer37);
        boolean boolean39 = nodePointer15.isContainer();
        java.lang.Throwable throwable40 = null;
        nodePointer15.handle(throwable40);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = nodePointer3.createPath(jXPathContext11, (java.lang.Object) nodePointer15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot replace the root object");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2147483648) + "'", int6 == (-2147483648));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "100");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "100" + "'", str25, "100");
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "100");
        org.junit.Assert.assertNotNull(nodePointer31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(nodePointer37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        int int6 = nodePointer3.getIndex();
        java.lang.Object obj7 = nodePointer3.clone();
        java.lang.Object obj8 = nodePointer3.getNode();
        java.lang.Object obj9 = nodePointer3.getNode();
        java.lang.Object obj10 = nodePointer3.getNode();
        java.lang.Throwable throwable11 = null;
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName12, (java.lang.Object) 100.0d, locale14);
        java.lang.Object obj16 = nodePointer15.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = nodePointer15.getValuePointer();
        nodePointer17.setAttribute(true);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = nodePointer17.getImmediateValuePointer();
        boolean boolean21 = nodePointer20.isContainer();
        boolean boolean22 = nodePointer20.isAttribute();
        java.lang.Throwable throwable23 = null;
        org.apache.commons.jxpath.ri.QName qName24 = null;
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName24, (java.lang.Object) 100.0d, locale26);
        java.lang.Object obj28 = nodePointer27.clone();
        java.lang.Throwable throwable29 = null;
        nodePointer27.handle(throwable29);
        boolean boolean31 = nodePointer27.isRoot();
        nodePointer27.printPointerChain();
        nodePointer27.setIndex((int) (byte) -1);
        java.lang.Object obj35 = nodePointer27.getRootNode();
        nodePointer20.handle(throwable23, nodePointer27);
        org.apache.commons.jxpath.JXPathContext jXPathContext37 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = nodePointer20.createPath(jXPathContext37);
        nodePointer3.handle(throwable11, nodePointer38);
        boolean boolean40 = nodePointer3.isRoot();
        java.lang.Object obj41 = nodePointer3.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = nodePointer3.getValuePointer();
        java.lang.Throwable throwable43 = null;
        org.apache.commons.jxpath.ri.QName qName44 = null;
        java.util.Locale locale46 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer47 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName44, (java.lang.Object) 100.0d, locale46);
        java.lang.Object obj48 = nodePointer47.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer49 = nodePointer47.getValuePointer();
        nodePointer49.setIndex((int) (short) -1);
        java.lang.Object obj52 = nodePointer49.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer53 = nodePointer49.getValuePointer();
        boolean boolean54 = nodePointer53.isNode();
        java.lang.Object obj55 = nodePointer53.getNode();
        java.lang.Throwable throwable56 = null;
        org.apache.commons.jxpath.ri.QName qName57 = null;
        java.util.Locale locale59 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer60 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName57, (java.lang.Object) 100.0d, locale59);
        java.lang.Object obj61 = nodePointer60.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer62 = nodePointer60.getValuePointer();
        int int63 = nodePointer60.getIndex();
        java.lang.Object obj64 = nodePointer60.clone();
        boolean boolean65 = nodePointer60.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer66 = nodePointer60.getImmediateValuePointer();
        nodePointer53.handle(throwable56, nodePointer66);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer68 = nodePointer66.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer69 = nodePointer66.getImmediateParentPointer();
        nodePointer42.handle(throwable43, nodePointer66);
        java.lang.Object obj71 = nodePointer66.getRootNode();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2147483648) + "'", int6 == (-2147483648));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "100");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0d + "'", obj9, 100.0d);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0d + "'", obj10, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "100");
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "100");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0d + "'", obj35, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0d + "'", obj41, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer42);
        org.junit.Assert.assertNotNull(nodePointer47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "100");
        org.junit.Assert.assertNotNull(nodePointer49);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 100.0d + "'", obj52, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 100.0d + "'", obj55, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer60);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertEquals(obj61.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj61), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj61), "100");
        org.junit.Assert.assertNotNull(nodePointer62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-2147483648) + "'", int63 == (-2147483648));
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertEquals(obj64.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj64), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj64), "100");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(nodePointer66);
        org.junit.Assert.assertNotNull(nodePointer68);
        org.junit.Assert.assertNull(nodePointer69);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + 100.0d + "'", obj71, 100.0d);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.JXPathContext jXPathContext4 = null;
        org.apache.commons.jxpath.ri.QName qName5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = dOMNodePointer3.createChild(jXPathContext4, qName5, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        nodePointer3.setAttribute(false);
        java.lang.Object obj6 = nodePointer3.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer7);
        nodePointer7.printPointerChain();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer7.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer7.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName12 = null;
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName13, (java.lang.Object) 100.0d, locale15);
        java.lang.Object obj17 = nodePointer16.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = nodePointer16.getValuePointer();
        nodePointer18.setAttribute(true);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = nodePointer18.getImmediateValuePointer();
        boolean boolean22 = nodePointer21.isContainer();
        boolean boolean23 = nodePointer21.isAttribute();
        java.lang.Throwable throwable24 = null;
        org.apache.commons.jxpath.ri.QName qName25 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName25, (java.lang.Object) 100.0d, locale27);
        java.lang.Object obj29 = nodePointer28.clone();
        java.lang.Throwable throwable30 = null;
        nodePointer28.handle(throwable30);
        boolean boolean32 = nodePointer28.isRoot();
        nodePointer28.printPointerChain();
        nodePointer28.setIndex((int) (byte) -1);
        java.lang.Object obj36 = nodePointer28.getRootNode();
        nodePointer21.handle(throwable24, nodePointer28);
        org.apache.commons.jxpath.JXPathContext jXPathContext38 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer39 = nodePointer21.createPath(jXPathContext38);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer40 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer7, qName12, (java.lang.Object) nodePointer21);
        boolean boolean41 = nodePointer21.isAttribute();
        org.w3c.dom.Node node42 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer43 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer21, node42);
        org.apache.commons.jxpath.ri.QName qName44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator45 = dOMNodePointer43.attributeIterator(qName44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "100");
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(nodePointer28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "100");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0d + "'", obj36, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer39);
        org.junit.Assert.assertNotNull(nodePointer40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        nodePointer3.setAttribute(false);
        java.lang.Object obj6 = nodePointer3.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer7);
        org.apache.commons.jxpath.ri.QName qName9 = null;
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName10, (java.lang.Object) 100.0d, locale12);
        java.lang.Object obj14 = nodePointer13.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = nodePointer13.getValuePointer();
        int int16 = nodePointer13.getIndex();
        java.lang.Object obj17 = nodePointer13.clone();
        nodePointer13.setIndex((int) (short) 100);
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler20 = null;
        nodePointer13.setExceptionHandler(exceptionHandler20);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = nodePointer13.getImmediateParentPointer();
        java.lang.Object obj23 = nodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer7, qName9, obj23);
        int int25 = nodePointer24.getIndex();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "100");
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2147483648) + "'", int16 == (-2147483648));
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "100");
        org.junit.Assert.assertNull(nodePointer22);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2147483648) + "'", int25 == (-2147483648));
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 100.0d, locale3);
        nodePointer4.setAttribute(false);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer4.getParent();
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName8, (java.lang.Object) 100.0d, locale10);
        java.lang.Object obj12 = nodePointer11.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer11.getValuePointer();
        nodePointer13.setIndex((int) (short) -1);
        java.lang.Object obj16 = nodePointer13.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = nodePointer13.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = nodePointer17.getImmediateParentPointer();
        int int19 = nodePointer4.compareTo((java.lang.Object) nodePointer17);
        org.apache.commons.jxpath.JXPathContext jXPathContext20 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = nodePointer17.createPath(jXPathContext20);
        nodePointer21.setAttribute(true);
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) true, locale24);
        org.apache.commons.jxpath.ri.QName qName26 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer25, qName26, (java.lang.Object) "<<unknown namespace>>");
        org.apache.commons.jxpath.ri.QName qName29 = null;
        org.apache.commons.jxpath.ri.QName qName30 = null;
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName30, (java.lang.Object) 100.0d, locale32);
        java.lang.Object obj34 = nodePointer33.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = nodePointer33.getValuePointer();
        boolean boolean36 = nodePointer35.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = nodePointer35.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer37);
        nodePointer38.printPointerChain();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer40 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer25, qName29, (java.lang.Object) nodePointer38);
        org.w3c.dom.Node node41 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer42 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer25, node41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = dOMNodePointer42.asPath();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "100");
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertNull(nodePointer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertNotNull(nodePointer25);
        org.junit.Assert.assertNotNull(nodePointer28);
        org.junit.Assert.assertNotNull(nodePointer33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "100");
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(nodePointer37);
        org.junit.Assert.assertNotNull(nodePointer38);
        org.junit.Assert.assertNotNull(nodePointer40);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 100.0d, locale8);
        java.lang.Object obj10 = nodePointer9.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer9.getValuePointer();
        int int12 = nodePointer9.getIndex();
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.apache.commons.jxpath.JXPathContext jXPathContext14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = nodePointer9.createPath(jXPathContext14);
        int int16 = nodePointer15.getIndex();
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName17, (java.lang.Object) '#', locale19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName21, (java.lang.Object) 100.0d, locale23);
        nodePointer24.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver27 = null;
        nodePointer24.setNamespaceResolver(namespaceResolver27);
        int int29 = nodePointer20.compareTo((java.lang.Object) nodePointer24);
        int int30 = nodePointer15.compareTo((java.lang.Object) nodePointer20);
        org.apache.commons.jxpath.ri.QName qName31 = null;
        org.apache.commons.jxpath.ri.QName qName32 = null;
        java.util.Locale locale34 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName32, (java.lang.Object) 100.0d, locale34);
        java.lang.Object obj36 = nodePointer35.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = nodePointer35.getValuePointer();
        int int38 = nodePointer35.getIndex();
        boolean boolean39 = nodePointer35.isContainer();
        org.apache.commons.jxpath.JXPathContext jXPathContext40 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer41 = nodePointer35.createPath(jXPathContext40);
        java.lang.Throwable throwable42 = null;
        org.apache.commons.jxpath.ri.QName qName43 = null;
        java.util.Locale locale45 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer46 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName43, (java.lang.Object) 100.0d, locale45);
        java.lang.Object obj47 = nodePointer46.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer48 = nodePointer46.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName49 = null;
        org.apache.commons.jxpath.ri.QName qName50 = null;
        java.util.Locale locale52 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer53 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName50, (java.lang.Object) 100.0d, locale52);
        nodePointer53.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer56 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer46, qName49, (java.lang.Object) nodePointer53);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer57 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer56);
        java.util.Locale locale58 = nodePointer57.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer59 = nodePointer57.getValuePointer();
        nodePointer35.handle(throwable42, nodePointer57);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer61 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer15, qName31, (java.lang.Object) nodePointer35);
        org.w3c.dom.Node node62 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer63 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer35, node62);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "100");
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2147483648) + "'", int12 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2147483648) + "'", int16 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "100");
        org.junit.Assert.assertNotNull(nodePointer37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-2147483648) + "'", int38 == (-2147483648));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(nodePointer41);
        org.junit.Assert.assertNotNull(nodePointer46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "100");
        org.junit.Assert.assertNotNull(nodePointer48);
        org.junit.Assert.assertNotNull(nodePointer53);
        org.junit.Assert.assertNotNull(nodePointer56);
        org.junit.Assert.assertNotNull(nodePointer57);
        org.junit.Assert.assertNull(locale58);
        org.junit.Assert.assertNotNull(nodePointer59);
        org.junit.Assert.assertNotNull(nodePointer61);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        java.lang.Object obj5 = nodePointer3.clone();
        java.lang.Object obj6 = nodePointer3.getNodeValue();
        nodePointer3.setAttribute(true);
        nodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.lang.Object obj12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer3, qName11, obj12);
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer3, node14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = dOMNodePointer15.isLanguage("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "100");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer13);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        nodePointer5.setAttribute(true);
        org.w3c.dom.Node node8 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer5, node8);
        org.apache.commons.jxpath.JXPathContext jXPathContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer12 = dOMNodePointer9.getPointerByID(jXPathContext10, "http://www.w3.org/XML/1998/namespace");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        java.lang.Throwable throwable6 = null;
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName7, (java.lang.Object) 100.0d, locale9);
        java.lang.Object obj11 = nodePointer10.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer10.getValuePointer();
        nodePointer3.handle(throwable6, nodePointer10);
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer10, node14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = dOMNodePointer15.isLanguage("100/null");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "100");
        org.junit.Assert.assertNotNull(nodePointer12);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        java.lang.Throwable throwable5 = null;
        nodePointer3.handle(throwable5);
        boolean boolean7 = nodePointer3.isRoot();
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer3);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer9.getImmediateParentPointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer9.getValuePointer();
        java.lang.Object obj12 = nodePointer11.getNodeValue();
        java.lang.Object obj13 = nodePointer11.getRootNode();
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer11, node14);
        org.apache.commons.jxpath.JXPathContext jXPathContext16 = null;
        org.apache.commons.jxpath.ri.QName qName17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = dOMNodePointer15.createChild(jXPathContext16, qName17, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNull(nodePointer10);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        int int6 = nodePointer3.getIndex();
        java.lang.Object obj7 = nodePointer3.clone();
        java.lang.Object obj8 = nodePointer3.getNode();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver9 = null;
        nodePointer3.setNamespaceResolver(namespaceResolver9);
        java.lang.Object obj11 = nodePointer3.getRootNode();
        nodePointer3.setIndex((int) (short) 0);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2147483648) + "'", int6 == (-2147483648));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "100");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName7, (java.lang.Object) 100.0d, locale9);
        nodePointer10.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer3, qName6, (java.lang.Object) nodePointer10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer13);
        java.util.Locale locale15 = nodePointer14.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = nodePointer14.getValuePointer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver17 = null;
        nodePointer16.setNamespaceResolver(namespaceResolver17);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = nodePointer16.getImmediateValuePointer();
        java.lang.Object obj20 = nodePointer16.getNode();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertNull(locale15);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "100");
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        nodePointer5.setIndex((int) (short) -1);
        nodePointer5.setIndex((int) (short) 1);
        boolean boolean10 = nodePointer5.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer5.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer5.getImmediateValuePointer();
        boolean boolean13 = nodePointer12.isNode();
        java.lang.Object obj14 = nodePointer12.getNode();
        org.apache.commons.jxpath.ri.QName qName15 = null;
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName16, (java.lang.Object) 100.0d, locale18);
        nodePointer19.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = nodePointer19.getImmediateParentPointer();
        nodePointer19.setAttribute(false);
        org.apache.commons.jxpath.ri.QName qName25 = null;
        org.apache.commons.jxpath.ri.QName qName26 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName26, (java.lang.Object) '#', locale28);
        java.lang.Object obj30 = nodePointer29.clone();
        nodePointer29.setAttribute(false);
        java.lang.Object obj33 = nodePointer29.getNodeValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer19, qName25, (java.lang.Object) nodePointer29);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer12, qName15, (java.lang.Object) nodePointer29);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer36 = nodePointer12.getImmediateValuePointer();
        java.lang.Object obj37 = nodePointer12.getNode();
        java.lang.Object obj38 = nodePointer12.getNode();
        org.apache.commons.jxpath.JXPathContext jXPathContext39 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer40 = nodePointer12.createPath(jXPathContext39);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0d + "'", obj14, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNull(nodePointer22);
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "/");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "/");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "/");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + '#' + "'", obj33, '#');
        org.junit.Assert.assertNotNull(nodePointer34);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertNotNull(nodePointer36);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 100.0d + "'", obj37, 100.0d);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0d + "'", obj38, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer40);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        nodePointer3.setAttribute(false);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.getParent();
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName7, (java.lang.Object) 100.0d, locale9);
        java.lang.Object obj11 = nodePointer10.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer10.getValuePointer();
        nodePointer12.setIndex((int) (short) -1);
        java.lang.Object obj15 = nodePointer12.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = nodePointer12.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = nodePointer16.getImmediateParentPointer();
        int int18 = nodePointer3.compareTo((java.lang.Object) nodePointer16);
        org.apache.commons.jxpath.JXPathContext jXPathContext19 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = nodePointer16.createPath(jXPathContext19);
        nodePointer20.setAttribute(true);
        boolean boolean23 = nodePointer20.isContainer();
        boolean boolean24 = nodePointer20.isNode();
        java.lang.Throwable throwable25 = null;
        org.apache.commons.jxpath.ri.QName qName26 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName26, (java.lang.Object) 100.0d, locale28);
        boolean boolean30 = nodePointer29.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = nodePointer29.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = nodePointer29.getImmediateParentPointer();
        nodePointer29.setIndex((int) ' ');
        nodePointer20.handle(throwable25, nodePointer29);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(nodePointer6);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "100");
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertNull(nodePointer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(nodePointer31);
        org.junit.Assert.assertNull(nodePointer32);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        boolean boolean6 = nodePointer5.isNode();
        nodePointer5.printPointerChain();
        boolean boolean8 = nodePointer5.isRoot();
        nodePointer5.printPointerChain();
        org.apache.commons.jxpath.JXPathContext jXPathContext10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer5.createPath(jXPathContext10);
        java.lang.Object obj12 = nodePointer5.getRootNode();
        boolean boolean13 = nodePointer5.isAttribute();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        nodePointer5.setIndex((int) (short) -1);
        nodePointer5.setIndex((int) (short) 1);
        boolean boolean10 = nodePointer5.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer5.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer5.getImmediateValuePointer();
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler13 = null;
        nodePointer12.setExceptionHandler(exceptionHandler13);
        org.apache.commons.jxpath.JXPathContext jXPathContext15 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = nodePointer12.createPath(jXPathContext15);
        boolean boolean17 = nodePointer12.isNode();
        java.util.Locale locale18 = nodePointer12.getLocale();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(locale18);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        nodePointer5.setIndex((int) (short) -1);
        nodePointer5.setIndex((int) (short) 1);
        boolean boolean10 = nodePointer5.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer5.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer5.getImmediateValuePointer();
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler13 = null;
        nodePointer12.setExceptionHandler(exceptionHandler13);
        org.apache.commons.jxpath.JXPathContext jXPathContext15 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = nodePointer12.createPath(jXPathContext15);
        boolean boolean17 = nodePointer12.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = nodePointer12.getImmediateParentPointer();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(nodePointer18);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        nodePointer5.setIndex((int) (short) -1);
        nodePointer5.setIndex((int) (short) 1);
        boolean boolean10 = nodePointer5.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer5.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer5.getImmediateValuePointer();
        boolean boolean13 = nodePointer12.isNode();
        java.lang.Object obj14 = nodePointer12.getNode();
        org.apache.commons.jxpath.ri.QName qName15 = null;
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName16, (java.lang.Object) 100.0d, locale18);
        nodePointer19.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = nodePointer19.getImmediateParentPointer();
        nodePointer19.setAttribute(false);
        org.apache.commons.jxpath.ri.QName qName25 = null;
        org.apache.commons.jxpath.ri.QName qName26 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName26, (java.lang.Object) '#', locale28);
        java.lang.Object obj30 = nodePointer29.clone();
        nodePointer29.setAttribute(false);
        java.lang.Object obj33 = nodePointer29.getNodeValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer19, qName25, (java.lang.Object) nodePointer29);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer12, qName15, (java.lang.Object) nodePointer29);
        java.lang.Object obj36 = nodePointer29.getRootNode();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0d + "'", obj14, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNull(nodePointer22);
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "/");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "/");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "/");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + '#' + "'", obj33, '#');
        org.junit.Assert.assertNotNull(nodePointer34);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + '#' + "'", obj36, '#');
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) '#', locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        java.lang.Throwable throwable6 = null;
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName7, (java.lang.Object) 100.0d, locale9);
        java.lang.Object obj11 = nodePointer10.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer10.getValuePointer();
        nodePointer12.setIndex((int) (short) -1);
        nodePointer12.setIndex((int) (short) 1);
        boolean boolean17 = nodePointer12.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = nodePointer12.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = nodePointer12.getImmediateValuePointer();
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler20 = null;
        nodePointer19.setExceptionHandler(exceptionHandler20);
        org.apache.commons.jxpath.JXPathContext jXPathContext22 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = nodePointer19.createPath(jXPathContext22);
        java.lang.String str24 = nodePointer19.toString();
        nodePointer19.setIndex((int) '4');
        java.lang.Object obj27 = nodePointer19.getRootNode();
        nodePointer19.printPointerChain();
        org.apache.commons.jxpath.JXPathContext jXPathContext29 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = nodePointer19.createPath(jXPathContext29);
        nodePointer5.handle(throwable6, nodePointer30);
        org.w3c.dom.Node node32 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer33 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer5, node32);
        org.apache.commons.jxpath.JXPathContext jXPathContext34 = null;
        org.apache.commons.jxpath.ri.QName qName35 = null;
        org.apache.commons.jxpath.ri.QName qName37 = null;
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer40 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName37, (java.lang.Object) 100.0d, locale39);
        java.lang.Object obj41 = nodePointer40.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = nodePointer40.getParent();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer43 = nodePointer40.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver44 = null;
        nodePointer40.setNamespaceResolver(namespaceResolver44);
        org.apache.commons.jxpath.ri.QName qName46 = null;
        org.apache.commons.jxpath.ri.QName qName47 = null;
        java.util.Locale locale49 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer50 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName47, (java.lang.Object) 100.0d, locale49);
        java.lang.Object obj51 = nodePointer50.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer52 = nodePointer50.getValuePointer();
        nodePointer52.setIndex((int) (short) -1);
        nodePointer52.setIndex((int) (short) 1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer57 = nodePointer52.getImmediateParentPointer();
        nodePointer52.setAttribute(true);
        java.util.Locale locale60 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer61 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName46, (java.lang.Object) nodePointer52, locale60);
        org.apache.commons.jxpath.ri.QName qName62 = null;
        org.apache.commons.jxpath.ri.QName qName63 = null;
        java.util.Locale locale65 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer66 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName63, (java.lang.Object) 100.0d, locale65);
        java.lang.Object obj67 = nodePointer66.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer68 = nodePointer66.getValuePointer();
        nodePointer68.setIndex(0);
        boolean boolean71 = nodePointer68.isRoot();
        java.lang.Object obj72 = nodePointer68.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer73 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer52, qName62, (java.lang.Object) nodePointer68);
        boolean boolean74 = nodePointer68.isNode();
        int int75 = nodePointer40.compareTo((java.lang.Object) nodePointer68);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer76 = dOMNodePointer33.createChild(jXPathContext34, qName35, 97, (java.lang.Object) nodePointer68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "/");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "/");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "/");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "100");
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "100" + "'", str24, "100");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0d + "'", obj27, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer30);
        org.junit.Assert.assertNotNull(nodePointer40);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0d + "'", obj41, 100.0d);
        org.junit.Assert.assertNull(nodePointer42);
        org.junit.Assert.assertNotNull(nodePointer43);
        org.junit.Assert.assertNotNull(nodePointer50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "100");
        org.junit.Assert.assertNotNull(nodePointer52);
        org.junit.Assert.assertNull(nodePointer57);
        org.junit.Assert.assertNotNull(nodePointer61);
        org.junit.Assert.assertNotNull(nodePointer66);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertEquals(obj67.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj67), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj67), "100");
        org.junit.Assert.assertNotNull(nodePointer68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertEquals(obj72.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj72), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj72), "100");
        org.junit.Assert.assertNotNull(nodePointer73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        int int6 = nodePointer3.getIndex();
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName7, (java.lang.Object) 100.0d, locale9);
        java.lang.Object obj11 = nodePointer10.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer10.getValuePointer();
        int int13 = nodePointer10.getIndex();
        java.lang.Object obj14 = nodePointer10.clone();
        java.lang.Object obj15 = nodePointer10.getNodeValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer10);
        int int17 = nodePointer3.compareTo((java.lang.Object) nodePointer16);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = nodePointer3.getImmediateParentPointer();
        // The following exception was thrown during execution in test generation
        try {
            nodePointer18.setAttribute(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2147483648) + "'", int6 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "100");
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2147483648) + "'", int13 == (-2147483648));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "100");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(nodePointer18);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 100.0d, locale3);
        nodePointer4.setAttribute(false);
        java.lang.Object obj7 = nodePointer4.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = nodePointer4.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer8);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer8.getValuePointer();
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler11 = null;
        nodePointer10.setExceptionHandler(exceptionHandler11);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver13 = null;
        nodePointer10.setNamespaceResolver(namespaceResolver13);
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) namespaceResolver13, locale15);
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 100.0d + "'", obj7, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(nodePointer16);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        nodePointer5.setIndex((int) (short) -1);
        java.lang.String str8 = nodePointer5.toString();
        boolean boolean9 = nodePointer5.isAttribute();
        boolean boolean10 = nodePointer5.isContainer();
        org.apache.commons.jxpath.ri.QName qName11 = null;
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName12, (java.lang.Object) 100.0d, locale14);
        nodePointer15.setAttribute(false);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = nodePointer15.getParent();
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName19, (java.lang.Object) 100.0d, locale21);
        java.lang.Object obj23 = nodePointer22.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = nodePointer22.getValuePointer();
        nodePointer24.setIndex((int) (short) -1);
        java.lang.Object obj27 = nodePointer24.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = nodePointer24.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = nodePointer28.getImmediateParentPointer();
        int int30 = nodePointer15.compareTo((java.lang.Object) nodePointer28);
        java.lang.Throwable throwable31 = null;
        org.apache.commons.jxpath.ri.QName qName32 = null;
        java.util.Locale locale34 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName32, (java.lang.Object) '#', locale34);
        java.lang.Object obj36 = nodePointer35.clone();
        boolean boolean37 = nodePointer35.isRoot();
        nodePointer15.handle(throwable31, nodePointer35);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer39 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer5, qName11, (java.lang.Object) nodePointer15);
        java.lang.Object obj40 = nodePointer39.getRootNode();
        java.lang.Object obj41 = nodePointer39.clone();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100" + "'", str8, "100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertNull(nodePointer18);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "100");
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0d + "'", obj27, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer28);
        org.junit.Assert.assertNull(nodePointer29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "/");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "/");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "/");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(nodePointer39);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0d + "'", obj40, 100.0d);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals(obj41.toString(), "100/null");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj41), "100/null");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj41), "100/null");
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        int int6 = nodePointer3.getIndex();
        boolean boolean7 = nodePointer3.isContainer();
        org.apache.commons.jxpath.JXPathContext jXPathContext8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = nodePointer3.createPath(jXPathContext8);
        java.lang.Throwable throwable10 = null;
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName11, (java.lang.Object) 100.0d, locale13);
        java.lang.Object obj15 = nodePointer14.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = nodePointer14.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName17 = null;
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName18, (java.lang.Object) 100.0d, locale20);
        nodePointer21.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer14, qName17, (java.lang.Object) nodePointer21);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer24);
        java.util.Locale locale26 = nodePointer25.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = nodePointer25.getValuePointer();
        nodePointer3.handle(throwable10, nodePointer25);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = nodePointer25.getValuePointer();
        org.w3c.dom.Node node30 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer31 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer29, node30);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = dOMNodePointer31.isLeaf();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2147483648) + "'", int6 == (-2147483648));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "100");
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertNotNull(nodePointer25);
        org.junit.Assert.assertNull(locale26);
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertNotNull(nodePointer29);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        java.lang.Object obj5 = nodePointer3.clone();
        java.lang.Object obj6 = nodePointer3.getNodeValue();
        nodePointer3.setAttribute(true);
        nodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer3.getValuePointer();
        java.lang.Object obj12 = nodePointer3.getNode();
        org.w3c.dom.Node node13 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer3, node13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = dOMNodePointer14.namespaceIterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "100");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 100.0d, locale8);
        java.lang.Object obj10 = nodePointer9.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer9.getValuePointer();
        int int12 = nodePointer9.getIndex();
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.apache.commons.jxpath.JXPathContext jXPathContext14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = nodePointer9.createPath(jXPathContext14);
        int int16 = nodePointer15.getIndex();
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName17, (java.lang.Object) '#', locale19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName21, (java.lang.Object) 100.0d, locale23);
        nodePointer24.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver27 = null;
        nodePointer24.setNamespaceResolver(namespaceResolver27);
        int int29 = nodePointer20.compareTo((java.lang.Object) nodePointer24);
        int int30 = nodePointer15.compareTo((java.lang.Object) nodePointer20);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = nodePointer20.getImmediateValuePointer();
        java.lang.Object obj32 = nodePointer20.getNode();
        java.lang.Object obj33 = nodePointer20.getRootNode();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "100");
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2147483648) + "'", int12 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2147483648) + "'", int16 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodePointer31);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + '#' + "'", obj32, '#');
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + '#' + "'", obj33, '#');
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 100.0d, locale3);
        java.lang.Object obj5 = nodePointer4.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer4.getValuePointer();
        boolean boolean7 = nodePointer6.isNode();
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) boolean7, locale8);
        org.apache.commons.jxpath.JXPathContext jXPathContext10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer9.createPath(jXPathContext10);
        nodePointer9.setAttribute(true);
        nodePointer9.setIndex(10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = nodePointer9.getImmediateParentPointer();
        nodePointer9.setAttribute(false);
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "100");
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNull(nodePointer16);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        int int6 = nodePointer3.getIndex();
        java.lang.Object obj7 = nodePointer3.clone();
        boolean boolean8 = nodePointer3.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = nodePointer3.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer3.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer3.getValuePointer();
        org.w3c.dom.Node node12 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer13 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer3, node12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = dOMNodePointer13.namespaceIterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2147483648) + "'", int6 == (-2147483648));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "100");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(nodePointer11);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.QName qName2 = null;
        org.apache.commons.jxpath.ri.QName qName3 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName3, (java.lang.Object) 100.0d, locale5);
        nodePointer6.setAttribute(false);
        java.lang.Object obj9 = nodePointer6.getRootNode();
        int int10 = nodePointer6.getIndex();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer6.getValuePointer();
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName2, (java.lang.Object) nodePointer11, locale12);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer0, qName1, (java.lang.Object) nodePointer11);
        org.w3c.dom.Node node15 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer16 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer0, node15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = dOMNodePointer16.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0d + "'", obj9, 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2147483648) + "'", int10 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertNotNull(nodePointer14);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        nodePointer5.setIndex((int) (short) -1);
        nodePointer5.setIndex((int) (short) 1);
        boolean boolean10 = nodePointer5.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer5.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer5.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName13, (java.lang.Object) 100.0d, locale15);
        java.lang.Object obj17 = nodePointer16.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = nodePointer16.getValuePointer();
        nodePointer18.setIndex((int) (short) -1);
        java.lang.Object obj21 = nodePointer18.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = nodePointer18.getValuePointer();
        boolean boolean23 = nodePointer18.isContainer();
        java.lang.Object obj24 = nodePointer18.getNodeValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = nodePointer18.getImmediateValuePointer();
        boolean boolean26 = nodePointer25.isRoot();
        java.lang.Class<?> wildcardClass27 = nodePointer25.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int28 = nodePointer5.compareTo((java.lang.Object) wildcardClass27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class org.apache.commons.jxpath.ri.model.NodePointer (java.lang.Class is in module java.base of loader 'bootstrap'; org.apache.commons.jxpath.ri.model.NodePointer is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "100");
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0d + "'", obj24, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        boolean boolean6 = nodePointer5.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer5.getValuePointer();
        java.lang.String str8 = nodePointer5.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = nodePointer5.getImmediateValuePointer();
        java.lang.Throwable throwable10 = null;
        nodePointer9.handle(throwable10);
        java.lang.Object obj12 = nodePointer9.getNodeValue();
        boolean boolean13 = nodePointer9.isAttribute();
        org.apache.commons.jxpath.JXPathContext jXPathContext14 = null;
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName16, (java.lang.Object) 100.0d, locale18);
        java.lang.Object obj20 = nodePointer19.clone();
        java.lang.Object obj21 = nodePointer19.clone();
        nodePointer19.setIndex(0);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = nodePointer19.getValuePointer();
        java.lang.Object obj25 = nodePointer24.getNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet26 = nodePointer9.getNodeSetByKey(jXPathContext14, "hi!", (java.lang.Object) nodePointer24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100" + "'", str8, "100");
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "100");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "100");
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0d + "'", obj25, 100.0d);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 100.0d, locale8);
        java.lang.Object obj10 = nodePointer9.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer9.getValuePointer();
        int int12 = nodePointer9.getIndex();
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = nodePointer9.getParent();
        nodePointer9.setAttribute(true);
        java.lang.Object obj17 = nodePointer9.getNodeValue();
        boolean boolean18 = nodePointer9.isAttribute();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = nodePointer9.getImmediateValuePointer();
        org.w3c.dom.Node node20 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer21 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer9, node20);
        org.apache.commons.jxpath.JXPathContext jXPathContext22 = null;
        org.apache.commons.jxpath.ri.QName qName23 = null;
        org.apache.commons.jxpath.ri.QName qName25 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName25, (java.lang.Object) 100.0d, locale27);
        java.lang.Object obj29 = nodePointer28.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = nodePointer28.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName31 = null;
        org.apache.commons.jxpath.ri.QName qName32 = null;
        java.util.Locale locale34 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName32, (java.lang.Object) 100.0d, locale34);
        nodePointer35.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer28, qName31, (java.lang.Object) nodePointer35);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer39 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer38);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver40 = null;
        nodePointer38.setNamespaceResolver(namespaceResolver40);
        java.lang.String str42 = nodePointer38.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer43 = dOMNodePointer21.createChild(jXPathContext22, qName23, 0, (java.lang.Object) nodePointer38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "100");
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2147483648) + "'", int12 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0d + "'", obj17, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNotNull(nodePointer28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "100");
        org.junit.Assert.assertNotNull(nodePointer30);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertNotNull(nodePointer38);
        org.junit.Assert.assertNotNull(nodePointer39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "100/null" + "'", str42, "100/null");
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        nodePointer5.setIndex((int) (short) -1);
        nodePointer5.setIndex((int) (short) 1);
        boolean boolean10 = nodePointer5.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer5.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer5.getImmediateValuePointer();
        boolean boolean13 = nodePointer5.isContainer();
        boolean boolean14 = nodePointer5.isContainer();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        nodePointer3.setAttribute(false);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.getParent();
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName7, (java.lang.Object) 100.0d, locale9);
        java.lang.Object obj11 = nodePointer10.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer10.getValuePointer();
        nodePointer12.setIndex((int) (short) -1);
        java.lang.Object obj15 = nodePointer12.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = nodePointer12.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = nodePointer16.getImmediateParentPointer();
        int int18 = nodePointer3.compareTo((java.lang.Object) nodePointer16);
        org.apache.commons.jxpath.JXPathContext jXPathContext19 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = nodePointer16.createPath(jXPathContext19);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = nodePointer20.getValuePointer();
        int int22 = nodePointer20.getIndex();
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler23 = null;
        nodePointer20.setExceptionHandler(exceptionHandler23);
        org.w3c.dom.Node node25 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer26 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer20, node25);
        org.apache.commons.jxpath.JXPathContext jXPathContext27 = null;
        org.apache.commons.jxpath.ri.QName qName28 = null;
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName28, (java.lang.Object) 100.0d, locale30);
        java.lang.Object obj32 = nodePointer31.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = nodePointer31.getValuePointer();
        nodePointer33.setIndex((int) (short) -1);
        nodePointer33.setIndex((int) (short) 1);
        boolean boolean38 = nodePointer33.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer39 = nodePointer33.getImmediateValuePointer();
        nodePointer39.printPointerChain();
        org.w3c.dom.Node node41 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer42 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer39, node41);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer43 = nodePointer20.createPath(jXPathContext27, (java.lang.Object) nodePointer39);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot replace the root object");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(nodePointer6);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "100");
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertNull(nodePointer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(nodePointer31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "100");
        org.junit.Assert.assertNotNull(nodePointer33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(nodePointer39);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        nodePointer3.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver6 = null;
        nodePointer3.setNamespaceResolver(namespaceResolver6);
        java.lang.Throwable throwable8 = null;
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName9, (java.lang.Object) 100.0d, locale11);
        java.lang.Object obj13 = nodePointer12.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = nodePointer12.getValuePointer();
        nodePointer14.setAttribute(true);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = nodePointer14.getImmediateValuePointer();
        boolean boolean18 = nodePointer17.isContainer();
        boolean boolean19 = nodePointer17.isAttribute();
        java.lang.Throwable throwable20 = null;
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName21, (java.lang.Object) 100.0d, locale23);
        java.lang.Object obj25 = nodePointer24.clone();
        java.lang.Throwable throwable26 = null;
        nodePointer24.handle(throwable26);
        boolean boolean28 = nodePointer24.isRoot();
        nodePointer24.printPointerChain();
        nodePointer24.setIndex((int) (byte) -1);
        java.lang.Object obj32 = nodePointer24.getRootNode();
        nodePointer17.handle(throwable20, nodePointer24);
        nodePointer3.handle(throwable8, nodePointer24);
        nodePointer3.printPointerChain();
        int int36 = nodePointer3.getIndex();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "100");
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "100");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0d + "'", obj32, 100.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        nodePointer5.setIndex((int) (short) -1);
        java.lang.String str8 = nodePointer5.toString();
        org.apache.commons.jxpath.JXPathContext jXPathContext9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer5.createPath(jXPathContext9);
        java.lang.Object obj11 = nodePointer5.clone();
        java.lang.Object obj12 = nodePointer5.getNodeValue();
        boolean boolean13 = nodePointer5.isNode();
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer5, node14);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100" + "'", str8, "100");
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "100");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 100.0d, locale3);
        boolean boolean5 = nodePointer4.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer4.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer4.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer7);
        java.lang.Object obj9 = nodePointer8.getRootNode();
        org.apache.commons.jxpath.JXPathContext jXPathContext10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer8.createPath(jXPathContext10);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) nodePointer11, locale12);
        java.util.Locale locale14 = nodePointer11.getLocale();
        java.lang.Object obj15 = nodePointer11.getNodeValue();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0d + "'", obj9, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        boolean boolean6 = nodePointer5.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer5.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = nodePointer7.getImmediateParentPointer();
        int int9 = nodePointer7.getIndex();
        org.apache.commons.jxpath.JXPathContext jXPathContext10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer7.createPath(jXPathContext10);
        org.apache.commons.jxpath.JXPathContext jXPathContext12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer11.createPath(jXPathContext12);
        java.lang.Object obj14 = nodePointer11.getNode();
        org.apache.commons.jxpath.ri.QName qName15 = null;
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName16, (java.lang.Object) '#', locale18);
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName20, (java.lang.Object) 100.0d, locale22);
        nodePointer23.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver26 = null;
        nodePointer23.setNamespaceResolver(namespaceResolver26);
        int int28 = nodePointer19.compareTo((java.lang.Object) nodePointer23);
        java.lang.Object obj29 = nodePointer23.getNodeValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer11, qName15, obj29);
        java.lang.Throwable throwable31 = null;
        org.apache.commons.jxpath.ri.QName qName32 = null;
        org.apache.commons.jxpath.ri.QName qName33 = null;
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer36 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName33, (java.lang.Object) 100.0d, locale35);
        java.lang.Object obj37 = nodePointer36.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = nodePointer36.getValuePointer();
        nodePointer38.setIndex((int) (short) -1);
        java.lang.Object obj41 = nodePointer38.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = nodePointer38.getValuePointer();
        boolean boolean43 = nodePointer42.isNode();
        java.util.Locale locale44 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer45 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName32, (java.lang.Object) boolean43, locale44);
        nodePointer30.handle(throwable31, nodePointer45);
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler47 = null;
        nodePointer30.setExceptionHandler(exceptionHandler47);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2147483648) + "'", int9 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0d + "'", obj14, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 100.0d + "'", obj29, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer30);
        org.junit.Assert.assertNotNull(nodePointer36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "100");
        org.junit.Assert.assertNotNull(nodePointer38);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0d + "'", obj41, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(nodePointer45);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 100.0d, locale8);
        java.lang.Object obj10 = nodePointer9.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer9.getValuePointer();
        int int12 = nodePointer9.getIndex();
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.apache.commons.jxpath.JXPathContext jXPathContext14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = nodePointer9.createPath(jXPathContext14);
        int int16 = nodePointer15.getIndex();
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName17, (java.lang.Object) '#', locale19);
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName21, (java.lang.Object) 100.0d, locale23);
        nodePointer24.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver27 = null;
        nodePointer24.setNamespaceResolver(namespaceResolver27);
        int int29 = nodePointer20.compareTo((java.lang.Object) nodePointer24);
        int int30 = nodePointer15.compareTo((java.lang.Object) nodePointer20);
        nodePointer15.setAttribute(false);
        boolean boolean33 = nodePointer15.isContainer();
        org.apache.commons.jxpath.ri.QName qName34 = null;
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName34, (java.lang.Object) 100.0d, locale36);
        boolean boolean38 = nodePointer37.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer39 = nodePointer37.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer40 = nodePointer37.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer41 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer40);
        java.lang.Object obj42 = nodePointer41.getRootNode();
        org.apache.commons.jxpath.JXPathContext jXPathContext43 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer44 = nodePointer41.createPath(jXPathContext43);
        int int45 = nodePointer15.compareTo((java.lang.Object) nodePointer41);
        org.w3c.dom.Node node46 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer47 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer41, node46);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "100");
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2147483648) + "'", int12 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2147483648) + "'", int16 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(nodePointer37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(nodePointer39);
        org.junit.Assert.assertNotNull(nodePointer40);
        org.junit.Assert.assertNotNull(nodePointer41);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0d + "'", obj42, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        boolean boolean4 = nodePointer3.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        java.lang.Throwable throwable6 = null;
        nodePointer3.handle(throwable6);
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName8, (java.lang.Object) 100.0d, locale10);
        java.lang.Object obj12 = nodePointer11.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer11.getValuePointer();
        boolean boolean14 = nodePointer13.isNode();
        nodePointer13.printPointerChain();
        boolean boolean16 = nodePointer13.isRoot();
        nodePointer13.printPointerChain();
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler18 = null;
        nodePointer13.setExceptionHandler(exceptionHandler18);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = nodePointer13.getImmediateValuePointer();
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler21 = null;
        nodePointer20.setExceptionHandler(exceptionHandler21);
        int int23 = nodePointer3.compareTo((java.lang.Object) nodePointer20);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = nodePointer3.getValuePointer();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "100");
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(nodePointer24);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 100.0d, locale3);
        nodePointer4.setAttribute(false);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer4.getParent();
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName8, (java.lang.Object) 100.0d, locale10);
        java.lang.Object obj12 = nodePointer11.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer11.getValuePointer();
        nodePointer13.setIndex((int) (short) -1);
        java.lang.Object obj16 = nodePointer13.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = nodePointer13.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = nodePointer17.getImmediateParentPointer();
        int int19 = nodePointer4.compareTo((java.lang.Object) nodePointer17);
        java.lang.Throwable throwable20 = null;
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName21, (java.lang.Object) '#', locale23);
        java.lang.Object obj25 = nodePointer24.clone();
        boolean boolean26 = nodePointer24.isRoot();
        nodePointer4.handle(throwable20, nodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) nodePointer4, locale28);
        java.lang.String str30 = nodePointer4.toString();
        org.apache.commons.jxpath.JXPathContext jXPathContext31 = null;
        org.apache.commons.jxpath.ri.QName qName33 = null;
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer36 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName33, (java.lang.Object) 100.0d, locale35);
        java.lang.Object obj37 = nodePointer36.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = nodePointer36.getValuePointer();
        nodePointer38.setIndex((int) (short) -1);
        java.lang.Object obj41 = nodePointer38.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = nodePointer38.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName43 = null;
        java.lang.Object obj44 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer45 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer42, qName43, obj44);
        nodePointer42.printPointerChain();
        java.lang.String str47 = nodePointer42.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet48 = nodePointer4.getNodeSetByKey(jXPathContext31, "http://www.w3.org/2000/xmlns/", (java.lang.Object) str47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "100");
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertNull(nodePointer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "/");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "/");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "/");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "100" + "'", str30, "100");
        org.junit.Assert.assertNotNull(nodePointer36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "100");
        org.junit.Assert.assertNotNull(nodePointer38);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0d + "'", obj41, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer42);
        org.junit.Assert.assertNotNull(nodePointer45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "100" + "'", str47, "100");
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        boolean boolean6 = nodePointer5.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer5.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer7);
        nodePointer8.printPointerChain();
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler10 = null;
        nodePointer8.setExceptionHandler(exceptionHandler10);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertNotNull(nodePointer8);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 100.0d, locale8);
        java.lang.Object obj10 = nodePointer9.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer9.getValuePointer();
        int int12 = nodePointer9.getIndex();
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.apache.commons.jxpath.JXPathContext jXPathContext14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = nodePointer9.createPath(jXPathContext14);
        java.lang.Object obj16 = nodePointer15.getNodeValue();
        nodePointer15.setAttribute(true);
        java.lang.Object obj19 = nodePointer15.getNode();
        org.apache.commons.jxpath.ri.QName qName20 = null;
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName21, (java.lang.Object) 100.0d, locale23);
        java.lang.Object obj25 = nodePointer24.getRootNode();
        boolean boolean26 = nodePointer24.isContainer();
        java.lang.Object obj27 = nodePointer24.getNodeValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer15, qName20, (java.lang.Object) nodePointer24);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = nodePointer28.getImmediateValuePointer();
        nodePointer28.setAttribute(true);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "100");
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2147483648) + "'", int12 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0d + "'", obj25, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0d + "'", obj27, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer28);
        org.junit.Assert.assertNotNull(nodePointer29);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 100.0d, locale3);
        java.lang.Object obj5 = nodePointer4.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer4.getValuePointer();
        boolean boolean7 = nodePointer6.isNode();
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) boolean7, locale8);
        java.lang.Object obj10 = nodePointer9.clone();
        boolean boolean11 = nodePointer9.isContainer();
        java.lang.Object obj12 = nodePointer9.clone();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "100");
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "true()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "true()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "true()");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "true()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "true()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "true()");
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName2, (java.lang.Object) 100.0d, locale4);
        nodePointer5.setAttribute(false);
        java.lang.Object obj8 = nodePointer5.getRootNode();
        int int9 = nodePointer5.getIndex();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer5.getValuePointer();
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) nodePointer10, locale11);
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler13 = null;
        nodePointer10.setExceptionHandler(exceptionHandler13);
        nodePointer10.setIndex((int) (byte) 100);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (byte) 100, locale17);
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler19 = null;
        nodePointer18.setExceptionHandler(exceptionHandler19);
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2147483648) + "'", int9 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertNotNull(nodePointer18);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        int int6 = nodePointer3.getIndex();
        java.lang.Object obj7 = nodePointer3.clone();
        nodePointer3.setIndex((int) (short) 100);
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler10 = null;
        nodePointer3.setExceptionHandler(exceptionHandler10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer3.getImmediateParentPointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer3.getValuePointer();
        boolean boolean14 = nodePointer3.isAttribute();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2147483648) + "'", int6 == (-2147483648));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "100");
        org.junit.Assert.assertNull(nodePointer12);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "100/null");
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        nodePointer3.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver6 = null;
        nodePointer3.setNamespaceResolver(namespaceResolver6);
        java.lang.Object obj8 = nodePointer3.getNodeValue();
        org.apache.commons.jxpath.ri.QName qName9 = null;
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName10, (java.lang.Object) 100.0d, locale12);
        java.lang.Object obj14 = nodePointer13.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = nodePointer13.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = nodePointer13.getValuePointer();
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler17 = null;
        nodePointer13.setExceptionHandler(exceptionHandler17);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer3, qName9, (java.lang.Object) nodePointer13);
        boolean boolean20 = nodePointer3.isRoot();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = nodePointer3.getImmediateValuePointer();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "100");
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(nodePointer21);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        nodePointer3.setIndex((int) (byte) 0);
        java.lang.Object obj6 = nodePointer3.getRootNode();
        org.apache.commons.jxpath.ri.QName qName7 = null;
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName8, (java.lang.Object) 100.0d, locale10);
        java.lang.Object obj12 = nodePointer11.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer11.getValuePointer();
        nodePointer13.setIndex((int) (short) -1);
        nodePointer13.setIndex((int) (short) 1);
        boolean boolean18 = nodePointer13.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = nodePointer13.getImmediateValuePointer();
        nodePointer19.printPointerChain();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer3, qName7, (java.lang.Object) nodePointer19);
        int int22 = nodePointer19.getIndex();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver23 = null;
        nodePointer19.setNamespaceResolver(namespaceResolver23);
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler25 = null;
        nodePointer19.setExceptionHandler(exceptionHandler25);
        org.w3c.dom.Node node27 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer28 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer19, node27);
        org.apache.commons.jxpath.JXPathContext jXPathContext29 = null;
        org.apache.commons.jxpath.ri.QName qName30 = null;
        org.apache.commons.jxpath.ri.QName qName32 = null;
        org.apache.commons.jxpath.ri.QName qName33 = null;
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer36 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName33, (java.lang.Object) 100.0d, locale35);
        nodePointer36.setAttribute(false);
        java.lang.Object obj39 = nodePointer36.getRootNode();
        java.util.Locale locale40 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer41 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName32, obj39, locale40);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = nodePointer41.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.QName qName43 = null;
        org.apache.commons.jxpath.ri.QName qName44 = null;
        java.util.Locale locale46 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer47 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName44, (java.lang.Object) 100.0d, locale46);
        java.lang.Object obj48 = nodePointer47.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer49 = nodePointer47.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName50 = null;
        java.util.Locale locale52 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer53 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName50, (java.lang.Object) 100.0d, locale52);
        java.lang.Object obj54 = nodePointer53.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer55 = nodePointer53.getValuePointer();
        int int56 = nodePointer53.getIndex();
        int int57 = nodePointer47.compareTo((java.lang.Object) nodePointer53);
        nodePointer53.printPointerChain();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer59 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer41, qName43, (java.lang.Object) nodePointer53);
        java.util.Locale locale60 = nodePointer53.getLocale();
        java.lang.String str61 = nodePointer53.toString();
        boolean boolean62 = nodePointer53.isContainer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer63 = dOMNodePointer28.createChild(jXPathContext29, qName30, (int) (short) 10, (java.lang.Object) nodePointer53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "100");
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(nodePointer36);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 100.0d + "'", obj39, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer41);
        org.junit.Assert.assertNotNull(nodePointer42);
        org.junit.Assert.assertNotNull(nodePointer47);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "100");
        org.junit.Assert.assertNotNull(nodePointer49);
        org.junit.Assert.assertNotNull(nodePointer53);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals(obj54.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj54), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj54), "100");
        org.junit.Assert.assertNotNull(nodePointer55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-2147483648) + "'", int56 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(nodePointer59);
        org.junit.Assert.assertNull(locale60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "100" + "'", str61, "100");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        nodePointer5.setAttribute(true);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = nodePointer5.getImmediateValuePointer();
        boolean boolean9 = nodePointer8.isContainer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer8.getValuePointer();
        java.lang.Throwable throwable11 = null;
        nodePointer8.handle(throwable11);
        boolean boolean13 = nodePointer8.isAttribute();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        nodePointer3.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.getValuePointer();
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = nodePointer3.createPath(jXPathContext7);
        org.w3c.dom.Node node9 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer3, node9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dOMNodePointer10.getNamespaceURI();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertNotNull(nodePointer8);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 100.0d, locale3);
        nodePointer4.setAttribute(false);
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) nodePointer4, locale7);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = nodePointer4.getValuePointer();
        java.lang.Throwable throwable10 = null;
        nodePointer9.handle(throwable10);
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertNotNull(nodePointer9);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.QName qName2 = null;
        java.util.Locale locale4 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName2, (java.lang.Object) 100.0d, locale4);
        java.lang.Object obj6 = nodePointer5.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer5.getValuePointer();
        nodePointer7.setIndex((int) (short) -1);
        java.lang.Object obj10 = nodePointer7.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer7.getValuePointer();
        boolean boolean12 = nodePointer7.isContainer();
        java.lang.Object obj13 = nodePointer7.getNodeValue();
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) nodePointer7, locale14);
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName16, (java.lang.Object) 100.0d, locale18);
        java.lang.Object obj20 = nodePointer19.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = nodePointer19.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName22 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName22, (java.lang.Object) 100.0d, locale24);
        java.lang.Object obj26 = nodePointer25.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = nodePointer25.getValuePointer();
        int int28 = nodePointer25.getIndex();
        int int29 = nodePointer19.compareTo((java.lang.Object) nodePointer25);
        org.apache.commons.jxpath.JXPathContext jXPathContext30 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = nodePointer25.createPath(jXPathContext30);
        boolean boolean32 = nodePointer25.isContainer();
        nodePointer25.setIndex((-2147483648));
        java.lang.Object obj35 = nodePointer25.getNodeValue();
        int int36 = nodePointer15.compareTo((java.lang.Object) nodePointer25);
        java.lang.String str37 = nodePointer25.toString();
        org.apache.commons.jxpath.ri.QName qName38 = null;
        org.apache.commons.jxpath.ri.QName qName39 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName39, (java.lang.Object) 100.0d, locale41);
        nodePointer42.setIndex((int) (byte) 0);
        java.lang.Object obj45 = nodePointer42.getRootNode();
        org.apache.commons.jxpath.ri.QName qName46 = null;
        org.apache.commons.jxpath.ri.QName qName47 = null;
        java.util.Locale locale49 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer50 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName47, (java.lang.Object) 100.0d, locale49);
        java.lang.Object obj51 = nodePointer50.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer52 = nodePointer50.getValuePointer();
        nodePointer52.setIndex((int) (short) -1);
        nodePointer52.setIndex((int) (short) 1);
        boolean boolean57 = nodePointer52.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer58 = nodePointer52.getImmediateValuePointer();
        nodePointer58.printPointerChain();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer60 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer42, qName46, (java.lang.Object) nodePointer58);
        org.apache.commons.jxpath.ri.QName qName61 = null;
        java.util.Locale locale63 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer64 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName61, (java.lang.Object) 100.0d, locale63);
        java.lang.Object obj65 = nodePointer64.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer66 = nodePointer64.getValuePointer();
        nodePointer66.setAttribute(true);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer69 = nodePointer66.getImmediateValuePointer();
        boolean boolean70 = nodePointer69.isContainer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer71 = nodePointer69.getValuePointer();
        java.lang.Object obj72 = nodePointer69.clone();
        int int73 = nodePointer42.compareTo(obj72);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer74 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer42);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer75 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer25, qName38, (java.lang.Object) nodePointer42);
        java.util.Locale locale76 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer77 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) qName38, locale76);
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "100");
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 100.0d + "'", obj10, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "100");
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertNotNull(nodePointer25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "100");
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2147483648) + "'", int28 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(nodePointer31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0d + "'", obj35, 100.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "100" + "'", str37, "100");
        org.junit.Assert.assertNotNull(nodePointer42);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 100.0d + "'", obj45, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "100");
        org.junit.Assert.assertNotNull(nodePointer52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(nodePointer58);
        org.junit.Assert.assertNotNull(nodePointer60);
        org.junit.Assert.assertNotNull(nodePointer64);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertEquals(obj65.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj65), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj65), "100");
        org.junit.Assert.assertNotNull(nodePointer66);
        org.junit.Assert.assertNotNull(nodePointer69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(nodePointer71);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertEquals(obj72.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj72), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj72), "100");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(nodePointer74);
        org.junit.Assert.assertNotNull(nodePointer75);
        org.junit.Assert.assertNotNull(nodePointer77);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        boolean boolean6 = nodePointer5.isNode();
        nodePointer5.printPointerChain();
        boolean boolean8 = nodePointer5.isRoot();
        nodePointer5.printPointerChain();
        org.apache.commons.jxpath.ri.QName qName10 = null;
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName11, (java.lang.Object) 100.0d, locale13);
        java.lang.Object obj15 = nodePointer14.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = nodePointer14.getValuePointer();
        nodePointer16.setIndex((int) (short) -1);
        java.lang.Object obj19 = nodePointer16.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = nodePointer16.getValuePointer();
        boolean boolean21 = nodePointer20.isNode();
        java.lang.Object obj22 = nodePointer20.getNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer5, qName10, (java.lang.Object) nodePointer20);
        java.lang.Throwable throwable24 = null;
        org.apache.commons.jxpath.ri.QName qName25 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName25, (java.lang.Object) 100.0d, locale27);
        nodePointer28.setAttribute(false);
        nodePointer28.setAttribute(false);
        nodePointer5.handle(throwable24, nodePointer28);
        java.lang.Object obj34 = nodePointer5.getRootNode();
        nodePointer5.printPointerChain();
        java.lang.Object obj36 = nodePointer5.getRootNode();
        org.apache.commons.jxpath.ri.QName qName37 = null;
        org.apache.commons.jxpath.ri.QName qName38 = null;
        java.util.Locale locale40 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer41 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName38, (java.lang.Object) 100.0d, locale40);
        nodePointer41.setAttribute(false);
        java.lang.Object obj44 = nodePointer41.getRootNode();
        int int45 = nodePointer41.getIndex();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer46 = nodePointer41.getValuePointer();
        java.lang.Object obj47 = nodePointer41.clone();
        boolean boolean48 = nodePointer41.isAttribute();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer49 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer41);
        org.apache.commons.jxpath.ri.QName qName50 = null;
        java.util.Locale locale52 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer53 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName50, (java.lang.Object) 100.0d, locale52);
        java.lang.Object obj54 = nodePointer53.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer55 = nodePointer53.getValuePointer();
        nodePointer55.setIndex((int) (short) -1);
        nodePointer55.setIndex((int) (short) 1);
        boolean boolean60 = nodePointer55.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer61 = nodePointer55.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer62 = nodePointer55.getImmediateValuePointer();
        boolean boolean63 = nodePointer62.isNode();
        java.lang.Object obj64 = nodePointer62.clone();
        org.apache.commons.jxpath.ri.QName qName65 = null;
        org.apache.commons.jxpath.ri.QName qName66 = null;
        java.util.Locale locale68 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer69 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName66, (java.lang.Object) 100.0d, locale68);
        nodePointer69.setAttribute(false);
        java.lang.Object obj72 = nodePointer69.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer73 = nodePointer69.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer74 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer62, qName65, (java.lang.Object) nodePointer69);
        boolean boolean75 = nodePointer69.isContainer();
        java.lang.String str76 = nodePointer69.toString();
        org.apache.commons.jxpath.JXPathContext jXPathContext77 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer78 = nodePointer69.createPath(jXPathContext77);
        int int79 = nodePointer49.compareTo((java.lang.Object) nodePointer78);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer80 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer5, qName37, (java.lang.Object) nodePointer78);
        boolean boolean81 = nodePointer78.isRoot();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "100");
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0d + "'", obj22, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertNotNull(nodePointer28);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 100.0d + "'", obj34, 100.0d);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 100.0d + "'", obj36, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer41);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 100.0d + "'", obj44, 100.0d);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-2147483648) + "'", int45 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer46);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "100");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(nodePointer49);
        org.junit.Assert.assertNotNull(nodePointer53);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals(obj54.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj54), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj54), "100");
        org.junit.Assert.assertNotNull(nodePointer55);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(nodePointer61);
        org.junit.Assert.assertNotNull(nodePointer62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertEquals(obj64.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj64), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj64), "100");
        org.junit.Assert.assertNotNull(nodePointer69);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + 100.0d + "'", obj72, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer73);
        org.junit.Assert.assertNotNull(nodePointer74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "100" + "'", str76, "100");
        org.junit.Assert.assertNotNull(nodePointer78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(nodePointer80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) '#', locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        java.lang.String str5 = nodePointer3.toString();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "/");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "/");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/" + "'", str5, "/");
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) '#', locale3);
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName5, (java.lang.Object) 100.0d, locale7);
        nodePointer8.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver11 = null;
        nodePointer8.setNamespaceResolver(namespaceResolver11);
        int int13 = nodePointer4.compareTo((java.lang.Object) nodePointer8);
        java.lang.Object obj14 = nodePointer8.getNodeValue();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver15 = null;
        nodePointer8.setNamespaceResolver(namespaceResolver15);
        java.lang.Object obj17 = nodePointer8.clone();
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) nodePointer8, locale18);
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0d + "'", obj14, 100.0d);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "100");
        org.junit.Assert.assertNotNull(nodePointer19);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        nodePointer5.setAttribute(true);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = nodePointer5.getImmediateValuePointer();
        boolean boolean9 = nodePointer8.isContainer();
        boolean boolean10 = nodePointer8.isAttribute();
        java.lang.Throwable throwable11 = null;
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName12, (java.lang.Object) 100.0d, locale14);
        java.lang.Object obj16 = nodePointer15.clone();
        java.lang.Throwable throwable17 = null;
        nodePointer15.handle(throwable17);
        boolean boolean19 = nodePointer15.isRoot();
        nodePointer15.printPointerChain();
        nodePointer15.setIndex((int) (byte) -1);
        java.lang.Object obj23 = nodePointer15.getRootNode();
        nodePointer8.handle(throwable11, nodePointer15);
        org.apache.commons.jxpath.JXPathContext jXPathContext25 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer26 = nodePointer8.createPath(jXPathContext25);
        java.lang.Object obj27 = nodePointer26.clone();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "100");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "100");
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        boolean boolean6 = nodePointer5.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer5.getValuePointer();
        java.lang.String str8 = nodePointer5.toString();
        org.apache.commons.jxpath.ri.QName qName9 = null;
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName10, (java.lang.Object) 100.0d, locale12);
        java.lang.Object obj14 = nodePointer13.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = nodePointer13.getValuePointer();
        nodePointer15.setIndex((int) (short) -1);
        java.lang.Object obj18 = nodePointer15.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = nodePointer15.getValuePointer();
        boolean boolean20 = nodePointer19.isNode();
        java.lang.Object obj21 = nodePointer19.getNode();
        org.apache.commons.jxpath.ri.QName qName22 = null;
        org.apache.commons.jxpath.ri.QName qName23 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer26 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName23, (java.lang.Object) 100.0d, locale25);
        java.lang.Object obj27 = nodePointer26.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = nodePointer26.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName29 = null;
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName29, (java.lang.Object) 100.0d, locale31);
        java.lang.Object obj33 = nodePointer32.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = nodePointer32.getValuePointer();
        int int35 = nodePointer32.getIndex();
        int int36 = nodePointer26.compareTo((java.lang.Object) nodePointer32);
        org.apache.commons.jxpath.JXPathContext jXPathContext37 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = nodePointer32.createPath(jXPathContext37);
        int int39 = nodePointer38.getIndex();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer40 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer19, qName22, (java.lang.Object) int39);
        int int41 = nodePointer40.getIndex();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer5, qName9, (java.lang.Object) nodePointer40);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100" + "'", str8, "100");
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "100");
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "100");
        org.junit.Assert.assertNotNull(nodePointer28);
        org.junit.Assert.assertNotNull(nodePointer32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "100");
        org.junit.Assert.assertNotNull(nodePointer34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-2147483648) + "'", int35 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(nodePointer38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-2147483648) + "'", int39 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-2147483648) + "'", int41 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer42);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        nodePointer5.setIndex((int) (short) -1);
        java.lang.Object obj8 = nodePointer5.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = nodePointer5.getValuePointer();
        java.lang.Throwable throwable10 = null;
        nodePointer9.handle(throwable10);
        java.util.Locale locale12 = nodePointer9.getLocale();
        java.lang.Object obj13 = nodePointer9.clone();
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer9, node14);
        org.apache.commons.jxpath.JXPathContext jXPathContext16 = null;
        org.apache.commons.jxpath.ri.QName qName17 = null;
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName19, (java.lang.Object) 100.0d, locale21);
        java.lang.Object obj23 = nodePointer22.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = nodePointer22.getValuePointer();
        nodePointer24.setIndex((int) (short) -1);
        nodePointer24.setIndex((int) (short) 1);
        boolean boolean29 = nodePointer24.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = nodePointer24.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = nodePointer24.getImmediateValuePointer();
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler32 = null;
        nodePointer31.setExceptionHandler(exceptionHandler32);
        org.apache.commons.jxpath.JXPathContext jXPathContext34 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = nodePointer31.createPath(jXPathContext34);
        org.apache.commons.jxpath.ri.QName qName36 = null;
        java.util.Locale locale38 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer39 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName36, (java.lang.Object) 100.0d, locale38);
        nodePointer39.setAttribute(false);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = nodePointer39.getParent();
        java.lang.Object obj43 = nodePointer39.getNodeValue();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver44 = null;
        nodePointer39.setNamespaceResolver(namespaceResolver44);
        boolean boolean46 = nodePointer39.isAttribute();
        java.lang.String str47 = nodePointer39.toString();
        boolean boolean48 = nodePointer39.isNode();
        int int49 = nodePointer35.compareTo((java.lang.Object) nodePointer39);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer50 = dOMNodePointer15.createChild(jXPathContext16, qName17, (int) (short) 10, (java.lang.Object) nodePointer35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "100");
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "100");
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(nodePointer30);
        org.junit.Assert.assertNotNull(nodePointer31);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertNotNull(nodePointer39);
        org.junit.Assert.assertNull(nodePointer42);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 100.0d + "'", obj43, 100.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "100" + "'", str47, "100");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 100.0d, locale3);
        java.lang.Object obj5 = nodePointer4.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer4.getValuePointer();
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) nodePointer4, locale7);
        java.lang.String str9 = nodePointer8.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer8.getValuePointer();
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler11 = null;
        nodePointer8.setExceptionHandler(exceptionHandler11);
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertNotNull(nodePointer10);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        boolean boolean6 = nodePointer5.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer5.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = nodePointer7.getImmediateParentPointer();
        nodePointer7.setIndex((int) (short) 10);
        org.apache.commons.jxpath.JXPathContext jXPathContext11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer7.createPath(jXPathContext11);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer12.getParent();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertNull(nodePointer13);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        int int6 = nodePointer3.getIndex();
        java.lang.Object obj7 = nodePointer3.clone();
        java.lang.Object obj8 = nodePointer3.getNode();
        java.lang.Object obj9 = nodePointer3.getNode();
        java.lang.Object obj10 = nodePointer3.clone();
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler11 = null;
        nodePointer3.setExceptionHandler(exceptionHandler11);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer3);
        java.lang.Throwable throwable14 = null;
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName15, (java.lang.Object) 100.0d, locale17);
        java.lang.Object obj19 = nodePointer18.clone();
        java.lang.Throwable throwable20 = null;
        nodePointer18.handle(throwable20);
        boolean boolean22 = nodePointer18.isRoot();
        nodePointer18.printPointerChain();
        nodePointer3.handle(throwable14, nodePointer18);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2147483648) + "'", int6 == (-2147483648));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "100");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0d + "'", obj9, 100.0d);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "100");
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "100");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        java.lang.Throwable throwable5 = null;
        nodePointer3.handle(throwable5);
        boolean boolean7 = nodePointer3.isRoot();
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.verify(nodePointer3);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer9.getImmediateParentPointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer9.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer11.getImmediateValuePointer();
        org.w3c.dom.Node node13 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer12, node13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dOMNodePointer14.getNamespaceURI();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNull(nodePointer10);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(nodePointer12);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        java.lang.Throwable throwable5 = null;
        nodePointer3.handle(throwable5);
        boolean boolean7 = nodePointer3.isRoot();
        nodePointer3.setAttribute(true);
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler10 = null;
        nodePointer3.setExceptionHandler(exceptionHandler10);
        int int12 = nodePointer3.getIndex();
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler13 = null;
        nodePointer3.setExceptionHandler(exceptionHandler13);
        boolean boolean15 = nodePointer3.isContainer();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2147483648) + "'", int12 == (-2147483648));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        nodePointer5.setIndex((int) (short) -1);
        java.lang.Object obj8 = nodePointer5.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = nodePointer5.getValuePointer();
        boolean boolean10 = nodePointer5.isContainer();
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler11 = null;
        nodePointer5.setExceptionHandler(exceptionHandler11);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName14, (java.lang.Object) 100.0d, locale16);
        java.lang.Object obj18 = nodePointer17.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = nodePointer17.getValuePointer();
        nodePointer19.setIndex((int) (short) -1);
        java.lang.Object obj22 = nodePointer19.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = nodePointer19.getValuePointer();
        boolean boolean24 = nodePointer19.isContainer();
        java.lang.Object obj25 = nodePointer19.getNodeValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer26 = nodePointer19.getValuePointer();
        boolean boolean27 = nodePointer26.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer5, qName13, (java.lang.Object) boolean27);
        nodePointer28.setIndex((-2147483648));
        boolean boolean31 = nodePointer28.isAttribute();
        java.lang.Object obj32 = nodePointer28.getNode();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "100");
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0d + "'", obj22, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0d + "'", obj25, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(nodePointer28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + true + "'", obj32, true);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        nodePointer5.setIndex((int) (short) -1);
        nodePointer5.setIndex((int) (short) 1);
        boolean boolean10 = nodePointer5.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer5.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer5.getImmediateValuePointer();
        boolean boolean13 = nodePointer12.isNode();
        java.lang.Object obj14 = nodePointer12.getNode();
        org.apache.commons.jxpath.ri.QName qName15 = null;
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName16, (java.lang.Object) 100.0d, locale18);
        nodePointer19.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = nodePointer19.getImmediateParentPointer();
        nodePointer19.setAttribute(false);
        org.apache.commons.jxpath.ri.QName qName25 = null;
        org.apache.commons.jxpath.ri.QName qName26 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName26, (java.lang.Object) '#', locale28);
        java.lang.Object obj30 = nodePointer29.clone();
        nodePointer29.setAttribute(false);
        java.lang.Object obj33 = nodePointer29.getNodeValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer19, qName25, (java.lang.Object) nodePointer29);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer12, qName15, (java.lang.Object) nodePointer29);
        java.util.Locale locale36 = nodePointer12.getLocale();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0d + "'", obj14, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNull(nodePointer22);
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "/");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "/");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "/");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + '#' + "'", obj33, '#');
        org.junit.Assert.assertNotNull(nodePointer34);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertNull(locale36);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        int int6 = nodePointer3.getIndex();
        java.lang.Object obj7 = nodePointer3.clone();
        java.lang.Object obj8 = nodePointer3.getNodeValue();
        java.lang.Object obj9 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer3.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.lang.Object obj12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer3, qName11, obj12);
        java.lang.Throwable throwable14 = null;
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName15, (java.lang.Object) 100.0d, locale17);
        nodePointer18.setAttribute(false);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = nodePointer18.getParent();
        java.lang.Object obj22 = nodePointer18.getRootNode();
        nodePointer18.setIndex((int) (short) 10);
        org.apache.commons.jxpath.JXPathContext jXPathContext25 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer26 = nodePointer18.createPath(jXPathContext25);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = nodePointer18.getParent();
        nodePointer13.handle(throwable14, nodePointer18);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2147483648) + "'", int6 == (-2147483648));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "100");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "100");
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertNull(nodePointer21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0d + "'", obj22, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer26);
        org.junit.Assert.assertNull(nodePointer27);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 100.0d, locale2);
        java.lang.Object obj4 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer3.getValuePointer();
        int int6 = nodePointer3.getIndex();
        java.lang.Object obj7 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName8, (java.lang.Object) 100.0d, locale10);
        java.lang.Object obj12 = nodePointer11.clone();
        java.lang.Object obj13 = nodePointer11.clone();
        java.lang.Object obj14 = nodePointer11.getNodeValue();
        nodePointer11.setAttribute(true);
        java.lang.Object obj17 = nodePointer11.getNode();
        int int18 = nodePointer3.compareTo((java.lang.Object) nodePointer11);
        org.apache.commons.jxpath.ExceptionHandler exceptionHandler19 = null;
        nodePointer3.setExceptionHandler(exceptionHandler19);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = nodePointer3.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.QName qName22 = null;
        org.apache.commons.jxpath.ri.QName qName23 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer26 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName23, (java.lang.Object) 100.0d, locale25);
        java.lang.Object obj27 = nodePointer26.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = nodePointer26.getValuePointer();
        nodePointer28.setIndex((int) (short) -1);
        nodePointer28.setIndex((int) (short) 1);
        boolean boolean33 = nodePointer28.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = nodePointer28.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = nodePointer28.getImmediateValuePointer();
        boolean boolean36 = nodePointer35.isNode();
        java.lang.Object obj37 = nodePointer35.clone();
        org.apache.commons.jxpath.ri.QName qName38 = null;
        org.apache.commons.jxpath.ri.QName qName39 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName39, (java.lang.Object) 100.0d, locale41);
        nodePointer42.setAttribute(false);
        java.lang.Object obj45 = nodePointer42.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer46 = nodePointer42.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer47 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer35, qName38, (java.lang.Object) nodePointer42);
        boolean boolean48 = nodePointer42.isContainer();
        org.apache.commons.jxpath.JXPathContext jXPathContext49 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer50 = nodePointer42.createPath(jXPathContext49);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer51 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer3, qName22, (java.lang.Object) nodePointer50);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2147483648) + "'", int6 == (-2147483648));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "100");
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "100");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "100");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0d + "'", obj14, 100.0d);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 100.0d + "'", obj17, 100.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertNotNull(nodePointer26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "100");
        org.junit.Assert.assertNotNull(nodePointer28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(nodePointer34);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "100");
        org.junit.Assert.assertNotNull(nodePointer42);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 100.0d + "'", obj45, 100.0d);
        org.junit.Assert.assertNotNull(nodePointer46);
        org.junit.Assert.assertNotNull(nodePointer47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(nodePointer50);
        org.junit.Assert.assertNotNull(nodePointer51);
    }
}

