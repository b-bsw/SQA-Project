package org.apache.commons.jxpath.ri.model;

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
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        nodePointer3.setAttribute(false);
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName7, (java.lang.Object) 10.0d, locale9);
        boolean boolean11 = nodePointer10.isAttribute();
        java.lang.String str12 = nodePointer10.asPath();
        boolean boolean13 = nodePointer10.isCollection();
        org.apache.commons.jxpath.ri.QName qName14 = null;
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName15, (java.lang.Object) 10.0d, locale17);
        boolean boolean19 = nodePointer18.isAttribute();
        java.lang.Object obj20 = nodePointer18.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName21, (java.lang.Object) 10.0d, locale23);
        boolean boolean25 = nodePointer24.isAttribute();
        java.lang.Object obj26 = nodePointer24.getBaseValue();
        int int27 = nodePointer18.compareTo((java.lang.Object) nodePointer24);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = nodePointer18.getImmediateParentPointer();
        nodePointer18.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest30 = null;
        boolean boolean31 = nodePointer18.testNode(nodeTest30);
        java.util.Locale locale32 = null;
        nodePointer18.locale = locale32;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer10, qName14, (java.lang.Object) nodePointer18);
        java.lang.Object obj35 = nodePointer10.getNodeValue();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver36 = null;
        nodePointer10.setNamespaceResolver(namespaceResolver36);
        nodePointer3.parent = nodePointer10;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer39 = nodePointer3.getValuePointer();
        boolean boolean41 = nodePointer3.isDefaultNamespace("10");
        boolean boolean43 = nodePointer3.isDefaultNamespace("10");
        java.lang.Object obj44 = nodePointer3.getRootNode();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10" + "'", str12, "10");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 10.0d + "'", obj20, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 10.0d + "'", obj26, 10.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(nodePointer28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(nodePointer34);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 10.0d + "'", obj35, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 10.0d + "'", obj44, 10.0d);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.Object obj5 = nodePointer3.getValue();
        java.lang.String str7 = nodePointer3.getNamespaceURI("10");
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver8 = nodePointer3.getNamespaceResolver();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver9 = nodePointer3.getNamespaceResolver();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(namespaceResolver8);
        org.junit.Assert.assertNull(namespaceResolver9);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.Object obj5 = nodePointer3.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 10.0d, locale8);
        boolean boolean10 = nodePointer9.isAttribute();
        java.lang.Object obj11 = nodePointer9.getBaseValue();
        int int12 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer3.getImmediateParentPointer();
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = nodePointer3.getValuePointer();
        nodePointer3.printPointerChain();
        boolean boolean17 = nodePointer3.isLeaf();
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName19, (java.lang.Object) 10.0d, locale21);
        boolean boolean23 = nodePointer22.isAttribute();
        java.lang.Object obj24 = nodePointer22.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName25 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName25, (java.lang.Object) 10.0d, locale27);
        boolean boolean29 = nodePointer28.isAttribute();
        java.lang.Object obj30 = nodePointer28.getBaseValue();
        int int31 = nodePointer22.compareTo((java.lang.Object) nodePointer28);
        java.lang.Object obj32 = nodePointer28.getValue();
        java.util.Locale locale33 = nodePointer28.getLocale();
        org.apache.commons.jxpath.ri.QName qName34 = null;
        org.apache.commons.jxpath.ri.QName qName35 = null;
        java.util.Locale locale37 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName35, (java.lang.Object) 10.0d, locale37);
        boolean boolean39 = nodePointer38.isAttribute();
        java.lang.String str40 = nodePointer38.asPath();
        java.util.Locale locale41 = nodePointer38.locale;
        boolean boolean42 = nodePointer38.isAttribute();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver43 = null;
        nodePointer38.setNamespaceResolver(namespaceResolver43);
        java.lang.String str45 = nodePointer38.asPath();
        org.apache.commons.jxpath.JXPathContext jXPathContext46 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer47 = nodePointer38.createPath(jXPathContext46);
        java.lang.String str48 = nodePointer38.asPath();
        org.apache.commons.jxpath.ri.QName qName49 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer51 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer38, qName49, (java.lang.Object) 10L);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator52 = nodePointer38.namespaceIterator();
        nodePointer38.setAttribute(true);
        int int55 = nodePointer38.index;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer56 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer28, qName34, (java.lang.Object) nodePointer38);
        nodePointer3.parent = nodePointer28;
        java.lang.String str58 = nodePointer3.getNamespaceURI();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0d + "'", obj11, 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 10.0d + "'", obj24, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 10.0d + "'", obj30, 10.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 10.0d + "'", obj32, 10.0d);
        org.junit.Assert.assertNull(locale33);
        org.junit.Assert.assertNotNull(nodePointer38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "10" + "'", str40, "10");
        org.junit.Assert.assertNull(locale41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "10" + "'", str45, "10");
        org.junit.Assert.assertNotNull(nodePointer47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "10" + "'", str48, "10");
        org.junit.Assert.assertNotNull(nodePointer51);
        org.junit.Assert.assertNull(nodeIterator52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-2147483648) + "'", int55 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer56);
        org.junit.Assert.assertNull(str58);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        int int4 = nodePointer3.index;
        boolean boolean6 = nodePointer3.isDefaultNamespace("hi!");
        org.apache.commons.jxpath.ri.QName qName7 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer3, qName7, (java.lang.Object) "hi!");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer3.parent;
        java.util.Locale locale11 = nodePointer3.getLocale();
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName12, (java.lang.Object) 10.0d, locale14);
        boolean boolean16 = nodePointer15.isAttribute();
        java.lang.String str17 = nodePointer15.asPath();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = nodePointer15.getImmediateValuePointer();
        boolean boolean19 = nodePointer18.isLeaf();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = nodePointer18.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = nodePointer20.parent;
        java.lang.Object obj22 = nodePointer20.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = nodePointer20.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = nodePointer23.getValuePointer();
        int int25 = nodePointer3.compareTo((java.lang.Object) nodePointer23);
        java.lang.Object obj26 = nodePointer3.getNode();
        org.apache.commons.jxpath.ri.QName qName27 = null;
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName27, (java.lang.Object) 10.0d, locale29);
        boolean boolean31 = nodePointer30.isAttribute();
        java.lang.Object obj32 = nodePointer30.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName33 = null;
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer36 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName33, (java.lang.Object) 10.0d, locale35);
        boolean boolean37 = nodePointer36.isAttribute();
        java.lang.Object obj38 = nodePointer36.getBaseValue();
        int int39 = nodePointer30.compareTo((java.lang.Object) nodePointer36);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer40 = nodePointer30.getImmediateParentPointer();
        nodePointer30.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest42 = null;
        boolean boolean43 = nodePointer30.testNode(nodeTest42);
        java.util.Locale locale44 = null;
        nodePointer30.locale = locale44;
        java.lang.Object obj46 = nodePointer30.getValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer47 = nodePointer30.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.QName qName48 = null;
        java.util.Locale locale50 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer51 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName48, (java.lang.Object) 10.0d, locale50);
        boolean boolean52 = nodePointer51.isAttribute();
        java.lang.String str53 = nodePointer51.asPath();
        java.util.Locale locale54 = nodePointer51.locale;
        java.lang.Object obj55 = nodePointer51.clone();
        int int56 = nodePointer51.getIndex();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer57 = nodePointer51.getImmediateValuePointer();
        int int58 = nodePointer47.compareTo((java.lang.Object) nodePointer57);
        boolean boolean59 = nodePointer57.isRoot();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver60 = null;
        nodePointer57.setNamespaceResolver(namespaceResolver60);
        nodePointer3.parent = nodePointer57;
        java.lang.String str63 = nodePointer57.toString();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertNull(nodePointer10);
        org.junit.Assert.assertNull(locale11);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10" + "'", str17, "10");
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertNull(nodePointer21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 10.0d + "'", obj22, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 10.0d + "'", obj26, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 10.0d + "'", obj32, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 10.0d + "'", obj38, 10.0d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(nodePointer40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 10.0d + "'", obj46, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer47);
        org.junit.Assert.assertNotNull(nodePointer51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "10" + "'", str53, "10");
        org.junit.Assert.assertNull(locale54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertEquals(obj55.toString(), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj55), "10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj55), "10");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-2147483648) + "'", int56 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "10" + "'", str63, "10");
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        boolean boolean5 = nodePointer3.isLeaf();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 10.0d, locale8);
        boolean boolean10 = nodePointer9.isAttribute();
        java.lang.String str11 = nodePointer9.asPath();
        boolean boolean12 = nodePointer9.isCollection();
        int int13 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator14 = nodePointer9.namespaceIterator();
        java.lang.Object obj15 = nodePointer9.clone();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(nodeIterator14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "10");
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.String str5 = nodePointer3.asPath();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.getImmediateValuePointer();
        boolean boolean7 = nodePointer6.isLeaf();
        java.util.Locale locale8 = null;
        nodePointer6.locale = locale8;
        boolean boolean10 = nodePointer6.isActual();
        int int11 = nodePointer6.getIndex();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer6.getImmediateValuePointer();
        java.util.Locale locale13 = null;
        nodePointer6.locale = locale13;
        boolean boolean15 = nodePointer6.isLeaf();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2147483648) + "'", int11 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        org.apache.commons.jxpath.ri.QName qName2 = null;
        org.apache.commons.jxpath.ri.QName qName3 = null;
        java.util.Locale locale5 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName3, (java.lang.Object) 10.0d, locale5);
        int int7 = nodePointer6.index;
        boolean boolean9 = nodePointer6.isDefaultNamespace("hi!");
        java.util.Locale locale10 = null;
        nodePointer6.locale = locale10;
        java.lang.Object obj12 = nodePointer6.getNode();
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName2, obj12, locale13);
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) qName2, locale15);
        java.lang.Object obj17 = nodePointer16.clone();
        boolean boolean19 = nodePointer16.isDefaultNamespace("10/null");
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) boolean19, locale20);
        java.lang.Object obj22 = nodePointer21.getNodeValue();
        java.lang.Object obj23 = nodePointer21.getValue();
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2147483648) + "'", int7 == (-2147483648));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10.0d + "'", obj12, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "null()");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "null()");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "null()");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + false + "'", obj22, false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + false + "'", obj23, false);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.Object obj5 = nodePointer3.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 10.0d, locale8);
        boolean boolean10 = nodePointer9.isAttribute();
        java.lang.Object obj11 = nodePointer9.getBaseValue();
        int int12 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer3.getImmediateParentPointer();
        nodePointer3.printPointerChain();
        java.lang.String str15 = nodePointer3.asPath();
        boolean boolean16 = nodePointer3.isContainer();
        java.lang.String str17 = nodePointer3.getDefaultNamespaceURI();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = nodePointer3.isLanguage("/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0d + "'", obj11, 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10" + "'", str15, "10");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        int int5 = nodePointer3.index;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.getImmediateValuePointer();
        nodePointer3.setIndex((int) (short) -1);
        int int9 = nodePointer3.getLength();
        org.apache.commons.jxpath.JXPathContext jXPathContext10 = null;
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName11, (java.lang.Object) 10.0d, locale13);
        boolean boolean15 = nodePointer14.isAttribute();
        java.lang.String str16 = nodePointer14.asPath();
        java.util.Locale locale17 = nodePointer14.locale;
        boolean boolean18 = nodePointer14.isAttribute();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver19 = null;
        nodePointer14.setNamespaceResolver(namespaceResolver19);
        java.lang.String str21 = nodePointer14.asPath();
        org.apache.commons.jxpath.JXPathContext jXPathContext22 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = nodePointer14.createPath(jXPathContext22);
        java.lang.String str24 = nodePointer14.asPath();
        org.apache.commons.jxpath.ri.QName qName25 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer27 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer14, qName25, (java.lang.Object) 10L);
        org.apache.commons.jxpath.JXPathContext jXPathContext28 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = nodePointer27.createPath(jXPathContext28);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = nodePointer3.createPath(jXPathContext10, (java.lang.Object) nodePointer27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2147483648) + "'", int5 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10" + "'", str16, "10");
        org.junit.Assert.assertNull(locale17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10" + "'", str21, "10");
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10" + "'", str24, "10");
        org.junit.Assert.assertNotNull(nodePointer27);
        org.junit.Assert.assertNotNull(nodePointer29);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.String str5 = nodePointer3.asPath();
        java.util.Locale locale6 = nodePointer3.locale;
        java.lang.Object obj7 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver8 = null;
        nodePointer3.setNamespaceResolver(namespaceResolver8);
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName10, (java.lang.Object) 10, locale12);
        nodePointer3.parent = nodePointer13;
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName15, (java.lang.Object) 10.0d, locale17);
        boolean boolean19 = nodePointer18.isAttribute();
        java.lang.Object obj20 = nodePointer18.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName21, (java.lang.Object) 10.0d, locale23);
        boolean boolean25 = nodePointer24.isAttribute();
        java.lang.Object obj26 = nodePointer24.getBaseValue();
        int int27 = nodePointer18.compareTo((java.lang.Object) nodePointer24);
        java.lang.Object obj28 = nodePointer18.clone();
        java.lang.Object obj29 = nodePointer18.getValue();
        boolean boolean30 = nodePointer18.isAttribute();
        int int31 = nodePointer18.getLength();
        int int32 = nodePointer18.getIndex();
        nodePointer3.parent = nodePointer18;
        java.lang.Object obj34 = nodePointer18.getImmediateNode();
        nodePointer18.index = (short) 100;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = nodePointer18.getValuePointer();
        java.lang.Object obj38 = nodePointer37.getValue();
        boolean boolean39 = nodePointer37.isContainer();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "10");
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 10.0d + "'", obj20, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 10.0d + "'", obj26, 10.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "10");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 10.0d + "'", obj29, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-2147483648) + "'", int32 == (-2147483648));
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 10.0d + "'", obj34, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer37);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 10.0d + "'", obj38, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 10.0d, locale3);
        boolean boolean5 = nodePointer4.isAttribute();
        java.lang.Object obj6 = nodePointer4.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName7, (java.lang.Object) 10.0d, locale9);
        boolean boolean11 = nodePointer10.isAttribute();
        java.lang.Object obj12 = nodePointer10.getBaseValue();
        int int13 = nodePointer4.compareTo((java.lang.Object) nodePointer10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = nodePointer4.getImmediateParentPointer();
        nodePointer4.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = nodePointer4.testNode(nodeTest16);
        java.util.Locale locale18 = nodePointer4.locale;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) nodePointer4, locale19);
        java.lang.Object obj21 = nodePointer20.getBaseValue();
        java.lang.String str22 = nodePointer20.getDefaultNamespaceURI();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0d + "'", obj6, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10.0d + "'", obj12, 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(locale18);
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "10");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.Object obj5 = nodePointer3.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 10.0d, locale8);
        boolean boolean10 = nodePointer9.isAttribute();
        java.lang.Object obj11 = nodePointer9.getBaseValue();
        int int12 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        java.lang.Object obj13 = nodePointer3.clone();
        java.lang.Object obj14 = nodePointer3.getValue();
        boolean boolean15 = nodePointer3.isAttribute();
        org.apache.commons.jxpath.ri.QName qName16 = nodePointer3.getName();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = nodePointer3.getValuePointer();
        java.lang.String str18 = nodePointer17.getNamespaceURI();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator19 = nodePointer17.namespaceIterator();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = nodePointer17.getValuePointer();
        boolean boolean21 = nodePointer20.isAttribute();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = nodePointer20.getImmediateValuePointer();
        java.lang.Object obj23 = nodePointer20.getBaseValue();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0d + "'", obj11, 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "10");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10.0d + "'", obj14, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(qName16);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(nodeIterator19);
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 10.0d + "'", obj23, 10.0d);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.Object obj5 = nodePointer3.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 10.0d, locale8);
        boolean boolean10 = nodePointer9.isAttribute();
        java.lang.Object obj11 = nodePointer9.getBaseValue();
        int int12 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        java.lang.Object obj13 = nodePointer9.getValue();
        java.lang.String str15 = nodePointer9.getNamespaceURI("10");
        java.lang.Object obj16 = nodePointer9.clone();
        nodePointer9.setAttribute(false);
        java.lang.Object obj19 = nodePointer9.clone();
        java.lang.Object obj20 = nodePointer9.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = nodePointer9.getValuePointer();
        boolean boolean22 = nodePointer9.isAttribute();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0d + "'", obj11, 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10.0d + "'", obj13, 10.0d);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "10");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "10");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 10.0d + "'", obj20, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 10.0d, locale3);
        boolean boolean5 = nodePointer4.isAttribute();
        java.lang.Object obj6 = nodePointer4.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName7, (java.lang.Object) 10.0d, locale9);
        boolean boolean11 = nodePointer10.isAttribute();
        java.lang.Object obj12 = nodePointer10.getBaseValue();
        int int13 = nodePointer4.compareTo((java.lang.Object) nodePointer10);
        java.lang.Object obj14 = nodePointer4.clone();
        java.lang.Object obj15 = nodePointer4.getValue();
        boolean boolean16 = nodePointer4.isAttribute();
        int int17 = nodePointer4.getLength();
        int int18 = nodePointer4.getIndex();
        int int19 = nodePointer4.index;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = nodePointer4.getValuePointer();
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) nodePointer4, locale21);
        boolean boolean23 = nodePointer4.isActual();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0d + "'", obj6, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10.0d + "'", obj12, 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "10");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 10.0d + "'", obj15, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2147483648) + "'", int18 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-2147483648) + "'", int19 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        int int5 = nodePointer3.index;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.getValuePointer();
        java.lang.Object obj8 = nodePointer3.getRootNode();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2147483648) + "'", int5 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10.0d + "'", obj8, 10.0d);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.String str5 = nodePointer3.asPath();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.getImmediateValuePointer();
        boolean boolean7 = nodePointer6.isLeaf();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = nodePointer6.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = nodePointer8.parent;
        java.lang.Object obj10 = nodePointer8.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer8.getValuePointer();
        org.apache.commons.jxpath.JXPathContext jXPathContext12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer8.createPath(jXPathContext12);
        java.lang.String str15 = nodePointer8.getNamespaceURI("hi!");
        boolean boolean16 = nodePointer8.isNode();
        int int17 = nodePointer8.getIndex();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodePointer8);
        org.junit.Assert.assertNull(nodePointer9);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0d + "'", obj10, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2147483648) + "'", int17 == (-2147483648));
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 10.0d, locale3);
        boolean boolean5 = nodePointer4.isAttribute();
        java.lang.Object obj6 = nodePointer4.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName7, (java.lang.Object) 10.0d, locale9);
        boolean boolean11 = nodePointer10.isAttribute();
        java.lang.Object obj12 = nodePointer10.getBaseValue();
        int int13 = nodePointer4.compareTo((java.lang.Object) nodePointer10);
        java.lang.Object obj14 = nodePointer10.getValue();
        java.lang.String str16 = nodePointer10.getNamespaceURI("10");
        java.lang.Object obj17 = nodePointer10.clone();
        nodePointer10.setAttribute(false);
        java.lang.Object obj20 = nodePointer10.getNodeValue();
        boolean boolean21 = nodePointer10.isLeaf();
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) boolean21, locale22);
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0d + "'", obj6, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10.0d + "'", obj12, 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10.0d + "'", obj14, 10.0d);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "10");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 10.0d + "'", obj20, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(nodePointer23);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.Object obj5 = nodePointer3.getImmediateNode();
        java.lang.String str6 = nodePointer3.getNamespaceURI();
        org.apache.commons.jxpath.JXPathContext jXPathContext7 = null;
        org.apache.commons.jxpath.ri.QName qName8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer3.createChild(jXPathContext7, qName8, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot create an object for path 10/null[11], operation is not allowed for this type of node");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10 + "'", obj5, 10);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) ' ', locale2);
        org.apache.commons.jxpath.ri.QName qName4 = null;
        java.util.Locale locale6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName4, (java.lang.Object) 10.0d, locale6);
        boolean boolean8 = nodePointer7.isAttribute();
        java.lang.String str9 = nodePointer7.asPath();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer7.getImmediateValuePointer();
        boolean boolean11 = nodePointer10.isLeaf();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer10.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer12.parent;
        java.lang.Object obj14 = nodePointer12.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = nodePointer12.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = nodePointer15.parent;
        nodePointer15.setAttribute(false);
        java.util.Locale locale19 = null;
        nodePointer15.locale = locale19;
        int int21 = nodePointer3.compareTo((java.lang.Object) nodePointer15);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10.0d + "'", obj14, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertNull(nodePointer16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.String str5 = nodePointer3.asPath();
        java.util.Locale locale6 = nodePointer3.locale;
        boolean boolean7 = nodePointer3.isAttribute();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver8 = null;
        nodePointer3.setNamespaceResolver(namespaceResolver8);
        java.lang.String str10 = nodePointer3.asPath();
        boolean boolean11 = nodePointer3.isContainer();
        java.util.Locale locale12 = nodePointer3.getLocale();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(locale12);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.Object obj5 = nodePointer3.getBaseValue();
        java.lang.String str7 = nodePointer3.getNamespaceURI("10");
        boolean boolean9 = nodePointer3.isDefaultNamespace("<<unknown namespace>>");
        java.lang.String str10 = nodePointer3.asPath();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer3.parent;
        boolean boolean12 = nodePointer3.isActual();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.Object obj5 = nodePointer3.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 10.0d, locale8);
        boolean boolean10 = nodePointer9.isAttribute();
        java.lang.Object obj11 = nodePointer9.getBaseValue();
        int int12 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer3.getImmediateParentPointer();
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        boolean boolean16 = nodePointer3.testNode(nodeTest15);
        java.util.Locale locale17 = null;
        nodePointer3.locale = locale17;
        java.lang.Object obj19 = nodePointer3.getNode();
        java.lang.Object obj20 = nodePointer3.getRootNode();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0d + "'", obj11, 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 10.0d + "'", obj19, 10.0d);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 10.0d + "'", obj20, 10.0d);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.Object obj5 = nodePointer3.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 10.0d, locale8);
        boolean boolean10 = nodePointer9.isAttribute();
        java.lang.Object obj11 = nodePointer9.getBaseValue();
        int int12 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer3.getImmediateParentPointer();
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        boolean boolean16 = nodePointer3.testNode(nodeTest15);
        java.util.Locale locale17 = null;
        nodePointer3.locale = locale17;
        java.lang.Object obj19 = nodePointer3.getValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = nodePointer3.getImmediateValuePointer();
        boolean boolean21 = nodePointer20.isCollection();
        java.lang.String str22 = nodePointer20.getDefaultNamespaceURI();
        boolean boolean23 = nodePointer20.isActual();
        java.lang.String str24 = nodePointer20.getNamespaceURI();
        java.lang.Object obj25 = nodePointer20.clone();
        boolean boolean26 = nodePointer20.isLeaf();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0d + "'", obj11, 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 10.0d + "'", obj19, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "10");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 10.0d, locale3);
        boolean boolean5 = nodePointer4.isAttribute();
        java.lang.Object obj6 = nodePointer4.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName7, (java.lang.Object) 10.0d, locale9);
        boolean boolean11 = nodePointer10.isAttribute();
        java.lang.Object obj12 = nodePointer10.getBaseValue();
        int int13 = nodePointer4.compareTo((java.lang.Object) nodePointer10);
        java.lang.Object obj14 = nodePointer10.getValue();
        java.lang.String str16 = nodePointer10.getNamespaceURI("10");
        java.lang.Object obj17 = nodePointer10.clone();
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) nodePointer10, locale18);
        nodePointer10.setIndex((int) ' ');
        org.apache.commons.jxpath.ri.QName qName22 = null;
        org.apache.commons.jxpath.ri.QName qName23 = null;
        java.util.Locale locale25 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer26 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName23, (java.lang.Object) 10.0d, locale25);
        boolean boolean27 = nodePointer26.isAttribute();
        java.lang.Object obj28 = nodePointer26.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName29 = null;
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName29, (java.lang.Object) 10.0d, locale31);
        boolean boolean33 = nodePointer32.isAttribute();
        java.lang.Object obj34 = nodePointer32.getBaseValue();
        int int35 = nodePointer26.compareTo((java.lang.Object) nodePointer32);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer36 = nodePointer26.getImmediateParentPointer();
        nodePointer26.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest38 = null;
        boolean boolean39 = nodePointer26.testNode(nodeTest38);
        nodePointer26.index = (short) 1;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer10, qName22, (java.lang.Object) nodePointer26);
        org.apache.commons.jxpath.JXPathContext jXPathContext43 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer44 = nodePointer26.createPath(jXPathContext43);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator45 = nodePointer44.namespaceIterator();
        boolean boolean47 = nodePointer44.isDefaultNamespace("10/null");
        java.lang.Object obj48 = nodePointer44.clone();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0d + "'", obj6, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10.0d + "'", obj12, 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10.0d + "'", obj14, 10.0d);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "10");
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertNotNull(nodePointer26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 10.0d + "'", obj28, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 10.0d + "'", obj34, 10.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(nodePointer36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(nodePointer42);
        org.junit.Assert.assertNotNull(nodePointer44);
        org.junit.Assert.assertNull(nodeIterator45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "10");
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.String str5 = nodePointer3.asPath();
        boolean boolean6 = nodePointer3.isCollection();
        java.util.Locale locale7 = nodePointer3.getLocale();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = nodePointer3.namespaceIterator();
        java.lang.String str9 = nodePointer3.asPath();
        org.apache.commons.jxpath.JXPathContext jXPathContext10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer3.createPath(jXPathContext10);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver12 = null;
        nodePointer11.setNamespaceResolver(namespaceResolver12);
        java.lang.String str14 = nodePointer11.toString();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10" + "'", str14, "10");
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.Object obj5 = nodePointer3.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 10.0d, locale8);
        boolean boolean10 = nodePointer9.isAttribute();
        java.lang.Object obj11 = nodePointer9.getBaseValue();
        int int12 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer3.getImmediateParentPointer();
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        boolean boolean16 = nodePointer3.testNode(nodeTest15);
        java.util.Locale locale17 = null;
        nodePointer3.locale = locale17;
        boolean boolean19 = nodePointer3.isLeaf();
        org.apache.commons.jxpath.JXPathContext jXPathContext20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer22 = nodePointer3.getPointerByID(jXPathContext20, "1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0d + "'", obj11, 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.Object obj5 = nodePointer3.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 10.0d, locale8);
        boolean boolean10 = nodePointer9.isAttribute();
        java.lang.Object obj11 = nodePointer9.getBaseValue();
        int int12 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer3.getImmediateParentPointer();
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        boolean boolean16 = nodePointer3.testNode(nodeTest15);
        java.util.Locale locale17 = null;
        nodePointer3.locale = locale17;
        org.apache.commons.jxpath.ri.QName qName19 = null;
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName20, (java.lang.Object) 10.0d, locale22);
        boolean boolean24 = nodePointer23.isAttribute();
        java.lang.Object obj25 = nodePointer23.getBaseValue();
        java.util.Locale locale26 = null;
        nodePointer23.locale = locale26;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer3, qName19, (java.lang.Object) nodePointer23);
        java.lang.String str29 = nodePointer28.asPath();
        boolean boolean30 = nodePointer28.isLeaf();
        boolean boolean31 = nodePointer28.isAttribute();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = nodePointer28.getImmediateParentPointer();
        java.lang.String str33 = nodePointer32.getNamespaceURI();
        // The following exception was thrown during execution in test generation
        try {
            nodePointer32.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot remove an object that is not some other object's property or a collection element");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0d + "'", obj11, 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 10.0d + "'", obj25, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "10/null" + "'", str29, "10/null");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(nodePointer32);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.Object obj5 = nodePointer3.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 10.0d, locale8);
        boolean boolean10 = nodePointer9.isAttribute();
        java.lang.Object obj11 = nodePointer9.getBaseValue();
        int int12 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer3.getImmediateParentPointer();
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        boolean boolean16 = nodePointer3.testNode(nodeTest15);
        java.util.Locale locale17 = null;
        nodePointer3.locale = locale17;
        org.apache.commons.jxpath.ri.QName qName19 = null;
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName20, (java.lang.Object) 10.0d, locale22);
        boolean boolean24 = nodePointer23.isAttribute();
        java.lang.Object obj25 = nodePointer23.getBaseValue();
        java.util.Locale locale26 = null;
        nodePointer23.locale = locale26;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer3, qName19, (java.lang.Object) nodePointer23);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = nodePointer28.namespacePointer("<<unknown namespace>>");
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0d + "'", obj11, 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 10.0d + "'", obj25, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer28);
        org.junit.Assert.assertNull(nodePointer30);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        nodePointer3.setIndex(10);
        org.junit.Assert.assertNotNull(nodePointer3);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        int int4 = nodePointer3.index;
        boolean boolean6 = nodePointer3.isDefaultNamespace("hi!");
        java.util.Locale locale7 = null;
        nodePointer3.locale = locale7;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        boolean boolean10 = nodePointer3.testNode(nodeTest9);
        java.lang.String str11 = nodePointer3.getNamespaceURI();
        java.lang.Object obj12 = nodePointer3.clone();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "10");
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10L, locale2);
        boolean boolean4 = nodePointer3.isLeaf();
        boolean boolean5 = nodePointer3.isLeaf();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.namespacePointer("null()");
        java.lang.String str8 = nodePointer3.getNamespaceURI();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.String str5 = nodePointer3.asPath();
        boolean boolean6 = nodePointer3.isCollection();
        java.util.Locale locale7 = nodePointer3.getLocale();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator8 = nodePointer3.namespaceIterator();
        java.lang.String str9 = nodePointer3.asPath();
        java.lang.String str10 = nodePointer3.getDefaultNamespaceURI();
        java.lang.Object obj11 = nodePointer3.getNode();
        boolean boolean13 = nodePointer3.isDefaultNamespace("");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = nodePointer3.getValuePointer();
        nodePointer3.setAttribute(false);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNull(nodeIterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0d + "'", obj11, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodePointer14);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        nodePointer3.setAttribute(false);
        nodePointer3.setIndex((int) (byte) 1);
        boolean boolean9 = nodePointer3.isContainer();
        java.util.Locale locale10 = nodePointer3.locale;
        java.lang.Object obj11 = nodePointer3.getRootNode();
        int int12 = nodePointer3.getLength();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0d + "'", obj11, 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.Object obj5 = nodePointer3.getValue();
        java.lang.String str7 = nodePointer3.getNamespaceURI("10");
        java.lang.Object obj8 = nodePointer3.getRootNode();
        java.lang.String str9 = nodePointer3.toString();
        boolean boolean10 = nodePointer3.isActual();
        boolean boolean11 = nodePointer3.isCollection();
        java.lang.Object obj12 = nodePointer3.clone();
        java.lang.String str13 = nodePointer3.toString();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10.0d + "'", obj8, 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.String str5 = nodePointer3.asPath();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.getImmediateValuePointer();
        boolean boolean7 = nodePointer6.isLeaf();
        java.util.Locale locale8 = null;
        nodePointer6.locale = locale8;
        java.util.Locale locale10 = nodePointer6.locale;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer6.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName12, (java.lang.Object) 10.0d, locale14);
        boolean boolean16 = nodePointer15.isAttribute();
        java.lang.Object obj17 = nodePointer15.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName18 = null;
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName18, (java.lang.Object) 10.0d, locale20);
        boolean boolean22 = nodePointer21.isAttribute();
        java.lang.Object obj23 = nodePointer21.getBaseValue();
        int int24 = nodePointer15.compareTo((java.lang.Object) nodePointer21);
        java.lang.Object obj25 = nodePointer15.clone();
        java.lang.Object obj26 = nodePointer15.getValue();
        boolean boolean27 = nodePointer15.isAttribute();
        int int28 = nodePointer15.getLength();
        int int29 = nodePointer15.getIndex();
        int int30 = nodePointer15.index;
        java.lang.String str31 = nodePointer15.toString();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver32 = null;
        nodePointer15.setNamespaceResolver(namespaceResolver32);
        nodePointer15.setAttribute(true);
        boolean boolean36 = nodePointer15.isAttribute();
        nodePointer6.parent = nodePointer15;
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(locale10);
        org.junit.Assert.assertNotNull(nodePointer11);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 10.0d + "'", obj17, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 10.0d + "'", obj23, 10.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "10");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 10.0d + "'", obj26, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-2147483648) + "'", int29 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2147483648) + "'", int30 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "10" + "'", str31, "10");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.Object obj5 = nodePointer3.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 10.0d, locale8);
        boolean boolean10 = nodePointer9.isAttribute();
        java.lang.Object obj11 = nodePointer9.getBaseValue();
        int int12 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        java.lang.Object obj13 = nodePointer3.clone();
        java.lang.Object obj14 = nodePointer3.getValue();
        boolean boolean15 = nodePointer3.isAttribute();
        int int16 = nodePointer3.getLength();
        int int17 = nodePointer3.getIndex();
        int int18 = nodePointer3.index;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = nodePointer3.getValuePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        boolean boolean21 = nodePointer19.testNode(nodeTest20);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = nodePointer19.getValuePointer();
        java.lang.Object obj23 = nodePointer19.getValue();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0d + "'", obj11, 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "10");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10.0d + "'", obj14, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2147483648) + "'", int17 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2147483648) + "'", int18 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 10.0d + "'", obj23, 10.0d);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 10.0d, locale3);
        int int5 = nodePointer4.index;
        boolean boolean7 = nodePointer4.isDefaultNamespace("hi!");
        org.apache.commons.jxpath.ri.QName qName8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer4, qName8, (java.lang.Object) "hi!");
        boolean boolean11 = nodePointer4.isNode();
        java.lang.Object obj12 = nodePointer4.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer4.getValuePointer();
        org.apache.commons.jxpath.JXPathContext jXPathContext14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = nodePointer13.createPath(jXPathContext14);
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) nodePointer15, locale16);
        boolean boolean19 = nodePointer17.isDefaultNamespace("-2147483648");
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2147483648) + "'", int5 == (-2147483648));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10.0d + "'", obj12, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer13);
        org.junit.Assert.assertNotNull(nodePointer15);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 10.0d, locale3);
        boolean boolean5 = nodePointer4.isAttribute();
        java.lang.Object obj6 = nodePointer4.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName7, (java.lang.Object) 10.0d, locale9);
        boolean boolean11 = nodePointer10.isAttribute();
        java.lang.Object obj12 = nodePointer10.getBaseValue();
        int int13 = nodePointer4.compareTo((java.lang.Object) nodePointer10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = nodePointer4.getImmediateParentPointer();
        nodePointer4.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = nodePointer4.testNode(nodeTest16);
        java.util.Locale locale18 = null;
        nodePointer4.locale = locale18;
        java.lang.Object obj20 = nodePointer4.clone();
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) nodePointer4, locale21);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = nodePointer4.getValuePointer();
        java.lang.String str24 = nodePointer4.getNamespaceURI();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0d + "'", obj6, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10.0d + "'", obj12, 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "10");
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.Object obj5 = nodePointer3.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 10.0d, locale8);
        boolean boolean10 = nodePointer9.isAttribute();
        java.lang.Object obj11 = nodePointer9.getBaseValue();
        int int12 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer3.getImmediateParentPointer();
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        boolean boolean16 = nodePointer3.testNode(nodeTest15);
        nodePointer3.index = 10;
        int int19 = nodePointer3.index;
        boolean boolean20 = nodePointer3.isActual();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0d + "'", obj11, 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.Object obj5 = nodePointer3.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 10.0d, locale8);
        boolean boolean10 = nodePointer9.isAttribute();
        java.lang.Object obj11 = nodePointer9.getBaseValue();
        int int12 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        java.lang.Object obj13 = nodePointer3.clone();
        java.lang.Object obj14 = nodePointer3.getValue();
        boolean boolean15 = nodePointer3.isAttribute();
        org.apache.commons.jxpath.ri.QName qName16 = nodePointer3.getName();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = nodePointer3.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName18 = nodePointer17.getName();
        boolean boolean19 = nodePointer17.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = nodePointer17.parent;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = nodePointer17.getValuePointer();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0d + "'", obj11, 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "10");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10.0d + "'", obj14, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(qName16);
        org.junit.Assert.assertNotNull(nodePointer17);
        org.junit.Assert.assertNull(qName18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(nodePointer20);
        org.junit.Assert.assertNotNull(nodePointer21);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        boolean boolean5 = nodePointer3.isLeaf();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator6 = nodePointer3.namespaceIterator();
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName7, (java.lang.Object) 10.0d, locale9);
        boolean boolean11 = nodePointer10.isAttribute();
        java.lang.Object obj12 = nodePointer10.getBaseValue();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        boolean boolean14 = nodePointer10.testNode(nodeTest13);
        nodePointer3.parent = nodePointer10;
        java.lang.String str16 = nodePointer10.getDefaultNamespaceURI();
        int int17 = nodePointer10.getLength();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = nodePointer10.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName19 = null;
        java.util.Locale locale21 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName19, (java.lang.Object) 10.0d, locale21);
        boolean boolean23 = nodePointer22.isAttribute();
        java.lang.Object obj24 = nodePointer22.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName25 = null;
        java.util.Locale locale27 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer28 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName25, (java.lang.Object) 10.0d, locale27);
        boolean boolean29 = nodePointer28.isAttribute();
        java.lang.Object obj30 = nodePointer28.getBaseValue();
        int int31 = nodePointer22.compareTo((java.lang.Object) nodePointer28);
        java.lang.Object obj32 = nodePointer28.getValue();
        java.lang.String str34 = nodePointer28.getNamespaceURI("10");
        java.lang.Object obj35 = nodePointer28.clone();
        nodePointer28.index = (byte) 10;
        nodePointer28.index = (byte) 1;
        boolean boolean40 = nodePointer28.isContainer();
        boolean boolean41 = nodePointer28.isLeaf();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = nodePointer28.getValuePointer();
        java.lang.String str44 = nodePointer28.getNamespaceURI("10");
        boolean boolean45 = nodePointer28.isCollection();
        org.apache.commons.jxpath.JXPathContext jXPathContext46 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer47 = nodePointer28.createPath(jXPathContext46);
        org.apache.commons.jxpath.ri.QName qName48 = null;
        java.util.Locale locale50 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer51 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName48, (java.lang.Object) 10.0d, locale50);
        int int52 = nodePointer51.index;
        boolean boolean54 = nodePointer51.isDefaultNamespace("hi!");
        org.apache.commons.jxpath.ri.QName qName55 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer57 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer51, qName55, (java.lang.Object) "hi!");
        java.lang.String str58 = nodePointer57.getDefaultNamespaceURI();
        boolean boolean60 = nodePointer57.isDefaultNamespace("hi!");
        java.lang.Object obj61 = nodePointer57.getNodeValue();
        nodePointer57.printPointerChain();
        // The following exception was thrown during execution in test generation
        try {
            int int63 = nodePointer10.compareChildNodePointers(nodePointer28, nodePointer57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(nodeIterator6);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10.0d + "'", obj12, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertNotNull(nodePointer22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 10.0d + "'", obj24, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 10.0d + "'", obj30, 10.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 10.0d + "'", obj32, 10.0d);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "10");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(nodePointer42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(nodePointer47);
        org.junit.Assert.assertNotNull(nodePointer51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-2147483648) + "'", int52 == (-2147483648));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(nodePointer57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + "hi!" + "'", obj61, "hi!");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 10.0d, locale3);
        boolean boolean5 = nodePointer4.isAttribute();
        java.lang.String str6 = nodePointer4.asPath();
        java.util.Locale locale7 = nodePointer4.locale;
        java.lang.Object obj8 = nodePointer4.clone();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver9 = null;
        nodePointer4.setNamespaceResolver(namespaceResolver9);
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName11, (java.lang.Object) 10, locale13);
        nodePointer4.parent = nodePointer14;
        boolean boolean16 = nodePointer14.isRoot();
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = nodePointer14.createPath(jXPathContext17);
        java.lang.Object obj19 = nodePointer14.getBaseValue();
        java.util.Locale locale20 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) nodePointer14, locale20);
        java.lang.Object obj22 = nodePointer14.clone();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "10");
        org.junit.Assert.assertNotNull(nodePointer14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 10 + "'", obj19, 10);
        org.junit.Assert.assertNotNull(nodePointer21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "10");
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        org.apache.commons.jxpath.ri.QName qName1 = null;
        java.util.Locale locale3 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName1, (java.lang.Object) 10.0d, locale3);
        boolean boolean5 = nodePointer4.isAttribute();
        java.lang.Object obj6 = nodePointer4.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName7 = null;
        java.util.Locale locale9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName7, (java.lang.Object) 10.0d, locale9);
        boolean boolean11 = nodePointer10.isAttribute();
        java.lang.Object obj12 = nodePointer10.getBaseValue();
        int int13 = nodePointer4.compareTo((java.lang.Object) nodePointer10);
        java.lang.Object obj14 = nodePointer10.getValue();
        java.lang.String str16 = nodePointer10.getNamespaceURI("10");
        java.lang.Object obj17 = nodePointer10.clone();
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) nodePointer10, locale18);
        boolean boolean20 = nodePointer10.isRoot();
        org.apache.commons.jxpath.ri.QName qName21 = nodePointer10.getName();
        org.junit.Assert.assertNotNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 10.0d + "'", obj6, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 10.0d + "'", obj12, 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 10.0d + "'", obj14, 10.0d);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "10");
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(qName21);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.String str5 = nodePointer3.asPath();
        java.util.Locale locale6 = nodePointer3.locale;
        boolean boolean7 = nodePointer3.isAttribute();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver8 = null;
        nodePointer3.setNamespaceResolver(namespaceResolver8);
        java.lang.String str10 = nodePointer3.asPath();
        org.apache.commons.jxpath.JXPathContext jXPathContext11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer3.createPath(jXPathContext11);
        java.lang.String str13 = nodePointer3.asPath();
        org.apache.commons.jxpath.ri.QName qName14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer3, qName14, (java.lang.Object) 10L);
        org.apache.commons.jxpath.JXPathContext jXPathContext17 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = nodePointer16.createPath(jXPathContext17);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = nodePointer18.getValuePointer();
        int int20 = nodePointer19.getLength();
        java.lang.String str22 = nodePointer19.getNamespaceURI("<<unknown namespace>>");
        boolean boolean23 = nodePointer19.isActual();
        java.lang.Class<?> wildcardClass24 = nodePointer19.getClass();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertNotNull(nodePointer16);
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertNotNull(nodePointer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.Object obj5 = nodePointer3.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 10.0d, locale8);
        boolean boolean10 = nodePointer9.isAttribute();
        java.lang.Object obj11 = nodePointer9.getBaseValue();
        int int12 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer3.getImmediateParentPointer();
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        boolean boolean16 = nodePointer3.testNode(nodeTest15);
        java.util.Locale locale17 = null;
        nodePointer3.locale = locale17;
        java.lang.Object obj19 = nodePointer3.getValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = nodePointer3.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest21 = null;
        boolean boolean22 = nodePointer20.testNode(nodeTest21);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = nodePointer20.getValuePointer();
        java.lang.String str24 = nodePointer23.getDefaultNamespaceURI();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = nodePointer23.getValuePointer();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0d + "'", obj11, 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 10.0d + "'", obj19, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(nodePointer23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(nodePointer25);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.Object obj5 = nodePointer3.getBaseValue();
        org.apache.commons.jxpath.ri.QName qName6 = null;
        java.util.Locale locale8 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName6, (java.lang.Object) 10.0d, locale8);
        boolean boolean10 = nodePointer9.isAttribute();
        java.lang.Object obj11 = nodePointer9.getBaseValue();
        int int12 = nodePointer3.compareTo((java.lang.Object) nodePointer9);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = nodePointer3.getImmediateParentPointer();
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        boolean boolean16 = nodePointer3.testNode(nodeTest15);
        java.util.Locale locale17 = null;
        nodePointer3.locale = locale17;
        java.lang.Object obj19 = nodePointer3.getValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = nodePointer3.getParent();
        nodePointer3.printPointerChain();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = nodePointer3.getValuePointer();
        org.apache.commons.jxpath.JXPathContext jXPathContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer26 = nodePointer22.getPointerByKey(jXPathContext23, "", "null()");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10.0d + "'", obj11, 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 10.0d + "'", obj19, 10.0d);
        org.junit.Assert.assertNull(nodePointer20);
        org.junit.Assert.assertNotNull(nodePointer22);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.String str5 = nodePointer3.asPath();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.getImmediateValuePointer();
        java.lang.String str7 = nodePointer3.asPath();
        java.lang.String str8 = nodePointer3.getDefaultNamespaceURI();
        boolean boolean9 = nodePointer3.isLeaf();
        org.apache.commons.jxpath.JXPathContext jXPathContext10 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer3.createPath(jXPathContext10);
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(nodePointer11);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        int int5 = nodePointer3.index;
        java.lang.String str6 = nodePointer3.getNamespaceURI();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.getImmediateValuePointer();
        boolean boolean8 = nodePointer7.isContainer();
        org.apache.commons.jxpath.JXPathContext jXPathContext9 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = nodePointer7.createPath(jXPathContext9);
        int int11 = nodePointer7.getIndex();
        org.apache.commons.jxpath.JXPathContext jXPathContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer15 = nodePointer7.getPointerByKey(jXPathContext12, "1", "-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2147483648) + "'", int5 == (-2147483648));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodePointer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2147483648) + "'", int11 == (-2147483648));
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.Object obj5 = nodePointer3.getValue();
        org.apache.commons.jxpath.JXPathContext jXPathContext6 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = nodePointer3.createPath(jXPathContext6);
        java.lang.Object obj8 = nodePointer3.getRootNode();
        org.apache.commons.jxpath.JXPathContext jXPathContext9 = null;
        org.apache.commons.jxpath.ri.QName qName10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = nodePointer3.createAttribute(jXPathContext9, qName10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Cannot create an attribute for path 10/@null, operation is not allowed for this type of node");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 10.0d + "'", obj5, 10.0d);
        org.junit.Assert.assertNotNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10.0d + "'", obj8, 10.0d);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator5 = nodePointer3.namespaceIterator();
        boolean boolean6 = nodePointer3.isContainer();
        java.util.Locale locale7 = nodePointer3.locale;
        org.apache.commons.jxpath.ri.QName qName8 = null;
        org.apache.commons.jxpath.ri.QName qName9 = null;
        java.util.Locale locale11 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName9, (java.lang.Object) 10.0d, locale11);
        int int13 = nodePointer12.index;
        boolean boolean15 = nodePointer12.isDefaultNamespace("hi!");
        org.apache.commons.jxpath.ri.QName qName16 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer12, qName16, (java.lang.Object) "hi!");
        boolean boolean19 = nodePointer12.isNode();
        boolean boolean20 = nodePointer12.isNode();
        nodePointer12.index = (-1);
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName8, (java.lang.Object) nodePointer12, locale23);
        // The following exception was thrown during execution in test generation
        try {
            nodePointer3.setValue((java.lang.Object) qName8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(nodeIterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(locale7);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2147483648) + "'", int13 == (-2147483648));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodePointer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(nodePointer24);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        int int4 = nodePointer3.index;
        boolean boolean6 = nodePointer3.isDefaultNamespace("hi!");
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        boolean boolean8 = nodePointer3.testNode(nodeTest7);
        boolean boolean9 = nodePointer3.isActual();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = nodePointer3.isLanguage("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.String str5 = nodePointer3.asPath();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.getImmediateValuePointer();
        java.lang.String str7 = nodePointer3.asPath();
        java.lang.String str8 = nodePointer3.getDefaultNamespaceURI();
        boolean boolean9 = nodePointer3.isLeaf();
        boolean boolean10 = nodePointer3.isCollection();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.String str5 = nodePointer3.asPath();
        java.util.Locale locale6 = nodePointer3.locale;
        java.lang.Object obj7 = nodePointer3.clone();
        int int8 = nodePointer3.getIndex();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = nodePointer3.getImmediateValuePointer();
        boolean boolean10 = nodePointer9.isAttribute();
        java.lang.Object obj11 = nodePointer9.clone();
        java.lang.String str12 = nodePointer9.getDefaultNamespaceURI();
        java.lang.Object obj13 = nodePointer9.clone();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "10");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2147483648) + "'", int8 == (-2147483648));
        org.junit.Assert.assertNotNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "10");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "10");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.String str5 = nodePointer3.asPath();
        java.util.Locale locale6 = nodePointer3.locale;
        java.lang.Object obj7 = nodePointer3.clone();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver8 = null;
        nodePointer3.setNamespaceResolver(namespaceResolver8);
        java.lang.Object obj10 = nodePointer3.getNode();
        boolean boolean11 = nodePointer3.isRoot();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nodePointer3.getImmediateValuePointer();
        java.lang.String str13 = nodePointer12.getDefaultNamespaceURI();
        int int14 = nodePointer12.index;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = nodePointer12.getImmediateParentPointer();
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertNull(locale6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "10");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "10");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 10.0d + "'", obj10, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(nodePointer12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2147483648) + "'", int14 == (-2147483648));
        org.junit.Assert.assertNull(nodePointer15);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 10.0d, locale2);
        boolean boolean4 = nodePointer3.isAttribute();
        java.lang.String str5 = nodePointer3.asPath();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = nodePointer3.getImmediateValuePointer();
        java.lang.String str7 = nodePointer3.getNamespaceURI();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = nodePointer3.parent;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = nodePointer8.isLeaf();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertNotNull(nodePointer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(nodePointer8);
    }
}

