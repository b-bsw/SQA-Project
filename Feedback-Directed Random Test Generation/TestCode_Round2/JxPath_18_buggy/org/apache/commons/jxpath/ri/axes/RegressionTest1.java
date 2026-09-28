package org.apache.commons.jxpath.ri.axes;

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
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getContextNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        java.lang.String str9 = attributeContext2.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
        org.junit.Assert.assertNull(nodePointer10);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getCurrentPosition();
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        boolean boolean6 = attributeContext2.nextNode();
        java.util.List list7 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = attributeContext9.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext11 = attributeContext9.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(nodePointer10);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        boolean boolean10 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer11 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = attributeContext11.getCurrentNodePointer();
        attributeContext11.reset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = attributeContext11.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nodePointer12);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        java.lang.String str10 = attributeContext2.toString();
        boolean boolean12 = attributeContext2.setPosition((int) 'a');
        int int13 = attributeContext2.getDocumentOrder();
        int int14 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = attributeContext2.getCurrentNodePointer();
        int int16 = attributeContext2.getPosition();
        java.lang.Class<?> wildcardClass17 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNull(nodePointer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        int int8 = attributeContext2.getCurrentPosition();
        java.lang.String str9 = attributeContext2.toString();
        boolean boolean10 = attributeContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext11 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext7 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest6);
        boolean boolean8 = attributeContext7.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext9 = attributeContext7.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        int int6 = attributeContext2.getDocumentOrder();
        attributeContext2.reset();
        java.util.List list8 = attributeContext2.getContextNodeList();
        java.util.List list9 = attributeContext2.getContextNodeList();
        java.lang.String str10 = attributeContext2.toString();
        java.util.List list11 = attributeContext2.getContextNodeList();
        java.lang.Class<?> wildcardClass12 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getPosition();
        boolean boolean9 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer10 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        boolean boolean8 = attributeContext2.setPosition((int) 'a');
        org.apache.commons.jxpath.Pointer pointer9 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(pointer9);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest11);
        org.apache.commons.jxpath.Pointer pointer13 = attributeContext2.getContextNodePointer();
        int int14 = attributeContext2.getPosition();
        int int15 = attributeContext2.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(pointer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext5 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        attributeContext2.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = attributeContext2.getCurrentNodePointer();
        int int6 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        java.util.List list8 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer9 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer10 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(pointer9);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        java.util.List list9 = attributeContext2.getContextNodeList();
        boolean boolean11 = attributeContext2.setPosition(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet12 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        boolean boolean10 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        int int9 = attributeContext2.getCurrentPosition();
        java.lang.String str10 = attributeContext2.toString();
        boolean boolean11 = attributeContext2.nextNode();
        boolean boolean12 = attributeContext2.isChildOrderingRequired();
        int int13 = attributeContext2.getPosition();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        int int6 = attributeContext2.getDocumentOrder();
        attributeContext2.reset();
        java.util.List list8 = attributeContext2.getContextNodeList();
        java.util.List list9 = attributeContext2.getContextNodeList();
        java.lang.String str10 = attributeContext2.toString();
        int int11 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest12);
        // The following exception was thrown during execution in test generation
        try {
            attributeContext13.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        attributeContext4.reset();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext4.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet7 = attributeContext4.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pointer6);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        boolean boolean8 = attributeContext2.setPosition((int) 'a');
        org.apache.commons.jxpath.Pointer pointer9 = attributeContext2.getContextNodePointer();
        java.util.List list10 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer11 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(pointer9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        boolean boolean10 = attributeContext2.nextNode();
        int int11 = attributeContext2.getPosition();
        int int12 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest10);
        boolean boolean12 = attributeContext9.nextNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext9.getCurrentNodePointer();
        int int14 = attributeContext9.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet15 = attributeContext9.getNodeSet();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = attributeContext2.getCurrentNodePointer();
        int int12 = attributeContext2.getDocumentOrder();
        int int13 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = attributeContext2.getCurrentNodePointer();
        boolean boolean15 = attributeContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer17 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(nodePointer16);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest12);
        boolean boolean15 = attributeContext13.setPosition((-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = attributeContext13.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        boolean boolean10 = attributeContext2.nextNode();
        boolean boolean11 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext9.reset();
        int int11 = attributeContext9.getDocumentOrder();
        java.lang.Class<?> wildcardClass12 = attributeContext9.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        boolean boolean10 = attributeContext2.setPosition(1);
        int int11 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        attributeContext2.reset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        int int6 = attributeContext2.getDocumentOrder();
        attributeContext2.reset();
        java.util.List list8 = attributeContext2.getContextNodeList();
        java.util.List list9 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet12 = attributeContext11.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        boolean boolean10 = attributeContext2.setPosition(1);
        int int11 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest12);
        int int14 = attributeContext2.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext15 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        java.util.List list9 = attributeContext2.getContextNodeList();
        boolean boolean11 = attributeContext2.setPosition(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext12 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest11);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext12.getCurrentNodePointer();
        int int14 = attributeContext12.getDocumentOrder();
        boolean boolean15 = attributeContext12.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet16 = attributeContext12.getNodeSet();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        int int5 = attributeContext2.getPosition();
        boolean boolean7 = attributeContext2.setPosition((int) '4');
        boolean boolean8 = attributeContext2.nextNode();
        java.util.List list9 = attributeContext2.getContextNodeList();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext6 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest5);
        boolean boolean7 = attributeContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        int int5 = attributeContext2.getPosition();
        java.lang.String str6 = attributeContext2.toString();
        int int7 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Empty expression context" + "'", str6, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        boolean boolean6 = attributeContext2.nextNode();
        java.util.List list7 = attributeContext2.getContextNodeList();
        int int8 = attributeContext2.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        boolean boolean8 = attributeContext2.setPosition((int) 'a');
        org.apache.commons.jxpath.Pointer pointer9 = attributeContext2.getContextNodePointer();
        java.util.List list10 = attributeContext2.getContextNodeList();
        int int11 = attributeContext2.getPosition();
        java.lang.String str12 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(pointer9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        int int6 = attributeContext2.getDocumentOrder();
        attributeContext2.reset();
        java.util.List list8 = attributeContext2.getContextNodeList();
        java.util.List list9 = attributeContext2.getContextNodeList();
        java.lang.String str10 = attributeContext2.toString();
        int int11 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        boolean boolean10 = attributeContext2.setPosition(1);
        int int11 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest12);
        java.util.List list14 = attributeContext13.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = attributeContext13.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest7);
        java.lang.String str9 = attributeContext2.toString();
        int int10 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.Pointer pointer11 = attributeContext2.getContextNodePointer();
        int int12 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(pointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        int int9 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext11 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(nodePointer10);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        boolean boolean8 = attributeContext2.setPosition((int) 'a');
        int int9 = attributeContext2.getCurrentPosition();
        boolean boolean10 = attributeContext2.nextNode();
        java.util.List list11 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext9.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest11);
        java.lang.String str13 = attributeContext9.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext14 = attributeContext9.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Empty expression context" + "'", str13, "Empty expression context");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getContextNodePointer();
        int int8 = attributeContext2.getCurrentPosition();
        attributeContext2.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        int int9 = attributeContext2.getCurrentPosition();
        java.lang.String str10 = attributeContext2.toString();
        boolean boolean11 = attributeContext2.nextNode();
        boolean boolean12 = attributeContext2.nextNode();
        boolean boolean13 = attributeContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer14 = attributeContext2.getContextNodePointer();
        java.lang.Class<?> wildcardClass15 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(pointer14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        int int10 = attributeContext2.getDocumentOrder();
        java.util.List list11 = attributeContext2.getContextNodeList();
        boolean boolean12 = attributeContext2.nextNode();
        int int13 = attributeContext2.getCurrentPosition();
        boolean boolean14 = attributeContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet15 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext5 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest4);
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext5.getContextNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext5, nodeTest7);
        java.util.List list9 = attributeContext8.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext10 = attributeContext8.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        org.apache.commons.jxpath.Pointer pointer10 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(pointer10);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        java.util.List list5 = attributeContext4.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext6 = attributeContext4.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        int int6 = attributeContext2.getDocumentOrder();
        attributeContext2.reset();
        java.util.List list8 = attributeContext2.getContextNodeList();
        java.util.List list9 = attributeContext2.getContextNodeList();
        java.lang.String str10 = attributeContext2.toString();
        java.util.List list11 = attributeContext2.getContextNodeList();
        attributeContext2.reset();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        int int5 = attributeContext2.getPosition();
        boolean boolean7 = attributeContext2.setPosition((int) '4');
        int int8 = attributeContext2.getPosition();
        java.lang.String str9 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        attributeContext4.reset();
        boolean boolean6 = attributeContext4.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext4.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext4.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attributeContext4.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertNull(nodePointer8);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer9 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer10 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertNull(pointer9);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        boolean boolean6 = attributeContext2.setPosition((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext7 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getPosition();
        int int9 = attributeContext2.getPosition();
        boolean boolean11 = attributeContext2.setPosition(1);
        boolean boolean12 = attributeContext2.nextNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext14 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = attributeContext14.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        int int9 = attributeContext2.getCurrentPosition();
        java.lang.String str10 = attributeContext2.toString();
        boolean boolean11 = attributeContext2.nextNode();
        java.lang.Class<?> wildcardClass12 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        int int13 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext15 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest14);
        boolean boolean17 = attributeContext2.setPosition((-1));
        boolean boolean18 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNull(pointer7);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        boolean boolean10 = attributeContext2.nextNode();
        int int11 = attributeContext2.getPosition();
        java.lang.String str12 = attributeContext2.toString();
        boolean boolean14 = attributeContext2.setPosition((int) (short) 1);
        int int15 = attributeContext2.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext16 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        int int8 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.Pointer pointer9 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet10 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(pointer9);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext6 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext7 = attributeContext6.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        boolean boolean7 = attributeContext2.nextNode();
        boolean boolean9 = attributeContext2.setPosition((-1));
        org.apache.commons.jxpath.Pointer pointer10 = attributeContext2.getContextNodePointer();
        boolean boolean12 = attributeContext2.setPosition((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet13 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        boolean boolean10 = attributeContext2.setPosition(1);
        int int11 = attributeContext2.getCurrentPosition();
        attributeContext2.reset();
        int int13 = attributeContext2.getDocumentOrder();
        attributeContext2.reset();
        java.util.List list15 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getPosition();
        int int8 = attributeContext2.getDocumentOrder();
        int int9 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext10 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext3 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        int int13 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext15 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest14);
        boolean boolean17 = attributeContext2.setPosition((-1));
        boolean boolean19 = attributeContext2.setPosition((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer20 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        int int6 = attributeContext2.getDocumentOrder();
        attributeContext2.reset();
        java.util.List list8 = attributeContext2.getContextNodeList();
        java.util.List list9 = attributeContext2.getContextNodeList();
        java.lang.String str10 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext11 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getPosition();
        int int9 = attributeContext2.getPosition();
        boolean boolean11 = attributeContext2.setPosition(1);
        boolean boolean12 = attributeContext2.nextNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext14 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest13);
        boolean boolean15 = attributeContext14.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = attributeContext14.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        java.util.List list7 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getContextNodePointer();
        int int8 = attributeContext2.getPosition();
        boolean boolean9 = attributeContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer10 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet7 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet9 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertNull(nodePointer8);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        int int6 = attributeContext2.getPosition();
        boolean boolean7 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext8 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest7);
        java.lang.String str9 = attributeContext2.toString();
        int int10 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.Pointer pointer11 = attributeContext2.getContextNodePointer();
        int int12 = attributeContext2.getPosition();
        attributeContext2.reset();
        int int14 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext15 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(pointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getPosition();
        java.lang.Class<?> wildcardClass9 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = attributeContext2.getCurrentNodePointer();
        int int6 = attributeContext2.getPosition();
        org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(pointer7);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = attributeContext2.getCurrentNodePointer();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertNull(nodePointer9);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        java.lang.String str10 = attributeContext9.toString();
        boolean boolean11 = attributeContext9.isChildOrderingRequired();
        boolean boolean12 = attributeContext9.isChildOrderingRequired();
        int int13 = attributeContext9.getPosition();
        attributeContext9.reset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = attributeContext9.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        boolean boolean8 = attributeContext2.setPosition((int) 'a');
        int int9 = attributeContext2.getCurrentPosition();
        boolean boolean10 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet11 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = attributeContext11.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getPosition();
        int int9 = attributeContext2.getPosition();
        boolean boolean11 = attributeContext2.setPosition(1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext12 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = attributeContext4.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext6 = attributeContext4.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer5);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        int int6 = attributeContext2.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext7 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getCurrentPosition();
        java.lang.Class<?> wildcardClass6 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = attributeContext2.getCurrentNodePointer();
        java.lang.String str15 = attributeContext2.toString();
        boolean boolean16 = attributeContext2.isChildOrderingRequired();
        java.lang.Class<?> wildcardClass17 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Empty expression context" + "'", str15, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getPosition();
        boolean boolean10 = attributeContext2.setPosition((int) (byte) 100);
        org.apache.commons.jxpath.Pointer pointer11 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer12 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(pointer11);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        boolean boolean7 = attributeContext2.setPosition((int) (byte) 100);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest7);
        // The following exception was thrown during execution in test generation
        try {
            attributeContext8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext5 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest4);
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext5.getContextNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext5, nodeTest7);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = attributeContext5.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNull(nodePointer9);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getPosition();
        boolean boolean10 = attributeContext2.setPosition((int) (byte) 100);
        java.lang.String str11 = attributeContext2.toString();
        boolean boolean13 = attributeContext2.setPosition((int) (short) -1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext15 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest14);
        int int16 = attributeContext15.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = attributeContext15.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Empty expression context" + "'", str11, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        int int10 = attributeContext2.getDocumentOrder();
        boolean boolean12 = attributeContext2.setPosition(10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext13 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = attributeContext2.getCurrentNodePointer();
        boolean boolean8 = attributeContext2.setPosition(100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext9 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNull(nodePointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getPosition();
        int int9 = attributeContext2.getPosition();
        boolean boolean11 = attributeContext2.setPosition(1);
        java.lang.String str12 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest11);
        // The following exception was thrown during execution in test generation
        try {
            attributeContext12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getPosition();
        int int9 = attributeContext2.getPosition();
        boolean boolean11 = attributeContext2.setPosition(1);
        boolean boolean12 = attributeContext2.nextNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext14 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet15 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.Pointer pointer10 = attributeContext2.getContextNodePointer();
        int int11 = attributeContext2.getPosition();
        java.lang.String str12 = attributeContext2.toString();
        int int13 = attributeContext2.getCurrentPosition();
        java.lang.Class<?> wildcardClass14 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        attributeContext4.reset();
        boolean boolean6 = attributeContext4.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext4.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext4.getCurrentNodePointer();
        int int9 = attributeContext4.getCurrentPosition();
        int int10 = attributeContext4.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = attributeContext4.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext9.reset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeContext9.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        java.util.List list9 = attributeContext2.getContextNodeList();
        boolean boolean10 = attributeContext2.nextNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = attributeContext12.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        boolean boolean10 = attributeContext9.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer11 = attributeContext9.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet12 = attributeContext9.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(pointer11);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = attributeContext2.getCurrentNodePointer();
        java.lang.String str15 = attributeContext2.toString();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext17 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext18 = attributeContext17.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Empty expression context" + "'", str15, "Empty expression context");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        int int9 = attributeContext2.getCurrentPosition();
        java.lang.String str10 = attributeContext2.toString();
        boolean boolean11 = attributeContext2.nextNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = attributeContext2.getCurrentNodePointer();
        boolean boolean13 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getPosition();
        boolean boolean10 = attributeContext2.setPosition((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        int int13 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext15 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest14);
        boolean boolean16 = attributeContext15.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer17 = attributeContext15.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.Pointer pointer10 = attributeContext9.getContextNodePointer();
        int int11 = attributeContext9.getPosition();
        int int12 = attributeContext9.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer13 = attributeContext9.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        boolean boolean7 = attributeContext2.nextNode();
        boolean boolean9 = attributeContext2.setPosition((-1));
        boolean boolean11 = attributeContext2.setPosition((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest7);
        org.apache.commons.jxpath.Pointer pointer9 = attributeContext8.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = attributeContext8.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(pointer9);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        java.lang.String str5 = attributeContext4.toString();
        boolean boolean6 = attributeContext4.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer7 = attributeContext4.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Empty expression context" + "'", str5, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        int int10 = attributeContext2.getDocumentOrder();
        boolean boolean12 = attributeContext2.setPosition(10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(nodePointer13);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext9.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest11);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext9.getCurrentNodePointer();
        boolean boolean14 = attributeContext9.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet15 = attributeContext9.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest7);
        boolean boolean10 = attributeContext8.setPosition((int) (short) -1);
        attributeContext8.reset();
        int int12 = attributeContext8.getCurrentPosition();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.Pointer pointer10 = attributeContext2.getContextNodePointer();
        int int11 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest12);
        boolean boolean15 = attributeContext2.setPosition((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet16 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getCurrentPosition();
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = attributeContext8.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        int int9 = attributeContext2.getDocumentOrder();
        boolean boolean11 = attributeContext2.setPosition((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet12 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        boolean boolean8 = attributeContext2.setPosition((int) 'a');
        int int9 = attributeContext2.getCurrentPosition();
        boolean boolean11 = attributeContext2.setPosition(100);
        boolean boolean12 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getPosition();
        int int9 = attributeContext2.getPosition();
        boolean boolean11 = attributeContext2.setPosition(1);
        boolean boolean12 = attributeContext2.nextNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext14 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest13);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext16 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(nodePointer15);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        java.util.List list9 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet10 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        boolean boolean10 = attributeContext2.nextNode();
        int int11 = attributeContext2.getPosition();
        int int12 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext14 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNull(nodePointer13);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        boolean boolean5 = attributeContext2.nextNode();
        attributeContext2.reset();
        boolean boolean7 = attributeContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        int int10 = attributeContext2.getDocumentOrder();
        java.util.List list11 = attributeContext2.getContextNodeList();
        boolean boolean12 = attributeContext2.nextNode();
        int int13 = attributeContext2.getCurrentPosition();
        java.util.List list14 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext15 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        boolean boolean7 = attributeContext2.nextNode();
        boolean boolean9 = attributeContext2.setPosition((-1));
        int int10 = attributeContext2.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        int int13 = attributeContext2.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = attributeContext2.getCurrentNodePointer();
        java.lang.String str15 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet16 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Empty expression context" + "'", str15, "Empty expression context");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getCurrentPosition();
        java.util.List list6 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext7 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getPosition();
        java.util.List list6 = attributeContext2.getContextNodeList();
        java.lang.String str7 = attributeContext2.toString();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet10 = attributeContext9.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Empty expression context" + "'", str7, "Empty expression context");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        boolean boolean10 = attributeContext2.nextNode();
        int int11 = attributeContext2.getPosition();
        java.lang.String str12 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        java.lang.String str6 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Empty expression context" + "'", str6, "Empty expression context");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        int int5 = attributeContext2.getCurrentPosition();
        boolean boolean7 = attributeContext2.setPosition(2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getPosition();
        boolean boolean10 = attributeContext2.setPosition((int) (byte) 100);
        java.lang.String str11 = attributeContext2.toString();
        boolean boolean13 = attributeContext2.setPosition((int) (short) -1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext15 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest14);
        int int16 = attributeContext15.getDocumentOrder();
        boolean boolean18 = attributeContext15.setPosition((int) (byte) 100);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Empty expression context" + "'", str11, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest12);
        java.util.List list14 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext15 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nodePointer11);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = attributeContext2.getCurrentNodePointer();
        int int6 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getPosition();
        int int9 = attributeContext2.getPosition();
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        boolean boolean12 = attributeContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext13 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        java.util.List list9 = attributeContext2.getContextNodeList();
        boolean boolean11 = attributeContext2.setPosition(0);
        org.apache.commons.jxpath.Pointer pointer12 = attributeContext2.getContextNodePointer();
        boolean boolean13 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext14 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(pointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext9.reset();
        attributeContext9.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = attributeContext13.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest7);
        java.lang.String str9 = attributeContext2.toString();
        int int10 = attributeContext2.getPosition();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest10);
        boolean boolean12 = attributeContext9.nextNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext9.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext15 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest14);
        int int16 = attributeContext15.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = attributeContext15.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = attributeContext2.getCurrentNodePointer();
        int int6 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        java.util.List list9 = attributeContext2.getContextNodeList();
        int int10 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext11 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        int int6 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext7 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        int int5 = attributeContext2.getPosition();
        java.lang.String str6 = attributeContext2.toString();
        int int7 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Empty expression context" + "'", str6, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        java.util.List list8 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer9 = attributeContext2.getContextNodePointer();
        int int10 = attributeContext2.getPosition();
        java.lang.String str11 = attributeContext2.toString();
        org.apache.commons.jxpath.Pointer pointer12 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer13 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(pointer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Empty expression context" + "'", str11, "Empty expression context");
        org.junit.Assert.assertNull(pointer12);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        int int6 = attributeContext2.getDocumentOrder();
        java.util.List list7 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = attributeContext2.getCurrentNodePointer();
        boolean boolean8 = attributeContext2.setPosition(100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNull(nodePointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        int int10 = attributeContext2.getDocumentOrder();
        int int11 = attributeContext2.getPosition();
        int int12 = attributeContext2.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        int int10 = attributeContext2.getCurrentPosition();
        java.lang.String str11 = attributeContext2.toString();
        java.lang.Class<?> wildcardClass12 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Empty expression context" + "'", str11, "Empty expression context");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer3);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        int int10 = attributeContext2.getDocumentOrder();
        int int11 = attributeContext2.getPosition();
        int int12 = attributeContext2.getCurrentPosition();
        int int13 = attributeContext2.getPosition();
        java.util.List list14 = attributeContext2.getContextNodeList();
        int int15 = attributeContext2.getCurrentPosition();
        boolean boolean17 = attributeContext2.setPosition((int) 'a');
        boolean boolean18 = attributeContext2.nextNode();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        boolean boolean10 = attributeContext2.nextNode();
        int int11 = attributeContext2.getPosition();
        java.lang.String str12 = attributeContext2.toString();
        int int13 = attributeContext2.getPosition();
        boolean boolean15 = attributeContext2.setPosition((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        int int8 = attributeContext2.getCurrentPosition();
        java.util.List list9 = attributeContext2.getContextNodeList();
        java.util.List list10 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet11 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        java.lang.String str10 = attributeContext2.toString();
        boolean boolean12 = attributeContext2.setPosition((int) 'a');
        int int13 = attributeContext2.getDocumentOrder();
        int int14 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = attributeContext2.getCurrentNodePointer();
        int int16 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext17 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNull(nodePointer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getPosition();
        java.util.List list6 = attributeContext2.getContextNodeList();
        attributeContext2.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        boolean boolean10 = attributeContext2.setPosition(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        java.util.List list9 = attributeContext2.getContextNodeList();
        boolean boolean10 = attributeContext2.nextNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet6 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(pointer5);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        int int6 = attributeContext2.getDocumentOrder();
        attributeContext2.reset();
        java.util.List list8 = attributeContext2.getContextNodeList();
        java.util.List list9 = attributeContext2.getContextNodeList();
        java.lang.String str10 = attributeContext2.toString();
        int int11 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest12);
        java.lang.Class<?> wildcardClass14 = attributeContext13.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getPosition();
        java.util.List list6 = attributeContext2.getContextNodeList();
        java.lang.String str7 = attributeContext2.toString();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attributeContext9.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Empty expression context" + "'", str7, "Empty expression context");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        boolean boolean11 = attributeContext9.setPosition((int) (short) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = attributeContext9.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext14 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = attributeContext9.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(nodePointer12);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        int int13 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext15 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest14);
        boolean boolean17 = attributeContext2.setPosition((-1));
        java.lang.Class<?> wildcardClass18 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        boolean boolean7 = attributeContext2.nextNode();
        boolean boolean9 = attributeContext2.setPosition((-1));
        boolean boolean11 = attributeContext2.setPosition((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer12 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest10);
        int int12 = attributeContext11.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet13 = attributeContext11.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.Pointer pointer10 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = attributeContext2.getCurrentNodePointer();
        int int12 = attributeContext2.getPosition();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        int int10 = attributeContext2.getDocumentOrder();
        boolean boolean12 = attributeContext2.setPosition(10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext15 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = attributeContext15.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(nodePointer13);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        attributeContext2.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        boolean boolean10 = attributeContext2.nextNode();
        int int11 = attributeContext2.getPosition();
        java.lang.String str12 = attributeContext2.toString();
        int int13 = attributeContext2.getPosition();
        boolean boolean15 = attributeContext2.setPosition((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer16 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        int int10 = attributeContext2.getDocumentOrder();
        int int11 = attributeContext2.getPosition();
        int int12 = attributeContext2.getCurrentPosition();
        int int13 = attributeContext2.getPosition();
        java.util.List list14 = attributeContext2.getContextNodeList();
        boolean boolean15 = attributeContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        int int10 = attributeContext2.getDocumentOrder();
        int int11 = attributeContext2.getPosition();
        int int12 = attributeContext2.getCurrentPosition();
        int int13 = attributeContext2.getPosition();
        java.util.List list14 = attributeContext2.getContextNodeList();
        int int15 = attributeContext2.getCurrentPosition();
        boolean boolean17 = attributeContext2.setPosition((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        int int9 = attributeContext2.getCurrentPosition();
        java.lang.String str10 = attributeContext2.toString();
        boolean boolean11 = attributeContext2.nextNode();
        boolean boolean12 = attributeContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        int int5 = attributeContext2.getPosition();
        java.lang.String str6 = attributeContext2.toString();
        int int7 = attributeContext2.getPosition();
        int int8 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Empty expression context" + "'", str6, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(nodePointer9);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        int int13 = attributeContext2.getPosition();
        attributeContext2.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext15 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        boolean boolean8 = attributeContext2.setPosition((int) 'a');
        java.util.List list9 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext10 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        boolean boolean10 = attributeContext2.setPosition(1);
        int int11 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest12);
        java.lang.Class<?> wildcardClass14 = attributeContext13.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext9.reset();
        boolean boolean12 = attributeContext9.setPosition(10);
        // The following exception was thrown during execution in test generation
        try {
            attributeContext9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = attributeContext11.getCurrentNodePointer();
        java.lang.String str13 = attributeContext11.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = attributeContext11.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nodePointer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Empty expression context" + "'", str13, "Empty expression context");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest11);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext12.getCurrentNodePointer();
        int int14 = attributeContext12.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = attributeContext12.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        boolean boolean10 = attributeContext2.nextNode();
        int int11 = attributeContext2.getPosition();
        java.lang.String str12 = attributeContext2.toString();
        int int13 = attributeContext2.getCurrentPosition();
        boolean boolean14 = attributeContext2.nextNode();
        int int15 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer16 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext9 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertNull(nodePointer8);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = attributeContext11.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = nodePointer12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nodePointer12);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        java.util.List list7 = attributeContext2.getContextNodeList();
        java.util.List list8 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext5 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest4);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = attributeContext5.getCurrentNodePointer();
        java.util.List list7 = attributeContext5.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext8 = attributeContext5.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertNull(nodePointer6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        boolean boolean8 = attributeContext2.setPosition((int) 'a');
        java.util.List list9 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.Pointer pointer10 = attributeContext9.getContextNodePointer();
        int int11 = attributeContext9.getPosition();
        int int12 = attributeContext9.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet13 = attributeContext9.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = attributeContext2.getCurrentNodePointer();
        java.lang.String str15 = attributeContext2.toString();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext17 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Empty expression context" + "'", str15, "Empty expression context");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = attributeContext9.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext11 = attributeContext9.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer10);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        boolean boolean8 = attributeContext2.setPosition((int) 'a');
        int int9 = attributeContext2.getCurrentPosition();
        boolean boolean11 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest12);
        int int14 = attributeContext2.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        boolean boolean8 = attributeContext2.setPosition((int) 'a');
        int int9 = attributeContext2.getCurrentPosition();
        boolean boolean11 = attributeContext2.setPosition(100);
        boolean boolean12 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getPosition();
        boolean boolean10 = attributeContext2.setPosition((int) (byte) 100);
        boolean boolean12 = attributeContext2.setPosition((int) (byte) 1);
        attributeContext2.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext14 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        int int5 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        java.util.List list7 = attributeContext2.getContextNodeList();
        int int8 = attributeContext2.getDocumentOrder();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        boolean boolean10 = attributeContext2.setPosition(1);
        int int11 = attributeContext2.getCurrentPosition();
        int int12 = attributeContext2.getPosition();
        int int13 = attributeContext2.getDocumentOrder();
        int int14 = attributeContext2.getPosition();
        int int15 = attributeContext2.getPosition();
        java.util.List list16 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext17 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        attributeContext4.reset();
        boolean boolean6 = attributeContext4.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext4, nodeTest7);
        int int9 = attributeContext4.getDocumentOrder();
        boolean boolean11 = attributeContext4.setPosition((int) (short) 0);
        java.lang.Class<?> wildcardClass12 = attributeContext4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        int int13 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext15 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest14);
        boolean boolean17 = attributeContext2.setPosition((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet18 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        boolean boolean7 = attributeContext2.nextNode();
        boolean boolean9 = attributeContext2.setPosition((-1));
        boolean boolean11 = attributeContext2.setPosition((int) (short) 1);
        boolean boolean12 = attributeContext2.nextNode();
        int int13 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext14 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext5 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest4);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = attributeContext5.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeContext5.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertNull(nodePointer6);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        boolean boolean6 = attributeContext2.nextNode();
        java.util.List list7 = attributeContext2.getContextNodeList();
        boolean boolean9 = attributeContext2.setPosition((int) (byte) -1);
        boolean boolean10 = attributeContext2.isChildOrderingRequired();
        boolean boolean11 = attributeContext2.nextNode();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = attributeContext2.getCurrentNodePointer();
        int int12 = attributeContext2.getDocumentOrder();
        int int13 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(nodePointer14);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext2.getCurrentNodePointer();
        attributeContext2.reset();
        java.lang.String str15 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Empty expression context" + "'", str15, "Empty expression context");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        java.util.List list9 = attributeContext2.getContextNodeList();
        boolean boolean10 = attributeContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer11 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        int int10 = attributeContext9.getPosition();
        boolean boolean11 = attributeContext9.isChildOrderingRequired();
        int int12 = attributeContext9.getDocumentOrder();
        java.util.List list13 = attributeContext9.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet14 = attributeContext9.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        boolean boolean8 = attributeContext2.setPosition((int) 'a');
        org.apache.commons.jxpath.Pointer pointer9 = attributeContext2.getContextNodePointer();
        java.util.List list10 = attributeContext2.getContextNodeList();
        java.lang.Class<?> wildcardClass11 = list10.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(pointer9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = attributeContext2.getCurrentNodePointer();
        int int4 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext6 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(nodePointer5);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        boolean boolean10 = attributeContext9.nextNode();
        boolean boolean12 = attributeContext9.setPosition((int) (byte) 0);
        attributeContext9.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer14 = attributeContext9.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        int int5 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet6 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext5 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest4);
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext5.getContextNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext5, nodeTest7);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = attributeContext5.getCurrentNodePointer();
        boolean boolean10 = attributeContext5.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext11 = attributeContext5.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        int int9 = attributeContext2.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet10 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        int int5 = attributeContext2.getPosition();
        java.lang.String str6 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext7 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Empty expression context" + "'", str6, "Empty expression context");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        int int5 = attributeContext2.getDocumentOrder();
        java.util.List list6 = attributeContext2.getContextNodeList();
        boolean boolean7 = attributeContext2.nextNode();
        attributeContext2.reset();
        java.lang.String str9 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext10 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getPosition();
        boolean boolean10 = attributeContext2.setPosition((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        java.util.List list8 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer9 = attributeContext2.getContextNodePointer();
        int int10 = attributeContext2.getPosition();
        java.lang.String str11 = attributeContext2.toString();
        java.lang.String str12 = attributeContext2.toString();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(pointer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Empty expression context" + "'", str11, "Empty expression context");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        boolean boolean10 = attributeContext2.setPosition(1);
        int int11 = attributeContext2.getCurrentPosition();
        int int12 = attributeContext2.getPosition();
        int int13 = attributeContext2.getDocumentOrder();
        int int14 = attributeContext2.getPosition();
        int int15 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext16 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        boolean boolean8 = attributeContext2.setPosition((int) 'a');
        int int9 = attributeContext2.getCurrentPosition();
        boolean boolean11 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext5 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest4);
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext5.getContextNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext5, nodeTest7);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = attributeContext5.getCurrentNodePointer();
        int int10 = attributeContext5.getDocumentOrder();
        int int11 = attributeContext5.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        int int13 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext15 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest14);
        boolean boolean17 = attributeContext2.setPosition((-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        boolean boolean6 = attributeContext2.nextNode();
        java.util.List list7 = attributeContext2.getContextNodeList();
        int int8 = attributeContext2.getCurrentPosition();
        int int9 = attributeContext2.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        attributeContext4.reset();
        boolean boolean7 = attributeContext4.setPosition((int) (short) 10);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext4, nodeTest8);
        boolean boolean11 = attributeContext4.setPosition(0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        java.lang.String str6 = attributeContext2.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        boolean boolean11 = attributeContext9.setPosition((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer12 = attributeContext9.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Empty expression context" + "'", str6, "Empty expression context");
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        java.lang.String str10 = attributeContext2.toString();
        boolean boolean12 = attributeContext2.setPosition((int) 'a');
        java.lang.String str13 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Empty expression context" + "'", str13, "Empty expression context");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        int int10 = attributeContext9.getPosition();
        boolean boolean11 = attributeContext9.isChildOrderingRequired();
        int int12 = attributeContext9.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = attributeContext9.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        java.lang.String str10 = attributeContext9.toString();
        boolean boolean11 = attributeContext9.isChildOrderingRequired();
        boolean boolean12 = attributeContext9.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer13 = attributeContext9.getContextNodePointer();
        boolean boolean14 = attributeContext9.isChildOrderingRequired();
        boolean boolean15 = attributeContext9.nextNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext17 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest16);
        // The following exception was thrown during execution in test generation
        try {
            attributeContext17.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(pointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        boolean boolean10 = attributeContext2.nextNode();
        int int11 = attributeContext2.getPosition();
        java.lang.String str12 = attributeContext2.toString();
        int int13 = attributeContext2.getPosition();
        boolean boolean15 = attributeContext2.setPosition((int) (byte) 1);
        int int16 = attributeContext2.getCurrentPosition();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getPosition();
        boolean boolean10 = attributeContext2.setPosition((int) (byte) 100);
        boolean boolean12 = attributeContext2.setPosition((int) (byte) 1);
        boolean boolean13 = attributeContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = attributeContext2.getCurrentNodePointer();
        boolean boolean16 = attributeContext2.setPosition(100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        java.util.List list7 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer8 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        int int9 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(nodePointer10);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        boolean boolean10 = attributeContext2.nextNode();
        int int11 = attributeContext2.getPosition();
        java.lang.String str12 = attributeContext2.toString();
        int int13 = attributeContext2.getCurrentPosition();
        boolean boolean14 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        boolean boolean8 = attributeContext2.setPosition((int) 'a');
        org.apache.commons.jxpath.Pointer pointer9 = attributeContext2.getContextNodePointer();
        java.util.List list10 = attributeContext2.getContextNodeList();
        int int11 = attributeContext2.getPosition();
        java.lang.String str12 = attributeContext2.toString();
        java.util.List list13 = attributeContext2.getContextNodeList();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(pointer9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        int int10 = attributeContext2.getDocumentOrder();
        int int11 = attributeContext2.getPosition();
        int int12 = attributeContext2.getCurrentPosition();
        int int13 = attributeContext2.getPosition();
        java.util.List list14 = attributeContext2.getContextNodeList();
        boolean boolean15 = attributeContext2.isChildOrderingRequired();
        boolean boolean16 = attributeContext2.nextNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = attributeContext2.getCurrentNodePointer();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(nodePointer17);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(pointer6);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        int int9 = attributeContext2.getCurrentPosition();
        java.lang.String str10 = attributeContext2.toString();
        boolean boolean11 = attributeContext2.nextNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        int int5 = attributeContext2.getDocumentOrder();
        java.util.List list6 = attributeContext2.getContextNodeList();
        boolean boolean7 = attributeContext2.nextNode();
        int int8 = attributeContext2.getDocumentOrder();
        attributeContext2.reset();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        java.util.List list7 = attributeContext2.getContextNodeList();
        java.util.List list8 = attributeContext2.getContextNodeList();
        java.lang.Class<?> wildcardClass9 = list8.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        int int13 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext15 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest14);
        boolean boolean16 = attributeContext15.nextNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = attributeContext15.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = attributeContext15.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(nodePointer17);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        java.lang.String str10 = attributeContext9.toString();
        boolean boolean11 = attributeContext9.isChildOrderingRequired();
        boolean boolean12 = attributeContext9.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer13 = attributeContext9.getContextNodePointer();
        boolean boolean14 = attributeContext9.isChildOrderingRequired();
        boolean boolean15 = attributeContext9.nextNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext17 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet18 = attributeContext17.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(pointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        int int6 = attributeContext2.getDocumentOrder();
        java.util.List list7 = attributeContext2.getContextNodeList();
        boolean boolean9 = attributeContext2.setPosition((int) (byte) -1);
        java.lang.String str10 = attributeContext2.toString();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getPosition();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getCurrentPosition();
        int int8 = attributeContext2.getCurrentPosition();
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest10);
        boolean boolean13 = attributeContext2.setPosition(1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        int int5 = attributeContext2.getCurrentPosition();
        boolean boolean7 = attributeContext2.setPosition(2);
        boolean boolean8 = attributeContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        attributeContext4.reset();
        boolean boolean6 = attributeContext4.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext4, nodeTest7);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = attributeContext4.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet10 = attributeContext4.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(nodePointer9);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getCurrentPosition();
        java.util.List list6 = attributeContext2.getContextNodeList();
        java.util.List list7 = attributeContext2.getContextNodeList();
        java.lang.Class<?> wildcardClass8 = list7.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getPosition();
        boolean boolean8 = attributeContext2.isChildOrderingRequired();
        java.lang.Class<?> wildcardClass9 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        boolean boolean10 = attributeContext2.setPosition(1);
        int int11 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest12);
        java.lang.String str14 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Empty expression context" + "'", str14, "Empty expression context");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        int int9 = attributeContext2.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest7);
        boolean boolean10 = attributeContext8.setPosition((int) (short) -1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext8, nodeTest11);
        int int13 = attributeContext8.getCurrentPosition();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        int int10 = attributeContext2.getDocumentOrder();
        int int11 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer12 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext9.reset();
        java.util.List list11 = attributeContext9.getContextNodeList();
        java.lang.Class<?> wildcardClass12 = list11.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        java.util.List list8 = attributeContext2.getContextNodeList();
        java.util.List list9 = attributeContext2.getContextNodeList();
        java.lang.String str10 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext11 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        int int6 = attributeContext2.getDocumentOrder();
        attributeContext2.reset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getPosition();
        int int9 = attributeContext2.getDocumentOrder();
        java.lang.Class<?> wildcardClass10 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext8 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        int int6 = attributeContext2.getPosition();
        boolean boolean7 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        int int5 = attributeContext2.getPosition();
        boolean boolean6 = attributeContext2.nextNode();
        java.lang.Class<?> wildcardClass7 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet10 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        attributeContext4.reset();
        boolean boolean6 = attributeContext4.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext4, nodeTest7);
        int int9 = attributeContext4.getDocumentOrder();
        boolean boolean11 = attributeContext4.setPosition((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext12 = attributeContext4.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest10);
        boolean boolean13 = attributeContext11.setPosition((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer14 = attributeContext11.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        int int10 = attributeContext2.getDocumentOrder();
        boolean boolean11 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext12 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        boolean boolean7 = attributeContext2.setPosition((int) (short) 1);
        java.util.List list8 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(nodePointer9);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getPosition();
        int int9 = attributeContext2.getPosition();
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest11);
        java.util.List list13 = attributeContext12.getContextNodeList();
        int int14 = attributeContext12.getDocumentOrder();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        java.lang.String str5 = attributeContext4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet6 = attributeContext4.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Empty expression context" + "'", str5, "Empty expression context");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest11);
        int int13 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext14 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = attributeContext2.getCurrentNodePointer();
        int int12 = attributeContext2.getDocumentOrder();
        int int13 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = attributeContext2.getCurrentNodePointer();
        boolean boolean15 = attributeContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer16 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(pointer16);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        boolean boolean6 = attributeContext2.nextNode();
        attributeContext2.reset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = attributeContext2.getCurrentNodePointer();
        int int12 = attributeContext2.getDocumentOrder();
        int int13 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = attributeContext2.getCurrentNodePointer();
        boolean boolean15 = attributeContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer16 = attributeContext2.getContextNodePointer();
        int int17 = attributeContext2.getDocumentOrder();
        boolean boolean18 = attributeContext2.isChildOrderingRequired();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(pointer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = attributeContext2.getCurrentNodePointer();
        int int12 = attributeContext2.getDocumentOrder();
        int int13 = attributeContext2.getPosition();
        org.apache.commons.jxpath.Pointer pointer14 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext15 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(pointer14);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getPosition();
        int int8 = attributeContext2.getDocumentOrder();
        boolean boolean10 = attributeContext2.setPosition((int) (byte) 100);
        boolean boolean12 = attributeContext2.setPosition((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.Pointer pointer10 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet13 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertNull(nodePointer11);
        org.junit.Assert.assertNull(nodePointer12);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        java.util.List list8 = attributeContext2.getContextNodeList();
        boolean boolean9 = attributeContext2.nextNode();
        int int10 = attributeContext2.getDocumentOrder();
        int int11 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.Pointer pointer12 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer13 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(pointer12);
        org.junit.Assert.assertNull(pointer13);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        boolean boolean10 = attributeContext9.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = attributeContext9.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.Pointer pointer8 = attributeContext2.getContextNodePointer();
        boolean boolean9 = attributeContext2.nextNode();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(pointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        java.lang.String str10 = attributeContext2.toString();
        boolean boolean12 = attributeContext2.setPosition((int) 'a');
        java.lang.String str13 = attributeContext2.toString();
        java.lang.String str14 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Empty expression context" + "'", str13, "Empty expression context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Empty expression context" + "'", str14, "Empty expression context");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        boolean boolean10 = attributeContext2.setPosition(1);
        int int11 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.Pointer pointer12 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(pointer12);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = attributeContext9.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeContext9.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer10);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        boolean boolean7 = attributeContext2.isChildOrderingRequired();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        boolean boolean10 = attributeContext2.setPosition(1);
        int int11 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.Pointer pointer12 = attributeContext2.getContextNodePointer();
        boolean boolean13 = attributeContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(pointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        attributeContext4.reset();
        boolean boolean6 = attributeContext4.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext4, nodeTest7);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = attributeContext4.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = attributeContext4.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(nodePointer9);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest10);
        boolean boolean12 = attributeContext9.nextNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext9.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext15 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest14);
        int int16 = attributeContext15.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext15.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = attributeContext2.getCurrentNodePointer();
        int int6 = attributeContext2.getPosition();
        org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getContextNodePointer();
        int int8 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getPosition();
        boolean boolean10 = attributeContext2.setPosition((int) (byte) 100);
        boolean boolean12 = attributeContext2.setPosition((int) (byte) 1);
        boolean boolean13 = attributeContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet14 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        boolean boolean6 = attributeContext2.nextNode();
        java.util.List list7 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer11 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(nodePointer10);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = attributeContext11.getCurrentNodePointer();
        boolean boolean13 = attributeContext11.nextNode();
        java.lang.String str14 = attributeContext11.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet15 = attributeContext11.getNodeSet();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Empty expression context" + "'", str14, "Empty expression context");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        int int10 = attributeContext2.getDocumentOrder();
        java.util.List list11 = attributeContext2.getContextNodeList();
        boolean boolean12 = attributeContext2.nextNode();
        int int13 = attributeContext2.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        boolean boolean5 = attributeContext4.nextNode();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext4.getContextNodePointer();
        boolean boolean8 = attributeContext4.setPosition((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attributeContext4.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getCurrentPosition();
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest10);
        boolean boolean12 = attributeContext9.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext13 = attributeContext9.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        boolean boolean6 = attributeContext2.nextNode();
        java.util.List list7 = attributeContext2.getContextNodeList();
        int int8 = attributeContext2.getCurrentPosition();
        int int9 = attributeContext2.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = attributeContext2.getCurrentNodePointer();
        java.lang.String str15 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Empty expression context" + "'", str15, "Empty expression context");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        boolean boolean6 = attributeContext2.nextNode();
        java.util.List list7 = attributeContext2.getContextNodeList();
        boolean boolean9 = attributeContext2.setPosition((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        int int8 = attributeContext2.getCurrentPosition();
        boolean boolean10 = attributeContext2.setPosition((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet11 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        int int10 = attributeContext2.getDocumentOrder();
        int int11 = attributeContext2.getPosition();
        int int12 = attributeContext2.getCurrentPosition();
        java.util.List list13 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = attributeContext2.getCurrentNodePointer();
        java.util.List list15 = attributeContext2.getContextNodeList();
        java.lang.Class<?> wildcardClass16 = list15.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = attributeContext2.getCurrentNodePointer();
        boolean boolean8 = attributeContext2.setPosition((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNull(nodePointer5);
        org.junit.Assert.assertNull(nodePointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        int int10 = attributeContext2.getDocumentOrder();
        java.util.List list11 = attributeContext2.getContextNodeList();
        boolean boolean12 = attributeContext2.nextNode();
        int int13 = attributeContext2.getCurrentPosition();
        boolean boolean14 = attributeContext2.isChildOrderingRequired();
        boolean boolean16 = attributeContext2.setPosition((int) (short) 10);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest11);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext12.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = attributeContext12.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext15 = attributeContext12.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertNull(nodePointer14);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext5 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest4);
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext5.getContextNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext5, nodeTest7);
        java.util.List list9 = attributeContext8.getContextNodeList();
        int int10 = attributeContext8.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        boolean boolean7 = attributeContext2.setPosition((int) (short) 1);
        java.util.List list8 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext9 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        int int6 = attributeContext2.getDocumentOrder();
        attributeContext2.reset();
        java.util.List list8 = attributeContext2.getContextNodeList();
        java.util.List list9 = attributeContext2.getContextNodeList();
        java.lang.String str10 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest7);
        boolean boolean10 = attributeContext8.setPosition((int) (short) -1);
        attributeContext8.reset();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getContextNodePointer();
        boolean boolean8 = attributeContext2.nextNode();
        boolean boolean9 = attributeContext2.nextNode();
        org.apache.commons.jxpath.Pointer pointer10 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = pointer10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(pointer10);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        int int6 = attributeContext2.getDocumentOrder();
        java.lang.String str7 = attributeContext2.toString();
        int int8 = attributeContext2.getDocumentOrder();
        boolean boolean9 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Empty expression context" + "'", str7, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext13 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext5 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest4);
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext5.getContextNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext5, nodeTest7);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = attributeContext5.getCurrentNodePointer();
        int int10 = attributeContext5.getDocumentOrder();
        java.lang.Class<?> wildcardClass11 = attributeContext5.getClass();
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        int int9 = attributeContext2.getCurrentPosition();
        java.lang.String str10 = attributeContext2.toString();
        boolean boolean11 = attributeContext2.nextNode();
        boolean boolean12 = attributeContext2.nextNode();
        int int13 = attributeContext2.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext9.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet13 = attributeContext9.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = attributeContext4.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext5 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest4);
        java.util.List list6 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        int int10 = attributeContext2.getDocumentOrder();
        int int11 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        int int6 = attributeContext2.getDocumentOrder();
        java.util.List list7 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        int int9 = attributeContext2.getPosition();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        int int5 = attributeContext2.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        boolean boolean5 = attributeContext4.nextNode();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext4.getContextNodePointer();
        boolean boolean8 = attributeContext4.setPosition((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attributeContext4.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getContextNodePointer();
        boolean boolean8 = attributeContext2.nextNode();
        boolean boolean9 = attributeContext2.nextNode();
        boolean boolean10 = attributeContext2.nextNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer13 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        boolean boolean10 = attributeContext9.nextNode();
        int int11 = attributeContext9.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = attributeContext13.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        int int6 = attributeContext2.getDocumentOrder();
        attributeContext2.reset();
        java.util.List list8 = attributeContext2.getContextNodeList();
        java.util.List list9 = attributeContext2.getContextNodeList();
        java.lang.String str10 = attributeContext2.toString();
        int int11 = attributeContext2.getPosition();
        int int12 = attributeContext2.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest7);
        java.lang.String str9 = attributeContext2.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = attributeContext2.getCurrentNodePointer();
        java.lang.String str11 = attributeContext2.toString();
        boolean boolean13 = attributeContext2.setPosition((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet14 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
        org.junit.Assert.assertNull(nodePointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Empty expression context" + "'", str11, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest11);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext12.getCurrentNodePointer();
        int int14 = attributeContext12.getDocumentOrder();
        attributeContext12.reset();
        attributeContext12.reset();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        java.util.List list7 = attributeContext2.getContextNodeList();
        int int8 = attributeContext2.getDocumentOrder();
        boolean boolean10 = attributeContext2.setPosition((int) (short) 0);
        boolean boolean12 = attributeContext2.setPosition(1);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        boolean boolean10 = attributeContext2.setPosition(1);
        int int11 = attributeContext2.getCurrentPosition();
        int int12 = attributeContext2.getPosition();
        int int13 = attributeContext2.getDocumentOrder();
        int int14 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext15 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet7 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        int int9 = attributeContext2.getCurrentPosition();
        java.lang.String str10 = attributeContext2.toString();
        boolean boolean11 = attributeContext2.nextNode();
        boolean boolean12 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.Pointer pointer10 = attributeContext2.getContextNodePointer();
        int int11 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest12);
        boolean boolean15 = attributeContext2.setPosition((int) (short) 0);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(nodePointer16);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        int int10 = attributeContext2.getDocumentOrder();
        boolean boolean12 = attributeContext2.setPosition(10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(nodePointer13);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        boolean boolean10 = attributeContext9.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = attributeContext9.getValue();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        int int9 = attributeContext2.getDocumentOrder();
        boolean boolean11 = attributeContext2.setPosition((int) ' ');
        boolean boolean13 = attributeContext2.setPosition(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        boolean boolean7 = attributeContext2.setPosition((int) (short) 1);
        int int8 = attributeContext2.getDocumentOrder();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext5 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest4);
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext5.getContextNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext5, nodeTest7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer9 = attributeContext5.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertNull(pointer6);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext9.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest11);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext12.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = attributeContext12.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nodePointer13);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        boolean boolean8 = attributeContext2.setPosition((int) 'a');
        int int9 = attributeContext2.getCurrentPosition();
        boolean boolean11 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest12);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext15 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest14);
        boolean boolean16 = attributeContext15.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext17 = attributeContext15.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext9.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest11);
        java.lang.Class<?> wildcardClass13 = attributeContext9.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        boolean boolean7 = attributeContext2.nextNode();
        boolean boolean9 = attributeContext2.setPosition((-1));
        org.apache.commons.jxpath.Pointer pointer10 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext11 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(pointer10);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = attributeContext2.getCurrentNodePointer();
        java.lang.String str15 = attributeContext2.toString();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext17 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest16);
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Empty expression context" + "'", str15, "Empty expression context");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext9.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet11 = attributeContext9.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        boolean boolean11 = attributeContext9.setPosition((int) (short) -1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = attributeContext9.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext14 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer15 = attributeContext14.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(nodePointer12);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        int int5 = attributeContext2.getPosition();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(pointer6);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        boolean boolean5 = attributeContext2.isChildOrderingRequired();
        boolean boolean6 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        attributeContext4.reset();
        boolean boolean6 = attributeContext4.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext4, nodeTest7);
        int int9 = attributeContext8.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer10 = attributeContext8.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        java.util.List list8 = attributeContext2.getContextNodeList();
        boolean boolean9 = attributeContext2.nextNode();
        int int10 = attributeContext2.getDocumentOrder();
        int int11 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.Pointer pointer12 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(pointer12);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest7);
        java.lang.String str9 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        java.lang.String str10 = attributeContext2.toString();
        boolean boolean12 = attributeContext2.setPosition((int) 'a');
        int int13 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext14 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        java.util.List list8 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer9 = attributeContext2.getContextNodePointer();
        int int10 = attributeContext2.getPosition();
        java.lang.String str11 = attributeContext2.toString();
        org.apache.commons.jxpath.Pointer pointer12 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet13 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(pointer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Empty expression context" + "'", str11, "Empty expression context");
        org.junit.Assert.assertNull(pointer12);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        int int6 = attributeContext2.getDocumentOrder();
        attributeContext2.reset();
        java.util.List list8 = attributeContext2.getContextNodeList();
        java.util.List list9 = attributeContext2.getContextNodeList();
        java.lang.String str10 = attributeContext2.toString();
        java.util.List list11 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer12 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        java.lang.String str5 = attributeContext4.toString();
        java.util.List list6 = attributeContext4.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext4.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext4, nodeTest8);
        int int10 = attributeContext9.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = attributeContext9.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Empty expression context" + "'", str5, "Empty expression context");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        int int13 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext15 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext16 = attributeContext15.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = attributeContext11.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest11);
        int int13 = attributeContext2.getPosition();
        java.lang.Class<?> wildcardClass14 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext5 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest4);
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext5.getContextNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext5, nodeTest7);
        // The following exception was thrown during execution in test generation
        try {
            attributeContext8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertNull(pointer6);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest7);
        java.lang.String str9 = attributeContext8.toString();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        attributeContext4.reset();
        boolean boolean6 = attributeContext4.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext4, nodeTest7);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = attributeContext4.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = attributeContext4.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(nodePointer9);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        java.util.List list7 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer8 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(pointer8);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest7);
        boolean boolean9 = attributeContext2.nextNode();
        boolean boolean11 = attributeContext2.setPosition((int) 'a');
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getContextNodePointer();
        boolean boolean8 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean6 = attributeContext2.nextNode();
        java.lang.Class<?> wildcardClass7 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        boolean boolean6 = attributeContext2.nextNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext5 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest4);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = attributeContext5.getCurrentNodePointer();
        java.util.List list7 = attributeContext5.getContextNodeList();
        int int8 = attributeContext5.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet9 = attributeContext5.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertNull(nodePointer6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        boolean boolean10 = attributeContext9.nextNode();
        boolean boolean11 = attributeContext9.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet12 = attributeContext9.getNodeSet();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest11);
        boolean boolean13 = attributeContext12.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getContextNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        java.lang.String str9 = attributeContext2.toString();
        java.util.List list10 = attributeContext2.getContextNodeList();
        int int11 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest10);
        boolean boolean12 = attributeContext9.nextNode();
        attributeContext9.reset();
        java.lang.String str14 = attributeContext9.toString();
        boolean boolean16 = attributeContext9.setPosition((int) (short) 10);
        java.util.List list17 = attributeContext9.getContextNodeList();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Empty expression context" + "'", str14, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        int int9 = attributeContext2.getCurrentPosition();
        java.lang.String str10 = attributeContext2.toString();
        boolean boolean11 = attributeContext2.nextNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest12);
        boolean boolean15 = attributeContext13.setPosition((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = attributeContext13.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        boolean boolean10 = attributeContext2.nextNode();
        int int11 = attributeContext2.getPosition();
        java.lang.String str12 = attributeContext2.toString();
        int int13 = attributeContext2.getPosition();
        boolean boolean15 = attributeContext2.setPosition((int) (byte) 1);
        boolean boolean16 = attributeContext2.nextNode();
        boolean boolean17 = attributeContext2.nextNode();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getCurrentPosition();
        java.lang.String str6 = attributeContext2.toString();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Empty expression context" + "'", str6, "Empty expression context");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        java.lang.String str10 = attributeContext9.toString();
        int int11 = attributeContext9.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = attributeContext9.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertNull(nodePointer14);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        boolean boolean10 = attributeContext2.setPosition(1);
        int int11 = attributeContext2.getCurrentPosition();
        int int12 = attributeContext2.getPosition();
        int int13 = attributeContext2.getDocumentOrder();
        int int14 = attributeContext2.getPosition();
        int int15 = attributeContext2.getPosition();
        java.util.List list16 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer17 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        boolean boolean5 = attributeContext4.nextNode();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext4.getContextNodePointer();
        boolean boolean8 = attributeContext4.setPosition((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = attributeContext4.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        java.util.List list5 = attributeContext4.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer6 = attributeContext4.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        java.lang.String str5 = attributeContext4.toString();
        java.util.List list6 = attributeContext4.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext4.getCurrentNodePointer();
        boolean boolean8 = attributeContext4.nextNode();
        int int9 = attributeContext4.getDocumentOrder();
        boolean boolean11 = attributeContext4.setPosition((int) '#');
        attributeContext4.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext13 = attributeContext4.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Empty expression context" + "'", str5, "Empty expression context");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest7);
        boolean boolean10 = attributeContext8.setPosition((int) (short) -1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext8, nodeTest11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = attributeContext8.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest7);
        java.lang.String str9 = attributeContext2.toString();
        int int10 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.Pointer pointer11 = attributeContext2.getContextNodePointer();
        int int12 = attributeContext2.getPosition();
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext15 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext16 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(pointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = attributeContext2.getCurrentNodePointer();
        int int6 = attributeContext2.getPosition();
        boolean boolean7 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext8 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        int int6 = attributeContext2.getDocumentOrder();
        java.lang.String str7 = attributeContext2.toString();
        int int8 = attributeContext2.getDocumentOrder();
        boolean boolean9 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext10 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Empty expression context" + "'", str7, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        int int13 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext15 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest14);
        boolean boolean16 = attributeContext15.nextNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = attributeContext15.getCurrentNodePointer();
        int int18 = attributeContext15.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = attributeContext15.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(nodePointer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest11);
        boolean boolean13 = attributeContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer14 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext5 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        int int5 = attributeContext2.getDocumentOrder();
        java.util.List list6 = attributeContext2.getContextNodeList();
        boolean boolean7 = attributeContext2.nextNode();
        int int8 = attributeContext2.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getPosition();
        boolean boolean9 = attributeContext2.nextNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet12 = attributeContext11.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        boolean boolean7 = attributeContext2.setPosition((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        int int8 = attributeContext2.getCurrentPosition();
        java.util.List list9 = attributeContext2.getContextNodeList();
        boolean boolean10 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer11 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getContextNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        java.lang.String str9 = attributeContext2.toString();
        java.util.List list10 = attributeContext2.getContextNodeList();
        int int11 = attributeContext2.getPosition();
        java.lang.Class<?> wildcardClass12 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        java.util.List list9 = attributeContext2.getContextNodeList();
        boolean boolean11 = attributeContext2.setPosition(0);
        org.apache.commons.jxpath.Pointer pointer12 = attributeContext2.getContextNodePointer();
        java.util.List list13 = attributeContext2.getContextNodeList();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(pointer12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        boolean boolean10 = attributeContext2.setPosition((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext11 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        int int10 = attributeContext9.getPosition();
        boolean boolean11 = attributeContext9.isChildOrderingRequired();
        boolean boolean12 = attributeContext9.nextNode();
        java.lang.Class<?> wildcardClass13 = attributeContext9.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        int int10 = attributeContext2.getDocumentOrder();
        boolean boolean11 = attributeContext2.nextNode();
        boolean boolean12 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer13 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        java.lang.String str10 = attributeContext2.toString();
        boolean boolean12 = attributeContext2.setPosition((int) 'a');
        java.lang.String str13 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Empty expression context" + "'", str13, "Empty expression context");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getPosition();
        boolean boolean10 = attributeContext2.setPosition((int) (byte) 100);
        java.lang.String str11 = attributeContext2.toString();
        boolean boolean13 = attributeContext2.setPosition((int) (short) -1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext15 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest14);
        int int16 = attributeContext15.getDocumentOrder();
        java.util.List list17 = attributeContext15.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = attributeContext15.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Empty expression context" + "'", str11, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = attributeContext11.getCurrentNodePointer();
        attributeContext11.reset();
        int int14 = attributeContext11.getDocumentOrder();
        boolean boolean16 = attributeContext11.setPosition(3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = attributeContext11.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean6 = attributeContext2.isChildOrderingRequired();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        java.util.List list9 = attributeContext2.getContextNodeList();
        boolean boolean10 = attributeContext2.nextNode();
        int int11 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(nodePointer12);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        int int9 = attributeContext2.getCurrentPosition();
        java.lang.String str10 = attributeContext2.toString();
        boolean boolean11 = attributeContext2.nextNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest12);
        boolean boolean15 = attributeContext13.setPosition((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = attributeContext13.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        attributeContext4.reset();
        boolean boolean6 = attributeContext4.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext4, nodeTest7);
        int int9 = attributeContext8.getPosition();
        boolean boolean10 = attributeContext8.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        boolean boolean8 = attributeContext2.setPosition((int) 'a');
        org.apache.commons.jxpath.Pointer pointer9 = attributeContext2.getContextNodePointer();
        java.util.List list10 = attributeContext2.getContextNodeList();
        int int11 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(pointer9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        int int10 = attributeContext2.getDocumentOrder();
        boolean boolean12 = attributeContext2.setPosition(10);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext14 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        boolean boolean10 = attributeContext2.setPosition(1);
        int int11 = attributeContext2.getCurrentPosition();
        int int12 = attributeContext2.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        boolean boolean6 = attributeContext2.setPosition((int) (byte) 10);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest7);
        java.lang.String str9 = attributeContext8.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer10 = attributeContext8.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        java.lang.String str10 = attributeContext2.toString();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext2.getCurrentNodePointer();
        java.util.List list14 = attributeContext2.getContextNodeList();
        int int15 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        int int5 = attributeContext2.getPosition();
        boolean boolean7 = attributeContext2.setPosition((int) '4');
        java.util.List list8 = attributeContext2.getContextNodeList();
        java.lang.Class<?> wildcardClass9 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        int int13 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext15 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest14);
        boolean boolean17 = attributeContext2.setPosition((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getContextNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        attributeContext2.reset();
        int int10 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet11 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        java.lang.String str5 = attributeContext4.toString();
        java.util.List list6 = attributeContext4.getContextNodeList();
        int int7 = attributeContext4.getCurrentPosition();
        org.apache.commons.jxpath.Pointer pointer8 = attributeContext4.getContextNodePointer();
        int int9 = attributeContext4.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer10 = attributeContext4.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Empty expression context" + "'", str5, "Empty expression context");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(pointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getContextNodePointer();
        boolean boolean8 = attributeContext2.nextNode();
        boolean boolean9 = attributeContext2.nextNode();
        boolean boolean10 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet11 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        boolean boolean8 = attributeContext2.setPosition((int) 'a');
        int int9 = attributeContext2.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        boolean boolean6 = attributeContext2.nextNode();
        int int7 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext8 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        java.lang.String str10 = attributeContext9.toString();
        attributeContext9.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext12 = attributeContext9.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getPosition();
        boolean boolean10 = attributeContext2.setPosition((int) (byte) 100);
        java.lang.String str11 = attributeContext2.toString();
        boolean boolean12 = attributeContext2.isChildOrderingRequired();
        java.util.List list13 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext14 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Empty expression context" + "'", str11, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        java.util.List list8 = attributeContext2.getContextNodeList();
        boolean boolean9 = attributeContext2.isChildOrderingRequired();
        java.lang.Class<?> wildcardClass10 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest7);
        boolean boolean10 = attributeContext8.setPosition((int) (short) -1);
        java.lang.String str11 = attributeContext8.toString();
        boolean boolean12 = attributeContext8.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext13 = attributeContext8.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Empty expression context" + "'", str11, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        int int8 = attributeContext2.getCurrentPosition();
        java.lang.String str9 = attributeContext2.toString();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.lang.String str6 = attributeContext2.toString();
        boolean boolean8 = attributeContext2.setPosition(3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext9 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Empty expression context" + "'", str6, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        boolean boolean10 = attributeContext2.setPosition(1);
        int int11 = attributeContext2.getCurrentPosition();
        int int12 = attributeContext2.getPosition();
        boolean boolean13 = attributeContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        attributeContext4.reset();
        attributeContext4.reset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeContext4.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        attributeContext4.reset();
        boolean boolean6 = attributeContext4.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext4, nodeTest7);
        int int9 = attributeContext8.getPosition();
        boolean boolean10 = attributeContext8.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeContext8.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        int int10 = attributeContext2.getDocumentOrder();
        boolean boolean12 = attributeContext2.setPosition(10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext15 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet16 = attributeContext15.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(nodePointer13);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getPosition();
        int int9 = attributeContext2.getPosition();
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext12 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getPosition();
        int int9 = attributeContext2.getPosition();
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        java.lang.Class<?> wildcardClass12 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getPosition();
        int int9 = attributeContext2.getPosition();
        boolean boolean11 = attributeContext2.setPosition(1);
        boolean boolean12 = attributeContext2.nextNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext14 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest13);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(nodePointer15);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext5 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest4);
        boolean boolean7 = attributeContext2.setPosition(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        int int5 = attributeContext2.getDocumentOrder();
        java.util.List list6 = attributeContext2.getContextNodeList();
        attributeContext2.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = attributeContext2.getCurrentNodePointer();
        int int12 = attributeContext2.getDocumentOrder();
        int int13 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet14 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getPosition();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getCurrentPosition();
        int int8 = attributeContext2.getCurrentPosition();
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest10);
        java.lang.String str12 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.Pointer pointer10 = attributeContext2.getContextNodePointer();
        int int11 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest12);
        boolean boolean15 = attributeContext2.setPosition((int) (short) 0);
        int int16 = attributeContext2.getCurrentPosition();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        java.lang.String str5 = attributeContext4.toString();
        java.util.List list6 = attributeContext4.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext4.getCurrentNodePointer();
        int int8 = attributeContext4.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext9 = attributeContext4.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Empty expression context" + "'", str5, "Empty expression context");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        int int13 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext15 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest14);
        java.lang.Class<?> wildcardClass16 = attributeContext15.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest10);
        boolean boolean12 = attributeContext9.nextNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext9.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext15 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = attributeContext15.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(nodePointer13);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest10);
        boolean boolean12 = attributeContext9.nextNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext9.getCurrentNodePointer();
        java.lang.String str14 = attributeContext9.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext15 = attributeContext9.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Empty expression context" + "'", str14, "Empty expression context");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext5 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest4);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = attributeContext5.getCurrentNodePointer();
        java.util.List list7 = attributeContext5.getContextNodeList();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext5, nodeTest8);
        org.apache.commons.jxpath.Pointer pointer10 = attributeContext9.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext11 = attributeContext9.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertNull(nodePointer6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(pointer10);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        java.util.List list7 = attributeContext2.getContextNodeList();
        boolean boolean8 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer9 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        int int5 = attributeContext2.getPosition();
        boolean boolean7 = attributeContext2.setPosition((int) '4');
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        boolean boolean10 = attributeContext2.nextNode();
        int int11 = attributeContext2.getPosition();
        boolean boolean13 = attributeContext2.setPosition(2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        java.util.List list9 = attributeContext2.getContextNodeList();
        boolean boolean10 = attributeContext2.isChildOrderingRequired();
        int int11 = attributeContext2.getDocumentOrder();
        java.lang.Class<?> wildcardClass12 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        boolean boolean10 = attributeContext2.nextNode();
        int int11 = attributeContext2.getPosition();
        boolean boolean13 = attributeContext2.setPosition(2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext14 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        int int10 = attributeContext2.getDocumentOrder();
        boolean boolean11 = attributeContext2.nextNode();
        boolean boolean12 = attributeContext2.nextNode();
        attributeContext2.reset();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext10 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest9);
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer13 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = attributeContext2.getCurrentNodePointer();
        int int12 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext14 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest13);
        org.apache.commons.jxpath.Pointer pointer15 = attributeContext14.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer16 = attributeContext14.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer17 = attributeContext14.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(pointer15);
        org.junit.Assert.assertNull(pointer16);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        int int8 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.Pointer pointer9 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext10 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(pointer9);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        java.util.List list10 = attributeContext2.getContextNodeList();
        boolean boolean11 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext12 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.Pointer pointer10 = attributeContext2.getContextNodePointer();
        int int11 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet14 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getPosition();
        boolean boolean10 = attributeContext2.setPosition((int) (byte) 100);
        boolean boolean12 = attributeContext2.setPosition((int) (byte) 1);
        attributeContext2.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext14 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest7);
        boolean boolean9 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer10 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getPosition();
        boolean boolean10 = attributeContext2.setPosition((int) (byte) 100);
        boolean boolean12 = attributeContext2.setPosition((int) (byte) 1);
        boolean boolean13 = attributeContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(nodePointer14);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        int int5 = attributeContext2.getDocumentOrder();
        java.util.List list6 = attributeContext2.getContextNodeList();
        boolean boolean7 = attributeContext2.nextNode();
        attributeContext2.reset();
        attributeContext2.reset();
        int int10 = attributeContext2.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getPosition();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getCurrentPosition();
        int int8 = attributeContext2.getCurrentPosition();
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest10);
        java.lang.String str12 = attributeContext2.toString();
        attributeContext2.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet14 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        int int13 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext15 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest14);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext17 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext18 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        int int5 = attributeContext2.getDocumentOrder();
        int int6 = attributeContext2.getCurrentPosition();
        int int7 = attributeContext2.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext8 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        boolean boolean8 = attributeContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer9 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(pointer9);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest11);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext12.getCurrentNodePointer();
        int int14 = attributeContext12.getDocumentOrder();
        boolean boolean15 = attributeContext12.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = attributeContext12.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        java.util.List list8 = attributeContext2.getContextNodeList();
        boolean boolean9 = attributeContext2.nextNode();
        boolean boolean10 = attributeContext2.nextNode();
        attributeContext2.reset();
        java.lang.String str12 = attributeContext2.toString();
        int int13 = attributeContext2.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer14 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        boolean boolean7 = attributeContext2.setPosition((int) (short) 1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        int int9 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer10 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        boolean boolean8 = attributeContext2.setPosition((int) 'a');
        int int9 = attributeContext2.getCurrentPosition();
        boolean boolean11 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext14 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext2.getCurrentNodePointer();
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext16 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = attributeContext16.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(nodePointer13);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        boolean boolean10 = attributeContext2.nextNode();
        int int11 = attributeContext2.getPosition();
        int int12 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext2.getCurrentNodePointer();
        boolean boolean14 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attributeContext9.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNull(pointer7);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        attributeContext4.reset();
        boolean boolean6 = attributeContext4.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext4.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext4.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer9 = attributeContext4.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertNull(nodePointer8);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        int int10 = attributeContext2.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        int int10 = attributeContext2.getDocumentOrder();
        boolean boolean12 = attributeContext2.setPosition(10);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext14 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        int int13 = attributeContext2.getPosition();
        attributeContext2.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer15 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = attributeContext2.getCurrentNodePointer();
        boolean boolean8 = attributeContext2.setPosition((int) (short) 10);
        int int9 = attributeContext2.getCurrentPosition();
        java.lang.Class<?> wildcardClass10 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNull(nodePointer5);
        org.junit.Assert.assertNull(nodePointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        boolean boolean6 = attributeContext2.nextNode();
        attributeContext2.reset();
        boolean boolean9 = attributeContext2.setPosition((int) (byte) -1);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getPosition();
        boolean boolean10 = attributeContext2.setPosition((int) (byte) 100);
        boolean boolean12 = attributeContext2.setPosition((int) (byte) 1);
        boolean boolean13 = attributeContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer15 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext16 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertNull(pointer15);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getContextNodePointer();
        boolean boolean8 = attributeContext2.nextNode();
        boolean boolean9 = attributeContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(nodePointer10);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest11);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext12.getCurrentNodePointer();
        int int14 = attributeContext12.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = attributeContext12.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = attributeContext2.getCurrentNodePointer();
        int int4 = attributeContext2.getPosition();
        boolean boolean5 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.Pointer pointer10 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext14 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet15 = attributeContext14.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertNull(nodePointer11);
        org.junit.Assert.assertNull(nodePointer12);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        java.util.List list9 = attributeContext2.getContextNodeList();
        boolean boolean10 = attributeContext2.nextNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer13 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        int int10 = attributeContext9.getPosition();
        boolean boolean11 = attributeContext9.isChildOrderingRequired();
        int int12 = attributeContext9.getDocumentOrder();
        java.util.List list13 = attributeContext9.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = attributeContext9.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getContextNodePointer();
        attributeContext2.reset();
        attributeContext2.reset();
        java.lang.Class<?> wildcardClass10 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        java.lang.Class<?> wildcardClass5 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        boolean boolean10 = attributeContext2.setPosition(1);
        int int11 = attributeContext2.getCurrentPosition();
        int int12 = attributeContext2.getPosition();
        int int13 = attributeContext2.getDocumentOrder();
        int int14 = attributeContext2.getPosition();
        int int15 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = attributeContext2.getCurrentNodePointer();
        boolean boolean17 = attributeContext2.nextNode();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(nodePointer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest11);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext12.getCurrentNodePointer();
        int int14 = attributeContext12.getDocumentOrder();
        boolean boolean15 = attributeContext12.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        int int7 = attributeContext2.getDocumentOrder();
        attributeContext2.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet9 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        int int13 = attributeContext2.getPosition();
        attributeContext2.reset();
        boolean boolean15 = attributeContext2.isChildOrderingRequired();
        java.util.List list16 = attributeContext2.getContextNodeList();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest10);
        java.util.List list12 = attributeContext9.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer13 = attributeContext9.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        boolean boolean10 = attributeContext2.nextNode();
        int int11 = attributeContext2.getPosition();
        java.lang.String str12 = attributeContext2.toString();
        int int13 = attributeContext2.getPosition();
        boolean boolean15 = attributeContext2.setPosition((int) (byte) 1);
        boolean boolean16 = attributeContext2.nextNode();
        boolean boolean17 = attributeContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        int int13 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext15 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest14);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext17 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest16);
        int int18 = attributeContext17.getPosition();
        java.lang.Class<?> wildcardClass19 = attributeContext17.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        int int6 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer8 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(pointer7);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest7);
        java.lang.String str9 = attributeContext2.toString();
        int int10 = attributeContext2.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer11 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getPosition();
        int int9 = attributeContext2.getPosition();
        boolean boolean11 = attributeContext2.setPosition(1);
        attributeContext2.reset();
        boolean boolean14 = attributeContext2.setPosition(1);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        java.lang.String str10 = attributeContext9.toString();
        boolean boolean11 = attributeContext9.isChildOrderingRequired();
        boolean boolean12 = attributeContext9.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer13 = attributeContext9.getContextNodePointer();
        java.lang.String str14 = attributeContext9.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet15 = attributeContext9.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(pointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Empty expression context" + "'", str14, "Empty expression context");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getCurrentPosition();
        attributeContext2.reset();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext7 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        int int12 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext2.getCurrentNodePointer();
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext16 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(nodePointer13);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        int int10 = attributeContext2.getDocumentOrder();
        boolean boolean12 = attributeContext2.setPosition(10);
        attributeContext2.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext14 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        java.util.List list9 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer10 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        int int6 = attributeContext2.getDocumentOrder();
        java.lang.String str7 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext8 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Empty expression context" + "'", str7, "Empty expression context");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        int int10 = attributeContext2.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        int int8 = attributeContext2.getPosition();
        int int9 = attributeContext2.getPosition();
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest11);
        java.util.List list13 = attributeContext12.getContextNodeList();
        boolean boolean14 = attributeContext12.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = attributeContext12.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        boolean boolean6 = attributeContext2.nextNode();
        java.util.List list7 = attributeContext2.getContextNodeList();
        boolean boolean9 = attributeContext2.setPosition((int) (byte) -1);
        java.util.List list10 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = attributeContext2.getCurrentNodePointer();
        int int12 = attributeContext2.getDocumentOrder();
        java.util.List list13 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        boolean boolean6 = attributeContext2.setPosition((int) (short) 100);
        int int7 = attributeContext2.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        java.lang.String str10 = attributeContext2.toString();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        attributeContext2.reset();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest10);
        boolean boolean12 = attributeContext9.nextNode();
        attributeContext9.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext14 = attributeContext9.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        java.lang.String str10 = attributeContext9.toString();
        boolean boolean11 = attributeContext9.isChildOrderingRequired();
        boolean boolean12 = attributeContext9.isChildOrderingRequired();
        int int13 = attributeContext9.getPosition();
        attributeContext9.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext15 = attributeContext9.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        attributeContext9.reset();
        attributeContext9.reset();
        boolean boolean13 = attributeContext9.setPosition(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext14 = attributeContext9.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        java.util.List list9 = attributeContext2.getContextNodeList();
        boolean boolean10 = attributeContext2.nextNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest11);
        java.lang.Class<?> wildcardClass13 = attributeContext12.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getContextNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        attributeContext2.reset();
        java.lang.Class<?> wildcardClass10 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = attributeContext9.getCurrentNodePointer();
        java.util.List list11 = attributeContext9.getContextNodeList();
        java.lang.Class<?> wildcardClass12 = attributeContext9.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest11);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext12.getCurrentNodePointer();
        int int14 = attributeContext12.getDocumentOrder();
        org.apache.commons.jxpath.Pointer pointer15 = attributeContext12.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext12.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(pointer15);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getPosition();
        java.util.List list6 = attributeContext2.getContextNodeList();
        java.lang.String str7 = attributeContext2.toString();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        java.lang.String str10 = attributeContext9.toString();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Empty expression context" + "'", str7, "Empty expression context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
    }
}

