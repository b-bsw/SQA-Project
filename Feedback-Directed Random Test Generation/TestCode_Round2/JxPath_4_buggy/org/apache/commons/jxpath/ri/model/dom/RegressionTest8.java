package org.apache.commons.jxpath.ri.model.dom;

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
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "http://www.w3.org/XML/1998/namespace");
        boolean boolean4 = dOMNodePointer3.isCollection();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver5 = null;
        dOMNodePointer3.setNamespaceResolver(namespaceResolver5);
        boolean boolean7 = dOMNodePointer3.isActual();
        boolean boolean8 = dOMNodePointer3.isActual();
        int int9 = dOMNodePointer3.getLength();
        java.lang.Object obj10 = dOMNodePointer3.getImmediateNode();
        boolean boolean11 = dOMNodePointer3.isRoot();
        java.lang.String str12 = dOMNodePointer3.getDefaultNamespaceURI();
        dOMNodePointer3.printPointerChain();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "http://www.w3.org/XML/1998/namespace");
        boolean boolean4 = dOMNodePointer3.isCollection();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver5 = null;
        dOMNodePointer3.setNamespaceResolver(namespaceResolver5);
        boolean boolean7 = dOMNodePointer3.isActual();
        boolean boolean8 = dOMNodePointer3.isActual();
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale10);
        boolean boolean12 = jDOMNodePointer11.isLeaf();
        boolean boolean13 = jDOMNodePointer11.isActual();
        jDOMNodePointer11.setAttribute(false);
        java.lang.Object obj16 = jDOMNodePointer11.getImmediateNode();
        boolean boolean17 = jDOMNodePointer11.isActual();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest18 = null;
        boolean boolean19 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, (java.lang.Object) boolean17, nodeTest18);
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale21);
        java.lang.Object obj23 = jDOMNodePointer22.getValue();
        org.apache.commons.jxpath.ri.QName qName24 = null;
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale26);
        java.lang.Object obj28 = jDOMNodePointer27.getValue();
        boolean boolean29 = jDOMNodePointer27.isCollection();
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName24, (java.lang.Object) jDOMNodePointer27, locale30);
        int int32 = jDOMNodePointer22.compareTo((java.lang.Object) jDOMNodePointer27);
        java.util.Locale locale34 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer35 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale34);
        java.lang.Object obj36 = jDOMNodePointer35.getValue();
        org.apache.commons.jxpath.ri.QName qName37 = null;
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale39);
        java.lang.Object obj41 = jDOMNodePointer40.getValue();
        boolean boolean42 = jDOMNodePointer40.isCollection();
        java.util.Locale locale43 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer44 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName37, (java.lang.Object) jDOMNodePointer40, locale43);
        int int45 = jDOMNodePointer35.compareTo((java.lang.Object) jDOMNodePointer40);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator46 = jDOMNodePointer40.namespaceIterator();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator47 = jDOMNodePointer40.namespaceIterator();
        int int48 = jDOMNodePointer27.compareTo((java.lang.Object) jDOMNodePointer40);
        boolean boolean49 = dOMNodePointer3.equals((java.lang.Object) jDOMNodePointer40);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest50 = null;
        org.w3c.dom.Node node52 = null;
        java.util.Locale locale53 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer55 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node52, locale53, "hi!");
        boolean boolean56 = dOMNodePointer55.isCollection();
        boolean boolean57 = dOMNodePointer55.isAttribute();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest58 = null;
        boolean boolean59 = dOMNodePointer55.testNode(nodeTest58);
        java.util.Locale locale60 = dOMNodePointer55.getLocale();
        org.w3c.dom.Node node61 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer62 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer55, node61);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest63 = null;
        boolean boolean64 = dOMNodePointer55.testNode(nodeTest63);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator65 = jDOMNodePointer40.childIterator(nodeTest50, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer55);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver66 = null;
        dOMNodePointer55.setNamespaceResolver(namespaceResolver66);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (byte) 10 + "'", obj16, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(nodePointer31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(nodePointer44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(nodeIterator46);
        org.junit.Assert.assertNotNull(nodeIterator47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNull(locale60);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(nodeIterator65);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1.0f), locale2);
        nodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.createPath(jXPathContext6);
        boolean boolean8 = nodePointer7.isRoot();
        org.w3c.dom.Node node9 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer7, node9);
        boolean boolean11 = dOMNodePointer10.isCollection();
        java.lang.Object obj12 = dOMNodePointer10.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = dOMNodePointer10.namespacePointer("hi!");
        int int15 = dOMNodePointer10.getLength();
        java.lang.String str17 = dOMNodePointer10.getNamespaceURI("hi!");
        java.lang.String str18 = dOMNodePointer10.getLanguage();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest19 = null;
        boolean boolean20 = dOMNodePointer10.testNode(nodeTest19);
        boolean boolean21 = dOMNodePointer10.isActual();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1), locale1, "http://www.w3.org/XML/1998/namespace");
        boolean boolean5 = jDOMNodePointer3.equals((java.lang.Object) 100.0f);
        org.w3c.dom.Node node6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node6, locale7, "hi!");
        boolean boolean10 = dOMNodePointer9.isCollection();
        boolean boolean11 = jDOMNodePointer3.equals((java.lang.Object) dOMNodePointer9);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = dOMNodePointer9.namespacePointer("<<unknown namespace>>");
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName14, (java.lang.Object) (-1.0f), locale16);
        nodePointer17.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext20 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = nodePointer17.createPath(jXPathContext20);
        boolean boolean22 = nodePointer21.isRoot();
        org.w3c.dom.Node node23 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer24 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer21, node23);
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale26);
        boolean boolean28 = jDOMNodePointer27.isAttribute();
        java.lang.String str29 = jDOMNodePointer27.asPath();
        java.lang.String str30 = jDOMNodePointer27.toString();
        org.apache.commons.jxpath.ri.QName qName31 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator32 = jDOMNodePointer27.attributeIterator(qName31);
        boolean boolean33 = dOMNodePointer24.equals((java.lang.Object) jDOMNodePointer27);
        org.apache.commons.jxpath.ri.QName qName34 = null;
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName34, (java.lang.Object) (-1.0f), locale36);
        nodePointer37.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext40 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer41 = nodePointer37.createPath(jXPathContext40);
        java.lang.Class<?> wildcardClass42 = nodePointer37.getClass();
        boolean boolean43 = dOMNodePointer24.equals((java.lang.Object) nodePointer37);
        java.lang.Object obj44 = dOMNodePointer24.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer45 = dOMNodePointer24.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.QName qName46 = null;
        java.util.Locale locale48 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer49 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName46, (java.lang.Object) (-1.0f), locale48);
        nodePointer49.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext52 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer53 = nodePointer49.createPath(jXPathContext52);
        boolean boolean54 = nodePointer53.isRoot();
        org.w3c.dom.Node node55 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer56 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer53, node55);
        java.util.Locale locale58 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer59 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale58);
        boolean boolean60 = jDOMNodePointer59.isAttribute();
        java.lang.String str61 = jDOMNodePointer59.asPath();
        java.lang.String str62 = jDOMNodePointer59.toString();
        org.apache.commons.jxpath.ri.QName qName63 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator64 = jDOMNodePointer59.attributeIterator(qName63);
        boolean boolean65 = dOMNodePointer56.equals((java.lang.Object) jDOMNodePointer59);
        org.w3c.dom.Node node66 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer67 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer56, node66);
        int int68 = dOMNodePointer67.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer69 = dOMNodePointer67.getImmediateValuePointer();
        boolean boolean70 = nodePointer69.isNode();
        int int71 = dOMNodePointer9.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer24, nodePointer69);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer73 = dOMNodePointer9.namespacePointer("-1");
        boolean boolean74 = dOMNodePointer9.isCollection();
        org.apache.commons.jxpath.JXPathContext jXPathContext75 = null;
        java.util.Locale locale77 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer79 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1), locale77, "http://www.w3.org/XML/1998/namespace");
        int int80 = jDOMNodePointer79.getLength();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest81 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer83 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator84 = jDOMNodePointer79.childIterator(nodeTest81, false, nodePointer83);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver85 = jDOMNodePointer79.getNamespaceResolver();
        java.util.Locale locale86 = jDOMNodePointer79.getLocale();
        org.apache.commons.jxpath.ri.QName qName87 = jDOMNodePointer79.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer88 = dOMNodePointer9.createAttribute(jXPathContext75, qName87);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot create an attribute for path id('hi!')/@null, operation is not allowed for this type of node");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(nodeIterator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(nodePointer37);
        org.junit.Assert.assertNotNull(nodePointer41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(nodePointer45);
        org.junit.Assert.assertNotNull(nodePointer49);
        org.junit.Assert.assertNotNull(nodePointer53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(nodeIterator64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(nodePointer69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(nodePointer73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertNotNull(nodeIterator84);
        org.junit.Assert.assertNull(namespaceResolver85);
        org.junit.Assert.assertNull(locale86);
        org.junit.Assert.assertNotNull(qName87);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1.0f), locale2);
        nodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.createPath(jXPathContext6);
        boolean boolean8 = nodePointer7.isRoot();
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName9, (java.lang.Object) (-1.0f), locale11);
        boolean boolean13 = nodePointer12.isContainer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver14 = null;
        nodePointer12.setNamespaceResolver(namespaceResolver14);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver16 = null;
        nodePointer12.setNamespaceResolver(namespaceResolver16);
        org.apache.commons.jxpath.JXPathContext jXPathContext18 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = nodePointer12.createPath(jXPathContext18);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(nodePointer7, (java.lang.Object) jXPathContext18);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = nodePointer7.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = nodePointer7.getImmediateParentPointer();
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale24);
        boolean boolean26 = jDOMNodePointer25.isLeaf();
        boolean boolean27 = jDOMNodePointer25.isActual();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest28 = null;
        boolean boolean29 = jDOMNodePointer25.testNode(nodeTest28);
        org.w3c.dom.Node node30 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer31 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer25, node30);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = jDOMNodePointer25.namespacePointer("");
        jDOMNodePointer25.printPointerChain();
        int int35 = nodePointer7.compareTo((java.lang.Object) jDOMNodePointer25);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer36 = nodePointer7.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = nodePointer7.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = nodePointer37.getParent();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertNull(nodePointer22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(nodePointer33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(nodePointer36);
        org.junit.Assert.assertNotNull(nodePointer37);
        org.junit.Assert.assertNull(nodePointer38);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale1);
        boolean boolean3 = jDOMNodePointer2.isLeaf();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) (-1.0f), locale8);
        nodePointer9.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer9.createPath(jXPathContext12);
        boolean boolean14 = nodePointer13.isRoot();
        org.w3c.dom.Node node15 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer16 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer13, node15);
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale18);
        boolean boolean20 = jDOMNodePointer19.isAttribute();
        java.lang.String str21 = jDOMNodePointer19.asPath();
        java.lang.String str22 = jDOMNodePointer19.toString();
        org.apache.commons.jxpath.ri.QName qName23 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator24 = jDOMNodePointer19.attributeIterator(qName23);
        boolean boolean25 = dOMNodePointer16.equals((java.lang.Object) jDOMNodePointer19);
        org.w3c.dom.Node node26 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer16, node26);
        int int28 = dOMNodePointer27.getLength();
        int int29 = dOMNodePointer27.getLength();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator30 = jDOMNodePointer2.childIterator(nodeTest4, false, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer27);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = jDOMNodePointer2.getImmediateValuePointer();
        org.apache.commons.jxpath.JXPathContext jXPathContext32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer34 = nodePointer31.getPointerByID(jXPathContext32, "-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(nodeIterator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(nodeIterator30);
        org.junit.Assert.assertNotNull(nodePointer31);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale1);
        boolean boolean3 = jDOMNodePointer2.isAttribute();
        java.lang.Object obj4 = jDOMNodePointer2.getImmediateNode();
        java.lang.Object obj5 = jDOMNodePointer2.getBaseValue();
        java.lang.Object obj6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, obj6);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = jDOMNodePointer7.namespacePointer("id('<<unknown namespace>>')");
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName10, (java.lang.Object) (-1.0f), locale12);
        java.util.Locale locale14 = nodePointer13.getLocale();
        nodePointer13.setIndex((int) 'a');
        boolean boolean17 = nodePointer13.isRoot();
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) boolean17, locale18, "http://www.w3.org/XML/1998/namespace");
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale22);
        java.lang.Object obj24 = jDOMNodePointer23.getValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator25 = jDOMNodePointer23.namespaceIterator();
        org.apache.commons.jxpath.ri.QName qName26 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName26, (java.lang.Object) (-1.0f), locale28);
        boolean boolean30 = nodePointer29.isContainer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver31 = null;
        nodePointer29.setNamespaceResolver(namespaceResolver31);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer33 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer23, (java.lang.Object) namespaceResolver31);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer20, (java.lang.Object) jDOMNodePointer33);
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer20, locale35);
        java.util.Locale locale37 = jDOMNodePointer20.getLocale();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest38 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer42 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale41);
        java.lang.Object obj43 = jDOMNodePointer42.getValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator44 = jDOMNodePointer42.namespaceIterator();
        java.util.Locale locale45 = jDOMNodePointer42.getLocale();
        org.apache.commons.jxpath.ri.QName qName46 = null;
        java.util.Locale locale48 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer49 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName46, (java.lang.Object) (-1.0f), locale48);
        nodePointer49.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext52 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer53 = nodePointer49.createPath(jXPathContext52);
        boolean boolean54 = nodePointer53.isRoot();
        org.w3c.dom.Node node55 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer56 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer53, node55);
        boolean boolean57 = jDOMNodePointer42.equals((java.lang.Object) node55);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator58 = jDOMNodePointer42.namespaceIterator();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator59 = jDOMNodePointer20.childIterator(nodeTest38, false, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer42);
        org.w3c.dom.Node node60 = null;
        java.util.Locale locale61 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer63 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node60, locale61, "http://www.w3.org/2000/xmlns/");
        int int64 = dOMNodePointer63.getLength();
        java.lang.Object obj65 = dOMNodePointer63.getNodeValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer67 = dOMNodePointer63.namespacePointer("http://www.w3.org/2000/xmlns/");
        org.w3c.dom.Node node68 = null;
        java.util.Locale locale69 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer71 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node68, locale69, "http://www.w3.org/2000/xmlns/");
        int int72 = dOMNodePointer71.getLength();
        java.lang.Object obj73 = dOMNodePointer71.getNodeValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer74 = dOMNodePointer71.getImmediateValuePointer();
        boolean boolean75 = dOMNodePointer71.isActual();
        int int76 = jDOMNodePointer20.compareChildNodePointers(nodePointer67, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer71);
        boolean boolean77 = jDOMNodePointer7.equals((java.lang.Object) jDOMNodePointer20);
        org.w3c.dom.Node node78 = null;
        java.util.Locale locale79 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer81 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node78, locale79, "http://www.w3.org/2000/xmlns/");
        org.apache.commons.jxpath.ri.QName qName82 = null;
        java.util.Locale locale84 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer85 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName82, (java.lang.Object) (-1.0f), locale84);
        nodePointer85.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext88 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer89 = nodePointer85.createPath(jXPathContext88);
        boolean boolean90 = nodePointer89.isRoot();
        org.w3c.dom.Node node91 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer92 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer89, node91);
        java.lang.String str93 = dOMNodePointer92.getLanguage();
        java.lang.String str95 = dOMNodePointer92.getNamespaceURI("http://www.w3.org/XML/1998/namespace");
        boolean boolean96 = dOMNodePointer81.equals((java.lang.Object) dOMNodePointer92);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer97 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int98 = jDOMNodePointer7.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer81, nodePointer97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(nodeIterator25);
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(locale37);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(nodeIterator44);
        org.junit.Assert.assertNull(locale45);
        org.junit.Assert.assertNotNull(nodePointer49);
        org.junit.Assert.assertNotNull(nodePointer53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(nodeIterator58);
        org.junit.Assert.assertNotNull(nodeIterator59);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(nodePointer67);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(nodePointer74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(nodePointer85);
        org.junit.Assert.assertNotNull(nodePointer89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNull(str93);
        org.junit.Assert.assertNull(str95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1), locale1, "http://www.w3.org/XML/1998/namespace");
        int int4 = jDOMNodePointer3.getLength();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator5 = jDOMNodePointer3.namespaceIterator();
        java.lang.String str6 = jDOMNodePointer3.asPath();
        boolean boolean7 = jDOMNodePointer3.isAttribute();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(nodeIterator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "id('http://www.w3.org/XML/1998/namespace')" + "'", str6, "id('http://www.w3.org/XML/1998/namespace')");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1.0f), locale2);
        nodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.createPath(jXPathContext6);
        boolean boolean8 = nodePointer7.isRoot();
        org.w3c.dom.Node node9 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer7, node9);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale12);
        boolean boolean14 = jDOMNodePointer13.isAttribute();
        java.lang.String str15 = jDOMNodePointer13.asPath();
        java.lang.String str16 = jDOMNodePointer13.toString();
        org.apache.commons.jxpath.ri.QName qName17 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = jDOMNodePointer13.attributeIterator(qName17);
        boolean boolean19 = dOMNodePointer10.equals((java.lang.Object) jDOMNodePointer13);
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName20, (java.lang.Object) (-1.0f), locale22);
        nodePointer23.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext26 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = nodePointer23.createPath(jXPathContext26);
        java.lang.Class<?> wildcardClass28 = nodePointer23.getClass();
        boolean boolean29 = dOMNodePointer10.equals((java.lang.Object) nodePointer23);
        boolean boolean30 = dOMNodePointer10.isCollection();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = dOMNodePointer10.getParent();
        java.lang.String str32 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix((java.lang.Object) nodePointer31);
        java.util.Locale locale33 = nodePointer31.getLocale();
        java.lang.String str34 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix((java.lang.Object) nodePointer31);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = nodePointer31.getImmediateValuePointer();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(nodePointer31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(locale33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(nodePointer35);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale1);
        java.lang.Object obj3 = jDOMNodePointer2.getValue();
        boolean boolean4 = jDOMNodePointer2.isCollection();
        java.lang.String str6 = jDOMNodePointer2.getNamespaceURI("http://www.w3.org/2000/xmlns/");
        boolean boolean7 = jDOMNodePointer2.isContainer();
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale9);
        boolean boolean11 = jDOMNodePointer10.isLeaf();
        java.lang.String str13 = jDOMNodePointer10.getNamespaceURI("hi!");
        jDOMNodePointer10.setAttribute(true);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = jDOMNodePointer10.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver17 = jDOMNodePointer10.getNamespaceResolver();
        boolean boolean18 = jDOMNodePointer10.isLeaf();
        boolean boolean19 = jDOMNodePointer10.isCollection();
        java.lang.Object obj20 = jDOMNodePointer10.clone();
        // The following exception was thrown during execution in test generation
        try {
            jDOMNodePointer2.setValue((java.lang.Object) jDOMNodePointer10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class org.jdom.Element (java.lang.Byte is in module java.base of loader 'bootstrap'; org.jdom.Element is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertNull(namespaceResolver17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "");
        java.lang.Object obj4 = dOMNodePointer3.getRootNode();
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, qName5, (java.lang.Object) jDOMNodePointer8);
        boolean boolean11 = jDOMNodePointer8.isCollection();
        java.lang.Object obj12 = jDOMNodePointer8.getValue();
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer8, locale13);
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale17);
        java.lang.Object obj19 = jDOMNodePointer18.getValue();
        boolean boolean20 = jDOMNodePointer18.isCollection();
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName15, (java.lang.Object) jDOMNodePointer18, locale21);
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale24);
        boolean boolean26 = jDOMNodePointer25.isLeaf();
        java.lang.String str28 = jDOMNodePointer25.getNamespaceURI("hi!");
        jDOMNodePointer25.setAttribute(true);
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer33 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale32);
        boolean boolean34 = jDOMNodePointer33.isAttribute();
        java.lang.Object obj35 = jDOMNodePointer33.getImmediateNode();
        int int36 = jDOMNodePointer18.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer25, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer33);
        java.lang.Object obj37 = jDOMNodePointer25.getNode();
        int int38 = jDOMNodePointer25.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer39 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer42 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale41);
        java.lang.Object obj43 = jDOMNodePointer42.getValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator44 = jDOMNodePointer42.namespaceIterator();
        org.apache.commons.jxpath.ri.QName qName45 = null;
        java.util.Locale locale47 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer48 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName45, (java.lang.Object) (-1.0f), locale47);
        boolean boolean49 = nodePointer48.isContainer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver50 = null;
        nodePointer48.setNamespaceResolver(namespaceResolver50);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer52 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer42, (java.lang.Object) namespaceResolver50);
        org.apache.commons.jxpath.ri.QName qName53 = null;
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer56 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale55);
        boolean boolean57 = jDOMNodePointer56.isAttribute();
        java.lang.Object obj58 = jDOMNodePointer56.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer59 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer52, qName53, obj58);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer60 = jDOMNodePointer52.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer62 = jDOMNodePointer52.namespacePointer("");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest63 = null;
        boolean boolean64 = jDOMNodePointer52.testNode(nodeTest63);
        java.lang.Object obj65 = jDOMNodePointer52.getNodeValue();
        java.lang.Object obj66 = jDOMNodePointer52.getValue();
        jDOMNodePointer52.setIndex((int) (short) -1);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer69 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(nodePointer39, (java.lang.Object) jDOMNodePointer52);
        java.lang.String str70 = jDOMNodePointer52.getNamespaceURI();
        int int71 = jDOMNodePointer52.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer73 = jDOMNodePointer52.namespacePointer("");
        boolean boolean74 = jDOMNodePointer52.isNode();
        boolean boolean75 = jDOMNodePointer25.equals((java.lang.Object) jDOMNodePointer52);
        org.w3c.dom.Node node76 = null;
        java.util.Locale locale77 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer79 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node76, locale77, "<<unknown namespace>>");
        java.lang.Object obj80 = dOMNodePointer79.getImmediateNode();
        java.lang.Object obj81 = dOMNodePointer79.getNodeValue();
        int int82 = jDOMNodePointer8.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer52, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer79);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer83 = dOMNodePointer79.getParent();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 10 + "'", obj9, (byte) 10);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (byte) 10 + "'", obj35, (byte) 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) 10 + "'", obj37, (byte) 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(nodeIterator44);
        org.junit.Assert.assertNotNull(nodePointer48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (byte) 10 + "'", obj58, (byte) 10);
        org.junit.Assert.assertNotNull(nodePointer59);
        org.junit.Assert.assertNotNull(nodePointer60);
        org.junit.Assert.assertNotNull(nodePointer62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(nodePointer73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNull(nodePointer83);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "hi!");
        java.lang.Object obj4 = dOMNodePointer3.getRootNode();
        java.lang.String str6 = dOMNodePointer3.getNamespaceURI("");
        java.lang.String str7 = dOMNodePointer3.getDefaultNamespaceURI();
        java.lang.String str8 = dOMNodePointer3.asPath();
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName9, (java.lang.Object) (-1.0f), locale11);
        nodePointer12.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext15 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = nodePointer12.createPath(jXPathContext15);
        boolean boolean17 = nodePointer16.isRoot();
        org.w3c.dom.Node node18 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer19 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer16, node18);
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale21);
        boolean boolean23 = jDOMNodePointer22.isAttribute();
        java.lang.String str24 = jDOMNodePointer22.asPath();
        java.lang.String str25 = jDOMNodePointer22.toString();
        org.apache.commons.jxpath.ri.QName qName26 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator27 = jDOMNodePointer22.attributeIterator(qName26);
        boolean boolean28 = dOMNodePointer19.equals((java.lang.Object) jDOMNodePointer22);
        org.w3c.dom.Node node29 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer30 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer19, node29);
        java.lang.Object obj31 = dOMNodePointer19.clone();
        boolean boolean32 = dOMNodePointer3.equals((java.lang.Object) dOMNodePointer19);
        boolean boolean33 = dOMNodePointer3.isCollection();
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale35);
        java.lang.Object obj37 = jDOMNodePointer36.getValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator38 = jDOMNodePointer36.namespaceIterator();
        org.apache.commons.jxpath.ri.QName qName39 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName39, (java.lang.Object) (-1.0f), locale41);
        boolean boolean43 = nodePointer42.isContainer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver44 = null;
        nodePointer42.setNamespaceResolver(namespaceResolver44);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer46 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer36, (java.lang.Object) namespaceResolver44);
        org.apache.commons.jxpath.ri.QName qName47 = null;
        java.util.Locale locale49 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer50 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale49);
        boolean boolean51 = jDOMNodePointer50.isAttribute();
        java.lang.Object obj52 = jDOMNodePointer50.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer53 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer46, qName47, obj52);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer54 = jDOMNodePointer46.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer56 = jDOMNodePointer46.namespacePointer("");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest57 = null;
        boolean boolean58 = jDOMNodePointer46.testNode(nodeTest57);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest59 = null;
        java.util.Locale locale62 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer63 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale62);
        java.lang.Object obj64 = jDOMNodePointer63.getValue();
        boolean boolean65 = jDOMNodePointer63.isCollection();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator66 = jDOMNodePointer46.childIterator(nodeTest59, false, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer63);
        org.apache.commons.jxpath.ri.QName qName67 = null;
        java.util.Locale locale69 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer70 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName67, (java.lang.Object) (-1.0f), locale69);
        nodePointer70.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext73 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer74 = nodePointer70.createPath(jXPathContext73);
        boolean boolean75 = nodePointer70.isAttribute();
        boolean boolean76 = nodePointer70.isNode();
        java.lang.Object obj77 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest78 = null;
        boolean boolean79 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(nodePointer70, obj77, nodeTest78);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest80 = null;
        boolean boolean81 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer63, (java.lang.Object) nodeTest78, nodeTest80);
        boolean boolean82 = jDOMNodePointer63.isContainer();
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer3.setValue((java.lang.Object) jDOMNodePointer63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "id('hi!')" + "'", str8, "id('hi!')");
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(nodeIterator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(nodeIterator38);
        org.junit.Assert.assertNotNull(nodePointer42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + (byte) 10 + "'", obj52, (byte) 10);
        org.junit.Assert.assertNotNull(nodePointer53);
        org.junit.Assert.assertNotNull(nodePointer54);
        org.junit.Assert.assertNotNull(nodePointer56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(nodeIterator66);
        org.junit.Assert.assertNotNull(nodePointer70);
        org.junit.Assert.assertNotNull(nodePointer74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale1);
        boolean boolean3 = jDOMNodePointer2.isAttribute();
        java.lang.Object obj4 = jDOMNodePointer2.getImmediateNode();
        java.lang.Object obj5 = jDOMNodePointer2.getBaseValue();
        java.lang.Object obj6 = jDOMNodePointer2.clone();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale10);
        boolean boolean12 = jDOMNodePointer11.isLeaf();
        java.lang.String str14 = jDOMNodePointer11.getNamespaceURI("hi!");
        java.lang.String str16 = jDOMNodePointer11.getNamespaceURI("");
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale18);
        boolean boolean20 = jDOMNodePointer19.isLeaf();
        java.lang.Object obj21 = jDOMNodePointer19.getValue();
        java.lang.String str23 = jDOMNodePointer19.getNamespaceURI("id('hi!')");
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer19, locale24);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer11, (java.lang.Object) jDOMNodePointer19);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator27 = jDOMNodePointer2.childIterator(nodeTest7, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer11);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = jDOMNodePointer2.getImmediateValuePointer();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (byte) 10 + "'", obj4, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (byte) 10 + "'", obj5, (byte) 10);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(nodeIterator27);
        org.junit.Assert.assertNotNull(nodePointer28);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale2);
        java.lang.Object obj4 = jDOMNodePointer3.getValue();
        boolean boolean5 = jDOMNodePointer3.isCollection();
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) jDOMNodePointer3, locale6);
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale9);
        boolean boolean11 = jDOMNodePointer10.isLeaf();
        java.lang.String str13 = jDOMNodePointer10.getNamespaceURI("hi!");
        jDOMNodePointer10.setAttribute(true);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale17);
        boolean boolean19 = jDOMNodePointer18.isAttribute();
        java.lang.Object obj20 = jDOMNodePointer18.getImmediateNode();
        int int21 = jDOMNodePointer3.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer10, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18);
        java.lang.Object obj22 = jDOMNodePointer10.getNode();
        jDOMNodePointer10.setAttribute(false);
        org.apache.commons.jxpath.JXPathContext jXPathContext25 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale27);
        java.lang.Object obj29 = jDOMNodePointer28.getValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator30 = jDOMNodePointer28.namespaceIterator();
        org.apache.commons.jxpath.ri.QName qName31 = null;
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName31, (java.lang.Object) (-1.0f), locale33);
        boolean boolean35 = nodePointer34.isContainer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver36 = null;
        nodePointer34.setNamespaceResolver(namespaceResolver36);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer38 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer28, (java.lang.Object) namespaceResolver36);
        org.apache.commons.jxpath.ri.QName qName39 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer42 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale41);
        boolean boolean43 = jDOMNodePointer42.isAttribute();
        java.lang.Object obj44 = jDOMNodePointer42.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer45 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer38, qName39, obj44);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer46 = jDOMNodePointer38.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer48 = jDOMNodePointer38.namespacePointer("");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest49 = null;
        boolean boolean50 = jDOMNodePointer38.testNode(nodeTest49);
        java.lang.Object obj51 = jDOMNodePointer38.getNodeValue();
        java.lang.Object obj52 = jDOMNodePointer38.getValue();
        java.lang.Object obj53 = jDOMNodePointer38.clone();
        boolean boolean54 = jDOMNodePointer38.isAttribute();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer55 = jDOMNodePointer38.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName56 = jDOMNodePointer38.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer58 = jDOMNodePointer10.createChild(jXPathContext25, qName56, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 10 + "'", obj20, (byte) 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (byte) 10 + "'", obj22, (byte) 10);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(nodeIterator30);
        org.junit.Assert.assertNotNull(nodePointer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (byte) 10 + "'", obj44, (byte) 10);
        org.junit.Assert.assertNotNull(nodePointer45);
        org.junit.Assert.assertNotNull(nodePointer46);
        org.junit.Assert.assertNotNull(nodePointer48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(nodePointer55);
        org.junit.Assert.assertNotNull(qName56);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1.0f), locale2);
        nodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.createPath(jXPathContext6);
        boolean boolean8 = nodePointer7.isRoot();
        org.w3c.dom.Node node9 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer7, node9);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale12);
        boolean boolean14 = jDOMNodePointer13.isAttribute();
        java.lang.String str15 = jDOMNodePointer13.asPath();
        java.lang.String str16 = jDOMNodePointer13.toString();
        org.apache.commons.jxpath.ri.QName qName17 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = jDOMNodePointer13.attributeIterator(qName17);
        boolean boolean19 = dOMNodePointer10.equals((java.lang.Object) jDOMNodePointer13);
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName20, (java.lang.Object) (-1.0f), locale22);
        nodePointer23.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext26 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = nodePointer23.createPath(jXPathContext26);
        java.lang.Class<?> wildcardClass28 = nodePointer23.getClass();
        boolean boolean29 = dOMNodePointer10.equals((java.lang.Object) nodePointer23);
        boolean boolean30 = dOMNodePointer10.isCollection();
        boolean boolean31 = dOMNodePointer10.isAttribute();
        java.lang.String str32 = dOMNodePointer10.getLanguage();
        int int33 = dOMNodePointer10.getLength();
        int int34 = dOMNodePointer10.getLength();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = dOMNodePointer10.getNamespaceURI();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale2);
        java.lang.Object obj4 = jDOMNodePointer3.getValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator5 = jDOMNodePointer3.namespaceIterator();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) (-1.0f), locale8);
        boolean boolean10 = nodePointer9.isContainer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver11 = null;
        nodePointer9.setNamespaceResolver(namespaceResolver11);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, (java.lang.Object) namespaceResolver11);
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) jDOMNodePointer13, locale14);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = jDOMNodePointer13.getImmediateParentPointer();
        java.lang.String str17 = jDOMNodePointer13.asPath();
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale19);
        boolean boolean21 = jDOMNodePointer20.isCollection();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = jDOMNodePointer20.namespacePointer("");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = nodePointer23.getImmediateValuePointer();
        boolean boolean25 = jDOMNodePointer13.equals((java.lang.Object) nodePointer24);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = jDOMNodePointer13.namespacePointer("id('id(&apos;http://www.w3.org/XML/1998/namespace&apos;)')");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(nodeIterator5);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodePointer27);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale2);
        java.lang.Object obj4 = jDOMNodePointer3.getValue();
        boolean boolean5 = jDOMNodePointer3.isCollection();
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) jDOMNodePointer3, locale6);
        java.lang.String str8 = jDOMNodePointer3.asPath();
        java.lang.String str9 = jDOMNodePointer3.getNamespaceURI();
        java.lang.String str10 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix((java.lang.Object) jDOMNodePointer3);
        jDOMNodePointer3.setAttribute(true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "hi!");
        java.lang.Object obj4 = dOMNodePointer3.clone();
        dOMNodePointer3.setAttribute(true);
        boolean boolean7 = dOMNodePointer3.isNode();
        dOMNodePointer3.printPointerChain();
        java.util.Locale locale9 = dOMNodePointer3.getLocale();
        boolean boolean10 = dOMNodePointer3.isActual();
        java.lang.Object obj11 = dOMNodePointer3.getImmediateNode();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "id('hi!')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "id('hi!')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "id('hi!')");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale1);
        java.lang.Object obj3 = jDOMNodePointer2.getBaseValue();
        boolean boolean4 = jDOMNodePointer2.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale8);
        boolean boolean10 = jDOMNodePointer9.isAttribute();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = jDOMNodePointer9.namespacePointer("");
        java.lang.Object obj13 = jDOMNodePointer9.getImmediateNode();
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer9, node14);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator16 = jDOMNodePointer2.childIterator(nodeTest5, false, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer9);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        org.w3c.dom.Node node19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer22 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node19, locale20, "");
        int int23 = dOMNodePointer22.getIndex();
        dOMNodePointer22.setIndex((int) '4');
        dOMNodePointer22.setIndex((int) (byte) 1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator28 = jDOMNodePointer9.childIterator(nodeTest17, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer22);
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1), locale30, "http://www.w3.org/XML/1998/namespace");
        boolean boolean34 = jDOMNodePointer32.equals((java.lang.Object) 100.0f);
        org.w3c.dom.Node node35 = null;
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer38 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node35, locale36, "hi!");
        boolean boolean39 = dOMNodePointer38.isCollection();
        boolean boolean40 = jDOMNodePointer32.equals((java.lang.Object) dOMNodePointer38);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = dOMNodePointer38.namespacePointer("<<unknown namespace>>");
        org.apache.commons.jxpath.ri.QName qName43 = null;
        java.util.Locale locale45 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer46 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName43, (java.lang.Object) (-1.0f), locale45);
        nodePointer46.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext49 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer50 = nodePointer46.createPath(jXPathContext49);
        boolean boolean51 = nodePointer50.isRoot();
        org.w3c.dom.Node node52 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer53 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer50, node52);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer54 = dOMNodePointer53.getImmediateParentPointer();
        int int55 = dOMNodePointer53.getLength();
        org.w3c.dom.Node node56 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer57 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer53, node56);
        int int58 = dOMNodePointer22.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer38, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer53);
        java.lang.Object obj59 = dOMNodePointer53.getBaseValue();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertNotNull(nodeIterator16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-2147483648) + "'", int23 == (-2147483648));
        org.junit.Assert.assertNotNull(nodeIterator28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(nodePointer42);
        org.junit.Assert.assertNotNull(nodePointer46);
        org.junit.Assert.assertNotNull(nodePointer50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(nodePointer54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1), locale1, "http://www.w3.org/XML/1998/namespace");
        boolean boolean5 = jDOMNodePointer3.equals((java.lang.Object) 100.0f);
        org.w3c.dom.Node node6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node6, locale7, "hi!");
        boolean boolean10 = dOMNodePointer9.isCollection();
        boolean boolean11 = jDOMNodePointer3.equals((java.lang.Object) dOMNodePointer9);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = dOMNodePointer9.namespacePointer("<<unknown namespace>>");
        boolean boolean14 = dOMNodePointer9.isContainer();
        java.lang.Object obj15 = dOMNodePointer9.getRootNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName18, (java.lang.Object) (-1.0f), locale20);
        nodePointer21.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext24 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = nodePointer21.createPath(jXPathContext24);
        boolean boolean26 = nodePointer25.isRoot();
        org.w3c.dom.Node node27 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer28 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer25, node27);
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer31 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale30);
        boolean boolean32 = jDOMNodePointer31.isAttribute();
        java.lang.String str33 = jDOMNodePointer31.asPath();
        java.lang.String str34 = jDOMNodePointer31.toString();
        org.apache.commons.jxpath.ri.QName qName35 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator36 = jDOMNodePointer31.attributeIterator(qName35);
        boolean boolean37 = dOMNodePointer28.equals((java.lang.Object) jDOMNodePointer31);
        org.apache.commons.jxpath.ri.QName qName38 = null;
        java.util.Locale locale40 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer41 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName38, (java.lang.Object) (-1.0f), locale40);
        nodePointer41.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext44 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer45 = nodePointer41.createPath(jXPathContext44);
        java.lang.Class<?> wildcardClass46 = nodePointer41.getClass();
        boolean boolean47 = dOMNodePointer28.equals((java.lang.Object) nodePointer41);
        boolean boolean48 = dOMNodePointer28.isCollection();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer49 = dOMNodePointer28.getParent();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator50 = dOMNodePointer9.childIterator(nodeTest16, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer28);
        java.lang.String str51 = dOMNodePointer28.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer28.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertNotNull(nodePointer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(nodeIterator36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(nodePointer41);
        org.junit.Assert.assertNotNull(nodePointer45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(nodePointer49);
        org.junit.Assert.assertNotNull(nodeIterator50);
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale1);
        boolean boolean3 = jDOMNodePointer2.isAttribute();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = jDOMNodePointer2.namespacePointer("");
        java.lang.Object obj6 = jDOMNodePointer2.getImmediateNode();
        java.lang.Object obj7 = jDOMNodePointer2.getRootNode();
        boolean boolean8 = jDOMNodePointer2.isCollection();
        java.lang.Object obj9 = jDOMNodePointer2.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = jDOMNodePointer2.getImmediateValuePointer();
        org.w3c.dom.Node node11 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer12 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, node11);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = dOMNodePointer12.namespacePointer("id('<<unknown namespace>>')");
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodePointer14, locale15, "id('<<unknown namespace>>')");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 10 + "'", obj6, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 10 + "'", obj7, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 10 + "'", obj9, (byte) 10);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(nodePointer14);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1.0f), locale2);
        java.util.Locale locale4 = nodePointer3.getLocale();
        nodePointer3.setIndex((int) 'a');
        boolean boolean7 = nodePointer3.isRoot();
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) boolean7, locale8, "http://www.w3.org/XML/1998/namespace");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer13.namespaceIterator();
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName16, (java.lang.Object) (-1.0f), locale18);
        boolean boolean20 = nodePointer19.isContainer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver21 = null;
        nodePointer19.setNamespaceResolver(namespaceResolver21);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13, (java.lang.Object) namespaceResolver21);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer10, (java.lang.Object) jDOMNodePointer23);
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer10, locale25);
        org.apache.commons.jxpath.JXPathContext jXPathContext27 = null;
        java.lang.Object obj28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = jDOMNodePointer26.createPath(jXPathContext27, obj28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer cannot be cast to class org.jdom.Element (org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer and org.jdom.Element are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale2);
        java.lang.Object obj4 = jDOMNodePointer3.getValue();
        boolean boolean5 = jDOMNodePointer3.isCollection();
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) jDOMNodePointer3, locale6);
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale9);
        boolean boolean11 = jDOMNodePointer10.isLeaf();
        java.lang.String str13 = jDOMNodePointer10.getNamespaceURI("hi!");
        jDOMNodePointer10.setAttribute(true);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale17);
        boolean boolean19 = jDOMNodePointer18.isAttribute();
        java.lang.Object obj20 = jDOMNodePointer18.getImmediateNode();
        int int21 = jDOMNodePointer3.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer10, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = jDOMNodePointer10.namespacePointer("<<unknown namespace>>");
        java.lang.String str24 = jDOMNodePointer10.toString();
        org.w3c.dom.Node node25 = null;
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer28 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node25, locale26, "hi!");
        java.lang.Object obj29 = dOMNodePointer28.clone();
        java.lang.String str30 = dOMNodePointer28.asPath();
        java.lang.String str31 = dOMNodePointer28.getLanguage();
        java.lang.String str32 = dOMNodePointer28.getDefaultNamespaceURI();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest33 = null;
        boolean boolean34 = dOMNodePointer28.testNode(nodeTest33);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer35 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer10, (java.lang.Object) dOMNodePointer28);
        org.w3c.dom.Node node36 = null;
        java.util.Locale locale37 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer39 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node36, locale37, "");
        java.lang.Object obj40 = dOMNodePointer39.getRootNode();
        org.apache.commons.jxpath.ri.QName qName41 = null;
        java.util.Locale locale43 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer44 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale43);
        java.lang.Object obj45 = jDOMNodePointer44.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer46 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer39, qName41, (java.lang.Object) jDOMNodePointer44);
        java.lang.String str47 = dOMNodePointer39.getLanguage();
        boolean boolean48 = dOMNodePointer39.isCollection();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer50 = dOMNodePointer39.namespacePointer("http://www.w3.org/2000/xmlns/");
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer51 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer35, (java.lang.Object) "http://www.w3.org/2000/xmlns/");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 10 + "'", obj20, (byte) 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "id('hi!')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "id('hi!')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "id('hi!')");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "id('hi!')" + "'", str30, "id('hi!')");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (byte) 10 + "'", obj45, (byte) 10);
        org.junit.Assert.assertNotNull(nodePointer46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(nodePointer50);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "http://www.w3.org/XML/1998/namespace");
        boolean boolean4 = dOMNodePointer3.isCollection();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver5 = null;
        dOMNodePointer3.setNamespaceResolver(namespaceResolver5);
        boolean boolean7 = dOMNodePointer3.isActual();
        boolean boolean8 = dOMNodePointer3.isActual();
        int int9 = dOMNodePointer3.getLength();
        java.lang.Object obj10 = dOMNodePointer3.getImmediateNode();
        boolean boolean11 = dOMNodePointer3.isRoot();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        boolean boolean13 = dOMNodePointer3.testNode(nodeTest12);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName14, (java.lang.Object) (-1.0f), locale16);
        nodePointer17.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext20 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = nodePointer17.createPath(jXPathContext20);
        boolean boolean22 = nodePointer21.isRoot();
        org.w3c.dom.Node node23 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer24 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer21, node23);
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale26);
        boolean boolean28 = jDOMNodePointer27.isAttribute();
        java.lang.String str29 = jDOMNodePointer27.asPath();
        java.lang.String str30 = jDOMNodePointer27.toString();
        org.apache.commons.jxpath.ri.QName qName31 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator32 = jDOMNodePointer27.attributeIterator(qName31);
        boolean boolean33 = dOMNodePointer24.equals((java.lang.Object) jDOMNodePointer27);
        boolean boolean34 = jDOMNodePointer27.isRoot();
        java.lang.String str35 = jDOMNodePointer27.asPath();
        int int36 = jDOMNodePointer27.getLength();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, (java.lang.Object) jDOMNodePointer27);
        int int38 = jDOMNodePointer37.getLength();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(nodeIterator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale1);
        java.lang.Object obj3 = jDOMNodePointer2.getValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator4 = jDOMNodePointer2.namespaceIterator();
        java.util.Locale locale5 = jDOMNodePointer2.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = jDOMNodePointer2.getImmediateValuePointer();
        java.lang.Object obj7 = jDOMNodePointer2.getBaseValue();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(nodeIterator4);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 10 + "'", obj7, (byte) 10);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1.0f), locale2);
        java.util.Locale locale4 = nodePointer3.getLocale();
        nodePointer3.setIndex((int) 'a');
        boolean boolean7 = nodePointer3.isRoot();
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) boolean7, locale8, "http://www.w3.org/XML/1998/namespace");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer13.namespaceIterator();
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName16, (java.lang.Object) (-1.0f), locale18);
        boolean boolean20 = nodePointer19.isContainer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver21 = null;
        nodePointer19.setNamespaceResolver(namespaceResolver21);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13, (java.lang.Object) namespaceResolver21);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer10, (java.lang.Object) jDOMNodePointer23);
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer10, locale25);
        java.util.Locale locale27 = jDOMNodePointer10.getLocale();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest28 = null;
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale31);
        java.lang.Object obj33 = jDOMNodePointer32.getValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator34 = jDOMNodePointer32.namespaceIterator();
        java.util.Locale locale35 = jDOMNodePointer32.getLocale();
        org.apache.commons.jxpath.ri.QName qName36 = null;
        java.util.Locale locale38 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer39 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName36, (java.lang.Object) (-1.0f), locale38);
        nodePointer39.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext42 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer43 = nodePointer39.createPath(jXPathContext42);
        boolean boolean44 = nodePointer43.isRoot();
        org.w3c.dom.Node node45 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer46 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer43, node45);
        boolean boolean47 = jDOMNodePointer32.equals((java.lang.Object) node45);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator48 = jDOMNodePointer32.namespaceIterator();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator49 = jDOMNodePointer10.childIterator(nodeTest28, false, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer32);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest50 = null;
        boolean boolean51 = jDOMNodePointer32.testNode(nodeTest50);
        java.lang.String str52 = jDOMNodePointer32.asPath();
        jDOMNodePointer32.setAttribute(false);
        java.lang.String str55 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName((java.lang.Object) false);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(locale27);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(nodeIterator34);
        org.junit.Assert.assertNull(locale35);
        org.junit.Assert.assertNotNull(nodePointer39);
        org.junit.Assert.assertNotNull(nodePointer43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(nodeIterator48);
        org.junit.Assert.assertNotNull(nodeIterator49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "-1");
        java.lang.Object obj4 = dOMNodePointer3.getBaseValue();
        org.w3c.dom.Node node5 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer6 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, node5);
        java.lang.String str7 = dOMNodePointer3.asPath();
        java.lang.String str8 = dOMNodePointer3.asPath();
        java.lang.String str10 = dOMNodePointer3.getNamespaceURI("/namespace::-1");
        org.apache.commons.jxpath.JXPathContext jXPathContext11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = dOMNodePointer3.createPath(jXPathContext11);
        dOMNodePointer3.setIndex(0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "id('-1')" + "'", str7, "id('-1')");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "id('-1')" + "'", str8, "id('-1')");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(nodePointer12);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale1);
        boolean boolean3 = jDOMNodePointer2.isAttribute();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = jDOMNodePointer2.namespacePointer("");
        java.lang.Object obj6 = jDOMNodePointer2.getImmediateNode();
        java.lang.Object obj7 = jDOMNodePointer2.getRootNode();
        java.lang.String str8 = jDOMNodePointer2.getNamespaceURI();
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale10);
        boolean boolean12 = jDOMNodePointer11.isAttribute();
        java.lang.String str13 = jDOMNodePointer11.asPath();
        java.lang.String str14 = jDOMNodePointer11.toString();
        org.apache.commons.jxpath.ri.QName qName15 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator16 = jDOMNodePointer11.attributeIterator(qName15);
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1), locale18, "http://www.w3.org/XML/1998/namespace");
        boolean boolean22 = jDOMNodePointer20.equals((java.lang.Object) 100.0f);
        org.w3c.dom.Node node23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer26 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node23, locale24, "hi!");
        boolean boolean27 = dOMNodePointer26.isCollection();
        boolean boolean28 = jDOMNodePointer20.equals((java.lang.Object) dOMNodePointer26);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = dOMNodePointer26.namespacePointer("<<unknown namespace>>");
        boolean boolean31 = dOMNodePointer26.isContainer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer11, (java.lang.Object) dOMNodePointer26);
        int int33 = jDOMNodePointer2.compareTo((java.lang.Object) jDOMNodePointer32);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest34 = null;
        java.util.Locale locale37 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer39 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1), locale37, "http://www.w3.org/XML/1998/namespace");
        java.lang.String str40 = jDOMNodePointer39.getNamespaceURI();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator41 = jDOMNodePointer2.childIterator(nodeTest34, false, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer39);
        java.util.Locale locale42 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer43 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer39, locale42);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 10 + "'", obj6, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) 10 + "'", obj7, (byte) 10);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(nodeIterator16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(nodePointer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(nodeIterator41);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "http://www.w3.org/XML/1998/namespace");
        boolean boolean4 = dOMNodePointer3.isCollection();
        java.lang.Object obj5 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, obj5);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale11);
        java.lang.Object obj13 = jDOMNodePointer12.getValue();
        boolean boolean14 = jDOMNodePointer12.isCollection();
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName9, (java.lang.Object) jDOMNodePointer12, locale15);
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale18);
        boolean boolean20 = jDOMNodePointer19.isLeaf();
        java.lang.String str22 = jDOMNodePointer19.getNamespaceURI("hi!");
        jDOMNodePointer19.setAttribute(true);
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale26);
        boolean boolean28 = jDOMNodePointer27.isAttribute();
        java.lang.Object obj29 = jDOMNodePointer27.getImmediateNode();
        int int30 = jDOMNodePointer12.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer27);
        java.lang.Object obj31 = jDOMNodePointer19.getNode();
        jDOMNodePointer19.setAttribute(false);
        java.lang.String str34 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName((java.lang.Object) jDOMNodePointer19);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator35 = jDOMNodePointer6.childIterator(nodeTest7, false, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19);
        org.apache.commons.jxpath.ri.QName qName36 = jDOMNodePointer19.getName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 10 + "'", obj29, (byte) 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (byte) 10 + "'", obj31, (byte) 10);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(nodeIterator35);
        org.junit.Assert.assertNotNull(qName36);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale1);
        boolean boolean3 = jDOMNodePointer2.isAttribute();
        java.lang.String str4 = jDOMNodePointer2.asPath();
        java.lang.String str5 = jDOMNodePointer2.toString();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator7 = jDOMNodePointer2.attributeIterator(qName6);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = jDOMNodePointer2.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = jDOMNodePointer2.namespacePointer("");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = jDOMNodePointer2.namespacePointer("<<unknown namespace>>");
        org.apache.commons.jxpath.JXPathContext jXPathContext13 = null;
        org.w3c.dom.Node node14 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer17 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node14, locale15, "");
        int int18 = dOMNodePointer17.getIndex();
        dOMNodePointer17.setIndex((int) '4');
        java.lang.Object obj21 = dOMNodePointer17.clone();
        boolean boolean22 = dOMNodePointer17.isActual();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = nodePointer12.createPath(jXPathContext13, (java.lang.Object) dOMNodePointer17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot modify a namespace");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(nodeIterator7);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2147483648) + "'", int18 == (-2147483648));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "id('')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "id('')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "id('')");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) (-1.0f), locale3);
        nodePointer4.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = nodePointer4.createPath(jXPathContext7);
        boolean boolean9 = nodePointer8.isRoot();
        org.w3c.dom.Node node10 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer11 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer8, node10);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) dOMNodePointer11, locale12);
        boolean boolean14 = dOMNodePointer11.isActual();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = dOMNodePointer11.getImmediateParentPointer();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(nodePointer15);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1.0f), locale2);
        nodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.createPath(jXPathContext6);
        boolean boolean8 = nodePointer7.isRoot();
        org.w3c.dom.Node node9 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer7, node9);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale12);
        boolean boolean14 = jDOMNodePointer13.isAttribute();
        java.lang.String str15 = jDOMNodePointer13.asPath();
        java.lang.String str16 = jDOMNodePointer13.toString();
        org.apache.commons.jxpath.ri.QName qName17 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = jDOMNodePointer13.attributeIterator(qName17);
        boolean boolean19 = dOMNodePointer10.equals((java.lang.Object) jDOMNodePointer13);
        org.w3c.dom.Node node20 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer21 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer10, node20);
        boolean boolean22 = dOMNodePointer10.isCollection();
        boolean boolean23 = dOMNodePointer10.isCollection();
        java.lang.String str24 = dOMNodePointer10.getDefaultNamespaceURI();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer26 = dOMNodePointer10.namespacePointer("http://www.w3.org/2000/xmlns/");
        java.lang.String str27 = dOMNodePointer10.getLanguage();
        org.apache.commons.jxpath.JXPathContext jXPathContext28 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = dOMNodePointer10.createPath(jXPathContext28);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver30 = dOMNodePointer10.getNamespaceResolver();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(nodePointer26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertNull(namespaceResolver30);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale1);
        boolean boolean3 = jDOMNodePointer2.isAttribute();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = jDOMNodePointer2.namespacePointer("");
        java.lang.Object obj6 = jDOMNodePointer2.getImmediateNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName9, (java.lang.Object) (-1.0f), locale11);
        nodePointer12.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext15 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = nodePointer12.createPath(jXPathContext15);
        boolean boolean17 = nodePointer16.isRoot();
        org.w3c.dom.Node node18 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer19 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer16, node18);
        java.lang.String str20 = dOMNodePointer19.getLanguage();
        java.lang.String str22 = dOMNodePointer19.getNamespaceURI("http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj23 = dOMNodePointer19.getBaseValue();
        boolean boolean24 = dOMNodePointer19.isCollection();
        boolean boolean25 = dOMNodePointer19.isCollection();
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale27);
        java.lang.Object obj29 = jDOMNodePointer28.getBaseValue();
        boolean boolean30 = jDOMNodePointer28.isRoot();
        java.lang.String str31 = jDOMNodePointer28.toString();
        boolean boolean32 = dOMNodePointer19.equals((java.lang.Object) jDOMNodePointer28);
        boolean boolean33 = dOMNodePointer19.isAttribute();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = dOMNodePointer19.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator35 = jDOMNodePointer2.childIterator(nodeTest7, false, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer19);
        java.lang.Object obj36 = dOMNodePointer19.getNode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 10 + "'", obj6, (byte) 10);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 10 + "'", obj29, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(nodePointer34);
        org.junit.Assert.assertNotNull(nodeIterator35);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "");
        java.lang.Object obj4 = dOMNodePointer3.getRootNode();
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, qName5, (java.lang.Object) jDOMNodePointer8);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver11 = dOMNodePointer3.getNamespaceResolver();
        boolean boolean12 = dOMNodePointer3.isCollection();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = dOMNodePointer3.getValuePointer();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 10 + "'", obj9, (byte) 10);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNull(namespaceResolver11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodePointer13);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1), locale1, "http://www.w3.org/XML/1998/namespace");
        boolean boolean5 = jDOMNodePointer3.equals((java.lang.Object) 100.0f);
        org.w3c.dom.Node node6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node6, locale7, "hi!");
        boolean boolean10 = dOMNodePointer9.isCollection();
        boolean boolean11 = jDOMNodePointer3.equals((java.lang.Object) dOMNodePointer9);
        java.lang.Object obj12 = dOMNodePointer9.getImmediateNode();
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "hi!");
        java.lang.Object obj4 = dOMNodePointer3.clone();
        java.lang.String str5 = dOMNodePointer3.asPath();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName8, (java.lang.Object) (-1.0f), locale10);
        nodePointer11.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = nodePointer11.createPath(jXPathContext14);
        boolean boolean16 = nodePointer15.isRoot();
        org.w3c.dom.Node node17 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer18 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer15, node17);
        java.lang.String str19 = dOMNodePointer18.getLanguage();
        java.lang.String str21 = dOMNodePointer18.getNamespaceURI("http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj22 = dOMNodePointer18.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName23 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer26 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName23, (java.lang.Object) (-1.0f), locale25);
        nodePointer26.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext29 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = nodePointer26.createPath(jXPathContext29);
        java.lang.Class<?> wildcardClass31 = nodePointer26.getClass();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest32 = null;
        boolean boolean33 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer18, (java.lang.Object) nodePointer26, nodeTest32);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator34 = dOMNodePointer3.childIterator(nodeTest6, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = dOMNodePointer3.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "id('hi!')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "id('hi!')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "id('hi!')");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "id('hi!')" + "'", str5, "id('hi!')");
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(nodePointer26);
        org.junit.Assert.assertNotNull(nodePointer30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(nodeIterator34);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1.0f), locale2);
        nodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.createPath(jXPathContext6);
        boolean boolean8 = nodePointer7.isRoot();
        org.w3c.dom.Node node9 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer7, node9);
        java.lang.String str11 = dOMNodePointer10.getLanguage();
        java.lang.String str13 = dOMNodePointer10.getNamespaceURI("http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj14 = dOMNodePointer10.getBaseValue();
        boolean boolean15 = dOMNodePointer10.isCollection();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = dOMNodePointer10.namespacePointer("hi!");
        boolean boolean18 = dOMNodePointer10.isActual();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest19 = null;
        org.w3c.dom.Node node21 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer24 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node21, locale22, "");
        int int25 = dOMNodePointer24.getIndex();
        dOMNodePointer24.setIndex((int) '4');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = dOMNodePointer24.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator29 = dOMNodePointer10.childIterator(nodeTest19, false, nodePointer28);
        java.lang.String str30 = dOMNodePointer10.getLanguage();
        java.lang.String str31 = dOMNodePointer10.getDefaultNamespaceURI();
        org.w3c.dom.Node node32 = null;
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer35 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node32, locale33, "http://www.w3.org/2000/xmlns/");
        int int36 = dOMNodePointer35.getLength();
        java.lang.Object obj37 = dOMNodePointer35.getNodeValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer39 = dOMNodePointer35.namespacePointer("http://www.w3.org/2000/xmlns/");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer40 = dOMNodePointer35.getImmediateParentPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer41 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer10, (java.lang.Object) dOMNodePointer35);
        int int42 = jDOMNodePointer41.getLength();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2147483648) + "'", int25 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer28);
        org.junit.Assert.assertNotNull(nodeIterator29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(nodePointer39);
        org.junit.Assert.assertNull(nodePointer40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1), locale1, "http://www.w3.org/XML/1998/namespace");
        boolean boolean5 = jDOMNodePointer3.equals((java.lang.Object) 100.0f);
        org.w3c.dom.Node node6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node6, locale7, "hi!");
        boolean boolean10 = dOMNodePointer9.isCollection();
        boolean boolean11 = jDOMNodePointer3.equals((java.lang.Object) dOMNodePointer9);
        boolean boolean12 = dOMNodePointer9.isActual();
        boolean boolean13 = dOMNodePointer9.isActual();
        boolean boolean14 = dOMNodePointer9.isActual();
        java.lang.String str15 = dOMNodePointer9.getDefaultNamespaceURI();
        org.w3c.dom.Node node16 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer17 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer9, node16);
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale19);
        boolean boolean21 = jDOMNodePointer20.isAttribute();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = jDOMNodePointer20.namespacePointer("");
        java.lang.Object obj24 = jDOMNodePointer20.getImmediateNode();
        java.lang.Object obj25 = jDOMNodePointer20.getRootNode();
        boolean boolean26 = jDOMNodePointer20.isCollection();
        java.lang.Object obj27 = jDOMNodePointer20.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = jDOMNodePointer20.getImmediateValuePointer();
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer9.setValue((java.lang.Object) nodePointer28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (byte) 10 + "'", obj24, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 10 + "'", obj25, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (byte) 10 + "'", obj27, (byte) 10);
        org.junit.Assert.assertNotNull(nodePointer28);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1.0f), locale2);
        nodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.createPath(jXPathContext6);
        boolean boolean8 = nodePointer7.isRoot();
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName9, (java.lang.Object) (-1.0f), locale11);
        boolean boolean13 = nodePointer12.isContainer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver14 = null;
        nodePointer12.setNamespaceResolver(namespaceResolver14);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver16 = null;
        nodePointer12.setNamespaceResolver(namespaceResolver16);
        org.apache.commons.jxpath.JXPathContext jXPathContext18 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = nodePointer12.createPath(jXPathContext18);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(nodePointer7, (java.lang.Object) jXPathContext18);
        java.lang.Object obj21 = jDOMNodePointer20.clone();
        java.lang.Object obj22 = jDOMNodePointer20.getNodeValue();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver23 = jDOMNodePointer20.getNamespaceResolver();
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale25);
        java.lang.Object obj27 = jDOMNodePointer26.getValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator28 = jDOMNodePointer26.namespaceIterator();
        org.apache.commons.jxpath.ri.QName qName29 = null;
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName29, (java.lang.Object) (-1.0f), locale31);
        boolean boolean33 = nodePointer32.isContainer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver34 = null;
        nodePointer32.setNamespaceResolver(namespaceResolver34);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer26, (java.lang.Object) namespaceResolver34);
        org.apache.commons.jxpath.ri.QName qName37 = null;
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale39);
        boolean boolean41 = jDOMNodePointer40.isAttribute();
        java.lang.Object obj42 = jDOMNodePointer40.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer43 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer36, qName37, obj42);
        java.lang.Object obj44 = jDOMNodePointer36.clone();
        boolean boolean45 = jDOMNodePointer20.equals((java.lang.Object) jDOMNodePointer36);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest46 = null;
        boolean boolean47 = jDOMNodePointer20.testNode(nodeTest46);
        org.apache.commons.jxpath.ri.QName qName48 = null;
        java.util.Locale locale50 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer51 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName48, (java.lang.Object) (-1.0f), locale50);
        nodePointer51.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext54 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer55 = nodePointer51.createPath(jXPathContext54);
        boolean boolean56 = nodePointer55.isRoot();
        org.w3c.dom.Node node57 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer58 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer55, node57);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer59 = dOMNodePointer58.getImmediateParentPointer();
        java.lang.String str61 = dOMNodePointer58.getNamespaceURI("hi!");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer62 = dOMNodePointer58.getImmediateParentPointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest63 = null;
        boolean boolean64 = dOMNodePointer58.testNode(nodeTest63);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer65 = dOMNodePointer58.getImmediateValuePointer();
        java.lang.Object obj66 = dOMNodePointer58.getImmediateNode();
        boolean boolean67 = jDOMNodePointer20.equals(obj66);
        java.lang.Object obj68 = jDOMNodePointer20.getRootNode();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "-1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "-1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "-1");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(namespaceResolver23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(nodeIterator28);
        org.junit.Assert.assertNotNull(nodePointer32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) 10 + "'", obj42, (byte) 10);
        org.junit.Assert.assertNotNull(nodePointer43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(nodePointer51);
        org.junit.Assert.assertNotNull(nodePointer55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(nodePointer59);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(nodePointer62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(nodePointer65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + (-1.0f) + "'", obj68, (-1.0f));
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1), locale1, "http://www.w3.org/XML/1998/namespace");
        boolean boolean5 = jDOMNodePointer3.equals((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = jDOMNodePointer3.getImmediateValuePointer();
        int int7 = jDOMNodePointer3.getIndex();
        boolean boolean8 = jDOMNodePointer3.isLeaf();
        java.lang.Object obj9 = jDOMNodePointer3.getNodeValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2147483648) + "'", int7 == (-2147483648));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1) + "'", obj9, (-1));
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "hi!");
        java.lang.Object obj4 = dOMNodePointer3.clone();
        java.lang.String str6 = dOMNodePointer3.getNamespaceURI("http://www.w3.org/2000/xmlns/");
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName7, (java.lang.Object) (-1.0f), locale9);
        nodePointer10.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext13 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = nodePointer10.createPath(jXPathContext13);
        boolean boolean15 = nodePointer14.isRoot();
        org.w3c.dom.Node node16 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer17 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer14, node16);
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale19);
        boolean boolean21 = jDOMNodePointer20.isAttribute();
        java.lang.String str22 = jDOMNodePointer20.asPath();
        java.lang.String str23 = jDOMNodePointer20.toString();
        org.apache.commons.jxpath.ri.QName qName24 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator25 = jDOMNodePointer20.attributeIterator(qName24);
        boolean boolean26 = dOMNodePointer17.equals((java.lang.Object) jDOMNodePointer20);
        org.apache.commons.jxpath.ri.QName qName27 = null;
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName27, (java.lang.Object) (-1.0f), locale29);
        nodePointer30.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext33 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = nodePointer30.createPath(jXPathContext33);
        java.lang.Class<?> wildcardClass35 = nodePointer30.getClass();
        boolean boolean36 = dOMNodePointer17.equals((java.lang.Object) nodePointer30);
        boolean boolean37 = dOMNodePointer17.isCollection();
        boolean boolean38 = dOMNodePointer17.isAttribute();
        java.lang.String str39 = dOMNodePointer17.getLanguage();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, (java.lang.Object) dOMNodePointer17);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer41 = dOMNodePointer3.getValuePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest42 = null;
        boolean boolean43 = dOMNodePointer3.testNode(nodeTest42);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = dOMNodePointer3.isLeaf();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "id('hi!')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "id('hi!')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "id('hi!')");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(nodeIterator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodePointer30);
        org.junit.Assert.assertNotNull(nodePointer34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(nodePointer41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "");
        int int4 = dOMNodePointer3.getIndex();
        java.lang.String str6 = dOMNodePointer3.getNamespaceURI("");
        int int7 = dOMNodePointer3.getLength();
        java.lang.Object obj8 = dOMNodePointer3.getImmediateNode();
        java.lang.Object obj9 = dOMNodePointer3.getNodeValue();
        java.lang.Object obj10 = dOMNodePointer3.getNode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale1);
        boolean boolean3 = jDOMNodePointer2.isAttribute();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = jDOMNodePointer2.namespacePointer("");
        java.lang.Object obj6 = jDOMNodePointer2.getImmediateNode();
        org.w3c.dom.Node node7 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer8 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, node7);
        boolean boolean9 = dOMNodePointer8.isCollection();
        java.lang.Object obj10 = dOMNodePointer8.getImmediateNode();
        boolean boolean11 = dOMNodePointer8.isContainer();
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale13);
        java.lang.Object obj15 = jDOMNodePointer14.getValue();
        boolean boolean16 = jDOMNodePointer14.isCollection();
        java.lang.String str17 = jDOMNodePointer14.getNamespaceURI();
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName18, (java.lang.Object) (-1.0f), locale20);
        java.util.Locale locale22 = nodePointer21.getLocale();
        nodePointer21.setIndex((int) 'a');
        boolean boolean25 = nodePointer21.isRoot();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer26 = nodePointer21.getImmediateValuePointer();
        int int27 = jDOMNodePointer14.compareTo((java.lang.Object) nodePointer21);
        boolean boolean28 = jDOMNodePointer14.isRoot();
        org.apache.commons.jxpath.ri.QName qName29 = jDOMNodePointer14.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator30 = dOMNodePointer8.attributeIterator(qName29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 10 + "'", obj6, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertNull(locale22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(nodePointer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(qName29);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale1);
        java.lang.Object obj3 = jDOMNodePointer2.getValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator4 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName5, (java.lang.Object) (-1.0f), locale7);
        boolean boolean9 = nodePointer8.isContainer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver10 = null;
        nodePointer8.setNamespaceResolver(namespaceResolver10);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, (java.lang.Object) namespaceResolver10);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale15);
        boolean boolean17 = jDOMNodePointer16.isAttribute();
        java.lang.Object obj18 = jDOMNodePointer16.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer12, qName13, obj18);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = jDOMNodePointer12.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = jDOMNodePointer12.namespacePointer("");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest23 = null;
        boolean boolean24 = jDOMNodePointer12.testNode(nodeTest23);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest25 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale28);
        java.lang.Object obj30 = jDOMNodePointer29.getValue();
        boolean boolean31 = jDOMNodePointer29.isCollection();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator32 = jDOMNodePointer12.childIterator(nodeTest25, false, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer35 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer29, locale33, "");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest36 = null;
        boolean boolean37 = jDOMNodePointer35.testNode(nodeTest36);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(nodeIterator4);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 10 + "'", obj18, (byte) 10);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(nodeIterator32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) (-1.0f), locale3);
        nodePointer4.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = nodePointer4.createPath(jXPathContext7);
        boolean boolean9 = nodePointer8.isRoot();
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName10, (java.lang.Object) (-1.0f), locale12);
        boolean boolean14 = nodePointer13.isContainer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver15 = null;
        nodePointer13.setNamespaceResolver(namespaceResolver15);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver17 = null;
        nodePointer13.setNamespaceResolver(namespaceResolver17);
        org.apache.commons.jxpath.JXPathContext jXPathContext19 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = nodePointer13.createPath(jXPathContext19);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(nodePointer8, (java.lang.Object) jXPathContext19);
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) jXPathContext19, locale22);
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) locale22, locale24, "/namespace::");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest27 = null;
        org.w3c.dom.Node node29 = null;
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node29, locale30, "http://www.w3.org/2000/xmlns/");
        int int33 = dOMNodePointer32.getLength();
        java.lang.Object obj34 = dOMNodePointer32.getNodeValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = dOMNodePointer32.getImmediateValuePointer();
        java.lang.Object obj36 = nodePointer35.getNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = nodePointer35.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator38 = jDOMNodePointer26.childIterator(nodeTest27, true, nodePointer35);
        java.lang.String str40 = jDOMNodePointer26.getNamespaceURI("http://www.w3.org/XML/1998/namespace");
        boolean boolean41 = jDOMNodePointer26.isActual();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(nodePointer37);
        org.junit.Assert.assertNotNull(nodeIterator38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1.0f), locale2);
        nodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.createPath(jXPathContext6);
        boolean boolean8 = nodePointer7.isRoot();
        org.w3c.dom.Node node9 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer7, node9);
        java.lang.String str11 = dOMNodePointer10.getLanguage();
        java.lang.String str13 = dOMNodePointer10.getNamespaceURI("http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj14 = dOMNodePointer10.getBaseValue();
        boolean boolean15 = dOMNodePointer10.isCollection();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = dOMNodePointer10.namespacePointer("hi!");
        boolean boolean18 = dOMNodePointer10.isActual();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest19 = null;
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName21, (java.lang.Object) (-1.0f), locale23);
        nodePointer24.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext27 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = nodePointer24.createPath(jXPathContext27);
        boolean boolean29 = nodePointer28.isRoot();
        org.w3c.dom.Node node30 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer31 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer28, node30);
        java.lang.String str32 = dOMNodePointer31.getLanguage();
        java.lang.String str34 = dOMNodePointer31.getNamespaceURI("http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj35 = dOMNodePointer31.getImmediateNode();
        boolean boolean36 = dOMNodePointer31.isCollection();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator37 = dOMNodePointer10.childIterator(nodeTest19, false, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer31);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest38 = null;
        org.apache.commons.jxpath.ri.QName qName40 = null;
        java.util.Locale locale42 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer43 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale42);
        java.lang.Object obj44 = jDOMNodePointer43.getValue();
        boolean boolean45 = jDOMNodePointer43.isCollection();
        java.util.Locale locale46 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer47 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName40, (java.lang.Object) jDOMNodePointer43, locale46);
        java.lang.String str48 = jDOMNodePointer43.asPath();
        java.lang.String str49 = jDOMNodePointer43.getNamespaceURI();
        org.apache.commons.jxpath.JXPathContext jXPathContext50 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer51 = jDOMNodePointer43.createPath(jXPathContext50);
        java.lang.String str53 = jDOMNodePointer43.getNamespaceURI("id('')");
        java.util.Locale locale54 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer56 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) str53, locale54, "http://www.w3.org/2000/xmlns/");
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator57 = dOMNodePointer10.childIterator(nodeTest38, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer56);
        boolean boolean58 = dOMNodePointer10.isActual();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertNotNull(nodePointer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(nodeIterator37);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(nodePointer47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(nodePointer51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(nodeIterator57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1.0f), locale2);
        nodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.createPath(jXPathContext6);
        boolean boolean8 = nodePointer7.isRoot();
        org.w3c.dom.Node node9 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer7, node9);
        java.lang.String str11 = dOMNodePointer10.getLanguage();
        java.lang.String str13 = dOMNodePointer10.getNamespaceURI("http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj14 = dOMNodePointer10.getBaseValue();
        boolean boolean15 = dOMNodePointer10.isCollection();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = dOMNodePointer10.namespacePointer("hi!");
        boolean boolean18 = dOMNodePointer10.isActual();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest19 = null;
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName21, (java.lang.Object) (-1.0f), locale23);
        nodePointer24.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext27 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = nodePointer24.createPath(jXPathContext27);
        boolean boolean29 = nodePointer28.isRoot();
        org.w3c.dom.Node node30 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer31 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer28, node30);
        java.lang.String str32 = dOMNodePointer31.getLanguage();
        java.lang.String str34 = dOMNodePointer31.getNamespaceURI("http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj35 = dOMNodePointer31.getImmediateNode();
        boolean boolean36 = dOMNodePointer31.isCollection();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator37 = dOMNodePointer10.childIterator(nodeTest19, false, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer31);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest38 = null;
        org.apache.commons.jxpath.ri.QName qName40 = null;
        java.util.Locale locale42 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer43 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale42);
        java.lang.Object obj44 = jDOMNodePointer43.getValue();
        boolean boolean45 = jDOMNodePointer43.isCollection();
        java.util.Locale locale46 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer47 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName40, (java.lang.Object) jDOMNodePointer43, locale46);
        java.lang.String str48 = jDOMNodePointer43.asPath();
        java.lang.String str49 = jDOMNodePointer43.getNamespaceURI();
        org.apache.commons.jxpath.JXPathContext jXPathContext50 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer51 = jDOMNodePointer43.createPath(jXPathContext50);
        java.lang.String str53 = jDOMNodePointer43.getNamespaceURI("id('')");
        java.util.Locale locale54 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer56 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) str53, locale54, "http://www.w3.org/2000/xmlns/");
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator57 = dOMNodePointer10.childIterator(nodeTest38, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer56);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver58 = null;
        jDOMNodePointer56.setNamespaceResolver(namespaceResolver58);
        java.util.Locale locale61 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer62 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale61);
        java.lang.Object obj63 = jDOMNodePointer62.getBaseValue();
        java.util.Locale locale64 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer65 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer62, locale64);
        org.apache.commons.jxpath.JXPathContext jXPathContext66 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer67 = jDOMNodePointer62.createPath(jXPathContext66);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer68 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer56, (java.lang.Object) jDOMNodePointer62);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertNotNull(nodePointer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(nodeIterator37);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(nodePointer47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(nodePointer51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(nodeIterator57);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + (byte) 10 + "'", obj63, (byte) 10);
        org.junit.Assert.assertNotNull(nodePointer67);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale1);
        java.lang.String str3 = jDOMNodePointer2.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = jDOMNodePointer2.namespacePointer("-1");
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodePointer5, locale6);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        boolean boolean9 = jDOMNodePointer7.testNode(nodeTest8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "");
        java.lang.Object obj4 = dOMNodePointer3.getRootNode();
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, qName5, (java.lang.Object) jDOMNodePointer8);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver11 = dOMNodePointer3.getNamespaceResolver();
        java.lang.Object obj12 = dOMNodePointer3.getRootNode();
        boolean boolean13 = dOMNodePointer3.isActual();
        java.lang.String str14 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName((java.lang.Object) boolean13);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 10 + "'", obj9, (byte) 10);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNull(namespaceResolver11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "");
        java.lang.Object obj4 = dOMNodePointer3.getRootNode();
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, qName5, (java.lang.Object) jDOMNodePointer8);
        boolean boolean11 = jDOMNodePointer8.isCollection();
        java.lang.Object obj12 = jDOMNodePointer8.clone();
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale14);
        boolean boolean16 = jDOMNodePointer15.isLeaf();
        boolean boolean17 = jDOMNodePointer15.isActual();
        jDOMNodePointer15.setAttribute(false);
        java.lang.Object obj20 = jDOMNodePointer15.getImmediateNode();
        java.lang.Object obj21 = jDOMNodePointer15.getNode();
        java.lang.String str23 = jDOMNodePointer15.getNamespaceURI("-1");
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale25);
        java.lang.Object obj27 = jDOMNodePointer26.getValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator28 = jDOMNodePointer26.namespaceIterator();
        org.apache.commons.jxpath.ri.QName qName29 = null;
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName29, (java.lang.Object) (-1.0f), locale31);
        boolean boolean33 = nodePointer32.isContainer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver34 = null;
        nodePointer32.setNamespaceResolver(namespaceResolver34);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer26, (java.lang.Object) namespaceResolver34);
        org.apache.commons.jxpath.ri.QName qName37 = null;
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale39);
        boolean boolean41 = jDOMNodePointer40.isAttribute();
        java.lang.Object obj42 = jDOMNodePointer40.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer43 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer36, qName37, obj42);
        int int44 = jDOMNodePointer8.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer15, nodePointer43);
        int int45 = jDOMNodePointer8.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer46 = jDOMNodePointer8.getValuePointer();
        java.lang.Object obj47 = nodePointer46.getRootNode();
        org.w3c.dom.Node node48 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer49 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer46, node48);
        org.apache.commons.jxpath.JXPathContext jXPathContext50 = null;
        java.util.Locale locale52 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer53 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale52);
        java.lang.Object obj54 = jDOMNodePointer53.getBaseValue();
        boolean boolean55 = jDOMNodePointer53.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest56 = null;
        java.util.Locale locale59 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer60 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale59);
        boolean boolean61 = jDOMNodePointer60.isAttribute();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer63 = jDOMNodePointer60.namespacePointer("");
        java.lang.Object obj64 = jDOMNodePointer60.getImmediateNode();
        org.w3c.dom.Node node65 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer66 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer60, node65);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator67 = jDOMNodePointer53.childIterator(nodeTest56, false, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer60);
        org.apache.commons.jxpath.ri.QName qName68 = jDOMNodePointer53.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer70 = dOMNodePointer49.createChild(jXPathContext50, qName68, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 10 + "'", obj9, (byte) 10);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (byte) 10 + "'", obj20, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (byte) 10 + "'", obj21, (byte) 10);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(nodeIterator28);
        org.junit.Assert.assertNotNull(nodePointer32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (byte) 10 + "'", obj42, (byte) 10);
        org.junit.Assert.assertNotNull(nodePointer43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(nodePointer46);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (byte) 10 + "'", obj47, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (byte) 10 + "'", obj54, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(nodePointer63);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + (byte) 10 + "'", obj64, (byte) 10);
        org.junit.Assert.assertNotNull(nodeIterator67);
        org.junit.Assert.assertNotNull(qName68);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "-1");
        java.lang.String str4 = dOMNodePointer3.getLanguage();
        org.w3c.dom.Node node5 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer6 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, node5);
        java.lang.String str7 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix((java.lang.Object) dOMNodePointer6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dOMNodePointer6.getNamespaceURI();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "");
        java.lang.Object obj4 = dOMNodePointer3.getRootNode();
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, qName5, (java.lang.Object) jDOMNodePointer8);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver11 = dOMNodePointer3.getNamespaceResolver();
        boolean boolean12 = dOMNodePointer3.isCollection();
        int int13 = dOMNodePointer3.getLength();
        boolean boolean14 = dOMNodePointer3.isActual();
        org.w3c.dom.Node node15 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer16 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, node15);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 10 + "'", obj9, (byte) 10);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNull(namespaceResolver11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1.0f), locale2);
        nodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.createPath(jXPathContext6);
        boolean boolean8 = nodePointer7.isRoot();
        org.w3c.dom.Node node9 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer7, node9);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale12);
        boolean boolean14 = jDOMNodePointer13.isAttribute();
        java.lang.String str15 = jDOMNodePointer13.asPath();
        java.lang.String str16 = jDOMNodePointer13.toString();
        org.apache.commons.jxpath.ri.QName qName17 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = jDOMNodePointer13.attributeIterator(qName17);
        boolean boolean19 = dOMNodePointer10.equals((java.lang.Object) jDOMNodePointer13);
        org.w3c.dom.Node node20 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer21 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer10, node20);
        int int22 = dOMNodePointer21.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = dOMNodePointer21.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest24 = null;
        org.apache.commons.jxpath.ri.QName qName26 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName26, (java.lang.Object) (-1.0f), locale28);
        nodePointer29.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext32 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = nodePointer29.createPath(jXPathContext32);
        boolean boolean34 = nodePointer33.isRoot();
        org.w3c.dom.Node node35 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer36 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer33, node35);
        boolean boolean37 = dOMNodePointer36.isCollection();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator38 = dOMNodePointer21.childIterator(nodeTest24, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer36);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer39 = dOMNodePointer36.getValuePointer();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertNotNull(nodePointer33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(nodeIterator38);
        org.junit.Assert.assertNotNull(nodePointer39);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale1);
        java.lang.Object obj3 = jDOMNodePointer2.getBaseValue();
        boolean boolean4 = jDOMNodePointer2.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale8);
        boolean boolean10 = jDOMNodePointer9.isAttribute();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = jDOMNodePointer9.namespacePointer("");
        java.lang.Object obj13 = jDOMNodePointer9.getImmediateNode();
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer9, node14);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator16 = jDOMNodePointer2.childIterator(nodeTest5, false, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer9);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        org.w3c.dom.Node node19 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer22 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node19, locale20, "");
        int int23 = dOMNodePointer22.getIndex();
        dOMNodePointer22.setIndex((int) '4');
        dOMNodePointer22.setIndex((int) (byte) 1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator28 = jDOMNodePointer9.childIterator(nodeTest17, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer22);
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1), locale30, "http://www.w3.org/XML/1998/namespace");
        boolean boolean34 = jDOMNodePointer32.equals((java.lang.Object) 100.0f);
        org.w3c.dom.Node node35 = null;
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer38 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node35, locale36, "hi!");
        boolean boolean39 = dOMNodePointer38.isCollection();
        boolean boolean40 = jDOMNodePointer32.equals((java.lang.Object) dOMNodePointer38);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = dOMNodePointer38.namespacePointer("<<unknown namespace>>");
        org.apache.commons.jxpath.ri.QName qName43 = null;
        java.util.Locale locale45 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer46 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName43, (java.lang.Object) (-1.0f), locale45);
        nodePointer46.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext49 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer50 = nodePointer46.createPath(jXPathContext49);
        boolean boolean51 = nodePointer50.isRoot();
        org.w3c.dom.Node node52 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer53 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer50, node52);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer54 = dOMNodePointer53.getImmediateParentPointer();
        int int55 = dOMNodePointer53.getLength();
        org.w3c.dom.Node node56 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer57 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer53, node56);
        int int58 = dOMNodePointer22.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer38, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer53);
        java.util.Locale locale60 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer61 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale60);
        java.lang.Object obj62 = jDOMNodePointer61.getValue();
        org.apache.commons.jxpath.ri.QName qName63 = null;
        java.util.Locale locale65 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer66 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale65);
        java.lang.Object obj67 = jDOMNodePointer66.getValue();
        boolean boolean68 = jDOMNodePointer66.isCollection();
        java.util.Locale locale69 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer70 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName63, (java.lang.Object) jDOMNodePointer66, locale69);
        int int71 = jDOMNodePointer61.compareTo((java.lang.Object) jDOMNodePointer66);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer72 = jDOMNodePointer61.getParent();
        org.apache.commons.jxpath.ri.QName qName73 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator74 = jDOMNodePointer61.attributeIterator(qName73);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer75 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer38, (java.lang.Object) nodeIterator74);
        dOMNodePointer38.printPointerChain();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean77 = dOMNodePointer38.isLeaf();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (byte) 10 + "'", obj3, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (byte) 10 + "'", obj13, (byte) 10);
        org.junit.Assert.assertNotNull(nodeIterator16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-2147483648) + "'", int23 == (-2147483648));
        org.junit.Assert.assertNotNull(nodeIterator28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(nodePointer42);
        org.junit.Assert.assertNotNull(nodePointer46);
        org.junit.Assert.assertNotNull(nodePointer50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(nodePointer54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(nodePointer70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(nodePointer72);
        org.junit.Assert.assertNotNull(nodeIterator74);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1.0f), locale2);
        nodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.createPath(jXPathContext6);
        boolean boolean8 = nodePointer7.isRoot();
        org.w3c.dom.Node node9 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer7, node9);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale12);
        boolean boolean14 = jDOMNodePointer13.isAttribute();
        java.lang.String str15 = jDOMNodePointer13.asPath();
        java.lang.String str16 = jDOMNodePointer13.toString();
        org.apache.commons.jxpath.ri.QName qName17 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = jDOMNodePointer13.attributeIterator(qName17);
        boolean boolean19 = dOMNodePointer10.equals((java.lang.Object) jDOMNodePointer13);
        org.w3c.dom.Node node20 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer21 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer10, node20);
        boolean boolean22 = dOMNodePointer10.isCollection();
        boolean boolean23 = dOMNodePointer10.isCollection();
        java.lang.String str24 = dOMNodePointer10.getDefaultNamespaceURI();
        org.w3c.dom.Node node25 = null;
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer28 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node25, locale26, "");
        java.lang.Object obj29 = dOMNodePointer28.getRootNode();
        org.apache.commons.jxpath.ri.QName qName30 = null;
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer33 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale32);
        java.lang.Object obj34 = jDOMNodePointer33.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer28, qName30, (java.lang.Object) jDOMNodePointer33);
        java.util.Locale locale36 = dOMNodePointer28.getLocale();
        java.util.Locale locale38 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer39 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale38);
        boolean boolean40 = jDOMNodePointer39.isLeaf();
        boolean boolean41 = jDOMNodePointer39.isActual();
        jDOMNodePointer39.setAttribute(false);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest44 = null;
        boolean boolean45 = jDOMNodePointer39.testNode(nodeTest44);
        boolean boolean46 = dOMNodePointer28.equals((java.lang.Object) jDOMNodePointer39);
        java.lang.String str48 = jDOMNodePointer39.getNamespaceURI("id('')");
        boolean boolean49 = dOMNodePointer10.equals((java.lang.Object) str48);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver50 = dOMNodePointer10.getNamespaceResolver();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) 10 + "'", obj34, (byte) 10);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertNull(locale36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(namespaceResolver50);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale1);
        java.lang.Object obj3 = jDOMNodePointer2.getValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator4 = jDOMNodePointer2.namespaceIterator();
        java.util.Locale locale5 = jDOMNodePointer2.getLocale();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) (-1.0f), locale8);
        nodePointer9.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer9.createPath(jXPathContext12);
        boolean boolean14 = nodePointer13.isRoot();
        org.w3c.dom.Node node15 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer16 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer13, node15);
        boolean boolean17 = jDOMNodePointer2.equals((java.lang.Object) node15);
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) boolean17, locale18);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = jDOMNodePointer19.namespacePointer("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(nodeIterator4);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodePointer21);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "hi!");
        java.lang.Object obj4 = dOMNodePointer3.clone();
        java.lang.String str5 = dOMNodePointer3.asPath();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        org.apache.commons.jxpath.ri.QName qName8 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName8, (java.lang.Object) (-1.0f), locale10);
        nodePointer11.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = nodePointer11.createPath(jXPathContext14);
        boolean boolean16 = nodePointer15.isRoot();
        org.w3c.dom.Node node17 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer18 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer15, node17);
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale20);
        boolean boolean22 = jDOMNodePointer21.isAttribute();
        java.lang.String str23 = jDOMNodePointer21.asPath();
        java.lang.String str24 = jDOMNodePointer21.toString();
        org.apache.commons.jxpath.ri.QName qName25 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer21.attributeIterator(qName25);
        boolean boolean27 = dOMNodePointer18.equals((java.lang.Object) jDOMNodePointer21);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator28 = dOMNodePointer3.childIterator(nodeTest6, false, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = dOMNodePointer3.isLeaf();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "id('hi!')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "id('hi!')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "id('hi!')");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "id('hi!')" + "'", str5, "id('hi!')");
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(nodeIterator28);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1.0f), locale2);
        java.util.Locale locale4 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1.0f), locale4);
        java.lang.String str6 = jDOMNodePointer5.toString();
        boolean boolean7 = jDOMNodePointer5.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName10, (java.lang.Object) (-1.0f), locale12);
        nodePointer13.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext16 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = nodePointer13.createPath(jXPathContext16);
        boolean boolean18 = nodePointer17.isRoot();
        org.w3c.dom.Node node19 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer20 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer17, node19);
        java.lang.String str21 = dOMNodePointer20.getLanguage();
        java.lang.String str23 = dOMNodePointer20.getNamespaceURI("http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj24 = dOMNodePointer20.getImmediateNode();
        boolean boolean25 = dOMNodePointer20.isCollection();
        boolean boolean26 = dOMNodePointer20.isCollection();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator27 = jDOMNodePointer5.childIterator(nodeTest8, false, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer20);
        boolean boolean28 = dOMNodePointer20.isCollection();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = dOMNodePointer20.getValuePointer();
        java.lang.Object obj30 = null;
        boolean boolean31 = dOMNodePointer20.equals(obj30);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeIterator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "hi!");
        boolean boolean4 = dOMNodePointer3.isCollection();
        org.w3c.dom.Node node5 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer8 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node5, locale6, "hi!");
        boolean boolean9 = dOMNodePointer3.equals((java.lang.Object) dOMNodePointer8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName10, (java.lang.Object) (-1.0f), locale12);
        nodePointer13.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext16 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = nodePointer13.createPath(jXPathContext16);
        boolean boolean18 = nodePointer17.isRoot();
        org.w3c.dom.Node node19 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer20 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer17, node19);
        java.lang.String str21 = dOMNodePointer20.getLanguage();
        java.lang.String str23 = dOMNodePointer20.getNamespaceURI("http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj24 = dOMNodePointer20.getBaseValue();
        boolean boolean25 = dOMNodePointer20.isCollection();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = dOMNodePointer20.namespacePointer("hi!");
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, (java.lang.Object) "hi!");
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1), locale30, "http://www.w3.org/XML/1998/namespace");
        boolean boolean34 = jDOMNodePointer32.equals((java.lang.Object) 100.0f);
        org.w3c.dom.Node node35 = null;
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer38 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node35, locale36, "hi!");
        boolean boolean39 = dOMNodePointer38.isCollection();
        boolean boolean40 = jDOMNodePointer32.equals((java.lang.Object) dOMNodePointer38);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = dOMNodePointer38.namespacePointer("<<unknown namespace>>");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest43 = null;
        boolean boolean44 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer28, (java.lang.Object) dOMNodePointer38, nodeTest43);
        boolean boolean45 = jDOMNodePointer28.isCollection();
        java.lang.Object obj46 = jDOMNodePointer28.getImmediateNode();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(nodePointer42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + "hi!" + "'", obj46, "hi!");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale1);
        java.lang.Object obj3 = jDOMNodePointer2.getValue();
        boolean boolean4 = jDOMNodePointer2.isCollection();
        java.lang.String str5 = jDOMNodePointer2.getNamespaceURI();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) (-1.0f), locale8);
        java.util.Locale locale10 = nodePointer9.getLocale();
        nodePointer9.setIndex((int) 'a');
        boolean boolean13 = nodePointer9.isRoot();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = nodePointer9.getImmediateValuePointer();
        int int15 = jDOMNodePointer2.compareTo((java.lang.Object) nodePointer9);
        java.util.Locale locale16 = jDOMNodePointer2.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = jDOMNodePointer2.getParent();
        java.lang.Object obj18 = jDOMNodePointer2.getValue();
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(obj18, locale19, "id('http://www.w3.org/2000/xmlns/')");
        jDOMNodePointer21.printPointerChain();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertNull(nodePointer17);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1.0f), locale2);
        nodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.createPath(jXPathContext6);
        boolean boolean8 = nodePointer7.isRoot();
        org.w3c.dom.Node node9 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer7, node9);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale12);
        boolean boolean14 = jDOMNodePointer13.isAttribute();
        java.lang.String str15 = jDOMNodePointer13.asPath();
        java.lang.String str16 = jDOMNodePointer13.toString();
        org.apache.commons.jxpath.ri.QName qName17 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = jDOMNodePointer13.attributeIterator(qName17);
        boolean boolean19 = dOMNodePointer10.equals((java.lang.Object) jDOMNodePointer13);
        boolean boolean20 = jDOMNodePointer13.isRoot();
        java.lang.String str21 = jDOMNodePointer13.getNamespaceURI();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest22 = null;
        org.apache.commons.jxpath.ri.QName qName24 = null;
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName24, (java.lang.Object) (-1.0f), locale26);
        nodePointer27.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext30 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = nodePointer27.createPath(jXPathContext30);
        boolean boolean32 = nodePointer31.isRoot();
        org.w3c.dom.Node node33 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer34 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer31, node33);
        java.lang.String str35 = dOMNodePointer34.getLanguage();
        java.lang.String str37 = dOMNodePointer34.getNamespaceURI("http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj38 = dOMNodePointer34.getBaseValue();
        boolean boolean39 = dOMNodePointer34.isCollection();
        boolean boolean40 = dOMNodePointer34.isCollection();
        boolean boolean41 = dOMNodePointer34.isNode();
        java.lang.String str42 = dOMNodePointer34.getDefaultNamespaceURI();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer43 = dOMNodePointer34.getImmediateParentPointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer44 = dOMNodePointer34.getValuePointer();
        java.lang.String str45 = dOMNodePointer34.getLanguage();
        java.lang.Object obj46 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer47 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer34, obj46);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator48 = jDOMNodePointer13.childIterator(nodeTest22, false, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer34);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertNotNull(nodePointer31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(nodePointer43);
        org.junit.Assert.assertNotNull(nodePointer44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(nodeIterator48);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale1, "");
        java.util.Locale locale4 = jDOMNodePointer3.getLocale();
        boolean boolean5 = jDOMNodePointer3.isContainer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = jDOMNodePointer3.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver7 = null;
        nodePointer6.setNamespaceResolver(namespaceResolver7);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodePointer6);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1.0f), locale2);
        nodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.createPath(jXPathContext6);
        boolean boolean8 = nodePointer7.isRoot();
        org.w3c.dom.Node node9 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer7, node9);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale12);
        boolean boolean14 = jDOMNodePointer13.isAttribute();
        java.lang.String str15 = jDOMNodePointer13.asPath();
        java.lang.String str16 = jDOMNodePointer13.toString();
        org.apache.commons.jxpath.ri.QName qName17 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = jDOMNodePointer13.attributeIterator(qName17);
        boolean boolean19 = dOMNodePointer10.equals((java.lang.Object) jDOMNodePointer13);
        org.w3c.dom.Node node20 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer21 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer10, node20);
        boolean boolean22 = dOMNodePointer10.isCollection();
        boolean boolean23 = dOMNodePointer10.isCollection();
        org.w3c.dom.Node node24 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node24, locale25, "<<unknown namespace>>");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest28 = null;
        org.apache.commons.jxpath.ri.QName qName30 = null;
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName30, (java.lang.Object) (-1.0f), locale32);
        nodePointer33.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext36 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = nodePointer33.createPath(jXPathContext36);
        boolean boolean38 = nodePointer37.isRoot();
        org.w3c.dom.Node node39 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer40 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer37, node39);
        boolean boolean41 = dOMNodePointer40.isCollection();
        java.lang.Object obj42 = dOMNodePointer40.getRootNode();
        java.lang.Object obj43 = dOMNodePointer40.getBaseValue();
        java.lang.String str45 = dOMNodePointer40.getNamespaceURI("-1");
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator46 = dOMNodePointer27.childIterator(nodeTest28, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer40);
        org.w3c.dom.Node node47 = null;
        java.util.Locale locale48 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer50 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node47, locale48, "hi!");
        java.lang.Object obj51 = dOMNodePointer50.clone();
        java.lang.String str52 = dOMNodePointer50.asPath();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest53 = null;
        org.apache.commons.jxpath.ri.QName qName55 = null;
        java.util.Locale locale57 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer58 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName55, (java.lang.Object) (-1.0f), locale57);
        nodePointer58.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext61 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer62 = nodePointer58.createPath(jXPathContext61);
        boolean boolean63 = nodePointer62.isRoot();
        org.w3c.dom.Node node64 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer65 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer62, node64);
        java.util.Locale locale67 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer68 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale67);
        boolean boolean69 = jDOMNodePointer68.isAttribute();
        java.lang.String str70 = jDOMNodePointer68.asPath();
        java.lang.String str71 = jDOMNodePointer68.toString();
        org.apache.commons.jxpath.ri.QName qName72 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator73 = jDOMNodePointer68.attributeIterator(qName72);
        boolean boolean74 = dOMNodePointer65.equals((java.lang.Object) jDOMNodePointer68);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator75 = dOMNodePointer50.childIterator(nodeTest53, false, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer65);
        org.w3c.dom.Node node76 = null;
        java.util.Locale locale77 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer79 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node76, locale77, "");
        int int80 = dOMNodePointer79.getIndex();
        dOMNodePointer79.setIndex((int) '4');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer83 = dOMNodePointer79.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest84 = null;
        boolean boolean85 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer65, (java.lang.Object) nodePointer83, nodeTest84);
        int int86 = dOMNodePointer65.getLength();
        boolean boolean87 = dOMNodePointer65.isActual();
        int int88 = dOMNodePointer10.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer40, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer65);
        java.lang.Object obj89 = dOMNodePointer40.getBaseValue();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodePointer33);
        org.junit.Assert.assertNotNull(nodePointer37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (-1.0f) + "'", obj42, (-1.0f));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(nodeIterator46);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "id('hi!')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "id('hi!')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "id('hi!')");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "id('hi!')" + "'", str52, "id('hi!')");
        org.junit.Assert.assertNotNull(nodePointer58);
        org.junit.Assert.assertNotNull(nodePointer62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(nodeIterator73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(nodeIterator75);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-2147483648) + "'", int80 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNull(obj89);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale2);
        java.lang.Object obj4 = jDOMNodePointer3.getValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator5 = jDOMNodePointer3.namespaceIterator();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) (-1.0f), locale8);
        boolean boolean10 = nodePointer9.isContainer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver11 = null;
        nodePointer9.setNamespaceResolver(namespaceResolver11);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, (java.lang.Object) namespaceResolver11);
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) jDOMNodePointer13, locale14);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = jDOMNodePointer13.namespacePointer("id('hi!')");
        java.lang.String str18 = jDOMNodePointer13.asPath();
        boolean boolean19 = jDOMNodePointer13.isLeaf();
        java.lang.Object obj20 = jDOMNodePointer13.getNodeValue();
        boolean boolean21 = jDOMNodePointer13.isContainer();
        org.apache.commons.jxpath.ri.QName qName22 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName22, (java.lang.Object) (-1.0f), locale24);
        nodePointer25.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext28 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = nodePointer25.createPath(jXPathContext28);
        boolean boolean30 = nodePointer29.isRoot();
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer29, node31);
        java.lang.String str33 = dOMNodePointer32.getLanguage();
        java.lang.String str35 = dOMNodePointer32.getNamespaceURI("http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj36 = dOMNodePointer32.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = dOMNodePointer32.getParent();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest38 = null;
        boolean boolean39 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13, (java.lang.Object) nodePointer37, nodeTest38);
        org.w3c.dom.Node node40 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer43 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node40, locale41, "hi!");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver44 = dOMNodePointer43.getNamespaceResolver();
        java.lang.Object obj45 = dOMNodePointer43.clone();
        java.lang.Object obj46 = dOMNodePointer43.getBaseValue();
        java.util.Locale locale48 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer49 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) '#', locale48);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer50 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer43, (java.lang.Object) '#');
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer51 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(nodePointer37, (java.lang.Object) '#');
        java.util.Locale locale52 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer54 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) '#', locale52, "id('http://www.w3.org/XML/1998/namespace')");
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer57 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) locale52, locale55, "id('')");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(nodeIterator5);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodePointer25);
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(nodePointer37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(namespaceResolver44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "id('hi!')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "id('hi!')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "id('hi!')");
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale1);
        java.lang.Object obj3 = jDOMNodePointer2.getValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator4 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName5, (java.lang.Object) (-1.0f), locale7);
        boolean boolean9 = nodePointer8.isContainer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver10 = null;
        nodePointer8.setNamespaceResolver(namespaceResolver10);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, (java.lang.Object) namespaceResolver10);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale15);
        boolean boolean17 = jDOMNodePointer16.isAttribute();
        java.lang.Object obj18 = jDOMNodePointer16.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer12, qName13, obj18);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = jDOMNodePointer12.getValuePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest21 = null;
        boolean boolean22 = jDOMNodePointer12.testNode(nodeTest21);
        org.w3c.dom.Node node23 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer26 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node23, locale24, "");
        int int27 = dOMNodePointer26.getIndex();
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer30 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale29);
        boolean boolean31 = jDOMNodePointer30.isCollection();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = jDOMNodePointer30.namespacePointer("");
        int int34 = jDOMNodePointer12.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer26, nodePointer33);
        java.lang.Object obj35 = dOMNodePointer26.getBaseValue();
        java.lang.String str36 = dOMNodePointer26.getLanguage();
        boolean boolean37 = dOMNodePointer26.isActual();
        java.lang.Object obj38 = new java.lang.Object();
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer41 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(obj38, locale39, "http://www.w3.org/XML/1998/namespace");
        java.util.Locale locale43 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer45 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1), locale43, "http://www.w3.org/XML/1998/namespace");
        boolean boolean47 = jDOMNodePointer45.equals((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer48 = jDOMNodePointer45.getImmediateValuePointer();
        int int49 = jDOMNodePointer45.getIndex();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer51 = jDOMNodePointer45.namespacePointer("hi!");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer52 = nodePointer51.getImmediateParentPointer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver53 = null;
        nodePointer52.setNamespaceResolver(namespaceResolver53);
        org.w3c.dom.Node node55 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer56 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer52, node55);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer57 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer41, (java.lang.Object) nodePointer52);
        java.lang.Object obj58 = jDOMNodePointer41.getBaseValue();
        java.util.Locale locale60 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer61 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale60);
        java.lang.Object obj62 = jDOMNodePointer61.getValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator63 = jDOMNodePointer61.namespaceIterator();
        org.apache.commons.jxpath.ri.QName qName64 = null;
        java.util.Locale locale66 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer67 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName64, (java.lang.Object) (-1.0f), locale66);
        boolean boolean68 = nodePointer67.isContainer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver69 = null;
        nodePointer67.setNamespaceResolver(namespaceResolver69);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer71 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer61, (java.lang.Object) namespaceResolver69);
        org.apache.commons.jxpath.ri.QName qName72 = null;
        java.util.Locale locale74 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer75 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale74);
        boolean boolean76 = jDOMNodePointer75.isAttribute();
        java.lang.Object obj77 = jDOMNodePointer75.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer78 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer71, qName72, obj77);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer79 = jDOMNodePointer71.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer81 = jDOMNodePointer71.namespacePointer("");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest82 = null;
        boolean boolean83 = jDOMNodePointer71.testNode(nodeTest82);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest84 = null;
        java.util.Locale locale87 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer88 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale87);
        java.lang.Object obj89 = jDOMNodePointer88.getValue();
        boolean boolean90 = jDOMNodePointer88.isCollection();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator91 = jDOMNodePointer71.childIterator(nodeTest84, false, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer88);
        java.util.Locale locale92 = jDOMNodePointer71.getLocale();
        java.lang.String str94 = jDOMNodePointer71.getNamespaceURI("id('http://www.w3.org/XML/1998/namespace')");
        org.w3c.dom.Node node95 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer96 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer71, node95);
        // The following exception was thrown during execution in test generation
        try {
            int int97 = dOMNodePointer26.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer41, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer71);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Object cannot be cast to class org.w3c.dom.Node (java.lang.Object is in module java.base of loader 'bootstrap'; org.w3c.dom.Node is in module java.xml of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(nodeIterator4);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 10 + "'", obj18, (byte) 10);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2147483648) + "'", int27 == (-2147483648));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(nodePointer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(nodePointer48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-2147483648) + "'", int49 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer51);
        org.junit.Assert.assertNotNull(nodePointer52);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(nodeIterator63);
        org.junit.Assert.assertNotNull(nodePointer67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + (byte) 10 + "'", obj77, (byte) 10);
        org.junit.Assert.assertNotNull(nodePointer78);
        org.junit.Assert.assertNotNull(nodePointer79);
        org.junit.Assert.assertNotNull(nodePointer81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(nodeIterator91);
        org.junit.Assert.assertNull(locale92);
        org.junit.Assert.assertNull(str94);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1.0f), locale2);
        nodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.createPath(jXPathContext6);
        boolean boolean8 = nodePointer7.isRoot();
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName9, (java.lang.Object) (-1.0f), locale11);
        boolean boolean13 = nodePointer12.isContainer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver14 = null;
        nodePointer12.setNamespaceResolver(namespaceResolver14);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver16 = null;
        nodePointer12.setNamespaceResolver(namespaceResolver16);
        org.apache.commons.jxpath.JXPathContext jXPathContext18 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = nodePointer12.createPath(jXPathContext18);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(nodePointer7, (java.lang.Object) jXPathContext18);
        java.lang.Object obj21 = jDOMNodePointer20.clone();
        java.lang.Object obj22 = jDOMNodePointer20.getNodeValue();
        org.w3c.dom.Node node23 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer24 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer20, node23);
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer20, locale25, "hi!");
        java.lang.Object obj28 = jDOMNodePointer20.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = jDOMNodePointer20.namespacePointer("/namespace::-1");
        java.lang.String str31 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName((java.lang.Object) nodePointer30);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "-1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "-1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "-1");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(nodePointer30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1.0f), locale2);
        nodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.createPath(jXPathContext6);
        boolean boolean8 = nodePointer7.isRoot();
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName9, (java.lang.Object) (-1.0f), locale11);
        boolean boolean13 = nodePointer12.isContainer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver14 = null;
        nodePointer12.setNamespaceResolver(namespaceResolver14);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver16 = null;
        nodePointer12.setNamespaceResolver(namespaceResolver16);
        org.apache.commons.jxpath.JXPathContext jXPathContext18 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = nodePointer12.createPath(jXPathContext18);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(nodePointer7, (java.lang.Object) jXPathContext18);
        java.lang.Object obj21 = jDOMNodePointer20.clone();
        org.w3c.dom.Node node22 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer25 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node22, locale23, "http://www.w3.org/XML/1998/namespace");
        boolean boolean26 = dOMNodePointer25.isCollection();
        java.lang.Object obj27 = dOMNodePointer25.getBaseValue();
        org.w3c.dom.Node node28 = null;
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer31 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node28, locale29, "");
        int int32 = dOMNodePointer31.getIndex();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer33 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer25, (java.lang.Object) int32);
        org.w3c.dom.Node node34 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer35 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer25, node34);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer20, (java.lang.Object) node34);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "-1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "-1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "-1");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-2147483648) + "'", int32 == (-2147483648));
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1.0f), locale2);
        nodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.createPath(jXPathContext6);
        boolean boolean8 = nodePointer7.isRoot();
        org.w3c.dom.Node node9 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer7, node9);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale12);
        boolean boolean14 = jDOMNodePointer13.isAttribute();
        java.lang.String str15 = jDOMNodePointer13.asPath();
        java.lang.String str16 = jDOMNodePointer13.toString();
        org.apache.commons.jxpath.ri.QName qName17 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = jDOMNodePointer13.attributeIterator(qName17);
        boolean boolean19 = dOMNodePointer10.equals((java.lang.Object) jDOMNodePointer13);
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName20, (java.lang.Object) (-1.0f), locale22);
        nodePointer23.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext26 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = nodePointer23.createPath(jXPathContext26);
        java.lang.Class<?> wildcardClass28 = nodePointer23.getClass();
        boolean boolean29 = dOMNodePointer10.equals((java.lang.Object) nodePointer23);
        boolean boolean30 = dOMNodePointer10.isCollection();
        boolean boolean31 = dOMNodePointer10.isAttribute();
        java.lang.String str32 = dOMNodePointer10.getLanguage();
        dOMNodePointer10.setIndex((int) '#');
        java.lang.Object obj35 = dOMNodePointer10.getImmediateNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest36 = null;
        org.w3c.dom.Node node38 = null;
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer41 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node38, locale39, "-1");
        java.lang.Object obj42 = dOMNodePointer41.getBaseValue();
        java.lang.String str43 = dOMNodePointer41.asPath();
        java.lang.String str44 = dOMNodePointer41.getLanguage();
        java.lang.String str46 = dOMNodePointer41.getNamespaceURI("http://www.w3.org/XML/1998/namespace");
        int int47 = dOMNodePointer41.getLength();
        java.lang.String str48 = dOMNodePointer41.getDefaultNamespaceURI();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator49 = dOMNodePointer10.childIterator(nodeTest36, false, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer41);
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer10.printPointerChain();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "id('-1')" + "'", str43, "id('-1')");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(nodeIterator49);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "http://www.w3.org/XML/1998/namespace");
        boolean boolean4 = dOMNodePointer3.isCollection();
        java.lang.Object obj5 = dOMNodePointer3.getBaseValue();
        org.w3c.dom.Node node6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node6, locale7, "");
        int int10 = dOMNodePointer9.getIndex();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, (java.lang.Object) int10);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        boolean boolean13 = dOMNodePointer3.testNode(nodeTest12);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName16, (java.lang.Object) (-1.0f), locale18);
        nodePointer19.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext22 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = nodePointer19.createPath(jXPathContext22);
        boolean boolean24 = nodePointer23.isRoot();
        org.w3c.dom.Node node25 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer26 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer23, node25);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale28);
        boolean boolean30 = jDOMNodePointer29.isAttribute();
        java.lang.String str31 = jDOMNodePointer29.asPath();
        java.lang.String str32 = jDOMNodePointer29.toString();
        org.apache.commons.jxpath.ri.QName qName33 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator34 = jDOMNodePointer29.attributeIterator(qName33);
        boolean boolean35 = dOMNodePointer26.equals((java.lang.Object) jDOMNodePointer29);
        java.lang.String str36 = dOMNodePointer26.getDefaultNamespaceURI();
        boolean boolean37 = dOMNodePointer26.isActual();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator38 = dOMNodePointer3.childIterator(nodeTest14, false, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer26);
        java.lang.String str39 = dOMNodePointer3.getLanguage();
        boolean boolean40 = dOMNodePointer3.isCollection();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2147483648) + "'", int10 == (-2147483648));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(nodeIterator34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(nodeIterator38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale1);
        java.lang.Object obj3 = jDOMNodePointer2.getValue();
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale6);
        java.lang.Object obj8 = jDOMNodePointer7.getValue();
        boolean boolean9 = jDOMNodePointer7.isCollection();
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName4, (java.lang.Object) jDOMNodePointer7, locale10);
        int int12 = jDOMNodePointer2.compareTo((java.lang.Object) jDOMNodePointer7);
        int int13 = jDOMNodePointer7.getLength();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer7.namespaceIterator();
        org.w3c.dom.Node node15 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer16 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer7, node15);
        java.lang.Object obj17 = dOMNodePointer16.clone();
        java.lang.String str19 = dOMNodePointer16.getNamespaceURI("-1");
        java.lang.Object obj20 = dOMNodePointer16.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = dOMNodePointer16.namespacePointer("id('hi!')");
        org.apache.commons.jxpath.ri.QName qName23 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale25);
        java.lang.Object obj27 = jDOMNodePointer26.getValue();
        boolean boolean28 = jDOMNodePointer26.isCollection();
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName23, (java.lang.Object) jDOMNodePointer26, locale29);
        java.lang.String str31 = jDOMNodePointer26.asPath();
        java.lang.String str32 = jDOMNodePointer26.getNamespaceURI();
        org.apache.commons.jxpath.JXPathContext jXPathContext33 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = jDOMNodePointer26.createPath(jXPathContext33);
        nodePointer34.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest36 = null;
        boolean boolean37 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer16, (java.lang.Object) nodePointer34, nodeTest36);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer39 = dOMNodePointer16.namespacePointer("id('hi!')");
        org.apache.commons.jxpath.JXPathContext jXPathContext40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer43 = nodePointer39.getPointerByKey(jXPathContext40, "id('-1')", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(nodePointer30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(nodePointer34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(nodePointer39);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale1);
        java.lang.Object obj3 = jDOMNodePointer2.getValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator4 = jDOMNodePointer2.namespaceIterator();
        java.util.Locale locale5 = jDOMNodePointer2.getLocale();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        org.w3c.dom.Node node8 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer11 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node8, locale9, "http://www.w3.org/XML/1998/namespace");
        boolean boolean12 = dOMNodePointer11.isCollection();
        java.lang.Object obj13 = dOMNodePointer11.getBaseValue();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName16, (java.lang.Object) (-1.0f), locale18);
        nodePointer19.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext22 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = nodePointer19.createPath(jXPathContext22);
        boolean boolean24 = nodePointer23.isRoot();
        org.w3c.dom.Node node25 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer26 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer23, node25);
        java.lang.String str27 = dOMNodePointer26.getLanguage();
        java.lang.String str29 = dOMNodePointer26.getNamespaceURI("http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj30 = dOMNodePointer26.getBaseValue();
        boolean boolean31 = dOMNodePointer26.isCollection();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = dOMNodePointer26.namespacePointer("hi!");
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator34 = dOMNodePointer11.childIterator(nodeTest14, false, nodePointer33);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator35 = jDOMNodePointer2.childIterator(nodeTest6, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer11);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = dOMNodePointer11.namespacePointer("http://www.w3.org/XML/1998/namespace");
        dOMNodePointer11.setIndex((int) (byte) -1);
        java.lang.Object obj40 = dOMNodePointer11.getNode();
        java.util.Locale locale42 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer44 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1), locale42, "http://www.w3.org/XML/1998/namespace");
        boolean boolean46 = jDOMNodePointer44.equals((java.lang.Object) 100.0f);
        org.w3c.dom.Node node47 = null;
        java.util.Locale locale48 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer50 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node47, locale48, "hi!");
        boolean boolean51 = dOMNodePointer50.isCollection();
        boolean boolean52 = jDOMNodePointer44.equals((java.lang.Object) dOMNodePointer50);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer54 = dOMNodePointer50.namespacePointer("<<unknown namespace>>");
        org.apache.commons.jxpath.JXPathContext jXPathContext55 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer56 = nodePointer54.createPath(jXPathContext55);
        boolean boolean57 = dOMNodePointer11.equals((java.lang.Object) nodePointer54);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(nodeIterator4);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(nodePointer33);
        org.junit.Assert.assertNotNull(nodeIterator34);
        org.junit.Assert.assertNotNull(nodeIterator35);
        org.junit.Assert.assertNotNull(nodePointer37);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(nodePointer54);
        org.junit.Assert.assertNotNull(nodePointer56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale1);
        java.lang.Object obj3 = jDOMNodePointer2.getValue();
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale6);
        java.lang.Object obj8 = jDOMNodePointer7.getValue();
        boolean boolean9 = jDOMNodePointer7.isCollection();
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName4, (java.lang.Object) jDOMNodePointer7, locale10);
        int int12 = jDOMNodePointer2.compareTo((java.lang.Object) jDOMNodePointer7);
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale14);
        java.lang.Object obj16 = jDOMNodePointer15.getValue();
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale19);
        java.lang.Object obj21 = jDOMNodePointer20.getValue();
        boolean boolean22 = jDOMNodePointer20.isCollection();
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName17, (java.lang.Object) jDOMNodePointer20, locale23);
        int int25 = jDOMNodePointer15.compareTo((java.lang.Object) jDOMNodePointer20);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer20.namespaceIterator();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator27 = jDOMNodePointer20.namespaceIterator();
        int int28 = jDOMNodePointer7.compareTo((java.lang.Object) jDOMNodePointer20);
        boolean boolean29 = jDOMNodePointer7.isRoot();
        jDOMNodePointer7.setIndex((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            jDOMNodePointer7.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot remove root JDOM node");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertNotNull(nodeIterator27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "");
        int int4 = dOMNodePointer3.getIndex();
        dOMNodePointer3.setIndex((int) '4');
        dOMNodePointer3.setIndex((int) (byte) 1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = dOMNodePointer3.namespacePointer("http://www.w3.org/XML/1998/namespace");
        org.w3c.dom.Node node11 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer12 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, node11);
        boolean boolean13 = dOMNodePointer12.isActual();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = dOMNodePointer12.isLeaf();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "");
        java.lang.Object obj4 = dOMNodePointer3.getRootNode();
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, qName5, (java.lang.Object) jDOMNodePointer8);
        java.util.Locale locale11 = dOMNodePointer3.getLocale();
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale13);
        boolean boolean15 = jDOMNodePointer14.isLeaf();
        boolean boolean16 = jDOMNodePointer14.isActual();
        jDOMNodePointer14.setAttribute(false);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest19 = null;
        boolean boolean20 = jDOMNodePointer14.testNode(nodeTest19);
        boolean boolean21 = dOMNodePointer3.equals((java.lang.Object) jDOMNodePointer14);
        java.lang.String str22 = dOMNodePointer3.getLanguage();
        org.w3c.dom.Node node23 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer24 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, node23);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 10 + "'", obj9, (byte) 10);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1.0f), locale2);
        nodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.createPath(jXPathContext6);
        boolean boolean8 = nodePointer7.isRoot();
        org.w3c.dom.Node node9 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer7, node9);
        boolean boolean11 = dOMNodePointer10.isCollection();
        java.lang.Object obj12 = dOMNodePointer10.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = dOMNodePointer10.namespacePointer("hi!");
        int int15 = dOMNodePointer10.getLength();
        java.lang.String str17 = dOMNodePointer10.getNamespaceURI("hi!");
        boolean boolean18 = dOMNodePointer10.isRoot();
        int int19 = dOMNodePointer10.getIndex();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2147483648) + "'", int19 == (-2147483648));
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1.0f), locale2);
        nodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.createPath(jXPathContext6);
        boolean boolean8 = nodePointer7.isRoot();
        org.w3c.dom.Node node9 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer7, node9);
        boolean boolean11 = dOMNodePointer10.isCollection();
        java.lang.Object obj12 = dOMNodePointer10.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = dOMNodePointer10.namespacePointer("hi!");
        java.lang.String str15 = dOMNodePointer10.getLanguage();
        boolean boolean16 = dOMNodePointer10.isActual();
        java.lang.String str17 = dOMNodePointer10.getDefaultNamespaceURI();
        java.lang.String str18 = dOMNodePointer10.getLanguage();
        org.apache.commons.jxpath.JXPathContext jXPathContext19 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = dOMNodePointer10.createPath(jXPathContext19);
        java.lang.Class<?> wildcardClass21 = nodePointer20.getClass();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1.0f), locale2);
        java.util.Locale locale4 = nodePointer3.getLocale();
        nodePointer3.setIndex((int) 'a');
        boolean boolean7 = nodePointer3.isRoot();
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) boolean7, locale8, "http://www.w3.org/XML/1998/namespace");
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer13.namespaceIterator();
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName16, (java.lang.Object) (-1.0f), locale18);
        boolean boolean20 = nodePointer19.isContainer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver21 = null;
        nodePointer19.setNamespaceResolver(namespaceResolver21);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13, (java.lang.Object) namespaceResolver21);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer10, (java.lang.Object) jDOMNodePointer23);
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer10, locale25);
        java.util.Locale locale27 = jDOMNodePointer10.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = jDOMNodePointer10.getParent();
        // The following exception was thrown during execution in test generation
        try {
            jDOMNodePointer10.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot remove root JDOM node");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(locale27);
        org.junit.Assert.assertNull(nodePointer28);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "hi!");
        java.lang.Object obj4 = dOMNodePointer3.getBaseValue();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        boolean boolean6 = dOMNodePointer3.testNode(nodeTest5);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "");
        int int4 = dOMNodePointer3.getIndex();
        dOMNodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = dOMNodePointer3.getImmediateValuePointer();
        boolean boolean8 = dOMNodePointer3.isCollection();
        java.lang.Object obj9 = dOMNodePointer3.getImmediateNode();
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(obj9, locale10, "id('id(&apos;http://www.w3.org/XML/1998/namespace&apos;)')");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale1);
        java.lang.Object obj3 = jDOMNodePointer2.getValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator4 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.QName qName5 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName5, (java.lang.Object) (-1.0f), locale7);
        boolean boolean9 = nodePointer8.isContainer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver10 = null;
        nodePointer8.setNamespaceResolver(namespaceResolver10);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, (java.lang.Object) namespaceResolver10);
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale15);
        boolean boolean17 = jDOMNodePointer16.isAttribute();
        java.lang.Object obj18 = jDOMNodePointer16.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer12, qName13, obj18);
        java.lang.Object obj20 = jDOMNodePointer12.clone();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest21 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale24);
        boolean boolean26 = jDOMNodePointer25.isAttribute();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = jDOMNodePointer25.namespacePointer("");
        java.lang.Object obj29 = jDOMNodePointer25.getImmediateNode();
        java.lang.Object obj30 = jDOMNodePointer25.getRootNode();
        boolean boolean31 = jDOMNodePointer25.isCollection();
        int int32 = jDOMNodePointer25.getIndex();
        java.util.Locale locale33 = jDOMNodePointer25.getLocale();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver34 = jDOMNodePointer25.getNamespaceResolver();
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer38 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1), locale36, "http://www.w3.org/XML/1998/namespace");
        boolean boolean40 = jDOMNodePointer38.equals((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer41 = jDOMNodePointer38.getImmediateValuePointer();
        int int42 = jDOMNodePointer38.getIndex();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer44 = jDOMNodePointer38.namespacePointer("hi!");
        java.lang.Object obj45 = jDOMNodePointer38.clone();
        boolean boolean46 = jDOMNodePointer25.equals((java.lang.Object) jDOMNodePointer38);
        org.apache.commons.jxpath.JXPathContext jXPathContext47 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer48 = jDOMNodePointer25.createPath(jXPathContext47);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator49 = jDOMNodePointer12.childIterator(nodeTest21, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer25);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer50 = jDOMNodePointer25.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.QName qName51 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator52 = jDOMNodePointer25.attributeIterator(qName51);
        org.w3c.dom.Node node53 = null;
        java.util.Locale locale54 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer56 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node53, locale54, "");
        java.lang.Object obj57 = dOMNodePointer56.getRootNode();
        org.apache.commons.jxpath.ri.QName qName58 = null;
        java.util.Locale locale60 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer61 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale60);
        java.lang.Object obj62 = jDOMNodePointer61.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer63 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer56, qName58, (java.lang.Object) jDOMNodePointer61);
        boolean boolean64 = jDOMNodePointer61.isRoot();
        java.lang.String str65 = jDOMNodePointer61.getNamespaceURI();
        boolean boolean66 = jDOMNodePointer61.isContainer();
        boolean boolean67 = jDOMNodePointer61.isActual();
        int int68 = jDOMNodePointer25.compareTo((java.lang.Object) jDOMNodePointer61);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(nodeIterator4);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (byte) 10 + "'", obj18, (byte) 10);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodePointer28);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (byte) 10 + "'", obj29, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (byte) 10 + "'", obj30, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-2147483648) + "'", int32 == (-2147483648));
        org.junit.Assert.assertNull(locale33);
        org.junit.Assert.assertNull(namespaceResolver34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(nodePointer41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-2147483648) + "'", int42 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer44);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "id('http://www.w3.org/XML/1998/namespace')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "id('http://www.w3.org/XML/1998/namespace')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "id('http://www.w3.org/XML/1998/namespace')");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(nodePointer48);
        org.junit.Assert.assertNotNull(nodeIterator49);
        org.junit.Assert.assertNotNull(nodePointer50);
        org.junit.Assert.assertNotNull(nodeIterator52);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + (byte) 10 + "'", obj62, (byte) 10);
        org.junit.Assert.assertNotNull(nodePointer63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale1);
        boolean boolean3 = jDOMNodePointer2.isLeaf();
        boolean boolean4 = jDOMNodePointer2.isActual();
        jDOMNodePointer2.setIndex((int) '4');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = jDOMNodePointer2.getImmediateValuePointer();
        int int8 = jDOMNodePointer2.getLength();
        java.lang.Object obj9 = jDOMNodePointer2.getBaseValue();
        java.lang.Object obj10 = jDOMNodePointer2.getValue();
        java.lang.Object obj11 = jDOMNodePointer2.clone();
        int int12 = jDOMNodePointer2.getIndex();
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) int12, locale13);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 10 + "'", obj9, (byte) 10);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1.0f), locale2);
        nodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.createPath(jXPathContext6);
        boolean boolean8 = nodePointer7.isRoot();
        org.w3c.dom.Node node9 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer7, node9);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = dOMNodePointer10.getImmediateParentPointer();
        int int12 = dOMNodePointer10.getLength();
        org.w3c.dom.Node node13 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer10, node13);
        boolean boolean15 = dOMNodePointer10.isActual();
        java.lang.Object obj16 = dOMNodePointer10.getImmediateNode();
        java.lang.Object obj17 = dOMNodePointer10.getBaseValue();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = dOMNodePointer10.isLanguage("id('/namespace::')");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1.0f), locale2);
        nodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.createPath(jXPathContext6);
        boolean boolean8 = nodePointer7.isRoot();
        org.w3c.dom.Node node9 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer7, node9);
        java.lang.String str11 = dOMNodePointer10.getLanguage();
        java.lang.String str13 = dOMNodePointer10.getNamespaceURI("http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj14 = dOMNodePointer10.getImmediateNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        boolean boolean16 = dOMNodePointer10.testNode(nodeTest15);
        java.lang.String str17 = dOMNodePointer10.getDefaultNamespaceURI();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest18 = null;
        org.w3c.dom.Node node20 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer23 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node20, locale21, "-1");
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator24 = dOMNodePointer10.childIterator(nodeTest18, false, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer23);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer26 = dOMNodePointer10.namespacePointer("http://www.w3.org/2000/xmlns/");
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(nodeIterator24);
        org.junit.Assert.assertNotNull(nodePointer26);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1.0f), locale2);
        nodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.createPath(jXPathContext6);
        boolean boolean8 = nodePointer7.isRoot();
        org.w3c.dom.Node node9 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer7, node9);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale12);
        boolean boolean14 = jDOMNodePointer13.isAttribute();
        java.lang.String str15 = jDOMNodePointer13.asPath();
        java.lang.String str16 = jDOMNodePointer13.toString();
        org.apache.commons.jxpath.ri.QName qName17 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = jDOMNodePointer13.attributeIterator(qName17);
        boolean boolean19 = dOMNodePointer10.equals((java.lang.Object) jDOMNodePointer13);
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName20, (java.lang.Object) (-1.0f), locale22);
        nodePointer23.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext26 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = nodePointer23.createPath(jXPathContext26);
        java.lang.Class<?> wildcardClass28 = nodePointer23.getClass();
        boolean boolean29 = dOMNodePointer10.equals((java.lang.Object) nodePointer23);
        java.lang.Object obj30 = dOMNodePointer10.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = dOMNodePointer10.getImmediateValuePointer();
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale33);
        java.lang.Object obj35 = jDOMNodePointer34.getValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator36 = jDOMNodePointer34.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest37 = null;
        boolean boolean38 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer10, (java.lang.Object) nodeIterator36, nodeTest37);
        java.lang.String str39 = dOMNodePointer10.getLanguage();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer40 = dOMNodePointer10.getImmediateValuePointer();
        boolean boolean41 = dOMNodePointer10.isNode();
        java.lang.Object obj42 = dOMNodePointer10.getBaseValue();
        java.lang.Object obj43 = dOMNodePointer10.getImmediateNode();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(nodePointer31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(nodeIterator36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(nodePointer40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "hi!");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = dOMNodePointer3.getNamespaceResolver();
        java.lang.Object obj5 = dOMNodePointer3.clone();
        boolean boolean6 = dOMNodePointer3.isCollection();
        dOMNodePointer3.setIndex((int) (short) -1);
        java.lang.String str9 = dOMNodePointer3.getDefaultNamespaceURI();
        java.lang.Object obj10 = dOMNodePointer3.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName11, (java.lang.Object) (-1.0f), locale13);
        nodePointer14.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = nodePointer14.createPath(jXPathContext17);
        boolean boolean19 = nodePointer18.isRoot();
        org.w3c.dom.Node node20 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer21 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer18, node20);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = dOMNodePointer21.getImmediateParentPointer();
        java.lang.String str24 = dOMNodePointer21.getNamespaceURI("hi!");
        boolean boolean25 = dOMNodePointer21.isCollection();
        boolean boolean26 = dOMNodePointer21.isAttribute();
        boolean boolean27 = dOMNodePointer3.equals((java.lang.Object) boolean26);
        java.lang.String str28 = dOMNodePointer3.asPath();
        java.lang.String str29 = dOMNodePointer3.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = dOMNodePointer3.isLanguage("http://www.w3.org/XML/1998/namespace");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(namespaceResolver4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "id('hi!')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "id('hi!')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "id('hi!')");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "id('hi!')" + "'", str28, "id('hi!')");
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "http://www.w3.org/2000/xmlns/");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = dOMNodePointer3.namespacePointer("id('-1')");
        java.lang.Class<?> wildcardClass6 = nodePointer5.getClass();
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1.0f), locale2);
        nodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.createPath(jXPathContext6);
        boolean boolean8 = nodePointer7.isRoot();
        org.w3c.dom.Node node9 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer7, node9);
        java.lang.String str11 = dOMNodePointer10.getLanguage();
        java.lang.String str13 = dOMNodePointer10.getNamespaceURI("http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj14 = dOMNodePointer10.getBaseValue();
        boolean boolean15 = dOMNodePointer10.isCollection();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = dOMNodePointer10.namespacePointer("hi!");
        dOMNodePointer10.setIndex((int) (byte) 1);
        org.w3c.dom.Node node20 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer21 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer10, node20);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = dOMNodePointer21.getImmediateParentPointer();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertNotNull(nodePointer22);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "hi!");
        java.lang.Object obj4 = dOMNodePointer3.clone();
        java.lang.String str5 = dOMNodePointer3.asPath();
        java.lang.String str6 = dOMNodePointer3.getLanguage();
        int int7 = dOMNodePointer3.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = dOMNodePointer3.getValuePointer();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "id('hi!')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "id('hi!')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "id('hi!')");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "id('hi!')" + "'", str5, "id('hi!')");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(nodePointer8);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1), locale1, "http://www.w3.org/XML/1998/namespace");
        boolean boolean5 = jDOMNodePointer3.equals((java.lang.Object) 100.0f);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = jDOMNodePointer3.getImmediateValuePointer();
        int int7 = jDOMNodePointer3.getIndex();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = jDOMNodePointer3.namespacePointer("hi!");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer9.getImmediateParentPointer();
        nodePointer10.setIndex((int) (byte) 10);
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale13, "");
        org.w3c.dom.Node node16 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer19 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node16, locale17, "hi!");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver20 = dOMNodePointer19.getNamespaceResolver();
        java.lang.Object obj21 = dOMNodePointer19.clone();
        java.lang.Object obj22 = dOMNodePointer19.getBaseValue();
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) '#', locale24);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer19, (java.lang.Object) '#');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = dOMNodePointer19.getValuePointer();
        boolean boolean28 = jDOMNodePointer15.equals((java.lang.Object) nodePointer27);
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer31 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) boolean28, locale29, "id('-1')");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2147483648) + "'", int7 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNull(namespaceResolver20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "id('hi!')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "id('hi!')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "id('hi!')");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1.0f), locale2);
        nodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.createPath(jXPathContext6);
        boolean boolean8 = nodePointer7.isRoot();
        org.w3c.dom.Node node9 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer7, node9);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale12);
        boolean boolean14 = jDOMNodePointer13.isAttribute();
        java.lang.String str15 = jDOMNodePointer13.asPath();
        java.lang.String str16 = jDOMNodePointer13.toString();
        org.apache.commons.jxpath.ri.QName qName17 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = jDOMNodePointer13.attributeIterator(qName17);
        boolean boolean19 = dOMNodePointer10.equals((java.lang.Object) jDOMNodePointer13);
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName20, (java.lang.Object) (-1.0f), locale22);
        nodePointer23.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext26 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = nodePointer23.createPath(jXPathContext26);
        java.lang.Class<?> wildcardClass28 = nodePointer23.getClass();
        boolean boolean29 = dOMNodePointer10.equals((java.lang.Object) nodePointer23);
        java.lang.Object obj30 = dOMNodePointer10.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = dOMNodePointer10.getImmediateValuePointer();
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale33);
        java.lang.Object obj35 = jDOMNodePointer34.getValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator36 = jDOMNodePointer34.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest37 = null;
        boolean boolean38 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer10, (java.lang.Object) nodeIterator36, nodeTest37);
        java.lang.String str39 = dOMNodePointer10.getLanguage();
        java.lang.String str40 = dOMNodePointer10.getDefaultNamespaceURI();
        org.apache.commons.jxpath.JXPathContext jXPathContext41 = null;
        org.apache.commons.jxpath.ri.QName qName42 = null;
        java.util.Locale locale44 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer45 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName42, (java.lang.Object) (-1.0f), locale44);
        java.util.Locale locale46 = nodePointer45.getLocale();
        nodePointer45.setIndex((int) 'a');
        boolean boolean49 = nodePointer45.isRoot();
        java.util.Locale locale50 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer52 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) boolean49, locale50, "http://www.w3.org/XML/1998/namespace");
        java.util.Locale locale54 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer55 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale54);
        java.lang.Object obj56 = jDOMNodePointer55.getValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator57 = jDOMNodePointer55.namespaceIterator();
        org.apache.commons.jxpath.ri.QName qName58 = null;
        java.util.Locale locale60 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer61 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName58, (java.lang.Object) (-1.0f), locale60);
        boolean boolean62 = nodePointer61.isContainer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver63 = null;
        nodePointer61.setNamespaceResolver(namespaceResolver63);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer65 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer55, (java.lang.Object) namespaceResolver63);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer66 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer52, (java.lang.Object) jDOMNodePointer65);
        java.lang.String str67 = jDOMNodePointer66.getNamespaceURI();
        java.util.Locale locale68 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer70 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer66, locale68, "-1");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest71 = null;
        boolean boolean72 = jDOMNodePointer70.testNode(nodeTest71);
        org.apache.commons.jxpath.ri.QName qName73 = jDOMNodePointer70.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer74 = dOMNodePointer10.createAttribute(jXPathContext41, qName73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(nodePointer31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(nodeIterator36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(nodePointer45);
        org.junit.Assert.assertNull(locale46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(nodeIterator57);
        org.junit.Assert.assertNotNull(nodePointer61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(qName73);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1.0f), locale2);
        nodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.createPath(jXPathContext6);
        boolean boolean8 = nodePointer7.isRoot();
        org.w3c.dom.Node node9 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer7, node9);
        boolean boolean11 = dOMNodePointer10.isCollection();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver12 = null;
        dOMNodePointer10.setNamespaceResolver(namespaceResolver12);
        org.apache.commons.jxpath.JXPathContext jXPathContext14 = null;
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName15, (java.lang.Object) (-1.0f), locale17);
        java.util.Locale locale19 = nodePointer18.getLocale();
        nodePointer18.setIndex((int) 'a');
        boolean boolean22 = nodePointer18.isRoot();
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) boolean22, locale23, "http://www.w3.org/XML/1998/namespace");
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale27);
        java.lang.Object obj29 = jDOMNodePointer28.getValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator30 = jDOMNodePointer28.namespaceIterator();
        org.apache.commons.jxpath.ri.QName qName31 = null;
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName31, (java.lang.Object) (-1.0f), locale33);
        boolean boolean35 = nodePointer34.isContainer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver36 = null;
        nodePointer34.setNamespaceResolver(namespaceResolver36);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer38 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer28, (java.lang.Object) namespaceResolver36);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer39 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer25, (java.lang.Object) jDOMNodePointer38);
        boolean boolean40 = jDOMNodePointer25.isActual();
        org.apache.commons.jxpath.ri.QName qName41 = jDOMNodePointer25.getName();
        java.lang.Object obj43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer44 = dOMNodePointer10.createChild(jXPathContext14, qName41, (-1), obj43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertNull(locale19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(nodeIterator30);
        org.junit.Assert.assertNotNull(nodePointer34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(qName41);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) (-1.0f), locale2);
        nodePointer3.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.createPath(jXPathContext6);
        boolean boolean8 = nodePointer7.isRoot();
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName9, (java.lang.Object) (-1.0f), locale11);
        boolean boolean13 = nodePointer12.isContainer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver14 = null;
        nodePointer12.setNamespaceResolver(namespaceResolver14);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver16 = null;
        nodePointer12.setNamespaceResolver(namespaceResolver16);
        org.apache.commons.jxpath.JXPathContext jXPathContext18 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = nodePointer12.createPath(jXPathContext18);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(nodePointer7, (java.lang.Object) jXPathContext18);
        java.lang.Object obj21 = jDOMNodePointer20.clone();
        java.lang.Object obj22 = jDOMNodePointer20.getNodeValue();
        org.w3c.dom.Node node23 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer24 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer20, node23);
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale26);
        boolean boolean28 = jDOMNodePointer27.isLeaf();
        java.lang.String str30 = jDOMNodePointer27.getNamespaceURI("hi!");
        java.lang.String str32 = jDOMNodePointer27.getNamespaceURI("");
        java.util.Locale locale34 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer35 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 10, locale34);
        boolean boolean36 = jDOMNodePointer35.isLeaf();
        java.lang.Object obj37 = jDOMNodePointer35.getValue();
        java.lang.String str39 = jDOMNodePointer35.getNamespaceURI("id('hi!')");
        java.util.Locale locale40 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer41 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer35, locale40);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer42 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer27, (java.lang.Object) jDOMNodePointer35);
        boolean boolean43 = jDOMNodePointer27.isActual();
        java.lang.String str44 = jDOMNodePointer27.asPath();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver45 = jDOMNodePointer27.getNamespaceResolver();
        java.lang.String str46 = jDOMNodePointer27.getNamespaceURI();
        org.apache.commons.jxpath.ri.QName qName47 = jDOMNodePointer27.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator48 = dOMNodePointer24.attributeIterator(qName47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "-1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "-1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "-1");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNull(namespaceResolver45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(qName47);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) (-1.0f), locale3);
        nodePointer4.setIndex((int) '4');
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = nodePointer4.createPath(jXPathContext7);
        boolean boolean9 = nodePointer8.isRoot();
        org.w3c.dom.Node node10 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer11 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer8, node10);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) dOMNodePointer11, locale12);
        boolean boolean14 = dOMNodePointer11.isActual();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = dOMNodePointer11.getImmediateParentPointer();
        org.apache.commons.jxpath.JXPathContext jXPathContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer18 = nodePointer15.getPointerByID(jXPathContext16, "<<unknown namespace>>");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(nodePointer15);
    }
}

