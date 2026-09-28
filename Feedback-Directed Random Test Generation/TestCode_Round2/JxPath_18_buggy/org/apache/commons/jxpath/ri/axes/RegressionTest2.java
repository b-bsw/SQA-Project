package org.apache.commons.jxpath.ri.axes;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = attributeContext9.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Empty expression context" + "'", str14, "Empty expression context");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
            org.apache.commons.jxpath.JXPathContext jXPathContext10 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer8 = attributeContext2.getContextNodePointer();
        attributeContext2.reset();
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
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertNull(pointer8);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext7 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest6);
        boolean boolean8 = attributeContext2.nextNode();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer8 = attributeContext2.getContextNodePointer();
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
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertNull(pointer8);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = attributeContext8.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeContext8.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(nodePointer10);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        attributeContext4.reset();
        boolean boolean7 = attributeContext4.setPosition((int) (short) 10);
        org.apache.commons.jxpath.Pointer pointer8 = attributeContext4.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = attributeContext4.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(pointer8);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext9.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = nodePointer13.getClass();
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
        org.junit.Assert.assertNull(nodePointer13);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        boolean boolean19 = attributeContext2.nextNode();
        org.apache.commons.jxpath.Pointer pointer20 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = attributeContext2.next();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(pointer20);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
            org.apache.commons.jxpath.NodeSet nodeSet10 = attributeContext9.getNodeSet();
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
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        int int5 = attributeContext2.getDocumentOrder();
        java.util.List list6 = attributeContext2.getContextNodeList();
        attributeContext2.reset();
        boolean boolean8 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext9 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
        attributeContext2.reset();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        boolean boolean11 = attributeContext8.setPosition((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer12 = attributeContext8.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean6 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext7 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        boolean boolean13 = attributeContext2.isChildOrderingRequired();
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
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(nodePointer12);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
        // The following exception was thrown during execution in test generation
        try {
            attributeContext11.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet12 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Empty expression context" + "'", str11, "Empty expression context");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
            java.lang.Object obj15 = attributeContext2.getValue();
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
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
            org.apache.commons.jxpath.Pointer pointer8 = attributeContext2.getSingleNodePointer();
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
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        int int5 = attributeContext2.getDocumentOrder();
        java.util.List list6 = attributeContext2.getContextNodeList();
        boolean boolean7 = attributeContext2.nextNode();
        int int8 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attributeContext2.nextSet();
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
        org.junit.Assert.assertNull(nodePointer9);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        java.util.List list7 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer8 = attributeContext2.getContextNodePointer();
        attributeContext2.reset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attributeContext2.nextSet();
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
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
            org.apache.commons.jxpath.Pointer pointer11 = attributeContext8.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        org.apache.commons.jxpath.Pointer pointer12 = attributeContext2.getContextNodePointer();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(pointer12);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        attributeContext2.reset();
        boolean boolean13 = attributeContext2.nextNode();
        java.lang.String str14 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer15 = attributeContext2.getSingleNodePointer();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Empty expression context" + "'", str14, "Empty expression context");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        org.junit.Assert.assertNull(nodePointer13);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        int int13 = attributeContext2.getDocumentOrder();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(pointer9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        int int11 = attributeContext2.getDocumentOrder();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        java.lang.String str14 = attributeContext2.toString();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(pointer12);
        org.junit.Assert.assertNull(pointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Empty expression context" + "'", str14, "Empty expression context");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        int int16 = attributeContext12.getPosition();
        boolean boolean17 = attributeContext12.nextNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = attributeContext12.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = attributeContext12.next();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(nodePointer18);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
            attributeContext12.remove();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
            boolean boolean15 = attributeContext12.nextSet();
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
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
            boolean boolean15 = attributeContext14.hasNext();
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
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
            org.apache.commons.jxpath.ri.axes.RootContext rootContext12 = attributeContext9.getRootContext();
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
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        int int14 = attributeContext2.getDocumentOrder();
        java.util.List list15 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer16 = attributeContext2.getSingleNodePointer();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        int int5 = attributeContext2.getCurrentPosition();
        boolean boolean7 = attributeContext2.setPosition(2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer8 = attributeContext2.getSingleNodePointer();
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
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        java.lang.String str15 = attributeContext2.toString();
        int int16 = attributeContext2.getCurrentPosition();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Empty expression context" + "'", str15, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        java.lang.String str15 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet16 = attributeContext2.getNodeSet();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Empty expression context" + "'", str15, "Empty expression context");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(pointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        attributeContext9.reset();
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
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        boolean boolean9 = attributeContext2.nextNode();
        attributeContext2.reset();
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
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
            java.lang.Object obj16 = attributeContext2.getValue();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        int int10 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.Pointer pointer11 = attributeContext2.getContextNodePointer();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNull(pointer11);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext2.getCurrentNodePointer();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(nodePointer13);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        int int12 = attributeContext2.getDocumentOrder();
        java.lang.Class<?> wildcardClass13 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Empty expression context" + "'", str11, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        int int12 = attributeContext2.getCurrentPosition();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Empty expression context" + "'", str11, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        org.junit.Assert.assertNull(pointer13);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = attributeContext9.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertNull(nodePointer6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
        attributeContext2.reset();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(pointer13);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = attributeContext9.next();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
            org.apache.commons.jxpath.ri.axes.RootContext rootContext18 = attributeContext2.getRootContext();
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
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        boolean boolean6 = attributeContext2.setPosition((int) (byte) 10);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer9 = attributeContext8.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        java.lang.String str6 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet7 = attributeContext2.getNodeSet();
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
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
            java.lang.Class<?> wildcardClass10 = nodePointer9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        int int14 = attributeContext9.getCurrentPosition();
        java.lang.String str15 = attributeContext9.toString();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Empty expression context" + "'", str15, "Empty expression context");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
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
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        org.apache.commons.jxpath.Pointer pointer11 = attributeContext8.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer12 = attributeContext8.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(pointer11);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer8 = attributeContext2.getContextNodePointer();
        attributeContext2.reset();
        java.lang.Class<?> wildcardClass10 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertNull(pointer8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
            org.apache.commons.jxpath.Pointer pointer14 = attributeContext9.getSingleNodePointer();
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
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Empty expression context" + "'", str14, "Empty expression context");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
        int int15 = attributeContext12.getDocumentOrder();
        int int16 = attributeContext12.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer17 = attributeContext12.getSingleNodePointer();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        boolean boolean12 = attributeContext2.setPosition((int) '4');
        int int13 = attributeContext2.getPosition();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getContextNodePointer();
        int int8 = attributeContext2.getCurrentPosition();
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
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getCurrentPosition();
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest7);
        int int9 = attributeContext2.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        boolean boolean6 = attributeContext2.setPosition((int) (byte) 10);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attributeContext8.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        int int10 = attributeContext2.getDocumentOrder();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        org.junit.Assert.assertNull(pointer10);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
        int int11 = attributeContext2.getDocumentOrder();
        java.lang.Class<?> wildcardClass12 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        boolean boolean6 = attributeContext2.setPosition((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        java.util.List list7 = attributeContext2.getContextNodeList();
        int int8 = attributeContext2.getDocumentOrder();
        attributeContext2.reset();
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
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        int int13 = attributeContext12.getPosition();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        int int13 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = attributeContext2.getValue();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
            org.apache.commons.jxpath.Pointer pointer9 = attributeContext4.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        org.junit.Assert.assertNull(pointer10);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        java.lang.String str5 = attributeContext4.toString();
        java.util.List list6 = attributeContext4.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext4.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attributeContext4.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Empty expression context" + "'", str5, "Empty expression context");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        int int5 = attributeContext2.getPosition();
        boolean boolean6 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        boolean boolean8 = attributeContext2.isChildOrderingRequired();
        java.lang.String str9 = attributeContext2.toString();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest10);
        java.lang.String str12 = attributeContext2.toString();
        java.lang.Class<?> wildcardClass13 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext6 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer7 = attributeContext6.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        int int12 = attributeContext2.getDocumentOrder();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Empty expression context" + "'", str11, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
        boolean boolean14 = attributeContext9.setPosition(100);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
            org.apache.commons.jxpath.NodeSet nodeSet14 = attributeContext2.getNodeSet();
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
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        java.lang.Class<?> wildcardClass15 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
            org.apache.commons.jxpath.NodeSet nodeSet14 = attributeContext13.getNodeSet();
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
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        org.apache.commons.jxpath.Pointer pointer12 = attributeContext9.getContextNodePointer();
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
        org.junit.Assert.assertNull(pointer12);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
            boolean boolean11 = attributeContext2.nextSet();
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
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        boolean boolean7 = attributeContext2.setPosition((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet8 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        boolean boolean12 = attributeContext8.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext13 = attributeContext8.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
        int int14 = attributeContext2.getDocumentOrder();
        int int15 = attributeContext2.getDocumentOrder();
        java.lang.String str16 = attributeContext2.toString();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Empty expression context" + "'", str16, "Empty expression context");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        int int12 = attributeContext8.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet13 = attributeContext8.getNodeSet();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
        org.apache.commons.jxpath.Pointer pointer11 = attributeContext9.getContextNodePointer();
        boolean boolean12 = attributeContext9.nextNode();
        int int13 = attributeContext9.getCurrentPosition();
        java.lang.Class<?> wildcardClass14 = attributeContext9.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(pointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
            java.lang.Object obj9 = attributeContext5.next();
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
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
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
        java.lang.String str11 = attributeContext9.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = attributeContext9.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = attributeContext9.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Empty expression context" + "'", str11, "Empty expression context");
        org.junit.Assert.assertNull(nodePointer12);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        boolean boolean16 = attributeContext9.setPosition(10);
        java.util.List list17 = attributeContext9.getContextNodeList();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet12 = attributeContext2.getNodeSet();
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
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        boolean boolean9 = attributeContext2.nextNode();
        attributeContext2.reset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeContext2.nextSet();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        attributeContext2.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext6 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getDocumentOrder();
        attributeContext2.reset();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer8 = attributeContext2.getContextNodePointer();
        java.lang.Class<?> wildcardClass9 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertNull(pointer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        attributeContext4.reset();
        boolean boolean6 = attributeContext4.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext4, nodeTest7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attributeContext4.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        java.lang.String str5 = attributeContext4.toString();
        java.util.List list6 = attributeContext4.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext4.getCurrentNodePointer();
        boolean boolean8 = attributeContext4.nextNode();
        int int9 = attributeContext4.getPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext4, nodeTest10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = attributeContext11.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Empty expression context" + "'", str5, "Empty expression context");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        boolean boolean8 = attributeContext2.setPosition((int) 'a');
        java.util.List list9 = attributeContext2.getContextNodeList();
        java.lang.String str10 = attributeContext2.toString();
        java.lang.String str11 = attributeContext2.toString();
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
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Empty expression context" + "'", str11, "Empty expression context");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        int int13 = attributeContext2.getDocumentOrder();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        attributeContext2.reset();
        boolean boolean16 = attributeContext2.setPosition((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        boolean boolean8 = attributeContext2.setPosition((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
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
        boolean boolean14 = attributeContext2.setPosition(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer15 = attributeContext2.getSingleNodePointer();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        java.lang.String str5 = attributeContext4.toString();
        java.util.List list6 = attributeContext4.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext4.getCurrentNodePointer();
        int int8 = attributeContext4.getDocumentOrder();
        java.util.List list9 = attributeContext4.getContextNodeList();
        java.lang.Class<?> wildcardClass10 = list9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Empty expression context" + "'", str5, "Empty expression context");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        boolean boolean13 = attributeContext2.setPosition((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        org.junit.Assert.assertNull(nodePointer13);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getContextNodePointer();
        int int8 = attributeContext2.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext9 = attributeContext2.getJXPathContext();
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
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = attributeContext8.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeContext8.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(nodePointer10);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext5 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest4);
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer8 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        boolean boolean12 = attributeContext2.setPosition((int) '4');
        int int13 = attributeContext2.getDocumentOrder();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        int int13 = attributeContext2.getPosition();
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
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertNull(nodePointer11);
        org.junit.Assert.assertNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.Pointer pointer8 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(pointer8);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getContextNodePointer();
        attributeContext2.reset();
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
        org.junit.Assert.assertNull(pointer7);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        org.apache.commons.jxpath.Pointer pointer10 = attributeContext2.getContextNodePointer();
        java.util.List list11 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = attributeContext2.hasNext();
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
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
            boolean boolean16 = attributeContext2.nextSet();
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
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext10 = attributeContext2.getRootContext();
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
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        java.lang.String str12 = attributeContext2.toString();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
            java.lang.Object obj15 = attributeContext2.next();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
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
        boolean boolean10 = attributeContext2.nextNode();
        int int11 = attributeContext2.getPosition();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest11);
        java.util.List list13 = attributeContext2.getContextNodeList();
        int int14 = attributeContext2.getPosition();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = attributeContext2.getCurrentNodePointer();
        int int4 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = attributeContext2.getCurrentNodePointer();
        boolean boolean7 = attributeContext2.setPosition((int) (short) -1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attributeContext9.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        java.lang.String str5 = attributeContext4.toString();
        java.util.List list6 = attributeContext4.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext4.getCurrentNodePointer();
        int int8 = attributeContext4.getDocumentOrder();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext10 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext4, nodeTest9);
        int int11 = attributeContext10.getDocumentOrder();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Empty expression context" + "'", str5, "Empty expression context");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        int int5 = attributeContext2.getPosition();
        boolean boolean6 = attributeContext2.nextNode();
        attributeContext2.reset();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        attributeContext4.reset();
        boolean boolean7 = attributeContext4.setPosition((int) (short) 10);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext4.getCurrentNodePointer();
        boolean boolean9 = attributeContext4.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = attributeContext4.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeContext4.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(nodePointer10);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        int int17 = attributeContext2.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = attributeContext2.next();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getPosition();
        java.util.List list8 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(nodePointer9);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
            java.lang.Object obj16 = attributeContext15.next();
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
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getContextNodePointer();
        int int8 = attributeContext2.getPosition();
        int int9 = attributeContext2.getDocumentOrder();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
        attributeContext2.reset();
        boolean boolean15 = attributeContext2.nextNode();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
            boolean boolean11 = attributeContext2.nextSet();
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
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        boolean boolean5 = attributeContext2.nextNode();
        attributeContext2.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet7 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest7);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext10 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext8, nodeTest9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = attributeContext10.getValue();
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
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        java.lang.String str12 = attributeContext2.toString();
        int int13 = attributeContext2.getPosition();
        int int14 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.Pointer pointer15 = attributeContext2.getContextNodePointer();
        int int16 = attributeContext2.getDocumentOrder();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(pointer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
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
        boolean boolean13 = attributeContext2.setPosition((int) ' ');
        int int14 = attributeContext2.getPosition();
        java.lang.String str15 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = attributeContext2.hasNext();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Empty expression context" + "'", str15, "Empty expression context");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
        boolean boolean12 = attributeContext2.setPosition((int) '4');
        java.lang.String str13 = attributeContext2.toString();
        java.util.List list14 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = attributeContext2.nextSet();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Empty expression context" + "'", str13, "Empty expression context");
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.Pointer pointer8 = attributeContext2.getContextNodePointer();
        int int9 = attributeContext2.getPosition();
        java.util.List list10 = attributeContext2.getContextNodeList();
        java.lang.String str11 = attributeContext2.toString();
        boolean boolean12 = attributeContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer13 = attributeContext2.getContextNodePointer();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(pointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Empty expression context" + "'", str11, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(pointer13);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        java.lang.Class<?> wildcardClass11 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext6 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNull(nodePointer5);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getContextNodePointer();
        attributeContext2.reset();
        boolean boolean9 = attributeContext2.isChildOrderingRequired();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
            org.apache.commons.jxpath.NodeSet nodeSet12 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
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
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
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
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        attributeContext2.reset();
        boolean boolean13 = attributeContext2.nextNode();
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
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
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
        int int14 = attributeContext2.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer15 = attributeContext2.getSingleNodePointer();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getPosition();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        boolean boolean9 = attributeContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = attributeContext2.getCurrentNodePointer();
        java.lang.Class<?> wildcardClass11 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(nodePointer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
            org.apache.commons.jxpath.JXPathContext jXPathContext11 = attributeContext2.getJXPathContext();
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
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = attributeContext9.getCurrentNodePointer();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(nodePointer10);
        org.junit.Assert.assertNull(nodePointer11);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        boolean boolean9 = attributeContext2.nextNode();
        attributeContext2.reset();
        attributeContext2.reset();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nodePointer8);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext13 = attributeContext2.getRootContext();
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
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
        attributeContext2.reset();
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
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        int int14 = attributeContext2.getPosition();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        int int5 = attributeContext2.getPosition();
        boolean boolean7 = attributeContext2.setPosition((int) '4');
        boolean boolean8 = attributeContext2.nextNode();
        boolean boolean9 = attributeContext2.nextNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer11 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(nodePointer10);
        org.junit.Assert.assertNull(pointer11);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        boolean boolean13 = attributeContext2.setPosition((int) (short) 10);
        java.lang.Class<?> wildcardClass14 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        int int13 = attributeContext9.getPosition();
        org.apache.commons.jxpath.Pointer pointer14 = attributeContext9.getContextNodePointer();
        java.lang.String str15 = attributeContext9.toString();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(pointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Empty expression context" + "'", str15, "Empty expression context");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext9.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer14 = attributeContext9.getContextNodePointer();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertNull(pointer14);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = attributeContext2.getCurrentNodePointer();
        boolean boolean15 = attributeContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        org.junit.Assert.assertNull(nodePointer11);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
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
        java.lang.Class<?> wildcardClass12 = attributeContext8.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        boolean boolean12 = attributeContext2.setPosition((int) '4');
        int int13 = attributeContext2.getPosition();
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
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
            boolean boolean15 = attributeContext2.hasNext();
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
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
            boolean boolean9 = attributeContext2.hasNext();
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
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
            org.apache.commons.jxpath.ri.axes.RootContext rootContext13 = attributeContext2.getRootContext();
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
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.Pointer pointer8 = attributeContext2.getContextNodePointer();
        int int9 = attributeContext2.getPosition();
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
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(pointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getPosition();
        int int8 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        int int5 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
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
        org.junit.Assert.assertNull(pointer10);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        int int5 = attributeContext2.getDocumentOrder();
        java.util.List list6 = attributeContext2.getContextNodeList();
        boolean boolean7 = attributeContext2.nextNode();
        attributeContext2.reset();
        java.util.List list9 = attributeContext2.getContextNodeList();
        int int10 = attributeContext2.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer11 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
        java.lang.String str12 = attributeContext2.toString();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        boolean boolean5 = attributeContext2.isChildOrderingRequired();
        boolean boolean6 = attributeContext2.nextNode();
        java.lang.String str7 = attributeContext2.toString();
        java.lang.String str8 = attributeContext2.toString();
        java.util.List list9 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Empty expression context" + "'", str7, "Empty expression context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
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
            attributeContext9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext16 = attributeContext2.getRootContext();
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
        org.junit.Assert.assertNull(nodePointer15);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        attributeContext2.reset();
        java.lang.Class<?> wildcardClass6 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
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
            java.lang.Object obj16 = attributeContext2.getValue();
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
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertNull(pointer15);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        java.util.List list13 = attributeContext2.getContextNodeList();
        boolean boolean14 = attributeContext2.isChildOrderingRequired();
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
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(pointer5);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet11 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext17 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext12, nodeTest16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext18 = attributeContext12.getRootContext();
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
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        int int12 = attributeContext2.getPosition();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        java.lang.String str5 = attributeContext4.toString();
        java.util.List list6 = attributeContext4.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext4.getCurrentNodePointer();
        boolean boolean8 = attributeContext4.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer9 = attributeContext4.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Empty expression context" + "'", str5, "Empty expression context");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        java.util.List list18 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = attributeContext2.next();
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
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        boolean boolean13 = attributeContext9.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = attributeContext9.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNull(nodePointer6);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        attributeContext2.reset();
        boolean boolean8 = attributeContext2.setPosition((int) ' ');
        org.apache.commons.jxpath.Pointer pointer9 = attributeContext2.getContextNodePointer();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(pointer9);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
            org.apache.commons.jxpath.JXPathContext jXPathContext10 = attributeContext8.getJXPathContext();
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
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        java.util.List list7 = attributeContext2.getContextNodeList();
        java.util.List list8 = attributeContext2.getContextNodeList();
        int int9 = attributeContext2.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
        int int14 = attributeContext2.getDocumentOrder();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
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
        java.lang.Class<?> wildcardClass15 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        boolean boolean12 = attributeContext2.isChildOrderingRequired();
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
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(nodePointer13);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
            org.apache.commons.jxpath.NodeSet nodeSet15 = attributeContext12.getNodeSet();
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
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        int int10 = attributeContext2.getPosition();
        int int11 = attributeContext2.getDocumentOrder();
        attributeContext2.reset();
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
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        java.util.List list7 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertNull(nodePointer9);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
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
            java.lang.Object obj19 = attributeContext2.next();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
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
        boolean boolean12 = attributeContext8.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = attributeContext8.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        org.apache.commons.jxpath.Pointer pointer18 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer19 = attributeContext2.getContextNodePointer();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(pointer18);
        org.junit.Assert.assertNull(pointer19);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        int int6 = attributeContext2.getDocumentOrder();
        attributeContext2.reset();
        java.util.List list8 = attributeContext2.getContextNodeList();
        int int9 = attributeContext2.getPosition();
        boolean boolean10 = attributeContext2.nextNode();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        java.util.List list7 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer8 = attributeContext2.getContextNodePointer();
        attributeContext2.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = attributeContext2.next();
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
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext10 = attributeContext9.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Empty expression context" + "'", str5, "Empty expression context");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        boolean boolean8 = attributeContext2.isChildOrderingRequired();
        java.lang.String str9 = attributeContext2.toString();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest10);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        org.apache.commons.jxpath.Pointer pointer11 = attributeContext9.getContextNodePointer();
        boolean boolean12 = attributeContext9.nextNode();
        attributeContext9.reset();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(pointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
        int int15 = attributeContext13.getDocumentOrder();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        java.lang.Class<?> wildcardClass13 = attributeContext4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Empty expression context" + "'", str5, "Empty expression context");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        org.apache.commons.jxpath.Pointer pointer10 = attributeContext2.getContextNodePointer();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(pointer10);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        attributeContext13.reset();
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
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
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
        java.util.List list14 = attributeContext13.getContextNodeList();
        java.lang.String str15 = attributeContext13.toString();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Empty expression context" + "'", str15, "Empty expression context");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
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
        org.junit.Assert.assertNull(nodePointer7);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        org.apache.commons.jxpath.Pointer pointer14 = attributeContext2.getContextNodePointer();
        java.lang.String str15 = attributeContext2.toString();
        int int16 = attributeContext2.getDocumentOrder();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(pointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Empty expression context" + "'", str15, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
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
        boolean boolean13 = attributeContext2.setPosition(0);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = attributeContext2.getCurrentNodePointer();
        boolean boolean16 = attributeContext2.setPosition(0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
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
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        int int5 = attributeContext2.getDocumentOrder();
        int int6 = attributeContext2.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext5 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest4);
        int int6 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.nextNode();
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        boolean boolean14 = attributeContext2.isChildOrderingRequired();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        attributeContext2.reset();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext8 = attributeContext2.getJXPathContext();
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
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
            boolean boolean11 = attributeContext2.hasNext();
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
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        attributeContext4.reset();
        boolean boolean6 = attributeContext4.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext4.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet8 = attributeContext4.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(nodePointer7);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext14 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest13);
        int int15 = attributeContext14.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet16 = attributeContext14.getNodeSet();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
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
            org.apache.commons.jxpath.ri.axes.RootContext rootContext9 = attributeContext2.getRootContext();
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
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        int int13 = attributeContext9.getPosition();
        int int14 = attributeContext9.getPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = attributeContext9.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = attributeContext9.next();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(nodePointer15);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest11);
        attributeContext12.reset();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getContextNodePointer();
        attributeContext2.reset();
        boolean boolean10 = attributeContext2.setPosition((int) (byte) 0);
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
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = attributeContext2.getCurrentNodePointer();
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
        org.junit.Assert.assertNull(nodePointer11);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        org.apache.commons.jxpath.Pointer pointer13 = attributeContext2.getContextNodePointer();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(pointer13);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext18 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext15, nodeTest17);
        java.lang.Class<?> wildcardClass19 = attributeContext15.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        int int13 = attributeContext9.getPosition();
        attributeContext9.reset();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = attributeContext9.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext16 = attributeContext9.getJXPathContext();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(nodePointer15);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.lang.String str3 = attributeContext2.toString();
        java.lang.Class<?> wildcardClass4 = attributeContext2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Empty expression context" + "'", str3, "Empty expression context");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
            java.lang.Object obj8 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        int int5 = attributeContext2.getPosition();
        boolean boolean7 = attributeContext2.setPosition((int) '4');
        boolean boolean8 = attributeContext2.isChildOrderingRequired();
        int int9 = attributeContext2.getCurrentPosition();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        java.util.List list7 = attributeContext2.getContextNodeList();
        attributeContext2.reset();
        boolean boolean9 = attributeContext2.nextNode();
        java.lang.String str10 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext6 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
            org.apache.commons.jxpath.JXPathContext jXPathContext14 = attributeContext2.getJXPathContext();
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
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
            org.apache.commons.jxpath.JXPathContext jXPathContext16 = attributeContext15.getJXPathContext();
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
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext11 = attributeContext9.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        java.lang.String str11 = attributeContext2.toString();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Empty expression context" + "'", str11, "Empty expression context");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest10);
        org.apache.commons.jxpath.Pointer pointer12 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet13 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(pointer12);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getPosition();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext8 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(pointer7);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
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
        int int13 = attributeContext9.getPosition();
        int int14 = attributeContext9.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer15 = attributeContext9.getSingleNodePointer();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext7 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest6);
        int int8 = attributeContext7.getCurrentPosition();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
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
        boolean boolean15 = attributeContext2.nextNode();
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
        org.junit.Assert.assertNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        java.lang.String str11 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = attributeContext2.getValue();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Empty expression context" + "'", str11, "Empty expression context");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        int int16 = attributeContext12.getPosition();
        boolean boolean17 = attributeContext12.nextNode();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = attributeContext12.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = nodePointer18.getClass();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(nodePointer18);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(pointer13);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = attributeContext2.getValue();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest11 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext12 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest11);
        attributeContext12.reset();
        boolean boolean14 = attributeContext12.isChildOrderingRequired();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
            org.apache.commons.jxpath.ri.axes.RootContext rootContext16 = attributeContext15.getRootContext();
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
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
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
        int int14 = attributeContext2.getDocumentOrder();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
        java.lang.Class<?> wildcardClass13 = attributeContext12.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        int int8 = attributeContext2.getCurrentPosition();
        java.lang.String str9 = attributeContext2.toString();
        java.lang.String str10 = attributeContext2.toString();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeContext2.hasNext();
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
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        java.lang.Class<?> wildcardClass17 = attributeContext2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
            org.apache.commons.jxpath.JXPathContext jXPathContext10 = attributeContext4.getJXPathContext();
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
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        boolean boolean6 = attributeContext2.setPosition((int) (byte) 10);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest7);
        int int9 = attributeContext8.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext10 = attributeContext8.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
        boolean boolean10 = attributeContext2.isChildOrderingRequired();
        int int11 = attributeContext2.getCurrentPosition();
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
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
            boolean boolean16 = attributeContext2.hasNext();
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
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        boolean boolean15 = attributeContext9.setPosition((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = attributeContext9.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
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
        org.apache.commons.jxpath.Pointer pointer13 = attributeContext12.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = pointer13.getClass();
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
        org.junit.Assert.assertNull(pointer13);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        boolean boolean6 = attributeContext2.nextNode();
        java.util.List list7 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            attributeContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        int int6 = attributeContext2.getDocumentOrder();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext7 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest6);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext7, nodeTest8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = attributeContext9.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext5 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest4);
        boolean boolean6 = attributeContext5.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext7 = attributeContext5.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
        int int14 = attributeContext9.getDocumentOrder();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
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
        java.lang.String str11 = attributeContext2.toString();
        int int12 = attributeContext2.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Empty expression context" + "'", str11, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
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
        int int12 = attributeContext2.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Empty expression context" + "'", str11, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        boolean boolean5 = attributeContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer13 = attributeContext9.getCurrentNodePointer();
        boolean boolean14 = attributeContext9.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = attributeContext9.next();
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
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = attributeContext2.getCurrentNodePointer();
        int int4 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = attributeContext2.getCurrentNodePointer();
        boolean boolean7 = attributeContext2.setPosition((int) (short) -1);
        org.apache.commons.jxpath.Pointer pointer8 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = pointer8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(pointer8);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
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
        boolean boolean12 = attributeContext2.setPosition(10);
        int int13 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = attributeContext2.getCurrentNodePointer();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(pointer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(nodePointer14);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
            org.apache.commons.jxpath.ri.axes.RootContext rootContext10 = attributeContext8.getRootContext();
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
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
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
            org.apache.commons.jxpath.JXPathContext jXPathContext15 = attributeContext13.getJXPathContext();
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
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
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
            boolean boolean14 = attributeContext13.nextSet();
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
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        java.lang.String str8 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attributeContext2.hasNext();
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
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        java.util.List list7 = attributeContext2.getContextNodeList();
        attributeContext2.reset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attributeContext2.nextSet();
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
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
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
        org.apache.commons.jxpath.Pointer pointer11 = attributeContext9.getContextNodePointer();
        boolean boolean12 = attributeContext9.nextNode();
        int int13 = attributeContext9.getCurrentPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = attributeContext9.getCurrentNodePointer();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(pointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNull(nodePointer14);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        java.util.List list5 = attributeContext4.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext4.getContextNodePointer();
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(pointer6);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
        boolean boolean17 = attributeContext2.setPosition((int) '4');
        java.lang.String str18 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet19 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Empty expression context" + "'", str18, "Empty expression context");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
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
            java.lang.Class<?> wildcardClass9 = nodePointer8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertNull(nodePointer8);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        int int5 = attributeContext2.getPosition();
        boolean boolean7 = attributeContext2.setPosition((int) '4');
        boolean boolean8 = attributeContext2.nextNode();
        int int9 = attributeContext2.getPosition();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext14 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest13);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext16 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest15);
        int int17 = attributeContext16.getPosition();
        java.util.List list18 = attributeContext16.getContextNodeList();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
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
        attributeContext2.reset();
        int int16 = attributeContext2.getDocumentOrder();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = attributeContext2.getCurrentNodePointer();
        attributeContext2.reset();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(nodePointer6);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
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
        boolean boolean13 = attributeContext2.setPosition(0);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext16 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest15);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(nodePointer14);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        int int14 = attributeContext13.getCurrentPosition();
        java.lang.String str15 = attributeContext13.toString();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Empty expression context" + "'", str15, "Empty expression context");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getPosition();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer8);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getPosition();
        org.apache.commons.jxpath.Pointer pointer8 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(pointer8);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        boolean boolean11 = attributeContext4.setPosition(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer12 = attributeContext4.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Empty expression context" + "'", str5, "Empty expression context");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        attributeContext2.reset();
        int int11 = attributeContext2.getCurrentPosition();
        boolean boolean12 = attributeContext2.nextNode();
        java.lang.Class<?> wildcardClass13 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        java.util.List list14 = attributeContext13.getContextNodeList();
        boolean boolean15 = attributeContext13.nextNode();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
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
        attributeContext2.reset();
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
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        int int10 = attributeContext2.getCurrentPosition();
        java.lang.Class<?> wildcardClass11 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        org.apache.commons.jxpath.Pointer pointer10 = attributeContext4.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeContext4.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(pointer10);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        java.util.List list7 = attributeContext2.getContextNodeList();
        boolean boolean9 = attributeContext2.setPosition((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext10 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = attributeContext13.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext16 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext13, nodeTest15);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(nodePointer14);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext11, nodeTest12);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext15 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext13, nodeTest14);
        int int16 = attributeContext15.getDocumentOrder();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getPosition();
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
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
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
        int int13 = attributeContext2.getPosition();
        boolean boolean14 = attributeContext2.isChildOrderingRequired();
        java.lang.Class<?> wildcardClass15 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        boolean boolean8 = attributeContext2.isChildOrderingRequired();
        java.lang.String str9 = attributeContext2.toString();
        java.util.List list10 = attributeContext2.getContextNodeList();
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
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
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
        boolean boolean11 = attributeContext2.nextNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest12);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext15 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest14);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        java.util.List list10 = attributeContext2.getContextNodeList();
        java.util.List list11 = attributeContext2.getContextNodeList();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
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
        int int12 = attributeContext9.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext13 = attributeContext9.getRootContext();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
            boolean boolean14 = attributeContext2.hasNext();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        boolean boolean8 = attributeContext2.isChildOrderingRequired();
        java.lang.String str9 = attributeContext2.toString();
        attributeContext2.reset();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
        int int14 = attributeContext9.getDocumentOrder();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest15 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext16 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest15);
        int int17 = attributeContext16.getDocumentOrder();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = attributeContext8.next();
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
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = attributeContext2.hasNext();
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
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        int int8 = attributeContext2.getCurrentPosition();
        java.lang.String str9 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext10 = attributeContext2.getJXPathContext();
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
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext13 = attributeContext2.getRootContext();
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
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = attributeContext13.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = attributeContext13.nextSet();
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
        org.junit.Assert.assertNull(nodePointer16);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
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
            java.lang.Object obj14 = attributeContext2.next();
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
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest4 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext5 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest4);
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext8 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
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
        boolean boolean11 = attributeContext8.setPosition((int) ' ');
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = attributeContext8.getCurrentNodePointer();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(nodePointer12);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
            java.lang.Object obj10 = attributeContext2.next();
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
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
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
        int int17 = attributeContext2.getCurrentPosition();
        java.lang.Class<?> wildcardClass18 = attributeContext2.getClass();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
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
        boolean boolean14 = attributeContext2.isChildOrderingRequired();
        java.lang.String str15 = attributeContext2.toString();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Empty expression context" + "'", str15, "Empty expression context");
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
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
        org.apache.commons.jxpath.Pointer pointer10 = attributeContext4.getContextNodePointer();
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
        org.junit.Assert.assertNull(pointer10);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        java.lang.String str10 = attributeContext2.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = attributeContext2.getCurrentNodePointer();
        int int12 = attributeContext2.getPosition();
        int int13 = attributeContext2.getPosition();
        java.lang.Class<?> wildcardClass14 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        attributeContext4.reset();
        boolean boolean7 = attributeContext4.setPosition((int) (short) 10);
        org.apache.commons.jxpath.Pointer pointer8 = attributeContext4.getContextNodePointer();
        boolean boolean10 = attributeContext4.setPosition((int) '4');
        java.lang.String str11 = attributeContext4.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = attributeContext4.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(pointer8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Empty expression context" + "'", str11, "Empty expression context");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        int int5 = attributeContext2.getDocumentOrder();
        java.util.List list6 = attributeContext2.getContextNodeList();
        boolean boolean7 = attributeContext2.nextNode();
        int int8 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest10);
        boolean boolean12 = attributeContext11.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext13 = attributeContext11.getRootContext();
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
        org.junit.Assert.assertNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext17 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = attributeContext17.next();
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
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest7);
        boolean boolean9 = attributeContext8.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext10 = attributeContext8.getJXPathContext();
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
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
        org.junit.Assert.assertNull(nodePointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Empty expression context" + "'", str11, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(nodePointer14);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
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
            org.apache.commons.jxpath.JXPathContext jXPathContext11 = attributeContext9.getJXPathContext();
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
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
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
        boolean boolean17 = attributeContext2.setPosition((int) ' ');
        java.util.List list18 = attributeContext2.getContextNodeList();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Empty expression context" + "'", str15, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
            java.lang.Object obj11 = attributeContext9.next();
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
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = attributeContext2.getCurrentNodePointer();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(nodePointer10);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
        org.junit.Assert.assertNull(nodePointer10);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        java.util.List list7 = attributeContext2.getContextNodeList();
        int int8 = attributeContext2.getDocumentOrder();
        attributeContext2.reset();
        boolean boolean10 = attributeContext2.isChildOrderingRequired();
        boolean boolean12 = attributeContext2.setPosition(2);
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
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        boolean boolean8 = attributeContext2.setPosition((int) 'a');
        java.util.List list9 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeContext2.hasNext();
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
        org.junit.Assert.assertNull(nodePointer10);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        java.util.List list11 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
        org.junit.Assert.assertNull(nodePointer10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext6 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest5);
        int int7 = attributeContext2.getPosition();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        int int5 = attributeContext2.getDocumentOrder();
        java.util.List list6 = attributeContext2.getContextNodeList();
        boolean boolean7 = attributeContext2.nextNode();
        attributeContext2.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext9 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
            org.apache.commons.jxpath.ri.axes.RootContext rootContext8 = attributeContext2.getRootContext();
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
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        boolean boolean5 = attributeContext2.isChildOrderingRequired();
        boolean boolean6 = attributeContext2.nextNode();
        boolean boolean8 = attributeContext2.setPosition((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer9 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        int int5 = attributeContext2.getPosition();
        java.lang.String str6 = attributeContext2.toString();
        int int7 = attributeContext2.getPosition();
        java.lang.String str8 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet9 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Empty expression context" + "'", str6, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = attributeContext2.getCurrentNodePointer();
        int int6 = attributeContext2.getPosition();
        org.apache.commons.jxpath.Pointer pointer7 = attributeContext2.getContextNodePointer();
        int int8 = attributeContext2.getPosition();
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
        org.junit.Assert.assertNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        boolean boolean7 = attributeContext2.setPosition((int) (short) 1);
        java.util.List list8 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = attributeContext2.getCurrentNodePointer();
        java.util.List list10 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = attributeContext2.getCurrentNodePointer();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(nodePointer9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(nodePointer11);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext12 = attributeContext2.getRootContext();
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
        org.junit.Assert.assertNull(nodePointer11);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        int int10 = attributeContext5.getPosition();
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNull(nodePointer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
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
        int int11 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = attributeContext2.nextSet();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
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
        boolean boolean13 = attributeContext2.setPosition((int) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest12 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext13 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest12);
        java.lang.Class<?> wildcardClass14 = attributeContext13.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        int int5 = attributeContext2.getPosition();
        boolean boolean7 = attributeContext2.setPosition((int) '4');
        boolean boolean8 = attributeContext2.nextNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest9 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext10 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest9);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext14 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest13);
        int int15 = attributeContext14.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = attributeContext14.next();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        java.lang.Class<?> wildcardClass12 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNull(pointer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Empty expression context" + "'", str11, "Empty expression context");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
        boolean boolean12 = attributeContext2.setPosition((int) '4');
        int int13 = attributeContext2.getPosition();
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
        org.apache.commons.jxpath.Pointer pointer11 = attributeContext2.getContextNodePointer();
        boolean boolean13 = attributeContext2.setPosition(0);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(pointer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        int int5 = attributeContext2.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        java.lang.String str14 = attributeContext2.toString();
        boolean boolean16 = attributeContext2.setPosition((int) '#');
        java.lang.String str17 = attributeContext2.toString();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Empty expression context" + "'", str14, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Empty expression context" + "'", str17, "Empty expression context");
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        boolean boolean5 = attributeContext2.isChildOrderingRequired();
        boolean boolean6 = attributeContext2.nextNode();
        boolean boolean7 = attributeContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext8 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
        int int15 = attributeContext9.getPosition();
        java.lang.Class<?> wildcardClass16 = attributeContext9.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Empty expression context" + "'", str14, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
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
        int int17 = attributeContext2.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = attributeContext2.nextSet();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
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
        boolean boolean12 = attributeContext2.setPosition(100);
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
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
        org.junit.Assert.assertNull(nodePointer10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
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
        boolean boolean14 = attributeContext13.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet15 = attributeContext13.getNodeSet();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        int int10 = attributeContext2.getCurrentPosition();
        java.util.List list11 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext12 = attributeContext2.getJXPathContext();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
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
            org.apache.commons.jxpath.ri.axes.RootContext rootContext14 = attributeContext11.getRootContext();
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
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        boolean boolean8 = attributeContext2.setPosition((int) 'a');
        java.util.List list9 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = attributeContext2.getCurrentNodePointer();
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext12 = attributeContext2.getJXPathContext();
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
        org.junit.Assert.assertNull(nodePointer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
        org.apache.commons.jxpath.Pointer pointer13 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext15 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = attributeContext15.nextSet();
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
        org.junit.Assert.assertNull(pointer13);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext18 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext9, nodeTest17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext19 = attributeContext9.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Empty expression context" + "'", str14, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext6 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest5);
        int int7 = attributeContext2.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = attributeContext4.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = attributeContext4.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Empty expression context" + "'", str5, "Empty expression context");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(nodePointer10);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = attributeContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeContext2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(nodePointer6);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
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
            attributeContext14.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
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
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
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
        boolean boolean11 = attributeContext2.isChildOrderingRequired();
        attributeContext2.reset();
        boolean boolean13 = attributeContext2.nextNode();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest14 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext15 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest14);
        int int16 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = attributeContext2.nextSet();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.Pointer pointer8 = attributeContext2.getContextNodePointer();
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
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(pointer8);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        int int5 = attributeContext2.getPosition();
        boolean boolean7 = attributeContext2.setPosition((int) '4');
        boolean boolean8 = attributeContext2.nextNode();
        org.apache.commons.jxpath.Pointer pointer9 = attributeContext2.getContextNodePointer();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(pointer9);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext18 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest17);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(nodePointer16);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
            boolean boolean11 = attributeContext2.nextSet();
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
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
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
        org.apache.commons.jxpath.Pointer pointer12 = attributeContext2.getContextNodePointer();
        int int13 = attributeContext2.getCurrentPosition();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(pointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        boolean boolean12 = attributeContext2.setPosition(100);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = attributeContext4.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = attributeContext4.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer5);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
        java.lang.String str15 = attributeContext2.toString();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext17 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = attributeContext17.next();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Empty expression context" + "'", str15, "Empty expression context");
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
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
        int int10 = attributeContext2.getPosition();
        boolean boolean11 = attributeContext2.nextNode();
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext14 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext15 = attributeContext2.getRootContext();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = attributeContext2.getCurrentNodePointer();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(nodePointer16);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
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
        java.util.List list12 = attributeContext4.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext13 = attributeContext4.getRootContext();
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
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        boolean boolean6 = attributeContext2.nextNode();
        java.util.List list7 = attributeContext2.getContextNodeList();
        java.util.List list8 = attributeContext2.getContextNodeList();
        int int9 = attributeContext2.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer10 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
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
        int int10 = attributeContext2.getPosition();
        int int11 = attributeContext2.getDocumentOrder();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        boolean boolean8 = attributeContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = attributeContext2.getValue();
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
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        boolean boolean5 = attributeContext2.isChildOrderingRequired();
        attributeContext2.reset();
        int int7 = attributeContext2.getPosition();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
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
        int int14 = attributeContext2.getCurrentPosition();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        boolean boolean8 = attributeContext2.setPosition((int) 'a');
        java.util.List list9 = attributeContext2.getContextNodeList();
        java.lang.String str10 = attributeContext2.toString();
        java.lang.String str11 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer12 = attributeContext2.getSingleNodePointer();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Empty expression context" + "'", str11, "Empty expression context");
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        int int7 = attributeContext2.getDocumentOrder();
        boolean boolean9 = attributeContext2.setPosition((int) '4');
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        java.util.List list11 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = attributeContext2.getCurrentNodePointer();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
        org.junit.Assert.assertNull(nodePointer10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(nodePointer12);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest5 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext6 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest5);
        boolean boolean7 = attributeContext2.isChildOrderingRequired();
        int int8 = attributeContext2.getCurrentPosition();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = attributeContext2.getCurrentNodePointer();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(nodePointer10);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
        java.util.List list14 = attributeContext9.getContextNodeList();
        attributeContext9.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = attributeContext9.next();
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
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        int int14 = attributeContext13.getCurrentPosition();
        boolean boolean15 = attributeContext13.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = attributeContext13.next();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        java.lang.String str14 = attributeContext2.toString();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = attributeContext2.getCurrentNodePointer();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Empty expression context" + "'", str14, "Empty expression context");
        org.junit.Assert.assertNull(nodePointer15);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        java.util.List list14 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext15 = attributeContext2.getJXPathContext();
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
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer11 = attributeContext2.getCurrentNodePointer();
        boolean boolean13 = attributeContext2.setPosition((-1));
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(nodePointer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
            org.apache.commons.jxpath.Pointer pointer8 = attributeContext2.getSingleNodePointer();
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
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        int int7 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        boolean boolean9 = attributeContext2.isChildOrderingRequired();
        java.lang.String str10 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = attributeContext2.next();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        int int8 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet12 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(nodePointer9);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext2.getCurrentNodePointer();
        boolean boolean8 = attributeContext2.isChildOrderingRequired();
        java.lang.String str9 = attributeContext2.toString();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = attributeContext11.nextSet();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        boolean boolean5 = attributeContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(pointer6);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        attributeContext4.reset();
        boolean boolean6 = attributeContext4.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext4.getCurrentNodePointer();
        java.lang.Class<?> wildcardClass8 = attributeContext4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
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
            java.lang.Object obj15 = attributeContext14.next();
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
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
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
        java.lang.Class<?> wildcardClass10 = attributeContext4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Empty expression context" + "'", str5, "Empty expression context");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        java.lang.String str15 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = attributeContext2.next();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Empty expression context" + "'", str15, "Empty expression context");
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
        int int11 = attributeContext2.getCurrentPosition();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
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
            org.apache.commons.jxpath.JXPathContext jXPathContext8 = attributeContext2.getJXPathContext();
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
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
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
        boolean boolean16 = attributeContext12.setPosition((int) (byte) 0);
        boolean boolean18 = attributeContext12.setPosition(2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet19 = attributeContext12.getNodeSet();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        java.util.List list7 = attributeContext2.getContextNodeList();
        java.util.List list8 = attributeContext2.getContextNodeList();
        int int9 = attributeContext2.getCurrentPosition();
        java.lang.Class<?> wildcardClass10 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = attributeContext2.getCurrentNodePointer();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(nodePointer13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(nodePointer16);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = attributeContext12.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext18 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext12, nodeTest17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet19 = attributeContext18.getNodeSet();
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
        org.junit.Assert.assertNull(nodePointer16);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
        org.apache.commons.jxpath.Pointer pointer11 = attributeContext9.getContextNodePointer();
        boolean boolean12 = attributeContext9.nextNode();
        int int13 = attributeContext9.getPosition();
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
        org.junit.Assert.assertNull(pointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        java.util.List list7 = attributeContext2.getContextNodeList();
        int int8 = attributeContext2.getDocumentOrder();
        attributeContext2.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext10 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext17 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = attributeContext17.nextSet();
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
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
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
            attributeContext9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = attributeContext2.hasNext();
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
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = attributeContext13.getCurrentNodePointer();
        java.lang.Class<?> wildcardClass17 = attributeContext13.getClass();
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
        org.junit.Assert.assertNull(nodePointer16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        boolean boolean10 = attributeContext9.nextNode();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
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
        java.lang.String str12 = attributeContext2.toString();
        int int13 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.Pointer pointer14 = attributeContext2.getContextNodePointer();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(pointer14);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
        boolean boolean11 = attributeContext4.setPosition((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = attributeContext4.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
        int int13 = attributeContext12.getDocumentOrder();
        boolean boolean14 = attributeContext12.nextNode();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        boolean boolean5 = attributeContext2.isChildOrderingRequired();
        boolean boolean6 = attributeContext2.nextNode();
        java.lang.String str7 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer8 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Empty expression context" + "'", str7, "Empty expression context");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
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
        org.apache.commons.jxpath.Pointer pointer12 = attributeContext9.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = attributeContext9.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(pointer12);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext7 = attributeContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNull(nodePointer5);
        org.junit.Assert.assertNull(pointer6);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
            boolean boolean10 = attributeContext8.hasNext();
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
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer16 = attributeContext12.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest17 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext18 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext12, nodeTest17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext19 = attributeContext12.getRootContext();
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
        org.junit.Assert.assertNull(nodePointer16);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest16 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext17 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest16);
        int int18 = attributeContext17.getCurrentPosition();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNull(nodePointer15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        boolean boolean7 = attributeContext2.nextNode();
        int int8 = attributeContext2.getPosition();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
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
        java.lang.String str12 = attributeContext2.toString();
        int int13 = attributeContext2.getPosition();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        int int5 = attributeContext2.getPosition();
        boolean boolean7 = attributeContext2.setPosition((int) '4');
        int int8 = attributeContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet9 = attributeContext2.getNodeSet();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext14 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest13);
        boolean boolean16 = attributeContext14.setPosition(1);
        org.apache.commons.jxpath.Pointer pointer17 = attributeContext14.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet18 = attributeContext14.getNodeSet();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(pointer17);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        int int5 = attributeContext2.getPosition();
        int int6 = attributeContext2.getPosition();
        boolean boolean7 = attributeContext2.nextNode();
        boolean boolean8 = attributeContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext9 = attributeContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
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
        org.apache.commons.jxpath.Pointer pointer11 = attributeContext9.getContextNodePointer();
        boolean boolean12 = attributeContext9.nextNode();
        attributeContext9.reset();
        org.apache.commons.jxpath.Pointer pointer14 = attributeContext9.getContextNodePointer();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(pointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(pointer14);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
            java.lang.Object obj15 = attributeContext9.next();
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
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        int int4 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        boolean boolean6 = attributeContext2.nextNode();
        int int7 = attributeContext2.getPosition();
        java.lang.Class<?> wildcardClass8 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
        boolean boolean11 = attributeContext4.setPosition(0);
        attributeContext4.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext13 = attributeContext4.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Empty expression context" + "'", str5, "Empty expression context");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer3 = attributeContext2.getCurrentNodePointer();
        int int4 = attributeContext2.getPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = attributeContext2.getCurrentNodePointer();
        boolean boolean7 = attributeContext2.setPosition((int) (short) -1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest8 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext9 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest8);
        // The following exception was thrown during execution in test generation
        try {
            attributeContext9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(nodePointer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        boolean boolean5 = attributeContext2.isChildOrderingRequired();
        boolean boolean6 = attributeContext2.nextNode();
        boolean boolean7 = attributeContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = attributeContext2.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
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
        org.apache.commons.jxpath.Pointer pointer10 = attributeContext2.getContextNodePointer();
        java.util.List list11 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet12 = attributeContext2.getNodeSet();
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
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
        int int14 = attributeContext13.getDocumentOrder();
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
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(pointer12);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
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
        java.lang.String str14 = attributeContext2.toString();
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
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Empty expression context" + "'", str14, "Empty expression context");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        java.lang.String str5 = attributeContext4.toString();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext7 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext4, nodeTest6);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext7.getCurrentNodePointer();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Empty expression context" + "'", str5, "Empty expression context");
        org.junit.Assert.assertNull(nodePointer8);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest13 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext14 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = attributeContext14.getValue();
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
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
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
        boolean boolean16 = attributeContext9.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet17 = attributeContext9.getNodeSet();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.jxpath.JXPathException; message: Simultaneous operations: should not request pointer list while iterating over an EvalContext");
        } catch (org.apache.commons.jxpath.JXPathException e) {
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getPosition();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
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
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(nodePointer8);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = nodePointer15.getClass();
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
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
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
            org.apache.commons.jxpath.NodeSet nodeSet13 = attributeContext2.getNodeSet();
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
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
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
        java.lang.String str17 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext18 = attributeContext2.getRootContext();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Empty expression context" + "'", str17, "Empty expression context");
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext11 = attributeContext8.getJXPathContext();
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
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = attributeContext9.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext15 = attributeContext9.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nodePointer14);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
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
        java.lang.String str12 = attributeContext2.toString();
        int int13 = attributeContext2.getPosition();
        boolean boolean14 = attributeContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = attributeContext2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        int int5 = attributeContext2.getCurrentPosition();
        boolean boolean7 = attributeContext2.setPosition(2);
        boolean boolean8 = attributeContext2.isChildOrderingRequired();
        java.lang.String str9 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = attributeContext2.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Empty expression context" + "'", str9, "Empty expression context");
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getCurrentPosition();
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest7 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext8 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest7);
        java.lang.Class<?> wildcardClass9 = attributeContext8.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest6 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext7 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest6);
        attributeContext7.reset();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
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
        attributeContext2.reset();
        int int14 = attributeContext2.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet15 = attributeContext2.getNodeSet();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        int int7 = attributeContext2.getPosition();
        boolean boolean8 = attributeContext2.isChildOrderingRequired();
        int int9 = attributeContext2.getCurrentPosition();
        boolean boolean11 = attributeContext2.setPosition((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        java.util.List list6 = attributeContext2.getContextNodeList();
        java.util.List list7 = attributeContext2.getContextNodeList();
        boolean boolean9 = attributeContext2.setPosition((int) (byte) 1);
        java.util.List list10 = attributeContext2.getContextNodeList();
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
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
        boolean boolean12 = attributeContext2.nextNode();
        org.apache.commons.jxpath.Pointer pointer13 = attributeContext2.getContextNodePointer();
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
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(pointer13);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        boolean boolean8 = attributeContext2.setPosition((int) (byte) 1);
        org.apache.commons.jxpath.Pointer pointer9 = attributeContext2.getContextNodePointer();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(pointer9);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer5 = attributeContext4.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext6 = attributeContext4.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer5);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
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
        java.lang.String str16 = attributeContext2.toString();
        int int17 = attributeContext2.getPosition();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Empty expression context" + "'", str16, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
            java.lang.Object obj16 = attributeContext14.next();
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
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        boolean boolean4 = attributeContext2.isChildOrderingRequired();
        java.util.List list5 = attributeContext2.getContextNodeList();
        int int6 = attributeContext2.getCurrentPosition();
        int int7 = attributeContext2.getDocumentOrder();
        int int8 = attributeContext2.getPosition();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
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
            boolean boolean17 = attributeContext14.nextSet();
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
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        int int5 = attributeContext2.getPosition();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = attributeContext2.hasNext();
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
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        java.lang.String str5 = attributeContext4.toString();
        java.util.List list6 = attributeContext4.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = attributeContext4.getCurrentNodePointer();
        int int8 = attributeContext4.getCurrentPosition();
        boolean boolean9 = attributeContext4.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext10 = attributeContext4.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Empty expression context" + "'", str5, "Empty expression context");
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
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
        org.apache.commons.jxpath.Pointer pointer14 = attributeContext2.getContextNodePointer();
        java.lang.String str15 = attributeContext2.toString();
        int int16 = attributeContext2.getPosition();
        java.lang.String str17 = attributeContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = attributeContext2.next();
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
        org.junit.Assert.assertNull(pointer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Empty expression context" + "'", str15, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Empty expression context" + "'", str17, "Empty expression context");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.Pointer pointer5 = attributeContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext2.getContextNodePointer();
        java.util.List list7 = attributeContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer8 = attributeContext2.getSingleNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
        boolean boolean14 = attributeContext2.setPosition(0);
        int int15 = attributeContext2.getCurrentPosition();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
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
        boolean boolean16 = attributeContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = attributeContext2.hasNext();
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
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNull(nodePointer14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest3 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext4 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest3);
        attributeContext4.reset();
        org.apache.commons.jxpath.Pointer pointer6 = attributeContext4.getContextNodePointer();
        boolean boolean8 = attributeContext4.setPosition((int) (byte) -1);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
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
        boolean boolean13 = attributeContext9.isChildOrderingRequired();
        boolean boolean15 = attributeContext9.setPosition((int) (byte) -1);
        int int16 = attributeContext9.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = attributeContext9.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
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
        java.lang.String str16 = attributeContext2.toString();
        boolean boolean18 = attributeContext2.setPosition((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.NodeSet nodeSet19 = attributeContext2.getNodeSet();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Empty expression context" + "'", str16, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
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
            java.lang.Object obj14 = attributeContext2.getValue();
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
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        attributeContext2.reset();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = attributeContext2.getCurrentNodePointer();
        java.util.List list7 = attributeContext2.getContextNodeList();
        boolean boolean9 = attributeContext2.setPosition((int) '4');
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNull(nodePointer6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
            java.lang.Object obj14 = attributeContext13.next();
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
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
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
        boolean boolean12 = attributeContext2.setPosition((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        int int6 = attributeContext2.getDocumentOrder();
        attributeContext2.reset();
        java.lang.String str8 = attributeContext2.toString();
        java.lang.Class<?> wildcardClass9 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
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
            boolean boolean10 = attributeContext8.nextSet();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(nodePointer3);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
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
        attributeContext14.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext16 = attributeContext14.getRootContext();
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
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = attributeContext2.getCurrentNodePointer();
        int int5 = attributeContext2.getCurrentPosition();
        boolean boolean7 = attributeContext2.setPosition(2);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer8 = attributeContext2.getCurrentNodePointer();
        int int9 = attributeContext2.getPosition();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
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
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest10 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext11 = new org.apache.commons.jxpath.ri.axes.AttributeContext((org.apache.commons.jxpath.ri.EvalContext) attributeContext2, nodeTest10);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
            org.apache.commons.jxpath.ri.axes.RootContext rootContext14 = attributeContext2.getRootContext();
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
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        int int6 = attributeContext2.getDocumentOrder();
        attributeContext2.reset();
        org.apache.commons.jxpath.Pointer pointer8 = attributeContext2.getContextNodePointer();
        int int9 = attributeContext2.getCurrentPosition();
        java.lang.String str10 = attributeContext2.toString();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(pointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Empty expression context" + "'", str10, "Empty expression context");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.compiler.NodeTest nodeTest1 = null;
        org.apache.commons.jxpath.ri.axes.AttributeContext attributeContext2 = new org.apache.commons.jxpath.ri.axes.AttributeContext(evalContext0, nodeTest1);
        java.util.List list3 = attributeContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer4 = attributeContext2.getContextNodePointer();
        int int5 = attributeContext2.getDocumentOrder();
        boolean boolean7 = attributeContext2.setPosition(100);
        int int8 = attributeContext2.getCurrentPosition();
        org.apache.commons.jxpath.Pointer pointer9 = attributeContext2.getContextNodePointer();
        boolean boolean10 = attributeContext2.isChildOrderingRequired();
        int int11 = attributeContext2.getDocumentOrder();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(pointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
        java.lang.String str11 = attributeContext2.toString();
        java.lang.Class<?> wildcardClass12 = attributeContext2.getClass();
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(nodePointer8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Empty expression context" + "'", str11, "Empty expression context");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }
}

