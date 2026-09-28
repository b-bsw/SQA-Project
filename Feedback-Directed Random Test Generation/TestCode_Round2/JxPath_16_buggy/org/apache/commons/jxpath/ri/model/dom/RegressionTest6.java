package org.apache.commons.jxpath.ri.model.dom;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer13.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale18);
        java.lang.Object obj20 = jDOMNodePointer19.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator21 = jDOMNodePointer13.childIterator(nodeTest15, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19);
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        int int25 = jDOMNodePointer8.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        org.w3c.dom.Node node26 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24, node26);
        int int28 = dOMNodePointer27.getLength();
        java.util.Locale locale29 = dOMNodePointer27.getLocale();
        java.lang.Object obj30 = dOMNodePointer27.getBaseValue();
        java.lang.String str31 = dOMNodePointer27.getLanguage();
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer33 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) str31, locale32);
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(locale29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        java.lang.Object obj34 = dOMNodePointer32.getImmediateNode();
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale36);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest38 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer42 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale41);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator43 = jDOMNodePointer42.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest44 = null;
        java.util.Locale locale47 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer48 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale47);
        java.lang.Object obj49 = jDOMNodePointer48.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator50 = jDOMNodePointer42.childIterator(nodeTest44, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer48);
        java.util.Locale locale52 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer53 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale52);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator54 = jDOMNodePointer53.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest55 = null;
        java.util.Locale locale58 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer59 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale58);
        java.lang.Object obj60 = jDOMNodePointer59.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator61 = jDOMNodePointer53.childIterator(nodeTest55, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer59);
        java.util.Locale locale63 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer64 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale63);
        int int65 = jDOMNodePointer48.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer53, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer64);
        org.w3c.dom.Node node66 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer67 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer64, node66);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator68 = jDOMNodePointer37.childIterator(nodeTest38, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer67);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest69 = null;
        boolean boolean70 = jDOMNodePointer37.testNode(nodeTest69);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver71 = null;
        jDOMNodePointer37.setNamespaceResolver(namespaceResolver71);
        java.lang.Object obj73 = jDOMNodePointer37.getNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest74 = null;
        java.util.Locale locale77 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer78 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale77);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator79 = jDOMNodePointer78.namespaceIterator();
        java.util.Locale locale80 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer82 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer78, locale80, "http://www.w3.org/2000/xmlns/");
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator83 = jDOMNodePointer37.childIterator(nodeTest74, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer78);
        boolean boolean84 = dOMNodePointer32.equals((java.lang.Object) nodeTest74);
        boolean boolean85 = dOMNodePointer32.isActual();
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer32.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(nodeIterator43);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (-1L) + "'", obj49, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator50);
        org.junit.Assert.assertNotNull(nodeIterator54);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + (-1L) + "'", obj60, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(nodeIterator68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + (-1L) + "'", obj73, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator79);
        org.junit.Assert.assertNotNull(nodeIterator83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer13.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale18);
        java.lang.Object obj20 = jDOMNodePointer19.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator21 = jDOMNodePointer13.childIterator(nodeTest15, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19);
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        int int25 = jDOMNodePointer8.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        org.w3c.dom.Node node26 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24, node26);
        boolean boolean28 = dOMNodePointer27.isActual();
        java.lang.String str29 = dOMNodePointer27.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.QName qName30 = dOMNodePointer27.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "id('hi!')");
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale5);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator7 = jDOMNodePointer6.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale11);
        java.lang.Object obj13 = jDOMNodePointer12.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer6.childIterator(nodeTest8, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer12);
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale16);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = jDOMNodePointer17.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest19 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale22);
        java.lang.Object obj24 = jDOMNodePointer23.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator25 = jDOMNodePointer17.childIterator(nodeTest19, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer23);
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale27);
        int int29 = jDOMNodePointer12.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer17, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer28);
        org.w3c.dom.Node node30 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer31 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer28, node30);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver32 = dOMNodePointer31.getNamespaceResolver();
        dOMNodePointer3.setNamespaceResolver(namespaceResolver32);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = dOMNodePointer3.namespacePointer("id('http://www.w3.org/2000/xmlns/')");
        java.lang.String str36 = dOMNodePointer3.toString();
        java.lang.Object obj37 = dOMNodePointer3.getImmediateNode();
        java.lang.String str38 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix((java.lang.Object) dOMNodePointer3);
        boolean boolean39 = dOMNodePointer3.isNode();
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer42 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale41);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest43 = null;
        java.util.Locale locale46 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer47 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale46);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator48 = jDOMNodePointer47.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest49 = null;
        java.util.Locale locale52 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer53 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale52);
        java.lang.Object obj54 = jDOMNodePointer53.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator55 = jDOMNodePointer47.childIterator(nodeTest49, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer53);
        java.util.Locale locale57 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer58 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale57);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator59 = jDOMNodePointer58.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest60 = null;
        java.util.Locale locale63 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer64 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale63);
        java.lang.Object obj65 = jDOMNodePointer64.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator66 = jDOMNodePointer58.childIterator(nodeTest60, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer64);
        java.util.Locale locale68 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer69 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale68);
        int int70 = jDOMNodePointer53.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer58, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer69);
        org.w3c.dom.Node node71 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer72 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer69, node71);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator73 = jDOMNodePointer42.childIterator(nodeTest43, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer72);
        java.lang.Object obj74 = dOMNodePointer72.getNodeValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer75 = dOMNodePointer72.getValuePointer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver76 = dOMNodePointer72.getNamespaceResolver();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver77 = dOMNodePointer72.getNamespaceResolver();
        boolean boolean78 = dOMNodePointer3.equals((java.lang.Object) namespaceResolver77);
        org.junit.Assert.assertNotNull(nodeIterator7);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1L) + "'", obj24, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(namespaceResolver32);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "id('id(&apos;hi!&apos;)')" + "'", str36, "id('id(&apos;hi!&apos;)')");
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(nodeIterator48);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (-1L) + "'", obj54, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator55);
        org.junit.Assert.assertNotNull(nodeIterator59);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (-1L) + "'", obj65, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator66);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(nodeIterator73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(nodePointer75);
        org.junit.Assert.assertNotNull(namespaceResolver76);
        org.junit.Assert.assertNotNull(namespaceResolver77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        java.util.Locale locale4 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer2, locale4, "http://www.w3.org/2000/xmlns/");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        boolean boolean8 = jDOMNodePointer2.testNode(nodeTest7);
        int int9 = jDOMNodePointer2.getIndex();
        jDOMNodePointer2.setAttribute(false);
        boolean boolean12 = jDOMNodePointer2.isActual();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator13 = jDOMNodePointer2.namespaceIterator();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2147483648) + "'", int9 == (-2147483648));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(nodeIterator13);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "id('http://www.w3.org/XML/1998/namespace')");
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale5);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator7 = jDOMNodePointer6.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale11);
        java.lang.Object obj13 = jDOMNodePointer12.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer6.childIterator(nodeTest8, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer12);
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale16);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = jDOMNodePointer17.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest19 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale22);
        java.lang.Object obj24 = jDOMNodePointer23.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator25 = jDOMNodePointer17.childIterator(nodeTest19, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer23);
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale27);
        int int29 = jDOMNodePointer12.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer17, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer28);
        org.w3c.dom.Node node30 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer31 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer28, node30);
        java.lang.String str33 = dOMNodePointer31.getNamespaceURI("hi!");
        java.lang.String str34 = dOMNodePointer31.getDefaultNamespaceURI();
        boolean boolean35 = dOMNodePointer31.isCollection();
        boolean boolean36 = dOMNodePointer3.equals((java.lang.Object) dOMNodePointer31);
        boolean boolean37 = dOMNodePointer3.isContainer();
        java.util.Locale locale38 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) dOMNodePointer3, locale38, "id('http://www.w3.org/XML/1998/namespace')/namespace::http://www.w3.org/XML/1998/namespace");
        org.junit.Assert.assertNotNull(nodeIterator7);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1L) + "'", obj24, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer13.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale18);
        java.lang.Object obj20 = jDOMNodePointer19.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator21 = jDOMNodePointer13.childIterator(nodeTest15, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19);
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        int int25 = jDOMNodePointer8.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        org.w3c.dom.Node node26 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24, node26);
        int int28 = dOMNodePointer27.getLength();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest29 = null;
        boolean boolean30 = dOMNodePointer27.testNode(nodeTest29);
        java.lang.Object obj31 = null;
        boolean boolean32 = dOMNodePointer27.equals(obj31);
        java.lang.String str33 = dOMNodePointer27.getLanguage();
        org.apache.commons.jxpath.JXPathContext jXPathContext34 = null;
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale36);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator38 = jDOMNodePointer37.namespaceIterator();
        boolean boolean39 = jDOMNodePointer37.isRoot();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator40 = jDOMNodePointer37.namespaceIterator();
        java.util.Locale locale42 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer44 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale42, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj45 = jDOMNodePointer44.getRootNode();
        org.w3c.dom.Node node46 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer47 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer44, node46);
        boolean boolean48 = jDOMNodePointer44.isCollection();
        boolean boolean49 = jDOMNodePointer37.equals((java.lang.Object) boolean48);
        org.apache.commons.jxpath.ri.QName qName50 = jDOMNodePointer37.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer52 = dOMNodePointer27.createChild(jXPathContext34, qName50, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(nodeIterator38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(nodeIterator40);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 1.0d + "'", obj45, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(qName50);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale1, "http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = jDOMNodePointer3.namespacePointer("");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = jDOMNodePointer3.namespacePointer("http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        boolean boolean9 = jDOMNodePointer3.testNode(nodeTest8);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = jDOMNodePointer3.namespacePointer("id('http://www.w3.org/XML/1998/namespace')");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(nodePointer11);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale1, "http://www.w3.org/2000/xmlns/");
        int int4 = jDOMNodePointer3.getLength();
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) int4, locale5);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver7 = jDOMNodePointer6.getNamespaceResolver();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(namespaceResolver7);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale1, "http://www.w3.org/2000/xmlns/");
        boolean boolean4 = jDOMNodePointer3.isCollection();
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        java.lang.String str34 = dOMNodePointer32.getNamespaceURI("hi!");
        java.lang.String str36 = dOMNodePointer32.getNamespaceURI("hi!");
        java.util.Locale locale38 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer39 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale38);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest40 = null;
        java.util.Locale locale43 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer44 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale43);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator45 = jDOMNodePointer44.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest46 = null;
        java.util.Locale locale49 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer50 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale49);
        java.lang.Object obj51 = jDOMNodePointer50.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator52 = jDOMNodePointer44.childIterator(nodeTest46, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer50);
        java.util.Locale locale54 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer55 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale54);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator56 = jDOMNodePointer55.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest57 = null;
        java.util.Locale locale60 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer61 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale60);
        java.lang.Object obj62 = jDOMNodePointer61.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator63 = jDOMNodePointer55.childIterator(nodeTest57, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer61);
        java.util.Locale locale65 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer66 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale65);
        int int67 = jDOMNodePointer50.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer55, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer66);
        org.w3c.dom.Node node68 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer69 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer66, node68);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator70 = jDOMNodePointer39.childIterator(nodeTest40, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer69);
        java.lang.Object obj71 = dOMNodePointer69.getImmediateNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest72 = null;
        boolean boolean73 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32, (java.lang.Object) dOMNodePointer69, nodeTest72);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest74 = null;
        boolean boolean75 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, (java.lang.Object) nodeTest72, nodeTest74);
        java.lang.Object obj76 = jDOMNodePointer3.getBaseValue();
        java.lang.String str78 = jDOMNodePointer3.getNamespaceURI("/namespace::");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(nodeIterator45);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (-1L) + "'", obj51, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator52);
        org.junit.Assert.assertNotNull(nodeIterator56);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + (-1L) + "'", obj62, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator63);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(nodeIterator70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + 1.0f + "'", obj76, 1.0f);
        org.junit.Assert.assertNull(str78);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        int int11 = jDOMNodePointer2.getLength();
        org.w3c.dom.Node node12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node12, locale13, "<<unknown namespace>>");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = dOMNodePointer15.getParent();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, (java.lang.Object) dOMNodePointer15);
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) dOMNodePointer15, locale18);
        boolean boolean20 = dOMNodePointer15.isActual();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = dOMNodePointer15.isLeaf();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(nodePointer16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer13.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale18);
        java.lang.Object obj20 = jDOMNodePointer19.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator21 = jDOMNodePointer13.childIterator(nodeTest15, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19);
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        int int25 = jDOMNodePointer8.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        org.w3c.dom.Node node26 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24, node26);
        java.lang.String str29 = dOMNodePointer27.getNamespaceURI("hi!");
        java.lang.Object obj30 = null;
        boolean boolean31 = dOMNodePointer27.equals(obj30);
        java.lang.Object obj32 = dOMNodePointer27.getNodeValue();
        int int33 = dOMNodePointer27.getLength();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer13.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale18);
        java.lang.Object obj20 = jDOMNodePointer19.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator21 = jDOMNodePointer13.childIterator(nodeTest15, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19);
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        int int25 = jDOMNodePointer8.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        int int26 = jDOMNodePointer24.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = jDOMNodePointer24.getImmediateParentPointer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = jDOMNodePointer24.isLanguage("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNull(nodePointer27);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 0, locale1, "hi!");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer13.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale18);
        java.lang.Object obj20 = jDOMNodePointer19.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator21 = jDOMNodePointer13.childIterator(nodeTest15, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19);
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator25 = jDOMNodePointer24.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest26 = null;
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer30 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale29);
        java.lang.Object obj31 = jDOMNodePointer30.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator32 = jDOMNodePointer24.childIterator(nodeTest26, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer30);
        java.util.Locale locale34 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer35 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale34);
        int int36 = jDOMNodePointer19.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer35);
        org.w3c.dom.Node node37 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer38 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer35, node37);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator39 = jDOMNodePointer8.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer38);
        java.lang.Object obj40 = dOMNodePointer38.getNodeValue();
        boolean boolean41 = dOMNodePointer38.isAttribute();
        java.lang.String str42 = dOMNodePointer38.getDefaultNamespaceURI();
        boolean boolean43 = dOMNodePointer38.isActual();
        boolean boolean44 = dOMNodePointer38.isRoot();
        java.lang.Object obj45 = dOMNodePointer38.getImmediateNode();
        java.lang.String str46 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName((java.lang.Object) dOMNodePointer38);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator47 = jDOMNodePointer3.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer38);
        java.util.Locale locale49 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer51 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale49, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj52 = jDOMNodePointer51.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer54 = jDOMNodePointer51.namespacePointer("");
        java.lang.Object obj55 = jDOMNodePointer51.getImmediateNode();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer56 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, obj55);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertNotNull(nodeIterator25);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (-1L) + "'", obj31, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(nodeIterator39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(nodeIterator47);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 1.0d + "'", obj52, 1.0d);
        org.junit.Assert.assertNotNull(nodePointer54);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 1.0d + "'", obj55, 1.0d);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer13.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale18);
        java.lang.Object obj20 = jDOMNodePointer19.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator21 = jDOMNodePointer13.childIterator(nodeTest15, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19);
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        int int25 = jDOMNodePointer8.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        org.w3c.dom.Node node26 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24, node26);
        boolean boolean28 = dOMNodePointer27.isActual();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = dOMNodePointer27.isLanguage("id('id(&apos;hi!&apos;)')");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer13.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale18);
        java.lang.Object obj20 = jDOMNodePointer19.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator21 = jDOMNodePointer13.childIterator(nodeTest15, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19);
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        int int25 = jDOMNodePointer8.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        org.w3c.dom.Node node26 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24, node26);
        java.lang.String str29 = dOMNodePointer27.getNamespaceURI("hi!");
        java.lang.String str31 = dOMNodePointer27.getNamespaceURI("hi!");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = dOMNodePointer27.getValuePointer();
        java.util.Locale locale34 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer35 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale34);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest36 = null;
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale39);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator41 = jDOMNodePointer40.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest42 = null;
        java.util.Locale locale45 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer46 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale45);
        java.lang.Object obj47 = jDOMNodePointer46.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator48 = jDOMNodePointer40.childIterator(nodeTest42, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer46);
        java.util.Locale locale50 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer51 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale50);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator52 = jDOMNodePointer51.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest53 = null;
        java.util.Locale locale56 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer57 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale56);
        java.lang.Object obj58 = jDOMNodePointer57.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator59 = jDOMNodePointer51.childIterator(nodeTest53, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer57);
        java.util.Locale locale61 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer62 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale61);
        int int63 = jDOMNodePointer46.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer51, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer62);
        org.w3c.dom.Node node64 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer65 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer62, node64);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator66 = jDOMNodePointer35.childIterator(nodeTest36, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer65);
        java.lang.Object obj67 = dOMNodePointer65.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer68 = dOMNodePointer65.getImmediateValuePointer();
        org.w3c.dom.Node node69 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer70 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer65, node69);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer71 = dOMNodePointer65.getImmediateValuePointer();
        boolean boolean72 = dOMNodePointer27.equals((java.lang.Object) nodePointer71);
        boolean boolean73 = dOMNodePointer27.isCollection();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(nodePointer32);
        org.junit.Assert.assertNotNull(nodeIterator41);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (-1L) + "'", obj47, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator48);
        org.junit.Assert.assertNotNull(nodeIterator52);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (-1L) + "'", obj58, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator59);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(nodeIterator66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(nodePointer68);
        org.junit.Assert.assertNotNull(nodePointer71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        boolean boolean4 = jDOMNodePointer2.isRoot();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator5 = jDOMNodePointer2.namespaceIterator();
        boolean boolean6 = jDOMNodePointer2.isNode();
        java.util.Locale locale7 = jDOMNodePointer2.getLocale();
        jDOMNodePointer2.setAttribute(false);
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodeIterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(locale7);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 0, locale1, "hi!");
        boolean boolean4 = jDOMNodePointer3.isRoot();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver5 = jDOMNodePointer3.getNamespaceResolver();
        org.w3c.dom.Node node6 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer7 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, node6);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = dOMNodePointer7.getImmediateValuePointer();
        int int9 = dOMNodePointer7.getLength();
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale11);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale16);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = jDOMNodePointer17.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest19 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale22);
        java.lang.Object obj24 = jDOMNodePointer23.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator25 = jDOMNodePointer17.childIterator(nodeTest19, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer23);
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale27);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator29 = jDOMNodePointer28.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest30 = null;
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale33);
        java.lang.Object obj35 = jDOMNodePointer34.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator36 = jDOMNodePointer28.childIterator(nodeTest30, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer34);
        java.util.Locale locale38 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer39 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale38);
        int int40 = jDOMNodePointer23.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer28, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer39);
        org.w3c.dom.Node node41 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer42 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer39, node41);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator43 = jDOMNodePointer12.childIterator(nodeTest13, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer42);
        java.lang.Object obj44 = dOMNodePointer42.getNodeValue();
        boolean boolean45 = dOMNodePointer42.isAttribute();
        java.lang.String str46 = dOMNodePointer42.getDefaultNamespaceURI();
        int int47 = dOMNodePointer7.compareTo((java.lang.Object) dOMNodePointer42);
        int int48 = dOMNodePointer42.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer50 = dOMNodePointer42.namespacePointer("id('hi!')");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(namespaceResolver5);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1L) + "'", obj24, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator25);
        org.junit.Assert.assertNotNull(nodeIterator29);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (-1L) + "'", obj35, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(nodeIterator43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(nodePointer50);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "id('hi!')");
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale5);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator7 = jDOMNodePointer6.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale11);
        java.lang.Object obj13 = jDOMNodePointer12.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer6.childIterator(nodeTest8, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer12);
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale16);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = jDOMNodePointer17.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest19 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale22);
        java.lang.Object obj24 = jDOMNodePointer23.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator25 = jDOMNodePointer17.childIterator(nodeTest19, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer23);
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale27);
        int int29 = jDOMNodePointer12.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer17, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer28);
        org.w3c.dom.Node node30 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer31 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer28, node30);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver32 = dOMNodePointer31.getNamespaceResolver();
        dOMNodePointer3.setNamespaceResolver(namespaceResolver32);
        org.w3c.dom.Node node34 = null;
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer36 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node34, locale35);
        java.lang.String str37 = dOMNodePointer36.getDefaultNamespaceURI();
        java.lang.String str39 = dOMNodePointer36.getNamespaceURI("http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, (java.lang.Object) str39);
        org.apache.commons.jxpath.JXPathContext jXPathContext41 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = dOMNodePointer3.createPath(jXPathContext41);
        int int43 = nodePointer42.getIndex();
        java.util.Locale locale44 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer46 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) int43, locale44, "id('hi!')");
        java.util.Locale locale47 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer49 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) locale44, locale47, "id('id(&apos;http://www.w3.org/XML/1998/namespace&apos;)')");
        org.junit.Assert.assertNotNull(nodeIterator7);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1L) + "'", obj24, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(namespaceResolver32);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(nodePointer42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-2147483648) + "'", int43 == (-2147483648));
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest34 = null;
        boolean boolean35 = jDOMNodePointer2.testNode(nodeTest34);
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer2, locale36);
        boolean boolean38 = jDOMNodePointer2.isContainer();
        java.lang.Object obj39 = jDOMNodePointer2.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator40 = jDOMNodePointer2.namespaceIterator();
        java.lang.String str41 = jDOMNodePointer2.toString();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver42 = jDOMNodePointer2.getNamespaceResolver();
        java.util.Locale locale43 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer45 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer2, locale43, "id('id(&apos;http://www.w3.org/2000/xmlns/&apos;)')");
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (-1L) + "'", obj39, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(namespaceResolver42);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        java.lang.Object obj34 = dOMNodePointer32.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = dOMNodePointer32.getImmediateValuePointer();
        org.w3c.dom.Node node36 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer37 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32, node36);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = dOMNodePointer32.getImmediateValuePointer();
        boolean boolean39 = dOMNodePointer32.isActual();
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertNotNull(nodePointer38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale35);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator37 = jDOMNodePointer36.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest38 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer42 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale41);
        java.lang.Object obj43 = jDOMNodePointer42.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator44 = jDOMNodePointer36.childIterator(nodeTest38, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer42);
        boolean boolean45 = dOMNodePointer32.equals((java.lang.Object) jDOMNodePointer36);
        java.lang.Object obj46 = dOMNodePointer32.getImmediateNode();
        java.lang.String str48 = dOMNodePointer32.getNamespaceURI("http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer49 = dOMNodePointer32.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer50 = dOMNodePointer32.getImmediateParentPointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str51 = dOMNodePointer32.getNamespaceURI();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertNotNull(nodeIterator37);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (-1L) + "'", obj43, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(nodePointer49);
        org.junit.Assert.assertNotNull(nodePointer50);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale1, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj4 = jDOMNodePointer3.getRootNode();
        org.w3c.dom.Node node5 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer6 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, node5);
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale8);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale13);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer14.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale19);
        java.lang.Object obj21 = jDOMNodePointer20.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator22 = jDOMNodePointer14.childIterator(nodeTest16, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer20);
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale24);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer25.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest27 = null;
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer31 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale30);
        java.lang.Object obj32 = jDOMNodePointer31.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer25.childIterator(nodeTest27, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer31);
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale35);
        int int37 = jDOMNodePointer20.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer25, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer36);
        org.w3c.dom.Node node38 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer39 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer36, node38);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator40 = jDOMNodePointer9.childIterator(nodeTest10, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer39);
        java.lang.Object obj41 = dOMNodePointer39.getBaseValue();
        boolean boolean42 = jDOMNodePointer3.equals((java.lang.Object) dOMNodePointer39);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest43 = null;
        java.util.Locale locale46 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer47 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale46);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator48 = jDOMNodePointer47.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest49 = null;
        java.util.Locale locale52 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer53 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale52);
        java.lang.Object obj54 = jDOMNodePointer53.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator55 = jDOMNodePointer47.childIterator(nodeTest49, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer53);
        java.util.Locale locale57 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer58 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale57);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator59 = jDOMNodePointer58.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest60 = null;
        java.util.Locale locale63 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer64 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale63);
        java.lang.Object obj65 = jDOMNodePointer64.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator66 = jDOMNodePointer58.childIterator(nodeTest60, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer64);
        java.util.Locale locale68 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer69 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale68);
        int int70 = jDOMNodePointer53.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer58, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer69);
        org.w3c.dom.Node node71 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer72 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer69, node71);
        int int73 = dOMNodePointer72.getLength();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest74 = null;
        java.util.Locale locale77 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer78 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale77);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer80 = jDOMNodePointer78.namespacePointer("http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator81 = dOMNodePointer72.childIterator(nodeTest74, false, nodePointer80);
        java.lang.Object obj82 = dOMNodePointer72.getBaseValue();
        java.util.Locale locale83 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer85 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) dOMNodePointer72, locale83, "id('http://www.w3.org/2000/xmlns/')");
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator86 = dOMNodePointer39.childIterator(nodeTest43, false, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer72);
        int int87 = dOMNodePointer39.getLength();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0d + "'", obj4, 1.0d);
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1L) + "'", obj21, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator22);
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (-1L) + "'", obj32, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(nodeIterator40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(nodeIterator48);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (-1L) + "'", obj54, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator55);
        org.junit.Assert.assertNotNull(nodeIterator59);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (-1L) + "'", obj65, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator66);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(nodePointer80);
        org.junit.Assert.assertNotNull(nodeIterator81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNotNull(nodeIterator86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        java.lang.Object obj0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(obj0, locale1, "id('id(&apos;http://www.w3.org/XML/1998/namespace&apos;)')");
        boolean boolean4 = jDOMNodePointer3.isCollection();
        boolean boolean5 = jDOMNodePointer3.isLeaf();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        boolean boolean4 = jDOMNodePointer2.isRoot();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator5 = jDOMNodePointer2.namespaceIterator();
        boolean boolean6 = jDOMNodePointer2.isNode();
        java.lang.Object obj7 = jDOMNodePointer2.getImmediateNode();
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale9);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator11 = jDOMNodePointer10.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale15);
        java.lang.Object obj17 = jDOMNodePointer16.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = jDOMNodePointer10.childIterator(nodeTest12, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer16);
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale20);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator22 = jDOMNodePointer21.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest23 = null;
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale26);
        java.lang.Object obj28 = jDOMNodePointer27.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator29 = jDOMNodePointer21.childIterator(nodeTest23, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer27);
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale31);
        int int33 = jDOMNodePointer16.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer21, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer32);
        org.w3c.dom.Node node34 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer35 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer32, node34);
        java.lang.String str37 = dOMNodePointer35.getNamespaceURI("hi!");
        java.lang.String str38 = dOMNodePointer35.getDefaultNamespaceURI();
        boolean boolean39 = dOMNodePointer35.isCollection();
        java.lang.String str41 = dOMNodePointer35.getNamespaceURI("id('hi!')");
        boolean boolean42 = dOMNodePointer35.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer44 = dOMNodePointer35.namespacePointer("http://www.w3.org/XML/1998/namespace");
        boolean boolean45 = dOMNodePointer35.isActual();
        // The following exception was thrown during execution in test generation
        try {
            jDOMNodePointer2.setValue((java.lang.Object) dOMNodePointer35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class org.jdom.Element (java.lang.Long is in module java.base of loader 'bootstrap'; org.jdom.Element is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodeIterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1L) + "'", obj7, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator11);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1L) + "'", obj17, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertNotNull(nodeIterator22);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1L) + "'", obj28, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(nodePointer44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 0, locale1, "hi!");
        boolean boolean4 = jDOMNodePointer3.isRoot();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver5 = jDOMNodePointer3.getNamespaceResolver();
        org.w3c.dom.Node node6 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer7 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, node6);
        java.lang.Object obj8 = dOMNodePointer7.getNodeValue();
        org.apache.commons.jxpath.JXPathContext jXPathContext9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = dOMNodePointer7.createPath(jXPathContext9);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = dOMNodePointer7.getValuePointer();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(namespaceResolver5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(nodePointer11);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        boolean boolean11 = jDOMNodePointer2.isLeaf();
        java.util.Locale locale12 = jDOMNodePointer2.getLocale();
        java.lang.Object obj13 = jDOMNodePointer2.getBaseValue();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        boolean boolean15 = jDOMNodePointer2.testNode(nodeTest14);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        int int27 = jDOMNodePointer18.getLength();
        org.w3c.dom.Node node28 = null;
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer31 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node28, locale29, "<<unknown namespace>>");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = dOMNodePointer31.getParent();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer33 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (java.lang.Object) dOMNodePointer31);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, (java.lang.Object) dOMNodePointer31);
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale36);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator38 = jDOMNodePointer37.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest39 = null;
        java.util.Locale locale42 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer43 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale42);
        java.lang.Object obj44 = jDOMNodePointer43.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator45 = jDOMNodePointer37.childIterator(nodeTest39, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer43);
        java.util.Locale locale47 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer48 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale47);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator49 = jDOMNodePointer48.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest50 = null;
        java.util.Locale locale53 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer54 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale53);
        java.lang.Object obj55 = jDOMNodePointer54.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator56 = jDOMNodePointer48.childIterator(nodeTest50, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer54);
        java.util.Locale locale58 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer59 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale58);
        int int60 = jDOMNodePointer43.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer48, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer59);
        org.w3c.dom.Node node61 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer62 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer59, node61);
        int int63 = dOMNodePointer62.getLength();
        java.util.Locale locale65 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer66 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale65);
        java.lang.Object obj67 = jDOMNodePointer66.getValue();
        java.util.Locale locale68 = jDOMNodePointer66.getLocale();
        int int69 = dOMNodePointer62.compareTo((java.lang.Object) jDOMNodePointer66);
        org.apache.commons.jxpath.ri.QName qName70 = jDOMNodePointer66.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator71 = dOMNodePointer31.attributeIterator(qName70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(locale12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(nodePointer32);
        org.junit.Assert.assertNotNull(nodeIterator38);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (-1L) + "'", obj44, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator45);
        org.junit.Assert.assertNotNull(nodeIterator49);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (-1L) + "'", obj55, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator56);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(locale68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(qName70);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        boolean boolean4 = jDOMNodePointer2.isRoot();
        boolean boolean5 = jDOMNodePointer2.isLeaf();
        java.lang.Object obj6 = jDOMNodePointer2.clone();
        int int7 = jDOMNodePointer2.getLength();
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale9);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale14);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator16 = jDOMNodePointer15.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale20);
        java.lang.Object obj22 = jDOMNodePointer21.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator23 = jDOMNodePointer15.childIterator(nodeTest17, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer21);
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale25);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator27 = jDOMNodePointer26.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest28 = null;
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale31);
        java.lang.Object obj33 = jDOMNodePointer32.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator34 = jDOMNodePointer26.childIterator(nodeTest28, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer32);
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale36);
        int int38 = jDOMNodePointer21.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer26, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer37);
        org.w3c.dom.Node node39 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer40 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer37, node39);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator41 = jDOMNodePointer10.childIterator(nodeTest11, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer40);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest42 = null;
        boolean boolean43 = jDOMNodePointer10.testNode(nodeTest42);
        java.lang.String str44 = jDOMNodePointer10.toString();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver45 = jDOMNodePointer10.getNamespaceResolver();
        jDOMNodePointer2.setNamespaceResolver(namespaceResolver45);
        int int47 = jDOMNodePointer2.getLength();
        java.lang.Object obj48 = jDOMNodePointer2.getRootNode();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver49 = jDOMNodePointer2.getNamespaceResolver();
        org.w3c.dom.Node node50 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer51 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, node50);
        java.lang.Object obj52 = jDOMNodePointer2.getImmediateNode();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(nodeIterator16);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1L) + "'", obj22, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator23);
        org.junit.Assert.assertNotNull(nodeIterator27);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (-1L) + "'", obj33, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(nodeIterator41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(namespaceResolver45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (-1L) + "'", obj48, (-1L));
        org.junit.Assert.assertNotNull(namespaceResolver49);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + (-1L) + "'", obj52, (-1L));
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        boolean boolean11 = jDOMNodePointer2.isLeaf();
        java.lang.Object obj12 = jDOMNodePointer2.getRootNode();
        jDOMNodePointer2.setIndex((int) '#');
        java.lang.Object obj15 = jDOMNodePointer2.getValue();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1L) + "'", obj12, (-1L));
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer13.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale18);
        java.lang.Object obj20 = jDOMNodePointer19.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator21 = jDOMNodePointer13.childIterator(nodeTest15, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19);
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        int int25 = jDOMNodePointer8.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        org.w3c.dom.Node node26 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24, node26);
        boolean boolean28 = dOMNodePointer27.isActual();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = dOMNodePointer27.getImmediateValuePointer();
        boolean boolean30 = dOMNodePointer27.isCollection();
        boolean boolean31 = dOMNodePointer27.isRoot();
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer35 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 0, locale33, "hi!");
        boolean boolean36 = jDOMNodePointer35.isRoot();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver37 = jDOMNodePointer35.getNamespaceResolver();
        boolean boolean38 = jDOMNodePointer35.isCollection();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver39 = jDOMNodePointer35.getNamespaceResolver();
        dOMNodePointer27.setNamespaceResolver(namespaceResolver39);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = dOMNodePointer27.namespacePointer("id('id(&apos;http://www.w3.org/2000/xmlns/&apos;)')");
        java.lang.String str43 = dOMNodePointer27.getLanguage();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(namespaceResolver37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(namespaceResolver39);
        org.junit.Assert.assertNotNull(nodePointer42);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest34 = null;
        boolean boolean35 = jDOMNodePointer2.testNode(nodeTest34);
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer2, locale36);
        boolean boolean38 = jDOMNodePointer37.isLeaf();
        java.util.Locale locale40 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer41 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale40);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest42 = null;
        java.util.Locale locale45 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer46 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale45);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator47 = jDOMNodePointer46.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest48 = null;
        java.util.Locale locale51 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer52 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale51);
        java.lang.Object obj53 = jDOMNodePointer52.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator54 = jDOMNodePointer46.childIterator(nodeTest48, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer52);
        java.util.Locale locale56 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer57 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale56);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator58 = jDOMNodePointer57.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest59 = null;
        java.util.Locale locale62 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer63 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale62);
        java.lang.Object obj64 = jDOMNodePointer63.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator65 = jDOMNodePointer57.childIterator(nodeTest59, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer63);
        java.util.Locale locale67 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer68 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale67);
        int int69 = jDOMNodePointer52.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer57, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer68);
        org.w3c.dom.Node node70 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer71 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer68, node70);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator72 = jDOMNodePointer41.childIterator(nodeTest42, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer71);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest73 = null;
        boolean boolean74 = jDOMNodePointer41.testNode(nodeTest73);
        java.util.Locale locale75 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer76 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer41, locale75);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver77 = jDOMNodePointer41.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer78 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer37, (java.lang.Object) jDOMNodePointer41);
        boolean boolean79 = jDOMNodePointer41.isAttribute();
        java.util.Locale locale80 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer82 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer41, locale80, "id('hi!')");
        java.lang.Object obj83 = jDOMNodePointer41.getImmediateNode();
        java.lang.String str85 = jDOMNodePointer41.getNamespaceURI("http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj86 = jDOMNodePointer41.clone();
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(nodeIterator47);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (-1L) + "'", obj53, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator54);
        org.junit.Assert.assertNotNull(nodeIterator58);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + (-1L) + "'", obj64, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator65);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(nodeIterator72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(namespaceResolver77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + (-1L) + "'", obj83, (-1L));
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertNotNull(obj86);
        org.junit.Assert.assertEquals(obj86.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj86), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj86), "");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale1, "http://www.w3.org/2000/xmlns/");
        boolean boolean4 = jDOMNodePointer3.isCollection();
        java.lang.Object obj5 = jDOMNodePointer3.getRootNode();
        java.lang.String str6 = jDOMNodePointer3.asPath();
        java.lang.Object obj7 = jDOMNodePointer3.getValue();
        int int8 = jDOMNodePointer3.getLength();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        org.w3c.dom.Node node11 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer13 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node11, locale12);
        int int14 = dOMNodePointer13.getLength();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer3.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer13);
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) true, locale16, "/namespace::id('http://www.w3.org/XML/1998/namespace')");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1.0f + "'", obj5, 1.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "id('http://www.w3.org/2000/xmlns/')" + "'", str6, "id('http://www.w3.org/2000/xmlns/')");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(nodeIterator15);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale35);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator37 = jDOMNodePointer36.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest38 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer42 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale41);
        java.lang.Object obj43 = jDOMNodePointer42.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator44 = jDOMNodePointer36.childIterator(nodeTest38, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer42);
        boolean boolean45 = dOMNodePointer32.equals((java.lang.Object) jDOMNodePointer36);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer47 = jDOMNodePointer36.namespacePointer("http://www.w3.org/XML/1998/namespace");
        java.util.Locale locale48 = jDOMNodePointer36.getLocale();
        boolean boolean49 = jDOMNodePointer36.isCollection();
        jDOMNodePointer36.setIndex((int) (byte) 10);
        boolean boolean52 = jDOMNodePointer36.isCollection();
        org.w3c.dom.Node node53 = null;
        java.util.Locale locale54 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer56 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node53, locale54, "");
        java.lang.String str57 = dOMNodePointer56.getLanguage();
        boolean boolean58 = jDOMNodePointer36.equals((java.lang.Object) dOMNodePointer56);
        java.lang.Object obj59 = dOMNodePointer56.getImmediateNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.QName qName60 = dOMNodePointer56.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertNotNull(nodeIterator37);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (-1L) + "'", obj43, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(nodePointer47);
        org.junit.Assert.assertNull(locale48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale35);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator37 = jDOMNodePointer36.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest38 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer42 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale41);
        java.lang.Object obj43 = jDOMNodePointer42.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator44 = jDOMNodePointer36.childIterator(nodeTest38, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer42);
        boolean boolean45 = dOMNodePointer32.equals((java.lang.Object) jDOMNodePointer36);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer47 = jDOMNodePointer36.namespacePointer("http://www.w3.org/XML/1998/namespace");
        java.lang.String str48 = jDOMNodePointer36.getNamespaceURI();
        java.lang.String str49 = jDOMNodePointer36.asPath();
        jDOMNodePointer36.setIndex((int) (byte) 10);
        java.lang.Object obj52 = jDOMNodePointer36.getImmediateNode();
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertNotNull(nodeIterator37);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (-1L) + "'", obj43, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(nodePointer47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + (-1L) + "'", obj52, (-1L));
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        java.lang.Object obj34 = dOMNodePointer32.getImmediateNode();
        boolean boolean36 = dOMNodePointer32.equals((java.lang.Object) 10.0f);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = dOMNodePointer32.getParent();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = dOMNodePointer32.getImmediateParentPointer();
        java.util.Locale locale40 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer41 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale40);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator42 = jDOMNodePointer41.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest43 = null;
        java.util.Locale locale46 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer47 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale46);
        java.lang.Object obj48 = jDOMNodePointer47.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator49 = jDOMNodePointer41.childIterator(nodeTest43, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer47);
        java.util.Locale locale51 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer52 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale51);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator53 = jDOMNodePointer52.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest54 = null;
        java.util.Locale locale57 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer58 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale57);
        java.lang.Object obj59 = jDOMNodePointer58.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator60 = jDOMNodePointer52.childIterator(nodeTest54, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer58);
        java.util.Locale locale62 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer63 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale62);
        int int64 = jDOMNodePointer47.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer52, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer63);
        org.w3c.dom.Node node65 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer66 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer63, node65);
        java.lang.String str68 = dOMNodePointer66.getNamespaceURI("hi!");
        boolean boolean69 = dOMNodePointer32.equals((java.lang.Object) dOMNodePointer66);
        boolean boolean70 = dOMNodePointer66.isCollection();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer71 = dOMNodePointer66.getParent();
        nodePointer71.setIndex(1);
        org.w3c.dom.Node node74 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer75 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer71, node74);
        boolean boolean76 = nodePointer71.isNode();
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(nodePointer37);
        org.junit.Assert.assertNotNull(nodePointer38);
        org.junit.Assert.assertNotNull(nodeIterator42);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (-1L) + "'", obj48, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator49);
        org.junit.Assert.assertNotNull(nodeIterator53);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (-1L) + "'", obj59, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator60);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(nodePointer71);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer13.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale18);
        java.lang.Object obj20 = jDOMNodePointer19.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator21 = jDOMNodePointer13.childIterator(nodeTest15, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19);
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        int int25 = jDOMNodePointer8.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        org.apache.commons.jxpath.JXPathContext jXPathContext26 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = jDOMNodePointer24.createPath(jXPathContext26);
        boolean boolean28 = jDOMNodePointer24.isCollection();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator29 = jDOMNodePointer24.namespaceIterator();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(nodeIterator29);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer13.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale18);
        java.lang.Object obj20 = jDOMNodePointer19.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator21 = jDOMNodePointer13.childIterator(nodeTest15, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19);
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        int int25 = jDOMNodePointer8.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        org.w3c.dom.Node node26 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24, node26);
        java.lang.String str29 = dOMNodePointer27.getNamespaceURI("hi!");
        java.lang.String str30 = dOMNodePointer27.getDefaultNamespaceURI();
        boolean boolean31 = dOMNodePointer27.isCollection();
        java.lang.Object obj32 = dOMNodePointer27.getNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = dOMNodePointer27.getImmediateValuePointer();
        java.lang.Object obj34 = dOMNodePointer27.getNode();
        org.apache.commons.jxpath.JXPathContext jXPathContext35 = null;
        java.util.Locale locale37 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer38 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale37);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator39 = jDOMNodePointer38.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest40 = null;
        java.util.Locale locale43 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer44 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale43);
        java.lang.Object obj45 = jDOMNodePointer44.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator46 = jDOMNodePointer38.childIterator(nodeTest40, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer44);
        java.util.Locale locale48 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer49 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale48);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator50 = jDOMNodePointer49.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest51 = null;
        java.util.Locale locale54 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer55 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale54);
        java.lang.Object obj56 = jDOMNodePointer55.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator57 = jDOMNodePointer49.childIterator(nodeTest51, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer55);
        java.util.Locale locale59 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer60 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale59);
        int int61 = jDOMNodePointer44.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer49, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer60);
        org.w3c.dom.Node node62 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer63 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer60, node62);
        org.apache.commons.jxpath.ri.QName qName64 = jDOMNodePointer60.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer66 = dOMNodePointer27.createChild(jXPathContext35, qName64, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(nodePointer33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(nodeIterator39);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (-1L) + "'", obj45, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator46);
        org.junit.Assert.assertNotNull(nodeIterator50);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (-1L) + "'", obj56, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator57);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(qName64);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer13.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale18);
        java.lang.Object obj20 = jDOMNodePointer19.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator21 = jDOMNodePointer13.childIterator(nodeTest15, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19);
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        int int25 = jDOMNodePointer8.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        org.w3c.dom.Node node26 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24, node26);
        java.lang.String str29 = dOMNodePointer27.getNamespaceURI("hi!");
        boolean boolean30 = dOMNodePointer27.isAttribute();
        dOMNodePointer27.setAttribute(true);
        java.util.Locale locale33 = dOMNodePointer27.getLocale();
        java.util.Locale locale34 = dOMNodePointer27.getLocale();
        java.util.Locale locale35 = dOMNodePointer27.getLocale();
        java.lang.Object obj36 = dOMNodePointer27.getBaseValue();
        java.lang.String str37 = dOMNodePointer27.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.QName qName38 = dOMNodePointer27.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(locale33);
        org.junit.Assert.assertNull(locale34);
        org.junit.Assert.assertNull(locale35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        boolean boolean4 = jDOMNodePointer2.isRoot();
        boolean boolean5 = jDOMNodePointer2.isLeaf();
        java.lang.Object obj6 = jDOMNodePointer2.clone();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale10);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator12 = jDOMNodePointer11.namespaceIterator();
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer11, locale13, "http://www.w3.org/2000/xmlns/");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = jDOMNodePointer15.namespacePointer("hi!");
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = jDOMNodePointer2.childIterator(nodeTest7, false, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer15);
        java.lang.String str19 = jDOMNodePointer15.getNamespaceURI();
        boolean boolean20 = jDOMNodePointer15.isCollection();
        java.lang.Object obj21 = jDOMNodePointer15.getBaseValue();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "");
        org.junit.Assert.assertNotNull(nodeIterator12);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale35);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator37 = jDOMNodePointer36.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest38 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer42 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale41);
        java.lang.Object obj43 = jDOMNodePointer42.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator44 = jDOMNodePointer36.childIterator(nodeTest38, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer42);
        boolean boolean45 = dOMNodePointer32.equals((java.lang.Object) jDOMNodePointer36);
        java.lang.Object obj46 = dOMNodePointer32.getImmediateNode();
        java.lang.String str48 = dOMNodePointer32.getNamespaceURI("http://www.w3.org/XML/1998/namespace");
        boolean boolean49 = dOMNodePointer32.isCollection();
        int int50 = dOMNodePointer32.getLength();
        boolean boolean51 = dOMNodePointer32.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer53 = dOMNodePointer32.namespacePointer("id('id(&apos;http://www.w3.org/2000/xmlns/&apos;)')");
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertNotNull(nodeIterator37);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (-1L) + "'", obj43, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(nodePointer53);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 0, locale1, "hi!");
        org.w3c.dom.Node node4 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, node4);
        java.lang.Object obj6 = jDOMNodePointer3.getBaseValue();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest34 = null;
        boolean boolean35 = jDOMNodePointer2.testNode(nodeTest34);
        java.lang.Object obj36 = jDOMNodePointer2.getNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = jDOMNodePointer2.getParent();
        boolean boolean38 = jDOMNodePointer2.isLeaf();
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (-1L) + "'", obj36, (-1L));
        org.junit.Assert.assertNull(nodePointer37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest34 = null;
        boolean boolean35 = jDOMNodePointer2.testNode(nodeTest34);
        java.lang.Object obj36 = jDOMNodePointer2.getNode();
        boolean boolean37 = jDOMNodePointer2.isCollection();
        java.util.Locale locale38 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer39 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) boolean37, locale38);
        org.w3c.dom.Node node40 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer42 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node40, locale41);
        int int43 = dOMNodePointer42.getLength();
        java.lang.String str44 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix((java.lang.Object) dOMNodePointer42);
        boolean boolean45 = jDOMNodePointer39.equals((java.lang.Object) dOMNodePointer42);
        java.util.Locale locale47 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer48 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale47);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator49 = jDOMNodePointer48.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest50 = null;
        java.util.Locale locale53 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer54 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale53);
        java.lang.Object obj55 = jDOMNodePointer54.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator56 = jDOMNodePointer48.childIterator(nodeTest50, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer54);
        java.util.Locale locale58 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer59 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale58);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator60 = jDOMNodePointer59.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest61 = null;
        java.util.Locale locale64 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer65 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale64);
        java.lang.Object obj66 = jDOMNodePointer65.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator67 = jDOMNodePointer59.childIterator(nodeTest61, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer65);
        java.util.Locale locale69 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer70 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale69);
        int int71 = jDOMNodePointer54.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer59, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer70);
        org.w3c.dom.Node node72 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer73 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer70, node72);
        int int74 = dOMNodePointer73.getLength();
        java.util.Locale locale75 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer76 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) int74, locale75);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver77 = jDOMNodePointer76.getNamespaceResolver();
        java.lang.Object obj78 = jDOMNodePointer76.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer79 = jDOMNodePointer76.getValuePointer();
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer42.setValue((java.lang.Object) nodePointer79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (-1L) + "'", obj36, (-1L));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(nodeIterator49);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (-1L) + "'", obj55, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator56);
        org.junit.Assert.assertNotNull(nodeIterator60);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + (-1L) + "'", obj66, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator67);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertNotNull(namespaceResolver77);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + 1 + "'", obj78, 1);
        org.junit.Assert.assertNotNull(nodePointer79);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer13.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale18);
        java.lang.Object obj20 = jDOMNodePointer19.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator21 = jDOMNodePointer13.childIterator(nodeTest15, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19);
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        int int25 = jDOMNodePointer8.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        org.w3c.dom.Node node26 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24, node26);
        java.lang.String str29 = dOMNodePointer27.getNamespaceURI("hi!");
        java.lang.String str30 = dOMNodePointer27.getDefaultNamespaceURI();
        boolean boolean31 = dOMNodePointer27.isCollection();
        java.lang.String str33 = dOMNodePointer27.getNamespaceURI("id('hi!')");
        boolean boolean34 = dOMNodePointer27.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer36 = dOMNodePointer27.namespacePointer("http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.JXPathContext jXPathContext37 = null;
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale39);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator41 = jDOMNodePointer40.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest42 = null;
        java.util.Locale locale45 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer46 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale45);
        java.lang.Object obj47 = jDOMNodePointer46.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator48 = jDOMNodePointer40.childIterator(nodeTest42, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer46);
        java.util.Locale locale50 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer51 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale50);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator52 = jDOMNodePointer51.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest53 = null;
        java.util.Locale locale56 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer57 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale56);
        java.lang.Object obj58 = jDOMNodePointer57.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator59 = jDOMNodePointer51.childIterator(nodeTest53, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer57);
        java.util.Locale locale61 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer62 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale61);
        int int63 = jDOMNodePointer46.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer51, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer62);
        org.w3c.dom.Node node64 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer65 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer62, node64);
        int int66 = dOMNodePointer65.getLength();
        java.util.Locale locale68 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer69 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale68);
        java.lang.Object obj70 = jDOMNodePointer69.getValue();
        java.util.Locale locale71 = jDOMNodePointer69.getLocale();
        int int72 = dOMNodePointer65.compareTo((java.lang.Object) jDOMNodePointer69);
        org.apache.commons.jxpath.ri.QName qName73 = jDOMNodePointer69.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer75 = dOMNodePointer27.createChild(jXPathContext37, qName73, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(nodePointer36);
        org.junit.Assert.assertNotNull(nodeIterator41);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (-1L) + "'", obj47, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator48);
        org.junit.Assert.assertNotNull(nodeIterator52);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (-1L) + "'", obj58, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator59);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(locale71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(qName73);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale1, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj4 = jDOMNodePointer3.getRootNode();
        org.w3c.dom.Node node5 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer6 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, node5);
        dOMNodePointer6.setIndex((int) (byte) 0);
        java.lang.String str9 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName((java.lang.Object) dOMNodePointer6);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0d + "'", obj4, 1.0d);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer13.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale18);
        java.lang.Object obj20 = jDOMNodePointer19.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator21 = jDOMNodePointer13.childIterator(nodeTest15, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19);
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        int int25 = jDOMNodePointer8.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        org.w3c.dom.Node node26 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24, node26);
        java.lang.String str29 = dOMNodePointer27.getNamespaceURI("hi!");
        java.lang.String str31 = dOMNodePointer27.getNamespaceURI("hi!");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = dOMNodePointer27.getValuePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = dOMNodePointer27.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(nodePointer32);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale1, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj4 = jDOMNodePointer3.getRootNode();
        org.w3c.dom.Node node5 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer6 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, node5);
        dOMNodePointer6.setIndex((int) (byte) 0);
        java.util.Locale locale9 = dOMNodePointer6.getLocale();
        int int10 = dOMNodePointer6.getIndex();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0d + "'", obj4, 1.0d);
        org.junit.Assert.assertNull(locale9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = jDOMNodePointer2.namespacePointer("http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj5 = jDOMNodePointer2.getValue();
        java.lang.String str6 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix((java.lang.Object) jDOMNodePointer2);
        boolean boolean7 = jDOMNodePointer2.isNode();
        jDOMNodePointer2.setIndex((int) 'a');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = jDOMNodePointer2.namespacePointer("");
        boolean boolean12 = jDOMNodePointer2.isRoot();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 0, locale1, "hi!");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = jDOMNodePointer3.testNode(nodeTest4);
        java.lang.Object obj6 = jDOMNodePointer3.getBaseValue();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale10);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale15);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator17 = jDOMNodePointer16.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest18 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale21);
        java.lang.Object obj23 = jDOMNodePointer22.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator24 = jDOMNodePointer16.childIterator(nodeTest18, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer22);
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale26);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator28 = jDOMNodePointer27.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest29 = null;
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer33 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale32);
        java.lang.Object obj34 = jDOMNodePointer33.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator35 = jDOMNodePointer27.childIterator(nodeTest29, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer33);
        java.util.Locale locale37 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer38 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale37);
        int int39 = jDOMNodePointer22.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer27, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer38);
        org.w3c.dom.Node node40 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer41 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer38, node40);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator42 = jDOMNodePointer11.childIterator(nodeTest12, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer41);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest43 = null;
        boolean boolean44 = jDOMNodePointer11.testNode(nodeTest43);
        java.lang.String str45 = jDOMNodePointer11.toString();
        java.util.Locale locale46 = jDOMNodePointer11.getLocale();
        java.util.Locale locale47 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer48 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) locale46, locale47);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator49 = jDOMNodePointer3.childIterator(nodeTest7, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer48);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest50 = null;
        boolean boolean51 = jDOMNodePointer3.testNode(nodeTest50);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (byte) 0 + "'", obj6, (byte) 0);
        org.junit.Assert.assertNotNull(nodeIterator17);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1L) + "'", obj23, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator24);
        org.junit.Assert.assertNotNull(nodeIterator28);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (-1L) + "'", obj34, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(nodeIterator42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNull(locale46);
        org.junit.Assert.assertNotNull(nodeIterator49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        boolean boolean4 = jDOMNodePointer2.isRoot();
        boolean boolean5 = jDOMNodePointer2.isLeaf();
        java.lang.Object obj6 = jDOMNodePointer2.clone();
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale8);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale13);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer14.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale19);
        java.lang.Object obj21 = jDOMNodePointer20.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator22 = jDOMNodePointer14.childIterator(nodeTest16, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer20);
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale24);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer25.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest27 = null;
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer31 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale30);
        java.lang.Object obj32 = jDOMNodePointer31.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer25.childIterator(nodeTest27, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer31);
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale35);
        int int37 = jDOMNodePointer20.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer25, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer36);
        org.w3c.dom.Node node38 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer39 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer36, node38);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator40 = jDOMNodePointer9.childIterator(nodeTest10, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer39);
        java.lang.Object obj41 = dOMNodePointer39.getImmediateNode();
        boolean boolean43 = dOMNodePointer39.equals((java.lang.Object) 10.0f);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer44 = dOMNodePointer39.getParent();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer45 = dOMNodePointer39.getImmediateParentPointer();
        boolean boolean46 = dOMNodePointer39.isCollection();
        java.lang.Object obj47 = dOMNodePointer39.getImmediateNode();
        java.util.Locale locale49 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer50 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale49);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator51 = jDOMNodePointer50.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest52 = null;
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer56 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale55);
        java.lang.Object obj57 = jDOMNodePointer56.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator58 = jDOMNodePointer50.childIterator(nodeTest52, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer56);
        java.util.Locale locale60 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer61 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale60);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator62 = jDOMNodePointer61.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest63 = null;
        java.util.Locale locale66 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer67 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale66);
        java.lang.Object obj68 = jDOMNodePointer67.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator69 = jDOMNodePointer61.childIterator(nodeTest63, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer67);
        java.util.Locale locale71 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer72 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale71);
        int int73 = jDOMNodePointer56.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer61, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer72);
        org.w3c.dom.Node node74 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer75 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer72, node74);
        int int76 = dOMNodePointer75.getLength();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest77 = null;
        boolean boolean78 = dOMNodePointer75.testNode(nodeTest77);
        java.lang.Object obj79 = dOMNodePointer75.clone();
        int int80 = jDOMNodePointer2.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer39, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer75);
        dOMNodePointer75.setIndex(100);
        java.util.Locale locale83 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer85 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100, locale83, "");
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator86 = jDOMNodePointer85.namespaceIterator();
        java.lang.String str87 = jDOMNodePointer85.getNamespaceURI();
        org.w3c.dom.Node node88 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer89 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer85, node88);
        org.apache.commons.jxpath.ri.QName qName90 = jDOMNodePointer85.getName();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "");
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1L) + "'", obj21, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator22);
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (-1L) + "'", obj32, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(nodeIterator40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(nodePointer44);
        org.junit.Assert.assertNotNull(nodePointer45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(nodeIterator51);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (-1L) + "'", obj57, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator58);
        org.junit.Assert.assertNotNull(nodeIterator62);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + (-1L) + "'", obj68, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator69);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(nodeIterator86);
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertNotNull(qName90);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        java.lang.Object obj34 = dOMNodePointer32.getBaseValue();
        java.lang.Object obj35 = dOMNodePointer32.getRootNode();
        boolean boolean36 = dOMNodePointer32.isCollection();
        org.apache.commons.jxpath.JXPathContext jXPathContext37 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = dOMNodePointer32.createPath(jXPathContext37);
        java.lang.Object obj39 = dOMNodePointer32.getNodeValue();
        java.lang.String str40 = dOMNodePointer32.getLanguage();
        org.apache.commons.jxpath.JXPathContext jXPathContext41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer44 = dOMNodePointer32.getPointerByKey(jXPathContext41, "id('hi!')", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (-1L) + "'", obj35, (-1L));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(nodePointer38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        java.lang.Object obj34 = dOMNodePointer32.getNodeValue();
        boolean boolean35 = dOMNodePointer32.isAttribute();
        int int36 = dOMNodePointer32.getLength();
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale1, "http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = jDOMNodePointer3.namespacePointer("");
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer13.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale18);
        java.lang.Object obj20 = jDOMNodePointer19.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator21 = jDOMNodePointer13.childIterator(nodeTest15, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19);
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator25 = jDOMNodePointer24.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest26 = null;
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer30 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale29);
        java.lang.Object obj31 = jDOMNodePointer30.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator32 = jDOMNodePointer24.childIterator(nodeTest26, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer30);
        java.util.Locale locale34 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer35 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale34);
        int int36 = jDOMNodePointer19.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer35);
        org.w3c.dom.Node node37 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer38 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer35, node37);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator39 = jDOMNodePointer8.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer38);
        java.lang.Object obj40 = dOMNodePointer38.getNodeValue();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest41 = null;
        boolean boolean42 = dOMNodePointer38.testNode(nodeTest41);
        java.lang.String str43 = dOMNodePointer38.getDefaultNamespaceURI();
        java.lang.Object obj44 = dOMNodePointer38.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer46 = dOMNodePointer38.namespacePointer("");
        boolean boolean47 = jDOMNodePointer3.equals((java.lang.Object) dOMNodePointer38);
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertNotNull(nodeIterator25);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (-1L) + "'", obj31, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(nodeIterator39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(nodePointer46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest34 = null;
        boolean boolean35 = jDOMNodePointer2.testNode(nodeTest34);
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer2, locale36);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver38 = jDOMNodePointer2.getNamespaceResolver();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest39 = null;
        boolean boolean40 = jDOMNodePointer2.testNode(nodeTest39);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = jDOMNodePointer2.namespacePointer("http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer44 = jDOMNodePointer2.namespacePointer("http://www.w3.org/2000/xmlns/");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer45 = jDOMNodePointer2.getImmediateParentPointer();
        org.apache.commons.jxpath.ri.QName qName46 = jDOMNodePointer2.getName();
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(namespaceResolver38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(nodePointer42);
        org.junit.Assert.assertNotNull(nodePointer44);
        org.junit.Assert.assertNull(nodePointer45);
        org.junit.Assert.assertNotNull(qName46);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer13.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale18);
        java.lang.Object obj20 = jDOMNodePointer19.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator21 = jDOMNodePointer13.childIterator(nodeTest15, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19);
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        int int25 = jDOMNodePointer8.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        org.w3c.dom.Node node26 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24, node26);
        int int28 = dOMNodePointer27.getLength();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest29 = null;
        boolean boolean30 = dOMNodePointer27.testNode(nodeTest29);
        java.lang.Object obj31 = dOMNodePointer27.clone();
        boolean boolean32 = dOMNodePointer27.isActual();
        boolean boolean33 = dOMNodePointer27.isNode();
        java.lang.Object obj34 = dOMNodePointer27.clone();
        java.lang.String str35 = dOMNodePointer27.getDefaultNamespaceURI();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        java.lang.Object obj34 = dOMNodePointer32.getImmediateNode();
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale36);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest38 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer42 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale41);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator43 = jDOMNodePointer42.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest44 = null;
        java.util.Locale locale47 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer48 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale47);
        java.lang.Object obj49 = jDOMNodePointer48.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator50 = jDOMNodePointer42.childIterator(nodeTest44, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer48);
        java.util.Locale locale52 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer53 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale52);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator54 = jDOMNodePointer53.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest55 = null;
        java.util.Locale locale58 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer59 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale58);
        java.lang.Object obj60 = jDOMNodePointer59.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator61 = jDOMNodePointer53.childIterator(nodeTest55, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer59);
        java.util.Locale locale63 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer64 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale63);
        int int65 = jDOMNodePointer48.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer53, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer64);
        org.w3c.dom.Node node66 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer67 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer64, node66);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator68 = jDOMNodePointer37.childIterator(nodeTest38, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer67);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest69 = null;
        boolean boolean70 = jDOMNodePointer37.testNode(nodeTest69);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver71 = null;
        jDOMNodePointer37.setNamespaceResolver(namespaceResolver71);
        java.lang.Object obj73 = jDOMNodePointer37.getNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest74 = null;
        java.util.Locale locale77 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer78 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale77);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator79 = jDOMNodePointer78.namespaceIterator();
        java.util.Locale locale80 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer82 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer78, locale80, "http://www.w3.org/2000/xmlns/");
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator83 = jDOMNodePointer37.childIterator(nodeTest74, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer78);
        boolean boolean84 = dOMNodePointer32.equals((java.lang.Object) nodeTest74);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver85 = dOMNodePointer32.getNamespaceResolver();
        java.lang.String str87 = dOMNodePointer32.getNamespaceURI("/namespace::id('http://www.w3.org/XML/1998/namespace')");
        boolean boolean88 = dOMNodePointer32.isCollection();
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(nodeIterator43);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (-1L) + "'", obj49, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator50);
        org.junit.Assert.assertNotNull(nodeIterator54);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + (-1L) + "'", obj60, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(nodeIterator68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + (-1L) + "'", obj73, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator79);
        org.junit.Assert.assertNotNull(nodeIterator83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(namespaceResolver85);
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        boolean boolean4 = jDOMNodePointer2.isRoot();
        boolean boolean5 = jDOMNodePointer2.isLeaf();
        java.lang.Object obj6 = jDOMNodePointer2.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = jDOMNodePointer2.getImmediateValuePointer();
        java.lang.String str8 = jDOMNodePointer2.asPath();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "");
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        java.lang.Object obj34 = dOMNodePointer32.getBaseValue();
        java.lang.Object obj35 = dOMNodePointer32.getRootNode();
        java.lang.String str36 = dOMNodePointer32.getLanguage();
        java.lang.Object obj37 = dOMNodePointer32.getNodeValue();
        java.lang.Object obj38 = dOMNodePointer32.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer40 = dOMNodePointer32.namespacePointer("id('http://www.w3.org/2000/xmlns/')");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer41 = nodePointer40.getValuePointer();
        java.util.Locale locale42 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer43 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodePointer41, locale42);
        java.util.Locale locale45 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer47 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 0, locale45, "hi!");
        java.lang.Object obj48 = jDOMNodePointer47.getNodeValue();
        int int49 = jDOMNodePointer47.getIndex();
        boolean boolean50 = jDOMNodePointer43.equals((java.lang.Object) int49);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer51 = jDOMNodePointer43.getImmediateValuePointer();
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (-1L) + "'", obj35, (-1L));
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(nodePointer40);
        org.junit.Assert.assertNotNull(nodePointer41);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (byte) 0 + "'", obj48, (byte) 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-2147483648) + "'", int49 == (-2147483648));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(nodePointer51);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale1);
        java.lang.Object obj3 = jDOMNodePointer2.getValue();
        java.util.Locale locale4 = jDOMNodePointer2.getLocale();
        java.lang.Object obj5 = jDOMNodePointer2.getValue();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale9);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale14);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator16 = jDOMNodePointer15.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale20);
        java.lang.Object obj22 = jDOMNodePointer21.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator23 = jDOMNodePointer15.childIterator(nodeTest17, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer21);
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale25);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator27 = jDOMNodePointer26.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest28 = null;
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale31);
        java.lang.Object obj33 = jDOMNodePointer32.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator34 = jDOMNodePointer26.childIterator(nodeTest28, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer32);
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale36);
        int int38 = jDOMNodePointer21.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer26, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer37);
        org.w3c.dom.Node node39 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer40 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer37, node39);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator41 = jDOMNodePointer10.childIterator(nodeTest11, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer40);
        java.util.Locale locale43 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer44 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale43);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator45 = jDOMNodePointer44.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest46 = null;
        java.util.Locale locale49 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer50 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale49);
        java.lang.Object obj51 = jDOMNodePointer50.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator52 = jDOMNodePointer44.childIterator(nodeTest46, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer50);
        boolean boolean53 = dOMNodePointer40.equals((java.lang.Object) jDOMNodePointer44);
        java.lang.Object obj54 = dOMNodePointer40.getImmediateNode();
        java.lang.String str56 = dOMNodePointer40.getNamespaceURI("http://www.w3.org/XML/1998/namespace");
        boolean boolean57 = dOMNodePointer40.isCollection();
        dOMNodePointer40.setIndex((int) (short) 10);
        int int60 = dOMNodePointer40.getIndex();
        java.lang.Object obj61 = dOMNodePointer40.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator62 = jDOMNodePointer2.childIterator(nodeTest6, false, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer40);
        java.lang.Object obj63 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer64 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, obj63);
        int int65 = jDOMNodePointer2.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer67 = jDOMNodePointer2.namespacePointer("http://www.w3.org/2000/xmlns/");
        org.apache.commons.jxpath.JXPathContext jXPathContext68 = null;
        java.util.Locale locale70 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer71 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale70);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator72 = jDOMNodePointer71.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest73 = null;
        java.util.Locale locale76 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer77 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale76);
        java.lang.Object obj78 = jDOMNodePointer77.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator79 = jDOMNodePointer71.childIterator(nodeTest73, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer77);
        java.util.Locale locale81 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer82 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale81);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator83 = jDOMNodePointer82.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest84 = null;
        java.util.Locale locale87 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer88 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale87);
        java.lang.Object obj89 = jDOMNodePointer88.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator90 = jDOMNodePointer82.childIterator(nodeTest84, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer88);
        java.util.Locale locale92 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer93 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale92);
        int int94 = jDOMNodePointer77.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer82, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer93);
        org.apache.commons.jxpath.ri.QName qName95 = jDOMNodePointer93.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer96 = jDOMNodePointer2.createAttribute(jXPathContext68, qName95);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot create an attribute for path /@null, operation is not allowed for this type of node");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(nodeIterator16);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1L) + "'", obj22, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator23);
        org.junit.Assert.assertNotNull(nodeIterator27);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (-1L) + "'", obj33, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(nodeIterator41);
        org.junit.Assert.assertNotNull(nodeIterator45);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (-1L) + "'", obj51, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(nodeIterator62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(nodePointer67);
        org.junit.Assert.assertNotNull(nodeIterator72);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + (-1L) + "'", obj78, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator79);
        org.junit.Assert.assertNotNull(nodeIterator83);
        org.junit.Assert.assertEquals("'" + obj89 + "' != '" + (-1L) + "'", obj89, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator90);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertNotNull(qName95);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "");
        java.lang.String str4 = dOMNodePointer3.getLanguage();
        java.lang.Object obj5 = dOMNodePointer3.getNodeValue();
        int int6 = dOMNodePointer3.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = dOMNodePointer3.getImmediateParentPointer();
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 0, locale9, "hi!");
        boolean boolean12 = jDOMNodePointer11.isRoot();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver13 = jDOMNodePointer11.getNamespaceResolver();
        boolean boolean14 = jDOMNodePointer11.isCollection();
        java.lang.String str16 = jDOMNodePointer11.getNamespaceURI("http://www.w3.org/2000/xmlns/");
        java.lang.String str18 = jDOMNodePointer11.getNamespaceURI("id('hi!')");
        boolean boolean19 = dOMNodePointer3.equals((java.lang.Object) str18);
        java.lang.Object obj20 = dOMNodePointer3.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = dOMNodePointer3.getImmediateValuePointer();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(namespaceResolver13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(nodePointer21);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        java.util.Locale locale4 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer2, locale4, "http://www.w3.org/2000/xmlns/");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        boolean boolean8 = jDOMNodePointer2.testNode(nodeTest7);
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale10);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale15);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator17 = jDOMNodePointer16.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest18 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale21);
        java.lang.Object obj23 = jDOMNodePointer22.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator24 = jDOMNodePointer16.childIterator(nodeTest18, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer22);
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale26);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator28 = jDOMNodePointer27.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest29 = null;
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer33 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale32);
        java.lang.Object obj34 = jDOMNodePointer33.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator35 = jDOMNodePointer27.childIterator(nodeTest29, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer33);
        java.util.Locale locale37 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer38 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale37);
        int int39 = jDOMNodePointer22.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer27, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer38);
        org.w3c.dom.Node node40 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer41 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer38, node40);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator42 = jDOMNodePointer11.childIterator(nodeTest12, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer41);
        java.lang.Object obj43 = dOMNodePointer41.getImmediateNode();
        java.util.Locale locale45 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer46 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale45);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest47 = null;
        java.util.Locale locale50 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer51 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale50);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator52 = jDOMNodePointer51.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest53 = null;
        java.util.Locale locale56 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer57 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale56);
        java.lang.Object obj58 = jDOMNodePointer57.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator59 = jDOMNodePointer51.childIterator(nodeTest53, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer57);
        java.util.Locale locale61 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer62 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale61);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator63 = jDOMNodePointer62.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest64 = null;
        java.util.Locale locale67 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer68 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale67);
        java.lang.Object obj69 = jDOMNodePointer68.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator70 = jDOMNodePointer62.childIterator(nodeTest64, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer68);
        java.util.Locale locale72 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer73 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale72);
        int int74 = jDOMNodePointer57.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer62, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer73);
        org.w3c.dom.Node node75 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer76 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer73, node75);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator77 = jDOMNodePointer46.childIterator(nodeTest47, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer76);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest78 = null;
        boolean boolean79 = jDOMNodePointer46.testNode(nodeTest78);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver80 = null;
        jDOMNodePointer46.setNamespaceResolver(namespaceResolver80);
        java.lang.Object obj82 = jDOMNodePointer46.getNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest83 = null;
        java.util.Locale locale86 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer87 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale86);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator88 = jDOMNodePointer87.namespaceIterator();
        java.util.Locale locale89 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer91 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer87, locale89, "http://www.w3.org/2000/xmlns/");
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator92 = jDOMNodePointer46.childIterator(nodeTest83, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer87);
        boolean boolean93 = dOMNodePointer41.equals((java.lang.Object) nodeTest83);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver94 = dOMNodePointer41.getNamespaceResolver();
        boolean boolean95 = jDOMNodePointer2.equals((java.lang.Object) dOMNodePointer41);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver96 = dOMNodePointer41.getNamespaceResolver();
        boolean boolean97 = dOMNodePointer41.isCollection();
        java.lang.Class<?> wildcardClass98 = dOMNodePointer41.getClass();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(nodeIterator17);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1L) + "'", obj23, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator24);
        org.junit.Assert.assertNotNull(nodeIterator28);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (-1L) + "'", obj34, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(nodeIterator42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(nodeIterator52);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (-1L) + "'", obj58, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator59);
        org.junit.Assert.assertNotNull(nodeIterator63);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + (-1L) + "'", obj69, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator70);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(nodeIterator77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + (-1L) + "'", obj82, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator88);
        org.junit.Assert.assertNotNull(nodeIterator92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(namespaceResolver94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(namespaceResolver96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        boolean boolean11 = jDOMNodePointer2.isActual();
        java.lang.String str12 = jDOMNodePointer2.getNamespaceURI();
        java.lang.String str14 = jDOMNodePointer2.getNamespaceURI("<<unknown namespace>>");
        java.lang.Object obj15 = jDOMNodePointer2.getImmediateNode();
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest19 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale22);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator24 = jDOMNodePointer23.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest25 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        java.lang.Object obj30 = jDOMNodePointer29.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator31 = jDOMNodePointer23.childIterator(nodeTest25, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale33);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator35 = jDOMNodePointer34.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest36 = null;
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale39);
        java.lang.Object obj41 = jDOMNodePointer40.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator42 = jDOMNodePointer34.childIterator(nodeTest36, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer40);
        java.util.Locale locale44 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer45 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale44);
        int int46 = jDOMNodePointer29.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer34, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer45);
        org.w3c.dom.Node node47 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer48 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer45, node47);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator49 = jDOMNodePointer18.childIterator(nodeTest19, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer48);
        java.lang.Object obj50 = dOMNodePointer48.getImmediateNode();
        boolean boolean52 = dOMNodePointer48.equals((java.lang.Object) 10.0f);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer53 = dOMNodePointer48.getParent();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer54 = dOMNodePointer48.getImmediateParentPointer();
        java.lang.String str56 = dOMNodePointer48.getNamespaceURI("hi!");
        java.util.Locale locale58 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer59 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale58);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator60 = jDOMNodePointer59.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest61 = null;
        java.util.Locale locale64 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer65 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale64);
        java.lang.Object obj66 = jDOMNodePointer65.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator67 = jDOMNodePointer59.childIterator(nodeTest61, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer65);
        java.util.Locale locale69 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer70 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale69);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator71 = jDOMNodePointer70.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest72 = null;
        java.util.Locale locale75 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer76 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale75);
        java.lang.Object obj77 = jDOMNodePointer76.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator78 = jDOMNodePointer70.childIterator(nodeTest72, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer76);
        java.util.Locale locale80 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer81 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale80);
        int int82 = jDOMNodePointer65.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer70, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer81);
        org.w3c.dom.Node node83 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer84 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer81, node83);
        java.lang.String str86 = dOMNodePointer84.getNamespaceURI("hi!");
        java.lang.String str87 = dOMNodePointer84.getDefaultNamespaceURI();
        boolean boolean88 = dOMNodePointer48.equals((java.lang.Object) dOMNodePointer84);
        int int89 = dOMNodePointer48.getLength();
        boolean boolean90 = jDOMNodePointer2.equals((java.lang.Object) dOMNodePointer48);
        org.apache.commons.jxpath.JXPathContext jXPathContext91 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer93 = dOMNodePointer48.getPointerByID(jXPathContext91, "id('http://www.w3.org/XML/1998/namespace')");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1L) + "'", obj15, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator24);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1L) + "'", obj30, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator31);
        org.junit.Assert.assertNotNull(nodeIterator35);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (-1L) + "'", obj41, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(nodeIterator49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(nodePointer53);
        org.junit.Assert.assertNotNull(nodePointer54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(nodeIterator60);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + (-1L) + "'", obj66, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator67);
        org.junit.Assert.assertNotNull(nodeIterator71);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + (-1L) + "'", obj77, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator78);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest34 = null;
        boolean boolean35 = jDOMNodePointer2.testNode(nodeTest34);
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer2, locale36);
        int int38 = jDOMNodePointer2.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer40 = jDOMNodePointer2.namespacePointer("");
        java.util.Locale locale42 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer43 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale42);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator44 = jDOMNodePointer43.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest45 = null;
        java.util.Locale locale48 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer49 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale48);
        java.lang.Object obj50 = jDOMNodePointer49.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator51 = jDOMNodePointer43.childIterator(nodeTest45, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer49);
        java.util.Locale locale53 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer54 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale53);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator55 = jDOMNodePointer54.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest56 = null;
        java.util.Locale locale59 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer60 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale59);
        java.lang.Object obj61 = jDOMNodePointer60.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator62 = jDOMNodePointer54.childIterator(nodeTest56, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer60);
        java.util.Locale locale64 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer65 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale64);
        int int66 = jDOMNodePointer49.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer54, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer65);
        org.w3c.dom.Node node67 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer68 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer65, node67);
        int int69 = dOMNodePointer68.getLength();
        java.lang.String str71 = dOMNodePointer68.getNamespaceURI("id('hi!')");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest72 = null;
        boolean boolean73 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, (java.lang.Object) str71, nodeTest72);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator74 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer76 = jDOMNodePointer2.namespacePointer("id('hi!')");
        org.apache.commons.jxpath.JXPathContext jXPathContext77 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer78 = jDOMNodePointer2.createPath(jXPathContext77);
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(nodePointer40);
        org.junit.Assert.assertNotNull(nodeIterator44);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (-1L) + "'", obj50, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator51);
        org.junit.Assert.assertNotNull(nodeIterator55);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (-1L) + "'", obj61, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator62);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(nodeIterator74);
        org.junit.Assert.assertNotNull(nodePointer76);
        org.junit.Assert.assertNotNull(nodePointer78);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale35);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator37 = jDOMNodePointer36.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest38 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer42 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale41);
        java.lang.Object obj43 = jDOMNodePointer42.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator44 = jDOMNodePointer36.childIterator(nodeTest38, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer42);
        boolean boolean45 = dOMNodePointer32.equals((java.lang.Object) jDOMNodePointer36);
        java.lang.Object obj46 = dOMNodePointer32.getImmediateNode();
        int int47 = dOMNodePointer32.getLength();
        int int48 = dOMNodePointer32.getLength();
        java.util.Locale locale50 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer51 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale50);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest52 = null;
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer56 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale55);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator57 = jDOMNodePointer56.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest58 = null;
        java.util.Locale locale61 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer62 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale61);
        java.lang.Object obj63 = jDOMNodePointer62.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator64 = jDOMNodePointer56.childIterator(nodeTest58, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer62);
        java.util.Locale locale66 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer67 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale66);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator68 = jDOMNodePointer67.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest69 = null;
        java.util.Locale locale72 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer73 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale72);
        java.lang.Object obj74 = jDOMNodePointer73.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator75 = jDOMNodePointer67.childIterator(nodeTest69, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer73);
        java.util.Locale locale77 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer78 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale77);
        int int79 = jDOMNodePointer62.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer67, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer78);
        org.w3c.dom.Node node80 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer81 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer78, node80);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator82 = jDOMNodePointer51.childIterator(nodeTest52, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer81);
        java.lang.Object obj83 = jDOMNodePointer51.getValue();
        org.apache.commons.jxpath.ri.QName qName84 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator85 = jDOMNodePointer51.attributeIterator(qName84);
        int int86 = dOMNodePointer32.compareTo((java.lang.Object) jDOMNodePointer51);
        dOMNodePointer32.setAttribute(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str89 = dOMNodePointer32.asPath();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertNotNull(nodeIterator37);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (-1L) + "'", obj43, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(nodeIterator57);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + (-1L) + "'", obj63, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator64);
        org.junit.Assert.assertNotNull(nodeIterator68);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + (-1L) + "'", obj74, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator75);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(nodeIterator82);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(nodeIterator85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale1, "http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver4 = jDOMNodePointer3.getNamespaceResolver();
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale11);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator13 = jDOMNodePointer12.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        java.lang.Object obj19 = jDOMNodePointer18.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator20 = jDOMNodePointer12.childIterator(nodeTest14, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18);
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale22);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator24 = jDOMNodePointer23.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest25 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        java.lang.Object obj30 = jDOMNodePointer29.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator31 = jDOMNodePointer23.childIterator(nodeTest25, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale33);
        int int35 = jDOMNodePointer18.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer23, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer34);
        org.w3c.dom.Node node36 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer37 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer34, node36);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator38 = jDOMNodePointer7.childIterator(nodeTest8, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer37);
        java.lang.Object obj39 = dOMNodePointer37.getImmediateNode();
        boolean boolean41 = dOMNodePointer37.equals((java.lang.Object) 10.0f);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = dOMNodePointer37.getParent();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer43 = dOMNodePointer37.getImmediateParentPointer();
        boolean boolean44 = dOMNodePointer37.isCollection();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest45 = null;
        boolean boolean46 = dOMNodePointer37.testNode(nodeTest45);
        java.lang.Object obj47 = dOMNodePointer37.getBaseValue();
        dOMNodePointer37.setAttribute(false);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer50 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, (java.lang.Object) dOMNodePointer37);
        java.lang.Object obj51 = jDOMNodePointer50.getNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer52 = null;
        java.util.Locale locale54 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer55 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale54);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator56 = jDOMNodePointer55.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest57 = null;
        java.util.Locale locale60 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer61 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale60);
        java.lang.Object obj62 = jDOMNodePointer61.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator63 = jDOMNodePointer55.childIterator(nodeTest57, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer61);
        java.util.Locale locale65 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer66 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale65);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator67 = jDOMNodePointer66.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest68 = null;
        java.util.Locale locale71 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer72 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale71);
        java.lang.Object obj73 = jDOMNodePointer72.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator74 = jDOMNodePointer66.childIterator(nodeTest68, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer72);
        java.util.Locale locale76 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer77 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale76);
        int int78 = jDOMNodePointer61.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer66, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer77);
        org.w3c.dom.Node node79 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer80 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer77, node79);
        boolean boolean81 = dOMNodePointer80.isActual();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer82 = dOMNodePointer80.getImmediateValuePointer();
        java.lang.String str83 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix((java.lang.Object) dOMNodePointer80);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest84 = null;
        boolean boolean85 = dOMNodePointer80.testNode(nodeTest84);
        // The following exception was thrown during execution in test generation
        try {
            int int86 = jDOMNodePointer50.compareChildNodePointers(nodePointer52, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(namespaceResolver4);
        org.junit.Assert.assertNotNull(nodeIterator13);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1L) + "'", obj19, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator20);
        org.junit.Assert.assertNotNull(nodeIterator24);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1L) + "'", obj30, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(nodeIterator38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(nodePointer42);
        org.junit.Assert.assertNotNull(nodePointer43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(nodeIterator56);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + (-1L) + "'", obj62, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator63);
        org.junit.Assert.assertNotNull(nodeIterator67);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + (-1L) + "'", obj73, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator74);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(nodePointer82);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale1, "http://www.w3.org/2000/xmlns/");
        java.lang.Object obj4 = jDOMNodePointer3.getRootNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 100L, locale8);
        java.lang.String str11 = jDOMNodePointer9.getNamespaceURI("id('hi!')");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = jDOMNodePointer9.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator13 = jDOMNodePointer3.childIterator(nodeTest5, false, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer9);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = jDOMNodePointer3.namespacePointer("<<unknown namespace>>");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0f + "'", obj4, 1.0f);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertNotNull(nodeIterator13);
        org.junit.Assert.assertNotNull(nodePointer15);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        java.lang.Object obj34 = dOMNodePointer32.getBaseValue();
        java.lang.Object obj35 = dOMNodePointer32.getImmediateNode();
        org.apache.commons.jxpath.JXPathContext jXPathContext36 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = dOMNodePointer32.createPath(jXPathContext36);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = dOMNodePointer32.getImmediateValuePointer();
        nodePointer38.setIndex((int) (byte) 1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer41 = nodePointer38.getImmediateParentPointer();
        java.lang.Class<?> wildcardClass42 = nodePointer41.getClass();
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(nodePointer37);
        org.junit.Assert.assertNotNull(nodePointer38);
        org.junit.Assert.assertNotNull(nodePointer41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer13.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale18);
        java.lang.Object obj20 = jDOMNodePointer19.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator21 = jDOMNodePointer13.childIterator(nodeTest15, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19);
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        int int25 = jDOMNodePointer8.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        org.w3c.dom.Node node26 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24, node26);
        java.lang.String str29 = dOMNodePointer27.getNamespaceURI("hi!");
        java.lang.String str30 = dOMNodePointer27.getDefaultNamespaceURI();
        boolean boolean31 = dOMNodePointer27.isCollection();
        java.lang.String str33 = dOMNodePointer27.getNamespaceURI("id('hi!')");
        boolean boolean34 = dOMNodePointer27.isNode();
        java.lang.Object obj35 = dOMNodePointer27.getBaseValue();
        java.lang.String str36 = dOMNodePointer27.getLanguage();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 0, locale35, "hi!");
        java.lang.Object obj38 = jDOMNodePointer37.getNodeValue();
        java.lang.Object obj39 = jDOMNodePointer37.clone();
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer42 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale41);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator43 = jDOMNodePointer42.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest44 = null;
        java.util.Locale locale47 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer48 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale47);
        java.lang.Object obj49 = jDOMNodePointer48.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator50 = jDOMNodePointer42.childIterator(nodeTest44, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer48);
        java.util.Locale locale52 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer53 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale52);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator54 = jDOMNodePointer53.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest55 = null;
        java.util.Locale locale58 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer59 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale58);
        java.lang.Object obj60 = jDOMNodePointer59.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator61 = jDOMNodePointer53.childIterator(nodeTest55, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer59);
        java.util.Locale locale63 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer64 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale63);
        int int65 = jDOMNodePointer48.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer53, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer64);
        org.w3c.dom.Node node66 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer67 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer64, node66);
        int int68 = dOMNodePointer67.getLength();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest69 = null;
        boolean boolean70 = dOMNodePointer67.testNode(nodeTest69);
        java.lang.Object obj71 = dOMNodePointer67.getBaseValue();
        java.util.Locale locale72 = dOMNodePointer67.getLocale();
        java.util.Locale locale73 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer74 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) dOMNodePointer67, locale73);
        boolean boolean75 = jDOMNodePointer37.equals((java.lang.Object) locale73);
        org.w3c.dom.Node node76 = null;
        java.util.Locale locale77 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer79 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node76, locale77, "<<unknown namespace>>");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer80 = dOMNodePointer79.getParent();
        java.lang.String str81 = dOMNodePointer79.asPath();
        // The following exception was thrown during execution in test generation
        try {
            int int82 = dOMNodePointer32.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer37, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer79);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class org.w3c.dom.Node (java.lang.Byte is in module java.base of loader 'bootstrap'; org.w3c.dom.Node is in module java.xml of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (byte) 0 + "'", obj38, (byte) 0);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "id('hi!')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "id('hi!')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "id('hi!')");
        org.junit.Assert.assertNotNull(nodeIterator43);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (-1L) + "'", obj49, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator50);
        org.junit.Assert.assertNotNull(nodeIterator54);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + (-1L) + "'", obj60, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(locale72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(nodePointer80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "id('<<unknown namespace>>')" + "'", str81, "id('<<unknown namespace>>')");
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        java.lang.Object obj34 = dOMNodePointer32.getImmediateNode();
        int int35 = dOMNodePointer32.getLength();
        java.lang.String str36 = dOMNodePointer32.getLanguage();
        org.w3c.dom.Node node37 = null;
        java.util.Locale locale38 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer39 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node37, locale38);
        java.lang.String str40 = dOMNodePointer39.getDefaultNamespaceURI();
        java.lang.Object obj41 = dOMNodePointer39.getImmediateNode();
        boolean boolean42 = dOMNodePointer39.isActual();
        boolean boolean43 = dOMNodePointer32.equals((java.lang.Object) boolean42);
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        java.lang.Object obj34 = dOMNodePointer32.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = dOMNodePointer32.getImmediateValuePointer();
        org.w3c.dom.Node node36 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer37 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32, node36);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = dOMNodePointer32.getImmediateValuePointer();
        java.lang.String str39 = dOMNodePointer32.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator40 = dOMNodePointer32.namespaceIterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertNotNull(nodePointer38);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        java.util.Locale locale4 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer5 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale4);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator6 = jDOMNodePointer5.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale10);
        java.lang.Object obj12 = jDOMNodePointer11.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator13 = jDOMNodePointer5.childIterator(nodeTest7, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer11);
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale15);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator17 = jDOMNodePointer16.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest18 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale21);
        java.lang.Object obj23 = jDOMNodePointer22.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator24 = jDOMNodePointer16.childIterator(nodeTest18, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer22);
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale26);
        int int28 = jDOMNodePointer11.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer16, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer27);
        org.w3c.dom.Node node29 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer30 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer27, node29);
        int int31 = dOMNodePointer30.getLength();
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale33);
        java.lang.Object obj35 = jDOMNodePointer34.getValue();
        java.util.Locale locale36 = jDOMNodePointer34.getLocale();
        int int37 = dOMNodePointer30.compareTo((java.lang.Object) jDOMNodePointer34);
        java.lang.String str38 = dOMNodePointer30.getDefaultNamespaceURI();
        java.lang.String str39 = dOMNodePointer30.getLanguage();
        boolean boolean40 = jDOMNodePointer2.equals((java.lang.Object) dOMNodePointer30);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = jDOMNodePointer2.namespacePointer("id('http://www.w3.org/2000/xmlns/')");
        int int43 = jDOMNodePointer2.getIndex();
        org.junit.Assert.assertNotNull(nodeIterator6);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1L) + "'", obj12, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator13);
        org.junit.Assert.assertNotNull(nodeIterator17);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1L) + "'", obj23, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(locale36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(nodePointer42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-2147483648) + "'", int43 == (-2147483648));
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "http://www.w3.org/2000/xmlns/");
        java.lang.Object obj4 = dOMNodePointer3.getImmediateNode();
        java.lang.String str5 = dOMNodePointer3.getLanguage();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer13.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale18);
        java.lang.Object obj20 = jDOMNodePointer19.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator21 = jDOMNodePointer13.childIterator(nodeTest15, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19);
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        int int25 = jDOMNodePointer8.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        org.w3c.dom.Node node26 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24, node26);
        int int28 = dOMNodePointer27.getLength();
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer31 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale30);
        java.lang.Object obj32 = jDOMNodePointer31.getValue();
        java.util.Locale locale33 = jDOMNodePointer31.getLocale();
        int int34 = dOMNodePointer27.compareTo((java.lang.Object) jDOMNodePointer31);
        java.lang.String str35 = dOMNodePointer27.getDefaultNamespaceURI();
        java.lang.String str36 = dOMNodePointer27.getLanguage();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest37 = null;
        java.util.Locale locale40 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer41 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale40);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest42 = null;
        java.util.Locale locale45 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer46 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale45);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator47 = jDOMNodePointer46.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest48 = null;
        java.util.Locale locale51 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer52 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale51);
        java.lang.Object obj53 = jDOMNodePointer52.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator54 = jDOMNodePointer46.childIterator(nodeTest48, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer52);
        java.util.Locale locale56 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer57 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale56);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator58 = jDOMNodePointer57.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest59 = null;
        java.util.Locale locale62 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer63 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale62);
        java.lang.Object obj64 = jDOMNodePointer63.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator65 = jDOMNodePointer57.childIterator(nodeTest59, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer63);
        java.util.Locale locale67 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer68 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale67);
        int int69 = jDOMNodePointer52.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer57, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer68);
        org.w3c.dom.Node node70 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer71 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer68, node70);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator72 = jDOMNodePointer41.childIterator(nodeTest42, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer71);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer73 = dOMNodePointer71.getValuePointer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver74 = null;
        nodePointer73.setNamespaceResolver(namespaceResolver74);
        org.w3c.dom.Node node76 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer77 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer73, node76);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator78 = dOMNodePointer27.childIterator(nodeTest37, false, nodePointer73);
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(locale33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(nodeIterator47);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (-1L) + "'", obj53, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator54);
        org.junit.Assert.assertNotNull(nodeIterator58);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + (-1L) + "'", obj64, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator65);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(nodeIterator72);
        org.junit.Assert.assertNotNull(nodePointer73);
        org.junit.Assert.assertNotNull(nodeIterator78);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        java.lang.Object obj3 = jDOMNodePointer2.getNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = jDOMNodePointer2.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale8);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale13);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer14.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale19);
        java.lang.Object obj21 = jDOMNodePointer20.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator22 = jDOMNodePointer14.childIterator(nodeTest16, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer20);
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale24);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer25.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest27 = null;
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer31 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale30);
        java.lang.Object obj32 = jDOMNodePointer31.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer25.childIterator(nodeTest27, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer31);
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale35);
        int int37 = jDOMNodePointer20.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer25, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer36);
        org.w3c.dom.Node node38 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer39 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer36, node38);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator40 = jDOMNodePointer9.childIterator(nodeTest10, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer39);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest41 = null;
        boolean boolean42 = jDOMNodePointer9.testNode(nodeTest41);
        java.util.Locale locale43 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer44 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer9, locale43);
        java.lang.Object obj45 = jDOMNodePointer9.getRootNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator46 = jDOMNodePointer2.childIterator(nodeTest5, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer9);
        java.util.Locale locale48 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer49 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale48);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator50 = jDOMNodePointer49.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest51 = null;
        java.util.Locale locale54 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer55 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale54);
        java.lang.Object obj56 = jDOMNodePointer55.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator57 = jDOMNodePointer49.childIterator(nodeTest51, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer55);
        java.util.Locale locale59 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer60 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale59);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator61 = jDOMNodePointer60.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest62 = null;
        java.util.Locale locale65 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer66 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale65);
        java.lang.Object obj67 = jDOMNodePointer66.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator68 = jDOMNodePointer60.childIterator(nodeTest62, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer66);
        java.util.Locale locale70 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer71 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale70);
        int int72 = jDOMNodePointer55.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer60, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer71);
        org.w3c.dom.Node node73 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer74 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer71, node73);
        java.lang.String str76 = dOMNodePointer74.getNamespaceURI("hi!");
        java.lang.String str78 = dOMNodePointer74.getNamespaceURI("hi!");
        int int79 = dOMNodePointer74.getLength();
        java.lang.String str81 = dOMNodePointer74.getNamespaceURI("id('http://www.w3.org/XML/1998/namespace')");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer82 = dOMNodePointer74.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer83 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, (java.lang.Object) dOMNodePointer74);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (-1L) + "'", obj3, (-1L));
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1L) + "'", obj21, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator22);
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (-1L) + "'", obj32, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(nodeIterator40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (-1L) + "'", obj45, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator46);
        org.junit.Assert.assertNotNull(nodeIterator50);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (-1L) + "'", obj56, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator57);
        org.junit.Assert.assertNotNull(nodeIterator61);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + (-1L) + "'", obj67, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator68);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertNotNull(nodePointer82);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        java.util.Locale locale4 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer2, locale4, "http://www.w3.org/2000/xmlns/");
        boolean boolean7 = jDOMNodePointer6.isLeaf();
        java.lang.String str8 = jDOMNodePointer6.getNamespaceURI();
        org.apache.commons.jxpath.JXPathContext jXPathContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer11 = jDOMNodePointer6.getPointerByID(jXPathContext9, "id('id(&apos;hi!&apos;)')");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 0, locale1, "hi!");
        boolean boolean4 = jDOMNodePointer3.isRoot();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver5 = jDOMNodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale9);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale14);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator16 = jDOMNodePointer15.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale20);
        java.lang.Object obj22 = jDOMNodePointer21.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator23 = jDOMNodePointer15.childIterator(nodeTest17, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer21);
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale25);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator27 = jDOMNodePointer26.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest28 = null;
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale31);
        java.lang.Object obj33 = jDOMNodePointer32.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator34 = jDOMNodePointer26.childIterator(nodeTest28, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer32);
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale36);
        int int38 = jDOMNodePointer21.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer26, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer37);
        org.w3c.dom.Node node39 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer40 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer37, node39);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator41 = jDOMNodePointer10.childIterator(nodeTest11, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer40);
        java.lang.Object obj42 = dOMNodePointer40.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer43 = dOMNodePointer40.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator44 = jDOMNodePointer3.childIterator(nodeTest6, false, nodePointer43);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer45 = jDOMNodePointer3.getImmediateParentPointer();
        java.lang.String str47 = jDOMNodePointer3.getNamespaceURI("");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest48 = null;
        boolean boolean49 = jDOMNodePointer3.testNode(nodeTest48);
        java.lang.String str50 = jDOMNodePointer3.getNamespaceURI();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer51 = jDOMNodePointer3.getImmediateValuePointer();
        boolean boolean52 = jDOMNodePointer3.isLeaf();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(namespaceResolver5);
        org.junit.Assert.assertNotNull(nodeIterator16);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1L) + "'", obj22, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator23);
        org.junit.Assert.assertNotNull(nodeIterator27);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (-1L) + "'", obj33, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(nodeIterator41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(nodePointer43);
        org.junit.Assert.assertNotNull(nodeIterator44);
        org.junit.Assert.assertNull(nodePointer45);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(nodePointer51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale35);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator37 = jDOMNodePointer36.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest38 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer42 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale41);
        java.lang.Object obj43 = jDOMNodePointer42.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator44 = jDOMNodePointer36.childIterator(nodeTest38, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer42);
        boolean boolean45 = dOMNodePointer32.equals((java.lang.Object) jDOMNodePointer36);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer47 = jDOMNodePointer36.namespacePointer("http://www.w3.org/XML/1998/namespace");
        java.util.Locale locale48 = jDOMNodePointer36.getLocale();
        java.lang.Object obj49 = jDOMNodePointer36.getNodeValue();
        java.lang.String str50 = jDOMNodePointer36.asPath();
        boolean boolean52 = jDOMNodePointer36.equals((java.lang.Object) "id('http://www.w3.org/XML/1998/namespace')/namespace::http://www.w3.org/XML/1998/namespace");
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertNotNull(nodeIterator37);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (-1L) + "'", obj43, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(nodePointer47);
        org.junit.Assert.assertNull(locale48);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (-1L) + "'", obj49, (-1L));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = jDOMNodePointer8.getValuePointer();
        boolean boolean12 = jDOMNodePointer8.isRoot();
        boolean boolean13 = jDOMNodePointer8.isCollection();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = jDOMNodePointer2.namespacePointer("http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj5 = jDOMNodePointer2.getValue();
        boolean boolean6 = jDOMNodePointer2.isContainer();
        boolean boolean7 = jDOMNodePointer2.isLeaf();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        java.lang.Object obj34 = dOMNodePointer32.getNodeValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = dOMNodePointer32.getValuePointer();
        java.lang.Object obj36 = dOMNodePointer32.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = dOMNodePointer32.getImmediateParentPointer();
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale39);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest41 = null;
        java.util.Locale locale44 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer45 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale44);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator46 = jDOMNodePointer45.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest47 = null;
        java.util.Locale locale50 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer51 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale50);
        java.lang.Object obj52 = jDOMNodePointer51.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator53 = jDOMNodePointer45.childIterator(nodeTest47, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer51);
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer56 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale55);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator57 = jDOMNodePointer56.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest58 = null;
        java.util.Locale locale61 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer62 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale61);
        java.lang.Object obj63 = jDOMNodePointer62.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator64 = jDOMNodePointer56.childIterator(nodeTest58, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer62);
        java.util.Locale locale66 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer67 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale66);
        int int68 = jDOMNodePointer51.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer56, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer67);
        org.w3c.dom.Node node69 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer70 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer67, node69);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator71 = jDOMNodePointer40.childIterator(nodeTest41, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer70);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest72 = null;
        boolean boolean73 = jDOMNodePointer40.testNode(nodeTest72);
        java.util.Locale locale74 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer75 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer40, locale74);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver76 = jDOMNodePointer40.getNamespaceResolver();
        java.lang.Object obj77 = jDOMNodePointer40.clone();
        int int78 = dOMNodePointer32.compareTo((java.lang.Object) jDOMNodePointer40);
        java.lang.Object obj79 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int80 = jDOMNodePointer40.compareTo(obj79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(nodePointer37);
        org.junit.Assert.assertNotNull(nodeIterator46);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + (-1L) + "'", obj52, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator53);
        org.junit.Assert.assertNotNull(nodeIterator57);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + (-1L) + "'", obj63, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator64);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(nodeIterator71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(namespaceResolver76);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertEquals(obj77.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj77), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj77), "");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 0, locale1, "hi!");
        boolean boolean4 = jDOMNodePointer3.isRoot();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver5 = jDOMNodePointer3.getNamespaceResolver();
        boolean boolean6 = jDOMNodePointer3.isCollection();
        java.lang.String str8 = jDOMNodePointer3.getNamespaceURI("http://www.w3.org/2000/xmlns/");
        java.lang.String str10 = jDOMNodePointer3.getNamespaceURI("id('hi!')");
        boolean boolean11 = jDOMNodePointer3.isContainer();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(namespaceResolver5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 0, locale1, "hi!");
        org.w3c.dom.Node node4 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, node4);
        boolean boolean6 = dOMNodePointer5.isRoot();
        int int7 = dOMNodePointer5.getLength();
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 0, locale9, "hi!");
        boolean boolean12 = jDOMNodePointer11.isRoot();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver13 = jDOMNodePointer11.getNamespaceResolver();
        org.w3c.dom.Node node14 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer11, node14);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = dOMNodePointer15.getImmediateValuePointer();
        int int17 = dOMNodePointer15.getLength();
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale19);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest21 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale24);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer25.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest27 = null;
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer31 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale30);
        java.lang.Object obj32 = jDOMNodePointer31.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer25.childIterator(nodeTest27, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer31);
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale35);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator37 = jDOMNodePointer36.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest38 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer42 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale41);
        java.lang.Object obj43 = jDOMNodePointer42.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator44 = jDOMNodePointer36.childIterator(nodeTest38, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer42);
        java.util.Locale locale46 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer47 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale46);
        int int48 = jDOMNodePointer31.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer36, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer47);
        org.w3c.dom.Node node49 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer50 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer47, node49);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator51 = jDOMNodePointer20.childIterator(nodeTest21, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer50);
        java.lang.Object obj52 = dOMNodePointer50.getNodeValue();
        boolean boolean53 = dOMNodePointer50.isAttribute();
        java.lang.String str54 = dOMNodePointer50.getDefaultNamespaceURI();
        int int55 = dOMNodePointer15.compareTo((java.lang.Object) dOMNodePointer50);
        boolean boolean56 = dOMNodePointer5.equals((java.lang.Object) dOMNodePointer15);
        java.util.Locale locale58 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer59 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale58);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator60 = jDOMNodePointer59.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest61 = null;
        java.util.Locale locale64 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer65 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale64);
        java.lang.Object obj66 = jDOMNodePointer65.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator67 = jDOMNodePointer59.childIterator(nodeTest61, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer65);
        boolean boolean68 = jDOMNodePointer59.isActual();
        java.lang.String str69 = jDOMNodePointer59.getNamespaceURI();
        java.lang.String str71 = jDOMNodePointer59.getNamespaceURI("<<unknown namespace>>");
        java.lang.String str73 = jDOMNodePointer59.getNamespaceURI("http://www.w3.org/XML/1998/namespace");
        // The following exception was thrown during execution in test generation
        try {
            int int74 = dOMNodePointer15.compareTo((java.lang.Object) "http://www.w3.org/XML/1998/namespace");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class org.apache.commons.jxpath.ri.model.NodePointer (java.lang.String is in module java.base of loader 'bootstrap'; org.apache.commons.jxpath.ri.model.NodePointer is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(namespaceResolver13);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (-1L) + "'", obj32, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertNotNull(nodeIterator37);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (-1L) + "'", obj43, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(nodeIterator51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(nodeIterator60);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + (-1L) + "'", obj66, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNull(str73);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 0, locale1, "hi!");
        boolean boolean4 = jDOMNodePointer3.isRoot();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver5 = jDOMNodePointer3.getNamespaceResolver();
        boolean boolean6 = jDOMNodePointer3.isCollection();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = jDOMNodePointer3.getParent();
        int int8 = jDOMNodePointer3.getLength();
        boolean boolean9 = jDOMNodePointer3.isActual();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(namespaceResolver5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale35);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator37 = jDOMNodePointer36.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest38 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer42 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale41);
        java.lang.Object obj43 = jDOMNodePointer42.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator44 = jDOMNodePointer36.childIterator(nodeTest38, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer42);
        boolean boolean45 = dOMNodePointer32.equals((java.lang.Object) jDOMNodePointer36);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer47 = jDOMNodePointer36.namespacePointer("http://www.w3.org/XML/1998/namespace");
        boolean boolean48 = jDOMNodePointer36.isLeaf();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer50 = jDOMNodePointer36.namespacePointer("id('hi!')");
        boolean boolean51 = jDOMNodePointer36.isActual();
        org.apache.commons.jxpath.JXPathContext jXPathContext52 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer53 = jDOMNodePointer36.createPath(jXPathContext52);
        java.util.Locale locale54 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer55 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodePointer53, locale54);
        java.util.Locale locale57 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer58 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale57);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator59 = jDOMNodePointer58.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest60 = null;
        java.util.Locale locale63 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer64 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale63);
        java.lang.Object obj65 = jDOMNodePointer64.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator66 = jDOMNodePointer58.childIterator(nodeTest60, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer64);
        java.util.Locale locale68 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer69 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale68);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator70 = jDOMNodePointer69.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest71 = null;
        java.util.Locale locale74 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer75 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale74);
        java.lang.Object obj76 = jDOMNodePointer75.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator77 = jDOMNodePointer69.childIterator(nodeTest71, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer75);
        java.util.Locale locale79 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer80 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale79);
        int int81 = jDOMNodePointer64.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer69, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer80);
        java.lang.Object obj82 = jDOMNodePointer80.getImmediateNode();
        boolean boolean83 = jDOMNodePointer80.isLeaf();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator84 = jDOMNodePointer80.namespaceIterator();
        java.util.Locale locale86 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer87 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale86);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer89 = jDOMNodePointer87.namespacePointer("http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest90 = null;
        boolean boolean91 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer80, (java.lang.Object) nodePointer89, nodeTest90);
        java.lang.Object obj92 = jDOMNodePointer80.getBaseValue();
        boolean boolean93 = jDOMNodePointer55.equals(obj92);
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertNotNull(nodeIterator37);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (-1L) + "'", obj43, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(nodePointer47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(nodePointer50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(nodePointer53);
        org.junit.Assert.assertNotNull(nodeIterator59);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (-1L) + "'", obj65, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator66);
        org.junit.Assert.assertNotNull(nodeIterator70);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + (-1L) + "'", obj76, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator77);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertEquals("'" + obj82 + "' != '" + (-1L) + "'", obj82, (-1L));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(nodeIterator84);
        org.junit.Assert.assertNotNull(nodePointer89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertEquals("'" + obj92 + "' != '" + (-1L) + "'", obj92, (-1L));
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        boolean boolean11 = jDOMNodePointer8.isContainer();
        jDOMNodePointer8.setAttribute(true);
        java.util.Locale locale14 = jDOMNodePointer8.getLocale();
        java.lang.String str15 = jDOMNodePointer8.getNamespaceURI();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(locale14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        java.lang.Object obj34 = dOMNodePointer32.getNodeValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = dOMNodePointer32.getValuePointer();
        java.lang.Object obj36 = dOMNodePointer32.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = dOMNodePointer32.getImmediateParentPointer();
        java.lang.String str38 = dOMNodePointer32.getDefaultNamespaceURI();
        org.apache.commons.jxpath.JXPathContext jXPathContext39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer41 = dOMNodePointer32.getPointerByID(jXPathContext39, "/namespace::id('http://www.w3.org/XML/1998/namespace')");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(nodePointer37);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        java.lang.Object obj34 = dOMNodePointer32.getImmediateNode();
        boolean boolean36 = dOMNodePointer32.equals((java.lang.Object) 10.0f);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = dOMNodePointer32.getParent();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = dOMNodePointer32.getImmediateParentPointer();
        java.util.Locale locale40 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer41 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale40);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator42 = jDOMNodePointer41.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest43 = null;
        java.util.Locale locale46 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer47 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale46);
        java.lang.Object obj48 = jDOMNodePointer47.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator49 = jDOMNodePointer41.childIterator(nodeTest43, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer47);
        java.util.Locale locale51 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer52 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale51);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator53 = jDOMNodePointer52.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest54 = null;
        java.util.Locale locale57 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer58 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale57);
        java.lang.Object obj59 = jDOMNodePointer58.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator60 = jDOMNodePointer52.childIterator(nodeTest54, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer58);
        java.util.Locale locale62 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer63 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale62);
        int int64 = jDOMNodePointer47.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer52, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer63);
        org.w3c.dom.Node node65 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer66 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer63, node65);
        java.lang.String str68 = dOMNodePointer66.getNamespaceURI("hi!");
        boolean boolean69 = dOMNodePointer32.equals((java.lang.Object) dOMNodePointer66);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer71 = dOMNodePointer32.namespacePointer("id('http://www.w3.org/XML/1998/namespace')");
        org.apache.commons.jxpath.ri.QName qName72 = null;
        java.util.Locale locale74 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer76 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale74, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj77 = jDOMNodePointer76.getRootNode();
        org.w3c.dom.Node node78 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer79 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer76, node78);
        dOMNodePointer79.setIndex((int) (byte) 0);
        java.util.Locale locale82 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer83 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) dOMNodePointer79, locale82);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer84 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer71, qName72, (java.lang.Object) locale82);
        boolean boolean85 = nodePointer71.isRoot();
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(nodePointer37);
        org.junit.Assert.assertNotNull(nodePointer38);
        org.junit.Assert.assertNotNull(nodeIterator42);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (-1L) + "'", obj48, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator49);
        org.junit.Assert.assertNotNull(nodeIterator53);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (-1L) + "'", obj59, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator60);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(nodePointer71);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + 1.0d + "'", obj77, 1.0d);
        org.junit.Assert.assertNotNull(nodePointer84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest34 = null;
        boolean boolean35 = jDOMNodePointer2.testNode(nodeTest34);
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer2, locale36);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer39 = jDOMNodePointer37.namespacePointer("");
        jDOMNodePointer37.setAttribute(false);
        int int42 = jDOMNodePointer37.getIndex();
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(nodePointer39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-2147483648) + "'", int42 == (-2147483648));
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer13.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale18);
        java.lang.Object obj20 = jDOMNodePointer19.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator21 = jDOMNodePointer13.childIterator(nodeTest15, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19);
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        int int25 = jDOMNodePointer8.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        org.w3c.dom.Node node26 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24, node26);
        java.lang.String str29 = dOMNodePointer27.getNamespaceURI("hi!");
        java.lang.String str30 = dOMNodePointer27.getDefaultNamespaceURI();
        boolean boolean31 = dOMNodePointer27.isCollection();
        java.lang.Object obj32 = dOMNodePointer27.getNode();
        boolean boolean33 = dOMNodePointer27.isActual();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = jDOMNodePointer2.namespacePointer("http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj5 = jDOMNodePointer2.getValue();
        boolean boolean6 = jDOMNodePointer2.isContainer();
        java.lang.String str7 = jDOMNodePointer2.asPath();
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale9);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator11 = jDOMNodePointer10.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale15);
        java.lang.Object obj17 = jDOMNodePointer16.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = jDOMNodePointer10.childIterator(nodeTest12, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer16);
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale20);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator22 = jDOMNodePointer21.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest23 = null;
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale26);
        java.lang.Object obj28 = jDOMNodePointer27.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator29 = jDOMNodePointer21.childIterator(nodeTest23, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer27);
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale31);
        int int33 = jDOMNodePointer16.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer21, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer32);
        org.apache.commons.jxpath.JXPathContext jXPathContext34 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = jDOMNodePointer32.createPath(jXPathContext34);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, (java.lang.Object) jXPathContext34);
        java.lang.String str37 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix((java.lang.Object) jDOMNodePointer2);
        boolean boolean38 = jDOMNodePointer2.isAttribute();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodeIterator11);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1L) + "'", obj17, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertNotNull(nodeIterator22);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1L) + "'", obj28, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer13.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale18);
        java.lang.Object obj20 = jDOMNodePointer19.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator21 = jDOMNodePointer13.childIterator(nodeTest15, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19);
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        int int25 = jDOMNodePointer8.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        org.w3c.dom.Node node26 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24, node26);
        int int28 = dOMNodePointer27.getLength();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest29 = null;
        boolean boolean30 = dOMNodePointer27.testNode(nodeTest29);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest32 = null;
        boolean boolean33 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer27, (java.lang.Object) (byte) -1, nodeTest32);
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 0, locale35, "hi!");
        boolean boolean38 = jDOMNodePointer37.isRoot();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver39 = jDOMNodePointer37.getNamespaceResolver();
        boolean boolean40 = jDOMNodePointer37.isCollection();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer41 = jDOMNodePointer37.getParent();
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer27.setValue((java.lang.Object) jDOMNodePointer37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(namespaceResolver39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(nodePointer41);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        java.lang.Object obj3 = jDOMNodePointer2.getNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = jDOMNodePointer2.getImmediateValuePointer();
        org.w3c.dom.Node node5 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer6 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer4, node5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator7 = dOMNodePointer6.namespaceIterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (-1L) + "'", obj3, (-1L));
        org.junit.Assert.assertNotNull(nodePointer4);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale1);
        org.apache.commons.jxpath.JXPathContext jXPathContext3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = jDOMNodePointer2.createPath(jXPathContext3);
        java.lang.Object obj5 = nodePointer4.getRootNode();
        org.w3c.dom.Node node6 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node6, locale7, "id('hi!')");
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale11);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale16);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = jDOMNodePointer17.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest19 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale22);
        java.lang.Object obj24 = jDOMNodePointer23.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator25 = jDOMNodePointer17.childIterator(nodeTest19, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer23);
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale27);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator29 = jDOMNodePointer28.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest30 = null;
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale33);
        java.lang.Object obj35 = jDOMNodePointer34.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator36 = jDOMNodePointer28.childIterator(nodeTest30, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer34);
        java.util.Locale locale38 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer39 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale38);
        int int40 = jDOMNodePointer23.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer28, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer39);
        org.w3c.dom.Node node41 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer42 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer39, node41);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator43 = jDOMNodePointer12.childIterator(nodeTest13, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer42);
        java.lang.Object obj44 = dOMNodePointer42.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer45 = dOMNodePointer42.getImmediateValuePointer();
        org.w3c.dom.Node node46 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer47 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer42, node46);
        java.lang.Object obj48 = dOMNodePointer42.getRootNode();
        java.lang.String str50 = dOMNodePointer42.getNamespaceURI("id('hi!')");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest51 = null;
        boolean boolean52 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer9, (java.lang.Object) dOMNodePointer42, nodeTest51);
        dOMNodePointer42.setIndex(0);
        // The following exception was thrown during execution in test generation
        try {
            int int55 = nodePointer4.compareTo((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Integer cannot be cast to class org.apache.commons.jxpath.ri.model.NodePointer (java.lang.Integer is in module java.base of loader 'bootstrap'; org.apache.commons.jxpath.ri.model.NodePointer is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "" + "'", obj5, "");
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1L) + "'", obj24, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator25);
        org.junit.Assert.assertNotNull(nodeIterator29);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (-1L) + "'", obj35, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(nodeIterator43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(nodePointer45);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (-1L) + "'", obj48, (-1L));
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer13.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale18);
        java.lang.Object obj20 = jDOMNodePointer19.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator21 = jDOMNodePointer13.childIterator(nodeTest15, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19);
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        int int25 = jDOMNodePointer8.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        org.w3c.dom.Node node26 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24, node26);
        java.lang.String str29 = dOMNodePointer27.getNamespaceURI("hi!");
        java.lang.String str31 = dOMNodePointer27.getNamespaceURI("hi!");
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale33);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest35 = null;
        java.util.Locale locale38 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer39 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale38);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator40 = jDOMNodePointer39.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest41 = null;
        java.util.Locale locale44 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer45 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale44);
        java.lang.Object obj46 = jDOMNodePointer45.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator47 = jDOMNodePointer39.childIterator(nodeTest41, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer45);
        java.util.Locale locale49 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer50 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale49);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator51 = jDOMNodePointer50.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest52 = null;
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer56 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale55);
        java.lang.Object obj57 = jDOMNodePointer56.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator58 = jDOMNodePointer50.childIterator(nodeTest52, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer56);
        java.util.Locale locale60 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer61 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale60);
        int int62 = jDOMNodePointer45.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer50, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer61);
        org.w3c.dom.Node node63 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer64 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer61, node63);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator65 = jDOMNodePointer34.childIterator(nodeTest35, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer64);
        java.lang.Object obj66 = dOMNodePointer64.getImmediateNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest67 = null;
        boolean boolean68 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer27, (java.lang.Object) dOMNodePointer64, nodeTest67);
        int int69 = dOMNodePointer27.getLength();
        boolean boolean70 = dOMNodePointer27.isAttribute();
        boolean boolean71 = dOMNodePointer27.isNode();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver72 = dOMNodePointer27.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer73 = dOMNodePointer27.getParent();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(nodeIterator40);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (-1L) + "'", obj46, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator47);
        org.junit.Assert.assertNotNull(nodeIterator51);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (-1L) + "'", obj57, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator58);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(nodeIterator65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(namespaceResolver72);
        org.junit.Assert.assertNotNull(nodePointer73);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale1, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj4 = jDOMNodePointer3.getRootNode();
        org.w3c.dom.Node node5 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer6 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, node5);
        dOMNodePointer6.setIndex((int) (byte) 0);
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) dOMNodePointer6, locale9);
        boolean boolean11 = jDOMNodePointer10.isNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = jDOMNodePointer10.isLanguage("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0d + "'", obj4, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest34 = null;
        boolean boolean35 = jDOMNodePointer2.testNode(nodeTest34);
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer2, locale36);
        int int38 = jDOMNodePointer2.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer40 = jDOMNodePointer2.namespacePointer("");
        java.util.Locale locale42 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer43 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale42);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator44 = jDOMNodePointer43.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest45 = null;
        java.util.Locale locale48 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer49 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale48);
        java.lang.Object obj50 = jDOMNodePointer49.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator51 = jDOMNodePointer43.childIterator(nodeTest45, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer49);
        java.util.Locale locale53 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer54 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale53);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator55 = jDOMNodePointer54.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest56 = null;
        java.util.Locale locale59 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer60 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale59);
        java.lang.Object obj61 = jDOMNodePointer60.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator62 = jDOMNodePointer54.childIterator(nodeTest56, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer60);
        java.util.Locale locale64 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer65 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale64);
        int int66 = jDOMNodePointer49.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer54, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer65);
        org.w3c.dom.Node node67 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer68 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer65, node67);
        int int69 = dOMNodePointer68.getLength();
        java.lang.String str71 = dOMNodePointer68.getNamespaceURI("id('hi!')");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest72 = null;
        boolean boolean73 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, (java.lang.Object) str71, nodeTest72);
        java.lang.Object obj74 = jDOMNodePointer2.getNode();
        java.lang.String str76 = jDOMNodePointer2.getNamespaceURI("/namespace::id('http://www.w3.org/XML/1998/namespace')");
        java.lang.Object obj77 = jDOMNodePointer2.getValue();
        java.util.Locale locale79 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer81 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale79, "http://www.w3.org/2000/xmlns/");
        boolean boolean82 = jDOMNodePointer81.isCollection();
        java.lang.Object obj83 = jDOMNodePointer81.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer84 = jDOMNodePointer81.getParent();
        java.lang.Object obj85 = jDOMNodePointer81.clone();
        java.lang.Object obj86 = jDOMNodePointer81.clone();
        int int87 = jDOMNodePointer2.compareTo(obj86);
        java.util.Locale locale88 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer90 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer2, locale88, "id('id(&apos;http://www.w3.org/2000/xmlns/&apos;)')");
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(nodePointer40);
        org.junit.Assert.assertNotNull(nodeIterator44);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (-1L) + "'", obj50, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator51);
        org.junit.Assert.assertNotNull(nodeIterator55);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (-1L) + "'", obj61, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator62);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + (-1L) + "'", obj74, (-1L));
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + 1.0f + "'", obj83, 1.0f);
        org.junit.Assert.assertNull(nodePointer84);
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertEquals(obj85.toString(), "id('http://www.w3.org/2000/xmlns/')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj85), "id('http://www.w3.org/2000/xmlns/')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj85), "id('http://www.w3.org/2000/xmlns/')");
        org.junit.Assert.assertNotNull(obj86);
        org.junit.Assert.assertEquals(obj86.toString(), "id('http://www.w3.org/2000/xmlns/')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj86), "id('http://www.w3.org/2000/xmlns/')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj86), "id('http://www.w3.org/2000/xmlns/')");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest34 = null;
        boolean boolean35 = jDOMNodePointer2.testNode(nodeTest34);
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer2, locale36);
        boolean boolean38 = jDOMNodePointer37.isLeaf();
        java.util.Locale locale40 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer41 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale40);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest42 = null;
        java.util.Locale locale45 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer46 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale45);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator47 = jDOMNodePointer46.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest48 = null;
        java.util.Locale locale51 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer52 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale51);
        java.lang.Object obj53 = jDOMNodePointer52.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator54 = jDOMNodePointer46.childIterator(nodeTest48, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer52);
        java.util.Locale locale56 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer57 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale56);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator58 = jDOMNodePointer57.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest59 = null;
        java.util.Locale locale62 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer63 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale62);
        java.lang.Object obj64 = jDOMNodePointer63.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator65 = jDOMNodePointer57.childIterator(nodeTest59, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer63);
        java.util.Locale locale67 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer68 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale67);
        int int69 = jDOMNodePointer52.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer57, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer68);
        org.w3c.dom.Node node70 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer71 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer68, node70);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator72 = jDOMNodePointer41.childIterator(nodeTest42, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer71);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest73 = null;
        boolean boolean74 = jDOMNodePointer41.testNode(nodeTest73);
        java.util.Locale locale75 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer76 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer41, locale75);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver77 = jDOMNodePointer41.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer78 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer37, (java.lang.Object) jDOMNodePointer41);
        boolean boolean79 = jDOMNodePointer41.isAttribute();
        java.util.Locale locale80 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer82 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer41, locale80, "id('hi!')");
        boolean boolean84 = jDOMNodePointer82.equals((java.lang.Object) (short) -1);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver85 = jDOMNodePointer82.getNamespaceResolver();
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(nodeIterator47);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (-1L) + "'", obj53, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator54);
        org.junit.Assert.assertNotNull(nodeIterator58);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + (-1L) + "'", obj64, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator65);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(nodeIterator72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(namespaceResolver77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(namespaceResolver85);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        boolean boolean4 = jDOMNodePointer2.isRoot();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator5 = jDOMNodePointer2.namespaceIterator();
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale7, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj10 = jDOMNodePointer9.getRootNode();
        org.w3c.dom.Node node11 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer12 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer9, node11);
        boolean boolean13 = jDOMNodePointer9.isCollection();
        boolean boolean14 = jDOMNodePointer2.equals((java.lang.Object) boolean13);
        int int15 = jDOMNodePointer2.getIndex();
        java.util.Locale locale16 = jDOMNodePointer2.getLocale();
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale18);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator25 = jDOMNodePointer24.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest26 = null;
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer30 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale29);
        java.lang.Object obj31 = jDOMNodePointer30.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator32 = jDOMNodePointer24.childIterator(nodeTest26, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer30);
        java.util.Locale locale34 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer35 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale34);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator36 = jDOMNodePointer35.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest37 = null;
        java.util.Locale locale40 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer41 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale40);
        java.lang.Object obj42 = jDOMNodePointer41.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator43 = jDOMNodePointer35.childIterator(nodeTest37, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer41);
        java.util.Locale locale45 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer46 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale45);
        int int47 = jDOMNodePointer30.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer35, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer46);
        org.w3c.dom.Node node48 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer49 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer46, node48);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator50 = jDOMNodePointer19.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer49);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer51 = dOMNodePointer49.getValuePointer();
        int int52 = nodePointer51.getIndex();
        java.lang.Object obj53 = nodePointer51.getRootNode();
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer56 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale55);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator57 = jDOMNodePointer56.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest58 = null;
        java.util.Locale locale61 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer62 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale61);
        java.lang.Object obj63 = jDOMNodePointer62.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator64 = jDOMNodePointer56.childIterator(nodeTest58, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer62);
        int int65 = jDOMNodePointer56.getLength();
        org.w3c.dom.Node node66 = null;
        java.util.Locale locale67 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer69 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node66, locale67, "<<unknown namespace>>");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer70 = dOMNodePointer69.getParent();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer71 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer56, (java.lang.Object) dOMNodePointer69);
        java.util.Locale locale72 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer73 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) dOMNodePointer69, locale72);
        int int74 = jDOMNodePointer2.compareChildNodePointers(nodePointer51, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer69);
        boolean boolean75 = nodePointer51.isContainer();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(nodeIterator5);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0d + "'", obj10, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2147483648) + "'", int15 == (-2147483648));
        org.junit.Assert.assertNull(locale16);
        org.junit.Assert.assertNotNull(nodeIterator25);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (-1L) + "'", obj31, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator32);
        org.junit.Assert.assertNotNull(nodeIterator36);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (-1L) + "'", obj42, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(nodeIterator50);
        org.junit.Assert.assertNotNull(nodePointer51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-2147483648) + "'", int52 == (-2147483648));
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (-1L) + "'", obj53, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator57);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + (-1L) + "'", obj63, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNull(nodePointer70);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 0, locale1, "hi!");
        boolean boolean4 = jDOMNodePointer3.isRoot();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver5 = jDOMNodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = jDOMNodePointer3.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = jDOMNodePointer3.getValuePointer();
        boolean boolean8 = jDOMNodePointer3.isAttribute();
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale10);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator12 = jDOMNodePointer11.namespaceIterator();
        boolean boolean13 = jDOMNodePointer11.isRoot();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer11.namespaceIterator();
        boolean boolean15 = jDOMNodePointer11.isNode();
        java.util.Locale locale16 = jDOMNodePointer11.getLocale();
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) locale16, locale17, "id('')");
        // The following exception was thrown during execution in test generation
        try {
            jDOMNodePointer3.setValue((java.lang.Object) jDOMNodePointer19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class org.jdom.Element (java.lang.Byte is in module java.base of loader 'bootstrap'; org.jdom.Element is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(namespaceResolver5);
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeIterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(locale16);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        int int11 = jDOMNodePointer2.getLength();
        org.w3c.dom.Node node12 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer15 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node12, locale13, "<<unknown namespace>>");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = dOMNodePointer15.getParent();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, (java.lang.Object) dOMNodePointer15);
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) dOMNodePointer15, locale18);
        org.apache.commons.jxpath.JXPathContext jXPathContext20 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale22);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest24 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale27);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator29 = jDOMNodePointer28.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest30 = null;
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale33);
        java.lang.Object obj35 = jDOMNodePointer34.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator36 = jDOMNodePointer28.childIterator(nodeTest30, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer34);
        java.util.Locale locale38 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer39 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale38);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator40 = jDOMNodePointer39.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest41 = null;
        java.util.Locale locale44 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer45 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale44);
        java.lang.Object obj46 = jDOMNodePointer45.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator47 = jDOMNodePointer39.childIterator(nodeTest41, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer45);
        java.util.Locale locale49 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer50 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale49);
        int int51 = jDOMNodePointer34.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer39, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer50);
        org.w3c.dom.Node node52 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer53 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer50, node52);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator54 = jDOMNodePointer23.childIterator(nodeTest24, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer53);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest55 = null;
        boolean boolean56 = jDOMNodePointer23.testNode(nodeTest55);
        java.util.Locale locale57 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer58 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer23, locale57);
        java.lang.String str60 = jDOMNodePointer58.getNamespaceURI("http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.QName qName61 = jDOMNodePointer58.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer62 = jDOMNodePointer19.createAttribute(jXPathContext20, qName61);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot create an attribute for path /@null, operation is not allowed for this type of node");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(nodePointer16);
        org.junit.Assert.assertNotNull(nodeIterator29);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (-1L) + "'", obj35, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator36);
        org.junit.Assert.assertNotNull(nodeIterator40);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (-1L) + "'", obj46, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(nodeIterator54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(qName61);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0f, locale1, "http://www.w3.org/2000/xmlns/");
        boolean boolean4 = jDOMNodePointer3.isCollection();
        org.apache.commons.jxpath.JXPathContext jXPathContext5 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator9 = jDOMNodePointer8.namespaceIterator();
        boolean boolean10 = jDOMNodePointer8.isRoot();
        boolean boolean11 = jDOMNodePointer8.isLeaf();
        java.lang.Object obj12 = jDOMNodePointer8.clone();
        int int13 = jDOMNodePointer8.getLength();
        org.apache.commons.jxpath.ri.QName qName14 = jDOMNodePointer8.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = jDOMNodePointer3.createAttribute(jXPathContext5, qName14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot create an attribute for path id('http://www.w3.org/2000/xmlns/')/@null, operation is not allowed for this type of node");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeIterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(qName14);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "id('hi!')");
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale5);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator7 = jDOMNodePointer6.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale11);
        java.lang.Object obj13 = jDOMNodePointer12.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer6.childIterator(nodeTest8, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer12);
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale16);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = jDOMNodePointer17.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest19 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale22);
        java.lang.Object obj24 = jDOMNodePointer23.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator25 = jDOMNodePointer17.childIterator(nodeTest19, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer23);
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale27);
        int int29 = jDOMNodePointer12.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer17, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer28);
        org.w3c.dom.Node node30 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer31 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer28, node30);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver32 = dOMNodePointer31.getNamespaceResolver();
        dOMNodePointer3.setNamespaceResolver(namespaceResolver32);
        org.w3c.dom.Node node34 = null;
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer36 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node34, locale35);
        java.lang.String str37 = dOMNodePointer36.getDefaultNamespaceURI();
        java.lang.String str39 = dOMNodePointer36.getNamespaceURI("http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer3, (java.lang.Object) str39);
        int int41 = dOMNodePointer3.getIndex();
        org.junit.Assert.assertNotNull(nodeIterator7);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1L) + "'", obj24, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(namespaceResolver32);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-2147483648) + "'", int41 == (-2147483648));
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        java.lang.Object obj34 = dOMNodePointer32.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = dOMNodePointer32.getImmediateValuePointer();
        org.w3c.dom.Node node36 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer37 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32, node36);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = dOMNodePointer32.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer39 = nodePointer38.getImmediateValuePointer();
        java.lang.String str40 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName((java.lang.Object) nodePointer38);
        java.util.Locale locale42 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer44 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 0, locale42, "hi!");
        boolean boolean45 = jDOMNodePointer44.isRoot();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver46 = jDOMNodePointer44.getNamespaceResolver();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest47 = null;
        java.util.Locale locale50 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer51 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale50);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest52 = null;
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer56 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale55);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator57 = jDOMNodePointer56.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest58 = null;
        java.util.Locale locale61 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer62 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale61);
        java.lang.Object obj63 = jDOMNodePointer62.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator64 = jDOMNodePointer56.childIterator(nodeTest58, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer62);
        java.util.Locale locale66 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer67 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale66);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator68 = jDOMNodePointer67.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest69 = null;
        java.util.Locale locale72 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer73 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale72);
        java.lang.Object obj74 = jDOMNodePointer73.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator75 = jDOMNodePointer67.childIterator(nodeTest69, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer73);
        java.util.Locale locale77 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer78 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale77);
        int int79 = jDOMNodePointer62.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer67, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer78);
        org.w3c.dom.Node node80 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer81 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer78, node80);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator82 = jDOMNodePointer51.childIterator(nodeTest52, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer81);
        java.lang.Object obj83 = dOMNodePointer81.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer84 = dOMNodePointer81.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator85 = jDOMNodePointer44.childIterator(nodeTest47, false, nodePointer84);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer86 = jDOMNodePointer44.getParent();
        java.lang.String str87 = jDOMNodePointer44.asPath();
        boolean boolean88 = jDOMNodePointer44.isCollection();
        java.lang.Object obj89 = jDOMNodePointer44.getBaseValue();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer90 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(nodePointer38, (java.lang.Object) jDOMNodePointer44);
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertNotNull(nodePointer38);
        org.junit.Assert.assertNotNull(nodePointer39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(namespaceResolver46);
        org.junit.Assert.assertNotNull(nodeIterator57);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + (-1L) + "'", obj63, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator64);
        org.junit.Assert.assertNotNull(nodeIterator68);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + (-1L) + "'", obj74, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator75);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(nodeIterator82);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(nodePointer84);
        org.junit.Assert.assertNotNull(nodeIterator85);
        org.junit.Assert.assertNull(nodePointer86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "id('hi!')" + "'", str87, "id('hi!')");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + obj89 + "' != '" + (byte) 0 + "'", obj89, (byte) 0);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale1, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj4 = jDOMNodePointer3.getRootNode();
        org.w3c.dom.Node node5 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer6 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, node5);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        boolean boolean8 = dOMNodePointer6.testNode(nodeTest7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = dOMNodePointer6.isLanguage("id('http://www.w3.org/2000/xmlns/')");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0d + "'", obj4, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (byte) 0, locale1, "hi!");
        boolean boolean4 = jDOMNodePointer3.isRoot();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver5 = jDOMNodePointer3.getNamespaceResolver();
        boolean boolean6 = jDOMNodePointer3.isCollection();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = jDOMNodePointer3.getParent();
        int int8 = jDOMNodePointer3.getLength();
        boolean boolean9 = jDOMNodePointer3.isCollection();
        java.lang.Object obj10 = jDOMNodePointer3.clone();
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(obj10, locale11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(namespaceResolver5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "id('hi!')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "id('hi!')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "id('hi!')");
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        java.lang.Object obj34 = dOMNodePointer32.getImmediateNode();
        boolean boolean36 = dOMNodePointer32.equals((java.lang.Object) 10.0f);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = dOMNodePointer32.getParent();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = dOMNodePointer32.getImmediateParentPointer();
        boolean boolean39 = dOMNodePointer32.isCollection();
        java.lang.Object obj40 = dOMNodePointer32.getImmediateNode();
        boolean boolean41 = dOMNodePointer32.isActual();
        java.lang.Object obj42 = dOMNodePointer32.clone();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver43 = dOMNodePointer32.getNamespaceResolver();
        org.apache.commons.jxpath.JXPathContext jXPathContext44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer46 = dOMNodePointer32.getPointerByID(jXPathContext44, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(nodePointer37);
        org.junit.Assert.assertNotNull(nodePointer38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(namespaceResolver43);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "id('hi!')");
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale5);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator7 = jDOMNodePointer6.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale11);
        java.lang.Object obj13 = jDOMNodePointer12.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer6.childIterator(nodeTest8, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer12);
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale16);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = jDOMNodePointer17.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest19 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale22);
        java.lang.Object obj24 = jDOMNodePointer23.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator25 = jDOMNodePointer17.childIterator(nodeTest19, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer23);
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale27);
        int int29 = jDOMNodePointer12.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer17, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer28);
        org.w3c.dom.Node node30 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer31 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer28, node30);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver32 = dOMNodePointer31.getNamespaceResolver();
        dOMNodePointer3.setNamespaceResolver(namespaceResolver32);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = dOMNodePointer3.namespacePointer("id('http://www.w3.org/2000/xmlns/')");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = dOMNodePointer3.namespacePointer("<<unknown namespace>>");
        java.util.Locale locale38 = dOMNodePointer3.getLocale();
        java.lang.Object obj39 = dOMNodePointer3.getImmediateNode();
        dOMNodePointer3.setIndex(0);
        org.junit.Assert.assertNotNull(nodeIterator7);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1L) + "'", obj24, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(namespaceResolver32);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertNotNull(nodePointer37);
        org.junit.Assert.assertNull(locale38);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale35);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator37 = jDOMNodePointer36.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest38 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer42 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale41);
        java.lang.Object obj43 = jDOMNodePointer42.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator44 = jDOMNodePointer36.childIterator(nodeTest38, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer42);
        boolean boolean45 = dOMNodePointer32.equals((java.lang.Object) jDOMNodePointer36);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer47 = jDOMNodePointer36.namespacePointer("http://www.w3.org/XML/1998/namespace");
        boolean boolean48 = jDOMNodePointer36.isLeaf();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer50 = jDOMNodePointer36.namespacePointer("id('hi!')");
        org.w3c.dom.Node node51 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer52 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer50, node51);
        org.w3c.dom.Node node53 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer54 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer52, node53);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer55 = dOMNodePointer54.getImmediateValuePointer();
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer54.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertNotNull(nodeIterator37);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (-1L) + "'", obj43, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(nodePointer47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(nodePointer50);
        org.junit.Assert.assertNotNull(nodePointer55);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer2 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1);
        int int3 = dOMNodePointer2.getLength();
        dOMNodePointer2.setIndex((int) (byte) 1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = dOMNodePointer2.getImmediateValuePointer();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(nodePointer6);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer13.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale18);
        java.lang.Object obj20 = jDOMNodePointer19.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator21 = jDOMNodePointer13.childIterator(nodeTest15, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19);
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        int int25 = jDOMNodePointer8.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        org.w3c.dom.Node node26 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24, node26);
        int int28 = dOMNodePointer27.getLength();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest29 = null;
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer33 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale32);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = jDOMNodePointer33.namespacePointer("http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator36 = dOMNodePointer27.childIterator(nodeTest29, false, nodePointer35);
        boolean boolean37 = dOMNodePointer27.isActual();
        java.lang.String str39 = dOMNodePointer27.getNamespaceURI("hi!");
        java.util.Locale locale40 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer41 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "hi!", locale40);
        jDOMNodePointer41.setAttribute(true);
        java.lang.Object obj44 = jDOMNodePointer41.getImmediateNode();
        java.util.Locale locale45 = jDOMNodePointer41.getLocale();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest46 = null;
        boolean boolean47 = jDOMNodePointer41.testNode(nodeTest46);
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertNotNull(nodeIterator36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + "hi!" + "'", obj44, "hi!");
        org.junit.Assert.assertNull(locale45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer13.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale18);
        java.lang.Object obj20 = jDOMNodePointer19.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator21 = jDOMNodePointer13.childIterator(nodeTest15, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19);
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        int int25 = jDOMNodePointer8.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        org.w3c.dom.Node node26 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24, node26);
        int int28 = dOMNodePointer27.getLength();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest29 = null;
        boolean boolean30 = dOMNodePointer27.testNode(nodeTest29);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest32 = null;
        boolean boolean33 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer27, (java.lang.Object) (byte) -1, nodeTest32);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = dOMNodePointer27.namespacePointer("hi!");
        boolean boolean36 = dOMNodePointer27.isCollection();
        java.lang.String str37 = dOMNodePointer27.getDefaultNamespaceURI();
        boolean boolean38 = dOMNodePointer27.isAttribute();
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) dOMNodePointer27, locale39);
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer27.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        boolean boolean34 = jDOMNodePointer2.isNode();
        java.lang.String str35 = jDOMNodePointer2.toString();
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer2, locale36);
        java.lang.String str38 = jDOMNodePointer37.asPath();
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        java.util.Locale locale4 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer2, locale4, "http://www.w3.org/2000/xmlns/");
        boolean boolean7 = jDOMNodePointer6.isLeaf();
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale9);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator11 = jDOMNodePointer10.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale15);
        java.lang.Object obj17 = jDOMNodePointer16.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = jDOMNodePointer10.childIterator(nodeTest12, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer16);
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale20);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator22 = jDOMNodePointer21.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest23 = null;
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale26);
        java.lang.Object obj28 = jDOMNodePointer27.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator29 = jDOMNodePointer21.childIterator(nodeTest23, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer27);
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale31);
        int int33 = jDOMNodePointer16.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer21, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer32);
        org.w3c.dom.Node node34 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer35 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer32, node34);
        java.lang.String str37 = dOMNodePointer35.getNamespaceURI("hi!");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest38 = null;
        boolean boolean39 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer6, (java.lang.Object) dOMNodePointer35, nodeTest38);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver40 = jDOMNodePointer6.getNamespaceResolver();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodeIterator11);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1L) + "'", obj17, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertNotNull(nodeIterator22);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1L) + "'", obj28, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(namespaceResolver40);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer13.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale18);
        java.lang.Object obj20 = jDOMNodePointer19.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator21 = jDOMNodePointer13.childIterator(nodeTest15, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19);
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        int int25 = jDOMNodePointer8.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        org.w3c.dom.Node node26 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer27 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24, node26);
        boolean boolean28 = dOMNodePointer27.isActual();
        dOMNodePointer27.setAttribute(true);
        boolean boolean31 = dOMNodePointer27.isCollection();
        boolean boolean32 = dOMNodePointer27.isContainer();
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer27.printPointerChain();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale35);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator37 = jDOMNodePointer36.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest38 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer42 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale41);
        java.lang.Object obj43 = jDOMNodePointer42.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator44 = jDOMNodePointer36.childIterator(nodeTest38, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer42);
        boolean boolean45 = dOMNodePointer32.equals((java.lang.Object) jDOMNodePointer36);
        int int46 = dOMNodePointer32.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer48 = dOMNodePointer32.namespacePointer("id('id(&apos;http://www.w3.org/2000/xmlns/&apos;)')");
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertNotNull(nodeIterator37);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (-1L) + "'", obj43, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(nodePointer48);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        java.lang.Object obj34 = dOMNodePointer32.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = dOMNodePointer32.getImmediateValuePointer();
        org.w3c.dom.Node node36 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer37 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32, node36);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = dOMNodePointer32.getImmediateValuePointer();
        java.util.Locale locale40 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer41 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale40);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest42 = null;
        java.util.Locale locale45 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer46 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale45);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator47 = jDOMNodePointer46.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest48 = null;
        java.util.Locale locale51 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer52 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale51);
        java.lang.Object obj53 = jDOMNodePointer52.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator54 = jDOMNodePointer46.childIterator(nodeTest48, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer52);
        java.util.Locale locale56 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer57 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale56);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator58 = jDOMNodePointer57.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest59 = null;
        java.util.Locale locale62 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer63 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale62);
        java.lang.Object obj64 = jDOMNodePointer63.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator65 = jDOMNodePointer57.childIterator(nodeTest59, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer63);
        java.util.Locale locale67 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer68 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale67);
        int int69 = jDOMNodePointer52.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer57, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer68);
        org.w3c.dom.Node node70 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer71 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer68, node70);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator72 = jDOMNodePointer41.childIterator(nodeTest42, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer71);
        java.lang.Object obj73 = dOMNodePointer71.getImmediateNode();
        boolean boolean75 = dOMNodePointer71.equals((java.lang.Object) 10.0f);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer76 = dOMNodePointer71.getParent();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer77 = dOMNodePointer71.getImmediateParentPointer();
        boolean boolean78 = dOMNodePointer32.equals((java.lang.Object) nodePointer77);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer79 = dOMNodePointer32.getImmediateValuePointer();
        java.util.Locale locale80 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer81 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodePointer79, locale80);
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertNotNull(nodePointer38);
        org.junit.Assert.assertNotNull(nodeIterator47);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (-1L) + "'", obj53, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator54);
        org.junit.Assert.assertNotNull(nodeIterator58);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + (-1L) + "'", obj64, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator65);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(nodeIterator72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(nodePointer76);
        org.junit.Assert.assertNotNull(nodePointer77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(nodePointer79);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        boolean boolean11 = jDOMNodePointer8.isContainer();
        jDOMNodePointer8.setAttribute(true);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver14 = jDOMNodePointer8.getNamespaceResolver();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = jDOMNodePointer8.isLanguage("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(namespaceResolver14);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        java.lang.Object obj34 = dOMNodePointer32.getNodeValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = dOMNodePointer32.getValuePointer();
        boolean boolean36 = dOMNodePointer32.isNode();
        boolean boolean37 = dOMNodePointer32.isAttribute();
        java.util.Locale locale38 = dOMNodePointer32.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.QName qName39 = dOMNodePointer32.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(locale38);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale6);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = jDOMNodePointer7.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        java.lang.Object obj14 = jDOMNodePointer13.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator15 = jDOMNodePointer7.childIterator(nodeTest9, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer18.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        java.lang.Object obj25 = jDOMNodePointer24.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer18.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        int int30 = jDOMNodePointer13.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, node31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer2.childIterator(nodeTest3, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer32);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest34 = null;
        boolean boolean35 = jDOMNodePointer2.testNode(nodeTest34);
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer2, locale36);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer39 = jDOMNodePointer37.namespacePointer("");
        jDOMNodePointer37.setAttribute(false);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest42 = null;
        java.util.Locale locale45 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer46 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale45);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest47 = null;
        java.util.Locale locale50 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer51 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale50);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator52 = jDOMNodePointer51.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest53 = null;
        java.util.Locale locale56 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer57 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale56);
        java.lang.Object obj58 = jDOMNodePointer57.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator59 = jDOMNodePointer51.childIterator(nodeTest53, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer57);
        java.util.Locale locale61 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer62 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale61);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator63 = jDOMNodePointer62.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest64 = null;
        java.util.Locale locale67 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer68 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale67);
        java.lang.Object obj69 = jDOMNodePointer68.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator70 = jDOMNodePointer62.childIterator(nodeTest64, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer68);
        java.util.Locale locale72 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer73 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale72);
        int int74 = jDOMNodePointer57.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer62, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer73);
        org.w3c.dom.Node node75 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer76 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer73, node75);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator77 = jDOMNodePointer46.childIterator(nodeTest47, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer76);
        java.lang.Object obj78 = dOMNodePointer76.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer79 = dOMNodePointer76.getImmediateValuePointer();
        org.w3c.dom.Node node80 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer81 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer76, node80);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer82 = dOMNodePointer76.getImmediateParentPointer();
        java.util.Locale locale84 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer85 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale84);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator86 = jDOMNodePointer85.namespaceIterator();
        boolean boolean87 = jDOMNodePointer85.isRoot();
        boolean boolean88 = jDOMNodePointer85.isLeaf();
        java.lang.Object obj89 = jDOMNodePointer85.clone();
        int int90 = jDOMNodePointer85.getLength();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver91 = jDOMNodePointer85.getNamespaceResolver();
        dOMNodePointer76.setNamespaceResolver(namespaceResolver91);
        java.lang.Object obj93 = dOMNodePointer76.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator94 = jDOMNodePointer37.childIterator(nodeTest42, true, (org.apache.commons.jxpath.ri.model.NodePointer) dOMNodePointer76);
        java.lang.Object obj95 = jDOMNodePointer37.getNodeValue();
        int int96 = jDOMNodePointer37.getLength();
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(nodePointer39);
        org.junit.Assert.assertNotNull(nodeIterator52);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (-1L) + "'", obj58, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator59);
        org.junit.Assert.assertNotNull(nodeIterator63);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + (-1L) + "'", obj69, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator70);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(nodeIterator77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(nodePointer79);
        org.junit.Assert.assertNotNull(nodePointer82);
        org.junit.Assert.assertNotNull(nodeIterator86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(obj89);
        org.junit.Assert.assertEquals(obj89.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj89), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj89), "");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertNotNull(namespaceResolver91);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertNotNull(nodeIterator94);
        org.junit.Assert.assertNotNull(obj95);
        org.junit.Assert.assertEquals(obj95.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj95), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj95), "");
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 1 + "'", int96 == 1);
    }
}

