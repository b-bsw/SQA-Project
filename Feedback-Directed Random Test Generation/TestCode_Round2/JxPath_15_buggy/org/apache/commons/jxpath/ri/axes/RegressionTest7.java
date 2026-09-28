package org.apache.commons.jxpath.ri.axes;

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
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        java.util.List list5 = unionContext2.getContextNodeList();
        boolean boolean6 = unionContext2.nextSet();
        boolean boolean8 = unionContext2.setPosition((int) (short) 1);
        boolean boolean9 = unionContext2.hasNext();
        org.apache.commons.jxpath.NodeSet nodeSet10 = unionContext2.getNodeSet();
        java.util.List list11 = unionContext2.getContextNodeList();
        boolean boolean13 = unionContext2.setPosition((int) '4');
        int int14 = unionContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext15 = unionContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeSet10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        unionContext2.reset();
        boolean boolean6 = unionContext2.hasNext();
        boolean boolean8 = unionContext2.setPosition((int) (short) 100);
        boolean boolean10 = unionContext2.setPosition(52);
        boolean boolean11 = unionContext2.isChildOrderingRequired();
        boolean boolean12 = unionContext2.hasNext();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext5, evalContextArray6);
        org.apache.commons.jxpath.ri.EvalContext evalContext8 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray9 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext10 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext8, evalContextArray9);
        boolean boolean11 = unionContext10.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray13 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext14 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext12, evalContextArray13);
        boolean boolean15 = unionContext14.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray17 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext18 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray17);
        java.util.List list19 = unionContext18.getContextNodeList();
        unionContext18.reset();
        java.util.List list21 = unionContext18.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray23 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext24 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext22, evalContextArray23);
        java.util.List list25 = unionContext24.getContextNodeList();
        unionContext24.reset();
        java.util.List list27 = unionContext24.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext28 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray29 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext30 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext28, evalContextArray29);
        java.util.List list31 = unionContext30.getContextNodeList();
        unionContext30.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray33 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5, unionContext10, unionContext14, unionContext18, unionContext24, unionContext30 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext34 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray33);
        org.apache.commons.jxpath.NodeSet nodeSet35 = unionContext2.getNodeSet();
        boolean boolean36 = unionContext2.isChildOrderingRequired();
        boolean boolean37 = unionContext2.nextNode();
        boolean boolean38 = unionContext2.isChildOrderingRequired();
        java.lang.Object obj39 = unionContext2.getValue();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray9);
        org.junit.Assert.assertArrayEquals(evalContextArray9, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(evalContextArray13);
        org.junit.Assert.assertArrayEquals(evalContextArray13, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(evalContextArray17);
        org.junit.Assert.assertArrayEquals(evalContextArray17, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(evalContextArray23);
        org.junit.Assert.assertArrayEquals(evalContextArray23, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(evalContextArray29);
        org.junit.Assert.assertArrayEquals(evalContextArray29, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(evalContextArray33);
        org.junit.Assert.assertNotNull(nodeSet35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "[]");
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        java.lang.Object obj5 = unionContext2.getValue();
        boolean boolean6 = unionContext2.nextNode();
        java.util.List list7 = unionContext2.getContextNodeList();
        org.apache.commons.jxpath.NodeSet nodeSet8 = unionContext2.getNodeSet();
        boolean boolean9 = unionContext2.nextNode();
        int int10 = unionContext2.getPosition();
        unionContext2.reset();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(nodeSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        boolean boolean5 = unionContext2.nextSet();
        java.lang.Object obj6 = unionContext2.getValue();
        org.apache.commons.jxpath.Pointer pointer7 = unionContext2.getSingleNodePointer();
        java.lang.Object obj8 = unionContext2.getValue();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "[]");
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "[]");
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        java.util.List list5 = unionContext2.getContextNodeList();
        int int6 = unionContext2.getCurrentPosition();
        boolean boolean7 = unionContext2.isChildOrderingRequired();
        boolean boolean9 = unionContext2.setPosition((int) (short) 100);
        org.apache.commons.jxpath.Pointer pointer10 = unionContext2.getSingleNodePointer();
        java.lang.String str11 = unionContext2.toString();
        boolean boolean12 = unionContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = unionContext2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Empty expression context" + "'", str11, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.NodeSet nodeSet3 = unionContext2.getNodeSet();
        java.lang.String str4 = unionContext2.toString();
        unionContext2.reset();
        int int6 = unionContext2.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray8 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext9 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext7, evalContextArray8);
        unionContext9.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        boolean boolean14 = unionContext13.hasNext();
        int int15 = unionContext13.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray17 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext18 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray17);
        boolean boolean19 = unionContext18.nextSet();
        org.apache.commons.jxpath.Pointer pointer20 = unionContext18.getContextNodePointer();
        boolean boolean21 = unionContext18.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray23 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext24 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext22, evalContextArray23);
        boolean boolean25 = unionContext24.nextSet();
        org.apache.commons.jxpath.Pointer pointer26 = unionContext24.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext27 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray28 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext29 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext27, evalContextArray28);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray30 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext24, evalContext27 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext31 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext18, evalContextArray30);
        org.apache.commons.jxpath.NodeSet nodeSet32 = unionContext18.getNodeSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext33 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray34 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext35 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext33, evalContextArray34);
        org.apache.commons.jxpath.Pointer pointer36 = unionContext35.getContextNodePointer();
        java.lang.Object obj37 = unionContext35.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet38 = unionContext35.getNodeSet();
        int int39 = unionContext35.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext40 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray41 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext42 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext40, evalContextArray41);
        org.apache.commons.jxpath.Pointer pointer43 = unionContext42.getSingleNodePointer();
        int int44 = unionContext42.getCurrentPosition();
        int int45 = unionContext42.getDocumentOrder();
        org.apache.commons.jxpath.ri.EvalContext evalContext46 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray47 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext48 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext46, evalContextArray47);
        boolean boolean49 = unionContext48.nextNode();
        int int50 = unionContext48.getDocumentOrder();
        boolean boolean51 = unionContext48.isChildOrderingRequired();
        java.util.List list52 = unionContext48.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext53 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray54 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext55 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext53, evalContextArray54);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext56 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext48, evalContextArray54);
        org.apache.commons.jxpath.ri.EvalContext evalContext57 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray58 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext59 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext57, evalContextArray58);
        java.util.List list60 = unionContext59.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray61 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext13, unionContext18, unionContext35, unionContext42, unionContext56, unionContext59 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext62 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext9, evalContextArray61);
        org.apache.commons.jxpath.ri.EvalContext evalContext63 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray64 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext65 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext63, evalContextArray64);
        org.apache.commons.jxpath.Pointer pointer66 = unionContext65.getContextNodePointer();
        java.lang.Object obj67 = unionContext65.getValue();
        boolean boolean68 = unionContext65.isChildOrderingRequired();
        unionContext65.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext70 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray71 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext72 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext70, evalContextArray71);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext73 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext65, evalContextArray71);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext74 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext62, evalContextArray71);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext75 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray71);
        boolean boolean76 = unionContext2.nextSet();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Empty expression context" + "'", str4, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(evalContextArray8);
        org.junit.Assert.assertArrayEquals(evalContextArray8, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(evalContextArray17);
        org.junit.Assert.assertArrayEquals(evalContextArray17, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(pointer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(evalContextArray23);
        org.junit.Assert.assertArrayEquals(evalContextArray23, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(pointer26);
        org.junit.Assert.assertNotNull(evalContextArray28);
        org.junit.Assert.assertArrayEquals(evalContextArray28, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray30);
        org.junit.Assert.assertNotNull(nodeSet32);
        org.junit.Assert.assertNotNull(evalContextArray34);
        org.junit.Assert.assertArrayEquals(evalContextArray34, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "[]");
        org.junit.Assert.assertNotNull(nodeSet38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(evalContextArray41);
        org.junit.Assert.assertArrayEquals(evalContextArray41, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(evalContextArray47);
        org.junit.Assert.assertArrayEquals(evalContextArray47, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(evalContextArray54);
        org.junit.Assert.assertArrayEquals(evalContextArray54, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray58);
        org.junit.Assert.assertArrayEquals(evalContextArray58, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertNotNull(evalContextArray61);
        org.junit.Assert.assertNotNull(evalContextArray64);
        org.junit.Assert.assertArrayEquals(evalContextArray64, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer66);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertEquals(obj67.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj67), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj67), "[]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(evalContextArray71);
        org.junit.Assert.assertArrayEquals(evalContextArray71, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        java.lang.String str4 = unionContext2.toString();
        java.util.List list5 = unionContext2.getContextNodeList();
        boolean boolean6 = unionContext2.nextNode();
        boolean boolean7 = unionContext2.nextNode();
        org.apache.commons.jxpath.Pointer pointer8 = unionContext2.getSingleNodePointer();
        org.apache.commons.jxpath.Pointer pointer9 = unionContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext10 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray11 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext12 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext10, evalContextArray11);
        boolean boolean13 = unionContext12.nextSet();
        org.apache.commons.jxpath.Pointer pointer14 = unionContext12.getContextNodePointer();
        boolean boolean15 = unionContext12.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray17 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext18 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray17);
        boolean boolean19 = unionContext18.nextSet();
        org.apache.commons.jxpath.Pointer pointer20 = unionContext18.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext21 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray22 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext23 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext21, evalContextArray22);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray24 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext18, evalContext21 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext25 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext12, evalContextArray24);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext26 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray24);
        boolean boolean27 = unionContext2.hasNext();
        int int28 = unionContext2.getDocumentOrder();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Empty expression context" + "'", str4, "Empty expression context");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(pointer8);
        org.junit.Assert.assertNull(pointer9);
        org.junit.Assert.assertNotNull(evalContextArray11);
        org.junit.Assert.assertArrayEquals(evalContextArray11, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(pointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(evalContextArray17);
        org.junit.Assert.assertArrayEquals(evalContextArray17, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(pointer20);
        org.junit.Assert.assertNotNull(evalContextArray22);
        org.junit.Assert.assertArrayEquals(evalContextArray22, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        unionContext2.reset();
        boolean boolean6 = unionContext2.hasNext();
        int int7 = unionContext2.getDocumentOrder();
        org.apache.commons.jxpath.NodeSet nodeSet8 = unionContext2.getNodeSet();
        java.lang.Object obj9 = unionContext2.getValue();
        boolean boolean10 = unionContext2.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = unionContext2.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(nodeSet8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        java.util.List list5 = unionContext2.getContextNodeList();
        int int6 = unionContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray8 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext9 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext7, evalContextArray8);
        java.util.List list10 = unionContext9.getContextNodeList();
        unionContext9.reset();
        java.util.List list12 = unionContext9.getContextNodeList();
        int int13 = unionContext9.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext14 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray15 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext16 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext14, evalContextArray15);
        boolean boolean17 = unionContext16.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer18 = unionContext16.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext19 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray20 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext21 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext19, evalContextArray20);
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray23 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext24 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext22, evalContextArray23);
        boolean boolean25 = unionContext24.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext26 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray27 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext28 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext26, evalContextArray27);
        boolean boolean29 = unionContext28.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext30 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray31 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext32 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext30, evalContextArray31);
        java.util.List list33 = unionContext32.getContextNodeList();
        unionContext32.reset();
        java.util.List list35 = unionContext32.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext36 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray37 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext38 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext36, evalContextArray37);
        java.util.List list39 = unionContext38.getContextNodeList();
        unionContext38.reset();
        java.util.List list41 = unionContext38.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext42 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray43 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext44 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext42, evalContextArray43);
        java.util.List list45 = unionContext44.getContextNodeList();
        unionContext44.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray47 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext19, unionContext24, unionContext28, unionContext32, unionContext38, unionContext44 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext48 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext16, evalContextArray47);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext49 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext9, evalContextArray47);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext50 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray47);
        java.lang.Object obj51 = unionContext2.getValue();
        org.apache.commons.jxpath.Pointer pointer52 = unionContext2.getSingleNodePointer();
        boolean boolean53 = unionContext2.nextSet();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer54 = unionContext2.getCurrentNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            unionContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(evalContextArray8);
        org.junit.Assert.assertArrayEquals(evalContextArray8, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(evalContextArray15);
        org.junit.Assert.assertArrayEquals(evalContextArray15, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(pointer18);
        org.junit.Assert.assertNotNull(evalContextArray20);
        org.junit.Assert.assertArrayEquals(evalContextArray20, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray23);
        org.junit.Assert.assertArrayEquals(evalContextArray23, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(evalContextArray27);
        org.junit.Assert.assertArrayEquals(evalContextArray27, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(evalContextArray31);
        org.junit.Assert.assertArrayEquals(evalContextArray31, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(evalContextArray37);
        org.junit.Assert.assertArrayEquals(evalContextArray37, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(evalContextArray43);
        org.junit.Assert.assertArrayEquals(evalContextArray43, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(evalContextArray47);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "[]");
        org.junit.Assert.assertNull(pointer52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(nodePointer54);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.Pointer pointer3 = unionContext2.getSingleNodePointer();
        int int4 = unionContext2.getCurrentPosition();
        int int5 = unionContext2.getCurrentPosition();
        java.util.List list6 = unionContext2.getContextNodeList();
        int int7 = unionContext2.getPosition();
        java.lang.Class<?> wildcardClass8 = unionContext2.getClass();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        unionContext2.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray5 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext6 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray5);
        boolean boolean7 = unionContext6.hasNext();
        int int8 = unionContext6.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext9 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray10 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext11 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext9, evalContextArray10);
        boolean boolean12 = unionContext11.nextSet();
        org.apache.commons.jxpath.Pointer pointer13 = unionContext11.getContextNodePointer();
        boolean boolean14 = unionContext11.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext15 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray16 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext17 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext15, evalContextArray16);
        boolean boolean18 = unionContext17.nextSet();
        org.apache.commons.jxpath.Pointer pointer19 = unionContext17.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext20 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray21 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext22 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext20, evalContextArray21);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray23 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext17, evalContext20 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext24 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext11, evalContextArray23);
        org.apache.commons.jxpath.NodeSet nodeSet25 = unionContext11.getNodeSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext26 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray27 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext28 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext26, evalContextArray27);
        org.apache.commons.jxpath.Pointer pointer29 = unionContext28.getContextNodePointer();
        java.lang.Object obj30 = unionContext28.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet31 = unionContext28.getNodeSet();
        int int32 = unionContext28.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext33 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray34 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext35 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext33, evalContextArray34);
        org.apache.commons.jxpath.Pointer pointer36 = unionContext35.getSingleNodePointer();
        int int37 = unionContext35.getCurrentPosition();
        int int38 = unionContext35.getDocumentOrder();
        org.apache.commons.jxpath.ri.EvalContext evalContext39 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray40 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext41 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext39, evalContextArray40);
        boolean boolean42 = unionContext41.nextNode();
        int int43 = unionContext41.getDocumentOrder();
        boolean boolean44 = unionContext41.isChildOrderingRequired();
        java.util.List list45 = unionContext41.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext46 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray47 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext48 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext46, evalContextArray47);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext49 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext41, evalContextArray47);
        org.apache.commons.jxpath.ri.EvalContext evalContext50 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray51 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext52 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext50, evalContextArray51);
        java.util.List list53 = unionContext52.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray54 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext6, unionContext11, unionContext28, unionContext35, unionContext49, unionContext52 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext55 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray54);
        // The following exception was thrown during execution in test generation
        try {
            unionContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray5);
        org.junit.Assert.assertArrayEquals(evalContextArray5, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(evalContextArray10);
        org.junit.Assert.assertArrayEquals(evalContextArray10, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(pointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(evalContextArray16);
        org.junit.Assert.assertArrayEquals(evalContextArray16, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(pointer19);
        org.junit.Assert.assertNotNull(evalContextArray21);
        org.junit.Assert.assertArrayEquals(evalContextArray21, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray23);
        org.junit.Assert.assertNotNull(nodeSet25);
        org.junit.Assert.assertNotNull(evalContextArray27);
        org.junit.Assert.assertArrayEquals(evalContextArray27, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "[]");
        org.junit.Assert.assertNotNull(nodeSet31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(evalContextArray34);
        org.junit.Assert.assertArrayEquals(evalContextArray34, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(evalContextArray40);
        org.junit.Assert.assertArrayEquals(evalContextArray40, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(evalContextArray47);
        org.junit.Assert.assertArrayEquals(evalContextArray47, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray51);
        org.junit.Assert.assertArrayEquals(evalContextArray51, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(evalContextArray54);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        java.util.List list5 = unionContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray7 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext6, evalContextArray7);
        boolean boolean10 = unionContext8.setPosition((int) (byte) 100);
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        boolean boolean14 = unionContext13.nextSet();
        int int15 = unionContext13.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray17 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext18 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray17);
        boolean boolean19 = unionContext18.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer20 = unionContext18.getContextNodePointer();
        java.lang.Object obj21 = unionContext18.getValue();
        boolean boolean22 = unionContext18.nextNode();
        org.apache.commons.jxpath.ri.EvalContext evalContext23 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray24 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext25 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext23, evalContextArray24);
        boolean boolean27 = unionContext25.setPosition((int) (byte) 100);
        int int28 = unionContext25.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext29 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray30 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext31 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext29, evalContextArray30);
        boolean boolean32 = unionContext31.nextSet();
        org.apache.commons.jxpath.Pointer pointer33 = unionContext31.getContextNodePointer();
        boolean boolean34 = unionContext31.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext35 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray36 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext37 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext35, evalContextArray36);
        boolean boolean38 = unionContext37.nextSet();
        org.apache.commons.jxpath.Pointer pointer39 = unionContext37.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext40 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray41 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext42 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext40, evalContextArray41);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray43 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext37, evalContext40 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext44 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext31, evalContextArray43);
        boolean boolean45 = unionContext31.nextSet();
        boolean boolean46 = unionContext31.hasNext();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray47 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext8, unionContext13, unionContext18, unionContext25, unionContext31 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext48 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray47);
        java.util.List list49 = unionContext48.getContextNodeList();
        unionContext48.reset();
        boolean boolean51 = unionContext48.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = unionContext48.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(evalContextArray7);
        org.junit.Assert.assertArrayEquals(evalContextArray7, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(evalContextArray17);
        org.junit.Assert.assertArrayEquals(evalContextArray17, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(pointer20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(evalContextArray24);
        org.junit.Assert.assertArrayEquals(evalContextArray24, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(evalContextArray30);
        org.junit.Assert.assertArrayEquals(evalContextArray30, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(pointer33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(evalContextArray36);
        org.junit.Assert.assertArrayEquals(evalContextArray36, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(pointer39);
        org.junit.Assert.assertNotNull(evalContextArray41);
        org.junit.Assert.assertArrayEquals(evalContextArray41, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(evalContextArray47);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.Pointer pointer3 = unionContext2.getContextNodePointer();
        java.lang.Object obj4 = unionContext2.getValue();
        boolean boolean5 = unionContext2.isChildOrderingRequired();
        unionContext2.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray8 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext9 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext7, evalContextArray8);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext10 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray8);
        int int11 = unionContext10.getDocumentOrder();
        int int12 = unionContext10.getPosition();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(evalContextArray8);
        org.junit.Assert.assertArrayEquals(evalContextArray8, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.NodeSet nodeSet3 = unionContext2.getNodeSet();
        boolean boolean4 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext5, evalContextArray6);
        boolean boolean8 = unionContext7.nextSet();
        org.apache.commons.jxpath.Pointer pointer9 = unionContext7.getContextNodePointer();
        java.util.List list10 = unionContext7.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        boolean boolean15 = unionContext13.setPosition((int) (byte) 100);
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray17 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext18 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray17);
        boolean boolean19 = unionContext18.nextSet();
        int int20 = unionContext18.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext21 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray22 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext23 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext21, evalContextArray22);
        boolean boolean24 = unionContext23.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer25 = unionContext23.getContextNodePointer();
        java.lang.Object obj26 = unionContext23.getValue();
        boolean boolean27 = unionContext23.nextNode();
        org.apache.commons.jxpath.ri.EvalContext evalContext28 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray29 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext30 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext28, evalContextArray29);
        boolean boolean32 = unionContext30.setPosition((int) (byte) 100);
        int int33 = unionContext30.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext34 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray35 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext36 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext34, evalContextArray35);
        boolean boolean37 = unionContext36.nextSet();
        org.apache.commons.jxpath.Pointer pointer38 = unionContext36.getContextNodePointer();
        boolean boolean39 = unionContext36.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext40 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray41 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext42 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext40, evalContextArray41);
        boolean boolean43 = unionContext42.nextSet();
        org.apache.commons.jxpath.Pointer pointer44 = unionContext42.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext45 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray46 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext47 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext45, evalContextArray46);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray48 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext42, evalContext45 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext49 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext36, evalContextArray48);
        boolean boolean50 = unionContext36.nextSet();
        boolean boolean51 = unionContext36.hasNext();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray52 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext13, unionContext18, unionContext23, unionContext30, unionContext36 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext53 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext7, evalContextArray52);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext54 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray52);
        boolean boolean56 = unionContext2.setPosition(0);
        unionContext2.reset();
        boolean boolean58 = unionContext2.nextSet();
        org.apache.commons.jxpath.NodeSet nodeSet59 = unionContext2.getNodeSet();
        org.apache.commons.jxpath.NodeSet nodeSet60 = unionContext2.getNodeSet();
        int int61 = unionContext2.getPosition();
        int int62 = unionContext2.getCurrentPosition();
        int int63 = unionContext2.getCurrentPosition();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(pointer9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(evalContextArray17);
        org.junit.Assert.assertArrayEquals(evalContextArray17, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(evalContextArray22);
        org.junit.Assert.assertArrayEquals(evalContextArray22, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(pointer25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(evalContextArray29);
        org.junit.Assert.assertArrayEquals(evalContextArray29, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(evalContextArray35);
        org.junit.Assert.assertArrayEquals(evalContextArray35, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(pointer38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(evalContextArray41);
        org.junit.Assert.assertArrayEquals(evalContextArray41, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(pointer44);
        org.junit.Assert.assertNotNull(evalContextArray46);
        org.junit.Assert.assertArrayEquals(evalContextArray46, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(evalContextArray52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(nodeSet59);
        org.junit.Assert.assertNotNull(nodeSet60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        java.lang.Object obj5 = unionContext2.getValue();
        boolean boolean6 = unionContext2.nextNode();
        java.util.List list7 = unionContext2.getContextNodeList();
        org.apache.commons.jxpath.NodeSet nodeSet8 = unionContext2.getNodeSet();
        boolean boolean10 = unionContext2.setPosition((int) (byte) 10);
        boolean boolean11 = unionContext2.hasNext();
        boolean boolean12 = unionContext2.nextNode();
        org.apache.commons.jxpath.NodeSet nodeSet13 = unionContext2.getNodeSet();
        int int14 = unionContext2.getDocumentOrder();
        boolean boolean15 = unionContext2.nextNode();
        java.lang.Object obj16 = unionContext2.getValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext17 = unionContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(nodeSet8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "[]");
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        java.util.List list5 = unionContext2.getContextNodeList();
        int int6 = unionContext2.getCurrentPosition();
        boolean boolean7 = unionContext2.isChildOrderingRequired();
        boolean boolean9 = unionContext2.setPosition((int) (short) 100);
        int int10 = unionContext2.getCurrentPosition();
        boolean boolean11 = unionContext2.hasNext();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext5, evalContextArray6);
        org.apache.commons.jxpath.ri.EvalContext evalContext8 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray9 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext10 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext8, evalContextArray9);
        boolean boolean11 = unionContext10.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray13 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext14 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext12, evalContextArray13);
        boolean boolean15 = unionContext14.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray17 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext18 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray17);
        java.util.List list19 = unionContext18.getContextNodeList();
        unionContext18.reset();
        java.util.List list21 = unionContext18.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray23 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext24 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext22, evalContextArray23);
        java.util.List list25 = unionContext24.getContextNodeList();
        unionContext24.reset();
        java.util.List list27 = unionContext24.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext28 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray29 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext30 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext28, evalContextArray29);
        java.util.List list31 = unionContext30.getContextNodeList();
        unionContext30.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray33 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5, unionContext10, unionContext14, unionContext18, unionContext24, unionContext30 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext34 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray33);
        boolean boolean36 = unionContext2.setPosition((int) '4');
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray9);
        org.junit.Assert.assertArrayEquals(evalContextArray9, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(evalContextArray13);
        org.junit.Assert.assertArrayEquals(evalContextArray13, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(evalContextArray17);
        org.junit.Assert.assertArrayEquals(evalContextArray17, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(evalContextArray23);
        org.junit.Assert.assertArrayEquals(evalContextArray23, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(evalContextArray29);
        org.junit.Assert.assertArrayEquals(evalContextArray29, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(evalContextArray33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        java.util.List list5 = unionContext2.getContextNodeList();
        int int6 = unionContext2.getCurrentPosition();
        boolean boolean7 = unionContext2.isChildOrderingRequired();
        int int8 = unionContext2.getDocumentOrder();
        int int9 = unionContext2.getDocumentOrder();
        int int10 = unionContext2.getDocumentOrder();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray11 = null;
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext12 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray11);
        boolean boolean14 = unionContext2.setPosition(2);
        boolean boolean16 = unionContext2.setPosition((-1));
        int int17 = unionContext2.getDocumentOrder();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.NodeSet nodeSet3 = unionContext2.getNodeSet();
        java.lang.String str4 = unionContext2.toString();
        boolean boolean5 = unionContext2.hasNext();
        org.apache.commons.jxpath.Pointer pointer6 = unionContext2.getSingleNodePointer();
        boolean boolean8 = unionContext2.setPosition((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = unionContext2.getClass();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Empty expression context" + "'", str4, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = unionContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext5, evalContextArray6);
        org.apache.commons.jxpath.Pointer pointer8 = unionContext7.getContextNodePointer();
        java.lang.Object obj9 = unionContext7.getValue();
        boolean boolean10 = unionContext7.isChildOrderingRequired();
        unionContext7.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray13 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext14 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext12, evalContextArray13);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext15 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext7, evalContextArray13);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext16 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray13);
        int int17 = unionContext2.getCurrentPosition();
        java.util.List list18 = unionContext2.getContextNodeList();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(evalContextArray13);
        org.junit.Assert.assertArrayEquals(evalContextArray13, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.NodeSet nodeSet3 = unionContext2.getNodeSet();
        boolean boolean4 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext5, evalContextArray6);
        boolean boolean8 = unionContext7.nextSet();
        org.apache.commons.jxpath.Pointer pointer9 = unionContext7.getContextNodePointer();
        java.util.List list10 = unionContext7.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        boolean boolean15 = unionContext13.setPosition((int) (byte) 100);
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray17 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext18 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray17);
        boolean boolean19 = unionContext18.nextSet();
        int int20 = unionContext18.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext21 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray22 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext23 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext21, evalContextArray22);
        boolean boolean24 = unionContext23.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer25 = unionContext23.getContextNodePointer();
        java.lang.Object obj26 = unionContext23.getValue();
        boolean boolean27 = unionContext23.nextNode();
        org.apache.commons.jxpath.ri.EvalContext evalContext28 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray29 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext30 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext28, evalContextArray29);
        boolean boolean32 = unionContext30.setPosition((int) (byte) 100);
        int int33 = unionContext30.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext34 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray35 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext36 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext34, evalContextArray35);
        boolean boolean37 = unionContext36.nextSet();
        org.apache.commons.jxpath.Pointer pointer38 = unionContext36.getContextNodePointer();
        boolean boolean39 = unionContext36.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext40 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray41 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext42 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext40, evalContextArray41);
        boolean boolean43 = unionContext42.nextSet();
        org.apache.commons.jxpath.Pointer pointer44 = unionContext42.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext45 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray46 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext47 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext45, evalContextArray46);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray48 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext42, evalContext45 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext49 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext36, evalContextArray48);
        boolean boolean50 = unionContext36.nextSet();
        boolean boolean51 = unionContext36.hasNext();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray52 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext13, unionContext18, unionContext23, unionContext30, unionContext36 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext53 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext7, evalContextArray52);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext54 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray52);
        boolean boolean56 = unionContext2.setPosition(0);
        org.apache.commons.jxpath.Pointer pointer57 = unionContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer58 = unionContext2.getContextNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(pointer9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(evalContextArray17);
        org.junit.Assert.assertArrayEquals(evalContextArray17, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(evalContextArray22);
        org.junit.Assert.assertArrayEquals(evalContextArray22, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(pointer25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(evalContextArray29);
        org.junit.Assert.assertArrayEquals(evalContextArray29, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(evalContextArray35);
        org.junit.Assert.assertArrayEquals(evalContextArray35, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(pointer38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(evalContextArray41);
        org.junit.Assert.assertArrayEquals(evalContextArray41, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(pointer44);
        org.junit.Assert.assertNotNull(evalContextArray46);
        org.junit.Assert.assertArrayEquals(evalContextArray46, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(evalContextArray52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(pointer57);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.hasNext();
        java.lang.Object obj4 = unionContext2.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet5 = unionContext2.getNodeSet();
        int int6 = unionContext2.getCurrentPosition();
        boolean boolean7 = unionContext2.hasNext();
        boolean boolean8 = unionContext2.isChildOrderingRequired();
        boolean boolean9 = unionContext2.hasNext();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[]");
        org.junit.Assert.assertNotNull(nodeSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.hasNext();
        int int4 = unionContext2.getPosition();
        int int5 = unionContext2.getCurrentPosition();
        int int6 = unionContext2.getDocumentOrder();
        java.lang.Object obj7 = unionContext2.getValue();
        int int8 = unionContext2.getDocumentOrder();
        java.lang.Object obj9 = unionContext2.getValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = unionContext2.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[]");
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.Pointer pointer3 = unionContext2.getContextNodePointer();
        java.lang.Object obj4 = unionContext2.getValue();
        boolean boolean5 = unionContext2.isChildOrderingRequired();
        unionContext2.reset();
        org.apache.commons.jxpath.Pointer pointer7 = unionContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext8 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray9 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext10 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext8, evalContextArray9);
        boolean boolean12 = unionContext10.setPosition((int) (byte) 100);
        boolean boolean13 = unionContext10.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext14 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray15 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext16 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext14, evalContextArray15);
        boolean boolean17 = unionContext16.nextNode();
        boolean boolean19 = unionContext16.setPosition(52);
        org.apache.commons.jxpath.ri.EvalContext evalContext20 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray21 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext22 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext20, evalContextArray21);
        boolean boolean23 = unionContext22.nextSet();
        org.apache.commons.jxpath.Pointer pointer24 = unionContext22.getContextNodePointer();
        java.util.List list25 = unionContext22.getContextNodeList();
        int int26 = unionContext22.getCurrentPosition();
        boolean boolean27 = unionContext22.isChildOrderingRequired();
        boolean boolean29 = unionContext22.setPosition((int) (short) 100);
        org.apache.commons.jxpath.Pointer pointer30 = unionContext22.getSingleNodePointer();
        org.apache.commons.jxpath.Pointer pointer31 = unionContext22.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext32 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray33 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext34 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext32, evalContextArray33);
        java.util.List list35 = unionContext34.getContextNodeList();
        unionContext34.reset();
        java.util.List list37 = unionContext34.getContextNodeList();
        int int38 = unionContext34.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext39 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray40 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext41 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext39, evalContextArray40);
        org.apache.commons.jxpath.Pointer pointer42 = unionContext41.getContextNodePointer();
        java.lang.Object obj43 = unionContext41.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet44 = unionContext41.getNodeSet();
        int int45 = unionContext41.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext46 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray47 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext48 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext46, evalContextArray47);
        java.util.List list49 = unionContext48.getContextNodeList();
        unionContext48.reset();
        java.util.List list51 = unionContext48.getContextNodeList();
        int int52 = unionContext48.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext53 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray54 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext55 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext53, evalContextArray54);
        boolean boolean56 = unionContext55.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer57 = unionContext55.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext58 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray59 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext60 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext58, evalContextArray59);
        org.apache.commons.jxpath.ri.EvalContext evalContext61 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray62 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext63 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext61, evalContextArray62);
        boolean boolean64 = unionContext63.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext65 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray66 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext67 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext65, evalContextArray66);
        boolean boolean68 = unionContext67.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext69 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray70 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext71 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext69, evalContextArray70);
        java.util.List list72 = unionContext71.getContextNodeList();
        unionContext71.reset();
        java.util.List list74 = unionContext71.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext75 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray76 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext77 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext75, evalContextArray76);
        java.util.List list78 = unionContext77.getContextNodeList();
        unionContext77.reset();
        java.util.List list80 = unionContext77.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext81 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray82 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext83 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext81, evalContextArray82);
        java.util.List list84 = unionContext83.getContextNodeList();
        unionContext83.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray86 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext58, unionContext63, unionContext67, unionContext71, unionContext77, unionContext83 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext87 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext55, evalContextArray86);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext88 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext48, evalContextArray86);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext89 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext41, evalContextArray86);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext90 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext34, evalContextArray86);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext91 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext22, evalContextArray86);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext92 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext16, evalContextArray86);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext93 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext10, evalContextArray86);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext94 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray86);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext95 = unionContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertNotNull(evalContextArray9);
        org.junit.Assert.assertArrayEquals(evalContextArray9, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(evalContextArray15);
        org.junit.Assert.assertArrayEquals(evalContextArray15, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(evalContextArray21);
        org.junit.Assert.assertArrayEquals(evalContextArray21, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(pointer24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(pointer30);
        org.junit.Assert.assertNull(pointer31);
        org.junit.Assert.assertNotNull(evalContextArray33);
        org.junit.Assert.assertArrayEquals(evalContextArray33, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(evalContextArray40);
        org.junit.Assert.assertArrayEquals(evalContextArray40, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer42);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "[]");
        org.junit.Assert.assertNotNull(nodeSet44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(evalContextArray47);
        org.junit.Assert.assertArrayEquals(evalContextArray47, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(evalContextArray54);
        org.junit.Assert.assertArrayEquals(evalContextArray54, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(pointer57);
        org.junit.Assert.assertNotNull(evalContextArray59);
        org.junit.Assert.assertArrayEquals(evalContextArray59, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray62);
        org.junit.Assert.assertArrayEquals(evalContextArray62, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(evalContextArray66);
        org.junit.Assert.assertArrayEquals(evalContextArray66, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(evalContextArray70);
        org.junit.Assert.assertArrayEquals(evalContextArray70, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list72);
        org.junit.Assert.assertNotNull(list74);
        org.junit.Assert.assertNotNull(evalContextArray76);
        org.junit.Assert.assertArrayEquals(evalContextArray76, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list78);
        org.junit.Assert.assertNotNull(list80);
        org.junit.Assert.assertNotNull(evalContextArray82);
        org.junit.Assert.assertArrayEquals(evalContextArray82, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list84);
        org.junit.Assert.assertNotNull(evalContextArray86);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.NodeSet nodeSet3 = unionContext2.getNodeSet();
        java.lang.String str4 = unionContext2.toString();
        unionContext2.reset();
        int int6 = unionContext2.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray8 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext9 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext7, evalContextArray8);
        unionContext9.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        boolean boolean14 = unionContext13.hasNext();
        int int15 = unionContext13.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray17 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext18 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray17);
        boolean boolean19 = unionContext18.nextSet();
        org.apache.commons.jxpath.Pointer pointer20 = unionContext18.getContextNodePointer();
        boolean boolean21 = unionContext18.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray23 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext24 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext22, evalContextArray23);
        boolean boolean25 = unionContext24.nextSet();
        org.apache.commons.jxpath.Pointer pointer26 = unionContext24.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext27 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray28 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext29 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext27, evalContextArray28);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray30 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext24, evalContext27 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext31 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext18, evalContextArray30);
        org.apache.commons.jxpath.NodeSet nodeSet32 = unionContext18.getNodeSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext33 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray34 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext35 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext33, evalContextArray34);
        org.apache.commons.jxpath.Pointer pointer36 = unionContext35.getContextNodePointer();
        java.lang.Object obj37 = unionContext35.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet38 = unionContext35.getNodeSet();
        int int39 = unionContext35.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext40 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray41 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext42 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext40, evalContextArray41);
        org.apache.commons.jxpath.Pointer pointer43 = unionContext42.getSingleNodePointer();
        int int44 = unionContext42.getCurrentPosition();
        int int45 = unionContext42.getDocumentOrder();
        org.apache.commons.jxpath.ri.EvalContext evalContext46 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray47 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext48 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext46, evalContextArray47);
        boolean boolean49 = unionContext48.nextNode();
        int int50 = unionContext48.getDocumentOrder();
        boolean boolean51 = unionContext48.isChildOrderingRequired();
        java.util.List list52 = unionContext48.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext53 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray54 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext55 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext53, evalContextArray54);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext56 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext48, evalContextArray54);
        org.apache.commons.jxpath.ri.EvalContext evalContext57 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray58 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext59 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext57, evalContextArray58);
        java.util.List list60 = unionContext59.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray61 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext13, unionContext18, unionContext35, unionContext42, unionContext56, unionContext59 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext62 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext9, evalContextArray61);
        org.apache.commons.jxpath.ri.EvalContext evalContext63 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray64 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext65 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext63, evalContextArray64);
        org.apache.commons.jxpath.Pointer pointer66 = unionContext65.getContextNodePointer();
        java.lang.Object obj67 = unionContext65.getValue();
        boolean boolean68 = unionContext65.isChildOrderingRequired();
        unionContext65.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext70 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray71 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext72 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext70, evalContextArray71);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext73 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext65, evalContextArray71);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext74 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext62, evalContextArray71);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext75 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray71);
        unionContext2.reset();
        org.apache.commons.jxpath.NodeSet nodeSet77 = unionContext2.getNodeSet();
        java.util.List list78 = unionContext2.getContextNodeList();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Empty expression context" + "'", str4, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(evalContextArray8);
        org.junit.Assert.assertArrayEquals(evalContextArray8, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(evalContextArray17);
        org.junit.Assert.assertArrayEquals(evalContextArray17, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(pointer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(evalContextArray23);
        org.junit.Assert.assertArrayEquals(evalContextArray23, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(pointer26);
        org.junit.Assert.assertNotNull(evalContextArray28);
        org.junit.Assert.assertArrayEquals(evalContextArray28, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray30);
        org.junit.Assert.assertNotNull(nodeSet32);
        org.junit.Assert.assertNotNull(evalContextArray34);
        org.junit.Assert.assertArrayEquals(evalContextArray34, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "[]");
        org.junit.Assert.assertNotNull(nodeSet38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(evalContextArray41);
        org.junit.Assert.assertArrayEquals(evalContextArray41, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(evalContextArray47);
        org.junit.Assert.assertArrayEquals(evalContextArray47, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(evalContextArray54);
        org.junit.Assert.assertArrayEquals(evalContextArray54, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray58);
        org.junit.Assert.assertArrayEquals(evalContextArray58, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertNotNull(evalContextArray61);
        org.junit.Assert.assertNotNull(evalContextArray64);
        org.junit.Assert.assertArrayEquals(evalContextArray64, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer66);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertEquals(obj67.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj67), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj67), "[]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(evalContextArray71);
        org.junit.Assert.assertArrayEquals(evalContextArray71, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet77);
        org.junit.Assert.assertNotNull(list78);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.isChildOrderingRequired();
        java.lang.String str4 = unionContext2.toString();
        int int5 = unionContext2.getCurrentPosition();
        org.apache.commons.jxpath.Pointer pointer6 = unionContext2.getSingleNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext7 = unionContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Empty expression context" + "'", str4, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(pointer6);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        unionContext2.reset();
        int int4 = unionContext2.getPosition();
        org.apache.commons.jxpath.NodeSet nodeSet5 = unionContext2.getNodeSet();
        boolean boolean6 = unionContext2.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray8 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext9 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext7, evalContextArray8);
        unionContext9.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        boolean boolean14 = unionContext13.hasNext();
        int int15 = unionContext13.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray17 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext18 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray17);
        boolean boolean19 = unionContext18.nextSet();
        org.apache.commons.jxpath.Pointer pointer20 = unionContext18.getContextNodePointer();
        boolean boolean21 = unionContext18.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray23 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext24 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext22, evalContextArray23);
        boolean boolean25 = unionContext24.nextSet();
        org.apache.commons.jxpath.Pointer pointer26 = unionContext24.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext27 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray28 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext29 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext27, evalContextArray28);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray30 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext24, evalContext27 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext31 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext18, evalContextArray30);
        org.apache.commons.jxpath.NodeSet nodeSet32 = unionContext18.getNodeSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext33 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray34 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext35 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext33, evalContextArray34);
        org.apache.commons.jxpath.Pointer pointer36 = unionContext35.getContextNodePointer();
        java.lang.Object obj37 = unionContext35.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet38 = unionContext35.getNodeSet();
        int int39 = unionContext35.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext40 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray41 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext42 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext40, evalContextArray41);
        org.apache.commons.jxpath.Pointer pointer43 = unionContext42.getSingleNodePointer();
        int int44 = unionContext42.getCurrentPosition();
        int int45 = unionContext42.getDocumentOrder();
        org.apache.commons.jxpath.ri.EvalContext evalContext46 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray47 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext48 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext46, evalContextArray47);
        boolean boolean49 = unionContext48.nextNode();
        int int50 = unionContext48.getDocumentOrder();
        boolean boolean51 = unionContext48.isChildOrderingRequired();
        java.util.List list52 = unionContext48.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext53 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray54 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext55 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext53, evalContextArray54);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext56 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext48, evalContextArray54);
        org.apache.commons.jxpath.ri.EvalContext evalContext57 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray58 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext59 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext57, evalContextArray58);
        java.util.List list60 = unionContext59.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray61 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext13, unionContext18, unionContext35, unionContext42, unionContext56, unionContext59 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext62 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext9, evalContextArray61);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext63 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray61);
        int int64 = unionContext63.getPosition();
        unionContext63.reset();
        // The following exception was thrown during execution in test generation
        try {
            unionContext63.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(evalContextArray8);
        org.junit.Assert.assertArrayEquals(evalContextArray8, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(evalContextArray17);
        org.junit.Assert.assertArrayEquals(evalContextArray17, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(pointer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(evalContextArray23);
        org.junit.Assert.assertArrayEquals(evalContextArray23, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(pointer26);
        org.junit.Assert.assertNotNull(evalContextArray28);
        org.junit.Assert.assertArrayEquals(evalContextArray28, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray30);
        org.junit.Assert.assertNotNull(nodeSet32);
        org.junit.Assert.assertNotNull(evalContextArray34);
        org.junit.Assert.assertArrayEquals(evalContextArray34, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "[]");
        org.junit.Assert.assertNotNull(nodeSet38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(evalContextArray41);
        org.junit.Assert.assertArrayEquals(evalContextArray41, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(evalContextArray47);
        org.junit.Assert.assertArrayEquals(evalContextArray47, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(evalContextArray54);
        org.junit.Assert.assertArrayEquals(evalContextArray54, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray58);
        org.junit.Assert.assertArrayEquals(evalContextArray58, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertNotNull(evalContextArray61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.Pointer pointer3 = unionContext2.getContextNodePointer();
        java.lang.Object obj4 = unionContext2.getValue();
        boolean boolean5 = unionContext2.isChildOrderingRequired();
        unionContext2.reset();
        unionContext2.reset();
        boolean boolean8 = unionContext2.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = unionContext2.getCurrentNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        java.util.List list5 = unionContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray7 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext6, evalContextArray7);
        boolean boolean10 = unionContext8.setPosition((int) (byte) 100);
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        boolean boolean14 = unionContext13.nextSet();
        int int15 = unionContext13.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray17 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext18 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray17);
        boolean boolean19 = unionContext18.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer20 = unionContext18.getContextNodePointer();
        java.lang.Object obj21 = unionContext18.getValue();
        boolean boolean22 = unionContext18.nextNode();
        org.apache.commons.jxpath.ri.EvalContext evalContext23 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray24 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext25 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext23, evalContextArray24);
        boolean boolean27 = unionContext25.setPosition((int) (byte) 100);
        int int28 = unionContext25.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext29 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray30 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext31 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext29, evalContextArray30);
        boolean boolean32 = unionContext31.nextSet();
        org.apache.commons.jxpath.Pointer pointer33 = unionContext31.getContextNodePointer();
        boolean boolean34 = unionContext31.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext35 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray36 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext37 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext35, evalContextArray36);
        boolean boolean38 = unionContext37.nextSet();
        org.apache.commons.jxpath.Pointer pointer39 = unionContext37.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext40 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray41 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext42 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext40, evalContextArray41);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray43 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext37, evalContext40 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext44 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext31, evalContextArray43);
        boolean boolean45 = unionContext31.nextSet();
        boolean boolean46 = unionContext31.hasNext();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray47 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext8, unionContext13, unionContext18, unionContext25, unionContext31 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext48 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray47);
        boolean boolean49 = unionContext2.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext50 = unionContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(evalContextArray7);
        org.junit.Assert.assertArrayEquals(evalContextArray7, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(evalContextArray17);
        org.junit.Assert.assertArrayEquals(evalContextArray17, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(pointer20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(evalContextArray24);
        org.junit.Assert.assertArrayEquals(evalContextArray24, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(evalContextArray30);
        org.junit.Assert.assertArrayEquals(evalContextArray30, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(pointer33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(evalContextArray36);
        org.junit.Assert.assertArrayEquals(evalContextArray36, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(pointer39);
        org.junit.Assert.assertNotNull(evalContextArray41);
        org.junit.Assert.assertArrayEquals(evalContextArray41, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(evalContextArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        java.util.List list3 = unionContext2.getContextNodeList();
        java.lang.Object obj4 = unionContext2.getValue();
        org.apache.commons.jxpath.Pointer pointer5 = unionContext2.getSingleNodePointer();
        java.lang.Object obj6 = unionContext2.getValue();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[]");
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "[]");
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        boolean boolean5 = unionContext2.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray7 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext6, evalContextArray7);
        boolean boolean9 = unionContext8.nextSet();
        org.apache.commons.jxpath.Pointer pointer10 = unionContext8.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray14 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext8, evalContext11 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext15 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray14);
        int int16 = unionContext15.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext17 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray18 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext19 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext17, evalContextArray18);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext20 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext15, evalContextArray18);
        java.lang.Object obj21 = unionContext20.getValue();
        java.util.List list22 = unionContext20.getContextNodeList();
        java.lang.Class<?> wildcardClass23 = list22.getClass();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(evalContextArray7);
        org.junit.Assert.assertArrayEquals(evalContextArray7, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(evalContextArray18);
        org.junit.Assert.assertArrayEquals(evalContextArray18, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "[]");
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        java.lang.Object obj5 = unionContext2.getValue();
        boolean boolean6 = unionContext2.nextNode();
        java.util.List list7 = unionContext2.getContextNodeList();
        org.apache.commons.jxpath.NodeSet nodeSet8 = unionContext2.getNodeSet();
        boolean boolean9 = unionContext2.nextSet();
        boolean boolean10 = unionContext2.nextSet();
        unionContext2.reset();
        boolean boolean12 = unionContext2.nextNode();
        int int13 = unionContext2.getCurrentPosition();
        int int14 = unionContext2.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer15 = unionContext2.getContextNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(nodeSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        int int4 = unionContext2.getDocumentOrder();
        boolean boolean5 = unionContext2.hasNext();
        boolean boolean6 = unionContext2.isChildOrderingRequired();
        int int7 = unionContext2.getPosition();
        boolean boolean8 = unionContext2.nextSet();
        int int9 = unionContext2.getCurrentPosition();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        java.util.List list3 = unionContext2.getContextNodeList();
        unionContext2.reset();
        java.util.List list5 = unionContext2.getContextNodeList();
        int int6 = unionContext2.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray8 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext9 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext7, evalContextArray8);
        boolean boolean10 = unionContext9.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer11 = unionContext9.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray13 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext14 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext12, evalContextArray13);
        org.apache.commons.jxpath.ri.EvalContext evalContext15 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray16 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext17 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext15, evalContextArray16);
        boolean boolean18 = unionContext17.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext19 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray20 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext21 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext19, evalContextArray20);
        boolean boolean22 = unionContext21.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext23 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray24 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext25 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext23, evalContextArray24);
        java.util.List list26 = unionContext25.getContextNodeList();
        unionContext25.reset();
        java.util.List list28 = unionContext25.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext29 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray30 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext31 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext29, evalContextArray30);
        java.util.List list32 = unionContext31.getContextNodeList();
        unionContext31.reset();
        java.util.List list34 = unionContext31.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext35 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray36 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext37 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext35, evalContextArray36);
        java.util.List list38 = unionContext37.getContextNodeList();
        unionContext37.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray40 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext12, unionContext17, unionContext21, unionContext25, unionContext31, unionContext37 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext41 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext9, evalContextArray40);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext42 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray40);
        int int43 = unionContext42.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = unionContext42.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(evalContextArray8);
        org.junit.Assert.assertArrayEquals(evalContextArray8, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(pointer11);
        org.junit.Assert.assertNotNull(evalContextArray13);
        org.junit.Assert.assertArrayEquals(evalContextArray13, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray16);
        org.junit.Assert.assertArrayEquals(evalContextArray16, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(evalContextArray20);
        org.junit.Assert.assertArrayEquals(evalContextArray20, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(evalContextArray24);
        org.junit.Assert.assertArrayEquals(evalContextArray24, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(evalContextArray30);
        org.junit.Assert.assertArrayEquals(evalContextArray30, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(evalContextArray36);
        org.junit.Assert.assertArrayEquals(evalContextArray36, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(evalContextArray40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.Pointer pointer3 = unionContext2.getContextNodePointer();
        int int4 = unionContext2.getPosition();
        int int5 = unionContext2.getPosition();
        boolean boolean6 = unionContext2.isChildOrderingRequired();
        int int7 = unionContext2.getPosition();
        java.lang.Object obj8 = unionContext2.getValue();
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        java.util.List list5 = unionContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray7 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext6, evalContextArray7);
        boolean boolean10 = unionContext8.setPosition((int) (byte) 100);
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        boolean boolean14 = unionContext13.nextSet();
        int int15 = unionContext13.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray17 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext18 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray17);
        boolean boolean19 = unionContext18.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer20 = unionContext18.getContextNodePointer();
        java.lang.Object obj21 = unionContext18.getValue();
        boolean boolean22 = unionContext18.nextNode();
        org.apache.commons.jxpath.ri.EvalContext evalContext23 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray24 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext25 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext23, evalContextArray24);
        boolean boolean27 = unionContext25.setPosition((int) (byte) 100);
        int int28 = unionContext25.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext29 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray30 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext31 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext29, evalContextArray30);
        boolean boolean32 = unionContext31.nextSet();
        org.apache.commons.jxpath.Pointer pointer33 = unionContext31.getContextNodePointer();
        boolean boolean34 = unionContext31.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext35 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray36 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext37 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext35, evalContextArray36);
        boolean boolean38 = unionContext37.nextSet();
        org.apache.commons.jxpath.Pointer pointer39 = unionContext37.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext40 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray41 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext42 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext40, evalContextArray41);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray43 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext37, evalContext40 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext44 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext31, evalContextArray43);
        boolean boolean45 = unionContext31.nextSet();
        boolean boolean46 = unionContext31.hasNext();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray47 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext8, unionContext13, unionContext18, unionContext25, unionContext31 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext48 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray47);
        unionContext2.reset();
        java.lang.Object obj50 = unionContext2.getValue();
        org.apache.commons.jxpath.ri.EvalContext evalContext51 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray52 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext53 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext51, evalContextArray52);
        boolean boolean54 = unionContext53.nextSet();
        org.apache.commons.jxpath.Pointer pointer55 = unionContext53.getContextNodePointer();
        boolean boolean56 = unionContext53.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext57 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray58 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext59 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext57, evalContextArray58);
        boolean boolean60 = unionContext59.nextSet();
        org.apache.commons.jxpath.Pointer pointer61 = unionContext59.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext62 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray63 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext64 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext62, evalContextArray63);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray65 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext59, evalContext62 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext66 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext53, evalContextArray65);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext67 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray65);
        int int68 = unionContext2.getPosition();
        java.util.List list69 = unionContext2.getContextNodeList();
        unionContext2.reset();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(evalContextArray7);
        org.junit.Assert.assertArrayEquals(evalContextArray7, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(evalContextArray17);
        org.junit.Assert.assertArrayEquals(evalContextArray17, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(pointer20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(evalContextArray24);
        org.junit.Assert.assertArrayEquals(evalContextArray24, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(evalContextArray30);
        org.junit.Assert.assertArrayEquals(evalContextArray30, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(pointer33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(evalContextArray36);
        org.junit.Assert.assertArrayEquals(evalContextArray36, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(pointer39);
        org.junit.Assert.assertNotNull(evalContextArray41);
        org.junit.Assert.assertArrayEquals(evalContextArray41, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(evalContextArray47);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertEquals(obj50.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj50), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj50), "[]");
        org.junit.Assert.assertNotNull(evalContextArray52);
        org.junit.Assert.assertArrayEquals(evalContextArray52, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(pointer55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(evalContextArray58);
        org.junit.Assert.assertArrayEquals(evalContextArray58, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNull(pointer61);
        org.junit.Assert.assertNotNull(evalContextArray63);
        org.junit.Assert.assertArrayEquals(evalContextArray63, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(list69);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextNode();
        boolean boolean5 = unionContext2.setPosition(52);
        int int6 = unionContext2.getPosition();
        java.lang.Object obj7 = unionContext2.getValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = unionContext2.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[]");
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        boolean boolean5 = unionContext2.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray7 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext6, evalContextArray7);
        boolean boolean9 = unionContext8.nextSet();
        org.apache.commons.jxpath.Pointer pointer10 = unionContext8.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray14 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext8, evalContext11 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext15 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray14);
        boolean boolean16 = unionContext2.nextSet();
        boolean boolean17 = unionContext2.nextSet();
        int int18 = unionContext2.getPosition();
        unionContext2.reset();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer20 = unionContext2.getCurrentNodePointer();
        int int21 = unionContext2.getDocumentOrder();
        boolean boolean22 = unionContext2.isChildOrderingRequired();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(evalContextArray7);
        org.junit.Assert.assertArrayEquals(evalContextArray7, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(nodePointer20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        boolean boolean5 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer6 = unionContext2.getSingleNodePointer();
        java.util.List list7 = unionContext2.getContextNodeList();
        int int8 = unionContext2.getPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = unionContext2.getCurrentNodePointer();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(nodePointer9);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext5, evalContextArray6);
        org.apache.commons.jxpath.ri.EvalContext evalContext8 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray9 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext10 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext8, evalContextArray9);
        boolean boolean11 = unionContext10.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray13 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext14 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext12, evalContextArray13);
        boolean boolean15 = unionContext14.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray17 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext18 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray17);
        java.util.List list19 = unionContext18.getContextNodeList();
        unionContext18.reset();
        java.util.List list21 = unionContext18.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray23 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext24 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext22, evalContextArray23);
        java.util.List list25 = unionContext24.getContextNodeList();
        unionContext24.reset();
        java.util.List list27 = unionContext24.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext28 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray29 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext30 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext28, evalContextArray29);
        java.util.List list31 = unionContext30.getContextNodeList();
        unionContext30.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray33 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5, unionContext10, unionContext14, unionContext18, unionContext24, unionContext30 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext34 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray33);
        org.apache.commons.jxpath.NodeSet nodeSet35 = unionContext2.getNodeSet();
        boolean boolean36 = unionContext2.isChildOrderingRequired();
        boolean boolean37 = unionContext2.nextNode();
        boolean boolean38 = unionContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext39 = unionContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray9);
        org.junit.Assert.assertArrayEquals(evalContextArray9, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(evalContextArray13);
        org.junit.Assert.assertArrayEquals(evalContextArray13, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(evalContextArray17);
        org.junit.Assert.assertArrayEquals(evalContextArray17, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(evalContextArray23);
        org.junit.Assert.assertArrayEquals(evalContextArray23, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(evalContextArray29);
        org.junit.Assert.assertArrayEquals(evalContextArray29, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(evalContextArray33);
        org.junit.Assert.assertNotNull(nodeSet35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        java.util.List list5 = unionContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray7 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext6, evalContextArray7);
        boolean boolean10 = unionContext8.setPosition((int) (byte) 100);
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        boolean boolean14 = unionContext13.nextSet();
        int int15 = unionContext13.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray17 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext18 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray17);
        boolean boolean19 = unionContext18.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer20 = unionContext18.getContextNodePointer();
        java.lang.Object obj21 = unionContext18.getValue();
        boolean boolean22 = unionContext18.nextNode();
        org.apache.commons.jxpath.ri.EvalContext evalContext23 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray24 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext25 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext23, evalContextArray24);
        boolean boolean27 = unionContext25.setPosition((int) (byte) 100);
        int int28 = unionContext25.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext29 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray30 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext31 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext29, evalContextArray30);
        boolean boolean32 = unionContext31.nextSet();
        org.apache.commons.jxpath.Pointer pointer33 = unionContext31.getContextNodePointer();
        boolean boolean34 = unionContext31.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext35 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray36 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext37 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext35, evalContextArray36);
        boolean boolean38 = unionContext37.nextSet();
        org.apache.commons.jxpath.Pointer pointer39 = unionContext37.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext40 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray41 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext42 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext40, evalContextArray41);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray43 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext37, evalContext40 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext44 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext31, evalContextArray43);
        boolean boolean45 = unionContext31.nextSet();
        boolean boolean46 = unionContext31.hasNext();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray47 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext8, unionContext13, unionContext18, unionContext25, unionContext31 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext48 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray47);
        java.util.List list49 = unionContext48.getContextNodeList();
        java.lang.String str50 = unionContext48.toString();
        int int51 = unionContext48.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext52 = unionContext48.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(evalContextArray7);
        org.junit.Assert.assertArrayEquals(evalContextArray7, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(evalContextArray17);
        org.junit.Assert.assertArrayEquals(evalContextArray17, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(pointer20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(evalContextArray24);
        org.junit.Assert.assertArrayEquals(evalContextArray24, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(evalContextArray30);
        org.junit.Assert.assertArrayEquals(evalContextArray30, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(pointer33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(evalContextArray36);
        org.junit.Assert.assertArrayEquals(evalContextArray36, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(pointer39);
        org.junit.Assert.assertNotNull(evalContextArray41);
        org.junit.Assert.assertArrayEquals(evalContextArray41, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(evalContextArray47);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Empty expression context" + "'", str50, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.NodeSet nodeSet3 = unionContext2.getNodeSet();
        java.lang.String str4 = unionContext2.toString();
        boolean boolean5 = unionContext2.hasNext();
        int int6 = unionContext2.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext7 = unionContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Empty expression context" + "'", str4, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextNode();
        int int4 = unionContext2.getDocumentOrder();
        boolean boolean5 = unionContext2.isChildOrderingRequired();
        java.util.List list6 = unionContext2.getContextNodeList();
        java.util.List list7 = unionContext2.getContextNodeList();
        boolean boolean8 = unionContext2.hasNext();
        org.apache.commons.jxpath.Pointer pointer9 = unionContext2.getSingleNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = pointer9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(pointer9);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.Pointer pointer3 = unionContext2.getContextNodePointer();
        java.lang.Object obj4 = unionContext2.getValue();
        boolean boolean5 = unionContext2.isChildOrderingRequired();
        unionContext2.reset();
        unionContext2.reset();
        org.apache.commons.jxpath.Pointer pointer8 = unionContext2.getContextNodePointer();
        org.apache.commons.jxpath.Pointer pointer9 = unionContext2.getSingleNodePointer();
        boolean boolean10 = unionContext2.hasNext();
        unionContext2.reset();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(pointer8);
        org.junit.Assert.assertNull(pointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        boolean boolean5 = unionContext2.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray7 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext6, evalContextArray7);
        boolean boolean9 = unionContext8.nextSet();
        org.apache.commons.jxpath.Pointer pointer10 = unionContext8.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray14 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext8, evalContext11 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext15 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray14);
        java.util.List list16 = unionContext2.getContextNodeList();
        int int17 = unionContext2.getCurrentPosition();
        java.util.List list18 = unionContext2.getContextNodeList();
        boolean boolean20 = unionContext2.setPosition(3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer21 = unionContext2.getContextNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(evalContextArray7);
        org.junit.Assert.assertArrayEquals(evalContextArray7, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray14);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        java.lang.String str4 = unionContext2.toString();
        java.util.List list5 = unionContext2.getContextNodeList();
        boolean boolean6 = unionContext2.nextNode();
        int int7 = unionContext2.getPosition();
        int int8 = unionContext2.getDocumentOrder();
        org.apache.commons.jxpath.Pointer pointer9 = unionContext2.getSingleNodePointer();
        org.apache.commons.jxpath.NodeSet nodeSet10 = unionContext2.getNodeSet();
        boolean boolean12 = unionContext2.setPosition((int) (short) -1);
        int int13 = unionContext2.getCurrentPosition();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Empty expression context" + "'", str4, "Empty expression context");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(pointer9);
        org.junit.Assert.assertNotNull(nodeSet10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        int int4 = unionContext2.getCurrentPosition();
        boolean boolean6 = unionContext2.setPosition(3);
        boolean boolean7 = unionContext2.nextNode();
        java.util.List list8 = unionContext2.getContextNodeList();
        boolean boolean9 = unionContext2.nextNode();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.hasNext();
        boolean boolean4 = unionContext2.nextNode();
        boolean boolean6 = unionContext2.setPosition((int) 'a');
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.Pointer pointer3 = unionContext2.getContextNodePointer();
        java.lang.Object obj4 = unionContext2.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet5 = unionContext2.getNodeSet();
        unionContext2.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray8 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext9 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext7, evalContextArray8);
        boolean boolean10 = unionContext9.nextSet();
        org.apache.commons.jxpath.Pointer pointer11 = unionContext9.getContextNodePointer();
        java.util.List list12 = unionContext9.getContextNodeList();
        int int13 = unionContext9.getCurrentPosition();
        boolean boolean14 = unionContext9.isChildOrderingRequired();
        int int15 = unionContext9.getCurrentPosition();
        java.util.List list16 = unionContext9.getContextNodeList();
        java.lang.Object obj17 = unionContext9.getValue();
        org.apache.commons.jxpath.ri.EvalContext evalContext18 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray19 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext20 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext18, evalContextArray19);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext21 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext9, evalContextArray19);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext22 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray19);
        int int23 = unionContext2.getCurrentPosition();
        boolean boolean24 = unionContext2.isChildOrderingRequired();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[]");
        org.junit.Assert.assertNotNull(nodeSet5);
        org.junit.Assert.assertNotNull(evalContextArray8);
        org.junit.Assert.assertArrayEquals(evalContextArray8, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(pointer11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "[]");
        org.junit.Assert.assertNotNull(evalContextArray19);
        org.junit.Assert.assertArrayEquals(evalContextArray19, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        unionContext2.reset();
        int int4 = unionContext2.getPosition();
        boolean boolean5 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer6 = unionContext2.getSingleNodePointer();
        int int7 = unionContext2.getCurrentPosition();
        int int8 = unionContext2.getPosition();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.NodeSet nodeSet3 = unionContext2.getNodeSet();
        int int4 = unionContext2.getCurrentPosition();
        java.lang.String str5 = unionContext2.toString();
        // The following exception was thrown during execution in test generation
        try {
            unionContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Empty expression context" + "'", str5, "Empty expression context");
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.NodeSet nodeSet3 = unionContext2.getNodeSet();
        boolean boolean4 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext5, evalContextArray6);
        boolean boolean8 = unionContext7.nextSet();
        org.apache.commons.jxpath.Pointer pointer9 = unionContext7.getContextNodePointer();
        java.util.List list10 = unionContext7.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        boolean boolean15 = unionContext13.setPosition((int) (byte) 100);
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray17 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext18 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray17);
        boolean boolean19 = unionContext18.nextSet();
        int int20 = unionContext18.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext21 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray22 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext23 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext21, evalContextArray22);
        boolean boolean24 = unionContext23.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer25 = unionContext23.getContextNodePointer();
        java.lang.Object obj26 = unionContext23.getValue();
        boolean boolean27 = unionContext23.nextNode();
        org.apache.commons.jxpath.ri.EvalContext evalContext28 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray29 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext30 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext28, evalContextArray29);
        boolean boolean32 = unionContext30.setPosition((int) (byte) 100);
        int int33 = unionContext30.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext34 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray35 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext36 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext34, evalContextArray35);
        boolean boolean37 = unionContext36.nextSet();
        org.apache.commons.jxpath.Pointer pointer38 = unionContext36.getContextNodePointer();
        boolean boolean39 = unionContext36.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext40 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray41 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext42 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext40, evalContextArray41);
        boolean boolean43 = unionContext42.nextSet();
        org.apache.commons.jxpath.Pointer pointer44 = unionContext42.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext45 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray46 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext47 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext45, evalContextArray46);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray48 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext42, evalContext45 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext49 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext36, evalContextArray48);
        boolean boolean50 = unionContext36.nextSet();
        boolean boolean51 = unionContext36.hasNext();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray52 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext13, unionContext18, unionContext23, unionContext30, unionContext36 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext53 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext7, evalContextArray52);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext54 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray52);
        boolean boolean56 = unionContext2.setPosition(0);
        unionContext2.reset();
        boolean boolean58 = unionContext2.nextSet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj59 = unionContext2.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(pointer9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(evalContextArray17);
        org.junit.Assert.assertArrayEquals(evalContextArray17, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(evalContextArray22);
        org.junit.Assert.assertArrayEquals(evalContextArray22, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(pointer25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(evalContextArray29);
        org.junit.Assert.assertArrayEquals(evalContextArray29, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(evalContextArray35);
        org.junit.Assert.assertArrayEquals(evalContextArray35, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(pointer38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(evalContextArray41);
        org.junit.Assert.assertArrayEquals(evalContextArray41, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(pointer44);
        org.junit.Assert.assertNotNull(evalContextArray46);
        org.junit.Assert.assertArrayEquals(evalContextArray46, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(evalContextArray52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        int int4 = unionContext2.getCurrentPosition();
        boolean boolean6 = unionContext2.setPosition(3);
        boolean boolean8 = unionContext2.setPosition((int) '4');
        boolean boolean9 = unionContext2.hasNext();
        boolean boolean10 = unionContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext11 = unionContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        java.lang.String str4 = unionContext2.toString();
        java.util.List list5 = unionContext2.getContextNodeList();
        boolean boolean6 = unionContext2.nextNode();
        int int7 = unionContext2.getPosition();
        boolean boolean8 = unionContext2.hasNext();
        unionContext2.reset();
        org.apache.commons.jxpath.Pointer pointer10 = unionContext2.getContextNodePointer();
        int int11 = unionContext2.getCurrentPosition();
        boolean boolean12 = unionContext2.hasNext();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Empty expression context" + "'", str4, "Empty expression context");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.NodeSet nodeSet3 = unionContext2.getNodeSet();
        boolean boolean4 = unionContext2.isChildOrderingRequired();
        java.lang.String str5 = unionContext2.toString();
        unionContext2.reset();
        int int7 = unionContext2.getPosition();
        int int8 = unionContext2.getPosition();
        boolean boolean9 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer10 = unionContext2.getCurrentNodePointer();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Empty expression context" + "'", str5, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(nodePointer10);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        boolean boolean5 = unionContext2.setPosition((int) (byte) 10);
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray7 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext6, evalContextArray7);
        boolean boolean9 = unionContext8.nextSet();
        int int10 = unionContext8.getCurrentPosition();
        boolean boolean12 = unionContext8.setPosition(3);
        org.apache.commons.jxpath.ri.EvalContext evalContext13 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray14 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext15 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext13, evalContextArray14);
        boolean boolean16 = unionContext15.nextNode();
        int int17 = unionContext15.getDocumentOrder();
        boolean boolean18 = unionContext15.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext19 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray20 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext21 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext19, evalContextArray20);
        java.util.List list22 = unionContext21.getContextNodeList();
        unionContext21.reset();
        java.util.List list24 = unionContext21.getContextNodeList();
        int int25 = unionContext21.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext26 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray27 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext28 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext26, evalContextArray27);
        boolean boolean29 = unionContext28.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer30 = unionContext28.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext31 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray32 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext33 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext31, evalContextArray32);
        org.apache.commons.jxpath.ri.EvalContext evalContext34 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray35 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext36 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext34, evalContextArray35);
        boolean boolean37 = unionContext36.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext38 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray39 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext40 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext38, evalContextArray39);
        boolean boolean41 = unionContext40.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext42 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray43 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext44 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext42, evalContextArray43);
        java.util.List list45 = unionContext44.getContextNodeList();
        unionContext44.reset();
        java.util.List list47 = unionContext44.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext48 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray49 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext50 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext48, evalContextArray49);
        java.util.List list51 = unionContext50.getContextNodeList();
        unionContext50.reset();
        java.util.List list53 = unionContext50.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext54 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray55 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext56 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext54, evalContextArray55);
        java.util.List list57 = unionContext56.getContextNodeList();
        unionContext56.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray59 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext31, unionContext36, unionContext40, unionContext44, unionContext50, unionContext56 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext60 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext28, evalContextArray59);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext61 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext21, evalContextArray59);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext62 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext15, evalContextArray59);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext63 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext8, evalContextArray59);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext64 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray59);
        org.apache.commons.jxpath.NodeSet nodeSet65 = unionContext2.getNodeSet();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(evalContextArray7);
        org.junit.Assert.assertArrayEquals(evalContextArray7, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(evalContextArray14);
        org.junit.Assert.assertArrayEquals(evalContextArray14, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(evalContextArray20);
        org.junit.Assert.assertArrayEquals(evalContextArray20, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(evalContextArray27);
        org.junit.Assert.assertArrayEquals(evalContextArray27, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(pointer30);
        org.junit.Assert.assertNotNull(evalContextArray32);
        org.junit.Assert.assertArrayEquals(evalContextArray32, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray35);
        org.junit.Assert.assertArrayEquals(evalContextArray35, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(evalContextArray39);
        org.junit.Assert.assertArrayEquals(evalContextArray39, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(evalContextArray43);
        org.junit.Assert.assertArrayEquals(evalContextArray43, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(evalContextArray49);
        org.junit.Assert.assertArrayEquals(evalContextArray49, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(evalContextArray55);
        org.junit.Assert.assertArrayEquals(evalContextArray55, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertNotNull(evalContextArray59);
        org.junit.Assert.assertNotNull(nodeSet65);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        unionContext2.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray5 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext6 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray5);
        boolean boolean7 = unionContext6.nextSet();
        java.lang.String str8 = unionContext6.toString();
        java.util.List list9 = unionContext6.getContextNodeList();
        boolean boolean10 = unionContext6.nextNode();
        boolean boolean11 = unionContext6.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray13 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext14 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext12, evalContextArray13);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext15 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext6, evalContextArray13);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext16 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray13);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = unionContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext18 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray19 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext20 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext18, evalContextArray19);
        org.apache.commons.jxpath.Pointer pointer21 = unionContext20.getContextNodePointer();
        java.lang.Object obj22 = unionContext20.getValue();
        boolean boolean23 = unionContext20.isChildOrderingRequired();
        unionContext20.reset();
        unionContext20.reset();
        boolean boolean27 = unionContext20.setPosition(2);
        org.apache.commons.jxpath.NodeSet nodeSet28 = unionContext20.getNodeSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext29 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray30 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext31 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext29, evalContextArray30);
        boolean boolean32 = unionContext31.nextNode();
        int int33 = unionContext31.getDocumentOrder();
        boolean boolean34 = unionContext31.isChildOrderingRequired();
        boolean boolean35 = unionContext31.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext36 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray37 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext38 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext36, evalContextArray37);
        boolean boolean39 = unionContext38.nextSet();
        java.lang.String str40 = unionContext38.toString();
        java.util.List list41 = unionContext38.getContextNodeList();
        boolean boolean42 = unionContext38.nextNode();
        boolean boolean43 = unionContext38.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext44 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray45 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext46 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext44, evalContextArray45);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext47 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext38, evalContextArray45);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext48 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext31, evalContextArray45);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext49 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext20, evalContextArray45);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext50 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray45);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext51 = unionContext50.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray5);
        org.junit.Assert.assertArrayEquals(evalContextArray5, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(evalContextArray13);
        org.junit.Assert.assertArrayEquals(evalContextArray13, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(nodePointer17);
        org.junit.Assert.assertNotNull(evalContextArray19);
        org.junit.Assert.assertArrayEquals(evalContextArray19, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(nodeSet28);
        org.junit.Assert.assertNotNull(evalContextArray30);
        org.junit.Assert.assertArrayEquals(evalContextArray30, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(evalContextArray37);
        org.junit.Assert.assertArrayEquals(evalContextArray37, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Empty expression context" + "'", str40, "Empty expression context");
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(evalContextArray45);
        org.junit.Assert.assertArrayEquals(evalContextArray45, new org.apache.commons.jxpath.ri.EvalContext[] {});
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextNode();
        boolean boolean5 = unionContext2.setPosition(52);
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray7 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext6, evalContextArray7);
        boolean boolean9 = unionContext8.nextSet();
        org.apache.commons.jxpath.Pointer pointer10 = unionContext8.getContextNodePointer();
        java.util.List list11 = unionContext8.getContextNodeList();
        int int12 = unionContext8.getCurrentPosition();
        boolean boolean13 = unionContext8.isChildOrderingRequired();
        boolean boolean15 = unionContext8.setPosition((int) (short) 100);
        org.apache.commons.jxpath.Pointer pointer16 = unionContext8.getSingleNodePointer();
        org.apache.commons.jxpath.Pointer pointer17 = unionContext8.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext18 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray19 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext20 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext18, evalContextArray19);
        java.util.List list21 = unionContext20.getContextNodeList();
        unionContext20.reset();
        java.util.List list23 = unionContext20.getContextNodeList();
        int int24 = unionContext20.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext25 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray26 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext27 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext25, evalContextArray26);
        org.apache.commons.jxpath.Pointer pointer28 = unionContext27.getContextNodePointer();
        java.lang.Object obj29 = unionContext27.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet30 = unionContext27.getNodeSet();
        int int31 = unionContext27.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext32 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray33 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext34 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext32, evalContextArray33);
        java.util.List list35 = unionContext34.getContextNodeList();
        unionContext34.reset();
        java.util.List list37 = unionContext34.getContextNodeList();
        int int38 = unionContext34.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext39 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray40 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext41 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext39, evalContextArray40);
        boolean boolean42 = unionContext41.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer43 = unionContext41.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext44 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray45 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext46 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext44, evalContextArray45);
        org.apache.commons.jxpath.ri.EvalContext evalContext47 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray48 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext49 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext47, evalContextArray48);
        boolean boolean50 = unionContext49.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext51 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray52 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext53 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext51, evalContextArray52);
        boolean boolean54 = unionContext53.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext55 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray56 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext57 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext55, evalContextArray56);
        java.util.List list58 = unionContext57.getContextNodeList();
        unionContext57.reset();
        java.util.List list60 = unionContext57.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext61 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray62 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext63 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext61, evalContextArray62);
        java.util.List list64 = unionContext63.getContextNodeList();
        unionContext63.reset();
        java.util.List list66 = unionContext63.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext67 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray68 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext69 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext67, evalContextArray68);
        java.util.List list70 = unionContext69.getContextNodeList();
        unionContext69.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray72 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext44, unionContext49, unionContext53, unionContext57, unionContext63, unionContext69 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext73 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext41, evalContextArray72);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext74 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext34, evalContextArray72);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext75 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext27, evalContextArray72);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext76 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext20, evalContextArray72);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext77 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext8, evalContextArray72);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext78 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray72);
        java.lang.Class<?> wildcardClass79 = unionContext78.getClass();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(evalContextArray7);
        org.junit.Assert.assertArrayEquals(evalContextArray7, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(pointer16);
        org.junit.Assert.assertNull(pointer17);
        org.junit.Assert.assertNotNull(evalContextArray19);
        org.junit.Assert.assertArrayEquals(evalContextArray19, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(evalContextArray26);
        org.junit.Assert.assertArrayEquals(evalContextArray26, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "[]");
        org.junit.Assert.assertNotNull(nodeSet30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(evalContextArray33);
        org.junit.Assert.assertArrayEquals(evalContextArray33, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(evalContextArray40);
        org.junit.Assert.assertArrayEquals(evalContextArray40, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(pointer43);
        org.junit.Assert.assertNotNull(evalContextArray45);
        org.junit.Assert.assertArrayEquals(evalContextArray45, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray48);
        org.junit.Assert.assertArrayEquals(evalContextArray48, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(evalContextArray52);
        org.junit.Assert.assertArrayEquals(evalContextArray52, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(evalContextArray56);
        org.junit.Assert.assertArrayEquals(evalContextArray56, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertNotNull(evalContextArray62);
        org.junit.Assert.assertArrayEquals(evalContextArray62, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertNotNull(evalContextArray68);
        org.junit.Assert.assertArrayEquals(evalContextArray68, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list70);
        org.junit.Assert.assertNotNull(evalContextArray72);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        java.util.List list3 = unionContext2.getContextNodeList();
        java.lang.Object obj4 = unionContext2.getValue();
        boolean boolean5 = unionContext2.hasNext();
        boolean boolean6 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer7 = unionContext2.getSingleNodePointer();
        int int8 = unionContext2.getPosition();
        int int9 = unionContext2.getDocumentOrder();
        int int10 = unionContext2.getCurrentPosition();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.NodeSet nodeSet3 = unionContext2.getNodeSet();
        java.lang.String str4 = unionContext2.toString();
        unionContext2.reset();
        int int6 = unionContext2.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray8 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext9 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext7, evalContextArray8);
        boolean boolean10 = unionContext9.nextSet();
        org.apache.commons.jxpath.Pointer pointer11 = unionContext9.getContextNodePointer();
        java.util.List list12 = unionContext9.getContextNodeList();
        boolean boolean13 = unionContext9.nextSet();
        boolean boolean15 = unionContext9.setPosition((int) (short) 1);
        java.util.List list16 = unionContext9.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext17 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray18 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext19 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext17, evalContextArray18);
        boolean boolean20 = unionContext19.nextSet();
        org.apache.commons.jxpath.Pointer pointer21 = unionContext19.getContextNodePointer();
        boolean boolean22 = unionContext19.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext23 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray24 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext25 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext23, evalContextArray24);
        boolean boolean26 = unionContext25.nextSet();
        org.apache.commons.jxpath.Pointer pointer27 = unionContext25.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext28 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray29 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext30 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext28, evalContextArray29);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray31 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext25, evalContext28 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext32 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext19, evalContextArray31);
        int int33 = unionContext32.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext34 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray35 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext36 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext34, evalContextArray35);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext37 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext32, evalContextArray35);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext38 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext9, evalContextArray35);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext39 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray35);
        boolean boolean40 = unionContext39.nextSet();
        boolean boolean42 = unionContext39.setPosition(97);
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Empty expression context" + "'", str4, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(evalContextArray8);
        org.junit.Assert.assertArrayEquals(evalContextArray8, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(pointer11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(evalContextArray18);
        org.junit.Assert.assertArrayEquals(evalContextArray18, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(pointer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(evalContextArray24);
        org.junit.Assert.assertArrayEquals(evalContextArray24, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(pointer27);
        org.junit.Assert.assertNotNull(evalContextArray29);
        org.junit.Assert.assertArrayEquals(evalContextArray29, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(evalContextArray35);
        org.junit.Assert.assertArrayEquals(evalContextArray35, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        java.lang.String str4 = unionContext2.toString();
        java.util.List list5 = unionContext2.getContextNodeList();
        boolean boolean6 = unionContext2.nextNode();
        boolean boolean7 = unionContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext8 = unionContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Empty expression context" + "'", str4, "Empty expression context");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        boolean boolean4 = unionContext2.hasNext();
        boolean boolean6 = unionContext2.setPosition((int) (byte) 10);
        boolean boolean7 = unionContext2.nextNode();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        java.util.List list3 = unionContext2.getContextNodeList();
        unionContext2.reset();
        boolean boolean5 = unionContext2.isChildOrderingRequired();
        boolean boolean6 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer7 = unionContext2.getSingleNodePointer();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(pointer7);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        java.util.List list5 = unionContext2.getContextNodeList();
        boolean boolean6 = unionContext2.nextSet();
        boolean boolean8 = unionContext2.setPosition((int) (short) 1);
        boolean boolean9 = unionContext2.hasNext();
        org.apache.commons.jxpath.NodeSet nodeSet10 = unionContext2.getNodeSet();
        org.apache.commons.jxpath.Pointer pointer11 = unionContext2.getSingleNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer12 = unionContext2.getCurrentNodePointer();
        boolean boolean13 = unionContext2.nextSet();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeSet10);
        org.junit.Assert.assertNull(pointer11);
        org.junit.Assert.assertNull(nodePointer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        java.lang.String str4 = unionContext2.toString();
        java.util.List list5 = unionContext2.getContextNodeList();
        boolean boolean6 = unionContext2.nextNode();
        int int7 = unionContext2.getPosition();
        java.util.List list8 = unionContext2.getContextNodeList();
        java.lang.Object obj9 = unionContext2.getValue();
        boolean boolean10 = unionContext2.nextSet();
        boolean boolean11 = unionContext2.nextSet();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Empty expression context" + "'", str4, "Empty expression context");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        java.util.List list3 = unionContext2.getContextNodeList();
        unionContext2.reset();
        java.util.List list5 = unionContext2.getContextNodeList();
        int int6 = unionContext2.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray8 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext9 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext7, evalContextArray8);
        boolean boolean10 = unionContext9.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer11 = unionContext9.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray13 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext14 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext12, evalContextArray13);
        org.apache.commons.jxpath.ri.EvalContext evalContext15 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray16 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext17 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext15, evalContextArray16);
        boolean boolean18 = unionContext17.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext19 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray20 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext21 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext19, evalContextArray20);
        boolean boolean22 = unionContext21.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext23 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray24 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext25 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext23, evalContextArray24);
        java.util.List list26 = unionContext25.getContextNodeList();
        unionContext25.reset();
        java.util.List list28 = unionContext25.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext29 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray30 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext31 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext29, evalContextArray30);
        java.util.List list32 = unionContext31.getContextNodeList();
        unionContext31.reset();
        java.util.List list34 = unionContext31.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext35 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray36 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext37 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext35, evalContextArray36);
        java.util.List list38 = unionContext37.getContextNodeList();
        unionContext37.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray40 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext12, unionContext17, unionContext21, unionContext25, unionContext31, unionContext37 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext41 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext9, evalContextArray40);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext42 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray40);
        org.apache.commons.jxpath.Pointer pointer43 = unionContext2.getSingleNodePointer();
        int int44 = unionContext2.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext45 = unionContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(evalContextArray8);
        org.junit.Assert.assertArrayEquals(evalContextArray8, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(pointer11);
        org.junit.Assert.assertNotNull(evalContextArray13);
        org.junit.Assert.assertArrayEquals(evalContextArray13, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray16);
        org.junit.Assert.assertArrayEquals(evalContextArray16, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(evalContextArray20);
        org.junit.Assert.assertArrayEquals(evalContextArray20, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(evalContextArray24);
        org.junit.Assert.assertArrayEquals(evalContextArray24, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(evalContextArray30);
        org.junit.Assert.assertArrayEquals(evalContextArray30, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(evalContextArray36);
        org.junit.Assert.assertArrayEquals(evalContextArray36, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(evalContextArray40);
        org.junit.Assert.assertNull(pointer43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        boolean boolean5 = unionContext2.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray7 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext6, evalContextArray7);
        boolean boolean9 = unionContext8.nextSet();
        org.apache.commons.jxpath.Pointer pointer10 = unionContext8.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray14 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext8, evalContext11 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext15 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray14);
        java.util.List list16 = unionContext2.getContextNodeList();
        int int17 = unionContext2.getCurrentPosition();
        int int18 = unionContext2.getDocumentOrder();
        org.apache.commons.jxpath.Pointer pointer19 = unionContext2.getSingleNodePointer();
        java.lang.Object obj20 = unionContext2.getValue();
        int int21 = unionContext2.getDocumentOrder();
        boolean boolean22 = unionContext2.isChildOrderingRequired();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(evalContextArray7);
        org.junit.Assert.assertArrayEquals(evalContextArray7, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray14);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(pointer19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextNode();
        int int4 = unionContext2.getDocumentOrder();
        boolean boolean5 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray7 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext6, evalContextArray7);
        java.util.List list9 = unionContext8.getContextNodeList();
        unionContext8.reset();
        java.util.List list11 = unionContext8.getContextNodeList();
        int int12 = unionContext8.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext13 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray14 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext15 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext13, evalContextArray14);
        boolean boolean16 = unionContext15.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer17 = unionContext15.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext18 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray19 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext20 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext18, evalContextArray19);
        org.apache.commons.jxpath.ri.EvalContext evalContext21 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray22 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext23 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext21, evalContextArray22);
        boolean boolean24 = unionContext23.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext25 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray26 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext27 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext25, evalContextArray26);
        boolean boolean28 = unionContext27.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext29 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray30 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext31 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext29, evalContextArray30);
        java.util.List list32 = unionContext31.getContextNodeList();
        unionContext31.reset();
        java.util.List list34 = unionContext31.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext35 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray36 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext37 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext35, evalContextArray36);
        java.util.List list38 = unionContext37.getContextNodeList();
        unionContext37.reset();
        java.util.List list40 = unionContext37.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext41 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray42 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext43 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext41, evalContextArray42);
        java.util.List list44 = unionContext43.getContextNodeList();
        unionContext43.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray46 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext18, unionContext23, unionContext27, unionContext31, unionContext37, unionContext43 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext47 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext15, evalContextArray46);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext48 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext8, evalContextArray46);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext49 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray46);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = unionContext49.setPosition(102);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(evalContextArray7);
        org.junit.Assert.assertArrayEquals(evalContextArray7, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(evalContextArray14);
        org.junit.Assert.assertArrayEquals(evalContextArray14, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(pointer17);
        org.junit.Assert.assertNotNull(evalContextArray19);
        org.junit.Assert.assertArrayEquals(evalContextArray19, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray22);
        org.junit.Assert.assertArrayEquals(evalContextArray22, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(evalContextArray26);
        org.junit.Assert.assertArrayEquals(evalContextArray26, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(evalContextArray30);
        org.junit.Assert.assertArrayEquals(evalContextArray30, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(evalContextArray36);
        org.junit.Assert.assertArrayEquals(evalContextArray36, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(evalContextArray42);
        org.junit.Assert.assertArrayEquals(evalContextArray42, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(evalContextArray46);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.NodeSet nodeSet3 = unionContext2.getNodeSet();
        boolean boolean4 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext5, evalContextArray6);
        boolean boolean8 = unionContext7.nextSet();
        org.apache.commons.jxpath.Pointer pointer9 = unionContext7.getContextNodePointer();
        java.util.List list10 = unionContext7.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        boolean boolean15 = unionContext13.setPosition((int) (byte) 100);
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray17 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext18 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray17);
        boolean boolean19 = unionContext18.nextSet();
        int int20 = unionContext18.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext21 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray22 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext23 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext21, evalContextArray22);
        boolean boolean24 = unionContext23.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer25 = unionContext23.getContextNodePointer();
        java.lang.Object obj26 = unionContext23.getValue();
        boolean boolean27 = unionContext23.nextNode();
        org.apache.commons.jxpath.ri.EvalContext evalContext28 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray29 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext30 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext28, evalContextArray29);
        boolean boolean32 = unionContext30.setPosition((int) (byte) 100);
        int int33 = unionContext30.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext34 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray35 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext36 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext34, evalContextArray35);
        boolean boolean37 = unionContext36.nextSet();
        org.apache.commons.jxpath.Pointer pointer38 = unionContext36.getContextNodePointer();
        boolean boolean39 = unionContext36.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext40 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray41 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext42 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext40, evalContextArray41);
        boolean boolean43 = unionContext42.nextSet();
        org.apache.commons.jxpath.Pointer pointer44 = unionContext42.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext45 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray46 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext47 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext45, evalContextArray46);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray48 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext42, evalContext45 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext49 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext36, evalContextArray48);
        boolean boolean50 = unionContext36.nextSet();
        boolean boolean51 = unionContext36.hasNext();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray52 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext13, unionContext18, unionContext23, unionContext30, unionContext36 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext53 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext7, evalContextArray52);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext54 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray52);
        boolean boolean55 = unionContext2.isChildOrderingRequired();
        java.util.List list56 = unionContext2.getContextNodeList();
        boolean boolean57 = unionContext2.nextNode();
        boolean boolean59 = unionContext2.setPosition(52);
        boolean boolean60 = unionContext2.nextSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext61 = unionContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(pointer9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(evalContextArray17);
        org.junit.Assert.assertArrayEquals(evalContextArray17, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(evalContextArray22);
        org.junit.Assert.assertArrayEquals(evalContextArray22, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(pointer25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(evalContextArray29);
        org.junit.Assert.assertArrayEquals(evalContextArray29, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(evalContextArray35);
        org.junit.Assert.assertArrayEquals(evalContextArray35, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(pointer38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(evalContextArray41);
        org.junit.Assert.assertArrayEquals(evalContextArray41, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(pointer44);
        org.junit.Assert.assertNotNull(evalContextArray46);
        org.junit.Assert.assertArrayEquals(evalContextArray46, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(evalContextArray52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        boolean boolean5 = unionContext2.setPosition((int) (byte) 10);
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray7 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext6, evalContextArray7);
        boolean boolean9 = unionContext8.nextSet();
        int int10 = unionContext8.getCurrentPosition();
        boolean boolean12 = unionContext8.setPosition(3);
        org.apache.commons.jxpath.ri.EvalContext evalContext13 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray14 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext15 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext13, evalContextArray14);
        boolean boolean16 = unionContext15.nextNode();
        int int17 = unionContext15.getDocumentOrder();
        boolean boolean18 = unionContext15.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext19 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray20 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext21 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext19, evalContextArray20);
        java.util.List list22 = unionContext21.getContextNodeList();
        unionContext21.reset();
        java.util.List list24 = unionContext21.getContextNodeList();
        int int25 = unionContext21.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext26 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray27 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext28 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext26, evalContextArray27);
        boolean boolean29 = unionContext28.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer30 = unionContext28.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext31 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray32 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext33 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext31, evalContextArray32);
        org.apache.commons.jxpath.ri.EvalContext evalContext34 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray35 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext36 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext34, evalContextArray35);
        boolean boolean37 = unionContext36.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext38 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray39 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext40 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext38, evalContextArray39);
        boolean boolean41 = unionContext40.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext42 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray43 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext44 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext42, evalContextArray43);
        java.util.List list45 = unionContext44.getContextNodeList();
        unionContext44.reset();
        java.util.List list47 = unionContext44.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext48 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray49 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext50 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext48, evalContextArray49);
        java.util.List list51 = unionContext50.getContextNodeList();
        unionContext50.reset();
        java.util.List list53 = unionContext50.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext54 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray55 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext56 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext54, evalContextArray55);
        java.util.List list57 = unionContext56.getContextNodeList();
        unionContext56.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray59 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext31, unionContext36, unionContext40, unionContext44, unionContext50, unionContext56 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext60 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext28, evalContextArray59);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext61 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext21, evalContextArray59);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext62 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext15, evalContextArray59);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext63 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext8, evalContextArray59);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext64 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray59);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray65 = null;
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext66 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext64, evalContextArray65);
        boolean boolean67 = unionContext66.nextSet();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(evalContextArray7);
        org.junit.Assert.assertArrayEquals(evalContextArray7, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(evalContextArray14);
        org.junit.Assert.assertArrayEquals(evalContextArray14, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(evalContextArray20);
        org.junit.Assert.assertArrayEquals(evalContextArray20, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(evalContextArray27);
        org.junit.Assert.assertArrayEquals(evalContextArray27, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(pointer30);
        org.junit.Assert.assertNotNull(evalContextArray32);
        org.junit.Assert.assertArrayEquals(evalContextArray32, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray35);
        org.junit.Assert.assertArrayEquals(evalContextArray35, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(evalContextArray39);
        org.junit.Assert.assertArrayEquals(evalContextArray39, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(evalContextArray43);
        org.junit.Assert.assertArrayEquals(evalContextArray43, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(evalContextArray49);
        org.junit.Assert.assertArrayEquals(evalContextArray49, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(evalContextArray55);
        org.junit.Assert.assertArrayEquals(evalContextArray55, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertNotNull(evalContextArray59);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        boolean boolean5 = unionContext2.setPosition((int) (byte) 10);
        int int6 = unionContext2.getDocumentOrder();
        java.util.List list7 = unionContext2.getContextNodeList();
        boolean boolean9 = unionContext2.setPosition((int) (byte) -1);
        boolean boolean10 = unionContext2.nextSet();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        java.util.List list5 = unionContext2.getContextNodeList();
        int int6 = unionContext2.getCurrentPosition();
        org.apache.commons.jxpath.Pointer pointer7 = unionContext2.getSingleNodePointer();
        org.apache.commons.jxpath.Pointer pointer8 = unionContext2.getSingleNodePointer();
        int int9 = unionContext2.getPosition();
        int int10 = unionContext2.getCurrentPosition();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertNull(pointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        java.util.List list3 = unionContext2.getContextNodeList();
        java.lang.Object obj4 = unionContext2.getValue();
        boolean boolean5 = unionContext2.hasNext();
        boolean boolean6 = unionContext2.nextSet();
        boolean boolean7 = unionContext2.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext8 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray9 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext10 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext8, evalContextArray9);
        java.util.List list11 = unionContext10.getContextNodeList();
        java.lang.Object obj12 = unionContext10.getValue();
        boolean boolean13 = unionContext10.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext14 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray15 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext16 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext14, evalContextArray15);
        boolean boolean17 = unionContext16.nextSet();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = unionContext16.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext19 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray20 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext21 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext19, evalContextArray20);
        org.apache.commons.jxpath.Pointer pointer22 = unionContext21.getContextNodePointer();
        java.lang.Object obj23 = unionContext21.getValue();
        boolean boolean24 = unionContext21.isChildOrderingRequired();
        unionContext21.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext26 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray27 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext28 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext26, evalContextArray27);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext29 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext21, evalContextArray27);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext30 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext16, evalContextArray27);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext31 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext10, evalContextArray27);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext32 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray27);
        int int33 = unionContext32.getDocumentOrder();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(evalContextArray9);
        org.junit.Assert.assertArrayEquals(evalContextArray9, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(evalContextArray15);
        org.junit.Assert.assertArrayEquals(evalContextArray15, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(nodePointer18);
        org.junit.Assert.assertNotNull(evalContextArray20);
        org.junit.Assert.assertArrayEquals(evalContextArray20, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(evalContextArray27);
        org.junit.Assert.assertArrayEquals(evalContextArray27, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.Pointer pointer3 = unionContext2.getContextNodePointer();
        java.lang.Object obj4 = unionContext2.getValue();
        boolean boolean5 = unionContext2.isChildOrderingRequired();
        unionContext2.reset();
        org.apache.commons.jxpath.Pointer pointer7 = unionContext2.getSingleNodePointer();
        boolean boolean8 = unionContext2.nextSet();
        boolean boolean9 = unionContext2.hasNext();
        java.util.List list10 = unionContext2.getContextNodeList();
        int int11 = unionContext2.getCurrentPosition();
        int int12 = unionContext2.getCurrentPosition();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.Pointer pointer3 = unionContext2.getSingleNodePointer();
        int int4 = unionContext2.getCurrentPosition();
        int int5 = unionContext2.getCurrentPosition();
        java.util.List list6 = unionContext2.getContextNodeList();
        int int7 = unionContext2.getPosition();
        java.lang.Object obj8 = unionContext2.getValue();
        int int9 = unionContext2.getPosition();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        java.lang.Object obj3 = unionContext2.getValue();
        int int4 = unionContext2.getPosition();
        java.util.List list5 = unionContext2.getContextNodeList();
        org.apache.commons.jxpath.NodeSet nodeSet6 = unionContext2.getNodeSet();
        java.util.List list7 = unionContext2.getContextNodeList();
        int int8 = unionContext2.getCurrentPosition();
        boolean boolean9 = unionContext2.nextNode();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(nodeSet6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        java.util.List list3 = unionContext2.getContextNodeList();
        unionContext2.reset();
        java.util.List list5 = unionContext2.getContextNodeList();
        int int6 = unionContext2.getPosition();
        boolean boolean7 = unionContext2.nextNode();
        boolean boolean8 = unionContext2.hasNext();
        int int9 = unionContext2.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer10 = unionContext2.getContextNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextNode();
        int int4 = unionContext2.getDocumentOrder();
        boolean boolean5 = unionContext2.isChildOrderingRequired();
        java.util.List list6 = unionContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray8 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext9 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext7, evalContextArray8);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext10 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray8);
        org.apache.commons.jxpath.Pointer pointer11 = unionContext10.getSingleNodePointer();
        java.lang.Object obj12 = unionContext10.getValue();
        org.apache.commons.jxpath.Pointer pointer13 = unionContext10.getSingleNodePointer();
        boolean boolean14 = unionContext10.hasNext();
        int int15 = unionContext10.getDocumentOrder();
        java.util.List list16 = unionContext10.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer17 = unionContext10.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = unionContext10.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(evalContextArray8);
        org.junit.Assert.assertArrayEquals(evalContextArray8, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "[]");
        org.junit.Assert.assertNull(pointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(pointer17);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        boolean boolean5 = unionContext2.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray7 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext6, evalContextArray7);
        boolean boolean9 = unionContext8.nextSet();
        org.apache.commons.jxpath.Pointer pointer10 = unionContext8.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray14 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext8, evalContext11 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext15 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray14);
        boolean boolean16 = unionContext2.nextSet();
        boolean boolean17 = unionContext2.hasNext();
        java.lang.Object obj18 = unionContext2.getValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer19 = unionContext2.getContextNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(evalContextArray7);
        org.junit.Assert.assertArrayEquals(evalContextArray7, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "[]");
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.NodeSet nodeSet3 = unionContext2.getNodeSet();
        boolean boolean4 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext5, evalContextArray6);
        boolean boolean8 = unionContext7.nextSet();
        org.apache.commons.jxpath.Pointer pointer9 = unionContext7.getContextNodePointer();
        java.util.List list10 = unionContext7.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        boolean boolean15 = unionContext13.setPosition((int) (byte) 100);
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray17 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext18 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray17);
        boolean boolean19 = unionContext18.nextSet();
        int int20 = unionContext18.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext21 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray22 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext23 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext21, evalContextArray22);
        boolean boolean24 = unionContext23.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer25 = unionContext23.getContextNodePointer();
        java.lang.Object obj26 = unionContext23.getValue();
        boolean boolean27 = unionContext23.nextNode();
        org.apache.commons.jxpath.ri.EvalContext evalContext28 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray29 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext30 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext28, evalContextArray29);
        boolean boolean32 = unionContext30.setPosition((int) (byte) 100);
        int int33 = unionContext30.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext34 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray35 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext36 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext34, evalContextArray35);
        boolean boolean37 = unionContext36.nextSet();
        org.apache.commons.jxpath.Pointer pointer38 = unionContext36.getContextNodePointer();
        boolean boolean39 = unionContext36.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext40 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray41 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext42 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext40, evalContextArray41);
        boolean boolean43 = unionContext42.nextSet();
        org.apache.commons.jxpath.Pointer pointer44 = unionContext42.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext45 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray46 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext47 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext45, evalContextArray46);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray48 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext42, evalContext45 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext49 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext36, evalContextArray48);
        boolean boolean50 = unionContext36.nextSet();
        boolean boolean51 = unionContext36.hasNext();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray52 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext13, unionContext18, unionContext23, unionContext30, unionContext36 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext53 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext7, evalContextArray52);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext54 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray52);
        boolean boolean56 = unionContext2.setPosition(0);
        unionContext2.reset();
        unionContext2.reset();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(pointer9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(evalContextArray17);
        org.junit.Assert.assertArrayEquals(evalContextArray17, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(evalContextArray22);
        org.junit.Assert.assertArrayEquals(evalContextArray22, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(pointer25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(evalContextArray29);
        org.junit.Assert.assertArrayEquals(evalContextArray29, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(evalContextArray35);
        org.junit.Assert.assertArrayEquals(evalContextArray35, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(pointer38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(evalContextArray41);
        org.junit.Assert.assertArrayEquals(evalContextArray41, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(pointer44);
        org.junit.Assert.assertNotNull(evalContextArray46);
        org.junit.Assert.assertArrayEquals(evalContextArray46, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(evalContextArray52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.Pointer pointer3 = unionContext2.getSingleNodePointer();
        int int4 = unionContext2.getCurrentPosition();
        int int5 = unionContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray7 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext6, evalContextArray7);
        boolean boolean9 = unionContext8.nextSet();
        boolean boolean11 = unionContext8.setPosition((int) (byte) 10);
        boolean boolean12 = unionContext8.hasNext();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray13 = null;
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext14 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext8, evalContextArray13);
        org.apache.commons.jxpath.ri.EvalContext evalContext15 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray16 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext17 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext15, evalContextArray16);
        boolean boolean18 = unionContext17.nextSet();
        java.lang.String str19 = unionContext17.toString();
        java.util.List list20 = unionContext17.getContextNodeList();
        boolean boolean21 = unionContext17.nextNode();
        boolean boolean22 = unionContext17.nextNode();
        org.apache.commons.jxpath.Pointer pointer23 = unionContext17.getSingleNodePointer();
        org.apache.commons.jxpath.Pointer pointer24 = unionContext17.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext25 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray26 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext27 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext25, evalContextArray26);
        boolean boolean28 = unionContext27.nextSet();
        org.apache.commons.jxpath.Pointer pointer29 = unionContext27.getContextNodePointer();
        boolean boolean30 = unionContext27.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext31 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray32 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext33 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext31, evalContextArray32);
        boolean boolean34 = unionContext33.nextSet();
        org.apache.commons.jxpath.Pointer pointer35 = unionContext33.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext36 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray37 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext38 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext36, evalContextArray37);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray39 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext33, evalContext36 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext40 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext27, evalContextArray39);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext41 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext17, evalContextArray39);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext42 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext14, evalContextArray39);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext43 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray39);
        int int44 = unionContext2.getCurrentPosition();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(evalContextArray7);
        org.junit.Assert.assertArrayEquals(evalContextArray7, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(evalContextArray16);
        org.junit.Assert.assertArrayEquals(evalContextArray16, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Empty expression context" + "'", str19, "Empty expression context");
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(pointer23);
        org.junit.Assert.assertNull(pointer24);
        org.junit.Assert.assertNotNull(evalContextArray26);
        org.junit.Assert.assertArrayEquals(evalContextArray26, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(pointer29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(evalContextArray32);
        org.junit.Assert.assertArrayEquals(evalContextArray32, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(pointer35);
        org.junit.Assert.assertNotNull(evalContextArray37);
        org.junit.Assert.assertArrayEquals(evalContextArray37, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.Pointer pointer3 = unionContext2.getContextNodePointer();
        java.lang.Object obj4 = unionContext2.getValue();
        boolean boolean5 = unionContext2.isChildOrderingRequired();
        unionContext2.reset();
        unionContext2.reset();
        boolean boolean8 = unionContext2.hasNext();
        java.util.List list9 = unionContext2.getContextNodeList();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.Pointer pointer3 = unionContext2.getContextNodePointer();
        java.lang.Object obj4 = unionContext2.getValue();
        boolean boolean5 = unionContext2.isChildOrderingRequired();
        unionContext2.reset();
        org.apache.commons.jxpath.Pointer pointer7 = unionContext2.getSingleNodePointer();
        boolean boolean8 = unionContext2.nextSet();
        boolean boolean10 = unionContext2.setPosition((int) (short) 100);
        boolean boolean11 = unionContext2.nextSet();
        int int12 = unionContext2.getCurrentPosition();
        java.lang.Object obj13 = unionContext2.getValue();
        boolean boolean14 = unionContext2.isChildOrderingRequired();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext5, evalContextArray6);
        org.apache.commons.jxpath.ri.EvalContext evalContext8 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray9 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext10 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext8, evalContextArray9);
        boolean boolean11 = unionContext10.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray13 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext14 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext12, evalContextArray13);
        boolean boolean15 = unionContext14.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray17 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext18 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray17);
        java.util.List list19 = unionContext18.getContextNodeList();
        unionContext18.reset();
        java.util.List list21 = unionContext18.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray23 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext24 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext22, evalContextArray23);
        java.util.List list25 = unionContext24.getContextNodeList();
        unionContext24.reset();
        java.util.List list27 = unionContext24.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext28 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray29 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext30 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext28, evalContextArray29);
        java.util.List list31 = unionContext30.getContextNodeList();
        unionContext30.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray33 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5, unionContext10, unionContext14, unionContext18, unionContext24, unionContext30 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext34 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray33);
        int int35 = unionContext2.getPosition();
        boolean boolean37 = unionContext2.setPosition((int) 'a');
        org.apache.commons.jxpath.ri.EvalContext evalContext38 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray39 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext40 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext38, evalContextArray39);
        boolean boolean41 = unionContext40.nextSet();
        int int42 = unionContext40.getCurrentPosition();
        boolean boolean44 = unionContext40.setPosition(3);
        org.apache.commons.jxpath.ri.EvalContext evalContext45 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray46 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext47 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext45, evalContextArray46);
        boolean boolean48 = unionContext47.nextNode();
        int int49 = unionContext47.getDocumentOrder();
        boolean boolean50 = unionContext47.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext51 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray52 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext53 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext51, evalContextArray52);
        java.util.List list54 = unionContext53.getContextNodeList();
        unionContext53.reset();
        java.util.List list56 = unionContext53.getContextNodeList();
        int int57 = unionContext53.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext58 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray59 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext60 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext58, evalContextArray59);
        boolean boolean61 = unionContext60.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer62 = unionContext60.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext63 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray64 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext65 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext63, evalContextArray64);
        org.apache.commons.jxpath.ri.EvalContext evalContext66 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray67 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext68 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext66, evalContextArray67);
        boolean boolean69 = unionContext68.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext70 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray71 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext72 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext70, evalContextArray71);
        boolean boolean73 = unionContext72.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext74 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray75 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext76 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext74, evalContextArray75);
        java.util.List list77 = unionContext76.getContextNodeList();
        unionContext76.reset();
        java.util.List list79 = unionContext76.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext80 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray81 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext82 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext80, evalContextArray81);
        java.util.List list83 = unionContext82.getContextNodeList();
        unionContext82.reset();
        java.util.List list85 = unionContext82.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext86 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray87 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext88 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext86, evalContextArray87);
        java.util.List list89 = unionContext88.getContextNodeList();
        unionContext88.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray91 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext63, unionContext68, unionContext72, unionContext76, unionContext82, unionContext88 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext92 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext60, evalContextArray91);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext93 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext53, evalContextArray91);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext94 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext47, evalContextArray91);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext95 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext40, evalContextArray91);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext96 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray91);
        java.util.List list97 = unionContext2.getContextNodeList();
        unionContext2.reset();
        boolean boolean99 = unionContext2.nextNode();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray9);
        org.junit.Assert.assertArrayEquals(evalContextArray9, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(evalContextArray13);
        org.junit.Assert.assertArrayEquals(evalContextArray13, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(evalContextArray17);
        org.junit.Assert.assertArrayEquals(evalContextArray17, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(evalContextArray23);
        org.junit.Assert.assertArrayEquals(evalContextArray23, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(evalContextArray29);
        org.junit.Assert.assertArrayEquals(evalContextArray29, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(evalContextArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(evalContextArray39);
        org.junit.Assert.assertArrayEquals(evalContextArray39, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(evalContextArray46);
        org.junit.Assert.assertArrayEquals(evalContextArray46, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(evalContextArray52);
        org.junit.Assert.assertArrayEquals(evalContextArray52, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(evalContextArray59);
        org.junit.Assert.assertArrayEquals(evalContextArray59, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(pointer62);
        org.junit.Assert.assertNotNull(evalContextArray64);
        org.junit.Assert.assertArrayEquals(evalContextArray64, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray67);
        org.junit.Assert.assertArrayEquals(evalContextArray67, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(evalContextArray71);
        org.junit.Assert.assertArrayEquals(evalContextArray71, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(evalContextArray75);
        org.junit.Assert.assertArrayEquals(evalContextArray75, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list77);
        org.junit.Assert.assertNotNull(list79);
        org.junit.Assert.assertNotNull(evalContextArray81);
        org.junit.Assert.assertArrayEquals(evalContextArray81, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list83);
        org.junit.Assert.assertNotNull(list85);
        org.junit.Assert.assertNotNull(evalContextArray87);
        org.junit.Assert.assertArrayEquals(evalContextArray87, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list89);
        org.junit.Assert.assertNotNull(evalContextArray91);
        org.junit.Assert.assertNotNull(list97);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextNode();
        int int4 = unionContext2.getDocumentOrder();
        java.lang.Object obj5 = unionContext2.getValue();
        boolean boolean6 = unionContext2.nextSet();
        boolean boolean8 = unionContext2.setPosition(4);
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        java.util.List list3 = unionContext2.getContextNodeList();
        unionContext2.reset();
        java.util.List list5 = unionContext2.getContextNodeList();
        boolean boolean6 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer7 = unionContext2.getSingleNodePointer();
        org.apache.commons.jxpath.Pointer pointer8 = unionContext2.getSingleNodePointer();
        boolean boolean9 = unionContext2.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext10 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray11 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext12 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext10, evalContextArray11);
        boolean boolean13 = unionContext12.nextSet();
        java.lang.String str14 = unionContext12.toString();
        java.util.List list15 = unionContext12.getContextNodeList();
        boolean boolean16 = unionContext12.nextNode();
        boolean boolean17 = unionContext12.nextNode();
        org.apache.commons.jxpath.Pointer pointer18 = unionContext12.getSingleNodePointer();
        org.apache.commons.jxpath.Pointer pointer19 = unionContext12.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext20 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray21 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext22 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext20, evalContextArray21);
        boolean boolean23 = unionContext22.nextSet();
        org.apache.commons.jxpath.Pointer pointer24 = unionContext22.getContextNodePointer();
        boolean boolean25 = unionContext22.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext26 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray27 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext28 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext26, evalContextArray27);
        boolean boolean29 = unionContext28.nextSet();
        org.apache.commons.jxpath.Pointer pointer30 = unionContext28.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext31 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray32 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext33 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext31, evalContextArray32);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray34 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext28, evalContext31 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext35 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext22, evalContextArray34);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext36 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext12, evalContextArray34);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext37 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray34);
        org.apache.commons.jxpath.Pointer pointer38 = unionContext2.getSingleNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext39 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray40 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext41 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext39, evalContextArray40);
        org.apache.commons.jxpath.Pointer pointer42 = unionContext41.getContextNodePointer();
        java.lang.Object obj43 = unionContext41.getValue();
        boolean boolean44 = unionContext41.isChildOrderingRequired();
        unionContext41.reset();
        unionContext41.reset();
        boolean boolean48 = unionContext41.setPosition(2);
        org.apache.commons.jxpath.NodeSet nodeSet49 = unionContext41.getNodeSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext50 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray51 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext52 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext50, evalContextArray51);
        boolean boolean53 = unionContext52.nextNode();
        int int54 = unionContext52.getDocumentOrder();
        boolean boolean55 = unionContext52.isChildOrderingRequired();
        boolean boolean56 = unionContext52.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext57 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray58 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext59 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext57, evalContextArray58);
        boolean boolean60 = unionContext59.nextSet();
        java.lang.String str61 = unionContext59.toString();
        java.util.List list62 = unionContext59.getContextNodeList();
        boolean boolean63 = unionContext59.nextNode();
        boolean boolean64 = unionContext59.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext65 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray66 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext67 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext65, evalContextArray66);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext68 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext59, evalContextArray66);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext69 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext52, evalContextArray66);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext70 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext41, evalContextArray66);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext71 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray66);
        java.lang.Object obj72 = unionContext2.getValue();
        java.lang.Class<?> wildcardClass73 = obj72.getClass();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertNull(pointer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(evalContextArray11);
        org.junit.Assert.assertArrayEquals(evalContextArray11, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Empty expression context" + "'", str14, "Empty expression context");
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(pointer18);
        org.junit.Assert.assertNull(pointer19);
        org.junit.Assert.assertNotNull(evalContextArray21);
        org.junit.Assert.assertArrayEquals(evalContextArray21, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(pointer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(evalContextArray27);
        org.junit.Assert.assertArrayEquals(evalContextArray27, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(pointer30);
        org.junit.Assert.assertNotNull(evalContextArray32);
        org.junit.Assert.assertArrayEquals(evalContextArray32, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray34);
        org.junit.Assert.assertNull(pointer38);
        org.junit.Assert.assertNotNull(evalContextArray40);
        org.junit.Assert.assertArrayEquals(evalContextArray40, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer42);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "[]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(nodeSet49);
        org.junit.Assert.assertNotNull(evalContextArray51);
        org.junit.Assert.assertArrayEquals(evalContextArray51, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(evalContextArray58);
        org.junit.Assert.assertArrayEquals(evalContextArray58, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Empty expression context" + "'", str61, "Empty expression context");
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(evalContextArray66);
        org.junit.Assert.assertArrayEquals(evalContextArray66, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertEquals(obj72.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj72), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj72), "[]");
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        java.util.List list5 = unionContext2.getContextNodeList();
        int int6 = unionContext2.getDocumentOrder();
        int int7 = unionContext2.getDocumentOrder();
        java.lang.Class<?> wildcardClass8 = unionContext2.getClass();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        java.util.List list5 = unionContext2.getContextNodeList();
        int int6 = unionContext2.getCurrentPosition();
        boolean boolean7 = unionContext2.isChildOrderingRequired();
        int int8 = unionContext2.getCurrentPosition();
        java.util.List list9 = unionContext2.getContextNodeList();
        boolean boolean10 = unionContext2.nextSet();
        unionContext2.reset();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        boolean boolean5 = unionContext2.setPosition((int) (byte) 10);
        int int6 = unionContext2.getDocumentOrder();
        int int7 = unionContext2.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            unionContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.hasNext();
        boolean boolean4 = unionContext2.nextNode();
        int int5 = unionContext2.getDocumentOrder();
        int int6 = unionContext2.getPosition();
        java.util.List list7 = unionContext2.getContextNodeList();
        boolean boolean8 = unionContext2.nextNode();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.Pointer pointer3 = unionContext2.getSingleNodePointer();
        int int4 = unionContext2.getCurrentPosition();
        int int5 = unionContext2.getCurrentPosition();
        java.util.List list6 = unionContext2.getContextNodeList();
        int int7 = unionContext2.getPosition();
        java.lang.Object obj8 = unionContext2.getValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = unionContext2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "[]");
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        java.util.List list5 = unionContext2.getContextNodeList();
        int int6 = unionContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray8 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext9 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext7, evalContextArray8);
        java.util.List list10 = unionContext9.getContextNodeList();
        unionContext9.reset();
        java.util.List list12 = unionContext9.getContextNodeList();
        int int13 = unionContext9.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext14 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray15 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext16 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext14, evalContextArray15);
        boolean boolean17 = unionContext16.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer18 = unionContext16.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext19 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray20 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext21 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext19, evalContextArray20);
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray23 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext24 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext22, evalContextArray23);
        boolean boolean25 = unionContext24.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext26 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray27 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext28 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext26, evalContextArray27);
        boolean boolean29 = unionContext28.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext30 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray31 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext32 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext30, evalContextArray31);
        java.util.List list33 = unionContext32.getContextNodeList();
        unionContext32.reset();
        java.util.List list35 = unionContext32.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext36 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray37 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext38 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext36, evalContextArray37);
        java.util.List list39 = unionContext38.getContextNodeList();
        unionContext38.reset();
        java.util.List list41 = unionContext38.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext42 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray43 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext44 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext42, evalContextArray43);
        java.util.List list45 = unionContext44.getContextNodeList();
        unionContext44.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray47 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext19, unionContext24, unionContext28, unionContext32, unionContext38, unionContext44 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext48 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext16, evalContextArray47);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext49 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext9, evalContextArray47);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext50 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray47);
        java.lang.Object obj51 = unionContext2.getValue();
        org.apache.commons.jxpath.Pointer pointer52 = unionContext2.getSingleNodePointer();
        java.lang.String str53 = unionContext2.toString();
        int int54 = unionContext2.getDocumentOrder();
        org.apache.commons.jxpath.Pointer pointer55 = unionContext2.getSingleNodePointer();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(evalContextArray8);
        org.junit.Assert.assertArrayEquals(evalContextArray8, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(evalContextArray15);
        org.junit.Assert.assertArrayEquals(evalContextArray15, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(pointer18);
        org.junit.Assert.assertNotNull(evalContextArray20);
        org.junit.Assert.assertArrayEquals(evalContextArray20, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray23);
        org.junit.Assert.assertArrayEquals(evalContextArray23, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(evalContextArray27);
        org.junit.Assert.assertArrayEquals(evalContextArray27, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(evalContextArray31);
        org.junit.Assert.assertArrayEquals(evalContextArray31, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(evalContextArray37);
        org.junit.Assert.assertArrayEquals(evalContextArray37, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(evalContextArray43);
        org.junit.Assert.assertArrayEquals(evalContextArray43, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(evalContextArray47);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "[]");
        org.junit.Assert.assertNull(pointer52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Empty expression context" + "'", str53, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(pointer55);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextNode();
        int int4 = unionContext2.getDocumentOrder();
        boolean boolean5 = unionContext2.isChildOrderingRequired();
        java.util.List list6 = unionContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray8 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext9 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext7, evalContextArray8);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext10 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray8);
        org.apache.commons.jxpath.Pointer pointer11 = unionContext10.getSingleNodePointer();
        boolean boolean12 = unionContext10.nextNode();
        unionContext10.reset();
        int int14 = unionContext10.getPosition();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(evalContextArray8);
        org.junit.Assert.assertArrayEquals(evalContextArray8, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        boolean boolean5 = unionContext2.setPosition((int) (byte) 10);
        boolean boolean6 = unionContext2.hasNext();
        org.apache.commons.jxpath.NodeSet nodeSet7 = unionContext2.getNodeSet();
        java.util.List list8 = unionContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext9 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray10 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext11 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext9, evalContextArray10);
        boolean boolean12 = unionContext11.nextSet();
        org.apache.commons.jxpath.Pointer pointer13 = unionContext11.getContextNodePointer();
        java.util.List list14 = unionContext11.getContextNodeList();
        boolean boolean15 = unionContext11.nextSet();
        boolean boolean17 = unionContext11.setPosition((int) (short) 1);
        java.util.List list18 = unionContext11.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext19 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray20 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext21 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext19, evalContextArray20);
        boolean boolean22 = unionContext21.nextSet();
        org.apache.commons.jxpath.Pointer pointer23 = unionContext21.getContextNodePointer();
        boolean boolean24 = unionContext21.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext25 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray26 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext27 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext25, evalContextArray26);
        boolean boolean28 = unionContext27.nextSet();
        org.apache.commons.jxpath.Pointer pointer29 = unionContext27.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext30 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray31 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext32 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext30, evalContextArray31);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray33 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext27, evalContext30 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext34 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext21, evalContextArray33);
        int int35 = unionContext34.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext36 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray37 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext38 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext36, evalContextArray37);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext39 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext34, evalContextArray37);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext40 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext11, evalContextArray37);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext41 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray37);
        java.util.List list42 = unionContext2.getContextNodeList();
        int int43 = unionContext2.getCurrentPosition();
        java.util.List list44 = unionContext2.getContextNodeList();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeSet7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(evalContextArray10);
        org.junit.Assert.assertArrayEquals(evalContextArray10, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(pointer13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(evalContextArray20);
        org.junit.Assert.assertArrayEquals(evalContextArray20, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(pointer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(evalContextArray26);
        org.junit.Assert.assertArrayEquals(evalContextArray26, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(pointer29);
        org.junit.Assert.assertNotNull(evalContextArray31);
        org.junit.Assert.assertArrayEquals(evalContextArray31, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(evalContextArray37);
        org.junit.Assert.assertArrayEquals(evalContextArray37, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 11 + "'", int43 == 11);
        org.junit.Assert.assertNotNull(list44);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext5, evalContextArray6);
        org.apache.commons.jxpath.ri.EvalContext evalContext8 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray9 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext10 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext8, evalContextArray9);
        boolean boolean11 = unionContext10.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray13 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext14 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext12, evalContextArray13);
        boolean boolean15 = unionContext14.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray17 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext18 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray17);
        java.util.List list19 = unionContext18.getContextNodeList();
        unionContext18.reset();
        java.util.List list21 = unionContext18.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray23 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext24 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext22, evalContextArray23);
        java.util.List list25 = unionContext24.getContextNodeList();
        unionContext24.reset();
        java.util.List list27 = unionContext24.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext28 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray29 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext30 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext28, evalContextArray29);
        java.util.List list31 = unionContext30.getContextNodeList();
        unionContext30.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray33 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5, unionContext10, unionContext14, unionContext18, unionContext24, unionContext30 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext34 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray33);
        int int35 = unionContext2.getPosition();
        boolean boolean37 = unionContext2.setPosition((int) 'a');
        org.apache.commons.jxpath.ri.EvalContext evalContext38 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray39 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext40 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext38, evalContextArray39);
        org.apache.commons.jxpath.NodeSet nodeSet41 = unionContext40.getNodeSet();
        boolean boolean42 = unionContext40.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext43 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray44 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext45 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext43, evalContextArray44);
        boolean boolean46 = unionContext45.nextSet();
        org.apache.commons.jxpath.Pointer pointer47 = unionContext45.getContextNodePointer();
        java.util.List list48 = unionContext45.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext49 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray50 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext51 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext49, evalContextArray50);
        boolean boolean53 = unionContext51.setPosition((int) (byte) 100);
        org.apache.commons.jxpath.ri.EvalContext evalContext54 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray55 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext56 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext54, evalContextArray55);
        boolean boolean57 = unionContext56.nextSet();
        int int58 = unionContext56.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext59 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray60 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext61 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext59, evalContextArray60);
        boolean boolean62 = unionContext61.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer63 = unionContext61.getContextNodePointer();
        java.lang.Object obj64 = unionContext61.getValue();
        boolean boolean65 = unionContext61.nextNode();
        org.apache.commons.jxpath.ri.EvalContext evalContext66 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray67 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext68 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext66, evalContextArray67);
        boolean boolean70 = unionContext68.setPosition((int) (byte) 100);
        int int71 = unionContext68.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext72 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray73 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext74 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext72, evalContextArray73);
        boolean boolean75 = unionContext74.nextSet();
        org.apache.commons.jxpath.Pointer pointer76 = unionContext74.getContextNodePointer();
        boolean boolean77 = unionContext74.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext78 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray79 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext80 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext78, evalContextArray79);
        boolean boolean81 = unionContext80.nextSet();
        org.apache.commons.jxpath.Pointer pointer82 = unionContext80.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext83 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray84 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext85 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext83, evalContextArray84);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray86 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext80, evalContext83 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext87 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext74, evalContextArray86);
        boolean boolean88 = unionContext74.nextSet();
        boolean boolean89 = unionContext74.hasNext();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray90 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext51, unionContext56, unionContext61, unionContext68, unionContext74 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext91 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext45, evalContextArray90);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext92 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext40, evalContextArray90);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext93 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray90);
        org.apache.commons.jxpath.Pointer pointer94 = unionContext93.getSingleNodePointer();
        boolean boolean95 = unionContext93.nextNode();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray9);
        org.junit.Assert.assertArrayEquals(evalContextArray9, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(evalContextArray13);
        org.junit.Assert.assertArrayEquals(evalContextArray13, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(evalContextArray17);
        org.junit.Assert.assertArrayEquals(evalContextArray17, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(evalContextArray23);
        org.junit.Assert.assertArrayEquals(evalContextArray23, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(evalContextArray29);
        org.junit.Assert.assertArrayEquals(evalContextArray29, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(evalContextArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(evalContextArray39);
        org.junit.Assert.assertArrayEquals(evalContextArray39, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(evalContextArray44);
        org.junit.Assert.assertArrayEquals(evalContextArray44, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(pointer47);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNotNull(evalContextArray50);
        org.junit.Assert.assertArrayEquals(evalContextArray50, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(evalContextArray55);
        org.junit.Assert.assertArrayEquals(evalContextArray55, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(evalContextArray60);
        org.junit.Assert.assertArrayEquals(evalContextArray60, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(pointer63);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertEquals(obj64.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj64), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj64), "[]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(evalContextArray67);
        org.junit.Assert.assertArrayEquals(evalContextArray67, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 100 + "'", int71 == 100);
        org.junit.Assert.assertNotNull(evalContextArray73);
        org.junit.Assert.assertArrayEquals(evalContextArray73, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNull(pointer76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(evalContextArray79);
        org.junit.Assert.assertArrayEquals(evalContextArray79, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNull(pointer82);
        org.junit.Assert.assertNotNull(evalContextArray84);
        org.junit.Assert.assertArrayEquals(evalContextArray84, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(evalContextArray90);
        org.junit.Assert.assertNull(pointer94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        unionContext2.reset();
        boolean boolean6 = unionContext2.hasNext();
        int int7 = unionContext2.getDocumentOrder();
        boolean boolean8 = unionContext2.nextSet();
        boolean boolean9 = unionContext2.isChildOrderingRequired();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        unionContext2.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray5 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext6 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray5);
        boolean boolean7 = unionContext6.hasNext();
        int int8 = unionContext6.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext9 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray10 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext11 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext9, evalContextArray10);
        boolean boolean12 = unionContext11.nextSet();
        org.apache.commons.jxpath.Pointer pointer13 = unionContext11.getContextNodePointer();
        boolean boolean14 = unionContext11.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext15 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray16 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext17 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext15, evalContextArray16);
        boolean boolean18 = unionContext17.nextSet();
        org.apache.commons.jxpath.Pointer pointer19 = unionContext17.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext20 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray21 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext22 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext20, evalContextArray21);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray23 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext17, evalContext20 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext24 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext11, evalContextArray23);
        org.apache.commons.jxpath.NodeSet nodeSet25 = unionContext11.getNodeSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext26 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray27 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext28 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext26, evalContextArray27);
        org.apache.commons.jxpath.Pointer pointer29 = unionContext28.getContextNodePointer();
        java.lang.Object obj30 = unionContext28.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet31 = unionContext28.getNodeSet();
        int int32 = unionContext28.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext33 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray34 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext35 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext33, evalContextArray34);
        org.apache.commons.jxpath.Pointer pointer36 = unionContext35.getSingleNodePointer();
        int int37 = unionContext35.getCurrentPosition();
        int int38 = unionContext35.getDocumentOrder();
        org.apache.commons.jxpath.ri.EvalContext evalContext39 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray40 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext41 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext39, evalContextArray40);
        boolean boolean42 = unionContext41.nextNode();
        int int43 = unionContext41.getDocumentOrder();
        boolean boolean44 = unionContext41.isChildOrderingRequired();
        java.util.List list45 = unionContext41.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext46 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray47 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext48 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext46, evalContextArray47);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext49 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext41, evalContextArray47);
        org.apache.commons.jxpath.ri.EvalContext evalContext50 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray51 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext52 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext50, evalContextArray51);
        java.util.List list53 = unionContext52.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray54 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext6, unionContext11, unionContext28, unionContext35, unionContext49, unionContext52 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext55 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray54);
        org.apache.commons.jxpath.ri.EvalContext evalContext56 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray57 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext58 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext56, evalContextArray57);
        org.apache.commons.jxpath.Pointer pointer59 = unionContext58.getContextNodePointer();
        java.lang.Object obj60 = unionContext58.getValue();
        boolean boolean61 = unionContext58.isChildOrderingRequired();
        unionContext58.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext63 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray64 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext65 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext63, evalContextArray64);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext66 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext58, evalContextArray64);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext67 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext55, evalContextArray64);
        java.util.List list68 = unionContext67.getContextNodeList();
        org.apache.commons.jxpath.NodeSet nodeSet69 = unionContext67.getNodeSet();
        int int70 = unionContext67.getPosition();
        int int71 = unionContext67.getDocumentOrder();
        org.apache.commons.jxpath.NodeSet nodeSet72 = unionContext67.getNodeSet();
        org.apache.commons.jxpath.NodeSet nodeSet73 = unionContext67.getNodeSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext74 = unionContext67.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray5);
        org.junit.Assert.assertArrayEquals(evalContextArray5, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(evalContextArray10);
        org.junit.Assert.assertArrayEquals(evalContextArray10, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(pointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(evalContextArray16);
        org.junit.Assert.assertArrayEquals(evalContextArray16, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(pointer19);
        org.junit.Assert.assertNotNull(evalContextArray21);
        org.junit.Assert.assertArrayEquals(evalContextArray21, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray23);
        org.junit.Assert.assertNotNull(nodeSet25);
        org.junit.Assert.assertNotNull(evalContextArray27);
        org.junit.Assert.assertArrayEquals(evalContextArray27, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "[]");
        org.junit.Assert.assertNotNull(nodeSet31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(evalContextArray34);
        org.junit.Assert.assertArrayEquals(evalContextArray34, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(evalContextArray40);
        org.junit.Assert.assertArrayEquals(evalContextArray40, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(evalContextArray47);
        org.junit.Assert.assertArrayEquals(evalContextArray47, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray51);
        org.junit.Assert.assertArrayEquals(evalContextArray51, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(evalContextArray54);
        org.junit.Assert.assertNotNull(evalContextArray57);
        org.junit.Assert.assertArrayEquals(evalContextArray57, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertEquals(obj60.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj60), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj60), "[]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(evalContextArray64);
        org.junit.Assert.assertArrayEquals(evalContextArray64, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list68);
        org.junit.Assert.assertNotNull(nodeSet69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(nodeSet72);
        org.junit.Assert.assertNotNull(nodeSet73);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        unionContext2.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray5 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext6 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray5);
        boolean boolean7 = unionContext6.nextSet();
        java.lang.String str8 = unionContext6.toString();
        java.util.List list9 = unionContext6.getContextNodeList();
        boolean boolean10 = unionContext6.nextNode();
        boolean boolean11 = unionContext6.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray13 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext14 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext12, evalContextArray13);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext15 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext6, evalContextArray13);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext16 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray13);
        org.apache.commons.jxpath.Pointer pointer17 = unionContext16.getSingleNodePointer();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray5);
        org.junit.Assert.assertArrayEquals(evalContextArray5, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(evalContextArray13);
        org.junit.Assert.assertArrayEquals(evalContextArray13, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer17);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        boolean boolean5 = unionContext2.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray7 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext6, evalContextArray7);
        boolean boolean9 = unionContext8.nextSet();
        org.apache.commons.jxpath.Pointer pointer10 = unionContext8.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray14 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext8, evalContext11 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext15 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray14);
        boolean boolean16 = unionContext2.nextSet();
        boolean boolean17 = unionContext2.nextNode();
        unionContext2.reset();
        int int19 = unionContext2.getPosition();
        int int20 = unionContext2.getCurrentPosition();
        boolean boolean21 = unionContext2.nextSet();
        java.util.List list22 = unionContext2.getContextNodeList();
        java.lang.Class<?> wildcardClass23 = unionContext2.getClass();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(evalContextArray7);
        org.junit.Assert.assertArrayEquals(evalContextArray7, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        java.util.List list5 = unionContext2.getContextNodeList();
        int int6 = unionContext2.getCurrentPosition();
        boolean boolean7 = unionContext2.nextNode();
        unionContext2.reset();
        int int9 = unionContext2.getDocumentOrder();
        boolean boolean10 = unionContext2.nextNode();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        java.lang.Object obj3 = unionContext2.getValue();
        boolean boolean4 = unionContext2.isChildOrderingRequired();
        int int5 = unionContext2.getPosition();
        org.apache.commons.jxpath.Pointer pointer6 = unionContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray7 = null;
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray7);
        org.apache.commons.jxpath.NodeSet nodeSet9 = unionContext8.getNodeSet();
        int int10 = unionContext8.getCurrentPosition();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNotNull(nodeSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.NodeSet nodeSet3 = unionContext2.getNodeSet();
        java.lang.String str4 = unionContext2.toString();
        boolean boolean5 = unionContext2.hasNext();
        org.apache.commons.jxpath.Pointer pointer6 = unionContext2.getSingleNodePointer();
        boolean boolean8 = unionContext2.setPosition((int) (short) 0);
        boolean boolean9 = unionContext2.nextSet();
        java.lang.Class<?> wildcardClass10 = unionContext2.getClass();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Empty expression context" + "'", str4, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        java.util.List list5 = unionContext2.getContextNodeList();
        boolean boolean6 = unionContext2.nextSet();
        boolean boolean8 = unionContext2.setPosition((int) (short) 1);
        java.util.List list9 = unionContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext10 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray11 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext12 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext10, evalContextArray11);
        boolean boolean13 = unionContext12.nextSet();
        org.apache.commons.jxpath.Pointer pointer14 = unionContext12.getContextNodePointer();
        boolean boolean15 = unionContext12.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray17 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext18 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray17);
        boolean boolean19 = unionContext18.nextSet();
        org.apache.commons.jxpath.Pointer pointer20 = unionContext18.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext21 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray22 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext23 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext21, evalContextArray22);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray24 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext18, evalContext21 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext25 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext12, evalContextArray24);
        int int26 = unionContext25.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext27 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray28 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext29 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext27, evalContextArray28);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext30 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext25, evalContextArray28);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext31 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray28);
        org.apache.commons.jxpath.NodeSet nodeSet32 = unionContext2.getNodeSet();
        org.apache.commons.jxpath.NodeSet nodeSet33 = unionContext2.getNodeSet();
        org.apache.commons.jxpath.NodeSet nodeSet34 = unionContext2.getNodeSet();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(evalContextArray11);
        org.junit.Assert.assertArrayEquals(evalContextArray11, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(pointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(evalContextArray17);
        org.junit.Assert.assertArrayEquals(evalContextArray17, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(pointer20);
        org.junit.Assert.assertNotNull(evalContextArray22);
        org.junit.Assert.assertArrayEquals(evalContextArray22, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(evalContextArray28);
        org.junit.Assert.assertArrayEquals(evalContextArray28, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet32);
        org.junit.Assert.assertNotNull(nodeSet33);
        org.junit.Assert.assertNotNull(nodeSet34);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        org.apache.commons.jxpath.NodeSet nodeSet5 = unionContext2.getNodeSet();
        boolean boolean6 = unionContext2.hasNext();
        boolean boolean7 = unionContext2.nextNode();
        boolean boolean8 = unionContext2.nextNode();
        org.apache.commons.jxpath.Pointer pointer9 = unionContext2.getSingleNodePointer();
        int int10 = unionContext2.getCurrentPosition();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(nodeSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(pointer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.Pointer pointer3 = unionContext2.getContextNodePointer();
        java.lang.Object obj4 = unionContext2.getValue();
        boolean boolean5 = unionContext2.isChildOrderingRequired();
        unionContext2.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray8 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext9 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext7, evalContextArray8);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext10 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray8);
        int int11 = unionContext2.getPosition();
        boolean boolean12 = unionContext2.hasNext();
        boolean boolean13 = unionContext2.nextNode();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(evalContextArray8);
        org.junit.Assert.assertArrayEquals(evalContextArray8, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        java.lang.Object obj3 = unionContext2.getValue();
        int int4 = unionContext2.getPosition();
        java.lang.Object obj5 = unionContext2.getValue();
        int int6 = unionContext2.getDocumentOrder();
        unionContext2.reset();
        org.apache.commons.jxpath.Pointer pointer8 = unionContext2.getSingleNodePointer();
        int int9 = unionContext2.getDocumentOrder();
        int int10 = unionContext2.getDocumentOrder();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(pointer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        java.util.List list5 = unionContext2.getContextNodeList();
        int int6 = unionContext2.getCurrentPosition();
        boolean boolean7 = unionContext2.isChildOrderingRequired();
        boolean boolean8 = unionContext2.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer9 = unionContext2.getContextNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        unionContext2.reset();
        int int4 = unionContext2.getPosition();
        int int5 = unionContext2.getPosition();
        int int6 = unionContext2.getDocumentOrder();
        java.lang.String str7 = unionContext2.toString();
        unionContext2.reset();
        java.lang.Object obj9 = unionContext2.getValue();
        org.apache.commons.jxpath.Pointer pointer10 = unionContext2.getSingleNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = unionContext2.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Empty expression context" + "'", str7, "Empty expression context");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[]");
        org.junit.Assert.assertNull(pointer10);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        java.util.List list5 = unionContext2.getContextNodeList();
        int int6 = unionContext2.getCurrentPosition();
        boolean boolean7 = unionContext2.nextNode();
        unionContext2.reset();
        boolean boolean10 = unionContext2.setPosition((int) (short) 10);
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        java.util.List list14 = unionContext13.getContextNodeList();
        unionContext13.reset();
        boolean boolean16 = unionContext13.isChildOrderingRequired();
        int int17 = unionContext13.getPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer18 = unionContext13.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext19 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray20 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext21 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext19, evalContextArray20);
        org.apache.commons.jxpath.NodeSet nodeSet22 = unionContext21.getNodeSet();
        java.lang.String str23 = unionContext21.toString();
        unionContext21.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext25 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray26 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext27 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext25, evalContextArray26);
        org.apache.commons.jxpath.Pointer pointer28 = unionContext27.getContextNodePointer();
        java.lang.Object obj29 = unionContext27.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet30 = unionContext27.getNodeSet();
        int int31 = unionContext27.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext32 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray33 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext34 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext32, evalContextArray33);
        java.util.List list35 = unionContext34.getContextNodeList();
        unionContext34.reset();
        java.util.List list37 = unionContext34.getContextNodeList();
        int int38 = unionContext34.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext39 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray40 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext41 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext39, evalContextArray40);
        boolean boolean42 = unionContext41.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer43 = unionContext41.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext44 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray45 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext46 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext44, evalContextArray45);
        org.apache.commons.jxpath.ri.EvalContext evalContext47 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray48 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext49 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext47, evalContextArray48);
        boolean boolean50 = unionContext49.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext51 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray52 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext53 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext51, evalContextArray52);
        boolean boolean54 = unionContext53.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext55 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray56 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext57 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext55, evalContextArray56);
        java.util.List list58 = unionContext57.getContextNodeList();
        unionContext57.reset();
        java.util.List list60 = unionContext57.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext61 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray62 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext63 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext61, evalContextArray62);
        java.util.List list64 = unionContext63.getContextNodeList();
        unionContext63.reset();
        java.util.List list66 = unionContext63.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext67 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray68 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext69 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext67, evalContextArray68);
        java.util.List list70 = unionContext69.getContextNodeList();
        unionContext69.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray72 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext44, unionContext49, unionContext53, unionContext57, unionContext63, unionContext69 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext73 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext41, evalContextArray72);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext74 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext34, evalContextArray72);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext75 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext27, evalContextArray72);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext76 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext21, evalContextArray72);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext77 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext13, evalContextArray72);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext78 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray72);
        java.lang.Object obj79 = unionContext2.getValue();
        int int80 = unionContext2.getDocumentOrder();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(nodePointer18);
        org.junit.Assert.assertNotNull(evalContextArray20);
        org.junit.Assert.assertArrayEquals(evalContextArray20, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Empty expression context" + "'", str23, "Empty expression context");
        org.junit.Assert.assertNotNull(evalContextArray26);
        org.junit.Assert.assertArrayEquals(evalContextArray26, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "[]");
        org.junit.Assert.assertNotNull(nodeSet30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(evalContextArray33);
        org.junit.Assert.assertArrayEquals(evalContextArray33, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(evalContextArray40);
        org.junit.Assert.assertArrayEquals(evalContextArray40, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(pointer43);
        org.junit.Assert.assertNotNull(evalContextArray45);
        org.junit.Assert.assertArrayEquals(evalContextArray45, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray48);
        org.junit.Assert.assertArrayEquals(evalContextArray48, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(evalContextArray52);
        org.junit.Assert.assertArrayEquals(evalContextArray52, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(evalContextArray56);
        org.junit.Assert.assertArrayEquals(evalContextArray56, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertNotNull(evalContextArray62);
        org.junit.Assert.assertArrayEquals(evalContextArray62, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertNotNull(evalContextArray68);
        org.junit.Assert.assertArrayEquals(evalContextArray68, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list70);
        org.junit.Assert.assertNotNull(evalContextArray72);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertEquals(obj79.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj79), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj79), "[]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        boolean boolean5 = unionContext2.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray7 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext6, evalContextArray7);
        boolean boolean9 = unionContext8.nextSet();
        org.apache.commons.jxpath.Pointer pointer10 = unionContext8.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray14 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext8, evalContext11 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext15 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray14);
        java.util.List list16 = unionContext2.getContextNodeList();
        int int17 = unionContext2.getCurrentPosition();
        int int18 = unionContext2.getDocumentOrder();
        int int19 = unionContext2.getCurrentPosition();
        unionContext2.reset();
        boolean boolean21 = unionContext2.hasNext();
        boolean boolean23 = unionContext2.setPosition((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = unionContext2.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(evalContextArray7);
        org.junit.Assert.assertArrayEquals(evalContextArray7, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray14);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        boolean boolean5 = unionContext2.setPosition((int) (byte) 10);
        boolean boolean6 = unionContext2.hasNext();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray7 = null;
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray7);
        boolean boolean9 = unionContext2.nextNode();
        java.util.List list10 = unionContext2.getContextNodeList();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        boolean boolean5 = unionContext2.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray7 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext6, evalContextArray7);
        boolean boolean9 = unionContext8.nextSet();
        org.apache.commons.jxpath.Pointer pointer10 = unionContext8.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray14 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext8, evalContext11 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext15 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray14);
        java.util.List list16 = unionContext2.getContextNodeList();
        int int17 = unionContext2.getCurrentPosition();
        int int18 = unionContext2.getDocumentOrder();
        boolean boolean19 = unionContext2.nextSet();
        boolean boolean21 = unionContext2.setPosition(10);
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(evalContextArray7);
        org.junit.Assert.assertArrayEquals(evalContextArray7, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray14);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        java.util.List list5 = unionContext2.getContextNodeList();
        boolean boolean6 = unionContext2.nextSet();
        boolean boolean8 = unionContext2.setPosition((int) (short) 1);
        boolean boolean9 = unionContext2.hasNext();
        unionContext2.reset();
        java.util.List list11 = unionContext2.getContextNodeList();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext5, evalContextArray6);
        org.apache.commons.jxpath.ri.EvalContext evalContext8 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray9 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext10 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext8, evalContextArray9);
        boolean boolean11 = unionContext10.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray13 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext14 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext12, evalContextArray13);
        boolean boolean15 = unionContext14.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray17 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext18 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray17);
        java.util.List list19 = unionContext18.getContextNodeList();
        unionContext18.reset();
        java.util.List list21 = unionContext18.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray23 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext24 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext22, evalContextArray23);
        java.util.List list25 = unionContext24.getContextNodeList();
        unionContext24.reset();
        java.util.List list27 = unionContext24.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext28 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray29 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext30 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext28, evalContextArray29);
        java.util.List list31 = unionContext30.getContextNodeList();
        unionContext30.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray33 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5, unionContext10, unionContext14, unionContext18, unionContext24, unionContext30 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext34 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray33);
        boolean boolean36 = unionContext2.setPosition((int) ' ');
        org.apache.commons.jxpath.ri.EvalContext evalContext37 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray38 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext39 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext37, evalContextArray38);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext40 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray38);
        unionContext40.reset();
        int int42 = unionContext40.getDocumentOrder();
        org.apache.commons.jxpath.NodeSet nodeSet43 = unionContext40.getNodeSet();
        int int44 = unionContext40.getPosition();
        java.util.List list45 = unionContext40.getContextNodeList();
        int int46 = unionContext40.getDocumentOrder();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray9);
        org.junit.Assert.assertArrayEquals(evalContextArray9, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(evalContextArray13);
        org.junit.Assert.assertArrayEquals(evalContextArray13, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(evalContextArray17);
        org.junit.Assert.assertArrayEquals(evalContextArray17, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(evalContextArray23);
        org.junit.Assert.assertArrayEquals(evalContextArray23, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(evalContextArray29);
        org.junit.Assert.assertArrayEquals(evalContextArray29, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(evalContextArray33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(evalContextArray38);
        org.junit.Assert.assertArrayEquals(evalContextArray38, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(nodeSet43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext5, evalContextArray6);
        org.apache.commons.jxpath.ri.EvalContext evalContext8 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray9 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext10 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext8, evalContextArray9);
        boolean boolean11 = unionContext10.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray13 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext14 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext12, evalContextArray13);
        boolean boolean15 = unionContext14.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray17 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext18 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray17);
        java.util.List list19 = unionContext18.getContextNodeList();
        unionContext18.reset();
        java.util.List list21 = unionContext18.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray23 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext24 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext22, evalContextArray23);
        java.util.List list25 = unionContext24.getContextNodeList();
        unionContext24.reset();
        java.util.List list27 = unionContext24.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext28 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray29 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext30 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext28, evalContextArray29);
        java.util.List list31 = unionContext30.getContextNodeList();
        unionContext30.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray33 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5, unionContext10, unionContext14, unionContext18, unionContext24, unionContext30 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext34 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray33);
        int int35 = unionContext2.getDocumentOrder();
        boolean boolean36 = unionContext2.nextSet();
        unionContext2.reset();
        boolean boolean38 = unionContext2.hasNext();
        boolean boolean39 = unionContext2.hasNext();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray9);
        org.junit.Assert.assertArrayEquals(evalContextArray9, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(evalContextArray13);
        org.junit.Assert.assertArrayEquals(evalContextArray13, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(evalContextArray17);
        org.junit.Assert.assertArrayEquals(evalContextArray17, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(evalContextArray23);
        org.junit.Assert.assertArrayEquals(evalContextArray23, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(evalContextArray29);
        org.junit.Assert.assertArrayEquals(evalContextArray29, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(evalContextArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        boolean boolean5 = unionContext2.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray7 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext6, evalContextArray7);
        boolean boolean9 = unionContext8.nextSet();
        org.apache.commons.jxpath.Pointer pointer10 = unionContext8.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray14 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext8, evalContext11 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext15 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray14);
        java.util.List list16 = unionContext2.getContextNodeList();
        int int17 = unionContext2.getCurrentPosition();
        unionContext2.reset();
        org.apache.commons.jxpath.Pointer pointer19 = unionContext2.getSingleNodePointer();
        boolean boolean20 = unionContext2.nextSet();
        unionContext2.reset();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(evalContextArray7);
        org.junit.Assert.assertArrayEquals(evalContextArray7, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray14);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(pointer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.Pointer pointer3 = unionContext2.getContextNodePointer();
        java.lang.Object obj4 = unionContext2.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet5 = unionContext2.getNodeSet();
        int int6 = unionContext2.getCurrentPosition();
        int int7 = unionContext2.getCurrentPosition();
        org.apache.commons.jxpath.NodeSet nodeSet8 = unionContext2.getNodeSet();
        java.util.List list9 = unionContext2.getContextNodeList();
        unionContext2.reset();
        unionContext2.reset();
        java.lang.String str12 = unionContext2.toString();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[]");
        org.junit.Assert.assertNotNull(nodeSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(nodeSet8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Empty expression context" + "'", str12, "Empty expression context");
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        java.lang.Object obj3 = unionContext2.getValue();
        boolean boolean4 = unionContext2.isChildOrderingRequired();
        int int5 = unionContext2.getPosition();
        unionContext2.reset();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = unionContext2.getCurrentNodePointer();
        java.lang.Object obj8 = unionContext2.getValue();
        boolean boolean9 = unionContext2.hasNext();
        org.apache.commons.jxpath.NodeSet nodeSet10 = unionContext2.getNodeSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext11 = unionContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeSet10);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        java.lang.Object obj3 = unionContext2.getValue();
        int int4 = unionContext2.getPosition();
        java.util.List list5 = unionContext2.getContextNodeList();
        org.apache.commons.jxpath.NodeSet nodeSet6 = unionContext2.getNodeSet();
        boolean boolean8 = unionContext2.setPosition((int) (short) 0);
        org.apache.commons.jxpath.Pointer pointer9 = unionContext2.getContextNodePointer();
        java.lang.Object obj10 = unionContext2.getValue();
        int int11 = unionContext2.getPosition();
        boolean boolean12 = unionContext2.hasNext();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(nodeSet6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(pointer9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.NodeSet nodeSet3 = unionContext2.getNodeSet();
        boolean boolean4 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext5, evalContextArray6);
        boolean boolean8 = unionContext7.nextSet();
        org.apache.commons.jxpath.Pointer pointer9 = unionContext7.getContextNodePointer();
        java.util.List list10 = unionContext7.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        boolean boolean15 = unionContext13.setPosition((int) (byte) 100);
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray17 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext18 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray17);
        boolean boolean19 = unionContext18.nextSet();
        int int20 = unionContext18.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext21 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray22 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext23 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext21, evalContextArray22);
        boolean boolean24 = unionContext23.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer25 = unionContext23.getContextNodePointer();
        java.lang.Object obj26 = unionContext23.getValue();
        boolean boolean27 = unionContext23.nextNode();
        org.apache.commons.jxpath.ri.EvalContext evalContext28 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray29 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext30 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext28, evalContextArray29);
        boolean boolean32 = unionContext30.setPosition((int) (byte) 100);
        int int33 = unionContext30.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext34 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray35 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext36 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext34, evalContextArray35);
        boolean boolean37 = unionContext36.nextSet();
        org.apache.commons.jxpath.Pointer pointer38 = unionContext36.getContextNodePointer();
        boolean boolean39 = unionContext36.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext40 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray41 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext42 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext40, evalContextArray41);
        boolean boolean43 = unionContext42.nextSet();
        org.apache.commons.jxpath.Pointer pointer44 = unionContext42.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext45 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray46 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext47 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext45, evalContextArray46);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray48 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext42, evalContext45 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext49 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext36, evalContextArray48);
        boolean boolean50 = unionContext36.nextSet();
        boolean boolean51 = unionContext36.hasNext();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray52 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext13, unionContext18, unionContext23, unionContext30, unionContext36 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext53 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext7, evalContextArray52);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext54 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray52);
        boolean boolean56 = unionContext2.setPosition(0);
        boolean boolean57 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer58 = unionContext2.getContextNodePointer();
        org.apache.commons.jxpath.NodeSet nodeSet59 = unionContext2.getNodeSet();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(pointer9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(evalContextArray17);
        org.junit.Assert.assertArrayEquals(evalContextArray17, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(evalContextArray22);
        org.junit.Assert.assertArrayEquals(evalContextArray22, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(pointer25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(evalContextArray29);
        org.junit.Assert.assertArrayEquals(evalContextArray29, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(evalContextArray35);
        org.junit.Assert.assertArrayEquals(evalContextArray35, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(pointer38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(evalContextArray41);
        org.junit.Assert.assertArrayEquals(evalContextArray41, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(pointer44);
        org.junit.Assert.assertNotNull(evalContextArray46);
        org.junit.Assert.assertArrayEquals(evalContextArray46, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(evalContextArray52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(pointer58);
        org.junit.Assert.assertNotNull(nodeSet59);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.Pointer pointer3 = unionContext2.getContextNodePointer();
        java.lang.Object obj4 = unionContext2.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet5 = unionContext2.getNodeSet();
        int int6 = unionContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray8 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext9 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext7, evalContextArray8);
        java.util.List list10 = unionContext9.getContextNodeList();
        unionContext9.reset();
        java.util.List list12 = unionContext9.getContextNodeList();
        int int13 = unionContext9.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext14 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray15 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext16 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext14, evalContextArray15);
        boolean boolean17 = unionContext16.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer18 = unionContext16.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext19 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray20 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext21 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext19, evalContextArray20);
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray23 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext24 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext22, evalContextArray23);
        boolean boolean25 = unionContext24.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext26 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray27 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext28 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext26, evalContextArray27);
        boolean boolean29 = unionContext28.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext30 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray31 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext32 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext30, evalContextArray31);
        java.util.List list33 = unionContext32.getContextNodeList();
        unionContext32.reset();
        java.util.List list35 = unionContext32.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext36 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray37 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext38 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext36, evalContextArray37);
        java.util.List list39 = unionContext38.getContextNodeList();
        unionContext38.reset();
        java.util.List list41 = unionContext38.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext42 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray43 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext44 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext42, evalContextArray43);
        java.util.List list45 = unionContext44.getContextNodeList();
        unionContext44.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray47 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext19, unionContext24, unionContext28, unionContext32, unionContext38, unionContext44 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext48 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext16, evalContextArray47);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext49 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext9, evalContextArray47);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext50 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray47);
        boolean boolean51 = unionContext2.isChildOrderingRequired();
        boolean boolean53 = unionContext2.setPosition((-1));
        org.apache.commons.jxpath.Pointer pointer54 = unionContext2.getSingleNodePointer();
        org.apache.commons.jxpath.Pointer pointer55 = unionContext2.getSingleNodePointer();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[]");
        org.junit.Assert.assertNotNull(nodeSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(evalContextArray8);
        org.junit.Assert.assertArrayEquals(evalContextArray8, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(evalContextArray15);
        org.junit.Assert.assertArrayEquals(evalContextArray15, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(pointer18);
        org.junit.Assert.assertNotNull(evalContextArray20);
        org.junit.Assert.assertArrayEquals(evalContextArray20, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray23);
        org.junit.Assert.assertArrayEquals(evalContextArray23, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(evalContextArray27);
        org.junit.Assert.assertArrayEquals(evalContextArray27, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(evalContextArray31);
        org.junit.Assert.assertArrayEquals(evalContextArray31, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(evalContextArray37);
        org.junit.Assert.assertArrayEquals(evalContextArray37, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(evalContextArray43);
        org.junit.Assert.assertArrayEquals(evalContextArray43, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(evalContextArray47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(pointer54);
        org.junit.Assert.assertNull(pointer55);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        java.util.List list3 = unionContext2.getContextNodeList();
        java.lang.Object obj4 = unionContext2.getValue();
        boolean boolean5 = unionContext2.hasNext();
        boolean boolean6 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer7 = unionContext2.getSingleNodePointer();
        int int8 = unionContext2.getPosition();
        int int9 = unionContext2.getDocumentOrder();
        java.lang.Object obj10 = unionContext2.getValue();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "[]");
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext5, evalContextArray6);
        org.apache.commons.jxpath.ri.EvalContext evalContext8 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray9 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext10 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext8, evalContextArray9);
        boolean boolean11 = unionContext10.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray13 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext14 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext12, evalContextArray13);
        boolean boolean15 = unionContext14.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray17 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext18 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray17);
        java.util.List list19 = unionContext18.getContextNodeList();
        unionContext18.reset();
        java.util.List list21 = unionContext18.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray23 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext24 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext22, evalContextArray23);
        java.util.List list25 = unionContext24.getContextNodeList();
        unionContext24.reset();
        java.util.List list27 = unionContext24.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext28 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray29 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext30 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext28, evalContextArray29);
        java.util.List list31 = unionContext30.getContextNodeList();
        unionContext30.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray33 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5, unionContext10, unionContext14, unionContext18, unionContext24, unionContext30 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext34 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray33);
        int int35 = unionContext2.getPosition();
        boolean boolean37 = unionContext2.setPosition((int) 'a');
        int int38 = unionContext2.getDocumentOrder();
        java.lang.Object obj39 = unionContext2.getValue();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer40 = unionContext2.getCurrentNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 96 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray9);
        org.junit.Assert.assertArrayEquals(evalContextArray9, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(evalContextArray13);
        org.junit.Assert.assertArrayEquals(evalContextArray13, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(evalContextArray17);
        org.junit.Assert.assertArrayEquals(evalContextArray17, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(evalContextArray23);
        org.junit.Assert.assertArrayEquals(evalContextArray23, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(evalContextArray29);
        org.junit.Assert.assertArrayEquals(evalContextArray29, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(evalContextArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "[]");
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        java.lang.Object obj5 = unionContext2.getValue();
        boolean boolean6 = unionContext2.nextNode();
        java.util.List list7 = unionContext2.getContextNodeList();
        org.apache.commons.jxpath.NodeSet nodeSet8 = unionContext2.getNodeSet();
        boolean boolean9 = unionContext2.nextSet();
        boolean boolean10 = unionContext2.nextSet();
        int int11 = unionContext2.getPosition();
        java.lang.Object obj12 = unionContext2.getValue();
        boolean boolean14 = unionContext2.setPosition((int) (short) 1);
        int int15 = unionContext2.getDocumentOrder();
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext17 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray18 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext19 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext17, evalContextArray18);
        boolean boolean20 = unionContext19.nextSet();
        boolean boolean22 = unionContext19.setPosition((int) (byte) 10);
        boolean boolean23 = unionContext19.hasNext();
        org.apache.commons.jxpath.NodeSet nodeSet24 = unionContext19.getNodeSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext25 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray26 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext27 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext25, evalContextArray26);
        java.util.List list28 = unionContext27.getContextNodeList();
        java.lang.Object obj29 = unionContext27.getValue();
        boolean boolean30 = unionContext27.hasNext();
        boolean boolean31 = unionContext27.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext32 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray33 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext34 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext32, evalContextArray33);
        org.apache.commons.jxpath.Pointer pointer35 = unionContext34.getContextNodePointer();
        java.lang.Object obj36 = unionContext34.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet37 = unionContext34.getNodeSet();
        int int38 = unionContext34.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext39 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray40 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext41 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext39, evalContextArray40);
        java.util.List list42 = unionContext41.getContextNodeList();
        unionContext41.reset();
        java.util.List list44 = unionContext41.getContextNodeList();
        int int45 = unionContext41.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext46 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray47 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext48 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext46, evalContextArray47);
        boolean boolean49 = unionContext48.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer50 = unionContext48.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext51 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray52 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext53 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext51, evalContextArray52);
        org.apache.commons.jxpath.ri.EvalContext evalContext54 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray55 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext56 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext54, evalContextArray55);
        boolean boolean57 = unionContext56.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext58 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray59 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext60 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext58, evalContextArray59);
        boolean boolean61 = unionContext60.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext62 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray63 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext64 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext62, evalContextArray63);
        java.util.List list65 = unionContext64.getContextNodeList();
        unionContext64.reset();
        java.util.List list67 = unionContext64.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext68 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray69 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext70 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext68, evalContextArray69);
        java.util.List list71 = unionContext70.getContextNodeList();
        unionContext70.reset();
        java.util.List list73 = unionContext70.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext74 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray75 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext76 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext74, evalContextArray75);
        java.util.List list77 = unionContext76.getContextNodeList();
        unionContext76.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray79 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext51, unionContext56, unionContext60, unionContext64, unionContext70, unionContext76 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext80 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext48, evalContextArray79);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext81 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext41, evalContextArray79);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext82 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext34, evalContextArray79);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext83 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext27, evalContextArray79);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext84 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext19, evalContextArray79);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext85 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray79);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext86 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray79);
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(nodeSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(evalContextArray18);
        org.junit.Assert.assertArrayEquals(evalContextArray18, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(nodeSet24);
        org.junit.Assert.assertNotNull(evalContextArray26);
        org.junit.Assert.assertArrayEquals(evalContextArray26, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(evalContextArray33);
        org.junit.Assert.assertArrayEquals(evalContextArray33, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "[]");
        org.junit.Assert.assertNotNull(nodeSet37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(evalContextArray40);
        org.junit.Assert.assertArrayEquals(evalContextArray40, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(evalContextArray47);
        org.junit.Assert.assertArrayEquals(evalContextArray47, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(pointer50);
        org.junit.Assert.assertNotNull(evalContextArray52);
        org.junit.Assert.assertArrayEquals(evalContextArray52, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray55);
        org.junit.Assert.assertArrayEquals(evalContextArray55, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(evalContextArray59);
        org.junit.Assert.assertArrayEquals(evalContextArray59, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(evalContextArray63);
        org.junit.Assert.assertArrayEquals(evalContextArray63, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list65);
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertNotNull(evalContextArray69);
        org.junit.Assert.assertArrayEquals(evalContextArray69, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list71);
        org.junit.Assert.assertNotNull(list73);
        org.junit.Assert.assertNotNull(evalContextArray75);
        org.junit.Assert.assertArrayEquals(evalContextArray75, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list77);
        org.junit.Assert.assertNotNull(evalContextArray79);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.Pointer pointer3 = unionContext2.getContextNodePointer();
        java.lang.Object obj4 = unionContext2.getValue();
        boolean boolean5 = unionContext2.isChildOrderingRequired();
        unionContext2.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray8 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext9 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext7, evalContextArray8);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext10 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray8);
        int int11 = unionContext10.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray13 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext14 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext12, evalContextArray13);
        org.apache.commons.jxpath.NodeSet nodeSet15 = unionContext14.getNodeSet();
        java.lang.String str16 = unionContext14.toString();
        unionContext14.reset();
        int int18 = unionContext14.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext19 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray20 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext21 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext19, evalContextArray20);
        unionContext21.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext23 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray24 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext25 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext23, evalContextArray24);
        boolean boolean26 = unionContext25.hasNext();
        int int27 = unionContext25.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext28 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray29 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext30 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext28, evalContextArray29);
        boolean boolean31 = unionContext30.nextSet();
        org.apache.commons.jxpath.Pointer pointer32 = unionContext30.getContextNodePointer();
        boolean boolean33 = unionContext30.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext34 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray35 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext36 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext34, evalContextArray35);
        boolean boolean37 = unionContext36.nextSet();
        org.apache.commons.jxpath.Pointer pointer38 = unionContext36.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext39 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray40 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext41 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext39, evalContextArray40);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray42 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext36, evalContext39 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext43 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext30, evalContextArray42);
        org.apache.commons.jxpath.NodeSet nodeSet44 = unionContext30.getNodeSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext45 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray46 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext47 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext45, evalContextArray46);
        org.apache.commons.jxpath.Pointer pointer48 = unionContext47.getContextNodePointer();
        java.lang.Object obj49 = unionContext47.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet50 = unionContext47.getNodeSet();
        int int51 = unionContext47.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext52 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray53 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext54 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext52, evalContextArray53);
        org.apache.commons.jxpath.Pointer pointer55 = unionContext54.getSingleNodePointer();
        int int56 = unionContext54.getCurrentPosition();
        int int57 = unionContext54.getDocumentOrder();
        org.apache.commons.jxpath.ri.EvalContext evalContext58 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray59 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext60 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext58, evalContextArray59);
        boolean boolean61 = unionContext60.nextNode();
        int int62 = unionContext60.getDocumentOrder();
        boolean boolean63 = unionContext60.isChildOrderingRequired();
        java.util.List list64 = unionContext60.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext65 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray66 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext67 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext65, evalContextArray66);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext68 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext60, evalContextArray66);
        org.apache.commons.jxpath.ri.EvalContext evalContext69 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray70 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext71 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext69, evalContextArray70);
        java.util.List list72 = unionContext71.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray73 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext25, unionContext30, unionContext47, unionContext54, unionContext68, unionContext71 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext74 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext21, evalContextArray73);
        org.apache.commons.jxpath.ri.EvalContext evalContext75 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray76 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext77 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext75, evalContextArray76);
        org.apache.commons.jxpath.Pointer pointer78 = unionContext77.getContextNodePointer();
        java.lang.Object obj79 = unionContext77.getValue();
        boolean boolean80 = unionContext77.isChildOrderingRequired();
        unionContext77.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext82 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray83 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext84 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext82, evalContextArray83);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext85 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext77, evalContextArray83);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext86 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext74, evalContextArray83);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext87 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext14, evalContextArray83);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext88 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext10, evalContextArray83);
        java.lang.String str89 = unionContext88.toString();
        unionContext88.reset();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(evalContextArray8);
        org.junit.Assert.assertArrayEquals(evalContextArray8, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(evalContextArray13);
        org.junit.Assert.assertArrayEquals(evalContextArray13, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Empty expression context" + "'", str16, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(evalContextArray20);
        org.junit.Assert.assertArrayEquals(evalContextArray20, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray24);
        org.junit.Assert.assertArrayEquals(evalContextArray24, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(evalContextArray29);
        org.junit.Assert.assertArrayEquals(evalContextArray29, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(pointer32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(evalContextArray35);
        org.junit.Assert.assertArrayEquals(evalContextArray35, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(pointer38);
        org.junit.Assert.assertNotNull(evalContextArray40);
        org.junit.Assert.assertArrayEquals(evalContextArray40, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray42);
        org.junit.Assert.assertNotNull(nodeSet44);
        org.junit.Assert.assertNotNull(evalContextArray46);
        org.junit.Assert.assertArrayEquals(evalContextArray46, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertEquals(obj49.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj49), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj49), "[]");
        org.junit.Assert.assertNotNull(nodeSet50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(evalContextArray53);
        org.junit.Assert.assertArrayEquals(evalContextArray53, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(evalContextArray59);
        org.junit.Assert.assertArrayEquals(evalContextArray59, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertNotNull(evalContextArray66);
        org.junit.Assert.assertArrayEquals(evalContextArray66, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray70);
        org.junit.Assert.assertArrayEquals(evalContextArray70, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list72);
        org.junit.Assert.assertNotNull(evalContextArray73);
        org.junit.Assert.assertNotNull(evalContextArray76);
        org.junit.Assert.assertArrayEquals(evalContextArray76, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer78);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertEquals(obj79.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj79), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj79), "[]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(evalContextArray83);
        org.junit.Assert.assertArrayEquals(evalContextArray83, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Empty expression context" + "'", str89, "Empty expression context");
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.Pointer pointer3 = unionContext2.getContextNodePointer();
        java.lang.Object obj4 = unionContext2.getValue();
        boolean boolean5 = unionContext2.isChildOrderingRequired();
        unionContext2.reset();
        org.apache.commons.jxpath.Pointer pointer7 = unionContext2.getSingleNodePointer();
        boolean boolean8 = unionContext2.nextSet();
        boolean boolean9 = unionContext2.hasNext();
        boolean boolean11 = unionContext2.setPosition((int) (byte) 0);
        org.apache.commons.jxpath.Pointer pointer12 = unionContext2.getSingleNodePointer();
        int int13 = unionContext2.getDocumentOrder();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(pointer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.NodeSet nodeSet3 = unionContext2.getNodeSet();
        boolean boolean4 = unionContext2.isChildOrderingRequired();
        java.lang.String str5 = unionContext2.toString();
        unionContext2.reset();
        java.lang.Object obj7 = unionContext2.getValue();
        boolean boolean8 = unionContext2.isChildOrderingRequired();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Empty expression context" + "'", str5, "Empty expression context");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        int int4 = unionContext2.getDocumentOrder();
        org.apache.commons.jxpath.NodeSet nodeSet5 = unionContext2.getNodeSet();
        boolean boolean6 = unionContext2.isChildOrderingRequired();
        int int7 = unionContext2.getDocumentOrder();
        boolean boolean8 = unionContext2.hasNext();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        java.lang.Object obj5 = unionContext2.getValue();
        boolean boolean6 = unionContext2.nextNode();
        java.util.List list7 = unionContext2.getContextNodeList();
        org.apache.commons.jxpath.NodeSet nodeSet8 = unionContext2.getNodeSet();
        int int9 = unionContext2.getCurrentPosition();
        org.apache.commons.jxpath.Pointer pointer10 = unionContext2.getSingleNodePointer();
        int int11 = unionContext2.getPosition();
        unionContext2.reset();
        int int13 = unionContext2.getDocumentOrder();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer14 = unionContext2.getCurrentNodePointer();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(nodeSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(nodePointer14);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.NodeSet nodeSet3 = unionContext2.getNodeSet();
        java.lang.String str4 = unionContext2.toString();
        boolean boolean5 = unionContext2.hasNext();
        int int6 = unionContext2.getCurrentPosition();
        boolean boolean7 = unionContext2.nextSet();
        java.lang.Object obj8 = unionContext2.getValue();
        java.util.List list9 = unionContext2.getContextNodeList();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext10 = unionContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Empty expression context" + "'", str4, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "[]");
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        unionContext2.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray5 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext6 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray5);
        boolean boolean7 = unionContext6.nextSet();
        java.lang.String str8 = unionContext6.toString();
        java.util.List list9 = unionContext6.getContextNodeList();
        boolean boolean10 = unionContext6.nextNode();
        boolean boolean11 = unionContext6.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray13 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext14 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext12, evalContextArray13);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext15 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext6, evalContextArray13);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext16 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray13);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = unionContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext18 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray19 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext20 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext18, evalContextArray19);
        boolean boolean21 = unionContext20.nextSet();
        java.lang.String str22 = unionContext20.toString();
        java.util.List list23 = unionContext20.getContextNodeList();
        boolean boolean24 = unionContext20.nextNode();
        boolean boolean25 = unionContext20.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext26 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray27 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext28 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext26, evalContextArray27);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext29 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext20, evalContextArray27);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext30 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray27);
        boolean boolean31 = unionContext2.isChildOrderingRequired();
        java.util.List list32 = unionContext2.getContextNodeList();
        boolean boolean33 = unionContext2.nextSet();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray5);
        org.junit.Assert.assertArrayEquals(evalContextArray5, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(evalContextArray13);
        org.junit.Assert.assertArrayEquals(evalContextArray13, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(nodePointer17);
        org.junit.Assert.assertNotNull(evalContextArray19);
        org.junit.Assert.assertArrayEquals(evalContextArray19, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Empty expression context" + "'", str22, "Empty expression context");
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(evalContextArray27);
        org.junit.Assert.assertArrayEquals(evalContextArray27, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        java.util.List list5 = unionContext2.getContextNodeList();
        boolean boolean6 = unionContext2.nextSet();
        boolean boolean8 = unionContext2.setPosition((int) (short) 1);
        boolean boolean9 = unionContext2.hasNext();
        java.util.List list10 = unionContext2.getContextNodeList();
        boolean boolean12 = unionContext2.setPosition(4);
        int int13 = unionContext2.getPosition();
        boolean boolean14 = unionContext2.nextNode();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        java.util.List list5 = unionContext2.getContextNodeList();
        int int6 = unionContext2.getCurrentPosition();
        boolean boolean7 = unionContext2.isChildOrderingRequired();
        boolean boolean9 = unionContext2.setPosition((int) (short) 100);
        org.apache.commons.jxpath.Pointer pointer10 = unionContext2.getSingleNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        unionContext13.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext15 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray16 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext17 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext15, evalContextArray16);
        boolean boolean18 = unionContext17.hasNext();
        int int19 = unionContext17.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext20 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray21 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext22 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext20, evalContextArray21);
        boolean boolean23 = unionContext22.nextSet();
        org.apache.commons.jxpath.Pointer pointer24 = unionContext22.getContextNodePointer();
        boolean boolean25 = unionContext22.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext26 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray27 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext28 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext26, evalContextArray27);
        boolean boolean29 = unionContext28.nextSet();
        org.apache.commons.jxpath.Pointer pointer30 = unionContext28.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext31 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray32 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext33 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext31, evalContextArray32);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray34 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext28, evalContext31 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext35 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext22, evalContextArray34);
        org.apache.commons.jxpath.NodeSet nodeSet36 = unionContext22.getNodeSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext37 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray38 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext39 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext37, evalContextArray38);
        org.apache.commons.jxpath.Pointer pointer40 = unionContext39.getContextNodePointer();
        java.lang.Object obj41 = unionContext39.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet42 = unionContext39.getNodeSet();
        int int43 = unionContext39.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext44 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray45 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext46 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext44, evalContextArray45);
        org.apache.commons.jxpath.Pointer pointer47 = unionContext46.getSingleNodePointer();
        int int48 = unionContext46.getCurrentPosition();
        int int49 = unionContext46.getDocumentOrder();
        org.apache.commons.jxpath.ri.EvalContext evalContext50 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray51 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext52 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext50, evalContextArray51);
        boolean boolean53 = unionContext52.nextNode();
        int int54 = unionContext52.getDocumentOrder();
        boolean boolean55 = unionContext52.isChildOrderingRequired();
        java.util.List list56 = unionContext52.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext57 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray58 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext59 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext57, evalContextArray58);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext60 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext52, evalContextArray58);
        org.apache.commons.jxpath.ri.EvalContext evalContext61 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray62 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext63 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext61, evalContextArray62);
        java.util.List list64 = unionContext63.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray65 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext17, unionContext22, unionContext39, unionContext46, unionContext60, unionContext63 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext66 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext13, evalContextArray65);
        org.apache.commons.jxpath.ri.EvalContext evalContext67 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray68 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext69 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext67, evalContextArray68);
        org.apache.commons.jxpath.Pointer pointer70 = unionContext69.getContextNodePointer();
        java.lang.Object obj71 = unionContext69.getValue();
        boolean boolean72 = unionContext69.isChildOrderingRequired();
        unionContext69.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext74 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray75 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext76 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext74, evalContextArray75);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext77 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext69, evalContextArray75);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext78 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext66, evalContextArray75);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext79 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray75);
        boolean boolean80 = unionContext79.hasNext();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray16);
        org.junit.Assert.assertArrayEquals(evalContextArray16, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(evalContextArray21);
        org.junit.Assert.assertArrayEquals(evalContextArray21, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(pointer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(evalContextArray27);
        org.junit.Assert.assertArrayEquals(evalContextArray27, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(pointer30);
        org.junit.Assert.assertNotNull(evalContextArray32);
        org.junit.Assert.assertArrayEquals(evalContextArray32, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray34);
        org.junit.Assert.assertNotNull(nodeSet36);
        org.junit.Assert.assertNotNull(evalContextArray38);
        org.junit.Assert.assertArrayEquals(evalContextArray38, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals(obj41.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj41), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj41), "[]");
        org.junit.Assert.assertNotNull(nodeSet42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(evalContextArray45);
        org.junit.Assert.assertArrayEquals(evalContextArray45, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(evalContextArray51);
        org.junit.Assert.assertArrayEquals(evalContextArray51, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(evalContextArray58);
        org.junit.Assert.assertArrayEquals(evalContextArray58, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray62);
        org.junit.Assert.assertArrayEquals(evalContextArray62, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertNotNull(evalContextArray65);
        org.junit.Assert.assertNotNull(evalContextArray68);
        org.junit.Assert.assertArrayEquals(evalContextArray68, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer70);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertEquals(obj71.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj71), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj71), "[]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(evalContextArray75);
        org.junit.Assert.assertArrayEquals(evalContextArray75, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        unionContext2.reset();
        int int4 = unionContext2.getPosition();
        int int5 = unionContext2.getPosition();
        int int6 = unionContext2.getDocumentOrder();
        java.lang.String str7 = unionContext2.toString();
        boolean boolean8 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.NodeSet nodeSet9 = unionContext2.getNodeSet();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Empty expression context" + "'", str7, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeSet9);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.hasNext();
        java.lang.Object obj4 = unionContext2.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet5 = unionContext2.getNodeSet();
        int int6 = unionContext2.getCurrentPosition();
        int int7 = unionContext2.getPosition();
        int int8 = unionContext2.getCurrentPosition();
        boolean boolean9 = unionContext2.hasNext();
        int int10 = unionContext2.getPosition();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[]");
        org.junit.Assert.assertNotNull(nodeSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.hasNext();
        java.lang.Object obj4 = unionContext2.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet5 = unionContext2.getNodeSet();
        int int6 = unionContext2.getCurrentPosition();
        int int7 = unionContext2.getPosition();
        boolean boolean9 = unionContext2.setPosition(100);
        org.apache.commons.jxpath.Pointer pointer10 = unionContext2.getSingleNodePointer();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[]");
        org.junit.Assert.assertNotNull(nodeSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(pointer10);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        boolean boolean5 = unionContext2.nextSet();
        java.lang.Object obj6 = unionContext2.getValue();
        int int7 = unionContext2.getDocumentOrder();
        java.lang.Object obj8 = unionContext2.getValue();
        org.apache.commons.jxpath.Pointer pointer9 = unionContext2.getSingleNodePointer();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "[]");
        org.junit.Assert.assertNull(pointer9);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        boolean boolean5 = unionContext2.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray7 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext6, evalContextArray7);
        boolean boolean9 = unionContext8.nextSet();
        org.apache.commons.jxpath.Pointer pointer10 = unionContext8.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray14 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext8, evalContext11 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext15 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray14);
        org.apache.commons.jxpath.NodeSet nodeSet16 = unionContext15.getNodeSet();
        org.apache.commons.jxpath.NodeSet nodeSet17 = unionContext15.getNodeSet();
        boolean boolean18 = unionContext15.isChildOrderingRequired();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(evalContextArray7);
        org.junit.Assert.assertArrayEquals(evalContextArray7, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray14);
        org.junit.Assert.assertNotNull(nodeSet16);
        org.junit.Assert.assertNotNull(nodeSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextNode();
        int int4 = unionContext2.getDocumentOrder();
        boolean boolean5 = unionContext2.isChildOrderingRequired();
        java.util.List list6 = unionContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray8 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext9 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext7, evalContextArray8);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext10 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray8);
        int int11 = unionContext2.getDocumentOrder();
        int int12 = unionContext2.getDocumentOrder();
        java.util.List list13 = unionContext2.getContextNodeList();
        int int14 = unionContext2.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer15 = unionContext2.getCurrentNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(evalContextArray8);
        org.junit.Assert.assertArrayEquals(evalContextArray8, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        boolean boolean5 = unionContext2.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray7 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext6, evalContextArray7);
        boolean boolean9 = unionContext8.nextSet();
        org.apache.commons.jxpath.Pointer pointer10 = unionContext8.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray14 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext8, evalContext11 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext15 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray14);
        org.apache.commons.jxpath.NodeSet nodeSet16 = unionContext15.getNodeSet();
        boolean boolean17 = unionContext15.isChildOrderingRequired();
        // The following exception was thrown during execution in test generation
        try {
            unionContext15.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(evalContextArray7);
        org.junit.Assert.assertArrayEquals(evalContextArray7, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray14);
        org.junit.Assert.assertNotNull(nodeSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.NodeSet nodeSet3 = unionContext2.getNodeSet();
        java.lang.String str4 = unionContext2.toString();
        unionContext2.reset();
        int int6 = unionContext2.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray8 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext9 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext7, evalContextArray8);
        unionContext9.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        boolean boolean14 = unionContext13.hasNext();
        int int15 = unionContext13.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray17 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext18 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray17);
        boolean boolean19 = unionContext18.nextSet();
        org.apache.commons.jxpath.Pointer pointer20 = unionContext18.getContextNodePointer();
        boolean boolean21 = unionContext18.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray23 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext24 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext22, evalContextArray23);
        boolean boolean25 = unionContext24.nextSet();
        org.apache.commons.jxpath.Pointer pointer26 = unionContext24.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext27 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray28 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext29 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext27, evalContextArray28);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray30 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext24, evalContext27 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext31 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext18, evalContextArray30);
        org.apache.commons.jxpath.NodeSet nodeSet32 = unionContext18.getNodeSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext33 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray34 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext35 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext33, evalContextArray34);
        org.apache.commons.jxpath.Pointer pointer36 = unionContext35.getContextNodePointer();
        java.lang.Object obj37 = unionContext35.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet38 = unionContext35.getNodeSet();
        int int39 = unionContext35.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext40 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray41 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext42 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext40, evalContextArray41);
        org.apache.commons.jxpath.Pointer pointer43 = unionContext42.getSingleNodePointer();
        int int44 = unionContext42.getCurrentPosition();
        int int45 = unionContext42.getDocumentOrder();
        org.apache.commons.jxpath.ri.EvalContext evalContext46 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray47 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext48 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext46, evalContextArray47);
        boolean boolean49 = unionContext48.nextNode();
        int int50 = unionContext48.getDocumentOrder();
        boolean boolean51 = unionContext48.isChildOrderingRequired();
        java.util.List list52 = unionContext48.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext53 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray54 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext55 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext53, evalContextArray54);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext56 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext48, evalContextArray54);
        org.apache.commons.jxpath.ri.EvalContext evalContext57 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray58 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext59 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext57, evalContextArray58);
        java.util.List list60 = unionContext59.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray61 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext13, unionContext18, unionContext35, unionContext42, unionContext56, unionContext59 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext62 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext9, evalContextArray61);
        org.apache.commons.jxpath.ri.EvalContext evalContext63 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray64 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext65 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext63, evalContextArray64);
        org.apache.commons.jxpath.Pointer pointer66 = unionContext65.getContextNodePointer();
        java.lang.Object obj67 = unionContext65.getValue();
        boolean boolean68 = unionContext65.isChildOrderingRequired();
        unionContext65.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext70 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray71 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext72 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext70, evalContextArray71);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext73 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext65, evalContextArray71);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext74 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext62, evalContextArray71);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext75 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray71);
        org.apache.commons.jxpath.NodeSet nodeSet76 = unionContext2.getNodeSet();
        java.util.List list77 = unionContext2.getContextNodeList();
        boolean boolean78 = unionContext2.isChildOrderingRequired();
        java.lang.String str79 = unionContext2.toString();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Empty expression context" + "'", str4, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(evalContextArray8);
        org.junit.Assert.assertArrayEquals(evalContextArray8, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(evalContextArray17);
        org.junit.Assert.assertArrayEquals(evalContextArray17, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(pointer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(evalContextArray23);
        org.junit.Assert.assertArrayEquals(evalContextArray23, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(pointer26);
        org.junit.Assert.assertNotNull(evalContextArray28);
        org.junit.Assert.assertArrayEquals(evalContextArray28, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray30);
        org.junit.Assert.assertNotNull(nodeSet32);
        org.junit.Assert.assertNotNull(evalContextArray34);
        org.junit.Assert.assertArrayEquals(evalContextArray34, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "[]");
        org.junit.Assert.assertNotNull(nodeSet38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(evalContextArray41);
        org.junit.Assert.assertArrayEquals(evalContextArray41, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(evalContextArray47);
        org.junit.Assert.assertArrayEquals(evalContextArray47, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(evalContextArray54);
        org.junit.Assert.assertArrayEquals(evalContextArray54, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray58);
        org.junit.Assert.assertArrayEquals(evalContextArray58, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertNotNull(evalContextArray61);
        org.junit.Assert.assertNotNull(evalContextArray64);
        org.junit.Assert.assertArrayEquals(evalContextArray64, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer66);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertEquals(obj67.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj67), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj67), "[]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(evalContextArray71);
        org.junit.Assert.assertArrayEquals(evalContextArray71, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet76);
        org.junit.Assert.assertNotNull(list77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Empty expression context" + "'", str79, "Empty expression context");
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext5, evalContextArray6);
        org.apache.commons.jxpath.ri.EvalContext evalContext8 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray9 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext10 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext8, evalContextArray9);
        boolean boolean11 = unionContext10.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray13 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext14 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext12, evalContextArray13);
        boolean boolean15 = unionContext14.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray17 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext18 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray17);
        java.util.List list19 = unionContext18.getContextNodeList();
        unionContext18.reset();
        java.util.List list21 = unionContext18.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray23 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext24 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext22, evalContextArray23);
        java.util.List list25 = unionContext24.getContextNodeList();
        unionContext24.reset();
        java.util.List list27 = unionContext24.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext28 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray29 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext30 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext28, evalContextArray29);
        java.util.List list31 = unionContext30.getContextNodeList();
        unionContext30.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray33 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext5, unionContext10, unionContext14, unionContext18, unionContext24, unionContext30 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext34 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray33);
        boolean boolean36 = unionContext2.setPosition((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            unionContext2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray9);
        org.junit.Assert.assertArrayEquals(evalContextArray9, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(evalContextArray13);
        org.junit.Assert.assertArrayEquals(evalContextArray13, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(evalContextArray17);
        org.junit.Assert.assertArrayEquals(evalContextArray17, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(evalContextArray23);
        org.junit.Assert.assertArrayEquals(evalContextArray23, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(evalContextArray29);
        org.junit.Assert.assertArrayEquals(evalContextArray29, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(evalContextArray33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.NodeSet nodeSet3 = unionContext2.getNodeSet();
        java.lang.String str4 = unionContext2.toString();
        boolean boolean5 = unionContext2.hasNext();
        org.apache.commons.jxpath.Pointer pointer6 = unionContext2.getSingleNodePointer();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer7 = unionContext2.getCurrentNodePointer();
        boolean boolean8 = unionContext2.isChildOrderingRequired();
        java.util.List list9 = unionContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer10 = unionContext2.getSingleNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext11 = unionContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Empty expression context" + "'", str4, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNull(nodePointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(pointer10);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        java.lang.Object obj5 = unionContext2.getValue();
        boolean boolean6 = unionContext2.nextNode();
        java.util.List list7 = unionContext2.getContextNodeList();
        org.apache.commons.jxpath.NodeSet nodeSet8 = unionContext2.getNodeSet();
        int int9 = unionContext2.getCurrentPosition();
        boolean boolean10 = unionContext2.hasNext();
        org.apache.commons.jxpath.NodeSet nodeSet11 = unionContext2.getNodeSet();
        org.apache.commons.jxpath.NodeSet nodeSet12 = unionContext2.getNodeSet();
        boolean boolean13 = unionContext2.isChildOrderingRequired();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(nodeSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodeSet11);
        org.junit.Assert.assertNotNull(nodeSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.Pointer pointer3 = unionContext2.getSingleNodePointer();
        int int4 = unionContext2.getCurrentPosition();
        unionContext2.reset();
        java.lang.String str6 = unionContext2.toString();
        boolean boolean7 = unionContext2.hasNext();
        java.lang.Class<?> wildcardClass8 = unionContext2.getClass();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Empty expression context" + "'", str6, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.NodeSet nodeSet3 = unionContext2.getNodeSet();
        int int4 = unionContext2.getCurrentPosition();
        java.lang.String str5 = unionContext2.toString();
        int int6 = unionContext2.getPosition();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Empty expression context" + "'", str5, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        java.util.List list3 = unionContext2.getContextNodeList();
        unionContext2.reset();
        java.util.List list5 = unionContext2.getContextNodeList();
        org.apache.commons.jxpath.Pointer pointer6 = unionContext2.getSingleNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray8 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext9 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext7, evalContextArray8);
        boolean boolean11 = unionContext9.setPosition((int) (byte) 100);
        boolean boolean12 = unionContext9.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext13 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray14 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext15 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext13, evalContextArray14);
        boolean boolean16 = unionContext15.nextNode();
        boolean boolean18 = unionContext15.setPosition(52);
        org.apache.commons.jxpath.ri.EvalContext evalContext19 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray20 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext21 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext19, evalContextArray20);
        boolean boolean22 = unionContext21.nextSet();
        org.apache.commons.jxpath.Pointer pointer23 = unionContext21.getContextNodePointer();
        java.util.List list24 = unionContext21.getContextNodeList();
        int int25 = unionContext21.getCurrentPosition();
        boolean boolean26 = unionContext21.isChildOrderingRequired();
        boolean boolean28 = unionContext21.setPosition((int) (short) 100);
        org.apache.commons.jxpath.Pointer pointer29 = unionContext21.getSingleNodePointer();
        org.apache.commons.jxpath.Pointer pointer30 = unionContext21.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext31 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray32 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext33 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext31, evalContextArray32);
        java.util.List list34 = unionContext33.getContextNodeList();
        unionContext33.reset();
        java.util.List list36 = unionContext33.getContextNodeList();
        int int37 = unionContext33.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext38 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray39 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext40 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext38, evalContextArray39);
        org.apache.commons.jxpath.Pointer pointer41 = unionContext40.getContextNodePointer();
        java.lang.Object obj42 = unionContext40.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet43 = unionContext40.getNodeSet();
        int int44 = unionContext40.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext45 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray46 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext47 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext45, evalContextArray46);
        java.util.List list48 = unionContext47.getContextNodeList();
        unionContext47.reset();
        java.util.List list50 = unionContext47.getContextNodeList();
        int int51 = unionContext47.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext52 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray53 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext54 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext52, evalContextArray53);
        boolean boolean55 = unionContext54.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer56 = unionContext54.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext57 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray58 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext59 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext57, evalContextArray58);
        org.apache.commons.jxpath.ri.EvalContext evalContext60 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray61 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext62 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext60, evalContextArray61);
        boolean boolean63 = unionContext62.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext64 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray65 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext66 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext64, evalContextArray65);
        boolean boolean67 = unionContext66.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext68 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray69 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext70 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext68, evalContextArray69);
        java.util.List list71 = unionContext70.getContextNodeList();
        unionContext70.reset();
        java.util.List list73 = unionContext70.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext74 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray75 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext76 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext74, evalContextArray75);
        java.util.List list77 = unionContext76.getContextNodeList();
        unionContext76.reset();
        java.util.List list79 = unionContext76.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext80 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray81 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext82 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext80, evalContextArray81);
        java.util.List list83 = unionContext82.getContextNodeList();
        unionContext82.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray85 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext57, unionContext62, unionContext66, unionContext70, unionContext76, unionContext82 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext86 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext54, evalContextArray85);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext87 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext47, evalContextArray85);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext88 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext40, evalContextArray85);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext89 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext33, evalContextArray85);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext90 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext21, evalContextArray85);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext91 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext15, evalContextArray85);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext92 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext9, evalContextArray85);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext93 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray85);
        int int94 = unionContext93.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean95 = unionContext93.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNull(pointer6);
        org.junit.Assert.assertNotNull(evalContextArray8);
        org.junit.Assert.assertArrayEquals(evalContextArray8, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(evalContextArray14);
        org.junit.Assert.assertArrayEquals(evalContextArray14, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(evalContextArray20);
        org.junit.Assert.assertArrayEquals(evalContextArray20, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(pointer23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(pointer29);
        org.junit.Assert.assertNull(pointer30);
        org.junit.Assert.assertNotNull(evalContextArray32);
        org.junit.Assert.assertArrayEquals(evalContextArray32, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(evalContextArray39);
        org.junit.Assert.assertArrayEquals(evalContextArray39, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals(obj42.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj42), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "[]");
        org.junit.Assert.assertNotNull(nodeSet43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(evalContextArray46);
        org.junit.Assert.assertArrayEquals(evalContextArray46, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(evalContextArray53);
        org.junit.Assert.assertArrayEquals(evalContextArray53, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(pointer56);
        org.junit.Assert.assertNotNull(evalContextArray58);
        org.junit.Assert.assertArrayEquals(evalContextArray58, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray61);
        org.junit.Assert.assertArrayEquals(evalContextArray61, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(evalContextArray65);
        org.junit.Assert.assertArrayEquals(evalContextArray65, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(evalContextArray69);
        org.junit.Assert.assertArrayEquals(evalContextArray69, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list71);
        org.junit.Assert.assertNotNull(list73);
        org.junit.Assert.assertNotNull(evalContextArray75);
        org.junit.Assert.assertArrayEquals(evalContextArray75, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list77);
        org.junit.Assert.assertNotNull(list79);
        org.junit.Assert.assertNotNull(evalContextArray81);
        org.junit.Assert.assertArrayEquals(evalContextArray81, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list83);
        org.junit.Assert.assertNotNull(evalContextArray85);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        java.util.List list5 = unionContext2.getContextNodeList();
        int int6 = unionContext2.getCurrentPosition();
        boolean boolean7 = unionContext2.isChildOrderingRequired();
        int int8 = unionContext2.getCurrentPosition();
        java.util.List list9 = unionContext2.getContextNodeList();
        java.lang.Object obj10 = unionContext2.getValue();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext14 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray12);
        boolean boolean15 = unionContext14.hasNext();
        boolean boolean16 = unionContext14.nextNode();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "[]");
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        int int4 = unionContext2.getCurrentPosition();
        boolean boolean6 = unionContext2.setPosition(3);
        boolean boolean8 = unionContext2.setPosition((int) '4');
        java.lang.Object obj9 = unionContext2.getValue();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.Pointer pointer3 = unionContext2.getSingleNodePointer();
        org.apache.commons.jxpath.NodeSet nodeSet4 = unionContext2.getNodeSet();
        int int5 = unionContext2.getPosition();
        boolean boolean6 = unionContext2.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer7 = unionContext2.getContextNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer3);
        org.junit.Assert.assertNotNull(nodeSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext evalContext1 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray2 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext3 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext1, evalContextArray2);
        boolean boolean4 = unionContext3.nextSet();
        boolean boolean6 = unionContext3.setPosition((int) (byte) 10);
        boolean boolean7 = unionContext3.hasNext();
        org.apache.commons.jxpath.NodeSet nodeSet8 = unionContext3.getNodeSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext9 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray10 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext11 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext9, evalContextArray10);
        java.util.List list12 = unionContext11.getContextNodeList();
        java.lang.Object obj13 = unionContext11.getValue();
        boolean boolean14 = unionContext11.hasNext();
        boolean boolean15 = unionContext11.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray17 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext18 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray17);
        org.apache.commons.jxpath.Pointer pointer19 = unionContext18.getContextNodePointer();
        java.lang.Object obj20 = unionContext18.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet21 = unionContext18.getNodeSet();
        int int22 = unionContext18.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext23 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray24 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext25 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext23, evalContextArray24);
        java.util.List list26 = unionContext25.getContextNodeList();
        unionContext25.reset();
        java.util.List list28 = unionContext25.getContextNodeList();
        int int29 = unionContext25.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext30 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray31 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext32 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext30, evalContextArray31);
        boolean boolean33 = unionContext32.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer34 = unionContext32.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext35 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray36 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext37 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext35, evalContextArray36);
        org.apache.commons.jxpath.ri.EvalContext evalContext38 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray39 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext40 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext38, evalContextArray39);
        boolean boolean41 = unionContext40.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext42 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray43 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext44 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext42, evalContextArray43);
        boolean boolean45 = unionContext44.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext46 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray47 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext48 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext46, evalContextArray47);
        java.util.List list49 = unionContext48.getContextNodeList();
        unionContext48.reset();
        java.util.List list51 = unionContext48.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext52 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray53 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext54 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext52, evalContextArray53);
        java.util.List list55 = unionContext54.getContextNodeList();
        unionContext54.reset();
        java.util.List list57 = unionContext54.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext58 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray59 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext60 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext58, evalContextArray59);
        java.util.List list61 = unionContext60.getContextNodeList();
        unionContext60.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray63 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext35, unionContext40, unionContext44, unionContext48, unionContext54, unionContext60 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext64 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext32, evalContextArray63);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext65 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext25, evalContextArray63);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext66 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext18, evalContextArray63);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext67 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext11, evalContextArray63);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext68 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext3, evalContextArray63);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext69 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray63);
        int int70 = unionContext69.getDocumentOrder();
        boolean boolean71 = unionContext69.isChildOrderingRequired();
        boolean boolean72 = unionContext69.isChildOrderingRequired();
        org.junit.Assert.assertNotNull(evalContextArray2);
        org.junit.Assert.assertArrayEquals(evalContextArray2, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeSet8);
        org.junit.Assert.assertNotNull(evalContextArray10);
        org.junit.Assert.assertArrayEquals(evalContextArray10, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(evalContextArray17);
        org.junit.Assert.assertArrayEquals(evalContextArray17, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "[]");
        org.junit.Assert.assertNotNull(nodeSet21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(evalContextArray24);
        org.junit.Assert.assertArrayEquals(evalContextArray24, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(evalContextArray31);
        org.junit.Assert.assertArrayEquals(evalContextArray31, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(pointer34);
        org.junit.Assert.assertNotNull(evalContextArray36);
        org.junit.Assert.assertArrayEquals(evalContextArray36, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray39);
        org.junit.Assert.assertArrayEquals(evalContextArray39, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(evalContextArray43);
        org.junit.Assert.assertArrayEquals(evalContextArray43, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(evalContextArray47);
        org.junit.Assert.assertArrayEquals(evalContextArray47, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertNotNull(evalContextArray53);
        org.junit.Assert.assertArrayEquals(evalContextArray53, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertNotNull(evalContextArray59);
        org.junit.Assert.assertArrayEquals(evalContextArray59, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertNotNull(evalContextArray63);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.NodeSet nodeSet3 = unionContext2.getNodeSet();
        boolean boolean4 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext5, evalContextArray6);
        boolean boolean8 = unionContext7.nextSet();
        org.apache.commons.jxpath.Pointer pointer9 = unionContext7.getContextNodePointer();
        java.util.List list10 = unionContext7.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        boolean boolean15 = unionContext13.setPosition((int) (byte) 100);
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray17 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext18 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray17);
        boolean boolean19 = unionContext18.nextSet();
        int int20 = unionContext18.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext21 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray22 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext23 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext21, evalContextArray22);
        boolean boolean24 = unionContext23.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer25 = unionContext23.getContextNodePointer();
        java.lang.Object obj26 = unionContext23.getValue();
        boolean boolean27 = unionContext23.nextNode();
        org.apache.commons.jxpath.ri.EvalContext evalContext28 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray29 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext30 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext28, evalContextArray29);
        boolean boolean32 = unionContext30.setPosition((int) (byte) 100);
        int int33 = unionContext30.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext34 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray35 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext36 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext34, evalContextArray35);
        boolean boolean37 = unionContext36.nextSet();
        org.apache.commons.jxpath.Pointer pointer38 = unionContext36.getContextNodePointer();
        boolean boolean39 = unionContext36.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext40 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray41 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext42 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext40, evalContextArray41);
        boolean boolean43 = unionContext42.nextSet();
        org.apache.commons.jxpath.Pointer pointer44 = unionContext42.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext45 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray46 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext47 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext45, evalContextArray46);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray48 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext42, evalContext45 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext49 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext36, evalContextArray48);
        boolean boolean50 = unionContext36.nextSet();
        boolean boolean51 = unionContext36.hasNext();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray52 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext13, unionContext18, unionContext23, unionContext30, unionContext36 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext53 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext7, evalContextArray52);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext54 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray52);
        unionContext54.reset();
        boolean boolean57 = unionContext54.setPosition((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            unionContext54.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: JXPath iterators cannot remove nodes");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(pointer9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(evalContextArray17);
        org.junit.Assert.assertArrayEquals(evalContextArray17, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(evalContextArray22);
        org.junit.Assert.assertArrayEquals(evalContextArray22, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(pointer25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(evalContextArray29);
        org.junit.Assert.assertArrayEquals(evalContextArray29, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(evalContextArray35);
        org.junit.Assert.assertArrayEquals(evalContextArray35, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(pointer38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(evalContextArray41);
        org.junit.Assert.assertArrayEquals(evalContextArray41, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(pointer44);
        org.junit.Assert.assertNotNull(evalContextArray46);
        org.junit.Assert.assertArrayEquals(evalContextArray46, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(evalContextArray52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextNode();
        int int4 = unionContext2.getDocumentOrder();
        boolean boolean5 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray7 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext6, evalContextArray7);
        java.util.List list9 = unionContext8.getContextNodeList();
        unionContext8.reset();
        java.util.List list11 = unionContext8.getContextNodeList();
        int int12 = unionContext8.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext13 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray14 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext15 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext13, evalContextArray14);
        boolean boolean16 = unionContext15.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer17 = unionContext15.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext18 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray19 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext20 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext18, evalContextArray19);
        org.apache.commons.jxpath.ri.EvalContext evalContext21 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray22 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext23 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext21, evalContextArray22);
        boolean boolean24 = unionContext23.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext25 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray26 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext27 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext25, evalContextArray26);
        boolean boolean28 = unionContext27.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext29 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray30 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext31 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext29, evalContextArray30);
        java.util.List list32 = unionContext31.getContextNodeList();
        unionContext31.reset();
        java.util.List list34 = unionContext31.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext35 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray36 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext37 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext35, evalContextArray36);
        java.util.List list38 = unionContext37.getContextNodeList();
        unionContext37.reset();
        java.util.List list40 = unionContext37.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext41 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray42 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext43 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext41, evalContextArray42);
        java.util.List list44 = unionContext43.getContextNodeList();
        unionContext43.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray46 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext18, unionContext23, unionContext27, unionContext31, unionContext37, unionContext43 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext47 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext15, evalContextArray46);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext48 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext8, evalContextArray46);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext49 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray46);
        boolean boolean50 = unionContext2.hasNext();
        int int51 = unionContext2.getCurrentPosition();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(evalContextArray7);
        org.junit.Assert.assertArrayEquals(evalContextArray7, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(evalContextArray14);
        org.junit.Assert.assertArrayEquals(evalContextArray14, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(pointer17);
        org.junit.Assert.assertNotNull(evalContextArray19);
        org.junit.Assert.assertArrayEquals(evalContextArray19, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray22);
        org.junit.Assert.assertArrayEquals(evalContextArray22, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(evalContextArray26);
        org.junit.Assert.assertArrayEquals(evalContextArray26, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(evalContextArray30);
        org.junit.Assert.assertArrayEquals(evalContextArray30, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(evalContextArray36);
        org.junit.Assert.assertArrayEquals(evalContextArray36, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(evalContextArray42);
        org.junit.Assert.assertArrayEquals(evalContextArray42, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(evalContextArray46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        unionContext2.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray5 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext6 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray5);
        boolean boolean7 = unionContext6.hasNext();
        int int8 = unionContext6.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext9 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray10 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext11 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext9, evalContextArray10);
        boolean boolean12 = unionContext11.nextSet();
        org.apache.commons.jxpath.Pointer pointer13 = unionContext11.getContextNodePointer();
        boolean boolean14 = unionContext11.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext15 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray16 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext17 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext15, evalContextArray16);
        boolean boolean18 = unionContext17.nextSet();
        org.apache.commons.jxpath.Pointer pointer19 = unionContext17.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext20 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray21 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext22 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext20, evalContextArray21);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray23 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext17, evalContext20 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext24 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext11, evalContextArray23);
        org.apache.commons.jxpath.NodeSet nodeSet25 = unionContext11.getNodeSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext26 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray27 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext28 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext26, evalContextArray27);
        org.apache.commons.jxpath.Pointer pointer29 = unionContext28.getContextNodePointer();
        java.lang.Object obj30 = unionContext28.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet31 = unionContext28.getNodeSet();
        int int32 = unionContext28.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext33 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray34 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext35 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext33, evalContextArray34);
        org.apache.commons.jxpath.Pointer pointer36 = unionContext35.getSingleNodePointer();
        int int37 = unionContext35.getCurrentPosition();
        int int38 = unionContext35.getDocumentOrder();
        org.apache.commons.jxpath.ri.EvalContext evalContext39 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray40 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext41 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext39, evalContextArray40);
        boolean boolean42 = unionContext41.nextNode();
        int int43 = unionContext41.getDocumentOrder();
        boolean boolean44 = unionContext41.isChildOrderingRequired();
        java.util.List list45 = unionContext41.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext46 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray47 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext48 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext46, evalContextArray47);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext49 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext41, evalContextArray47);
        org.apache.commons.jxpath.ri.EvalContext evalContext50 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray51 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext52 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext50, evalContextArray51);
        java.util.List list53 = unionContext52.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray54 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext6, unionContext11, unionContext28, unionContext35, unionContext49, unionContext52 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext55 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray54);
        org.apache.commons.jxpath.ri.EvalContext evalContext56 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray57 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext58 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext56, evalContextArray57);
        org.apache.commons.jxpath.Pointer pointer59 = unionContext58.getContextNodePointer();
        java.lang.Object obj60 = unionContext58.getValue();
        boolean boolean61 = unionContext58.isChildOrderingRequired();
        unionContext58.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext63 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray64 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext65 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext63, evalContextArray64);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext66 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext58, evalContextArray64);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext67 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext55, evalContextArray64);
        boolean boolean68 = unionContext55.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.Pointer pointer69 = unionContext55.getContextNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray5);
        org.junit.Assert.assertArrayEquals(evalContextArray5, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(evalContextArray10);
        org.junit.Assert.assertArrayEquals(evalContextArray10, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(pointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(evalContextArray16);
        org.junit.Assert.assertArrayEquals(evalContextArray16, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(pointer19);
        org.junit.Assert.assertNotNull(evalContextArray21);
        org.junit.Assert.assertArrayEquals(evalContextArray21, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray23);
        org.junit.Assert.assertNotNull(nodeSet25);
        org.junit.Assert.assertNotNull(evalContextArray27);
        org.junit.Assert.assertArrayEquals(evalContextArray27, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "[]");
        org.junit.Assert.assertNotNull(nodeSet31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(evalContextArray34);
        org.junit.Assert.assertArrayEquals(evalContextArray34, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(evalContextArray40);
        org.junit.Assert.assertArrayEquals(evalContextArray40, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(evalContextArray47);
        org.junit.Assert.assertArrayEquals(evalContextArray47, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray51);
        org.junit.Assert.assertArrayEquals(evalContextArray51, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(evalContextArray54);
        org.junit.Assert.assertNotNull(evalContextArray57);
        org.junit.Assert.assertArrayEquals(evalContextArray57, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertEquals(obj60.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj60), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj60), "[]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(evalContextArray64);
        org.junit.Assert.assertArrayEquals(evalContextArray64, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextNode();
        int int4 = unionContext2.getDocumentOrder();
        boolean boolean5 = unionContext2.isChildOrderingRequired();
        java.util.List list6 = unionContext2.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray8 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext9 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext7, evalContextArray8);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext10 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray8);
        int int11 = unionContext2.getPosition();
        boolean boolean13 = unionContext2.setPosition((int) (byte) 1);
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(evalContextArray8);
        org.junit.Assert.assertArrayEquals(evalContextArray8, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextNode();
        int int4 = unionContext2.getDocumentOrder();
        boolean boolean5 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray7 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext6, evalContextArray7);
        java.util.List list9 = unionContext8.getContextNodeList();
        unionContext8.reset();
        java.util.List list11 = unionContext8.getContextNodeList();
        int int12 = unionContext8.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext13 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray14 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext15 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext13, evalContextArray14);
        boolean boolean16 = unionContext15.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer17 = unionContext15.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext18 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray19 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext20 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext18, evalContextArray19);
        org.apache.commons.jxpath.ri.EvalContext evalContext21 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray22 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext23 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext21, evalContextArray22);
        boolean boolean24 = unionContext23.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext25 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray26 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext27 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext25, evalContextArray26);
        boolean boolean28 = unionContext27.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext29 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray30 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext31 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext29, evalContextArray30);
        java.util.List list32 = unionContext31.getContextNodeList();
        unionContext31.reset();
        java.util.List list34 = unionContext31.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext35 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray36 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext37 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext35, evalContextArray36);
        java.util.List list38 = unionContext37.getContextNodeList();
        unionContext37.reset();
        java.util.List list40 = unionContext37.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext41 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray42 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext43 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext41, evalContextArray42);
        java.util.List list44 = unionContext43.getContextNodeList();
        unionContext43.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray46 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext18, unionContext23, unionContext27, unionContext31, unionContext37, unionContext43 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext47 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext15, evalContextArray46);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext48 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext8, evalContextArray46);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext49 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray46);
        boolean boolean50 = unionContext49.isChildOrderingRequired();
        int int51 = unionContext49.getCurrentPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer52 = unionContext49.getCurrentNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(evalContextArray7);
        org.junit.Assert.assertArrayEquals(evalContextArray7, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(evalContextArray14);
        org.junit.Assert.assertArrayEquals(evalContextArray14, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(pointer17);
        org.junit.Assert.assertNotNull(evalContextArray19);
        org.junit.Assert.assertArrayEquals(evalContextArray19, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray22);
        org.junit.Assert.assertArrayEquals(evalContextArray22, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(evalContextArray26);
        org.junit.Assert.assertArrayEquals(evalContextArray26, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(evalContextArray30);
        org.junit.Assert.assertArrayEquals(evalContextArray30, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(evalContextArray36);
        org.junit.Assert.assertArrayEquals(evalContextArray36, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(evalContextArray42);
        org.junit.Assert.assertArrayEquals(evalContextArray42, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(evalContextArray46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.Pointer pointer3 = unionContext2.getContextNodePointer();
        java.lang.Object obj4 = unionContext2.getValue();
        boolean boolean5 = unionContext2.isChildOrderingRequired();
        unionContext2.reset();
        org.apache.commons.jxpath.Pointer pointer7 = unionContext2.getSingleNodePointer();
        boolean boolean8 = unionContext2.nextSet();
        unionContext2.reset();
        boolean boolean10 = unionContext2.nextNode();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.NodeSet nodeSet3 = unionContext2.getNodeSet();
        int int4 = unionContext2.getCurrentPosition();
        int int5 = unionContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer6 = unionContext2.getCurrentNodePointer();
        org.apache.commons.jxpath.NodeSet nodeSet7 = unionContext2.getNodeSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext8 = unionContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(nodePointer6);
        org.junit.Assert.assertNotNull(nodeSet7);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.Pointer pointer3 = unionContext2.getContextNodePointer();
        java.lang.Object obj4 = unionContext2.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet5 = unionContext2.getNodeSet();
        int int6 = unionContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray8 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext9 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext7, evalContextArray8);
        java.util.List list10 = unionContext9.getContextNodeList();
        unionContext9.reset();
        java.util.List list12 = unionContext9.getContextNodeList();
        int int13 = unionContext9.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext14 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray15 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext16 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext14, evalContextArray15);
        boolean boolean17 = unionContext16.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer18 = unionContext16.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext19 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray20 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext21 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext19, evalContextArray20);
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray23 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext24 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext22, evalContextArray23);
        boolean boolean25 = unionContext24.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext26 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray27 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext28 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext26, evalContextArray27);
        boolean boolean29 = unionContext28.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext30 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray31 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext32 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext30, evalContextArray31);
        java.util.List list33 = unionContext32.getContextNodeList();
        unionContext32.reset();
        java.util.List list35 = unionContext32.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext36 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray37 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext38 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext36, evalContextArray37);
        java.util.List list39 = unionContext38.getContextNodeList();
        unionContext38.reset();
        java.util.List list41 = unionContext38.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext42 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray43 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext44 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext42, evalContextArray43);
        java.util.List list45 = unionContext44.getContextNodeList();
        unionContext44.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray47 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext19, unionContext24, unionContext28, unionContext32, unionContext38, unionContext44 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext48 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext16, evalContextArray47);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext49 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext9, evalContextArray47);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext50 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray47);
        unionContext50.reset();
        int int52 = unionContext50.getCurrentPosition();
        int int53 = unionContext50.getPosition();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[]");
        org.junit.Assert.assertNotNull(nodeSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(evalContextArray8);
        org.junit.Assert.assertArrayEquals(evalContextArray8, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(evalContextArray15);
        org.junit.Assert.assertArrayEquals(evalContextArray15, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(pointer18);
        org.junit.Assert.assertNotNull(evalContextArray20);
        org.junit.Assert.assertArrayEquals(evalContextArray20, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray23);
        org.junit.Assert.assertArrayEquals(evalContextArray23, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(evalContextArray27);
        org.junit.Assert.assertArrayEquals(evalContextArray27, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(evalContextArray31);
        org.junit.Assert.assertArrayEquals(evalContextArray31, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(evalContextArray37);
        org.junit.Assert.assertArrayEquals(evalContextArray37, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(evalContextArray43);
        org.junit.Assert.assertArrayEquals(evalContextArray43, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(evalContextArray47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        boolean boolean5 = unionContext2.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray7 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext6, evalContextArray7);
        boolean boolean9 = unionContext8.nextSet();
        org.apache.commons.jxpath.Pointer pointer10 = unionContext8.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray14 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext8, evalContext11 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext15 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray14);
        boolean boolean16 = unionContext2.isChildOrderingRequired();
        boolean boolean17 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext18 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray19 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext20 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext18, evalContextArray19);
        unionContext20.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray23 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext24 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext22, evalContextArray23);
        boolean boolean25 = unionContext24.nextSet();
        java.lang.String str26 = unionContext24.toString();
        java.util.List list27 = unionContext24.getContextNodeList();
        boolean boolean28 = unionContext24.nextNode();
        boolean boolean29 = unionContext24.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext30 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray31 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext32 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext30, evalContextArray31);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext33 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext24, evalContextArray31);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext34 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext20, evalContextArray31);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext35 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray31);
        java.lang.Class<?> wildcardClass36 = unionContext35.getClass();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(evalContextArray7);
        org.junit.Assert.assertArrayEquals(evalContextArray7, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(evalContextArray19);
        org.junit.Assert.assertArrayEquals(evalContextArray19, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray23);
        org.junit.Assert.assertArrayEquals(evalContextArray23, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Empty expression context" + "'", str26, "Empty expression context");
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(evalContextArray31);
        org.junit.Assert.assertArrayEquals(evalContextArray31, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        boolean boolean5 = unionContext2.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray7 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext6, evalContextArray7);
        boolean boolean9 = unionContext8.nextSet();
        org.apache.commons.jxpath.Pointer pointer10 = unionContext8.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray14 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext8, evalContext11 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext15 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray14);
        boolean boolean16 = unionContext2.nextSet();
        boolean boolean17 = unionContext2.nextNode();
        unionContext2.reset();
        int int19 = unionContext2.getPosition();
        int int20 = unionContext2.getCurrentPosition();
        int int21 = unionContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray23 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext24 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext22, evalContextArray23);
        boolean boolean25 = unionContext24.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer26 = unionContext24.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext27 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray28 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext29 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext27, evalContextArray28);
        org.apache.commons.jxpath.ri.EvalContext evalContext30 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray31 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext32 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext30, evalContextArray31);
        boolean boolean33 = unionContext32.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext34 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray35 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext36 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext34, evalContextArray35);
        boolean boolean37 = unionContext36.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext38 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray39 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext40 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext38, evalContextArray39);
        java.util.List list41 = unionContext40.getContextNodeList();
        unionContext40.reset();
        java.util.List list43 = unionContext40.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext44 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray45 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext46 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext44, evalContextArray45);
        java.util.List list47 = unionContext46.getContextNodeList();
        unionContext46.reset();
        java.util.List list49 = unionContext46.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext50 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray51 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext52 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext50, evalContextArray51);
        java.util.List list53 = unionContext52.getContextNodeList();
        unionContext52.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray55 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext27, unionContext32, unionContext36, unionContext40, unionContext46, unionContext52 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext56 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext24, evalContextArray55);
        boolean boolean58 = unionContext24.setPosition((int) ' ');
        org.apache.commons.jxpath.ri.EvalContext evalContext59 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray60 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext61 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext59, evalContextArray60);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext62 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext24, evalContextArray60);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext63 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray60);
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(evalContextArray7);
        org.junit.Assert.assertArrayEquals(evalContextArray7, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(evalContextArray23);
        org.junit.Assert.assertArrayEquals(evalContextArray23, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(pointer26);
        org.junit.Assert.assertNotNull(evalContextArray28);
        org.junit.Assert.assertArrayEquals(evalContextArray28, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray31);
        org.junit.Assert.assertArrayEquals(evalContextArray31, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(evalContextArray35);
        org.junit.Assert.assertArrayEquals(evalContextArray35, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(evalContextArray39);
        org.junit.Assert.assertArrayEquals(evalContextArray39, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(evalContextArray45);
        org.junit.Assert.assertArrayEquals(evalContextArray45, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(evalContextArray51);
        org.junit.Assert.assertArrayEquals(evalContextArray51, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(evalContextArray55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(evalContextArray60);
        org.junit.Assert.assertArrayEquals(evalContextArray60, new org.apache.commons.jxpath.ri.EvalContext[] {});
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        java.lang.Object obj3 = unionContext2.getValue();
        int int4 = unionContext2.getPosition();
        org.apache.commons.jxpath.Pointer pointer5 = unionContext2.getContextNodePointer();
        boolean boolean7 = unionContext2.setPosition((int) (byte) 100);
        java.util.List list8 = unionContext2.getContextNodeList();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(pointer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.NodeSet nodeSet3 = unionContext2.getNodeSet();
        boolean boolean4 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext5, evalContextArray6);
        boolean boolean8 = unionContext7.nextSet();
        org.apache.commons.jxpath.Pointer pointer9 = unionContext7.getContextNodePointer();
        java.util.List list10 = unionContext7.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        boolean boolean15 = unionContext13.setPosition((int) (byte) 100);
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray17 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext18 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray17);
        boolean boolean19 = unionContext18.nextSet();
        int int20 = unionContext18.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext21 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray22 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext23 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext21, evalContextArray22);
        boolean boolean24 = unionContext23.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer25 = unionContext23.getContextNodePointer();
        java.lang.Object obj26 = unionContext23.getValue();
        boolean boolean27 = unionContext23.nextNode();
        org.apache.commons.jxpath.ri.EvalContext evalContext28 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray29 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext30 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext28, evalContextArray29);
        boolean boolean32 = unionContext30.setPosition((int) (byte) 100);
        int int33 = unionContext30.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext34 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray35 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext36 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext34, evalContextArray35);
        boolean boolean37 = unionContext36.nextSet();
        org.apache.commons.jxpath.Pointer pointer38 = unionContext36.getContextNodePointer();
        boolean boolean39 = unionContext36.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext40 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray41 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext42 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext40, evalContextArray41);
        boolean boolean43 = unionContext42.nextSet();
        org.apache.commons.jxpath.Pointer pointer44 = unionContext42.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext45 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray46 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext47 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext45, evalContextArray46);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray48 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext42, evalContext45 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext49 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext36, evalContextArray48);
        boolean boolean50 = unionContext36.nextSet();
        boolean boolean51 = unionContext36.hasNext();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray52 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext13, unionContext18, unionContext23, unionContext30, unionContext36 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext53 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext7, evalContextArray52);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext54 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray52);
        boolean boolean56 = unionContext2.setPosition(0);
        unionContext2.reset();
        boolean boolean58 = unionContext2.nextSet();
        boolean boolean59 = unionContext2.nextSet();
        int int60 = unionContext2.getDocumentOrder();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(pointer9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(evalContextArray17);
        org.junit.Assert.assertArrayEquals(evalContextArray17, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(evalContextArray22);
        org.junit.Assert.assertArrayEquals(evalContextArray22, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(pointer25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(evalContextArray29);
        org.junit.Assert.assertArrayEquals(evalContextArray29, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(evalContextArray35);
        org.junit.Assert.assertArrayEquals(evalContextArray35, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(pointer38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(evalContextArray41);
        org.junit.Assert.assertArrayEquals(evalContextArray41, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(pointer44);
        org.junit.Assert.assertNotNull(evalContextArray46);
        org.junit.Assert.assertArrayEquals(evalContextArray46, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(evalContextArray52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.NodeSet nodeSet3 = unionContext2.getNodeSet();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = unionContext2.getCurrentNodePointer();
        int int5 = unionContext2.getCurrentPosition();
        org.apache.commons.jxpath.NodeSet nodeSet6 = unionContext2.getNodeSet();
        int int7 = unionContext2.getPosition();
        boolean boolean8 = unionContext2.nextNode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.model.NodePointer nodePointer9 = unionContext2.getCurrentNodePointer();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(nodeSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        java.util.List list3 = unionContext2.getContextNodeList();
        unionContext2.reset();
        java.util.List list5 = unionContext2.getContextNodeList();
        boolean boolean6 = unionContext2.hasNext();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.Pointer pointer3 = unionContext2.getContextNodePointer();
        java.lang.Object obj4 = unionContext2.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet5 = unionContext2.getNodeSet();
        int int6 = unionContext2.getCurrentPosition();
        org.apache.commons.jxpath.Pointer pointer7 = unionContext2.getSingleNodePointer();
        boolean boolean8 = unionContext2.nextSet();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[]");
        org.junit.Assert.assertNotNull(nodeSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        boolean boolean5 = unionContext2.setPosition((int) (byte) 10);
        int int6 = unionContext2.getDocumentOrder();
        int int7 = unionContext2.getPosition();
        boolean boolean8 = unionContext2.isChildOrderingRequired();
        unionContext2.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext10 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray11 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext12 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext10, evalContextArray11);
        boolean boolean13 = unionContext12.nextSet();
        org.apache.commons.jxpath.Pointer pointer14 = unionContext12.getContextNodePointer();
        boolean boolean15 = unionContext12.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray17 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext18 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray17);
        boolean boolean19 = unionContext18.nextSet();
        org.apache.commons.jxpath.Pointer pointer20 = unionContext18.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext21 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray22 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext23 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext21, evalContextArray22);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray24 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext18, evalContext21 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext25 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext12, evalContextArray24);
        java.util.List list26 = unionContext12.getContextNodeList();
        int int27 = unionContext12.getCurrentPosition();
        int int28 = unionContext12.getDocumentOrder();
        int int29 = unionContext12.getCurrentPosition();
        unionContext12.reset();
        java.lang.Object obj31 = unionContext12.getValue();
        org.apache.commons.jxpath.ri.EvalContext evalContext32 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray33 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext34 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext32, evalContextArray33);
        boolean boolean35 = unionContext34.nextNode();
        int int36 = unionContext34.getDocumentOrder();
        boolean boolean37 = unionContext34.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext38 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray39 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext40 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext38, evalContextArray39);
        java.util.List list41 = unionContext40.getContextNodeList();
        unionContext40.reset();
        java.util.List list43 = unionContext40.getContextNodeList();
        int int44 = unionContext40.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext45 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray46 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext47 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext45, evalContextArray46);
        boolean boolean48 = unionContext47.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer49 = unionContext47.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext50 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray51 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext52 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext50, evalContextArray51);
        org.apache.commons.jxpath.ri.EvalContext evalContext53 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray54 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext55 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext53, evalContextArray54);
        boolean boolean56 = unionContext55.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext57 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray58 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext59 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext57, evalContextArray58);
        boolean boolean60 = unionContext59.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext61 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray62 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext63 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext61, evalContextArray62);
        java.util.List list64 = unionContext63.getContextNodeList();
        unionContext63.reset();
        java.util.List list66 = unionContext63.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext67 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray68 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext69 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext67, evalContextArray68);
        java.util.List list70 = unionContext69.getContextNodeList();
        unionContext69.reset();
        java.util.List list72 = unionContext69.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext73 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray74 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext75 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext73, evalContextArray74);
        java.util.List list76 = unionContext75.getContextNodeList();
        unionContext75.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray78 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext50, unionContext55, unionContext59, unionContext63, unionContext69, unionContext75 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext79 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext47, evalContextArray78);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext80 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext40, evalContextArray78);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext81 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext34, evalContextArray78);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext82 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext12, evalContextArray78);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext83 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray78);
        unionContext2.reset();
        java.lang.String str85 = unionContext2.toString();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(evalContextArray11);
        org.junit.Assert.assertArrayEquals(evalContextArray11, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(pointer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(evalContextArray17);
        org.junit.Assert.assertArrayEquals(evalContextArray17, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(pointer20);
        org.junit.Assert.assertNotNull(evalContextArray22);
        org.junit.Assert.assertArrayEquals(evalContextArray22, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray24);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "[]");
        org.junit.Assert.assertNotNull(evalContextArray33);
        org.junit.Assert.assertArrayEquals(evalContextArray33, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(evalContextArray39);
        org.junit.Assert.assertArrayEquals(evalContextArray39, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(evalContextArray46);
        org.junit.Assert.assertArrayEquals(evalContextArray46, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(pointer49);
        org.junit.Assert.assertNotNull(evalContextArray51);
        org.junit.Assert.assertArrayEquals(evalContextArray51, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray54);
        org.junit.Assert.assertArrayEquals(evalContextArray54, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(evalContextArray58);
        org.junit.Assert.assertArrayEquals(evalContextArray58, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(evalContextArray62);
        org.junit.Assert.assertArrayEquals(evalContextArray62, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertNotNull(evalContextArray68);
        org.junit.Assert.assertArrayEquals(evalContextArray68, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list70);
        org.junit.Assert.assertNotNull(list72);
        org.junit.Assert.assertNotNull(evalContextArray74);
        org.junit.Assert.assertArrayEquals(evalContextArray74, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list76);
        org.junit.Assert.assertNotNull(evalContextArray78);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Empty expression context" + "'", str85, "Empty expression context");
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        unionContext2.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray5 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext6 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray5);
        boolean boolean7 = unionContext6.nextSet();
        java.lang.String str8 = unionContext6.toString();
        java.util.List list9 = unionContext6.getContextNodeList();
        boolean boolean10 = unionContext6.nextNode();
        boolean boolean11 = unionContext6.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray13 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext14 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext12, evalContextArray13);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext15 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext6, evalContextArray13);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext16 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray13);
        org.apache.commons.jxpath.Pointer pointer17 = unionContext2.getContextNodePointer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = unionContext2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray5);
        org.junit.Assert.assertArrayEquals(evalContextArray5, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(evalContextArray13);
        org.junit.Assert.assertArrayEquals(evalContextArray13, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer17);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.isChildOrderingRequired();
        unionContext2.reset();
        org.apache.commons.jxpath.NodeSet nodeSet5 = unionContext2.getNodeSet();
        org.apache.commons.jxpath.Pointer pointer6 = unionContext2.getContextNodePointer();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodeSet5);
        org.junit.Assert.assertNull(pointer6);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        unionContext2.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray5 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext6 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray5);
        boolean boolean7 = unionContext6.hasNext();
        int int8 = unionContext6.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext9 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray10 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext11 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext9, evalContextArray10);
        boolean boolean12 = unionContext11.nextSet();
        org.apache.commons.jxpath.Pointer pointer13 = unionContext11.getContextNodePointer();
        boolean boolean14 = unionContext11.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext15 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray16 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext17 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext15, evalContextArray16);
        boolean boolean18 = unionContext17.nextSet();
        org.apache.commons.jxpath.Pointer pointer19 = unionContext17.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext20 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray21 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext22 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext20, evalContextArray21);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray23 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext17, evalContext20 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext24 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext11, evalContextArray23);
        org.apache.commons.jxpath.NodeSet nodeSet25 = unionContext11.getNodeSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext26 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray27 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext28 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext26, evalContextArray27);
        org.apache.commons.jxpath.Pointer pointer29 = unionContext28.getContextNodePointer();
        java.lang.Object obj30 = unionContext28.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet31 = unionContext28.getNodeSet();
        int int32 = unionContext28.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext33 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray34 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext35 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext33, evalContextArray34);
        org.apache.commons.jxpath.Pointer pointer36 = unionContext35.getSingleNodePointer();
        int int37 = unionContext35.getCurrentPosition();
        int int38 = unionContext35.getDocumentOrder();
        org.apache.commons.jxpath.ri.EvalContext evalContext39 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray40 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext41 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext39, evalContextArray40);
        boolean boolean42 = unionContext41.nextNode();
        int int43 = unionContext41.getDocumentOrder();
        boolean boolean44 = unionContext41.isChildOrderingRequired();
        java.util.List list45 = unionContext41.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext46 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray47 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext48 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext46, evalContextArray47);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext49 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext41, evalContextArray47);
        org.apache.commons.jxpath.ri.EvalContext evalContext50 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray51 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext52 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext50, evalContextArray51);
        java.util.List list53 = unionContext52.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray54 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext6, unionContext11, unionContext28, unionContext35, unionContext49, unionContext52 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext55 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray54);
        org.apache.commons.jxpath.NodeSet nodeSet56 = unionContext2.getNodeSet();
        boolean boolean57 = unionContext2.hasNext();
        boolean boolean58 = unionContext2.nextNode();
        org.apache.commons.jxpath.ri.EvalContext evalContext59 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray60 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext61 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext59, evalContextArray60);
        org.apache.commons.jxpath.NodeSet nodeSet62 = unionContext61.getNodeSet();
        boolean boolean63 = unionContext61.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext64 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray65 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext66 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext64, evalContextArray65);
        boolean boolean67 = unionContext66.nextSet();
        org.apache.commons.jxpath.Pointer pointer68 = unionContext66.getContextNodePointer();
        boolean boolean69 = unionContext66.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext70 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray71 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext72 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext70, evalContextArray71);
        boolean boolean73 = unionContext72.nextSet();
        org.apache.commons.jxpath.Pointer pointer74 = unionContext72.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext75 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray76 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext77 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext75, evalContextArray76);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray78 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext72, evalContext75 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext79 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext66, evalContextArray78);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext80 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext61, evalContextArray78);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext81 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray78);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean82 = unionContext81.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray5);
        org.junit.Assert.assertArrayEquals(evalContextArray5, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(evalContextArray10);
        org.junit.Assert.assertArrayEquals(evalContextArray10, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(pointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(evalContextArray16);
        org.junit.Assert.assertArrayEquals(evalContextArray16, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(pointer19);
        org.junit.Assert.assertNotNull(evalContextArray21);
        org.junit.Assert.assertArrayEquals(evalContextArray21, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray23);
        org.junit.Assert.assertNotNull(nodeSet25);
        org.junit.Assert.assertNotNull(evalContextArray27);
        org.junit.Assert.assertArrayEquals(evalContextArray27, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "[]");
        org.junit.Assert.assertNotNull(nodeSet31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(evalContextArray34);
        org.junit.Assert.assertArrayEquals(evalContextArray34, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(evalContextArray40);
        org.junit.Assert.assertArrayEquals(evalContextArray40, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(evalContextArray47);
        org.junit.Assert.assertArrayEquals(evalContextArray47, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray51);
        org.junit.Assert.assertArrayEquals(evalContextArray51, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(evalContextArray54);
        org.junit.Assert.assertNotNull(nodeSet56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(evalContextArray60);
        org.junit.Assert.assertArrayEquals(evalContextArray60, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(evalContextArray65);
        org.junit.Assert.assertArrayEquals(evalContextArray65, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNull(pointer68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(evalContextArray71);
        org.junit.Assert.assertArrayEquals(evalContextArray71, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNull(pointer74);
        org.junit.Assert.assertNotNull(evalContextArray76);
        org.junit.Assert.assertArrayEquals(evalContextArray76, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray78);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        unionContext2.reset();
        boolean boolean5 = unionContext2.setPosition((int) '#');
        int int6 = unionContext2.getDocumentOrder();
        boolean boolean7 = unionContext2.isChildOrderingRequired();
        int int8 = unionContext2.getDocumentOrder();
        boolean boolean9 = unionContext2.isChildOrderingRequired();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        java.util.List list5 = unionContext2.getContextNodeList();
        int int6 = unionContext2.getCurrentPosition();
        boolean boolean7 = unionContext2.isChildOrderingRequired();
        boolean boolean9 = unionContext2.setPosition((int) (short) 100);
        org.apache.commons.jxpath.Pointer pointer10 = unionContext2.getSingleNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        unionContext13.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext15 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray16 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext17 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext15, evalContextArray16);
        boolean boolean18 = unionContext17.hasNext();
        int int19 = unionContext17.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext20 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray21 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext22 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext20, evalContextArray21);
        boolean boolean23 = unionContext22.nextSet();
        org.apache.commons.jxpath.Pointer pointer24 = unionContext22.getContextNodePointer();
        boolean boolean25 = unionContext22.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext26 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray27 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext28 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext26, evalContextArray27);
        boolean boolean29 = unionContext28.nextSet();
        org.apache.commons.jxpath.Pointer pointer30 = unionContext28.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext31 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray32 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext33 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext31, evalContextArray32);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray34 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext28, evalContext31 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext35 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext22, evalContextArray34);
        org.apache.commons.jxpath.NodeSet nodeSet36 = unionContext22.getNodeSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext37 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray38 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext39 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext37, evalContextArray38);
        org.apache.commons.jxpath.Pointer pointer40 = unionContext39.getContextNodePointer();
        java.lang.Object obj41 = unionContext39.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet42 = unionContext39.getNodeSet();
        int int43 = unionContext39.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext44 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray45 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext46 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext44, evalContextArray45);
        org.apache.commons.jxpath.Pointer pointer47 = unionContext46.getSingleNodePointer();
        int int48 = unionContext46.getCurrentPosition();
        int int49 = unionContext46.getDocumentOrder();
        org.apache.commons.jxpath.ri.EvalContext evalContext50 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray51 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext52 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext50, evalContextArray51);
        boolean boolean53 = unionContext52.nextNode();
        int int54 = unionContext52.getDocumentOrder();
        boolean boolean55 = unionContext52.isChildOrderingRequired();
        java.util.List list56 = unionContext52.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext57 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray58 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext59 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext57, evalContextArray58);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext60 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext52, evalContextArray58);
        org.apache.commons.jxpath.ri.EvalContext evalContext61 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray62 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext63 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext61, evalContextArray62);
        java.util.List list64 = unionContext63.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray65 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext17, unionContext22, unionContext39, unionContext46, unionContext60, unionContext63 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext66 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext13, evalContextArray65);
        org.apache.commons.jxpath.ri.EvalContext evalContext67 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray68 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext69 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext67, evalContextArray68);
        org.apache.commons.jxpath.Pointer pointer70 = unionContext69.getContextNodePointer();
        java.lang.Object obj71 = unionContext69.getValue();
        boolean boolean72 = unionContext69.isChildOrderingRequired();
        unionContext69.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext74 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray75 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext76 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext74, evalContextArray75);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext77 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext69, evalContextArray75);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext78 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext66, evalContextArray75);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext79 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray75);
        org.apache.commons.jxpath.Pointer pointer80 = unionContext2.getSingleNodePointer();
        boolean boolean81 = unionContext2.hasNext();
        boolean boolean82 = unionContext2.nextSet();
        int int83 = unionContext2.getCurrentPosition();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray16);
        org.junit.Assert.assertArrayEquals(evalContextArray16, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(evalContextArray21);
        org.junit.Assert.assertArrayEquals(evalContextArray21, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(pointer24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(evalContextArray27);
        org.junit.Assert.assertArrayEquals(evalContextArray27, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(pointer30);
        org.junit.Assert.assertNotNull(evalContextArray32);
        org.junit.Assert.assertArrayEquals(evalContextArray32, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray34);
        org.junit.Assert.assertNotNull(nodeSet36);
        org.junit.Assert.assertNotNull(evalContextArray38);
        org.junit.Assert.assertArrayEquals(evalContextArray38, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals(obj41.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj41), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj41), "[]");
        org.junit.Assert.assertNotNull(nodeSet42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(evalContextArray45);
        org.junit.Assert.assertArrayEquals(evalContextArray45, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(evalContextArray51);
        org.junit.Assert.assertArrayEquals(evalContextArray51, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(evalContextArray58);
        org.junit.Assert.assertArrayEquals(evalContextArray58, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray62);
        org.junit.Assert.assertArrayEquals(evalContextArray62, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertNotNull(evalContextArray65);
        org.junit.Assert.assertNotNull(evalContextArray68);
        org.junit.Assert.assertArrayEquals(evalContextArray68, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer70);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertEquals(obj71.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj71), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj71), "[]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(evalContextArray75);
        org.junit.Assert.assertArrayEquals(evalContextArray75, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean4 = unionContext2.setPosition((int) (byte) 100);
        boolean boolean5 = unionContext2.nextSet();
        boolean boolean6 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray8 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext9 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext7, evalContextArray8);
        boolean boolean10 = unionContext9.isChildOrderingRequired();
        unionContext9.reset();
        java.lang.Object obj12 = unionContext9.getValue();
        boolean boolean13 = unionContext9.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext14 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray15 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext16 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext14, evalContextArray15);
        org.apache.commons.jxpath.NodeSet nodeSet17 = unionContext16.getNodeSet();
        java.lang.String str18 = unionContext16.toString();
        unionContext16.reset();
        int int20 = unionContext16.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext21 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray22 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext23 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext21, evalContextArray22);
        boolean boolean24 = unionContext23.nextSet();
        org.apache.commons.jxpath.Pointer pointer25 = unionContext23.getContextNodePointer();
        java.util.List list26 = unionContext23.getContextNodeList();
        boolean boolean27 = unionContext23.nextSet();
        boolean boolean29 = unionContext23.setPosition((int) (short) 1);
        java.util.List list30 = unionContext23.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext31 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray32 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext33 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext31, evalContextArray32);
        boolean boolean34 = unionContext33.nextSet();
        org.apache.commons.jxpath.Pointer pointer35 = unionContext33.getContextNodePointer();
        boolean boolean36 = unionContext33.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext37 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray38 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext39 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext37, evalContextArray38);
        boolean boolean40 = unionContext39.nextSet();
        org.apache.commons.jxpath.Pointer pointer41 = unionContext39.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext42 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray43 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext44 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext42, evalContextArray43);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray45 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext39, evalContext42 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext46 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext33, evalContextArray45);
        int int47 = unionContext46.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext48 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray49 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext50 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext48, evalContextArray49);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext51 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext46, evalContextArray49);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext52 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext23, evalContextArray49);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext53 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext16, evalContextArray49);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext54 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext9, evalContextArray49);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext55 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray49);
        int int56 = unionContext2.getCurrentPosition();
        int int57 = unionContext2.getPosition();
        org.apache.commons.jxpath.NodeSet nodeSet58 = unionContext2.getNodeSet();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(evalContextArray8);
        org.junit.Assert.assertArrayEquals(evalContextArray8, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(evalContextArray15);
        org.junit.Assert.assertArrayEquals(evalContextArray15, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Empty expression context" + "'", str18, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(evalContextArray22);
        org.junit.Assert.assertArrayEquals(evalContextArray22, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(pointer25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(evalContextArray32);
        org.junit.Assert.assertArrayEquals(evalContextArray32, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(pointer35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(evalContextArray38);
        org.junit.Assert.assertArrayEquals(evalContextArray38, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(pointer41);
        org.junit.Assert.assertNotNull(evalContextArray43);
        org.junit.Assert.assertArrayEquals(evalContextArray43, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(evalContextArray49);
        org.junit.Assert.assertArrayEquals(evalContextArray49, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
        org.junit.Assert.assertNotNull(nodeSet58);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.NodeSet nodeSet3 = unionContext2.getNodeSet();
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer4 = unionContext2.getCurrentNodePointer();
        int int5 = unionContext2.getDocumentOrder();
        java.lang.Class<?> wildcardClass6 = unionContext2.getClass();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet3);
        org.junit.Assert.assertNull(nodePointer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        unionContext2.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray5 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext6 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray5);
        boolean boolean7 = unionContext6.nextSet();
        java.lang.String str8 = unionContext6.toString();
        java.util.List list9 = unionContext6.getContextNodeList();
        boolean boolean10 = unionContext6.nextNode();
        boolean boolean11 = unionContext6.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray13 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext14 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext12, evalContextArray13);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext15 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext6, evalContextArray13);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext16 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray13);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = unionContext2.getCurrentNodePointer();
        int int18 = unionContext2.getDocumentOrder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.ri.axes.RootContext rootContext19 = unionContext2.getRootContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray5);
        org.junit.Assert.assertArrayEquals(evalContextArray5, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(evalContextArray13);
        org.junit.Assert.assertArrayEquals(evalContextArray13, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(nodePointer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        java.lang.String str4 = unionContext2.toString();
        java.util.List list5 = unionContext2.getContextNodeList();
        boolean boolean6 = unionContext2.nextNode();
        boolean boolean7 = unionContext2.nextNode();
        org.apache.commons.jxpath.Pointer pointer8 = unionContext2.getSingleNodePointer();
        org.apache.commons.jxpath.Pointer pointer9 = unionContext2.getContextNodePointer();
        boolean boolean10 = unionContext2.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        java.util.List list14 = unionContext13.getContextNodeList();
        java.lang.Object obj15 = unionContext13.getValue();
        boolean boolean16 = unionContext13.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext17 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray18 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext19 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext17, evalContextArray18);
        org.apache.commons.jxpath.NodeSet nodeSet20 = unionContext19.getNodeSet();
        java.lang.String str21 = unionContext19.toString();
        unionContext19.reset();
        int int23 = unionContext19.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext24 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray25 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext26 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext24, evalContextArray25);
        boolean boolean27 = unionContext26.nextSet();
        org.apache.commons.jxpath.Pointer pointer28 = unionContext26.getContextNodePointer();
        java.util.List list29 = unionContext26.getContextNodeList();
        boolean boolean30 = unionContext26.nextSet();
        boolean boolean32 = unionContext26.setPosition((int) (short) 1);
        java.util.List list33 = unionContext26.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext34 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray35 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext36 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext34, evalContextArray35);
        boolean boolean37 = unionContext36.nextSet();
        org.apache.commons.jxpath.Pointer pointer38 = unionContext36.getContextNodePointer();
        boolean boolean39 = unionContext36.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext40 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray41 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext42 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext40, evalContextArray41);
        boolean boolean43 = unionContext42.nextSet();
        org.apache.commons.jxpath.Pointer pointer44 = unionContext42.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext45 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray46 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext47 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext45, evalContextArray46);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray48 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext42, evalContext45 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext49 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext36, evalContextArray48);
        int int50 = unionContext49.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext51 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray52 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext53 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext51, evalContextArray52);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext54 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext49, evalContextArray52);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext55 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext26, evalContextArray52);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext56 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext19, evalContextArray52);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext57 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext13, evalContextArray52);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext58 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray52);
        org.apache.commons.jxpath.NodeSet nodeSet59 = unionContext2.getNodeSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.jxpath.JXPathContext jXPathContext60 = unionContext2.getJXPathContext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Empty expression context" + "'", str4, "Empty expression context");
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(pointer8);
        org.junit.Assert.assertNull(pointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(evalContextArray18);
        org.junit.Assert.assertArrayEquals(evalContextArray18, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Empty expression context" + "'", str21, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(evalContextArray25);
        org.junit.Assert.assertArrayEquals(evalContextArray25, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(pointer28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(evalContextArray35);
        org.junit.Assert.assertArrayEquals(evalContextArray35, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(pointer38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(evalContextArray41);
        org.junit.Assert.assertArrayEquals(evalContextArray41, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(pointer44);
        org.junit.Assert.assertNotNull(evalContextArray46);
        org.junit.Assert.assertArrayEquals(evalContextArray46, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(evalContextArray52);
        org.junit.Assert.assertArrayEquals(evalContextArray52, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet59);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        java.util.List list5 = unionContext2.getContextNodeList();
        int int6 = unionContext2.getCurrentPosition();
        org.apache.commons.jxpath.Pointer pointer7 = unionContext2.getSingleNodePointer();
        java.lang.String str8 = unionContext2.toString();
        boolean boolean9 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer10 = unionContext2.getSingleNodePointer();
        int int11 = unionContext2.getCurrentPosition();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(pointer7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.NodeSet nodeSet3 = unionContext2.getNodeSet();
        boolean boolean4 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext5 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray6 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext7 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext5, evalContextArray6);
        boolean boolean8 = unionContext7.nextSet();
        org.apache.commons.jxpath.Pointer pointer9 = unionContext7.getContextNodePointer();
        java.util.List list10 = unionContext7.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        boolean boolean15 = unionContext13.setPosition((int) (byte) 100);
        org.apache.commons.jxpath.ri.EvalContext evalContext16 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray17 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext18 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext16, evalContextArray17);
        boolean boolean19 = unionContext18.nextSet();
        int int20 = unionContext18.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext21 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray22 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext23 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext21, evalContextArray22);
        boolean boolean24 = unionContext23.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer25 = unionContext23.getContextNodePointer();
        java.lang.Object obj26 = unionContext23.getValue();
        boolean boolean27 = unionContext23.nextNode();
        org.apache.commons.jxpath.ri.EvalContext evalContext28 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray29 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext30 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext28, evalContextArray29);
        boolean boolean32 = unionContext30.setPosition((int) (byte) 100);
        int int33 = unionContext30.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext34 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray35 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext36 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext34, evalContextArray35);
        boolean boolean37 = unionContext36.nextSet();
        org.apache.commons.jxpath.Pointer pointer38 = unionContext36.getContextNodePointer();
        boolean boolean39 = unionContext36.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext40 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray41 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext42 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext40, evalContextArray41);
        boolean boolean43 = unionContext42.nextSet();
        org.apache.commons.jxpath.Pointer pointer44 = unionContext42.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext45 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray46 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext47 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext45, evalContextArray46);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray48 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext42, evalContext45 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext49 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext36, evalContextArray48);
        boolean boolean50 = unionContext36.nextSet();
        boolean boolean51 = unionContext36.hasNext();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray52 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext13, unionContext18, unionContext23, unionContext30, unionContext36 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext53 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext7, evalContextArray52);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext54 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray52);
        boolean boolean56 = unionContext2.setPosition(100);
        org.apache.commons.jxpath.NodeSet nodeSet57 = unionContext2.getNodeSet();
        org.apache.commons.jxpath.NodeSet nodeSet58 = unionContext2.getNodeSet();
        org.apache.commons.jxpath.NodeSet nodeSet59 = unionContext2.getNodeSet();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(evalContextArray6);
        org.junit.Assert.assertArrayEquals(evalContextArray6, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(pointer9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(evalContextArray17);
        org.junit.Assert.assertArrayEquals(evalContextArray17, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(evalContextArray22);
        org.junit.Assert.assertArrayEquals(evalContextArray22, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(pointer25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(evalContextArray29);
        org.junit.Assert.assertArrayEquals(evalContextArray29, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(evalContextArray35);
        org.junit.Assert.assertArrayEquals(evalContextArray35, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(pointer38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(evalContextArray41);
        org.junit.Assert.assertArrayEquals(evalContextArray41, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(pointer44);
        org.junit.Assert.assertNotNull(evalContextArray46);
        org.junit.Assert.assertArrayEquals(evalContextArray46, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(evalContextArray52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(nodeSet57);
        org.junit.Assert.assertNotNull(nodeSet58);
        org.junit.Assert.assertNotNull(nodeSet59);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        boolean boolean5 = unionContext2.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray7 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext6, evalContextArray7);
        boolean boolean9 = unionContext8.nextSet();
        org.apache.commons.jxpath.Pointer pointer10 = unionContext8.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray14 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext8, evalContext11 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext15 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray14);
        boolean boolean16 = unionContext2.nextSet();
        java.lang.Object obj17 = unionContext2.getValue();
        boolean boolean18 = unionContext2.nextNode();
        java.util.List list19 = unionContext2.getContextNodeList();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(evalContextArray7);
        org.junit.Assert.assertArrayEquals(evalContextArray7, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        boolean boolean5 = unionContext2.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray7 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext6, evalContextArray7);
        boolean boolean9 = unionContext8.nextSet();
        org.apache.commons.jxpath.Pointer pointer10 = unionContext8.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext11 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray12 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext13 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext11, evalContextArray12);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray14 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext8, evalContext11 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext15 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray14);
        boolean boolean16 = unionContext2.nextSet();
        java.lang.Object obj17 = unionContext2.getValue();
        java.util.List list18 = unionContext2.getContextNodeList();
        boolean boolean19 = unionContext2.nextNode();
        boolean boolean21 = unionContext2.setPosition(32);
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray23 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext24 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext22, evalContextArray23);
        unionContext24.reset();
        int int26 = unionContext24.getPosition();
        org.apache.commons.jxpath.NodeSet nodeSet27 = unionContext24.getNodeSet();
        boolean boolean28 = unionContext24.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext29 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray30 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext31 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext29, evalContextArray30);
        unionContext31.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext33 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray34 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext35 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext33, evalContextArray34);
        boolean boolean36 = unionContext35.hasNext();
        int int37 = unionContext35.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext38 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray39 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext40 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext38, evalContextArray39);
        boolean boolean41 = unionContext40.nextSet();
        org.apache.commons.jxpath.Pointer pointer42 = unionContext40.getContextNodePointer();
        boolean boolean43 = unionContext40.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext44 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray45 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext46 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext44, evalContextArray45);
        boolean boolean47 = unionContext46.nextSet();
        org.apache.commons.jxpath.Pointer pointer48 = unionContext46.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext49 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray50 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext51 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext49, evalContextArray50);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray52 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext46, evalContext49 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext53 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext40, evalContextArray52);
        org.apache.commons.jxpath.NodeSet nodeSet54 = unionContext40.getNodeSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext55 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray56 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext57 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext55, evalContextArray56);
        org.apache.commons.jxpath.Pointer pointer58 = unionContext57.getContextNodePointer();
        java.lang.Object obj59 = unionContext57.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet60 = unionContext57.getNodeSet();
        int int61 = unionContext57.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext62 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray63 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext64 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext62, evalContextArray63);
        org.apache.commons.jxpath.Pointer pointer65 = unionContext64.getSingleNodePointer();
        int int66 = unionContext64.getCurrentPosition();
        int int67 = unionContext64.getDocumentOrder();
        org.apache.commons.jxpath.ri.EvalContext evalContext68 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray69 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext70 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext68, evalContextArray69);
        boolean boolean71 = unionContext70.nextNode();
        int int72 = unionContext70.getDocumentOrder();
        boolean boolean73 = unionContext70.isChildOrderingRequired();
        java.util.List list74 = unionContext70.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext75 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray76 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext77 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext75, evalContextArray76);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext78 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext70, evalContextArray76);
        org.apache.commons.jxpath.ri.EvalContext evalContext79 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray80 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext81 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext79, evalContextArray80);
        java.util.List list82 = unionContext81.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray83 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext35, unionContext40, unionContext57, unionContext64, unionContext78, unionContext81 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext84 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext31, evalContextArray83);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext85 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext24, evalContextArray83);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext86 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray83);
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(evalContextArray7);
        org.junit.Assert.assertArrayEquals(evalContextArray7, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(pointer10);
        org.junit.Assert.assertNotNull(evalContextArray12);
        org.junit.Assert.assertArrayEquals(evalContextArray12, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "[]");
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(evalContextArray23);
        org.junit.Assert.assertArrayEquals(evalContextArray23, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(nodeSet27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(evalContextArray30);
        org.junit.Assert.assertArrayEquals(evalContextArray30, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray34);
        org.junit.Assert.assertArrayEquals(evalContextArray34, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(evalContextArray39);
        org.junit.Assert.assertArrayEquals(evalContextArray39, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(pointer42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(evalContextArray45);
        org.junit.Assert.assertArrayEquals(evalContextArray45, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(pointer48);
        org.junit.Assert.assertNotNull(evalContextArray50);
        org.junit.Assert.assertArrayEquals(evalContextArray50, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray52);
        org.junit.Assert.assertNotNull(nodeSet54);
        org.junit.Assert.assertNotNull(evalContextArray56);
        org.junit.Assert.assertArrayEquals(evalContextArray56, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer58);
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertEquals(obj59.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj59), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj59), "[]");
        org.junit.Assert.assertNotNull(nodeSet60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(evalContextArray63);
        org.junit.Assert.assertArrayEquals(evalContextArray63, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(evalContextArray69);
        org.junit.Assert.assertArrayEquals(evalContextArray69, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(list74);
        org.junit.Assert.assertNotNull(evalContextArray76);
        org.junit.Assert.assertArrayEquals(evalContextArray76, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray80);
        org.junit.Assert.assertArrayEquals(evalContextArray80, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list82);
        org.junit.Assert.assertNotNull(evalContextArray83);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        unionContext2.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray5 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext6 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray5);
        boolean boolean7 = unionContext6.hasNext();
        int int8 = unionContext6.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext9 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray10 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext11 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext9, evalContextArray10);
        boolean boolean12 = unionContext11.nextSet();
        org.apache.commons.jxpath.Pointer pointer13 = unionContext11.getContextNodePointer();
        boolean boolean14 = unionContext11.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext15 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray16 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext17 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext15, evalContextArray16);
        boolean boolean18 = unionContext17.nextSet();
        org.apache.commons.jxpath.Pointer pointer19 = unionContext17.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext20 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray21 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext22 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext20, evalContextArray21);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray23 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext17, evalContext20 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext24 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext11, evalContextArray23);
        org.apache.commons.jxpath.NodeSet nodeSet25 = unionContext11.getNodeSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext26 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray27 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext28 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext26, evalContextArray27);
        org.apache.commons.jxpath.Pointer pointer29 = unionContext28.getContextNodePointer();
        java.lang.Object obj30 = unionContext28.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet31 = unionContext28.getNodeSet();
        int int32 = unionContext28.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext33 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray34 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext35 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext33, evalContextArray34);
        org.apache.commons.jxpath.Pointer pointer36 = unionContext35.getSingleNodePointer();
        int int37 = unionContext35.getCurrentPosition();
        int int38 = unionContext35.getDocumentOrder();
        org.apache.commons.jxpath.ri.EvalContext evalContext39 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray40 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext41 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext39, evalContextArray40);
        boolean boolean42 = unionContext41.nextNode();
        int int43 = unionContext41.getDocumentOrder();
        boolean boolean44 = unionContext41.isChildOrderingRequired();
        java.util.List list45 = unionContext41.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext46 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray47 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext48 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext46, evalContextArray47);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext49 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext41, evalContextArray47);
        org.apache.commons.jxpath.ri.EvalContext evalContext50 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray51 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext52 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext50, evalContextArray51);
        java.util.List list53 = unionContext52.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray54 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext6, unionContext11, unionContext28, unionContext35, unionContext49, unionContext52 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext55 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray54);
        org.apache.commons.jxpath.ri.EvalContext evalContext56 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray57 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext58 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext56, evalContextArray57);
        org.apache.commons.jxpath.Pointer pointer59 = unionContext58.getContextNodePointer();
        java.lang.Object obj60 = unionContext58.getValue();
        boolean boolean61 = unionContext58.isChildOrderingRequired();
        unionContext58.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext63 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray64 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext65 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext63, evalContextArray64);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext66 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext58, evalContextArray64);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext67 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext55, evalContextArray64);
        unionContext67.reset();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray5);
        org.junit.Assert.assertArrayEquals(evalContextArray5, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(evalContextArray10);
        org.junit.Assert.assertArrayEquals(evalContextArray10, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(pointer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(evalContextArray16);
        org.junit.Assert.assertArrayEquals(evalContextArray16, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(pointer19);
        org.junit.Assert.assertNotNull(evalContextArray21);
        org.junit.Assert.assertArrayEquals(evalContextArray21, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray23);
        org.junit.Assert.assertNotNull(nodeSet25);
        org.junit.Assert.assertNotNull(evalContextArray27);
        org.junit.Assert.assertArrayEquals(evalContextArray27, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "[]");
        org.junit.Assert.assertNotNull(nodeSet31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(evalContextArray34);
        org.junit.Assert.assertArrayEquals(evalContextArray34, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(evalContextArray40);
        org.junit.Assert.assertArrayEquals(evalContextArray40, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(evalContextArray47);
        org.junit.Assert.assertArrayEquals(evalContextArray47, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray51);
        org.junit.Assert.assertArrayEquals(evalContextArray51, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(evalContextArray54);
        org.junit.Assert.assertNotNull(evalContextArray57);
        org.junit.Assert.assertArrayEquals(evalContextArray57, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertEquals(obj60.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj60), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj60), "[]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(evalContextArray64);
        org.junit.Assert.assertArrayEquals(evalContextArray64, new org.apache.commons.jxpath.ri.EvalContext[] {});
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.NodeSet nodeSet3 = unionContext2.getNodeSet();
        java.lang.String str4 = unionContext2.toString();
        unionContext2.reset();
        int int6 = unionContext2.getPosition();
        java.lang.Object obj7 = unionContext2.getValue();
        org.apache.commons.jxpath.Pointer pointer8 = unionContext2.getContextNodePointer();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Empty expression context" + "'", str4, "Empty expression context");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[]");
        org.junit.Assert.assertNull(pointer8);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        unionContext2.reset();
        org.apache.commons.jxpath.ri.EvalContext evalContext4 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray5 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext6 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext4, evalContextArray5);
        boolean boolean7 = unionContext6.nextSet();
        java.lang.String str8 = unionContext6.toString();
        java.util.List list9 = unionContext6.getContextNodeList();
        boolean boolean10 = unionContext6.nextNode();
        boolean boolean11 = unionContext6.isChildOrderingRequired();
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray13 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext14 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext12, evalContextArray13);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext15 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext6, evalContextArray13);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext16 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray13);
        org.apache.commons.jxpath.ri.model.NodePointer nodePointer17 = unionContext2.getCurrentNodePointer();
        boolean boolean18 = unionContext2.hasNext();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = unionContext2.next();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray5);
        org.junit.Assert.assertArrayEquals(evalContextArray5, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Empty expression context" + "'", str8, "Empty expression context");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(evalContextArray13);
        org.junit.Assert.assertArrayEquals(evalContextArray13, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(nodePointer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        java.lang.Object obj3 = unionContext2.getValue();
        int int4 = unionContext2.getPosition();
        java.util.List list5 = unionContext2.getContextNodeList();
        org.apache.commons.jxpath.NodeSet nodeSet6 = unionContext2.getNodeSet();
        boolean boolean8 = unionContext2.setPosition((int) (short) 0);
        org.apache.commons.jxpath.Pointer pointer9 = unionContext2.getContextNodePointer();
        boolean boolean10 = unionContext2.isChildOrderingRequired();
        boolean boolean12 = unionContext2.setPosition((int) (short) 100);
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(nodeSet6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(pointer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        org.apache.commons.jxpath.NodeSet nodeSet5 = unionContext2.getNodeSet();
        boolean boolean6 = unionContext2.hasNext();
        boolean boolean7 = unionContext2.nextNode();
        boolean boolean8 = unionContext2.nextNode();
        java.util.List list9 = unionContext2.getContextNodeList();
        boolean boolean10 = unionContext2.nextSet();
        int int11 = unionContext2.getPosition();
        java.util.List list12 = unionContext2.getContextNodeList();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(nodeSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.hasNext();
        java.lang.Object obj4 = unionContext2.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet5 = unionContext2.getNodeSet();
        int int6 = unionContext2.getCurrentPosition();
        int int7 = unionContext2.getPosition();
        boolean boolean9 = unionContext2.setPosition((int) (byte) 1);
        int int10 = unionContext2.getDocumentOrder();
        int int11 = unionContext2.getDocumentOrder();
        int int12 = unionContext2.getDocumentOrder();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[]");
        org.junit.Assert.assertNotNull(nodeSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.NodeSet nodeSet3 = unionContext2.getNodeSet();
        java.lang.String str4 = unionContext2.toString();
        boolean boolean5 = unionContext2.hasNext();
        int int6 = unionContext2.getDocumentOrder();
        boolean boolean7 = unionContext2.nextNode();
        org.apache.commons.jxpath.NodeSet nodeSet8 = unionContext2.getNodeSet();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(nodeSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Empty expression context" + "'", str4, "Empty expression context");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeSet8);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        int int4 = unionContext2.getDocumentOrder();
        org.apache.commons.jxpath.NodeSet nodeSet5 = unionContext2.getNodeSet();
        java.lang.String str6 = unionContext2.toString();
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray8 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext9 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext7, evalContextArray8);
        boolean boolean10 = unionContext9.nextSet();
        java.lang.String str11 = unionContext9.toString();
        java.util.List list12 = unionContext9.getContextNodeList();
        boolean boolean13 = unionContext9.nextNode();
        boolean boolean14 = unionContext9.nextNode();
        org.apache.commons.jxpath.Pointer pointer15 = unionContext9.getSingleNodePointer();
        org.apache.commons.jxpath.Pointer pointer16 = unionContext9.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext17 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray18 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext19 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext17, evalContextArray18);
        boolean boolean20 = unionContext19.nextSet();
        org.apache.commons.jxpath.Pointer pointer21 = unionContext19.getContextNodePointer();
        boolean boolean22 = unionContext19.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext23 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray24 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext25 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext23, evalContextArray24);
        boolean boolean26 = unionContext25.nextSet();
        org.apache.commons.jxpath.Pointer pointer27 = unionContext25.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext28 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray29 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext30 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext28, evalContextArray29);
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray31 = new org.apache.commons.jxpath.ri.EvalContext[] { unionContext25, evalContext28 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext32 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext19, evalContextArray31);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext33 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext9, evalContextArray31);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext34 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray31);
        boolean boolean35 = unionContext2.nextNode();
        int int36 = unionContext2.getCurrentPosition();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(nodeSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Empty expression context" + "'", str6, "Empty expression context");
        org.junit.Assert.assertNotNull(evalContextArray8);
        org.junit.Assert.assertArrayEquals(evalContextArray8, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Empty expression context" + "'", str11, "Empty expression context");
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(pointer15);
        org.junit.Assert.assertNull(pointer16);
        org.junit.Assert.assertNotNull(evalContextArray18);
        org.junit.Assert.assertArrayEquals(evalContextArray18, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(pointer21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(evalContextArray24);
        org.junit.Assert.assertArrayEquals(evalContextArray24, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(pointer27);
        org.junit.Assert.assertNotNull(evalContextArray29);
        org.junit.Assert.assertArrayEquals(evalContextArray29, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer4 = unionContext2.getContextNodePointer();
        org.apache.commons.jxpath.NodeSet nodeSet5 = unionContext2.getNodeSet();
        java.util.List list6 = unionContext2.getContextNodeList();
        java.lang.Object obj7 = unionContext2.getValue();
        int int8 = unionContext2.getDocumentOrder();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(pointer4);
        org.junit.Assert.assertNotNull(nodeSet5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean3 = unionContext2.nextSet();
        boolean boolean5 = unionContext2.setPosition((int) (byte) 10);
        boolean boolean6 = unionContext2.hasNext();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray7 = null;
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray7);
        boolean boolean10 = unionContext2.setPosition((int) ' ');
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        org.apache.commons.jxpath.Pointer pointer3 = unionContext2.getContextNodePointer();
        java.lang.Object obj4 = unionContext2.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet5 = unionContext2.getNodeSet();
        int int6 = unionContext2.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext7 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray8 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext9 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext7, evalContextArray8);
        java.util.List list10 = unionContext9.getContextNodeList();
        unionContext9.reset();
        java.util.List list12 = unionContext9.getContextNodeList();
        int int13 = unionContext9.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext14 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray15 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext16 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext14, evalContextArray15);
        boolean boolean17 = unionContext16.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer18 = unionContext16.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext19 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray20 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext21 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext19, evalContextArray20);
        org.apache.commons.jxpath.ri.EvalContext evalContext22 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray23 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext24 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext22, evalContextArray23);
        boolean boolean25 = unionContext24.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext26 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray27 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext28 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext26, evalContextArray27);
        boolean boolean29 = unionContext28.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext30 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray31 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext32 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext30, evalContextArray31);
        java.util.List list33 = unionContext32.getContextNodeList();
        unionContext32.reset();
        java.util.List list35 = unionContext32.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext36 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray37 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext38 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext36, evalContextArray37);
        java.util.List list39 = unionContext38.getContextNodeList();
        unionContext38.reset();
        java.util.List list41 = unionContext38.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext42 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray43 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext44 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext42, evalContextArray43);
        java.util.List list45 = unionContext44.getContextNodeList();
        unionContext44.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray47 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext19, unionContext24, unionContext28, unionContext32, unionContext38, unionContext44 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext48 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext16, evalContextArray47);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext49 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext9, evalContextArray47);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext50 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray47);
        boolean boolean51 = unionContext2.isChildOrderingRequired();
        boolean boolean53 = unionContext2.setPosition((-1));
        boolean boolean54 = unionContext2.hasNext();
        java.util.List list55 = unionContext2.getContextNodeList();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[]");
        org.junit.Assert.assertNotNull(nodeSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(evalContextArray8);
        org.junit.Assert.assertArrayEquals(evalContextArray8, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(evalContextArray15);
        org.junit.Assert.assertArrayEquals(evalContextArray15, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(pointer18);
        org.junit.Assert.assertNotNull(evalContextArray20);
        org.junit.Assert.assertArrayEquals(evalContextArray20, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray23);
        org.junit.Assert.assertArrayEquals(evalContextArray23, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(evalContextArray27);
        org.junit.Assert.assertArrayEquals(evalContextArray27, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(evalContextArray31);
        org.junit.Assert.assertArrayEquals(evalContextArray31, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(evalContextArray37);
        org.junit.Assert.assertArrayEquals(evalContextArray37, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(evalContextArray43);
        org.junit.Assert.assertArrayEquals(evalContextArray43, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(evalContextArray47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(list55);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        org.apache.commons.jxpath.ri.EvalContext evalContext0 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray1 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext2 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext0, evalContextArray1);
        boolean boolean4 = unionContext2.setPosition((int) (byte) 100);
        boolean boolean5 = unionContext2.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext6 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray7 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext8 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext6, evalContextArray7);
        boolean boolean9 = unionContext8.nextNode();
        boolean boolean11 = unionContext8.setPosition(52);
        org.apache.commons.jxpath.ri.EvalContext evalContext12 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray13 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext14 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext12, evalContextArray13);
        boolean boolean15 = unionContext14.nextSet();
        org.apache.commons.jxpath.Pointer pointer16 = unionContext14.getContextNodePointer();
        java.util.List list17 = unionContext14.getContextNodeList();
        int int18 = unionContext14.getCurrentPosition();
        boolean boolean19 = unionContext14.isChildOrderingRequired();
        boolean boolean21 = unionContext14.setPosition((int) (short) 100);
        org.apache.commons.jxpath.Pointer pointer22 = unionContext14.getSingleNodePointer();
        org.apache.commons.jxpath.Pointer pointer23 = unionContext14.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext24 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray25 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext26 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext24, evalContextArray25);
        java.util.List list27 = unionContext26.getContextNodeList();
        unionContext26.reset();
        java.util.List list29 = unionContext26.getContextNodeList();
        int int30 = unionContext26.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext31 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray32 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext33 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext31, evalContextArray32);
        org.apache.commons.jxpath.Pointer pointer34 = unionContext33.getContextNodePointer();
        java.lang.Object obj35 = unionContext33.getValue();
        org.apache.commons.jxpath.NodeSet nodeSet36 = unionContext33.getNodeSet();
        int int37 = unionContext33.getCurrentPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext38 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray39 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext40 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext38, evalContextArray39);
        java.util.List list41 = unionContext40.getContextNodeList();
        unionContext40.reset();
        java.util.List list43 = unionContext40.getContextNodeList();
        int int44 = unionContext40.getPosition();
        org.apache.commons.jxpath.ri.EvalContext evalContext45 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray46 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext47 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext45, evalContextArray46);
        boolean boolean48 = unionContext47.isChildOrderingRequired();
        org.apache.commons.jxpath.Pointer pointer49 = unionContext47.getContextNodePointer();
        org.apache.commons.jxpath.ri.EvalContext evalContext50 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray51 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext52 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext50, evalContextArray51);
        org.apache.commons.jxpath.ri.EvalContext evalContext53 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray54 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext55 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext53, evalContextArray54);
        boolean boolean56 = unionContext55.nextSet();
        org.apache.commons.jxpath.ri.EvalContext evalContext57 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray58 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext59 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext57, evalContextArray58);
        boolean boolean60 = unionContext59.hasNext();
        org.apache.commons.jxpath.ri.EvalContext evalContext61 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray62 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext63 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext61, evalContextArray62);
        java.util.List list64 = unionContext63.getContextNodeList();
        unionContext63.reset();
        java.util.List list66 = unionContext63.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext67 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray68 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext69 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext67, evalContextArray68);
        java.util.List list70 = unionContext69.getContextNodeList();
        unionContext69.reset();
        java.util.List list72 = unionContext69.getContextNodeList();
        org.apache.commons.jxpath.ri.EvalContext evalContext73 = null;
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray74 = new org.apache.commons.jxpath.ri.EvalContext[] {};
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext75 = new org.apache.commons.jxpath.ri.axes.UnionContext(evalContext73, evalContextArray74);
        java.util.List list76 = unionContext75.getContextNodeList();
        unionContext75.reset();
        org.apache.commons.jxpath.ri.EvalContext[] evalContextArray78 = new org.apache.commons.jxpath.ri.EvalContext[] { evalContext50, unionContext55, unionContext59, unionContext63, unionContext69, unionContext75 };
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext79 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext47, evalContextArray78);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext80 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext40, evalContextArray78);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext81 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext33, evalContextArray78);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext82 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext26, evalContextArray78);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext83 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext14, evalContextArray78);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext84 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext8, evalContextArray78);
        org.apache.commons.jxpath.ri.axes.UnionContext unionContext85 = new org.apache.commons.jxpath.ri.axes.UnionContext((org.apache.commons.jxpath.ri.EvalContext) unionContext2, evalContextArray78);
        org.apache.commons.jxpath.NodeSet nodeSet86 = unionContext85.getNodeSet();
        org.junit.Assert.assertNotNull(evalContextArray1);
        org.junit.Assert.assertArrayEquals(evalContextArray1, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(evalContextArray7);
        org.junit.Assert.assertArrayEquals(evalContextArray7, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(evalContextArray13);
        org.junit.Assert.assertArrayEquals(evalContextArray13, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(pointer16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(pointer22);
        org.junit.Assert.assertNull(pointer23);
        org.junit.Assert.assertNotNull(evalContextArray25);
        org.junit.Assert.assertArrayEquals(evalContextArray25, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(evalContextArray32);
        org.junit.Assert.assertArrayEquals(evalContextArray32, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNull(pointer34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "[]");
        org.junit.Assert.assertNotNull(nodeSet36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(evalContextArray39);
        org.junit.Assert.assertArrayEquals(evalContextArray39, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(evalContextArray46);
        org.junit.Assert.assertArrayEquals(evalContextArray46, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(pointer49);
        org.junit.Assert.assertNotNull(evalContextArray51);
        org.junit.Assert.assertArrayEquals(evalContextArray51, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(evalContextArray54);
        org.junit.Assert.assertArrayEquals(evalContextArray54, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(evalContextArray58);
        org.junit.Assert.assertArrayEquals(evalContextArray58, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(evalContextArray62);
        org.junit.Assert.assertArrayEquals(evalContextArray62, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list64);
        org.junit.Assert.assertNotNull(list66);
        org.junit.Assert.assertNotNull(evalContextArray68);
        org.junit.Assert.assertArrayEquals(evalContextArray68, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list70);
        org.junit.Assert.assertNotNull(list72);
        org.junit.Assert.assertNotNull(evalContextArray74);
        org.junit.Assert.assertArrayEquals(evalContextArray74, new org.apache.commons.jxpath.ri.EvalContext[] {});
        org.junit.Assert.assertNotNull(list76);
        org.junit.Assert.assertNotNull(evalContextArray78);
        org.junit.Assert.assertNotNull(nodeSet86);
    }
}

