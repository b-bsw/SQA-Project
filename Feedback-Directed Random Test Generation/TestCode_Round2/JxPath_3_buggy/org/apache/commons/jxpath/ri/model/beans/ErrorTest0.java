package org.apache.commons.jxpath.ri.model.beans;

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
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = nodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer6 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        nullPropertyPointer6.printPointerChain();
        java.lang.String str8 = nullPropertyPointer6.getPropertyName();
        java.lang.String str9 = nullPropertyPointer6.getPropertyName();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver10 = nullPropertyPointer6.getNamespaceResolver();
        java.lang.String str11 = nullPropertyPointer6.getPropertyName();
        nullPropertyPointer6.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName14, (java.lang.Object) 0.0d, locale16);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest18 = null;
        boolean boolean19 = nodePointer17.testNode(nodeTest18);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer20 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer17);
        int int21 = nullPropertyPointer20.getPropertyIndex();
        nullPropertyPointer20.setPropertyIndex((int) ' ');
        boolean boolean24 = nullPropertyPointer20.isContainer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver25 = nullPropertyPointer20.getNamespaceResolver();
        nullPropertyPointer20.setNameAttributeValue("0/*");
        nullPropertyPointer20.remove();
        java.lang.String str29 = nullPropertyPointer20.asPath();
        org.apache.commons.jxpath.ri.QName qName30 = null;
        java.util.Locale locale32 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer33 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName30, (java.lang.Object) 0.0d, locale32);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest34 = null;
        boolean boolean35 = nodePointer33.testNode(nodeTest34);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer36 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer33);
        nullPropertyPointer36.printPointerChain();
        java.lang.Object obj38 = nullPropertyPointer36.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName39 = null;
        org.apache.commons.jxpath.ri.QName qName40 = null;
        java.util.Locale locale42 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer43 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName40, (java.lang.Object) 0.0d, locale42);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest44 = null;
        boolean boolean45 = nodePointer43.testNode(nodeTest44);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer46 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer43);
        nullPropertyPointer46.printPointerChain();
        java.lang.String str48 = nullPropertyPointer46.getPropertyName();
        java.util.Locale locale49 = nullPropertyPointer46.getLocale();
        java.lang.Object obj50 = nullPropertyPointer46.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer51 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer36, qName39, obj50);
        nullPropertyPointer36.setNameAttributeValue("hi!");
        boolean boolean54 = nullPropertyPointer36.isActualProperty();
        boolean boolean55 = nullPropertyPointer36.isActualProperty();
        int int56 = nullPropertyPointer6.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer20, (org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nullPropertyPointer6 and nullPropertyPointer46", nullPropertyPointer6.equals(nullPropertyPointer46) ? nullPropertyPointer6.hashCode() == nullPropertyPointer46.hashCode() : true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = nodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer6 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        nullPropertyPointer6.printPointerChain();
        java.lang.String str8 = nullPropertyPointer6.getPropertyName();
        java.util.Locale locale9 = nullPropertyPointer6.getLocale();
        boolean boolean10 = nullPropertyPointer6.isLeaf();
        java.lang.String str11 = nullPropertyPointer6.getPropertyName();
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName12, (java.lang.Object) 0.0d, locale14);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = nodePointer15.testNode(nodeTest16);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer18 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer15);
        nullPropertyPointer18.printPointerChain();
        boolean boolean20 = nullPropertyPointer18.isActualProperty();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = nullPropertyPointer18.getValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = nullPropertyPointer18.getValuePointer();
        org.apache.commons.jxpath.ri.QName qName23 = nullPropertyPointer18.getName();
        java.lang.Object obj24 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer25 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer6, qName23, obj24);
        org.apache.commons.jxpath.ri.QName qName26 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName26, (java.lang.Object) 0.0d, locale28);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest30 = null;
        boolean boolean31 = nodePointer29.testNode(nodeTest30);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer32 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer29);
        nullPropertyPointer32.printPointerChain();
        boolean boolean34 = nullPropertyPointer32.isActualProperty();
        boolean boolean35 = nullPropertyPointer32.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer36 = nullPropertyPointer32.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = nullPropertyPointer32.getParent();
        boolean boolean38 = nullPropertyPointer32.isCollection();
        org.apache.commons.jxpath.ri.QName qName39 = null;
        java.util.Locale locale41 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer42 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName39, (java.lang.Object) 0.0d, locale41);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest43 = null;
        boolean boolean44 = nodePointer42.testNode(nodeTest43);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer45 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer42);
        int int46 = nullPropertyPointer45.getPropertyIndex();
        int int47 = nullPropertyPointer45.getPropertyCount();
        nullPropertyPointer45.setIndex((int) (byte) 0);
        java.lang.String str50 = nullPropertyPointer45.toString();
        java.lang.String str51 = nullPropertyPointer45.toString();
        int int52 = nullPropertyPointer45.getPropertyCount();
        int int53 = nullPropertyPointer6.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer32, (org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nullPropertyPointer6 and nullPropertyPointer45", nullPropertyPointer6.equals(nullPropertyPointer45) ? nullPropertyPointer6.hashCode() == nullPropertyPointer45.hashCode() : true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = nodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer6 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        nullPropertyPointer6.printPointerChain();
        boolean boolean8 = nullPropertyPointer6.isCollection();
        java.lang.String str9 = nullPropertyPointer6.getPropertyName();
        java.lang.Object obj10 = nullPropertyPointer6.getRootNode();
        java.lang.String[] strArray11 = nullPropertyPointer6.getPropertyNames();
        org.apache.commons.jxpath.ri.QName qName12 = null;
        java.util.Locale locale14 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName12, (java.lang.Object) 0.0d, locale14);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        boolean boolean17 = nodePointer15.testNode(nodeTest16);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer18 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer15);
        int int19 = nullPropertyPointer18.getPropertyIndex();
        int int20 = nullPropertyPointer18.getPropertyCount();
        nullPropertyPointer18.setIndex((int) (byte) 0);
        nullPropertyPointer18.setPropertyName("0/@*");
        nullPropertyPointer18.setNameAttributeValue("*");
        java.lang.String str28 = nullPropertyPointer18.getNamespaceURI("");
        org.apache.commons.jxpath.ri.QName qName29 = null;
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName29, (java.lang.Object) 0.0d, locale31);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest33 = null;
        boolean boolean34 = nodePointer32.testNode(nodeTest33);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer35 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer32);
        nullPropertyPointer35.printPointerChain();
        boolean boolean37 = nullPropertyPointer35.isCollection();
        boolean boolean38 = nullPropertyPointer35.isContainer();
        java.lang.String[] strArray39 = nullPropertyPointer35.getPropertyNames();
        java.lang.String str40 = nullPropertyPointer35.getPropertyName();
        org.apache.commons.jxpath.ri.QName qName41 = null;
        java.util.Locale locale43 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer44 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName41, (java.lang.Object) 0.0d, locale43);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest45 = null;
        boolean boolean46 = nodePointer44.testNode(nodeTest45);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer47 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer44);
        nullPropertyPointer47.printPointerChain();
        boolean boolean49 = nullPropertyPointer47.isActualProperty();
        boolean boolean50 = nullPropertyPointer47.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer51 = nullPropertyPointer47.getImmediateValuePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer52 = nullPropertyPointer47.getParent();
        boolean boolean53 = nullPropertyPointer47.isCollection();
        int int54 = nullPropertyPointer35.compareTo((java.lang.Object) nullPropertyPointer47);
        java.lang.String str55 = nullPropertyPointer35.getNamespaceURI();
        int int56 = nullPropertyPointer6.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer18, (org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nullPropertyPointer6 and nullPropertyPointer18", nullPropertyPointer6.equals(nullPropertyPointer18) ? nullPropertyPointer6.hashCode() == nullPropertyPointer18.hashCode() : true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = nodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer6 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        int int7 = nullPropertyPointer6.getPropertyIndex();
        int int8 = nullPropertyPointer6.getPropertyCount();
        nullPropertyPointer6.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver11 = nullPropertyPointer6.getNamespaceResolver();
        boolean boolean12 = nullPropertyPointer6.isRoot();
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName13, (java.lang.Object) 0.0d, locale15);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        boolean boolean18 = nodePointer16.testNode(nodeTest17);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer19 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer16);
        nullPropertyPointer19.printPointerChain();
        boolean boolean21 = nullPropertyPointer19.isCollection();
        java.lang.String str22 = nullPropertyPointer19.getPropertyName();
        java.lang.Object obj23 = nullPropertyPointer19.getBaseValue();
        java.lang.String[] strArray24 = nullPropertyPointer19.getPropertyNames();
        int int25 = nullPropertyPointer19.getLength();
        boolean boolean26 = nullPropertyPointer19.isActualProperty();
        org.apache.commons.jxpath.ri.QName qName27 = null;
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName27, (java.lang.Object) 0.0d, locale29);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest31 = null;
        boolean boolean32 = nodePointer30.testNode(nodeTest31);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer33 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer30);
        nullPropertyPointer33.printPointerChain();
        java.lang.Object obj35 = nullPropertyPointer33.getImmediateNode();
        boolean boolean36 = nullPropertyPointer33.isAttribute();
        boolean boolean37 = nullPropertyPointer33.isRoot();
        nullPropertyPointer33.setPropertyIndex((int) (short) 1);
        int int40 = nullPropertyPointer33.getPropertyCount();
        nullPropertyPointer33.setNameAttributeValue("<<unknown namespace>>");
        boolean boolean43 = nullPropertyPointer33.isNode();
        int int44 = nullPropertyPointer6.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer19, (org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nullPropertyPointer6 and nullPropertyPointer19", nullPropertyPointer6.equals(nullPropertyPointer19) ? nullPropertyPointer6.hashCode() == nullPropertyPointer19.hashCode() : true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = nodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer6 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        nullPropertyPointer6.printPointerChain();
        boolean boolean8 = nullPropertyPointer6.isActualProperty();
        java.util.Locale locale9 = nullPropertyPointer6.getLocale();
        org.apache.commons.jxpath.ri.QName qName10 = null;
        java.util.Locale locale12 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName10, (java.lang.Object) 0.0d, locale12);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        boolean boolean15 = nodePointer13.testNode(nodeTest14);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer16 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer13);
        nullPropertyPointer16.printPointerChain();
        boolean boolean18 = nullPropertyPointer16.isCollection();
        boolean boolean19 = nullPropertyPointer16.isContainer();
        java.lang.String[] strArray20 = nullPropertyPointer16.getPropertyNames();
        org.apache.commons.jxpath.ri.QName qName21 = null;
        java.util.Locale locale23 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer24 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName21, (java.lang.Object) 0.0d, locale23);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest25 = null;
        boolean boolean26 = nodePointer24.testNode(nodeTest25);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer27 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer24);
        nullPropertyPointer27.printPointerChain();
        java.lang.Object obj29 = nullPropertyPointer27.getNode();
        boolean boolean30 = nullPropertyPointer27.isActualProperty();
        nullPropertyPointer27.setNameAttributeValue("*");
        int int33 = nullPropertyPointer27.getLength();
        org.apache.commons.jxpath.ri.QName qName34 = null;
        java.util.Locale locale36 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName34, (java.lang.Object) 0.0d, locale36);
        org.apache.commons.jxpath.ri.QName qName38 = null;
        java.util.Locale locale40 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer41 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName38, (java.lang.Object) 0.0d, locale40);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest42 = null;
        boolean boolean43 = nodePointer41.testNode(nodeTest42);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer44 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer41);
        nullPropertyPointer44.printPointerChain();
        java.lang.Object obj46 = nullPropertyPointer44.getImmediateNode();
        boolean boolean47 = nullPropertyPointer44.isAttribute();
        boolean boolean48 = nullPropertyPointer44.isRoot();
        nullPropertyPointer44.setPropertyName("*");
        org.apache.commons.jxpath.ri.QName qName51 = nullPropertyPointer44.getName();
        org.apache.commons.jxpath.ri.QName qName52 = null;
        java.util.Locale locale54 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer55 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName52, (java.lang.Object) 0.0d, locale54);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest56 = null;
        boolean boolean57 = nodePointer55.testNode(nodeTest56);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer58 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer55);
        int int59 = nullPropertyPointer58.getPropertyIndex();
        boolean boolean60 = nullPropertyPointer58.isCollection();
        boolean boolean61 = nullPropertyPointer58.isCollection();
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer62 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer58);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer63 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer37, qName51, (java.lang.Object) nullPropertyPointer62);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator64 = nullPropertyPointer27.attributeIterator(qName51);
        java.lang.Object obj65 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer66 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer16, qName51, obj65);
        int int67 = nullPropertyPointer6.compareTo((java.lang.Object) nodePointer66);
        boolean boolean68 = nullPropertyPointer6.isLeaf();
        org.apache.commons.jxpath.ri.QName qName69 = null;
        java.util.Locale locale71 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer72 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName69, (java.lang.Object) 0.0d, locale71);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest73 = null;
        boolean boolean74 = nodePointer72.testNode(nodeTest73);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer75 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer72);
        int int76 = nullPropertyPointer75.getPropertyIndex();
        int int77 = nullPropertyPointer75.getPropertyCount();
        nullPropertyPointer75.setIndex((int) (byte) 0);
        nullPropertyPointer75.setPropertyName("0/@*");
        nullPropertyPointer75.setNameAttributeValue("*");
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer84 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer75);
        org.apache.commons.jxpath.ri.QName qName85 = null;
        java.util.Locale locale87 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer88 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName85, (java.lang.Object) 0.0d, locale87);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest89 = null;
        boolean boolean90 = nodePointer88.testNode(nodeTest89);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer91 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer88);
        nullPropertyPointer91.printPointerChain();
        boolean boolean93 = nullPropertyPointer91.isActualProperty();
        boolean boolean94 = nullPropertyPointer91.isNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer95 = nullPropertyPointer91.getImmediateValuePointer();
        boolean boolean96 = nullPropertyPointer91.isRoot();
        int int97 = nullPropertyPointer6.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer84, (org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer91);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nullPropertyPointer6 and nullPropertyPointer75", nullPropertyPointer6.equals(nullPropertyPointer75) ? nullPropertyPointer6.hashCode() == nullPropertyPointer75.hashCode() : true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = nodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer6 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        int int7 = nullPropertyPointer6.getPropertyIndex();
        nullPropertyPointer6.setPropertyIndex((int) ' ');
        org.apache.commons.jxpath.ri.QName qName10 = null;
        org.apache.commons.jxpath.ri.QName qName11 = null;
        java.util.Locale locale13 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName11, (java.lang.Object) 0.0d, locale13);
        java.lang.Object obj15 = nodePointer14.getNodeValue();
        java.lang.String str16 = nodePointer14.toString();
        java.lang.Object obj17 = nodePointer14.getNodeValue();
        nodePointer14.setIndex((int) (byte) 1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer21 = nodePointer14.namespacePointer("0");
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer22 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer6, qName10, (java.lang.Object) nodePointer14);
        boolean boolean23 = nodePointer22.isNode();
        java.lang.Object obj24 = nodePointer22.getNode();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator25 = nodePointer22.namespaceIterator();
        nodePointer22.setAttribute(false);
        boolean boolean28 = nodePointer22.isNode();
        org.apache.commons.jxpath.ri.QName qName29 = null;
        java.util.Locale locale31 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer32 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName29, (java.lang.Object) 0.0d, locale31);
        org.apache.commons.jxpath.ri.QName qName33 = null;
        java.util.Locale locale35 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer36 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName33, (java.lang.Object) 0.0d, locale35);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest37 = null;
        boolean boolean38 = nodePointer36.testNode(nodeTest37);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer39 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer36);
        nullPropertyPointer39.printPointerChain();
        java.lang.Object obj41 = nullPropertyPointer39.getImmediateNode();
        boolean boolean42 = nullPropertyPointer39.isAttribute();
        boolean boolean43 = nullPropertyPointer39.isRoot();
        nullPropertyPointer39.setPropertyName("*");
        org.apache.commons.jxpath.ri.QName qName46 = nullPropertyPointer39.getName();
        org.apache.commons.jxpath.ri.QName qName47 = null;
        java.util.Locale locale49 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer50 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName47, (java.lang.Object) 0.0d, locale49);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest51 = null;
        boolean boolean52 = nodePointer50.testNode(nodeTest51);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer53 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer50);
        int int54 = nullPropertyPointer53.getPropertyIndex();
        boolean boolean55 = nullPropertyPointer53.isCollection();
        boolean boolean56 = nullPropertyPointer53.isCollection();
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer57 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer53);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer58 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer32, qName46, (java.lang.Object) nullPropertyPointer57);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer60 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer(nodePointer22, qName46, (java.lang.Object) 0L);
        org.apache.commons.jxpath.ri.QName qName61 = null;
        java.util.Locale locale63 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer64 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName61, (java.lang.Object) 0.0d, locale63);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest65 = null;
        boolean boolean66 = nodePointer64.testNode(nodeTest65);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer67 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer64);
        nullPropertyPointer67.printPointerChain();
        java.lang.Object obj69 = nullPropertyPointer67.getNode();
        boolean boolean70 = nullPropertyPointer67.isActualProperty();
        nullPropertyPointer67.setNameAttributeValue("*");
        int int73 = nullPropertyPointer67.getLength();
        java.lang.Object obj74 = nullPropertyPointer67.getNodeValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer75 = nullPropertyPointer67.getImmediateValuePointer();
        java.util.Locale locale76 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer77 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName46, (java.lang.Object) nullPropertyPointer67, locale76);
        org.apache.commons.jxpath.ri.QName qName78 = null;
        java.util.Locale locale80 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer81 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName78, (java.lang.Object) 0.0d, locale80);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest82 = null;
        boolean boolean83 = nodePointer81.testNode(nodeTest82);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer84 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer81);
        int int85 = nullPropertyPointer84.getPropertyIndex();
        int int86 = nullPropertyPointer84.getPropertyCount();
        nullPropertyPointer84.setIndex((int) (byte) 0);
        boolean boolean89 = nullPropertyPointer84.isLeaf();
        boolean boolean90 = nullPropertyPointer84.isLeaf();
        java.lang.Object obj91 = nullPropertyPointer84.getImmediateNode();
        java.util.Locale locale92 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer93 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName46, (java.lang.Object) nullPropertyPointer84, locale92);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nullPropertyPointer6 and nullPropertyPointer84", nullPropertyPointer6.equals(nullPropertyPointer84) ? nullPropertyPointer6.hashCode() == nullPropertyPointer84.hashCode() : true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = nodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer6 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        int int7 = nullPropertyPointer6.getPropertyIndex();
        nullPropertyPointer6.setPropertyIndex((int) ' ');
        boolean boolean10 = nullPropertyPointer6.isContainer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver11 = nullPropertyPointer6.getNamespaceResolver();
        nullPropertyPointer6.setNameAttributeValue("0/*");
        nullPropertyPointer6.remove();
        java.lang.String str15 = nullPropertyPointer6.asPath();
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName16, (java.lang.Object) 0.0d, locale18);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        boolean boolean21 = nodePointer19.testNode(nodeTest20);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer22 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer19);
        nullPropertyPointer22.printPointerChain();
        java.lang.Object obj24 = nullPropertyPointer22.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName25 = null;
        org.apache.commons.jxpath.ri.QName qName26 = null;
        java.util.Locale locale28 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer29 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName26, (java.lang.Object) 0.0d, locale28);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest30 = null;
        boolean boolean31 = nodePointer29.testNode(nodeTest30);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer32 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer29);
        nullPropertyPointer32.printPointerChain();
        java.lang.String str34 = nullPropertyPointer32.getPropertyName();
        java.util.Locale locale35 = nullPropertyPointer32.getLocale();
        java.lang.Object obj36 = nullPropertyPointer32.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer37 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer22, qName25, obj36);
        nullPropertyPointer22.setNameAttributeValue("hi!");
        boolean boolean40 = nullPropertyPointer22.isActualProperty();
        boolean boolean41 = nullPropertyPointer22.isActualProperty();
        java.lang.Object obj42 = nullPropertyPointer22.getValue();
        org.apache.commons.jxpath.ri.QName qName43 = null;
        java.util.Locale locale45 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer46 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName43, (java.lang.Object) 0.0d, locale45);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest47 = null;
        boolean boolean48 = nodePointer46.testNode(nodeTest47);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer49 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer46);
        int int50 = nullPropertyPointer49.getPropertyIndex();
        int int51 = nullPropertyPointer49.getPropertyCount();
        nullPropertyPointer49.setIndex((int) (byte) 0);
        java.lang.String str54 = nullPropertyPointer49.toString();
        java.lang.String str55 = nullPropertyPointer49.toString();
        java.lang.Object obj56 = nullPropertyPointer49.getValue();
        boolean boolean57 = nullPropertyPointer49.isRoot();
        boolean boolean58 = nullPropertyPointer49.isContainer();
        java.lang.Object obj59 = nullPropertyPointer49.clone();
        int int60 = nullPropertyPointer6.compareChildNodePointers((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer22, (org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nullPropertyPointer32 and nullPropertyPointer49", nullPropertyPointer32.equals(nullPropertyPointer49) ? nullPropertyPointer32.hashCode() == nullPropertyPointer49.hashCode() : true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = nodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer6 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        int int7 = nullPropertyPointer6.getPropertyIndex();
        int int8 = nullPropertyPointer6.getPropertyCount();
        nullPropertyPointer6.setIndex((int) (byte) 0);
        java.lang.String str11 = nullPropertyPointer6.toString();
        java.lang.String str12 = nullPropertyPointer6.toString();
        java.lang.Object obj13 = nullPropertyPointer6.getValue();
        nullPropertyPointer6.setAttribute(true);
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName16, (java.lang.Object) 0.0d, locale18);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        boolean boolean21 = nodePointer19.testNode(nodeTest20);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer22 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer19);
        nullPropertyPointer22.printPointerChain();
        java.lang.String str24 = nullPropertyPointer22.getPropertyName();
        java.util.Locale locale25 = nullPropertyPointer22.getLocale();
        java.lang.Object obj26 = nullPropertyPointer22.getBaseValue();
        java.lang.String str27 = nullPropertyPointer22.asPath();
        java.lang.String str29 = nullPropertyPointer22.getNamespaceURI("0/*");
        nullPropertyPointer22.printPointerChain();
        org.apache.commons.jxpath.ri.QName qName31 = nullPropertyPointer22.getName();
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator32 = nullPropertyPointer6.attributeIterator(qName31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nullPropertyPointer6 and nullPropertyPointer22", nullPropertyPointer6.equals(nullPropertyPointer22) ? nullPropertyPointer6.hashCode() == nullPropertyPointer22.hashCode() : true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = nodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer6 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        int int7 = nullPropertyPointer6.getPropertyIndex();
        int int8 = nullPropertyPointer6.getPropertyCount();
        nullPropertyPointer6.setIndex((int) (byte) 0);
        boolean boolean11 = nullPropertyPointer6.isLeaf();
        boolean boolean12 = nullPropertyPointer6.isLeaf();
        java.lang.Object obj13 = nullPropertyPointer6.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName14 = null;
        java.util.Locale locale16 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName14, (java.lang.Object) 0.0d, locale16);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest18 = null;
        boolean boolean19 = nodePointer17.testNode(nodeTest18);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer20 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer17);
        boolean boolean21 = nullPropertyPointer20.isRoot();
        org.apache.commons.jxpath.ri.QName qName22 = nullPropertyPointer20.getName();
        java.lang.String str23 = nullPropertyPointer20.asPath();
        nullPropertyPointer20.setPropertyIndex(2147483647);
        nullPropertyPointer20.setPropertyIndex((-12));
        boolean boolean28 = nullPropertyPointer6.equals((java.lang.Object) nullPropertyPointer20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nullPropertyPointer6 and nullPropertyPointer20", nullPropertyPointer6.equals(nullPropertyPointer20) ? nullPropertyPointer6.hashCode() == nullPropertyPointer20.hashCode() : true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = nodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer6 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        int int7 = nullPropertyPointer6.getPropertyIndex();
        int int8 = nullPropertyPointer6.getPropertyCount();
        nullPropertyPointer6.setIndex((int) (byte) 0);
        nullPropertyPointer6.setPropertyName("0/@*");
        nullPropertyPointer6.setNameAttributeValue("*");
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer15 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer6);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer16 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer6);
        nullPropertyPointer6.remove();
        boolean boolean18 = nullPropertyPointer6.isActualProperty();
        org.apache.commons.jxpath.ri.QName qName19 = nullPropertyPointer6.getName();
        org.apache.commons.jxpath.ri.QName qName20 = null;
        java.util.Locale locale22 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer23 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName20, (java.lang.Object) 0.0d, locale22);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest24 = null;
        boolean boolean25 = nodePointer23.testNode(nodeTest24);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer26 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer23);
        nullPropertyPointer26.printPointerChain();
        java.lang.String str28 = nullPropertyPointer26.getPropertyName();
        java.lang.Object obj29 = nullPropertyPointer26.clone();
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer30 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer26);
        java.lang.String[] strArray31 = nullPropertyPointer30.getPropertyNames();
        nullPropertyPointer30.setPropertyIndex((int) (short) 1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer34 = nullPropertyPointer30.getImmediateParentPointer();
        boolean boolean35 = nullPropertyPointer30.isAttribute();
        boolean boolean36 = nullPropertyPointer6.equals((java.lang.Object) boolean35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nullPropertyPointer6 and nullPropertyPointer26", nullPropertyPointer6.equals(nullPropertyPointer26) ? nullPropertyPointer6.hashCode() == nullPropertyPointer26.hashCode() : true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = nodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer6 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        int int7 = nullPropertyPointer6.getPropertyIndex();
        int int8 = nullPropertyPointer6.getPropertyCount();
        nullPropertyPointer6.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver11 = nullPropertyPointer6.getNamespaceResolver();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = nullPropertyPointer6.getParent();
        java.lang.String str14 = nullPropertyPointer6.getNamespaceURI("0/*");
        org.apache.commons.jxpath.ri.QName qName15 = null;
        java.util.Locale locale17 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName15, (java.lang.Object) 0.0d, locale17);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest19 = null;
        boolean boolean20 = nodePointer18.testNode(nodeTest19);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer21 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer18);
        nullPropertyPointer21.printPointerChain();
        java.lang.String str23 = nullPropertyPointer21.getPropertyName();
        java.util.Locale locale24 = nullPropertyPointer21.getLocale();
        java.lang.Object obj25 = nullPropertyPointer21.getBaseValue();
        java.lang.String str26 = nullPropertyPointer21.asPath();
        java.lang.String str28 = nullPropertyPointer21.getNamespaceURI("0/*");
        boolean boolean29 = nullPropertyPointer21.isNode();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver30 = nullPropertyPointer21.getNamespaceResolver();
        boolean boolean31 = nullPropertyPointer6.equals((java.lang.Object) namespaceResolver30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nullPropertyPointer6 and nullPropertyPointer21", nullPropertyPointer6.equals(nullPropertyPointer21) ? nullPropertyPointer6.hashCode() == nullPropertyPointer21.hashCode() : true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = nodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer6 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        int int7 = nullPropertyPointer6.getPropertyIndex();
        int int8 = nullPropertyPointer6.getPropertyCount();
        nullPropertyPointer6.setIndex((int) (byte) 0);
        boolean boolean11 = nullPropertyPointer6.isLeaf();
        boolean boolean12 = nullPropertyPointer6.isLeaf();
        org.apache.commons.jxpath.ri.QName qName13 = null;
        java.util.Locale locale15 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName13, (java.lang.Object) 0.0d, locale15);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        boolean boolean18 = nodePointer16.testNode(nodeTest17);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer19 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer16);
        nullPropertyPointer19.printPointerChain();
        boolean boolean21 = nullPropertyPointer19.isCollection();
        boolean boolean22 = nullPropertyPointer19.isContainer();
        java.lang.String[] strArray23 = nullPropertyPointer19.getPropertyNames();
        java.lang.String str24 = nullPropertyPointer19.getPropertyName();
        java.lang.String str25 = nullPropertyPointer19.asPath();
        java.lang.Object obj26 = nullPropertyPointer19.getValue();
        org.apache.commons.jxpath.ri.QName qName27 = nullPropertyPointer19.getName();
        org.apache.commons.jxpath.ri.QName qName28 = null;
        java.util.Locale locale30 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer31 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName28, (java.lang.Object) 0.0d, locale30);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest32 = null;
        boolean boolean33 = nodePointer31.testNode(nodeTest32);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer34 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer31);
        int int35 = nullPropertyPointer34.getPropertyIndex();
        boolean boolean36 = nullPropertyPointer34.isCollection();
        org.apache.commons.jxpath.ri.QName qName37 = null;
        java.util.Locale locale39 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer40 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName37, (java.lang.Object) 0.0d, locale39);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest41 = null;
        boolean boolean42 = nodePointer40.testNode(nodeTest41);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer43 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer40);
        int int44 = nullPropertyPointer43.getPropertyIndex();
        nullPropertyPointer43.setPropertyIndex((int) ' ');
        boolean boolean47 = nullPropertyPointer43.isContainer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver48 = nullPropertyPointer43.getNamespaceResolver();
        nullPropertyPointer43.setNameAttributeValue("0/*");
        nullPropertyPointer43.remove();
        java.lang.String str52 = nullPropertyPointer43.asPath();
        boolean boolean53 = nullPropertyPointer34.equals((java.lang.Object) nullPropertyPointer43);
        boolean boolean54 = nullPropertyPointer43.isRoot();
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer55 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer43);
        boolean boolean56 = nullPropertyPointer43.isActualProperty();
        java.util.Locale locale57 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer58 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName27, (java.lang.Object) boolean56, locale57);
        org.apache.commons.jxpath.ri.model.NodeIterator nodeIterator59 = nullPropertyPointer6.attributeIterator(qName27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nullPropertyPointer6 and nullPropertyPointer19", nullPropertyPointer6.equals(nullPropertyPointer19) ? nullPropertyPointer6.hashCode() == nullPropertyPointer19.hashCode() : true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = nodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer6 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        nullPropertyPointer6.printPointerChain();
        boolean boolean8 = nullPropertyPointer6.isCollection();
        boolean boolean9 = nullPropertyPointer6.isContainer();
        java.lang.String[] strArray10 = nullPropertyPointer6.getPropertyNames();
        java.lang.String str11 = nullPropertyPointer6.getPropertyName();
        java.lang.String str12 = nullPropertyPointer6.asPath();
        java.lang.Object obj13 = nullPropertyPointer6.getValue();
        org.apache.commons.jxpath.ri.QName qName14 = nullPropertyPointer6.getName();
        nullPropertyPointer6.setIndex(0);
        org.apache.commons.jxpath.ri.QName qName17 = null;
        java.util.Locale locale19 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName17, (java.lang.Object) 0.0d, locale19);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest21 = null;
        boolean boolean22 = nodePointer20.testNode(nodeTest21);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer23 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer20);
        nullPropertyPointer23.printPointerChain();
        java.lang.Object obj25 = nullPropertyPointer23.getImmediateNode();
        org.apache.commons.jxpath.ri.QName qName26 = null;
        org.apache.commons.jxpath.ri.QName qName27 = null;
        java.util.Locale locale29 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer30 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName27, (java.lang.Object) 0.0d, locale29);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest31 = null;
        boolean boolean32 = nodePointer30.testNode(nodeTest31);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer33 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer30);
        nullPropertyPointer33.printPointerChain();
        java.lang.String str35 = nullPropertyPointer33.getPropertyName();
        java.util.Locale locale36 = nullPropertyPointer33.getLocale();
        java.lang.Object obj37 = nullPropertyPointer33.getBaseValue();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer38 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer23, qName26, obj37);
        nullPropertyPointer23.setNameAttributeValue("hi!");
        org.apache.commons.jxpath.ri.QName qName41 = null;
        java.util.Locale locale43 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer44 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName41, (java.lang.Object) 0.0d, locale43);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest45 = null;
        boolean boolean46 = nodePointer44.testNode(nodeTest45);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer47 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer44);
        nullPropertyPointer47.printPointerChain();
        java.lang.String str49 = nullPropertyPointer47.getPropertyName();
        java.lang.Object obj50 = nullPropertyPointer47.clone();
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer51 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer47);
        nullPropertyPointer47.setNameAttributeValue("*");
        org.apache.commons.jxpath.ri.QName qName54 = nullPropertyPointer47.getName();
        org.apache.commons.jxpath.ri.QName qName55 = null;
        java.util.Locale locale57 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer58 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName55, (java.lang.Object) 0.0d, locale57);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest59 = null;
        boolean boolean60 = nodePointer58.testNode(nodeTest59);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer61 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer58);
        int int62 = nullPropertyPointer61.getPropertyIndex();
        nullPropertyPointer61.setPropertyIndex((int) ' ');
        boolean boolean65 = nullPropertyPointer61.isContainer();
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver66 = nullPropertyPointer61.getNamespaceResolver();
        int int67 = nullPropertyPointer61.getPropertyCount();
        org.apache.commons.jxpath.ri.QName qName68 = null;
        java.util.Locale locale70 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer71 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName68, (java.lang.Object) 0.0d, locale70);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest72 = null;
        boolean boolean73 = nodePointer71.testNode(nodeTest72);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer74 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer71);
        int int75 = nullPropertyPointer74.getPropertyIndex();
        nullPropertyPointer74.setPropertyIndex((int) ' ');
        java.lang.String str78 = nullPropertyPointer74.getNamespaceURI();
        boolean boolean79 = nullPropertyPointer61.equals((java.lang.Object) str78);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer80 = org.apache.commons.jxpath.ri.model.NodePointer.newChildNodePointer((org.apache.commons.jxpath.ri.model.NodePointer) nullPropertyPointer23, qName54, (java.lang.Object) str78);
        int int81 = nullPropertyPointer6.compareTo((java.lang.Object) nullPropertyPointer23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nullPropertyPointer6 and nullPropertyPointer33", nullPropertyPointer6.equals(nullPropertyPointer33) ? nullPropertyPointer6.hashCode() == nullPropertyPointer33.hashCode() : true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.commons.jxpath.ri.QName qName0 = null;
        java.util.Locale locale2 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName0, (java.lang.Object) 0.0d, locale2);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        boolean boolean5 = nodePointer3.testNode(nodeTest4);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer6 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer3);
        nullPropertyPointer6.printPointerChain();
        java.lang.Object obj8 = nullPropertyPointer6.getNode();
        boolean boolean9 = nullPropertyPointer6.isActualProperty();
        nullPropertyPointer6.setNameAttributeValue("*");
        int int12 = nullPropertyPointer6.getLength();
        java.lang.Object obj13 = nullPropertyPointer6.getNodeValue();
        int int14 = nullPropertyPointer6.getPropertyCount();
        boolean boolean15 = nullPropertyPointer6.isActualProperty();
        org.apache.commons.jxpath.ri.QName qName16 = null;
        java.util.Locale locale18 = null;
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer19 = org.apache.commons.jxpath.ri.model.NodePointer.newNodePointer(qName16, (java.lang.Object) 0.0d, locale18);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest20 = null;
        boolean boolean21 = nodePointer19.testNode(nodeTest20);
        org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer nullPropertyPointer22 = new org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer(nodePointer19);
        int int23 = nullPropertyPointer22.getPropertyIndex();
        int int24 = nullPropertyPointer22.getPropertyCount();
        nullPropertyPointer22.setIndex((int) (byte) 0);
        org.apache.commons.jxpath.ri.NamespaceResolver namespaceResolver27 = nullPropertyPointer22.getNamespaceResolver();
        java.lang.Object obj28 = nullPropertyPointer22.getBaseValue();
        boolean boolean29 = nullPropertyPointer6.equals((java.lang.Object) nullPropertyPointer22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on nullPropertyPointer6 and nullPropertyPointer22", nullPropertyPointer6.equals(nullPropertyPointer22) ? nullPropertyPointer6.hashCode() == nullPropertyPointer22.hashCode() : true);
    }
}

