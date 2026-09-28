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
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = jDOMNodePointer2.namespacePointer("http://www.w3.org/XML/1998/namespace");
        jDOMNodePointer2.setAttribute(true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale10);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator12 = jDOMNodePointer11.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale16);
        java.lang.Object obj18 = jDOMNodePointer17.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer11.childIterator(nodeTest13, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator20 = jDOMNodePointer2.childIterator(nodeTest7, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer17);
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) true, locale21, "hi!");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver24 = jDOMNodePointer23.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = jDOMNodePointer23.getImmediateValuePointer();
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodePointer25, locale26, "<<unknown namespace>>");
        java.lang.String str29 = jDOMNodePointer28.getNamespaceURI();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(nodeIterator12);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1L) + "'", obj18, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertNotNull(nodeIterator20);
        org.junit.Assert.assertNotNull(namespaceResolver24);
        org.junit.Assert.assertNotNull(nodePointer25);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale1, "http://www.w3.org/XML/1998/namespace");
        java.util.Locale locale4 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale4, "hi!");
        boolean boolean7 = jDOMNodePointer6.isRoot();
        java.lang.Object obj8 = jDOMNodePointer6.getValue();
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale10);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator12 = jDOMNodePointer11.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale16);
        java.lang.Object obj18 = jDOMNodePointer17.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer11.childIterator(nodeTest13, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer17);
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale21);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator23 = jDOMNodePointer22.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest24 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale27);
        java.lang.Object obj29 = jDOMNodePointer28.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator30 = jDOMNodePointer22.childIterator(nodeTest24, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer28);
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer33 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale32);
        int int34 = jDOMNodePointer17.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer22, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer33);
        org.apache.commons.jxpath.JXPathContext jXPathContext35 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer36 = jDOMNodePointer33.createPath(jXPathContext35);
        boolean boolean37 = jDOMNodePointer33.isNode();
        java.lang.String str38 = jDOMNodePointer33.getNamespaceURI();
        java.lang.Object obj39 = jDOMNodePointer33.getNodeValue();
        boolean boolean40 = jDOMNodePointer33.isRoot();
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer42 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer33, locale41);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer43 = jDOMNodePointer42.getImmediateParentPointer();
        java.lang.Object obj44 = jDOMNodePointer42.getBaseValue();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest45 = null;
        boolean boolean46 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer6, obj44, nodeTest45);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(nodeIterator12);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1L) + "'", obj18, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertNotNull(nodeIterator23);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1L) + "'", obj29, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(nodePointer36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (-1L) + "'", obj39, (-1L));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(nodePointer43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale1, "http://www.w3.org/XML/1998/namespace");
        int int4 = jDOMNodePointer3.getIndex();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = jDOMNodePointer3.getValuePointer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver6 = jDOMNodePointer3.getNamespaceResolver();
        int int7 = jDOMNodePointer3.getIndex();
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale9);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator11 = jDOMNodePointer10.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale15);
        java.lang.Object obj17 = jDOMNodePointer16.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = jDOMNodePointer10.childIterator(nodeTest12, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer16);
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer10, locale19);
        java.lang.Object obj21 = jDOMNodePointer10.getImmediateNode();
        java.lang.String str22 = jDOMNodePointer10.asPath();
        boolean boolean23 = jDOMNodePointer10.isCollection();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator24 = jDOMNodePointer10.namespaceIterator();
        java.lang.Object obj25 = jDOMNodePointer10.getNodeValue();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver26 = jDOMNodePointer10.getNamespaceResolver();
        int int27 = jDOMNodePointer3.compareTo((java.lang.Object) jDOMNodePointer10);
        java.lang.Object obj28 = jDOMNodePointer10.getNode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(namespaceResolver6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2147483648) + "'", int7 == (-2147483648));
        org.junit.Assert.assertNotNull(nodeIterator11);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1L) + "'", obj17, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1L) + "'", obj21, (-1L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodeIterator24);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(namespaceResolver26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1L) + "'", obj28, (-1L));
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer2, locale11);
        java.lang.Object obj13 = jDOMNodePointer2.getImmediateNode();
        java.lang.String str14 = jDOMNodePointer2.asPath();
        boolean boolean15 = jDOMNodePointer2.isCollection();
        jDOMNodePointer2.setAttribute(true);
        boolean boolean18 = jDOMNodePointer2.isActual();
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale20);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = jDOMNodePointer21.getParent();
        boolean boolean23 = jDOMNodePointer21.isNode();
        boolean boolean24 = jDOMNodePointer21.isContainer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator25 = jDOMNodePointer21.namespaceIterator();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, (java.lang.Object) nodeIterator25);
        java.lang.String str27 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix((java.lang.Object) jDOMNodePointer2);
        boolean boolean28 = jDOMNodePointer2.isRoot();
        java.lang.String str29 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix((java.lang.Object) boolean28);
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(nodePointer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeIterator25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest26 = null;
        boolean boolean27 = jDOMNodePointer8.testNode(nodeTest26);
        java.lang.String str28 = jDOMNodePointer8.getNamespaceURI();
        java.lang.Object obj29 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest30 = null;
        boolean boolean31 = jDOMNodePointer8.testNode(nodeTest30);
        org.w3c.dom.Node node32 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer33 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8, node32);
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale35, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj38 = jDOMNodePointer37.getBaseValue();
        java.util.Locale locale40 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer41 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale40);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer43 = jDOMNodePointer41.namespacePointer("http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer44 = nodePointer43.getParent();
        java.util.Locale locale46 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer47 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale46);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator48 = jDOMNodePointer47.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest49 = null;
        java.util.Locale locale52 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer53 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale52);
        java.lang.Object obj54 = jDOMNodePointer53.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator55 = jDOMNodePointer47.childIterator(nodeTest49, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer53);
        java.util.Locale locale56 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer57 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer47, locale56);
        java.lang.Object obj58 = jDOMNodePointer47.getImmediateNode();
        java.lang.String str59 = jDOMNodePointer47.asPath();
        int int60 = nodePointer43.compareTo((java.lang.Object) jDOMNodePointer47);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer61 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer37, (java.lang.Object) nodePointer43);
        boolean boolean62 = jDOMNodePointer37.isCollection();
        java.util.Locale locale64 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer65 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale64);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator66 = jDOMNodePointer65.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest67 = null;
        java.util.Locale locale70 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer71 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale70);
        java.lang.Object obj72 = jDOMNodePointer71.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator73 = jDOMNodePointer65.childIterator(nodeTest67, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer71);
        java.util.Locale locale75 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer76 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale75);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator77 = jDOMNodePointer76.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest78 = null;
        java.util.Locale locale81 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer82 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale81);
        java.lang.Object obj83 = jDOMNodePointer82.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator84 = jDOMNodePointer76.childIterator(nodeTest78, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer82);
        boolean boolean85 = jDOMNodePointer82.isContainer();
        boolean boolean86 = jDOMNodePointer82.isRoot();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest87 = null;
        boolean boolean88 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer71, (java.lang.Object) jDOMNodePointer82, nodeTest87);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest89 = null;
        boolean boolean90 = jDOMNodePointer82.testNode(nodeTest89);
        boolean boolean91 = jDOMNodePointer37.equals((java.lang.Object) nodeTest89);
        java.util.Locale locale92 = jDOMNodePointer37.getLocale();
        org.apache.commons.jxpath.ri.QName qName93 = jDOMNodePointer37.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator94 = dOMNodePointer33.attributeIterator(qName93);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1L) + "'", obj29, (-1L));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 1.0d + "'", obj38, 1.0d);
        org.junit.Assert.assertNotNull(nodePointer43);
        org.junit.Assert.assertNotNull(nodePointer44);
        org.junit.Assert.assertNotNull(nodeIterator48);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (-1L) + "'", obj54, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator55);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (-1L) + "'", obj58, (-1L));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(nodeIterator66);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + (-1L) + "'", obj72, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator73);
        org.junit.Assert.assertNotNull(nodeIterator77);
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + (-1L) + "'", obj83, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(locale92);
        org.junit.Assert.assertNotNull(qName93);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        boolean boolean3 = jDOMNodePointer2.isRoot();
        jDOMNodePointer2.setIndex((int) 'a');
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver6 = jDOMNodePointer2.getNamespaceResolver();
        java.lang.Object obj7 = jDOMNodePointer2.getBaseValue();
        java.lang.Object obj8 = jDOMNodePointer2.getRootNode();
        org.w3c.dom.Node node9 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer10 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, node9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = dOMNodePointer10.isLanguage("id('hi!')");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(namespaceResolver6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1L) + "'", obj7, (-1L));
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1L) + "'", obj8, (-1L));
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest26 = null;
        boolean boolean27 = jDOMNodePointer8.testNode(nodeTest26);
        boolean boolean28 = jDOMNodePointer8.isNode();
        java.lang.Object obj29 = jDOMNodePointer8.getNodeValue();
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer32.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest34 = null;
        java.util.Locale locale37 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer38 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale37);
        java.lang.Object obj39 = jDOMNodePointer38.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator40 = jDOMNodePointer32.childIterator(nodeTest34, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer38);
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
        int int55 = jDOMNodePointer38.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer43, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer54);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver56 = jDOMNodePointer43.getNamespaceResolver();
        java.lang.String str57 = jDOMNodePointer43.getNamespaceURI();
        java.lang.Object obj58 = jDOMNodePointer43.getBaseValue();
        java.util.Locale locale60 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer62 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale60, "http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer63 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer43, (java.lang.Object) jDOMNodePointer62);
        boolean boolean65 = jDOMNodePointer63.equals((java.lang.Object) 1.0f);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer66 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8, (java.lang.Object) jDOMNodePointer63);
        java.util.Locale locale67 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer68 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer66, locale67);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer70 = jDOMNodePointer66.namespacePointer("/namespace::");
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1L) + "'", obj29, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (-1L) + "'", obj39, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator40);
        org.junit.Assert.assertNotNull(nodeIterator44);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (-1L) + "'", obj50, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(namespaceResolver56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (-1L) + "'", obj58, (-1L));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(nodePointer70);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        boolean boolean3 = jDOMNodePointer2.isRoot();
        jDOMNodePointer2.setIndex((int) 'a');
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver6 = jDOMNodePointer2.getNamespaceResolver();
        java.lang.Object obj7 = jDOMNodePointer2.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = jDOMNodePointer2.getValuePointer();
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer2, locale9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(namespaceResolver6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1L) + "'", obj7, (-1L));
        org.junit.Assert.assertNotNull(nodePointer8);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer2, locale11);
        java.lang.Object obj13 = jDOMNodePointer2.getImmediateNode();
        java.lang.String str14 = jDOMNodePointer2.asPath();
        boolean boolean15 = jDOMNodePointer2.isCollection();
        jDOMNodePointer2.setAttribute(true);
        boolean boolean18 = jDOMNodePointer2.isActual();
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale20);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = jDOMNodePointer21.getParent();
        boolean boolean23 = jDOMNodePointer21.isNode();
        boolean boolean24 = jDOMNodePointer21.isContainer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator25 = jDOMNodePointer21.namespaceIterator();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, (java.lang.Object) nodeIterator25);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver27 = jDOMNodePointer26.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator28 = jDOMNodePointer26.namespaceIterator();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = jDOMNodePointer26.getImmediateValuePointer();
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer31 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodePointer29, locale30);
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(nodePointer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeIterator25);
        org.junit.Assert.assertNotNull(namespaceResolver27);
        org.junit.Assert.assertNotNull(nodeIterator28);
        org.junit.Assert.assertNotNull(nodePointer29);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest26 = null;
        boolean boolean27 = jDOMNodePointer8.testNode(nodeTest26);
        boolean boolean28 = jDOMNodePointer8.isNode();
        java.lang.Object obj29 = jDOMNodePointer8.getNodeValue();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest30 = null;
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale33);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer36 = jDOMNodePointer34.namespacePointer("http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = nodePointer36.getParent();
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale39);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator41 = jDOMNodePointer40.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest42 = null;
        java.util.Locale locale45 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer46 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale45);
        java.lang.Object obj47 = jDOMNodePointer46.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator48 = jDOMNodePointer40.childIterator(nodeTest42, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer46);
        java.util.Locale locale49 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer50 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer40, locale49);
        java.lang.Object obj51 = jDOMNodePointer40.getImmediateNode();
        java.lang.String str52 = jDOMNodePointer40.asPath();
        int int53 = nodePointer36.compareTo((java.lang.Object) jDOMNodePointer40);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator54 = jDOMNodePointer8.childIterator(nodeTest30, false, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer40);
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
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator69 = jDOMNodePointer68.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest70 = null;
        java.util.Locale locale73 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer74 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale73);
        java.lang.Object obj75 = jDOMNodePointer74.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator76 = jDOMNodePointer68.childIterator(nodeTest70, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer74);
        java.util.Locale locale78 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer79 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale78);
        int int80 = jDOMNodePointer63.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer68, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer79);
        org.apache.commons.jxpath.JXPathContext jXPathContext81 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer82 = jDOMNodePointer79.createPath(jXPathContext81);
        boolean boolean83 = jDOMNodePointer79.isNode();
        java.lang.Object obj84 = jDOMNodePointer79.getImmediateNode();
        org.apache.commons.jxpath.JXPathContext jXPathContext85 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer86 = jDOMNodePointer79.createPath(jXPathContext85);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer87 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8, (java.lang.Object) jDOMNodePointer79);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator88 = jDOMNodePointer8.namespaceIterator();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1L) + "'", obj29, (-1L));
        org.junit.Assert.assertNotNull(nodePointer36);
        org.junit.Assert.assertNotNull(nodePointer37);
        org.junit.Assert.assertNotNull(nodeIterator41);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (-1L) + "'", obj47, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator48);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (-1L) + "'", obj51, (-1L));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(nodeIterator54);
        org.junit.Assert.assertNotNull(nodeIterator58);
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + (-1L) + "'", obj64, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator65);
        org.junit.Assert.assertNotNull(nodeIterator69);
        org.junit.Assert.assertEquals("'" + obj75 + "' != '" + (-1L) + "'", obj75, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator76);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(nodePointer82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + obj84 + "' != '" + (-1L) + "'", obj84, (-1L));
        org.junit.Assert.assertNotNull(nodePointer86);
        org.junit.Assert.assertNotNull(nodeIterator88);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer26 = jDOMNodePointer8.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = nodePointer26.getParent();
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer30 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale29);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator31 = jDOMNodePointer30.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest32 = null;
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale35);
        java.lang.Object obj37 = jDOMNodePointer36.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator38 = jDOMNodePointer30.childIterator(nodeTest32, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer36);
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
        int int53 = jDOMNodePointer36.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer41, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer52);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer54 = jDOMNodePointer52.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest55 = null;
        boolean boolean56 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(nodePointer26, (java.lang.Object) nodePointer54, nodeTest55);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer57 = nodePointer26.getImmediateValuePointer();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodePointer26);
        org.junit.Assert.assertNull(nodePointer27);
        org.junit.Assert.assertNotNull(nodeIterator31);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (-1L) + "'", obj37, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator38);
        org.junit.Assert.assertNotNull(nodeIterator42);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (-1L) + "'", obj48, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator49);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(nodePointer54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(nodePointer57);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale1, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        java.lang.String str5 = jDOMNodePointer3.getNamespaceURI();
        boolean boolean6 = jDOMNodePointer3.isActual();
        java.lang.String str7 = jDOMNodePointer3.asPath();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0d + "'", obj4, 1.0d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "id('http://www.w3.org/XML/1998/namespace')" + "'", str7, "id('http://www.w3.org/XML/1998/namespace')");
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = jDOMNodePointer2.namespacePointer("http://www.w3.org/XML/1998/namespace");
        jDOMNodePointer2.setAttribute(true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale10);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator12 = jDOMNodePointer11.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale16);
        java.lang.Object obj18 = jDOMNodePointer17.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer11.childIterator(nodeTest13, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator20 = jDOMNodePointer2.childIterator(nodeTest7, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer17);
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) true, locale21, "hi!");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver24 = jDOMNodePointer23.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = jDOMNodePointer23.getImmediateValuePointer();
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodePointer25, locale26, "<<unknown namespace>>");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest29 = null;
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale32, "http://www.w3.org/XML/1998/namespace");
        int int35 = jDOMNodePointer34.getIndex();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator36 = jDOMNodePointer28.childIterator(nodeTest29, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer34);
        java.lang.String str37 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName((java.lang.Object) nodeIterator36);
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(nodeIterator12);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1L) + "'", obj18, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertNotNull(nodeIterator20);
        org.junit.Assert.assertNotNull(namespaceResolver24);
        org.junit.Assert.assertNotNull(nodePointer25);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-2147483648) + "'", int35 == (-2147483648));
        org.junit.Assert.assertNotNull(nodeIterator36);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale1, "http://www.w3.org/XML/1998/namespace");
        int int4 = jDOMNodePointer3.getIndex();
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
        boolean boolean27 = jDOMNodePointer24.isContainer();
        boolean boolean28 = jDOMNodePointer24.isRoot();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest29 = null;
        boolean boolean30 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13, (java.lang.Object) jDOMNodePointer24, nodeTest29);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer31 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, (java.lang.Object) jDOMNodePointer24);
        java.lang.String str32 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName((java.lang.Object) jDOMNodePointer31);
        boolean boolean33 = jDOMNodePointer31.isAttribute();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = jDOMNodePointer31.isLanguage("/namespace::http://www.w3.org/XML/1998/namespace");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10, locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = jDOMNodePointer2.getParent();
        boolean boolean4 = jDOMNodePointer2.isLeaf();
        jDOMNodePointer2.printPointerChain();
        jDOMNodePointer2.setAttribute(false);
        boolean boolean8 = jDOMNodePointer2.isLeaf();
        jDOMNodePointer2.printPointerChain();
        java.lang.Object obj10 = jDOMNodePointer2.clone();
        org.apache.commons.jxpath.ri.QName qName11 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator12 = jDOMNodePointer2.attributeIterator(qName11);
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "");
        org.junit.Assert.assertNotNull(nodeIterator12);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.lang.Object obj11 = jDOMNodePointer2.getBaseValue();
        boolean boolean12 = jDOMNodePointer2.isLeaf();
        boolean boolean13 = jDOMNodePointer2.isNode();
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest40 = null;
        boolean boolean41 = jDOMNodePointer22.testNode(nodeTest40);
        java.lang.String str42 = jDOMNodePointer22.asPath();
        int int43 = jDOMNodePointer2.compareTo((java.lang.Object) jDOMNodePointer22);
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1L) + "'", obj11, (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(nodeIterator17);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1L) + "'", obj23, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator24);
        org.junit.Assert.assertNotNull(nodeIterator28);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (-1L) + "'", obj34, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest26 = null;
        boolean boolean27 = jDOMNodePointer8.testNode(nodeTest26);
        boolean boolean28 = jDOMNodePointer8.isCollection();
        org.apache.commons.jxpath.ri.QName qName29 = jDOMNodePointer8.getName();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(qName29);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest26 = null;
        boolean boolean27 = jDOMNodePointer8.testNode(nodeTest26);
        java.lang.String str28 = jDOMNodePointer8.getNamespaceURI();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest29 = null;
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale32, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj35 = jDOMNodePointer34.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator36 = jDOMNodePointer8.childIterator(nodeTest29, false, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer34);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest37 = null;
        boolean boolean38 = jDOMNodePointer8.testNode(nodeTest37);
        java.lang.String str39 = jDOMNodePointer8.getNamespaceURI();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer41 = jDOMNodePointer8.namespacePointer("");
        java.util.Locale locale42 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer44 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer8, locale42, "id('hi!')");
        boolean boolean45 = jDOMNodePointer44.isLeaf();
        org.apache.commons.jxpath.JXPathContext jXPathContext46 = null;
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
        java.lang.Object obj73 = jDOMNodePointer55.clone();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator74 = jDOMNodePointer55.namespaceIterator();
        org.apache.commons.jxpath.ri.QName qName75 = jDOMNodePointer55.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer77 = jDOMNodePointer44.createChild(jXPathContext46, qName75, (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 1.0d + "'", obj35, 1.0d);
        org.junit.Assert.assertNotNull(nodeIterator36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(nodePointer41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(nodeIterator50);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (-1L) + "'", obj56, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator57);
        org.junit.Assert.assertNotNull(nodeIterator61);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + (-1L) + "'", obj67, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator68);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertEquals(obj73.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj73), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj73), "");
        org.junit.Assert.assertNotNull(nodeIterator74);
        org.junit.Assert.assertNotNull(qName75);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale1);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver3 = jDOMNodePointer2.getNamespaceResolver();
        java.lang.String str4 = jDOMNodePointer2.asPath();
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
        java.lang.String str31 = jDOMNodePointer13.toString();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, (java.lang.Object) jDOMNodePointer13);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = jDOMNodePointer32.getImmediateValuePointer();
        boolean boolean34 = jDOMNodePointer32.isRoot();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = jDOMNodePointer32.getImmediateParentPointer();
        java.lang.String str36 = jDOMNodePointer32.toString();
        java.lang.Object obj37 = jDOMNodePointer32.getBaseValue();
        jDOMNodePointer32.setAttribute(true);
        org.junit.Assert.assertNotNull(namespaceResolver3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(nodePointer33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "");
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10, locale1);
        java.lang.Object obj3 = jDOMNodePointer2.getImmediateNode();
        java.lang.Object obj4 = jDOMNodePointer2.getImmediateNode();
        java.lang.String str5 = jDOMNodePointer2.asPath();
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer2, locale6);
        java.lang.Object obj8 = jDOMNodePointer2.getNode();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 10 + "'", obj3, 10);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10 + "'", obj4, 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10 + "'", obj8, 10);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
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
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver26 = jDOMNodePointer13.getNamespaceResolver();
        java.lang.String str27 = jDOMNodePointer13.getNamespaceURI();
        java.lang.Object obj28 = jDOMNodePointer13.getBaseValue();
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale30, "http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer33 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13, (java.lang.Object) jDOMNodePointer32);
        int int34 = jDOMNodePointer33.getLength();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(namespaceResolver26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1L) + "'", obj28, (-1L));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
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
        java.lang.String str26 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix((java.lang.Object) jDOMNodePointer24);
        java.lang.String str27 = jDOMNodePointer24.getNamespaceURI();
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer30 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale29);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator31 = jDOMNodePointer30.namespaceIterator();
        jDOMNodePointer30.setAttribute(false);
        java.lang.Object obj34 = jDOMNodePointer30.clone();
        java.lang.Object obj35 = jDOMNodePointer30.clone();
        boolean boolean36 = jDOMNodePointer30.isCollection();
        java.lang.String str38 = jDOMNodePointer30.getNamespaceURI("");
        boolean boolean39 = jDOMNodePointer30.isCollection();
        java.lang.Object obj40 = jDOMNodePointer30.getImmediateNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest41 = null;
        boolean boolean42 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24, (java.lang.Object) jDOMNodePointer30, nodeTest41);
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(nodeIterator31);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "");
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (-1L) + "'", obj40, (-1L));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = jDOMNodePointer2.namespacePointer("http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer4.getParent();
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator9 = jDOMNodePointer8.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale13);
        java.lang.Object obj15 = jDOMNodePointer14.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator16 = jDOMNodePointer8.childIterator(nodeTest10, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer14);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer8, locale17);
        java.lang.Object obj19 = jDOMNodePointer8.getImmediateNode();
        java.lang.String str20 = jDOMNodePointer8.asPath();
        int int21 = nodePointer4.compareTo((java.lang.Object) jDOMNodePointer8);
        java.lang.String str23 = jDOMNodePointer8.getNamespaceURI("hi!");
        java.lang.Object obj24 = jDOMNodePointer8.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = jDOMNodePointer8.getImmediateParentPointer();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodeIterator9);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1L) + "'", obj15, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator16);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1L) + "'", obj19, (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1L) + "'", obj24, (-1L));
        org.junit.Assert.assertNull(nodePointer25);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.lang.Object obj11 = jDOMNodePointer8.getValue();
        jDOMNodePointer8.printPointerChain();
        org.apache.commons.jxpath.JXPathContext jXPathContext13 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = jDOMNodePointer8.createPath(jXPathContext13);
        boolean boolean15 = jDOMNodePointer8.isContainer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = jDOMNodePointer8.testNode(nodeTest16);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator18 = jDOMNodePointer8.namespaceIterator();
        boolean boolean19 = jDOMNodePointer8.isActual();
        org.apache.commons.jxpath.JXPathContext jXPathContext20 = null;
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest47 = null;
        boolean boolean48 = jDOMNodePointer29.testNode(nodeTest47);
        boolean boolean49 = jDOMNodePointer29.isNode();
        java.lang.Object obj50 = jDOMNodePointer29.getNodeValue();
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
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator65 = jDOMNodePointer64.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest66 = null;
        java.util.Locale locale69 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer70 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale69);
        java.lang.Object obj71 = jDOMNodePointer70.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator72 = jDOMNodePointer64.childIterator(nodeTest66, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer70);
        java.util.Locale locale74 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer75 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale74);
        int int76 = jDOMNodePointer59.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer64, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer75);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver77 = jDOMNodePointer64.getNamespaceResolver();
        java.lang.String str78 = jDOMNodePointer64.getNamespaceURI();
        java.lang.Object obj79 = jDOMNodePointer64.getBaseValue();
        java.util.Locale locale81 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer83 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale81, "http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer84 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer64, (java.lang.Object) jDOMNodePointer83);
        boolean boolean86 = jDOMNodePointer84.equals((java.lang.Object) 1.0f);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer87 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29, (java.lang.Object) jDOMNodePointer84);
        org.apache.commons.jxpath.ri.QName qName88 = jDOMNodePointer84.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer89 = jDOMNodePointer8.createAttribute(jXPathContext20, qName88);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot create an attribute for path /@null, operation is not allowed for this type of node");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(nodeIterator24);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1L) + "'", obj30, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator31);
        org.junit.Assert.assertNotNull(nodeIterator35);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (-1L) + "'", obj41, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (-1L) + "'", obj50, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator54);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + (-1L) + "'", obj60, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator61);
        org.junit.Assert.assertNotNull(nodeIterator65);
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + (-1L) + "'", obj71, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator72);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(namespaceResolver77);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + (-1L) + "'", obj79, (-1L));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(qName88);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = jDOMNodePointer8.getParent();
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) ' ', locale13);
        boolean boolean15 = jDOMNodePointer14.isActual();
        boolean boolean16 = jDOMNodePointer8.equals((java.lang.Object) jDOMNodePointer14);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = jDOMNodePointer14.getImmediateParentPointer();
        org.w3c.dom.Node node18 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer19 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer17, node18);
        org.apache.commons.jxpath.JXPathContext jXPathContext20 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale22, "http://www.w3.org/XML/1998/namespace");
        int int25 = jDOMNodePointer24.getIndex();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer26 = jDOMNodePointer24.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName27 = jDOMNodePointer24.getName();
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer31 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale30);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = jDOMNodePointer31.namespacePointer("http://www.w3.org/XML/1998/namespace");
        jDOMNodePointer31.setAttribute(true);
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer31, locale36);
        java.lang.Object obj38 = jDOMNodePointer37.getNodeValue();
        java.lang.String str39 = jDOMNodePointer37.asPath();
        java.lang.Object obj40 = jDOMNodePointer37.getValue();
        boolean boolean41 = jDOMNodePointer37.isLeaf();
        jDOMNodePointer37.setIndex((int) (short) 0);
        java.util.Locale locale45 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer46 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale45);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator47 = jDOMNodePointer46.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest48 = null;
        java.util.Locale locale51 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer52 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale51);
        java.lang.Object obj53 = jDOMNodePointer52.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator54 = jDOMNodePointer46.childIterator(nodeTest48, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer52);
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer56 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer46, locale55);
        java.lang.Object obj57 = jDOMNodePointer46.getImmediateNode();
        java.lang.String str58 = jDOMNodePointer46.asPath();
        boolean boolean59 = jDOMNodePointer46.isCollection();
        jDOMNodePointer46.setAttribute(true);
        boolean boolean62 = jDOMNodePointer46.isActual();
        java.util.Locale locale64 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer65 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale64);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer66 = jDOMNodePointer65.getParent();
        boolean boolean67 = jDOMNodePointer65.isNode();
        boolean boolean68 = jDOMNodePointer65.isContainer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator69 = jDOMNodePointer65.namespaceIterator();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer70 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer46, (java.lang.Object) nodeIterator69);
        java.lang.String str71 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix((java.lang.Object) jDOMNodePointer46);
        boolean boolean72 = jDOMNodePointer37.equals((java.lang.Object) str71);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer73 = dOMNodePointer19.createChild(jXPathContext20, qName27, (int) (byte) 0, (java.lang.Object) str71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(nodePointer17);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2147483648) + "'", int25 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer26);
        org.junit.Assert.assertNotNull(qName27);
        org.junit.Assert.assertNotNull(nodePointer33);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(nodeIterator47);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (-1L) + "'", obj53, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator54);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (-1L) + "'", obj57, (-1L));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNull(nodePointer66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(nodeIterator69);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest26 = null;
        boolean boolean27 = jDOMNodePointer8.testNode(nodeTest26);
        boolean boolean28 = jDOMNodePointer8.isNode();
        org.apache.commons.jxpath.ri.QName qName29 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator30 = jDOMNodePointer8.attributeIterator(qName29);
        jDOMNodePointer8.printPointerChain();
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale33);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer36 = jDOMNodePointer34.namespacePointer("http://www.w3.org/XML/1998/namespace");
        jDOMNodePointer34.setAttribute(true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest39 = null;
        java.util.Locale locale42 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer43 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale42);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator44 = jDOMNodePointer43.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest45 = null;
        java.util.Locale locale48 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer49 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale48);
        java.lang.Object obj50 = jDOMNodePointer49.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator51 = jDOMNodePointer43.childIterator(nodeTest45, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer49);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator52 = jDOMNodePointer34.childIterator(nodeTest39, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer49);
        java.util.Locale locale53 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer55 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) true, locale53, "hi!");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver56 = jDOMNodePointer55.getNamespaceResolver();
        jDOMNodePointer8.setNamespaceResolver(namespaceResolver56);
        java.lang.Object obj58 = jDOMNodePointer8.getNode();
        java.lang.String str60 = jDOMNodePointer8.getNamespaceURI("hi!");
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(nodeIterator30);
        org.junit.Assert.assertNotNull(nodePointer36);
        org.junit.Assert.assertNotNull(nodeIterator44);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (-1L) + "'", obj50, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator51);
        org.junit.Assert.assertNotNull(nodeIterator52);
        org.junit.Assert.assertNotNull(namespaceResolver56);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (-1L) + "'", obj58, (-1L));
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = jDOMNodePointer2.getParent();
        boolean boolean4 = jDOMNodePointer2.isNode();
        boolean boolean5 = jDOMNodePointer2.isContainer();
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator9 = jDOMNodePointer8.namespaceIterator();
        boolean boolean10 = jDOMNodePointer2.equals((java.lang.Object) jDOMNodePointer8);
        java.lang.Object obj11 = jDOMNodePointer2.getNode();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver12 = jDOMNodePointer2.getNamespaceResolver();
        java.lang.Object obj13 = jDOMNodePointer2.getImmediateNode();
        org.apache.commons.jxpath.JXPathContext jXPathContext14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = jDOMNodePointer2.createPath(jXPathContext14);
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodeIterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1L) + "'", obj11, (-1L));
        org.junit.Assert.assertNotNull(namespaceResolver12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertNotNull(nodePointer15);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale1, "http://www.w3.org/XML/1998/namespace");
        int int4 = jDOMNodePointer3.getIndex();
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale6, "http://www.w3.org/XML/1998/namespace");
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale9, "hi!");
        boolean boolean12 = jDOMNodePointer11.isRoot();
        java.lang.Object obj13 = jDOMNodePointer11.getBaseValue();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver14 = jDOMNodePointer11.getNamespaceResolver();
        jDOMNodePointer3.setNamespaceResolver(namespaceResolver14);
        org.apache.commons.jxpath.JXPathContext jXPathContext16 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = jDOMNodePointer3.createPath(jXPathContext16);
        boolean boolean18 = nodePointer17.isContainer();
        org.w3c.dom.Node node19 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer20 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer17, node19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = dOMNodePointer20.getNamespaceURI();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1.0d + "'", obj13, 1.0d);
        org.junit.Assert.assertNotNull(namespaceResolver14);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        jDOMNodePointer2.setAttribute(false);
        java.lang.Object obj6 = jDOMNodePointer2.clone();
        java.lang.Object obj7 = jDOMNodePointer2.getImmediateNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale11, "http://www.w3.org/XML/1998/namespace");
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale14, "hi!");
        java.lang.String str17 = jDOMNodePointer16.asPath();
        jDOMNodePointer16.setAttribute(false);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator20 = jDOMNodePointer2.childIterator(nodeTest8, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer16);
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10, locale22);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = jDOMNodePointer23.getParent();
        boolean boolean25 = jDOMNodePointer23.isLeaf();
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale27);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator29 = jDOMNodePointer28.namespaceIterator();
        jDOMNodePointer28.setAttribute(false);
        java.lang.Object obj32 = jDOMNodePointer28.clone();
        java.lang.Object obj33 = jDOMNodePointer28.getImmediateNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest34 = null;
        boolean boolean35 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer23, (java.lang.Object) jDOMNodePointer28, nodeTest34);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest36 = null;
        boolean boolean37 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer16, (java.lang.Object) nodeTest34, nodeTest36);
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest64 = null;
        boolean boolean65 = jDOMNodePointer46.testNode(nodeTest64);
        java.lang.String str66 = jDOMNodePointer46.asPath();
        org.apache.commons.jxpath.JXPathContext jXPathContext67 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer68 = jDOMNodePointer46.createPath(jXPathContext67);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer69 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer16, (java.lang.Object) nodePointer68);
        java.lang.String str70 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix((java.lang.Object) nodePointer68);
        boolean boolean71 = nodePointer68.isContainer();
        boolean boolean72 = nodePointer68.isActual();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1L) + "'", obj7, (-1L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "id('hi!')" + "'", str17, "id('hi!')");
        org.junit.Assert.assertNotNull(nodeIterator20);
        org.junit.Assert.assertNull(nodePointer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(nodeIterator29);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (-1L) + "'", obj33, (-1L));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(nodeIterator41);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (-1L) + "'", obj47, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator48);
        org.junit.Assert.assertNotNull(nodeIterator52);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (-1L) + "'", obj58, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator59);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(nodePointer68);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10, locale1);
        boolean boolean3 = jDOMNodePointer2.isCollection();
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale5);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = jDOMNodePointer6.namespacePointer("http://www.w3.org/XML/1998/namespace");
        jDOMNodePointer6.setAttribute(false);
        boolean boolean11 = jDOMNodePointer2.equals((java.lang.Object) false);
        boolean boolean12 = jDOMNodePointer2.isContainer();
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale14);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator16 = jDOMNodePointer15.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer21 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale20);
        java.lang.Object obj22 = jDOMNodePointer21.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator23 = jDOMNodePointer15.childIterator(nodeTest17, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer21);
        boolean boolean24 = jDOMNodePointer21.isContainer();
        boolean boolean25 = jDOMNodePointer21.isRoot();
        java.lang.String str27 = jDOMNodePointer21.getNamespaceURI("");
        jDOMNodePointer21.setIndex((int) (short) -1);
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer32.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest34 = null;
        java.util.Locale locale37 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer38 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale37);
        java.lang.Object obj39 = jDOMNodePointer38.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator40 = jDOMNodePointer32.childIterator(nodeTest34, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer38);
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
        int int55 = jDOMNodePointer38.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer43, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer54);
        org.apache.commons.jxpath.JXPathContext jXPathContext56 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer57 = jDOMNodePointer54.createPath(jXPathContext56);
        boolean boolean58 = jDOMNodePointer54.isNode();
        java.lang.Object obj59 = jDOMNodePointer54.getImmediateNode();
        int int60 = jDOMNodePointer2.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer21, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer54);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer61 = jDOMNodePointer21.getImmediateValuePointer();
        org.apache.commons.jxpath.JXPathContext jXPathContext62 = null;
        java.util.Locale locale64 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer65 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (short) -1, locale64);
        java.lang.Object obj66 = jDOMNodePointer65.getValue();
        boolean boolean67 = jDOMNodePointer65.isRoot();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer69 = jDOMNodePointer65.namespacePointer("<<unknown namespace>>");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer70 = jDOMNodePointer21.createPath(jXPathContext62, (java.lang.Object) nodePointer69);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class org.jdom.Element (java.lang.Long is in module java.base of loader 'bootstrap'; org.jdom.Element is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeIterator16);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1L) + "'", obj22, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (-1L) + "'", obj39, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator40);
        org.junit.Assert.assertNotNull(nodeIterator44);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (-1L) + "'", obj50, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(nodePointer57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (-1L) + "'", obj59, (-1L));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(nodePointer61);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(nodePointer69);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale1);
        java.lang.String str3 = jDOMNodePointer2.toString();
        jDOMNodePointer2.setIndex((int) ' ');
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = jDOMNodePointer16.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = nodePointer34.getParent();
        nodePointer34.setAttribute(false);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator38 = jDOMNodePointer2.childIterator(nodeTest6, true, nodePointer34);
        java.lang.String str39 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix((java.lang.Object) jDOMNodePointer2);
        org.apache.commons.jxpath.JXPathContext jXPathContext40 = null;
        java.util.Locale locale42 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer43 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale42);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer45 = jDOMNodePointer43.namespacePointer("http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer46 = nodePointer45.getParent();
        java.util.Locale locale48 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer49 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale48);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator50 = jDOMNodePointer49.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest51 = null;
        java.util.Locale locale54 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer55 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale54);
        java.lang.Object obj56 = jDOMNodePointer55.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator57 = jDOMNodePointer49.childIterator(nodeTest51, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer55);
        java.util.Locale locale58 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer59 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer49, locale58);
        java.lang.Object obj60 = jDOMNodePointer49.getImmediateNode();
        java.lang.String str61 = jDOMNodePointer49.asPath();
        int int62 = nodePointer45.compareTo((java.lang.Object) jDOMNodePointer49);
        java.lang.String str63 = jDOMNodePointer49.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer64 = jDOMNodePointer2.createPath(jXPathContext40, (java.lang.Object) jDOMNodePointer49);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.String cannot be cast to class org.jdom.Element (java.lang.String is in module java.base of loader 'bootstrap'; org.jdom.Element is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodeIterator11);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1L) + "'", obj17, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertNotNull(nodeIterator22);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1L) + "'", obj28, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(nodePointer34);
        org.junit.Assert.assertNull(nodePointer35);
        org.junit.Assert.assertNotNull(nodeIterator38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(nodePointer45);
        org.junit.Assert.assertNotNull(nodePointer46);
        org.junit.Assert.assertNotNull(nodeIterator50);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (-1L) + "'", obj56, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator57);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + (-1L) + "'", obj60, (-1L));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = jDOMNodePointer2.namespacePointer("http://www.w3.org/XML/1998/namespace");
        jDOMNodePointer2.setAttribute(true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale10);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator12 = jDOMNodePointer11.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale16);
        java.lang.Object obj18 = jDOMNodePointer17.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer11.childIterator(nodeTest13, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator20 = jDOMNodePointer2.childIterator(nodeTest7, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer17);
        boolean boolean21 = jDOMNodePointer2.isContainer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = jDOMNodePointer2.getParent();
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale24);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer26 = jDOMNodePointer25.getParent();
        boolean boolean27 = jDOMNodePointer25.isNode();
        boolean boolean28 = jDOMNodePointer25.isContainer();
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer31 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale30);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator32 = jDOMNodePointer31.namespaceIterator();
        boolean boolean33 = jDOMNodePointer25.equals((java.lang.Object) jDOMNodePointer31);
        boolean boolean34 = jDOMNodePointer25.isAttribute();
        java.lang.String str35 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix((java.lang.Object) jDOMNodePointer25);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(nodePointer22, (java.lang.Object) jDOMNodePointer25);
        java.lang.String str37 = jDOMNodePointer36.getNamespaceURI();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(nodeIterator12);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1L) + "'", obj18, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertNotNull(nodeIterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(nodePointer22);
        org.junit.Assert.assertNull(nodePointer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(nodeIterator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "/namespace::<<unknown namespace>>");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = dOMNodePointer3.isLanguage("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10, locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = jDOMNodePointer2.getParent();
        java.lang.String str4 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix((java.lang.Object) jDOMNodePointer2);
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale1, "http://www.w3.org/XML/1998/namespace");
        int int4 = jDOMNodePointer3.getIndex();
        org.apache.commons.jxpath.JXPathContext jXPathContext5 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (short) -1, locale8);
        java.lang.Object obj10 = jDOMNodePointer9.getValue();
        org.apache.commons.jxpath.JXPathContext jXPathContext11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = jDOMNodePointer9.createPath(jXPathContext11);
        org.w3c.dom.Node node13 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer12, node13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet15 = jDOMNodePointer3.getNodeSetByKey(jXPathContext5, "http://www.w3.org/2000/xmlns/", (java.lang.Object) node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(nodePointer12);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
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
        boolean boolean22 = jDOMNodePointer19.isContainer();
        boolean boolean23 = jDOMNodePointer19.isRoot();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest24 = null;
        boolean boolean25 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8, (java.lang.Object) jDOMNodePointer19, nodeTest24);
        java.lang.Object obj26 = jDOMNodePointer19.getImmediateNode();
        java.lang.Object obj27 = jDOMNodePointer19.getRootNode();
        org.apache.commons.jxpath.JXPathContext jXPathContext28 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = jDOMNodePointer19.createPath(jXPathContext28);
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer32.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest34 = null;
        java.util.Locale locale37 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer38 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale37);
        java.lang.Object obj39 = jDOMNodePointer38.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator40 = jDOMNodePointer32.childIterator(nodeTest34, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer38);
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
        int int55 = jDOMNodePointer38.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer43, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer54);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer56 = jDOMNodePointer54.getImmediateValuePointer();
        java.util.Locale locale57 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer58 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer54, locale57);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer59 = jDOMNodePointer54.getImmediateParentPointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer60 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(nodePointer29, (java.lang.Object) jDOMNodePointer54);
        jDOMNodePointer54.setAttribute(false);
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (-1L) + "'", obj26, (-1L));
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (-1L) + "'", obj27, (-1L));
        org.junit.Assert.assertNotNull(nodePointer29);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (-1L) + "'", obj39, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator40);
        org.junit.Assert.assertNotNull(nodeIterator44);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (-1L) + "'", obj50, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(nodePointer56);
        org.junit.Assert.assertNull(nodePointer59);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = jDOMNodePointer2.namespacePointer("http://www.w3.org/XML/1998/namespace");
        jDOMNodePointer2.setAttribute(true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale10);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator12 = jDOMNodePointer11.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale16);
        java.lang.Object obj18 = jDOMNodePointer17.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer11.childIterator(nodeTest13, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator20 = jDOMNodePointer2.childIterator(nodeTest7, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer17);
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) true, locale21, "hi!");
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale25, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj28 = jDOMNodePointer27.getBaseValue();
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer31 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale30);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = jDOMNodePointer31.namespacePointer("http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = nodePointer33.getParent();
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale36);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator38 = jDOMNodePointer37.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest39 = null;
        java.util.Locale locale42 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer43 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale42);
        java.lang.Object obj44 = jDOMNodePointer43.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator45 = jDOMNodePointer37.childIterator(nodeTest39, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer43);
        java.util.Locale locale46 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer47 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer37, locale46);
        java.lang.Object obj48 = jDOMNodePointer37.getImmediateNode();
        java.lang.String str49 = jDOMNodePointer37.asPath();
        int int50 = nodePointer33.compareTo((java.lang.Object) jDOMNodePointer37);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer51 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer27, (java.lang.Object) nodePointer33);
        org.apache.commons.jxpath.JXPathContext jXPathContext52 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer53 = jDOMNodePointer27.createPath(jXPathContext52);
        boolean boolean54 = jDOMNodePointer27.isNode();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver55 = jDOMNodePointer27.getNamespaceResolver();
        java.lang.Object obj56 = jDOMNodePointer27.getNode();
        boolean boolean57 = jDOMNodePointer23.equals(obj56);
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(nodeIterator12);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1L) + "'", obj18, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertNotNull(nodeIterator20);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1.0d + "'", obj28, 1.0d);
        org.junit.Assert.assertNotNull(nodePointer33);
        org.junit.Assert.assertNotNull(nodePointer34);
        org.junit.Assert.assertNotNull(nodeIterator38);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (-1L) + "'", obj44, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator45);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (-1L) + "'", obj48, (-1L));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(nodePointer53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(namespaceResolver55);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 1.0d + "'", obj56, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer2, locale11);
        java.lang.Object obj13 = jDOMNodePointer2.getImmediateNode();
        java.lang.Object obj14 = jDOMNodePointer2.getBaseValue();
        jDOMNodePointer2.setAttribute(false);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        boolean boolean18 = jDOMNodePointer2.testNode(nodeTest17);
        java.lang.String str19 = jDOMNodePointer2.getNamespaceURI();
        java.lang.Object obj20 = jDOMNodePointer2.clone();
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale22);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = jDOMNodePointer23.namespacePointer("http://www.w3.org/XML/1998/namespace");
        jDOMNodePointer23.setAttribute(true);
        boolean boolean29 = jDOMNodePointer23.equals((java.lang.Object) "hi!");
        java.lang.String str30 = jDOMNodePointer23.toString();
        java.lang.Object obj31 = jDOMNodePointer23.getBaseValue();
        int int32 = jDOMNodePointer23.getLength();
        java.util.Locale locale34 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer35 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale34);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = jDOMNodePointer35.namespacePointer("http://www.w3.org/XML/1998/namespace");
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
        java.lang.Object obj64 = jDOMNodePointer46.clone();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator65 = jDOMNodePointer46.namespaceIterator();
        int int66 = jDOMNodePointer35.compareTo((java.lang.Object) jDOMNodePointer46);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer67 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer23, (java.lang.Object) int66);
        java.util.Locale locale69 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer70 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale69);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator71 = jDOMNodePointer70.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest72 = null;
        java.util.Locale locale75 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer76 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale75);
        java.lang.Object obj77 = jDOMNodePointer76.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator78 = jDOMNodePointer70.childIterator(nodeTest72, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer76);
        java.util.Locale locale79 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer80 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer70, locale79);
        java.lang.Object obj81 = jDOMNodePointer70.getImmediateNode();
        java.lang.String str82 = jDOMNodePointer70.asPath();
        boolean boolean83 = jDOMNodePointer70.isCollection();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator84 = jDOMNodePointer70.namespaceIterator();
        java.lang.Object obj85 = jDOMNodePointer70.getNodeValue();
        java.lang.String str86 = jDOMNodePointer70.asPath();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver87 = jDOMNodePointer70.getNamespaceResolver();
        jDOMNodePointer23.setNamespaceResolver(namespaceResolver87);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest89 = null;
        boolean boolean90 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, (java.lang.Object) jDOMNodePointer23, nodeTest89);
        java.lang.Object obj91 = jDOMNodePointer2.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer92 = jDOMNodePointer2.getParent();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
        org.junit.Assert.assertNotNull(nodePointer25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "" + "'", obj31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(nodePointer37);
        org.junit.Assert.assertNotNull(nodeIterator41);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (-1L) + "'", obj47, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator48);
        org.junit.Assert.assertNotNull(nodeIterator52);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (-1L) + "'", obj58, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator59);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertEquals(obj64.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj64), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj64), "");
        org.junit.Assert.assertNotNull(nodeIterator65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(nodeIterator71);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + (-1L) + "'", obj77, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator78);
        org.junit.Assert.assertEquals("'" + obj81 + "' != '" + (-1L) + "'", obj81, (-1L));
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(nodeIterator84);
        org.junit.Assert.assertEquals("'" + obj85 + "' != '" + (-1L) + "'", obj85, (-1L));
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(namespaceResolver87);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertEquals("'" + obj91 + "' != '" + (-1L) + "'", obj91, (-1L));
        org.junit.Assert.assertNull(nodePointer92);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        java.lang.Object obj3 = jDOMNodePointer2.getNode();
        int int4 = jDOMNodePointer2.getIndex();
        java.lang.Object obj5 = jDOMNodePointer2.getValue();
        java.util.Locale locale6 = jDOMNodePointer2.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = jDOMNodePointer2.namespacePointer("http://www.w3.org/2000/xmlns/");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = jDOMNodePointer2.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = jDOMNodePointer2.getValuePointer();
        org.apache.commons.jxpath.JXPathContext jXPathContext11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer10.createPath(jXPathContext11);
        org.w3c.dom.Node node13 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer10, node13);
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (short) -1, locale16);
        java.lang.Object obj18 = jDOMNodePointer17.getValue();
        boolean boolean19 = jDOMNodePointer17.isRoot();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = dOMNodePointer14.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer17, nodePointer20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Short cannot be cast to class org.w3c.dom.Node (java.lang.Short is in module java.base of loader 'bootstrap'; org.w3c.dom.Node is in module java.xml of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (-1L) + "'", obj3, (-1L));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer26 = jDOMNodePointer24.getImmediateValuePointer();
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer24, locale27);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = jDOMNodePointer24.getImmediateParentPointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass30 = nodePointer29.getClass();
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
        org.junit.Assert.assertNotNull(nodePointer26);
        org.junit.Assert.assertNull(nodePointer29);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale1, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale6);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = jDOMNodePointer7.namespacePointer("http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer9.getParent();
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer13.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale18);
        java.lang.Object obj20 = jDOMNodePointer19.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator21 = jDOMNodePointer13.childIterator(nodeTest15, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19);
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer13, locale22);
        java.lang.Object obj24 = jDOMNodePointer13.getImmediateNode();
        java.lang.String str25 = jDOMNodePointer13.asPath();
        int int26 = nodePointer9.compareTo((java.lang.Object) jDOMNodePointer13);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, (java.lang.Object) nodePointer9);
        boolean boolean28 = jDOMNodePointer3.isCollection();
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer31 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale30);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator32 = jDOMNodePointer31.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest33 = null;
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale36);
        java.lang.Object obj38 = jDOMNodePointer37.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator39 = jDOMNodePointer31.childIterator(nodeTest33, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer37);
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer42 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale41);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator43 = jDOMNodePointer42.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest44 = null;
        java.util.Locale locale47 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer48 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale47);
        java.lang.Object obj49 = jDOMNodePointer48.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator50 = jDOMNodePointer42.childIterator(nodeTest44, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer48);
        boolean boolean51 = jDOMNodePointer48.isContainer();
        boolean boolean52 = jDOMNodePointer48.isRoot();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest53 = null;
        boolean boolean54 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer37, (java.lang.Object) jDOMNodePointer48, nodeTest53);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest55 = null;
        boolean boolean56 = jDOMNodePointer48.testNode(nodeTest55);
        boolean boolean57 = jDOMNodePointer3.equals((java.lang.Object) nodeTest55);
        java.util.Locale locale58 = jDOMNodePointer3.getLocale();
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
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator73 = jDOMNodePointer72.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest74 = null;
        java.util.Locale locale77 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer78 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale77);
        java.lang.Object obj79 = jDOMNodePointer78.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator80 = jDOMNodePointer72.childIterator(nodeTest74, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer78);
        java.util.Locale locale82 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer83 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale82);
        int int84 = jDOMNodePointer67.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer72, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer83);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer85 = jDOMNodePointer83.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest86 = null;
        boolean boolean87 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, (java.lang.Object) jDOMNodePointer83, nodeTest86);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer88 = jDOMNodePointer83.getImmediateValuePointer();
        java.lang.String str89 = jDOMNodePointer83.toString();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0d + "'", obj4, 1.0d);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1L) + "'", obj24, (-1L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(nodeIterator32);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (-1L) + "'", obj38, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator39);
        org.junit.Assert.assertNotNull(nodeIterator43);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (-1L) + "'", obj49, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(locale58);
        org.junit.Assert.assertNotNull(nodeIterator62);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + (-1L) + "'", obj68, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator69);
        org.junit.Assert.assertNotNull(nodeIterator73);
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + (-1L) + "'", obj79, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator80);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(nodePointer85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(nodePointer88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) ' ', locale1);
        boolean boolean3 = jDOMNodePointer2.isActual();
        java.lang.Object obj4 = jDOMNodePointer2.getRootNode();
        java.lang.Object obj5 = jDOMNodePointer2.clone();
        java.lang.String str6 = jDOMNodePointer2.getNamespaceURI();
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale8);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer9.namespaceIterator();
        jDOMNodePointer9.setAttribute(false);
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale14);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = jDOMNodePointer15.namespacePointer("http://www.w3.org/XML/1998/namespace");
        jDOMNodePointer15.setAttribute(true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer24 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale23);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator25 = jDOMNodePointer24.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest26 = null;
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer30 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale29);
        java.lang.Object obj31 = jDOMNodePointer30.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator32 = jDOMNodePointer24.childIterator(nodeTest26, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer30);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer15.childIterator(nodeTest20, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer30);
        java.util.Locale locale34 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) true, locale34, "hi!");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver37 = jDOMNodePointer36.getNamespaceResolver();
        jDOMNodePointer9.setNamespaceResolver(namespaceResolver37);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer39 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, (java.lang.Object) jDOMNodePointer9);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver40 = jDOMNodePointer39.getNamespaceResolver();
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer42 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) namespaceResolver40, locale41);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + ' ' + "'", obj4, ' ');
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertNotNull(nodeIterator25);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (-1L) + "'", obj31, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator32);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertNotNull(namespaceResolver37);
        org.junit.Assert.assertNotNull(namespaceResolver40);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest26 = null;
        boolean boolean27 = jDOMNodePointer8.testNode(nodeTest26);
        boolean boolean28 = jDOMNodePointer8.isNode();
        org.apache.commons.jxpath.ri.QName qName29 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator30 = jDOMNodePointer8.attributeIterator(qName29);
        java.lang.String str32 = jDOMNodePointer8.getNamespaceURI("hi!");
        int int33 = jDOMNodePointer8.getLength();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(nodeIterator30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale1, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj4 = jDOMNodePointer3.getBaseValue();
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale6);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = jDOMNodePointer7.namespacePointer("http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer9.getParent();
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale12);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = jDOMNodePointer13.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale18);
        java.lang.Object obj20 = jDOMNodePointer19.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator21 = jDOMNodePointer13.childIterator(nodeTest15, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19);
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer13, locale22);
        java.lang.Object obj24 = jDOMNodePointer13.getImmediateNode();
        java.lang.String str25 = jDOMNodePointer13.asPath();
        int int26 = nodePointer9.compareTo((java.lang.Object) jDOMNodePointer13);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, (java.lang.Object) nodePointer9);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = nodePointer9.getParent();
        boolean boolean29 = nodePointer28.isActual();
        org.w3c.dom.Node node30 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer31 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(nodePointer28, node30);
        org.apache.commons.jxpath.JXPathContext jXPathContext32 = null;
        java.util.Locale locale34 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer35 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale34);
        java.lang.Object obj36 = jDOMNodePointer35.getNode();
        int int37 = jDOMNodePointer35.getIndex();
        java.lang.Object obj38 = jDOMNodePointer35.getValue();
        java.util.Locale locale39 = jDOMNodePointer35.getLocale();
        org.apache.commons.jxpath.ri.QName qName40 = jDOMNodePointer35.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = dOMNodePointer31.createChild(jXPathContext32, qName40, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1.0d + "'", obj4, 1.0d);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1L) + "'", obj24, (-1L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(nodePointer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (-1L) + "'", obj36, (-1L));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-2147483648) + "'", int37 == (-2147483648));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(locale39);
        org.junit.Assert.assertNotNull(qName40);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) ' ', locale1);
        java.lang.Object obj3 = jDOMNodePointer2.clone();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator9 = jDOMNodePointer8.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale13);
        java.lang.Object obj15 = jDOMNodePointer14.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator16 = jDOMNodePointer8.childIterator(nodeTest10, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer14);
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale18);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator20 = jDOMNodePointer19.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest21 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale24);
        java.lang.Object obj26 = jDOMNodePointer25.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator27 = jDOMNodePointer19.childIterator(nodeTest21, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer25);
        boolean boolean28 = jDOMNodePointer25.isContainer();
        boolean boolean29 = jDOMNodePointer25.isRoot();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest30 = null;
        boolean boolean31 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer14, (java.lang.Object) jDOMNodePointer25, nodeTest30);
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
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator46 = jDOMNodePointer45.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest47 = null;
        java.util.Locale locale50 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer51 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale50);
        java.lang.Object obj52 = jDOMNodePointer51.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator53 = jDOMNodePointer45.childIterator(nodeTest47, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer51);
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer56 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale55);
        int int57 = jDOMNodePointer40.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer45, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer56);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver58 = jDOMNodePointer45.getNamespaceResolver();
        jDOMNodePointer25.setNamespaceResolver(namespaceResolver58);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator60 = jDOMNodePointer2.childIterator(nodeTest4, false, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer25);
        jDOMNodePointer2.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest62 = null;
        boolean boolean63 = jDOMNodePointer2.testNode(nodeTest62);
        org.apache.commons.jxpath.ri.QName qName64 = jDOMNodePointer2.getName();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "");
        org.junit.Assert.assertNotNull(nodeIterator9);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1L) + "'", obj15, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator16);
        org.junit.Assert.assertNotNull(nodeIterator20);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (-1L) + "'", obj26, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(nodeIterator35);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (-1L) + "'", obj41, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator42);
        org.junit.Assert.assertNotNull(nodeIterator46);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + (-1L) + "'", obj52, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator53);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(namespaceResolver58);
        org.junit.Assert.assertNotNull(nodeIterator60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(qName64);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = jDOMNodePointer2.namespacePointer("http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer4.getParent();
        java.lang.Object obj6 = nodePointer5.clone();
        java.lang.Object obj7 = nodePointer5.clone();
        org.apache.commons.jxpath.JXPathContext jXPathContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer11 = nodePointer5.getPointerByKey(jXPathContext8, "id('http://www.w3.org/XML/1998/namespace')", "/namespace::");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "");
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest26 = null;
        boolean boolean27 = jDOMNodePointer8.testNode(nodeTest26);
        boolean boolean28 = jDOMNodePointer8.isNode();
        org.apache.commons.jxpath.ri.QName qName29 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator30 = jDOMNodePointer8.attributeIterator(qName29);
        java.lang.String str32 = jDOMNodePointer8.getNamespaceURI("hi!");
        java.lang.Object obj33 = jDOMNodePointer8.getImmediateNode();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(nodeIterator30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (-1L) + "'", obj33, (-1L));
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale1, "http://www.w3.org/XML/1998/namespace");
        int int4 = jDOMNodePointer3.getIndex();
        java.lang.String str6 = jDOMNodePointer3.getNamespaceURI("id('http://www.w3.org/XML/1998/namespace')");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
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
        boolean boolean26 = jDOMNodePointer24.isNode();
        boolean boolean27 = jDOMNodePointer24.isLeaf();
        java.lang.Object obj28 = jDOMNodePointer24.getNodeValue();
        java.lang.String str29 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix((java.lang.Object) jDOMNodePointer24);
        boolean boolean30 = jDOMNodePointer24.isContainer();
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24, node31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = dOMNodePointer32.getValue();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1L) + "'", obj28, (-1L));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest26 = null;
        boolean boolean27 = jDOMNodePointer8.testNode(nodeTest26);
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer30 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10, locale29);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = jDOMNodePointer30.getParent();
        java.lang.Object obj32 = jDOMNodePointer30.getNode();
        java.util.Locale locale34 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer35 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) ' ', locale34);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer30, (java.lang.Object) jDOMNodePointer35);
        boolean boolean37 = jDOMNodePointer30.isLeaf();
        org.apache.commons.jxpath.JXPathContext jXPathContext38 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer39 = jDOMNodePointer30.createPath(jXPathContext38);
        boolean boolean40 = jDOMNodePointer8.equals((java.lang.Object) jDOMNodePointer30);
        jDOMNodePointer30.printPointerChain();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(nodePointer31);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 10 + "'", obj32, 10);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(nodePointer39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest26 = null;
        boolean boolean27 = jDOMNodePointer8.testNode(nodeTest26);
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer30 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale29);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator31 = jDOMNodePointer30.namespaceIterator();
        jDOMNodePointer30.setAttribute(false);
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale35);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = jDOMNodePointer36.namespacePointer("http://www.w3.org/XML/1998/namespace");
        jDOMNodePointer36.setAttribute(true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest41 = null;
        java.util.Locale locale44 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer45 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale44);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator46 = jDOMNodePointer45.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest47 = null;
        java.util.Locale locale50 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer51 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale50);
        java.lang.Object obj52 = jDOMNodePointer51.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator53 = jDOMNodePointer45.childIterator(nodeTest47, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer51);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator54 = jDOMNodePointer36.childIterator(nodeTest41, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer51);
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer57 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) true, locale55, "hi!");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver58 = jDOMNodePointer57.getNamespaceResolver();
        jDOMNodePointer30.setNamespaceResolver(namespaceResolver58);
        jDOMNodePointer8.setNamespaceResolver(namespaceResolver58);
        java.lang.Object obj61 = jDOMNodePointer8.getNodeValue();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(nodeIterator31);
        org.junit.Assert.assertNotNull(nodePointer38);
        org.junit.Assert.assertNotNull(nodeIterator46);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + (-1L) + "'", obj52, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator53);
        org.junit.Assert.assertNotNull(nodeIterator54);
        org.junit.Assert.assertNotNull(namespaceResolver58);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (-1L) + "'", obj61, (-1L));
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer2, locale11);
        java.lang.Object obj13 = jDOMNodePointer2.getImmediateNode();
        java.lang.String str14 = jDOMNodePointer2.asPath();
        boolean boolean15 = jDOMNodePointer2.isCollection();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator16 = jDOMNodePointer2.namespaceIterator();
        java.lang.Object obj17 = jDOMNodePointer2.getNodeValue();
        java.lang.Object obj18 = jDOMNodePointer2.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = jDOMNodePointer2.getImmediateValuePointer();
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer2, locale20, "<<unknown namespace>>");
        java.lang.Object obj23 = jDOMNodePointer2.getNodeValue();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodeIterator16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1L) + "'", obj17, (-1L));
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1L) + "'", obj18, (-1L));
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1L) + "'", obj23, (-1L));
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale1);
        java.lang.String str3 = jDOMNodePointer2.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = jDOMNodePointer2.namespacePointer("");
        java.lang.Object obj6 = jDOMNodePointer2.getBaseValue();
        boolean boolean7 = jDOMNodePointer2.isActual();
        org.w3c.dom.Node node8 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, node8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.QName qName10 = dOMNodePointer9.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "" + "'", obj6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale1);
        java.lang.String str3 = jDOMNodePointer2.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = jDOMNodePointer2.namespacePointer("");
        java.lang.Object obj6 = jDOMNodePointer2.getBaseValue();
        boolean boolean7 = jDOMNodePointer2.isActual();
        org.w3c.dom.Node node8 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer9 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, node8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dOMNodePointer9.getNamespaceURI();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "" + "'", obj6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        jDOMNodePointer2.setAttribute(false);
        java.lang.Object obj6 = jDOMNodePointer2.clone();
        java.lang.Object obj7 = jDOMNodePointer2.getImmediateNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale11, "http://www.w3.org/XML/1998/namespace");
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale14, "hi!");
        java.lang.String str17 = jDOMNodePointer16.asPath();
        jDOMNodePointer16.setAttribute(false);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator20 = jDOMNodePointer2.childIterator(nodeTest8, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer16);
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10, locale22);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = jDOMNodePointer23.getParent();
        boolean boolean25 = jDOMNodePointer23.isLeaf();
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale27);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator29 = jDOMNodePointer28.namespaceIterator();
        jDOMNodePointer28.setAttribute(false);
        java.lang.Object obj32 = jDOMNodePointer28.clone();
        java.lang.Object obj33 = jDOMNodePointer28.getImmediateNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest34 = null;
        boolean boolean35 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer23, (java.lang.Object) jDOMNodePointer28, nodeTest34);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest36 = null;
        boolean boolean37 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer16, (java.lang.Object) nodeTest34, nodeTest36);
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest64 = null;
        boolean boolean65 = jDOMNodePointer46.testNode(nodeTest64);
        java.lang.String str66 = jDOMNodePointer46.asPath();
        org.apache.commons.jxpath.JXPathContext jXPathContext67 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer68 = jDOMNodePointer46.createPath(jXPathContext67);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer69 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer16, (java.lang.Object) nodePointer68);
        java.util.Locale locale71 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer72 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale71);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer74 = jDOMNodePointer72.namespacePointer("http://www.w3.org/XML/1998/namespace");
        jDOMNodePointer72.setAttribute(true);
        java.util.Locale locale77 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer78 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer72, locale77);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer79 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer69, (java.lang.Object) jDOMNodePointer72);
        org.apache.commons.jxpath.JXPathContext jXPathContext80 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer81 = jDOMNodePointer69.createPath(jXPathContext80);
        jDOMNodePointer69.setIndex((int) (short) 0);
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1L) + "'", obj7, (-1L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "id('hi!')" + "'", str17, "id('hi!')");
        org.junit.Assert.assertNotNull(nodeIterator20);
        org.junit.Assert.assertNull(nodePointer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(nodeIterator29);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (-1L) + "'", obj33, (-1L));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(nodeIterator41);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (-1L) + "'", obj47, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator48);
        org.junit.Assert.assertNotNull(nodeIterator52);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (-1L) + "'", obj58, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator59);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(nodePointer68);
        org.junit.Assert.assertNotNull(nodePointer74);
        org.junit.Assert.assertNotNull(nodePointer81);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer2, locale11);
        java.lang.Object obj13 = jDOMNodePointer2.getImmediateNode();
        java.lang.String str14 = jDOMNodePointer2.asPath();
        boolean boolean15 = jDOMNodePointer2.isCollection();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator16 = jDOMNodePointer2.namespaceIterator();
        java.lang.Object obj17 = jDOMNodePointer2.getNodeValue();
        java.lang.Object obj18 = jDOMNodePointer2.getBaseValue();
        org.apache.commons.jxpath.JXPathContext jXPathContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer21 = jDOMNodePointer2.getPointerByID(jXPathContext19, "/namespace::");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodeIterator16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1L) + "'", obj17, (-1L));
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1L) + "'", obj18, (-1L));
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (short) 1, locale1, "hi!");
        org.w3c.dom.Node node4 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer5 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, node4);
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer9 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10, locale8);
        boolean boolean10 = jDOMNodePointer9.isCollection();
        org.apache.commons.jxpath.ri.QName qName11 = jDOMNodePointer9.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = dOMNodePointer5.createAttribute(jXPathContext6, qName11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(qName11);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        jDOMNodePointer2.setAttribute(false);
        java.lang.Object obj6 = jDOMNodePointer2.clone();
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = jDOMNodePointer2.createPath(jXPathContext7);
        nodePointer8.setIndex(0);
        boolean boolean11 = nodePointer8.isContainer();
        boolean boolean12 = nodePointer8.isAttribute();
        int int13 = nodePointer8.getIndex();
        boolean boolean14 = nodePointer8.isContainer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = nodePointer8.getImmediateValuePointer();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "");
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodePointer15);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
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
        boolean boolean28 = jDOMNodePointer24.isNode();
        jDOMNodePointer24.setIndex((int) (short) 100);
        java.lang.Object obj31 = jDOMNodePointer24.getBaseValue();
        jDOMNodePointer24.setAttribute(true);
        java.lang.Object obj34 = jDOMNodePointer24.getImmediateNode();
        java.lang.Object obj35 = jDOMNodePointer24.clone();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (-1L) + "'", obj31, (-1L));
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (-1L) + "'", obj34, (-1L));
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "");
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer2, locale11);
        int int13 = jDOMNodePointer12.getIndex();
        java.lang.String str14 = jDOMNodePointer12.getNamespaceURI();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = jDOMNodePointer12.namespacePointer("<<unknown namespace>>");
        int int17 = jDOMNodePointer12.getIndex();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2147483648) + "'", int13 == (-2147483648));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2147483648) + "'", int17 == (-2147483648));
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale1, "http://www.w3.org/XML/1998/namespace");
        java.util.Locale locale4 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale4, "hi!");
        boolean boolean7 = jDOMNodePointer6.isRoot();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = jDOMNodePointer6.getValuePointer();
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodePointer8, locale9, "");
        boolean boolean12 = nodePointer8.isActual();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = jDOMNodePointer2.getParent();
        boolean boolean4 = jDOMNodePointer2.isNode();
        boolean boolean5 = jDOMNodePointer2.isContainer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator6 = jDOMNodePointer2.namespaceIterator();
        java.util.Locale locale7 = jDOMNodePointer2.getLocale();
        boolean boolean8 = jDOMNodePointer2.isActual();
        boolean boolean9 = jDOMNodePointer2.isActual();
        java.lang.Object obj10 = jDOMNodePointer2.clone();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator11 = jDOMNodePointer2.namespaceIterator();
        java.lang.Object obj12 = jDOMNodePointer2.getValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = jDOMNodePointer2.getParent();
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodeIterator6);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "");
        org.junit.Assert.assertNotNull(nodeIterator11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(nodePointer13);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
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
        boolean boolean22 = jDOMNodePointer19.isContainer();
        boolean boolean23 = jDOMNodePointer19.isRoot();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest24 = null;
        boolean boolean25 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8, (java.lang.Object) jDOMNodePointer19, nodeTest24);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer19.namespaceIterator();
        java.lang.String str27 = jDOMNodePointer19.toString();
        boolean boolean28 = jDOMNodePointer19.isCollection();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest26 = null;
        boolean boolean27 = jDOMNodePointer8.testNode(nodeTest26);
        boolean boolean28 = jDOMNodePointer8.isNode();
        java.lang.Object obj29 = jDOMNodePointer8.getNodeValue();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest30 = null;
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale33);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer36 = jDOMNodePointer34.namespacePointer("http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = nodePointer36.getParent();
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale39);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator41 = jDOMNodePointer40.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest42 = null;
        java.util.Locale locale45 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer46 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale45);
        java.lang.Object obj47 = jDOMNodePointer46.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator48 = jDOMNodePointer40.childIterator(nodeTest42, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer46);
        java.util.Locale locale49 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer50 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer40, locale49);
        java.lang.Object obj51 = jDOMNodePointer40.getImmediateNode();
        java.lang.String str52 = jDOMNodePointer40.asPath();
        int int53 = nodePointer36.compareTo((java.lang.Object) jDOMNodePointer40);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator54 = jDOMNodePointer8.childIterator(nodeTest30, false, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer40);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer55 = jDOMNodePointer40.getValuePointer();
        jDOMNodePointer40.setAttribute(true);
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1L) + "'", obj29, (-1L));
        org.junit.Assert.assertNotNull(nodePointer36);
        org.junit.Assert.assertNotNull(nodePointer37);
        org.junit.Assert.assertNotNull(nodeIterator41);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (-1L) + "'", obj47, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator48);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (-1L) + "'", obj51, (-1L));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(nodeIterator54);
        org.junit.Assert.assertNotNull(nodePointer55);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = jDOMNodePointer2.namespacePointer("http://www.w3.org/XML/1998/namespace");
        jDOMNodePointer2.setAttribute(true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale10);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator12 = jDOMNodePointer11.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale16);
        java.lang.Object obj18 = jDOMNodePointer17.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer11.childIterator(nodeTest13, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator20 = jDOMNodePointer2.childIterator(nodeTest7, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer17);
        jDOMNodePointer2.printPointerChain();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(nodeIterator12);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1L) + "'", obj18, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertNotNull(nodeIterator20);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = jDOMNodePointer2.namespacePointer("http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer4.getParent();
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator9 = jDOMNodePointer8.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale13);
        java.lang.Object obj15 = jDOMNodePointer14.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator16 = jDOMNodePointer8.childIterator(nodeTest10, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer14);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer8, locale17);
        java.lang.Object obj19 = jDOMNodePointer8.getImmediateNode();
        java.lang.String str20 = jDOMNodePointer8.asPath();
        int int21 = nodePointer4.compareTo((java.lang.Object) jDOMNodePointer8);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = nodePointer4.getValuePointer();
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10, locale24);
        org.apache.commons.jxpath.JXPathContext jXPathContext26 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = jDOMNodePointer25.createPath(jXPathContext26);
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer30 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale29);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator31 = jDOMNodePointer30.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest32 = null;
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale35);
        java.lang.Object obj37 = jDOMNodePointer36.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator38 = jDOMNodePointer30.childIterator(nodeTest32, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer36);
        java.util.Locale locale40 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer41 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale40);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator42 = jDOMNodePointer41.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest43 = null;
        java.util.Locale locale46 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer47 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale46);
        java.lang.Object obj48 = jDOMNodePointer47.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator49 = jDOMNodePointer41.childIterator(nodeTest43, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer47);
        boolean boolean50 = jDOMNodePointer47.isContainer();
        boolean boolean51 = jDOMNodePointer47.isRoot();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest52 = null;
        boolean boolean53 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer36, (java.lang.Object) jDOMNodePointer47, nodeTest52);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator54 = jDOMNodePointer47.namespaceIterator();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver55 = jDOMNodePointer47.getNamespaceResolver();
        nodePointer27.setNamespaceResolver(namespaceResolver55);
        nodePointer4.setNamespaceResolver(namespaceResolver55);
        nodePointer4.printPointerChain();
        boolean boolean59 = nodePointer4.isRoot();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodeIterator9);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1L) + "'", obj15, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator16);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1L) + "'", obj19, (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertNotNull(nodeIterator31);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (-1L) + "'", obj37, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator38);
        org.junit.Assert.assertNotNull(nodeIterator42);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (-1L) + "'", obj48, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(nodeIterator54);
        org.junit.Assert.assertNotNull(namespaceResolver55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest26 = null;
        boolean boolean27 = jDOMNodePointer8.testNode(nodeTest26);
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer30 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale29);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator31 = jDOMNodePointer30.namespaceIterator();
        jDOMNodePointer30.setAttribute(false);
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale35);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = jDOMNodePointer36.namespacePointer("http://www.w3.org/XML/1998/namespace");
        jDOMNodePointer36.setAttribute(true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest41 = null;
        java.util.Locale locale44 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer45 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale44);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator46 = jDOMNodePointer45.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest47 = null;
        java.util.Locale locale50 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer51 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale50);
        java.lang.Object obj52 = jDOMNodePointer51.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator53 = jDOMNodePointer45.childIterator(nodeTest47, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer51);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator54 = jDOMNodePointer36.childIterator(nodeTest41, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer51);
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer57 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) true, locale55, "hi!");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver58 = jDOMNodePointer57.getNamespaceResolver();
        jDOMNodePointer30.setNamespaceResolver(namespaceResolver58);
        jDOMNodePointer8.setNamespaceResolver(namespaceResolver58);
        boolean boolean61 = jDOMNodePointer8.isContainer();
        int int62 = jDOMNodePointer8.getLength();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(nodeIterator31);
        org.junit.Assert.assertNotNull(nodePointer38);
        org.junit.Assert.assertNotNull(nodeIterator46);
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + (-1L) + "'", obj52, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator53);
        org.junit.Assert.assertNotNull(nodeIterator54);
        org.junit.Assert.assertNotNull(namespaceResolver58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer2, locale11);
        org.w3c.dom.Node node13 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer14 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer12, node13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = dOMNodePointer14.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale1, "http://www.w3.org/XML/1998/namespace");
        java.util.Locale locale4 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale4, "hi!");
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator7 = jDOMNodePointer6.namespaceIterator();
        org.junit.Assert.assertNotNull(nodeIterator7);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10, locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = jDOMNodePointer2.getParent();
        java.util.Locale locale4 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer2, locale4, "id('hi!')");
        java.lang.String str7 = jDOMNodePointer2.getNamespaceURI();
        boolean boolean8 = jDOMNodePointer2.isCollection();
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale10);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator12 = jDOMNodePointer11.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale16);
        java.lang.Object obj18 = jDOMNodePointer17.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer11.childIterator(nodeTest13, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer17);
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer22 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale21);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator23 = jDOMNodePointer22.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest24 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale27);
        java.lang.Object obj29 = jDOMNodePointer28.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator30 = jDOMNodePointer22.childIterator(nodeTest24, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer28);
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer33 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale32);
        int int34 = jDOMNodePointer17.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer22, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer33);
        org.apache.commons.jxpath.JXPathContext jXPathContext35 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer36 = jDOMNodePointer33.createPath(jXPathContext35);
        boolean boolean37 = jDOMNodePointer33.isNode();
        jDOMNodePointer33.setIndex((int) (short) 100);
        java.lang.Object obj40 = jDOMNodePointer33.getBaseValue();
        jDOMNodePointer33.setAttribute(true);
        boolean boolean43 = jDOMNodePointer33.isNode();
        boolean boolean44 = jDOMNodePointer33.isRoot();
        jDOMNodePointer33.setAttribute(false);
        java.lang.Object obj47 = jDOMNodePointer33.getImmediateNode();
        java.lang.String str48 = jDOMNodePointer33.asPath();
        int int49 = jDOMNodePointer2.compareTo((java.lang.Object) jDOMNodePointer33);
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeIterator12);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1L) + "'", obj18, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertNotNull(nodeIterator23);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1L) + "'", obj29, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(nodePointer36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (-1L) + "'", obj40, (-1L));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (-1L) + "'", obj47, (-1L));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
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
        boolean boolean28 = jDOMNodePointer24.isNode();
        java.lang.String str29 = jDOMNodePointer24.getNamespaceURI();
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer32.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest34 = null;
        java.util.Locale locale37 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer38 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale37);
        java.lang.Object obj39 = jDOMNodePointer38.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator40 = jDOMNodePointer32.childIterator(nodeTest34, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer38);
        java.util.Locale locale42 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer43 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale42);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator44 = jDOMNodePointer43.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest45 = null;
        java.util.Locale locale48 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer49 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale48);
        java.lang.Object obj50 = jDOMNodePointer49.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator51 = jDOMNodePointer43.childIterator(nodeTest45, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer49);
        boolean boolean52 = jDOMNodePointer49.isContainer();
        boolean boolean53 = jDOMNodePointer49.isRoot();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest54 = null;
        boolean boolean55 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer38, (java.lang.Object) jDOMNodePointer49, nodeTest54);
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
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver82 = jDOMNodePointer69.getNamespaceResolver();
        jDOMNodePointer49.setNamespaceResolver(namespaceResolver82);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest84 = null;
        boolean boolean85 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24, (java.lang.Object) jDOMNodePointer49, nodeTest84);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer86 = jDOMNodePointer49.getImmediateValuePointer();
        java.lang.String str87 = jDOMNodePointer49.getNamespaceURI();
        jDOMNodePointer49.printPointerChain();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (-1L) + "'", obj39, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator40);
        org.junit.Assert.assertNotNull(nodeIterator44);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (-1L) + "'", obj50, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(nodeIterator59);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (-1L) + "'", obj65, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator66);
        org.junit.Assert.assertNotNull(nodeIterator70);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + (-1L) + "'", obj76, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator77);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(namespaceResolver82);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(nodePointer86);
        org.junit.Assert.assertNull(str87);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = jDOMNodePointer8.getParent();
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) ' ', locale13);
        boolean boolean15 = jDOMNodePointer14.isActual();
        boolean boolean16 = jDOMNodePointer8.equals((java.lang.Object) jDOMNodePointer14);
        java.lang.Object obj17 = jDOMNodePointer14.getRootNode();
        boolean boolean18 = jDOMNodePointer14.isLeaf();
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer14, locale19);
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer14, locale21, "");
        boolean boolean24 = jDOMNodePointer23.isRoot();
        org.w3c.dom.Node node25 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer26 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer23, node25);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer30 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale28, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj31 = jDOMNodePointer30.getBaseValue();
        java.util.Locale locale33 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer34 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale33);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer36 = jDOMNodePointer34.namespacePointer("http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = nodePointer36.getParent();
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer40 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale39);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator41 = jDOMNodePointer40.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest42 = null;
        java.util.Locale locale45 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer46 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale45);
        java.lang.Object obj47 = jDOMNodePointer46.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator48 = jDOMNodePointer40.childIterator(nodeTest42, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer46);
        java.util.Locale locale49 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer50 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer40, locale49);
        java.lang.Object obj51 = jDOMNodePointer40.getImmediateNode();
        java.lang.String str52 = jDOMNodePointer40.asPath();
        int int53 = nodePointer36.compareTo((java.lang.Object) jDOMNodePointer40);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer54 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer30, (java.lang.Object) nodePointer36);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer55 = nodePointer36.getParent();
        java.util.Locale locale57 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer59 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale57, "http://www.w3.org/XML/1998/namespace");
        java.util.Locale locale60 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer62 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale60, "hi!");
        boolean boolean63 = jDOMNodePointer62.isRoot();
        java.util.Locale locale65 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer66 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale65);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver67 = jDOMNodePointer66.getNamespaceResolver();
        jDOMNodePointer62.setNamespaceResolver(namespaceResolver67);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver69 = jDOMNodePointer62.getNamespaceResolver();
        nodePointer55.setNamespaceResolver(namespaceResolver69);
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer26.setValue((java.lang.Object) namespaceResolver69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + ' ' + "'", obj17, ' ');
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 1.0d + "'", obj31, 1.0d);
        org.junit.Assert.assertNotNull(nodePointer36);
        org.junit.Assert.assertNotNull(nodePointer37);
        org.junit.Assert.assertNotNull(nodeIterator41);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (-1L) + "'", obj47, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator48);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (-1L) + "'", obj51, (-1L));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(nodePointer55);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(namespaceResolver67);
        org.junit.Assert.assertNotNull(namespaceResolver69);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer2, locale11);
        java.lang.Object obj13 = jDOMNodePointer12.getRootNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = jDOMNodePointer12.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = nodePointer14.getParent();
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale17);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = jDOMNodePointer18.getParent();
        boolean boolean20 = jDOMNodePointer18.isNode();
        boolean boolean21 = jDOMNodePointer18.isContainer();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator22 = jDOMNodePointer18.namespaceIterator();
        java.util.Locale locale23 = jDOMNodePointer18.getLocale();
        boolean boolean24 = jDOMNodePointer18.isActual();
        boolean boolean25 = jDOMNodePointer18.isRoot();
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) boolean25, locale26);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = jDOMNodePointer27.getValuePointer();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(nodePointer14, (java.lang.Object) nodePointer28);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver30 = jDOMNodePointer29.getNamespaceResolver();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertNull(nodePointer15);
        org.junit.Assert.assertNull(nodePointer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeIterator22);
        org.junit.Assert.assertNull(locale23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(nodePointer28);
        org.junit.Assert.assertNotNull(namespaceResolver30);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale1);
        org.apache.commons.jxpath.JXPathContext jXPathContext3 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale5, "http://www.w3.org/XML/1998/namespace");
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer10 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale8, "hi!");
        boolean boolean11 = jDOMNodePointer10.isRoot();
        java.lang.Object obj12 = jDOMNodePointer10.getValue();
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer15 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale14);
        java.lang.Object obj16 = jDOMNodePointer15.getNode();
        int int17 = jDOMNodePointer15.getIndex();
        java.lang.Object obj18 = jDOMNodePointer15.getValue();
        java.lang.Object obj19 = jDOMNodePointer15.getNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = jDOMNodePointer15.getParent();
        org.apache.commons.jxpath.JXPathContext jXPathContext21 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = jDOMNodePointer15.createPath(jXPathContext21);
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest49 = null;
        boolean boolean50 = jDOMNodePointer31.testNode(nodeTest49);
        boolean boolean51 = jDOMNodePointer31.isNode();
        jDOMNodePointer31.setAttribute(true);
        int int54 = jDOMNodePointer10.compareChildNodePointers(nodePointer22, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer31);
        org.apache.commons.jxpath.ri.QName qName55 = jDOMNodePointer31.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer57 = jDOMNodePointer2.createChild(jXPathContext3, qName55, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1L) + "'", obj16, (-1L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2147483648) + "'", int17 == (-2147483648));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1L) + "'", obj19, (-1L));
        org.junit.Assert.assertNull(nodePointer20);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (-1L) + "'", obj32, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertNotNull(nodeIterator37);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (-1L) + "'", obj43, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(qName55);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = jDOMNodePointer2.namespacePointer("http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj5 = jDOMNodePointer2.getBaseValue();
        org.w3c.dom.Node node6 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer7 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, node6);
        // The following exception was thrown during execution in test generation
        try {
            dOMNodePointer7.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "" + "'", obj5, "");
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest26 = null;
        boolean boolean27 = jDOMNodePointer8.testNode(nodeTest26);
        java.lang.Object obj28 = jDOMNodePointer8.getNode();
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer31 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale30);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = jDOMNodePointer31.namespacePointer("http://www.w3.org/XML/1998/namespace");
        jDOMNodePointer31.setAttribute(true);
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer31, locale36);
        boolean boolean38 = jDOMNodePointer8.equals((java.lang.Object) locale36);
        int int39 = jDOMNodePointer8.getLength();
        java.lang.String str40 = jDOMNodePointer8.asPath();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1L) + "'", obj28, (-1L));
        org.junit.Assert.assertNotNull(nodePointer33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = jDOMNodePointer2.getParent();
        boolean boolean4 = jDOMNodePointer2.isNode();
        boolean boolean5 = jDOMNodePointer2.isContainer();
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator9 = jDOMNodePointer8.namespaceIterator();
        boolean boolean10 = jDOMNodePointer2.equals((java.lang.Object) jDOMNodePointer8);
        java.util.Locale locale11 = jDOMNodePointer8.getLocale();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        boolean boolean13 = jDOMNodePointer8.testNode(nodeTest12);
        java.lang.Object obj14 = jDOMNodePointer8.getRootNode();
        boolean boolean15 = jDOMNodePointer8.isRoot();
        boolean boolean16 = jDOMNodePointer8.isLeaf();
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(nodeIterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
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
        boolean boolean22 = jDOMNodePointer19.isContainer();
        boolean boolean23 = jDOMNodePointer19.isRoot();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest24 = null;
        boolean boolean25 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8, (java.lang.Object) jDOMNodePointer19, nodeTest24);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator26 = jDOMNodePointer19.namespaceIterator();
        java.lang.String str27 = jDOMNodePointer19.toString();
        java.lang.String str29 = jDOMNodePointer19.getNamespaceURI("<<unknown namespace>>");
        org.w3c.dom.Node node30 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer31 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer19, node30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = dOMNodePointer31.asPath();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = jDOMNodePointer2.namespacePointer("http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer4.getParent();
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator9 = jDOMNodePointer8.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale13);
        java.lang.Object obj15 = jDOMNodePointer14.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator16 = jDOMNodePointer8.childIterator(nodeTest10, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer14);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer8, locale17);
        java.lang.Object obj19 = jDOMNodePointer8.getImmediateNode();
        java.lang.String str20 = jDOMNodePointer8.asPath();
        int int21 = nodePointer4.compareTo((java.lang.Object) jDOMNodePointer8);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver22 = jDOMNodePointer8.getNamespaceResolver();
        java.lang.String str23 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix((java.lang.Object) jDOMNodePointer8);
        java.lang.Object obj24 = null;
        boolean boolean25 = jDOMNodePointer8.equals(obj24);
        boolean boolean26 = jDOMNodePointer8.isNode();
        boolean boolean27 = jDOMNodePointer8.isCollection();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodeIterator9);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1L) + "'", obj15, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator16);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1L) + "'", obj19, (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(namespaceResolver22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
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
        boolean boolean28 = jDOMNodePointer24.isNode();
        java.lang.String str29 = jDOMNodePointer24.getNamespaceURI();
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer32.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest34 = null;
        java.util.Locale locale37 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer38 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale37);
        java.lang.Object obj39 = jDOMNodePointer38.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator40 = jDOMNodePointer32.childIterator(nodeTest34, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer38);
        java.util.Locale locale42 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer43 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale42);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator44 = jDOMNodePointer43.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest45 = null;
        java.util.Locale locale48 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer49 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale48);
        java.lang.Object obj50 = jDOMNodePointer49.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator51 = jDOMNodePointer43.childIterator(nodeTest45, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer49);
        boolean boolean52 = jDOMNodePointer49.isContainer();
        boolean boolean53 = jDOMNodePointer49.isRoot();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest54 = null;
        boolean boolean55 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer38, (java.lang.Object) jDOMNodePointer49, nodeTest54);
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
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver82 = jDOMNodePointer69.getNamespaceResolver();
        jDOMNodePointer49.setNamespaceResolver(namespaceResolver82);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest84 = null;
        boolean boolean85 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24, (java.lang.Object) jDOMNodePointer49, nodeTest84);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer86 = jDOMNodePointer49.getImmediateValuePointer();
        java.lang.Object obj87 = nodePointer86.getNodeValue();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (-1L) + "'", obj39, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator40);
        org.junit.Assert.assertNotNull(nodeIterator44);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (-1L) + "'", obj50, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(nodeIterator59);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (-1L) + "'", obj65, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator66);
        org.junit.Assert.assertNotNull(nodeIterator70);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + (-1L) + "'", obj76, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator77);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(namespaceResolver82);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(nodePointer86);
        org.junit.Assert.assertEquals("'" + obj87 + "' != '" + (-1L) + "'", obj87, (-1L));
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
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
        boolean boolean22 = jDOMNodePointer19.isContainer();
        boolean boolean23 = jDOMNodePointer19.isRoot();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest24 = null;
        boolean boolean25 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8, (java.lang.Object) jDOMNodePointer19, nodeTest24);
        java.lang.Object obj26 = jDOMNodePointer19.getImmediateNode();
        java.lang.Object obj27 = jDOMNodePointer19.getNode();
        org.apache.commons.jxpath.JXPathContext jXPathContext28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer31 = jDOMNodePointer19.getPointerByKey(jXPathContext28, "", "<<unknown namespace>>");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (-1L) + "'", obj26, (-1L));
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (-1L) + "'", obj27, (-1L));
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = jDOMNodePointer2.namespacePointer("http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer4.getParent();
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator9 = jDOMNodePointer8.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale13);
        java.lang.Object obj15 = jDOMNodePointer14.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator16 = jDOMNodePointer8.childIterator(nodeTest10, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer14);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer8, locale17);
        java.lang.Object obj19 = jDOMNodePointer8.getImmediateNode();
        java.lang.String str20 = jDOMNodePointer8.asPath();
        int int21 = nodePointer4.compareTo((java.lang.Object) jDOMNodePointer8);
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
        boolean boolean44 = jDOMNodePointer41.isContainer();
        boolean boolean45 = jDOMNodePointer41.isRoot();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest46 = null;
        boolean boolean47 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer30, (java.lang.Object) jDOMNodePointer41, nodeTest46);
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
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver74 = jDOMNodePointer61.getNamespaceResolver();
        jDOMNodePointer41.setNamespaceResolver(namespaceResolver74);
        jDOMNodePointer8.setNamespaceResolver(namespaceResolver74);
        java.lang.String str77 = jDOMNodePointer8.getNamespaceURI();
        org.apache.commons.jxpath.JXPathContext jXPathContext78 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer79 = jDOMNodePointer8.createPath(jXPathContext78);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator80 = jDOMNodePointer8.namespaceIterator();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver81 = jDOMNodePointer8.getNamespaceResolver();
        // The following exception was thrown during execution in test generation
        try {
            jDOMNodePointer8.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot remove root JDOM node");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodeIterator9);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1L) + "'", obj15, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator16);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1L) + "'", obj19, (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodeIterator25);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (-1L) + "'", obj31, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator32);
        org.junit.Assert.assertNotNull(nodeIterator36);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (-1L) + "'", obj42, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(nodeIterator51);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (-1L) + "'", obj57, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator58);
        org.junit.Assert.assertNotNull(nodeIterator62);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + (-1L) + "'", obj68, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator69);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(namespaceResolver74);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNotNull(nodePointer79);
        org.junit.Assert.assertNotNull(nodeIterator80);
        org.junit.Assert.assertNotNull(namespaceResolver81);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
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
        boolean boolean22 = jDOMNodePointer19.isContainer();
        boolean boolean23 = jDOMNodePointer19.isRoot();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest24 = null;
        boolean boolean25 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8, (java.lang.Object) jDOMNodePointer19, nodeTest24);
        jDOMNodePointer8.setIndex((int) (byte) 1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = jDOMNodePointer8.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = nodePointer28.getParent();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(nodePointer28);
        org.junit.Assert.assertNull(nodePointer29);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
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
        boolean boolean22 = jDOMNodePointer19.isContainer();
        boolean boolean23 = jDOMNodePointer19.isRoot();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest24 = null;
        boolean boolean25 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8, (java.lang.Object) jDOMNodePointer19, nodeTest24);
        jDOMNodePointer8.setIndex((int) (byte) 1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = jDOMNodePointer8.getImmediateParentPointer();
        boolean boolean29 = jDOMNodePointer8.isCollection();
        boolean boolean30 = jDOMNodePointer8.isLeaf();
        java.lang.Object obj31 = jDOMNodePointer8.getValue();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(nodePointer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest26 = null;
        boolean boolean27 = jDOMNodePointer8.testNode(nodeTest26);
        boolean boolean28 = jDOMNodePointer8.isNode();
        java.lang.Object obj29 = jDOMNodePointer8.getNodeValue();
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer31 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer8, locale30);
        java.util.Locale locale32 = jDOMNodePointer31.getLocale();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = jDOMNodePointer31.getImmediateParentPointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = nodePointer33.getRootNode();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1L) + "'", obj29, (-1L));
        org.junit.Assert.assertNull(locale32);
        org.junit.Assert.assertNull(nodePointer33);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
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
        boolean boolean28 = jDOMNodePointer24.isNode();
        jDOMNodePointer24.setIndex((int) (short) 100);
        org.w3c.dom.Node node31 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer32 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer24, node31);
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        boolean boolean11 = jDOMNodePointer8.isContainer();
        boolean boolean12 = jDOMNodePointer8.isRoot();
        java.lang.String str14 = jDOMNodePointer8.getNamespaceURI("");
        jDOMNodePointer8.setAttribute(true);
        java.lang.Object obj17 = jDOMNodePointer8.getRootNode();
        jDOMNodePointer8.setAttribute(true);
        java.lang.String str21 = jDOMNodePointer8.getNamespaceURI("id('hi!')");
        java.lang.Object obj22 = jDOMNodePointer8.getRootNode();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1L) + "'", obj17, (-1L));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (-1L) + "'", obj22, (-1L));
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        jDOMNodePointer2.setAttribute(false);
        java.lang.Object obj6 = jDOMNodePointer2.clone();
        java.lang.Object obj7 = jDOMNodePointer2.getImmediateNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale11, "http://www.w3.org/XML/1998/namespace");
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer16 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale14, "hi!");
        java.lang.String str17 = jDOMNodePointer16.asPath();
        jDOMNodePointer16.setAttribute(false);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator20 = jDOMNodePointer2.childIterator(nodeTest8, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer16);
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10, locale22);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = jDOMNodePointer23.getParent();
        boolean boolean25 = jDOMNodePointer23.isLeaf();
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale27);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator29 = jDOMNodePointer28.namespaceIterator();
        jDOMNodePointer28.setAttribute(false);
        java.lang.Object obj32 = jDOMNodePointer28.clone();
        java.lang.Object obj33 = jDOMNodePointer28.getImmediateNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest34 = null;
        boolean boolean35 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer23, (java.lang.Object) jDOMNodePointer28, nodeTest34);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest36 = null;
        boolean boolean37 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer16, (java.lang.Object) nodeTest34, nodeTest36);
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest64 = null;
        boolean boolean65 = jDOMNodePointer46.testNode(nodeTest64);
        java.lang.String str66 = jDOMNodePointer46.asPath();
        org.apache.commons.jxpath.JXPathContext jXPathContext67 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer68 = jDOMNodePointer46.createPath(jXPathContext67);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer69 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer16, (java.lang.Object) nodePointer68);
        java.lang.String str70 = nodePointer68.toString();
        java.util.Locale locale72 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer73 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10, locale72);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer74 = jDOMNodePointer73.getParent();
        java.lang.Object obj75 = jDOMNodePointer73.getNode();
        java.lang.String str77 = jDOMNodePointer73.getNamespaceURI("<<unknown namespace>>");
        int int78 = nodePointer68.compareTo((java.lang.Object) jDOMNodePointer73);
        java.util.Locale locale80 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer81 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) ' ', locale80);
        java.lang.String str82 = jDOMNodePointer81.toString();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver83 = jDOMNodePointer81.getNamespaceResolver();
        jDOMNodePointer73.setNamespaceResolver(namespaceResolver83);
        org.w3c.dom.Node node85 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer86 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer73, node85);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean87 = dOMNodePointer86.isLeaf();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1L) + "'", obj7, (-1L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "id('hi!')" + "'", str17, "id('hi!')");
        org.junit.Assert.assertNotNull(nodeIterator20);
        org.junit.Assert.assertNull(nodePointer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(nodeIterator29);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (-1L) + "'", obj33, (-1L));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(nodeIterator41);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (-1L) + "'", obj47, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator48);
        org.junit.Assert.assertNotNull(nodeIterator52);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (-1L) + "'", obj58, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator59);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(nodePointer68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNull(nodePointer74);
        org.junit.Assert.assertEquals("'" + obj75 + "' != '" + 10 + "'", obj75, 10);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(namespaceResolver83);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10, locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = jDOMNodePointer2.getParent();
        boolean boolean4 = jDOMNodePointer2.isLeaf();
        boolean boolean5 = jDOMNodePointer2.isCollection();
        boolean boolean6 = jDOMNodePointer2.isLeaf();
        java.lang.Object obj7 = jDOMNodePointer2.getRootNode();
        org.apache.commons.jxpath.JXPathContext jXPathContext8 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale11, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj14 = jDOMNodePointer13.getBaseValue();
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale16);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = jDOMNodePointer17.namespacePointer("http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = nodePointer19.getParent();
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale22);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator24 = jDOMNodePointer23.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest25 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        java.lang.Object obj30 = jDOMNodePointer29.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator31 = jDOMNodePointer23.childIterator(nodeTest25, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer29);
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer33 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer23, locale32);
        java.lang.Object obj34 = jDOMNodePointer23.getImmediateNode();
        java.lang.String str35 = jDOMNodePointer23.asPath();
        int int36 = nodePointer19.compareTo((java.lang.Object) jDOMNodePointer23);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13, (java.lang.Object) nodePointer19);
        boolean boolean38 = jDOMNodePointer13.isCollection();
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
        boolean boolean61 = jDOMNodePointer58.isContainer();
        boolean boolean62 = jDOMNodePointer58.isRoot();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest63 = null;
        boolean boolean64 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer47, (java.lang.Object) jDOMNodePointer58, nodeTest63);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest65 = null;
        boolean boolean66 = jDOMNodePointer58.testNode(nodeTest65);
        boolean boolean67 = jDOMNodePointer13.equals((java.lang.Object) nodeTest65);
        java.util.Locale locale68 = jDOMNodePointer13.getLocale();
        java.util.Locale locale69 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer71 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) locale68, locale69, "id('<<unknown namespace>>')");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet72 = jDOMNodePointer2.getNodeSetByKey(jXPathContext8, "", (java.lang.Object) locale69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 10 + "'", obj7, 10);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1.0d + "'", obj14, 1.0d);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertNotNull(nodeIterator24);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1L) + "'", obj30, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator31);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (-1L) + "'", obj34, (-1L));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(nodeIterator42);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (-1L) + "'", obj48, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator49);
        org.junit.Assert.assertNotNull(nodeIterator53);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (-1L) + "'", obj59, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(locale68);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer26 = jDOMNodePointer8.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = nodePointer26.getParent();
        nodePointer26.setAttribute(false);
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer32 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale31);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator33 = jDOMNodePointer32.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest34 = null;
        java.util.Locale locale37 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer38 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale37);
        java.lang.Object obj39 = jDOMNodePointer38.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator40 = jDOMNodePointer32.childIterator(nodeTest34, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer38);
        java.lang.Object obj41 = jDOMNodePointer38.getValue();
        jDOMNodePointer38.printPointerChain();
        boolean boolean43 = jDOMNodePointer38.isLeaf();
        java.util.Locale locale45 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer46 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale45);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver47 = jDOMNodePointer46.getNamespaceResolver();
        java.lang.Object obj48 = jDOMNodePointer46.getRootNode();
        java.lang.String str49 = jDOMNodePointer46.asPath();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver50 = jDOMNodePointer46.getNamespaceResolver();
        jDOMNodePointer38.setNamespaceResolver(namespaceResolver50);
        nodePointer26.setNamespaceResolver(namespaceResolver50);
        java.lang.Class<?> wildcardClass53 = namespaceResolver50.getClass();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(nodePointer26);
        org.junit.Assert.assertNull(nodePointer27);
        org.junit.Assert.assertNotNull(nodeIterator33);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (-1L) + "'", obj39, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(namespaceResolver47);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + "" + "'", obj48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(namespaceResolver50);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) ' ', locale1);
        boolean boolean3 = jDOMNodePointer2.isActual();
        org.apache.commons.jxpath.JXPathContext jXPathContext4 = null;
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
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver31 = jDOMNodePointer18.getNamespaceResolver();
        java.lang.String str32 = jDOMNodePointer18.getNamespaceURI();
        java.lang.Object obj33 = jDOMNodePointer18.getBaseValue();
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale35, "http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer38 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer18, (java.lang.Object) jDOMNodePointer37);
        java.lang.Object obj39 = jDOMNodePointer37.clone();
        jDOMNodePointer37.setIndex((int) '#');
        java.util.Locale locale43 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer44 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale43);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator45 = jDOMNodePointer44.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest46 = null;
        java.util.Locale locale49 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer50 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale49);
        java.lang.Object obj51 = jDOMNodePointer50.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator52 = jDOMNodePointer44.childIterator(nodeTest46, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer50);
        java.util.Locale locale53 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer54 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer44, locale53);
        java.lang.Object obj55 = jDOMNodePointer44.getImmediateNode();
        java.lang.String str56 = jDOMNodePointer44.asPath();
        boolean boolean57 = jDOMNodePointer44.isCollection();
        java.lang.Object obj58 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest59 = null;
        boolean boolean60 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer44, obj58, nodeTest59);
        jDOMNodePointer44.setIndex(0);
        boolean boolean63 = jDOMNodePointer37.equals((java.lang.Object) jDOMNodePointer44);
        org.apache.commons.jxpath.ri.QName qName64 = jDOMNodePointer44.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer66 = jDOMNodePointer2.createChild(jXPathContext4, qName64, (-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(namespaceResolver31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (-1L) + "'", obj33, (-1L));
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "id('http://www.w3.org/XML/1998/namespace')");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "id('http://www.w3.org/XML/1998/namespace')");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "id('http://www.w3.org/XML/1998/namespace')");
        org.junit.Assert.assertNotNull(nodeIterator45);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (-1L) + "'", obj51, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator52);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (-1L) + "'", obj55, (-1L));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(qName64);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = jDOMNodePointer2.namespacePointer("http://www.w3.org/XML/1998/namespace");
        java.lang.String str6 = jDOMNodePointer2.getNamespaceURI("<<unknown namespace>>");
        org.w3c.dom.Node node7 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer8 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, node7);
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale10);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator12 = jDOMNodePointer11.namespaceIterator();
        jDOMNodePointer11.setAttribute(false);
        java.lang.Object obj15 = jDOMNodePointer11.clone();
        java.lang.Object obj16 = jDOMNodePointer11.clone();
        boolean boolean17 = jDOMNodePointer11.isCollection();
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer20 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale19);
        java.lang.Object obj21 = jDOMNodePointer20.getNode();
        int int22 = jDOMNodePointer20.getIndex();
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer26 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale24, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj27 = jDOMNodePointer26.getBaseValue();
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer30 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale29);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = jDOMNodePointer30.namespacePointer("http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = nodePointer32.getParent();
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer36 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale35);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator37 = jDOMNodePointer36.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest38 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer42 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale41);
        java.lang.Object obj43 = jDOMNodePointer42.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator44 = jDOMNodePointer36.childIterator(nodeTest38, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer42);
        java.util.Locale locale45 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer46 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer36, locale45);
        java.lang.Object obj47 = jDOMNodePointer36.getImmediateNode();
        java.lang.String str48 = jDOMNodePointer36.asPath();
        int int49 = nodePointer32.compareTo((java.lang.Object) jDOMNodePointer36);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer50 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer26, (java.lang.Object) nodePointer32);
        boolean boolean51 = jDOMNodePointer26.isCollection();
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
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator66 = jDOMNodePointer65.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest67 = null;
        java.util.Locale locale70 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer71 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale70);
        java.lang.Object obj72 = jDOMNodePointer71.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator73 = jDOMNodePointer65.childIterator(nodeTest67, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer71);
        boolean boolean74 = jDOMNodePointer71.isContainer();
        boolean boolean75 = jDOMNodePointer71.isRoot();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest76 = null;
        boolean boolean77 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer60, (java.lang.Object) jDOMNodePointer71, nodeTest76);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest78 = null;
        boolean boolean79 = jDOMNodePointer71.testNode(nodeTest78);
        boolean boolean80 = jDOMNodePointer26.equals((java.lang.Object) nodeTest78);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver81 = jDOMNodePointer26.getNamespaceResolver();
        boolean boolean82 = jDOMNodePointer20.equals((java.lang.Object) jDOMNodePointer26);
        // The following exception was thrown during execution in test generation
        try {
            int int83 = dOMNodePointer8.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer11, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class org.w3c.dom.Node (java.lang.Long is in module java.base of loader 'bootstrap'; org.w3c.dom.Node is in module java.xml of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(nodeIterator12);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (-1L) + "'", obj21, (-1L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-2147483648) + "'", int22 == (-2147483648));
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1.0d + "'", obj27, 1.0d);
        org.junit.Assert.assertNotNull(nodePointer32);
        org.junit.Assert.assertNotNull(nodePointer33);
        org.junit.Assert.assertNotNull(nodeIterator37);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (-1L) + "'", obj43, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator44);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (-1L) + "'", obj47, (-1L));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(nodeIterator55);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (-1L) + "'", obj61, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator62);
        org.junit.Assert.assertNotNull(nodeIterator66);
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + (-1L) + "'", obj72, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(namespaceResolver81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = jDOMNodePointer2.namespacePointer("http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = nodePointer4.getParent();
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator9 = jDOMNodePointer8.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer14 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale13);
        java.lang.Object obj15 = jDOMNodePointer14.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator16 = jDOMNodePointer8.childIterator(nodeTest10, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer14);
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer18 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer8, locale17);
        java.lang.Object obj19 = jDOMNodePointer8.getImmediateNode();
        java.lang.String str20 = jDOMNodePointer8.asPath();
        int int21 = nodePointer4.compareTo((java.lang.Object) jDOMNodePointer8);
        jDOMNodePointer8.setIndex((int) (byte) 100);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = jDOMNodePointer8.getParent();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest25 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale28);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator30 = jDOMNodePointer29.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest31 = null;
        java.util.Locale locale34 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer35 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale34);
        java.lang.Object obj36 = jDOMNodePointer35.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator37 = jDOMNodePointer29.childIterator(nodeTest31, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer35);
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
        int int52 = jDOMNodePointer35.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer40, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer51);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest53 = null;
        boolean boolean54 = jDOMNodePointer35.testNode(nodeTest53);
        boolean boolean55 = jDOMNodePointer35.isNode();
        java.lang.Object obj56 = jDOMNodePointer35.getNodeValue();
        java.util.Locale locale57 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer58 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer35, locale57);
        java.lang.Object obj59 = jDOMNodePointer35.clone();
        jDOMNodePointer35.setIndex((int) (short) 1);
        java.util.Locale locale63 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer64 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) ' ', locale63);
        java.lang.String str65 = jDOMNodePointer64.toString();
        boolean boolean66 = jDOMNodePointer64.isNode();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver67 = jDOMNodePointer64.getNamespaceResolver();
        jDOMNodePointer35.setNamespaceResolver(namespaceResolver67);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator69 = jDOMNodePointer8.childIterator(nodeTest25, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer35);
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertNotNull(nodeIterator9);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1L) + "'", obj15, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator16);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (-1L) + "'", obj19, (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(nodePointer24);
        org.junit.Assert.assertNotNull(nodeIterator30);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (-1L) + "'", obj36, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator37);
        org.junit.Assert.assertNotNull(nodeIterator41);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (-1L) + "'", obj47, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + (-1L) + "'", obj56, (-1L));
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertEquals(obj59.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj59), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj59), "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(namespaceResolver67);
        org.junit.Assert.assertNotNull(nodeIterator69);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale1, "http://www.w3.org/XML/1998/namespace");
        java.util.Locale locale4 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer6 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale4, "hi!");
        java.lang.String str7 = jDOMNodePointer6.asPath();
        boolean boolean8 = jDOMNodePointer6.isRoot();
        boolean boolean9 = jDOMNodePointer6.isNode();
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer13 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale12);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = jDOMNodePointer13.namespacePointer("http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = nodePointer15.getParent();
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer19 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale18);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator20 = jDOMNodePointer19.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest21 = null;
        java.util.Locale locale24 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer25 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale24);
        java.lang.Object obj26 = jDOMNodePointer25.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator27 = jDOMNodePointer19.childIterator(nodeTest21, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer25);
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer29 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer19, locale28);
        java.lang.Object obj30 = jDOMNodePointer19.getImmediateNode();
        java.lang.String str31 = jDOMNodePointer19.asPath();
        int int32 = nodePointer15.compareTo((java.lang.Object) jDOMNodePointer19);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = nodePointer15.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer6, qName10, (java.lang.Object) nodePointer15);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = jDOMNodePointer6.getImmediateValuePointer();
        int int36 = jDOMNodePointer6.getLength();
        java.util.Locale locale38 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer39 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale38);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver40 = jDOMNodePointer39.getNamespaceResolver();
        java.lang.String str41 = jDOMNodePointer39.asPath();
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
        java.lang.String str68 = jDOMNodePointer50.toString();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer69 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer39, (java.lang.Object) jDOMNodePointer50);
        boolean boolean70 = jDOMNodePointer69.isCollection();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer72 = jDOMNodePointer69.namespacePointer("");
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator73 = jDOMNodePointer69.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest74 = null;
        boolean boolean75 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer6, (java.lang.Object) nodeIterator73, nodeTest74);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "id('hi!')" + "'", str7, "id('hi!')");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertNotNull(nodeIterator20);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (-1L) + "'", obj26, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator27);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1L) + "'", obj30, (-1L));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(nodePointer33);
        org.junit.Assert.assertNotNull(nodePointer34);
        org.junit.Assert.assertNotNull(nodePointer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(namespaceResolver40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(nodeIterator45);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (-1L) + "'", obj51, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator52);
        org.junit.Assert.assertNotNull(nodeIterator56);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + (-1L) + "'", obj62, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator63);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(nodePointer72);
        org.junit.Assert.assertNotNull(nodeIterator73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        jDOMNodePointer2.setAttribute(false);
        java.lang.Object obj6 = jDOMNodePointer2.clone();
        java.lang.Object obj7 = jDOMNodePointer2.clone();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = jDOMNodePointer2.getImmediateValuePointer();
        int int9 = jDOMNodePointer2.getIndex();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "");
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2147483648) + "'", int9 == (-2147483648));
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest26 = null;
        boolean boolean27 = jDOMNodePointer8.testNode(nodeTest26);
        boolean boolean28 = jDOMNodePointer8.isNode();
        org.apache.commons.jxpath.ri.QName qName29 = null;
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator30 = jDOMNodePointer8.attributeIterator(qName29);
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer33 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale32);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator34 = jDOMNodePointer33.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest35 = null;
        java.util.Locale locale38 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer39 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale38);
        java.lang.Object obj40 = jDOMNodePointer39.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator41 = jDOMNodePointer33.childIterator(nodeTest35, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer39);
        java.lang.Object obj42 = jDOMNodePointer39.getValue();
        jDOMNodePointer39.printPointerChain();
        org.apache.commons.jxpath.JXPathContext jXPathContext44 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer45 = jDOMNodePointer39.createPath(jXPathContext44);
        int int46 = jDOMNodePointer8.compareTo((java.lang.Object) nodePointer45);
        java.util.Locale locale48 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer49 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale48);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer51 = jDOMNodePointer49.namespacePointer("http://www.w3.org/XML/1998/namespace");
        boolean boolean52 = nodePointer51.isActual();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer53 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(nodePointer45, (java.lang.Object) nodePointer51);
        java.util.Locale locale55 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer56 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (short) -1, locale55);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator57 = jDOMNodePointer56.namespaceIterator();
        java.util.Locale locale58 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer60 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer56, locale58, "id('hi!')");
        jDOMNodePointer60.setIndex((int) (short) 10);
        java.lang.String str63 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName((java.lang.Object) jDOMNodePointer60);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest64 = null;
        boolean boolean65 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode(nodePointer45, (java.lang.Object) str63, nodeTest64);
        java.util.Locale locale67 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer68 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale67);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator69 = jDOMNodePointer68.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest70 = null;
        java.util.Locale locale73 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer74 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale73);
        java.lang.Object obj75 = jDOMNodePointer74.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator76 = jDOMNodePointer68.childIterator(nodeTest70, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer74);
        int int77 = nodePointer45.compareTo((java.lang.Object) jDOMNodePointer68);
        boolean boolean78 = nodePointer45.isContainer();
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(nodeIterator30);
        org.junit.Assert.assertNotNull(nodeIterator34);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (-1L) + "'", obj40, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(nodePointer45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(nodePointer51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(nodeIterator57);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(nodeIterator69);
        org.junit.Assert.assertEquals("'" + obj75 + "' != '" + (-1L) + "'", obj75, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale1, "http://www.w3.org/XML/1998/namespace");
        int int4 = jDOMNodePointer3.getIndex();
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
        boolean boolean27 = jDOMNodePointer24.isContainer();
        boolean boolean28 = jDOMNodePointer24.isRoot();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest29 = null;
        boolean boolean30 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer13, (java.lang.Object) jDOMNodePointer24, nodeTest29);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer31 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer3, (java.lang.Object) jDOMNodePointer24);
        java.lang.String str32 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getLocalName((java.lang.Object) jDOMNodePointer31);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = jDOMNodePointer31.getImmediateParentPointer();
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
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator48 = jDOMNodePointer47.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest49 = null;
        java.util.Locale locale52 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer53 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale52);
        java.lang.Object obj54 = jDOMNodePointer53.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator55 = jDOMNodePointer47.childIterator(nodeTest49, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer53);
        java.util.Locale locale57 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer58 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale57);
        int int59 = jDOMNodePointer42.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer47, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer58);
        org.apache.commons.jxpath.JXPathContext jXPathContext60 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer61 = jDOMNodePointer58.createPath(jXPathContext60);
        boolean boolean62 = jDOMNodePointer58.isNode();
        java.lang.String str63 = jDOMNodePointer58.getNamespaceURI();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest64 = null;
        boolean boolean65 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.testNode((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer31, (java.lang.Object) jDOMNodePointer58, nodeTest64);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer67 = jDOMNodePointer58.namespacePointer("id('hi!')");
        java.util.Locale locale68 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer70 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodePointer67, locale68, "/namespace::");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
        org.junit.Assert.assertNotNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1L) + "'", obj14, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator15);
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1L) + "'", obj25, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(nodePointer33);
        org.junit.Assert.assertNotNull(nodeIterator37);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (-1L) + "'", obj43, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator44);
        org.junit.Assert.assertNotNull(nodeIterator48);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (-1L) + "'", obj54, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator55);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(nodePointer61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(nodePointer67);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale1);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator3 = jDOMNodePointer2.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        java.util.Locale locale7 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale7);
        java.lang.Object obj9 = jDOMNodePointer8.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator10 = jDOMNodePointer2.childIterator(nodeTest4, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8);
        java.lang.Object obj11 = jDOMNodePointer8.getValue();
        jDOMNodePointer8.printPointerChain();
        java.lang.String str14 = jDOMNodePointer8.getNamespaceURI("id('http://www.w3.org/2000/xmlns/')");
        jDOMNodePointer8.setIndex((int) (byte) 10);
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest26 = null;
        boolean boolean27 = jDOMNodePointer8.testNode(nodeTest26);
        boolean boolean28 = jDOMNodePointer8.isNode();
        java.lang.Object obj29 = jDOMNodePointer8.getRootNode();
        org.w3c.dom.Node node30 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer31 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer8, node30);
        org.junit.Assert.assertNotNull(nodeIterator3);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (-1L) + "'", obj9, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator10);
        org.junit.Assert.assertNotNull(nodeIterator14);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (-1L) + "'", obj20, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (-1L) + "'", obj29, (-1L));
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 10, locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = jDOMNodePointer2.getParent();
        java.lang.Object obj4 = jDOMNodePointer2.getNode();
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer7 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) ' ', locale6);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer8 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer2, (java.lang.Object) jDOMNodePointer7);
        boolean boolean9 = jDOMNodePointer2.isLeaf();
        java.lang.String str10 = jDOMNodePointer2.toString();
        java.lang.String str11 = jDOMNodePointer2.getNamespaceURI();
        java.lang.String str12 = jDOMNodePointer2.toString();
        jDOMNodePointer2.printPointerChain();
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 10 + "'", obj4, 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = jDOMNodePointer2.namespacePointer("http://www.w3.org/XML/1998/namespace");
        jDOMNodePointer2.setAttribute(true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale10);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator12 = jDOMNodePointer11.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale16);
        java.lang.Object obj18 = jDOMNodePointer17.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer11.childIterator(nodeTest13, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator20 = jDOMNodePointer2.childIterator(nodeTest7, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer17);
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) true, locale21, "hi!");
        java.lang.Object obj24 = jDOMNodePointer23.getImmediateNode();
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer27 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale26);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator28 = jDOMNodePointer27.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest29 = null;
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer33 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale32);
        java.lang.Object obj34 = jDOMNodePointer33.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator35 = jDOMNodePointer27.childIterator(nodeTest29, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer33);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer36 = jDOMNodePointer33.getParent();
        java.util.Locale locale38 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer39 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) ' ', locale38);
        boolean boolean40 = jDOMNodePointer39.isActual();
        boolean boolean41 = jDOMNodePointer33.equals((java.lang.Object) jDOMNodePointer39);
        java.lang.Object obj42 = jDOMNodePointer33.getImmediateNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator43 = jDOMNodePointer33.namespaceIterator();
        boolean boolean44 = jDOMNodePointer23.equals((java.lang.Object) jDOMNodePointer33);
        jDOMNodePointer23.setAttribute(false);
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(nodeIterator12);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1L) + "'", obj18, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertNotNull(nodeIterator20);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + true + "'", obj24, true);
        org.junit.Assert.assertNotNull(nodeIterator28);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (-1L) + "'", obj34, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator35);
        org.junit.Assert.assertNull(nodePointer36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (-1L) + "'", obj42, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale2);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = jDOMNodePointer3.namespacePointer("http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj6 = jDOMNodePointer3.getNode();
        java.lang.String str7 = jDOMNodePointer3.asPath();
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) str7, locale8);
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale11);
        java.lang.Object obj13 = jDOMNodePointer12.getNode();
        int int14 = jDOMNodePointer12.getIndex();
        int int15 = jDOMNodePointer12.getIndex();
        java.lang.Object obj16 = jDOMNodePointer12.clone();
        int int17 = nodePointer9.compareTo((java.lang.Object) jDOMNodePointer12);
        boolean boolean18 = jDOMNodePointer12.isActual();
        // The following exception was thrown during execution in test generation
        try {
            jDOMNodePointer12.remove();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot remove root JDOM node");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "" + "'", obj6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2147483648) + "'", int14 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2147483648) + "'", int15 == (-2147483648));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale1);
        java.lang.String str3 = jDOMNodePointer2.toString();
        jDOMNodePointer2.setIndex((int) ' ');
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = jDOMNodePointer16.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer35 = nodePointer34.getParent();
        nodePointer34.setAttribute(false);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator38 = jDOMNodePointer2.childIterator(nodeTest6, true, nodePointer34);
        java.lang.String str39 = org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer.getPrefix((java.lang.Object) jDOMNodePointer2);
        java.lang.String str40 = jDOMNodePointer2.toString();
        java.lang.Object obj41 = jDOMNodePointer2.clone();
        java.util.Locale locale42 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer44 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(obj41, locale42, "http://www.w3.org/XML/1998/namespace");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer45 = jDOMNodePointer44.getParent();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(nodeIterator11);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1L) + "'", obj17, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator18);
        org.junit.Assert.assertNotNull(nodeIterator22);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1L) + "'", obj28, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(nodePointer34);
        org.junit.Assert.assertNull(nodePointer35);
        org.junit.Assert.assertNotNull(nodeIterator38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals(obj41.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj41), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj41), "");
        org.junit.Assert.assertNull(nodePointer45);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.w3c.dom.Node node0 = null;
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.dom.DOMNodePointer dOMNodePointer3 = new org.apache.commons.jxpath.ri.model.dom.DOMNodePointer(node0, locale1, "/namespace::");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator4 = dOMNodePointer3.namespaceIterator();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale2);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = jDOMNodePointer3.namespacePointer("http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj6 = jDOMNodePointer3.getNode();
        java.lang.String str7 = jDOMNodePointer3.asPath();
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) str7, locale8);
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer12 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale11);
        java.lang.Object obj13 = jDOMNodePointer12.getNode();
        int int14 = jDOMNodePointer12.getIndex();
        int int15 = jDOMNodePointer12.getIndex();
        java.lang.Object obj16 = jDOMNodePointer12.clone();
        int int17 = nodePointer9.compareTo((java.lang.Object) jDOMNodePointer12);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = jDOMNodePointer12.namespacePointer("hi!");
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale21, "http://www.w3.org/XML/1998/namespace");
        java.lang.Object obj24 = jDOMNodePointer23.getBaseValue();
        java.lang.String str25 = jDOMNodePointer23.getNamespaceURI();
        boolean boolean26 = jDOMNodePointer23.isActual();
        java.lang.Object obj27 = jDOMNodePointer23.getImmediateNode();
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer(nodePointer19, (java.lang.Object) jDOMNodePointer23);
        jDOMNodePointer28.setAttribute(true);
        org.junit.Assert.assertNotNull(nodePointer5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "" + "'", obj6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (-1L) + "'", obj13, (-1L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2147483648) + "'", int14 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2147483648) + "'", int15 == (-2147483648));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1.0d + "'", obj24, 1.0d);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1.0d + "'", obj27, 1.0d);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer3 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) 1.0d, locale1, "http://www.w3.org/XML/1998/namespace");
        boolean boolean4 = jDOMNodePointer3.isAttribute();
        java.lang.Class<?> wildcardClass5 = jDOMNodePointer3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        java.util.Locale locale1 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer2 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = jDOMNodePointer2.namespacePointer("http://www.w3.org/XML/1998/namespace");
        jDOMNodePointer2.setAttribute(true);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        java.util.Locale locale10 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer11 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale10);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator12 = jDOMNodePointer11.namespaceIterator();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer17 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale16);
        java.lang.Object obj18 = jDOMNodePointer17.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = jDOMNodePointer11.childIterator(nodeTest13, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer17);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator20 = jDOMNodePointer2.childIterator(nodeTest7, true, (org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer17);
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer23 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) true, locale21, "hi!");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver24 = jDOMNodePointer23.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = jDOMNodePointer23.getImmediateValuePointer();
        java.util.Locale locale26 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer28 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) nodePointer25, locale26, "<<unknown namespace>>");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver29 = jDOMNodePointer28.getNamespaceResolver();
        boolean boolean30 = jDOMNodePointer28.isLeaf();
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer33 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) boolean30, locale31, "/namespace::<<unknown namespace>>");
        java.lang.Object obj34 = jDOMNodePointer33.getRootNode();
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer37 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) (-1L), locale36);
        boolean boolean38 = jDOMNodePointer37.isRoot();
        jDOMNodePointer37.setIndex((int) 'a');
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver41 = jDOMNodePointer37.getNamespaceResolver();
        java.lang.String str42 = jDOMNodePointer37.asPath();
        int int43 = jDOMNodePointer33.compareTo((java.lang.Object) jDOMNodePointer37);
        java.util.Locale locale45 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer46 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) "", locale45);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer48 = jDOMNodePointer46.namespacePointer("http://www.w3.org/XML/1998/namespace");
        jDOMNodePointer46.setAttribute(true);
        java.util.Locale locale51 = null;
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer52 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((java.lang.Object) jDOMNodePointer46, locale51);
        java.lang.Object obj53 = jDOMNodePointer52.getNodeValue();
        boolean boolean54 = jDOMNodePointer52.isLeaf();
        boolean boolean55 = jDOMNodePointer52.isActual();
        java.lang.Object obj56 = jDOMNodePointer52.getNode();
        org.apache.commons.jxpath.JXPathContext jXPathContext57 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer58 = jDOMNodePointer52.createPath(jXPathContext57);
        org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer jDOMNodePointer59 = new org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) jDOMNodePointer37, (java.lang.Object) jXPathContext57);
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertNotNull(nodeIterator12);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (-1L) + "'", obj18, (-1L));
        org.junit.Assert.assertNotNull(nodeIterator19);
        org.junit.Assert.assertNotNull(nodeIterator20);
        org.junit.Assert.assertNotNull(namespaceResolver24);
        org.junit.Assert.assertNotNull(nodePointer25);
        org.junit.Assert.assertNotNull(namespaceResolver29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + true + "'", obj34, true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(namespaceResolver41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(nodePointer48);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertEquals(obj56.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj56), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj56), "");
        org.junit.Assert.assertNotNull(nodePointer58);
    }
}

